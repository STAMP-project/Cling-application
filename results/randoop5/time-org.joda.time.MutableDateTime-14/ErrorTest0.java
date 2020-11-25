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
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property4.getAsText(locale5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime1.addDays(3);
        int int4 = mutableDateTime1.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime1.toMutableDateTime();
        int int6 = mutableDateTime1.getWeekOfWeekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTime dateTime17 = mutableDateTime12.toDateTime(dateTimeZone16);
        int int18 = dateTime17.getDayOfYear();
        boolean boolean19 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime15", (instant10.compareTo(mutableDateTime15) == 0) == instant10.equals(mutableDateTime15));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) (short) 100);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.era();
        int int20 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateTimeField dateTimeField21 = property4.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        int int11 = mutableDateTime5.getRoundingMode();
        boolean boolean12 = mutableDateTime5.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.Chronology chronology11 = mutableDateTime7.getChronology();
        int int12 = mutableDateTime7.getWeekOfWeekyear();
        mutableDateTime7.addWeekyears((int) (short) -1);
        long long15 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.Chronology chronology10 = mutableDateTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        int int14 = mutableDateTime13.getDayOfYear();
        boolean boolean15 = property7.equals((java.lang.Object) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        mutableDateTime2.addMinutes((int) 'a');
        int int9 = mutableDateTime2.getCenturyOfEra();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTime(dateTimeZone19);
        mutableDateTime2.setZoneRetainFields(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime18", (instant13.compareTo(mutableDateTime18) == 0) == instant13.equals(mutableDateTime18));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTime(dateTimeZone19);
        int int21 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.String str22 = property8.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime18", (instant13.compareTo(mutableDateTime18) == 0) == instant13.equals(mutableDateTime18));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addWeekyears(48);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime4.addDays(3);
        int int7 = mutableDateTime4.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime4.toMutableDateTime();
        boolean boolean9 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        mutableDateTime13.addDays(100);
        mutableDateTime13.add((long) '4');
        boolean boolean18 = mutableDateTime10.isEqual((org.joda.time.ReadableInstant) mutableDateTime13);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        java.lang.String str25 = mutableDateTime24.toString();
        mutableDateTime24.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime24.toMutableDateTime();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.era();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        int int40 = mutableDateTime24.get(dateTimeFieldType39);
        int int41 = mutableDateTime10.get(dateTimeFieldType39);
        int int42 = mutableDateTime4.get(dateTimeFieldType39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant22", (mutableDateTime10.compareTo(instant22) == 0) == mutableDateTime10.equals(instant22));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = mutableDateTime2.isSupported(dateTimeFieldType5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        mutableDateTime10.add((long) (byte) 1);
        int int15 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        mutableDateTime2.setMinuteOfDay((int) (short) 10);
        mutableDateTime2.addMonths(2020);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        mutableDateTime12.addDays(100);
        mutableDateTime12.add((long) '4');
        boolean boolean17 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        java.lang.String str24 = mutableDateTime23.toString();
        mutableDateTime23.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime23.toMutableDateTime();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.hourOfDay();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.era();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property36.getFieldType();
        int int39 = mutableDateTime23.get(dateTimeFieldType38);
        int int40 = mutableDateTime9.get(dateTimeFieldType38);
        boolean boolean41 = mutableDateTime2.isSupported(dateTimeFieldType38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant21", (mutableDateTime9.compareTo(instant21) == 0) == mutableDateTime9.equals(instant21));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTime(dateTimeZone19);
        int int21 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        java.lang.String str28 = mutableDateTime27.toString();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime27.getZone();
        mutableDateTime15.setZone(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime18", (instant13.compareTo(mutableDateTime18) == 0) == instant13.equals(mutableDateTime18));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMillisOfSecond(4);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        mutableDateTime8.addDays(100);
        mutableDateTime8.add((long) '4');
        boolean boolean13 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        java.lang.String str20 = mutableDateTime19.toString();
        mutableDateTime19.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime19.toMutableDateTime();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.hourOfDay();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime26.era();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property32.getFieldType();
        int int35 = mutableDateTime19.get(dateTimeFieldType34);
        int int36 = mutableDateTime5.get(dateTimeFieldType34);
        boolean boolean37 = dateTime4.isSupported(dateTimeFieldType34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant17", (mutableDateTime5.compareTo(instant17) == 0) == mutableDateTime5.equals(instant17));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        int int7 = mutableDateTime2.getMinuteOfHour();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundCeiling();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property12.getAsText(locale14);
        org.joda.time.DateTimeField dateTimeField16 = property12.getField();
        mutableDateTime2.setRounding(dateTimeField16, (int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime20.setMillisOfSecond(4);
        mutableDateTime20.setDate((long) 10);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime26.addDays(3);
        int int29 = mutableDateTime26.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime26.toMutableDateTime();
        int int31 = mutableDateTime20.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        mutableDateTime36.addDays(100);
        mutableDateTime36.add((long) '4');
        boolean boolean41 = mutableDateTime33.isEqual((org.joda.time.ReadableInstant) mutableDateTime36);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.Instant instant45 = mutableDateTime44.toInstant();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundHalfFloor();
        java.lang.String str48 = mutableDateTime47.toString();
        mutableDateTime47.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime47.toMutableDateTime();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        mutableDateTime54.add(readablePeriod57);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime54.hourOfDay();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime54.era();
        org.joda.time.MutableDateTime mutableDateTime61 = property60.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property60.getFieldType();
        int int63 = mutableDateTime47.get(dateTimeFieldType62);
        int int64 = mutableDateTime33.get(dateTimeFieldType62);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime20.property(dateTimeFieldType62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime33", (instant11.compareTo(mutableDateTime33) == 0) == instant11.equals(mutableDateTime33));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime10.toDateTime(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.addMonths(70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        int int6 = mutableDateTime5.getDayOfMonth();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone11);
        mutableDateTime5.setZoneRetainFields(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        mutableDateTime19.addWeeks(10);
        org.joda.time.DateTime dateTime26 = mutableDateTime19.toDateTimeISO();
        mutableDateTime19.addMinutes((int) (byte) 1);
        boolean boolean29 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime9.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        mutableDateTime19.addWeeks(10);
        org.joda.time.DateTime dateTime26 = mutableDateTime19.toDateTimeISO();
        mutableDateTime19.addMinutes((int) (byte) 1);
        boolean boolean29 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        boolean boolean31 = mutableDateTime9.isEqual((long) 42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        mutableDateTime2.addDays(100);
        mutableDateTime2.setWeekyear(0);
        int int7 = mutableDateTime2.getCenturyOfEra();
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        mutableDateTime13.addDays(100);
        mutableDateTime13.add((long) '4');
        boolean boolean18 = mutableDateTime10.isEqual((org.joda.time.ReadableInstant) mutableDateTime13);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        java.lang.String str25 = mutableDateTime24.toString();
        mutableDateTime24.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime24.toMutableDateTime();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.era();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        int int40 = mutableDateTime24.get(dateTimeFieldType39);
        int int41 = mutableDateTime10.get(dateTimeFieldType39);
        boolean boolean42 = mutableDateTime2.isSupported(dateTimeFieldType39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant22", (mutableDateTime10.compareTo(instant22) == 0) == mutableDateTime10.equals(instant22));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime8.isSupported(dateTimeFieldType11);
        java.lang.Object obj13 = mutableDateTime8.clone();
        org.joda.time.Chronology chronology14 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime5.toMutableDateTime(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        int int11 = mutableDateTime5.getRoundingMode();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property4.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) (short) 100);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.era();
        int int20 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime13);
        java.util.Locale locale21 = null;
        int int22 = property4.getMaximumShortTextLength(locale21);
        org.joda.time.MutableDateTime mutableDateTime24 = property4.addWrapField(4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.weekyear();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        java.util.Date date16 = mutableDateTime2.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime5.toMutableDateTime(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.weekyear();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.setMinuteOfDay(2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        mutableDateTime19.addWeeks(10);
        org.joda.time.DateTime dateTime26 = mutableDateTime19.toDateTimeISO();
        mutableDateTime19.addMinutes((int) (byte) 1);
        boolean boolean29 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime9.setSecondOfDay(31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        mutableDateTime8.addMillis((int) 'a');
        int int11 = mutableDateTime8.getDayOfYear();
        java.util.Date date12 = mutableDateTime8.toDate();
        int int13 = mutableDateTime8.getMinuteOfHour();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundCeiling();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property18.getAsText(locale20);
        org.joda.time.DateTimeField dateTimeField22 = property18.getField();
        mutableDateTime8.setRounding(dateTimeField22, (int) (byte) 0);
        int int25 = mutableDateTime5.get(dateTimeField22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant17", (mutableDateTime3.compareTo(instant17) == 0) == mutableDateTime3.equals(instant17));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        mutableDateTime5.addDays(100);
        mutableDateTime5.add((long) '4');
        boolean boolean10 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime5);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        java.lang.String str17 = mutableDateTime16.toString();
        mutableDateTime16.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime16.toMutableDateTime();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.era();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property29.getFieldType();
        int int32 = mutableDateTime16.get(dateTimeFieldType31);
        int int33 = mutableDateTime2.get(dateTimeFieldType31);
        boolean boolean34 = mutableDateTime1.isSupported(dateTimeFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant14", (mutableDateTime2.compareTo(instant14) == 0) == mutableDateTime2.equals(instant14));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.weekyear();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        int int16 = mutableDateTime10.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.weekyear();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime2.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        mutableDateTime11.addDays(100);
        mutableDateTime11.add((long) '4');
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.addWrapField(19);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime18.add(readablePeriod19);
        boolean boolean21 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        mutableDateTime24.addMillis((int) 'a');
        int int27 = mutableDateTime24.getYearOfCentury();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.Instant instant31 = mutableDateTime30.toInstant();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfFloor();
        java.lang.String str34 = mutableDateTime33.toString();
        mutableDateTime33.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime33.toMutableDateTime();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.era();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property46.getFieldType();
        int int49 = mutableDateTime33.get(dateTimeFieldType48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime24.property(dateTimeFieldType48);
        boolean boolean51 = mutableDateTime18.isSupported(dateTimeFieldType48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant31", (mutableDateTime2.compareTo(instant31) == 0) == mutableDateTime2.equals(instant31));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone6);
        mutableDateTime0.setZone(dateTimeZone6);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime0.monthOfYear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.secondOfMinute();
        int int18 = mutableDateTime16.getDayOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.dayOfMonth();
        boolean boolean20 = property10.equals((java.lang.Object) property19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant14", (mutableDateTime0.compareTo(instant14) == 0) == mutableDateTime0.equals(instant14));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        int int9 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime12 = property4.add(330);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.roundHalfEven();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.DateTime dateTime22 = mutableDateTime13.toDateTime(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        mutableDateTime4.setWeekOfWeekyear(20);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        int int14 = mutableDateTime9.getWeekOfWeekyear();
        mutableDateTime9.addWeekyears((int) (short) -1);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property21.getAsText(locale23);
        org.joda.time.DateTimeField dateTimeField25 = property21.getField();
        org.joda.time.MutableDateTime mutableDateTime27 = property21.add((long) (short) 100);
        java.lang.String str28 = mutableDateTime27.toString();
        boolean boolean29 = mutableDateTime27.isEqualNow();
        int int30 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        java.lang.String str37 = mutableDateTime36.toString();
        mutableDateTime36.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime36.toMutableDateTime();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.era();
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property49.getFieldType();
        int int52 = mutableDateTime36.get(dateTimeFieldType51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime27.property(dateTimeFieldType51);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime4.property(dateTimeFieldType51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant20", (mutableDateTime2.compareTo(instant20) == 0) == mutableDateTime2.equals(instant20));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        mutableDateTime2.addMinutes((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime2.add(readablePeriod9, (int) (byte) -1);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        int int16 = mutableDateTime14.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = mutableDateTime14.isSupported(dateTimeFieldType17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        mutableDateTime2.setRounding(dateTimeField20, 2);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime24.addDays(3);
        mutableDateTime24.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.secondOfDay();
        java.util.GregorianCalendar gregorianCalendar30 = mutableDateTime24.toGregorianCalendar();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        java.lang.String str37 = mutableDateTime36.toString();
        boolean boolean38 = mutableDateTime24.isEqual((org.joda.time.ReadableInstant) mutableDateTime36);
        boolean boolean39 = mutableDateTime2.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant34", (mutableDateTime14.compareTo(instant34) == 0) == mutableDateTime14.equals(instant34));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setTime((int) (short) 10, (int) '#', 12, (int) (byte) 10);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone12);
        boolean boolean15 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        java.lang.String str22 = mutableDateTime21.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime1.toMutableDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant19", (mutableDateTime11.compareTo(instant19) == 0) == mutableDateTime11.equals(instant19));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundCeiling();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime6.setZone(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        int int11 = mutableDateTime8.getYearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.yearOfCentury();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime8.toMutableDateTime(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.secondOfMinute();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime5.setZoneRetainFields(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.Chronology chronology11 = mutableDateTime7.getChronology();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology11);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology11);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime2.toMutableDateTime(chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology6);
        java.lang.Object obj10 = mutableDateTime9.clone();
        mutableDateTime9.addWeekyears(100);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.hourOfDay();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        java.lang.String str20 = mutableDateTime19.toString();
        mutableDateTime19.setDayOfYear(3);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime19.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfCeiling();
        int int25 = property13.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant17", (mutableDateTime2.compareTo(instant17) == 0) == mutableDateTime2.equals(instant17));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        java.lang.String str12 = mutableDateTime11.toString();
        mutableDateTime11.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.toMutableDateTime();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.era();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        int int27 = mutableDateTime11.get(dateTimeFieldType26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime2.property(dateTimeFieldType26);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime2.toMutableDateTime(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime32", (instant9.compareTo(mutableDateTime32) == 0) == instant9.equals(mutableDateTime32));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        mutableDateTime2.addDays(100);
        mutableDateTime2.setWeekyear(0);
        int int7 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime10.toMutableDateTime(dateTimeZone16);
        long long20 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime mutableDateTime21 = property8.roundHalfCeiling();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        mutableDateTime24.setMinuteOfDay(100);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.secondOfMinute();
        mutableDateTime36.setDayOfWeek(3);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime36.era();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.monthOfYear();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        int int47 = mutableDateTime44.getYearOfCentury();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        int int49 = mutableDateTime44.getWeekOfWeekyear();
        mutableDateTime44.addWeekyears((int) (short) -1);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.Instant instant55 = mutableDateTime54.toInstant();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime54.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime57 = property56.roundCeiling();
        java.util.Locale locale58 = null;
        java.lang.String str59 = property56.getAsText(locale58);
        org.joda.time.DateTimeField dateTimeField60 = property56.getField();
        org.joda.time.MutableDateTime mutableDateTime62 = property56.add((long) (short) 100);
        java.lang.String str63 = mutableDateTime62.toString();
        boolean boolean64 = mutableDateTime62.isEqualNow();
        int int65 = mutableDateTime44.compareTo((org.joda.time.ReadableInstant) mutableDateTime62);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.Instant instant69 = mutableDateTime68.toInstant();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime68.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime71 = property70.roundHalfFloor();
        java.lang.String str72 = mutableDateTime71.toString();
        mutableDateTime71.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime75 = mutableDateTime71.toMutableDateTime();
        java.lang.Object obj76 = null;
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(obj76, chronology77);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = null;
        java.lang.String str80 = mutableDateTime78.toString(dateTimeFormatter79);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        mutableDateTime78.add(readablePeriod81);
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime78.hourOfDay();
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime78.era();
        org.joda.time.MutableDateTime mutableDateTime85 = property84.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = property84.getFieldType();
        int int87 = mutableDateTime71.get(dateTimeFieldType86);
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime62.property(dateTimeFieldType86);
        boolean boolean89 = mutableDateTime36.isSupported(dateTimeFieldType86);
        int int90 = mutableDateTime24.get(dateTimeFieldType86);
        boolean boolean91 = mutableDateTime21.isSupported(dateTimeFieldType86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant34", (mutableDateTime15.compareTo(instant34) == 0) == mutableDateTime15.equals(instant34));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTime(dateTimeZone19);
        int int21 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime15.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime18", (instant13.compareTo(mutableDateTime18) == 0) == instant13.equals(mutableDateTime18));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        int int11 = mutableDateTime5.getRoundingMode();
        org.joda.time.DateTime dateTime12 = mutableDateTime5.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTime dateTime3 = mutableDateTime1.toDateTimeISO();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        java.lang.String str10 = mutableDateTime9.toString();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property12.getFieldType();
        boolean boolean14 = mutableDateTime1.isSupported(dateTimeFieldType13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime1.toMutableDateTime(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime17", (instant7.compareTo(mutableDateTime17) == 0) == instant7.equals(mutableDateTime17));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setTime((int) (short) 10, (int) '#', 12, (int) (byte) 10);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone12);
        boolean boolean15 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        mutableDateTime18.addDays(100);
        mutableDateTime18.setWeekyear(0);
        int int23 = mutableDateTime18.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime26.toMutableDateTime(dateTimeZone32);
        long long36 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.MutableDateTime mutableDateTime37 = property24.roundHalfCeiling();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology39);
        mutableDateTime40.addMillis((int) 'a');
        int int43 = mutableDateTime40.getYearOfCentury();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.Instant instant47 = mutableDateTime46.toInstant();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime49 = property48.roundHalfFloor();
        java.lang.String str50 = mutableDateTime49.toString();
        mutableDateTime49.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime49.toMutableDateTime();
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = mutableDateTime56.toString(dateTimeFormatter57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        mutableDateTime56.add(readablePeriod59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime56.hourOfDay();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime56.era();
        org.joda.time.MutableDateTime mutableDateTime63 = property62.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property62.getFieldType();
        int int65 = mutableDateTime49.get(dateTimeFieldType64);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime40.property(dateTimeFieldType64);
        int int67 = mutableDateTime37.get(dateTimeFieldType64);
        mutableDateTime14.set(dateTimeFieldType64, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant47", (mutableDateTime11.compareTo(instant47) == 0) == mutableDateTime11.equals(instant47));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        boolean boolean6 = mutableDateTime5.isEqualNow();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.weekyear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundCeiling();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.hourOfDay();
        int int16 = mutableDateTime12.getMillisOfDay();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = mutableDateTime12.toDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9, dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getCenturyOfEra();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        java.lang.String str10 = mutableDateTime9.toString();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.weekOfWeekyear();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime13);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.DateTime dateTime24 = mutableDateTime13.toDateTime(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime18", (instant7.compareTo(mutableDateTime18) == 0) == instant7.equals(mutableDateTime18));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone12);
        mutableDateTime6.setZone(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime6.monthOfYear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone22);
        mutableDateTime6.setZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = mutableDateTime2.toDateTime(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        mutableDateTime9.addDays(100);
        mutableDateTime9.add((long) '4');
        boolean boolean14 = mutableDateTime6.isEqual((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfFloor();
        java.lang.String str21 = mutableDateTime20.toString();
        mutableDateTime20.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime20.toMutableDateTime();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime27.era();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        int int36 = mutableDateTime20.get(dateTimeFieldType35);
        int int37 = mutableDateTime6.get(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime2.property(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant18", (mutableDateTime6.compareTo(instant18) == 0) == mutableDateTime6.equals(instant18));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime5.toMutableDateTimeISO();
        int int8 = mutableDateTime5.getYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone13);
        mutableDateTime5.setZoneRetainFields(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        int int11 = mutableDateTime8.getYearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.yearOfCentury();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property12.getAsText(locale13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime11.addDays(3);
        mutableDateTime11.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.add((long) 4);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        int int26 = mutableDateTime21.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField29 = property27.getField();
        org.joda.time.MutableDateTime mutableDateTime30 = property27.roundHalfFloor();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        mutableDateTime30.setZoneRetainFields(dateTimeZone34);
        mutableDateTime18.setZone(dateTimeZone34);
        boolean boolean37 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        int int11 = mutableDateTime5.getRoundingMode();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        mutableDateTime14.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.hourOfDay();
        int int18 = mutableDateTime14.getMillisOfDay();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = mutableDateTime14.toDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime27 = mutableDateTime5.toDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfYear();
        boolean boolean9 = property7.equals((java.lang.Object) ' ');
        org.joda.time.MutableDateTime mutableDateTime11 = property7.add((long) 0);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        java.lang.String str18 = mutableDateTime17.toString();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime17.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property20.getFieldType();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        mutableDateTime24.setSecondOfDay((int) '#');
        boolean boolean28 = property20.equals((java.lang.Object) mutableDateTime24);
        boolean boolean29 = property7.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant15", (mutableDateTime3.compareTo(instant15) == 0) == mutableDateTime3.equals(instant15));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.addSeconds((int) (short) 10);
        mutableDateTime2.setMinuteOfDay(103);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.DateTime dateTime13 = mutableDateTime11.toDateTimeISO();
        int int14 = mutableDateTime11.getSecondOfDay();
        mutableDateTime11.addMinutes((int) (short) 100);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        int int21 = mutableDateTime19.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = mutableDateTime19.isSupported(dateTimeFieldType22);
        java.lang.Object obj24 = mutableDateTime19.clone();
        org.joda.time.Chronology chronology25 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime11, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime2.toMutableDateTime(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.weekyear();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTime dateTime16 = mutableDateTime2.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        boolean boolean8 = mutableDateTime2.isBefore((long) (short) 1);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology16);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime2.toMutableDateTime(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.add((long) (byte) 1);
        boolean boolean18 = mutableDateTime12.isBefore((long) (short) 1);
        boolean boolean19 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime5.toMutableDateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMillisOfSecond(4);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        mutableDateTime5.add(98L);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        int int13 = mutableDateTime11.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = mutableDateTime11.isSupported(dateTimeFieldType14);
        java.lang.Object obj16 = mutableDateTime11.clone();
        org.joda.time.Chronology chronology17 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        mutableDateTime5.setChronology(chronology17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime1.toMutableDateTime(chronology17);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology28);
        mutableDateTime29.addMillis((int) 'a');
        int int32 = mutableDateTime29.getYearOfCentury();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfFloor();
        java.lang.String str39 = mutableDateTime38.toString();
        mutableDateTime38.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime38.toMutableDateTime();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime45.add(readablePeriod48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.hourOfDay();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime45.era();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property51.getFieldType();
        int int54 = mutableDateTime38.get(dateTimeFieldType53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime29.property(dateTimeFieldType53);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime24.property(dateTimeFieldType53);
        int int57 = mutableDateTime1.get(dateTimeFieldType53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant25", (mutableDateTime11.compareTo(instant25) == 0) == mutableDateTime11.equals(instant25));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.weekyear();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.addYears(366);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) (short) 100);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        mutableDateTime10.setZone(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime10.add(readableDuration16, 26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMillisOfSecond(4);
        mutableDateTime1.setDate((long) 10);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime7.addDays(3);
        int int10 = mutableDateTime7.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime7.toMutableDateTime();
        int int12 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime7);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundCeiling();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property17.getAsText(locale19);
        org.joda.time.DateTimeField dateTimeField21 = property17.getField();
        org.joda.time.MutableDateTime mutableDateTime23 = property17.add((long) (short) 100);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.getMutableDateTime();
        int int26 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfYear();
        mutableDateTime29.add(98L);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        int int37 = mutableDateTime35.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        boolean boolean39 = mutableDateTime35.isSupported(dateTimeFieldType38);
        java.lang.Object obj40 = mutableDateTime35.clone();
        org.joda.time.Chronology chronology41 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(chronology41);
        mutableDateTime29.setChronology(chronology41);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (short) -1, chronology41);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(chronology41);
        org.joda.time.DateTime dateTime47 = mutableDateTime25.toDateTime(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime35", (instant16.compareTo(mutableDateTime35) == 0) == instant16.equals(mutableDateTime35));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.secondOfMinute();
        mutableDateTime11.setDayOfWeek(3);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundCeiling();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property19.getAsText(locale21);
        org.joda.time.DateTimeField dateTimeField23 = property19.getField();
        org.joda.time.MutableDateTime mutableDateTime25 = property19.add((long) (short) 100);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime25.toMutableDateTimeISO();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        mutableDateTime30.addMillis((int) 'a');
        int int33 = mutableDateTime30.getDayOfYear();
        java.util.Date date34 = mutableDateTime30.toDate();
        int int35 = mutableDateTime30.getMinuteOfHour();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundCeiling();
        java.util.Locale locale42 = null;
        java.lang.String str43 = property40.getAsText(locale42);
        org.joda.time.DateTimeField dateTimeField44 = property40.getField();
        mutableDateTime30.setRounding(dateTimeField44, (int) (byte) 0);
        int int47 = mutableDateTime25.get(dateTimeField44);
        mutableDateTime11.setRounding(dateTimeField44);
        mutableDateTime4.setRounding(dateTimeField44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant9", (mutableDateTime2.compareTo(instant9) == 0) == mutableDateTime2.equals(instant9));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        mutableDateTime19.addWeeks(10);
        org.joda.time.DateTime dateTime26 = mutableDateTime19.toDateTimeISO();
        mutableDateTime19.addMinutes((int) (byte) 1);
        boolean boolean29 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime9.setSecondOfDay(29);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime9.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        mutableDateTime1.add(98L);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        int int9 = mutableDateTime7.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = mutableDateTime7.isSupported(dateTimeFieldType10);
        java.lang.Object obj12 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology13 = mutableDateTime7.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        mutableDateTime1.setChronology(chronology13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (short) -1, chronology13);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime17, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        mutableDateTime30.addDays(100);
        mutableDateTime30.add((long) '4');
        boolean boolean35 = mutableDateTime27.isEqual((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundHalfFloor();
        java.lang.String str42 = mutableDateTime41.toString();
        mutableDateTime41.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime41.toMutableDateTime();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableDateTime48.add(readablePeriod51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.hourOfDay();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime48.era();
        org.joda.time.MutableDateTime mutableDateTime55 = property54.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property54.getFieldType();
        int int57 = mutableDateTime41.get(dateTimeFieldType56);
        int int58 = mutableDateTime27.get(dateTimeFieldType56);
        boolean boolean59 = mutableDateTime26.isSupported(dateTimeFieldType56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant39", (mutableDateTime7.compareTo(instant39) == 0) == mutableDateTime7.equals(instant39));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        mutableDateTime2.addDays(100);
        mutableDateTime2.setWeekyear(0);
        int int7 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime10.toMutableDateTime(dateTimeZone16);
        long long20 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime mutableDateTime21 = property8.roundHalfCeiling();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        mutableDateTime24.addMillis((int) 'a');
        int int27 = mutableDateTime24.getYearOfCentury();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.Instant instant31 = mutableDateTime30.toInstant();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfFloor();
        java.lang.String str34 = mutableDateTime33.toString();
        mutableDateTime33.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime33.toMutableDateTime();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.era();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property46.getFieldType();
        int int49 = mutableDateTime33.get(dateTimeFieldType48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime24.property(dateTimeFieldType48);
        int int51 = mutableDateTime21.get(dateTimeFieldType48);
        java.lang.Class<?> wildcardClass52 = dateTimeFieldType48.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant31", (mutableDateTime15.compareTo(instant31) == 0) == mutableDateTime15.equals(instant31));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        boolean boolean8 = property4.isLeap();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj19 = mutableDateTime18.clone();
        mutableDateTime18.addWeekyears(100);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime18.hourOfDay();
        mutableDateTime18.addDays(2020);
        int int25 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        boolean boolean13 = mutableDateTime12.isEqualNow();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.weekyear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime19.addDays(3);
        mutableDateTime19.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.secondOfDay();
        java.util.Locale locale25 = null;
        int int26 = property24.getMaximumShortTextLength(locale25);
        org.joda.time.MutableDateTime mutableDateTime27 = property24.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField28 = property24.getField();
        int int29 = mutableDateTime16.get(dateTimeField28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant10", (mutableDateTime3.compareTo(instant10) == 0) == mutableDateTime3.equals(instant10));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfCentury();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfCentury();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.minuteOfHour();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        mutableDateTime6.setSecondOfDay((int) '#');
        mutableDateTime6.addSeconds((int) (short) 10);
        mutableDateTime6.setMinuteOfDay(103);
        long long14 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant7", (mutableDateTime0.compareTo(instant7) == 0) == mutableDateTime0.equals(instant7));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        int int11 = mutableDateTime8.getYearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add((long) 3);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime16.addDays(3);
        mutableDateTime16.setMillis((long) 1);
        int int21 = mutableDateTime16.getWeekyear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        mutableDateTime24.addMillis((int) 'a');
        int int27 = mutableDateTime24.getDayOfYear();
        java.util.Date date28 = mutableDateTime24.toDate();
        int int29 = mutableDateTime24.getMinuteOfHour();
        java.util.Locale locale30 = null;
        java.util.Calendar calendar31 = mutableDateTime24.toCalendar(locale30);
        boolean boolean32 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime24.toMutableDateTime(chronology39);
        int int41 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        long long42 = mutableDateTime14.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        mutableDateTime19.addWeeks(10);
        org.joda.time.DateTime dateTime26 = mutableDateTime19.toDateTimeISO();
        mutableDateTime19.addMinutes((int) (byte) 1);
        boolean boolean29 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        int int33 = mutableDateTime32.getCenturyOfEra();
        mutableDateTime32.setYear((int) '4');
        int int36 = mutableDateTime32.getDayOfYear();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.minuteOfDay();
        boolean boolean38 = mutableDateTime19.equals((java.lang.Object) mutableDateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        mutableDateTime8.addDays(100);
        mutableDateTime8.setWeekyear(0);
        int int13 = mutableDateTime8.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime16.toMutableDateTime(dateTimeZone22);
        long long26 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime mutableDateTime27 = property14.roundHalfCeiling();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        mutableDateTime30.addMillis((int) 'a');
        int int33 = mutableDateTime30.getYearOfCentury();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundHalfFloor();
        java.lang.String str40 = mutableDateTime39.toString();
        mutableDateTime39.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime39.toMutableDateTime();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime46.add(readablePeriod49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.hourOfDay();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime46.era();
        org.joda.time.MutableDateTime mutableDateTime53 = property52.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property52.getFieldType();
        int int55 = mutableDateTime39.get(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime30.property(dateTimeFieldType54);
        int int57 = mutableDateTime27.get(dateTimeFieldType54);
        int int58 = mutableDateTime2.get(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime2.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant37", (mutableDateTime21.compareTo(instant37) == 0) == mutableDateTime21.equals(instant37));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTime dateTime3 = mutableDateTime1.toDateTimeISO();
        int int4 = mutableDateTime1.getSecondOfDay();
        mutableDateTime1.addMinutes((int) (short) 100);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        int int11 = mutableDateTime9.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = mutableDateTime9.isSupported(dateTimeFieldType12);
        java.lang.Object obj14 = mutableDateTime9.clone();
        org.joda.time.Chronology chronology15 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, chronology15);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        java.lang.String str23 = mutableDateTime22.toString();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime22.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        boolean boolean27 = mutableDateTime16.isSupported(dateTimeFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant20", (mutableDateTime9.compareTo(instant20) == 0) == mutableDateTime9.equals(instant20));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology6);
        java.lang.Object obj10 = mutableDateTime9.clone();
        mutableDateTime9.addWeekyears(100);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.hourOfDay();
        mutableDateTime9.addDays(2020);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.era();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime18.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime18.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone32);
        mutableDateTime27.setZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar39 = mutableDateTime38.toGregorianCalendar();
        org.joda.time.DateTime dateTime40 = mutableDateTime38.toDateTimeISO();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundHalfFloor();
        java.lang.String str47 = mutableDateTime46.toString();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime46.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property49.getFieldType();
        boolean boolean51 = mutableDateTime38.isSupported(dateTimeFieldType50);
        mutableDateTime27.set(dateTimeFieldType50, 29);
        int int54 = mutableDateTime9.get(dateTimeFieldType50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant44", (mutableDateTime2.compareTo(instant44) == 0) == mutableDateTime2.equals(instant44));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        int int11 = mutableDateTime8.getYearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.yearOfCentury();
        boolean boolean13 = mutableDateTime8.isEqualNow();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        mutableDateTime10.setSecondOfMinute((int) '4');
        mutableDateTime10.setMinuteOfDay((int) (short) 10);
        mutableDateTime10.addWeeks(5);
        java.lang.String str17 = mutableDateTime10.toString();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.minuteOfHour();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime10.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime27 = mutableDateTime2.toDateTime(dateTimeZone23);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.Instant instant31 = mutableDateTime30.toInstant();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.monthOfYear();
        mutableDateTime30.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.yearOfCentury();
        org.joda.time.DurationField durationField36 = property35.getLeapDurationField();
        org.joda.time.DateTimeField dateTimeField37 = property35.getField();
        mutableDateTime2.setRounding(dateTimeField37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and instant31", (mutableDateTime22.compareTo(instant31) == 0) == mutableDateTime22.equals(instant31));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        int int9 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime12 = property4.add(330);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = property4.roundHalfFloor();
        mutableDateTime14.setMillis((long) 39);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        mutableDateTime19.add(98L);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        int int27 = mutableDateTime25.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = mutableDateTime25.isSupported(dateTimeFieldType28);
        java.lang.Object obj30 = mutableDateTime25.clone();
        org.joda.time.Chronology chronology31 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(chronology31);
        mutableDateTime19.setChronology(chronology31);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 39, chronology31);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 100, chronology31);
        mutableDateTime14.setChronology(chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime25", (instant3.compareTo(mutableDateTime25) == 0) == instant3.equals(mutableDateTime25));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) (short) 100);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime10.toMutableDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.addMillis((int) 'a');
        int int18 = mutableDateTime15.getDayOfYear();
        java.util.Date date19 = mutableDateTime15.toDate();
        int int20 = mutableDateTime15.getMinuteOfHour();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundCeiling();
        java.util.Locale locale27 = null;
        java.lang.String str28 = property25.getAsText(locale27);
        org.joda.time.DateTimeField dateTimeField29 = property25.getField();
        mutableDateTime15.setRounding(dateTimeField29, (int) (byte) 0);
        int int32 = mutableDateTime10.get(dateTimeField29);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology39);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime10.toMutableDateTime(chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setDayOfYear(3);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.yearOfCentury();
        int int10 = mutableDateTime5.getYear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTime dateTime21 = mutableDateTime16.toDateTime(dateTimeZone20);
        mutableDateTime5.setZoneRetainFields(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        mutableDateTime5.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime5.copy();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        mutableDateTime11.addDays(100);
        mutableDateTime11.setWeekyear(0);
        int int16 = mutableDateTime11.getCenturyOfEra();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.era();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime19.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime19.dayOfYear();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        int int35 = mutableDateTime30.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfEven();
        int int38 = property27.getDifference((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.DateTimeField dateTimeField39 = property27.getField();
        mutableDateTime11.setRounding(dateTimeField39);
        int int41 = mutableDateTime8.get(dateTimeField39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        int int12 = mutableDateTime10.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = mutableDateTime10.isSupported(dateTimeFieldType13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.getMutableDateTime();
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.add(98L);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime8.isSupported(dateTimeFieldType11);
        java.lang.Object obj13 = mutableDateTime8.clone();
        org.joda.time.Chronology chronology14 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        mutableDateTime2.setChronology(chronology14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (short) -1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(1589334420962L, chronology14);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:41.051Z");
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        mutableDateTime25.addMillis((int) 'a');
        int int28 = mutableDateTime25.getYearOfCentury();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfFloor();
        java.lang.String str35 = mutableDateTime34.toString();
        mutableDateTime34.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime34.toMutableDateTime();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime41.add(readablePeriod44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.hourOfDay();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime41.era();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property47.getFieldType();
        int int50 = mutableDateTime34.get(dateTimeFieldType49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime25.property(dateTimeFieldType49);
        boolean boolean52 = mutableDateTime22.isSupported(dateTimeFieldType49);
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.Instant instant56 = mutableDateTime55.toInstant();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime55.monthOfYear();
        mutableDateTime55.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime55.yearOfCentury();
        mutableDateTime55.setHourOfDay((int) (byte) 0);
        java.util.Date date63 = mutableDateTime55.toDate();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology65);
        mutableDateTime66.addMillis((int) 'a');
        int int69 = mutableDateTime66.getDayOfYear();
        java.util.Date date70 = mutableDateTime66.toDate();
        int int71 = mutableDateTime66.getMinuteOfHour();
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.Instant instant75 = mutableDateTime74.toInstant();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime74.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime77 = property76.roundCeiling();
        java.util.Locale locale78 = null;
        java.lang.String str79 = property76.getAsText(locale78);
        org.joda.time.DateTimeField dateTimeField80 = property76.getField();
        mutableDateTime66.setRounding(dateTimeField80, (int) (byte) 0);
        int int83 = mutableDateTime55.get(dateTimeField80);
        mutableDateTime22.setRounding(dateTimeField80);
        mutableDateTime20.setRounding(dateTimeField80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant32", (mutableDateTime8.compareTo(instant32) == 0) == mutableDateTime8.equals(instant32));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.weekyear();
        mutableDateTime8.setMonthOfYear((int) (short) 10);
        mutableDateTime8.setMillis((long) 336);
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime8.setWeekyear(98);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime25.toMutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime36 = mutableDateTime23.toDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime8.toMutableDateTime(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.year();
        java.lang.String str6 = property5.getAsString();
        org.joda.time.MutableDateTime mutableDateTime8 = property5.set(19);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        java.lang.String str15 = mutableDateTime14.toString();
        mutableDateTime14.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime14.toMutableDateTime();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.era();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property27.getFieldType();
        int int30 = mutableDateTime14.get(dateTimeFieldType29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime8.property(dateTimeFieldType29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant12", (mutableDateTime2.compareTo(instant12) == 0) == mutableDateTime2.equals(instant12));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        mutableDateTime19.addWeeks(10);
        org.joda.time.DateTime dateTime26 = mutableDateTime19.toDateTimeISO();
        mutableDateTime19.addMinutes((int) (byte) 1);
        boolean boolean29 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime19.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundCeiling();
        boolean boolean10 = mutableDateTime8.isBefore((long) 0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.hourOfDay();
        int int17 = mutableDateTime13.getMillisOfDay();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = mutableDateTime13.toDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime27.setMillisOfSecond(4);
        mutableDateTime27.setDate((long) 10);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime33.addDays(3);
        int int36 = mutableDateTime33.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime33.toMutableDateTime();
        int int38 = mutableDateTime27.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.DateTime dateTime39 = mutableDateTime27.toDateTime();
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime27.add(readableDuration40);
        mutableDateTime27.setMillisOfSecond((int) (byte) 0);
        int int44 = mutableDateTime27.getDayOfYear();
        boolean boolean45 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime27);
        boolean boolean46 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        int int7 = mutableDateTime2.getMinuteOfHour();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundCeiling();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property12.getAsText(locale14);
        org.joda.time.DateTimeField dateTimeField16 = property12.getField();
        mutableDateTime2.setRounding(dateTimeField16, (int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime20.setMillisOfSecond(4);
        mutableDateTime20.setDate((long) 10);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime26.addDays(3);
        int int29 = mutableDateTime26.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime26.toMutableDateTime();
        int int31 = mutableDateTime20.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        mutableDateTime35.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.yearOfCentury();
        int int41 = mutableDateTime35.getMinuteOfHour();
        int int42 = mutableDateTime35.getRoundingMode();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = property45.getField();
        int int47 = mutableDateTime2.get(dateTimeField46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime44", (instant11.compareTo(mutableDateTime44) == 0) == instant11.equals(mutableDateTime44));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        boolean boolean6 = mutableDateTime5.isEqualNow();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property11.getAsText(locale13);
        boolean boolean15 = property11.isLeap();
        org.joda.time.MutableDateTime mutableDateTime16 = property11.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime17 = property11.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property11.getFieldType();
        boolean boolean19 = mutableDateTime5.isSupported(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone26);
        mutableDateTime20.setZone(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime20.monthOfYear();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone36);
        mutableDateTime20.setZoneRetainFields(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime5.toMutableDateTime(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime5, dateTimeZone7);
        int int9 = mutableDateTime8.getSecondOfDay();
        java.lang.Object obj10 = mutableDateTime8.clone();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime8.toMutableDateTime(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        boolean boolean6 = mutableDateTime2.isBeforeNow();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone11);
        mutableDateTime12.addHours(20);
        org.joda.time.DateTime dateTime15 = mutableDateTime12.toDateTime();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundCeiling();
        boolean boolean10 = mutableDateTime8.isBefore((long) 0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.hourOfDay();
        int int17 = mutableDateTime13.getMillisOfDay();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = mutableDateTime13.toDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime27.setMillisOfSecond(4);
        mutableDateTime27.setDate((long) 10);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime33.addDays(3);
        int int36 = mutableDateTime33.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime33.toMutableDateTime();
        int int38 = mutableDateTime27.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.DateTime dateTime39 = mutableDateTime27.toDateTime();
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime27.add(readableDuration40);
        mutableDateTime27.setMillisOfSecond((int) (byte) 0);
        int int44 = mutableDateTime27.getDayOfYear();
        boolean boolean45 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime27);
        boolean boolean46 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.dayOfYear();
        mutableDateTime48.add(98L);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.DateTimeZone dateTimeZone55 = mutableDateTime54.getZone();
        int int56 = mutableDateTime54.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        boolean boolean58 = mutableDateTime54.isSupported(dateTimeFieldType57);
        java.lang.Object obj59 = mutableDateTime54.clone();
        org.joda.time.Chronology chronology60 = mutableDateTime54.getChronology();
        org.joda.time.MutableDateTime mutableDateTime61 = org.joda.time.MutableDateTime.now(chronology60);
        mutableDateTime48.setChronology(chronology60);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(chronology60);
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) (short) -1, chronology60);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime68.getZone();
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime71 = org.joda.time.MutableDateTime.now(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime72 = org.joda.time.MutableDateTime.now(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime64, dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime27, dateTimeZone69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = mutableDateTime2.isSupported(dateTimeFieldType5);
        java.lang.Object obj7 = mutableDateTime2.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime2.getChronology();
        int int9 = mutableDateTime2.getWeekyear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.add((long) (byte) 1);
        int int17 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime12.addMillis(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setHourOfDay((int) (byte) 0);
        java.util.Date date10 = mutableDateTime2.toDate();
        mutableDateTime2.setTime(5449550743L);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        int int17 = mutableDateTime15.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = mutableDateTime15.isSupported(dateTimeFieldType18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.getMutableDateTime();
        int int22 = mutableDateTime21.getYear();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        mutableDateTime7.add(98L);
        boolean boolean12 = mutableDateTime7.isEqual((long) 5);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime7.toMutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime5.toMutableDateTime(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        int int11 = mutableDateTime8.getYearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add((long) 3);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime16.addDays(3);
        mutableDateTime16.setMillis((long) 1);
        int int21 = mutableDateTime16.getWeekyear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        mutableDateTime24.addMillis((int) 'a');
        int int27 = mutableDateTime24.getDayOfYear();
        java.util.Date date28 = mutableDateTime24.toDate();
        int int29 = mutableDateTime24.getMinuteOfHour();
        java.util.Locale locale30 = null;
        java.util.Calendar calendar31 = mutableDateTime24.toCalendar(locale30);
        boolean boolean32 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime24.toMutableDateTime(chronology39);
        int int41 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        int int42 = mutableDateTime14.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        int int11 = mutableDateTime8.getYearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add((long) 3);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime16.addDays(3);
        mutableDateTime16.setMillis((long) 1);
        int int21 = mutableDateTime16.getWeekyear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        mutableDateTime24.addMillis((int) 'a');
        int int27 = mutableDateTime24.getDayOfYear();
        java.util.Date date28 = mutableDateTime24.toDate();
        int int29 = mutableDateTime24.getMinuteOfHour();
        java.util.Locale locale30 = null;
        java.util.Calendar calendar31 = mutableDateTime24.toCalendar(locale30);
        boolean boolean32 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime24.toMutableDateTime(chronology39);
        int int41 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime40.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone5);
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime7.toGregorianCalendar();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        mutableDateTime11.addDays(100);
        mutableDateTime11.setWeekyear(0);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundCeiling();
        java.util.Locale locale22 = null;
        java.lang.String str23 = property20.getAsText(locale22);
        org.joda.time.DateTimeField dateTimeField24 = property20.getField();
        org.joda.time.MutableDateTime mutableDateTime26 = property20.add((long) (short) 100);
        java.lang.String str27 = mutableDateTime26.toString();
        boolean boolean28 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime26);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.era();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime26.property(dateTimeFieldType39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime7.property(dateTimeFieldType39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant19", (mutableDateTime4.compareTo(instant19) == 0) == mutableDateTime4.equals(instant19));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone16);
        mutableDateTime11.setZone(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime22.toGregorianCalendar();
        org.joda.time.DateTime dateTime24 = mutableDateTime22.toDateTimeISO();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfFloor();
        java.lang.String str31 = mutableDateTime30.toString();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime30.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        boolean boolean35 = mutableDateTime22.isSupported(dateTimeFieldType34);
        mutableDateTime11.set(dateTimeFieldType34, 29);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime11.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant28", (mutableDateTime15.compareTo(instant28) == 0) == mutableDateTime15.equals(instant28));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.secondOfMinute();
        mutableDateTime5.setDayOfWeek(3);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone15);
        mutableDateTime9.setZone(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime9.monthOfYear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone25);
        mutableDateTime9.setZoneRetainFields(dateTimeZone25);
        mutableDateTime5.setZoneRetainFields(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        int int9 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime12 = property4.add(330);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = property4.roundHalfFloor();
        org.joda.time.Chronology chronology15 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime17.addDays(3);
        mutableDateTime17.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.secondOfDay();
        int int23 = mutableDateTime17.getYearOfCentury();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime17, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        mutableDateTime14.setTime((org.joda.time.ReadableInstant) mutableDateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTimeISO();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.era();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime13.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        mutableDateTime22.setZone(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime33.toGregorianCalendar();
        org.joda.time.DateTime dateTime35 = mutableDateTime33.toDateTimeISO();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundHalfFloor();
        java.lang.String str42 = mutableDateTime41.toString();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime41.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property44.getFieldType();
        boolean boolean46 = mutableDateTime33.isSupported(dateTimeFieldType45);
        mutableDateTime22.set(dateTimeFieldType45, 29);
        boolean boolean49 = mutableDateTime10.isSupported(dateTimeFieldType45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime26", (instant3.compareTo(mutableDateTime26) == 0) == instant3.equals(mutableDateTime26));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTime(dateTimeZone19);
        int int21 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        java.lang.String str28 = mutableDateTime27.toString();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime27.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        boolean boolean32 = mutableDateTime15.isSupported(dateTimeFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant25", (mutableDateTime18.compareTo(instant25) == 0) == mutableDateTime18.equals(instant25));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone5);
        mutableDateTime6.addHours(20);
        boolean boolean9 = mutableDateTime6.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        mutableDateTime10.add(98L);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = mutableDateTime16.isSupported(dateTimeFieldType19);
        java.lang.Object obj21 = mutableDateTime16.clone();
        org.joda.time.Chronology chronology22 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        mutableDateTime10.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology22);
        mutableDateTime6.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 38, chronology22);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.Instant instant31 = mutableDateTime30.toInstant();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundCeiling();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property32.getAsText(locale34);
        org.joda.time.DateTimeField dateTimeField36 = property32.getField();
        int int37 = property32.get();
        org.joda.time.MutableDateTime mutableDateTime38 = property32.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime40 = property32.add(330);
        org.joda.time.MutableDateTime mutableDateTime41 = property32.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime42 = property32.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.weekyear();
        mutableDateTime27.setDate((org.joda.time.ReadableInstant) mutableDateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant31", (mutableDateTime4.compareTo(instant31) == 0) == mutableDateTime4.equals(instant31));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfCentury();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfCentury();
        org.joda.time.Instant instant3 = mutableDateTime0.toInstant();
        int int4 = mutableDateTime0.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime6.addDays(3);
        mutableDateTime6.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.secondOfDay();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.roundHalfFloor();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        mutableDateTime16.addDays(100);
        mutableDateTime16.add((long) '4');
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.yearOfEra();
        boolean boolean22 = mutableDateTime16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        mutableDateTime24.add(98L);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        int int32 = mutableDateTime30.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = mutableDateTime30.isSupported(dateTimeFieldType33);
        java.lang.Object obj35 = mutableDateTime30.clone();
        org.joda.time.Chronology chronology36 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology36);
        mutableDateTime24.setChronology(chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (short) -1, chronology36);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology36);
        mutableDateTime16.setChronology(chronology36);
        org.joda.time.DateTime dateTime43 = mutableDateTime13.toDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime0.toMutableDateTime(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        java.lang.String str12 = mutableDateTime11.toString();
        mutableDateTime11.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.toMutableDateTime();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.era();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        int int27 = mutableDateTime11.get(dateTimeFieldType26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime2.property(dateTimeFieldType26);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology30);
        mutableDateTime31.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime31.hourOfDay();
        int int35 = mutableDateTime31.getMillisOfDay();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = mutableDateTime31.toDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone40);
        mutableDateTime2.setZone(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime39", (instant9.compareTo(mutableDateTime39) == 0) == instant9.equals(mutableDateTime39));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        mutableDateTime2.addDays(100);
        mutableDateTime2.setWeekyear(0);
        int int7 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        mutableDateTime11.add(98L);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = mutableDateTime17.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = mutableDateTime17.isSupported(dateTimeFieldType20);
        java.lang.Object obj22 = mutableDateTime17.clone();
        org.joda.time.Chronology chronology23 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology23);
        mutableDateTime11.setChronology(chronology23);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 39, chronology23);
        org.joda.time.DateTime dateTime28 = mutableDateTime2.toDateTime(chronology23);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundCeiling();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property33.getAsText(locale35);
        boolean boolean37 = property33.isLeap();
        org.joda.time.MutableDateTime mutableDateTime38 = property33.getMutableDateTime();
        mutableDateTime38.setMonthOfYear(9);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        mutableDateTime43.addDays(100);
        mutableDateTime43.setWeekyear(0);
        int int48 = mutableDateTime43.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.DateTimeZone dateTimeZone57 = mutableDateTime56.getZone();
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone57);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone57);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime51.toMutableDateTime(dateTimeZone57);
        long long61 = property49.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime60);
        boolean boolean62 = mutableDateTime38.isAfter((org.joda.time.ReadableInstant) mutableDateTime60);
        boolean boolean63 = dateTime28.isEqual((org.joda.time.ReadableInstant) mutableDateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant32", (mutableDateTime17.compareTo(instant32) == 0) == mutableDateTime17.equals(instant32));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime1.addDays(3);
        mutableDateTime1.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.monthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        int int13 = mutableDateTime12.getDayOfYear();
        java.util.Date date14 = mutableDateTime12.toDate();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone19);
        mutableDateTime12.setZoneRetainFields(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime1.toMutableDateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime18", (instant10.compareTo(mutableDateTime18) == 0) == instant10.equals(mutableDateTime18));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        mutableDateTime2.addDays(100);
        mutableDateTime2.setWeekyear(0);
        int int7 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime10.toMutableDateTime(dateTimeZone16);
        long long20 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime mutableDateTime21 = property8.roundHalfCeiling();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        mutableDateTime24.addMillis((int) 'a');
        int int27 = mutableDateTime24.getYearOfCentury();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.Instant instant31 = mutableDateTime30.toInstant();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfFloor();
        java.lang.String str34 = mutableDateTime33.toString();
        mutableDateTime33.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime33.toMutableDateTime();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.era();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property46.getFieldType();
        int int49 = mutableDateTime33.get(dateTimeFieldType48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime24.property(dateTimeFieldType48);
        int int51 = mutableDateTime21.get(dateTimeFieldType48);
        int int52 = mutableDateTime21.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant31", (mutableDateTime15.compareTo(instant31) == 0) == mutableDateTime15.equals(instant31));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = mutableDateTime2.isSupported(dateTimeFieldType5);
        java.lang.Object obj7 = mutableDateTime2.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime2.getChronology();
        int int9 = mutableDateTime2.getWeekyear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.add((long) (byte) 1);
        int int17 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone16);
        mutableDateTime11.setZone(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime22.toGregorianCalendar();
        org.joda.time.DateTime dateTime24 = mutableDateTime22.toDateTimeISO();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfFloor();
        java.lang.String str31 = mutableDateTime30.toString();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime30.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        boolean boolean35 = mutableDateTime22.isSupported(dateTimeFieldType34);
        mutableDateTime11.set(dateTimeFieldType34, 29);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime11.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant28", (mutableDateTime15.compareTo(instant28) == 0) == mutableDateTime15.equals(instant28));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        mutableDateTime2.addWeeks(10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.hourOfDay();
        java.lang.String str10 = property9.getAsString();
        int int11 = property9.getMinimumValueOverall();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        mutableDateTime14.addDays(100);
        mutableDateTime14.setWeekyear(0);
        int int19 = mutableDateTime14.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime22.toMutableDateTime(dateTimeZone28);
        long long32 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.MutableDateTime mutableDateTime33 = property20.roundHalfCeiling();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology35);
        mutableDateTime36.addMillis((int) 'a');
        int int39 = mutableDateTime36.getYearOfCentury();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.Instant instant43 = mutableDateTime42.toInstant();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime42.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime45 = property44.roundHalfFloor();
        java.lang.String str46 = mutableDateTime45.toString();
        mutableDateTime45.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime45.toMutableDateTime();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.hourOfDay();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime52.era();
        org.joda.time.MutableDateTime mutableDateTime59 = property58.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property58.getFieldType();
        int int61 = mutableDateTime45.get(dateTimeFieldType60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime36.property(dateTimeFieldType60);
        int int63 = mutableDateTime33.get(dateTimeFieldType60);
        int int64 = property9.getDifference((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime27 and instant43", (mutableDateTime27.compareTo(instant43) == 0) == mutableDateTime27.equals(instant43));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        int int9 = property4.get();
        java.lang.String str10 = property4.toString();
        org.joda.time.MutableDateTime mutableDateTime12 = property4.add(0);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        int int20 = mutableDateTime15.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.dayOfYear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        mutableDateTime24.addDays(100);
        mutableDateTime24.add((long) '4');
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.addWrapField(19);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime31.add(readablePeriod32);
        boolean boolean34 = mutableDateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime31);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime31.toMutableDateTime(dateTimeZone39);
        int int42 = mutableDateTime31.getYearOfCentury();
        int int43 = mutableDateTime31.getMinuteOfDay();
        long long44 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        mutableDateTime19.addWeeks(10);
        org.joda.time.DateTime dateTime26 = mutableDateTime19.toDateTimeISO();
        mutableDateTime19.addMinutes((int) (byte) 1);
        boolean boolean29 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime19.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        boolean boolean6 = mutableDateTime5.isEqualNow();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.weekyear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.set(46);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime10.toMutableDateTime(chronology17);
        int int19 = mutableDateTime10.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTime dateTime3 = mutableDateTime1.toDateTimeISO();
        int int4 = mutableDateTime1.getSecondOfDay();
        mutableDateTime1.addMinutes((int) (short) 100);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        int int11 = mutableDateTime9.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = mutableDateTime9.isSupported(dateTimeFieldType12);
        java.lang.Object obj14 = mutableDateTime9.clone();
        org.joda.time.Chronology chronology15 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, chronology15);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        boolean boolean23 = mutableDateTime22.isEqualNow();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.weekyear();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime29 = property25.add((long) 3);
        org.joda.time.MutableDateTime mutableDateTime31 = property25.set(9);
        mutableDateTime31.addMonths((int) '4');
        boolean boolean34 = mutableDateTime1.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant20", (mutableDateTime9.compareTo(instant20) == 0) == mutableDateTime9.equals(instant20));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) (short) 100);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.era();
        int int20 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime13);
        mutableDateTime13.setSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        mutableDateTime25.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime25.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime25.millisOfSecond();
        int int30 = mutableDateTime25.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone37);
        mutableDateTime31.setZone(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime25, dateTimeZone37);
        mutableDateTime13.setZone(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime31", (instant3.compareTo(mutableDateTime31) == 0) == instant3.equals(mutableDateTime31));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        java.lang.String str12 = mutableDateTime11.toString();
        mutableDateTime11.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.toMutableDateTime();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.era();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        int int27 = mutableDateTime11.get(dateTimeFieldType26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime2.property(dateTimeFieldType26);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime2.hourOfDay();
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime2.add(readableDuration30);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime34.addDays(3);
        mutableDateTime34.setMillis((long) 1);
        int int39 = mutableDateTime34.getWeekyear();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology41);
        mutableDateTime42.addMillis((int) 'a');
        int int45 = mutableDateTime42.getDayOfYear();
        java.util.Date date46 = mutableDateTime42.toDate();
        int int47 = mutableDateTime42.getMinuteOfHour();
        java.util.Locale locale48 = null;
        java.util.Calendar calendar49 = mutableDateTime42.toCalendar(locale48);
        boolean boolean50 = mutableDateTime34.isBefore((org.joda.time.ReadableInstant) mutableDateTime42);
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = mutableDateTime53.toString(dateTimeFormatter54);
        int int56 = mutableDateTime53.getYearOfCentury();
        org.joda.time.Chronology chronology57 = mutableDateTime53.getChronology();
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime42.toMutableDateTime(chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(1589334420962L, chronology57);
        mutableDateTime2.setChronology(chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime53", (instant9.compareTo(mutableDateTime53) == 0) == instant9.equals(mutableDateTime53));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime1.addDays(3);
        mutableDateTime1.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfDay();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime1.toGregorianCalendar();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundCeiling();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfMonth();
        mutableDateTime13.setMillis((long) 21);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        java.lang.String str23 = mutableDateTime22.toString();
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime22.getZone();
        mutableDateTime13.setZoneRetainFields(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime1.toMutableDateTime(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime26", (instant11.compareTo(mutableDateTime26) == 0) == instant11.equals(mutableDateTime26));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:41.051Z");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now();
        mutableDateTime2.addWeekyears(48);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime6.addDays(3);
        int int9 = mutableDateTime6.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime6.toMutableDateTime();
        boolean boolean11 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        mutableDateTime12.add(98L);
        boolean boolean17 = mutableDateTime12.isEqual((long) 5);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime12.toMutableDateTime(dateTimeZone23);
        boolean boolean27 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean28 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime26);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.monthOfYear();
        mutableDateTime31.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.yearOfCentury();
        org.joda.time.DurationField durationField37 = property36.getLeapDurationField();
        org.joda.time.DateTimeField dateTimeField38 = property36.getField();
        mutableDateTime1.setRounding(dateTimeField38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and instant32", (mutableDateTime22.compareTo(instant32) == 0) == mutableDateTime22.equals(instant32));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone4);
        mutableDateTime5.addHours(20);
        int int8 = mutableDateTime5.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.yearOfCentury();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundCeiling();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property14.getAsText(locale16);
        org.joda.time.DateTimeField dateTimeField18 = property14.getField();
        int int19 = property14.get();
        org.joda.time.MutableDateTime mutableDateTime20 = property14.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime22 = property14.add(330);
        org.joda.time.MutableDateTime mutableDateTime23 = property14.getMutableDateTime();
        int int24 = mutableDateTime23.getRoundingMode();
        int int25 = property9.getDifference((org.joda.time.ReadableInstant) mutableDateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant13", (mutableDateTime3.compareTo(instant13) == 0) == mutableDateTime3.equals(instant13));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getDayOfYear();
        java.util.Date date7 = mutableDateTime5.toDate();
        java.util.Date date8 = mutableDateTime5.toDate();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        mutableDateTime11.setSecondOfMinute((int) '4');
        mutableDateTime11.setMinuteOfDay((int) (short) 10);
        mutableDateTime11.addWeeks(5);
        java.lang.String str18 = mutableDateTime11.toString();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.minuteOfHour();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime11.toMutableDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) date8, dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMillisOfSecond(4);
        mutableDateTime1.setDate((long) 10);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime7.addDays(3);
        int int10 = mutableDateTime7.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime7.toMutableDateTime();
        int int12 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.DateTime dateTime13 = mutableDateTime1.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.addMillis((int) 'a');
        int int20 = mutableDateTime17.getDayOfYear();
        java.util.Date date21 = mutableDateTime17.toDate();
        mutableDateTime17.addMinutes((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime17.add(readablePeriod24, (int) (byte) -1);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        int int31 = mutableDateTime29.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = mutableDateTime29.isSupported(dateTimeFieldType32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        mutableDateTime17.setRounding(dateTimeField35, 2);
        int int38 = mutableDateTime14.get(dateTimeField35);
        mutableDateTime14.add(10L);
        mutableDateTime14.setSecondOfDay(103);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology44);
        mutableDateTime45.addMillis((int) 'a');
        int int48 = mutableDateTime45.getDayOfYear();
        java.util.Date date49 = mutableDateTime45.toDate();
        mutableDateTime45.addMinutes((int) 'a');
        int int52 = mutableDateTime45.getCenturyOfEra();
        mutableDateTime14.setTime((org.joda.time.ReadableInstant) mutableDateTime45);
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.Instant instant57 = mutableDateTime56.toInstant();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime56.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime59 = property58.roundHalfFloor();
        java.lang.String str60 = mutableDateTime59.toString();
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime59.getZone();
        int int62 = mutableDateTime59.getMonthOfYear();
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) mutableDateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and instant57", (mutableDateTime29.compareTo(instant57) == 0) == mutableDateTime29.equals(instant57));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.weekyear();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        boolean boolean17 = mutableDateTime10.isBefore(10L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        int int6 = mutableDateTime5.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.weekyear();
        java.lang.String str10 = property9.toString();
        int int11 = property9.getMaximumValue();
        java.lang.String str12 = property9.toString();
        org.joda.time.MutableDateTime mutableDateTime13 = property9.getMutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology20);
        boolean boolean25 = mutableDateTime24.isAfterNow();
        int int26 = mutableDateTime24.getEra();
        org.joda.time.Chronology chronology27 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime13.toMutableDateTime(chronology27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime30.addDays(3);
        mutableDateTime30.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.secondOfDay();
        int int36 = mutableDateTime30.getYearOfCentury();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime30, dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime46 = mutableDateTime13.toDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime5.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.Object obj0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone7);
        mutableDateTime1.setZone(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj0, dateTimeZone7);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.secondOfMinute();
        mutableDateTime17.setDayOfWeek(3);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.era();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.monthOfYear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        int int30 = mutableDateTime25.getWeekOfWeekyear();
        mutableDateTime25.addWeekyears((int) (short) -1);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundCeiling();
        java.util.Locale locale39 = null;
        java.lang.String str40 = property37.getAsText(locale39);
        org.joda.time.DateTimeField dateTimeField41 = property37.getField();
        org.joda.time.MutableDateTime mutableDateTime43 = property37.add((long) (short) 100);
        java.lang.String str44 = mutableDateTime43.toString();
        boolean boolean45 = mutableDateTime43.isEqualNow();
        int int46 = mutableDateTime25.compareTo((org.joda.time.ReadableInstant) mutableDateTime43);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.Instant instant50 = mutableDateTime49.toInstant();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundHalfFloor();
        java.lang.String str53 = mutableDateTime52.toString();
        mutableDateTime52.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime52.toMutableDateTime();
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = null;
        java.lang.String str61 = mutableDateTime59.toString(dateTimeFormatter60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        mutableDateTime59.add(readablePeriod62);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime59.hourOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime59.era();
        org.joda.time.MutableDateTime mutableDateTime66 = property65.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property65.getFieldType();
        int int68 = mutableDateTime52.get(dateTimeFieldType67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime43.property(dateTimeFieldType67);
        boolean boolean70 = mutableDateTime17.isSupported(dateTimeFieldType67);
        java.lang.Object obj71 = null;
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(obj71, chronology72);
        org.joda.time.Instant instant74 = mutableDateTime73.toInstant();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime73.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime76 = property75.roundHalfFloor();
        java.lang.String str77 = mutableDateTime76.toString();
        mutableDateTime76.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime76.toMutableDateTime();
        java.lang.Object obj81 = null;
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime(obj81, chronology82);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = null;
        java.lang.String str85 = mutableDateTime83.toString(dateTimeFormatter84);
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        mutableDateTime83.add(readablePeriod86);
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime83.hourOfDay();
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime83.era();
        org.joda.time.MutableDateTime mutableDateTime90 = property89.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = property89.getFieldType();
        int int92 = mutableDateTime76.get(dateTimeFieldType91);
        boolean boolean93 = mutableDateTime17.isSupported(dateTimeFieldType91);
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant15", (mutableDateTime1.compareTo(instant15) == 0) == mutableDateTime1.equals(instant15));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        mutableDateTime1.add(98L);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        int int9 = mutableDateTime7.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = mutableDateTime7.isSupported(dateTimeFieldType10);
        java.lang.Object obj12 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology13 = mutableDateTime7.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        mutableDateTime1.setChronology(chronology13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (short) -1, chronology13);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime20.addDays(3);
        mutableDateTime20.setMillis((long) 1);
        int int25 = mutableDateTime20.getWeekyear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology27);
        mutableDateTime28.addMillis((int) 'a');
        int int31 = mutableDateTime28.getDayOfYear();
        java.util.Date date32 = mutableDateTime28.toDate();
        int int33 = mutableDateTime28.getMinuteOfHour();
        java.util.Locale locale34 = null;
        java.util.Calendar calendar35 = mutableDateTime28.toCalendar(locale34);
        boolean boolean36 = mutableDateTime20.isBefore((org.joda.time.ReadableInstant) mutableDateTime28);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime28.toMutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime18.toMutableDateTime(chronology43);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime18.dayOfWeek();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.Instant instant50 = mutableDateTime49.toInstant();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundHalfFloor();
        java.lang.String str53 = mutableDateTime52.toString();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime55.weekyear();
        mutableDateTime55.setMonthOfYear((int) (short) 10);
        mutableDateTime55.setMillis((long) 336);
        mutableDateTime52.setTime((org.joda.time.ReadableInstant) mutableDateTime55);
        long long62 = property46.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant50", (mutableDateTime7.compareTo(instant50) == 0) == mutableDateTime7.equals(instant50));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addWeekyears(48);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime4.addDays(3);
        int int7 = mutableDateTime4.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime4.toMutableDateTime();
        boolean boolean9 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        mutableDateTime10.add(98L);
        boolean boolean15 = mutableDateTime10.isEqual((long) 5);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime10.toMutableDateTime(dateTimeZone21);
        boolean boolean25 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundCeiling();
        boolean boolean32 = mutableDateTime31.isEqualNow();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundCeiling();
        java.util.Locale locale39 = null;
        java.lang.String str40 = property37.getAsText(locale39);
        boolean boolean41 = property37.isLeap();
        org.joda.time.MutableDateTime mutableDateTime42 = property37.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime43 = property37.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property37.getFieldType();
        boolean boolean45 = mutableDateTime31.isSupported(dateTimeFieldType44);
        int int46 = mutableDateTime24.get(dateTimeFieldType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant29", (mutableDateTime20.compareTo(instant29) == 0) == mutableDateTime20.equals(instant29));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.Object obj0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone7);
        mutableDateTime1.setZone(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj0, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        int int16 = mutableDateTime14.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime18.addDays(3);
        mutableDateTime18.addHours((int) (byte) 10);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.secondOfMinute();
        mutableDateTime28.setDayOfWeek(3);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime28.era();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.monthOfYear();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        int int39 = mutableDateTime36.getYearOfCentury();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        int int41 = mutableDateTime36.getWeekOfWeekyear();
        mutableDateTime36.addWeekyears((int) (short) -1);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.Instant instant47 = mutableDateTime46.toInstant();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime49 = property48.roundCeiling();
        java.util.Locale locale50 = null;
        java.lang.String str51 = property48.getAsText(locale50);
        org.joda.time.DateTimeField dateTimeField52 = property48.getField();
        org.joda.time.MutableDateTime mutableDateTime54 = property48.add((long) (short) 100);
        java.lang.String str55 = mutableDateTime54.toString();
        boolean boolean56 = mutableDateTime54.isEqualNow();
        int int57 = mutableDateTime36.compareTo((org.joda.time.ReadableInstant) mutableDateTime54);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.Instant instant61 = mutableDateTime60.toInstant();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime60.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime63 = property62.roundHalfFloor();
        java.lang.String str64 = mutableDateTime63.toString();
        mutableDateTime63.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime63.toMutableDateTime();
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = mutableDateTime70.toString(dateTimeFormatter71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        mutableDateTime70.add(readablePeriod73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime70.hourOfDay();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime70.era();
        org.joda.time.MutableDateTime mutableDateTime77 = property76.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property76.getFieldType();
        int int79 = mutableDateTime63.get(dateTimeFieldType78);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime54.property(dateTimeFieldType78);
        boolean boolean81 = mutableDateTime28.isSupported(dateTimeFieldType78);
        int int82 = mutableDateTime18.get(dateTimeFieldType78);
        boolean boolean83 = mutableDateTime14.isSupported(dateTimeFieldType78);
        int int84 = mutableDateTime12.get(dateTimeFieldType78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant26", (mutableDateTime1.compareTo(instant26) == 0) == mutableDateTime1.equals(instant26));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfYear();
        boolean boolean9 = property7.equals((java.lang.Object) ' ');
        org.joda.time.MutableDateTime mutableDateTime11 = property7.add(4);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        java.lang.Object obj13 = mutableDateTime11.clone();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundCeiling();
        boolean boolean20 = mutableDateTime19.isEqualNow();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.weekyear();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.millisOfDay();
        mutableDateTime19.addWeekyears(30);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone30);
        mutableDateTime19.setZoneRetainFields(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime11.toMutableDateTime(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant17", (mutableDateTime3.compareTo(instant17) == 0) == mutableDateTime3.equals(instant17));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.roundCeiling();
        org.joda.time.DurationField durationField9 = property4.getLeapDurationField();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18);
        int int20 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        boolean boolean13 = mutableDateTime12.isEqualNow();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.weekyear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundCeiling();
        java.util.Locale locale24 = null;
        java.lang.String str25 = property22.getAsText(locale24);
        org.joda.time.DateTimeField dateTimeField26 = property22.getField();
        org.joda.time.MutableDateTime mutableDateTime28 = property22.add((long) (short) 100);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.minuteOfHour();
        int int30 = property29.get();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.roundFloor();
        mutableDateTime31.addSeconds(292278993);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime31.centuryOfEra();
        boolean boolean35 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant10", (mutableDateTime3.compareTo(instant10) == 0) == mutableDateTime3.equals(instant10));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        boolean boolean6 = mutableDateTime5.isEqualNow();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.weekyear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.millisOfDay();
        mutableDateTime5.addWeekyears(30);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone16);
        mutableDateTime5.setZoneRetainFields(dateTimeZone16);
        mutableDateTime5.setSecondOfDay(57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfYear();
        boolean boolean9 = property7.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        org.joda.time.MutableDateTime mutableDateTime12 = property7.add((long) 6875);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.addMillis((int) 'a');
        int int18 = mutableDateTime15.getDayOfYear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        mutableDateTime21.addDays(100);
        mutableDateTime21.setWeekyear(0);
        int int26 = mutableDateTime21.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime29.toMutableDateTime(dateTimeZone35);
        long long39 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.MutableDateTime mutableDateTime40 = property27.roundHalfCeiling();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology42);
        mutableDateTime43.addMillis((int) 'a');
        int int46 = mutableDateTime43.getYearOfCentury();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.Instant instant50 = mutableDateTime49.toInstant();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundHalfFloor();
        java.lang.String str53 = mutableDateTime52.toString();
        mutableDateTime52.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime52.toMutableDateTime();
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = null;
        java.lang.String str61 = mutableDateTime59.toString(dateTimeFormatter60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        mutableDateTime59.add(readablePeriod62);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime59.hourOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime59.era();
        org.joda.time.MutableDateTime mutableDateTime66 = property65.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property65.getFieldType();
        int int68 = mutableDateTime52.get(dateTimeFieldType67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime43.property(dateTimeFieldType67);
        int int70 = mutableDateTime40.get(dateTimeFieldType67);
        int int71 = mutableDateTime15.get(dateTimeFieldType67);
        boolean boolean72 = mutableDateTime12.isSupported(dateTimeFieldType67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant50", (mutableDateTime3.compareTo(instant50) == 0) == mutableDateTime3.equals(instant50));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfYear();
        mutableDateTime0.add(98L);
        boolean boolean5 = mutableDateTime0.isEqual((long) 5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime0.toMutableDateTime(dateTimeZone11);
        int int15 = mutableDateTime0.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:41.051Z");
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        mutableDateTime20.addMillis((int) 'a');
        int int23 = mutableDateTime20.getYearOfCentury();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        java.lang.String str30 = mutableDateTime29.toString();
        mutableDateTime29.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime29.toMutableDateTime();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime36.era();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property42.getFieldType();
        int int45 = mutableDateTime29.get(dateTimeFieldType44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime20.property(dateTimeFieldType44);
        boolean boolean47 = mutableDateTime17.isSupported(dateTimeFieldType44);
        boolean boolean48 = mutableDateTime0.isSupported(dateTimeFieldType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant27", (mutableDateTime10.compareTo(instant27) == 0) == mutableDateTime10.equals(instant27));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getDayOfYear();
        java.util.Date date7 = mutableDateTime5.toDate();
        java.util.Date date8 = mutableDateTime5.toDate();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        mutableDateTime9.add(98L);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZoneRetainFields(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime5.toMutableDateTime(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        mutableDateTime8.add(98L);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        int int16 = mutableDateTime14.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = mutableDateTime14.isSupported(dateTimeFieldType17);
        java.lang.Object obj19 = mutableDateTime14.clone();
        org.joda.time.Chronology chronology20 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
        mutableDateTime8.setChronology(chronology20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (short) -1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime27.addDays(3);
        mutableDateTime27.setMillis((long) 1);
        int int32 = mutableDateTime27.getWeekyear();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        mutableDateTime35.addMillis((int) 'a');
        int int38 = mutableDateTime35.getDayOfYear();
        java.util.Date date39 = mutableDateTime35.toDate();
        int int40 = mutableDateTime35.getMinuteOfHour();
        java.util.Locale locale41 = null;
        java.util.Calendar calendar42 = mutableDateTime35.toCalendar(locale41);
        boolean boolean43 = mutableDateTime27.isBefore((org.joda.time.ReadableInstant) mutableDateTime35);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        int int49 = mutableDateTime46.getYearOfCentury();
        org.joda.time.Chronology chronology50 = mutableDateTime46.getChronology();
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime35.toMutableDateTime(chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime25.toMutableDateTime(chronology50);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableDateTime25.add(readablePeriod53);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        mutableDateTime57.addDays(100);
        mutableDateTime57.add((long) '4');
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.yearOfEra();
        boolean boolean63 = mutableDateTime57.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime65 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime65.dayOfYear();
        mutableDateTime65.add(98L);
        java.lang.Object obj69 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(obj69, chronology70);
        org.joda.time.DateTimeZone dateTimeZone72 = mutableDateTime71.getZone();
        int int73 = mutableDateTime71.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = null;
        boolean boolean75 = mutableDateTime71.isSupported(dateTimeFieldType74);
        java.lang.Object obj76 = mutableDateTime71.clone();
        org.joda.time.Chronology chronology77 = mutableDateTime71.getChronology();
        org.joda.time.MutableDateTime mutableDateTime78 = org.joda.time.MutableDateTime.now(chronology77);
        mutableDateTime65.setChronology(chronology77);
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(chronology77);
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime((long) (short) -1, chronology77);
        org.joda.time.MutableDateTime mutableDateTime82 = org.joda.time.MutableDateTime.now(chronology77);
        mutableDateTime57.setChronology(chronology77);
        org.joda.time.MutableDateTime mutableDateTime84 = org.joda.time.MutableDateTime.now(chronology77);
        mutableDateTime25.setChronology(chronology77);
        org.joda.time.DateTime dateTime86 = mutableDateTime5.toDateTime(chronology77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.add((long) (byte) 1);
        boolean boolean18 = mutableDateTime12.isBefore((long) (short) 1);
        boolean boolean19 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        mutableDateTime21.add(98L);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        int int29 = mutableDateTime27.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = mutableDateTime27.isSupported(dateTimeFieldType30);
        java.lang.Object obj32 = mutableDateTime27.clone();
        org.joda.time.Chronology chronology33 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology33);
        mutableDateTime21.setChronology(chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) (short) -1, chronology33);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime37, dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime5.toMutableDateTime(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        int int9 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime12 = property4.add(330);
        int int13 = mutableDateTime12.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        mutableDateTime16.add(98L);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        int int24 = mutableDateTime22.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = mutableDateTime22.isSupported(dateTimeFieldType25);
        java.lang.Object obj27 = mutableDateTime22.clone();
        org.joda.time.Chronology chronology28 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(chronology28);
        mutableDateTime16.setChronology(chronology28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (short) -1, chronology28);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime32, dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) 13, dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone4);
        mutableDateTime5.addHours(20);
        org.joda.time.DateTime dateTime8 = mutableDateTime5.toDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.yearOfEra();
        int int10 = property9.getMaximumValueOverall();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property15.getAsText(locale17);
        boolean boolean19 = property15.isLeap();
        org.joda.time.MutableDateTime mutableDateTime20 = property15.getMutableDateTime();
        int int21 = property15.getMaximumValueOverall();
        boolean boolean22 = property9.equals((java.lang.Object) property15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant14", (mutableDateTime3.compareTo(instant14) == 0) == mutableDateTime3.equals(instant14));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setHourOfDay((int) (byte) 0);
        java.util.Date date10 = mutableDateTime2.toDate();
        java.lang.Object obj11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone18);
        mutableDateTime12.setZone(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj11, dateTimeZone18);
        org.joda.time.DateTime dateTime23 = mutableDateTime2.toDateTime(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        mutableDateTime5.addDays((int) '#');
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.dayOfWeek();
        mutableDateTime5.addWeeks(6453);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        mutableDateTime11.add(98L);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        mutableDateTime11.setZoneRetainFields(dateTimeZone18);
        mutableDateTime5.setZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime2.setMinuteOfHour(54);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.yearOfCentury();
        org.joda.time.DurationField durationField22 = property21.getLeapDurationField();
        int int23 = property21.getMaximumValueOverall();
        boolean boolean24 = property19.equals((java.lang.Object) int23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime20", (instant10.compareTo(mutableDateTime20) == 0) == instant10.equals(mutableDateTime20));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        mutableDateTime2.setMinuteOfDay((int) (short) 10);
        mutableDateTime2.addWeeks(5);
        java.lang.String str9 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.minuteOfHour();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime2.toMutableDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        mutableDateTime21.addMillis((int) 'a');
        int int24 = mutableDateTime21.getDayOfYear();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        mutableDateTime27.addDays(100);
        mutableDateTime27.setWeekyear(0);
        int int32 = mutableDateTime27.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime27.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime35.toMutableDateTime(dateTimeZone41);
        long long45 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.MutableDateTime mutableDateTime46 = property33.roundHalfCeiling();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology48);
        mutableDateTime49.addMillis((int) 'a');
        int int52 = mutableDateTime49.getYearOfCentury();
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.Instant instant56 = mutableDateTime55.toInstant();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime55.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime58 = property57.roundHalfFloor();
        java.lang.String str59 = mutableDateTime58.toString();
        mutableDateTime58.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime58.toMutableDateTime();
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = mutableDateTime65.toString(dateTimeFormatter66);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        mutableDateTime65.add(readablePeriod68);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime65.hourOfDay();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime65.era();
        org.joda.time.MutableDateTime mutableDateTime72 = property71.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property71.getFieldType();
        int int74 = mutableDateTime58.get(dateTimeFieldType73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime49.property(dateTimeFieldType73);
        int int76 = mutableDateTime46.get(dateTimeFieldType73);
        int int77 = mutableDateTime21.get(dateTimeFieldType73);
        boolean boolean78 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant56", (mutableDateTime14.compareTo(instant56) == 0) == mutableDateTime14.equals(instant56));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.era();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone23);
        mutableDateTime18.setZone(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar30 = mutableDateTime29.toGregorianCalendar();
        org.joda.time.DateTime dateTime31 = mutableDateTime29.toDateTimeISO();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfFloor();
        java.lang.String str38 = mutableDateTime37.toString();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime37.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property40.getFieldType();
        boolean boolean42 = mutableDateTime29.isSupported(dateTimeFieldType41);
        mutableDateTime18.set(dateTimeFieldType41, 29);
        int int45 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and instant35", (mutableDateTime25.compareTo(instant35) == 0) == mutableDateTime25.equals(instant35));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        int int6 = mutableDateTime5.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.weekyear();
        java.lang.String str10 = property9.toString();
        int int11 = property9.getMaximumValue();
        java.lang.String str12 = property9.toString();
        org.joda.time.MutableDateTime mutableDateTime13 = property9.getMutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology20);
        boolean boolean25 = mutableDateTime24.isAfterNow();
        int int26 = mutableDateTime24.getEra();
        org.joda.time.Chronology chronology27 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime13.toMutableDateTime(chronology27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime30.addDays(3);
        mutableDateTime30.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.secondOfDay();
        int int36 = mutableDateTime30.getYearOfCentury();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime30, dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime46 = mutableDateTime13.toDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime5.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime49.addDays(3);
        mutableDateTime49.setMillis((long) 1);
        int int54 = mutableDateTime49.getWeekyear();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology56);
        mutableDateTime57.addMillis((int) 'a');
        int int60 = mutableDateTime57.getDayOfYear();
        java.util.Date date61 = mutableDateTime57.toDate();
        int int62 = mutableDateTime57.getMinuteOfHour();
        java.util.Locale locale63 = null;
        java.util.Calendar calendar64 = mutableDateTime57.toCalendar(locale63);
        boolean boolean65 = mutableDateTime49.isBefore((org.joda.time.ReadableInstant) mutableDateTime57);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = null;
        java.lang.String str70 = mutableDateTime68.toString(dateTimeFormatter69);
        int int71 = mutableDateTime68.getYearOfCentury();
        org.joda.time.Chronology chronology72 = mutableDateTime68.getChronology();
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime57.toMutableDateTime(chronology72);
        org.joda.time.MutableDateTime mutableDateTime74 = org.joda.time.MutableDateTime.now(chronology72);
        org.joda.time.DateTime dateTime75 = mutableDateTime5.toDateTime(chronology72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField(59);
        java.lang.String str8 = property4.getAsShortText();
        java.lang.String str9 = property4.getName();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.addMillis((int) 'a');
        int int20 = mutableDateTime17.getYearOfCentury();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        java.lang.String str27 = mutableDateTime26.toString();
        mutableDateTime26.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime26.toMutableDateTime();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.era();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        int int42 = mutableDateTime26.get(dateTimeFieldType41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime17.property(dateTimeFieldType41);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime12.property(dateTimeFieldType41);
        int int45 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.String str46 = property4.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        int int17 = mutableDateTime9.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.add((long) (byte) 1);
        boolean boolean18 = mutableDateTime12.isBefore((long) (short) 1);
        boolean boolean19 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.String str20 = mutableDateTime5.toString();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.add((long) 6304);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        mutableDateTime28.setTime((long) 3);
        org.joda.time.Chronology chronology31 = mutableDateTime28.getChronology();
        mutableDateTime23.setDate((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime26", (instant13.compareTo(mutableDateTime26) == 0) == instant13.equals(mutableDateTime26));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime1.addDays(3);
        mutableDateTime1.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.add((long) 4);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        int int16 = mutableDateTime11.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.roundHalfFloor();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        mutableDateTime20.setZoneRetainFields(dateTimeZone24);
        mutableDateTime8.setZone(dateTimeZone24);
        java.lang.Object obj27 = mutableDateTime8.clone();
        mutableDateTime8.addMonths((-3048));
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.weekyear();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        mutableDateTime39.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.yearOfCentury();
        int int45 = mutableDateTime39.getMinuteOfHour();
        mutableDateTime32.setDate((org.joda.time.ReadableInstant) mutableDateTime39);
        mutableDateTime32.setMinuteOfHour(54);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime32.secondOfDay();
        boolean boolean50 = property49.isLeap();
        boolean boolean51 = mutableDateTime8.equals((java.lang.Object) property49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant40", (mutableDateTime23.compareTo(instant40) == 0) == mutableDateTime23.equals(instant40));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        boolean boolean8 = property4.isLeap();
        org.joda.time.MutableDateTime mutableDateTime9 = property4.getMutableDateTime();
        mutableDateTime9.setMonthOfYear(9);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        mutableDateTime14.addDays(100);
        mutableDateTime14.setWeekyear(0);
        int int19 = mutableDateTime14.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime22.toMutableDateTime(dateTimeZone28);
        long long32 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime31);
        boolean boolean33 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime31);
        int int34 = mutableDateTime9.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime1.addDays(3);
        mutableDateTime1.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfDay();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime1.toGregorianCalendar();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.lang.String str14 = mutableDateTime13.toString();
        boolean boolean15 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateTimeField dateTimeField16 = null;
        mutableDateTime13.setRounding(dateTimeField16, (int) '#');
        int int19 = mutableDateTime13.getMillisOfSecond();
        java.util.Date date20 = mutableDateTime13.toDate();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        boolean boolean28 = mutableDateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime24", (instant11.compareTo(mutableDateTime24) == 0) == instant11.equals(mutableDateTime24));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        java.lang.String str7 = mutableDateTime6.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 652, dateTimeZone8);
        java.lang.Class<?> wildcardClass11 = dateTimeZone8.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime9", (instant4.compareTo(mutableDateTime9) == 0) == instant4.equals(mutableDateTime9));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMillisOfSecond(4);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        mutableDateTime5.add(98L);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        int int13 = mutableDateTime11.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = mutableDateTime11.isSupported(dateTimeFieldType14);
        java.lang.Object obj16 = mutableDateTime11.clone();
        org.joda.time.Chronology chronology17 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        mutableDateTime5.setChronology(chronology17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime1.toMutableDateTime(chronology17);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.secondOfMinute();
        mutableDateTime27.addYears(0);
        mutableDateTime27.addHours(20);
        mutableDateTime21.setTime((org.joda.time.ReadableInstant) mutableDateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant25", (mutableDateTime11.compareTo(instant25) == 0) == mutableDateTime11.equals(instant25));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        int int9 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime12 = property4.add(330);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = property4.roundHalfFloor();
        org.joda.time.Chronology chronology15 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.secondOfDay();
        java.util.Date date18 = mutableDateTime16.toDate();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        int int24 = mutableDateTime22.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = mutableDateTime22.isSupported(dateTimeFieldType25);
        java.lang.Object obj27 = mutableDateTime22.clone();
        org.joda.time.Chronology chronology28 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 8, chronology28);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) date18, chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        mutableDateTime2.addDays(100);
        mutableDateTime2.setWeekyear(0);
        int int7 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime10.toMutableDateTime(dateTimeZone16);
        long long20 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime mutableDateTime21 = property8.roundHalfCeiling();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        mutableDateTime24.addMillis((int) 'a');
        int int27 = mutableDateTime24.getYearOfCentury();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.Instant instant31 = mutableDateTime30.toInstant();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfFloor();
        java.lang.String str34 = mutableDateTime33.toString();
        mutableDateTime33.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime33.toMutableDateTime();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.era();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property46.getFieldType();
        int int49 = mutableDateTime33.get(dateTimeFieldType48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime24.property(dateTimeFieldType48);
        int int51 = mutableDateTime21.get(dateTimeFieldType48);
        int int52 = mutableDateTime21.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant31", (mutableDateTime15.compareTo(instant31) == 0) == mutableDateTime15.equals(instant31));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) (short) 100);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime10.toMutableDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.addMillis((int) 'a');
        int int18 = mutableDateTime15.getDayOfYear();
        java.util.Date date19 = mutableDateTime15.toDate();
        int int20 = mutableDateTime15.getMinuteOfHour();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundCeiling();
        java.util.Locale locale27 = null;
        java.lang.String str28 = property25.getAsText(locale27);
        org.joda.time.DateTimeField dateTimeField29 = property25.getField();
        mutableDateTime15.setRounding(dateTimeField29, (int) (byte) 0);
        int int32 = mutableDateTime10.get(dateTimeField29);
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableDateTime10.add(readableDuration33);
        org.joda.time.Instant instant35 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime37.addDays(3);
        mutableDateTime37.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.secondOfDay();
        int int43 = mutableDateTime37.getYearOfCentury();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime37, dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(dateTimeZone48);
        mutableDateTime10.setZoneRetainFields(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant35", (mutableDateTime10.compareTo(instant35) == 0) == mutableDateTime10.equals(instant35));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime1.addDays(3);
        mutableDateTime1.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfDay();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfFloor();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime8.add(readablePeriod9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.yearOfCentury();
        int int12 = mutableDateTime8.getWeekyear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.minuteOfDay();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.weekyear();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.set((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime23 = property20.roundCeiling();
        mutableDateTime23.setWeekyear(42);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.Instant instant27 = mutableDateTime8.toInstant();
        java.util.Locale locale28 = null;
        java.util.Calendar calendar29 = mutableDateTime8.toCalendar(locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant27", (mutableDateTime8.compareTo(instant27) == 0) == mutableDateTime8.equals(instant27));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        int int17 = mutableDateTime9.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getDayOfYear();
        java.util.Date date7 = mutableDateTime5.toDate();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone12);
        mutableDateTime5.setZoneRetainFields(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) (short) 100);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.era();
        int int20 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime13);
        java.util.Locale locale21 = null;
        int int22 = property4.getMaximumShortTextLength(locale21);
        java.lang.String str23 = property4.getAsText();
        java.lang.String str24 = property4.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfYear();
        boolean boolean9 = property7.equals((java.lang.Object) ' ');
        org.joda.time.MutableDateTime mutableDateTime11 = property7.add((long) 0);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime14.toString(dateTimeFormatter19);
        boolean boolean21 = mutableDateTime14.isBeforeNow();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        mutableDateTime24.setSecondOfMinute((int) '4');
        mutableDateTime24.setMinuteOfDay((int) (short) 10);
        mutableDateTime24.addWeeks(5);
        boolean boolean31 = mutableDateTime24.isAfterNow();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundCeiling();
        java.util.Locale locale38 = null;
        java.lang.String str39 = property36.getAsText(locale38);
        org.joda.time.DateTimeField dateTimeField40 = property36.getField();
        org.joda.time.MutableDateTime mutableDateTime42 = property36.add((long) (short) 100);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime42.toMutableDateTimeISO();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology46);
        mutableDateTime47.addMillis((int) 'a');
        int int50 = mutableDateTime47.getDayOfYear();
        java.util.Date date51 = mutableDateTime47.toDate();
        int int52 = mutableDateTime47.getMinuteOfHour();
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.Instant instant56 = mutableDateTime55.toInstant();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime55.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime58 = property57.roundCeiling();
        java.util.Locale locale59 = null;
        java.lang.String str60 = property57.getAsText(locale59);
        org.joda.time.DateTimeField dateTimeField61 = property57.getField();
        mutableDateTime47.setRounding(dateTimeField61, (int) (byte) 0);
        int int64 = mutableDateTime42.get(dateTimeField61);
        int int65 = mutableDateTime24.get(dateTimeField61);
        int int66 = mutableDateTime14.get(dateTimeField61);
        boolean boolean67 = mutableDateTime11.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant35", (mutableDateTime11.compareTo(instant35) == 0) == mutableDateTime11.equals(instant35));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = mutableDateTime2.isSupported(dateTimeFieldType5);
        java.lang.Object obj7 = mutableDateTime2.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology8);
        int int11 = mutableDateTime10.getMonthOfYear();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        java.lang.String str18 = mutableDateTime17.toString();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime17.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property20.getFieldType();
        int int22 = mutableDateTime10.get(dateTimeFieldType21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant15", (mutableDateTime2.compareTo(instant15) == 0) == mutableDateTime2.equals(instant15));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant8", (mutableDateTime3.compareTo(instant8) == 0) == mutableDateTime3.equals(instant8));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = mutableDateTime2.isSupported(dateTimeFieldType5);
        java.lang.Object obj7 = mutableDateTime2.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(chronology8);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        int int17 = mutableDateTime16.getDayOfMonth();
        mutableDateTime16.setYear(33);
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant14", (mutableDateTime2.compareTo(instant14) == 0) == mutableDateTime2.equals(instant14));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone4);
        int int6 = mutableDateTime5.getSecondOfDay();
        mutableDateTime5.addWeeks(3);
        int int9 = mutableDateTime5.getSecondOfMinute();
        int int10 = mutableDateTime5.getHourOfDay();
        mutableDateTime5.setMinuteOfHour((int) (short) 10);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundCeiling();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfMonth();
        mutableDateTime18.setMillis((long) 21);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        java.lang.String str28 = mutableDateTime27.toString();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime27.getZone();
        mutableDateTime18.setZoneRetainFields(dateTimeZone29);
        mutableDateTime5.setZoneRetainFields(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant16", (mutableDateTime3.compareTo(instant16) == 0) == mutableDateTime3.equals(instant16));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        int int9 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime12 = property4.add(330);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = property4.roundHalfFloor();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        long long23 = mutableDateTime17.getMillis();
        boolean boolean24 = mutableDateTime17.isEqualNow();
        boolean boolean25 = mutableDateTime14.isEqual((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime14.add(readablePeriod26, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) (short) 100);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.minuteOfHour();
        int int12 = property11.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.roundHalfCeiling();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        int int21 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfCeiling();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime23.toMutableDateTime(chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime31.copy();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfYear();
        mutableDateTime34.add(98L);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        int int42 = mutableDateTime40.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = mutableDateTime40.isSupported(dateTimeFieldType43);
        java.lang.Object obj45 = mutableDateTime40.clone();
        org.joda.time.Chronology chronology46 = mutableDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology46);
        mutableDateTime34.setChronology(chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology46);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (short) -1, chronology46);
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(chronology46);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime53.addDays(3);
        mutableDateTime53.setMillis((long) 1);
        int int58 = mutableDateTime53.getWeekyear();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology60);
        mutableDateTime61.addMillis((int) 'a');
        int int64 = mutableDateTime61.getDayOfYear();
        java.util.Date date65 = mutableDateTime61.toDate();
        int int66 = mutableDateTime61.getMinuteOfHour();
        java.util.Locale locale67 = null;
        java.util.Calendar calendar68 = mutableDateTime61.toCalendar(locale67);
        boolean boolean69 = mutableDateTime53.isBefore((org.joda.time.ReadableInstant) mutableDateTime61);
        java.lang.Object obj70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(obj70, chronology71);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = null;
        java.lang.String str74 = mutableDateTime72.toString(dateTimeFormatter73);
        int int75 = mutableDateTime72.getYearOfCentury();
        org.joda.time.Chronology chronology76 = mutableDateTime72.getChronology();
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime61.toMutableDateTime(chronology76);
        org.joda.time.MutableDateTime mutableDateTime78 = mutableDateTime51.toMutableDateTime(chronology76);
        org.joda.time.MutableDateTime mutableDateTime79 = mutableDateTime78.toMutableDateTimeISO();
        boolean boolean80 = mutableDateTime31.isEqual((org.joda.time.ReadableInstant) mutableDateTime79);
        boolean boolean81 = mutableDateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime26", (instant3.compareTo(mutableDateTime26) == 0) == instant3.equals(mutableDateTime26));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundCeiling();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property5.getAsText(locale7);
        org.joda.time.DateTimeField dateTimeField9 = property5.getField();
        int int10 = property5.get();
        org.joda.time.MutableDateTime mutableDateTime11 = property5.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime13 = property5.add(330);
        org.joda.time.MutableDateTime mutableDateTime14 = property5.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime15 = property5.roundHalfFloor();
        org.joda.time.Chronology chronology16 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 27, chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime17", (instant4.compareTo(mutableDateTime17) == 0) == instant4.equals(mutableDateTime17));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getDayOfYear();
        int int7 = mutableDateTime5.getMinuteOfDay();
        boolean boolean9 = mutableDateTime5.isEqual((long) 46);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime12.toMutableDateTime();
        mutableDateTime16.setDayOfWeek(3);
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        mutableDateTime16.setSecondOfDay((int) (byte) 100);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        java.lang.String str29 = mutableDateTime28.toString();
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 652, dateTimeZone30);
        mutableDateTime16.setZone(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime31", (instant3.compareTo(mutableDateTime31) == 0) == instant3.equals(mutableDateTime31));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        boolean boolean8 = property4.isLeap();
        org.joda.time.MutableDateTime mutableDateTime9 = property4.getMutableDateTime();
        mutableDateTime9.setMonthOfYear(9);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        mutableDateTime14.addDays(100);
        mutableDateTime14.setWeekyear(0);
        int int19 = mutableDateTime14.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.parse("1");
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime22.toMutableDateTime(dateTimeZone28);
        long long32 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime31);
        boolean boolean33 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime31);
        boolean boolean35 = mutableDateTime9.isBefore((long) 6007);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTime dateTime3 = mutableDateTime1.toDateTimeISO();
        int int4 = mutableDateTime1.getSecondOfDay();
        mutableDateTime1.addMinutes((int) (short) 100);
        mutableDateTime1.setMillisOfSecond(578);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime1.toMutableDateTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.setSecondOfMinute((int) '4');
        mutableDateTime12.setMinuteOfDay((int) (short) 10);
        mutableDateTime12.addWeeks(5);
        boolean boolean19 = mutableDateTime12.isAfterNow();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundCeiling();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property24.getAsText(locale26);
        org.joda.time.DateTimeField dateTimeField28 = property24.getField();
        org.joda.time.MutableDateTime mutableDateTime30 = property24.add((long) (short) 100);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime30.toMutableDateTimeISO();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        mutableDateTime35.addMillis((int) 'a');
        int int38 = mutableDateTime35.getDayOfYear();
        java.util.Date date39 = mutableDateTime35.toDate();
        int int40 = mutableDateTime35.getMinuteOfHour();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundCeiling();
        java.util.Locale locale47 = null;
        java.lang.String str48 = property45.getAsText(locale47);
        org.joda.time.DateTimeField dateTimeField49 = property45.getField();
        mutableDateTime35.setRounding(dateTimeField49, (int) (byte) 0);
        int int52 = mutableDateTime30.get(dateTimeField49);
        int int53 = mutableDateTime12.get(dateTimeField49);
        int int54 = mutableDateTime9.get(dateTimeField49);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime57.add(readablePeriod60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.hourOfDay();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime57.era();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime57.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime57.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime66 = property65.roundHalfFloor();
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.DateTimeZone dateTimeZone71 = mutableDateTime70.getZone();
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime73 = org.joda.time.MutableDateTime.now(dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(dateTimeZone71);
        mutableDateTime66.setZone(dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar78 = mutableDateTime77.toGregorianCalendar();
        org.joda.time.DateTime dateTime79 = mutableDateTime77.toDateTimeISO();
        java.lang.Object obj80 = null;
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime(obj80, chronology81);
        org.joda.time.Instant instant83 = mutableDateTime82.toInstant();
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime82.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime85 = property84.roundHalfFloor();
        java.lang.String str86 = mutableDateTime85.toString();
        org.joda.time.MutableDateTime mutableDateTime87 = mutableDateTime85.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime87.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = property88.getFieldType();
        boolean boolean90 = mutableDateTime77.isSupported(dateTimeFieldType89);
        mutableDateTime66.set(dateTimeFieldType89, 29);
        org.joda.time.MutableDateTime.Property property93 = mutableDateTime9.property(dateTimeFieldType89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and mutableDateTime70", (instant23.compareTo(mutableDateTime70) == 0) == instant23.equals(mutableDateTime70));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime2.setMinuteOfHour(54);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.secondOfDay();
        boolean boolean20 = property19.isLeap();
        long long21 = property19.remainder();
        int int22 = property19.getMinimumValueOverall();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        mutableDateTime25.addMillis((int) 'a');
        int int28 = mutableDateTime25.getDayOfYear();
        int int29 = property19.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        mutableDateTime33.setSecondOfMinute((int) '4');
        mutableDateTime33.setMinuteOfDay((int) (short) 10);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.yearOfCentury();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.yearOfCentury();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(5449550743L, dateTimeZone47);
        org.joda.time.DateTime dateTime51 = mutableDateTime39.toDateTime(dateTimeZone47);
        mutableDateTime33.setZoneRetainFields(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 10, dateTimeZone47);
        org.joda.time.DateTime dateTime54 = mutableDateTime25.toDateTime(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime39", (instant10.compareTo(mutableDateTime39) == 0) == instant10.equals(mutableDateTime39));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime1.addSeconds(3);
        int int4 = mutableDateTime1.getYear();
        int int5 = mutableDateTime1.getEra();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime7.addDays(3);
        mutableDateTime7.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.secondOfDay();
        boolean boolean13 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) mutableDateTime7);
        int int14 = mutableDateTime7.getCenturyOfEra();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField(59);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfYear();
        boolean boolean32 = property30.equals((java.lang.Object) ' ');
        org.joda.time.MutableDateTime mutableDateTime34 = property30.add((long) 0);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.hourOfDay();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime37.era();
        org.joda.time.MutableDateTime mutableDateTime44 = property43.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property43.getFieldType();
        int int46 = mutableDateTime34.get(dateTimeFieldType45);
        int int47 = mutableDateTime22.get(dateTimeFieldType45);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime7.property(dateTimeFieldType45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and mutableDateTime26", (instant18.compareTo(mutableDateTime26) == 0) == instant18.equals(mutableDateTime26));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        mutableDateTime4.setWeekOfWeekyear(20);
        mutableDateTime4.setSecondOfDay(330);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime4.copy();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime16.addDays(3);
        mutableDateTime16.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.secondOfDay();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.DurationField durationField23 = property21.getDurationField();
        org.joda.time.DateTimeField dateTimeField24 = property21.getField();
        int int25 = mutableDateTime12.get(dateTimeField24);
        int int26 = mutableDateTime9.get(dateTimeField24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        boolean boolean6 = mutableDateTime5.isEqualNow();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.weekyear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.millisOfDay();
        mutableDateTime5.addWeekyears(30);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone16);
        mutableDateTime5.setZoneRetainFields(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.weekyear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundCeiling();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.secondOfMinute();
        mutableDateTime30.setDayOfWeek(3);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime30.era();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.monthOfYear();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        int int43 = mutableDateTime38.getWeekOfWeekyear();
        mutableDateTime38.addWeekyears((int) (short) -1);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.Instant instant49 = mutableDateTime48.toInstant();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime48.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime51 = property50.roundCeiling();
        java.util.Locale locale52 = null;
        java.lang.String str53 = property50.getAsText(locale52);
        org.joda.time.DateTimeField dateTimeField54 = property50.getField();
        org.joda.time.MutableDateTime mutableDateTime56 = property50.add((long) (short) 100);
        java.lang.String str57 = mutableDateTime56.toString();
        boolean boolean58 = mutableDateTime56.isEqualNow();
        int int59 = mutableDateTime38.compareTo((org.joda.time.ReadableInstant) mutableDateTime56);
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.Instant instant63 = mutableDateTime62.toInstant();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime62.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime65 = property64.roundHalfFloor();
        java.lang.String str66 = mutableDateTime65.toString();
        mutableDateTime65.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime65.toMutableDateTime();
        java.lang.Object obj70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(obj70, chronology71);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = null;
        java.lang.String str74 = mutableDateTime72.toString(dateTimeFormatter73);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        mutableDateTime72.add(readablePeriod75);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime72.hourOfDay();
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime72.era();
        org.joda.time.MutableDateTime mutableDateTime79 = property78.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = property78.getFieldType();
        int int81 = mutableDateTime65.get(dateTimeFieldType80);
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime56.property(dateTimeFieldType80);
        boolean boolean83 = mutableDateTime30.isSupported(dateTimeFieldType80);
        int int84 = mutableDateTime24.get(dateTimeFieldType80);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime5.property(dateTimeFieldType80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.toMutableDateTime();
        mutableDateTime9.addDays(22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime9.toString(dateTimeFormatter12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime9.toMutableDateTimeISO();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology26);
        mutableDateTime19.setChronology(chronology26);
        org.joda.time.DateTime dateTime30 = mutableDateTime9.toDateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        int int11 = dateTime10.getDayOfYear();
        int int12 = dateTime10.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTime();
        int int9 = dateTime8.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant7", (mutableDateTime2.compareTo(instant7) == 0) == mutableDateTime2.equals(instant7));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        int int15 = mutableDateTime9.getMinuteOfHour();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        mutableDateTime19.addWeeks(10);
        org.joda.time.DateTime dateTime26 = mutableDateTime19.toDateTimeISO();
        mutableDateTime19.addMinutes((int) (byte) 1);
        boolean boolean29 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        int int30 = mutableDateTime9.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        int int9 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime12 = property4.add(330);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = property4.roundHalfFloor();
        org.joda.time.Chronology chronology15 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime18.addDays(3);
        mutableDateTime18.setMillis((long) 1);
        int int23 = mutableDateTime18.getWeekyear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        mutableDateTime26.addMillis((int) 'a');
        int int29 = mutableDateTime26.getDayOfYear();
        java.util.Date date30 = mutableDateTime26.toDate();
        int int31 = mutableDateTime26.getMinuteOfHour();
        java.util.Locale locale32 = null;
        java.util.Calendar calendar33 = mutableDateTime26.toCalendar(locale32);
        boolean boolean34 = mutableDateTime18.isBefore((org.joda.time.ReadableInstant) mutableDateTime26);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.Chronology chronology41 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime26.toMutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime16.toMutableDateTime(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime37", (instant3.compareTo(mutableDateTime37) == 0) == instant3.equals(mutableDateTime37));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        boolean boolean13 = mutableDateTime12.isEqualNow();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.weekyear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant10", (mutableDateTime3.compareTo(instant10) == 0) == mutableDateTime3.equals(instant10));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.secondOfMinute();
        mutableDateTime5.setDayOfWeek(3);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property13.getAsText(locale15);
        org.joda.time.DateTimeField dateTimeField17 = property13.getField();
        org.joda.time.MutableDateTime mutableDateTime19 = property13.add((long) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.toMutableDateTimeISO();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        mutableDateTime24.addMillis((int) 'a');
        int int27 = mutableDateTime24.getDayOfYear();
        java.util.Date date28 = mutableDateTime24.toDate();
        int int29 = mutableDateTime24.getMinuteOfHour();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.Instant instant33 = mutableDateTime32.toInstant();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundCeiling();
        java.util.Locale locale36 = null;
        java.lang.String str37 = property34.getAsText(locale36);
        org.joda.time.DateTimeField dateTimeField38 = property34.getField();
        mutableDateTime24.setRounding(dateTimeField38, (int) (byte) 0);
        int int41 = mutableDateTime19.get(dateTimeField38);
        mutableDateTime5.setRounding(dateTimeField38);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime5.copy();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology45);
        mutableDateTime46.addMillis((int) 'a');
        int int49 = mutableDateTime46.getDayOfYear();
        java.util.Date date50 = mutableDateTime46.toDate();
        mutableDateTime46.addMinutes((int) 'a');
        int int53 = mutableDateTime46.getCenturyOfEra();
        int int54 = mutableDateTime46.getSecondOfDay();
        mutableDateTime46.setMillisOfSecond(0);
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.Instant instant60 = mutableDateTime59.toInstant();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime59.monthOfYear();
        mutableDateTime59.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime59.yearOfCentury();
        org.joda.time.DurationField durationField65 = property64.getLeapDurationField();
        org.joda.time.DateTimeField dateTimeField66 = property64.getField();
        mutableDateTime46.setRounding(dateTimeField66);
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = mutableDateTime70.toString(dateTimeFormatter71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        mutableDateTime70.add(readablePeriod73);
        mutableDateTime70.addWeeks(10);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime70.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        mutableDateTime70.add(readablePeriod78);
        org.joda.time.MutableDateTime mutableDateTime80 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime80.dayOfYear();
        mutableDateTime80.add(98L);
        boolean boolean85 = mutableDateTime80.isEqual((long) 5);
        java.lang.Object obj88 = null;
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.MutableDateTime mutableDateTime90 = new org.joda.time.MutableDateTime(obj88, chronology89);
        org.joda.time.DateTimeZone dateTimeZone91 = mutableDateTime90.getZone();
        org.joda.time.MutableDateTime mutableDateTime92 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone91);
        org.joda.time.MutableDateTime mutableDateTime93 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone91);
        org.joda.time.MutableDateTime mutableDateTime94 = mutableDateTime80.toMutableDateTime(dateTimeZone91);
        mutableDateTime70.setZone(dateTimeZone91);
        mutableDateTime46.setZone(dateTimeZone91);
        mutableDateTime43.setDate((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime90", (instant3.compareTo(mutableDateTime90) == 0) == instant3.equals(mutableDateTime90));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.millisOfSecond();
        boolean boolean6 = property5.isLeap();
        java.lang.String str7 = property5.getAsShortText();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundCeiling();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property12.getAsText(locale14);
        org.joda.time.DateTimeField dateTimeField16 = property12.getField();
        org.joda.time.MutableDateTime mutableDateTime18 = property12.add((long) (short) 100);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime18.toMutableDateTimeISO();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        mutableDateTime23.addMillis((int) 'a');
        int int26 = mutableDateTime23.getDayOfYear();
        java.util.Date date27 = mutableDateTime23.toDate();
        int int28 = mutableDateTime23.getMinuteOfHour();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundCeiling();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property33.getAsText(locale35);
        org.joda.time.DateTimeField dateTimeField37 = property33.getField();
        mutableDateTime23.setRounding(dateTimeField37, (int) (byte) 0);
        int int40 = mutableDateTime18.get(dateTimeField37);
        int int41 = mutableDateTime18.getMinuteOfDay();
        long long42 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime10.add(readableDuration11, 42);
        mutableDateTime10.setYear((-3048));
        org.joda.time.Instant instant16 = mutableDateTime10.toInstant();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.setSecondOfMinute((int) '4');
        mutableDateTime19.setMinuteOfDay((int) (short) 10);
        mutableDateTime19.addWeeks(5);
        java.lang.String str26 = mutableDateTime19.toString();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime19.minuteOfHour();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(1589334326042L, dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime19.toMutableDateTime(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime36 = instant16.toMutableDateTime(dateTimeZone32);
        int int37 = mutableDateTime36.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant16", (mutableDateTime10.compareTo(instant16) == 0) == mutableDateTime10.equals(instant16));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:04.841Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfYear();
        boolean boolean9 = property7.equals((java.lang.Object) ' ');
        org.joda.time.MutableDateTime mutableDateTime11 = property7.add((long) 0);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.era();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        int int23 = mutableDateTime11.get(dateTimeFieldType22);
        mutableDateTime11.addYears(33);
        int int26 = mutableDateTime11.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime28.addDays(3);
        mutableDateTime28.setMillis((long) 1);
        int int33 = mutableDateTime28.getWeekyear();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology35);
        mutableDateTime36.addMillis((int) 'a');
        int int39 = mutableDateTime36.getDayOfYear();
        java.util.Date date40 = mutableDateTime36.toDate();
        int int41 = mutableDateTime36.getMinuteOfHour();
        java.util.Locale locale42 = null;
        java.util.Calendar calendar43 = mutableDateTime36.toCalendar(locale42);
        boolean boolean44 = mutableDateTime28.isBefore((org.joda.time.ReadableInstant) mutableDateTime36);
        boolean boolean45 = mutableDateTime36.isAfterNow();
        boolean boolean46 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime36);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        mutableDateTime49.addDays(100);
        mutableDateTime49.add((long) '4');
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime49.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime56 = property54.addWrapField(19);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology58);
        mutableDateTime59.addMillis((int) 'a');
        int int62 = mutableDateTime59.getYearOfCentury();
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.Instant instant66 = mutableDateTime65.toInstant();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime65.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime68 = property67.roundHalfFloor();
        java.lang.String str69 = mutableDateTime68.toString();
        mutableDateTime68.setDayOfYear(3);
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime68.toMutableDateTime();
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(obj73, chronology74);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = null;
        java.lang.String str77 = mutableDateTime75.toString(dateTimeFormatter76);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        mutableDateTime75.add(readablePeriod78);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime75.hourOfDay();
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime75.era();
        org.joda.time.MutableDateTime mutableDateTime82 = property81.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = property81.getFieldType();
        int int84 = mutableDateTime68.get(dateTimeFieldType83);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime59.property(dateTimeFieldType83);
        int int86 = mutableDateTime56.get(dateTimeFieldType83);
        org.joda.time.MutableDateTime.Property property87 = mutableDateTime36.property(dateTimeFieldType83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant66", (mutableDateTime3.compareTo(instant66) == 0) == mutableDateTime3.equals(instant66));
    }
}

