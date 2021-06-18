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
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        java.util.Locale locale5 = null;
        java.lang.String str6 = property4.getAsShortText(locale5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        long long7 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        int int8 = property2.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant6", (mutableDateTime0.compareTo(instant6) == 0) == mutableDateTime0.equals(instant6));
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
        java.lang.String str5 = property4.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setTime(10, 40, 7, 20);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        int int16 = mutableDateTime15.getDayOfWeek();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.dayOfWeek();
        org.joda.time.DurationField durationField26 = property25.getRangeDurationField();
        org.joda.time.DurationField durationField27 = property25.getDurationField();
        org.joda.time.DateTimeField dateTimeField28 = property25.getField();
        mutableDateTime15.setRounding(dateTimeField28, 0);
        mutableDateTime2.setRounding(dateTimeField28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        java.lang.String str5 = property4.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundFloor();
        int int18 = mutableDateTime10.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        int int19 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        java.lang.String str22 = mutableDateTime16.toString();
        int int23 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        java.lang.Object obj24 = mutableDateTime9.clone();
        long long25 = mutableDateTime9.getMillis();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        int int35 = mutableDateTime9.get(dateTimeFieldType34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime6.property(dateTimeFieldType34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
        int int17 = mutableDateTime5.getWeekyear();
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfMonth();
        int int12 = mutableDateTime10.getCenturyOfEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.setSecondOfMinute((int) '4');
        int int18 = mutableDateTime15.getMinuteOfDay();
        int int19 = mutableDateTime15.getCenturyOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        int int23 = mutableDateTime22.getDayOfWeek();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        mutableDateTime22.setZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = mutableDateTime15.toDateTime(dateTimeZone27);
        mutableDateTime10.setZoneRetainFields(dateTimeZone27);
        mutableDateTime2.setZone(dateTimeZone27);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime38.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.set(49);
        boolean boolean43 = mutableDateTime42.isEqualNow();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime42.dayOfMonth();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        mutableDateTime47.setTime((long) '#');
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        mutableDateTime54.add(readablePeriod57);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime54.hourOfDay();
        java.lang.String str60 = mutableDateTime54.toString();
        int int61 = mutableDateTime47.compareTo((org.joda.time.ReadableInstant) mutableDateTime54);
        java.lang.Object obj62 = mutableDateTime47.clone();
        long long63 = mutableDateTime47.getMillis();
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = null;
        java.lang.String str68 = mutableDateTime66.toString(dateTimeFormatter67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        mutableDateTime66.add(readablePeriod69);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime66.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property71.getFieldType();
        int int73 = mutableDateTime47.get(dateTimeFieldType72);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime42.property(dateTimeFieldType72);
        boolean boolean75 = mutableDateTime2.isSupported(dateTimeFieldType72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant36", (mutableDateTime10.compareTo(instant36) == 0) == mutableDateTime10.equals(instant36));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int16 = mutableDateTime5.getDayOfYear();
        mutableDateTime5.setWeekOfWeekyear(7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        long long7 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        java.util.Locale locale8 = null;
        int int9 = property2.getMaximumShortTextLength(locale8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant6", (mutableDateTime0.compareTo(instant6) == 0) == mutableDateTime0.equals(instant6));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        int int17 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime11.toMutableDateTimeISO();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime25.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.set(49);
        org.joda.time.DurationField durationField30 = property27.getDurationField();
        org.joda.time.DateTimeField dateTimeField31 = property27.getField();
        mutableDateTime19.setRounding(dateTimeField31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant23", (mutableDateTime2.compareTo(instant23) == 0) == mutableDateTime2.equals(instant23));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        mutableDateTime2.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        mutableDateTime11.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.yearOfCentury();
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        java.util.Date date18 = mutableDateTime11.toDate();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        mutableDateTime11.setZoneRetainFields(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime19", (instant12.compareTo(mutableDateTime19) == 0) == instant12.equals(mutableDateTime19));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        boolean boolean9 = mutableDateTime2.isEqualNow();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.set(49);
        boolean boolean20 = mutableDateTime19.isEqualNow();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.dayOfMonth();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        mutableDateTime24.setTime((long) '#');
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        java.lang.String str37 = mutableDateTime31.toString();
        int int38 = mutableDateTime24.compareTo((org.joda.time.ReadableInstant) mutableDateTime31);
        java.lang.Object obj39 = mutableDateTime24.clone();
        long long40 = mutableDateTime24.getMillis();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property48.getFieldType();
        int int50 = mutableDateTime24.get(dateTimeFieldType49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime19.property(dateTimeFieldType49);
        boolean boolean52 = mutableDateTime2.isSupported(dateTimeFieldType49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime31", (instant13.compareTo(mutableDateTime31) == 0) == instant13.equals(mutableDateTime31));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.roundFloor();
        int int8 = mutableDateTime0.compareTo((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime7.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant4", (mutableDateTime0.compareTo(instant4) == 0) == mutableDateTime0.equals(instant4));
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
        int int5 = mutableDateTime2.getYearOfEra();
        java.util.Date date6 = mutableDateTime2.toDate();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime12.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.set(49);
        org.joda.time.DurationField durationField17 = property14.getDurationField();
        org.joda.time.DateTimeField dateTimeField18 = property14.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property14.getFieldType();
        int int20 = dateTime6.get(dateTimeFieldType19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int16 = mutableDateTime5.getDayOfYear();
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime5.add(readableDuration17, 422);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.lang.String str7 = mutableDateTime2.toString();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        java.lang.String str16 = mutableDateTime10.toString();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.set(49);
        boolean boolean27 = mutableDateTime26.isEqualNow();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.dayOfMonth();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        mutableDateTime31.setTime((long) '#');
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        java.lang.String str44 = mutableDateTime38.toString();
        int int45 = mutableDateTime31.compareTo((org.joda.time.ReadableInstant) mutableDateTime38);
        java.lang.Object obj46 = mutableDateTime31.clone();
        long long47 = mutableDateTime31.getMillis();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableDateTime50.add(readablePeriod53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime50.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property55.getFieldType();
        int int57 = mutableDateTime31.get(dateTimeFieldType56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime26.property(dateTimeFieldType56);
        boolean boolean59 = mutableDateTime10.isSupported(dateTimeFieldType56);
        boolean boolean60 = mutableDateTime2.isSupported(dateTimeFieldType56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant20", (mutableDateTime10.compareTo(instant20) == 0) == mutableDateTime10.equals(instant20));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int11 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.setSecondOfMinute((int) '4');
        int int18 = mutableDateTime15.getMinuteOfDay();
        int int19 = mutableDateTime15.getCenturyOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        int int23 = mutableDateTime22.getDayOfWeek();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        mutableDateTime22.setZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = mutableDateTime15.toDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(259200010L, dateTimeZone27);
        mutableDateTime2.setZone(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        java.util.Locale locale20 = null;
        int int21 = property18.getMaximumTextLength(locale20);
        boolean boolean22 = mutableDateTime2.equals((java.lang.Object) locale20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        int int17 = property16.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime20 = property16.roundHalfEven();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.year();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        int int29 = mutableDateTime24.getWeekOfWeekyear();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.DateTime dateTime34 = mutableDateTime24.toDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime24.copy();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfWeek();
        mutableDateTime20.setDate((org.joda.time.ReadableInstant) mutableDateTime35);
        int int38 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime5.clone();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        org.joda.time.DurationField durationField17 = property16.getRangeDurationField();
        org.joda.time.DurationField durationField18 = property16.getDurationField();
        org.joda.time.DateTimeField dateTimeField19 = property16.getField();
        int int20 = mutableDateTime5.get(dateTimeField19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.roundFloor();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        mutableDateTime22.addHours(9);
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
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        mutableDateTime7.setTime((long) '#');
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        java.lang.String str20 = mutableDateTime14.toString();
        int int21 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime7.copy();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime27.dayOfWeek();
        int int34 = property33.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime36 = property33.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime37 = property33.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime37.add(readablePeriod38, 40);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime37.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime49.copy();
        long long52 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime51);
        boolean boolean53 = mutableDateTime2.equals((java.lang.Object) long52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime2.add(readablePeriod6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        mutableDateTime2.setWeekyear((int) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTime();
        boolean boolean8 = mutableDateTime2.isAfter((long) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime6", (instant3.compareTo(dateTime6) == 0) == instant3.equals(dateTime6));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.era();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        mutableDateTime5.setZone(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.roundFloor();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.hourOfDay();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime26.dayOfWeek();
        int int33 = property32.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime34 = property32.roundHalfCeiling();
        org.joda.time.DateTimeField dateTimeField35 = property32.getField();
        mutableDateTime22.setRounding(dateTimeField35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime5.clone();
        mutableDateTime5.setMonthOfYear(3);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.setSecondOfMinute((int) '4');
        int int15 = mutableDateTime12.getMinuteOfDay();
        int int16 = mutableDateTime12.getCenturyOfEra();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        int int20 = mutableDateTime19.getDayOfWeek();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        mutableDateTime19.setZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = mutableDateTime12.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        mutableDateTime5.setZoneRetainFields(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTime();
        int int7 = dateTime6.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int16 = mutableDateTime5.getDayOfYear();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime5.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.roundFloor();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutableDateTime22.add(readableDuration24, 6353);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant19", (mutableDateTime8.compareTo(instant19) == 0) == mutableDateTime8.equals(instant19));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime10.copy();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.centuryOfEra();
        int int30 = property20.getDifference((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime24.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime24.toMutableDateTimeISO();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        mutableDateTime32.setChronology(chronology39);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime12.toMutableDateTime(chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
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
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.copy();
        long long18 = mutableDateTime17.getMillis();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfCeiling();
        org.joda.time.DateTimeField dateTimeField25 = property23.getField();
        mutableDateTime17.setRounding(dateTimeField25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant22", (mutableDateTime9.compareTo(instant22) == 0) == mutableDateTime9.equals(instant22));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        mutableDateTime2.setZoneRetainFields(dateTimeZone7);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.set(49);
        org.joda.time.DurationField durationField20 = property17.getDurationField();
        org.joda.time.DateTimeField dateTimeField21 = property17.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property17.getFieldType();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime2.property(dateTimeFieldType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant13", (mutableDateTime6.compareTo(instant13) == 0) == mutableDateTime6.equals(instant13));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime10.copy();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfMonth();
        int int15 = mutableDateTime13.getCenturyOfEra();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        mutableDateTime18.setSecondOfMinute((int) '4');
        int int21 = mutableDateTime18.getMinuteOfDay();
        int int22 = mutableDateTime18.getCenturyOfEra();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        int int26 = mutableDateTime25.getDayOfWeek();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        mutableDateTime25.setZoneRetainFields(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = mutableDateTime18.toDateTime(dateTimeZone30);
        mutableDateTime13.setZoneRetainFields(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology5);
        mutableDateTime6.setSecondOfMinute((int) '4');
        int int9 = mutableDateTime6.getMinuteOfDay();
        mutableDateTime6.setDate((long) 6300);
        boolean boolean13 = mutableDateTime6.isBefore((long) (byte) 0);
        boolean boolean14 = instant3.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime6.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int16 = mutableDateTime5.getDayOfYear();
        mutableDateTime5.setSecondOfDay(6319);
        org.joda.time.DateTime dateTime19 = mutableDateTime5.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        mutableDateTime3.setSecondOfMinute((int) '4');
        int int6 = mutableDateTime3.getMinuteOfDay();
        int int7 = mutableDateTime3.getCenturyOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        int int11 = mutableDateTime10.getDayOfWeek();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime10.setZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = mutableDateTime3.toDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(259200010L, dateTimeZone15);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        int int21 = mutableDateTime19.getDayOfWeek();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.add((long) (short) -1);
        java.util.Locale locale28 = null;
        int int29 = property25.getMaximumShortTextLength(locale28);
        long long30 = property25.remainder();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        mutableDateTime33.setSecondOfDay((int) '#');
        mutableDateTime33.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int42 = mutableDateTime33.getMillisOfSecond();
        int int43 = property25.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.Chronology chronology44 = mutableDateTime33.getChronology();
        boolean boolean45 = mutableDateTime19.isEqual((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant34", (mutableDateTime10.compareTo(instant34) == 0) == mutableDateTime10.equals(instant34));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        long long7 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        int int8 = property2.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant6", (mutableDateTime0.compareTo(instant6) == 0) == mutableDateTime0.equals(instant6));
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
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTime();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        mutableDateTime10.setMinuteOfDay(4);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        int int21 = mutableDateTime16.getWeekOfWeekyear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTime dateTime26 = mutableDateTime16.toDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime10.toMutableDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 25, dateTimeZone25);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property36.getFieldType();
        boolean boolean38 = mutableDateTime28.isSupported(dateTimeFieldType37);
        int int39 = mutableDateTime2.get(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime6", (instant3.compareTo(dateTime6) == 0) == instant3.equals(dateTime6));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        int int17 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime11.toMutableDateTimeISO();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime18.toMutableDateTime(dateTimeZone22);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime29.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime33 = property31.set(49);
        org.joda.time.MutableDateTime mutableDateTime34 = property31.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property31.getFieldType();
        int int36 = mutableDateTime23.get(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant27", (mutableDateTime21.compareTo(instant27) == 0) == mutableDateTime21.equals(instant27));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.dayOfWeek();
        boolean boolean26 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime2.getZone();
        int int8 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        java.lang.String str18 = mutableDateTime12.toString();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.set(49);
        boolean boolean29 = mutableDateTime28.isEqualNow();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.dayOfMonth();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        mutableDateTime33.setTime((long) '#');
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        java.lang.String str46 = mutableDateTime40.toString();
        int int47 = mutableDateTime33.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        java.lang.Object obj48 = mutableDateTime33.clone();
        long long49 = mutableDateTime33.getMillis();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property57.getFieldType();
        int int59 = mutableDateTime33.get(dateTimeFieldType58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime28.property(dateTimeFieldType58);
        boolean boolean61 = mutableDateTime12.isSupported(dateTimeFieldType58);
        int int62 = mutableDateTime2.get(dateTimeFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant22", (mutableDateTime12.compareTo(instant22) == 0) == mutableDateTime12.equals(instant22));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        boolean boolean7 = mutableDateTime2.isBefore((long) 693);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        int int17 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTime();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime26.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        int int30 = mutableDateTime19.get(dateTimeField29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant24", (mutableDateTime2.compareTo(instant24) == 0) == mutableDateTime2.equals(instant24));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(40);
        org.joda.time.Instant instant8 = mutableDateTime5.toInstant();
        boolean boolean9 = mutableDateTime5.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant8", (mutableDateTime5.compareTo(instant8) == 0) == mutableDateTime5.equals(instant8));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.minuteOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        mutableDateTime14.setMinuteOfDay(4);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        int int25 = mutableDateTime20.getWeekOfWeekyear();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.DateTime dateTime30 = mutableDateTime20.toDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime14.toMutableDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone29);
        boolean boolean33 = property11.equals((java.lang.Object) mutableDateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
        mutableDateTime5.setTime((long) 6317185);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime2.add(readablePeriod6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        int int9 = mutableDateTime2.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        int int5 = mutableDateTime2.getMonthOfYear();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutableDateTime9.setDate(readableInstant15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        int int19 = mutableDateTime17.getCenturyOfEra();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        mutableDateTime22.setSecondOfMinute((int) '4');
        int int25 = mutableDateTime22.getMinuteOfDay();
        int int26 = mutableDateTime22.getCenturyOfEra();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        int int30 = mutableDateTime29.getDayOfWeek();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        mutableDateTime29.setZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = mutableDateTime22.toDateTime(dateTimeZone34);
        mutableDateTime17.setZoneRetainFields(dateTimeZone34);
        mutableDateTime9.setZone(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime2.toMutableDateTime(dateTimeZone34);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.Instant instant45 = mutableDateTime44.toInstant();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime47.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime47.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime51 = property49.set(49);
        boolean boolean52 = mutableDateTime51.isEqualNow();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime51.dayOfMonth();
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = mutableDateTime56.toString(dateTimeFormatter57);
        mutableDateTime56.setTime((long) '#');
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = null;
        java.lang.String str65 = mutableDateTime63.toString(dateTimeFormatter64);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        mutableDateTime63.add(readablePeriod66);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime63.hourOfDay();
        java.lang.String str69 = mutableDateTime63.toString();
        int int70 = mutableDateTime56.compareTo((org.joda.time.ReadableInstant) mutableDateTime63);
        java.lang.Object obj71 = mutableDateTime56.clone();
        long long72 = mutableDateTime56.getMillis();
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(obj73, chronology74);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = null;
        java.lang.String str77 = mutableDateTime75.toString(dateTimeFormatter76);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        mutableDateTime75.add(readablePeriod78);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime75.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = property80.getFieldType();
        int int82 = mutableDateTime56.get(dateTimeFieldType81);
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime51.property(dateTimeFieldType81);
        boolean boolean84 = mutableDateTime2.isSupported(dateTimeFieldType81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant45", (mutableDateTime9.compareTo(instant45) == 0) == mutableDateTime9.equals(instant45));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.secondOfDay();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.yearOfCentury();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property17.getFieldType();
        mutableDateTime7.set(dateTimeFieldType18, 6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.copy();
        long long18 = mutableDateTime17.getMillis();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.dayOfWeek();
        int int30 = property29.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.roundHalfCeiling();
        org.joda.time.DateTimeField dateTimeField32 = property29.getField();
        mutableDateTime20.setRounding(dateTimeField32);
        mutableDateTime17.setRounding(dateTimeField32);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.hourOfDay();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime37.dayOfWeek();
        int int44 = property43.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime46 = property43.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime47 = property43.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime47.add(readablePeriod48, 40);
        org.joda.time.ReadableDuration readableDuration51 = null;
        mutableDateTime47.add(readableDuration51);
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.Instant instant56 = mutableDateTime55.toInstant();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime55.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime58 = property57.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime58.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime58.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime62 = property60.set(49);
        boolean boolean63 = mutableDateTime62.isEqualNow();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime62.dayOfMonth();
        boolean boolean65 = mutableDateTime47.isBefore((org.joda.time.ReadableInstant) mutableDateTime62);
        boolean boolean66 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant56", (mutableDateTime9.compareTo(instant56) == 0) == mutableDateTime9.equals(instant56));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfFloor();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        mutableDateTime13.setTime((long) '#');
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        java.lang.String str26 = mutableDateTime20.toString();
        int int27 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj28 = mutableDateTime13.clone();
        long long29 = mutableDateTime13.getMillis();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property37.getFieldType();
        int int39 = mutableDateTime13.get(dateTimeFieldType38);
        int int40 = mutableDateTime10.get(dateTimeFieldType38);
        mutableDateTime10.addWeeks(6353);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.Instant instant46 = mutableDateTime45.toInstant();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime45.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundHalfCeiling();
        org.joda.time.DateTimeField dateTimeField49 = property47.getField();
        int int50 = mutableDateTime10.get(dateTimeField49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime32 and instant46", (mutableDateTime32.compareTo(instant46) == 0) == mutableDateTime32.equals(instant46));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        int int15 = property14.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime17 = property14.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime18 = property14.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime18.add(readablePeriod19, 40);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime18.toMutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 100, chronology28);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology28);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime2.toMutableDateTime(chronology28);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime38.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.set(49);
        boolean boolean43 = mutableDateTime42.isEqualNow();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime42.dayOfMonth();
        int int45 = mutableDateTime42.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime42.toString(dateTimeFormatter46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime42.minuteOfDay();
        mutableDateTime32.setDate((org.joda.time.ReadableInstant) mutableDateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and instant36", (mutableDateTime24.compareTo(instant36) == 0) == mutableDateTime24.equals(instant36));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.year();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        java.lang.String str20 = mutableDateTime14.toString();
        org.joda.time.Instant instant21 = mutableDateTime14.toInstant();
        boolean boolean22 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) instant21);
        boolean boolean23 = mutableDateTime10.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant21", (mutableDateTime10.compareTo(instant21) == 0) == mutableDateTime10.equals(instant21));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime2.add(readablePeriod6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfWeek();
        java.lang.String str18 = mutableDateTime11.toString();
        int int19 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property4.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        boolean boolean7 = mutableDateTime2.isBefore((long) 693);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.yearOfEra();
        long long9 = property8.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime10.copy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.minuteOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.year();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.dayOfWeek();
        int int29 = property28.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime32 = property28.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime32.add(readablePeriod33, 40);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime32.toMutableDateTime(chronology42);
        mutableDateTime15.setChronology(chronology42);
        mutableDateTime12.setChronology(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime38", (instant3.compareTo(mutableDateTime38) == 0) == instant3.equals(mutableDateTime38));
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
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.dayOfWeek();
        int int14 = property13.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundHalfEven();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.year();
        java.lang.String str20 = mutableDateTime17.toString("330");
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime2.toMutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int16 = mutableDateTime5.getDayOfYear();
        mutableDateTime5.setSecondOfDay(6319);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime21.add(readablePeriod26);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        mutableDateTime30.setTime((long) '#');
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.hourOfDay();
        java.lang.String str43 = mutableDateTime37.toString();
        int int44 = mutableDateTime30.compareTo((org.joda.time.ReadableInstant) mutableDateTime37);
        java.lang.Object obj45 = mutableDateTime30.clone();
        long long46 = mutableDateTime30.getMillis();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime49.add(readablePeriod52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime49.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property54.getFieldType();
        int int56 = mutableDateTime30.get(dateTimeFieldType55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime21.property(dateTimeFieldType55);
        boolean boolean58 = mutableDateTime5.isSupported(dateTimeFieldType55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime2.add(readablePeriod6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        mutableDateTime2.setYear(422);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfFloor();
        mutableDateTime9.setWeekyear(2020);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        int int20 = mutableDateTime15.getWeekOfWeekyear();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTime dateTime25 = mutableDateTime15.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, dateTimeZone24);
        mutableDateTime9.setZoneRetainFields(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        int int5 = mutableDateTime2.getMonthOfYear();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutableDateTime9.setDate(readableInstant15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        int int19 = mutableDateTime17.getCenturyOfEra();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        mutableDateTime22.setSecondOfMinute((int) '4');
        int int25 = mutableDateTime22.getMinuteOfDay();
        int int26 = mutableDateTime22.getCenturyOfEra();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        int int30 = mutableDateTime29.getDayOfWeek();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        mutableDateTime29.setZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = mutableDateTime22.toDateTime(dateTimeZone34);
        mutableDateTime17.setZoneRetainFields(dateTimeZone34);
        mutableDateTime9.setZone(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime2.toMutableDateTime(dateTimeZone34);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.Instant instant45 = mutableDateTime44.toInstant();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.monthOfYear();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime49.add(readablePeriod52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime49.hourOfDay();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime49.dayOfWeek();
        int int56 = property55.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime58 = property55.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime59 = property55.roundHalfEven();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.year();
        java.lang.String str62 = mutableDateTime59.toString("330");
        org.joda.time.Chronology chronology63 = mutableDateTime59.getChronology();
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime44.toMutableDateTime(chronology63);
        boolean boolean65 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant45", (mutableDateTime9.compareTo(instant45) == 0) == mutableDateTime9.equals(instant45));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        org.joda.time.DurationField durationField10 = property7.getDurationField();
        org.joda.time.DateTimeField dateTimeField11 = property7.getField();
        org.joda.time.MutableDateTime mutableDateTime12 = property7.roundCeiling();
        mutableDateTime12.setDayOfYear(5);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        int int24 = property23.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime26 = property23.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime27 = property23.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime27.add(readablePeriod28, 40);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime27.toMutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology37);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.hourOfDay();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime42.dayOfWeek();
        org.joda.time.DurationField durationField49 = property48.getRangeDurationField();
        org.joda.time.DurationField durationField50 = property48.getDurationField();
        org.joda.time.DateTimeField dateTimeField51 = property48.getField();
        mutableDateTime39.setRounding(dateTimeField51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime39.getZone();
        org.joda.time.DateTime dateTime54 = mutableDateTime12.toDateTime(dateTimeZone53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        java.lang.Object obj9 = mutableDateTime5.clone();
        mutableDateTime5.addMinutes((int) (short) 0);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime14.setTime((long) '#');
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        java.lang.String str27 = mutableDateTime21.toString();
        int int28 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime14.copy();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime14.toMutableDateTime(chronology36);
        boolean boolean39 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        mutableDateTime17.setTime((long) '#');
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        java.lang.String str30 = mutableDateTime24.toString();
        int int31 = mutableDateTime17.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime17.copy();
        org.joda.time.DateTimeField dateTimeField33 = null;
        mutableDateTime17.setRounding(dateTimeField33, (int) (byte) 0);
        int int36 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        int int37 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        mutableDateTime11.setTime((long) '#');
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        java.lang.String str24 = mutableDateTime18.toString();
        int int25 = mutableDateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        java.lang.Object obj26 = mutableDateTime11.clone();
        long long27 = mutableDateTime11.getMillis();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        int int37 = mutableDateTime11.get(dateTimeFieldType36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime2.property(dateTimeFieldType36);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.Instant instant42 = mutableDateTime41.toInstant();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime44 = property43.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar45 = mutableDateTime44.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.millisOfDay();
        org.joda.time.Chronology chronology47 = mutableDateTime44.getChronology();
        long long48 = property38.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant42", (mutableDateTime2.compareTo(instant42) == 0) == mutableDateTime2.equals(instant42));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 40);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        java.lang.String str26 = property25.getAsString();
        long long27 = property25.remainder();
        org.joda.time.DurationField durationField28 = property25.getRangeDurationField();
        java.util.Locale locale29 = null;
        java.lang.String str30 = property25.getAsText(locale29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.dayOfYear();
        mutableDateTime33.setMillis((long) 9);
        int int37 = property25.getDifference((org.joda.time.ReadableInstant) mutableDateTime33);
        int int38 = mutableDateTime33.getEra();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        mutableDateTime42.setMinuteOfDay(4);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        int int51 = mutableDateTime48.getYearOfCentury();
        org.joda.time.Chronology chronology52 = mutableDateTime48.getChronology();
        int int53 = mutableDateTime48.getWeekOfWeekyear();
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.DateTimeZone dateTimeZone57 = mutableDateTime56.getZone();
        org.joda.time.DateTime dateTime58 = mutableDateTime48.toDateTime(dateTimeZone57);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime42.toMutableDateTime(dateTimeZone57);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) 25, dateTimeZone57);
        org.joda.time.DateTime dateTime61 = mutableDateTime60.toDateTimeISO();
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = mutableDateTime64.toString(dateTimeFormatter65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        mutableDateTime64.add(readablePeriod67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime64.yearOfCentury();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime64.dayOfWeek();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime64.millisOfDay();
        mutableDateTime64.add((long) 3);
        mutableDateTime64.addWeekyears((int) (byte) 100);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology77);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime78.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime78.copy();
        mutableDateTime64.setDate((org.joda.time.ReadableInstant) mutableDateTime78);
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime78.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration83 = null;
        mutableDateTime78.add(readableDuration83, 100);
        org.joda.time.MutableDateTime mutableDateTime87 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:14.530Z");
        mutableDateTime78.setMillis((org.joda.time.ReadableInstant) mutableDateTime87);
        mutableDateTime60.setDate((org.joda.time.ReadableInstant) mutableDateTime87);
        mutableDateTime33.setMillis((org.joda.time.ReadableInstant) mutableDateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime78 and mutableDateTime87", (mutableDateTime78.compareTo(mutableDateTime87) == 0) == mutableDateTime78.equals(mutableDateTime87));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.add((int) (short) 10);
        java.lang.String str11 = property7.getName();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime14.setTime((long) '#');
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        java.lang.String str27 = mutableDateTime21.toString();
        int int28 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime14.copy();
        java.lang.String str30 = mutableDateTime14.toString();
        mutableDateTime14.addDays(6414);
        int int33 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        java.util.Locale locale6 = null;
        int int7 = property3.getMaximumShortTextLength(locale6);
        long long8 = property3.remainder();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        mutableDateTime11.setSecondOfDay((int) '#');
        mutableDateTime11.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int20 = mutableDateTime11.getMillisOfSecond();
        int int21 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        int int22 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        mutableDateTime25.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime25.minuteOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime25.year();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime25.toMutableDateTime();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        mutableDateTime33.setTime((long) '#');
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        java.lang.String str46 = mutableDateTime40.toString();
        int int47 = mutableDateTime33.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        java.lang.Object obj48 = mutableDateTime33.clone();
        long long49 = mutableDateTime33.getMillis();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property57.getFieldType();
        int int59 = mutableDateTime33.get(dateTimeFieldType58);
        boolean boolean60 = mutableDateTime25.isSupported(dateTimeFieldType58);
        boolean boolean61 = mutableDateTime11.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime40", (instant12.compareTo(mutableDateTime40) == 0) == instant12.equals(mutableDateTime40));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(40);
        org.joda.time.Instant instant8 = mutableDateTime5.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant8", (mutableDateTime5.compareTo(instant8) == 0) == mutableDateTime5.equals(instant8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        java.lang.String str22 = mutableDateTime16.toString();
        int int23 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        mutableDateTime16.addDays(19);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        mutableDateTime16.setZone(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime5.toMutableDateTime(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime26", (instant3.compareTo(mutableDateTime26) == 0) == instant3.equals(mutableDateTime26));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        boolean boolean16 = mutableDateTime5.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        mutableDateTime2.addDays((int) '4');
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfWeek();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.dayOfWeek();
        int int23 = property22.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime25 = property22.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime26 = property22.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime26.add(readablePeriod27, 40);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime26.toMutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology36);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.hourOfDay();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime42.dayOfWeek();
        int int49 = property48.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime51 = property48.addWrapField(0);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.DateTimeZone dateTimeZone55 = mutableDateTime54.getZone();
        mutableDateTime54.setMinuteOfDay(4);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = null;
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        int int63 = mutableDateTime60.getYearOfCentury();
        org.joda.time.Chronology chronology64 = mutableDateTime60.getChronology();
        int int65 = mutableDateTime60.getWeekOfWeekyear();
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime68.getZone();
        org.joda.time.DateTime dateTime70 = mutableDateTime60.toDateTime(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime54.toMutableDateTime(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(dateTimeZone69);
        org.joda.time.DateTime dateTime73 = mutableDateTime51.toDateTime(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime74 = org.joda.time.MutableDateTime.now(dateTimeZone69);
        mutableDateTime39.setZoneRetainFields(dateTimeZone69);
        org.joda.time.DateTime dateTime76 = mutableDateTime2.toDateTime(dateTimeZone69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime32", (instant3.compareTo(mutableDateTime32) == 0) == instant3.equals(mutableDateTime32));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        mutableDateTime2.addMillis(7);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        java.util.GregorianCalendar gregorianCalendar10 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.setSecondOfMinute((int) '4');
        int int16 = mutableDateTime13.getMinuteOfDay();
        mutableDateTime13.setDate((long) 6300);
        boolean boolean20 = mutableDateTime13.isBefore((long) (byte) 0);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.add((long) (short) -1);
        mutableDateTime26.setWeekOfWeekyear(40);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.dayOfWeek();
        int int38 = property37.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime40 = property37.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime41 = property37.roundHalfEven();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.year();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        int int48 = mutableDateTime45.getYearOfCentury();
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        int int50 = mutableDateTime45.getWeekOfWeekyear();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        org.joda.time.DateTime dateTime55 = mutableDateTime45.toDateTime(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime45.copy();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime56.dayOfWeek();
        mutableDateTime41.setDate((org.joda.time.ReadableInstant) mutableDateTime56);
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = null;
        java.lang.String str63 = mutableDateTime61.toString(dateTimeFormatter62);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        mutableDateTime61.add(readablePeriod64);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime61.centuryOfEra();
        int int67 = property66.get();
        org.joda.time.MutableDateTime mutableDateTime69 = property66.addWrapField(6300);
        org.joda.time.DateTimeField dateTimeField70 = property66.getField();
        int int71 = mutableDateTime41.get(dateTimeField70);
        mutableDateTime26.setRounding(dateTimeField70);
        mutableDateTime13.setRounding(dateTimeField70);
        mutableDateTime2.setRounding(dateTimeField70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime45", (instant3.compareTo(mutableDateTime45) == 0) == instant3.equals(mutableDateTime45));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        int int9 = mutableDateTime7.getSecondOfMinute();
        int int10 = mutableDateTime7.getMonthOfYear();
        org.joda.time.Chronology chronology11 = mutableDateTime7.getChronology();
        boolean boolean12 = property4.equals((java.lang.Object) chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        mutableDateTime2.setMillis((long) ' ');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        mutableDateTime20.setTime((long) '#');
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        java.lang.String str33 = mutableDateTime27.toString();
        int int34 = mutableDateTime20.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        java.lang.Object obj35 = mutableDateTime20.clone();
        long long36 = mutableDateTime20.getMillis();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime39.add(readablePeriod42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property44.getFieldType();
        int int46 = mutableDateTime20.get(dateTimeFieldType45);
        int int47 = mutableDateTime17.get(dateTimeFieldType45);
        boolean boolean48 = mutableDateTime2.isSupported(dateTimeFieldType45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.DurationField durationField10 = property8.getDurationField();
        java.lang.String str11 = property8.getAsShortText();
        org.joda.time.DurationField durationField12 = property8.getRangeDurationField();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        mutableDateTime15.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.secondOfMinute();
        int int21 = mutableDateTime15.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime15.getZone();
        int int23 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant16", (mutableDateTime2.compareTo(instant16) == 0) == mutableDateTime2.equals(instant16));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.util.GregorianCalendar gregorianCalendar4 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.monthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        int int16 = property15.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime19 = property15.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime19.add(readablePeriod20, 40);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime19.toMutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 100, chronology29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology29);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology29);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        int int38 = mutableDateTime37.getDayOfWeek();
        mutableDateTime37.addSeconds((int) (byte) 0);
        mutableDateTime37.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime37);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.Instant instant47 = mutableDateTime46.toInstant();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.monthOfYear();
        mutableDateTime46.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.yearOfCentury();
        mutableDateTime43.setTime((org.joda.time.ReadableInstant) mutableDateTime46);
        mutableDateTime46.setMillis(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime46.toString(dateTimeFormatter55);
        mutableDateTime34.setDate((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and instant47", (mutableDateTime25.compareTo(instant47) == 0) == mutableDateTime25.equals(instant47));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        int int7 = mutableDateTime2.getHourOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        mutableDateTime10.setTime((long) '#');
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        java.lang.String str23 = mutableDateTime17.toString();
        int int24 = mutableDateTime10.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        java.lang.Object obj25 = mutableDateTime10.clone();
        long long26 = mutableDateTime10.getMillis();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime10);
        boolean boolean29 = mutableDateTime27.equals((java.lang.Object) "2020-11-25T01:44:59.178Z");
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.Instant instant33 = mutableDateTime32.toInstant();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.monthOfYear();
        mutableDateTime32.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        boolean boolean40 = mutableDateTime27.isSupported(dateTimeFieldType39);
        int int41 = mutableDateTime2.get(dateTimeFieldType39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.add(105);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        mutableDateTime14.setSecondOfMinute((int) '4');
        int int17 = mutableDateTime14.getMinuteOfDay();
        mutableDateTime14.setDate((long) 6300);
        boolean boolean21 = mutableDateTime14.isBefore((long) (byte) 0);
        boolean boolean22 = instant11.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        long long23 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant11", (mutableDateTime10.compareTo(instant11) == 0) == mutableDateTime10.equals(instant11));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.add((long) (short) -1);
        mutableDateTime12.setWeekOfWeekyear(40);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        int int24 = property23.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime26 = property23.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime27 = property23.roundHalfEven();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.year();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        int int34 = mutableDateTime31.getYearOfCentury();
        org.joda.time.Chronology chronology35 = mutableDateTime31.getChronology();
        int int36 = mutableDateTime31.getWeekOfWeekyear();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.DateTime dateTime41 = mutableDateTime31.toDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime31.copy();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.dayOfWeek();
        mutableDateTime27.setDate((org.joda.time.ReadableInstant) mutableDateTime42);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime47.centuryOfEra();
        int int53 = property52.get();
        org.joda.time.MutableDateTime mutableDateTime55 = property52.addWrapField(6300);
        org.joda.time.DateTimeField dateTimeField56 = property52.getField();
        int int57 = mutableDateTime27.get(dateTimeField56);
        mutableDateTime12.setRounding(dateTimeField56);
        int int59 = mutableDateTime2.get(dateTimeField56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime31", (instant3.compareTo(mutableDateTime31) == 0) == instant3.equals(mutableDateTime31));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        int int7 = mutableDateTime5.getMillisOfDay();
        int int8 = mutableDateTime5.getYearOfEra();
        int int9 = mutableDateTime5.getMinuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:31.942Z");
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime5.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime11", (mutableDateTime5.compareTo(mutableDateTime11) == 0) == mutableDateTime5.equals(mutableDateTime11));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        mutableDateTime11.setWeekyear((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfMonth();
        int int18 = mutableDateTime16.getCenturyOfEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        mutableDateTime21.setSecondOfMinute((int) '4');
        int int24 = mutableDateTime21.getMinuteOfDay();
        int int25 = mutableDateTime21.getCenturyOfEra();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        int int29 = mutableDateTime28.getDayOfWeek();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        mutableDateTime28.setZoneRetainFields(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = mutableDateTime21.toDateTime(dateTimeZone33);
        mutableDateTime16.setZoneRetainFields(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.017Z", dateTimeZone33);
        mutableDateTime11.setZone(dateTimeZone33);
        mutableDateTime11.setMillisOfDay((int) (byte) 10);
        int int42 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        mutableDateTime3.setSecondOfMinute((int) '4');
        int int6 = mutableDateTime3.getMinuteOfDay();
        int int7 = mutableDateTime3.getCenturyOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        int int11 = mutableDateTime10.getDayOfWeek();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime10.setZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = mutableDateTime3.toDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(259200010L, dateTimeZone15);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        mutableDateTime22.setSecondOfDay((int) '#');
        mutableDateTime22.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        mutableDateTime22.addDays((int) '4');
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime22.dayOfWeek();
        mutableDateTime22.addMillis(6300);
        org.joda.time.Chronology chronology36 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime19, chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant23", (mutableDateTime10.compareTo(instant23) == 0) == mutableDateTime10.equals(instant23));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.dayOfWeek();
        int int14 = property13.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundHalfEven();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.year();
        java.lang.String str20 = mutableDateTime17.toString("330");
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime2.toMutableDateTime(chronology21);
        boolean boolean24 = mutableDateTime2.isAfter((long) 6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
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
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.set(49);
        boolean boolean18 = mutableDateTime17.isEqualNow();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.dayOfMonth();
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime17.toString(dateTimeFormatter21);
        boolean boolean23 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        int int24 = mutableDateTime17.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        int int6 = mutableDateTime5.getDayOfWeek();
        mutableDateTime5.addSeconds((int) (byte) 0);
        int int9 = mutableDateTime5.getSecondOfMinute();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        mutableDateTime12.setTime((long) '#');
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        java.lang.String str25 = mutableDateTime19.toString();
        int int26 = mutableDateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj27 = mutableDateTime12.clone();
        long long28 = mutableDateTime12.getMillis();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property36.getFieldType();
        int int38 = mutableDateTime12.get(dateTimeFieldType37);
        int int39 = mutableDateTime5.get(dateTimeFieldType37);
        boolean boolean40 = mutableDateTime2.isSupported(dateTimeFieldType37);
        int int41 = mutableDateTime2.getMillisOfSecond();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.Instant instant45 = mutableDateTime44.toInstant();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime47.toMutableDateTime();
        mutableDateTime47.addHours(59);
        org.joda.time.ReadableDuration readableDuration51 = null;
        mutableDateTime47.add(readableDuration51);
        mutableDateTime47.setDate(1580521560970L);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant45", (mutableDateTime5.compareTo(instant45) == 0) == mutableDateTime5.equals(instant45));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int11 = mutableDateTime2.getMillisOfSecond();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        int int29 = property19.getDifference((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime23.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime23.toMutableDateTimeISO();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        int int37 = mutableDateTime34.getYearOfCentury();
        org.joda.time.Chronology chronology38 = mutableDateTime34.getChronology();
        mutableDateTime31.setChronology(chronology38);
        mutableDateTime31.addYears(100);
        boolean boolean42 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime2.add(readablePeriod6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        mutableDateTime2.addWeeks(6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.dayOfWeek();
        int int14 = property13.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundHalfEven();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.year();
        java.lang.String str20 = mutableDateTime17.toString("330");
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime2.toMutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.minuteOfDay();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.dayOfWeek();
        int int23 = property22.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime25 = property22.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime26 = property22.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime26.add(readablePeriod27, 40);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime26.toMutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.dayOfYear();
        mutableDateTime38.setMillis((long) 2020);
        java.lang.String str42 = mutableDateTime38.toString();
        mutableDateTime38.setSecondOfMinute((int) (short) 1);
        boolean boolean45 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime38);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        mutableDateTime48.setTime((long) '#');
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = null;
        java.lang.String str57 = mutableDateTime55.toString(dateTimeFormatter56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        mutableDateTime55.add(readablePeriod58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime55.hourOfDay();
        java.lang.String str61 = mutableDateTime55.toString();
        int int62 = mutableDateTime48.compareTo((org.joda.time.ReadableInstant) mutableDateTime55);
        java.lang.Object obj63 = mutableDateTime48.clone();
        long long64 = mutableDateTime48.getMillis();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime48);
        boolean boolean67 = mutableDateTime65.equals((java.lang.Object) "2020-11-25T01:44:59.178Z");
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.Instant instant71 = mutableDateTime70.toInstant();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime70.monthOfYear();
        mutableDateTime70.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime70.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime76 = property75.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = property75.getFieldType();
        boolean boolean78 = mutableDateTime65.isSupported(dateTimeFieldType77);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime38.property(dateTimeFieldType77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant71", (mutableDateTime2.compareTo(instant71) == 0) == mutableDateTime2.equals(instant71));
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
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        int int8 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.centuryOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime14.toMutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime11, chronology26);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime2.toMutableDateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.weekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        int int15 = mutableDateTime10.getWeekOfWeekyear();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTime dateTime20 = mutableDateTime10.toDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime10.copy();
        boolean boolean22 = mutableDateTime10.isAfterNow();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime10.centuryOfEra();
        int int24 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.setSecondOfDay(21);
        mutableDateTime10.addHours(104);
        mutableDateTime10.addWeekyears(3);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime36.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.set(49);
        org.joda.time.MutableDateTime mutableDateTime41 = property38.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property38.getFieldType();
        int int43 = mutableDateTime10.get(dateTimeFieldType42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant34", (mutableDateTime2.compareTo(instant34) == 0) == mutableDateTime2.equals(instant34));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = mutableDateTime2.clone();
        long long18 = mutableDateTime2.getMillis();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        boolean boolean21 = mutableDateTime19.equals((java.lang.Object) "2020-11-25T01:44:59.178Z");
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        mutableDateTime24.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property29.getFieldType();
        boolean boolean32 = mutableDateTime19.isSupported(dateTimeFieldType31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime19.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant25", (mutableDateTime9.compareTo(instant25) == 0) == mutableDateTime9.equals(instant25));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.dayOfWeek();
        int int10 = property9.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime13 = property9.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, 40);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime13.toMutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 100, chronology23);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.Instant instant31 = mutableDateTime30.toInstant();
        mutableDateTime30.setSecondOfDay((int) '#');
        mutableDateTime30.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int39 = property26.getDifference((org.joda.time.ReadableInstant) mutableDateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant31", (mutableDateTime19.compareTo(instant31) == 0) == mutableDateTime19.equals(instant31));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int16 = mutableDateTime5.getDayOfYear();
        int int17 = mutableDateTime5.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.dayOfWeek();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime18.secondOfDay();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        mutableDateTime28.setSecondOfDay((int) '#');
        java.util.GregorianCalendar gregorianCalendar32 = mutableDateTime28.toGregorianCalendar();
        boolean boolean33 = mutableDateTime28.isBeforeNow();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime36.dayOfWeek();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime36.secondOfDay();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        int int49 = mutableDateTime46.getYearOfCentury();
        mutableDateTime46.setMillisOfSecond(7);
        java.util.Locale locale52 = null;
        java.util.Calendar calendar53 = mutableDateTime46.toCalendar(locale52);
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.Instant instant57 = mutableDateTime56.toInstant();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime56.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime59 = property58.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime59.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime59.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime63 = property61.set(49);
        org.joda.time.DurationField durationField64 = property61.getDurationField();
        org.joda.time.DateTimeField dateTimeField65 = property61.getField();
        int int66 = mutableDateTime46.get(dateTimeField65);
        mutableDateTime36.setRounding(dateTimeField65);
        int int68 = mutableDateTime28.get(dateTimeField65);
        int int69 = mutableDateTime18.get(dateTimeField65);
        int int70 = mutableDateTime14.get(dateTimeField65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant15", (mutableDateTime2.compareTo(instant15) == 0) == mutableDateTime2.equals(instant15));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant9 = null;
        mutableDateTime3.setDate(readableInstant9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfMonth();
        int int13 = mutableDateTime11.getCenturyOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.setSecondOfMinute((int) '4');
        int int19 = mutableDateTime16.getMinuteOfDay();
        int int20 = mutableDateTime16.getCenturyOfEra();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        int int24 = mutableDateTime23.getDayOfWeek();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        mutableDateTime23.setZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = mutableDateTime16.toDateTime(dateTimeZone28);
        mutableDateTime11.setZoneRetainFields(dateTimeZone28);
        mutableDateTime3.setZone(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.monthOfYear();
        mutableDateTime38.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.secondOfMinute();
        int int44 = property43.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime45 = property43.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime45.secondOfMinute();
        int int47 = mutableDateTime45.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime45.millisOfSecond();
        mutableDateTime35.setTime((org.joda.time.ReadableInstant) mutableDateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant39", (mutableDateTime3.compareTo(instant39) == 0) == mutableDateTime3.equals(instant39));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.weekyear();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTime();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant18 = null;
        mutableDateTime12.setDate(readableInstant18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        int int22 = mutableDateTime20.getCenturyOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        mutableDateTime25.setSecondOfMinute((int) '4');
        int int28 = mutableDateTime25.getMinuteOfDay();
        int int29 = mutableDateTime25.getCenturyOfEra();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        int int33 = mutableDateTime32.getDayOfWeek();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        mutableDateTime32.setZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = mutableDateTime25.toDateTime(dateTimeZone37);
        mutableDateTime20.setZoneRetainFields(dateTimeZone37);
        mutableDateTime12.setZone(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, dateTimeZone37);
        org.joda.time.DateTime dateTime45 = mutableDateTime2.toDateTime(dateTimeZone37);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.Instant instant49 = mutableDateTime48.toInstant();
        mutableDateTime48.addSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime48.add(readablePeriod52);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime48.copy();
        boolean boolean55 = dateTime45.isBefore((org.joda.time.ReadableInstant) mutableDateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant49", (mutableDateTime12.compareTo(instant49) == 0) == mutableDateTime12.equals(instant49));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.roundFloor();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        mutableDateTime8.addDays(292278993);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = property33.getField();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.secondOfMinute();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.dayOfMonth();
        boolean boolean41 = mutableDateTime38.isBefore((long) 9);
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime35, chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime8.toMutableDateTime(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and mutableDateTime38", (instant19.compareTo(mutableDateTime38) == 0) == instant19.equals(mutableDateTime38));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        mutableDateTime3.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime3.minuteOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.year();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        int int17 = property16.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime20 = property16.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime20.add(readablePeriod21, 40);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime20.toMutableDateTime(chronology30);
        mutableDateTime3.setChronology(chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(chronology30);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj0, chronology30);
        mutableDateTime34.setTime((long) 4);
        org.joda.time.ReadableDuration readableDuration37 = null;
        mutableDateTime34.add(readableDuration37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime34.add(readablePeriod39);
        java.util.Locale locale41 = null;
        java.util.Calendar calendar42 = mutableDateTime34.toCalendar(locale41);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        mutableDateTime45.setTime((long) '#');
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.hourOfDay();
        java.lang.String str58 = mutableDateTime52.toString();
        int int59 = mutableDateTime45.compareTo((org.joda.time.ReadableInstant) mutableDateTime52);
        java.lang.Object obj60 = mutableDateTime45.clone();
        long long61 = mutableDateTime45.getMillis();
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime45);
        boolean boolean64 = mutableDateTime62.equals((java.lang.Object) "2020-11-25T01:44:59.178Z");
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.Instant instant68 = mutableDateTime67.toInstant();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime67.monthOfYear();
        mutableDateTime67.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime67.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime73 = property72.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = property72.getFieldType();
        boolean boolean75 = mutableDateTime62.isSupported(dateTimeFieldType74);
        boolean boolean76 = mutableDateTime34.isSupported(dateTimeFieldType74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime26 and instant68", (mutableDateTime26.compareTo(instant68) == 0) == mutableDateTime26.equals(instant68));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        java.util.Locale locale10 = null;
        int int11 = property8.getMaximumShortTextLength(locale10);
        org.joda.time.MutableDateTime mutableDateTime13 = property8.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.centuryOfEra();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        mutableDateTime21.setSecondOfMinute((int) '4');
        int int24 = mutableDateTime21.getMinuteOfDay();
        mutableDateTime21.setDate((long) 6300);
        boolean boolean28 = mutableDateTime21.isBefore((long) (byte) 0);
        boolean boolean29 = instant18.isEqual((org.joda.time.ReadableInstant) mutableDateTime21);
        int int30 = property14.compareTo((org.joda.time.ReadableInstant) instant18);
        java.util.Locale locale31 = null;
        int int32 = property14.getMaximumTextLength(locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant18", (mutableDateTime17.compareTo(instant18) == 0) == mutableDateTime17.equals(instant18));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        int int5 = mutableDateTime2.getMonthOfYear();
        int int6 = mutableDateTime2.getMillisOfSecond();
        int int7 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.set(49);
        org.joda.time.MutableDateTime mutableDateTime19 = property16.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.copy();
        java.util.Locale locale23 = null;
        java.lang.String str24 = mutableDateTime19.toString("2020", locale23);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant12", (dateTime8.compareTo(instant12) == 0) == dateTime8.equals(instant12));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        int int2 = mutableDateTime0.getCenturyOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology4);
        mutableDateTime5.setSecondOfMinute((int) '4');
        int int8 = mutableDateTime5.getMinuteOfDay();
        int int9 = mutableDateTime5.getCenturyOfEra();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        int int13 = mutableDateTime12.getDayOfWeek();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        mutableDateTime12.setZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = mutableDateTime5.toDateTime(dateTimeZone17);
        mutableDateTime0.setZoneRetainFields(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.era();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime31.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.dayOfWeek();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        int int37 = mutableDateTime36.getDayOfWeek();
        mutableDateTime36.addSeconds((int) (byte) 0);
        int int40 = mutableDateTime36.getSecondOfMinute();
        mutableDateTime36.setWeekyear(20);
        mutableDateTime32.setMillis((org.joda.time.ReadableInstant) mutableDateTime36);
        int int44 = mutableDateTime32.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime32.toMutableDateTimeISO();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.Instant instant49 = mutableDateTime48.toInstant();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime48.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime51 = property50.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime51.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime51.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime55 = property53.set(49);
        org.joda.time.DurationField durationField56 = property53.getDurationField();
        org.joda.time.DateTimeField dateTimeField57 = property53.getField();
        mutableDateTime45.setRounding(dateTimeField57);
        mutableDateTime22.setRounding(dateTimeField57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant29", (mutableDateTime0.compareTo(instant29) == 0) == mutableDateTime0.equals(instant29));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        mutableDateTime2.addDays((int) '4');
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.addMillis(6300);
        org.joda.time.Chronology chronology16 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime18.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.dayOfWeek();
        java.lang.String str30 = mutableDateTime23.toString();
        int int31 = mutableDateTime23.getYear();
        mutableDateTime18.setTime((org.joda.time.ReadableInstant) mutableDateTime23);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        int int36 = mutableDateTime35.getDayOfWeek();
        mutableDateTime35.addSeconds((int) (byte) 0);
        mutableDateTime35.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime35.millisOfSecond();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        mutableDateTime44.setTime((long) '#');
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime51.add(readablePeriod54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.hourOfDay();
        java.lang.String str57 = mutableDateTime51.toString();
        int int58 = mutableDateTime44.compareTo((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime44.copy();
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = null;
        java.lang.String str64 = mutableDateTime62.toString(dateTimeFormatter63);
        int int65 = mutableDateTime62.getYearOfCentury();
        org.joda.time.Chronology chronology66 = mutableDateTime62.getChronology();
        org.joda.time.MutableDateTime mutableDateTime67 = org.joda.time.MutableDateTime.now(chronology66);
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime44.toMutableDateTime(chronology66);
        mutableDateTime35.setChronology(chronology66);
        mutableDateTime18.setChronology(chronology66);
        mutableDateTime2.setChronology(chronology66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setTime(1580521526770L);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        org.joda.time.DurationField durationField20 = property19.getRangeDurationField();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        java.lang.String str22 = property19.getAsShortText();
        org.joda.time.DurationField durationField23 = property19.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime24 = property19.getMutableDateTime();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        int int28 = mutableDateTime27.getDayOfWeek();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        mutableDateTime27.setZoneRetainFields(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        mutableDateTime24.setZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 6417070, dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime2.toMutableDateTime(dateTimeZone32);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime2.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.add((long) (short) -1);
        mutableDateTime20.setWeekOfWeekyear((int) '4');
        mutableDateTime14.setTime((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime20.secondOfDay();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        boolean boolean34 = property24.equals((java.lang.Object) dateTimeFieldType33);
        boolean boolean35 = mutableDateTime2.isSupported(dateTimeFieldType33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        boolean boolean14 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.addWrapField((int) '4');
        java.lang.String str18 = mutableDateTime17.toString();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.set(49);
        org.joda.time.DurationField durationField29 = property26.getDurationField();
        org.joda.time.DateTimeField dateTimeField30 = property26.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property26.getFieldType();
        mutableDateTime17.set(dateTimeFieldType31, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant22", (mutableDateTime10.compareTo(instant22) == 0) == mutableDateTime10.equals(instant22));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        int int10 = mutableDateTime2.getWeekOfWeekyear();
        int int11 = mutableDateTime2.getEra();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        mutableDateTime14.addSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime14.add(readablePeriod18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime14.copy();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant15", (mutableDateTime14.compareTo(instant15) == 0) == mutableDateTime14.equals(instant15));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        mutableDateTime2.addMillis(7);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        java.util.GregorianCalendar gregorianCalendar10 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime23 = property19.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime23.add(readablePeriod24, 40);
        mutableDateTime23.setMinuteOfHour(1);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfMonth();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.dayOfMonth();
        java.lang.String str32 = property31.getAsString();
        org.joda.time.Interval interval33 = property31.toInterval();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.centuryOfEra();
        boolean boolean42 = property31.equals((java.lang.Object) mutableDateTime36);
        mutableDateTime36.setTime((long) ' ');
        int int45 = mutableDateTime36.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime36.yearOfEra();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:41.430Z", dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) 627, dateTimeZone52);
        mutableDateTime54.setSecondOfMinute((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration57 = null;
        mutableDateTime54.add(readableDuration57);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.dayOfMonth();
        boolean boolean62 = mutableDateTime59.isBefore((long) 9);
        org.joda.time.Chronology chronology63 = mutableDateTime59.getChronology();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(chronology63);
        mutableDateTime54.setChronology(chronology63);
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime36.toMutableDateTime(chronology63);
        org.joda.time.DateTime dateTime67 = mutableDateTime23.toDateTime(chronology63);
        boolean boolean68 = mutableDateTime2.equals((java.lang.Object) chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.setWeekyear((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfMonth();
        int int9 = mutableDateTime7.getCenturyOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.setSecondOfMinute((int) '4');
        int int15 = mutableDateTime12.getMinuteOfDay();
        int int16 = mutableDateTime12.getCenturyOfEra();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        int int20 = mutableDateTime19.getDayOfWeek();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        mutableDateTime19.setZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = mutableDateTime12.toDateTime(dateTimeZone24);
        mutableDateTime7.setZoneRetainFields(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.017Z", dateTimeZone24);
        mutableDateTime2.setZone(dateTimeZone24);
        boolean boolean32 = mutableDateTime2.isBefore((long) 70);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfFloor();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime41.add(readablePeriod44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.hourOfDay();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime41.dayOfWeek();
        boolean boolean48 = mutableDateTime38.isAfter((org.joda.time.ReadableInstant) mutableDateTime41);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.Instant instant52 = mutableDateTime51.toInstant();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime51.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime54 = property53.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime55 = property53.roundFloor();
        int int56 = mutableDateTime41.compareTo((org.joda.time.ReadableInstant) mutableDateTime55);
        mutableDateTime41.addHours(59);
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.Instant instant62 = mutableDateTime61.toInstant();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime61.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime64 = property63.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime64.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime64.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField67 = property66.getField();
        int int68 = mutableDateTime41.get(dateTimeField67);
        int int69 = mutableDateTime41.getSecondOfDay();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant36", (mutableDateTime7.compareTo(instant36) == 0) == mutableDateTime7.equals(instant36));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.dayOfWeek();
        int int14 = property13.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundHalfEven();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.year();
        java.lang.String str20 = mutableDateTime17.toString("330");
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime2.toMutableDateTime(chronology21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.year();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        int int21 = mutableDateTime16.getWeekOfWeekyear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTime dateTime26 = mutableDateTime16.toDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime16.copy();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfWeek();
        mutableDateTime12.setDate((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.Instant instant30 = mutableDateTime27.toInstant();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.dayOfWeek();
        org.joda.time.DurationField durationField40 = property39.getRangeDurationField();
        org.joda.time.DurationField durationField41 = property39.getDurationField();
        org.joda.time.DateTimeField dateTimeField42 = property39.getField();
        mutableDateTime27.setRounding(dateTimeField42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and instant30", (mutableDateTime16.compareTo(instant30) == 0) == mutableDateTime16.equals(instant30));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        java.lang.String str3 = property1.getAsText();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property1.getAsText(locale4);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        mutableDateTime8.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.secondOfMinute();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.minuteOfHour();
        org.joda.time.DurationField durationField15 = property14.getLeapDurationField();
        int int16 = property14.get();
        boolean boolean17 = property1.equals((java.lang.Object) property14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant9", (mutableDateTime0.compareTo(instant9) == 0) == mutableDateTime0.equals(instant9));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.Chronology chronology7 = mutableDateTime3.getChronology();
        int int8 = mutableDateTime3.getWeekOfWeekyear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTime dateTime13 = mutableDateTime3.toDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((-1L), dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.add(23);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.dayOfWeek();
        int int29 = property28.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime32 = property28.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime32.add(readablePeriod33, 40);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime32.toMutableDateTime(chronology42);
        boolean boolean44 = mutableDateTime43.isBeforeNow();
        int int45 = mutableDateTime43.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime43.dayOfMonth();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime43.toMutableDateTime(chronology47);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime51.add(readablePeriod54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.hourOfDay();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime51.dayOfWeek();
        org.joda.time.DurationField durationField58 = property57.getRangeDurationField();
        boolean boolean59 = property57.isLeap();
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime60.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime62 = property61.getMutableDateTime();
        org.joda.time.DateTime dateTime63 = mutableDateTime62.toDateTimeISO();
        int int64 = property57.getDifference((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.MutableDateTime mutableDateTime65 = property57.roundHalfCeiling();
        org.joda.time.DurationField durationField66 = property57.getLeapDurationField();
        boolean boolean67 = mutableDateTime43.equals((java.lang.Object) property57);
        boolean boolean68 = mutableDateTime18.isEqual((org.joda.time.ReadableInstant) mutableDateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant19", (mutableDateTime18.compareTo(instant19) == 0) == mutableDateTime18.equals(instant19));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = mutableDateTime5.clone();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property14.getFieldType();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime5.property(dateTimeFieldType15);
        int int17 = property16.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime2.toMutableDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.dayOfWeek();
        int int27 = property26.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime29 = property26.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime30 = property26.roundHalfEven();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.year();
        java.lang.String str33 = mutableDateTime30.toString("330");
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime15.toMutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant16", (mutableDateTime15.compareTo(instant16) == 0) == mutableDateTime15.equals(instant16));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setTime(10, 40, 7, 20);
        int int13 = mutableDateTime2.getSecondOfMinute();
        int int14 = mutableDateTime2.getSecondOfDay();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        mutableDateTime17.setMinuteOfDay(4);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.dayOfWeek();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.dayOfWeek();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime24.secondOfDay();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.centuryOfEra();
        boolean boolean33 = mutableDateTime24.isBeforeNow();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology35);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime39.add(readablePeriod42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.centuryOfEra();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        int int50 = mutableDateTime47.getYearOfCentury();
        org.joda.time.Chronology chronology51 = mutableDateTime47.getChronology();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime39.toMutableDateTime(chronology51);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime36, chronology51);
        mutableDateTime24.setChronology(chronology51);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime57.add(readablePeriod60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property62.getFieldType();
        boolean boolean64 = mutableDateTime24.isSupported(dateTimeFieldType63);
        int int65 = mutableDateTime17.get(dateTimeFieldType63);
        boolean boolean66 = mutableDateTime2.isSupported(dateTimeFieldType63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.year();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        java.lang.String str20 = mutableDateTime14.toString();
        org.joda.time.Instant instant21 = mutableDateTime14.toInstant();
        boolean boolean22 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) instant21);
        int int23 = mutableDateTime10.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant21", (mutableDateTime10.compareTo(instant21) == 0) == mutableDateTime10.equals(instant21));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.millisOfSecond();
        mutableDateTime5.add(0L);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.weekyear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.setSecondOfMinute((int) '4');
        int int15 = mutableDateTime12.getMinuteOfDay();
        int int16 = mutableDateTime12.getCenturyOfEra();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        int int20 = mutableDateTime19.getDayOfWeek();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        mutableDateTime19.setZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = mutableDateTime12.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone24);
        mutableDateTime5.setZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        mutableDateTime14.setMinuteOfDay(4);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        int int25 = mutableDateTime20.getWeekOfWeekyear();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.DateTime dateTime30 = mutableDateTime20.toDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime14.toMutableDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = mutableDateTime11.toDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime34 = dateTime33.toDateTime();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime38.dayOfWeek();
        int int45 = property44.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime47 = property44.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime48 = property44.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime48.add(readablePeriod49, 40);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        int int57 = mutableDateTime54.getYearOfCentury();
        org.joda.time.Chronology chronology58 = mutableDateTime54.getChronology();
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime48.toMutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) 100, chronology58);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime34.toMutableDateTime(chronology58);
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.Instant instant65 = mutableDateTime64.toInstant();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime64.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime67 = property66.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime67.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime67.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime71 = property69.set(49);
        org.joda.time.MutableDateTime mutableDateTime72 = property69.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime72.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime72.copy();
        mutableDateTime74.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime74.monthOfYear();
        boolean boolean78 = mutableDateTime61.isEqual((org.joda.time.ReadableInstant) mutableDateTime74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant65", (mutableDateTime20.compareTo(instant65) == 0) == mutableDateTime20.equals(instant65));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        int int15 = property14.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime17 = property14.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime18 = property14.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime18.add(readablePeriod19, 40);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime18.toMutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 100, chronology28);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology28);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime2.toMutableDateTime(chronology28);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        mutableDateTime35.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.yearOfCentury();
        mutableDateTime35.setTime(1580521526770L);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime46.add(readablePeriod49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.hourOfDay();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime46.dayOfWeek();
        org.joda.time.DurationField durationField53 = property52.getRangeDurationField();
        org.joda.time.DurationField durationField54 = property52.getDurationField();
        java.lang.String str55 = property52.getAsShortText();
        org.joda.time.DurationField durationField56 = property52.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime57 = property52.getMutableDateTime();
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        int int61 = mutableDateTime60.getDayOfWeek();
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.DateTimeZone dateTimeZone65 = mutableDateTime64.getZone();
        org.joda.time.MutableDateTime mutableDateTime66 = org.joda.time.MutableDateTime.now(dateTimeZone65);
        mutableDateTime60.setZoneRetainFields(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime68 = org.joda.time.MutableDateTime.now(dateTimeZone65);
        mutableDateTime57.setZone(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 6417070, dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime35.toMutableDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime72 = mutableDateTime32.toDateTime(dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and instant36", (mutableDateTime24.compareTo(instant36) == 0) == mutableDateTime24.equals(instant36));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        mutableDateTime2.addMillis(7);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        java.lang.String str16 = mutableDateTime10.toString();
        boolean boolean17 = mutableDateTime10.isEqualNow();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime10.add(readableDuration18);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        mutableDateTime22.setTime((long) '#');
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.hourOfDay();
        java.lang.String str35 = mutableDateTime29.toString();
        int int36 = mutableDateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime22.copy();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        mutableDateTime40.setTime((long) '#');
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime47.hourOfDay();
        java.lang.String str53 = mutableDateTime47.toString();
        int int54 = mutableDateTime40.compareTo((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime47.millisOfDay();
        org.joda.time.Chronology chronology56 = mutableDateTime47.getChronology();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime22, chronology56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.minuteOfHour();
        boolean boolean59 = mutableDateTime10.isAfter((org.joda.time.ReadableInstant) mutableDateTime57);
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        int int63 = mutableDateTime62.getDayOfWeek();
        mutableDateTime62.addSeconds((int) (byte) 0);
        int int66 = mutableDateTime62.getSecondOfMinute();
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = null;
        java.lang.String str71 = mutableDateTime69.toString(dateTimeFormatter70);
        mutableDateTime69.setTime((long) '#');
        java.lang.Object obj74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(obj74, chronology75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = null;
        java.lang.String str78 = mutableDateTime76.toString(dateTimeFormatter77);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        mutableDateTime76.add(readablePeriod79);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime76.hourOfDay();
        java.lang.String str82 = mutableDateTime76.toString();
        int int83 = mutableDateTime69.compareTo((org.joda.time.ReadableInstant) mutableDateTime76);
        java.lang.Object obj84 = mutableDateTime69.clone();
        long long85 = mutableDateTime69.getMillis();
        java.lang.Object obj86 = null;
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime(obj86, chronology87);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = null;
        java.lang.String str90 = mutableDateTime88.toString(dateTimeFormatter89);
        org.joda.time.ReadablePeriod readablePeriod91 = null;
        mutableDateTime88.add(readablePeriod91);
        org.joda.time.MutableDateTime.Property property93 = mutableDateTime88.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType94 = property93.getFieldType();
        int int95 = mutableDateTime69.get(dateTimeFieldType94);
        int int96 = mutableDateTime62.get(dateTimeFieldType94);
        org.joda.time.MutableDateTime.Property property97 = mutableDateTime10.property(dateTimeFieldType94);
        org.joda.time.MutableDateTime.Property property98 = mutableDateTime2.property(dateTimeFieldType94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime6.setMillis((long) (-1));
        int int9 = mutableDateTime6.getDayOfYear();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.centuryOfEra();
        boolean boolean12 = mutableDateTime6.isEqual(1606262400035L);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant21 = null;
        mutableDateTime15.setDate(readableInstant21);
        java.util.Date date23 = mutableDateTime15.toDate();
        mutableDateTime15.setWeekyear(10);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone29);
        mutableDateTime15.setZone(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = mutableDateTime6.toDateTime(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.dayOfWeek();
        int int10 = property9.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime13 = property9.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, 40);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime13.toMutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(6436228L, chronology23);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology23);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.monthOfYear();
        mutableDateTime29.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.addWrapField(4);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.minuteOfHour();
        int int38 = mutableDateTime26.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant30", (mutableDateTime19.compareTo(instant30) == 0) == mutableDateTime19.equals(instant30));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.add((int) (short) 10);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.yearOfEra();
        int int12 = property11.getMaximumValue();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        int int17 = mutableDateTime15.getSecondOfMinute();
        int int18 = mutableDateTime15.getMonthOfYear();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant28 = null;
        mutableDateTime22.setDate(readableInstant28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfMonth();
        int int32 = mutableDateTime30.getCenturyOfEra();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        mutableDateTime35.setSecondOfMinute((int) '4');
        int int38 = mutableDateTime35.getMinuteOfDay();
        int int39 = mutableDateTime35.getCenturyOfEra();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        int int43 = mutableDateTime42.getDayOfWeek();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(dateTimeZone47);
        mutableDateTime42.setZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = mutableDateTime35.toDateTime(dateTimeZone47);
        mutableDateTime30.setZoneRetainFields(dateTimeZone47);
        mutableDateTime22.setZone(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime15.toMutableDateTime(dateTimeZone47);
        long long55 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.year();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        int int21 = mutableDateTime16.getWeekOfWeekyear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTime dateTime26 = mutableDateTime16.toDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime16.copy();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfWeek();
        mutableDateTime12.setDate((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.Instant instant30 = mutableDateTime27.toInstant();
        mutableDateTime27.setDayOfWeek(5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and instant30", (mutableDateTime16.compareTo(instant30) == 0) == mutableDateTime16.equals(instant30));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        java.util.Date date6 = mutableDateTime2.toDate();
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        boolean boolean8 = mutableDateTime2.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime7", (instant3.compareTo(dateTime7) == 0) == instant3.equals(dateTime7));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setTime(1580521526770L);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        org.joda.time.DurationField durationField20 = property19.getRangeDurationField();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        java.lang.String str22 = property19.getAsShortText();
        org.joda.time.DurationField durationField23 = property19.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime24 = property19.getMutableDateTime();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        int int28 = mutableDateTime27.getDayOfWeek();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        mutableDateTime27.setZoneRetainFields(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        mutableDateTime24.setZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 6417070, dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime2.toMutableDateTime(dateTimeZone32);
        mutableDateTime38.addYears(33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int16 = mutableDateTime5.getDayOfYear();
        mutableDateTime5.setSecondOfDay(6319);
        int int19 = mutableDateTime5.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        long long3 = property2.remainder();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.MutableDateTime mutableDateTime6 = property2.add(1L);
        mutableDateTime6.setDayOfYear((int) (short) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        int int13 = property12.get();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant22 = null;
        mutableDateTime16.setDate(readableInstant22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfMonth();
        int int26 = mutableDateTime24.getCenturyOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology28);
        mutableDateTime29.setSecondOfMinute((int) '4');
        int int32 = mutableDateTime29.getMinuteOfDay();
        int int33 = mutableDateTime29.getCenturyOfEra();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        int int37 = mutableDateTime36.getDayOfWeek();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        mutableDateTime36.setZoneRetainFields(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = mutableDateTime29.toDateTime(dateTimeZone41);
        mutableDateTime24.setZoneRetainFields(dateTimeZone41);
        mutableDateTime16.setZone(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        long long48 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.MutableDateTime mutableDateTime49 = property12.roundCeiling();
        int int50 = mutableDateTime6.compareTo((org.joda.time.ReadableInstant) mutableDateTime49);
        mutableDateTime49.setYear(2);
        java.util.GregorianCalendar gregorianCalendar53 = mutableDateTime49.toGregorianCalendar();
        mutableDateTime49.setYear(6386);
        org.joda.time.DateTime dateTime56 = mutableDateTime49.toDateTimeISO();
        org.joda.time.Instant instant57 = mutableDateTime49.toInstant();
        mutableDateTime49.addWeeks(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime49 and instant57", (mutableDateTime49.compareTo(instant57) == 0) == mutableDateTime49.equals(instant57));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime5.copy();
        mutableDateTime8.setYear((int) (byte) 0);
        org.joda.time.Chronology chronology11 = mutableDateTime8.getChronology();
        mutableDateTime8.addHours(981);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.centuryOfEra();
        int int31 = property21.getDifference((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime25.toMutableDateTimeISO();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime32.toMutableDateTime(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone36);
        mutableDateTime8.setZone(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }
}

