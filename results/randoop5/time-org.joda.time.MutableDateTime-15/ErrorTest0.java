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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime mutableDateTime12 = property4.addWrapField((int) (short) 10);
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DurationField durationField11 = property4.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
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
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
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
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        boolean boolean11 = mutableDateTime8.isBefore(1L);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.era();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime22.add(readablePeriod29);
        org.joda.time.Chronology chronology31 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, chronology31);
        mutableDateTime14.setChronology(chronology31);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj35 = mutableDateTime8.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
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
        mutableDateTime2.add((long) (byte) 1);
        int int7 = mutableDateTime2.getYearOfEra();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone15);
        mutableDateTime2.setZoneRetainFields(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        long long11 = property4.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.era();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime13.add(readablePeriod20);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        mutableDateTime13.setZoneRetainFields(dateTimeZone25);
        mutableDateTime8.setZoneRetainFields(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.era();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime9.add(readablePeriod16);
        org.joda.time.Chronology chronology18 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology18);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        java.lang.String str25 = mutableDateTime23.toString();
        mutableDateTime23.setDayOfYear((int) ' ');
        mutableDateTime23.addWeekyears(48);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology31);
        mutableDateTime32.addMillis((int) 'a');
        mutableDateTime32.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField38 = property37.getField();
        int int39 = mutableDateTime23.get(dateTimeField38);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.hourOfDay();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime42.era();
        java.util.Locale locale49 = null;
        java.lang.String str50 = property48.getAsText(locale49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property48.getFieldType();
        int int52 = mutableDateTime23.get(dateTimeFieldType51);
        boolean boolean53 = mutableDateTime20.isSupported(dateTimeFieldType51);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime5.property(dateTimeFieldType51);
        int int55 = mutableDateTime2.get(dateTimeFieldType51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = mutableDateTime14.getRoundingField();
        boolean boolean16 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        mutableDateTime19.add((long) (byte) 1);
        boolean boolean24 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant20", (mutableDateTime8.compareTo(instant20) == 0) == mutableDateTime8.equals(instant20));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTimeISO();
        boolean boolean5 = mutableDateTime2.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        int int9 = dateTime8.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant7", (mutableDateTime2.compareTo(instant7) == 0) == mutableDateTime2.equals(instant7));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.minuteOfHour();
        boolean boolean14 = property9.equals((java.lang.Object) property13);
        boolean boolean15 = property9.isLeap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        mutableDateTime2.setDate((long) 7);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        int int17 = mutableDateTime14.getMinuteOfHour();
        boolean boolean18 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = mutableDateTime2.toDateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant15", (mutableDateTime14.compareTo(instant15) == 0) == mutableDateTime14.equals(instant15));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        boolean boolean11 = mutableDateTime8.isBefore(1L);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.era();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime22.add(readablePeriod29);
        org.joda.time.Chronology chronology31 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, chronology31);
        mutableDateTime14.setChronology(chronology31);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
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
        int int5 = property4.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime4.getRoundingField();
        boolean boolean7 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime4.setWeekyear(37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime5.add(readablePeriod8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.era();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime5.add(readablePeriod12);
        org.joda.time.Chronology chronology14 = mutableDateTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(0L, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        java.lang.String str21 = mutableDateTime19.toString();
        mutableDateTime19.setDayOfYear((int) ' ');
        mutableDateTime19.addWeekyears(48);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology27);
        mutableDateTime28.addMillis((int) 'a');
        mutableDateTime28.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = property33.getField();
        int int35 = mutableDateTime19.get(dateTimeField34);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime38.era();
        java.util.Locale locale45 = null;
        java.lang.String str46 = property44.getAsText(locale45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property44.getFieldType();
        int int48 = mutableDateTime19.get(dateTimeFieldType47);
        boolean boolean49 = mutableDateTime16.isSupported(dateTimeFieldType47);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime1.property(dateTimeFieldType47);
        java.util.Locale locale51 = null;
        int int52 = property50.getMaximumShortTextLength(locale51);
        org.joda.time.MutableDateTime mutableDateTime53 = property50.roundHalfEven();
        mutableDateTime53.setDate(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime53 and mutableDateTime15", (mutableDateTime53.compareTo(mutableDateTime15) == 0) == mutableDateTime53.equals(mutableDateTime15));
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
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setTime(3, (int) (short) 10, 10, (int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime2.add(readablePeriod13, 0);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        int int22 = mutableDateTime21.getMonthOfYear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        java.lang.String str27 = mutableDateTime25.toString();
        mutableDateTime25.setDayOfYear((int) ' ');
        mutableDateTime25.addWeekyears(48);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology33);
        mutableDateTime34.addMillis((int) 'a');
        mutableDateTime34.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        int int41 = mutableDateTime25.get(dateTimeField40);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.hourOfDay();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime44.era();
        java.util.Locale locale51 = null;
        java.lang.String str52 = property50.getAsText(locale51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property50.getFieldType();
        int int54 = mutableDateTime25.get(dateTimeFieldType53);
        boolean boolean55 = mutableDateTime21.isSupported(dateTimeFieldType53);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime2.property(dateTimeFieldType53);
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = null;
        java.lang.String str61 = mutableDateTime59.toString(dateTimeFormatter60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        mutableDateTime59.add(readablePeriod62);
        java.util.Date date64 = mutableDateTime59.toDate();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime59.copy();
        java.util.Date date66 = mutableDateTime59.toDate();
        boolean boolean67 = property56.equals((java.lang.Object) date66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and mutableDateTime44", (instant19.compareTo(mutableDateTime44) == 0) == instant19.equals(mutableDateTime44));
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
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.minuteOfHour();
        boolean boolean14 = property9.equals((java.lang.Object) property13);
        java.util.Locale locale15 = null;
        int int16 = property9.getMaximumShortTextLength(locale15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.getMutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime10.toMutableDateTime(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:21.746Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        int int7 = mutableDateTime4.getYearOfCentury();
        org.joda.time.Chronology chronology8 = mutableDateTime4.getChronology();
        int int9 = mutableDateTime4.getWeekOfWeekyear();
        mutableDateTime4.setTime(3, (int) (short) 10, 10, (int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime4.add(readablePeriod15, 0);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        int int24 = mutableDateTime23.getMonthOfYear();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        java.lang.String str29 = mutableDateTime27.toString();
        mutableDateTime27.setDayOfYear((int) ' ');
        mutableDateTime27.addWeekyears(48);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology35);
        mutableDateTime36.addMillis((int) 'a');
        mutableDateTime36.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        int int43 = mutableDateTime27.get(dateTimeField42);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime46.add(readablePeriod49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.hourOfDay();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime46.era();
        java.util.Locale locale53 = null;
        java.lang.String str54 = property52.getAsText(locale53);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property52.getFieldType();
        int int56 = mutableDateTime27.get(dateTimeFieldType55);
        boolean boolean57 = mutableDateTime23.isSupported(dateTimeFieldType55);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime4.property(dateTimeFieldType55);
        mutableDateTime1.set(dateTimeFieldType55, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and mutableDateTime46", (instant21.compareTo(mutableDateTime46) == 0) == instant21.equals(mutableDateTime46));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime5.add(readablePeriod8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.era();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime5.add(readablePeriod12);
        org.joda.time.Chronology chronology14 = mutableDateTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(0L, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        java.lang.String str21 = mutableDateTime19.toString();
        mutableDateTime19.setDayOfYear((int) ' ');
        mutableDateTime19.addWeekyears(48);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology27);
        mutableDateTime28.addMillis((int) 'a');
        mutableDateTime28.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = property33.getField();
        int int35 = mutableDateTime19.get(dateTimeField34);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime38.era();
        java.util.Locale locale45 = null;
        java.lang.String str46 = property44.getAsText(locale45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property44.getFieldType();
        int int48 = mutableDateTime19.get(dateTimeFieldType47);
        boolean boolean49 = mutableDateTime16.isSupported(dateTimeFieldType47);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime1.property(dateTimeFieldType47);
        java.util.Locale locale51 = null;
        int int52 = property50.getMaximumShortTextLength(locale51);
        org.joda.time.MutableDateTime mutableDateTime53 = property50.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime54 = property50.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj56 = mutableDateTime55.clone();
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime60.getZone();
        java.lang.String str62 = mutableDateTime60.toString();
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime60.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone63);
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime55.toMutableDateTime(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = mutableDateTime54.toDateTime(dateTimeZone63);
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.DateTimeZone dateTimeZone70 = mutableDateTime69.getZone();
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(dateTimeZone70);
        org.joda.time.DateTime dateTime72 = mutableDateTime71.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime71.centuryOfEra();
        java.lang.Object obj74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(obj74, chronology75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = null;
        java.lang.String str78 = mutableDateTime76.toString(dateTimeFormatter77);
        int int79 = mutableDateTime76.getYearOfCentury();
        org.joda.time.Chronology chronology80 = mutableDateTime76.getChronology();
        org.joda.time.DateTime dateTime81 = mutableDateTime71.toDateTime(chronology80);
        org.joda.time.DateTime dateTime82 = mutableDateTime54.toDateTime(chronology80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime54 and dateTime66", (mutableDateTime54.compareTo(dateTime66) == 0) == mutableDateTime54.equals(dateTime66));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        boolean boolean11 = mutableDateTime9.equals((java.lang.Object) 10.0f);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime13, dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime9.toMutableDateTime(dateTimeZone17);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        java.lang.String str26 = mutableDateTime24.toString();
        mutableDateTime24.setDayOfYear((int) ' ');
        mutableDateTime24.addWeekyears(48);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        mutableDateTime33.addMillis((int) 'a');
        mutableDateTime33.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        int int40 = mutableDateTime24.get(dateTimeField39);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.era();
        java.util.Locale locale50 = null;
        java.lang.String str51 = property49.getAsText(locale50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property49.getFieldType();
        int int53 = mutableDateTime24.get(dateTimeFieldType52);
        int int54 = mutableDateTime9.get(dateTimeFieldType52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        java.lang.String str11 = mutableDateTime9.toString();
        mutableDateTime9.setDayOfYear((int) ' ');
        mutableDateTime9.addWeekyears(48);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        mutableDateTime18.addMillis((int) 'a');
        mutableDateTime18.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        int int25 = mutableDateTime9.get(dateTimeField24);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.era();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property34.getAsText(locale35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property34.getFieldType();
        int int38 = mutableDateTime9.get(dateTimeFieldType37);
        boolean boolean39 = mutableDateTime5.isSupported(dateTimeFieldType37);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        java.util.Date date47 = mutableDateTime42.toDate();
        java.util.Locale locale48 = null;
        java.util.Calendar calendar49 = mutableDateTime42.toCalendar(locale48);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime42.toMutableDateTime();
        boolean boolean51 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime50);
        org.joda.time.ReadableDuration readableDuration52 = null;
        mutableDateTime50.add(readableDuration52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        boolean boolean11 = mutableDateTime8.isBefore(1L);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.era();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime22.add(readablePeriod29);
        org.joda.time.Chronology chronology31 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, chronology31);
        mutableDateTime14.setChronology(chronology31);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) mutableDateTime14);
        mutableDateTime14.setTime((long) 70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone5);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.hourOfDay();
        mutableDateTime7.add((long) (byte) 100);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        int int18 = mutableDateTime7.get(dateTimeFieldType17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant14", (mutableDateTime4.compareTo(instant14) == 0) == mutableDateTime4.equals(instant14));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        java.lang.String str6 = mutableDateTime4.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone7);
        mutableDateTime9.setSecondOfMinute(19);
        org.joda.time.Instant instant12 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.minuteOfHour();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property13.getAsText(locale14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant12", (mutableDateTime9.compareTo(instant12) == 0) == mutableDateTime9.equals(instant12));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        int int7 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.setMinuteOfHour(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime2.setZone(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.dayOfMonth();
        int int19 = mutableDateTime2.getMinuteOfDay();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        mutableDateTime25.setZone(dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime25.add(readableDuration28);
        int int30 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant23", (mutableDateTime12.compareTo(instant23) == 0) == mutableDateTime12.equals(instant23));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.era();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime3.add(readablePeriod10);
        org.joda.time.Chronology chronology12 = mutableDateTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        int int15 = mutableDateTime14.getMonthOfYear();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        mutableDateTime14.setTime((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant19", (mutableDateTime3.compareTo(instant19) == 0) == mutableDateTime3.equals(instant19));
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
        int int5 = mutableDateTime2.getMinuteOfHour();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.hourOfDay();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.era();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime16.add(readablePeriod23);
        org.joda.time.Chronology chronology25 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology25);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        java.lang.String str32 = mutableDateTime30.toString();
        mutableDateTime30.setDayOfYear((int) ' ');
        mutableDateTime30.addWeekyears(48);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology38);
        mutableDateTime39.addMillis((int) 'a');
        mutableDateTime39.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField45 = property44.getField();
        int int46 = mutableDateTime30.get(dateTimeField45);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime49.add(readablePeriod52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime49.hourOfDay();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime49.era();
        java.util.Locale locale56 = null;
        java.lang.String str57 = property55.getAsText(locale56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property55.getFieldType();
        int int59 = mutableDateTime30.get(dateTimeFieldType58);
        boolean boolean60 = mutableDateTime27.isSupported(dateTimeFieldType58);
        boolean boolean61 = mutableDateTime8.isSupported(dateTimeFieldType58);
        boolean boolean62 = mutableDateTime2.isSupported(dateTimeFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        boolean boolean8 = mutableDateTime6.isBefore((long) 3);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.minuteOfHour();
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = mutableDateTime6.toCalendar(locale10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundCeiling();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property16.getAsText(locale18);
        int int20 = property16.get();
        org.joda.time.MutableDateTime mutableDateTime22 = property16.add((long) '4');
        org.joda.time.MutableDateTime mutableDateTime24 = property16.addWrapField(108);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property16.getFieldType();
        mutableDateTime6.set(dateTimeFieldType25, 11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant15", (mutableDateTime0.compareTo(instant15) == 0) == mutableDateTime0.equals(instant15));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.getMutableDateTime();
        long long18 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        int int6 = mutableDateTime2.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7, 2020);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        mutableDateTime12.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfDay();
        boolean boolean18 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTime();
        int int20 = mutableDateTime2.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.setMillisOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTime();
        int int9 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.hourOfDay();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        int int18 = mutableDateTime2.get(dateTimeFieldType17);
        mutableDateTime2.addMillis(926);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.DateTime dateTime29 = mutableDateTime2.toDateTime(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime23", (instant14.compareTo(mutableDateTime23) == 0) == instant14.equals(mutableDateTime23));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        mutableDateTime2.setMillisOfDay((int) (byte) 100);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfEven();
        boolean boolean19 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.add(330);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        int int28 = mutableDateTime25.getYearOfCentury();
        int int29 = mutableDateTime25.getYearOfCentury();
        int int30 = mutableDateTime25.getHourOfDay();
        int int31 = mutableDateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        mutableDateTime22.setDate((long) 8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and instant26", (mutableDateTime25.compareTo(instant26) == 0) == mutableDateTime25.equals(instant26));
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
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        long long7 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime mutableDateTime9 = property4.addWrapField(6407489);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        boolean boolean11 = mutableDateTime8.isBefore(1L);
        mutableDateTime8.setSecondOfDay(29);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.addMillis((int) 'a');
        mutableDateTime16.setMonthOfYear((int) (byte) 10);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.DateTime dateTime34 = dateTime26.toDateTime(chronology33);
        org.joda.time.DateTime dateTime35 = mutableDateTime16.toDateTime(chronology33);
        mutableDateTime8.setChronology(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        int int26 = mutableDateTime21.getWeekOfWeekyear();
        mutableDateTime21.setTime(3, (int) (short) 10, 10, (int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime21.add(readablePeriod32, 0);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.Instant instant38 = mutableDateTime37.toInstant();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime37.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundHalfFloor();
        int int41 = mutableDateTime40.getMonthOfYear();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        java.lang.String str46 = mutableDateTime44.toString();
        mutableDateTime44.setDayOfYear((int) ' ');
        mutableDateTime44.addWeekyears(48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology52);
        mutableDateTime53.addMillis((int) 'a');
        mutableDateTime53.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime53.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField59 = property58.getField();
        int int60 = mutableDateTime44.get(dateTimeField59);
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = null;
        java.lang.String str65 = mutableDateTime63.toString(dateTimeFormatter64);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        mutableDateTime63.add(readablePeriod66);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime63.hourOfDay();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime63.era();
        java.util.Locale locale70 = null;
        java.lang.String str71 = property69.getAsText(locale70);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property69.getFieldType();
        int int73 = mutableDateTime44.get(dateTimeFieldType72);
        boolean boolean74 = mutableDateTime40.isSupported(dateTimeFieldType72);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime21.property(dateTimeFieldType72);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime18.property(dateTimeFieldType72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant38", (mutableDateTime9.compareTo(instant38) == 0) == mutableDateTime9.equals(instant38));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = mutableDateTime6.isSupported(dateTimeFieldType7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        boolean boolean12 = mutableDateTime10.equals((java.lang.Object) 10.0f);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime14, dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime10.toMutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(1606268768642L, dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime14", (instant4.compareTo(mutableDateTime14) == 0) == instant4.equals(mutableDateTime14));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        mutableDateTime5.setZone(dateTimeZone6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        int int14 = dateTime13.getMinuteOfHour();
        boolean boolean15 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) dateTime13);
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
        mutableDateTime5.setMillis((long) 7);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.millisOfSecond();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        int int13 = mutableDateTime11.getSecondOfMinute();
        mutableDateTime11.setMillis((long) 3);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        java.util.Date date23 = mutableDateTime18.toDate();
        boolean boolean24 = mutableDateTime11.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime11.copy();
        boolean boolean26 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        boolean boolean11 = mutableDateTime9.equals((java.lang.Object) 10.0f);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        java.lang.String str16 = mutableDateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime14.getZone();
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime9.toMutableDateTime(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.set((int) ' ');
        java.lang.String str11 = property6.getAsShortText();
        java.lang.String str12 = property6.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime13, dateTimeZone17);
        java.lang.String str19 = mutableDateTime13.toString();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime13.yearOfCentury();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.DateTime dateTime34 = dateTime26.toDateTime(chronology33);
        int int35 = property20.getDifference((org.joda.time.ReadableInstant) dateTime34);
        int int36 = property6.compareTo((org.joda.time.ReadableInstant) dateTime34);
        int int37 = property6.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        int int7 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.setMinuteOfHour(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime2.setZone(dateTimeZone15);
        org.joda.time.Instant instant18 = mutableDateTime2.toInstant();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.era();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime22.add(readablePeriod29);
        org.joda.time.Chronology chronology31 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(chronology31);
        boolean boolean34 = instant18.isBefore((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant18", (mutableDateTime2.compareTo(instant18) == 0) == mutableDateTime2.equals(instant18));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        mutableDateTime2.setMinuteOfHour(2);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.yearOfEra();
        int int11 = mutableDateTime2.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone16);
        java.lang.String str18 = mutableDateTime12.toString();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime12.dayOfMonth();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.centuryOfEra();
        int int21 = mutableDateTime12.getMillisOfDay();
        int int22 = mutableDateTime12.getDayOfYear();
        mutableDateTime12.setMinuteOfHour(48);
        int int25 = mutableDateTime12.getSecondOfMinute();
        int int26 = mutableDateTime12.getMillisOfDay();
        boolean boolean27 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime15", (instant7.compareTo(mutableDateTime15) == 0) == instant7.equals(mutableDateTime15));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        boolean boolean8 = property4.equals((java.lang.Object) 1.0f);
        java.lang.String str9 = property4.getAsString();
        org.joda.time.MutableDateTime mutableDateTime11 = property4.add((long) 48);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.secondOfDay();
        int int16 = property15.getMaximumValue();
        java.lang.String str17 = property15.getAsShortText();
        org.joda.time.DurationField durationField18 = property15.getLeapDurationField();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.hourOfDay();
        int int26 = mutableDateTime21.getDayOfYear();
        mutableDateTime21.setWeekyear(6355110);
        int int29 = property15.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property15.getFieldType();
        boolean boolean31 = mutableDateTime11.isSupported(dateTimeFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.getMutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.era();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsText(locale20);
        org.joda.time.MutableDateTime mutableDateTime22 = property19.roundHalfCeiling();
        mutableDateTime22.setDateTime(5, (int) (byte) 1, (int) (byte) 1, 2, (int) (byte) 1, 15, 0);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime36.era();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime36.add(readablePeriod43);
        org.joda.time.Chronology chronology45 = mutableDateTime36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology45);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        java.lang.String str52 = mutableDateTime50.toString();
        mutableDateTime50.setDayOfYear((int) ' ');
        mutableDateTime50.addWeekyears(48);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology58);
        mutableDateTime59.addMillis((int) 'a');
        mutableDateTime59.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime59.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField65 = property64.getField();
        int int66 = mutableDateTime50.get(dateTimeField65);
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = null;
        java.lang.String str71 = mutableDateTime69.toString(dateTimeFormatter70);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        mutableDateTime69.add(readablePeriod72);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime69.hourOfDay();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime69.era();
        java.util.Locale locale76 = null;
        java.lang.String str77 = property75.getAsText(locale76);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property75.getFieldType();
        int int79 = mutableDateTime50.get(dateTimeFieldType78);
        boolean boolean80 = mutableDateTime47.isSupported(dateTimeFieldType78);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime32.property(dateTimeFieldType78);
        mutableDateTime22.set(dateTimeFieldType78, 1);
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime22.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime36", (instant3.compareTo(mutableDateTime36) == 0) == instant3.equals(mutableDateTime36));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.Instant instant9 = mutableDateTime5.toInstant();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.hourOfDay();
        java.util.Date date17 = mutableDateTime12.toDate();
        int int18 = mutableDateTime12.getDayOfYear();
        int int19 = mutableDateTime12.getDayOfYear();
        int int20 = mutableDateTime12.getEra();
        mutableDateTime12.setDate((long) 7);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.hourOfDay();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime25.era();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime25.add(readablePeriod32);
        org.joda.time.Chronology chronology34 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime5, chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant9", (mutableDateTime5.compareTo(instant9) == 0) == mutableDateTime5.equals(instant9));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.getMutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.era();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsText(locale20);
        org.joda.time.MutableDateTime mutableDateTime22 = property19.roundHalfCeiling();
        mutableDateTime22.setDateTime(5, (int) (byte) 1, (int) (byte) 1, 2, (int) (byte) 1, 15, 0);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime36.era();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime36.add(readablePeriod43);
        org.joda.time.Chronology chronology45 = mutableDateTime36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology45);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        java.lang.String str52 = mutableDateTime50.toString();
        mutableDateTime50.setDayOfYear((int) ' ');
        mutableDateTime50.addWeekyears(48);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology58);
        mutableDateTime59.addMillis((int) 'a');
        mutableDateTime59.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime59.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField65 = property64.getField();
        int int66 = mutableDateTime50.get(dateTimeField65);
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = null;
        java.lang.String str71 = mutableDateTime69.toString(dateTimeFormatter70);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        mutableDateTime69.add(readablePeriod72);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime69.hourOfDay();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime69.era();
        java.util.Locale locale76 = null;
        java.lang.String str77 = property75.getAsText(locale76);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property75.getFieldType();
        int int79 = mutableDateTime50.get(dateTimeFieldType78);
        boolean boolean80 = mutableDateTime47.isSupported(dateTimeFieldType78);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime32.property(dateTimeFieldType78);
        mutableDateTime22.set(dateTimeFieldType78, 1);
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) mutableDateTime22);
        java.lang.Object obj85 = null;
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime(obj85, chronology86);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = null;
        java.lang.String str89 = mutableDateTime87.toString(dateTimeFormatter88);
        org.joda.time.ReadablePeriod readablePeriod90 = null;
        mutableDateTime87.add(readablePeriod90);
        org.joda.time.MutableDateTime.Property property92 = mutableDateTime87.hourOfDay();
        org.joda.time.MutableDateTime.Property property93 = mutableDateTime87.era();
        org.joda.time.ReadablePeriod readablePeriod94 = null;
        mutableDateTime87.add(readablePeriod94);
        org.joda.time.Chronology chronology96 = mutableDateTime87.getChronology();
        org.joda.time.MutableDateTime mutableDateTime97 = mutableDateTime10.toMutableDateTime(chronology96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime36", (instant3.compareTo(mutableDateTime36) == 0) == instant3.equals(mutableDateTime36));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.setMillisOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.hourOfDay();
        int int9 = mutableDateTime2.getDayOfWeek();
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTime();
        org.joda.time.Instant instant11 = mutableDateTime2.toInstant();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        int int16 = mutableDateTime14.getSecondOfMinute();
        mutableDateTime14.setMillis((long) 3);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        java.util.Date date26 = mutableDateTime21.toDate();
        boolean boolean27 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime21.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime21.weekyear();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.era();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime33.add(readablePeriod40);
        org.joda.time.Chronology chronology42 = mutableDateTime33.getChronology();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime45.getZone();
        java.lang.String str47 = mutableDateTime45.toString();
        mutableDateTime45.setDayOfYear((int) ' ');
        mutableDateTime45.addWeekyears(48);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology53);
        mutableDateTime54.addMillis((int) 'a');
        mutableDateTime54.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime54.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField60 = property59.getField();
        int int61 = mutableDateTime45.get(dateTimeField60);
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = mutableDateTime64.toString(dateTimeFormatter65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        mutableDateTime64.add(readablePeriod67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime64.hourOfDay();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime64.era();
        java.util.Locale locale71 = null;
        java.lang.String str72 = property70.getAsText(locale71);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property70.getFieldType();
        int int74 = mutableDateTime45.get(dateTimeFieldType73);
        boolean boolean75 = mutableDateTime33.isSupported(dateTimeFieldType73);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime21.property(dateTimeFieldType73);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime2.property(dateTimeFieldType73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        boolean boolean11 = mutableDateTime8.isBefore(1L);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.era();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime22.add(readablePeriod29);
        org.joda.time.Chronology chronology31 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, chronology31);
        mutableDateTime14.setChronology(chronology31);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) mutableDateTime14);
        int int35 = mutableDateTime14.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime4.getRoundingField();
        boolean boolean7 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime2.setSecondOfMinute(49);
        mutableDateTime2.addSeconds(10051);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = mutableDateTime14.getRoundingField();
        boolean boolean16 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        java.lang.String str21 = mutableDateTime19.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime19.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime2.toMutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.secondOfMinute();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.roundHalfEven();
        boolean boolean34 = property30.equals((java.lang.Object) 1.0f);
        org.joda.time.MutableDateTime mutableDateTime35 = property30.roundHalfFloor();
        int int36 = property30.getMaximumValueOverall();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = mutableDateTime42.isSupported(dateTimeFieldType43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime42.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundFloor();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime46.add(readablePeriod47, (int) '#');
        int int50 = property30.getDifference((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.MutableDateTime mutableDateTime51 = property30.roundFloor();
        int int52 = property25.compareTo((org.joda.time.ReadableInstant) mutableDateTime51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant29", (mutableDateTime8.compareTo(instant29) == 0) == mutableDateTime8.equals(instant29));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        java.lang.String str11 = mutableDateTime9.toString();
        mutableDateTime9.setDayOfYear((int) ' ');
        mutableDateTime9.addWeekyears(48);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        mutableDateTime18.addMillis((int) 'a');
        mutableDateTime18.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        int int25 = mutableDateTime9.get(dateTimeField24);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.era();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property34.getAsText(locale35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property34.getFieldType();
        int int38 = mutableDateTime9.get(dateTimeFieldType37);
        boolean boolean39 = mutableDateTime5.isSupported(dateTimeFieldType37);
        mutableDateTime5.setMillis((long) 38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.getMutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.era();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsText(locale20);
        org.joda.time.MutableDateTime mutableDateTime22 = property19.roundHalfCeiling();
        mutableDateTime22.setDateTime(5, (int) (byte) 1, (int) (byte) 1, 2, (int) (byte) 1, 15, 0);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime36.era();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime36.add(readablePeriod43);
        org.joda.time.Chronology chronology45 = mutableDateTime36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology45);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        java.lang.String str52 = mutableDateTime50.toString();
        mutableDateTime50.setDayOfYear((int) ' ');
        mutableDateTime50.addWeekyears(48);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology58);
        mutableDateTime59.addMillis((int) 'a');
        mutableDateTime59.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime59.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField65 = property64.getField();
        int int66 = mutableDateTime50.get(dateTimeField65);
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = null;
        java.lang.String str71 = mutableDateTime69.toString(dateTimeFormatter70);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        mutableDateTime69.add(readablePeriod72);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime69.hourOfDay();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime69.era();
        java.util.Locale locale76 = null;
        java.lang.String str77 = property75.getAsText(locale76);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property75.getFieldType();
        int int79 = mutableDateTime50.get(dateTimeFieldType78);
        boolean boolean80 = mutableDateTime47.isSupported(dateTimeFieldType78);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime32.property(dateTimeFieldType78);
        mutableDateTime22.set(dateTimeFieldType78, 1);
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) mutableDateTime22);
        int int85 = mutableDateTime22.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime36", (instant3.compareTo(mutableDateTime36) == 0) == instant3.equals(mutableDateTime36));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        org.joda.time.Chronology chronology9 = mutableDateTime2.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime4.getRoundingField();
        boolean boolean7 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime4);
        int int8 = mutableDateTime4.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        java.lang.String str11 = mutableDateTime9.toString();
        mutableDateTime9.setDayOfYear((int) ' ');
        mutableDateTime9.addWeekyears(48);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        mutableDateTime18.addMillis((int) 'a');
        mutableDateTime18.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        int int25 = mutableDateTime9.get(dateTimeField24);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.era();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property34.getAsText(locale35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property34.getFieldType();
        int int38 = mutableDateTime9.get(dateTimeFieldType37);
        boolean boolean39 = mutableDateTime5.isSupported(dateTimeFieldType37);
        int int40 = mutableDateTime5.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime9.getZone();
        mutableDateTime9.addWeekyears(84);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = mutableDateTime24.isSupported(dateTimeFieldType25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundFloor();
        boolean boolean30 = mutableDateTime28.equals((java.lang.Object) 10.0f);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime32, dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime28.toMutableDateTime(dateTimeZone36);
        mutableDateTime9.setZoneRetainFields(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant22 and mutableDateTime32", (instant22.compareTo(mutableDateTime32) == 0) == instant22.equals(mutableDateTime32));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.get();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        java.lang.String str13 = mutableDateTime11.toString();
        mutableDateTime11.setDayOfYear((int) ' ');
        mutableDateTime11.addWeekyears(48);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        mutableDateTime20.addMillis((int) 'a');
        mutableDateTime20.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        int int27 = mutableDateTime11.get(dateTimeField26);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.hourOfDay();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.era();
        java.util.Locale locale37 = null;
        java.lang.String str38 = property36.getAsText(locale37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property36.getFieldType();
        int int40 = mutableDateTime11.get(dateTimeFieldType39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime11.secondOfDay();
        org.joda.time.DurationField durationField42 = property41.getRangeDurationField();
        boolean boolean43 = property4.equals((java.lang.Object) durationField42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        int int6 = mutableDateTime2.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7, 2020);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        mutableDateTime12.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfDay();
        boolean boolean18 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField20 = mutableDateTime2.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime4.getRoundingField();
        boolean boolean7 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime2.setMinuteOfHour(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        mutableDateTime2.setMinuteOfHour(7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.setMillisOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.hourOfDay();
        int int9 = mutableDateTime2.getDayOfWeek();
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTime();
        org.joda.time.Instant instant11 = mutableDateTime2.toInstant();
        int int12 = mutableDateTime2.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        mutableDateTime2.addDays(100);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        mutableDateTime2.setRounding(dateTimeField17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.year();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        mutableDateTime22.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.secondOfDay();
        int int27 = property26.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.roundCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property26.getFieldType();
        mutableDateTime2.set(dateTimeFieldType29, 42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant23", (mutableDateTime11.compareTo(instant23) == 0) == mutableDateTime11.equals(instant23));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        int int6 = mutableDateTime2.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7, 2020);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        mutableDateTime12.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfDay();
        boolean boolean18 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTime();
        mutableDateTime19.addDays(27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        long long7 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime6);
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumShortTextLength(locale8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        java.lang.String str10 = property8.getAsText();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime13.toMutableDateTimeISO();
        int int16 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
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
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        mutableDateTime2.setDate((long) 7);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        int int17 = mutableDateTime14.getMinuteOfHour();
        boolean boolean18 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime14.add(readableDuration19, 4);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.minuteOfHour();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        java.lang.String str27 = mutableDateTime25.toString();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        int int30 = property22.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant15", (mutableDateTime14.compareTo(instant15) == 0) == mutableDateTime14.equals(instant15));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        mutableDateTime5.setZone(dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime5.add(readableDuration8);
        mutableDateTime5.addWeekyears(5);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        mutableDateTime14.addMinutes(33);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.millisOfDay();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.era();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime20.add(readablePeriod27);
        org.joda.time.Chronology chronology29 = mutableDateTime20.getChronology();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        java.lang.String str34 = mutableDateTime32.toString();
        mutableDateTime32.setDayOfYear((int) ' ');
        mutableDateTime32.addWeekyears(48);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology40);
        mutableDateTime41.addMillis((int) 'a');
        mutableDateTime41.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField47 = property46.getField();
        int int48 = mutableDateTime32.get(dateTimeField47);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime51.add(readablePeriod54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.hourOfDay();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime51.era();
        java.util.Locale locale58 = null;
        java.lang.String str59 = property57.getAsText(locale58);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property57.getFieldType();
        int int61 = mutableDateTime32.get(dateTimeFieldType60);
        boolean boolean62 = mutableDateTime20.isSupported(dateTimeFieldType60);
        int int63 = mutableDateTime14.get(dateTimeFieldType60);
        boolean boolean64 = mutableDateTime5.isSupported(dateTimeFieldType60);
        java.lang.Class<?> wildcardClass65 = dateTimeFieldType60.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime2.add(readablePeriod9);
        org.joda.time.Chronology chronology11 = mutableDateTime2.getChronology();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        int int18 = mutableDateTime17.getMonthOfYear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        java.lang.String str23 = mutableDateTime21.toString();
        mutableDateTime21.setDayOfYear((int) ' ');
        mutableDateTime21.addWeekyears(48);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        mutableDateTime30.addMillis((int) 'a');
        mutableDateTime30.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField36 = property35.getField();
        int int37 = mutableDateTime21.get(dateTimeField36);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.era();
        java.util.Locale locale47 = null;
        java.lang.String str48 = property46.getAsText(locale47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property46.getFieldType();
        int int50 = mutableDateTime21.get(dateTimeFieldType49);
        boolean boolean51 = mutableDateTime17.isSupported(dateTimeFieldType49);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime2.property(dateTimeFieldType49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime40", (instant15.compareTo(mutableDateTime40) == 0) == instant15.equals(mutableDateTime40));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        mutableDateTime2.setMillisOfDay((int) (byte) 100);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfEven();
        boolean boolean19 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.add(330);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        int int28 = mutableDateTime25.getYearOfCentury();
        int int29 = mutableDateTime25.getYearOfCentury();
        int int30 = mutableDateTime25.getHourOfDay();
        int int31 = mutableDateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime22.copy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and instant26", (mutableDateTime25.compareTo(instant26) == 0) == mutableDateTime25.equals(instant26));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.set((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.era();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime16.add(readablePeriod23);
        org.joda.time.Chronology chronology25 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology25);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        java.lang.String str32 = mutableDateTime30.toString();
        mutableDateTime30.setDayOfYear((int) ' ');
        mutableDateTime30.addWeekyears(48);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology38);
        mutableDateTime39.addMillis((int) 'a');
        mutableDateTime39.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField45 = property44.getField();
        int int46 = mutableDateTime30.get(dateTimeField45);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime49.add(readablePeriod52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime49.hourOfDay();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime49.era();
        java.util.Locale locale56 = null;
        java.lang.String str57 = property55.getAsText(locale56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property55.getFieldType();
        int int59 = mutableDateTime30.get(dateTimeFieldType58);
        boolean boolean60 = mutableDateTime27.isSupported(dateTimeFieldType58);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime12.property(dateTimeFieldType58);
        int int62 = mutableDateTime12.getWeekOfWeekyear();
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.DateTimeZone dateTimeZone66 = mutableDateTime65.getZone();
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(dateTimeZone66);
        org.joda.time.DateTime dateTime68 = mutableDateTime67.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime67.centuryOfEra();
        boolean boolean70 = mutableDateTime67.isEqualNow();
        boolean boolean71 = mutableDateTime12.isEqual((org.joda.time.ReadableInstant) mutableDateTime67);
        int int72 = property6.getDifference((org.joda.time.ReadableInstant) mutableDateTime67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        int int17 = mutableDateTime15.getSecondOfMinute();
        mutableDateTime15.setMillis((long) 3);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        java.util.Date date27 = mutableDateTime22.toDate();
        boolean boolean28 = mutableDateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime22.getZone();
        org.joda.time.DateTime dateTime30 = mutableDateTime8.toDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime8.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.Interval interval6 = property4.toInterval();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.add((long) 4);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        mutableDateTime11.setTime((long) '#');
        mutableDateTime11.addDays(100);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime11.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfEven();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        java.lang.String str26 = mutableDateTime24.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime19.toMutableDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone27);
        mutableDateTime8.setZoneRetainFields(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        int int5 = mutableDateTime3.getSecondOfMinute();
        mutableDateTime3.setMillis((long) 3);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        java.util.Date date15 = mutableDateTime10.toDate();
        boolean boolean16 = mutableDateTime3.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime10.secondOfMinute();
        int int18 = mutableDateTime10.getSecondOfMinute();
        mutableDateTime10.addWeeks(1);
        org.joda.time.Chronology chronology21 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 14, chronology21);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = mutableDateTime30.isSupported(dateTimeFieldType31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime30.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundFloor();
        boolean boolean36 = mutableDateTime34.equals((java.lang.Object) 10.0f);
        mutableDateTime34.add((long) 64);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime34);
        mutableDateTime24.setDate((org.joda.time.ReadableInstant) mutableDateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and instant28", (mutableDateTime22.compareTo(instant28) == 0) == mutableDateTime22.equals(instant28));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        mutableDateTime2.setHourOfDay(4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        java.lang.String str11 = mutableDateTime9.toString();
        mutableDateTime9.setDayOfYear((int) ' ');
        mutableDateTime9.addWeekyears(48);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        mutableDateTime18.addMillis((int) 'a');
        mutableDateTime18.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        int int25 = mutableDateTime9.get(dateTimeField24);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.era();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property34.getAsText(locale35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property34.getFieldType();
        int int38 = mutableDateTime9.get(dateTimeFieldType37);
        boolean boolean39 = mutableDateTime5.isSupported(dateTimeFieldType37);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        java.util.Date date47 = mutableDateTime42.toDate();
        java.util.Locale locale48 = null;
        java.util.Calendar calendar49 = mutableDateTime42.toCalendar(locale48);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime42.toMutableDateTime();
        boolean boolean51 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime50);
        mutableDateTime5.addMonths(2021);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        int int6 = mutableDateTime2.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7, 2020);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        mutableDateTime12.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfDay();
        boolean boolean18 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        int int19 = mutableDateTime12.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        mutableDateTime5.setZone(dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime5.add(readableDuration8);
        mutableDateTime5.addWeekyears(5);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime14.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.getMutableDateTime();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.era();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime22.add(readablePeriod29);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        mutableDateTime22.setZoneRetainFields(dateTimeZone34);
        int int37 = property18.getDifference((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime39, dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone43);
        int int47 = property18.compareTo((org.joda.time.ReadableInstant) mutableDateTime46);
        int int48 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setTime(3, (int) (short) 10, 10, (int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime2.add(readablePeriod13, 0);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        int int22 = mutableDateTime21.getMonthOfYear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        java.lang.String str27 = mutableDateTime25.toString();
        mutableDateTime25.setDayOfYear((int) ' ');
        mutableDateTime25.addWeekyears(48);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology33);
        mutableDateTime34.addMillis((int) 'a');
        mutableDateTime34.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        int int41 = mutableDateTime25.get(dateTimeField40);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.hourOfDay();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime44.era();
        java.util.Locale locale51 = null;
        java.lang.String str52 = property50.getAsText(locale51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property50.getFieldType();
        int int54 = mutableDateTime25.get(dateTimeFieldType53);
        boolean boolean55 = mutableDateTime21.isSupported(dateTimeFieldType53);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime2.property(dateTimeFieldType53);
        mutableDateTime2.setWeekOfWeekyear(27);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime2.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and mutableDateTime44", (instant19.compareTo(mutableDateTime44) == 0) == instant19.equals(mutableDateTime44));
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
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.set((int) ' ');
        int int11 = property6.getMaximumValueOverall();
        boolean boolean12 = property6.isLeap();
        org.joda.time.MutableDateTime mutableDateTime13 = property6.getMutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        mutableDateTime16.addWeeks(10);
        mutableDateTime16.addDays(20);
        java.util.Date date25 = mutableDateTime16.toDate();
        long long26 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime16);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.hourOfDay();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.era();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime30.add(readablePeriod37);
        org.joda.time.Chronology chronology39 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(0L, chronology39);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(chronology39);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) long26, chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
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
        int int6 = mutableDateTime5.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        java.lang.String str11 = mutableDateTime9.toString();
        mutableDateTime9.setDayOfYear((int) ' ');
        mutableDateTime9.addWeekyears(48);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        mutableDateTime18.addMillis((int) 'a');
        mutableDateTime18.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        int int25 = mutableDateTime9.get(dateTimeField24);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.era();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property34.getAsText(locale35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property34.getFieldType();
        int int38 = mutableDateTime9.get(dateTimeFieldType37);
        boolean boolean39 = mutableDateTime5.isSupported(dateTimeFieldType37);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        java.util.Date date47 = mutableDateTime42.toDate();
        java.util.Locale locale48 = null;
        java.util.Calendar calendar49 = mutableDateTime42.toCalendar(locale48);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime42.toMutableDateTime();
        boolean boolean51 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime50);
        mutableDateTime50.addWeekyears((int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime4.getRoundingField();
        boolean boolean7 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime4.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime10.isSupported(dateTimeFieldType11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.getMutableDateTime();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.era();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property24.getAsText(locale25);
        org.joda.time.MutableDateTime mutableDateTime27 = property24.roundHalfCeiling();
        mutableDateTime27.setDateTime(5, (int) (byte) 1, (int) (byte) 1, 2, (int) (byte) 1, 15, 0);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime41.add(readablePeriod44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.hourOfDay();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime41.era();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime41.add(readablePeriod48);
        org.joda.time.Chronology chronology50 = mutableDateTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(chronology50);
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        java.lang.String str57 = mutableDateTime55.toString();
        mutableDateTime55.setDayOfYear((int) ' ');
        mutableDateTime55.addWeekyears(48);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology63);
        mutableDateTime64.addMillis((int) 'a');
        mutableDateTime64.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime64.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField70 = property69.getField();
        int int71 = mutableDateTime55.get(dateTimeField70);
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = null;
        java.lang.String str76 = mutableDateTime74.toString(dateTimeFormatter75);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        mutableDateTime74.add(readablePeriod77);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime74.hourOfDay();
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime74.era();
        java.util.Locale locale81 = null;
        java.lang.String str82 = property80.getAsText(locale81);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = property80.getFieldType();
        int int84 = mutableDateTime55.get(dateTimeFieldType83);
        boolean boolean85 = mutableDateTime52.isSupported(dateTimeFieldType83);
        org.joda.time.MutableDateTime.Property property86 = mutableDateTime37.property(dateTimeFieldType83);
        mutableDateTime27.set(dateTimeFieldType83, 1);
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) mutableDateTime27);
        int int90 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        mutableDateTime27.addSeconds(238);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime9.weekyear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime9.minuteOfDay();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.hourOfDay();
        org.joda.time.Instant instant27 = mutableDateTime22.toInstant();
        mutableDateTime22.setMinuteOfHour(2);
        int int30 = property19.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant27", (mutableDateTime9.compareTo(instant27) == 0) == mutableDateTime9.equals(instant27));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.getMutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime10.toMutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime10.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
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
        int int5 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        int int9 = mutableDateTime8.getMillisOfDay();
        int int10 = mutableDateTime8.getEra();
        org.joda.time.Chronology chronology11 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime2.toMutableDateTime(chronology11);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        int int17 = mutableDateTime15.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime15.add(readableDuration19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime15.add(readableDuration21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime15.dayOfYear();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        boolean boolean8 = mutableDateTime6.isBefore((long) 3);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.minuteOfHour();
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = mutableDateTime6.toCalendar(locale10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        int int18 = mutableDateTime17.getMonthOfYear();
        boolean boolean20 = mutableDateTime17.isEqual(1L);
        org.joda.time.Instant instant21 = mutableDateTime17.toInstant();
        mutableDateTime6.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant15", (mutableDateTime0.compareTo(instant15) == 0) == mutableDateTime0.equals(instant15));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone10);
        mutableDateTime6.addHours(2);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        mutableDateTime16.addMinutes(330);
        java.util.Date date22 = mutableDateTime16.toDate();
        mutableDateTime16.add((long) 48);
        mutableDateTime16.addDays((int) (byte) 100);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        boolean boolean28 = property4.equals((java.lang.Object) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        boolean boolean6 = mutableDateTime5.isAfterNow();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.dayOfMonth();
        mutableDateTime5.add((long) 45);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.era();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime12.add(readablePeriod19);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        mutableDateTime12.setZoneRetainFields(dateTimeZone24);
        mutableDateTime5.setZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        boolean boolean6 = mutableDateTime2.isEqual((long) 84);
        int int7 = mutableDateTime2.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:11.872Z");
        mutableDateTime9.setMillis((long) 24);
        int int12 = mutableDateTime9.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime13, dateTimeZone17);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        java.lang.String str23 = mutableDateTime21.toString();
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime18.toMutableDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime9.toMutableDateTime(dateTimeZone25);
        mutableDateTime2.setZone(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and mutableDateTime28", (mutableDateTime9.compareTo(mutableDateTime28) == 0) == mutableDateTime9.equals(mutableDateTime28));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = mutableDateTime6.isSupported(dateTimeFieldType7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.getMutableDateTime();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime11.toMutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(63741865678232L, chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime14", (instant4.compareTo(mutableDateTime14) == 0) == instant4.equals(mutableDateTime14));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime0.centuryOfEra();
        int int9 = mutableDateTime0.getMillisOfDay();
        int int10 = mutableDateTime0.getDayOfYear();
        mutableDateTime0.setMinuteOfHour(48);
        java.lang.Object obj13 = mutableDateTime0.clone();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        java.lang.String str19 = mutableDateTime17.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 6364, dateTimeZone20);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfMonth();
        boolean boolean24 = mutableDateTime0.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        int int25 = mutableDateTime22.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:11.872Z");
        mutableDateTime27.setMillis((long) 24);
        int int30 = mutableDateTime27.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime31, dateTimeZone35);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        java.lang.String str41 = mutableDateTime39.toString();
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime39.getZone();
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime36.toMutableDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime27.toMutableDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime47 = mutableDateTime22.toDateTime(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime27 and mutableDateTime46", (mutableDateTime27.compareTo(mutableDateTime46) == 0) == mutableDateTime27.equals(mutableDateTime46));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        int int6 = mutableDateTime2.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7, 2020);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        mutableDateTime12.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfDay();
        boolean boolean18 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTime();
        mutableDateTime19.setWeekyear(6399177);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.set((int) ' ');
        int int11 = property6.getMaximumValueOverall();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property6.getAsText(locale12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.secondOfDay();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        mutableDateTime24.setTime((long) '#');
        mutableDateTime24.addDays(100);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        mutableDateTime24.setRounding(dateTimeField39);
        long long41 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime mutableDateTime42 = property21.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now();
        int int44 = mutableDateTime43.getMillisOfSecond();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        mutableDateTime47.addWeeks(10);
        mutableDateTime47.addDays(20);
        java.util.Date date56 = mutableDateTime47.toDate();
        org.joda.time.DateTimeField dateTimeField57 = mutableDateTime47.getRoundingField();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology59);
        mutableDateTime60.addMillis((int) 'a');
        mutableDateTime60.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime60.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField66 = property65.getField();
        int int67 = mutableDateTime47.get(dateTimeField66);
        mutableDateTime43.setRounding(dateTimeField66);
        mutableDateTime42.setTime((org.joda.time.ReadableInstant) mutableDateTime43);
        mutableDateTime42.addDays(10023);
        long long72 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.era();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime9.add(readablePeriod16);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        mutableDateTime9.setZoneRetainFields(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone21);
        int int25 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        boolean boolean13 = mutableDateTime11.isEqual((long) 45);
        int int14 = property6.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime mutableDateTime16 = property6.add(6458199);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        mutableDateTime5.setMinuteOfHour((int) (byte) 0);
        int int11 = mutableDateTime5.getMillisOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        int int16 = mutableDateTime14.getSecondOfMinute();
        mutableDateTime14.setMillis((long) 3);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.secondOfDay();
        int int23 = property22.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        boolean boolean25 = mutableDateTime14.isSupported(dateTimeFieldType24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime5.property(dateTimeFieldType24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
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
        mutableDateTime2.setTime((long) '#');
        boolean boolean7 = mutableDateTime2.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime2.getZone();
        mutableDateTime2.addWeekyears(6444802);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:11.872Z");
        mutableDateTime12.setMillis((long) 24);
        int int15 = mutableDateTime12.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, dateTimeZone20);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        java.lang.String str26 = mutableDateTime24.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime21.toMutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime12.toMutableDateTime(dateTimeZone28);
        mutableDateTime2.setZoneRetainFields(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime31", (mutableDateTime12.compareTo(mutableDateTime31) == 0) == mutableDateTime12.equals(mutableDateTime31));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, dateTimeZone12);
        java.lang.String str14 = mutableDateTime8.toString();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime8.dayOfMonth();
        java.lang.String str16 = property15.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundFloor();
        mutableDateTime17.setSecondOfMinute((int) '4');
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        mutableDateTime22.addMillis((int) 'a');
        mutableDateTime22.setMonthOfYear((int) (byte) 10);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = mutableDateTime31.toDateTimeISO();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        org.joda.time.DateTime dateTime40 = dateTime32.toDateTime(chronology39);
        org.joda.time.DateTime dateTime41 = mutableDateTime22.toDateTime(chronology39);
        mutableDateTime17.setChronology(chronology39);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime2.toMutableDateTime(chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime11", (instant7.compareTo(mutableDateTime11) == 0) == instant7.equals(mutableDateTime11));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfCentury();
        int int6 = mutableDateTime2.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7, 2020);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        mutableDateTime12.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfDay();
        boolean boolean18 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTime();
        java.lang.String str20 = mutableDateTime19.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime9.weekyear();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 10);
        int int21 = mutableDateTime20.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.era();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfCeiling();
        boolean boolean24 = mutableDateTime23.isAfterNow();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.millisOfSecond();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = mutableDateTime31.isSupported(dateTimeFieldType32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime31.monthOfYear();
        int int35 = mutableDateTime31.getMinuteOfHour();
        int int36 = mutableDateTime31.getEra();
        org.joda.time.DateTime dateTime37 = mutableDateTime31.toDateTimeISO();
        long long38 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime31);
        mutableDateTime31.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime31.getZone();
        int int42 = property18.getDifference((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant29", (mutableDateTime9.compareTo(instant29) == 0) == mutableDateTime9.equals(instant29));
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
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add(0);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        mutableDateTime13.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.secondOfDay();
        int int18 = property17.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.roundHalfFloor();
        long long21 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        java.lang.String str26 = mutableDateTime24.toString();
        mutableDateTime24.setMillisOfSecond((int) (short) 100);
        int int29 = mutableDateTime24.getMinuteOfDay();
        mutableDateTime24.setWeekyear(23);
        int int32 = mutableDateTime24.getMinuteOfHour();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        java.util.Date date40 = mutableDateTime35.toDate();
        mutableDateTime35.setMillis((long) 48);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime44, dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField51 = mutableDateTime50.getRoundingField();
        boolean boolean53 = mutableDateTime50.isEqual((long) 5);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar55 = mutableDateTime54.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime54.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime57 = property56.roundHalfCeiling();
        int int58 = mutableDateTime57.getDayOfYear();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime61.getZone();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime64 = mutableDateTime63.toDateTimeISO();
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = mutableDateTime67.toString(dateTimeFormatter68);
        int int70 = mutableDateTime67.getYearOfCentury();
        org.joda.time.Chronology chronology71 = mutableDateTime67.getChronology();
        org.joda.time.DateTime dateTime72 = dateTime64.toDateTime(chronology71);
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime57.toMutableDateTime(chronology71);
        org.joda.time.DateTime dateTime74 = mutableDateTime50.toDateTime(chronology71);
        org.joda.time.MutableDateTime mutableDateTime75 = mutableDateTime35.toMutableDateTime(chronology71);
        org.joda.time.DateTime dateTime76 = mutableDateTime24.toDateTime(chronology71);
        int int77 = mutableDateTime20.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime mutableDateTime78 = mutableDateTime20.copy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime44", (instant3.compareTo(mutableDateTime44) == 0) == instant3.equals(mutableDateTime44));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setTime(3, (int) (short) 10, 10, (int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime2.add(readablePeriod13, 0);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        int int22 = mutableDateTime21.getMonthOfYear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        java.lang.String str27 = mutableDateTime25.toString();
        mutableDateTime25.setDayOfYear((int) ' ');
        mutableDateTime25.addWeekyears(48);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology33);
        mutableDateTime34.addMillis((int) 'a');
        mutableDateTime34.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        int int41 = mutableDateTime25.get(dateTimeField40);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.hourOfDay();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime44.era();
        java.util.Locale locale51 = null;
        java.lang.String str52 = property50.getAsText(locale51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property50.getFieldType();
        int int54 = mutableDateTime25.get(dateTimeFieldType53);
        boolean boolean55 = mutableDateTime21.isSupported(dateTimeFieldType53);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime2.property(dateTimeFieldType53);
        org.joda.time.MutableDateTime mutableDateTime57 = property56.roundHalfCeiling();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and mutableDateTime44", (instant19.compareTo(mutableDateTime44) == 0) == instant19.equals(mutableDateTime44));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfCentury();
        int int6 = mutableDateTime2.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7, 2020);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        mutableDateTime12.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfDay();
        boolean boolean18 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTime();
        int int20 = mutableDateTime2.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.Instant instant9 = mutableDateTime5.toInstant();
        int int10 = mutableDateTime5.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant9", (mutableDateTime5.compareTo(instant9) == 0) == mutableDateTime5.equals(instant9));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        mutableDateTime2.setDate((long) 7);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        int int17 = mutableDateTime14.getMinuteOfHour();
        boolean boolean18 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime2.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant15", (mutableDateTime14.compareTo(instant15) == 0) == mutableDateTime14.equals(instant15));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        int int1 = mutableDateTime0.getMillisOfSecond();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime4.add(readablePeriod7);
        mutableDateTime4.addWeeks(10);
        mutableDateTime4.addDays(20);
        java.util.Date date13 = mutableDateTime4.toDate();
        org.joda.time.DateTimeField dateTimeField14 = mutableDateTime4.getRoundingField();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.addMillis((int) 'a');
        mutableDateTime17.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        int int24 = mutableDateTime4.get(dateTimeField23);
        mutableDateTime0.setRounding(dateTimeField23);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.era();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.addWrapField((int) 'a');
        mutableDateTime0.setTime((org.joda.time.ReadableInstant) mutableDateTime36);
        java.util.Date date38 = mutableDateTime36.toDate();
        org.joda.time.Instant instant39 = mutableDateTime36.toInstant();
        java.util.Locale locale40 = null;
        java.util.Calendar calendar41 = mutableDateTime36.toCalendar(locale40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime36 and instant39", (mutableDateTime36.compareTo(instant39) == 0) == mutableDateTime36.equals(instant39));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime2.add(readableDuration4);
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTimeISO();
        java.lang.Class<?> wildcardClass7 = mutableDateTime2.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime6", (instant3.compareTo(dateTime6) == 0) == instant3.equals(dateTime6));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.DurationField durationField7 = property6.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        org.joda.time.DurationField durationField10 = property9.getRangeDurationField();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.addMillis((int) 'a');
        int int16 = mutableDateTime13.getDayOfYear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        mutableDateTime19.setTime((long) '#');
        mutableDateTime19.addDays(100);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime19.secondOfMinute();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        java.lang.String str31 = mutableDateTime29.toString();
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime29.getZone();
        mutableDateTime19.setZone(dateTimeZone32);
        mutableDateTime13.setZone(dateTimeZone32);
        mutableDateTime13.setYear(6430958);
        int int37 = mutableDateTime13.getSecondOfDay();
        int int38 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        int int7 = property6.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        int int9 = mutableDateTime5.getMinuteOfHour();
        int int10 = mutableDateTime5.getEra();
        mutableDateTime5.addMillis(41);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime5.era();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now();
        mutableDateTime14.setHourOfDay((int) (byte) 0);
        boolean boolean18 = mutableDateTime14.isBefore((long) 6417230);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        java.util.Date date26 = mutableDateTime21.toDate();
        mutableDateTime21.setMillis((long) 48);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime21.yearOfCentury();
        mutableDateTime14.setDate((org.joda.time.ReadableInstant) mutableDateTime21);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        mutableDateTime33.setTime((long) '#');
        boolean boolean38 = mutableDateTime33.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        mutableDateTime21.setZone(dateTimeZone39);
        int int42 = mutableDateTime21.getDayOfYear();
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime40", (instant3.compareTo(mutableDateTime40) == 0) == instant3.equals(mutableDateTime40));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        long long7 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime mutableDateTime9 = property4.add(570);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
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
        int int5 = mutableDateTime2.getDayOfWeek();
        int int6 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant3", (mutableDateTime8.compareTo(instant3) == 0) == mutableDateTime8.equals(instant3));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone6);
        int int8 = mutableDateTime7.getEra();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.copy();
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 10);
        int int13 = mutableDateTime12.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.era();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfCeiling();
        boolean boolean16 = mutableDateTime15.isAfterNow();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.millisOfSecond();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        int int23 = mutableDateTime21.getSecondOfMinute();
        mutableDateTime21.setMillis((long) 3);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        java.util.Date date33 = mutableDateTime28.toDate();
        boolean boolean34 = mutableDateTime21.isAfter((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:47.274Z", dateTimeZone35);
        mutableDateTime15.setZone(dateTimeZone35);
        mutableDateTime9.setZoneRetainFields(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant10", (mutableDateTime7.compareTo(instant10) == 0) == mutableDateTime7.equals(instant10));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:09.655Z");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone6);
        boolean boolean10 = mutableDateTime8.isBefore((long) 3);
        boolean boolean12 = mutableDateTime8.isEqual((long) 41);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime15.toMutableDateTime();
        mutableDateTime18.setDate((-1), 10, 12);
        int int23 = mutableDateTime18.getWeekOfWeekyear();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        java.lang.String str28 = mutableDateTime26.toString();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        mutableDateTime18.setZoneRetainFields(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime8.toMutableDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.655Z", dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime33", (mutableDateTime1.compareTo(mutableDateTime33) == 0) == mutableDateTime1.equals(mutableDateTime33));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        int int2 = mutableDateTime1.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfCeiling();
        boolean boolean5 = mutableDateTime4.isAfterNow();
        int int6 = mutableDateTime4.getMillisOfSecond();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        int int11 = mutableDateTime9.getSecondOfMinute();
        mutableDateTime9.setMillis((long) 3);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        java.util.Date date21 = mutableDateTime16.toDate();
        boolean boolean22 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime16);
        int int23 = mutableDateTime16.getYearOfCentury();
        boolean boolean24 = mutableDateTime4.isAfter((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime27, dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone31);
        mutableDateTime34.setDate((long) (short) 100);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime39.add(readablePeriod42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.hourOfDay();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime39.era();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime39.add(readablePeriod46);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        mutableDateTime39.setZoneRetainFields(dateTimeZone51);
        mutableDateTime34.setZone(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) 0, dateTimeZone51);
        mutableDateTime4.setZone(dateTimeZone51);
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.Instant instant60 = mutableDateTime59.toInstant();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime59.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime62 = property61.roundCeiling();
        java.util.Locale locale63 = null;
        java.lang.String str64 = property61.getAsText(locale63);
        org.joda.time.MutableDateTime mutableDateTime66 = property61.add(12);
        mutableDateTime4.setTime((org.joda.time.ReadableInstant) mutableDateTime66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime39 and instant60", (mutableDateTime39.compareTo(instant60) == 0) == mutableDateTime39.equals(instant60));
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) 'a');
        int int11 = property8.getMaximumValue();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        int int18 = mutableDateTime17.getMonthOfYear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        java.lang.String str23 = mutableDateTime21.toString();
        mutableDateTime21.setDayOfYear((int) ' ');
        mutableDateTime21.addWeekyears(48);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        mutableDateTime30.addMillis((int) 'a');
        mutableDateTime30.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField36 = property35.getField();
        int int37 = mutableDateTime21.get(dateTimeField36);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.era();
        java.util.Locale locale47 = null;
        java.lang.String str48 = property46.getAsText(locale47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property46.getFieldType();
        int int50 = mutableDateTime21.get(dateTimeFieldType49);
        boolean boolean51 = mutableDateTime17.isSupported(dateTimeFieldType49);
        boolean boolean52 = property8.equals((java.lang.Object) boolean51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime40", (instant15.compareTo(mutableDateTime40) == 0) == instant15.equals(mutableDateTime40));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        boolean boolean8 = property4.equals((java.lang.Object) 1.0f);
        java.lang.String str9 = property4.getAsString();
        org.joda.time.MutableDateTime mutableDateTime11 = property4.add((long) 48);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime12.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfCeiling();
        int int16 = mutableDateTime15.getDayOfYear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTimeISO();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.DateTime dateTime30 = dateTime22.toDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime15.toMutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology29);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.era();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime43.add(readablePeriod50);
        org.joda.time.Chronology chronology52 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(0L, chronology52);
        mutableDateTime35.setChronology(chronology52);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime57.add(readablePeriod60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.hourOfDay();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime57.era();
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        mutableDateTime57.add(readablePeriod64);
        java.util.GregorianCalendar gregorianCalendar66 = mutableDateTime57.toGregorianCalendar();
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.DateTimeZone dateTimeZone70 = mutableDateTime69.getZone();
        mutableDateTime57.setZone(dateTimeZone70);
        mutableDateTime35.setZone(dateTimeZone70);
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(obj73, chronology74);
        org.joda.time.DateTimeZone dateTimeZone76 = mutableDateTime75.getZone();
        int int77 = mutableDateTime75.getSecondOfMinute();
        mutableDateTime75.setMillis((long) 3);
        java.lang.Object obj80 = null;
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime(obj80, chronology81);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = null;
        java.lang.String str84 = mutableDateTime82.toString(dateTimeFormatter83);
        org.joda.time.ReadablePeriod readablePeriod85 = null;
        mutableDateTime82.add(readablePeriod85);
        java.util.Date date87 = mutableDateTime82.toDate();
        boolean boolean88 = mutableDateTime75.isAfter((org.joda.time.ReadableInstant) mutableDateTime82);
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime82.secondOfMinute();
        int int90 = mutableDateTime82.getWeekyear();
        mutableDateTime35.setTime((org.joda.time.ReadableInstant) mutableDateTime82);
        mutableDateTime32.setMillis((org.joda.time.ReadableInstant) mutableDateTime35);
        boolean boolean93 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundHalfCeiling();
        mutableDateTime11.setDateTime(5, (int) (byte) 1, (int) (byte) 1, 2, (int) (byte) 1, 15, 0);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime11.dayOfWeek();
        int int21 = property20.get();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.roundFloor();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property20.getAsText(locale23);
        org.joda.time.MutableDateTime mutableDateTime25 = property20.roundFloor();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundCeiling();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        int int36 = property30.getDifference((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        int int43 = mutableDateTime41.getSecondOfMinute();
        mutableDateTime41.setMillis((long) 3);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableDateTime48.add(readablePeriod51);
        java.util.Date date53 = mutableDateTime48.toDate();
        boolean boolean54 = mutableDateTime41.isAfter((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.DateTimeZone dateTimeZone55 = mutableDateTime48.getZone();
        org.joda.time.DateTime dateTime56 = mutableDateTime34.toDateTime(dateTimeZone55);
        int int57 = property20.getDifference((org.joda.time.ReadableInstant) dateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and mutableDateTime34", (instant29.compareTo(mutableDateTime34) == 0) == instant29.equals(mutableDateTime34));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        boolean boolean11 = mutableDateTime9.equals((java.lang.Object) 10.0f);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime13, dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime9.toMutableDateTime(dateTimeZone17);
        int int22 = mutableDateTime21.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        int int4 = mutableDateTime3.getDayOfYear();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = mutableDateTime9.toDateTimeISO();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime10.toDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime3.toMutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology17);
        mutableDateTime20.setSecondOfDay(949);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = mutableDateTime28.isSupported(dateTimeFieldType29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime28.monthOfYear();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property31.getAsText(locale32);
        org.joda.time.MutableDateTime mutableDateTime34 = property31.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property31.getFieldType();
        int int36 = mutableDateTime20.get(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant26", (mutableDateTime7.compareTo(instant26) == 0) == mutableDateTime7.equals(instant26));
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
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7, dateTimeZone11);
        java.lang.String str13 = mutableDateTime7.toString();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime7.dayOfMonth();
        int int15 = property14.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.roundCeiling();
        mutableDateTime16.setMonthOfYear(2);
        boolean boolean19 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        java.lang.String str10 = mutableDateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime5.toMutableDateTime(dateTimeZone12);
        mutableDateTime5.addYears((int) '4');
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime5.toMutableDateTimeISO();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        int int27 = property21.getDifference((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        int int30 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant20", (mutableDateTime0.compareTo(instant20) == 0) == mutableDateTime0.equals(instant20));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime0.centuryOfEra();
        int int9 = mutableDateTime0.getMillisOfDay();
        mutableDateTime0.addMonths(7);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        int int17 = mutableDateTime14.getDayOfWeek();
        int int18 = mutableDateTime14.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.secondOfDay();
        java.util.Locale locale20 = null;
        java.util.Calendar calendar21 = mutableDateTime14.toCalendar(locale20);
        int int22 = mutableDateTime0.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant15", (mutableDateTime3.compareTo(instant15) == 0) == mutableDateTime3.equals(instant15));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        int int6 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.millisOfDay();
        long long8 = property7.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime2.toString(dateTimeFormatter4);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.centuryOfEra();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        org.joda.time.DateTime dateTime20 = mutableDateTime10.toDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime2.toMutableDateTime(chronology19);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant22", (mutableDateTime2.compareTo(instant22) == 0) == mutableDateTime2.equals(instant22));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime2.toString(dateTimeFormatter4);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.centuryOfEra();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        org.joda.time.DateTime dateTime20 = mutableDateTime10.toDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime2.toMutableDateTime(chronology19);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant22", (mutableDateTime2.compareTo(instant22) == 0) == mutableDateTime2.equals(instant22));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.era();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property15.getAsText(locale16);
        org.joda.time.MutableDateTime mutableDateTime18 = property15.roundHalfCeiling();
        mutableDateTime18.setDateTime(5, (int) (byte) 1, (int) (byte) 1, 2, (int) (byte) 1, 15, 0);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.hourOfDay();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime32.era();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime32.add(readablePeriod39);
        org.joda.time.Chronology chronology41 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(0L, chronology41);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(chronology41);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        java.lang.String str48 = mutableDateTime46.toString();
        mutableDateTime46.setDayOfYear((int) ' ');
        mutableDateTime46.addWeekyears(48);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology54);
        mutableDateTime55.addMillis((int) 'a');
        mutableDateTime55.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime55.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField61 = property60.getField();
        int int62 = mutableDateTime46.get(dateTimeField61);
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = mutableDateTime65.toString(dateTimeFormatter66);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        mutableDateTime65.add(readablePeriod68);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime65.hourOfDay();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime65.era();
        java.util.Locale locale72 = null;
        java.lang.String str73 = property71.getAsText(locale72);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = property71.getFieldType();
        int int75 = mutableDateTime46.get(dateTimeFieldType74);
        boolean boolean76 = mutableDateTime43.isSupported(dateTimeFieldType74);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime28.property(dateTimeFieldType74);
        mutableDateTime18.set(dateTimeFieldType74, 1);
        int int80 = mutableDateTime2.get(dateTimeFieldType74);
        int int81 = mutableDateTime2.getSecondOfDay();
        int int82 = mutableDateTime2.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.addWeeks(437);
        java.lang.Object obj86 = null;
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime(obj86, chronology87);
        org.joda.time.Instant instant89 = mutableDateTime88.toInstant();
        org.joda.time.MutableDateTime.Property property90 = mutableDateTime88.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime91 = property90.roundCeiling();
        java.util.Locale locale92 = null;
        java.lang.String str93 = property90.getAsText(locale92);
        int int94 = property90.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime95 = property90.roundHalfCeiling();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime32 and instant89", (mutableDateTime32.compareTo(instant89) == 0) == mutableDateTime32.equals(instant89));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        int int9 = mutableDateTime5.getMinuteOfHour();
        java.lang.Object obj10 = mutableDateTime5.clone();
        int int11 = mutableDateTime5.getYear();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        mutableDateTime15.setTime((long) '#');
        int int20 = mutableDateTime15.getYearOfEra();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        int int24 = mutableDateTime23.getMillisOfDay();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        java.lang.String str29 = mutableDateTime27.toString();
        mutableDateTime27.setDayOfYear((int) ' ');
        mutableDateTime27.addWeekyears(48);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology35);
        mutableDateTime36.addMillis((int) 'a');
        mutableDateTime36.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        int int43 = mutableDateTime27.get(dateTimeField42);
        mutableDateTime23.setRounding(dateTimeField42);
        mutableDateTime15.setRounding(dateTimeField42);
        int int46 = mutableDateTime5.get(dateTimeField42);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime47, dateTimeZone51);
        java.lang.String str53 = mutableDateTime47.toString();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime47.dayOfMonth();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime47.centuryOfEra();
        int int56 = mutableDateTime47.getMillisOfDay();
        int int57 = mutableDateTime47.getDayOfYear();
        mutableDateTime47.setMinuteOfHour(48);
        int int60 = mutableDateTime47.getSecondOfMinute();
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.DateTimeZone dateTimeZone65 = mutableDateTime64.getZone();
        int int66 = mutableDateTime64.getSecondOfMinute();
        mutableDateTime64.setMillis((long) 3);
        java.lang.Object obj69 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(obj69, chronology70);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = null;
        java.lang.String str73 = mutableDateTime71.toString(dateTimeFormatter72);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        mutableDateTime71.add(readablePeriod74);
        java.util.Date date76 = mutableDateTime71.toDate();
        boolean boolean77 = mutableDateTime64.isAfter((org.joda.time.ReadableInstant) mutableDateTime71);
        org.joda.time.DateTimeZone dateTimeZone78 = mutableDateTime71.getZone();
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:47.274Z", dateTimeZone78);
        java.lang.Object obj80 = null;
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime(obj80, chronology81);
        org.joda.time.DateTimeZone dateTimeZone83 = mutableDateTime82.getZone();
        int int84 = mutableDateTime82.getSecondOfMinute();
        mutableDateTime82.setMillis((long) 3);
        mutableDateTime79.setDate((org.joda.time.ReadableInstant) mutableDateTime82);
        mutableDateTime47.setTime((org.joda.time.ReadableInstant) mutableDateTime79);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.MutableDateTime mutableDateTime91 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology90);
        mutableDateTime91.addMillis((int) 'a');
        mutableDateTime91.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property96 = mutableDateTime91.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime97 = property96.roundHalfFloor();
        boolean boolean98 = mutableDateTime79.equals((java.lang.Object) mutableDateTime97);
        boolean boolean99 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime50", (instant3.compareTo(mutableDateTime50) == 0) == instant3.equals(mutableDateTime50));
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
        int int6 = mutableDateTime5.getMonthOfYear();
        boolean boolean8 = mutableDateTime5.isEqual(1L);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj9, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone16);
        mutableDateTime5.setZone(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add(0);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        mutableDateTime13.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.secondOfDay();
        int int18 = property17.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.roundHalfFloor();
        long long21 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        java.lang.String str26 = mutableDateTime24.toString();
        mutableDateTime24.setMillisOfSecond((int) (short) 100);
        int int29 = mutableDateTime24.getMinuteOfDay();
        mutableDateTime24.setWeekyear(23);
        int int32 = mutableDateTime24.getMinuteOfHour();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        java.util.Date date40 = mutableDateTime35.toDate();
        mutableDateTime35.setMillis((long) 48);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime44, dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField51 = mutableDateTime50.getRoundingField();
        boolean boolean53 = mutableDateTime50.isEqual((long) 5);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar55 = mutableDateTime54.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime54.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime57 = property56.roundHalfCeiling();
        int int58 = mutableDateTime57.getDayOfYear();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime61.getZone();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime64 = mutableDateTime63.toDateTimeISO();
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = mutableDateTime67.toString(dateTimeFormatter68);
        int int70 = mutableDateTime67.getYearOfCentury();
        org.joda.time.Chronology chronology71 = mutableDateTime67.getChronology();
        org.joda.time.DateTime dateTime72 = dateTime64.toDateTime(chronology71);
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime57.toMutableDateTime(chronology71);
        org.joda.time.DateTime dateTime74 = mutableDateTime50.toDateTime(chronology71);
        org.joda.time.MutableDateTime mutableDateTime75 = mutableDateTime35.toMutableDateTime(chronology71);
        org.joda.time.DateTime dateTime76 = mutableDateTime24.toDateTime(chronology71);
        int int77 = mutableDateTime20.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.ReadableDuration readableDuration78 = null;
        mutableDateTime20.add(readableDuration78, 19800);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime44", (instant3.compareTo(mutableDateTime44) == 0) == instant3.equals(mutableDateTime44));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime2.add(readablePeriod9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        mutableDateTime2.setZoneRetainFields(dateTimeZone14);
        mutableDateTime2.setWeekyear(27);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.year();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = mutableDateTime25.isSupported(dateTimeFieldType26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime25.monthOfYear();
        int int29 = mutableDateTime25.getMinuteOfHour();
        java.lang.Object obj30 = mutableDateTime25.clone();
        int int31 = mutableDateTime25.getYear();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime25.toMutableDateTime();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        mutableDateTime35.setTime((long) '#');
        int int40 = mutableDateTime35.getYearOfEra();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology42);
        int int44 = mutableDateTime43.getMillisOfDay();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        java.lang.String str49 = mutableDateTime47.toString();
        mutableDateTime47.setDayOfYear((int) ' ');
        mutableDateTime47.addWeekyears(48);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology55);
        mutableDateTime56.addMillis((int) 'a');
        mutableDateTime56.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime56.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField62 = property61.getField();
        int int63 = mutableDateTime47.get(dateTimeField62);
        mutableDateTime43.setRounding(dateTimeField62);
        mutableDateTime35.setRounding(dateTimeField62);
        int int66 = mutableDateTime25.get(dateTimeField62);
        mutableDateTime2.setRounding(dateTimeField62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant23", (mutableDateTime13.compareTo(instant23) == 0) == mutableDateTime13.equals(instant23));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        int int17 = mutableDateTime15.getSecondOfMinute();
        mutableDateTime15.setMillis((long) 3);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        java.util.Date date27 = mutableDateTime22.toDate();
        boolean boolean28 = mutableDateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime22.getZone();
        org.joda.time.DateTime dateTime30 = mutableDateTime8.toDateTime(dateTimeZone29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        mutableDateTime8.add(readableDuration31, 6450742);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        boolean boolean8 = mutableDateTime6.isBefore((long) 3);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.minuteOfHour();
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = mutableDateTime6.toCalendar(locale10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) calendar11);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:09.655Z");
        int int15 = mutableDateTime14.getEra();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        java.util.Date date23 = mutableDateTime18.toDate();
        mutableDateTime18.setMillis((long) 48);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        java.lang.String str30 = mutableDateTime28.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime28.getZone();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        java.lang.String str37 = mutableDateTime35.toString();
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime28.toMutableDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = mutableDateTime18.toDateTime(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone38);
        mutableDateTime14.setZoneRetainFields(dateTimeZone38);
        org.joda.time.Chronology chronology44 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) calendar11, chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and mutableDateTime12", (mutableDateTime0.compareTo(mutableDateTime12) == 0) == mutableDateTime0.equals(mutableDateTime12));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:53.768Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        int int7 = mutableDateTime4.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime4.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add(58);
        mutableDateTime10.setWeekyear(43);
        java.lang.Object obj13 = mutableDateTime10.clone();
        int int14 = mutableDateTime10.getMinuteOfDay();
        boolean boolean15 = mutableDateTime1.equals((java.lang.Object) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.millisOfSecond();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        int int27 = property21.getDifference((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        int int34 = mutableDateTime32.getSecondOfMinute();
        mutableDateTime32.setMillis((long) 3);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime39.add(readablePeriod42);
        java.util.Date date44 = mutableDateTime39.toDate();
        boolean boolean45 = mutableDateTime32.isAfter((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime39.getZone();
        org.joda.time.DateTime dateTime47 = mutableDateTime25.toDateTime(dateTimeZone46);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime10, dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime25", (instant20.compareTo(mutableDateTime25) == 0) == instant20.equals(mutableDateTime25));
    }
}

