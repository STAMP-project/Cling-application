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
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsText(locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = property9.addWrapField(48);
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        boolean boolean16 = mutableDateTime14.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
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
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.hourOfDay();
        int int14 = mutableDateTime9.getDayOfYear();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        int int20 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
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
        int int5 = mutableDateTime2.getDayOfWeek();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        mutableDateTime8.setTime((long) '#');
        org.joda.time.DateTime dateTime13 = mutableDateTime8.toDateTimeISO();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        mutableDateTime8.setRounding(dateTimeField22, (int) (short) 0);
        boolean boolean25 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        mutableDateTime2.setTime((long) '#');
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        mutableDateTime2.setRounding(dateTimeField16, (int) (short) 0);
        int int19 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        int int27 = mutableDateTime22.getWeekOfWeekyear();
        mutableDateTime22.setMillisOfSecond((int) (short) 100);
        mutableDateTime22.setDate((long) 12);
        mutableDateTime22.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime22.toMutableDateTime();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.Instant instant38 = mutableDateTime37.toInstant();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime37.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundCeiling();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property39.getAsText(locale41);
        org.joda.time.MutableDateTime mutableDateTime44 = property39.addWrapField(48);
        int int45 = mutableDateTime34.compareTo((org.joda.time.ReadableInstant) mutableDateTime44);
        boolean boolean46 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant38", (mutableDateTime10.compareTo(instant38) == 0) == mutableDateTime10.equals(instant38));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.String str11 = property4.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        mutableDateTime5.setRounding(dateTimeField18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        mutableDateTime4.setTime((long) '#');
        org.joda.time.DateTime dateTime9 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        mutableDateTime4.setRounding(dateTimeField18, (int) (short) 0);
        int int21 = mutableDateTime4.getSecondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutableDateTime4.add(readableDuration23, (int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime9", (mutableDateTime1.compareTo(dateTime9) == 0) == mutableDateTime1.equals(dateTime9));
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
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.MutableDateTime mutableDateTime9 = property4.addWrapField(48);
        mutableDateTime9.setMinuteOfHour((int) (byte) 10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime14.setTime((long) '#');
        org.joda.time.DateTime dateTime19 = mutableDateTime14.toDateTimeISO();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        mutableDateTime14.setRounding(dateTimeField28, (int) (short) 0);
        int int31 = mutableDateTime14.getSecondOfMinute();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        int int37 = mutableDateTime34.getYearOfCentury();
        org.joda.time.Chronology chronology38 = mutableDateTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(chronology38);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology38);
        mutableDateTime14.setChronology(chronology38);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime9.toMutableDateTime(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
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
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = mutableDateTime14.isSupported(dateTimeFieldType15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime14.copy();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundFloor();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        mutableDateTime8.setRounding(dateTimeField21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant12", (mutableDateTime2.compareTo(instant12) == 0) == mutableDateTime2.equals(instant12));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsText(locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = property9.addWrapField(48);
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.String str16 = mutableDateTime14.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        mutableDateTime2.setChronology(chronology16);
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
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology30);
        boolean boolean32 = mutableDateTime28.isEqual((org.joda.time.ReadableInstant) mutableDateTime31);
        mutableDateTime28.addHours(48);
        boolean boolean35 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant22", (mutableDateTime12.compareTo(instant22) == 0) == mutableDateTime12.equals(instant22));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        long long12 = mutableDateTime11.getMillis();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime5.toMutableDateTime(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant9", (mutableDateTime2.compareTo(instant9) == 0) == mutableDateTime2.equals(instant9));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        boolean boolean4 = instant3.isBeforeNow();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.Chronology chronology11 = mutableDateTime7.getChronology();
        boolean boolean13 = mutableDateTime7.isEqual((long) 22);
        boolean boolean14 = instant3.isBefore((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.Instant instant15 = mutableDateTime7.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        mutableDateTime2.setTime((long) '#');
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        mutableDateTime2.setRounding(dateTimeField16, (int) (short) 0);
        mutableDateTime2.addWeeks((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime2.monthOfYear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.era();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime24.centuryOfEra();
        boolean boolean32 = mutableDateTime24.isBeforeNow();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = mutableDateTime38.isSupported(dateTimeFieldType39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime38.monthOfYear();
        int int42 = mutableDateTime38.getMinuteOfHour();
        java.lang.String str43 = mutableDateTime38.toString();
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) mutableDateTime38);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant36", (mutableDateTime10.compareTo(instant36) == 0) == mutableDateTime10.equals(instant36));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a');
        int int13 = mutableDateTime12.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime12.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.getMutableDateTime();
        java.lang.String str18 = property16.getAsText();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime19, dateTimeZone23);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.setTime((long) '#');
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        mutableDateTime27.setRounding(dateTimeField41, (int) (short) 0);
        int int44 = mutableDateTime27.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime27.weekyear();
        org.joda.time.MutableDateTime mutableDateTime47 = property45.add(54);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) 'a');
        boolean boolean50 = mutableDateTime49.isEqualNow();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        int int55 = mutableDateTime53.getSecondOfMinute();
        mutableDateTime53.setMillis((long) 3);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = null;
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        mutableDateTime60.add(readablePeriod63);
        java.util.Date date65 = mutableDateTime60.toDate();
        boolean boolean66 = mutableDateTime53.isAfter((org.joda.time.ReadableInstant) mutableDateTime60);
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.DateTimeZone dateTimeZone70 = mutableDateTime69.getZone();
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(dateTimeZone70);
        org.joda.time.MutableDateTime mutableDateTime72 = org.joda.time.MutableDateTime.now(dateTimeZone70);
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime60.toMutableDateTime(dateTimeZone70);
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(dateTimeZone70);
        org.joda.time.MutableDateTime mutableDateTime75 = mutableDateTime49.toMutableDateTime(dateTimeZone70);
        int int76 = property45.compareTo((org.joda.time.ReadableInstant) mutableDateTime49);
        java.lang.Object obj77 = null;
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(obj77, chronology78);
        org.joda.time.DateTimeZone dateTimeZone80 = mutableDateTime79.getZone();
        mutableDateTime49.setZoneRetainFields(dateTimeZone80);
        org.joda.time.MutableDateTime mutableDateTime82 = mutableDateTime19.toMutableDateTime(dateTimeZone80);
        mutableDateTime19.setDayOfYear(5);
        long long85 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology87);
        mutableDateTime88.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime91 = mutableDateTime88.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property92 = mutableDateTime91.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = property92.getFieldType();
        boolean boolean94 = mutableDateTime19.isSupported(dateTimeFieldType93);
        org.joda.time.MutableDateTime.Property property95 = mutableDateTime9.property(dateTimeFieldType93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime8.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.centuryOfEra();
        boolean boolean14 = property12.equals((java.lang.Object) "2020-11-25T01:45:28.846Z");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime mutableDateTime11 = property4.roundHalfCeiling();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime8.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.centuryOfEra();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        java.util.Date date20 = mutableDateTime15.toDate();
        int int21 = mutableDateTime15.getCenturyOfEra();
        mutableDateTime15.setDayOfYear(10);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime15.dayOfWeek();
        boolean boolean26 = mutableDateTime15.isAfter((long) (byte) 1);
        int int27 = property12.getDifference((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsText(locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = property9.addWrapField(48);
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        mutableDateTime14.addYears(25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        mutableDateTime11.addYears(59);
        int int14 = mutableDateTime11.getHourOfDay();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        mutableDateTime11.setZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime8.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 'a');
        boolean boolean15 = mutableDateTime14.isEqualNow();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        int int20 = mutableDateTime18.getSecondOfMinute();
        mutableDateTime18.setMillis((long) 3);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        java.util.Date date30 = mutableDateTime25.toDate();
        boolean boolean31 = mutableDateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime25.toMutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime14.toMutableDateTime(dateTimeZone35);
        mutableDateTime8.setZoneRetainFields(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime25", (instant3.compareTo(mutableDateTime25) == 0) == instant3.equals(mutableDateTime25));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        boolean boolean4 = instant3.isBeforeNow();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.Chronology chronology11 = mutableDateTime7.getChronology();
        boolean boolean13 = mutableDateTime7.isEqual((long) 22);
        boolean boolean14 = instant3.isBefore((org.joda.time.ReadableInstant) mutableDateTime7);
        int int15 = mutableDateTime7.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        int int9 = mutableDateTime7.getSecondOfMinute();
        mutableDateTime7.setMillis((long) 3);
        int int12 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        long long8 = mutableDateTime7.getMillis();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime7.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        boolean boolean14 = mutableDateTime11.isAfter(37L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        mutableDateTime4.addWeeks(5);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        mutableDateTime4.setRounding(dateTimeField19);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = mutableDateTime26.isSupported(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundFloor();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        boolean boolean34 = mutableDateTime30.isEqual((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.era();
        int int36 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime12", (instant5.compareTo(mutableDateTime12) == 0) == instant5.equals(mutableDateTime12));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsText(locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = property9.addWrapField(48);
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.minuteOfHour();
        org.joda.time.DurationField durationField17 = property16.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        mutableDateTime11.addYears(59);
        int int14 = mutableDateTime11.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        mutableDateTime20.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime20.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.millisOfSecond();
        mutableDateTime17.setDate((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        mutableDateTime30.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime30.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property34.getFieldType();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime17.property(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime16.property(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsText(locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = property9.addWrapField(48);
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        mutableDateTime14.setMillis((long) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfCentury();
        java.util.Date date3 = mutableDateTime0.toDate();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundCeiling();
        boolean boolean10 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.yearOfCentury();
        mutableDateTime11.addDays(22);
        boolean boolean17 = mutableDateTime11.isEqual(1606780800000L);
        mutableDateTime11.setMillis((long) '#');
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        int int24 = mutableDateTime22.getSecondOfMinute();
        mutableDateTime22.setMillis((long) 3);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        java.util.Date date34 = mutableDateTime29.toDate();
        boolean boolean35 = mutableDateTime22.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime29.toMutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime11.toMutableDateTime(dateTimeZone39);
        mutableDateTime0.setZoneRetainFields(dateTimeZone39);
        int int45 = mutableDateTime0.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime29", (instant7.compareTo(mutableDateTime29) == 0) == instant7.equals(mutableDateTime29));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        mutableDateTime11.addYears(59);
        int int14 = mutableDateTime11.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        mutableDateTime19.setTime((long) '#');
        org.joda.time.DateTime dateTime24 = mutableDateTime19.toDateTimeISO();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = property32.getField();
        mutableDateTime19.setRounding(dateTimeField33, (int) (short) 0);
        int int36 = mutableDateTime19.getSecondOfMinute();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(chronology43);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(chronology43);
        mutableDateTime19.setChronology(chronology43);
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(chronology43);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime11.toMutableDateTime(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        java.lang.Object obj10 = mutableDateTime9.clone();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.dayOfMonth();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        java.util.Date date19 = mutableDateTime14.toDate();
        int int20 = mutableDateTime14.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime14.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfCeiling();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        int int27 = mutableDateTime25.getSecondOfMinute();
        mutableDateTime25.setMillis((long) 3);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        java.util.Date date37 = mutableDateTime32.toDate();
        boolean boolean38 = mutableDateTime25.isAfter((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime39, dateTimeZone43);
        mutableDateTime32.setZone(dateTimeZone43);
        mutableDateTime22.setZoneRetainFields(dateTimeZone43);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        mutableDateTime49.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar54 = mutableDateTime49.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime49.millisOfSecond();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime49.yearOfCentury();
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = null;
        java.lang.String str61 = mutableDateTime59.toString(dateTimeFormatter60);
        int int62 = mutableDateTime59.getYearOfCentury();
        org.joda.time.Chronology chronology63 = mutableDateTime59.getChronology();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(chronology63);
        mutableDateTime49.setChronology(chronology63);
        mutableDateTime22.setChronology(chronology63);
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime9.toMutableDateTime(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime32", (instant3.compareTo(mutableDateTime32) == 0) == instant3.equals(mutableDateTime32));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 58);
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        long long10 = mutableDateTime9.getMillis();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime3.toMutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        boolean boolean15 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime13", (mutableDateTime3.compareTo(mutableDateTime13) == 0) == mutableDateTime3.equals(mutableDateTime13));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = mutableDateTime9.isSupported(dateTimeFieldType10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime9.copy();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.toMutableDateTimeISO();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant3", (mutableDateTime0.compareTo(instant3) == 0) == mutableDateTime0.equals(instant3));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        long long8 = mutableDateTime7.getMillis();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime7.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone16);
        boolean boolean18 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime12", (instant5.compareTo(mutableDateTime12) == 0) == instant5.equals(mutableDateTime12));
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
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        mutableDateTime2.setDate((long) 12);
        mutableDateTime2.setMinuteOfDay(4);
        java.lang.Object obj14 = mutableDateTime2.clone();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = mutableDateTime17.getSecondOfMinute();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundCeiling();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property24.getAsText(locale26);
        org.joda.time.MutableDateTime mutableDateTime29 = property24.addWrapField(48);
        boolean boolean30 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime17.minuteOfHour();
        int int32 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant23", (mutableDateTime17.compareTo(instant23) == 0) == mutableDateTime17.equals(instant23));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        mutableDateTime4.setTime((long) '#');
        org.joda.time.DateTime dateTime9 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        mutableDateTime4.setRounding(dateTimeField18, (int) (short) 0);
        int int21 = mutableDateTime4.getSecondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime4.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime9", (mutableDateTime1.compareTo(dateTime9) == 0) == mutableDateTime1.equals(dateTime9));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        int int9 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime2.copy();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        int int18 = mutableDateTime13.getWeekOfWeekyear();
        mutableDateTime13.setMillisOfSecond((int) (short) 100);
        mutableDateTime13.setDate((long) 12);
        mutableDateTime13.setMinuteOfDay(4);
        java.lang.Object obj25 = mutableDateTime13.clone();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        int int30 = mutableDateTime28.getSecondOfMinute();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundCeiling();
        java.util.Locale locale37 = null;
        java.lang.String str38 = property35.getAsText(locale37);
        org.joda.time.MutableDateTime mutableDateTime40 = property35.addWrapField(48);
        boolean boolean41 = mutableDateTime28.isAfter((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime28.minuteOfHour();
        int int43 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime28 and instant34", (mutableDateTime28.compareTo(instant34) == 0) == mutableDateTime28.equals(instant34));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        long long7 = mutableDateTime6.getMillis();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime6.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 100, dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = mutableDateTime17.isSupported(dateTimeFieldType18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime17.copy();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundFloor();
        mutableDateTime23.addYears(59);
        int int26 = mutableDateTime23.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime11, dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime11", (instant4.compareTo(mutableDateTime11) == 0) == instant4.equals(mutableDateTime11));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        long long8 = mutableDateTime7.getMillis();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime7.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        org.joda.time.DateTime dateTime13 = mutableDateTime11.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        mutableDateTime2.setYear(11);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        int int18 = mutableDateTime13.getWeekOfWeekyear();
        mutableDateTime13.setTime(3, (int) (short) 10, 10, (int) (short) 0);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        mutableDateTime13.setZoneRetainFields(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 24, dateTimeZone27);
        mutableDateTime2.setZone(dateTimeZone27);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology33);
        mutableDateTime34.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime34.toMutableDateTime();
        int int38 = mutableDateTime37.getWeekOfWeekyear();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        mutableDateTime43.setZone(dateTimeZone47);
        mutableDateTime37.setZone(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(dateTimeZone47);
        long long51 = mutableDateTime50.getMillis();
        int int52 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime50);
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.Instant instant56 = mutableDateTime55.toInstant();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime55.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime58 = property57.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = null;
        boolean boolean60 = mutableDateTime58.isSupported(dateTimeFieldType59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime58.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime58.copy();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime58.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime64 = property63.roundFloor();
        org.joda.time.DateTimeField dateTimeField65 = property63.getField();
        org.joda.time.MutableDateTime mutableDateTime66 = property63.roundHalfEven();
        org.joda.time.ReadableDuration readableDuration67 = null;
        mutableDateTime66.add(readableDuration67);
        int int69 = mutableDateTime50.compareTo((org.joda.time.ReadableInstant) mutableDateTime66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime26 and instant56", (mutableDateTime26.compareTo(instant56) == 0) == mutableDateTime26.equals(instant56));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.weekOfWeekyear();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        java.util.Date date19 = mutableDateTime14.toDate();
        mutableDateTime14.setSecondOfDay(105);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        int int26 = mutableDateTime24.getSecondOfMinute();
        mutableDateTime24.setMillis((long) 3);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        java.util.Date date36 = mutableDateTime31.toDate();
        boolean boolean37 = mutableDateTime24.isAfter((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime38, dateTimeZone42);
        mutableDateTime31.setZone(dateTimeZone42);
        java.lang.Object obj45 = null;
        boolean boolean46 = mutableDateTime31.equals(obj45);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime49.getZone();
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime31, dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime14.toMutableDateTime(dateTimeZone50);
        int int55 = property11.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime31", (instant3.compareTo(mutableDateTime31) == 0) == instant3.equals(mutableDateTime31));
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
        mutableDateTime2.setTime((long) '#');
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        mutableDateTime2.setRounding(dateTimeField16, (int) (short) 0);
        mutableDateTime2.addWeeks((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime2.dayOfMonth();
        boolean boolean24 = mutableDateTime2.isEqual((long) 18);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = mutableDateTime30.isSupported(dateTimeFieldType31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime30.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime30.copy();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundFloor();
        org.joda.time.DateTimeField dateTimeField37 = property35.getField();
        mutableDateTime2.setRounding(dateTimeField37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant28", (mutableDateTime10.compareTo(instant28) == 0) == mutableDateTime10.equals(instant28));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        long long7 = mutableDateTime6.getMillis();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime6.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 100, dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = mutableDateTime17.isSupported(dateTimeFieldType18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime17.copy();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundFloor();
        mutableDateTime23.addYears(59);
        int int26 = mutableDateTime23.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime11, dateTimeZone27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime11.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime28", (instant4.compareTo(mutableDateTime28) == 0) == instant4.equals(mutableDateTime28));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.dayOfYear();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        mutableDateTime7.setTime((long) '#');
        org.joda.time.DateTime dateTime12 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTime dateTime13 = mutableDateTime7.toDateTimeISO();
        int int14 = mutableDateTime7.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime7.copy();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = mutableDateTime21.isSupported(dateTimeFieldType22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime21.copy();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundFloor();
        org.joda.time.DateTimeField dateTimeField28 = property26.getField();
        int int29 = mutableDateTime7.get(dateTimeField28);
        int int30 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant19", (mutableDateTime2.compareTo(instant19) == 0) == mutableDateTime2.equals(instant19));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        int int20 = mutableDateTime15.getWeekOfWeekyear();
        mutableDateTime15.addWeekyears((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime15.add(readablePeriod23, (int) (short) 0);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        mutableDateTime28.setTime((long) '#');
        org.joda.time.DateTime dateTime33 = mutableDateTime28.toDateTimeISO();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        mutableDateTime28.setRounding(dateTimeField42, (int) (short) 0);
        int int45 = mutableDateTime15.get(dateTimeField42);
        int int46 = mutableDateTime12.get(dateTimeField42);
        int int47 = mutableDateTime8.get(dateTimeField42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime36", (instant3.compareTo(mutableDateTime36) == 0) == instant3.equals(mutableDateTime36));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsText(locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = property9.addWrapField(48);
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.yearOfCentury();
        int int17 = property16.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        int int13 = mutableDateTime8.getWeekOfWeekyear();
        mutableDateTime8.setMillisOfSecond((int) (short) 100);
        mutableDateTime8.setDate((long) 12);
        mutableDateTime8.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime8.toMutableDateTime();
        int int21 = mutableDateTime8.getEra();
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundCeiling();
        java.util.Locale locale29 = null;
        java.lang.String str30 = property27.getAsText(locale29);
        org.joda.time.MutableDateTime mutableDateTime32 = property27.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime34 = property27.set((int) (byte) 1);
        int int35 = property27.getMinimumValueOverall();
        int int36 = property27.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property27.getFieldType();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime8.property(dateTimeFieldType37);
        java.lang.String str39 = property38.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant26", (mutableDateTime2.compareTo(instant26) == 0) == mutableDateTime2.equals(instant26));
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
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
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
        mutableDateTime19.setTime((long) '#');
        org.joda.time.DateTime dateTime24 = mutableDateTime19.toDateTimeISO();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = property32.getField();
        mutableDateTime19.setRounding(dateTimeField33, (int) (short) 0);
        int int36 = mutableDateTime19.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime19.weekyear();
        org.joda.time.DurationField durationField38 = property37.getDurationField();
        org.joda.time.DurationField durationField39 = property37.getDurationField();
        org.joda.time.DateTimeField dateTimeField40 = property37.getField();
        int int41 = mutableDateTime12.get(dateTimeField40);
        int int42 = mutableDateTime9.get(dateTimeField40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:24.342Z");
        boolean boolean3 = mutableDateTime1.equals((java.lang.Object) 2074);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        int int17 = mutableDateTime12.getWeekOfWeekyear();
        mutableDateTime12.setMillisOfSecond((int) (short) 100);
        mutableDateTime12.setDate((long) 12);
        mutableDateTime12.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime12.toMutableDateTime();
        int int25 = mutableDateTime12.getEra();
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundCeiling();
        java.util.Locale locale33 = null;
        java.lang.String str34 = property31.getAsText(locale33);
        org.joda.time.MutableDateTime mutableDateTime36 = property31.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime38 = property31.set((int) (byte) 1);
        int int39 = property31.getMinimumValueOverall();
        int int40 = property31.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property31.getFieldType();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime12.property(dateTimeFieldType41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime1.property(dateTimeFieldType41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant30", (mutableDateTime6.compareTo(instant30) == 0) == mutableDateTime6.equals(instant30));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.roundHalfEven();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime13.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.dayOfMonth();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        int int21 = mutableDateTime19.getSecondOfMinute();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundCeiling();
        java.util.Locale locale28 = null;
        java.lang.String str29 = property26.getAsText(locale28);
        org.joda.time.MutableDateTime mutableDateTime31 = property26.addWrapField(48);
        boolean boolean32 = mutableDateTime19.isAfter((org.joda.time.ReadableInstant) mutableDateTime31);
        long long33 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        int int38 = mutableDateTime36.getSecondOfMinute();
        mutableDateTime36.setMillis((long) 3);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        java.util.Date date48 = mutableDateTime43.toDate();
        boolean boolean49 = mutableDateTime36.isAfter((org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime50, dateTimeZone54);
        mutableDateTime43.setZone(dateTimeZone54);
        mutableDateTime19.setMillis((org.joda.time.ReadableInstant) mutableDateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant25 and mutableDateTime50", (instant25.compareTo(mutableDateTime50) == 0) == instant25.equals(mutableDateTime50));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        int int5 = mutableDateTime3.getSecondOfMinute();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = mutableDateTime12.isSupported(dateTimeFieldType13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime12.copy();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundFloor();
        mutableDateTime18.addYears(59);
        int int21 = mutableDateTime18.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime3.toMutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 55, dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant10", (mutableDateTime3.compareTo(instant10) == 0) == mutableDateTime3.equals(instant10));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        boolean boolean13 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime9.addHours(48);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.centuryOfEra();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology23);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology23);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        java.util.Date date34 = mutableDateTime29.toDate();
        int int35 = mutableDateTime29.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime29.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfCeiling();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        int int42 = mutableDateTime40.getSecondOfMinute();
        mutableDateTime40.setMillis((long) 3);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        java.util.Date date52 = mutableDateTime47.toDate();
        boolean boolean53 = mutableDateTime40.isAfter((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime57.getZone();
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime54, dateTimeZone58);
        mutableDateTime47.setZone(dateTimeZone58);
        mutableDateTime37.setZoneRetainFields(dateTimeZone58);
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = mutableDateTime64.toString(dateTimeFormatter65);
        mutableDateTime64.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar69 = mutableDateTime64.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime64.millisOfSecond();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime64.yearOfCentury();
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = null;
        java.lang.String str76 = mutableDateTime74.toString(dateTimeFormatter75);
        int int77 = mutableDateTime74.getYearOfCentury();
        org.joda.time.Chronology chronology78 = mutableDateTime74.getChronology();
        org.joda.time.MutableDateTime mutableDateTime79 = org.joda.time.MutableDateTime.now(chronology78);
        mutableDateTime64.setChronology(chronology78);
        mutableDateTime37.setChronology(chronology78);
        org.joda.time.MutableDateTime mutableDateTime82 = mutableDateTime26.toMutableDateTime(chronology78);
        org.joda.time.MutableDateTime mutableDateTime83 = mutableDateTime9.toMutableDateTime(chronology78);
        int int84 = mutableDateTime83.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.toMutableDateTime();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        int int19 = mutableDateTime14.getWeekOfWeekyear();
        mutableDateTime14.addWeekyears((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime14.add(readablePeriod22, (int) (short) 0);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.setTime((long) '#');
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        mutableDateTime27.setRounding(dateTimeField41, (int) (short) 0);
        int int44 = mutableDateTime14.get(dateTimeField41);
        mutableDateTime11.setRounding(dateTimeField41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        boolean boolean13 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.Chronology chronology14 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:16.294Z");
        int int17 = mutableDateTime16.getYearOfCentury();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        mutableDateTime20.setTime((long) '#');
        org.joda.time.DateTime dateTime25 = mutableDateTime20.toDateTimeISO();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = property33.getField();
        mutableDateTime20.setRounding(dateTimeField34, (int) (short) 0);
        int int37 = mutableDateTime20.getSecondOfMinute();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        int int43 = mutableDateTime40.getYearOfCentury();
        org.joda.time.Chronology chronology44 = mutableDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(chronology44);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology44);
        mutableDateTime20.setChronology(chronology44);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime16.toMutableDateTime(chronology44);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        int int55 = mutableDateTime52.getYearOfCentury();
        org.joda.time.Chronology chronology56 = mutableDateTime52.getChronology();
        mutableDateTime52.setWeekOfWeekyear((int) '#');
        mutableDateTime52.addMinutes((int) (short) -1);
        mutableDateTime52.addMinutes(783);
        java.util.GregorianCalendar gregorianCalendar63 = mutableDateTime52.toGregorianCalendar();
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = null;
        java.lang.String str68 = mutableDateTime66.toString(dateTimeFormatter67);
        mutableDateTime66.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar71 = mutableDateTime66.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime66.millisOfSecond();
        int int73 = property72.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime74 = property72.roundCeiling();
        org.joda.time.DurationField durationField75 = property72.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property72.getFieldType();
        mutableDateTime52.set(dateTimeFieldType76, 29);
        mutableDateTime16.set(dateTimeFieldType76, 56);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime12.property(dateTimeFieldType76);
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime mutableDateTime11 = property4.roundHalfEven();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        long long8 = mutableDateTime7.getMillis();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime7.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        int int13 = mutableDateTime11.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        boolean boolean9 = property8.isLeap();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = mutableDateTime15.isSupported(dateTimeFieldType16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime15.copy();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.dayOfMonth();
        int int21 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        long long8 = mutableDateTime7.getMillis();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime7.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime11.add(readableDuration13, 47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.era();
        java.lang.String str12 = property11.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:16.294Z");
        int int7 = mutableDateTime6.getYearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        mutableDateTime10.setTime((long) '#');
        org.joda.time.DateTime dateTime15 = mutableDateTime10.toDateTimeISO();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        mutableDateTime10.setRounding(dateTimeField24, (int) (short) 0);
        int int27 = mutableDateTime10.getSecondOfMinute();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology34);
        mutableDateTime10.setChronology(chronology34);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime6.toMutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology34);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(chronology34);
        mutableDateTime2.setChronology(chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        int int7 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = mutableDateTime13.isSupported(dateTimeFieldType14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime13.copy();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundFloor();
        mutableDateTime19.addYears(59);
        int int22 = mutableDateTime19.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone23);
        int int26 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime24", (instant11.compareTo(mutableDateTime24) == 0) == instant11.equals(mutableDateTime24));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        int int7 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = mutableDateTime13.isSupported(dateTimeFieldType14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime13.copy();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundFloor();
        mutableDateTime19.addYears(59);
        int int22 = mutableDateTime19.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone23);
        int int26 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:30.614Z");
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        mutableDateTime31.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar36 = mutableDateTime31.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundFloor();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        int int44 = mutableDateTime41.getYearOfCentury();
        org.joda.time.Chronology chronology45 = mutableDateTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(chronology45);
        boolean boolean47 = property37.equals((java.lang.Object) chronology45);
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(chronology45);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime28.toMutableDateTime(chronology45);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(chronology45);
        org.joda.time.ReadableDuration readableDuration51 = null;
        mutableDateTime50.add(readableDuration51, 3);
        boolean boolean54 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime24", (instant11.compareTo(mutableDateTime24) == 0) == instant11.equals(mutableDateTime24));
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
        long long5 = property4.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime8.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.centuryOfEra();
        java.lang.String str13 = property12.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        long long8 = mutableDateTime7.getMillis();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime7.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime14.hourOfDay();
        mutableDateTime14.setSecondOfMinute(24);
        mutableDateTime14.setDate((long) 4);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime14.year();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.add((long) 2020);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfWeek();
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime25);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        mutableDateTime30.setTime((long) '#');
        org.joda.time.DateTime dateTime35 = mutableDateTime30.toDateTimeISO();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        org.joda.time.DateTimeField dateTimeField44 = property43.getField();
        mutableDateTime30.setRounding(dateTimeField44, (int) (short) 0);
        int int47 = mutableDateTime30.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime30.weekyear();
        org.joda.time.DurationField durationField49 = property48.getDurationField();
        org.joda.time.DurationField durationField50 = property48.getDurationField();
        int int51 = property48.get();
        org.joda.time.MutableDateTime mutableDateTime53 = property48.set(7);
        org.joda.time.ReadableDuration readableDuration54 = null;
        mutableDateTime53.add(readableDuration54);
        mutableDateTime25.setMillis((org.joda.time.ReadableInstant) mutableDateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime38", (instant5.compareTo(mutableDateTime38) == 0) == instant5.equals(mutableDateTime38));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfCentury();
        java.util.Date date3 = mutableDateTime0.toDate();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundCeiling();
        boolean boolean10 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.yearOfCentury();
        mutableDateTime11.addDays(22);
        boolean boolean17 = mutableDateTime11.isEqual(1606780800000L);
        mutableDateTime11.setMillis((long) '#');
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        int int24 = mutableDateTime22.getSecondOfMinute();
        mutableDateTime22.setMillis((long) 3);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        java.util.Date date34 = mutableDateTime29.toDate();
        boolean boolean35 = mutableDateTime22.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime29.toMutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime11.toMutableDateTime(dateTimeZone39);
        mutableDateTime0.setZoneRetainFields(dateTimeZone39);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        int int50 = mutableDateTime47.getYearOfCentury();
        org.joda.time.Chronology chronology51 = mutableDateTime47.getChronology();
        int int52 = mutableDateTime47.getWeekOfWeekyear();
        mutableDateTime47.setMillisOfSecond((int) (short) 100);
        mutableDateTime47.setDate((long) 12);
        mutableDateTime47.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime47.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration60 = null;
        mutableDateTime59.add(readableDuration60);
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.DateTimeZone dateTimeZone65 = mutableDateTime64.getZone();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime67 = org.joda.time.MutableDateTime.now(dateTimeZone65);
        mutableDateTime59.setZoneRetainFields(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime0.toMutableDateTime(dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime29", (instant7.compareTo(mutableDateTime29) == 0) == instant7.equals(mutableDateTime29));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        boolean boolean2 = mutableDateTime1.isEqualNow();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        int int7 = mutableDateTime5.getSecondOfMinute();
        mutableDateTime5.setMillis((long) 3);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        java.util.Date date17 = mutableDateTime12.toDate();
        boolean boolean18 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime12.toMutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime1.toMutableDateTime(dateTimeZone22);
        int int28 = mutableDateTime1.getRoundingMode();
        mutableDateTime1.add((-1L));
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        boolean boolean38 = mutableDateTime36.isSupported(dateTimeFieldType37);
        int int39 = mutableDateTime36.getRoundingMode();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundHalfFloor();
        long long47 = mutableDateTime46.getMillis();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime46.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime46.getZone();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) 14, dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime36.toMutableDateTime(dateTimeZone49);
        mutableDateTime1.setZone(dateTimeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant34", (mutableDateTime12.compareTo(instant34) == 0) == mutableDateTime12.equals(instant34));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        mutableDateTime1.add(readablePeriod3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.minuteOfDay();
        mutableDateTime1.addSeconds(24);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.dayOfWeek();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        mutableDateTime11.add((long) (byte) 1);
        mutableDateTime11.setMillisOfSecond((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime11.add(readablePeriod18);
        boolean boolean20 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.weekyear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundFloor();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime27.toMutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 650, chronology34);
        mutableDateTime1.setChronology(chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime30", (instant12.compareTo(mutableDateTime30) == 0) == instant12.equals(mutableDateTime30));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        long long8 = mutableDateTime7.getMillis();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime7.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        int int13 = mutableDateTime12.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime11", (mutableDateTime1.compareTo(mutableDateTime11) == 0) == mutableDateTime1.equals(mutableDateTime11));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        long long12 = mutableDateTime11.getMillis();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime5.toMutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime5.millisOfSecond();
        boolean boolean17 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime5);
        mutableDateTime5.setWeekOfWeekyear(3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:16.294Z");
        int int2 = mutableDateTime1.getYearOfCentury();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        mutableDateTime5.setTime((long) '#');
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTimeISO();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        mutableDateTime5.setRounding(dateTimeField19, (int) (short) 0);
        int int22 = mutableDateTime5.getSecondOfMinute();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(chronology29);
        mutableDateTime5.setChronology(chronology29);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime1.toMutableDateTime(chronology29);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.Instant instant38 = mutableDateTime37.toInstant();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime37.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundCeiling();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property39.getAsText(locale41);
        org.joda.time.DateTimeField dateTimeField43 = property39.getField();
        boolean boolean44 = mutableDateTime1.equals((java.lang.Object) dateTimeField43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant38", (mutableDateTime13.compareTo(instant38) == 0) == mutableDateTime13.equals(instant38));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        mutableDateTime2.setDate((long) 12);
        mutableDateTime2.setMinuteOfDay(4);
        java.lang.Object obj14 = mutableDateTime2.clone();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = mutableDateTime17.getSecondOfMinute();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundCeiling();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property24.getAsText(locale26);
        org.joda.time.MutableDateTime mutableDateTime29 = property24.addWrapField(48);
        boolean boolean30 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime17.minuteOfHour();
        int int32 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime35.era();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime35.centuryOfEra();
        boolean boolean43 = mutableDateTime35.isBeforeNow();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.Instant instant47 = mutableDateTime46.toInstant();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime49 = property48.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        boolean boolean51 = mutableDateTime49.isSupported(dateTimeFieldType50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime49.monthOfYear();
        int int53 = mutableDateTime49.getMinuteOfHour();
        java.lang.String str54 = mutableDateTime49.toString();
        mutableDateTime35.setMillis((org.joda.time.ReadableInstant) mutableDateTime49);
        boolean boolean56 = mutableDateTime17.isBefore((org.joda.time.ReadableInstant) mutableDateTime35);
        mutableDateTime35.setSecondOfMinute(35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant23", (mutableDateTime17.compareTo(instant23) == 0) == mutableDateTime17.equals(instant23));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.weekOfWeekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = mutableDateTime9.toDateTime(dateTimeZone13);
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        mutableDateTime11.addYears(59);
        int int14 = mutableDateTime11.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        java.util.GregorianCalendar gregorianCalendar19 = mutableDateTime17.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        mutableDateTime2.setDate((long) 12);
        mutableDateTime2.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime2.toMutableDateTime();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundCeiling();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property19.getAsText(locale21);
        org.joda.time.MutableDateTime mutableDateTime24 = property19.addWrapField(48);
        int int25 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        java.util.Date date35 = mutableDateTime30.toDate();
        int int36 = mutableDateTime30.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime30.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfCeiling();
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
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime();
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.DateTimeZone dateTimeZone59 = mutableDateTime58.getZone();
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime55, dateTimeZone59);
        mutableDateTime48.setZone(dateTimeZone59);
        mutableDateTime38.setZoneRetainFields(dateTimeZone59);
        mutableDateTime38.addYears(25);
        org.joda.time.Chronology chronology65 = mutableDateTime38.getChronology();
        org.joda.time.DateTime dateTime66 = mutableDateTime27.toDateTime(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and mutableDateTime48", (instant18.compareTo(mutableDateTime48) == 0) == instant18.equals(mutableDateTime48));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.util.Date date8 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        int int23 = mutableDateTime18.getWeekOfWeekyear();
        mutableDateTime18.setMillisOfSecond((int) (short) 100);
        mutableDateTime18.setDate((long) 12);
        mutableDateTime18.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime18.toMutableDateTime();
        int int31 = mutableDateTime18.getEra();
        mutableDateTime15.setTime((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.Instant instant33 = mutableDateTime15.toInstant();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime2.toString(dateTimeFormatter35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant33", (mutableDateTime15.compareTo(instant33) == 0) == mutableDateTime15.equals(instant33));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsText(locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = property9.addWrapField(48);
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        mutableDateTime11.addYears(59);
        int int14 = mutableDateTime11.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        mutableDateTime21.setTime((long) '#');
        org.joda.time.DateTime dateTime26 = mutableDateTime21.toDateTimeISO();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        mutableDateTime21.setRounding(dateTimeField35, (int) (short) 0);
        int int38 = mutableDateTime21.getSecondOfMinute();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        int int44 = mutableDateTime41.getYearOfCentury();
        org.joda.time.Chronology chronology45 = mutableDateTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology45);
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(chronology45);
        mutableDateTime21.setChronology(chronology45);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(chronology45);
        mutableDateTime17.setChronology(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        mutableDateTime2.addWeeks(10);
        mutableDateTime2.addDays(20);
        int int11 = mutableDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology12 = mutableDateTime2.getChronology();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        long long19 = mutableDateTime18.getMillis();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime18.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime18.getZone();
        boolean boolean22 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:30.614Z");
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar32 = mutableDateTime27.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime27.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundFloor();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.Chronology chronology41 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(chronology41);
        boolean boolean43 = property33.equals((java.lang.Object) chronology41);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology41);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime24.toMutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime2.toMutableDateTime(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime37", (instant16.compareTo(mutableDateTime37) == 0) == instant16.equals(mutableDateTime37));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) (short) 10);
        java.util.GregorianCalendar gregorianCalendar10 = mutableDateTime2.toGregorianCalendar();
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
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime21.toMutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone31);
        mutableDateTime35.addMonths(5);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        mutableDateTime35.setZoneRetainFields(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (-304), dateTimeZone41);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        int int49 = mutableDateTime46.getYearOfCentury();
        org.joda.time.Chronology chronology50 = mutableDateTime46.getChronology();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(chronology50);
        org.joda.time.DateTime dateTime55 = mutableDateTime43.toDateTime(chronology50);
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar10, chronology50);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.Instant instant61 = mutableDateTime60.toInstant();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime60.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime63 = property62.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = null;
        boolean boolean65 = mutableDateTime63.isSupported(dateTimeFieldType64);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime63.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime63.copy();
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime63.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime69 = property68.roundFloor();
        mutableDateTime69.addYears(59);
        int int72 = mutableDateTime69.getHourOfDay();
        org.joda.time.Chronology chronology73 = mutableDateTime69.getChronology();
        org.joda.time.DateTime dateTime74 = mutableDateTime57.toDateTime(chronology73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime40 and instant61", (mutableDateTime40.compareTo(instant61) == 0) == mutableDateTime40.equals(instant61));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.toMutableDateTimeISO();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        int int19 = mutableDateTime14.getWeekOfWeekyear();
        mutableDateTime14.addWeekyears((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime14.add(readablePeriod22, (int) (short) 0);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.setTime((long) '#');
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        mutableDateTime27.setRounding(dateTimeField41, (int) (short) 0);
        int int44 = mutableDateTime14.get(dateTimeField41);
        int int45 = mutableDateTime11.get(dateTimeField41);
        int int46 = mutableDateTime11.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
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
        mutableDateTime2.addWeeks(10);
        mutableDateTime2.addDays(20);
        int int11 = mutableDateTime2.getDayOfYear();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.toMutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.yearOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = mutableDateTime25.isSupported(dateTimeFieldType26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime25.monthOfYear();
        boolean boolean29 = property28.isLeap();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.addWrapField(2);
        int int32 = property19.compareTo((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant23", (mutableDateTime14.compareTo(instant23) == 0) == mutableDateTime14.equals(instant23));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        long long7 = mutableDateTime6.getMillis();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime6.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 14, dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfMonth();
        java.util.Locale locale12 = null;
        int int13 = property11.getMaximumShortTextLength(locale12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime14.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = mutableDateTime14.toDateTime();
        long long18 = mutableDateTime14.getMillis();
        mutableDateTime14.setMillisOfSecond(469);
        int int21 = property11.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime17", (instant4.compareTo(dateTime17) == 0) == instant4.equals(dateTime17));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        mutableDateTime11.addYears(59);
        int int14 = mutableDateTime11.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone15);
        mutableDateTime17.setMillis((long) 2019);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:16.294Z");
        int int9 = mutableDateTime8.getYearOfCentury();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        mutableDateTime12.setTime((long) '#');
        org.joda.time.DateTime dateTime17 = mutableDateTime12.toDateTimeISO();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        mutableDateTime12.setRounding(dateTimeField26, (int) (short) 0);
        int int29 = mutableDateTime12.getSecondOfMinute();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology36);
        mutableDateTime12.setChronology(chronology36);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime8.toMutableDateTime(chronology36);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        int int47 = mutableDateTime44.getYearOfCentury();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        mutableDateTime44.setWeekOfWeekyear((int) '#');
        mutableDateTime44.addMinutes((int) (short) -1);
        mutableDateTime44.addMinutes(783);
        java.util.GregorianCalendar gregorianCalendar55 = mutableDateTime44.toGregorianCalendar();
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        mutableDateTime58.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar63 = mutableDateTime58.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime58.millisOfSecond();
        int int65 = property64.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime66 = property64.roundCeiling();
        org.joda.time.DurationField durationField67 = property64.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property64.getFieldType();
        mutableDateTime44.set(dateTimeFieldType68, 29);
        mutableDateTime8.set(dateTimeFieldType68, 56);
        boolean boolean73 = mutableDateTime5.isSupported(dateTimeFieldType68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:30.614Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        mutableDateTime4.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime4.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        boolean boolean20 = property10.equals((java.lang.Object) chronology18);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime1.toMutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology18);
        mutableDateTime23.addWeekyears((int) (short) -1);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime23.hourOfDay();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.minuteOfHour();
        java.util.Date date31 = mutableDateTime29.toDate();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        int int37 = mutableDateTime34.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime34.hourOfDay();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.secondOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.yearOfEra();
        int int41 = mutableDateTime34.getDayOfWeek();
        mutableDateTime34.addMonths(336);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.Instant instant47 = mutableDateTime46.toInstant();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime49 = property48.roundCeiling();
        java.util.Locale locale50 = null;
        java.lang.String str51 = property48.getAsText(locale50);
        org.joda.time.MutableDateTime mutableDateTime53 = property48.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime55 = property48.set((int) (byte) 1);
        int int56 = property48.getMinimumValueOverall();
        int int57 = property48.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property48.getFieldType();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime34.property(dateTimeFieldType58);
        boolean boolean60 = mutableDateTime29.isSupported(dateTimeFieldType58);
        boolean boolean61 = mutableDateTime23.isSupported(dateTimeFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant47", (mutableDateTime14.compareTo(instant47) == 0) == mutableDateTime14.equals(instant47));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        java.lang.String str9 = property4.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.yearOfCentury();
        mutableDateTime10.addDays(22);
        org.joda.time.DateTime dateTime15 = mutableDateTime10.toDateTime();
        java.lang.String str16 = mutableDateTime10.toString();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime17, dateTimeZone21);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        mutableDateTime25.setTime((long) '#');
        org.joda.time.DateTime dateTime30 = mutableDateTime25.toDateTimeISO();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        mutableDateTime25.setRounding(dateTimeField39, (int) (short) 0);
        int int42 = mutableDateTime25.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime25.weekyear();
        org.joda.time.MutableDateTime mutableDateTime45 = property43.add(54);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) 'a');
        boolean boolean48 = mutableDateTime47.isEqualNow();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        int int53 = mutableDateTime51.getSecondOfMinute();
        mutableDateTime51.setMillis((long) 3);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        mutableDateTime58.add(readablePeriod61);
        java.util.Date date63 = mutableDateTime58.toDate();
        boolean boolean64 = mutableDateTime51.isAfter((org.joda.time.ReadableInstant) mutableDateTime58);
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.DateTimeZone dateTimeZone68 = mutableDateTime67.getZone();
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime70 = org.joda.time.MutableDateTime.now(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime58.toMutableDateTime(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime47.toMutableDateTime(dateTimeZone68);
        int int74 = property43.compareTo((org.joda.time.ReadableInstant) mutableDateTime47);
        java.lang.Object obj75 = null;
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(obj75, chronology76);
        org.joda.time.DateTimeZone dateTimeZone78 = mutableDateTime77.getZone();
        mutableDateTime47.setZoneRetainFields(dateTimeZone78);
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime17.toMutableDateTime(dateTimeZone78);
        mutableDateTime17.setDayOfYear(5);
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime17.centuryOfEra();
        boolean boolean84 = mutableDateTime10.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        int int85 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        mutableDateTime10.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.getMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property14.getFieldType();
        int int17 = mutableDateTime7.get(dateTimeFieldType16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.minuteOfHour();
        java.util.Date date4 = mutableDateTime2.toDate();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.secondOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.yearOfEra();
        int int14 = mutableDateTime7.getDayOfWeek();
        mutableDateTime7.addMonths(336);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property21.getAsText(locale23);
        org.joda.time.MutableDateTime mutableDateTime26 = property21.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime28 = property21.set((int) (byte) 1);
        int int29 = property21.getMinimumValueOverall();
        int int30 = property21.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property21.getFieldType();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime7.property(dateTimeFieldType31);
        boolean boolean33 = mutableDateTime2.isSupported(dateTimeFieldType31);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime2.toMutableDateTime();
        int int35 = mutableDateTime34.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant20", (mutableDateTime2.compareTo(instant20) == 0) == mutableDateTime2.equals(instant20));
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
        boolean boolean8 = mutableDateTime2.isEqual((long) 22);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime2.add(readableDuration9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.hourOfDay();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        int int20 = mutableDateTime15.getWeekOfWeekyear();
        mutableDateTime15.setMillisOfSecond((int) (short) 100);
        mutableDateTime15.setDate((long) 12);
        mutableDateTime15.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime15.toMutableDateTime();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.Instant instant31 = mutableDateTime30.toInstant();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundCeiling();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property32.getAsText(locale34);
        org.joda.time.MutableDateTime mutableDateTime37 = property32.addWrapField(48);
        int int38 = mutableDateTime27.compareTo((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        mutableDateTime37.add(readableDuration39);
        mutableDateTime37.addMillis(32);
        long long43 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant31", (mutableDateTime2.compareTo(instant31) == 0) == mutableDateTime2.equals(instant31));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.toMutableDateTimeISO();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        int int19 = mutableDateTime14.getWeekOfWeekyear();
        mutableDateTime14.addWeekyears((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime14.add(readablePeriod22, (int) (short) 0);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.setTime((long) '#');
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        mutableDateTime27.setRounding(dateTimeField41, (int) (short) 0);
        int int44 = mutableDateTime14.get(dateTimeField41);
        int int45 = mutableDateTime11.get(dateTimeField41);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime11.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        mutableDateTime2.setDate((long) 12);
        mutableDateTime2.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime2.toMutableDateTime();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundCeiling();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property19.getAsText(locale21);
        org.joda.time.MutableDateTime mutableDateTime24 = property19.addWrapField(48);
        int int25 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        mutableDateTime14.setTime((-1L));
        mutableDateTime14.addWeeks(11);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        int int37 = mutableDateTime32.getWeekOfWeekyear();
        mutableDateTime32.setMillisOfSecond((int) (short) 100);
        mutableDateTime32.setDate((long) 12);
        mutableDateTime32.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime32.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration45 = null;
        mutableDateTime44.add(readableDuration45);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime49.getZone();
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        mutableDateTime44.setZoneRetainFields(dateTimeZone50);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime44.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property54.getFieldType();
        int int56 = mutableDateTime14.get(dateTimeFieldType55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and mutableDateTime49", (instant18.compareTo(mutableDateTime49) == 0) == instant18.equals(mutableDateTime49));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        int int8 = mutableDateTime5.getRoundingMode();
        boolean boolean10 = mutableDateTime5.isAfter((long) 6324);
        org.joda.time.Instant instant11 = mutableDateTime5.toInstant();
        int int12 = mutableDateTime5.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant11", (mutableDateTime5.compareTo(instant11) == 0) == mutableDateTime5.equals(instant11));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        boolean boolean13 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMillis((long) 3);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        java.util.Date date28 = mutableDateTime23.toDate();
        boolean boolean29 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime30, dateTimeZone34);
        mutableDateTime23.setZone(dateTimeZone34);
        mutableDateTime12.setZone(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime9.toMutableDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.secondOfDay();
        int int21 = property20.getMinimumValue();
        boolean boolean22 = mutableDateTime9.equals((java.lang.Object) property20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        long long9 = mutableDateTime8.getMillis();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime2.toMutableDateTime(dateTimeZone11);
        int int13 = mutableDateTime12.getHourOfDay();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        mutableDateTime16.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime16.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundFloor();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology30);
        boolean boolean32 = property22.equals((java.lang.Object) chronology30);
        org.joda.time.DateTime dateTime33 = mutableDateTime12.toDateTime(chronology30);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((java.lang.Object) 28432079290L, chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime12", (mutableDateTime2.compareTo(mutableDateTime12) == 0) == mutableDateTime2.equals(mutableDateTime12));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        long long7 = mutableDateTime6.getMillis();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime6.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 14, dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        mutableDateTime16.addWeeks(5);
        mutableDateTime13.setDate((org.joda.time.ReadableInstant) mutableDateTime16);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.secondOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = property30.getField();
        mutableDateTime16.setRounding(dateTimeField31);
        int int33 = mutableDateTime11.get(dateTimeField31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime24", (instant4.compareTo(mutableDateTime24) == 0) == instant4.equals(mutableDateTime24));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        int int5 = mutableDateTime3.getSecondOfMinute();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = mutableDateTime12.isSupported(dateTimeFieldType13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime12.copy();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundFloor();
        mutableDateTime18.addYears(59);
        int int21 = mutableDateTime18.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime3.toMutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(28432079290L, dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant10", (mutableDateTime3.compareTo(instant10) == 0) == mutableDateTime3.equals(instant10));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime0.toGregorianCalendar();
        mutableDateTime0.setMinuteOfHour(54);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.yearOfCentury();
        java.util.Date date13 = mutableDateTime10.toDate();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundCeiling();
        boolean boolean20 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime21.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.yearOfCentury();
        mutableDateTime21.addDays(22);
        boolean boolean27 = mutableDateTime21.isEqual(1606780800000L);
        mutableDateTime21.setMillis((long) '#');
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
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime48.getZone();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime39.toMutableDateTime(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime21.toMutableDateTime(dateTimeZone49);
        mutableDateTime10.setZoneRetainFields(dateTimeZone49);
        mutableDateTime0.setZone(dateTimeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant17", (mutableDateTime3.compareTo(instant17) == 0) == mutableDateTime3.equals(instant17));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        int int13 = mutableDateTime8.getWeekOfWeekyear();
        mutableDateTime8.setMillisOfSecond((int) (short) 100);
        mutableDateTime8.setDate((long) 12);
        mutableDateTime8.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime8.toMutableDateTime();
        int int21 = mutableDateTime8.getEra();
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundCeiling();
        java.util.Locale locale29 = null;
        java.lang.String str30 = property27.getAsText(locale29);
        org.joda.time.MutableDateTime mutableDateTime32 = property27.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime34 = property27.set((int) (byte) 1);
        int int35 = property27.getMinimumValueOverall();
        int int36 = property27.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property27.getFieldType();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime8.property(dateTimeFieldType37);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 'a');
        int int41 = mutableDateTime40.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime40.add(readablePeriod42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime40.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime45 = property44.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime47 = property44.addWrapField(56);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:28.846Z");
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.millisOfSecond();
        org.joda.time.DateTime dateTime51 = mutableDateTime49.toDateTime();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime49.monthOfYear();
        mutableDateTime49.setMillisOfDay(18);
        long long55 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime49);
        int int56 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant26", (mutableDateTime2.compareTo(instant26) == 0) == mutableDateTime2.equals(instant26));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime14.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.yearOfCentury();
        mutableDateTime14.addDays(22);
        boolean boolean20 = mutableDateTime14.isEqual(1606780800000L);
        int int21 = property10.getDifference((org.joda.time.ReadableInstant) mutableDateTime14);
        java.util.Locale locale22 = null;
        java.lang.String str23 = property10.getAsShortText(locale22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime24.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.yearOfCentury();
        int int27 = property26.getLeapAmount();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        int int32 = mutableDateTime30.getSecondOfMinute();
        mutableDateTime30.setMillis((long) 3);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        java.util.Date date42 = mutableDateTime37.toDate();
        boolean boolean43 = mutableDateTime30.isAfter((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime44, dateTimeZone48);
        mutableDateTime37.setZone(dateTimeZone48);
        int int51 = property26.getDifference((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime37.toMutableDateTimeISO();
        int int53 = mutableDateTime37.getCenturyOfEra();
        int int54 = property10.getDifference((org.joda.time.ReadableInstant) mutableDateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        int int10 = mutableDateTime9.getEra();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 610, chronology18);
        org.joda.time.DateTime dateTime20 = mutableDateTime9.toDateTime(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        mutableDateTime2.setDate((long) 12);
        mutableDateTime2.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime2.toMutableDateTime();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundCeiling();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property19.getAsText(locale21);
        org.joda.time.MutableDateTime mutableDateTime24 = property19.addWrapField(48);
        int int25 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        mutableDateTime33.setZone(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(0L, dateTimeZone37);
        long long40 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and mutableDateTime31", (instant18.compareTo(mutableDateTime31) == 0) == instant18.equals(mutableDateTime31));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.roundHalfCeiling();
        int int11 = mutableDateTime10.getYear();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        int int19 = mutableDateTime14.getWeekOfWeekyear();
        mutableDateTime14.addWeekyears((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime14.add(readablePeriod22, (int) (short) 0);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.setTime((long) '#');
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        mutableDateTime27.setRounding(dateTimeField41, (int) (short) 0);
        int int44 = mutableDateTime14.get(dateTimeField41);
        int int45 = mutableDateTime14.getWeekyear();
        mutableDateTime14.setDate((long) 2074);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        int int52 = mutableDateTime50.getSecondOfMinute();
        mutableDateTime50.setMillis((long) 3);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime57.add(readablePeriod60);
        java.util.Date date62 = mutableDateTime57.toDate();
        boolean boolean63 = mutableDateTime50.isAfter((org.joda.time.ReadableInstant) mutableDateTime57);
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.DateTimeZone dateTimeZone67 = mutableDateTime66.getZone();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime69 = org.joda.time.MutableDateTime.now(dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime57.toMutableDateTime(dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime14.toMutableDateTime(dateTimeZone67);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime14.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone74 = mutableDateTime14.getZone();
        mutableDateTime10.setZone(dateTimeZone74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        boolean boolean13 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.era();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfFloor();
        long long21 = mutableDateTime20.getMillis();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime20.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime20.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime20.toString(dateTimeFormatter24);
        int int26 = mutableDateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        mutableDateTime20.setDate((long) 47);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        int int34 = mutableDateTime31.getYearOfCentury();
        mutableDateTime31.addMinutes(330);
        mutableDateTime31.setYear(11);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        int int45 = mutableDateTime42.getYearOfCentury();
        org.joda.time.Chronology chronology46 = mutableDateTime42.getChronology();
        int int47 = mutableDateTime42.getWeekOfWeekyear();
        mutableDateTime42.setTime(3, (int) (short) 10, 10, (int) (short) 0);
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(dateTimeZone56);
        mutableDateTime42.setZoneRetainFields(dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) 24, dateTimeZone56);
        mutableDateTime31.setZone(dateTimeZone56);
        boolean boolean61 = mutableDateTime20.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime55", (instant3.compareTo(mutableDateTime55) == 0) == instant3.equals(mutableDateTime55));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        long long7 = mutableDateTime6.getMillis();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime6.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 14, dateTimeZone9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        int int18 = mutableDateTime13.getWeekOfWeekyear();
        mutableDateTime13.addWeekyears((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime13.add(readablePeriod21, (int) (short) 0);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        int int31 = mutableDateTime26.getWeekOfWeekyear();
        mutableDateTime26.addWeekyears((int) (short) -1);
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime26.secondOfMinute();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology42);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(chronology42);
        int int46 = property35.compareTo((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.DateTimeField dateTimeField47 = property35.getField();
        int int48 = mutableDateTime10.get(dateTimeField47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime38", (instant4.compareTo(mutableDateTime38) == 0) == instant4.equals(mutableDateTime38));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        mutableDateTime4.addWeeks(5);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        mutableDateTime4.setRounding(dateTimeField19);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        int int28 = mutableDateTime23.getWeekOfWeekyear();
        mutableDateTime23.addWeekyears((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime23.add(readablePeriod31, (int) (short) 0);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        int int39 = mutableDateTime36.getYearOfCentury();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        int int41 = mutableDateTime36.getWeekOfWeekyear();
        mutableDateTime36.addWeekyears((int) (short) -1);
        mutableDateTime23.setTime((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime36.secondOfMinute();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableDateTime48.add(readablePeriod51);
        java.util.Date date53 = mutableDateTime48.toDate();
        int int54 = mutableDateTime48.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime48.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime56 = property55.roundHalfCeiling();
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.DateTimeZone dateTimeZone60 = mutableDateTime59.getZone();
        int int61 = mutableDateTime59.getSecondOfMinute();
        mutableDateTime59.setMillis((long) 3);
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = null;
        java.lang.String str68 = mutableDateTime66.toString(dateTimeFormatter67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        mutableDateTime66.add(readablePeriod69);
        java.util.Date date71 = mutableDateTime66.toDate();
        boolean boolean72 = mutableDateTime59.isAfter((org.joda.time.ReadableInstant) mutableDateTime66);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime();
        java.lang.Object obj74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(obj74, chronology75);
        org.joda.time.DateTimeZone dateTimeZone77 = mutableDateTime76.getZone();
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime73, dateTimeZone77);
        mutableDateTime66.setZone(dateTimeZone77);
        mutableDateTime56.setZoneRetainFields(dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime81 = mutableDateTime36.toMutableDateTime(dateTimeZone77);
        mutableDateTime4.setZoneRetainFields(dateTimeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime12", (instant5.compareTo(mutableDateTime12) == 0) == instant5.equals(mutableDateTime12));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        mutableDateTime8.setTime((long) '#');
        org.joda.time.DateTime dateTime13 = mutableDateTime8.toDateTimeISO();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        mutableDateTime8.setRounding(dateTimeField22, (int) (short) 0);
        int int25 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime8.weekyear();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.add(54);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 'a');
        boolean boolean31 = mutableDateTime30.isEqualNow();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        int int36 = mutableDateTime34.getSecondOfMinute();
        mutableDateTime34.setMillis((long) 3);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime41.add(readablePeriod44);
        java.util.Date date46 = mutableDateTime41.toDate();
        boolean boolean47 = mutableDateTime34.isAfter((org.joda.time.ReadableInstant) mutableDateTime41);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime41.toMutableDateTime(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime30.toMutableDateTime(dateTimeZone51);
        int int57 = property26.compareTo((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime60.getZone();
        mutableDateTime30.setZoneRetainFields(dateTimeZone61);
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime0.toMutableDateTime(dateTimeZone61);
        mutableDateTime0.setDayOfYear(5);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime0.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime67 = property66.roundFloor();
        org.joda.time.DurationField durationField68 = property66.getRangeDurationField();
        int int69 = property66.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.Instant instant75 = mutableDateTime74.toInstant();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime74.monthOfYear();
        mutableDateTime74.addWeeks(5);
        mutableDateTime71.setDate((org.joda.time.ReadableInstant) mutableDateTime74);
        int int80 = property66.compareTo((org.joda.time.ReadableInstant) mutableDateTime71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant75", (mutableDateTime3.compareTo(instant75) == 0) == mutableDateTime3.equals(instant75));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getRoundingMode();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7, dateTimeZone11);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        mutableDateTime15.setTime((long) '#');
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTimeISO();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        mutableDateTime15.setRounding(dateTimeField29, (int) (short) 0);
        int int32 = mutableDateTime15.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.add(54);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 'a');
        boolean boolean38 = mutableDateTime37.isEqualNow();
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
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime57.getZone();
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime60 = org.joda.time.MutableDateTime.now(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime48.toMutableDateTime(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime37.toMutableDateTime(dateTimeZone58);
        int int64 = property33.compareTo((org.joda.time.ReadableInstant) mutableDateTime37);
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.DateTimeZone dateTimeZone68 = mutableDateTime67.getZone();
        mutableDateTime37.setZoneRetainFields(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime7.toMutableDateTime(dateTimeZone68);
        mutableDateTime7.setDayOfYear(5);
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(obj73, chronology74);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = null;
        java.lang.String str77 = mutableDateTime75.toString(dateTimeFormatter76);
        int int78 = mutableDateTime75.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime75.hourOfDay();
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime75.secondOfDay();
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime75.millisOfDay();
        boolean boolean82 = mutableDateTime7.equals((java.lang.Object) mutableDateTime75);
        org.joda.time.MutableDateTime mutableDateTime83 = mutableDateTime75.toMutableDateTime();
        org.joda.time.Chronology chronology84 = mutableDateTime75.getChronology();
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime(chronology84);
        boolean boolean86 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundFloor();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.era();
        boolean boolean21 = mutableDateTime8.equals((java.lang.Object) mutableDateTime17);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        int int27 = mutableDateTime25.getSecondOfMinute();
        mutableDateTime25.setMillis((long) 3);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        java.util.Date date37 = mutableDateTime32.toDate();
        boolean boolean38 = mutableDateTime25.isAfter((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime39, dateTimeZone43);
        mutableDateTime32.setZone(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) 47, dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime17.toMutableDateTime(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime32", (instant12.compareTo(mutableDateTime32) == 0) == instant12.equals(mutableDateTime32));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        boolean boolean15 = mutableDateTime9.isEqual((long) 22);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime9.add(readableDuration16);
        boolean boolean18 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime6.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        mutableDateTime3.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        boolean boolean19 = property9.equals((java.lang.Object) chronology17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj0, chronology17);
        mutableDateTime20.setTime((long) 2019);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        mutableDateTime25.addWeeks(10);
        mutableDateTime25.addDays(20);
        java.util.Date date34 = mutableDateTime25.toDate();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        mutableDateTime38.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar43 = mutableDateTime38.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime38.millisOfSecond();
        mutableDateTime35.setDate((org.joda.time.ReadableInstant) mutableDateTime38);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime48.getZone();
        int int50 = mutableDateTime48.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime48.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField52 = property51.getField();
        mutableDateTime35.setRounding(dateTimeField52);
        mutableDateTime25.setRounding(dateTimeField52);
        int int55 = mutableDateTime20.get(dateTimeField52);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.Instant instant59 = mutableDateTime58.toInstant();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime58.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime61 = property60.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = null;
        boolean boolean63 = mutableDateTime61.isSupported(dateTimeFieldType62);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime61.monthOfYear();
        java.util.Locale locale65 = null;
        java.util.Calendar calendar66 = mutableDateTime61.toCalendar(locale65);
        mutableDateTime20.setMillis((org.joda.time.ReadableInstant) mutableDateTime61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant59", (mutableDateTime13.compareTo(instant59) == 0) == mutableDateTime13.equals(instant59));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        boolean boolean4 = instant3.isBeforeNow();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.Chronology chronology11 = mutableDateTime7.getChronology();
        boolean boolean13 = mutableDateTime7.isEqual((long) 22);
        boolean boolean14 = instant3.isBefore((org.joda.time.ReadableInstant) mutableDateTime7);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        int int20 = mutableDateTime18.getSecondOfMinute();
        mutableDateTime18.setMillis((long) 3);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        java.util.Date date30 = mutableDateTime25.toDate();
        boolean boolean31 = mutableDateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime25.toMutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone35);
        mutableDateTime39.addMonths(5);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        mutableDateTime39.setZoneRetainFields(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) (-304), dateTimeZone45);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        int int53 = mutableDateTime50.getYearOfCentury();
        org.joda.time.Chronology chronology54 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(chronology54);
        org.joda.time.DateTime dateTime59 = mutableDateTime47.toDateTime(chronology54);
        org.joda.time.MutableDateTime mutableDateTime60 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.MutableDateTime mutableDateTime61 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.DateTime dateTime62 = instant3.toDateTime(chronology54);
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = mutableDateTime65.toString(dateTimeFormatter66);
        int int68 = mutableDateTime65.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime65.hourOfDay();
        int int70 = mutableDateTime65.getDayOfYear();
        int int71 = mutableDateTime65.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration72 = null;
        mutableDateTime65.add(readableDuration72, 47);
        boolean boolean75 = dateTime62.isBefore((org.joda.time.ReadableInstant) mutableDateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        mutableDateTime4.addWeeks(5);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        mutableDateTime4.setRounding(dateTimeField19);
        int int21 = mutableDateTime4.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime12", (instant5.compareTo(mutableDateTime12) == 0) == instant5.equals(mutableDateTime12));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        mutableDateTime4.setTime((long) '#');
        org.joda.time.DateTime dateTime9 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        mutableDateTime4.setRounding(dateTimeField18, (int) (short) 0);
        int int21 = mutableDateTime4.getSecondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        int int23 = mutableDateTime4.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime9", (mutableDateTime1.compareTo(dateTime9) == 0) == mutableDateTime1.equals(dateTime9));
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
        mutableDateTime2.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        mutableDateTime10.setTime((long) '#');
        org.joda.time.DateTime dateTime15 = mutableDateTime10.toDateTimeISO();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        mutableDateTime10.setRounding(dateTimeField24, (int) (short) 0);
        int int27 = mutableDateTime10.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime10.weekyear();
        org.joda.time.DurationField durationField29 = property28.getDurationField();
        org.joda.time.DurationField durationField30 = property28.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.roundFloor();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.era();
        int int33 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime31.secondOfDay();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.Instant instant38 = mutableDateTime37.toInstant();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime37.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = mutableDateTime40.isSupported(dateTimeFieldType41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime40.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime40.copy();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundFloor();
        int int47 = mutableDateTime31.compareTo((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant38", (mutableDateTime18.compareTo(instant38) == 0) == mutableDateTime18.equals(instant38));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getWeekyear();
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime0.add(readableDuration2);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.hourOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundFloor();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundCeiling();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        int int23 = property17.getDifference((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.era();
        boolean boolean25 = mutableDateTime12.equals((java.lang.Object) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.dayOfWeek();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime21);
        java.util.Locale locale28 = null;
        java.util.Calendar calendar29 = mutableDateTime0.toCalendar(locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime21", (instant16.compareTo(mutableDateTime21) == 0) == instant16.equals(mutableDateTime21));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        mutableDateTime11.addYears(59);
        int int14 = mutableDateTime11.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        int int19 = mutableDateTime17.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        int int6 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        mutableDateTime11.setZone(dateTimeZone15);
        mutableDateTime5.setZone(dateTimeZone15);
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
        mutableDateTime27.setTime((long) '#');
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        mutableDateTime27.setRounding(dateTimeField41, (int) (short) 0);
        int int44 = mutableDateTime27.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime27.weekyear();
        org.joda.time.DurationField durationField46 = property45.getDurationField();
        org.joda.time.DurationField durationField47 = property45.getDurationField();
        org.joda.time.DateTimeField dateTimeField48 = property45.getField();
        int int49 = mutableDateTime20.get(dateTimeField48);
        int int50 = mutableDateTime5.get(dateTimeField48);
        boolean boolean52 = mutableDateTime5.isBefore(1606268868008L);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime5.year();
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime56.minuteOfHour();
        java.util.Date date58 = mutableDateTime56.toDate();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = null;
        java.lang.String str63 = mutableDateTime61.toString(dateTimeFormatter62);
        int int64 = mutableDateTime61.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime61.hourOfDay();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime61.secondOfDay();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime61.yearOfEra();
        int int68 = mutableDateTime61.getDayOfWeek();
        mutableDateTime61.addMonths(336);
        java.lang.Object obj71 = null;
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(obj71, chronology72);
        org.joda.time.Instant instant74 = mutableDateTime73.toInstant();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime73.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime76 = property75.roundCeiling();
        java.util.Locale locale77 = null;
        java.lang.String str78 = property75.getAsText(locale77);
        org.joda.time.MutableDateTime mutableDateTime80 = property75.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime82 = property75.set((int) (byte) 1);
        int int83 = property75.getMinimumValueOverall();
        int int84 = property75.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = property75.getFieldType();
        org.joda.time.MutableDateTime.Property property86 = mutableDateTime61.property(dateTimeFieldType85);
        boolean boolean87 = mutableDateTime56.isSupported(dateTimeFieldType85);
        boolean boolean88 = mutableDateTime5.isSupported(dateTimeFieldType85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant74", (mutableDateTime9.compareTo(instant74) == 0) == mutableDateTime9.equals(instant74));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.hourOfDay();
        int int14 = mutableDateTime9.getDayOfYear();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        int int20 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        boolean boolean21 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime2.monthOfYear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = mutableDateTime28.isSupported(dateTimeFieldType29);
        int int31 = mutableDateTime28.getRoundingMode();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfFloor();
        long long39 = mutableDateTime38.getMillis();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime38.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 14, dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime28.toMutableDateTime(dateTimeZone41);
        int int44 = property22.compareTo((org.joda.time.ReadableInstant) mutableDateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant26", (mutableDateTime2.compareTo(instant26) == 0) == mutableDateTime2.equals(instant26));
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
        mutableDateTime2.add((long) (byte) 1);
        mutableDateTime2.setMinuteOfDay(70);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        mutableDateTime12.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime12.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.millisOfSecond();
        mutableDateTime9.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        mutableDateTime22.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime22.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime9.property(dateTimeFieldType27);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        int int34 = mutableDateTime9.get(dateTimeFieldType33);
        boolean boolean35 = mutableDateTime2.isSupported(dateTimeFieldType33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        int int10 = mutableDateTime9.getEra();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime9.toMutableDateTime(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        long long12 = mutableDateTime11.getMillis();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime5.toMutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime5.millisOfSecond();
        boolean boolean17 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        mutableDateTime21.addMillis((int) 'a');
        mutableDateTime21.addYears((int) (short) 10);
        mutableDateTime21.setSecondOfMinute(18);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime21.toMutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 32, chronology34);
        org.joda.time.DateTime dateTime41 = mutableDateTime5.toDateTime(chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        long long7 = property6.remainder();
        java.lang.String str8 = property6.toString();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        mutableDateTime11.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.secondOfMinute();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        mutableDateTime19.setTime((long) '#');
        org.joda.time.DateTime dateTime24 = mutableDateTime19.toDateTimeISO();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = property32.getField();
        mutableDateTime19.setRounding(dateTimeField33, (int) (short) 0);
        int int36 = mutableDateTime19.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime19.weekyear();
        org.joda.time.DurationField durationField38 = property37.getDurationField();
        org.joda.time.DurationField durationField39 = property37.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime40 = property37.roundFloor();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.era();
        int int42 = property16.getDifference((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime40.secondOfDay();
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutableDateTime40.add(readableDuration44);
        int int46 = mutableDateTime40.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime40.getZone();
        boolean boolean48 = property6.equals((java.lang.Object) mutableDateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        long long8 = mutableDateTime7.getMillis();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime7.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        int int12 = mutableDateTime11.getHourOfDay();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        mutableDateTime15.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime15.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundFloor();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology29);
        boolean boolean31 = property21.equals((java.lang.Object) chronology29);
        org.joda.time.DateTime dateTime32 = mutableDateTime11.toDateTime(chronology29);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfFloor();
        long long39 = mutableDateTime38.getMillis();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime38.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime38.getZone();
        org.joda.time.DateTime dateTime42 = dateTime32.toDateTime(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime11", (mutableDateTime1.compareTo(mutableDateTime11) == 0) == mutableDateTime1.equals(mutableDateTime11));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        boolean boolean6 = mutableDateTime2.isEqualNow();
        int int7 = mutableDateTime2.getMinuteOfHour();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        int int21 = mutableDateTime16.getWeekOfWeekyear();
        mutableDateTime16.setMillisOfSecond((int) (short) 100);
        mutableDateTime16.setDate((long) 12);
        mutableDateTime16.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime16.toMutableDateTime();
        int int29 = mutableDateTime16.getEra();
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime16);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundCeiling();
        java.util.Locale locale37 = null;
        java.lang.String str38 = property35.getAsText(locale37);
        org.joda.time.MutableDateTime mutableDateTime40 = property35.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime42 = property35.set((int) (byte) 1);
        int int43 = property35.getMinimumValueOverall();
        int int44 = property35.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property35.getFieldType();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime16.property(dateTimeFieldType45);
        int int47 = mutableDateTime2.get(dateTimeFieldType45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant34", (mutableDateTime10.compareTo(instant34) == 0) == mutableDateTime10.equals(instant34));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setTime(3, (int) (short) 10, 10, (int) (short) 0);
        mutableDateTime2.addSeconds((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime2.getZone();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.minuteOfHour();
        java.util.Date date20 = mutableDateTime18.toDate();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.secondOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.yearOfEra();
        int int30 = mutableDateTime23.getDayOfWeek();
        mutableDateTime23.addMonths(336);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundCeiling();
        java.util.Locale locale39 = null;
        java.lang.String str40 = property37.getAsText(locale39);
        org.joda.time.MutableDateTime mutableDateTime42 = property37.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime44 = property37.set((int) (byte) 1);
        int int45 = property37.getMinimumValueOverall();
        int int46 = property37.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property37.getFieldType();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime23.property(dateTimeFieldType47);
        boolean boolean49 = mutableDateTime18.isSupported(dateTimeFieldType47);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime18.toMutableDateTime();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and mutableDateTime50", (instant36.compareTo(mutableDateTime50) == 0) == instant36.equals(mutableDateTime50));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        mutableDateTime11.addYears(59);
        int int14 = mutableDateTime11.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        int int17 = mutableDateTime11.getDayOfWeek();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        mutableDateTime20.addWeeks(10);
        mutableDateTime20.addDays(20);
        int int29 = mutableDateTime20.getDayOfYear();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime20.toMutableDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone33);
        mutableDateTime11.setZone(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime32", (instant3.compareTo(mutableDateTime32) == 0) == instant3.equals(mutableDateTime32));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.era();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime3.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.addWrapField(53);
        mutableDateTime12.setWeekyear(18);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        long long22 = mutableDateTime21.getMillis();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime21.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 100, dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime12.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj0, dateTimeZone24);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        boolean boolean36 = mutableDateTime30.isEqual((long) 22);
        org.joda.time.DateTime dateTime37 = mutableDateTime30.toDateTimeISO();
        boolean boolean38 = mutableDateTime27.equals((java.lang.Object) dateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and mutableDateTime30", (instant19.compareTo(mutableDateTime30) == 0) == instant19.equals(mutableDateTime30));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfCentury();
        int int3 = property2.getLeapAmount();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        int int8 = mutableDateTime6.getSecondOfMinute();
        mutableDateTime6.setMillis((long) 3);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        java.util.Date date18 = mutableDateTime13.toDate();
        boolean boolean19 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime20, dateTimeZone24);
        mutableDateTime13.setZone(dateTimeZone24);
        int int27 = property2.getDifference((org.joda.time.ReadableInstant) mutableDateTime13);
        int int28 = mutableDateTime13.getDayOfMonth();
        mutableDateTime13.addSeconds(21);
        int int31 = mutableDateTime13.getEra();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime13.yearOfCentury();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        int int40 = mutableDateTime35.getWeekOfWeekyear();
        mutableDateTime35.setMillisOfSecond((int) (short) 100);
        mutableDateTime35.setDate((long) 12);
        mutableDateTime35.setMinuteOfDay(4);
        java.lang.Object obj47 = mutableDateTime35.clone();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        int int52 = mutableDateTime50.getSecondOfMinute();
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.Instant instant56 = mutableDateTime55.toInstant();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime55.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime58 = property57.roundCeiling();
        java.util.Locale locale59 = null;
        java.lang.String str60 = property57.getAsText(locale59);
        org.joda.time.MutableDateTime mutableDateTime62 = property57.addWrapField(48);
        boolean boolean63 = mutableDateTime50.isAfter((org.joda.time.ReadableInstant) mutableDateTime62);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime50.minuteOfHour();
        int int65 = mutableDateTime35.compareTo((org.joda.time.ReadableInstant) mutableDateTime50);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology67);
        mutableDateTime68.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime68.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property72.getFieldType();
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime50.property(dateTimeFieldType73);
        int int75 = mutableDateTime13.get(dateTimeFieldType73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant56", (mutableDateTime0.compareTo(instant56) == 0) == mutableDateTime0.equals(instant56));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        org.joda.time.MutableDateTime mutableDateTime11 = property4.roundCeiling();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime9.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        mutableDateTime19.setSecondOfDay(2);
        boolean boolean26 = mutableDateTime6.isEqual((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        mutableDateTime29.setSecondOfDay((int) '#');
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime29.add(readablePeriod33);
        boolean boolean35 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        long long36 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant30", (mutableDateTime6.compareTo(instant30) == 0) == mutableDateTime6.equals(instant30));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime4.setZone(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        boolean boolean14 = mutableDateTime10.isBefore((long) 777);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.era();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        int int17 = mutableDateTime16.getWeekyear();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime16.add(readableDuration18);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundFloor();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundCeiling();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        int int39 = property33.getDifference((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime37.era();
        boolean boolean41 = mutableDateTime28.equals((java.lang.Object) mutableDateTime37);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.dayOfWeek();
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) mutableDateTime37);
        int int44 = property15.compareTo((org.joda.time.ReadableInstant) mutableDateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant32", (mutableDateTime2.compareTo(instant32) == 0) == mutableDateTime2.equals(instant32));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, dateTimeZone20);
        mutableDateTime9.setZone(dateTimeZone20);
        java.lang.Object obj23 = null;
        boolean boolean24 = mutableDateTime9.equals(obj23);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getDayOfMonth();
        java.util.Date date31 = mutableDateTime27.toDate();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        boolean boolean39 = mutableDateTime37.isSupported(dateTimeFieldType38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime37.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime37.copy();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime41.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime41.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime41.toMutableDateTime();
        mutableDateTime27.setTime((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:16.294Z");
        int int48 = mutableDateTime47.getYearOfCentury();
        int int49 = mutableDateTime47.getYear();
        int int50 = mutableDateTime47.getSecondOfDay();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:06.746Z");
        mutableDateTime47.setDate((org.joda.time.ReadableInstant) mutableDateTime52);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        mutableDateTime57.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar62 = mutableDateTime57.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime57.millisOfSecond();
        mutableDateTime54.setDate((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology66);
        mutableDateTime67.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime67.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime70.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property71.getFieldType();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime54.property(dateTimeFieldType72);
        java.lang.Object obj74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(obj74, chronology75);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime76.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property77.getFieldType();
        int int79 = mutableDateTime54.get(dateTimeFieldType78);
        boolean boolean80 = mutableDateTime52.isSupported(dateTimeFieldType78);
        int int81 = mutableDateTime44.get(dateTimeFieldType78);
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime9.property(dateTimeFieldType78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and instant35", (mutableDateTime16.compareTo(instant35) == 0) == mutableDateTime16.equals(instant35));
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
        org.joda.time.MutableDateTime mutableDateTime9 = property4.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime11 = property4.set((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime12 = property4.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime14 = property4.add(1);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        mutableDateTime18.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime18.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.millisOfSecond();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime18.yearOfCentury();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(chronology32);
        mutableDateTime18.setChronology(chronology32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) '#', chronology32);
        mutableDateTime35.setMillisOfDay(19);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime35.hourOfDay();
        boolean boolean39 = property4.equals((java.lang.Object) mutableDateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
        int int3 = mutableDateTime1.getYearOfEra();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        mutableDateTime7.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime7.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology21);
        boolean boolean23 = property13.equals((java.lang.Object) chronology21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj4, chronology21);
        org.joda.time.DateTime dateTime25 = mutableDateTime1.toDateTime(chronology21);
        boolean boolean26 = dateTime25.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.toMutableDateTime();
        org.joda.time.Chronology chronology12 = mutableDateTime11.getChronology();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        java.util.Date date20 = mutableDateTime15.toDate();
        mutableDateTime15.setSecondOfDay(105);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        int int27 = mutableDateTime25.getSecondOfMinute();
        mutableDateTime25.setMillis((long) 3);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        java.util.Date date37 = mutableDateTime32.toDate();
        boolean boolean38 = mutableDateTime25.isAfter((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime39, dateTimeZone43);
        mutableDateTime32.setZone(dateTimeZone43);
        java.lang.Object obj46 = null;
        boolean boolean47 = mutableDateTime32.equals(obj46);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime32, dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime15.toMutableDateTime(dateTimeZone51);
        mutableDateTime11.setZoneRetainFields(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime32", (instant3.compareTo(mutableDateTime32) == 0) == instant3.equals(mutableDateTime32));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.DurationField durationField7 = property6.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:16.294Z");
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.hourOfDay();
        int int17 = mutableDateTime12.getDayOfYear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        int int23 = mutableDateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        int int24 = mutableDateTime22.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime22.toMutableDateTime();
        mutableDateTime9.setDate((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.762Z");
        mutableDateTime25.setTime((org.joda.time.ReadableInstant) mutableDateTime28);
        long long30 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime28);
        java.util.Locale locale31 = null;
        int int32 = property6.getMaximumShortTextLength(locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and mutableDateTime28", (mutableDateTime25.compareTo(mutableDateTime28) == 0) == mutableDateTime25.equals(mutableDateTime28));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = mutableDateTime6.isSupported(dateTimeFieldType7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime6.copy();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundFloor();
        mutableDateTime12.addYears(59);
        int int15 = mutableDateTime12.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        mutableDateTime21.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime21.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.millisOfSecond();
        mutableDateTime18.setDate((org.joda.time.ReadableInstant) mutableDateTime21);
        int int29 = mutableDateTime18.getMinuteOfDay();
        int int30 = mutableDateTime18.getWeekyear();
        mutableDateTime18.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime33, dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        mutableDateTime18.setZoneRetainFields(dateTimeZone37);
        mutableDateTime17.setZoneRetainFields(dateTimeZone37);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.Instant instant45 = mutableDateTime44.toInstant();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = mutableDateTime47.isSupported(dateTimeFieldType48);
        int int50 = mutableDateTime47.getRoundingMode();
        boolean boolean52 = mutableDateTime47.isAfter((long) 6324);
        mutableDateTime47.addMillis(50);
        org.joda.time.DateTime dateTime55 = mutableDateTime47.toDateTimeISO();
        boolean boolean56 = mutableDateTime17.isBefore((org.joda.time.ReadableInstant) dateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant45", (mutableDateTime33.compareTo(instant45) == 0) == mutableDateTime33.equals(instant45));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        int int9 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime2.copy();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = mutableDateTime16.isSupported(dateTimeFieldType17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime16.copy();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundFloor();
        org.joda.time.DateTimeField dateTimeField23 = property21.getField();
        int int24 = mutableDateTime2.get(dateTimeField23);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar32 = mutableDateTime27.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime27.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime36 = property33.addWrapField(0);
        mutableDateTime36.setMillisOfSecond(253);
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
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime57.getZone();
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime60 = org.joda.time.MutableDateTime.now(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime48.toMutableDateTime(dateTimeZone58);
        org.joda.time.DateTime dateTime62 = mutableDateTime36.toDateTime(dateTimeZone58);
        boolean boolean63 = mutableDateTime2.equals((java.lang.Object) dateTimeZone58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime48", (instant14.compareTo(mutableDateTime48) == 0) == instant14.equals(mutableDateTime48));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        mutableDateTime2.setSecondOfMinute(24);
        mutableDateTime2.setDate((long) 4);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        mutableDateTime13.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.millisOfSecond();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime13.yearOfCentury();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology27);
        mutableDateTime13.setChronology(chronology27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology27);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime2.minuteOfDay();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        int int43 = mutableDateTime40.getYearOfCentury();
        org.joda.time.Chronology chronology44 = mutableDateTime40.getChronology();
        int int45 = mutableDateTime40.getWeekOfWeekyear();
        mutableDateTime40.setMillisOfSecond((int) (short) 100);
        mutableDateTime40.setDate((long) 12);
        mutableDateTime40.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime40.toMutableDateTime();
        int int53 = mutableDateTime40.getEra();
        mutableDateTime37.setTime((org.joda.time.ReadableInstant) mutableDateTime40);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.Instant instant58 = mutableDateTime57.toInstant();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime57.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime60 = property59.roundCeiling();
        java.util.Locale locale61 = null;
        java.lang.String str62 = property59.getAsText(locale61);
        org.joda.time.MutableDateTime mutableDateTime64 = property59.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime66 = property59.set((int) (byte) 1);
        int int67 = property59.getMinimumValueOverall();
        int int68 = property59.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property59.getFieldType();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime40.property(dateTimeFieldType69);
        mutableDateTime2.set(dateTimeFieldType69, 6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant58", (mutableDateTime23.compareTo(instant58) == 0) == mutableDateTime23.equals(instant58));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsText(locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = property9.addWrapField(48);
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:30.614Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        mutableDateTime4.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime4.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        boolean boolean20 = property10.equals((java.lang.Object) chronology18);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime1.toMutableDateTime(chronology18);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = mutableDateTime28.isSupported(dateTimeFieldType29);
        int int31 = mutableDateTime28.getRoundingMode();
        boolean boolean33 = mutableDateTime28.isAfter((long) 6324);
        mutableDateTime28.addMillis(50);
        int int36 = mutableDateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant26", (mutableDateTime14.compareTo(instant26) == 0) == mutableDateTime14.equals(instant26));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        int int7 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = mutableDateTime13.isSupported(dateTimeFieldType14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime13.copy();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundFloor();
        mutableDateTime19.addYears(59);
        int int22 = mutableDateTime19.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone23);
        int int26 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime29.hourOfDay();
        int int34 = mutableDateTime29.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime29.add(readablePeriod35, 100);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        java.util.Date date45 = mutableDateTime40.toDate();
        int int46 = mutableDateTime40.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime40.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundHalfCeiling();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        int int53 = mutableDateTime51.getSecondOfMinute();
        mutableDateTime51.setMillis((long) 3);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        mutableDateTime58.add(readablePeriod61);
        java.util.Date date63 = mutableDateTime58.toDate();
        boolean boolean64 = mutableDateTime51.isAfter((org.joda.time.ReadableInstant) mutableDateTime58);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime();
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime68.getZone();
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime65, dateTimeZone69);
        mutableDateTime58.setZone(dateTimeZone69);
        mutableDateTime48.setZoneRetainFields(dateTimeZone69);
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(obj73, chronology74);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = null;
        java.lang.String str77 = mutableDateTime75.toString(dateTimeFormatter76);
        mutableDateTime75.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar80 = mutableDateTime75.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime75.millisOfSecond();
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime75.yearOfCentury();
        java.lang.Object obj83 = null;
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime(obj83, chronology84);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = null;
        java.lang.String str87 = mutableDateTime85.toString(dateTimeFormatter86);
        int int88 = mutableDateTime85.getYearOfCentury();
        org.joda.time.Chronology chronology89 = mutableDateTime85.getChronology();
        org.joda.time.MutableDateTime mutableDateTime90 = org.joda.time.MutableDateTime.now(chronology89);
        mutableDateTime75.setChronology(chronology89);
        mutableDateTime48.setChronology(chronology89);
        boolean boolean93 = mutableDateTime29.isBefore((org.joda.time.ReadableInstant) mutableDateTime48);
        mutableDateTime48.setMinuteOfHour(48);
        boolean boolean96 = mutableDateTime25.isAfter((org.joda.time.ReadableInstant) mutableDateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime24", (instant11.compareTo(mutableDateTime24) == 0) == instant11.equals(mutableDateTime24));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        mutableDateTime5.addMinutes((int) (byte) 10);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        mutableDateTime13.setZone(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj8, dateTimeZone17);
        mutableDateTime20.setWeekyear(292278993);
        boolean boolean23 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
        int int3 = mutableDateTime1.getYearOfEra();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        mutableDateTime7.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime7.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology21);
        boolean boolean23 = property13.equals((java.lang.Object) chronology21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj4, chronology21);
        org.joda.time.DateTime dateTime25 = mutableDateTime1.toDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        boolean boolean4 = instant3.isBeforeNow();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.Chronology chronology11 = mutableDateTime7.getChronology();
        boolean boolean13 = mutableDateTime7.isEqual((long) 22);
        boolean boolean14 = instant3.isBefore((org.joda.time.ReadableInstant) mutableDateTime7);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        int int20 = mutableDateTime18.getSecondOfMinute();
        mutableDateTime18.setMillis((long) 3);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        java.util.Date date30 = mutableDateTime25.toDate();
        boolean boolean31 = mutableDateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime25.toMutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone35);
        mutableDateTime39.addMonths(5);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        mutableDateTime39.setZoneRetainFields(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) (-304), dateTimeZone45);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        int int53 = mutableDateTime50.getYearOfCentury();
        org.joda.time.Chronology chronology54 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(chronology54);
        org.joda.time.DateTime dateTime59 = mutableDateTime47.toDateTime(chronology54);
        org.joda.time.MutableDateTime mutableDateTime60 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.MutableDateTime mutableDateTime61 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.DateTime dateTime62 = instant3.toDateTime(chronology54);
        int int63 = dateTime62.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.MutableDateTime mutableDateTime9 = property4.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime11 = property4.set((int) (byte) 1);
        mutableDateTime11.addMillis(53);
        mutableDateTime11.addMonths(30);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime11.toMutableDateTimeISO();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        int int21 = mutableDateTime19.getSecondOfMinute();
        mutableDateTime19.setMillis((long) 3);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        java.util.Date date31 = mutableDateTime26.toDate();
        boolean boolean32 = mutableDateTime19.isAfter((org.joda.time.ReadableInstant) mutableDateTime26);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime26.toMutableDateTime(dateTimeZone36);
        int int40 = mutableDateTime39.getMillisOfDay();
        mutableDateTime39.setMinuteOfDay(52);
        boolean boolean43 = mutableDateTime11.isEqual((org.joda.time.ReadableInstant) mutableDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime26", (instant3.compareTo(mutableDateTime26) == 0) == instant3.equals(mutableDateTime26));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.util.Date date8 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        int int23 = mutableDateTime18.getWeekOfWeekyear();
        mutableDateTime18.setMillisOfSecond((int) (short) 100);
        mutableDateTime18.setDate((long) 12);
        mutableDateTime18.setMinuteOfDay(4);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime18.toMutableDateTime();
        int int31 = mutableDateTime18.getEra();
        mutableDateTime15.setTime((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.Instant instant33 = mutableDateTime15.toInstant();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) instant33);
        boolean boolean36 = mutableDateTime2.isBefore(186L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant33", (mutableDateTime15.compareTo(instant33) == 0) == mutableDateTime15.equals(instant33));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundFloor();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.era();
        boolean boolean21 = mutableDateTime8.equals((java.lang.Object) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime8.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime17", (instant12.compareTo(mutableDateTime17) == 0) == instant12.equals(mutableDateTime17));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        mutableDateTime2.addWeeks(105);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.secondOfDay();
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.Chronology chronology18 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTime(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime8.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.centuryOfEra();
        java.lang.String str13 = property12.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.toMutableDateTime();
        mutableDateTime9.addMonths(50);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.weekyear();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = mutableDateTime17.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.weekyear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.getMutableDateTime();
        java.util.Locale locale27 = null;
        java.lang.String str28 = property25.getAsText(locale27);
        org.joda.time.DateTimeField dateTimeField29 = property25.getField();
        int int30 = mutableDateTime17.get(dateTimeField29);
        mutableDateTime9.setRounding(dateTimeField29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfCentury();
        java.util.Date date3 = mutableDateTime0.toDate();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundCeiling();
        boolean boolean10 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.yearOfCentury();
        mutableDateTime11.addDays(22);
        boolean boolean17 = mutableDateTime11.isEqual(1606780800000L);
        mutableDateTime11.setMillis((long) '#');
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        int int24 = mutableDateTime22.getSecondOfMinute();
        mutableDateTime22.setMillis((long) 3);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        java.util.Date date34 = mutableDateTime29.toDate();
        boolean boolean35 = mutableDateTime22.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime29.toMutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime11.toMutableDateTime(dateTimeZone39);
        mutableDateTime0.setZoneRetainFields(dateTimeZone39);
        mutableDateTime0.addDays(2074);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime29", (instant7.compareTo(mutableDateTime29) == 0) == instant7.equals(mutableDateTime29));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfDay();
        java.util.Date date8 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.year();
        mutableDateTime2.addWeekyears(6452);
        int int12 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.era();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.secondOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.yearOfEra();
        int int31 = mutableDateTime24.getDayOfWeek();
        mutableDateTime24.addMonths(336);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundCeiling();
        java.util.Locale locale40 = null;
        java.lang.String str41 = property38.getAsText(locale40);
        org.joda.time.MutableDateTime mutableDateTime43 = property38.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime45 = property38.set((int) (byte) 1);
        int int46 = property38.getMinimumValueOverall();
        int int47 = property38.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property38.getFieldType();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime24.property(dateTimeFieldType48);
        int int50 = mutableDateTime15.get(dateTimeFieldType48);
        boolean boolean51 = mutableDateTime2.isSupported(dateTimeFieldType48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant37", (mutableDateTime15.compareTo(instant37) == 0) == mutableDateTime15.equals(instant37));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        boolean boolean13 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        java.util.Locale locale14 = null;
        java.util.Calendar calendar15 = mutableDateTime12.toCalendar(locale14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime12.add(readableDuration16, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime12.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfCeiling();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        boolean boolean29 = mutableDateTime23.isEqual((long) 22);
        mutableDateTime23.setMillis(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = mutableDateTime23.isSupported(dateTimeFieldType32);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar35 = mutableDateTime34.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.yearOfCentury();
        int int37 = property36.getLeapAmount();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        int int42 = mutableDateTime40.getSecondOfMinute();
        mutableDateTime40.setMillis((long) 3);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        java.util.Date date52 = mutableDateTime47.toDate();
        boolean boolean53 = mutableDateTime40.isAfter((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime57.getZone();
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime54, dateTimeZone58);
        mutableDateTime47.setZone(dateTimeZone58);
        int int61 = property36.getDifference((org.joda.time.ReadableInstant) mutableDateTime47);
        int int62 = mutableDateTime47.getDayOfMonth();
        int int63 = mutableDateTime47.getDayOfYear();
        int int64 = mutableDateTime23.compareTo((org.joda.time.ReadableInstant) mutableDateTime47);
        mutableDateTime47.setMinuteOfDay(1428);
        mutableDateTime20.setDate((org.joda.time.ReadableInstant) mutableDateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime34", (instant3.compareTo(mutableDateTime34) == 0) == instant3.equals(mutableDateTime34));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.addWeekyears((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime2.add(readablePeriod10, (int) (short) 0);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        mutableDateTime15.setTime((long) '#');
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTimeISO();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        mutableDateTime15.setRounding(dateTimeField29, (int) (short) 0);
        int int32 = mutableDateTime2.get(dateTimeField29);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundCeiling();
        java.util.Locale locale39 = null;
        java.lang.String str40 = property37.getAsText(locale39);
        org.joda.time.MutableDateTime mutableDateTime42 = property37.addWrapField(48);
        org.joda.time.MutableDateTime mutableDateTime44 = property37.set((int) (byte) 1);
        mutableDateTime44.addMillis(53);
        mutableDateTime44.addMonths(30);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime44.toMutableDateTimeISO();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant36", (mutableDateTime23.compareTo(instant36) == 0) == mutableDateTime23.equals(instant36));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, dateTimeZone20);
        mutableDateTime9.setZone(dateTimeZone20);
        java.lang.Object obj23 = null;
        boolean boolean24 = mutableDateTime9.equals(obj23);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        int int37 = mutableDateTime35.getYearOfEra();
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        mutableDateTime41.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar46 = mutableDateTime41.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime41.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundFloor();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        int int54 = mutableDateTime51.getYearOfCentury();
        org.joda.time.Chronology chronology55 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(chronology55);
        boolean boolean57 = property47.equals((java.lang.Object) chronology55);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj38, chronology55);
        org.joda.time.DateTime dateTime59 = mutableDateTime35.toDateTime(chronology55);
        boolean boolean60 = mutableDateTime32.equals((java.lang.Object) mutableDateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and dateTime59", (instant36.compareTo(dateTime59) == 0) == instant36.equals(dateTime59));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        mutableDateTime2.setMonthOfYear((int) (short) 1);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.dayOfMonth();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        mutableDateTime8.setTime((long) '#');
        org.joda.time.DateTime dateTime13 = mutableDateTime8.toDateTimeISO();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        mutableDateTime8.setRounding(dateTimeField22, (int) (short) 0);
        int int25 = mutableDateTime8.getSecondOfMinute();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        int int31 = mutableDateTime8.get(dateTimeField30);
        int int32 = property5.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime8.addSeconds(42);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.hourOfDay();
        mutableDateTime37.setSecondOfMinute(24);
        mutableDateTime37.setDate((long) 4);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime37.year();
        org.joda.time.MutableDateTime mutableDateTime48 = property46.add((long) 2020);
        java.lang.Object obj49 = null;
        boolean boolean50 = mutableDateTime48.equals(obj49);
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.Instant instant54 = mutableDateTime53.toInstant();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime53.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime56 = property55.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        boolean boolean58 = mutableDateTime56.isSupported(dateTimeFieldType57);
        int int59 = mutableDateTime56.getRoundingMode();
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.Instant instant64 = mutableDateTime63.toInstant();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime63.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime66 = property65.roundHalfFloor();
        long long67 = mutableDateTime66.getMillis();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime66.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime66.getZone();
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 14, dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime56.toMutableDateTime(dateTimeZone69);
        mutableDateTime48.setZone(dateTimeZone69);
        mutableDateTime8.setZone(dateTimeZone69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and instant54", (mutableDateTime16.compareTo(instant54) == 0) == mutableDateTime16.equals(instant54));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        int int7 = mutableDateTime2.getDayOfYear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        int int13 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = mutableDateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime19.copy();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundFloor();
        mutableDateTime25.addYears(59);
        int int28 = mutableDateTime25.getHourOfDay();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.DateTime dateTime30 = mutableDateTime12.toDateTime(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant17", (mutableDateTime2.compareTo(instant17) == 0) == mutableDateTime2.equals(instant17));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        long long7 = mutableDateTime6.getMillis();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime6.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 14, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTime();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime14.setTime((long) '#');
        java.util.GregorianCalendar gregorianCalendar19 = mutableDateTime14.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField(0);
        mutableDateTime23.setMillisOfSecond(253);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        int int30 = mutableDateTime28.getSecondOfMinute();
        mutableDateTime28.setMillis((long) 3);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        java.util.Date date40 = mutableDateTime35.toDate();
        boolean boolean41 = mutableDateTime28.isAfter((org.joda.time.ReadableInstant) mutableDateTime35);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime35.toMutableDateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime49 = mutableDateTime23.toDateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime50 = mutableDateTime10.toDateTime(dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime35", (instant4.compareTo(mutableDateTime35) == 0) == instant4.equals(mutableDateTime35));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        mutableDateTime2.setRounding(dateTimeField16, (int) (short) 0);
        int int19 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.weekyear();
        org.joda.time.DurationField durationField21 = property20.getDurationField();
        org.joda.time.DurationField durationField22 = property20.getDurationField();
        org.joda.time.DateTimeField dateTimeField23 = property20.getField();
        org.joda.time.MutableDateTime mutableDateTime25 = property20.add(0L);
        org.joda.time.MutableDateTime mutableDateTime26 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime27 = property20.getMutableDateTime();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        boolean boolean36 = mutableDateTime34.isSupported(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime34.copy();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundFloor();
        mutableDateTime40.addYears(59);
        int int43 = mutableDateTime40.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone44);
        mutableDateTime27.setZoneRetainFields(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant32", (mutableDateTime10.compareTo(instant32) == 0) == mutableDateTime10.equals(instant32));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        mutableDateTime11.addYears(59);
        int int14 = mutableDateTime11.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        int int19 = property18.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfCentury();
        java.util.Date date3 = mutableDateTime0.toDate();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundCeiling();
        boolean boolean10 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime9);
        int int11 = mutableDateTime9.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant7", (mutableDateTime0.compareTo(instant7) == 0) == mutableDateTime0.equals(instant7));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        mutableDateTime2.setSecondOfMinute(24);
        mutableDateTime2.setDate((long) 4);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) 2020);
        java.lang.Object obj14 = null;
        boolean boolean15 = mutableDateTime13.equals(obj14);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = mutableDateTime21.isSupported(dateTimeFieldType22);
        int int24 = mutableDateTime21.getRoundingMode();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        long long32 = mutableDateTime31.getMillis();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime31.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 14, dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime21.toMutableDateTime(dateTimeZone34);
        mutableDateTime13.setZone(dateTimeZone34);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        mutableDateTime40.setTime((long) '#');
        org.joda.time.DateTime dateTime45 = mutableDateTime40.toDateTimeISO();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableDateTime48.add(readablePeriod51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.hourOfDay();
        org.joda.time.DateTimeField dateTimeField54 = property53.getField();
        mutableDateTime40.setRounding(dateTimeField54, (int) (short) 0);
        mutableDateTime40.addWeeks((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime40.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime61 = property59.add(58);
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and mutableDateTime48", (instant19.compareTo(mutableDateTime48) == 0) == instant19.equals(mutableDateTime48));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.Chronology chronology7 = mutableDateTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 22, chronology7);
        org.joda.time.DateTimeField dateTimeField11 = mutableDateTime10.getRoundingField();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        long long19 = mutableDateTime18.getMillis();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime18.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 100, dateTimeZone21);
        mutableDateTime10.setZoneRetainFields(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant16", (mutableDateTime3.compareTo(instant16) == 0) == mutableDateTime3.equals(instant16));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        int int8 = mutableDateTime5.getRoundingMode();
        boolean boolean10 = mutableDateTime5.isAfter((long) 6324);
        mutableDateTime5.addMillis(50);
        org.joda.time.DateTime dateTime13 = mutableDateTime5.toDateTimeISO();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        mutableDateTime16.setTime((long) '#');
        org.joda.time.DateTime dateTime21 = mutableDateTime16.toDateTimeISO();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        mutableDateTime16.setRounding(dateTimeField30, (int) (short) 0);
        int int33 = mutableDateTime16.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.weekyear();
        org.joda.time.DurationField durationField35 = property34.getDurationField();
        org.joda.time.DurationField durationField36 = property34.getDurationField();
        int int37 = property34.get();
        org.joda.time.DateTimeField dateTimeField38 = property34.getField();
        int int39 = dateTime13.get(dateTimeField38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = mutableDateTime11.isSupported(dateTimeFieldType12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.copy();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundFloor();
        mutableDateTime17.addYears(59);
        int int20 = mutableDateTime17.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime2.toMutableDateTime(dateTimeZone21);
        mutableDateTime2.addSeconds(469);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime23", (instant9.compareTo(mutableDateTime23) == 0) == instant9.equals(mutableDateTime23));
    }
}

