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
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime2.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime6", (instant3.compareTo(dateTime6) == 0) == instant3.equals(dateTime6));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        long long7 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
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
        int int21 = property2.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant6", (mutableDateTime0.compareTo(instant6) == 0) == mutableDateTime0.equals(instant6));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        int int13 = mutableDateTime10.getYearOfEra();
        org.joda.time.DateTime dateTime14 = mutableDateTime10.toDateTimeISO();
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) dateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
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
        mutableDateTime2.add((long) (byte) 1);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        int int14 = mutableDateTime12.getCenturyOfEra();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.roundFloor();
        org.joda.time.DurationField durationField23 = property20.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property20.getFieldType();
        boolean boolean25 = mutableDateTime2.isSupported(dateTimeFieldType24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        boolean boolean6 = mutableDateTime2.isEqualNow();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        java.lang.String str16 = mutableDateTime9.toString();
        int int17 = mutableDateTime9.getYear();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime21.toMutableDateTimeISO();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime27);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.roundFloor();
        org.joda.time.DurationField durationField36 = property33.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property33.getFieldType();
        int int38 = mutableDateTime27.get(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant32", (mutableDateTime2.compareTo(instant32) == 0) == mutableDateTime2.equals(instant32));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        int int18 = mutableDateTime12.getYearOfCentury();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.roundFloor();
        org.joda.time.DurationField durationField26 = property23.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property23.getFieldType();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime12.property(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime8.property(dateTimeFieldType27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant22", (mutableDateTime2.compareTo(instant22) == 0) == mutableDateTime2.equals(instant22));
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
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime6", (instant3.compareTo(dateTime6) == 0) == instant3.equals(dateTime6));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        int int14 = mutableDateTime12.getCenturyOfEra();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfMonth();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundCeiling();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        mutableDateTime8.setMinuteOfDay(4);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        int int19 = mutableDateTime14.getWeekOfWeekyear();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTime dateTime24 = mutableDateTime14.toDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime8.toMutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime5.toMutableDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTimeISO();
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = dateTime6.toCalendar(locale7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        mutableDateTime16.setMillis(100L);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 'a');
        int int21 = mutableDateTime20.getDayOfYear();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.yearOfEra();
        int int23 = property22.getMaximumValue();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.add((long) (short) -1);
        mutableDateTime29.setWeekOfWeekyear((int) '4');
        boolean boolean32 = property22.equals((java.lang.Object) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property22.getFieldType();
        boolean boolean34 = mutableDateTime16.isSupported(dateTimeFieldType33);
        mutableDateTime2.set(dateTimeFieldType33, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        int int7 = property4.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.getMutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        int int17 = mutableDateTime11.getYearOfCentury();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.roundFloor();
        org.joda.time.DurationField durationField25 = property22.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property22.getFieldType();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime11.property(dateTimeFieldType26);
        boolean boolean28 = mutableDateTime8.isSupported(dateTimeFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant21", (mutableDateTime11.compareTo(instant21) == 0) == mutableDateTime11.equals(instant21));
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 37);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime12.toMutableDateTimeISO();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.centuryOfEra();
        int int25 = mutableDateTime19.getYearOfCentury();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.roundFloor();
        org.joda.time.DurationField durationField33 = property30.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property30.getFieldType();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime19.property(dateTimeFieldType34);
        int int36 = mutableDateTime16.get(dateTimeFieldType34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant29", (mutableDateTime19.compareTo(instant29) == 0) == mutableDateTime19.equals(instant29));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        int int7 = mutableDateTime5.getMillisOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime10.toMutableDateTimeISO();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        int int26 = mutableDateTime10.get(dateTimeField25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 'a');
        int int29 = mutableDateTime28.getDayOfWeek();
        int int30 = mutableDateTime28.getEra();
        org.joda.time.Chronology chronology31 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime10.toMutableDateTime(chronology31);
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        mutableDateTime2.addWeeks((int) (short) 10);
        int int9 = mutableDateTime2.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.getMutableDateTime();
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime2.toDateTime(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.year();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime7.getRoundingField();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
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
        mutableDateTime2.add((long) (byte) 1);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        int int14 = mutableDateTime12.getCenturyOfEra();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.weekOfWeekyear();
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
        boolean boolean6 = mutableDateTime2.isEqualNow();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        java.lang.String str16 = mutableDateTime9.toString();
        int int17 = mutableDateTime9.getYear();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime9.minuteOfDay();
        boolean boolean20 = mutableDateTime9.isAfterNow();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        int int29 = mutableDateTime23.getYearOfCentury();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.Instant instant33 = mutableDateTime32.toInstant();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.roundFloor();
        org.joda.time.DurationField durationField37 = property34.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property34.getFieldType();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime23.property(dateTimeFieldType38);
        boolean boolean40 = mutableDateTime9.isSupported(dateTimeFieldType38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant33", (mutableDateTime23.compareTo(instant33) == 0) == mutableDateTime23.equals(instant33));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        int int14 = mutableDateTime12.getCenturyOfEra();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        boolean boolean17 = mutableDateTime2.equals((java.lang.Object) "2020-11-25T01:44:12.888Z");
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
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime5", (instant3.compareTo(mutableDateTime5) == 0) == instant3.equals(mutableDateTime5));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        long long7 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.MutableDateTime mutableDateTime8 = property2.roundFloor();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant6", (mutableDateTime5.compareTo(instant6) == 0) == mutableDateTime5.equals(instant6));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime8.secondOfDay();
        mutableDateTime8.addWeekyears((int) (byte) -1);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        int int21 = mutableDateTime20.getDayOfWeek();
        mutableDateTime20.addSeconds((int) (byte) 0);
        mutableDateTime20.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.millisOfSecond();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        mutableDateTime29.setMinuteOfDay(4);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        int int40 = mutableDateTime35.getWeekOfWeekyear();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        org.joda.time.DateTime dateTime45 = mutableDateTime35.toDateTime(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime29.toMutableDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = mutableDateTime20.toDateTime(dateTimeZone44);
        mutableDateTime8.setZone(dateTimeZone44);
        mutableDateTime5.setZone(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
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
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTime();
        boolean boolean8 = dateTime6.isAfter((long) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        org.joda.time.DurationField durationField3 = property2.getLeapDurationField();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.roundHalfCeiling();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.MutableDateTime mutableDateTime8 = property2.roundHalfEven();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        boolean boolean15 = mutableDateTime11.isEqualNow();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.dayOfWeek();
        java.lang.String str25 = mutableDateTime18.toString();
        int int26 = mutableDateTime18.getYear();
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime18);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime30.toMutableDateTimeISO();
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime36.copy();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime36.year();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.add((int) (short) 100);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime45.add(readablePeriod48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.yearOfCentury();
        int int51 = property50.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime53 = property50.add((int) 'a');
        int int54 = mutableDateTime53.getDayOfYear();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        int int60 = mutableDateTime57.getYearOfCentury();
        org.joda.time.Chronology chronology61 = mutableDateTime57.getChronology();
        org.joda.time.MutableDateTime mutableDateTime62 = org.joda.time.MutableDateTime.now(chronology61);
        org.joda.time.MutableDateTime mutableDateTime63 = org.joda.time.MutableDateTime.now(chronology61);
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(chronology61);
        mutableDateTime64.setMillis(100L);
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((long) 'a');
        int int69 = mutableDateTime68.getDayOfYear();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime68.yearOfEra();
        int int71 = property70.getMaximumValue();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime74.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime77 = property75.add((long) (short) -1);
        mutableDateTime77.setWeekOfWeekyear((int) '4');
        boolean boolean80 = property70.equals((java.lang.Object) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = property70.getFieldType();
        boolean boolean82 = mutableDateTime64.isSupported(dateTimeFieldType81);
        boolean boolean83 = mutableDateTime53.isSupported(dateTimeFieldType81);
        mutableDateTime42.set(dateTimeFieldType81, 12);
        mutableDateTime8.set(dateTimeFieldType81, (int) (short) 1);
        java.lang.Object obj88 = null;
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.MutableDateTime mutableDateTime90 = new org.joda.time.MutableDateTime(obj88, chronology89);
        org.joda.time.Instant instant91 = mutableDateTime90.toInstant();
        org.joda.time.MutableDateTime.Property property92 = mutableDateTime90.monthOfYear();
        mutableDateTime90.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property95 = mutableDateTime90.secondOfMinute();
        int int96 = property95.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType97 = property95.getFieldType();
        boolean boolean98 = mutableDateTime8.isSupported(dateTimeFieldType97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime57 and instant91", (mutableDateTime57.compareTo(instant91) == 0) == mutableDateTime57.equals(instant91));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        int int13 = mutableDateTime12.getDayOfWeek();
        mutableDateTime12.addSeconds((int) (byte) 0);
        mutableDateTime12.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.millisOfSecond();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        java.lang.String str26 = mutableDateTime21.toString();
        boolean boolean27 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology34);
        mutableDateTime37.setMillis(100L);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 'a');
        int int42 = mutableDateTime41.getDayOfYear();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.yearOfEra();
        int int44 = property43.getMaximumValue();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime50 = property48.add((long) (short) -1);
        mutableDateTime50.setWeekOfWeekyear((int) '4');
        boolean boolean53 = property43.equals((java.lang.Object) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property43.getFieldType();
        boolean boolean55 = mutableDateTime37.isSupported(dateTimeFieldType54);
        int int56 = mutableDateTime12.get(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime9.property(dateTimeFieldType54);
        int int58 = property57.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
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
        mutableDateTime2.addHours((int) ' ');
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
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getSecondOfDay();
        int int7 = mutableDateTime2.getMillisOfSecond();
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
        mutableDateTime10.setMinuteOfHour(2);
        java.util.Locale locale24 = null;
        java.util.Calendar calendar25 = mutableDateTime10.toCalendar(locale24);
        boolean boolean26 = mutableDateTime2.equals((java.lang.Object) locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        mutableDateTime9.setMinuteOfDay(4);
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
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime9.toMutableDateTime(dateTimeZone24);
        int int27 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
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
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime8.add(readablePeriod16, 48);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
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
        org.joda.time.DateTimeField dateTimeField37 = property33.getField();
        mutableDateTime21.setRounding(dateTimeField37);
        mutableDateTime8.setRounding(dateTimeField37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        int int7 = mutableDateTime5.getCenturyOfEra();
        mutableDateTime5.addMillis((int) ' ');
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTimeISO();
        org.joda.time.Instant instant11 = mutableDateTime5.toInstant();
        java.lang.String str12 = mutableDateTime5.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
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
        int int5 = mutableDateTime2.getDayOfWeek();
        boolean boolean7 = mutableDateTime2.isEqual((long) (byte) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.dayOfWeek();
        boolean boolean22 = mutableDateTime12.isAfter((org.joda.time.ReadableInstant) mutableDateTime15);
        boolean boolean23 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime6", (instant3.compareTo(dateTime6) == 0) == instant3.equals(dateTime6));
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
        int int5 = mutableDateTime2.getDayOfWeek();
        boolean boolean7 = mutableDateTime2.isEqual((long) (byte) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        mutableDateTime3.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField(4);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime10.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime13", (instant4.compareTo(mutableDateTime13) == 0) == instant4.equals(mutableDateTime13));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        long long7 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.MutableDateTime mutableDateTime9 = property2.addWrapField(329);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant6", (mutableDateTime5.compareTo(instant6) == 0) == mutableDateTime5.equals(instant6));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        int int7 = mutableDateTime5.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime5.add(readablePeriod8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        boolean boolean16 = mutableDateTime13.isBefore((long) (short) -1);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.dayOfYear();
        org.joda.time.Instant instant18 = mutableDateTime13.toInstant();
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant18", (mutableDateTime3.compareTo(instant18) == 0) == mutableDateTime3.equals(instant18));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        int int14 = mutableDateTime12.getCenturyOfEra();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        int int16 = mutableDateTime2.getYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime2.add(readablePeriod17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfWeek();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime6.toMutableDateTime(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        int int16 = mutableDateTime5.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        int int8 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime6", (instant3.compareTo(dateTime6) == 0) == instant3.equals(dateTime6));
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
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        mutableDateTime2.addMonths((-292275054));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime5", (instant3.compareTo(mutableDateTime5) == 0) == instant3.equals(mutableDateTime5));
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
        mutableDateTime2.add((long) (byte) 1);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        int int14 = mutableDateTime12.getCenturyOfEra();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime2.setHourOfDay(14);
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
        mutableDateTime8.addWeeks(35);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        int int13 = mutableDateTime12.getDayOfWeek();
        mutableDateTime12.addSeconds((int) (byte) 0);
        mutableDateTime12.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.millisOfSecond();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        java.lang.String str26 = mutableDateTime21.toString();
        boolean boolean27 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology34);
        mutableDateTime37.setMillis(100L);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 'a');
        int int42 = mutableDateTime41.getDayOfYear();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.yearOfEra();
        int int44 = property43.getMaximumValue();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime50 = property48.add((long) (short) -1);
        mutableDateTime50.setWeekOfWeekyear((int) '4');
        boolean boolean53 = property43.equals((java.lang.Object) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property43.getFieldType();
        boolean boolean55 = mutableDateTime37.isSupported(dateTimeFieldType54);
        int int56 = mutableDateTime12.get(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime9.property(dateTimeFieldType54);
        org.joda.time.DateTime dateTime58 = mutableDateTime9.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.centuryOfEra();
        int int14 = mutableDateTime8.getYearOfCentury();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.roundFloor();
        org.joda.time.DurationField durationField22 = property19.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property19.getFieldType();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.property(dateTimeFieldType23);
        mutableDateTime2.set(dateTimeFieldType23, 11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        mutableDateTime2.setRounding(dateTimeField17, 3);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        mutableDateTime22.addSeconds(0);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant23", (mutableDateTime11.compareTo(instant23) == 0) == mutableDateTime11.equals(instant23));
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
        mutableDateTime2.add((long) (byte) 1);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        int int14 = mutableDateTime12.getCenturyOfEra();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        int int16 = mutableDateTime2.getYear();
        mutableDateTime2.addWeeks(1965);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.yearOfCentury();
        java.lang.String str22 = mutableDateTime19.toString();
        boolean boolean23 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime2.addMillis(7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant13", (mutableDateTime12.compareTo(instant13) == 0) == mutableDateTime12.equals(instant13));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        mutableDateTime10.setRounding(dateTimeField25, 3);
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime10.toGregorianCalendar();
        int int29 = mutableDateTime10.getWeekyear();
        boolean boolean30 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.getMutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        long long21 = mutableDateTime19.getMillis();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.millisOfSecond();
        long long23 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        mutableDateTime26.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime33 = property31.addWrapField(4);
        int int34 = property31.get();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property31.getAsShortText(locale35);
        int int37 = property31.get();
        java.lang.String str38 = property31.getAsText();
        org.joda.time.DurationField durationField39 = property31.getRangeDurationField();
        boolean boolean40 = property9.equals((java.lang.Object) property31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant27", (mutableDateTime18.compareTo(instant27) == 0) == mutableDateTime18.equals(instant27));
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
        boolean boolean5 = property4.isLeap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        mutableDateTime5.setMillis((long) 25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.roundFloor();
        org.joda.time.DurationField durationField23 = property20.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property20.getFieldType();
        boolean boolean25 = mutableDateTime13.isSupported(dateTimeFieldType24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant19", (mutableDateTime2.compareTo(instant19) == 0) == mutableDateTime2.equals(instant19));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        int int7 = mutableDateTime5.getCenturyOfEra();
        mutableDateTime5.addMillis((int) ' ');
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTimeISO();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.dayOfWeek();
        boolean boolean26 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime19.addWeeks(35);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime19.getZone();
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.ReadableDuration readableDuration31 = null;
        mutableDateTime5.add(readableDuration31, 7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant14", (mutableDateTime3.compareTo(instant14) == 0) == mutableDateTime3.equals(instant14));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.weekyear();
        mutableDateTime2.addYears((int) (byte) 0);
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTimeISO();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        int int20 = mutableDateTime19.getDayOfWeek();
        mutableDateTime19.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime19.secondOfMinute();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.weekyear();
        mutableDateTime19.addYears((int) (byte) 0);
        org.joda.time.Instant instant27 = mutableDateTime19.toInstant();
        boolean boolean28 = mutableDateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant27", (mutableDateTime2.compareTo(instant27) == 0) == mutableDateTime2.equals(instant27));
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
        int int5 = mutableDateTime2.getDayOfWeek();
        boolean boolean7 = mutableDateTime2.isEqual((long) (byte) 0);
        mutableDateTime2.addWeeks(27);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.weekyear();
        int int13 = mutableDateTime11.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime11.year();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        int int18 = mutableDateTime17.getDayOfWeek();
        mutableDateTime17.addSeconds((int) (byte) 0);
        mutableDateTime17.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.millisOfSecond();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        mutableDateTime17.setChronology(chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime11.toMutableDateTime(chronology30);
        org.joda.time.DateTime dateTime33 = mutableDateTime2.toDateTime(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime26", (instant3.compareTo(mutableDateTime26) == 0) == instant3.equals(mutableDateTime26));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        int int10 = mutableDateTime9.getYearOfCentury();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        int int14 = mutableDateTime13.getDayOfWeek();
        mutableDateTime13.addSeconds((int) (byte) 0);
        mutableDateTime13.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.millisOfSecond();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        mutableDateTime22.setMinuteOfDay(4);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        int int33 = mutableDateTime28.getWeekOfWeekyear();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.DateTime dateTime38 = mutableDateTime28.toDateTime(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime22.toMutableDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = mutableDateTime13.toDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime41 = mutableDateTime9.toDateTime(dateTimeZone37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = dateTime41.toString(dateTimeFormatter42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        int int13 = mutableDateTime12.getDayOfWeek();
        mutableDateTime12.addSeconds((int) (byte) 0);
        mutableDateTime12.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.millisOfSecond();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        java.lang.String str26 = mutableDateTime21.toString();
        boolean boolean27 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology34);
        mutableDateTime37.setMillis(100L);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 'a');
        int int42 = mutableDateTime41.getDayOfYear();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.yearOfEra();
        int int44 = property43.getMaximumValue();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime50 = property48.add((long) (short) -1);
        mutableDateTime50.setWeekOfWeekyear((int) '4');
        boolean boolean53 = property43.equals((java.lang.Object) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property43.getFieldType();
        boolean boolean55 = mutableDateTime37.isSupported(dateTimeFieldType54);
        int int56 = mutableDateTime12.get(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime9.property(dateTimeFieldType54);
        mutableDateTime9.addMonths(9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.getMutableDateTime();
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.roundFloor();
        org.joda.time.DateTimeField dateTimeField13 = property10.getField();
        int int14 = mutableDateTime4.get(dateTimeField13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant9", (mutableDateTime4.compareTo(instant9) == 0) == mutableDateTime4.equals(instant9));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        int int10 = property7.get();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property7.getAsShortText(locale11);
        int int13 = property7.get();
        java.lang.String str14 = property7.getAsText();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        boolean boolean20 = mutableDateTime17.isBefore((long) (short) -1);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.dayOfYear();
        int int22 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
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
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        int int14 = mutableDateTime12.getCenturyOfEra();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.dayOfWeek();
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
        int int5 = mutableDateTime2.getDayOfWeek();
        boolean boolean7 = mutableDateTime2.isEqual((long) (byte) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        mutableDateTime2.setWeekyear(29);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.dayOfWeek();
        int int21 = property20.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime24 = property20.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime24.add(readablePeriod25, 37);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime24.toMutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime24.toMutableDateTime();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
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
        mutableDateTime2.add((long) (byte) 1);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        int int14 = mutableDateTime12.getCenturyOfEra();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.yearOfCentury();
        java.lang.String str22 = mutableDateTime19.toString();
        boolean boolean23 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        int int28 = mutableDateTime27.getDayOfWeek();
        mutableDateTime27.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime27.secondOfMinute();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.weekyear();
        org.joda.time.MutableDateTime mutableDateTime34 = property32.add((long) 19);
        mutableDateTime34.setMinuteOfHour(8);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 'a');
        int int39 = mutableDateTime38.getDayOfYear();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        int int43 = mutableDateTime42.getDayOfWeek();
        mutableDateTime42.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime42.secondOfMinute();
        mutableDateTime42.setSecondOfMinute(48);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime51.add(readablePeriod54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.hourOfDay();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime51.dayOfWeek();
        int int58 = property57.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime60 = property57.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime61 = property57.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        mutableDateTime61.add(readablePeriod62, 37);
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = mutableDateTime67.toString(dateTimeFormatter68);
        int int70 = mutableDateTime67.getYearOfCentury();
        org.joda.time.Chronology chronology71 = mutableDateTime67.getChronology();
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime61.toMutableDateTime(chronology71);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime((long) 'a');
        int int76 = mutableDateTime75.getDayOfWeek();
        int int77 = mutableDateTime75.getEra();
        org.joda.time.Chronology chronology78 = mutableDateTime75.getChronology();
        org.joda.time.MutableDateTime mutableDateTime79 = org.joda.time.MutableDateTime.now(chronology78);
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime((long) 100, chronology78);
        org.joda.time.MutableDateTime mutableDateTime81 = mutableDateTime61.toMutableDateTime(chronology78);
        mutableDateTime42.setChronology(chronology78);
        org.joda.time.MutableDateTime mutableDateTime83 = mutableDateTime38.toMutableDateTime(chronology78);
        mutableDateTime34.setChronology(chronology78);
        org.joda.time.DateTime dateTime85 = mutableDateTime2.toDateTime(chronology78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant13", (mutableDateTime12.compareTo(instant13) == 0) == mutableDateTime12.equals(instant13));
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
        int int5 = mutableDateTime2.getDayOfWeek();
        boolean boolean7 = mutableDateTime2.isEqual((long) (byte) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        int int9 = property8.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        mutableDateTime2.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.yearOfCentury();
        org.joda.time.Instant instant10 = mutableDateTime2.toInstant();
        boolean boolean11 = instant10.isEqualNow();
        org.joda.time.DateTime dateTime12 = instant10.toDateTimeISO();
        int int13 = dateTime12.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 'a');
        int int4 = mutableDateTime3.getDayOfWeek();
        int int5 = mutableDateTime3.getEra();
        org.joda.time.Chronology chronology6 = mutableDateTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 100, chronology6);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 14, chronology6);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.roundFloor();
        boolean boolean17 = mutableDateTime16.isEqualNow();
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant13", (mutableDateTime7.compareTo(instant13) == 0) == mutableDateTime7.equals(instant13));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        int int10 = property7.get();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property7.getAsShortText(locale11);
        int int13 = property7.get();
        java.util.Locale locale14 = null;
        int int15 = property7.getMaximumShortTextLength(locale14);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        int int23 = mutableDateTime18.getWeekOfWeekyear();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.DateTime dateTime28 = mutableDateTime18.toDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime18.copy();
        java.util.GregorianCalendar gregorianCalendar30 = mutableDateTime29.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.monthOfYear();
        mutableDateTime29.add(100L);
        int int34 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property4.getAsShortText(locale8);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        int int17 = mutableDateTime12.getWeekOfWeekyear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = mutableDateTime12.toDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.copy();
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.yearOfCentury();
        long long26 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime23);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        int int30 = mutableDateTime29.getDayOfWeek();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = mutableDateTime29.toDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime29.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration34 = null;
        mutableDateTime33.add(readableDuration34);
        mutableDateTime33.setMinuteOfDay(49);
        boolean boolean38 = mutableDateTime23.isBefore((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a');
        int int3 = mutableDateTime2.getDayOfWeek();
        int int4 = mutableDateTime2.getEra();
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 100, chronology5);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology5);
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime8.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.dayOfWeek();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundFloor();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.add((long) 80027418);
        boolean boolean21 = property10.equals((java.lang.Object) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant14", (mutableDateTime6.compareTo(instant14) == 0) == mutableDateTime6.equals(instant14));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.yearOfCentury();
        java.lang.String str12 = mutableDateTime9.toString();
        boolean boolean13 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime2.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.minuteOfDay();
        java.lang.String str17 = property16.getAsText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:09.303Z", dateTimeZone4);
        mutableDateTime5.setMinuteOfDay((int) ' ');
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.minuteOfHour();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfWeek();
        int int18 = property17.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime21 = property17.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime22 = property17.roundCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property17.getFieldType();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime5.property(dateTimeFieldType23);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        mutableDateTime27.setDate((long) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime27.add(readablePeriod31);
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime27.toGregorianCalendar();
        boolean boolean34 = mutableDateTime27.isBeforeNow();
        boolean boolean35 = property24.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant28", (mutableDateTime3.compareTo(instant28) == 0) == mutableDateTime3.equals(instant28));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        int int10 = mutableDateTime9.getYearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.weekyear();
        int int14 = mutableDateTime12.getMinuteOfHour();
        int int15 = mutableDateTime12.getDayOfMonth();
        java.util.Date date16 = mutableDateTime12.toDate();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfMinute();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        java.lang.String str26 = mutableDateTime20.toString();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime20.minuteOfDay();
        java.lang.String str29 = property28.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime12.property(dateTimeFieldType30);
        mutableDateTime9.set(dateTimeFieldType30, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
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
        int int6 = mutableDateTime2.getMonthOfYear();
        mutableDateTime2.addMonths((int) 'a');
        int int9 = mutableDateTime2.getDayOfYear();
        mutableDateTime2.add(28944000000L);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime2.setZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        int int7 = mutableDateTime5.getCenturyOfEra();
        mutableDateTime5.addMillis((int) ' ');
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTimeISO();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.dayOfWeek();
        boolean boolean26 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime19.addWeeks(35);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime19.getZone();
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        int int31 = mutableDateTime5.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant14", (mutableDateTime3.compareTo(instant14) == 0) == mutableDateTime3.equals(instant14));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        java.lang.Object obj6 = mutableDateTime2.clone();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        java.lang.String str20 = mutableDateTime14.toString();
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) mutableDateTime14);
        int int22 = mutableDateTime11.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime11.secondOfDay();
        boolean boolean24 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        boolean boolean8 = mutableDateTime2.isAfter((long) 1439);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        java.lang.String str22 = mutableDateTime16.toString();
        mutableDateTime13.setDate((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime2.toDateTime(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime6.toMutableDateTime();
        mutableDateTime6.addHours(59);
        mutableDateTime6.setWeekyear(105);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime6.toMutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 'a', chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime14", (instant4.compareTo(mutableDateTime14) == 0) == instant4.equals(mutableDateTime14));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.millisOfSecond();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.secondOfDay();
        mutableDateTime9.addWeekyears((int) (byte) -1);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        int int22 = mutableDateTime21.getDayOfWeek();
        mutableDateTime21.addSeconds((int) (byte) 0);
        mutableDateTime21.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.millisOfSecond();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        mutableDateTime30.setMinuteOfDay(4);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        int int39 = mutableDateTime36.getYearOfCentury();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        int int41 = mutableDateTime36.getWeekOfWeekyear();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.DateTime dateTime46 = mutableDateTime36.toDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime30.toMutableDateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = mutableDateTime21.toDateTime(dateTimeZone45);
        mutableDateTime9.setZone(dateTimeZone45);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime9.dayOfYear();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9, dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime58 = org.joda.time.MutableDateTime.now(dateTimeZone54);
        mutableDateTime2.setZone(dateTimeZone54);
        mutableDateTime2.addDays(72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime36", (instant3.compareTo(mutableDateTime36) == 0) == instant3.equals(mutableDateTime36));
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
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTime();
        int int7 = mutableDateTime2.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime6", (instant3.compareTo(dateTime6) == 0) == instant3.equals(dateTime6));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property4.getAsShortText(locale8);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        int int17 = mutableDateTime12.getWeekOfWeekyear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = mutableDateTime12.toDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.copy();
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.yearOfCentury();
        long long26 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime23);
        java.util.Locale locale27 = null;
        java.lang.String str28 = property4.getAsShortText(locale27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 37);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfMonth();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        org.joda.time.DateTimeField dateTimeField29 = mutableDateTime27.getRoundingField();
        mutableDateTime27.addYears(104);
        mutableDateTime27.setDayOfWeek(7);
        int int34 = mutableDateTime23.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant28", (mutableDateTime18.compareTo(instant28) == 0) == mutableDateTime18.equals(instant28));
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
        int int5 = mutableDateTime2.getDayOfWeek();
        boolean boolean7 = mutableDateTime2.isEqual((long) (byte) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime2.toString(dateTimeFormatter8);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.set(49);
        int int20 = mutableDateTime19.getYearOfCentury();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        int int24 = mutableDateTime23.getDayOfWeek();
        mutableDateTime23.addSeconds((int) (byte) 0);
        mutableDateTime23.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.millisOfSecond();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        mutableDateTime32.setMinuteOfDay(4);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        int int43 = mutableDateTime38.getWeekOfWeekyear();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        org.joda.time.DateTime dateTime48 = mutableDateTime38.toDateTime(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime32.toMutableDateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = mutableDateTime23.toDateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime51 = mutableDateTime19.toDateTime(dateTimeZone47);
        boolean boolean52 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime38", (instant3.compareTo(mutableDateTime38) == 0) == instant3.equals(mutableDateTime38));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        int int8 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundFloor();
        org.joda.time.DurationField durationField16 = property13.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property13.getFieldType();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.property(dateTimeFieldType17);
        long long19 = property18.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant12", (mutableDateTime2.compareTo(instant12) == 0) == mutableDateTime2.equals(instant12));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTime(chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(37);
        mutableDateTime11.add((-25912800000L));
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.set(49);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.toMutableDateTime();
        boolean boolean25 = mutableDateTime11.isAfter((org.joda.time.ReadableInstant) mutableDateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant17", (mutableDateTime2.compareTo(instant17) == 0) == mutableDateTime2.equals(instant17));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        org.joda.time.DurationField durationField3 = property2.getLeapDurationField();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.joda.time.MutableDateTime mutableDateTime7 = property2.roundFloor();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundCeiling();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfWeek();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime9.toMutableDateTime(chronology11);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        mutableDateTime15.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.addWrapField(4);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        int int26 = mutableDateTime25.getDayOfWeek();
        mutableDateTime25.addSeconds((int) (byte) 0);
        mutableDateTime25.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime25.millisOfSecond();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        java.lang.String str39 = mutableDateTime34.toString();
        boolean boolean40 = mutableDateTime25.isBefore((org.joda.time.ReadableInstant) mutableDateTime34);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(chronology47);
        mutableDateTime50.setMillis(100L);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) 'a');
        int int55 = mutableDateTime54.getDayOfYear();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime54.yearOfEra();
        int int57 = property56.getMaximumValue();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime60.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime63 = property61.add((long) (short) -1);
        mutableDateTime63.setWeekOfWeekyear((int) '4');
        boolean boolean66 = property56.equals((java.lang.Object) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property56.getFieldType();
        boolean boolean68 = mutableDateTime50.isSupported(dateTimeFieldType67);
        int int69 = mutableDateTime25.get(dateTimeFieldType67);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime22.property(dateTimeFieldType67);
        boolean boolean71 = mutableDateTime9.isSupported(dateTimeFieldType67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime34", (instant16.compareTo(mutableDateTime34) == 0) == instant16.equals(mutableDateTime34));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableDateTime2.add(readablePeriod4, 5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        java.lang.Object obj9 = mutableDateTime5.clone();
        int int10 = mutableDateTime5.getMillisOfDay();
        mutableDateTime5.addHours(10);
        mutableDateTime5.addWeeks(36);
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
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        java.lang.String str28 = mutableDateTime22.toString();
        mutableDateTime19.setDate((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime5.toMutableDateTime(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.setDayOfYear(10);
        boolean boolean4 = mutableDateTime0.isAfter((long) (-50));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.minuteOfDay();
        org.joda.time.Interval interval6 = property5.toInterval();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime9.toMutableDateTimeISO();
        long long16 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.centuryOfEra();
        int int25 = mutableDateTime19.getYearOfCentury();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.roundFloor();
        org.joda.time.DurationField durationField33 = property30.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property30.getFieldType();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime19.property(dateTimeFieldType34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime19.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime38 = property36.addWrapField((-32032905));
        int int39 = property5.compareTo((org.joda.time.ReadableInstant) mutableDateTime38);
        java.util.Locale locale40 = null;
        java.lang.String str41 = property5.getAsText(locale40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant29", (mutableDateTime9.compareTo(instant29) == 0) == mutableDateTime9.equals(instant29));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        java.lang.Object obj9 = mutableDateTime5.clone();
        int int10 = mutableDateTime5.getMillisOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime13.toMutableDateTimeISO();
        boolean boolean16 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        boolean boolean18 = mutableDateTime5.isBefore((long) 365);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.centuryOfEra();
        int int27 = mutableDateTime21.getYearOfCentury();
        mutableDateTime21.setDate((-131500799903L));
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime21.hourOfDay();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        boolean boolean37 = mutableDateTime33.isEqualNow();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.dayOfWeek();
        java.lang.String str47 = mutableDateTime40.toString();
        int int48 = mutableDateTime40.getYear();
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime40);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime52.toMutableDateTimeISO();
        mutableDateTime33.setMillis((org.joda.time.ReadableInstant) mutableDateTime58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime58.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime58.copy();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime61.yearOfEra();
        org.joda.time.DateTimeField dateTimeField63 = property62.getField();
        int int64 = mutableDateTime21.get(dateTimeField63);
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.dayOfWeek();
        boolean boolean25 = mutableDateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime18.addWeeks(35);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        mutableDateTime2.setZoneRetainFields(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime29", (instant13.compareTo(mutableDateTime29) == 0) == instant13.equals(mutableDateTime29));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.yearOfCentury();
        java.lang.String str22 = mutableDateTime19.toString();
        boolean boolean23 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime2.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant13", (mutableDateTime12.compareTo(instant13) == 0) == mutableDateTime12.equals(instant13));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTime(chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.secondOfDay();
        int int9 = mutableDateTime7.getYearOfCentury();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.roundFloor();
        org.joda.time.DateTimeField dateTimeField17 = property14.getField();
        mutableDateTime7.setRounding(dateTimeField17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
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
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime12.toGregorianCalendar();
        org.joda.time.Chronology chronology15 = mutableDateTime12.getChronology();
        boolean boolean16 = dateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property4.getAsShortText(locale8);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        int int17 = mutableDateTime12.getWeekOfWeekyear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = mutableDateTime12.toDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.copy();
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.yearOfCentury();
        long long26 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime23);
        java.lang.String str27 = property4.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.yearOfCentury();
        java.lang.String str22 = mutableDateTime19.toString();
        boolean boolean23 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        boolean boolean25 = mutableDateTime2.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant13", (mutableDateTime12.compareTo(instant13) == 0) == mutableDateTime12.equals(instant13));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundFloor();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime6.add(readablePeriod9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.hourOfDay();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime6.dayOfWeek();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property12.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime16 = property12.roundHalfEven();
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime16.toGregorianCalendar();
        int int18 = property2.getDifference((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime mutableDateTime19 = property2.roundCeiling();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        int int23 = mutableDateTime22.getDayOfWeek();
        mutableDateTime22.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.secondOfMinute();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.weekyear();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.add((long) 19);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        mutableDateTime29.setZoneRetainFields(dateTimeZone33);
        mutableDateTime19.setZoneRetainFields(dateTimeZone33);
        org.joda.time.Instant instant36 = mutableDateTime19.toInstant();
        java.lang.String str37 = mutableDateTime19.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant36", (mutableDateTime19.compareTo(instant36) == 0) == mutableDateTime19.equals(instant36));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        int int7 = property4.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime9 = property4.add((long) 330);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.getMutableDateTime();
        mutableDateTime13.setWeekOfWeekyear(20);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTimeISO();
        int int23 = mutableDateTime21.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        boolean boolean26 = mutableDateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        int int27 = mutableDateTime13.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 'a');
        int int30 = mutableDateTime29.getDayOfWeek();
        int int31 = mutableDateTime29.getEra();
        org.joda.time.Chronology chronology32 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime13.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime9.toMutableDateTime(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        mutableDateTime5.setWeekyear(105);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime5.toMutableDateTime(chronology17);
        boolean boolean21 = mutableDateTime5.isAfter(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        long long7 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        java.lang.String str8 = property2.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant6", (mutableDateTime0.compareTo(instant6) == 0) == mutableDateTime0.equals(instant6));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        long long7 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        long long8 = property2.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant6", (mutableDateTime0.compareTo(instant6) == 0) == mutableDateTime0.equals(instant6));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 37);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        mutableDateTime26.setSecondOfDay((int) '#');
        int int30 = mutableDateTime26.getMinuteOfDay();
        java.lang.Object obj31 = mutableDateTime26.clone();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology33);
        mutableDateTime34.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime34.minuteOfDay();
        boolean boolean39 = mutableDateTime34.isAfter((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.year();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 'a');
        int int43 = mutableDateTime42.getDayOfYear();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime42.yearOfEra();
        int int45 = property44.getMaximumValue();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime51 = property49.add((long) (short) -1);
        mutableDateTime51.setWeekOfWeekyear((int) '4');
        boolean boolean54 = property44.equals((java.lang.Object) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property44.getFieldType();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime34.property(dateTimeFieldType55);
        boolean boolean57 = mutableDateTime26.isSupported(dateTimeFieldType55);
        int int58 = mutableDateTime12.get(dateTimeFieldType55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant27", (mutableDateTime18.compareTo(instant27) == 0) == mutableDateTime18.equals(instant27));
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
        mutableDateTime2.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.yearOfCentury();
        org.joda.time.Instant instant10 = mutableDateTime2.toInstant();
        boolean boolean11 = instant10.isEqualNow();
        org.joda.time.DateTime dateTime12 = instant10.toDateTimeISO();
        int int13 = dateTime12.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
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
        int int16 = mutableDateTime5.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.setDayOfYear(10);
        boolean boolean4 = mutableDateTime0.isAfter((long) (-50));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.minuteOfDay();
        org.joda.time.Interval interval6 = property5.toInterval();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime9.toMutableDateTimeISO();
        long long16 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.centuryOfEra();
        int int25 = mutableDateTime19.getYearOfCentury();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.roundFloor();
        org.joda.time.DurationField durationField33 = property30.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property30.getFieldType();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime19.property(dateTimeFieldType34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime19.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime38 = property36.addWrapField((-32032905));
        int int39 = property5.compareTo((org.joda.time.ReadableInstant) mutableDateTime38);
        mutableDateTime38.addDays(20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant29", (mutableDateTime9.compareTo(instant29) == 0) == mutableDateTime9.equals(instant29));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.getMutableDateTime();
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTimeISO();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.dayOfWeek();
        int int21 = property20.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime24 = property20.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime24.add(readablePeriod25, 37);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime24.toMutableDateTime(chronology34);
        boolean boolean36 = dateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.dayOfMonth();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime37.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundCeiling();
        mutableDateTime24.setDate((org.joda.time.ReadableInstant) mutableDateTime40);
        boolean boolean43 = mutableDateTime40.isBefore(1580521454834L);
        int int44 = property2.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.MutableDateTime mutableDateTime45 = property2.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) 'a');
        int int48 = mutableDateTime47.getDayOfWeek();
        int int49 = mutableDateTime47.getEra();
        org.joda.time.Chronology chronology50 = mutableDateTime47.getChronology();
        mutableDateTime45.setTime((org.joda.time.ReadableInstant) mutableDateTime47);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.Instant instant55 = mutableDateTime54.toInstant();
        mutableDateTime54.addSeconds(0);
        int int58 = mutableDateTime54.getEra();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime61.dayOfYear();
        java.util.Locale locale63 = null;
        java.lang.String str64 = property62.getAsText(locale63);
        org.joda.time.MutableDateTime mutableDateTime65 = property62.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime66 = property62.roundCeiling();
        boolean boolean67 = mutableDateTime54.isBefore((org.joda.time.ReadableInstant) mutableDateTime66);
        mutableDateTime47.setTime((org.joda.time.ReadableInstant) mutableDateTime66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant55", (mutableDateTime8.compareTo(instant55) == 0) == mutableDateTime8.equals(instant55));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTime dateTime14 = mutableDateTime9.toDateTime(dateTimeZone13);
        int int15 = dateTime14.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        java.lang.Object obj9 = mutableDateTime5.clone();
        mutableDateTime5.addMinutes((int) (byte) 0);
        int int12 = mutableDateTime5.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 'a');
        int int15 = mutableDateTime14.getDayOfWeek();
        int int16 = mutableDateTime14.getEra();
        org.joda.time.Chronology chronology17 = mutableDateTime14.getChronology();
        mutableDateTime14.addMonths((-50));
        int int20 = mutableDateTime14.getSecondOfMinute();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        mutableDateTime24.setMinuteOfDay(4);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        int int35 = mutableDateTime30.getWeekOfWeekyear();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.DateTime dateTime40 = mutableDateTime30.toDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime24.toMutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        java.lang.Object obj43 = mutableDateTime42.clone();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime42.millisOfDay();
        int int45 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        mutableDateTime8.setSecondOfDay((int) '#');
        int int12 = mutableDateTime8.getMinuteOfDay();
        java.lang.Object obj13 = mutableDateTime8.clone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.minuteOfDay();
        boolean boolean21 = mutableDateTime16.isAfter((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.year();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 'a');
        int int25 = mutableDateTime24.getDayOfYear();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.yearOfEra();
        int int27 = property26.getMaximumValue();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = property31.add((long) (short) -1);
        mutableDateTime33.setWeekOfWeekyear((int) '4');
        boolean boolean36 = property26.equals((java.lang.Object) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property26.getFieldType();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime16.property(dateTimeFieldType37);
        boolean boolean39 = mutableDateTime8.isSupported(dateTimeFieldType37);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        java.lang.String str47 = mutableDateTime42.toString();
        int int48 = mutableDateTime42.getYearOfEra();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.dayOfMonth();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime53 = property51.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property51.getFieldType();
        mutableDateTime42.set(dateTimeFieldType54, 27);
        boolean boolean57 = mutableDateTime8.isSupported(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime5.property(dateTimeFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant9", (mutableDateTime2.compareTo(instant9) == 0) == mutableDateTime2.equals(instant9));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        mutableDateTime2.addSeconds((int) (byte) 10);
        int int6 = mutableDateTime2.getWeekyear();
        int int7 = mutableDateTime2.getDayOfYear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.toMutableDateTime();
        boolean boolean15 = mutableDateTime13.isAfterNow();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime13);
        boolean boolean18 = mutableDateTime13.isAfter((long) 29);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        int int22 = mutableDateTime21.getDayOfWeek();
        mutableDateTime21.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.secondOfMinute();
        int int26 = mutableDateTime21.getYearOfEra();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.getMutableDateTime();
        org.joda.time.DateTime dateTime31 = mutableDateTime30.toDateTimeISO();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.hourOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.dayOfWeek();
        int int41 = property40.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime43 = property40.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime44 = property40.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime44.add(readablePeriod45, 37);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        int int53 = mutableDateTime50.getYearOfCentury();
        org.joda.time.Chronology chronology54 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime44.toMutableDateTime(chronology54);
        boolean boolean56 = dateTime31.isBefore((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = dateTime31.toString(dateTimeFormatter57);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime60.weekyear();
        org.joda.time.DurationField durationField62 = property61.getLeapDurationField();
        java.lang.String str63 = property61.getAsString();
        org.joda.time.Interval interval64 = property61.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property61.getFieldType();
        boolean boolean66 = dateTime31.isSupported(dateTimeFieldType65);
        mutableDateTime21.set(dateTimeFieldType65, 1969);
        int int69 = mutableDateTime13.get(dateTimeFieldType65);
        mutableDateTime13.addMonths(933);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime28", (instant11.compareTo(mutableDateTime28) == 0) == instant11.equals(mutableDateTime28));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        org.joda.time.DurationField durationField7 = property4.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property4.getFieldType();
        int int9 = property4.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property4.addWrapField(8);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        boolean boolean16 = mutableDateTime14.isEqual((long) 'a');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.dayOfYear();
        boolean boolean19 = mutableDateTime14.isEqual((long) 80027418);
        int int20 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        int int24 = mutableDateTime23.getDayOfWeek();
        mutableDateTime23.addSeconds((int) (byte) 0);
        mutableDateTime23.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.millisOfSecond();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        java.lang.String str37 = mutableDateTime32.toString();
        boolean boolean38 = mutableDateTime23.isBefore((org.joda.time.ReadableInstant) mutableDateTime32);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        int int44 = mutableDateTime41.getYearOfCentury();
        org.joda.time.Chronology chronology45 = mutableDateTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology45);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology45);
        mutableDateTime48.setMillis(100L);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 'a');
        int int53 = mutableDateTime52.getDayOfYear();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime52.yearOfEra();
        int int55 = property54.getMaximumValue();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology57);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime58.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime61 = property59.add((long) (short) -1);
        mutableDateTime61.setWeekOfWeekyear((int) '4');
        boolean boolean64 = property54.equals((java.lang.Object) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property54.getFieldType();
        boolean boolean66 = mutableDateTime48.isSupported(dateTimeFieldType65);
        int int67 = mutableDateTime23.get(dateTimeFieldType65);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime23.weekyear();
        int int69 = mutableDateTime23.getSecondOfDay();
        int int70 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime6.setMillis((long) (-1));
        org.joda.time.DateTime dateTime9 = mutableDateTime6.toDateTimeISO();
        int int10 = mutableDateTime6.getSecondOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.getMutableDateTime();
        org.joda.time.DateTime dateTime15 = mutableDateTime14.toDateTimeISO();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.dayOfWeek();
        int int25 = property24.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime27 = property24.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime28 = property24.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime28.add(readablePeriod29, 37);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        int int37 = mutableDateTime34.getYearOfCentury();
        org.joda.time.Chronology chronology38 = mutableDateTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime28.toMutableDateTime(chronology38);
        boolean boolean40 = dateTime15.isBefore((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.dayOfMonth();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime44 = property43.roundCeiling();
        mutableDateTime28.setDate((org.joda.time.ReadableInstant) mutableDateTime44);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        int int51 = mutableDateTime48.getYearOfCentury();
        org.joda.time.Chronology chronology52 = mutableDateTime48.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology52);
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime44.toMutableDateTime(chronology52);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) 6294, chronology52);
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) mutableDateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        java.lang.String str8 = mutableDateTime2.toString();
        boolean boolean9 = mutableDateTime2.isEqualNow();
        int int10 = mutableDateTime2.getCenturyOfEra();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        int int14 = mutableDateTime13.getDayOfWeek();
        mutableDateTime13.addSeconds((int) (byte) 0);
        mutableDateTime13.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.millisOfSecond();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        mutableDateTime13.setChronology(chronology26);
        long long28 = mutableDateTime13.getMillis();
        org.joda.time.Instant instant29 = mutableDateTime13.toInstant();
        boolean boolean30 = mutableDateTime2.equals((java.lang.Object) instant29);
        int int31 = mutableDateTime2.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant29", (mutableDateTime13.compareTo(instant29) == 0) == mutableDateTime13.equals(instant29));
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
        int int6 = mutableDateTime2.getCenturyOfEra();
        boolean boolean8 = mutableDateTime2.isAfter((long) 1439);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime2.add(readableDuration9, 20);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.secondOfDay();
        mutableDateTime2.setMillisOfDay(365);
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
        mutableDateTime27.add(readablePeriod28, 37);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime27.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        boolean boolean37 = mutableDateTime34.isBefore((long) (short) -1);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime34.dayOfYear();
        mutableDateTime27.setDate((org.joda.time.ReadableInstant) mutableDateTime34);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime34", (instant3.compareTo(mutableDateTime34) == 0) == instant3.equals(mutableDateTime34));
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
        int int5 = mutableDateTime2.getDayOfWeek();
        boolean boolean7 = mutableDateTime2.isEqual((long) (byte) 0);
        mutableDateTime2.setMillisOfDay(84);
        int int10 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfMonth();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        mutableDateTime2.setZoneRetainFields(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
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
        int int17 = mutableDateTime5.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfDay();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:07.590Z", dateTimeZone4);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:37.503Z", dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        int int14 = mutableDateTime12.getCenturyOfEra();
        mutableDateTime12.addMillis((int) ' ');
        org.joda.time.DateTime dateTime17 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Instant instant18 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.weekyear();
        org.joda.time.DurationField durationField22 = property21.getLeapDurationField();
        org.joda.time.DurationField durationField23 = property21.getDurationField();
        java.util.Locale locale24 = null;
        java.lang.String str25 = property21.getAsShortText(locale24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property21.getFieldType();
        boolean boolean27 = instant18.isSupported(dateTimeFieldType26);
        int int28 = mutableDateTime6.get(dateTimeFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant18", (mutableDateTime12.compareTo(instant18) == 0) == mutableDateTime12.equals(instant18));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        int int10 = mutableDateTime9.getYearOfCentury();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        int int14 = mutableDateTime13.getDayOfWeek();
        mutableDateTime13.addSeconds((int) (byte) 0);
        mutableDateTime13.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.millisOfSecond();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        mutableDateTime22.setMinuteOfDay(4);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        int int33 = mutableDateTime28.getWeekOfWeekyear();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.DateTime dateTime38 = mutableDateTime28.toDateTime(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime22.toMutableDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = mutableDateTime13.toDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime41 = mutableDateTime9.toDateTime(dateTimeZone37);
        int int42 = mutableDateTime9.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }
}

