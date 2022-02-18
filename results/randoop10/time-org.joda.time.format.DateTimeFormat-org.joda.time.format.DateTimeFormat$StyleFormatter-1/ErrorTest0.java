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
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DurationField durationField11 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.days();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.weekyear();
        org.joda.time.DurationField durationField17 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField14, and durationField15", !(durationField17.compareTo(durationField14) == 0) || (Math.signum(durationField17.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.year();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.millisOfDay();
        dateTimeParserBucket7.saveField(dateTimeField20, 100);
        long long24 = dateTimeParserBucket7.computeMillis(false);
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale28 = new java.util.Locale("hi!");
        java.lang.String str29 = locale28.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale28, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology33 = dateTimeParserBucket32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.weekyear();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.monthOfYear();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.yearOfCentury();
        org.joda.time.DurationField durationField38 = chronology33.eras();
        org.joda.time.DateTimeField dateTimeField39 = chronology33.millisOfDay();
        dateTimeParserBucket7.saveField(dateTimeField39, (int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField38", Math.signum(durationField18.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField18)));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.days();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField14, and durationField15", !(durationField18.compareTo(durationField14) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology19.add(readablePeriod20, (long) (short) -1, 10);
        org.joda.time.DurationField durationField24 = chronology19.days();
        org.joda.time.DateTimeField dateTimeField25 = chronology19.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField24", (durationField9.compareTo(durationField24) == 0) == durationField9.equals(durationField24));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.joda.time.DurationField durationField15 = chronology8.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField14", Math.signum(durationField9.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField9)));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField9, and durationField10", !(durationField13.compareTo(durationField9) == 0) || (Math.signum(durationField13.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DurationField durationField13 = chronology8.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField12", (durationField10.compareTo(durationField12) == 0) == durationField10.equals(durationField12));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField14", Math.signum(durationField9.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField9)));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.hourOfHalfday();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale21 = new java.util.Locale("hi!");
        java.lang.String str22 = locale21.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale21, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.year();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology26.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        long long35 = dateTimeZone32.adjustOffset((long) 0, true);
        java.lang.String str37 = dateTimeZone32.getNameKey((long) (-1));
        boolean boolean38 = dateTimeZone32.isFixed();
        java.util.Locale locale40 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology42, locale43, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str47 = locale40.getDisplayCountry(locale43);
        java.lang.String str48 = dateTimeZone32.getName((long) (short) 100, locale40);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology26, locale40, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology9, locale40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField27", Math.signum(durationField14.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField14)));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField12", Math.signum(durationField10.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField10)));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DurationField durationField14 = chronology8.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField14, and durationField13", !(durationField13.compareTo(durationField14) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField14.compareTo(durationField13))));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        long long16 = chronology8.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology8.months();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.millisOfDay();
        org.joda.time.DurationField durationField20 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField9, and durationField18", !(durationField20.compareTo(durationField9) == 0) || (Math.signum(durationField20.compareTo(durationField18)) == Math.signum(durationField9.compareTo(durationField18))));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField12", Math.signum(durationField10.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField10)));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DurationField durationField12 = chronology8.years();
        long long18 = chronology8.getDateTimeMillis((long) 'x', 1, (int) (byte) 0, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField12", (durationField10.compareTo(durationField12) == 0) == durationField10.equals(durationField12));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology8.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField16, and durationField13", !(durationField13.compareTo(durationField16) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField16.compareTo(durationField13))));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology8.add(readablePeriod12, (long) 'u', (int) (short) -1);
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        org.joda.time.DurationField durationField17 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DurationField durationField13 = chronology8.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField12", (durationField10.compareTo(durationField12) == 0) == durationField10.equals(durationField12));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology8.add(readablePeriod12, (long) 'u', (int) (short) -1);
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        org.joda.time.DurationField durationField17 = chronology8.eras();
        org.joda.time.DurationField durationField18 = chronology8.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DurationField durationField13 = chronology12.millis();
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField13", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField13)) == Math.signum(durationField9.compareTo(durationField13))));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DurationField durationField14 = chronology9.minutes();
        java.util.Locale locale18 = new java.util.Locale("UTC", "1/1/70", "it");
        java.lang.String str19 = locale18.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology9, locale18, (java.lang.Integer) 10, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField23 = chronology9.minuteOfHour();
        org.joda.time.DurationField durationField24 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField10, and durationField14", !(durationField24.compareTo(durationField10) == 0) || (Math.signum(durationField24.compareTo(durationField14)) == Math.signum(durationField10.compareTo(durationField14))));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DurationField durationField11 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.millis();
        org.joda.time.DurationField durationField15 = chronology9.centuries();
        org.joda.time.DurationField durationField16 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField14, and durationField15", !(durationField16.compareTo(durationField14) == 0) || (Math.signum(durationField16.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffset((long) (short) 0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        boolean boolean20 = dateTimeZone0.equals((java.lang.Object) chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.minuteOfDay();
        org.joda.time.DurationField durationField24 = chronology17.years();
        org.joda.time.DurationField durationField25 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField24", (durationField19.compareTo(durationField24) == 0) == durationField19.equals(durationField24));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology8.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField16, and durationField13", !(durationField13.compareTo(durationField16) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField16.compareTo(durationField13))));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        long long15 = dateTimeZone12.adjustOffset((long) 0, true);
        java.lang.String str17 = dateTimeZone12.getNameKey((long) (-1));
        boolean boolean18 = dateTimeZone12.isFixed();
        int int20 = dateTimeZone12.getOffset((long) (short) 0);
        long long23 = dateTimeZone12.convertLocalToUTC(0L, true);
        long long26 = dateTimeZone12.adjustOffset((long) (short) 1, true);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        long long30 = dateTimeZone27.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone31 = dateTimeZone27.toTimeZone();
        int int33 = dateTimeZone27.getOffsetFromLocal(100L);
        long long35 = dateTimeZone27.nextTransition((long) ' ');
        long long37 = dateTimeZone12.getMillisKeepLocal(dateTimeZone27, (long) 40);
        long long39 = dateTimeZone12.previousTransition((long) 100);
        org.joda.time.Chronology chronology40 = chronology8.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField41 = chronology8.years();
        org.joda.time.DurationField durationField42 = chronology8.seconds();
        org.joda.time.DurationField durationField43 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField10, and durationField41", !(durationField43.compareTo(durationField10) == 0) || (Math.signum(durationField43.compareTo(durationField41)) == Math.signum(durationField10.compareTo(durationField41))));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField15 = chronology8.centuries();
        org.joda.time.DurationField durationField16 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.weekyear();
        org.joda.time.DurationField durationField18 = chronology8.months();
        org.joda.time.DurationField durationField19 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField9, and durationField15", !(durationField19.compareTo(durationField9) == 0) || (Math.signum(durationField19.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology8.minutes();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField13", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField13)) == Math.signum(durationField9.compareTo(durationField13))));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DurationField durationField14 = chronology8.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField14, and durationField13", !(durationField13.compareTo(durationField14) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField14.compareTo(durationField13))));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.lang.String str17 = locale16.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale16, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.days();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.year();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.era();
        org.joda.time.DateTimeField dateTimeField26 = chronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = chronology21.dayOfYear();
        org.joda.time.DurationField durationField28 = chronology21.years();
        long long32 = chronology21.add((long) 1, (long) (short) 10, (int) '4');
        org.joda.time.DateTimeField dateTimeField33 = chronology21.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter34.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str38 = dateTimeZone36.getName((long) 2000);
        boolean boolean39 = dateTimeZone36.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter34.withZone(dateTimeZone36);
        org.joda.time.format.DateTimeParser dateTimeParser41 = dateTimeFormatter34.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter42 = dateTimeFormatter34.getPrinter();
        org.joda.time.Chronology chronology43 = dateTimeFormatter34.getChronolgy();
        org.joda.time.LocalDate localDate45 = dateTimeFormatter34.parseLocalDate("69-12-31");
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale50 = new java.util.Locale("hi!");
        java.lang.String str51 = locale50.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket(0L, chronology48, locale50, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology55 = dateTimeParserBucket54.getChronology();
        java.util.Locale locale57 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology55, locale57, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField60 = chronology55.days();
        org.joda.time.DurationField durationField61 = chronology55.halfdays();
        long long65 = chronology55.add(0L, (long) (short) 0, (-1));
        org.joda.time.DateTimeField dateTimeField66 = chronology55.hourOfDay();
        boolean boolean67 = localDate45.equals((java.lang.Object) dateTimeField66);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = localDate45.getFieldType((int) (byte) 1);
        java.lang.Object obj70 = null;
        boolean boolean71 = localDate45.equals(obj70);
        int[] intArray73 = chronology21.get((org.joda.time.ReadablePartial) localDate45, (long) ' ');
        int[] intArray75 = chronology8.get((org.joda.time.ReadablePartial) localDate45, (long) (-11));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField28", (durationField10.compareTo(durationField28) == 0) == durationField10.equals(durationField28));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology8.add(readablePeriod12, (long) 'u', (int) (short) -1);
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        org.joda.time.DurationField durationField17 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DurationField durationField14 = chronology8.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField14, and durationField13", !(durationField13.compareTo(durationField14) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField14.compareTo(durationField13))));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField13 = chronology8.hours();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField10, and durationField13", !(durationField14.compareTo(durationField10) == 0) || (Math.signum(durationField14.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DurationField durationField11 = chronology8.eras();
        org.joda.time.DurationField durationField12 = chronology8.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology8.add(readablePeriod16, (long) (-41), (int) (short) 0);
        org.joda.time.DurationField durationField20 = chronology8.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField20, and durationField13", !(durationField13.compareTo(durationField20) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField20.compareTo(durationField13))));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology8.getZone();
        org.joda.time.DurationField durationField16 = chronology8.weeks();
        org.joda.time.Chronology chronology17 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField19 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField9, and durationField16", !(durationField19.compareTo(durationField9) == 0) || (Math.signum(durationField19.compareTo(durationField16)) == Math.signum(durationField9.compareTo(durationField16))));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DurationField durationField14 = chronology9.minutes();
        java.util.Locale locale18 = new java.util.Locale("UTC", "1/1/70", "it");
        java.lang.String str19 = locale18.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology9, locale18, (java.lang.Integer) 10, (int) (short) 100);
        org.joda.time.DurationField durationField23 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology9.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology9.getZone();
        org.joda.time.DurationField durationField26 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField10, and durationField14", !(durationField26.compareTo(durationField10) == 0) || (Math.signum(durationField26.compareTo(durationField14)) == Math.signum(durationField10.compareTo(durationField14))));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField18 = chronology8.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField18, and durationField13", !(durationField13.compareTo(durationField18) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField18.compareTo(durationField13))));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.joda.time.DurationField durationField15 = chronology8.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField14", Math.signum(durationField9.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField9)));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology9.years();
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.lang.String str27 = locale19.getDisplayCountry();
        java.lang.String str28 = locale19.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-86397960L), chronology9, locale19);
        org.joda.time.Chronology chronology30 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = chronology30.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField33", (durationField16.compareTo(durationField33) == 0) == durationField16.equals(durationField33));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology9.years();
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.lang.String str27 = locale19.getDisplayCountry();
        java.lang.String str28 = locale19.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-86397960L), chronology9, locale19);
        org.joda.time.Chronology chronology30 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = chronology30.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField33", (durationField16.compareTo(durationField33) == 0) == durationField16.equals(durationField33));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        long long11 = dateTimeParserBucket8.computeMillis(false);
        long long13 = dateTimeParserBucket8.computeMillis(true);
        java.util.Locale locale14 = dateTimeParserBucket8.getLocale();
        long long15 = dateTimeParserBucket8.computeMillis();
        dateTimeParserBucket8.setPivotYear((java.lang.Integer) (-2));
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale21 = new java.util.Locale("hi!");
        java.lang.String str22 = locale21.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale21, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.days();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.year();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = chronology26.add(readablePeriod29, (long) (-1), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField33 = chronology26.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField34 = chronology26.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField35 = chronology26.weekOfWeekyear();
        boolean boolean36 = dateTimeParserBucket8.restoreState((java.lang.Object) chronology26);
        org.joda.time.Chronology chronology37 = chronology26.withUTC();
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale42 = new java.util.Locale("hi!");
        java.lang.String str43 = locale42.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket(0L, chronology40, locale42, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology47 = dateTimeParserBucket46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.weekyear();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.monthOfYear();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField51 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology47.eras();
        java.util.Locale.Category category53 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale54 = java.util.Locale.getDefault(category53);
        java.util.Locale locale55 = java.util.Locale.getDefault(category53);
        java.util.Locale locale56 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology58 = null;
        java.util.Locale locale59 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology58, locale59, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str63 = locale56.getDisplayCountry(locale59);
        java.util.Locale locale64 = java.util.Locale.ITALIAN;
        java.lang.String str65 = locale56.getDisplayLanguage(locale64);
        org.joda.time.Chronology chronology67 = null;
        java.util.Locale locale68 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology67, locale68, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str72 = locale68.toLanguageTag();
        java.lang.String str73 = locale56.getDisplayCountry(locale68);
        java.util.Locale.setDefault(category53, locale56);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str77 = dateTimeZone75.getName((long) 2000);
        boolean boolean78 = dateTimeZone75.isFixed();
        org.joda.time.Chronology chronology81 = null;
        java.util.Locale locale83 = new java.util.Locale("hi!");
        java.lang.String str84 = locale83.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket(0L, chronology81, locale83, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int88 = dateTimeParserBucket87.getPivotYear();
        long long91 = dateTimeParserBucket87.computeMillis(true, "hi!");
        java.util.Locale locale92 = dateTimeParserBucket87.getLocale();
        java.lang.String str93 = dateTimeZone75.getShortName(0L, locale92);
        java.lang.String str94 = locale92.getDisplayCountry();
        java.util.Locale.setDefault(category53, locale92);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket97 = new org.joda.time.format.DateTimeParserBucket((-359999990L), chronology47, locale92, (java.lang.Integer) 40);
        java.util.Locale locale98 = dateTimeParserBucket97.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket99 = new org.joda.time.format.DateTimeParserBucket(971L, chronology26, locale98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField52", Math.signum(durationField27.compareTo(durationField52)) == -Math.signum(durationField52.compareTo(durationField27)));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        boolean boolean2 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.Chronology chronology3 = dateTimeFormatter0.getChronology();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale7.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(0L, chronology5, locale7, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology12.add(readablePeriod16, (long) 'u', (int) (short) -1);
        org.joda.time.Chronology chronology20 = chronology12.withUTC();
        org.joda.time.DurationField durationField21 = chronology12.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter0.withChronology(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField21", Math.signum(durationField13.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField13)));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField13 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField15 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfHour();
        org.joda.time.DurationField durationField17 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField9, and durationField13", !(durationField17.compareTo(durationField9) == 0) || (Math.signum(durationField17.compareTo(durationField13)) == Math.signum(durationField9.compareTo(durationField13))));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.Chronology chronology10 = chronology9.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.weekyears();
        org.joda.time.DurationField durationField12 = chronology10.eras();
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((-3876890L), chronology10, locale13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField12", Math.signum(durationField11.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField11)));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        long long18 = chronology8.add(10L, 53L, (-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField14", Math.signum(durationField9.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField9)));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DurationField durationField11 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField10, and durationField11", !(durationField13.compareTo(durationField10) == 0) || (Math.signum(durationField13.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        java.lang.Integer int14 = dateTimeParserBucket13.getOffsetInteger();
        long long17 = dateTimeParserBucket13.computeMillis(true, "\u82f1\u6587\u7f8e\u570b)");
        dateTimeParserBucket13.setOffset((int) 'u');
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.lang.String str24 = locale23.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology21, locale23, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology28 = dateTimeParserBucket27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DurationField durationField30 = chronology28.days();
        long long36 = chronology28.getDateTimeMillis((long) (-121), (int) (short) 1, (int) (byte) 10, 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField37 = chronology28.secondOfMinute();
        dateTimeParserBucket13.saveField(dateTimeField37, (int) 'u');
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale44 = new java.util.Locale("hi!");
        java.lang.String str45 = locale44.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology42, locale44, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology49 = dateTimeParserBucket48.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.days();
        org.joda.time.DateTimeField dateTimeField51 = chronology49.year();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter53.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str57 = dateTimeZone55.getName((long) 2000);
        boolean boolean58 = dateTimeZone55.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter53.withZone(dateTimeZone55);
        org.joda.time.Chronology chronology60 = chronology49.withZone(dateTimeZone55);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        long long64 = chronology60.add(readablePeriod61, (long) (short) -1, 10);
        org.joda.time.DurationField durationField65 = chronology60.days();
        org.joda.time.DateTimeField dateTimeField66 = chronology60.clockhourOfDay();
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.util.Locale locale69 = locale67.stripExtensions();
        java.util.Locale locale70 = java.util.Locale.CHINA;
        java.lang.String str71 = locale69.getDisplayScript(locale70);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) (-11), chronology60, locale70);
        org.joda.time.DurationField durationField73 = chronology60.millis();
        org.joda.time.DateTimeField dateTimeField74 = chronology60.dayOfMonth();
        dateTimeParserBucket13.saveField(dateTimeField74, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField65", (durationField29.compareTo(durationField65) == 0) == durationField29.equals(durationField65));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getName((long) 2000);
        boolean boolean18 = dateTimeZone15.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter13.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology20 = chronology9.withZone(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology20.add(readablePeriod21, (long) (short) -1, 10);
        org.joda.time.DurationField durationField25 = chronology20.days();
        java.util.Locale locale29 = new java.util.Locale("+10:00", "java.io.IOException: en-US", "+00:00");
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale33 = new java.util.Locale("hi!");
        java.lang.String str34 = locale33.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(0L, chronology31, locale33, (java.lang.Integer) 10, (int) 'a');
        int int38 = dateTimeParserBucket37.getOffset();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeParserBucket37.getZone();
        long long42 = dateTimeZone39.adjustOffset((-1L), true);
        long long45 = dateTimeZone39.adjustOffset((long) 'a', true);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet51 = locale50.getExtensionKeys();
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale52.toLanguageTag();
        java.util.Locale locale55 = new java.util.Locale("hi!");
        java.lang.String str56 = locale55.getDisplayCountry();
        java.lang.String str57 = locale55.toLanguageTag();
        java.lang.String str58 = locale52.getDisplayName(locale55);
        java.lang.String str59 = locale50.getDisplayCountry(locale55);
        java.lang.String str60 = locale55.getScript();
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.lang.String str65 = locale64.toLanguageTag();
        java.util.Locale locale67 = new java.util.Locale("hi!");
        java.lang.String str68 = locale67.getDisplayCountry();
        java.lang.String str69 = locale67.toLanguageTag();
        java.lang.String str70 = locale64.getDisplayName(locale67);
        java.lang.String str71 = locale62.getDisplayCountry(locale67);
        java.lang.String str72 = locale61.getDisplayScript(locale62);
        java.util.Locale.Category category73 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale74 = java.util.Locale.getDefault(category73);
        java.util.Locale locale75 = java.util.Locale.TAIWAN;
        java.lang.String str76 = locale74.getDisplayVariant(locale75);
        java.lang.String str77 = locale61.getDisplayName(locale75);
        java.lang.String str78 = locale55.getDisplayScript(locale61);
        java.lang.String str79 = dateTimeZone48.getName((long) 'x', locale61);
        java.lang.String str80 = dateTimeZone39.getName(3600000L, locale61);
        java.lang.String str81 = locale29.getDisplayCountry(locale61);
        java.lang.String str82 = locale29.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((-40L), chronology20, locale29, (java.lang.Integer) 2000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField25", (durationField10.compareTo(durationField25) == 0) == durationField10.equals(durationField25));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField15 = chronology8.years();
        java.lang.String str16 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField21 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField9, and durationField15", !(durationField21.compareTo(durationField9) == 0) || (Math.signum(durationField21.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.weekyear();
        org.joda.time.DurationField durationField19 = chronology8.centuries();
        org.joda.time.DurationField durationField20 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField9, and durationField19", !(durationField20.compareTo(durationField9) == 0) || (Math.signum(durationField20.compareTo(durationField19)) == Math.signum(durationField9.compareTo(durationField19))));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DurationField durationField11 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology9 = chronology8.withUTC();
        org.joda.time.Chronology chronology10 = chronology8.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfMinute();
        org.joda.time.DurationField durationField13 = chronology10.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField13, and durationField11", !(durationField11.compareTo(durationField13) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField13.compareTo(durationField11))));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField9, and durationField10", !(durationField13.compareTo(durationField9) == 0) || (Math.signum(durationField13.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField15 = chronology8.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField15, and durationField13", !(durationField13.compareTo(durationField15) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField15.compareTo(durationField13))));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfDay();
        long long16 = chronology8.add((long) 1, 97L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField17 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField20 = chronology8.weekyears();
        org.joda.time.DurationField durationField21 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField22 = chronology8.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField21", (durationField20.compareTo(durationField21) == 0) == durationField20.equals(durationField21));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.DurationField durationField12 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology9.days();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        long long23 = dateTimeZone20.adjustOffset((long) 0, true);
        java.lang.String str25 = dateTimeZone20.getNameKey((long) (-1));
        boolean boolean26 = dateTimeZone20.isFixed();
        int int28 = dateTimeZone20.getOffset((long) (short) 0);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale32 = new java.util.Locale("hi!");
        java.lang.String str33 = locale32.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(0L, chronology30, locale32, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology37 = dateTimeParserBucket36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.days();
        org.joda.time.DurationField durationField39 = chronology37.weekyears();
        boolean boolean40 = dateTimeZone20.equals((java.lang.Object) chronology37);
        org.joda.time.DateTimeField dateTimeField41 = chronology37.era();
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet43 = locale42.getExtensionKeys();
        java.util.Locale locale44 = locale42.stripExtensions();
        java.util.Locale locale45 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet46 = locale45.getUnicodeLocaleKeys();
        java.lang.String str47 = locale44.getDisplayScript(locale45);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) (-41), chronology37, locale44, (java.lang.Integer) (-1));
        java.lang.String str50 = locale44.toLanguageTag();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket(12L, chronology9, locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField39", (durationField12.compareTo(durationField39) == 0) == durationField12.equals(durationField39));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.year();
        org.joda.time.DurationField durationField17 = chronology10.millis();
        org.joda.time.DurationField durationField18 = chronology10.years();
        java.util.Locale locale21 = new java.util.Locale("+00:00:00.035", "english (united states) (UND,en-US)");
        java.lang.String str22 = locale21.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(2001L, chronology10, locale21, (java.lang.Integer) (-3600000), (-121));
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.lang.String str30 = locale29.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale29, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology34 = dateTimeParserBucket33.getChronology();
        org.joda.time.Chronology chronology35 = chronology34.withUTC();
        org.joda.time.DurationField durationField36 = chronology35.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.clockhourOfHalfday();
        long long41 = chronology35.add((long) 'x', (long) (byte) 0, 40);
        org.joda.time.DateTimeZone dateTimeZone42 = chronology35.getZone();
        boolean boolean43 = dateTimeParserBucket25.restoreState((java.lang.Object) chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField36", (durationField18.compareTo(durationField36) == 0) == durationField18.equals(durationField36));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology9 = chronology8.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField14", Math.signum(durationField9.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField9)));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField14", Math.signum(durationField9.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField9)));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DurationField durationField13 = chronology12.minutes();
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField13", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField13)) == Math.signum(durationField9.compareTo(durationField13))));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology19.add(readablePeriod20, (long) (short) -1, 10);
        org.joda.time.DateTimeField dateTimeField24 = chronology19.dayOfMonth();
        org.joda.time.DurationField durationField25 = chronology19.years();
        org.joda.time.DurationField durationField26 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField9, and durationField25", !(durationField26.compareTo(durationField9) == 0) || (Math.signum(durationField26.compareTo(durationField25)) == Math.signum(durationField9.compareTo(durationField25))));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology19.add(readablePeriod22, (-3660000L), (-118));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField21", Math.signum(durationField9.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField9)));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        long long16 = chronology8.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology8.months();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology8.getZone();
        java.util.Locale locale22 = new java.util.Locale("");
        java.util.Locale locale24 = new java.util.Locale("hi!");
        java.lang.String str25 = locale24.getDisplayCountry();
        java.lang.String str26 = locale24.getISO3Language();
        java.lang.String str27 = locale24.getISO3Country();
        java.lang.String str28 = locale24.getVariant();
        java.lang.String str29 = locale24.getISO3Country();
        java.lang.String str30 = locale24.getDisplayVariant();
        java.lang.String str31 = locale22.getDisplayScript(locale24);
        java.lang.String str32 = dateTimeZone19.getShortName((-41L), locale24);
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale36 = new java.util.Locale("hi!");
        java.lang.String str37 = locale36.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(0L, chronology34, locale36, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.weekyear();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.monthOfYear();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.secondOfDay();
        org.joda.time.Chronology chronology45 = chronology41.withUTC();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        long long49 = dateTimeZone46.adjustOffset((long) 0, true);
        java.lang.String str51 = dateTimeZone46.getNameKey((long) (-1));
        boolean boolean52 = dateTimeZone46.isFixed();
        int int54 = dateTimeZone46.getOffset((long) (short) 0);
        long long57 = dateTimeZone46.convertLocalToUTC(0L, true);
        long long60 = dateTimeZone46.convertLocalToUTC((long) 'u', false);
        org.joda.time.ReadableInstant readableInstant61 = null;
        int int62 = dateTimeZone46.getOffset(readableInstant61);
        org.joda.time.Chronology chronology63 = chronology41.withZone(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField64 = chronology41.weekyear();
        org.joda.time.DurationField durationField65 = chronology41.days();
        org.joda.time.DurationField durationField66 = chronology41.eras();
        boolean boolean67 = locale24.equals((java.lang.Object) durationField66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField66, durationField9, and durationField18", !(durationField66.compareTo(durationField9) == 0) || (Math.signum(durationField66.compareTo(durationField18)) == Math.signum(durationField9.compareTo(durationField18))));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField21", Math.signum(durationField9.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField9)));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.days();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField19 = chronology9.centuries();
        org.joda.time.DurationField durationField20 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField14, and durationField15", !(durationField20.compareTo(durationField14) == 0) || (Math.signum(durationField20.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter8.withChronology(chronology17);
        int int21 = dateTimeFormatter20.getDefaultYear();
        org.joda.time.Chronology chronology22 = dateTimeFormatter20.getChronolgy();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology22.eras();
        org.joda.time.DurationField durationField25 = chronology22.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField25, and durationField24", !(durationField24.compareTo(durationField25) == 0) || (Math.signum(durationField24.compareTo(durationField24)) == Math.signum(durationField25.compareTo(durationField24))));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology8.add(readablePeriod12, (long) 'u', (int) (short) -1);
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        org.joda.time.DurationField durationField17 = chronology8.weeks();
        org.joda.time.DurationField durationField18 = chronology8.years();
        org.joda.time.DurationField durationField19 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField9, and durationField17", !(durationField19.compareTo(durationField9) == 0) || (Math.signum(durationField19.compareTo(durationField17)) == Math.signum(durationField9.compareTo(durationField17))));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.halfdayOfDay();
        long long17 = chronology9.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField19 = chronology9.months();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology9.getZone();
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale22.toLanguageTag();
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str26 = locale22.getDisplayVariant(locale25);
        java.util.Locale locale27 = locale22.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale22);
        org.joda.time.DurationField durationField29 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = chronology9.centuryOfEra();
        org.joda.time.DurationField durationField31 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField10, and durationField19", !(durationField31.compareTo(durationField10) == 0) || (Math.signum(durationField31.compareTo(durationField19)) == Math.signum(durationField10.compareTo(durationField19))));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DurationField durationField11 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.monthOfYear();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField10, and durationField11", !(durationField16.compareTo(durationField10) == 0) || (Math.signum(durationField16.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfDay();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DurationField durationField15 = chronology13.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField15", (durationField10.compareTo(durationField15) == 0) == durationField10.equals(durationField15));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.millis();
        long long18 = chronology9.add((long) (byte) 100, (long) (byte) 1, 0);
        org.joda.time.DateTimeField dateTimeField19 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField22", Math.signum(durationField14.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField14)));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.era();
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField10", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.millisOfSecond();
        org.joda.time.DurationField durationField19 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField9, and durationField16", !(durationField19.compareTo(durationField9) == 0) || (Math.signum(durationField19.compareTo(durationField16)) == Math.signum(durationField9.compareTo(durationField16))));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DurationField durationField15 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.millisOfSecond();
        org.joda.time.Chronology chronology17 = chronology8.withUTC();
        org.joda.time.DurationField durationField18 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField9, and durationField15", !(durationField18.compareTo(durationField9) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.centuryOfEra();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField16", Math.signum(durationField9.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField9)));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology19.add(readablePeriod20, (long) (short) -1, 10);
        org.joda.time.DurationField durationField24 = chronology19.days();
        org.joda.time.DateTimeField dateTimeField25 = chronology19.clockhourOfDay();
        org.joda.time.DurationField durationField26 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField27 = chronology19.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField24", (durationField9.compareTo(durationField24) == 0) == durationField9.equals(durationField24));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology8.add(readablePeriod11, (long) (-1), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField16", Math.signum(durationField9.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField9)));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.era();
        long long17 = chronology8.add((-59087318399900L), (-144059880L), (-36));
        org.joda.time.DurationField durationField18 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField18", Math.signum(durationField10.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField10)));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfYear();
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.util.Locale.setDefault(category17, locale19);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale.setDefault(category28, locale29);
        java.util.Locale locale32 = java.util.Locale.getDefault(category28);
        java.lang.String str33 = locale19.getDisplayName(locale32);
        java.lang.String str34 = locale19.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(2040L, chronology9, locale19, (java.lang.Integer) (-33));
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.lang.String str41 = locale40.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale40, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        long long47 = dateTimeParserBucket44.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeParserBucket44.getZone();
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.lang.String str53 = locale52.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(0L, chronology50, locale52, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology57 = dateTimeParserBucket56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.days();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.year();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        long long63 = chronology57.add(readablePeriod60, (long) (-1), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField64 = chronology57.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField65 = chronology57.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField66 = chronology57.weekOfWeekyear();
        dateTimeParserBucket44.saveField(dateTimeField66, (-1));
        org.joda.time.DateTimeZone dateTimeZone69 = dateTimeParserBucket44.getZone();
        long long72 = dateTimeZone69.adjustOffset((long) ' ', false);
        java.util.Locale locale73 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet74 = locale73.getExtensionKeys();
        boolean boolean75 = dateTimeZone69.equals((java.lang.Object) locale73);
        dateTimeParserBucket36.setZone(dateTimeZone69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField58", Math.signum(durationField14.compareTo(durationField58)) == -Math.signum(durationField58.compareTo(durationField14)));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getName((long) 2000);
        boolean boolean3 = dateTimeZone0.isFixed();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale8, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int13 = dateTimeParserBucket12.getPivotYear();
        long long16 = dateTimeParserBucket12.computeMillis(true, "hi!");
        java.util.Locale locale17 = dateTimeParserBucket12.getLocale();
        java.lang.String str18 = dateTimeZone0.getShortName(0L, locale17);
        long long20 = dateTimeZone0.previousTransition((long) ' ');
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Locale.FilteringMode filteringMode28 = null;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList26, filteringMode28);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = null;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.lang.String str42 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList38);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList38, filteringMode43);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.Locale.FilteringMode filteringMode55 = null;
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList53, filteringMode55);
        java.lang.String str57 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList53);
        java.lang.String str58 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList53);
        boolean boolean59 = dateTimeZone0.equals((java.lang.Object) languageRangeList22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.lang.String str65 = locale64.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket(0L, chronology62, locale64, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology69 = dateTimeParserBucket68.getChronology();
        org.joda.time.DurationField durationField70 = chronology69.days();
        org.joda.time.DateTimeField dateTimeField71 = chronology69.year();
        org.joda.time.DateTimeField dateTimeField72 = chronology69.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter73.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str77 = dateTimeZone75.getName((long) 2000);
        boolean boolean78 = dateTimeZone75.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatter73.withZone(dateTimeZone75);
        org.joda.time.Chronology chronology80 = chronology69.withZone(dateTimeZone75);
        org.joda.time.DateTimeField dateTimeField81 = chronology80.hourOfHalfday();
        org.joda.time.DurationField durationField82 = chronology80.eras();
        boolean boolean83 = dateTimeZone0.equals((java.lang.Object) chronology80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField70 and durationField82", Math.signum(durationField70.compareTo(durationField82)) == -Math.signum(durationField82.compareTo(durationField70)));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.centuryOfEra();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField16", Math.signum(durationField9.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField9)));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.DurationField durationField15 = chronology13.weekyears();
        org.joda.time.DurationField durationField16 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField15", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale15.toLanguageTag();
        java.lang.String str17 = locale15.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology9, locale15);
        org.joda.time.DateTimeField dateTimeField19 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.centuryOfEra();
        org.joda.time.DurationField durationField21 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField21", Math.signum(durationField10.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField10)));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField15 = chronology8.years();
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = chronology16.add(readablePeriod17, (long) 40, (int) (short) 0);
        org.joda.time.DurationField durationField21 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField9, and durationField15", !(durationField21.compareTo(durationField9) == 0) || (Math.signum(durationField21.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.halfdayOfDay();
        long long17 = chronology9.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfDay();
        java.util.Locale locale22 = new java.util.Locale("+00:00:00.035", "", "");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleAttributes();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology9, locale22);
        org.joda.time.DurationField durationField26 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField27 = chronology9.millisOfSecond();
        org.joda.time.DurationField durationField28 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField10, and durationField26", !(durationField28.compareTo(durationField10) == 0) || (Math.signum(durationField28.compareTo(durationField26)) == Math.signum(durationField10.compareTo(durationField26))));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology9 = chronology8.withUTC();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology9.getZone();
        org.joda.time.DurationField durationField11 = chronology9.minutes();
        org.joda.time.DurationField durationField12 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = chronology9.minutes();
        org.joda.time.DurationField durationField15 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField11, and durationField12", !(durationField15.compareTo(durationField11) == 0) || (Math.signum(durationField15.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.days();
        org.joda.time.DurationField durationField11 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.hours();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField11", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfYear();
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.util.Locale.setDefault(category17, locale19);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale.setDefault(category28, locale29);
        java.util.Locale locale32 = java.util.Locale.getDefault(category28);
        java.lang.String str33 = locale19.getDisplayName(locale32);
        java.lang.String str34 = locale19.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(2040L, chronology9, locale19, (java.lang.Integer) (-33));
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.lang.String str41 = locale40.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale40, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.weekyear();
        org.joda.time.DurationField durationField47 = chronology45.minutes();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.weekyearOfCentury();
        dateTimeParserBucket36.saveField(dateTimeField48, (int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField47", Math.signum(durationField14.compareTo(durationField47)) == -Math.signum(durationField47.compareTo(durationField14)));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology9.years();
        org.joda.time.Chronology chronology17 = chronology9.withUTC();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology17.add(readablePeriod18, (long) 40, (int) (short) 0);
        java.lang.String str22 = chronology17.toString();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        java.util.Locale locale27 = new java.util.Locale("UTC", "1/1/70", "it");
        java.lang.String str28 = locale27.getCountry();
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale27.getDisplayCountry(locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((-2000L), chronology17, locale27, (java.lang.Integer) 10, (-53));
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.lang.String str39 = locale38.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology36, locale38, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology43 = dateTimeParserBucket42.getChronology();
        java.util.Locale locale45 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology43, locale45, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.Chronology chronology49 = chronology43.withZone(dateTimeZone48);
        org.joda.time.DurationField durationField50 = chronology43.eras();
        boolean boolean51 = dateTimeParserBucket33.restoreState((java.lang.Object) durationField50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField50, durationField10, and durationField16", !(durationField50.compareTo(durationField10) == 0) || (Math.signum(durationField50.compareTo(durationField16)) == Math.signum(durationField10.compareTo(durationField16))));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology8.weeks();
        org.joda.time.DurationField durationField15 = chronology8.days();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField10, and durationField14", !(durationField16.compareTo(durationField10) == 0) || (Math.signum(durationField16.compareTo(durationField14)) == Math.signum(durationField10.compareTo(durationField14))));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField12 = chronology8.months();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField14", (durationField10.compareTo(durationField14) == 0) == durationField10.equals(durationField14));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffset((long) (short) 0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        boolean boolean20 = dateTimeZone0.equals((java.lang.Object) chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.monthOfYear();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.minuteOfHour();
        org.joda.time.DurationField durationField24 = chronology17.years();
        org.joda.time.DurationField durationField25 = chronology17.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField24", (durationField19.compareTo(durationField24) == 0) == durationField19.equals(durationField24));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology8.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField16, and durationField13", !(durationField13.compareTo(durationField16) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField16.compareTo(durationField13))));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.dayOfWeek();
        org.joda.time.DurationField durationField22 = chronology19.weeks();
        org.joda.time.DurationField durationField23 = chronology19.seconds();
        org.joda.time.DurationField durationField24 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField9, and durationField22", !(durationField24.compareTo(durationField9) == 0) || (Math.signum(durationField24.compareTo(durationField22)) == Math.signum(durationField9.compareTo(durationField22))));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology9 = chronology8.withUTC();
        org.joda.time.DurationField durationField10 = chronology8.seconds();
        org.joda.time.DurationField durationField11 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField13 = chronology8.hours();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology8.add(readablePeriod14, 203761L, (int) (short) 0);
        org.joda.time.DurationField durationField18 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField10, and durationField11", !(durationField18.compareTo(durationField10) == 0) || (Math.signum(durationField18.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField15 = chronology8.years();
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = chronology16.add(readablePeriod17, (long) 40, (int) (short) 0);
        java.lang.String str21 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.era();
        org.joda.time.DurationField durationField23 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField9, and durationField15", !(durationField23.compareTo(durationField9) == 0) || (Math.signum(durationField23.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.weekyearOfCentury();
        org.joda.time.DurationField durationField24 = chronology19.eras();
        org.joda.time.DurationField durationField25 = chronology19.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField24", Math.signum(durationField9.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField9)));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        long long14 = chronology9.add((long) 1, 100L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField17 = chronology9.seconds();
        java.util.Locale locale21 = new java.util.Locale("English (United States)", "und", "en-US");
        java.lang.String str22 = locale21.getDisplayName();
        java.lang.String str23 = locale21.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology9, locale21, (java.lang.Integer) 0, (int) '4');
        org.joda.time.Chronology chronology27 = dateTimeParserBucket26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.dayOfWeek();
        org.joda.time.DurationField durationField31 = chronology27.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField10, and durationField17", !(durationField31.compareTo(durationField10) == 0) || (Math.signum(durationField31.compareTo(durationField17)) == Math.signum(durationField10.compareTo(durationField17))));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.year();
        org.joda.time.DurationField durationField17 = chronology10.millis();
        org.joda.time.DurationField durationField18 = chronology10.years();
        java.util.Locale locale21 = new java.util.Locale("+00:00:00.035", "english (united states) (UND,en-US)");
        java.lang.String str22 = locale21.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(2001L, chronology10, locale21, (java.lang.Integer) (-3600000), (-121));
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket25.getZone();
        java.lang.Integer int27 = dateTimeParserBucket25.getPivotYear();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale32 = new java.util.Locale("hi!");
        java.lang.String str33 = locale32.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(0L, chronology30, locale32, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology37 = dateTimeParserBucket36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.weekyear();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.monthOfYear();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = chronology37.yearOfCentury();
        org.joda.time.DurationField durationField42 = chronology37.eras();
        org.joda.time.DateTimeField dateTimeField43 = chronology37.millisOfDay();
        org.joda.time.DateTimeField dateTimeField44 = chronology37.dayOfYear();
        java.util.Locale.Category category45 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale46 = java.util.Locale.getDefault(category45);
        java.util.Locale locale47 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology49, locale50, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str54 = locale47.getDisplayCountry(locale50);
        java.util.Locale.setDefault(category45, locale47);
        java.util.Locale.Category category56 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale57 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet58 = locale57.getExtensionKeys();
        java.util.Locale.setDefault(category56, locale57);
        java.util.Locale locale60 = java.util.Locale.getDefault(category56);
        java.lang.String str61 = locale47.getDisplayName(locale60);
        java.lang.String str62 = locale47.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket(2040L, chronology37, locale47, (java.lang.Integer) (-33));
        java.util.Locale locale65 = locale47.stripExtensions();
        boolean boolean66 = dateTimeParserBucket25.restoreState((java.lang.Object) locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField42", Math.signum(durationField17.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField17)));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology8.add(readablePeriod15, (long) 'a', (int) 'a');
        org.joda.time.DurationField durationField19 = chronology8.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.Chronology chronology22 = chronology8.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = chronology8.clockhourOfHalfday();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.lang.String str30 = locale29.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale29, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology34 = dateTimeParserBucket33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.weekyear();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.monthOfYear();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField39 = chronology34.eras();
        java.util.Locale.Category category40 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale41 = java.util.Locale.getDefault(category40);
        java.util.Locale locale42 = java.util.Locale.getDefault(category40);
        java.util.Locale locale43 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology45, locale46, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str50 = locale43.getDisplayCountry(locale46);
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.lang.String str52 = locale43.getDisplayLanguage(locale51);
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology54, locale55, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str59 = locale55.toLanguageTag();
        java.lang.String str60 = locale43.getDisplayCountry(locale55);
        java.util.Locale.setDefault(category40, locale43);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getName((long) 2000);
        boolean boolean65 = dateTimeZone62.isFixed();
        org.joda.time.Chronology chronology68 = null;
        java.util.Locale locale70 = new java.util.Locale("hi!");
        java.lang.String str71 = locale70.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket(0L, chronology68, locale70, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int75 = dateTimeParserBucket74.getPivotYear();
        long long78 = dateTimeParserBucket74.computeMillis(true, "hi!");
        java.util.Locale locale79 = dateTimeParserBucket74.getLocale();
        java.lang.String str80 = dateTimeZone62.getShortName(0L, locale79);
        java.lang.String str81 = locale79.getDisplayCountry();
        java.util.Locale.setDefault(category40, locale79);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((-359999990L), chronology34, locale79, (java.lang.Integer) 40);
        org.joda.time.Chronology chronology85 = dateTimeParserBucket84.getChronology();
        org.joda.time.DateTimeZone dateTimeZone86 = dateTimeParserBucket84.getZone();
        org.joda.time.Chronology chronology87 = chronology8.withZone(dateTimeZone86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField39", Math.signum(durationField9.compareTo(durationField39)) == -Math.signum(durationField39.compareTo(durationField9)));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.DurationField durationField12 = chronology9.years();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale17 = new java.util.Locale("hi!");
        java.lang.String str18 = locale17.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale17, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology22 = dateTimeParserBucket21.getChronology();
        java.util.Locale locale24 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology22, locale24, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Chronology chronology28 = chronology22.withZone(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = chronology28.getZone();
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale31);
        java.lang.String str33 = dateTimeZone29.getShortName((long) 'u', locale31);
        org.joda.time.Chronology chronology34 = chronology9.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField35 = chronology9.monthOfYear();
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder36.setExtension('a', "en-US");
        java.util.Locale.Builder builder41 = builder39.setVariant("");
        java.util.Locale.Builder builder42 = builder41.clear();
        java.util.Locale.Builder builder43 = builder42.clearExtensions();
        java.util.Locale.Builder builder46 = builder42.setExtension('a', "it");
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet48 = locale47.getExtensionKeys();
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale49.toLanguageTag();
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.lang.String str53 = locale52.getDisplayCountry();
        java.lang.String str54 = locale52.toLanguageTag();
        java.lang.String str55 = locale49.getDisplayName(locale52);
        java.lang.String str56 = locale47.getDisplayCountry(locale52);
        java.lang.String str57 = locale52.getScript();
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.util.Locale locale59 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet60 = locale59.getExtensionKeys();
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.lang.String str62 = locale61.toLanguageTag();
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.lang.String str65 = locale64.getDisplayCountry();
        java.lang.String str66 = locale64.toLanguageTag();
        java.lang.String str67 = locale61.getDisplayName(locale64);
        java.lang.String str68 = locale59.getDisplayCountry(locale64);
        java.lang.String str69 = locale58.getDisplayScript(locale59);
        java.util.Locale.Category category70 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale71 = java.util.Locale.getDefault(category70);
        java.util.Locale locale72 = java.util.Locale.TAIWAN;
        java.lang.String str73 = locale71.getDisplayVariant(locale72);
        java.lang.String str74 = locale58.getDisplayName(locale72);
        java.lang.String str75 = locale52.getDisplayScript(locale58);
        java.util.Locale.Builder builder76 = builder46.setLocale(locale58);
        java.util.Locale.Builder builder77 = builder46.clear();
        java.util.Locale.Builder builder79 = builder46.setLanguageTag("Twi");
        java.util.Locale locale80 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale80);
        java.lang.String str82 = locale80.getDisplayName();
        java.util.Set<java.lang.String> strSet83 = locale80.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder84 = builder46.setLocale(locale80);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket((long) (-115200001), chronology9, locale80, (java.lang.Integer) (-1970), 100);
        org.joda.time.DurationField durationField88 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField88, durationField11, and durationField12", !(durationField88.compareTo(durationField11) == 0) || (Math.signum(durationField88.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField15 = chronology8.years();
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField18 = chronology8.weekyears();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology8.add(readablePeriod16, (long) (-41), (int) (short) 0);
        org.joda.time.DurationField durationField20 = chronology8.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField20, and durationField13", !(durationField13.compareTo(durationField20) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField20.compareTo(durationField13))));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology8.add(readablePeriod12, (long) 'u', (int) (short) -1);
        org.joda.time.Chronology chronology16 = chronology8.withUTC();
        org.joda.time.DurationField durationField17 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology9 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField11 = chronology8.years();
        long long15 = chronology8.add(3600000L, 203761L, (int) (short) -1);
        org.joda.time.DurationField durationField16 = chronology8.months();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.year();
        org.joda.time.DurationField durationField19 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField11, and durationField16", !(durationField19.compareTo(durationField11) == 0) || (Math.signum(durationField19.compareTo(durationField16)) == Math.signum(durationField11.compareTo(durationField16))));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getName((long) 2000);
        boolean boolean18 = dateTimeZone15.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter13.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology20 = chronology9.withZone(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology20.add(readablePeriod21, (long) (short) -1, 10);
        org.joda.time.DurationField durationField25 = chronology20.days();
        org.joda.time.DateTimeField dateTimeField26 = chronology20.clockhourOfDay();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale29 = locale27.stripExtensions();
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.lang.String str31 = locale29.getDisplayScript(locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (-11), chronology20, locale30);
        org.joda.time.DurationField durationField33 = chronology20.millis();
        org.joda.time.DurationField durationField34 = chronology20.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField25", (durationField10.compareTo(durationField25) == 0) == durationField10.equals(durationField25));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField10", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DurationField durationField11 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology8.getZone();
        org.joda.time.DurationField durationField15 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField15", (durationField11.compareTo(durationField15) == 0) == durationField11.equals(durationField15));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField12 = chronology8.seconds();
        org.joda.time.DurationField durationField13 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField15", (durationField10.compareTo(durationField15) == 0) == durationField10.equals(durationField15));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfDay();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.DurationField durationField14 = chronology13.years();
        java.lang.String str15 = chronology13.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField14", (durationField10.compareTo(durationField14) == 0) == durationField10.equals(durationField14));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology8.hours();
        org.joda.time.DurationField durationField14 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.millisOfSecond();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField13", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField13)) == Math.signum(durationField9.compareTo(durationField13))));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfYear();
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.util.Locale.setDefault(category17, locale19);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale.setDefault(category28, locale29);
        java.util.Locale locale32 = java.util.Locale.getDefault(category28);
        java.lang.String str33 = locale19.getDisplayName(locale32);
        java.lang.String str34 = locale19.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(2040L, chronology9, locale19, (java.lang.Integer) (-33));
        org.joda.time.DateTimeField dateTimeField37 = chronology9.dayOfWeek();
        org.joda.time.Chronology chronology38 = chronology9.withUTC();
        org.joda.time.DurationField durationField39 = chronology9.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField39, and durationField14", !(durationField14.compareTo(durationField39) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField39.compareTo(durationField14))));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology9.years();
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.lang.String str27 = locale19.getDisplayCountry();
        java.lang.String str28 = locale19.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-86397960L), chronology9, locale19);
        org.joda.time.Chronology chronology30 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        java.lang.String str32 = chronology30.toString();
        org.joda.time.DurationField durationField33 = chronology30.millis();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.year();
        org.joda.time.DurationField durationField35 = chronology30.weekyears();
        org.joda.time.DurationField durationField36 = chronology30.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField36", (durationField16.compareTo(durationField36) == 0) == durationField16.equals(durationField36));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withPivotYear((int) 'u');
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.lang.String str10 = locale9.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(0L, chronology7, locale9, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.days();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.year();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.secondOfDay();
        org.joda.time.DurationField durationField20 = chronology14.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter5.withChronology(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField20", Math.signum(durationField15.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField15)));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.year();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.millisOfDay();
        dateTimeParserBucket7.saveField(dateTimeField20, 100);
        java.lang.Integer int23 = dateTimeParserBucket7.getOffsetInteger();
        java.util.Locale locale24 = dateTimeParserBucket7.getLocale();
        java.util.Locale locale25 = dateTimeParserBucket7.getLocale();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.lang.String str30 = locale29.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale29, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology34 = dateTimeParserBucket33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.weekyear();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.monthOfYear();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.weekOfWeekyear();
        dateTimeParserBucket7.saveField(dateTimeField37, (int) ' ');
        boolean boolean41 = dateTimeParserBucket7.restoreState((java.lang.Object) '#');
        org.joda.time.Chronology chronology42 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.secondOfMinute();
        org.joda.time.DurationField durationField44 = chronology42.eras();
        org.joda.time.DurationField durationField45 = chronology42.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField44", Math.signum(durationField18.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField18)));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology10.months();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        long long20 = dateTimeZone17.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone21 = dateTimeZone17.toTimeZone();
        int int23 = dateTimeZone17.getOffsetFromLocal(100L);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology25, locale26, (java.lang.Integer) (-1), (int) (byte) 10);
        boolean boolean30 = dateTimeZone17.equals((java.lang.Object) chronology25);
        java.lang.String str32 = dateTimeZone17.getShortName((long) 'a');
        org.joda.time.Chronology chronology33 = chronology10.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField34 = chronology10.year();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        long long38 = dateTimeZone35.adjustOffset((long) 0, true);
        java.lang.String str39 = dateTimeZone35.toString();
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder44 = builder41.setExtension('a', "en-US");
        java.util.Locale.Builder builder46 = builder44.setVariant("");
        java.util.Locale.Builder builder47 = builder46.clear();
        java.util.Locale.Builder builder48 = builder47.clearExtensions();
        java.util.Locale.Builder builder51 = builder47.setExtension('a', "it");
        java.util.Locale locale52 = builder51.build();
        java.lang.String str53 = dateTimeZone35.getShortName((long) (short) 1, locale52);
        java.util.Set<java.lang.String> strSet54 = locale52.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 2000, chronology10, locale52, (java.lang.Integer) 2000, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField58 = chronology10.era();
        org.joda.time.DurationField durationField59 = chronology10.millis();
        org.joda.time.DurationField durationField60 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField60, durationField16, and durationField59", !(durationField60.compareTo(durationField16) == 0) || (Math.signum(durationField60.compareTo(durationField59)) == Math.signum(durationField16.compareTo(durationField59))));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.year();
        org.joda.time.DurationField durationField19 = chronology15.centuries();
        org.joda.time.Chronology chronology20 = chronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = chronology15.monthOfYear();
        org.joda.time.DurationField durationField22 = chronology15.months();
        org.joda.time.DateTimeField dateTimeField23 = chronology15.centuryOfEra();
        long long27 = chronology15.add((long) 'x', 3659999L, (-98));
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale31 = new java.util.Locale("hi!");
        java.lang.String str32 = locale31.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale31, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.days();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.year();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.millisOfDay();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.halfdayOfDay();
        long long44 = chronology36.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField45 = chronology36.clockhourOfDay();
        org.joda.time.DurationField durationField46 = chronology36.months();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology36.getZone();
        long long50 = dateTimeZone47.adjustOffset((-1L), false);
        org.joda.time.Chronology chronology51 = chronology15.withZone(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField46", (durationField22.compareTo(durationField46) == 0) == durationField22.equals(durationField46));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getName((long) 2000);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter0.getPrinter();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter0.withChronology(chronology17);
        java.lang.String str23 = chronology17.toString();
        org.joda.time.DurationField durationField24 = chronology17.weeks();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.year();
        org.joda.time.DurationField durationField26 = chronology17.years();
        org.joda.time.DurationField durationField27 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField24, and durationField26", !(durationField27.compareTo(durationField24) == 0) || (Math.signum(durationField27.compareTo(durationField26)) == Math.signum(durationField24.compareTo(durationField26))));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.halfdayOfDay();
        long long17 = chronology9.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.monthOfYear();
        java.util.Locale.Category category20 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale25 = new java.util.Locale("hi!");
        java.lang.String str26 = locale25.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(0L, chronology23, locale25, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        java.util.Locale locale32 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology30, locale32, (java.lang.Integer) 10);
        java.util.Locale.setDefault(category20, locale32);
        java.util.Locale locale36 = java.util.Locale.getDefault(category20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology9, locale36, (java.lang.Integer) 2000, (int) ' ');
        org.joda.time.DateTimeField dateTimeField40 = chronology9.monthOfYear();
        org.joda.time.DurationField durationField41 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField42 = chronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology9.era();
        org.joda.time.DurationField durationField44 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField44, durationField10, and durationField41", !(durationField44.compareTo(durationField10) == 0) || (Math.signum(durationField44.compareTo(durationField41)) == Math.signum(durationField10.compareTo(durationField41))));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField17 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology9.years();
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.lang.String str27 = locale19.getDisplayCountry();
        java.lang.String str28 = locale19.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-86397960L), chronology9, locale19);
        org.joda.time.Chronology chronology30 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        java.lang.String str32 = chronology30.toString();
        org.joda.time.DurationField durationField33 = chronology30.millis();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.year();
        org.joda.time.DurationField durationField35 = chronology30.weekyears();
        org.joda.time.DurationField durationField36 = chronology30.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField35", (durationField16.compareTo(durationField35) == 0) == durationField16.equals(durationField35));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getName((long) 2000);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter0.getPrinter();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter0.withChronology(chronology17);
        java.lang.String str23 = chronology17.toString();
        org.joda.time.DurationField durationField24 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.year();
        org.joda.time.DurationField durationField26 = chronology17.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField26, and durationField24", !(durationField24.compareTo(durationField26) == 0) || (Math.signum(durationField24.compareTo(durationField24)) == Math.signum(durationField26.compareTo(durationField24))));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.hourOfHalfday();
        java.lang.String str17 = chronology8.toString();
        org.joda.time.DurationField durationField18 = chronology8.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField18, and durationField13", !(durationField13.compareTo(durationField18) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField18.compareTo(durationField13))));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale15.toLanguageTag();
        java.lang.String str17 = locale15.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology9, locale15);
        org.joda.time.DateTimeField dateTimeField19 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.centuryOfEra();
        org.joda.time.DurationField durationField21 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField21", Math.signum(durationField10.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField10)));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DurationField durationField11 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekyear();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField10, and durationField11", !(durationField15.compareTo(durationField10) == 0) || (Math.signum(durationField15.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.weekyearOfCentury();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        java.lang.String str15 = chronology14.toString();
        org.joda.time.DurationField durationField16 = chronology14.eras();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale21 = new java.util.Locale("hi!");
        java.lang.String str22 = locale21.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale21, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        java.util.Locale locale28 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology26, locale28, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = chronology26.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = chronology26.hourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology26.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField35 = chronology26.era();
        org.joda.time.Chronology chronology36 = chronology26.withUTC();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology38 = chronology36.withZone(dateTimeZone37);
        java.util.TimeZone timeZone39 = dateTimeZone37.toTimeZone();
        java.lang.String str40 = dateTimeZone37.toString();
        org.joda.time.Chronology chronology41 = chronology14.withZone(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField16", Math.signum(durationField10.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField10)));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        int int6 = dateTimeZone0.getOffsetFromLocal(100L);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.lang.String str11 = locale10.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale10, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.days();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.year();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter19.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str23 = dateTimeZone21.getName((long) 2000);
        boolean boolean24 = dateTimeZone21.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter19.withZone(dateTimeZone21);
        org.joda.time.Chronology chronology26 = chronology15.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.hourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology26.eras();
        boolean boolean29 = dateTimeZone0.equals((java.lang.Object) durationField28);
        java.lang.Object obj30 = null;
        boolean boolean31 = dateTimeZone0.equals(obj30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField28", Math.signum(durationField16.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField16)));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffset((long) (short) 0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        boolean boolean20 = dateTimeZone0.equals((java.lang.Object) chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.yearOfEra();
        long long26 = chronology17.add(1342L, 0L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField27 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str30 = dateTimeZone28.getName((long) 2000);
        long long32 = dateTimeZone28.nextTransition((long) 'a');
        boolean boolean33 = dateTimeZone28.isFixed();
        int int35 = dateTimeZone28.getOffset(40L);
        java.lang.String str36 = dateTimeZone28.getID();
        org.joda.time.Chronology chronology37 = chronology17.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField38 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField39 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField39", (durationField19.compareTo(durationField39) == 0) == durationField19.equals(durationField39));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale15.toLanguageTag();
        java.lang.String str17 = locale15.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology9, locale15);
        org.joda.time.DateTimeField dateTimeField19 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.centuryOfEra();
        org.joda.time.DurationField durationField21 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField21", Math.signum(durationField10.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField10)));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField16 = chronology9.eras();
        org.joda.time.DurationField durationField17 = chronology9.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField17, and durationField16", !(durationField16.compareTo(durationField17) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField17.compareTo(durationField16))));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        long long11 = dateTimeParserBucket7.computeMillis(true, "hi!");
        java.util.Locale locale12 = dateTimeParserBucket7.getLocale();
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 0);
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 1);
        long long17 = dateTimeParserBucket7.computeMillis();
        dateTimeParserBucket7.setOffset((int) (byte) 0);
        java.lang.Integer int20 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.Chronology chronology21 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = chronology21.millis();
        org.joda.time.DurationField durationField24 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField26 = chronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField23, and durationField24", !(durationField26.compareTo(durationField23) == 0) || (Math.signum(durationField26.compareTo(durationField24)) == Math.signum(durationField23.compareTo(durationField24))));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology9 = chronology8.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology9.years();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology9.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField12", (durationField10.compareTo(durationField12) == 0) == durationField10.equals(durationField12));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        long long17 = chronology8.getDateTimeMillis((int) (short) 1, (int) (byte) 10, (int) (byte) 10, (int) (short) 1);
        org.joda.time.DurationField durationField18 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField20 = chronology8.hours();
        org.joda.time.DurationField durationField21 = chronology8.weekyears();
        java.lang.String str22 = chronology8.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField21", (durationField18.compareTo(durationField21) == 0) == durationField18.equals(durationField21));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket7.getZone();
        java.lang.Object obj10 = null;
        boolean boolean11 = dateTimeParserBucket7.restoreState(obj10);
        long long13 = dateTimeParserBucket7.computeMillis(true);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket7.getChronology();
        java.lang.String str15 = chronology14.toString();
        org.joda.time.DurationField durationField16 = chronology14.minutes();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology14.halfdays();
        org.joda.time.DurationField durationField19 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField16, and durationField18", !(durationField19.compareTo(durationField16) == 0) || (Math.signum(durationField19.compareTo(durationField18)) == Math.signum(durationField16.compareTo(durationField18))));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder8.setExtension('a', "en-US");
        java.util.Locale.Builder builder13 = builder11.setLanguageTag("it");
        java.util.Locale locale14 = builder11.build();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter5.withLocale(locale14);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale19 = new java.util.Locale("hi!");
        java.lang.String str20 = locale19.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology17, locale19, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology24 = dateTimeParserBucket23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.days();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.year();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology24.era();
        org.joda.time.DateTimeField dateTimeField29 = chronology24.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = chronology24.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter15.withChronology(chronology24);
        org.joda.time.DurationField durationField32 = chronology24.years();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        long long36 = dateTimeZone33.adjustOffset((long) 0, true);
        java.lang.String str38 = dateTimeZone33.getNameKey((long) (-1));
        boolean boolean39 = dateTimeZone33.isFixed();
        int int41 = dateTimeZone33.getOffset((long) (short) 0);
        long long44 = dateTimeZone33.convertLocalToUTC(0L, true);
        long long47 = dateTimeZone33.adjustOffset((long) (short) 1, true);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        long long51 = dateTimeZone48.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone52 = dateTimeZone48.toTimeZone();
        int int54 = dateTimeZone48.getOffsetFromLocal(100L);
        long long56 = dateTimeZone48.nextTransition((long) ' ');
        long long58 = dateTimeZone33.getMillisKeepLocal(dateTimeZone48, (long) 40);
        long long60 = dateTimeZone33.previousTransition((long) 100);
        java.util.TimeZone timeZone61 = dateTimeZone33.toTimeZone();
        org.joda.time.Chronology chronology62 = chronology24.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField63 = chronology62.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField63, durationField25, and durationField32", !(durationField63.compareTo(durationField25) == 0) || (Math.signum(durationField63.compareTo(durationField32)) == Math.signum(durationField25.compareTo(durationField32))));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        long long11 = dateTimeParserBucket7.computeMillis(true, "hi!");
        java.util.Locale locale12 = dateTimeParserBucket7.getLocale();
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 0);
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter17.withOffsetParsed();
        java.util.Locale.Category category19 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.util.Locale locale21 = java.util.Locale.TAIWAN;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getName((long) 2000);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale31 = new java.util.Locale("hi!");
        java.lang.String str32 = locale31.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale31, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int36 = dateTimeParserBucket35.getPivotYear();
        long long39 = dateTimeParserBucket35.computeMillis(true, "hi!");
        java.util.Locale locale40 = dateTimeParserBucket35.getLocale();
        java.lang.String str41 = dateTimeZone23.getShortName(0L, locale40);
        java.lang.String str42 = locale20.getDisplayName(locale40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter17.withLocale(locale40);
        boolean boolean44 = dateTimeParserBucket7.restoreState((java.lang.Object) locale40);
        java.io.IOException iOException46 = new java.io.IOException("hi!");
        java.lang.Throwable[] throwableArray47 = iOException46.getSuppressed();
        boolean boolean48 = dateTimeParserBucket7.restoreState((java.lang.Object) iOException46);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket7.getChronology();
        java.lang.String str50 = chronology49.toString();
        org.joda.time.DurationField durationField51 = chronology49.weekyears();
        org.joda.time.DurationField durationField52 = chronology49.centuries();
        org.joda.time.DurationField durationField53 = chronology49.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField51, and durationField52", !(durationField53.compareTo(durationField51) == 0) || (Math.signum(durationField53.compareTo(durationField52)) == Math.signum(durationField51.compareTo(durationField52))));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        long long16 = chronology8.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology8.months();
        org.joda.time.DurationField durationField19 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.millisOfDay();
        org.joda.time.DurationField durationField21 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField9, and durationField18", !(durationField21.compareTo(durationField9) == 0) || (Math.signum(durationField21.compareTo(durationField18)) == Math.signum(durationField9.compareTo(durationField18))));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.adjustOffset((long) 0, true);
        java.lang.String str11 = dateTimeZone6.getNameKey((long) (-1));
        boolean boolean12 = dateTimeZone6.isFixed();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str21 = locale14.getDisplayCountry(locale17);
        java.lang.String str22 = dateTimeZone6.getName((long) (short) 100, locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withDefaultYear((-53));
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale31 = new java.util.Locale("hi!");
        java.lang.String str32 = locale31.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale31, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        java.util.Locale locale38 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology36, locale38, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField41 = chronology36.weekyearOfCentury();
        org.joda.time.DurationField durationField42 = chronology36.months();
        org.joda.time.DurationField durationField43 = chronology36.years();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        long long47 = dateTimeZone44.adjustOffset((long) 0, true);
        java.lang.String str49 = dateTimeZone44.getNameKey((long) (-1));
        java.lang.String str51 = dateTimeZone44.getNameKey((long) 0);
        boolean boolean53 = dateTimeZone44.isStandardOffset((long) ' ');
        java.lang.String str54 = dateTimeZone44.getID();
        java.util.Locale locale56 = new java.util.Locale("hi!");
        boolean boolean57 = dateTimeZone44.equals((java.lang.Object) locale56);
        boolean boolean59 = dateTimeZone44.isStandardOffset((long) (-121));
        org.joda.time.Chronology chronology60 = chronology36.withZone(dateTimeZone44);
        org.joda.time.DurationField durationField61 = chronology60.weekyears();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter26.withChronology(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField61", (durationField43.compareTo(durationField61) == 0) == durationField43.equals(durationField61));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.monthOfYear();
        org.joda.time.DurationField durationField14 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.dayOfMonth();
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology20, locale21, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str25 = locale18.getDisplayCountry(locale21);
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale18.getDisplayLanguage(locale26);
        java.lang.String str28 = locale18.getCountry();
        java.util.Locale.setDefault(locale18);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale35 = new java.util.Locale("hi!");
        java.lang.String str36 = locale35.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(0L, chronology33, locale35, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        java.util.Locale locale42 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology40, locale42, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField45 = chronology40.weekyearOfCentury();
        org.joda.time.DurationField durationField46 = chronology40.months();
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale50.toLanguageTag();
        java.util.Locale locale53 = new java.util.Locale("hi!");
        java.lang.String str54 = locale53.getDisplayCountry();
        java.lang.String str55 = locale53.toLanguageTag();
        java.lang.String str56 = locale50.getDisplayName(locale53);
        java.lang.String str57 = locale48.getDisplayCountry(locale53);
        java.lang.String str58 = locale47.getDisplayScript(locale48);
        java.util.Locale.Category category59 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale60 = java.util.Locale.getDefault(category59);
        java.util.Locale locale61 = java.util.Locale.TAIWAN;
        java.lang.String str62 = locale60.getDisplayVariant(locale61);
        java.lang.String str63 = locale47.getDisplayName(locale61);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) 2000, chronology40, locale47, (java.lang.Integer) 0, (int) 'x');
        java.util.Locale locale70 = new java.util.Locale("UTC", "1/1/70", "it");
        java.lang.String str71 = locale70.getCountry();
        java.util.Locale locale73 = new java.util.Locale("eng");
        java.util.Locale locale74 = locale73.stripExtensions();
        java.lang.String str75 = locale73.getDisplayCountry();
        java.lang.String str76 = locale70.getDisplayScript(locale73);
        java.lang.String str77 = locale47.getDisplayName(locale73);
        java.util.Locale.Category category78 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale79 = java.util.Locale.getDefault(category78);
        java.util.Locale locale80 = java.util.Locale.TAIWAN;
        java.lang.String str81 = locale79.getDisplayVariant(locale80);
        java.util.Set<java.lang.String> strSet82 = locale80.getUnicodeLocaleAttributes();
        java.lang.String str83 = locale47.getDisplayName(locale80);
        java.lang.String str84 = locale18.getDisplayLanguage(locale80);
        java.lang.String str85 = locale18.getScript();
        java.util.Locale.setDefault(locale18);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket89 = new org.joda.time.format.DateTimeParserBucket((-144060040L), chronology9, locale18, (java.lang.Integer) (-187200001), (-36000001));
        org.joda.time.DurationField durationField90 = chronology9.months();
        org.joda.time.DurationField durationField91 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField91, durationField14, and durationField46", !(durationField91.compareTo(durationField14) == 0) || (Math.signum(durationField91.compareTo(durationField46)) == Math.signum(durationField14.compareTo(durationField46))));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology9 = chronology8.withUTC();
        org.joda.time.Chronology chronology10 = chronology8.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DurationField durationField12 = chronology10.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.millis();
        long long18 = chronology9.add((long) (byte) 100, (long) (byte) 1, 0);
        org.joda.time.DateTimeField dateTimeField19 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField22", Math.signum(durationField14.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField14)));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.util.Locale locale17 = java.util.Locale.getDefault(category15);
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology20, locale21, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str25 = locale18.getDisplayCountry(locale21);
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale18.getDisplayLanguage(locale26);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology29, locale30, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str34 = locale30.toLanguageTag();
        java.lang.String str35 = locale18.getDisplayCountry(locale30);
        java.util.Locale.setDefault(category15, locale18);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getName((long) 2000);
        boolean boolean40 = dateTimeZone37.isFixed();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale45 = new java.util.Locale("hi!");
        java.lang.String str46 = locale45.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology43, locale45, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int50 = dateTimeParserBucket49.getPivotYear();
        long long53 = dateTimeParserBucket49.computeMillis(true, "hi!");
        java.util.Locale locale54 = dateTimeParserBucket49.getLocale();
        java.lang.String str55 = dateTimeZone37.getShortName(0L, locale54);
        java.lang.String str56 = locale54.getDisplayCountry();
        java.util.Locale.setDefault(category15, locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((-359999990L), chronology9, locale54, (java.lang.Integer) 40);
        org.joda.time.DateTimeField dateTimeField60 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField61 = chronology9.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField61, and durationField14", !(durationField14.compareTo(durationField61) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField61.compareTo(durationField14))));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        long long11 = dateTimeParserBucket7.computeMillis(true, "hi!");
        java.util.Locale locale12 = dateTimeParserBucket7.getLocale();
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 0);
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter17.withOffsetParsed();
        java.util.Locale.Category category19 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.util.Locale locale21 = java.util.Locale.TAIWAN;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getName((long) 2000);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale31 = new java.util.Locale("hi!");
        java.lang.String str32 = locale31.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale31, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int36 = dateTimeParserBucket35.getPivotYear();
        long long39 = dateTimeParserBucket35.computeMillis(true, "hi!");
        java.util.Locale locale40 = dateTimeParserBucket35.getLocale();
        java.lang.String str41 = dateTimeZone23.getShortName(0L, locale40);
        java.lang.String str42 = locale20.getDisplayName(locale40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter17.withLocale(locale40);
        boolean boolean44 = dateTimeParserBucket7.restoreState((java.lang.Object) locale40);
        java.io.IOException iOException46 = new java.io.IOException("hi!");
        java.lang.Throwable[] throwableArray47 = iOException46.getSuppressed();
        boolean boolean48 = dateTimeParserBucket7.restoreState((java.lang.Object) iOException46);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket7.getChronology();
        java.lang.String str50 = chronology49.toString();
        org.joda.time.DurationField durationField51 = chronology49.eras();
        org.joda.time.DurationField durationField52 = chronology49.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField51, durationField52, and durationField51", !(durationField51.compareTo(durationField52) == 0) || (Math.signum(durationField51.compareTo(durationField51)) == Math.signum(durationField52.compareTo(durationField51))));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.centuryOfEra();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField14", Math.signum(durationField10.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField10)));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        long long17 = chronology8.getDateTimeMillis((int) (short) 1, (int) (byte) 10, (int) (byte) 10, (int) (short) 1);
        org.joda.time.DurationField durationField18 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField20 = chronology8.hours();
        org.joda.time.DurationField durationField21 = chronology8.weekyears();
        long long25 = chronology8.add(59191199932L, 3599900L, 3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField21", (durationField18.compareTo(durationField21) == 0) == durationField18.equals(durationField21));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter8.withChronology(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.minuteOfHour();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.lang.String str30 = locale29.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale29, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int34 = dateTimeParserBucket33.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket33.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeParserBucket33.getZone();
        java.lang.String str37 = dateTimeZone36.toString();
        int int39 = dateTimeZone36.getOffsetFromLocal(0L);
        org.joda.time.Chronology chronology40 = chronology17.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField41 = chronology40.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        long long45 = dateTimeZone42.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone46 = dateTimeZone42.toTimeZone();
        int int48 = dateTimeZone42.getOffsetFromLocal(100L);
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.lang.String str53 = locale52.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(0L, chronology50, locale52, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology57 = dateTimeParserBucket56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.days();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.year();
        org.joda.time.DateTimeField dateTimeField60 = chronology57.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter61.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str65 = dateTimeZone63.getName((long) 2000);
        boolean boolean66 = dateTimeZone63.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter61.withZone(dateTimeZone63);
        org.joda.time.Chronology chronology68 = chronology57.withZone(dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField69 = chronology68.hourOfHalfday();
        org.joda.time.DurationField durationField70 = chronology68.eras();
        boolean boolean71 = dateTimeZone42.equals((java.lang.Object) durationField70);
        org.joda.time.Chronology chronology72 = chronology40.withZone(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField70", Math.signum(durationField21.compareTo(durationField70)) == -Math.signum(durationField70.compareTo(durationField21)));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField15 = chronology8.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField15, and durationField13", !(durationField13.compareTo(durationField15) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField15.compareTo(durationField13))));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter8.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withPivotYear((int) (short) 100);
        boolean boolean25 = dateTimeFormatter24.isParser();
        org.joda.time.Chronology chronology26 = dateTimeFormatter24.getChronolgy();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale30 = new java.util.Locale("hi!");
        java.lang.String str31 = locale30.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale30, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.days();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.year();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.millisOfDay();
        org.joda.time.DateTimeField dateTimeField39 = chronology35.era();
        org.joda.time.DateTimeField dateTimeField40 = chronology35.clockhourOfHalfday();
        org.joda.time.Chronology chronology41 = chronology35.withUTC();
        org.joda.time.DateTimeField dateTimeField42 = chronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology35.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField44 = chronology35.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField45 = chronology35.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField46 = chronology35.halfdayOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter24.withChronology(chronology35);
        boolean boolean48 = dateTimeFormatter24.isPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter49 = dateTimeFormatter24.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter51.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter51.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeFormatter54.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter56 = dateTimeFormatter54.getPrinter();
        int int57 = dateTimePrinter56.estimatePrintedLength();
        int int58 = dateTimePrinter56.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter59.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter59.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter62.withChronology(chronology63);
        org.joda.time.format.DateTimePrinter dateTimePrinter65 = dateTimeFormatter64.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser66 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter65, dateTimeParser66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter68.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser70 = dateTimeFormatter68.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter65, dateTimeParser70);
        org.joda.time.format.DateTimeParser dateTimeParser72 = dateTimeFormatter71.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter56, dateTimeParser72);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter50, dateTimeParser72);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter49, dateTimeParser72);
        org.joda.time.Chronology chronology77 = null;
        java.util.Locale locale79 = new java.util.Locale("hi!");
        java.lang.String str80 = locale79.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket83 = new org.joda.time.format.DateTimeParserBucket(0L, chronology77, locale79, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology84 = dateTimeParserBucket83.getChronology();
        org.joda.time.DateTimeField dateTimeField85 = chronology84.weekyear();
        org.joda.time.DateTimeField dateTimeField86 = chronology84.monthOfYear();
        org.joda.time.DateTimeField dateTimeField87 = chronology84.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField88 = chronology84.yearOfCentury();
        org.joda.time.DurationField durationField89 = chronology84.eras();
        org.joda.time.DateTimeField dateTimeField90 = chronology84.millisOfDay();
        org.joda.time.DateTimeField dateTimeField91 = chronology84.dayOfYear();
        org.joda.time.DateTimeField dateTimeField92 = chronology84.yearOfEra();
        org.joda.time.DateTimeField dateTimeField93 = chronology84.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField94 = chronology84.dayOfWeek();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter95 = dateTimeFormatter75.withChronology(chronology84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField36 and durationField89", Math.signum(durationField36.compareTo(durationField89)) == -Math.signum(durationField89.compareTo(durationField36)));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.days();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField21 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField14, and durationField15", !(durationField21.compareTo(durationField14) == 0) || (Math.signum(durationField21.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DurationField durationField11 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.year();
        org.joda.time.DurationField durationField14 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        long long22 = dateTimeZone19.adjustOffset((long) 0, true);
        java.lang.String str23 = dateTimeZone19.toString();
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder28 = builder25.setExtension('a', "en-US");
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        java.util.Locale.Builder builder31 = builder30.clear();
        java.util.Locale.Builder builder32 = builder31.clearExtensions();
        java.util.Locale.Builder builder35 = builder31.setExtension('a', "it");
        java.util.Locale locale36 = builder35.build();
        java.lang.String str37 = dateTimeZone19.getShortName((long) (short) 1, locale36);
        java.util.Set<java.lang.String> strSet38 = locale36.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder39.setExtension('a', "en-US");
        java.util.Locale.Builder builder43 = builder42.clearExtensions();
        java.util.Locale locale44 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology46, locale47, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str51 = locale44.getDisplayCountry(locale47);
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        java.lang.String str53 = locale44.getDisplayLanguage(locale52);
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale56 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology55, locale56, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str60 = locale56.toLanguageTag();
        java.lang.String str61 = locale44.getDisplayCountry(locale56);
        java.util.Locale.Builder builder62 = builder42.setLocale(locale56);
        java.lang.String str63 = locale36.getDisplayVariant(locale56);
        java.util.Locale locale64 = locale56.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((-115259999L), chronology9, locale56, (java.lang.Integer) (-33));
        java.util.Locale locale67 = dateTimeParserBucket66.getLocale();
        org.joda.time.Chronology chronology68 = dateTimeParserBucket66.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField69, durationField11, and durationField14", !(durationField69.compareTo(durationField11) == 0) || (Math.signum(durationField69.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 1);
        int int3 = dateTimeFormatter0.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        long long7 = dateTimeZone4.adjustOffset((long) 0, true);
        java.lang.String str9 = dateTimeZone4.getNameKey((long) (-1));
        boolean boolean10 = dateTimeZone4.isFixed();
        int int12 = dateTimeZone4.getOffset((long) (short) 0);
        long long15 = dateTimeZone4.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone16 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter0.withZone(dateTimeZone17);
        org.joda.time.Chronology chronology19 = dateTimeFormatter0.getChronolgy();
        boolean boolean20 = dateTimeFormatter0.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 1969);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withChronology(chronology27);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = dateTimeFormatter28.getPrinter();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter28.withChronology(chronology30);
        boolean boolean32 = dateTimeFormatter28.isPrinter();
        int int33 = dateTimeFormatter28.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser34 = dateTimeFormatter28.getParser();
        boolean boolean35 = dateTimeFormatter28.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter28.withDefaultYear((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (byte) 0);
        java.lang.String str42 = dateTimeZone40.getShortName(10L);
        long long45 = dateTimeZone40.adjustOffset((long) (short) 10, false);
        boolean boolean47 = dateTimeZone40.isStandardOffset((-52L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter28.withZone(dateTimeZone40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter0.withZone(dateTimeZone40);
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.lang.String str55 = locale54.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket(0L, chronology52, locale54, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology59 = dateTimeParserBucket58.getChronology();
        java.util.Locale locale61 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology59, locale61, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.Chronology chronology65 = chronology59.withZone(dateTimeZone64);
        org.joda.time.DateTimeZone dateTimeZone66 = chronology65.getZone();
        org.joda.time.DateTimeField dateTimeField67 = chronology65.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.year();
        org.joda.time.DurationField durationField69 = chronology65.centuries();
        org.joda.time.Chronology chronology70 = chronology65.withUTC();
        org.joda.time.DurationField durationField71 = chronology65.weekyears();
        org.joda.time.DateTimeField dateTimeField72 = chronology65.secondOfDay();
        org.joda.time.DateTimeField dateTimeField73 = chronology65.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter0.withChronology(chronology65);
        org.joda.time.Chronology chronology76 = null;
        java.util.Locale locale78 = new java.util.Locale("hi!");
        java.lang.String str79 = locale78.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket82 = new org.joda.time.format.DateTimeParserBucket(0L, chronology76, locale78, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology83 = dateTimeParserBucket82.getChronology();
        long long85 = dateTimeParserBucket82.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone86 = dateTimeParserBucket82.getZone();
        int int88 = dateTimeZone86.getOffset(0L);
        java.lang.String str90 = dateTimeZone86.getName(100L);
        org.joda.time.Chronology chronology91 = chronology65.withZone(dateTimeZone86);
        org.joda.time.DurationField durationField92 = chronology91.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField92, durationField69, and durationField71", !(durationField92.compareTo(durationField69) == 0) || (Math.signum(durationField92.compareTo(durationField71)) == Math.signum(durationField69.compareTo(durationField71))));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology8.getZone();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale20 = new java.util.Locale("hi!");
        java.lang.String str21 = locale20.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale20, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        java.util.Locale locale27 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology25, locale27, (java.lang.Integer) 10);
        int int30 = dateTimeParserBucket29.getOffset();
        java.util.Locale locale31 = dateTimeParserBucket29.getLocale();
        long long32 = dateTimeParserBucket29.computeMillis();
        java.util.Locale locale33 = dateTimeParserBucket29.getLocale();
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeParserBucket29.getZone();
        dateTimeParserBucket29.setOffset((int) 'u');
        dateTimeParserBucket29.setOffset((-41));
        long long41 = dateTimeParserBucket29.computeMillis(false, "ZH-CN");
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeParserBucket29.getZone();
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale48 = new java.util.Locale("hi!");
        java.lang.String str49 = locale48.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(0L, chronology46, locale48, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology53 = dateTimeParserBucket52.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.days();
        long long58 = chronology53.add((long) 1, 100L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField59 = chronology53.secondOfDay();
        org.joda.time.DateTimeField dateTimeField60 = chronology53.minuteOfDay();
        org.joda.time.DurationField durationField61 = chronology53.seconds();
        java.util.Locale locale65 = new java.util.Locale("English (United States)", "und", "en-US");
        java.lang.String str66 = locale65.getDisplayName();
        java.lang.String str67 = locale65.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology53, locale65, (java.lang.Integer) 0, (int) '4');
        int int71 = dateTimeParserBucket70.getOffset();
        dateTimeParserBucket70.setPivotYear((java.lang.Integer) (-41));
        dateTimeParserBucket70.setOffset((java.lang.Integer) 0);
        java.util.Locale locale76 = dateTimeParserBucket70.getLocale();
        java.lang.String str77 = dateTimeZone42.getName((-99L), locale76);
        org.joda.time.Chronology chronology78 = chronology8.withZone(dateTimeZone42);
        org.joda.time.DurationField durationField79 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField79, durationField54, and durationField61", !(durationField79.compareTo(durationField54) == 0) || (Math.signum(durationField79.compareTo(durationField61)) == Math.signum(durationField54.compareTo(durationField61))));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DurationField durationField13 = chronology8.halfdays();
        org.joda.time.DurationField durationField14 = chronology8.minutes();
        org.joda.time.DurationField durationField15 = chronology8.seconds();
        java.lang.String str16 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField21 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField9, and durationField13", !(durationField21.compareTo(durationField9) == 0) || (Math.signum(durationField21.compareTo(durationField13)) == Math.signum(durationField9.compareTo(durationField13))));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.DurationField durationField15 = chronology13.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology13.getZone();
        org.joda.time.DurationField durationField17 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField9, and durationField15", !(durationField17.compareTo(durationField9) == 0) || (Math.signum(durationField17.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(2000);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear((-1));
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale11 = new java.util.Locale("hi!");
        java.lang.String str12 = locale11.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology9, locale11, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        java.util.Locale locale18 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology16, locale18, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Chronology chronology22 = chronology16.withZone(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter3.withChronology(chronology22);
        org.joda.time.DurationField durationField27 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology22.year();
        org.joda.time.DurationField durationField29 = chronology22.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField29, and durationField27", !(durationField27.compareTo(durationField29) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField29.compareTo(durationField27))));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField13 = chronology8.months();
        org.joda.time.DurationField durationField14 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.dayOfMonth();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField13", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField13)) == Math.signum(durationField9.compareTo(durationField13))));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        long long16 = chronology8.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology8.months();
        org.joda.time.DurationField durationField19 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.weekyear();
        org.joda.time.DurationField durationField21 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField9, and durationField18", !(durationField21.compareTo(durationField9) == 0) || (Math.signum(durationField21.compareTo(durationField18)) == Math.signum(durationField9.compareTo(durationField18))));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology10.add(readablePeriod15, (long) '#', (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField19 = chronology10.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology10.getZone();
        org.joda.time.Chronology chronology21 = chronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.year();
        org.joda.time.DurationField durationField23 = chronology21.years();
        java.util.Locale locale27 = new java.util.Locale("+00:00:00.035", "", "");
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(1045740114L, chronology21, locale27);
        org.joda.time.DurationField durationField30 = chronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = chronology21.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField30", (durationField23.compareTo(durationField30) == 0) == durationField23.equals(durationField30));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.minuteOfHour();
        org.joda.time.DurationField durationField18 = chronology9.days();
        java.util.Locale locale20 = new java.util.Locale("eng");
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale20.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology9, locale20, (java.lang.Integer) (-41), (-1));
        org.joda.time.DateTimeField dateTimeField26 = chronology9.minuteOfHour();
        org.joda.time.DurationField durationField27 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField10, and durationField16", !(durationField27.compareTo(durationField10) == 0) || (Math.signum(durationField27.compareTo(durationField16)) == Math.signum(durationField10.compareTo(durationField16))));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.joda.time.DurationField durationField16 = chronology8.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField15", Math.signum(durationField9.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField9)));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DurationField durationField13 = chronology8.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField12", Math.signum(durationField10.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField10)));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.millis();
        org.joda.time.DurationField durationField15 = chronology9.minutes();
        org.joda.time.DurationField durationField16 = chronology9.hours();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        long long20 = dateTimeZone17.adjustOffset((long) 0, true);
        java.lang.String str22 = dateTimeZone17.getNameKey((long) (-1));
        boolean boolean23 = dateTimeZone17.isFixed();
        int int25 = dateTimeZone17.getOffset((long) (short) 0);
        long long28 = dateTimeZone17.convertLocalToUTC(0L, true);
        long long31 = dateTimeZone17.adjustOffset((long) (short) 1, true);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        long long35 = dateTimeZone32.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone36 = dateTimeZone32.toTimeZone();
        int int38 = dateTimeZone32.getOffsetFromLocal(100L);
        long long40 = dateTimeZone32.nextTransition((long) ' ');
        long long42 = dateTimeZone17.getMillisKeepLocal(dateTimeZone32, (long) 40);
        long long44 = dateTimeZone17.previousTransition((long) 100);
        java.util.TimeZone timeZone45 = dateTimeZone17.toTimeZone();
        org.joda.time.Chronology chronology46 = chronology9.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.dayOfYear();
        org.joda.time.DurationField durationField48 = chronology46.years();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.Chronology chronology50 = chronology46.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.monthOfYear();
        org.joda.time.DurationField durationField53 = chronology50.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField14, and durationField15", !(durationField53.compareTo(durationField14) == 0) || (Math.signum(durationField53.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.halfdayOfDay();
        org.joda.time.DurationField durationField16 = chronology9.centuries();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology9.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.monthOfYear();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale26 = new java.util.Locale("hi!");
        java.lang.String str27 = locale26.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale26, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology31 = dateTimeParserBucket30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.monthOfYear();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology31.eras();
        java.util.Locale.Category category37 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale38 = java.util.Locale.getDefault(category37);
        java.util.Locale locale39 = java.util.Locale.getDefault(category37);
        java.util.Locale locale40 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology42, locale43, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str47 = locale40.getDisplayCountry(locale43);
        java.util.Locale locale48 = java.util.Locale.ITALIAN;
        java.lang.String str49 = locale40.getDisplayLanguage(locale48);
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology51, locale52, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str56 = locale52.toLanguageTag();
        java.lang.String str57 = locale40.getDisplayCountry(locale52);
        java.util.Locale.setDefault(category37, locale40);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str61 = dateTimeZone59.getName((long) 2000);
        boolean boolean62 = dateTimeZone59.isFixed();
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale67 = new java.util.Locale("hi!");
        java.lang.String str68 = locale67.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket(0L, chronology65, locale67, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int72 = dateTimeParserBucket71.getPivotYear();
        long long75 = dateTimeParserBucket71.computeMillis(true, "hi!");
        java.util.Locale locale76 = dateTimeParserBucket71.getLocale();
        java.lang.String str77 = dateTimeZone59.getShortName(0L, locale76);
        java.lang.String str78 = locale76.getDisplayCountry();
        java.util.Locale.setDefault(category37, locale76);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((-359999990L), chronology31, locale76, (java.lang.Integer) 40);
        java.lang.Object obj82 = dateTimeParserBucket81.saveState();
        java.util.Locale locale83 = dateTimeParserBucket81.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket85 = new org.joda.time.format.DateTimeParserBucket(47280001L, chronology9, locale83, (java.lang.Integer) 115260000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField36", Math.signum(durationField10.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField10)));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int8 = dateTimeParserBucket7.getPivotYear();
        long long11 = dateTimeParserBucket7.computeMillis(true, "hi!");
        java.util.Locale locale12 = dateTimeParserBucket7.getLocale();
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 0);
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter17.withOffsetParsed();
        java.util.Locale.Category category19 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.util.Locale locale21 = java.util.Locale.TAIWAN;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getName((long) 2000);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale31 = new java.util.Locale("hi!");
        java.lang.String str32 = locale31.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale31, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int36 = dateTimeParserBucket35.getPivotYear();
        long long39 = dateTimeParserBucket35.computeMillis(true, "hi!");
        java.util.Locale locale40 = dateTimeParserBucket35.getLocale();
        java.lang.String str41 = dateTimeZone23.getShortName(0L, locale40);
        java.lang.String str42 = locale20.getDisplayName(locale40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter17.withLocale(locale40);
        boolean boolean44 = dateTimeParserBucket7.restoreState((java.lang.Object) locale40);
        java.io.IOException iOException46 = new java.io.IOException("hi!");
        java.lang.Throwable[] throwableArray47 = iOException46.getSuppressed();
        boolean boolean48 = dateTimeParserBucket7.restoreState((java.lang.Object) iOException46);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket7.getChronology();
        java.lang.Integer int50 = dateTimeParserBucket7.getOffsetInteger();
        int int51 = dateTimeParserBucket7.getOffset();
        long long54 = dateTimeParserBucket7.computeMillis(true, "java.io.IOException: hi!");
        int int55 = dateTimeParserBucket7.getOffset();
        org.joda.time.Chronology chronology57 = null;
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.lang.String str60 = locale59.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket(0L, chronology57, locale59, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology64 = dateTimeParserBucket63.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.days();
        org.joda.time.DurationField durationField66 = chronology64.weekyears();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.year();
        org.joda.time.DurationField durationField68 = chronology64.years();
        boolean boolean69 = dateTimeParserBucket7.restoreState((java.lang.Object) durationField68);
        org.joda.time.DateTimeZone dateTimeZone70 = dateTimeParserBucket7.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField66 and durationField68", (durationField66.compareTo(durationField68) == 0) == durationField66.equals(durationField68));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Chronology chronology16 = chronology10.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = chronology16.days();
        java.lang.String str18 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.yearOfCentury();
        org.joda.time.Chronology chronology22 = chronology16.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withChronology(chronology27);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = dateTimeFormatter28.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter30.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str34 = dateTimeZone32.getName((long) 2000);
        boolean boolean35 = dateTimeZone32.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter30.withZone(dateTimeZone32);
        org.joda.time.format.DateTimeParser dateTimeParser37 = dateTimeFormatter30.getParser();
        int int38 = dateTimeParser37.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter39.withDefaultYear(10);
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale45 = new java.util.Locale("hi!");
        java.lang.String str46 = locale45.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology43, locale45, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology50 = dateTimeParserBucket49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.days();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.year();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.millisOfDay();
        org.joda.time.DateTimeField dateTimeField54 = chronology50.halfdayOfDay();
        long long58 = chronology50.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField59 = chronology50.clockhourOfDay();
        org.joda.time.DurationField durationField60 = chronology50.months();
        org.joda.time.DateTimeZone dateTimeZone61 = chronology50.getZone();
        long long64 = dateTimeZone61.adjustOffset((-1L), false);
        org.joda.time.LocalDateTime localDateTime65 = null;
        boolean boolean66 = dateTimeZone61.isLocalDateTimeGap(localDateTime65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter41.withZone(dateTimeZone61);
        java.util.Locale locale68 = dateTimeFormatter41.getLocale();
        org.joda.time.DateTimeZone dateTimeZone69 = dateTimeFormatter41.getZone();
        java.util.Locale locale71 = java.util.Locale.forLanguageTag("FRA");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter41.withLocale(locale71);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket((-37L), chronology16, locale71, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField51", (durationField17.compareTo(durationField51) == 0) == durationField17.equals(durationField51));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology8.add(readablePeriod11, (long) (-1), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField16", Math.signum(durationField9.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField9)));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField17 = chronology8.eras();
        org.joda.time.DurationField durationField18 = chronology8.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology8.add(readablePeriod19, (-3152L), 187200000);
        org.joda.time.DateTimeZone dateTimeZone23 = chronology8.getZone();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = chronology8.add(readablePeriod24, 2000L, (int) (short) 0);
        org.joda.time.DurationField durationField28 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField30 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField9, and durationField28", !(durationField30.compareTo(durationField9) == 0) || (Math.signum(durationField30.compareTo(durationField28)) == Math.signum(durationField9.compareTo(durationField28))));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.year();
        org.joda.time.DurationField durationField13 = chronology8.centuries();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField19 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField10, and durationField13", !(durationField19.compareTo(durationField10) == 0) || (Math.signum(durationField19.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = chronology9.months();
        org.joda.time.DurationField durationField16 = chronology9.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        long long20 = dateTimeZone17.adjustOffset((long) 0, true);
        java.lang.String str22 = dateTimeZone17.getNameKey((long) (-1));
        java.lang.String str24 = dateTimeZone17.getNameKey((long) 0);
        boolean boolean26 = dateTimeZone17.isStandardOffset((long) ' ');
        java.lang.String str27 = dateTimeZone17.getID();
        java.util.Locale locale29 = new java.util.Locale("hi!");
        boolean boolean30 = dateTimeZone17.equals((java.lang.Object) locale29);
        boolean boolean32 = dateTimeZone17.isStandardOffset((long) (-121));
        org.joda.time.Chronology chronology33 = chronology9.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField34 = chronology33.weekyears();
        org.joda.time.DurationField durationField35 = chronology33.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField34", (durationField16.compareTo(durationField34) == 0) == durationField16.equals(durationField34));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.era();
        long long17 = chronology8.add((-59087318399900L), (-144059880L), (-36));
        org.joda.time.DurationField durationField18 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField18", Math.signum(durationField10.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField10)));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology10.months();
        org.joda.time.DurationField durationField17 = chronology10.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        long long21 = dateTimeZone18.adjustOffset((long) 0, true);
        java.lang.String str23 = dateTimeZone18.getNameKey((long) (-1));
        java.lang.String str25 = dateTimeZone18.getNameKey((long) 0);
        boolean boolean27 = dateTimeZone18.isStandardOffset((long) ' ');
        java.lang.String str28 = dateTimeZone18.getID();
        java.util.Locale locale30 = new java.util.Locale("hi!");
        boolean boolean31 = dateTimeZone18.equals((java.lang.Object) locale30);
        boolean boolean33 = dateTimeZone18.isStandardOffset((long) (-121));
        org.joda.time.Chronology chronology34 = chronology10.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.dayOfWeek();
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((-144060000L), chronology34, locale37, (java.lang.Integer) 117);
        org.joda.time.DateTimeField dateTimeField42 = chronology34.dayOfMonth();
        org.joda.time.DurationField durationField43 = chronology34.weekyears();
        org.joda.time.Chronology chronology44 = chronology34.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField43", (durationField17.compareTo(durationField43) == 0) == durationField17.equals(durationField43));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology8.halfdays();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DurationField durationField14 = chronology8.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField13", Math.signum(durationField10.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField10)));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology8.getZone();
        org.joda.time.DurationField durationField16 = chronology8.weeks();
        org.joda.time.Chronology chronology17 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField9, and durationField16", !(durationField20.compareTo(durationField9) == 0) || (Math.signum(durationField20.compareTo(durationField16)) == Math.signum(durationField9.compareTo(durationField16))));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField20 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology8.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField20", Math.signum(durationField9.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField9)));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.secondOfDay();
        java.util.Locale locale19 = new java.util.Locale("English (United States)", "und", "en-US");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology10, locale19, (java.lang.Integer) (-1));
        org.joda.time.DateTimeField dateTimeField22 = chronology10.weekyear();
        org.joda.time.DurationField durationField23 = chronology10.years();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale24, (java.lang.Integer) (-144060001), (-1));
        org.joda.time.DurationField durationField28 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField11, and durationField23", !(durationField28.compareTo(durationField11) == 0) || (Math.signum(durationField28.compareTo(durationField23)) == Math.signum(durationField11.compareTo(durationField23))));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology9.years();
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.lang.String str27 = locale19.getDisplayCountry();
        java.lang.String str28 = locale19.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-86397960L), chronology9, locale19);
        org.joda.time.Chronology chronology30 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        java.lang.String str32 = chronology30.toString();
        org.joda.time.DurationField durationField33 = chronology30.minutes();
        org.joda.time.DurationField durationField34 = chronology30.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField10, and durationField16", !(durationField34.compareTo(durationField10) == 0) || (Math.signum(durationField34.compareTo(durationField16)) == Math.signum(durationField10.compareTo(durationField16))));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.halfdayOfDay();
        long long17 = chronology9.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.monthOfYear();
        java.util.Locale.Category category20 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale25 = new java.util.Locale("hi!");
        java.lang.String str26 = locale25.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(0L, chronology23, locale25, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        java.util.Locale locale32 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology30, locale32, (java.lang.Integer) 10);
        java.util.Locale.setDefault(category20, locale32);
        java.util.Locale locale36 = java.util.Locale.getDefault(category20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology9, locale36, (java.lang.Integer) 2000, (int) ' ');
        org.joda.time.DateTimeField dateTimeField40 = chronology9.monthOfYear();
        org.joda.time.DurationField durationField41 = chronology9.centuries();
        java.lang.String str42 = chronology9.toString();
        org.joda.time.DurationField durationField43 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField10, and durationField41", !(durationField43.compareTo(durationField10) == 0) || (Math.signum(durationField43.compareTo(durationField41)) == Math.signum(durationField10.compareTo(durationField41))));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.year();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        long long18 = chronology13.add((-464399883L), (-41L), 0);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.monthOfYear();
        org.joda.time.DurationField durationField20 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology13.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField20", Math.signum(durationField9.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField9)));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.halfdayOfDay();
        long long18 = chronology10.add((long) (short) 1, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField19 = chronology10.clockhourOfDay();
        org.joda.time.DurationField durationField20 = chronology10.months();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology10.getZone();
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale23.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str27 = locale23.getDisplayVariant(locale26);
        java.util.Locale locale28 = locale23.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale23);
        java.util.Locale locale31 = new java.util.Locale("eng");
        java.util.Locale locale32 = locale31.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((-25L), chronology10, locale32);
        org.joda.time.DurationField durationField34 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField11, and durationField20", !(durationField34.compareTo(durationField11) == 0) || (Math.signum(durationField34.compareTo(durationField20)) == Math.signum(durationField11.compareTo(durationField20))));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField12", Math.signum(durationField10.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField10)));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfDay();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        long long16 = dateTimeZone13.adjustOffset((long) 0, true);
        java.lang.String str18 = dateTimeZone13.getNameKey((long) (-1));
        boolean boolean19 = dateTimeZone13.isFixed();
        int int21 = dateTimeZone13.getOffset((long) (short) 0);
        long long24 = dateTimeZone13.convertLocalToUTC(0L, true);
        long long27 = dateTimeZone13.convertLocalToUTC((long) 'u', false);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone13.getOffset(readableInstant28);
        org.joda.time.Chronology chronology30 = chronology8.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField31 = chronology8.weekyear();
        org.joda.time.DurationField durationField32 = chronology8.days();
        org.joda.time.DurationField durationField33 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField34 = chronology8.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField32 and durationField33", Math.signum(durationField32.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField32)));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField15 = chronology8.centuries();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField15", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffset((long) (short) 0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        boolean boolean20 = dateTimeZone0.equals((java.lang.Object) chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.yearOfEra();
        long long26 = chronology17.add(1342L, 0L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField27 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str30 = dateTimeZone28.getName((long) 2000);
        long long32 = dateTimeZone28.nextTransition((long) 'a');
        boolean boolean33 = dateTimeZone28.isFixed();
        int int35 = dateTimeZone28.getOffset(40L);
        java.lang.String str36 = dateTimeZone28.getID();
        org.joda.time.Chronology chronology37 = chronology17.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField38 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField39 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField39", (durationField19.compareTo(durationField39) == 0) == durationField19.equals(durationField39));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter1.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withChronology(chronology5);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter6.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale13, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter9.withChronology(chronology18);
        int int22 = dateTimeFormatter21.getDefaultYear();
        org.joda.time.Chronology chronology23 = dateTimeFormatter21.getChronolgy();
        org.joda.time.Chronology chronology24 = chronology23.withUTC();
        org.joda.time.DurationField durationField25 = chronology24.eras();
        java.util.Locale locale27 = new java.util.Locale("java.io.IOException: 70/01/01");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (-98), chronology24, locale27);
        org.joda.time.DurationField durationField29 = chronology24.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField29, and durationField25", !(durationField25.compareTo(durationField29) == 0) || (Math.signum(durationField25.compareTo(durationField25)) == Math.signum(durationField29.compareTo(durationField25))));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology9.halfdays();
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((-25L), chronology9, locale15, (java.lang.Integer) (-101));
        org.joda.time.DateTimeField dateTimeField19 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField20 = chronology9.eras();
        org.joda.time.Chronology chronology21 = chronology9.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField20", Math.signum(durationField11.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField11)));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getName((long) 2000);
        boolean boolean18 = dateTimeZone15.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter13.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology20 = chronology9.withZone(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology20.add(readablePeriod21, (long) (short) -1, 10);
        org.joda.time.DateTimeField dateTimeField25 = chronology20.centuryOfEra();
        org.joda.time.DurationField durationField26 = chronology20.weekyears();
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("TW");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((-346198000L), chronology20, locale28, (java.lang.Integer) (-13));
        org.joda.time.DurationField durationField31 = chronology20.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField10, and durationField26", !(durationField31.compareTo(durationField10) == 0) || (Math.signum(durationField31.compareTo(durationField26)) == Math.signum(durationField10.compareTo(durationField26))));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DurationField durationField11 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekyear();
        org.joda.time.DurationField durationField15 = chronology8.seconds();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-41), 10);
        org.joda.time.Chronology chronology20 = chronology8.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField21 = chronology20.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField21", (durationField10.compareTo(durationField21) == 0) == durationField10.equals(durationField21));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology9.halfdays();
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((-25L), chronology9, locale15, (java.lang.Integer) (-101));
        org.joda.time.DateTimeField dateTimeField19 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField20 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology9.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField20", Math.signum(durationField11.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField11)));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology9 = chronology8.withUTC();
        org.joda.time.Chronology chronology10 = chronology8.withUTC();
        org.joda.time.DurationField durationField11 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfYear();
        long long16 = chronology8.add((-59105793600100L), (long) (-115260001), (int) 'a');
        org.joda.time.DateTimeField dateTimeField17 = chronology8.millisOfDay();
        org.joda.time.DurationField durationField18 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField18", Math.signum(durationField11.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField11)));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField19 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.millisOfSecond();
        org.joda.time.DurationField durationField21 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField9, and durationField19", !(durationField21.compareTo(durationField9) == 0) || (Math.signum(durationField21.compareTo(durationField19)) == Math.signum(durationField9.compareTo(durationField19))));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField12 = chronology8.months();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField14", (durationField10.compareTo(durationField14) == 0) == durationField10.equals(durationField14));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfDay();
        java.util.Locale.Category category14 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.lang.String str17 = locale15.getDisplayVariant(locale16);
        java.lang.String str18 = locale16.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 40, chronology9, locale16);
        org.joda.time.DateTimeField dateTimeField20 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField21 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField24 = chronology9.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField23", Math.signum(durationField21.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField21)));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.era();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.dayOfYear();
        org.joda.time.DurationField durationField17 = chronology10.years();
        java.lang.String str18 = chronology10.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology10.minuteOfDay();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology22, locale23, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str27 = locale20.getDisplayCountry(locale23);
        java.lang.String str28 = locale20.getDisplayCountry();
        java.lang.String str29 = locale20.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((-86397960L), chronology10, locale20);
        org.joda.time.Chronology chronology31 = chronology10.withUTC();
        java.lang.String str32 = chronology31.toString();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.halfdayOfDay();
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.lang.String str39 = locale38.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology36, locale38, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology43 = dateTimeParserBucket42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.days();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.year();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.millisOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.millisOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology43.secondOfMinute();
        java.util.Locale locale51 = new java.util.Locale("United States", "hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(10L, chronology43, locale51, (java.lang.Integer) 0);
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale58 = new java.util.Locale("hi!");
        java.lang.String str59 = locale58.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(0L, chronology56, locale58, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology63 = dateTimeParserBucket62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.days();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.year();
        org.joda.time.DateTimeField dateTimeField66 = chronology63.weekyearOfCentury();
        org.joda.time.Chronology chronology67 = chronology63.withUTC();
        org.joda.time.DateTimeField dateTimeField68 = chronology63.yearOfEra();
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.toLanguageTag();
        java.lang.String str71 = locale69.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology63, locale69);
        java.util.Locale.Category category73 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale74 = java.util.Locale.getDefault(category73);
        java.util.Locale locale75 = java.util.Locale.TAIWAN;
        java.lang.String str76 = locale74.getDisplayVariant(locale75);
        java.lang.String str77 = locale75.toLanguageTag();
        java.lang.String str78 = locale69.getDisplayVariant(locale75);
        java.lang.String str79 = locale51.getDisplayCountry(locale75);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket82 = new org.joda.time.format.DateTimeParserBucket((-187200000L), chronology31, locale75, (java.lang.Integer) (-2), 117120000);
        org.joda.time.DurationField durationField83 = chronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField84 = chronology31.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField83", (durationField17.compareTo(durationField83) == 0) == durationField17.equals(durationField83));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.centuryOfEra();
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.weekyearOfCentury();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.lang.String str24 = locale23.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology21, locale23, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology28 = dateTimeParserBucket27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.days();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.year();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.era();
        org.joda.time.DateTimeField dateTimeField33 = chronology28.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField34 = chronology28.dayOfYear();
        org.joda.time.DurationField durationField35 = chronology28.years();
        org.joda.time.DateTimeField dateTimeField36 = chronology28.minuteOfHour();
        org.joda.time.DurationField durationField37 = chronology28.days();
        java.util.Locale locale39 = new java.util.Locale("eng");
        java.util.Locale locale40 = locale39.stripExtensions();
        java.lang.String str41 = locale39.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology28, locale39, (java.lang.Integer) (-41), (-1));
        java.lang.String str45 = locale39.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((-115200033L), chronology9, locale39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField35", (durationField11.compareTo(durationField35) == 0) == durationField11.equals(durationField35));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale11 = new java.util.Locale("hi!");
        java.lang.String str12 = locale11.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology9, locale11, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int16 = dateTimeParserBucket15.getPivotYear();
        long long19 = dateTimeParserBucket15.computeMillis(true, "hi!");
        java.util.Locale locale20 = dateTimeParserBucket15.getLocale();
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 0);
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter25.withOffsetParsed();
        java.util.Locale.Category category27 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale28 = java.util.Locale.getDefault(category27);
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getName((long) 2000);
        boolean boolean34 = dateTimeZone31.isFixed();
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale39 = new java.util.Locale("hi!");
        java.lang.String str40 = locale39.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale39, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int44 = dateTimeParserBucket43.getPivotYear();
        long long47 = dateTimeParserBucket43.computeMillis(true, "hi!");
        java.util.Locale locale48 = dateTimeParserBucket43.getLocale();
        java.lang.String str49 = dateTimeZone31.getShortName(0L, locale48);
        java.lang.String str50 = locale28.getDisplayName(locale48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter25.withLocale(locale48);
        boolean boolean52 = dateTimeParserBucket15.restoreState((java.lang.Object) locale48);
        java.io.IOException iOException54 = new java.io.IOException("hi!");
        java.lang.Throwable[] throwableArray55 = iOException54.getSuppressed();
        boolean boolean56 = dateTimeParserBucket15.restoreState((java.lang.Object) iOException54);
        org.joda.time.Chronology chronology57 = dateTimeParserBucket15.getChronology();
        java.lang.String str58 = chronology57.toString();
        org.joda.time.DurationField durationField59 = chronology57.weekyears();
        org.joda.time.DurationField durationField60 = chronology57.centuries();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter5.withChronology(chronology57);
        org.joda.time.DateTimeField dateTimeField62 = chronology57.centuryOfEra();
        org.joda.time.DurationField durationField63 = chronology57.centuries();
        org.joda.time.DurationField durationField64 = chronology57.years();
        org.joda.time.DateTimeField dateTimeField65 = chronology57.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField64", (durationField59.compareTo(durationField64) == 0) == durationField59.equals(durationField64));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DurationField durationField11 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.year();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology19 = dateTimeFormatter16.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        long long23 = dateTimeZone20.adjustOffset((long) 0, true);
        java.lang.String str25 = dateTimeZone20.getNameKey((long) (-1));
        boolean boolean26 = dateTimeZone20.isFixed();
        java.util.Locale locale28 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology30, locale31, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str35 = locale28.getDisplayCountry(locale31);
        java.lang.String str36 = dateTimeZone20.getName((long) (short) 100, locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter16.withZone(dateTimeZone20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter16.withDefaultYear(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter16.withOffsetParsed();
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet42 = locale41.getExtensionKeys();
        java.util.Locale locale43 = locale41.stripExtensions();
        java.util.Locale locale44 = java.util.Locale.CHINA;
        java.lang.String str45 = locale43.getDisplayScript(locale44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter16.withLocale(locale43);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((-99L), chronology9, locale43, (java.lang.Integer) 100, 0);
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.lang.String str55 = locale54.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket(0L, chronology52, locale54, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology59 = dateTimeParserBucket58.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.days();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.year();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter63.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str67 = dateTimeZone65.getName((long) 2000);
        boolean boolean68 = dateTimeZone65.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter63.withZone(dateTimeZone65);
        org.joda.time.Chronology chronology70 = chronology59.withZone(dateTimeZone65);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        long long74 = chronology70.add(readablePeriod71, (long) (short) -1, 10);
        org.joda.time.DateTimeField dateTimeField75 = chronology70.centuryOfEra();
        org.joda.time.DurationField durationField76 = chronology70.weekyears();
        java.util.Locale locale78 = java.util.Locale.forLanguageTag("TW");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket((-346198000L), chronology70, locale78, (java.lang.Integer) (-13));
        org.joda.time.DurationField durationField81 = chronology70.hours();
        boolean boolean82 = locale43.equals((java.lang.Object) durationField81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField76", (durationField11.compareTo(durationField76) == 0) == durationField11.equals(durationField76));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weeks();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.seconds();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField9, and durationField10", !(durationField13.compareTo(durationField9) == 0) || (Math.signum(durationField13.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.year();
        org.joda.time.DurationField durationField13 = chronology8.centuries();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.millisOfDay();
        org.joda.time.DurationField durationField18 = chronology8.months();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField21 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = chronology8.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField21", (durationField10.compareTo(durationField21) == 0) == durationField10.equals(durationField21));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField15 = chronology10.days();
        org.joda.time.DurationField durationField16 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = chronology10.weekyear();
        java.util.Locale locale19 = new java.util.Locale("China");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology10, locale19, (java.lang.Integer) (-1), (int) 'x');
        org.joda.time.DateTimeField dateTimeField23 = chronology10.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = chronology10.add(readablePeriod24, 201L, 8);
        org.joda.time.DurationField durationField28 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField15, and durationField16", !(durationField28.compareTo(durationField15) == 0) || (Math.signum(durationField28.compareTo(durationField16)) == Math.signum(durationField15.compareTo(durationField16))));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.year();
        org.joda.time.DurationField durationField13 = chronology8.centuries();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfHalfday();
        long long20 = chronology8.getDateTimeMillis(117L, 1, 0, (int) (short) 0, 0);
        org.joda.time.DateTimeField dateTimeField21 = chronology8.millisOfDay();
        org.joda.time.DurationField durationField22 = chronology8.weeks();
        org.joda.time.DurationField durationField23 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField10, and durationField13", !(durationField23.compareTo(durationField10) == 0) || (Math.signum(durationField23.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology8.add(readablePeriod11, (long) (-1), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.millisOfSecond();
        org.joda.time.DurationField durationField17 = chronology8.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField21 = chronology8.millisOfDay();
        org.joda.time.DurationField durationField22 = chronology8.weekyears();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology8.add(readablePeriod23, (-36000033L), 144060000);
        org.joda.time.DurationField durationField27 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField9, and durationField17", !(durationField27.compareTo(durationField9) == 0) || (Math.signum(durationField27.compareTo(durationField17)) == Math.signum(durationField9.compareTo(durationField17))));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology8.add(readablePeriod11, (long) (-1), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.joda.time.DurationField durationField17 = chronology8.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField16", Math.signum(durationField9.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField9)));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.days();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        long long19 = chronology9.add(0L, (long) (short) 0, (-1));
        org.joda.time.DateTimeField dateTimeField20 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField21 = chronology9.hours();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField14, and durationField15", !(durationField22.compareTo(durationField14) == 0) || (Math.signum(durationField22.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        int int8 = dateTimeFormatter5.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter5.getZone();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale13, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DurationField durationField20 = chronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter5.withChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = chronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = chronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField29 = chronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = chronology18.dayOfMonth();
        org.joda.time.DurationField durationField31 = chronology18.years();
        org.joda.time.DateTimeField dateTimeField32 = chronology18.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField31", (durationField20.compareTo(durationField31) == 0) == durationField20.equals(durationField31));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.year();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology13.add(readablePeriod16, 32L, (int) (short) 10);
        org.joda.time.DurationField durationField20 = chronology13.eras();
        org.joda.time.Chronology chronology21 = chronology13.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField20", Math.signum(durationField9.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField9)));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology8.add(readablePeriod19, (-3152L), 187200000);
        org.joda.time.DateTimeZone dateTimeZone23 = chronology8.getZone();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = chronology8.add(readablePeriod24, 2000L, (int) (short) 0);
        org.joda.time.DurationField durationField28 = chronology8.weekyears();
        org.joda.time.DurationField durationField29 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField30 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField31 = chronology8.millis();
        org.joda.time.DurationField durationField32 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField33 = chronology8.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField32", (durationField28.compareTo(durationField32) == 0) == durationField28.equals(durationField32));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.millisOfDay();
        org.joda.time.DurationField durationField17 = chronology8.centuries();
        java.lang.String str18 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField21 = chronology8.hourOfDay();
        org.joda.time.DurationField durationField22 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField9, and durationField17", !(durationField22.compareTo(durationField9) == 0) || (Math.signum(durationField22.compareTo(durationField17)) == Math.signum(durationField9.compareTo(durationField17))));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DurationField durationField11 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology8.getZone();
        org.joda.time.DurationField durationField15 = chronology8.hours();
        org.joda.time.DurationField durationField16 = chronology8.hours();
        org.joda.time.DurationField durationField17 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField10, and durationField11", !(durationField17.compareTo(durationField10) == 0) || (Math.signum(durationField17.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.days();
        org.joda.time.Chronology chronology15 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.hourOfDay();
        org.joda.time.Chronology chronology18 = chronology9.withUTC();
        org.joda.time.DurationField durationField19 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField14, and durationField19", !(durationField21.compareTo(durationField14) == 0) || (Math.signum(durationField21.compareTo(durationField19)) == Math.signum(durationField14.compareTo(durationField19))));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weeks();
        long long13 = chronology8.add(0L, (long) 'a', (int) '4');
        org.joda.time.DurationField durationField14 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField14", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField14)) == Math.signum(durationField9.compareTo(durationField14))));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        long long14 = chronology9.add((long) 1, 100L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField17 = chronology9.years();
        java.util.Locale locale18 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(115259989L, chronology9, locale18);
        org.joda.time.DateTimeField dateTimeField21 = chronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = chronology9.weekyear();
        org.joda.time.DurationField durationField23 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField10, and durationField17", !(durationField23.compareTo(durationField10) == 0) || (Math.signum(durationField23.compareTo(durationField17)) == Math.signum(durationField10.compareTo(durationField17))));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        long long14 = chronology9.add(0L, (long) 'a', (int) '4');
        org.joda.time.DurationField durationField15 = chronology9.minutes();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = locale16.getDisplayScript(locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(5044L, chronology9, locale16, (java.lang.Integer) 100, 0);
        org.joda.time.DateTimeField dateTimeField22 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField23 = chronology9.seconds();
        org.joda.time.DurationField durationField24 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField10, and durationField15", !(durationField24.compareTo(durationField10) == 0) || (Math.signum(durationField24.compareTo(durationField15)) == Math.signum(durationField10.compareTo(durationField15))));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField15 = chronology10.eras();
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.getDefault(category16);
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.util.Locale locale27 = java.util.Locale.ITALIAN;
        java.lang.String str28 = locale19.getDisplayLanguage(locale27);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology30, locale31, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str35 = locale31.toLanguageTag();
        java.lang.String str36 = locale19.getDisplayCountry(locale31);
        java.util.Locale.setDefault(category16, locale19);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str40 = dateTimeZone38.getName((long) 2000);
        boolean boolean41 = dateTimeZone38.isFixed();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale46 = new java.util.Locale("hi!");
        java.lang.String str47 = locale46.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket(0L, chronology44, locale46, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int51 = dateTimeParserBucket50.getPivotYear();
        long long54 = dateTimeParserBucket50.computeMillis(true, "hi!");
        java.util.Locale locale55 = dateTimeParserBucket50.getLocale();
        java.lang.String str56 = dateTimeZone38.getShortName(0L, locale55);
        java.lang.String str57 = locale55.getDisplayCountry();
        java.util.Locale.setDefault(category16, locale55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((-359999990L), chronology10, locale55, (java.lang.Integer) 40);
        org.joda.time.DateTimeField dateTimeField61 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField62 = chronology10.weekyearOfCentury();
        java.util.Locale locale63 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) (-3600000), chronology10, locale63, (java.lang.Integer) 0, (-7200000));
        org.joda.time.DurationField durationField67 = chronology10.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField67, and durationField15", !(durationField15.compareTo(durationField67) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField67.compareTo(durationField15))));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.year();
        org.joda.time.DurationField durationField17 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField19 = chronology8.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField19, and durationField17", !(durationField17.compareTo(durationField19) == 0) || (Math.signum(durationField17.compareTo(durationField17)) == Math.signum(durationField19.compareTo(durationField17))));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.util.Locale locale17 = java.util.Locale.getDefault(category15);
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology20, locale21, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str25 = locale18.getDisplayCountry(locale21);
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale18.getDisplayLanguage(locale26);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology29, locale30, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str34 = locale30.toLanguageTag();
        java.lang.String str35 = locale18.getDisplayCountry(locale30);
        java.util.Locale.setDefault(category15, locale18);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getName((long) 2000);
        boolean boolean40 = dateTimeZone37.isFixed();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale45 = new java.util.Locale("hi!");
        java.lang.String str46 = locale45.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology43, locale45, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int50 = dateTimeParserBucket49.getPivotYear();
        long long53 = dateTimeParserBucket49.computeMillis(true, "hi!");
        java.util.Locale locale54 = dateTimeParserBucket49.getLocale();
        java.lang.String str55 = dateTimeZone37.getShortName(0L, locale54);
        java.lang.String str56 = locale54.getDisplayCountry();
        java.util.Locale.setDefault(category15, locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((-359999990L), chronology9, locale54, (java.lang.Integer) 40);
        org.joda.time.DateTimeField dateTimeField60 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField61 = chronology9.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField61, and durationField14", !(durationField14.compareTo(durationField61) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField61.compareTo(durationField14))));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.year();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        long long18 = chronology13.add((-464399883L), (-41L), 0);
        org.joda.time.DurationField durationField19 = chronology13.hours();
        org.joda.time.DurationField durationField20 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField9, and durationField19", !(durationField20.compareTo(durationField9) == 0) || (Math.signum(durationField20.compareTo(durationField19)) == Math.signum(durationField9.compareTo(durationField19))));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.year();
        org.joda.time.DurationField durationField19 = chronology15.centuries();
        org.joda.time.Chronology chronology20 = chronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = chronology15.monthOfYear();
        org.joda.time.DurationField durationField22 = chronology15.months();
        org.joda.time.DurationField durationField23 = chronology15.weekyears();
        org.joda.time.DurationField durationField24 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField19, and durationField22", !(durationField24.compareTo(durationField19) == 0) || (Math.signum(durationField24.compareTo(durationField22)) == Math.signum(durationField19.compareTo(durationField22))));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = chronology9.months();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        long long19 = dateTimeZone16.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone20 = dateTimeZone16.toTimeZone();
        int int22 = dateTimeZone16.getOffsetFromLocal(100L);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology24, locale25, (java.lang.Integer) (-1), (int) (byte) 10);
        boolean boolean29 = dateTimeZone16.equals((java.lang.Object) chronology24);
        java.lang.String str31 = dateTimeZone16.getShortName((long) 'a');
        org.joda.time.Chronology chronology32 = chronology9.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.centuryOfEra();
        org.joda.time.DurationField durationField35 = chronology32.eras();
        long long39 = chronology32.add(108060385L, (-4019760010199990L), (-13));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField35", Math.signum(durationField15.compareTo(durationField35)) == -Math.signum(durationField35.compareTo(durationField15)));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale11 = new java.util.Locale("hi!");
        java.lang.String str12 = locale11.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology9, locale11, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int16 = dateTimeParserBucket15.getPivotYear();
        long long19 = dateTimeParserBucket15.computeMillis(true, "hi!");
        java.util.Locale locale20 = dateTimeParserBucket15.getLocale();
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 0);
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter25.withOffsetParsed();
        java.util.Locale.Category category27 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale28 = java.util.Locale.getDefault(category27);
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getName((long) 2000);
        boolean boolean34 = dateTimeZone31.isFixed();
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale39 = new java.util.Locale("hi!");
        java.lang.String str40 = locale39.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale39, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int44 = dateTimeParserBucket43.getPivotYear();
        long long47 = dateTimeParserBucket43.computeMillis(true, "hi!");
        java.util.Locale locale48 = dateTimeParserBucket43.getLocale();
        java.lang.String str49 = dateTimeZone31.getShortName(0L, locale48);
        java.lang.String str50 = locale28.getDisplayName(locale48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter25.withLocale(locale48);
        boolean boolean52 = dateTimeParserBucket15.restoreState((java.lang.Object) locale48);
        java.io.IOException iOException54 = new java.io.IOException("hi!");
        java.lang.Throwable[] throwableArray55 = iOException54.getSuppressed();
        boolean boolean56 = dateTimeParserBucket15.restoreState((java.lang.Object) iOException54);
        org.joda.time.Chronology chronology57 = dateTimeParserBucket15.getChronology();
        java.lang.String str58 = chronology57.toString();
        org.joda.time.DurationField durationField59 = chronology57.weekyears();
        org.joda.time.DurationField durationField60 = chronology57.centuries();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter5.withChronology(chronology57);
        org.joda.time.DateTimeField dateTimeField62 = chronology57.centuryOfEra();
        org.joda.time.DurationField durationField63 = chronology57.centuries();
        org.joda.time.DurationField durationField64 = chronology57.years();
        org.joda.time.DurationField durationField65 = chronology57.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField64", (durationField59.compareTo(durationField64) == 0) == durationField59.equals(durationField64));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField15 = chronology8.centuries();
        org.joda.time.DurationField durationField16 = chronology8.weeks();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.Chronology chronology23 = chronology8.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = chronology8.year();
        org.joda.time.DurationField durationField25 = chronology8.hours();
        org.joda.time.DurationField durationField26 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField9, and durationField15", !(durationField26.compareTo(durationField9) == 0) || (Math.signum(durationField26.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology8.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField16, and durationField13", !(durationField13.compareTo(durationField16) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField16.compareTo(durationField13))));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.centuryOfEra();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField15", Math.signum(durationField10.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField10)));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology9.add(readablePeriod18, 1L, 0);
        org.joda.time.DateTimeField dateTimeField22 = chronology9.millisOfSecond();
        org.joda.time.DurationField durationField23 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField24 = chronology9.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = chronology9.add(readablePeriod25, (-306060000L), (-1));
        org.joda.time.DurationField durationField29 = chronology9.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField29, and durationField23", !(durationField23.compareTo(durationField29) == 0) || (Math.signum(durationField23.compareTo(durationField23)) == Math.signum(durationField29.compareTo(durationField23))));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField17 = chronology8.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField17, and durationField13", !(durationField13.compareTo(durationField17) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField17.compareTo(durationField13))));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.days();
        org.joda.time.DurationField durationField15 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.weekyear();
        org.joda.time.DurationField durationField17 = chronology9.minutes();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.dayOfWeek();
        org.joda.time.Chronology chronology19 = chronology9.withUTC();
        org.joda.time.DurationField durationField20 = chronology9.days();
        org.joda.time.DurationField durationField21 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField14, and durationField15", !(durationField21.compareTo(durationField14) == 0) || (Math.signum(durationField21.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.halfdayOfDay();
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale17, (java.lang.Integer) (-41), (-11));
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale25 = new java.util.Locale("hi!");
        java.lang.String str26 = locale25.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(0L, chronology23, locale25, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.weekyear();
        org.joda.time.DurationField durationField32 = chronology30.years();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.monthOfYear();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.year();
        dateTimeParserBucket21.saveField(dateTimeField34, (int) 'x');
        long long38 = dateTimeParserBucket21.computeMillis(true);
        int int39 = dateTimeParserBucket21.getOffset();
        java.lang.Object obj40 = dateTimeParserBucket21.saveState();
        java.lang.Object obj41 = dateTimeParserBucket21.saveState();
        java.lang.Integer int42 = dateTimeParserBucket21.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        long long46 = dateTimeZone43.adjustOffset((long) 0, true);
        java.lang.String str48 = dateTimeZone43.getNameKey((long) (-1));
        boolean boolean49 = dateTimeZone43.isFixed();
        int int51 = dateTimeZone43.getOffset((long) (short) 0);
        org.joda.time.Chronology chronology53 = null;
        java.util.Locale locale55 = new java.util.Locale("hi!");
        java.lang.String str56 = locale55.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket(0L, chronology53, locale55, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology60 = dateTimeParserBucket59.getChronology();
        org.joda.time.DurationField durationField61 = chronology60.days();
        org.joda.time.DurationField durationField62 = chronology60.weekyears();
        boolean boolean63 = dateTimeZone43.equals((java.lang.Object) chronology60);
        org.joda.time.DateTimeField dateTimeField64 = chronology60.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField65 = chronology60.yearOfEra();
        long long69 = chronology60.add(1342L, 0L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField70 = chronology60.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField71 = chronology60.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField72 = chronology60.millisOfDay();
        org.joda.time.DateTimeField dateTimeField73 = chronology60.millisOfSecond();
        dateTimeParserBucket21.saveField(dateTimeField73, (-351300001));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField62", (durationField32.compareTo(durationField62) == 0) == durationField32.equals(durationField62));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.millis();
        org.joda.time.DurationField durationField15 = chronology9.minutes();
        org.joda.time.DurationField durationField16 = chronology9.hours();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        long long20 = dateTimeZone17.adjustOffset((long) 0, true);
        java.lang.String str22 = dateTimeZone17.getNameKey((long) (-1));
        boolean boolean23 = dateTimeZone17.isFixed();
        int int25 = dateTimeZone17.getOffset((long) (short) 0);
        long long28 = dateTimeZone17.convertLocalToUTC(0L, true);
        long long31 = dateTimeZone17.adjustOffset((long) (short) 1, true);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        long long35 = dateTimeZone32.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone36 = dateTimeZone32.toTimeZone();
        int int38 = dateTimeZone32.getOffsetFromLocal(100L);
        long long40 = dateTimeZone32.nextTransition((long) ' ');
        long long42 = dateTimeZone17.getMillisKeepLocal(dateTimeZone32, (long) 40);
        long long44 = dateTimeZone17.previousTransition((long) 100);
        java.util.TimeZone timeZone45 = dateTimeZone17.toTimeZone();
        org.joda.time.Chronology chronology46 = chronology9.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.dayOfYear();
        org.joda.time.DurationField durationField48 = chronology46.days();
        org.joda.time.DurationField durationField49 = chronology46.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField14, and durationField15", !(durationField49.compareTo(durationField14) == 0) || (Math.signum(durationField49.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField20 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology8.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField20", Math.signum(durationField9.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField9)));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffset((long) (short) 0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        boolean boolean20 = dateTimeZone0.equals((java.lang.Object) chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.minuteOfDay();
        org.joda.time.DurationField durationField24 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField24", (durationField19.compareTo(durationField24) == 0) == durationField19.equals(durationField24));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology9 = chronology8.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfHalfday();
        long long15 = chronology9.add((long) 'x', (long) (byte) 0, 40);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField17 = chronology9.minutes();
        org.joda.time.DurationField durationField18 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField19 = chronology9.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField18", (durationField10.compareTo(durationField18) == 0) == durationField10.equals(durationField18));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        long long15 = dateTimeZone12.adjustOffset((long) 0, true);
        java.lang.String str17 = dateTimeZone12.getNameKey((long) (-1));
        boolean boolean18 = dateTimeZone12.isFixed();
        int int20 = dateTimeZone12.getOffset((long) (short) 0);
        long long23 = dateTimeZone12.convertLocalToUTC(0L, true);
        long long26 = dateTimeZone12.adjustOffset((long) (short) 1, true);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        long long30 = dateTimeZone27.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone31 = dateTimeZone27.toTimeZone();
        int int33 = dateTimeZone27.getOffsetFromLocal(100L);
        long long35 = dateTimeZone27.nextTransition((long) ' ');
        long long37 = dateTimeZone12.getMillisKeepLocal(dateTimeZone27, (long) 40);
        long long39 = dateTimeZone12.previousTransition((long) 100);
        org.joda.time.Chronology chronology40 = chronology8.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField41 = chronology8.years();
        org.joda.time.DurationField durationField42 = chronology8.seconds();
        org.joda.time.DateTimeField dateTimeField43 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = chronology8.millisOfDay();
        org.joda.time.DurationField durationField45 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField10, and durationField41", !(durationField45.compareTo(durationField10) == 0) || (Math.signum(durationField45.compareTo(durationField41)) == Math.signum(durationField10.compareTo(durationField41))));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology8.getZone();
        org.joda.time.DurationField durationField13 = chronology8.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField13, and durationField9", !(durationField9.compareTo(durationField13) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField13.compareTo(durationField9))));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        long long14 = chronology9.add((long) 1, 100L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField17 = chronology9.seconds();
        java.util.Locale locale21 = new java.util.Locale("English (United States)", "und", "en-US");
        java.lang.String str22 = locale21.getDisplayName();
        java.lang.String str23 = locale21.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology9, locale21, (java.lang.Integer) 0, (int) '4');
        int int27 = dateTimeParserBucket26.getOffset();
        org.joda.time.Chronology chronology28 = dateTimeParserBucket26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.year();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        long long33 = dateTimeZone30.adjustOffset((long) 0, true);
        java.lang.String str34 = dateTimeZone30.toString();
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder36.setExtension('a', "en-US");
        java.util.Locale.Builder builder41 = builder39.setVariant("");
        java.util.Locale.Builder builder42 = builder41.clear();
        java.util.Locale.Builder builder43 = builder42.clearExtensions();
        java.util.Locale.Builder builder46 = builder42.setExtension('a', "it");
        java.util.Locale locale47 = builder46.build();
        java.lang.String str48 = dateTimeZone30.getShortName((long) (short) 1, locale47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str51 = dateTimeZone49.getName((long) 2000);
        long long53 = dateTimeZone49.nextTransition((long) 'a');
        boolean boolean54 = dateTimeZone49.isFixed();
        long long56 = dateTimeZone30.getMillisKeepLocal(dateTimeZone49, (long) 1);
        org.joda.time.Chronology chronology57 = chronology28.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField58 = chronology28.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        long long62 = chronology28.add(readablePeriod59, (-115259029L), 2);
        org.joda.time.DurationField durationField63 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField63, durationField10, and durationField17", !(durationField63.compareTo(durationField10) == 0) || (Math.signum(durationField63.compareTo(durationField17)) == Math.signum(durationField10.compareTo(durationField17))));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology8.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField17, and durationField13", !(durationField13.compareTo(durationField17) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField17.compareTo(durationField13))));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology9.years();
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.lang.String str27 = locale19.getDisplayCountry();
        java.lang.String str28 = locale19.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-86397960L), chronology9, locale19);
        org.joda.time.Chronology chronology30 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        java.lang.String str32 = chronology30.toString();
        org.joda.time.DurationField durationField33 = chronology30.millis();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.year();
        org.joda.time.DurationField durationField35 = chronology30.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = chronology30.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField35", (durationField16.compareTo(durationField35) == 0) == durationField16.equals(durationField35));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        int int8 = dateTimeFormatter5.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter5.getZone();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale13, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DurationField durationField20 = chronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter5.withChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = chronology18.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology18.era();
        org.joda.time.DurationField durationField29 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField19, and durationField20", !(durationField29.compareTo(durationField19) == 0) || (Math.signum(durationField29.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.centuryOfEra();
        org.joda.time.DurationField durationField14 = chronology8.eras();
        org.joda.time.Chronology chronology15 = chronology8.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField14", Math.signum(durationField10.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField10)));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfYear();
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.util.Locale.setDefault(category17, locale19);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale.setDefault(category28, locale29);
        java.util.Locale locale32 = java.util.Locale.getDefault(category28);
        java.lang.String str33 = locale19.getDisplayName(locale32);
        java.lang.String str34 = locale19.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(2040L, chronology9, locale19, (java.lang.Integer) (-33));
        long long39 = dateTimeParserBucket36.computeMillis(false, "69-12-31");
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale43 = new java.util.Locale("hi!");
        java.lang.String str44 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket(0L, chronology41, locale43, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology48 = dateTimeParserBucket47.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.days();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.year();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.millisOfDay();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.millisOfDay();
        org.joda.time.DateTimeField dateTimeField53 = chronology48.secondOfDay();
        org.joda.time.DateTimeField dateTimeField54 = chronology48.halfdayOfDay();
        org.joda.time.DurationField durationField55 = chronology48.centuries();
        org.joda.time.DurationField durationField56 = chronology48.hours();
        org.joda.time.DateTimeField dateTimeField57 = chronology48.weekyear();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        long long61 = chronology48.add(readablePeriod58, 0L, 117);
        org.joda.time.DateTimeField dateTimeField62 = chronology48.centuryOfEra();
        boolean boolean63 = dateTimeParserBucket36.restoreState((java.lang.Object) dateTimeField62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField49", Math.signum(durationField14.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField14)));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.era();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.dayOfYear();
        org.joda.time.DurationField durationField17 = chronology10.years();
        java.lang.String str18 = chronology10.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology10.minuteOfDay();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology22, locale23, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str27 = locale20.getDisplayCountry(locale23);
        java.lang.String str28 = locale20.getDisplayCountry();
        java.lang.String str29 = locale20.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((-86397960L), chronology10, locale20);
        org.joda.time.Chronology chronology31 = chronology10.withUTC();
        java.lang.String str32 = chronology31.toString();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.halfdayOfDay();
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.lang.String str39 = locale38.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology36, locale38, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology43 = dateTimeParserBucket42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.days();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.year();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.millisOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.millisOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology43.secondOfMinute();
        java.util.Locale locale51 = new java.util.Locale("United States", "hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(10L, chronology43, locale51, (java.lang.Integer) 0);
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale58 = new java.util.Locale("hi!");
        java.lang.String str59 = locale58.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(0L, chronology56, locale58, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology63 = dateTimeParserBucket62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.days();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.year();
        org.joda.time.DateTimeField dateTimeField66 = chronology63.weekyearOfCentury();
        org.joda.time.Chronology chronology67 = chronology63.withUTC();
        org.joda.time.DateTimeField dateTimeField68 = chronology63.yearOfEra();
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.toLanguageTag();
        java.lang.String str71 = locale69.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology63, locale69);
        java.util.Locale.Category category73 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale74 = java.util.Locale.getDefault(category73);
        java.util.Locale locale75 = java.util.Locale.TAIWAN;
        java.lang.String str76 = locale74.getDisplayVariant(locale75);
        java.lang.String str77 = locale75.toLanguageTag();
        java.lang.String str78 = locale69.getDisplayVariant(locale75);
        java.lang.String str79 = locale51.getDisplayCountry(locale75);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket82 = new org.joda.time.format.DateTimeParserBucket((-187200000L), chronology31, locale75, (java.lang.Integer) (-2), 117120000);
        org.joda.time.DurationField durationField83 = chronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField84 = chronology31.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField83", (durationField17.compareTo(durationField83) == 0) == durationField17.equals(durationField83));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology8.add(readablePeriod16, (-540600000L), (-1970));
        org.joda.time.DurationField durationField20 = chronology8.eras();
        org.joda.time.DurationField durationField21 = chronology8.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField21, and durationField20", !(durationField20.compareTo(durationField21) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField21.compareTo(durationField20))));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField15 = chronology8.millis();
        java.lang.String str16 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField9, and durationField15", !(durationField18.compareTo(durationField9) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.weekyear();
        java.lang.String str19 = chronology8.toString();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology8.add(readablePeriod20, (-349799903L), (-13));
        org.joda.time.DurationField durationField24 = chronology8.eras();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale28 = new java.util.Locale("hi!");
        java.lang.String str29 = locale28.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale28, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology33 = dateTimeParserBucket32.getChronology();
        org.joda.time.Chronology chronology34 = chronology33.withUTC();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology34.getZone();
        long long39 = dateTimeZone35.convertLocalToUTC((long) (byte) 10, false, 0L);
        long long41 = dateTimeZone35.convertUTCToLocal((-35L));
        int int43 = dateTimeZone35.getOffset((-346198000L));
        boolean boolean44 = dateTimeZone35.isFixed();
        org.joda.time.Chronology chronology45 = chronology8.withZone(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField24", Math.signum(durationField9.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField9)));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.millisOfDay();
        org.joda.time.DurationField durationField16 = chronology8.halfdays();
        org.joda.time.DurationField durationField17 = chronology8.minutes();
        org.joda.time.DurationField durationField18 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField9, and durationField16", !(durationField18.compareTo(durationField9) == 0) || (Math.signum(durationField18.compareTo(durationField16)) == Math.signum(durationField9.compareTo(durationField16))));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.util.Locale locale17 = java.util.Locale.getDefault(category15);
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology20, locale21, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str25 = locale18.getDisplayCountry(locale21);
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale18.getDisplayLanguage(locale26);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology29, locale30, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str34 = locale30.toLanguageTag();
        java.lang.String str35 = locale18.getDisplayCountry(locale30);
        java.util.Locale.setDefault(category15, locale18);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getName((long) 2000);
        boolean boolean40 = dateTimeZone37.isFixed();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale45 = new java.util.Locale("hi!");
        java.lang.String str46 = locale45.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology43, locale45, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int50 = dateTimeParserBucket49.getPivotYear();
        long long53 = dateTimeParserBucket49.computeMillis(true, "hi!");
        java.util.Locale locale54 = dateTimeParserBucket49.getLocale();
        java.lang.String str55 = dateTimeZone37.getShortName(0L, locale54);
        java.lang.String str56 = locale54.getDisplayCountry();
        java.util.Locale.setDefault(category15, locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((-359999990L), chronology9, locale54, (java.lang.Integer) 40);
        org.joda.time.DateTimeField dateTimeField60 = chronology9.era();
        org.joda.time.DurationField durationField61 = chronology9.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField61, and durationField14", !(durationField14.compareTo(durationField61) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField61.compareTo(durationField14))));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology8.add(readablePeriod11, (long) (-1), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField18 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField18", Math.signum(durationField9.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField9)));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        java.util.Locale locale16 = new java.util.Locale("eng");
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(120L, chronology9, locale16, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField21 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField22 = chronology9.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str27 = dateTimeZone25.getName((long) 2000);
        boolean boolean28 = dateTimeZone25.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter23.withZone(dateTimeZone25);
        org.joda.time.format.DateTimeParser dateTimeParser30 = dateTimeFormatter23.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = dateTimeFormatter23.getPrinter();
        org.joda.time.Chronology chronology32 = dateTimeFormatter23.getChronolgy();
        org.joda.time.LocalDate localDate34 = dateTimeFormatter23.parseLocalDate("69-12-31");
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder38 = builder35.setExtension('a', "en-US");
        java.util.Locale.Builder builder40 = builder38.setVariant("");
        java.util.Locale.Builder builder41 = builder40.clear();
        java.util.Locale.Builder builder42 = builder40.clearExtensions();
        java.util.Locale.Builder builder43 = builder42.clearExtensions();
        java.util.Locale.Builder builder45 = builder42.setVariant("Italian");
        java.util.Locale.Builder builder46 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder49 = builder46.setExtension('a', "en-US");
        java.util.Locale.Builder builder51 = builder49.setLanguageTag("it");
        java.util.Locale.Builder builder52 = builder49.clear();
        java.util.Locale.Builder builder54 = builder49.setRegion("");
        java.util.Locale locale55 = builder54.build();
        java.util.Locale.Builder builder56 = builder45.setLocale(locale55);
        java.lang.String str57 = locale55.getISO3Language();
        java.lang.String str58 = locale55.getLanguage();
        java.lang.String str59 = locale55.getDisplayCountry();
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet61 = locale60.getExtensionKeys();
        java.lang.String str63 = locale60.getExtension('a');
        java.lang.String str64 = locale55.getDisplayCountry(locale60);
        java.util.Set<java.lang.Character> charSet65 = locale60.getExtensionKeys();
        boolean boolean66 = localDate34.equals((java.lang.Object) charSet65);
        int int67 = localDate34.size();
        org.joda.time.Chronology chronology68 = localDate34.getChronology();
        int[] intArray70 = chronology9.get((org.joda.time.ReadablePartial) localDate34, (-62259851228580100L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField22", Math.signum(durationField10.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField10)));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology8.halfdays();
        org.joda.time.DurationField durationField13 = chronology8.days();
        org.joda.time.DurationField durationField14 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology8.add(readablePeriod16, 115260000L, (int) 'a');
        org.joda.time.DurationField durationField20 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField10, and durationField13", !(durationField20.compareTo(durationField10) == 0) || (Math.signum(durationField20.compareTo(durationField13)) == Math.signum(durationField10.compareTo(durationField13))));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        int int6 = dateTimeZone0.getOffsetFromLocal(100L);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.lang.String str11 = locale10.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale10, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.days();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.year();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter19.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str23 = dateTimeZone21.getName((long) 2000);
        boolean boolean24 = dateTimeZone21.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter19.withZone(dateTimeZone21);
        org.joda.time.Chronology chronology26 = chronology15.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.hourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology26.eras();
        boolean boolean29 = dateTimeZone0.equals((java.lang.Object) durationField28);
        long long33 = dateTimeZone0.convertLocalToUTC((-115260036L), false, 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField28", Math.signum(durationField16.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField16)));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.centuryOfEra();
        org.joda.time.DurationField durationField14 = chronology8.millis();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField14", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField14)) == Math.signum(durationField9.compareTo(durationField14))));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField16 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.year();
        org.joda.time.DurationField durationField18 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField9, and durationField16", !(durationField18.compareTo(durationField9) == 0) || (Math.signum(durationField18.compareTo(durationField16)) == Math.signum(durationField9.compareTo(durationField16))));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.millis();
        org.joda.time.DurationField durationField15 = chronology9.minutes();
        org.joda.time.DurationField durationField16 = chronology9.hours();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        long long20 = dateTimeZone17.adjustOffset((long) 0, true);
        java.lang.String str22 = dateTimeZone17.getNameKey((long) (-1));
        boolean boolean23 = dateTimeZone17.isFixed();
        int int25 = dateTimeZone17.getOffset((long) (short) 0);
        long long28 = dateTimeZone17.convertLocalToUTC(0L, true);
        long long31 = dateTimeZone17.adjustOffset((long) (short) 1, true);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        long long35 = dateTimeZone32.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone36 = dateTimeZone32.toTimeZone();
        int int38 = dateTimeZone32.getOffsetFromLocal(100L);
        long long40 = dateTimeZone32.nextTransition((long) ' ');
        long long42 = dateTimeZone17.getMillisKeepLocal(dateTimeZone32, (long) 40);
        long long44 = dateTimeZone17.previousTransition((long) 100);
        java.util.TimeZone timeZone45 = dateTimeZone17.toTimeZone();
        org.joda.time.Chronology chronology46 = chronology9.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.dayOfYear();
        org.joda.time.DurationField durationField48 = chronology46.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField48, durationField14, and durationField15", !(durationField48.compareTo(durationField14) == 0) || (Math.signum(durationField48.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekyearOfCentury();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.yearOfEra();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale15.toLanguageTag();
        java.lang.String str17 = locale15.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology9, locale15);
        org.joda.time.DateTimeField dateTimeField19 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.centuryOfEra();
        org.joda.time.DurationField durationField21 = chronology9.eras();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Chronology chronology23 = chronology9.withZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField21", Math.signum(durationField10.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField10)));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology9.years();
        java.lang.String str17 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.minuteOfDay();
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str26 = locale19.getDisplayCountry(locale22);
        java.lang.String str27 = locale19.getDisplayCountry();
        java.lang.String str28 = locale19.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-86397960L), chronology9, locale19);
        org.joda.time.Chronology chronology30 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = chronology30.weekyears();
        java.lang.String str34 = chronology30.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField33", (durationField16.compareTo(durationField33) == 0) == durationField16.equals(durationField33));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.util.Locale locale3 = new java.util.Locale("TW", "", "en-us");
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale8, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology13.dayOfYear();
        java.util.Locale.Category category21 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale22 = java.util.Locale.getDefault(category21);
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology25, locale26, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str30 = locale23.getDisplayCountry(locale26);
        java.util.Locale.setDefault(category21, locale23);
        java.util.Locale.Category category32 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet34 = locale33.getExtensionKeys();
        java.util.Locale.setDefault(category32, locale33);
        java.util.Locale locale36 = java.util.Locale.getDefault(category32);
        java.lang.String str37 = locale23.getDisplayName(locale36);
        java.lang.String str38 = locale23.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(2040L, chronology13, locale23, (java.lang.Integer) (-33));
        java.util.Locale locale41 = locale23.stripExtensions();
        java.lang.String str42 = locale3.getDisplayScript(locale41);
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale44 = locale3.stripExtensions();
        java.util.Locale locale47 = new java.util.Locale("cinese (Cina)", "DE");
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.lang.String str53 = locale52.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(0L, chronology50, locale52, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology57 = dateTimeParserBucket56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.days();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.year();
        org.joda.time.DateTimeField dateTimeField60 = chronology57.weekyearOfCentury();
        org.joda.time.Chronology chronology61 = chronology57.withUTC();
        org.joda.time.DurationField durationField62 = chronology57.minutes();
        java.util.Locale locale66 = new java.util.Locale("UTC", "1/1/70", "it");
        java.lang.String str67 = locale66.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology57, locale66, (java.lang.Integer) 10, (int) (short) 100);
        java.lang.String str71 = locale66.getScript();
        java.lang.String str72 = locale47.getDisplayVariant(locale66);
        java.lang.String str73 = locale44.getDisplayName(locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField58", Math.signum(durationField18.compareTo(durationField58)) == -Math.signum(durationField58.compareTo(durationField18)));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology10.months();
        org.joda.time.DurationField durationField17 = chronology10.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        long long21 = dateTimeZone18.adjustOffset((long) 0, true);
        java.lang.String str23 = dateTimeZone18.getNameKey((long) (-1));
        java.lang.String str25 = dateTimeZone18.getNameKey((long) 0);
        boolean boolean27 = dateTimeZone18.isStandardOffset((long) ' ');
        java.lang.String str28 = dateTimeZone18.getID();
        java.util.Locale locale30 = new java.util.Locale("hi!");
        boolean boolean31 = dateTimeZone18.equals((java.lang.Object) locale30);
        boolean boolean33 = dateTimeZone18.isStandardOffset((long) (-121));
        org.joda.time.Chronology chronology34 = chronology10.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.dayOfWeek();
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((-144060000L), chronology34, locale37, (java.lang.Integer) 117);
        org.joda.time.DateTimeField dateTimeField42 = chronology34.dayOfMonth();
        org.joda.time.DurationField durationField43 = chronology34.weekyears();
        org.joda.time.DateTimeField dateTimeField44 = chronology34.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField43", (durationField17.compareTo(durationField43) == 0) == durationField17.equals(durationField43));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology8.add(readablePeriod11, (long) (-1), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField18 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField18", Math.signum(durationField9.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField9)));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField19 = chronology8.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField19, and durationField13", !(durationField13.compareTo(durationField19) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField19.compareTo(durationField13))));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology19.add(readablePeriod20, (long) (short) -1, 10);
        org.joda.time.DurationField durationField24 = chronology19.days();
        org.joda.time.DateTimeField dateTimeField25 = chronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology19.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField24", (durationField9.compareTo(durationField24) == 0) == durationField9.equals(durationField24));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField20 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology8.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField20", Math.signum(durationField9.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField9)));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Chronology chronology16 = chronology10.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = chronology16.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.halfdayOfDay();
        org.joda.time.DurationField durationField19 = chronology16.halfdays();
        org.joda.time.DurationField durationField20 = chronology16.centuries();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField22 = chronology16.months();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale27 = new java.util.Locale("hi!");
        java.lang.String str28 = locale27.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology25, locale27, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.days();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.year();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.millisOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology32.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        long long42 = chronology32.add(readablePeriod39, (long) 'a', (int) 'a');
        org.joda.time.DurationField durationField43 = chronology32.centuries();
        org.joda.time.format.DateTimePrinter dateTimePrinter44 = null;
        org.joda.time.format.DateTimeParser dateTimeParser45 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter44, dateTimeParser45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter46.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter48.withZone(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter50.withZone(dateTimeZone51);
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.lang.String str57 = locale56.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket(0L, chronology54, locale56, (java.lang.Integer) 10, (int) 'a');
        java.lang.Integer int61 = dateTimeParserBucket60.getPivotYear();
        long long64 = dateTimeParserBucket60.computeMillis(true, "hi!");
        java.util.Locale locale65 = dateTimeParserBucket60.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter52.withLocale(locale65);
        java.lang.String str67 = locale65.getDisplayVariant();
        java.lang.String str68 = locale65.getDisplayVariant();
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet70 = locale69.getExtensionKeys();
        java.util.Locale locale71 = locale69.stripExtensions();
        java.lang.String str72 = locale65.getDisplayName(locale71);
        java.lang.String str73 = locale65.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 100, chronology32, locale65, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket((-12746L), chronology16, locale65, (java.lang.Integer) 2, (-349800001));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField43", (durationField20.compareTo(durationField43) == 0) == durationField20.equals(durationField43));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfMonth();
        org.joda.time.DurationField durationField15 = chronology8.eras();
        org.joda.time.DurationField durationField16 = chronology8.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField15", Math.signum(durationField9.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField9)));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.era();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.clockhourOfHalfday();
        org.joda.time.Chronology chronology16 = chronology10.withUTC();
        org.joda.time.DurationField durationField17 = chronology10.weeks();
        org.joda.time.DurationField durationField18 = chronology10.seconds();
        org.joda.time.Chronology chronology19 = chronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = chronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology10.months();
        org.joda.time.Chronology chronology23 = chronology10.withUTC();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("DE");
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale25.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(115259999L, chronology23, locale25, (java.lang.Integer) (-187200001), 1);
        java.util.Locale locale34 = new java.util.Locale("TW", "", "en-us");
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale39 = new java.util.Locale("hi!");
        java.lang.String str40 = locale39.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale39, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.weekyear();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.monthOfYear();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField48 = chronology44.yearOfCentury();
        org.joda.time.DurationField durationField49 = chronology44.eras();
        org.joda.time.DateTimeField dateTimeField50 = chronology44.millisOfDay();
        org.joda.time.DateTimeField dateTimeField51 = chronology44.dayOfYear();
        java.util.Locale.Category category52 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale53 = java.util.Locale.getDefault(category52);
        java.util.Locale locale54 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology56, locale57, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str61 = locale54.getDisplayCountry(locale57);
        java.util.Locale.setDefault(category52, locale54);
        java.util.Locale.Category category63 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale64 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet65 = locale64.getExtensionKeys();
        java.util.Locale.setDefault(category63, locale64);
        java.util.Locale locale67 = java.util.Locale.getDefault(category63);
        java.lang.String str68 = locale54.getDisplayName(locale67);
        java.lang.String str69 = locale54.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket(2040L, chronology44, locale54, (java.lang.Integer) (-33));
        java.util.Locale locale72 = locale54.stripExtensions();
        java.lang.String str73 = locale34.getDisplayScript(locale72);
        java.util.Locale.setDefault(locale34);
        java.util.Locale locale75 = locale34.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket(0L, chronology23, locale34, (java.lang.Integer) (-53), 187200000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField49", Math.signum(durationField11.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField11)));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DurationField durationField11 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField13 = chronology8.weekyears();
        long long17 = chronology8.add(1965L, (long) (-98), 10);
        org.joda.time.DurationField durationField18 = chronology8.years();
        org.joda.time.Chronology chronology19 = chronology8.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField18", (durationField10.compareTo(durationField18) == 0) == durationField10.equals(durationField18));
    }
}

