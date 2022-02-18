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
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime9.plusYears((int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant10", (dateTime9.compareTo(instant10) == 0) == dateTime9.equals(instant10));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = dateTime13.minusMinutes((int) (short) 0);
        org.joda.time.DateTime.Property property26 = dateTime25.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime23", (dateTime25.compareTo(mutableDateTime23) == 0) == dateTime25.equals(mutableDateTime23));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        long long11 = dateTime9.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant10", (dateTime9.compareTo(instant10) == 0) == dateTime9.equals(instant10));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 6);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) 10);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean16 = dateTimeZone15.isFixed();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.DateTime dateTime19 = dateTime18.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str21 = dateTimeFieldType20.getName();
        org.joda.time.DateTime.Property property22 = dateTime19.property(dateTimeFieldType20);
        org.joda.time.DateTime dateTime23 = property22.roundFloorCopy();
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone27);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTime dateTime32 = localDate29.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime23.toMutableDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime23.minusMinutes((int) (short) 0);
        boolean boolean36 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and dateTime23", (mutableDateTime33.compareTo(dateTime23) == 0) == mutableDateTime33.equals(dateTime23));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime9.minusMonths(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant10", (dateTime12.compareTo(instant10) == 0) == dateTime12.equals(instant10));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate.Property property23 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property23.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField26 = property23.getField();
        long long29 = dateTimeField26.addWrapField((long) 2, (int) (byte) 10);
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = dateTimeField26.getAsShortText(readablePartial30, 0, locale33);
        java.lang.String str35 = locale33.getLanguage();
        java.lang.String str36 = dateTimeZone14.getName((long) (short) -1, locale33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, readableDuration15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfCentury();
        org.joda.time.LocalDate localDate19 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone22);
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale26.getVariant();
        java.util.Calendar calendar28 = dateTime25.toCalendar(locale26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTime dateTime36 = localDate33.toDateTimeAtCurrentTime(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withMillis((long) 32772);
        org.joda.time.DateTime dateTime40 = dateTime38.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime42 = dateTime40.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Interval interval48 = interval46.withChronology(chronology47);
        org.joda.time.Duration duration49 = interval46.toDuration();
        org.joda.time.DateTime dateTime50 = dateTime42.plus((org.joda.time.ReadableDuration) duration49);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration49);
        org.joda.time.DateTime dateTime52 = dateTime11.minus((org.joda.time.ReadableDuration) duration49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime40", (instant13.compareTo(dateTime40) == 0) == instant13.equals(dateTime40));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        int int15 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = dateTime11.withDurationAdded(536457600013L, 42);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((long) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant13", (dateTime11.compareTo(instant13) == 0) == dateTime11.equals(instant13));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime11.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime18 = dateTime11.withDate(11, (int) (byte) 1, 19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime11", (instant13.compareTo(dateTime11) == 0) == instant13.equals(dateTime11));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfWeek();
        org.joda.time.LocalDate localDate13 = property11.addToCopy(10);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str17 = dateTimeZone15.getName(10L);
        java.util.Locale locale21 = new java.util.Locale("70", "hi!");
        java.lang.String str22 = dateTimeZone15.getName((long) '4', locale21);
        org.joda.time.Interval interval23 = localDate13.toInterval(dateTimeZone15);
        int int25 = dateTimeZone15.getOffset((-31449598147L));
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property27 = localDate26.yearOfCentury();
        org.joda.time.LocalDate localDate28 = property27.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = localDate28.toDateTimeAtStartOfDay(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime34.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str37 = dateTimeFieldType36.getName();
        org.joda.time.DateTime.Property property38 = dateTime35.property(dateTimeFieldType36);
        org.joda.time.DateTime dateTime39 = property38.roundFloorCopy();
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean44 = dateTimeZone43.isFixed();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone43);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.DateTime dateTime48 = localDate45.toDateTimeAtMidnight(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime39.toMutableDateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime51 = dateTime39.minusMinutes((int) (short) 0);
        int int52 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and mutableDateTime49", (dateTime51.compareTo(mutableDateTime49) == 0) == dateTime51.equals(mutableDateTime49));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime21 = property20.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime9.withWeekyear((int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant10", (dateTime9.compareTo(instant10) == 0) == dateTime9.equals(instant10));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.LocalDateTime localDateTime11 = dateTime9.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant10", (dateTime9.compareTo(instant10) == 0) == dateTime9.equals(instant10));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth yearMonth6 = yearMonth1.withYear((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.eras();
        boolean boolean8 = yearMonth1.equals((java.lang.Object) durationFieldType7);
        org.joda.time.YearMonth yearMonth10 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = yearMonth10.toInterval(dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.Interval interval14 = interval12.withPeriodAfterStart(readablePeriod13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = interval14.toPeriod(periodType15);
        java.lang.String str17 = period16.toString();
        org.joda.time.YearMonth yearMonth19 = yearMonth1.withPeriodAdded((org.joda.time.ReadablePeriod) period16, 100);
        org.joda.time.YearMonth yearMonth21 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Interval interval23 = yearMonth21.toInterval(dateTimeZone22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.Interval interval25 = interval23.withPeriodAfterStart(readablePeriod24);
        org.joda.time.Interval interval27 = interval23.withStartMillis((long) 32772);
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.weekyears();
        org.joda.time.YearMonth yearMonth30 = yearMonth1.withChronologyRetainFields(chronology28);
        int[] intArray31 = yearMonth30.getValues();
        org.joda.time.YearMonth yearMonth33 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Interval interval35 = yearMonth33.toInterval(dateTimeZone34);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray36 = yearMonth33.getFieldTypes();
        org.joda.time.YearMonth.Property property37 = yearMonth33.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = yearMonth33.toString(dateTimeFormatter38);
        org.joda.time.YearMonth yearMonth41 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.Interval interval43 = yearMonth41.toInterval(dateTimeZone42);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = yearMonth41.getFieldTypes();
        org.joda.time.YearMonth.Property property45 = yearMonth41.year();
        org.joda.time.YearMonth yearMonth47 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.Interval interval51 = yearMonth49.toInterval(dateTimeZone50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.Interval interval53 = interval51.withPeriodAfterStart(readablePeriod52);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = interval53.toPeriod(periodType54);
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean57 = period55.isSupported(durationFieldType56);
        org.joda.time.YearMonth yearMonth59 = yearMonth47.withPeriodAdded((org.joda.time.ReadablePeriod) period55, 32770);
        org.joda.time.YearMonth yearMonth60 = yearMonth41.minus((org.joda.time.ReadablePeriod) period55);
        boolean boolean61 = yearMonth33.isAfter((org.joda.time.ReadablePartial) yearMonth60);
        org.joda.time.Chronology chronology62 = yearMonth60.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.year();
        org.joda.time.DateTimeZone dateTimeZone64 = chronology62.getZone();
        org.joda.time.DateTimeField dateTimeField65 = chronology62.secondOfDay();
        org.joda.time.DurationField durationField66 = chronology62.weekyears();
        org.joda.time.YearMonth yearMonth67 = yearMonth30.withChronologyRetainFields(chronology62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField66", (durationField29.compareTo(durationField66) == 0) == durationField29.equals(durationField66));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.plusYears(1970);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime12.toDateTime(chronology15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfCentury();
        org.joda.time.LocalDate.Property property20 = localDate18.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property20.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str23 = property20.getAsString();
        org.joda.time.LocalDate localDate24 = property20.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.minutes();
        boolean boolean31 = localDate29.isSupported(durationFieldType30);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property33 = localDate32.yearOfCentury();
        org.joda.time.LocalDate localDate34 = property33.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean38 = dateTimeZone37.isFixed();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = localDate34.toDateTimeAtStartOfDay(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime40.toMutableDateTime();
        boolean boolean42 = dateTime40.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Interval interval48 = interval46.withChronology(chronology47);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property50 = localDate49.yearOfCentury();
        org.joda.time.LocalDate localDate51 = property50.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean55 = dateTimeZone54.isFixed();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone54);
        org.joda.time.DateTime dateTime57 = localDate51.toDateTimeAtStartOfDay(dateTimeZone54);
        org.joda.time.DateTime dateTime58 = dateTime57.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property59 = dateTime58.year();
        boolean boolean60 = interval48.contains((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Period period61 = interval48.toPeriod();
        org.joda.time.DateTime dateTime63 = dateTime40.withPeriodAdded((org.joda.time.ReadablePeriod) period61, 360240000);
        org.joda.time.LocalDate localDate64 = localDate29.plus((org.joda.time.ReadablePeriod) period61);
        org.joda.time.LocalDate localDate65 = localDate24.plus((org.joda.time.ReadablePeriod) period61);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean69 = dateTimeZone68.isFixed();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone68);
        java.util.TimeZone timeZone71 = null;
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forTimeZone(timeZone71);
        org.joda.time.DateTime dateTime73 = localDate70.toDateTimeAtCurrentTime(dateTimeZone72);
        org.joda.time.DateTime dateTime75 = dateTime73.withMillis((long) 32772);
        org.joda.time.DateTime dateTime77 = dateTime75.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime79 = dateTime75.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology80 = dateTime79.getChronology();
        org.joda.time.DateTimeField dateTimeField81 = chronology80.secondOfMinute();
        org.joda.time.LocalDate localDate82 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property83 = localDate82.yearOfCentury();
        org.joda.time.LocalDate localDate84 = property83.getLocalDate();
        org.joda.time.LocalDate localDate86 = localDate84.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate88 = localDate86.plusMonths(32772);
        org.joda.time.DateTime dateTime89 = localDate88.toDateTimeAtStartOfDay();
        int[] intArray91 = chronology80.get((org.joda.time.ReadablePartial) localDate88, (long) 15);
        chronology15.validate((org.joda.time.ReadablePartial) localDate65, intArray91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime17", (dateTime12.compareTo(dateTime17) == 0) == dateTime12.equals(dateTime17));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 292278994);
        org.joda.time.DateTime dateTime18 = dateTime16.minusSeconds(8);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone21);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTime dateTime26 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 32772);
        org.joda.time.DateTime dateTime30 = dateTime28.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property31 = dateTime30.year();
        org.joda.time.Instant instant32 = dateTime30.toInstant();
        int int33 = dateTime30.getWeekyear();
        org.joda.time.DateTime dateTime35 = dateTime30.plus((long) (short) 0);
        int int36 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant32", (dateTime16.compareTo(instant32) == 0) == dateTime16.equals(instant32));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        java.lang.String str11 = localDate10.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate10.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate.Property property23 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property23.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate26 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = localDate26.getFields();
        org.joda.time.DateTime dateTime28 = dateTime20.withFields((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfMinute();
        org.joda.time.DurationField durationField33 = chronology31.seconds();
        org.joda.time.DurationField durationField34 = chronology31.years();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.millisOfDay();
        org.joda.time.DateTime dateTime36 = dateTime20.toDateTime(chronology31);
        long long42 = chronology31.getDateTimeMillis((long) (short) 0, 11, (int) (short) 10, 10, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime36", (dateTime20.compareTo(dateTime36) == 0) == dateTime20.equals(dateTime36));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        int int12 = localDate2.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean14 = localDate2.isSupported(dateTimeFieldType13);
        org.joda.time.LocalDate localDate16 = localDate2.plusMonths(86397);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfCentury();
        org.joda.time.LocalDate localDate19 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = dateTime25.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property27 = dateTime26.year();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property29 = localDate28.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.DateTime dateTime36 = localDate30.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str39 = dateTimeFieldType38.getName();
        org.joda.time.DateTime.Property property40 = dateTime37.property(dateTimeFieldType38);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime43 = dateTime37.withHourOfDay(15);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(13);
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime43.toMutableDateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = localDate2.toDateTimeAtStartOfDay(dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and mutableDateTime46", (dateTime43.compareTo(mutableDateTime46) == 0) == dateTime43.equals(mutableDateTime46));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime11.plus((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime11.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime11", (instant13.compareTo(dateTime11) == 0) == instant13.equals(dateTime11));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight(dateTimeZone6);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateMidnight dateMidnight9 = dateTime7.toDateMidnight();
        org.joda.time.DateTime.Property property10 = dateTime7.weekOfWeekyear();
        int int11 = dateTime7.getCenturyOfEra();
        org.joda.time.Instant instant12 = dateTime7.toInstant();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean16 = dateTimeZone15.isFixed();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone15);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTime dateTime20 = localDate17.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean25 = dateTimeZone24.isFixed();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int29 = dateTimeZone27.getOffsetFromLocal((long) 6);
        long long31 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) 10);
        org.joda.time.DateTime dateTime32 = dateTime22.withZone(dateTimeZone27);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate35 = property34.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtStartOfDay(dateTimeZone38);
        boolean boolean42 = dateTime41.isBeforeNow();
        int int43 = dateTime41.getDayOfYear();
        boolean boolean44 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime.Property property45 = dateTime41.dayOfYear();
        int int46 = dateTime41.getSecondOfDay();
        boolean boolean47 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and instant12", (dateMidnight9.compareTo(instant12) == 0) == dateMidnight9.equals(instant12));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.plusYears(1970);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime12.toDateTime(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime17", (dateTime12.compareTo(dateTime17) == 0) == dateTime12.equals(dateTime17));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        int int15 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = dateTime11.withDurationAdded(536457600013L, 42);
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant13", (dateTime11.compareTo(instant13) == 0) == dateTime11.equals(instant13));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.plusYears(1970);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime12.toDateTime(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime17", (dateTime12.compareTo(dateTime17) == 0) == dateTime12.equals(dateTime17));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime11.plus((long) (short) 0);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMonths(2011);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant13", (dateTime16.compareTo(instant13) == 0) == dateTime16.equals(instant13));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 6);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) 10);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property12.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str15 = property12.getAsString();
        org.joda.time.LocalDate localDate16 = property12.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        boolean boolean23 = localDate21.isSupported(durationFieldType22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        boolean boolean34 = dateTime32.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Interval interval40 = interval38.withChronology(chronology39);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property42 = localDate41.yearOfCentury();
        org.joda.time.LocalDate localDate43 = property42.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean47 = dateTimeZone46.isFixed();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = localDate43.toDateTimeAtStartOfDay(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = dateTime49.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property51 = dateTime50.year();
        boolean boolean52 = interval40.contains((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Period period53 = interval40.toPeriod();
        org.joda.time.DateTime dateTime55 = dateTime32.withPeriodAdded((org.joda.time.ReadablePeriod) period53, 360240000);
        org.joda.time.LocalDate localDate56 = localDate21.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.LocalDate localDate57 = localDate16.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Chronology chronology58 = localDate16.getChronology();
        org.joda.time.DateTime dateTime59 = dateTime9.withChronology(chronology58);
        org.joda.time.Instant instant60 = dateTime59.toInstant();
        org.joda.time.Chronology chronology61 = dateTime59.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant60", (dateTime9.compareTo(instant60) == 0) == dateTime9.equals(instant60));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        boolean boolean23 = dateTime22.isBeforeNow();
        int int24 = dateTime22.getDayOfYear();
        boolean boolean25 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property27 = localDate26.yearOfCentury();
        org.joda.time.LocalDate localDate28 = property27.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = localDate28.toDateTimeAtStartOfDay(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime34.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str37 = dateTimeFieldType36.getName();
        org.joda.time.DateTime.Property property38 = dateTime35.property(dateTimeFieldType36);
        org.joda.time.DateTime dateTime39 = property38.roundFloorCopy();
        org.joda.time.DateTime dateTime40 = dateTime39.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime40.getZone();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property43 = localDate42.yearOfCentury();
        org.joda.time.LocalDate localDate44 = property43.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean48 = dateTimeZone47.isFixed();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = localDate44.toDateTimeAtStartOfDay(dateTimeZone47);
        org.joda.time.DateTime dateTime51 = dateTime50.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str53 = dateTimeFieldType52.getName();
        org.joda.time.DateTime.Property property54 = dateTime51.property(dateTimeFieldType52);
        org.joda.time.DateTime dateTime55 = property54.roundFloorCopy();
        org.joda.time.DateTime.Property property56 = dateTime55.year();
        org.joda.time.DateTime dateTime58 = property56.addToCopy(42);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property60 = localDate59.yearOfCentury();
        org.joda.time.LocalDate localDate61 = property60.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean65 = dateTimeZone64.isFixed();
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone64);
        org.joda.time.DateTime dateTime67 = localDate61.toDateTimeAtStartOfDay(dateTimeZone64);
        org.joda.time.DateTime dateTime68 = dateTime67.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str70 = dateTimeFieldType69.getName();
        org.joda.time.DateTime.Property property71 = dateTime68.property(dateTimeFieldType69);
        boolean boolean73 = dateTime68.equals((java.lang.Object) 'u');
        boolean boolean74 = dateTime58.isBefore((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property76 = dateTime58.property(dateTimeFieldType75);
        int int77 = dateTime40.get(dateTimeFieldType75);
        org.joda.time.DateTime.Property property78 = dateTime13.property(dateTimeFieldType75);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean82 = dateTimeZone81.isFixed();
        org.joda.time.LocalDate localDate83 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone81);
        java.util.TimeZone timeZone84 = null;
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forTimeZone(timeZone84);
        org.joda.time.DateTime dateTime86 = localDate83.toDateTimeAtCurrentTime(dateTimeZone85);
        org.joda.time.DateTime dateTime88 = dateTime86.withMillis((long) 32772);
        org.joda.time.DateTime dateTime90 = dateTime88.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property91 = dateTime90.year();
        org.joda.time.Instant instant92 = dateTime90.toInstant();
        org.joda.time.DateTime dateTime93 = dateTime90.withLaterOffsetAtOverlap();
        int int94 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime93 and instant92", (dateTime93.compareTo(instant92) == 0) == dateTime93.equals(instant92));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 6);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) 10);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property12.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str15 = property12.getAsString();
        org.joda.time.LocalDate localDate16 = property12.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        boolean boolean23 = localDate21.isSupported(durationFieldType22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        boolean boolean34 = dateTime32.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Interval interval40 = interval38.withChronology(chronology39);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property42 = localDate41.yearOfCentury();
        org.joda.time.LocalDate localDate43 = property42.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean47 = dateTimeZone46.isFixed();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = localDate43.toDateTimeAtStartOfDay(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = dateTime49.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property51 = dateTime50.year();
        boolean boolean52 = interval40.contains((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Period period53 = interval40.toPeriod();
        org.joda.time.DateTime dateTime55 = dateTime32.withPeriodAdded((org.joda.time.ReadablePeriod) period53, 360240000);
        org.joda.time.LocalDate localDate56 = localDate21.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.LocalDate localDate57 = localDate16.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Chronology chronology58 = localDate16.getChronology();
        org.joda.time.DateTime dateTime59 = dateTime9.withChronology(chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology58.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime59", (dateTime9.compareTo(dateTime59) == 0) == dateTime9.equals(dateTime59));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(10, 1970);
        java.util.Calendar.Builder builder7 = builder0.setDate((int) 'u', 22, 2011);
        java.util.Calendar.Builder builder8 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder10 = builder8.setInstant((long) 32770);
        java.util.Calendar calendar11 = builder10.build();
        java.util.Calendar.Builder builder15 = builder10.setWeekDate((int) (short) 0, 32772, (-292275054));
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.lang.String str17 = locale16.getCountry();
        java.lang.String str18 = locale16.getDisplayCountry();
        java.util.Calendar.Builder builder19 = builder10.setLocale(locale16);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = dateTime28.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str31 = dateTimeFieldType30.getName();
        org.joda.time.DateTime.Property property32 = dateTime29.property(dateTimeFieldType30);
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.DateTimeField dateTimeField34 = property32.getField();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property36 = localDate35.yearOfCentury();
        org.joda.time.LocalDate.Property property37 = localDate35.yearOfCentury();
        org.joda.time.LocalDate localDate39 = property37.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField40 = property37.getField();
        int int42 = dateTimeField40.get((long) 'u');
        java.util.Locale locale44 = java.util.Locale.TAIWAN;
        java.lang.String str45 = dateTimeField40.getAsText((long) 5, locale44);
        int int46 = property32.getMaximumTextLength(locale44);
        java.util.Calendar.Builder builder47 = builder10.setLocale(locale44);
        java.util.Calendar.Builder builder48 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder50 = builder48.setInstant((long) 32770);
        java.util.Calendar calendar51 = builder50.build();
        boolean boolean53 = calendar51.after((java.lang.Object) 70);
        calendar51.set(10, 32772, (int) (byte) 1, 22, 0);
        long long60 = calendar51.getTimeInMillis();
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property62 = localDate61.yearOfCentury();
        org.joda.time.LocalDate localDate63 = property62.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean67 = dateTimeZone66.isFixed();
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone66);
        org.joda.time.DateTime dateTime69 = localDate63.toDateTimeAtStartOfDay(dateTimeZone66);
        org.joda.time.DateTime dateTime70 = dateTime69.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str72 = dateTimeFieldType71.getName();
        org.joda.time.DateTime.Property property73 = dateTime70.property(dateTimeFieldType71);
        org.joda.time.DateTime dateTime74 = property73.roundFloorCopy();
        org.joda.time.DateTime.Property property75 = dateTime74.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone76 = dateTime74.getZone();
        java.util.TimeZone timeZone77 = dateTimeZone76.toTimeZone();
        calendar51.setTimeZone(timeZone77);
        java.util.Locale locale79 = java.util.Locale.FRENCH;
        java.lang.String str80 = locale79.toLanguageTag();
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(timeZone77, locale79);
        java.util.Calendar.Builder builder82 = builder47.setTimeZone(timeZone77);
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forTimeZone(timeZone77);
        java.util.Calendar calendar84 = java.util.Calendar.getInstance(timeZone77);
        java.util.Calendar.Builder builder85 = builder7.setTimeZone(timeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar81 and calendar84", (calendar81.compareTo(calendar84) == 0) == calendar81.equals(calendar84));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean13 = dateTimeZone12.isFixed();
        org.joda.time.DateTime dateTime14 = dateTime9.withZoneRetainFields(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant10", (dateTime14.compareTo(instant10) == 0) == dateTime14.equals(instant10));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.era();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType0.getField(chronology4);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = localDate12.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.LocalDate localDate24 = localDate12.minusYears(10);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale28.getCountry();
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getLanguage();
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.util.Locale locale37 = java.util.Locale.TAIWAN;
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.util.Locale locale40 = new java.util.Locale("");
        java.lang.String str41 = locale40.getLanguage();
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.lang.String str45 = locale44.getCountry();
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale34, locale36, locale37, locale38, locale40, locale42, locale43, locale44, locale46 };
        java.util.ArrayList<java.util.Locale> localeList48 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList48, localeArray47);
        java.util.Locale locale50 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList48);
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strSet52);
        boolean boolean54 = localDate12.equals((java.lang.Object) strList53);
        long long56 = chronology4.set((org.joda.time.ReadablePartial) localDate12, 1000L);
        org.joda.time.DurationField durationField57 = chronology4.minutes();
        org.joda.time.DurationField durationField58 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField59 = chronology4.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField57 and durationField58", Math.signum(durationField57.compareTo(durationField58)) == -Math.signum(durationField58.compareTo(durationField57)));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DateTime.Property property25 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTime dateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology30 = chronology10.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfHalfday();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.DurationField durationField34 = chronology30.eras();
        org.joda.time.DurationField durationField35 = chronology30.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField34", Math.signum(durationField11.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(durationField11)));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.DateTime dateTime23 = dateTime16.toDateTimeISO();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.LocalDate localDate28 = localDate26.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property30 = localDate29.yearOfCentury();
        org.joda.time.LocalDate localDate31 = property30.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean35 = dateTimeZone34.isFixed();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = localDate31.toDateTimeAtStartOfDay(dateTimeZone34);
        org.joda.time.DateTime dateTime38 = localDate28.toDateTimeAtMidnight(dateTimeZone34);
        org.joda.time.DateTime.Property property39 = dateTime38.year();
        int int40 = dateTime38.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime41 = dateTime38.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property43 = localDate42.yearOfCentury();
        org.joda.time.LocalDate localDate44 = property43.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean48 = dateTimeZone47.isFixed();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = localDate44.toDateTimeAtStartOfDay(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime50.toMutableDateTime();
        boolean boolean52 = dateTime50.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.Interval interval56 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Interval interval58 = interval56.withChronology(chronology57);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property60 = localDate59.yearOfCentury();
        org.joda.time.LocalDate localDate61 = property60.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean65 = dateTimeZone64.isFixed();
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone64);
        org.joda.time.DateTime dateTime67 = localDate61.toDateTimeAtStartOfDay(dateTimeZone64);
        org.joda.time.DateTime dateTime68 = dateTime67.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property69 = dateTime68.year();
        boolean boolean70 = interval58.contains((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Period period71 = interval58.toPeriod();
        org.joda.time.DateTime dateTime73 = dateTime50.withPeriodAdded((org.joda.time.ReadablePeriod) period71, 360240000);
        org.joda.time.DateTime.Property property74 = dateTime50.minuteOfHour();
        boolean boolean75 = dateTime41.isBefore((org.joda.time.ReadableInstant) dateTime50);
        boolean boolean76 = dateTime23.isEqual((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime22", (dateTime23.compareTo(dateTime22) == 0) == dateTime23.equals(dateTime22));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime11.plus((long) (short) 0);
        int int17 = dateTime11.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime11", (instant13.compareTo(dateTime11) == 0) == instant13.equals(dateTime11));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) 70);
        calendar3.set(10, 32772, (int) (byte) 1, 22, 0);
        long long12 = calendar3.getTimeInMillis();
        java.util.TimeZone timeZone13 = null;
        calendar3.setTimeZone(timeZone13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withMillis((long) 32772);
        org.joda.time.DateTime dateTime26 = dateTime24.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime28 = dateTime26.withWeekyear((int) 'u');
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale29);
        java.util.Calendar calendar31 = dateTime28.toCalendar(locale29);
        boolean boolean32 = calendar3.before((java.lang.Object) calendar31);
        java.lang.String str33 = calendar3.getCalendarType();
        java.util.Calendar.Builder builder34 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder36 = builder34.setInstant((long) 32770);
        java.util.Calendar calendar37 = builder36.build();
        boolean boolean39 = calendar37.after((java.lang.Object) 70);
        calendar37.set(10, 32772, (int) (byte) 1, 22, 0);
        long long46 = calendar37.getTimeInMillis();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property48 = localDate47.yearOfCentury();
        org.joda.time.LocalDate localDate49 = property48.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean53 = dateTimeZone52.isFixed();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone52);
        org.joda.time.DateTime dateTime55 = localDate49.toDateTimeAtStartOfDay(dateTimeZone52);
        org.joda.time.DateTime dateTime56 = dateTime55.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str58 = dateTimeFieldType57.getName();
        org.joda.time.DateTime.Property property59 = dateTime56.property(dateTimeFieldType57);
        org.joda.time.DateTime dateTime60 = property59.roundFloorCopy();
        org.joda.time.DateTime.Property property61 = dateTime60.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone62 = dateTime60.getZone();
        java.util.TimeZone timeZone63 = dateTimeZone62.toTimeZone();
        calendar37.setTimeZone(timeZone63);
        java.util.Locale locale65 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar66 = java.util.Calendar.getInstance(timeZone63, locale65);
        calendar3.setTimeZone(timeZone63);
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar37", (calendar3.compareTo(calendar37) == 0) == calendar3.equals(calendar37));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(dateTimeZone21);
        int int24 = dateTime13.getMillisOfDay();
        int int25 = dateTime13.getMonthOfYear();
        org.joda.time.DateTime.Property property26 = dateTime13.monthOfYear();
        java.util.Locale locale29 = new java.util.Locale("French", "weekyears");
        java.lang.String str30 = property26.getAsShortText(locale29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime23", (dateTime13.compareTo(mutableDateTime23) == 0) == dateTime13.equals(mutableDateTime23));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(32772);
        org.joda.time.LocalDate localDate8 = localDate4.minusYears((int) (short) 10);
        org.joda.time.LocalDate.Property property9 = localDate4.weekyear();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = dateTime33.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str36 = dateTimeFieldType35.getName();
        org.joda.time.DateTime.Property property37 = dateTime34.property(dateTimeFieldType35);
        org.joda.time.DateTime dateTime38 = property37.roundFloorCopy();
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime38.getZone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean44 = dateTimeZone43.isFixed();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone43);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.DateTime dateTime48 = localDate45.toDateTimeAtMidnight(dateTimeZone47);
        int int49 = dateTime48.getMonthOfYear();
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        org.joda.time.DateTime dateTime52 = dateTime48.toDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone51);
        long long55 = dateTimeZone40.getMillisKeepLocal(dateTimeZone51, (long) 7);
        org.joda.time.DateTime dateTime56 = dateTime24.toDateTime(dateTimeZone51);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DateTime.Property property58 = dateTime56.property(dateTimeFieldType57);
        boolean boolean59 = localDate4.isSupported(dateTimeFieldType57);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property61 = localDate60.yearOfCentury();
        org.joda.time.LocalDate localDate62 = property61.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean66 = dateTimeZone65.isFixed();
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone65);
        org.joda.time.DateTime dateTime68 = localDate62.toDateTimeAtStartOfDay(dateTimeZone65);
        org.joda.time.LocalDate localDate70 = localDate62.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property71 = localDate62.dayOfMonth();
        org.joda.time.LocalDate localDate72 = property71.withMaximumValue();
        org.joda.time.LocalDate localDate73 = property71.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean77 = dateTimeZone76.isFixed();
        org.joda.time.LocalDate localDate78 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone76);
        java.util.TimeZone timeZone79 = null;
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forTimeZone(timeZone79);
        org.joda.time.DateTime dateTime81 = localDate78.toDateTimeAtCurrentTime(dateTimeZone80);
        org.joda.time.DateTime dateTime82 = localDate73.toDateTimeAtStartOfDay(dateTimeZone80);
        java.lang.String str83 = dateTimeZone80.toString();
        org.joda.time.DateTime dateTime84 = localDate4.toDateTimeAtStartOfDay(dateTimeZone80);
        java.util.Locale locale85 = null;
        java.util.Calendar calendar86 = dateTime84.toCalendar(locale85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime56", (dateTime24.compareTo(dateTime56) == 0) == dateTime24.equals(dateTime56));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        int int10 = dateTime7.getWeekOfWeekyear();
        int int11 = dateTime7.getSecondOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property13 = localDate12.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime20.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str23 = dateTimeFieldType22.getName();
        org.joda.time.DateTime.Property property24 = dateTime21.property(dateTimeFieldType22);
        org.joda.time.DateTime dateTime25 = property24.roundFloorCopy();
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.DateTime dateTime34 = localDate31.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime25.toMutableDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime25.withMinuteOfHour(11);
        boolean boolean38 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime7.minusMinutes(56156);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean44 = dateTimeZone43.isFixed();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone43);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.DateTime dateTime48 = localDate45.toDateTimeAtCurrentTime(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.withMillis((long) 32772);
        org.joda.time.DateTime.Property property51 = dateTime48.secondOfDay();
        org.joda.time.DateTime dateTime53 = dateTime48.plusYears(1970);
        long long54 = dateTime48.getMillis();
        org.joda.time.DateTime dateTime56 = dateTime48.plusMinutes(99);
        org.joda.time.DateTime dateTime59 = dateTime48.withDurationAdded(117L, (int) (short) -1);
        boolean boolean60 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime35", (dateTime25.compareTo(mutableDateTime35) == 0) == dateTime25.equals(mutableDateTime35));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.DateTime dateTime4 = dateTime1.withDurationAdded((-1L), (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone7);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 32772);
        org.joda.time.DateTime dateTime16 = dateTime14.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withDurationAdded(readableDuration19, 292278994);
        java.util.Date date22 = dateTime16.toDate();
        java.util.GregorianCalendar gregorianCalendar23 = dateTime16.toGregorianCalendar();
        boolean boolean24 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property25 = dateTime1.secondOfDay();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int34 = dateTimeZone32.getOffsetFromLocal((long) 6);
        long long36 = dateTimeZone29.getMillisKeepLocal(dateTimeZone32, (long) 10);
        org.joda.time.Interval interval37 = localDate27.toInterval(dateTimeZone29);
        org.joda.time.DateTime dateTime38 = localDate26.toDateTimeAtMidnight(dateTimeZone29);
        long long42 = dateTimeZone29.convertLocalToUTC(11L, false, 0L);
        org.joda.time.DateTime dateTime43 = dateTime1.toDateTime(dateTimeZone29);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime43", (dateTime1.compareTo(dateTime43) == 0) == dateTime1.equals(dateTime43));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime19.withMillis((long) 86397);
        int int41 = dateTime40.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean7 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear(17);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean13 = dateTimeZone12.isFixed();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone12);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTime dateTime17 = localDate14.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillis((long) 32772);
        org.joda.time.DateTime dateTime21 = dateTime19.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 292278994);
        java.util.Date date27 = dateTime21.toDate();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property29 = localDate28.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.getLocalDate();
        org.joda.time.LocalDate localDate32 = localDate30.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate35 = property34.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = localDate32.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfCentury();
        org.joda.time.LocalDate localDate45 = property44.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean49 = dateTimeZone48.isFixed();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = localDate45.toDateTimeAtStartOfDay(dateTimeZone48);
        org.joda.time.DateTime dateTime52 = dateTime51.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str54 = dateTimeFieldType53.getName();
        org.joda.time.DateTime.Property property55 = dateTime52.property(dateTimeFieldType53);
        org.joda.time.DateTime dateTime56 = property55.roundFloorCopy();
        org.joda.time.DateTime.Property property57 = dateTime56.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime56.getZone();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean62 = dateTimeZone61.isFixed();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone61);
        java.util.TimeZone timeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.DateTime dateTime66 = localDate63.toDateTimeAtMidnight(dateTimeZone65);
        int int67 = dateTime66.getMonthOfYear();
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        org.joda.time.DateTime dateTime70 = dateTime66.toDateTime(dateTimeZone69);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone69);
        long long73 = dateTimeZone58.getMillisKeepLocal(dateTimeZone69, (long) 7);
        org.joda.time.DateTime dateTime74 = dateTime42.toDateTime(dateTimeZone69);
        org.joda.time.DateTime dateTime75 = dateTime21.toDateTime(dateTimeZone69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter9.withZone(dateTimeZone69);
        org.joda.time.LocalDateTime localDateTime77 = null;
        boolean boolean78 = dateTimeZone69.isLocalDateTimeGap(localDateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime74", (dateTime42.compareTo(dateTime74) == 0) == dateTime42.equals(dateTime74));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate4 = property2.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str5 = property2.getAsString();
        org.joda.time.LocalDate localDate6 = property2.withMinimumValue();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.millisOfSecond();
        org.joda.time.DurationField durationField11 = chronology7.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime.Property property21 = dateTime19.year();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property23 = localDate22.yearOfCentury();
        org.joda.time.LocalDate.Property property24 = localDate22.yearOfCentury();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = dateTime33.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property35 = dateTime34.year();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property37 = localDate36.yearOfCentury();
        org.joda.time.LocalDate localDate38 = property37.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean42 = dateTimeZone41.isFixed();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.DateTime dateTime44 = localDate38.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = dateTime44.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str47 = dateTimeFieldType46.getName();
        org.joda.time.DateTime.Property property48 = dateTime45.property(dateTimeFieldType46);
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property51 = localDate50.yearOfCentury();
        org.joda.time.LocalDate localDate52 = property51.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean56 = dateTimeZone55.isFixed();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone55);
        org.joda.time.DateTime dateTime58 = localDate52.toDateTimeAtStartOfDay(dateTimeZone55);
        org.joda.time.DateTime dateTime59 = dateTime58.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str61 = dateTimeFieldType60.getName();
        org.joda.time.DateTime.Property property62 = dateTime59.property(dateTimeFieldType60);
        int int63 = dateTime34.compareTo((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime64 = localDate22.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean65 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime59);
        java.lang.String str66 = dateTime59.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DateTime.Property property25 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTime dateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology30 = chronology10.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfHalfday();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.DurationField durationField34 = chronology30.eras();
        org.joda.time.DateTimeField dateTimeField35 = chronology30.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField34", Math.signum(durationField11.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(durationField11)));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = dateTime9.withLaterOffsetAtOverlap();
        int int14 = dateTime13.getMonthOfYear();
        org.joda.time.DateTime dateTime16 = dateTime13.minus((-259200000L));
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfCentury();
        org.joda.time.LocalDate localDate19 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone22);
        org.joda.time.LocalDate localDate27 = localDate19.plusMonths((int) (short) 1);
        java.lang.String str28 = localDate27.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTime dateTime36 = localDate33.toDateTimeAtMidnight(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = localDate27.toDateTimeAtStartOfDay(dateTimeZone35);
        long long41 = dateTimeZone35.convertLocalToUTC(31536000000L, true, (long) 32770);
        org.joda.time.DateTime dateTime42 = dateTime13.toDateTime(dateTimeZone35);
        org.joda.time.DateTime.Property property43 = dateTime13.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime42", (dateTime13.compareTo(dateTime42) == 0) == dateTime13.equals(dateTime42));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property2 = localDate1.yearOfCentury();
        org.joda.time.LocalDate localDate3 = property2.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone6);
        boolean boolean10 = dateTime9.isBeforeNow();
        boolean boolean12 = dateTime9.isAfter((long) 48);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean16 = dateTimeZone15.isFixed();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone15);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTime dateTime20 = localDate17.toDateTimeAtMidnight(dateTimeZone19);
        int int21 = dateTime20.getMonthOfYear();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTime dateTime24 = dateTime20.toDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        java.lang.String str28 = dateTimeZone23.getShortName((long) 2022);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime9.toMutableDateTime(dateTimeZone23);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (-1), dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime29", (dateTime9.compareTo(mutableDateTime29) == 0) == dateTime9.equals(mutableDateTime29));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addToCopy((long) 935);
        org.joda.time.DateTime dateTime23 = property20.withMaximumValue();
        org.joda.time.DateTime dateTime24 = property20.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime25 = property20.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime19", (dateTime25.compareTo(dateTime19) == 0) == dateTime25.equals(dateTime19));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        org.joda.time.DateTime dateTime16 = property14.addWrapFieldToCopy(8);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds((-3599));
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime();
        java.lang.String str21 = dateTime18.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and dateTime18", (instant19.compareTo(dateTime18) == 0) == instant19.equals(dateTime18));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant10", (dateTime11.compareTo(instant10) == 0) == dateTime11.equals(instant10));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.DateTime dateTime31 = localDate28.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withMillis((long) 32772);
        org.joda.time.DateTime dateTime35 = dateTime33.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Interval interval43 = interval41.withChronology(chronology42);
        org.joda.time.Duration duration44 = interval41.toDuration();
        org.joda.time.DateTime dateTime45 = dateTime37.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property47 = localDate46.yearOfCentury();
        org.joda.time.LocalDate localDate48 = property47.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean52 = dateTimeZone51.isFixed();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone51);
        org.joda.time.DateTime dateTime54 = localDate48.toDateTimeAtStartOfDay(dateTimeZone51);
        org.joda.time.DateTime dateTime55 = dateTime45.withZoneRetainFields(dateTimeZone51);
        boolean boolean56 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Instant instant57 = dateTime22.toInstant();
        org.joda.time.DateTime dateTime59 = dateTime22.plusYears(116);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant57", (dateTime8.compareTo(instant57) == 0) == dateTime8.equals(instant57));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) (byte) 10);
        java.util.Calendar.Builder builder6 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder8 = builder6.setInstant((long) 32770);
        java.util.Calendar calendar9 = builder8.build();
        java.util.Date date10 = calendar9.getTime();
        java.util.TimeZone timeZone11 = calendar9.getTimeZone();
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.lang.String str13 = locale12.getCountry();
        java.lang.String str14 = locale12.getDisplayCountry();
        java.util.Locale.setDefault(locale12);
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Interval interval19 = yearMonth17.toInterval(dateTimeZone18);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = yearMonth17.getFieldTypes();
        org.joda.time.YearMonth.Property property21 = yearMonth17.year();
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.lang.String str23 = locale22.getCountry();
        java.util.Locale locale24 = locale22.stripExtensions();
        int int25 = property21.getMaximumTextLength(locale24);
        java.lang.String str26 = locale12.getDisplayName(locale24);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone11, locale24);
        java.util.Locale locale31 = new java.util.Locale("zho", "1970-01-01T00:00:00.000+06:00", "Chinese");
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone11, locale31);
        calendar3.setTimeZone(timeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar32", (calendar27.compareTo(calendar32) == 0) == calendar27.equals(calendar32));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.Chronology chronology23 = chronology19.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        boolean boolean29 = dateTime28.isBeforeNow();
        int int30 = dateTime28.getDayOfYear();
        boolean boolean31 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime.Property property32 = dateTime28.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.DateTime.Property property15 = dateTime14.year();
        int int16 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property18 = dateTime14.monthOfYear();
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime14.withZone(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfEra();
        org.joda.time.Chronology chronology23 = dateTime21.getChronology();
        org.joda.time.YearMonth yearMonth24 = org.joda.time.YearMonth.now(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime21", (dateTime14.compareTo(dateTime21) == 0) == dateTime14.equals(dateTime21));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime.Property property21 = dateTime19.year();
        org.joda.time.DateTime dateTime23 = property21.setCopy("1970");
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        int int25 = mutableDateTime24.getSecondOfMinute();
        long long26 = mutableDateTime24.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime.Property property39 = dateTime37.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime.Property property21 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime23 = dateTime22.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        boolean boolean25 = dateTime24.isBeforeNow();
        org.joda.time.DateTime dateTime27 = dateTime24.minusHours(86397772);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTime dateTime36 = localDate33.toDateTimeAtCurrentTime(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean41 = dateTimeZone40.isFixed();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int45 = dateTimeZone43.getOffsetFromLocal((long) 6);
        long long47 = dateTimeZone40.getMillisKeepLocal(dateTimeZone43, (long) 10);
        org.joda.time.DateTime dateTime48 = dateTime38.withZone(dateTimeZone43);
        org.joda.time.DateTime.Property property49 = dateTime48.weekOfWeekyear();
        org.joda.time.DateTime dateTime51 = dateTime48.withMinuteOfHour(7);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property53 = localDate52.yearOfCentury();
        org.joda.time.LocalDate localDate54 = property53.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean58 = dateTimeZone57.isFixed();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone57);
        org.joda.time.DateTime dateTime60 = localDate54.toDateTimeAtStartOfDay(dateTimeZone57);
        boolean boolean61 = dateTime60.isBeforeNow();
        int int62 = dateTime60.getDayOfYear();
        boolean boolean63 = dateTime48.isEqual((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime.Property property64 = dateTime48.millisOfSecond();
        long long65 = dateTime48.getMillis();
        int int66 = property28.getDifference((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) 70);
        long long6 = calendar3.getTimeInMillis();
        calendar3.setTimeInMillis(0L);
        java.util.Calendar.Builder builder9 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder11 = builder9.setInstant((long) 32770);
        java.util.Calendar calendar12 = builder11.build();
        java.util.Date date13 = calendar12.getTime();
        java.util.TimeZone timeZone14 = calendar12.getTimeZone();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.lang.String str16 = locale15.getCountry();
        java.lang.String str17 = locale15.getDisplayCountry();
        java.util.Locale.setDefault(locale15);
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = yearMonth20.toInterval(dateTimeZone21);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = yearMonth20.getFieldTypes();
        org.joda.time.YearMonth.Property property24 = yearMonth20.year();
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = locale25.getCountry();
        java.util.Locale locale27 = locale25.stripExtensions();
        int int28 = property24.getMaximumTextLength(locale27);
        java.lang.String str29 = locale15.getDisplayName(locale27);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone14, locale27);
        calendar3.setTimeZone(timeZone14);
        java.util.TimeZone timeZone32 = calendar3.getTimeZone();
        java.util.Calendar.Builder builder33 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder35 = builder33.setInstant((long) 32770);
        java.util.Calendar calendar36 = builder35.build();
        boolean boolean38 = calendar36.after((java.lang.Object) 70);
        long long39 = calendar36.getTimeInMillis();
        calendar36.setTimeInMillis(0L);
        java.util.Calendar.Builder builder42 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder44 = builder42.setInstant((long) 32770);
        java.util.Calendar calendar45 = builder44.build();
        java.util.Date date46 = calendar45.getTime();
        java.util.TimeZone timeZone47 = calendar45.getTimeZone();
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.lang.String str49 = locale48.getCountry();
        java.lang.String str50 = locale48.getDisplayCountry();
        java.util.Locale.setDefault(locale48);
        org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.Interval interval55 = yearMonth53.toInterval(dateTimeZone54);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = yearMonth53.getFieldTypes();
        org.joda.time.YearMonth.Property property57 = yearMonth53.year();
        java.util.Locale locale58 = java.util.Locale.FRANCE;
        java.lang.String str59 = locale58.getCountry();
        java.util.Locale locale60 = locale58.stripExtensions();
        int int61 = property57.getMaximumTextLength(locale60);
        java.lang.String str62 = locale48.getDisplayName(locale60);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone47, locale60);
        calendar36.setTimeZone(timeZone47);
        java.util.TimeZone timeZone65 = calendar36.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        calendar3.setTimeZone(timeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and calendar45", (calendar12.compareTo(calendar45) == 0) == calendar12.equals(calendar45));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.era();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime9.toDateTime(chronology31);
        java.util.Date date33 = dateTime32.toDate();
        date33.setYear((int) (short) 0);
        date33.setDate((int) (byte) 100);
        date33.setMinutes(14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addToCopy((long) 935);
        org.joda.time.DateTime dateTime23 = property20.withMaximumValue();
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfCentury(70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(dateTimeZone21);
        long long26 = dateTimeZone21.convertLocalToUTC((long) 14, false);
        org.joda.time.YearMonth yearMonth27 = org.joda.time.YearMonth.now(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime23", (dateTime13.compareTo(mutableDateTime23) == 0) == dateTime13.equals(mutableDateTime23));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.DateTime.Property property15 = dateTime14.year();
        int int16 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property18 = dateTime14.monthOfYear();
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime14.withZone(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfEra();
        org.joda.time.Chronology chronology23 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime21", (dateTime14.compareTo(dateTime21) == 0) == dateTime14.equals(dateTime21));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight(dateTimeZone6);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateMidnight dateMidnight9 = dateTime7.toDateMidnight();
        org.joda.time.DateTime.Property property10 = dateTime7.weekOfWeekyear();
        int int11 = dateTime7.getCenturyOfEra();
        org.joda.time.Instant instant12 = dateTime7.toInstant();
        java.util.Date date13 = dateTime7.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and instant12", (dateMidnight9.compareTo(instant12) == 0) == dateMidnight9.equals(instant12));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property24 = dateTime22.yearOfEra();
        java.util.Date date25 = dateTime22.toDate();
        org.joda.time.Instant instant26 = dateTime22.toInstant();
        org.joda.time.DateTime dateTime27 = dateTime22.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant26", (dateTime8.compareTo(instant26) == 0) == dateTime8.equals(instant26));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.plusYears(1970);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime12.toDateTime(chronology15);
        int int18 = dateTime17.getEra();
        int int19 = dateTime17.getMinuteOfHour();
        org.joda.time.LocalDate localDate20 = dateTime17.toLocalDate();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.LocalDate localDate31 = localDate23.plusMonths((int) (short) 1);
        java.util.Date date32 = localDate31.toDate();
        boolean boolean33 = localDate20.isAfter((org.joda.time.ReadablePartial) localDate31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime17", (dateTime12.compareTo(dateTime17) == 0) == dateTime12.equals(dateTime17));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addToCopy((long) 935);
        org.joda.time.DateTime dateTime23 = property20.getDateTime();
        org.joda.time.DateTime dateTime24 = property20.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.DateTime.Property property15 = dateTime14.year();
        int int16 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property18 = dateTime14.monthOfYear();
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime14.withZone(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfEra();
        org.joda.time.Chronology chronology23 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime21", (dateTime14.compareTo(dateTime21) == 0) == dateTime14.equals(dateTime21));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DurationField durationField6 = chronology2.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        org.joda.time.LocalDate localDate15 = dateTime13.toLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getRangeDurationType();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.era();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType16.getField(chronology20);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.LocalDate localDate28 = localDate26.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property30 = localDate29.yearOfCentury();
        org.joda.time.LocalDate localDate31 = property30.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean35 = dateTimeZone34.isFixed();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = localDate31.toDateTimeAtStartOfDay(dateTimeZone34);
        org.joda.time.DateTime dateTime38 = localDate28.toDateTimeAtMidnight(dateTimeZone34);
        org.joda.time.LocalDate localDate40 = localDate28.minusYears(10);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.lang.String str45 = locale44.getCountry();
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = java.util.Locale.FRENCH;
        java.util.Locale locale48 = java.util.Locale.FRENCH;
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getLanguage();
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.util.Locale locale53 = java.util.Locale.TAIWAN;
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale56.getLanguage();
        java.util.Locale locale58 = java.util.Locale.CANADA;
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.lang.String str61 = locale60.getCountry();
        java.util.Locale locale62 = java.util.Locale.KOREA;
        java.util.Locale[] localeArray63 = new java.util.Locale[] { locale44, locale46, locale47, locale48, locale50, locale52, locale53, locale54, locale56, locale58, locale59, locale60, locale62 };
        java.util.ArrayList<java.util.Locale> localeList64 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList64, localeArray63);
        java.util.Locale locale66 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList64);
        java.util.Locale locale67 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet68 = locale67.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strSet68);
        boolean boolean70 = localDate28.equals((java.lang.Object) strList69);
        long long72 = chronology20.set((org.joda.time.ReadablePartial) localDate28, 1000L);
        org.joda.time.DurationField durationField73 = chronology20.minutes();
        org.joda.time.DurationField durationField74 = chronology20.eras();
        org.joda.time.MutableDateTime mutableDateTime75 = dateTime13.toMutableDateTime(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField73 and durationField74", Math.signum(durationField73.compareTo(durationField74)) == -Math.signum(durationField74.compareTo(durationField73)));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property23 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime26 = dateTime20.withHourOfDay(15);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(13);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime26.toMutableDateTime(dateTimeZone28);
        java.lang.String str31 = dateTimeZone28.getName((long) 2922789);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and mutableDateTime29", (dateTime26.compareTo(mutableDateTime29) == 0) == dateTime26.equals(mutableDateTime29));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 292278994);
        org.joda.time.DateTime dateTime18 = dateTime16.minusSeconds(8);
        org.joda.time.Instant instant19 = dateTime16.toInstant();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long24 = dateTimeZone20.convertLocalToUTC(84315156599000L, true, (long) 56192);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant19", (dateTime11.compareTo(instant19) == 0) == dateTime11.equals(instant19));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = yearMonth4.toInterval(dateTimeZone5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = yearMonth4.getFieldTypes();
        org.joda.time.YearMonth.Property property8 = yearMonth4.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = yearMonth4.toString(dateTimeFormatter9);
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = yearMonth12.toInterval(dateTimeZone13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = yearMonth12.getFieldTypes();
        org.joda.time.YearMonth.Property property16 = yearMonth12.year();
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = yearMonth20.toInterval(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.Interval interval24 = interval22.withPeriodAfterStart(readablePeriod23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = interval24.toPeriod(periodType25);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean28 = period26.isSupported(durationFieldType27);
        org.joda.time.YearMonth yearMonth30 = yearMonth18.withPeriodAdded((org.joda.time.ReadablePeriod) period26, 32770);
        org.joda.time.YearMonth yearMonth31 = yearMonth12.minus((org.joda.time.ReadablePeriod) period26);
        boolean boolean32 = yearMonth4.isAfter((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.Chronology chronology33 = yearMonth31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter2.withChronology(chronology33);
        org.joda.time.DurationField durationField36 = chronology33.months();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.monthOfYear();
        org.joda.time.YearMonth yearMonth39 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.Interval interval41 = yearMonth39.toInterval(dateTimeZone40);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray42 = yearMonth39.getFieldTypes();
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = yearMonth44.toInterval(dateTimeZone45);
        org.joda.time.YearMonth yearMonth48 = yearMonth44.minusMonths((int) (short) 1);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonth yearMonth50 = yearMonth48.withChronologyRetainFields(chronology49);
        int int51 = yearMonth39.compareTo((org.joda.time.ReadablePartial) yearMonth50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.YearMonth yearMonth53 = yearMonth50.minus(readablePeriod52);
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.Interval interval57 = yearMonth55.toInterval(dateTimeZone56);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray58 = yearMonth55.getFieldTypes();
        org.joda.time.YearMonth.Property property59 = yearMonth55.year();
        java.lang.String str60 = property59.toString();
        org.joda.time.YearMonth yearMonth61 = property59.getYearMonth();
        int[] intArray62 = yearMonth61.getValues();
        chronology33.validate((org.joda.time.ReadablePartial) yearMonth53, intArray62);
        org.joda.time.DateTimeField dateTimeField64 = chronology33.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField65 = chronology33.dayOfMonth();
        long long69 = chronology33.add((long) 2, (long) 21597772, (int) '#');
        org.joda.time.DurationField durationField70 = chronology33.eras();
        org.joda.time.YearMonth yearMonth72 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.Interval interval74 = yearMonth72.toInterval(dateTimeZone73);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray75 = yearMonth72.getFieldTypes();
        org.joda.time.YearMonth yearMonth77 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.Interval interval79 = yearMonth77.toInterval(dateTimeZone78);
        org.joda.time.YearMonth yearMonth81 = yearMonth77.minusMonths((int) (short) 1);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.YearMonth yearMonth83 = yearMonth81.withChronologyRetainFields(chronology82);
        int int84 = yearMonth72.compareTo((org.joda.time.ReadablePartial) yearMonth83);
        int int85 = yearMonth72.getMonthOfYear();
        long long87 = chronology33.set((org.joda.time.ReadablePartial) yearMonth72, 971954121600000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField36 and durationField70", Math.signum(durationField36.compareTo(durationField70)) == -Math.signum(durationField70.compareTo(durationField36)));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        boolean boolean23 = dateTime22.isBeforeNow();
        int int24 = dateTime22.getDayOfYear();
        boolean boolean25 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property26 = dateTime13.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.DateTime dateTime34 = localDate31.toDateTimeAtCurrentTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.withMillis((long) 32772);
        org.joda.time.DateTime dateTime38 = dateTime36.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Interval interval46 = interval44.withChronology(chronology45);
        org.joda.time.Duration duration47 = interval44.toDuration();
        org.joda.time.DateTime dateTime48 = dateTime40.plus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.DateTime dateTime51 = dateTime48.withDurationAdded((long) ' ', (int) (byte) 100);
        int int52 = dateTime48.getSecondOfDay();
        org.joda.time.DateTime dateTime54 = dateTime48.plusMonths(57);
        org.joda.time.DateTime dateTime56 = dateTime48.plusMinutes(16);
        org.joda.time.DateTime dateTime59 = dateTime56.withDurationAdded(0L, 57);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale63 = new java.util.Locale("yearOfCentury");
        boolean boolean64 = dateTimeZone61.equals((java.lang.Object) locale63);
        org.joda.time.DateTime dateTime65 = dateTime56.withZone(dateTimeZone61);
        boolean boolean66 = property26.equals((java.lang.Object) dateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime56 and dateTime65", (dateTime56.compareTo(dateTime65) == 0) == dateTime56.equals(dateTime65));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime19.withMillis((long) 86397);
        org.joda.time.DateTime dateTime42 = dateTime40.minusYears(2011);
        int int43 = dateTime42.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property23 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime26 = dateTime9.minusDays(32772);
        org.joda.time.DateTime.Property property27 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime29 = dateTime9.plusSeconds(13);
        org.joda.time.DateTime dateTime31 = dateTime29.plusDays(20);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean35 = dateTimeZone34.isFixed();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone34);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTime dateTime39 = localDate36.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean44 = dateTimeZone43.isFixed();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int48 = dateTimeZone46.getOffsetFromLocal((long) 6);
        long long50 = dateTimeZone43.getMillisKeepLocal(dateTimeZone46, (long) 10);
        org.joda.time.DateTime dateTime51 = dateTime41.withZone(dateTimeZone46);
        org.joda.time.DateTime.Property property52 = dateTime51.weekOfWeekyear();
        org.joda.time.DateTime dateTime54 = dateTime51.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime56 = dateTime51.plusMillis(6);
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property58 = localDate57.yearOfCentury();
        org.joda.time.LocalDate localDate59 = property58.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean63 = dateTimeZone62.isFixed();
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone62);
        org.joda.time.DateTime dateTime65 = localDate59.toDateTimeAtStartOfDay(dateTimeZone62);
        boolean boolean66 = dateTime65.isBeforeNow();
        int int67 = dateTime65.getDayOfMonth();
        org.joda.time.DateTime dateTime69 = dateTime65.minusYears(48);
        int int70 = dateTime51.compareTo((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime dateTime72 = dateTime51.withMillis((long) 86397);
        boolean boolean73 = dateTime29.isEqual((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime74 = dateTime29.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime51", (dateTime41.compareTo(dateTime51) == 0) == dateTime41.equals(dateTime51));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = dateTime13.minusMinutes((int) (short) 0);
        org.joda.time.DateTime.Property property26 = dateTime13.secondOfMinute();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property28 = localDate27.yearOfCentury();
        org.joda.time.LocalDate.Property property29 = localDate27.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.withMaximumValue();
        org.joda.time.LocalDate localDate31 = property29.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate32 = property29.withMinimumValue();
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Interval interval39 = interval37.withChronology(chronology38);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property41 = localDate40.yearOfCentury();
        org.joda.time.LocalDate localDate42 = property41.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean46 = dateTimeZone45.isFixed();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone45);
        org.joda.time.DateTime dateTime48 = localDate42.toDateTimeAtStartOfDay(dateTimeZone45);
        org.joda.time.DateTime dateTime49 = dateTime48.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property50 = dateTime49.year();
        boolean boolean51 = interval39.contains((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Period period52 = interval39.toPeriod();
        java.lang.String str53 = period52.toString();
        int[] intArray55 = chronology33.get((org.joda.time.ReadablePeriod) period52, 83635236564686000L);
        org.joda.time.MutablePeriod mutablePeriod56 = period52.toMutablePeriod();
        org.joda.time.DateTime dateTime57 = dateTime13.plus((org.joda.time.ReadablePeriod) mutablePeriod56);
        org.joda.time.DateTime dateTime59 = dateTime13.minusMillis(52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and dateTime13", (mutableDateTime23.compareTo(dateTime13) == 0) == mutableDateTime23.equals(dateTime13));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate4 = property2.addToCopy(56182);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone7);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int21 = dateTimeZone19.getOffsetFromLocal((long) 6);
        long long23 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        org.joda.time.DateTime dateTime24 = dateTime14.withZone(dateTimeZone19);
        org.joda.time.DateTime.Property property25 = dateTime24.weekOfWeekyear();
        org.joda.time.DateTime dateTime27 = dateTime24.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime29 = dateTime24.plusMillis(6);
        boolean boolean30 = dateTime29.isBeforeNow();
        org.joda.time.DateTime dateTime31 = localDate4.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime24", (dateTime14.compareTo(dateTime24) == 0) == dateTime14.equals(dateTime24));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime17 = localDate7.toDateTimeAtMidnight(dateTimeZone13);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) 9);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone23);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime28 = localDate25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withMillis((long) 32772);
        org.joda.time.DateTime dateTime32 = dateTime30.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime34 = dateTime30.withSecondOfMinute((int) (short) 10);
        org.joda.time.DateTime dateTime36 = dateTime30.minusHours(32772);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(20);
        java.lang.Object obj39 = null;
        boolean boolean40 = dateTimeZone38.equals(obj39);
        org.joda.time.DateTime dateTime41 = dateTime30.withZoneRetainFields(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime20.withZone(dateTimeZone38);
        int int44 = dateTimeZone38.getStandardOffset(1645464996275L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime42", (dateTime20.compareTo(dateTime42) == 0) == dateTime20.equals(dateTime42));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DurationField durationField3 = property1.getDurationField();
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("Taiwan");
        double double6 = languageRange5.getWeight();
        double double7 = languageRange5.getWeight();
        boolean boolean8 = property1.equals((java.lang.Object) double7);
        org.joda.time.LocalDate localDate9 = property1.roundHalfCeilingCopy();
        java.util.Locale locale12 = new java.util.Locale("10-Dec-1969 6:00:00 PM");
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DateTime.Property property25 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.DateTimeField dateTimeField27 = property25.getField();
        long long30 = dateTimeField27.add((long) (byte) 10, (-1));
        long long33 = dateTimeField27.addWrapField(0L, (int) (short) 10);
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.lang.String str36 = dateTimeField27.getAsShortText(70, locale35);
        org.joda.time.DurationField durationField37 = dateTimeField27.getDurationField();
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.lang.String str42 = dateTimeZone40.getName(10L);
        java.util.Locale locale46 = new java.util.Locale("70", "hi!");
        java.lang.String str47 = dateTimeZone40.getName((long) '4', locale46);
        java.lang.String str48 = locale46.toLanguageTag();
        java.lang.String str49 = dateTimeField27.getAsShortText((-360L), locale46);
        java.util.Set<java.lang.Character> charSet50 = locale46.getExtensionKeys();
        java.lang.String str51 = locale12.getDisplayCountry(locale46);
        java.lang.String str52 = localDate9.toString("19", locale12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField37", (durationField3.compareTo(durationField37) == 0) == durationField3.equals(durationField37));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime37.toMutableDateTime();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property41 = localDate40.yearOfCentury();
        org.joda.time.LocalDate localDate42 = property41.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean46 = dateTimeZone45.isFixed();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone45);
        org.joda.time.DateTime dateTime48 = localDate42.toDateTimeAtStartOfDay(dateTimeZone45);
        org.joda.time.DateTime dateTime49 = dateTime48.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property50 = dateTime49.year();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property52 = localDate51.yearOfCentury();
        org.joda.time.LocalDate localDate53 = property52.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean57 = dateTimeZone56.isFixed();
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone56);
        org.joda.time.DateTime dateTime59 = localDate53.toDateTimeAtStartOfDay(dateTimeZone56);
        org.joda.time.DateTime dateTime60 = dateTime59.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str62 = dateTimeFieldType61.getName();
        org.joda.time.DateTime.Property property63 = dateTime60.property(dateTimeFieldType61);
        org.joda.time.Interval interval64 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime60);
        int int65 = dateTime60.getHourOfDay();
        boolean boolean66 = dateTime60.isBeforeNow();
        org.joda.time.YearMonthDay yearMonthDay67 = dateTime60.toYearMonthDay();
        org.joda.time.DateTime dateTime69 = dateTime60.minus(1050308164619000L);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int74 = dateTimeZone72.getOffset((long) 2022);
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((long) 32770, dateTimeZone72);
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property77 = localDate76.yearOfCentury();
        org.joda.time.LocalDate localDate78 = property77.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean82 = dateTimeZone81.isFixed();
        org.joda.time.LocalDate localDate83 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone81);
        org.joda.time.DateTime dateTime84 = localDate78.toDateTimeAtStartOfDay(dateTimeZone81);
        org.joda.time.DateTime dateTime85 = dateTime84.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str87 = dateTimeFieldType86.getName();
        org.joda.time.DateTime.Property property88 = dateTime85.property(dateTimeFieldType86);
        org.joda.time.DateTime dateTime89 = property88.roundFloorCopy();
        org.joda.time.DateTime.Property property90 = dateTime89.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone91 = dateTime89.getZone();
        long long93 = dateTimeZone72.getMillisKeepLocal(dateTimeZone91, (long) 9);
        org.joda.time.LocalDate localDate94 = new org.joda.time.LocalDate((java.lang.Object) dateTime69, dateTimeZone91);
        org.joda.time.MutableDateTime mutableDateTime95 = mutableDateTime39.toMutableDateTime(dateTimeZone91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property24.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean29 = dateTimeZone28.isFixed();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtStartOfDay(dateTimeZone28);
        boolean boolean32 = dateTime31.isBeforeNow();
        int int33 = dateTime31.getDayOfYear();
        boolean boolean34 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime36 = dateTime31.minus((long) 796407);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth yearMonth6 = yearMonth1.withYear((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.eras();
        boolean boolean8 = yearMonth1.equals((java.lang.Object) durationFieldType7);
        java.lang.String str9 = durationFieldType7.toString();
        java.lang.String str10 = durationFieldType7.toString();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((long) (short) 1, chronology12);
        org.joda.time.Chronology chronology14 = yearMonth13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = durationFieldType7.getField(chronology14);
        org.joda.time.DurationField durationField18 = chronology14.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField18, and durationField17", !(durationField17.compareTo(durationField18) == 0) || (Math.signum(durationField17.compareTo(durationField17)) == Math.signum(durationField18.compareTo(durationField17))));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addWrapFieldToCopy((int) (byte) -1);
        int int23 = dateTime22.getMillisOfDay();
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.era();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime9.toDateTime(chronology31);
        java.util.Date date33 = dateTime32.toDate();
        org.joda.time.DateTime dateTime35 = dateTime32.minus(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.secondOfMinute();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DurationField durationField7 = durationFieldType1.getField(chronology4);
        org.joda.time.DurationField durationField8 = chronology4.millis();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(315532800002L, chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withDefaultYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int19 = dateTimeZone17.getOffset((long) 2022);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 32770, dateTimeZone17);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = dateTime29.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str32 = dateTimeFieldType31.getName();
        org.joda.time.DateTime.Property property33 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.DateTime dateTime34 = property33.roundFloorCopy();
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime34.getZone();
        long long38 = dateTimeZone17.getMillisKeepLocal(dateTimeZone36, (long) 9);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean41 = dateTimeZone40.isFixed();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int45 = dateTimeZone43.getOffsetFromLocal((long) 6);
        long long47 = dateTimeZone40.getMillisKeepLocal(dateTimeZone43, (long) 10);
        long long49 = dateTimeZone17.getMillisKeepLocal(dateTimeZone43, (long) 1970);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter12.withZone(dateTimeZone43);
        java.lang.String str52 = dateTimeZone43.getShortName((long) 796407);
        org.joda.time.Chronology chronology53 = chronology4.withZone(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField54 = chronology53.secondOfDay();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property56 = localDate55.yearOfCentury();
        org.joda.time.LocalDate localDate57 = property56.getLocalDate();
        int int58 = localDate57.getWeekyear();
        java.lang.String str59 = localDate57.toString();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean62 = dateTimeZone61.isFixed();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property64 = localDate63.yearOfCentury();
        org.joda.time.LocalDate localDate65 = property64.getLocalDate();
        org.joda.time.LocalDate localDate67 = localDate65.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property69 = localDate68.yearOfCentury();
        org.joda.time.LocalDate localDate70 = property69.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean74 = dateTimeZone73.isFixed();
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone73);
        org.joda.time.DateTime dateTime76 = localDate70.toDateTimeAtStartOfDay(dateTimeZone73);
        org.joda.time.DateTime dateTime77 = localDate67.toDateTimeAtMidnight(dateTimeZone73);
        long long79 = dateTimeZone61.getMillisKeepLocal(dateTimeZone73, (long) 9);
        org.joda.time.DateTime dateTime80 = localDate57.toDateTimeAtCurrentTime(dateTimeZone73);
        int[] intArray82 = chronology53.get((org.joda.time.ReadablePartial) localDate57, (long) 17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime80", (dateTime6.compareTo(dateTime80) == 0) == dateTime6.equals(dateTime80));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate4.centuryOfEra();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone13);
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime19 = dateTime16.plus((long) 2011);
        org.joda.time.DateTime dateTime21 = dateTime19.plus(25193556255615770L);
        org.joda.time.DateTime.Property property22 = dateTime19.weekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTime dateTime30 = localDate27.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean35 = dateTimeZone34.isFixed();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int39 = dateTimeZone37.getOffsetFromLocal((long) 6);
        long long41 = dateTimeZone34.getMillisKeepLocal(dateTimeZone37, (long) 10);
        org.joda.time.DateTime dateTime42 = dateTime32.withZone(dateTimeZone37);
        org.joda.time.DateTime.Property property43 = dateTime42.weekOfWeekyear();
        org.joda.time.DateTime.Property property44 = dateTime42.year();
        org.joda.time.DateTime dateTime46 = property44.setCopy("1970");
        boolean boolean47 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime46", (dateTime32.compareTo(dateTime46) == 0) == dateTime32.equals(dateTime46));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) (byte) 10);
        java.util.Date date6 = calendar3.getTime();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean10 = dateTimeZone9.isFixed();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone9);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTime dateTime14 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int23 = dateTimeZone21.getOffsetFromLocal((long) 6);
        long long25 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, (long) 10);
        org.joda.time.DateTime dateTime26 = dateTime16.withZone(dateTimeZone21);
        org.joda.time.DateTime.Property property27 = dateTime16.hourOfDay();
        org.joda.time.DateTime dateTime29 = property27.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean33 = dateTimeZone32.isFixed();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone32);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTime dateTime37 = localDate34.toDateTimeAtCurrentTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusYears(2022);
        int int40 = property27.getDifference((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime41 = property27.withMinimumValue();
        boolean boolean42 = calendar3.after((java.lang.Object) dateTime41);
        int int43 = calendar3.getWeekYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime26", (dateTime16.compareTo(dateTime26) == 0) == dateTime16.equals(dateTime26));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime.Property property21 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.lang.String str24 = locale23.toLanguageTag();
        java.util.Locale locale28 = new java.util.Locale("5 Jun 798307 11:57:00 GMT", "PT0S", "1969");
        java.lang.String str29 = locale23.getDisplayLanguage(locale28);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property31 = localDate30.yearOfCentury();
        org.joda.time.LocalDate.Property property32 = localDate30.yearOfCentury();
        org.joda.time.LocalDate localDate34 = property32.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField35 = property32.getField();
        int int37 = dateTimeField35.get((long) 'u');
        long long40 = dateTimeField35.addWrapField((long) (short) -1, 1);
        org.joda.time.DurationField durationField41 = dateTimeField35.getDurationField();
        boolean boolean43 = dateTimeField35.isLeap((long) 32772);
        java.lang.String str45 = dateTimeField35.getAsText(21600003L);
        long long48 = dateTimeField35.addWrapField(84315156599000L, (int) (short) 100);
        org.joda.time.ReadablePartial readablePartial49 = null;
        java.util.Locale locale54 = new java.util.Locale("hi!", "2022-02-11", "2022-02-11");
        java.lang.String str55 = dateTimeField35.getAsShortText(readablePartial49, 0, locale54);
        java.lang.String str56 = locale28.getDisplayVariant(locale54);
        java.lang.String str57 = property21.getAsText(locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean7 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear(17);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean13 = dateTimeZone12.isFixed();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone12);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTime dateTime17 = localDate14.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillis((long) 32772);
        org.joda.time.DateTime dateTime21 = dateTime19.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 292278994);
        java.util.Date date27 = dateTime21.toDate();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property29 = localDate28.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.getLocalDate();
        org.joda.time.LocalDate localDate32 = localDate30.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate35 = property34.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = localDate32.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfCentury();
        org.joda.time.LocalDate localDate45 = property44.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean49 = dateTimeZone48.isFixed();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = localDate45.toDateTimeAtStartOfDay(dateTimeZone48);
        org.joda.time.DateTime dateTime52 = dateTime51.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str54 = dateTimeFieldType53.getName();
        org.joda.time.DateTime.Property property55 = dateTime52.property(dateTimeFieldType53);
        org.joda.time.DateTime dateTime56 = property55.roundFloorCopy();
        org.joda.time.DateTime.Property property57 = dateTime56.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime56.getZone();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean62 = dateTimeZone61.isFixed();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone61);
        java.util.TimeZone timeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.DateTime dateTime66 = localDate63.toDateTimeAtMidnight(dateTimeZone65);
        int int67 = dateTime66.getMonthOfYear();
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        org.joda.time.DateTime dateTime70 = dateTime66.toDateTime(dateTimeZone69);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone69);
        long long73 = dateTimeZone58.getMillisKeepLocal(dateTimeZone69, (long) 7);
        org.joda.time.DateTime dateTime74 = dateTime42.toDateTime(dateTimeZone69);
        org.joda.time.DateTime dateTime75 = dateTime21.toDateTime(dateTimeZone69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter9.withZone(dateTimeZone69);
        java.lang.Integer int77 = dateTimeFormatter76.getPivotYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime74", (dateTime42.compareTo(dateTime74) == 0) == dateTime42.equals(dateTime74));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property24.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean29 = dateTimeZone28.isFixed();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtStartOfDay(dateTimeZone28);
        org.joda.time.LocalDate localDate33 = localDate25.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property34 = localDate25.dayOfMonth();
        org.joda.time.LocalDate localDate35 = property34.withMaximumValue();
        org.joda.time.LocalDate localDate36 = property34.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone39);
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.DateTime dateTime44 = localDate41.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = localDate36.toDateTimeAtStartOfDay(dateTimeZone43);
        boolean boolean47 = dateTimeZone43.isStandardOffset((-1L));
        long long49 = dateTimeZone43.previousTransition(0L);
        org.joda.time.DateTime dateTime50 = dateTime16.withZone(dateTimeZone43);
        java.lang.String str52 = dateTimeZone43.getNameKey(378691200100L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime37.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime37.getZone();
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.lang.String str43 = locale42.getScript();
        java.lang.String str44 = locale42.getDisplayName();
        java.lang.String str45 = dateTimeZone40.getName(9L, locale42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str26 = dateTimeFieldType25.getName();
        org.joda.time.DateTime.Property property27 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTime dateTime28 = property27.roundFloorCopy();
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime28.getZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone33);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTime dateTime38 = localDate35.toDateTimeAtMidnight(dateTimeZone37);
        int int39 = dateTime38.getMonthOfYear();
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime(dateTimeZone41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        long long45 = dateTimeZone30.getMillisKeepLocal(dateTimeZone41, (long) 7);
        org.joda.time.DateTime dateTime46 = dateTime14.toDateTime(dateTimeZone41);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DateTime.Property property48 = dateTime46.property(dateTimeFieldType47);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime46.getZone();
        java.util.Locale.Category category51 = java.util.Locale.Category.FORMAT;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property53 = localDate52.yearOfCentury();
        org.joda.time.LocalDate.Property property54 = localDate52.yearOfCentury();
        org.joda.time.LocalDate localDate56 = property54.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField57 = property54.getField();
        long long60 = dateTimeField57.addWrapField((long) 2, (int) (byte) 10);
        org.joda.time.ReadablePartial readablePartial61 = null;
        java.util.Locale locale64 = new java.util.Locale("");
        java.lang.String str65 = dateTimeField57.getAsShortText(readablePartial61, 0, locale64);
        java.util.Locale.setDefault(category51, locale64);
        java.util.Locale locale67 = java.util.Locale.getDefault(category51);
        java.util.Locale locale68 = java.util.Locale.getDefault(category51);
        java.util.Locale locale69 = java.util.Locale.getDefault(category51);
        java.lang.String str70 = dateTimeZone49.getName((-27895795143830L), locale69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime46", (dateTime14.compareTo(dateTime46) == 0) == dateTime14.equals(dateTime46));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        java.util.Locale locale8 = new java.util.Locale("70", "hi!");
        int int9 = property1.getMaximumShortTextLength(locale8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean13 = dateTimeZone12.isFixed();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone12);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTime dateTime17 = localDate14.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillis((long) 32772);
        int int20 = dateTime17.getWeekOfWeekyear();
        int int21 = dateTime17.getSecondOfDay();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property23 = localDate22.yearOfCentury();
        org.joda.time.LocalDate localDate24 = property23.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDate24.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.DateTime dateTime31 = dateTime30.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str33 = dateTimeFieldType32.getName();
        org.joda.time.DateTime.Property property34 = dateTime31.property(dateTimeFieldType32);
        org.joda.time.DateTime dateTime35 = property34.roundFloorCopy();
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone39);
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.DateTime dateTime44 = localDate41.toDateTimeAtMidnight(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime35.toMutableDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime47 = dateTime35.withMinuteOfHour(11);
        boolean boolean48 = dateTime17.isBefore((org.joda.time.ReadableInstant) dateTime47);
        int int49 = property1.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.LocalDate localDate50 = property1.withMinimumValue();
        org.joda.time.LocalDate localDate51 = property1.withMaximumValue();
        org.joda.time.LocalDate localDate52 = property1.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and mutableDateTime45", (dateTime35.compareTo(mutableDateTime45) == 0) == dateTime35.equals(mutableDateTime45));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(32772);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDate5.getFieldType(0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTime dateTime23 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 32772);
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded(readableDuration30, 292278994);
        java.util.Date date33 = dateTime27.toDate();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property35 = localDate34.yearOfCentury();
        org.joda.time.LocalDate localDate36 = property35.getLocalDate();
        org.joda.time.LocalDate localDate38 = localDate36.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property40 = localDate39.yearOfCentury();
        org.joda.time.LocalDate localDate41 = property40.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean45 = dateTimeZone44.isFixed();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = localDate41.toDateTimeAtStartOfDay(dateTimeZone44);
        org.joda.time.DateTime dateTime48 = localDate38.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property50 = localDate49.yearOfCentury();
        org.joda.time.LocalDate localDate51 = property50.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean55 = dateTimeZone54.isFixed();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone54);
        org.joda.time.DateTime dateTime57 = localDate51.toDateTimeAtStartOfDay(dateTimeZone54);
        org.joda.time.DateTime dateTime58 = dateTime57.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str60 = dateTimeFieldType59.getName();
        org.joda.time.DateTime.Property property61 = dateTime58.property(dateTimeFieldType59);
        org.joda.time.DateTime dateTime62 = property61.roundFloorCopy();
        org.joda.time.DateTime.Property property63 = dateTime62.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime62.getZone();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean68 = dateTimeZone67.isFixed();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone67);
        java.util.TimeZone timeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        org.joda.time.DateTime dateTime72 = localDate69.toDateTimeAtMidnight(dateTimeZone71);
        int int73 = dateTime72.getMonthOfYear();
        java.util.TimeZone timeZone74 = null;
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forTimeZone(timeZone74);
        org.joda.time.DateTime dateTime76 = dateTime72.toDateTime(dateTimeZone75);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone75);
        long long79 = dateTimeZone64.getMillisKeepLocal(dateTimeZone75, (long) 7);
        org.joda.time.DateTime dateTime80 = dateTime48.toDateTime(dateTimeZone75);
        org.joda.time.DateTime dateTime81 = dateTime27.toDateTime(dateTimeZone75);
        org.joda.time.LocalDate localDate82 = new org.joda.time.LocalDate(dateTimeZone75);
        java.lang.String str83 = dateTimeZone75.toString();
        org.joda.time.Interval interval84 = localDate5.toInterval(dateTimeZone75);
        org.joda.time.LocalDate localDate86 = localDate5.plusMonths(7);
        org.joda.time.Chronology chronology87 = localDate5.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and dateTime80", (dateTime48.compareTo(dateTime80) == 0) == dateTime48.equals(dateTime80));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        boolean boolean29 = dateTime28.isBeforeNow();
        int int30 = dateTime28.getDayOfYear();
        boolean boolean31 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime.Property property32 = dateTime28.dayOfYear();
        java.lang.String str33 = property32.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(dateTimeZone21);
        int int24 = dateTime13.getMillisOfDay();
        int int25 = dateTime13.getMonthOfYear();
        org.joda.time.Instant instant26 = dateTime13.toInstant();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.DateTime dateTime34 = localDate31.toDateTimeAtMidnight(dateTimeZone33);
        java.lang.String str35 = dateTime34.toString();
        org.joda.time.DateMidnight dateMidnight36 = dateTime34.toDateMidnight();
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        int int38 = dateTime34.getMinuteOfHour();
        boolean boolean39 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant26", (mutableDateTime23.compareTo(instant26) == 0) == mutableDateTime23.equals(instant26));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        org.joda.time.DateTime dateTime16 = property14.addToCopy(42);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfCentury();
        org.joda.time.LocalDate localDate19 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = dateTime25.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str28 = dateTimeFieldType27.getName();
        org.joda.time.DateTime.Property property29 = dateTime26.property(dateTimeFieldType27);
        boolean boolean31 = dateTime26.equals((java.lang.Object) 'u');
        boolean boolean32 = dateTime16.isBefore((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property34 = dateTime16.property(dateTimeFieldType33);
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType33.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.LocalDate.Property property41 = localDate40.centuryOfEra();
        org.joda.time.Chronology chronology42 = localDate40.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.eras();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.era();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.secondOfDay();
        org.joda.time.DurationField durationField46 = durationFieldType35.getField(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField46, and durationField43", !(durationField43.compareTo(durationField46) == 0) || (Math.signum(durationField43.compareTo(durationField43)) == Math.signum(durationField46.compareTo(durationField43))));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.era();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime9.toDateTime(chronology31);
        java.util.Date date33 = dateTime32.toDate();
        date33.setYear((int) (short) 0);
        date33.setDate((int) (byte) 100);
        int int38 = date33.getDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime37.toMutableDateTime();
        int int40 = mutableDateTime39.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 292278994);
        java.util.Date date17 = dateTime11.toDate();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfCentury();
        org.joda.time.LocalDate localDate20 = property19.getLocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property24.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean29 = dateTimeZone28.isFixed();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtStartOfDay(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = localDate22.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate35 = property34.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime41.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str44 = dateTimeFieldType43.getName();
        org.joda.time.DateTime.Property property45 = dateTime42.property(dateTimeFieldType43);
        org.joda.time.DateTime dateTime46 = property45.roundFloorCopy();
        org.joda.time.DateTime.Property property47 = dateTime46.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime46.getZone();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean52 = dateTimeZone51.isFixed();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone51);
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        org.joda.time.DateTime dateTime56 = localDate53.toDateTimeAtMidnight(dateTimeZone55);
        int int57 = dateTime56.getMonthOfYear();
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        org.joda.time.DateTime dateTime60 = dateTime56.toDateTime(dateTimeZone59);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone59);
        long long63 = dateTimeZone48.getMillisKeepLocal(dateTimeZone59, (long) 7);
        org.joda.time.DateTime dateTime64 = dateTime32.toDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime65 = dateTime11.toDateTime(dateTimeZone59);
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate(dateTimeZone59);
        java.lang.String str67 = dateTimeZone59.toString();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean74 = dateTimeZone73.isFixed();
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone73);
        java.util.TimeZone timeZone76 = null;
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forTimeZone(timeZone76);
        org.joda.time.DateTime dateTime78 = localDate75.toDateTimeAtCurrentTime(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime78.withMillis((long) 32772);
        org.joda.time.DateTime dateTime82 = dateTime80.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property83 = dateTime82.year();
        long long84 = property83.remainder();
        org.joda.time.DurationField durationField85 = property83.getDurationField();
        java.util.Locale locale86 = java.util.Locale.FRANCE;
        java.lang.String str87 = locale86.getCountry();
        java.util.Locale locale88 = locale86.stripExtensions();
        java.lang.String str89 = property83.getAsText(locale86);
        java.lang.String str90 = dateTimeZone68.getShortName(34522218L, locale86);
        long long92 = dateTimeZone59.getMillisKeepLocal(dateTimeZone68, 1644508800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime64", (dateTime32.compareTo(dateTime64) == 0) == dateTime32.equals(dateTime64));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean7 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear(17);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean13 = dateTimeZone12.isFixed();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone12);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTime dateTime17 = localDate14.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillis((long) 32772);
        org.joda.time.DateTime dateTime21 = dateTime19.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 292278994);
        java.util.Date date27 = dateTime21.toDate();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property29 = localDate28.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.getLocalDate();
        org.joda.time.LocalDate localDate32 = localDate30.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate35 = property34.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = localDate32.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfCentury();
        org.joda.time.LocalDate localDate45 = property44.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean49 = dateTimeZone48.isFixed();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = localDate45.toDateTimeAtStartOfDay(dateTimeZone48);
        org.joda.time.DateTime dateTime52 = dateTime51.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str54 = dateTimeFieldType53.getName();
        org.joda.time.DateTime.Property property55 = dateTime52.property(dateTimeFieldType53);
        org.joda.time.DateTime dateTime56 = property55.roundFloorCopy();
        org.joda.time.DateTime.Property property57 = dateTime56.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime56.getZone();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean62 = dateTimeZone61.isFixed();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone61);
        java.util.TimeZone timeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.DateTime dateTime66 = localDate63.toDateTimeAtMidnight(dateTimeZone65);
        int int67 = dateTime66.getMonthOfYear();
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        org.joda.time.DateTime dateTime70 = dateTime66.toDateTime(dateTimeZone69);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone69);
        long long73 = dateTimeZone58.getMillisKeepLocal(dateTimeZone69, (long) 7);
        org.joda.time.DateTime dateTime74 = dateTime42.toDateTime(dateTimeZone69);
        org.joda.time.DateTime dateTime75 = dateTime21.toDateTime(dateTimeZone69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter9.withZone(dateTimeZone69);
        org.joda.time.format.DateTimeParser dateTimeParser77 = dateTimeFormatter76.getParser();
        org.joda.time.DateTimeZone dateTimeZone78 = dateTimeFormatter76.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime74", (dateTime42.compareTo(dateTime74) == 0) == dateTime42.equals(dateTime74));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 6);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) 10);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property12.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str15 = property12.getAsString();
        org.joda.time.LocalDate localDate16 = property12.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        boolean boolean23 = localDate21.isSupported(durationFieldType22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        boolean boolean34 = dateTime32.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Interval interval40 = interval38.withChronology(chronology39);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property42 = localDate41.yearOfCentury();
        org.joda.time.LocalDate localDate43 = property42.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean47 = dateTimeZone46.isFixed();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = localDate43.toDateTimeAtStartOfDay(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = dateTime49.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property51 = dateTime50.year();
        boolean boolean52 = interval40.contains((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Period period53 = interval40.toPeriod();
        org.joda.time.DateTime dateTime55 = dateTime32.withPeriodAdded((org.joda.time.ReadablePeriod) period53, 360240000);
        org.joda.time.LocalDate localDate56 = localDate21.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.LocalDate localDate57 = localDate16.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Chronology chronology58 = localDate16.getChronology();
        org.joda.time.DateTime dateTime59 = dateTime9.withChronology(chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.weekOfWeekyear();
        org.joda.time.DateTime dateTime61 = property60.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime59", (dateTime9.compareTo(dateTime59) == 0) == dateTime9.equals(dateTime59));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) 70);
        calendar3.set(10, 32772, (int) (byte) 1, 22, 0);
        int int12 = calendar3.getFirstDayOfWeek();
        boolean boolean13 = calendar3.isWeekDateSupported();
        int int14 = calendar3.getMinimalDaysInFirstWeek();
        java.util.Calendar.Builder builder15 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder17 = builder15.setInstant((long) 32770);
        java.util.Calendar calendar18 = builder17.build();
        boolean boolean20 = calendar18.after((java.lang.Object) 70);
        calendar18.set(10, 32772, (int) (byte) 1, 22, 0);
        long long27 = calendar18.getTimeInMillis();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property29 = localDate28.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.DateTime dateTime36 = localDate30.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str39 = dateTimeFieldType38.getName();
        org.joda.time.DateTime.Property property40 = dateTime37.property(dateTimeFieldType38);
        org.joda.time.DateTime dateTime41 = property40.roundFloorCopy();
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime41.getZone();
        java.util.TimeZone timeZone44 = dateTimeZone43.toTimeZone();
        calendar18.setTimeZone(timeZone44);
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        java.util.Locale.Builder builder48 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder50 = builder48.removeUnicodeLocaleAttribute("eras");
        java.util.Locale locale51 = builder50.build();
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone44, locale51);
        calendar3.setTimeZone(timeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar46 and calendar52", (calendar46.compareTo(calendar52) == 0) == calendar46.equals(calendar52));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight(dateTimeZone6);
        int int8 = dateTime7.getMonthOfYear();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTime dateTime11 = dateTime7.toDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withMillis((long) 32772);
        org.joda.time.DateTime dateTime26 = dateTime24.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime28 = dateTime26.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withDurationAdded(readableDuration29, 292278994);
        org.joda.time.DateTime dateTime33 = dateTime31.minusSeconds(8);
        org.joda.time.Instant instant34 = dateTime31.toInstant();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        int int36 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) instant34);
        long long38 = dateTimeZone10.previousTransition(2678400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant34", (dateTime26.compareTo(instant34) == 0) == dateTime26.equals(instant34));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.plusYears(1970);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime12.toDateTime(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime17", (dateTime12.compareTo(dateTime17) == 0) == dateTime12.equals(dateTime17));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        java.util.Calendar.Builder builder7 = builder2.setWeekDate((int) (short) 0, 32772, (-292275054));
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.lang.String str9 = locale8.getCountry();
        java.lang.String str10 = locale8.getDisplayCountry();
        java.util.Calendar.Builder builder11 = builder2.setLocale(locale8);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property13 = localDate12.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime20.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str23 = dateTimeFieldType22.getName();
        org.joda.time.DateTime.Property property24 = dateTime21.property(dateTimeFieldType22);
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.DateTimeField dateTimeField26 = property24.getField();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property28 = localDate27.yearOfCentury();
        org.joda.time.LocalDate.Property property29 = localDate27.yearOfCentury();
        org.joda.time.LocalDate localDate31 = property29.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField32 = property29.getField();
        int int34 = dateTimeField32.get((long) 'u');
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.lang.String str37 = dateTimeField32.getAsText((long) 5, locale36);
        int int38 = property24.getMaximumTextLength(locale36);
        java.util.Calendar.Builder builder39 = builder2.setLocale(locale36);
        java.util.Calendar.Builder builder40 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder42 = builder40.setInstant((long) 32770);
        java.util.Calendar calendar43 = builder42.build();
        boolean boolean45 = calendar43.after((java.lang.Object) 70);
        calendar43.set(10, 32772, (int) (byte) 1, 22, 0);
        long long52 = calendar43.getTimeInMillis();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property54 = localDate53.yearOfCentury();
        org.joda.time.LocalDate localDate55 = property54.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean59 = dateTimeZone58.isFixed();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone58);
        org.joda.time.DateTime dateTime61 = localDate55.toDateTimeAtStartOfDay(dateTimeZone58);
        org.joda.time.DateTime dateTime62 = dateTime61.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str64 = dateTimeFieldType63.getName();
        org.joda.time.DateTime.Property property65 = dateTime62.property(dateTimeFieldType63);
        org.joda.time.DateTime dateTime66 = property65.roundFloorCopy();
        org.joda.time.DateTime.Property property67 = dateTime66.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime66.getZone();
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        calendar43.setTimeZone(timeZone69);
        java.util.Locale locale71 = java.util.Locale.FRENCH;
        java.lang.String str72 = locale71.toLanguageTag();
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(timeZone69, locale71);
        java.util.Calendar.Builder builder74 = builder39.setTimeZone(timeZone69);
        java.util.Calendar.Builder builder78 = builder74.setTimeOfDay(1, (int) '#', 14);
        org.joda.time.LocalDate localDate79 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property80 = localDate79.yearOfCentury();
        org.joda.time.LocalDate localDate81 = property80.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean85 = dateTimeZone84.isFixed();
        org.joda.time.LocalDate localDate86 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone84);
        org.joda.time.DateTime dateTime87 = localDate81.toDateTimeAtStartOfDay(dateTimeZone84);
        org.joda.time.DateTime dateTime88 = dateTime87.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str90 = dateTimeFieldType89.getName();
        org.joda.time.DateTime.Property property91 = dateTime88.property(dateTimeFieldType89);
        org.joda.time.DateTime dateTime92 = property91.roundFloorCopy();
        org.joda.time.DateTime.Property property93 = dateTime92.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone94 = dateTime92.getZone();
        java.util.TimeZone timeZone95 = dateTimeZone94.toTimeZone();
        java.util.Calendar calendar96 = java.util.Calendar.getInstance(timeZone95);
        java.util.Calendar.Builder builder97 = builder74.setTimeZone(timeZone95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar73 and calendar96", (calendar73.compareTo(calendar96) == 0) == calendar73.equals(calendar96));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        java.lang.String str4 = chronology2.toString();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(chronology2);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((-1L), (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTime dateTime18 = localDate15.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withMillis((long) 32772);
        org.joda.time.DateTime dateTime22 = dateTime20.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 292278994);
        java.util.Date date28 = dateTime22.toDate();
        java.util.GregorianCalendar gregorianCalendar29 = dateTime22.toGregorianCalendar();
        boolean boolean30 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property31 = dateTime7.secondOfDay();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean36 = dateTimeZone35.isFixed();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int40 = dateTimeZone38.getOffsetFromLocal((long) 6);
        long long42 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        org.joda.time.Interval interval43 = localDate33.toInterval(dateTimeZone35);
        org.joda.time.DateTime dateTime44 = localDate32.toDateTimeAtMidnight(dateTimeZone35);
        long long48 = dateTimeZone35.convertLocalToUTC(11L, false, 0L);
        org.joda.time.DateTime dateTime49 = dateTime7.toDateTime(dateTimeZone35);
        org.joda.time.Interval interval50 = localDate5.toInterval(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime49", (dateTime7.compareTo(dateTime49) == 0) == dateTime7.equals(dateTime49));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(localTime13);
        int int15 = localDate12.getEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(57);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime18", (dateTime14.compareTo(dateTime18) == 0) == dateTime14.equals(dateTime18));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        int int15 = dateTime11.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTimeISO();
        java.util.Calendar.Builder builder17 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder19 = builder17.setInstant((long) 32770);
        java.util.Calendar calendar20 = builder19.build();
        boolean boolean22 = calendar20.after((java.lang.Object) 70);
        long long23 = calendar20.getTimeInMillis();
        calendar20.setTimeInMillis(0L);
        boolean boolean26 = mutableDateTime16.equals((java.lang.Object) calendar20);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property28 = localDate27.yearOfCentury();
        org.joda.time.LocalDate localDate29 = property28.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean33 = dateTimeZone32.isFixed();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone32);
        org.joda.time.DateTime dateTime35 = localDate29.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.DateTime dateTime36 = dateTime35.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str38 = dateTimeFieldType37.getName();
        org.joda.time.DateTime.Property property39 = dateTime36.property(dateTimeFieldType37);
        org.joda.time.DateTime dateTime40 = property39.roundFloorCopy();
        org.joda.time.DateTime.Property property41 = dateTime40.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime40.getZone();
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone43);
        calendar20.setTimeZone(timeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant13", (dateTime11.compareTo(instant13) == 0) == dateTime11.equals(instant13));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.era();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType0.getField(chronology4);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = localDate12.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.LocalDate localDate24 = localDate12.minusYears(10);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale28.getCountry();
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getLanguage();
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.util.Locale locale37 = java.util.Locale.TAIWAN;
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.util.Locale locale40 = new java.util.Locale("");
        java.lang.String str41 = locale40.getLanguage();
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.lang.String str45 = locale44.getCountry();
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale34, locale36, locale37, locale38, locale40, locale42, locale43, locale44, locale46 };
        java.util.ArrayList<java.util.Locale> localeList48 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList48, localeArray47);
        java.util.Locale locale50 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList48);
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strSet52);
        boolean boolean54 = localDate12.equals((java.lang.Object) strList53);
        long long56 = chronology4.set((org.joda.time.ReadablePartial) localDate12, 1000L);
        org.joda.time.DurationField durationField57 = chronology4.minutes();
        org.joda.time.DurationField durationField58 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField59 = chronology4.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField57 and durationField58", Math.signum(durationField57.compareTo(durationField58)) == -Math.signum(durationField58.compareTo(durationField57)));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears(3);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        boolean boolean24 = dateTime22.isEqual((long) 1056);
        org.joda.time.DateTime dateTime26 = dateTime22.plusDays(17724494);
        int int27 = dateTime26.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property24.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean29 = dateTimeZone28.isFixed();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtStartOfDay(dateTimeZone28);
        org.joda.time.LocalDate localDate33 = localDate25.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property34 = localDate25.dayOfMonth();
        org.joda.time.LocalDate localDate35 = property34.withMaximumValue();
        org.joda.time.LocalDate localDate36 = property34.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone39);
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.DateTime dateTime44 = localDate41.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = localDate36.toDateTimeAtStartOfDay(dateTimeZone43);
        boolean boolean47 = dateTimeZone43.isStandardOffset((-1L));
        long long49 = dateTimeZone43.previousTransition(0L);
        org.joda.time.DateTime dateTime50 = dateTime16.withZone(dateTimeZone43);
        org.joda.time.LocalDate localDate51 = org.joda.time.LocalDate.now(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.DateTime dateTime23 = dateTime16.toDateTimeISO();
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime22", (dateTime24.compareTo(dateTime22) == 0) == dateTime24.equals(dateTime22));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        boolean boolean24 = dateTime22.isEqual((long) 1056);
        java.util.Date date25 = dateTime22.toDate();
        int int26 = date25.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.DateTimeZone dateTimeZone23 = chronology19.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone7);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 32772);
        org.joda.time.DateTime dateTime16 = dateTime14.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Interval interval24 = interval22.withChronology(chronology23);
        org.joda.time.Duration duration25 = interval22.toDuration();
        org.joda.time.DateTime dateTime26 = dateTime18.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateTime dateTime29 = dateTime26.withDurationAdded((long) ' ', (int) (byte) 100);
        int int30 = dateTime26.getSecondOfDay();
        org.joda.time.DateTime dateTime32 = dateTime26.plusMonths(57);
        org.joda.time.DateTime dateTime34 = dateTime26.plusMinutes(16);
        boolean boolean35 = dateTime26.isAfterNow();
        org.joda.time.Instant instant36 = dateTime26.toInstant();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property38 = localDate37.yearOfCentury();
        org.joda.time.LocalDate localDate39 = property38.getLocalDate();
        org.joda.time.LocalDate localDate41 = localDate39.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate43 = localDate39.minusYears(11);
        int int44 = localDate43.getYear();
        org.joda.time.LocalDate localDate46 = localDate43.plusDays(100);
        org.joda.time.LocalDate.Property property47 = localDate46.weekyear();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean50 = dateTimeZone49.isFixed();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int54 = dateTimeZone52.getOffsetFromLocal((long) 6);
        long long56 = dateTimeZone49.getMillisKeepLocal(dateTimeZone52, (long) 10);
        long long58 = dateTimeZone52.nextTransition((long) 'u');
        java.lang.String str59 = dateTimeZone52.toString();
        org.joda.time.DateMidnight dateMidnight60 = localDate46.toDateMidnight(dateTimeZone52);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property62 = localDate61.yearOfCentury();
        org.joda.time.LocalDate localDate63 = property62.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean67 = dateTimeZone66.isFixed();
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone66);
        org.joda.time.DateTime dateTime69 = localDate63.toDateTimeAtStartOfDay(dateTimeZone66);
        org.joda.time.DateTime dateTime70 = dateTime69.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate71 = dateTime69.toLocalDate();
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property73 = localDate72.yearOfCentury();
        org.joda.time.LocalDate localDate74 = property73.getLocalDate();
        java.lang.String str75 = property73.getName();
        long long76 = property73.remainder();
        int int77 = property73.getMinimumValue();
        org.joda.time.LocalDate localDate78 = property73.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property73.getFieldType();
        boolean boolean80 = localDate71.isSupported(dateTimeFieldType79);
        org.joda.time.DurationFieldType durationFieldType81 = dateTimeFieldType79.getRangeDurationType();
        boolean boolean82 = localDate46.isSupported(dateTimeFieldType79);
        int int83 = instant36.get(dateTimeFieldType79);
        boolean boolean84 = localDate4.isSupported(dateTimeFieldType79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant36", (dateTime26.compareTo(instant36) == 0) == dateTime26.equals(instant36));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime9.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.weekyearOfCentury();
        org.joda.time.DurationField durationField18 = chronology14.halfdays();
        org.joda.time.DurationField durationField19 = chronology14.eras();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(localTime13);
        int int15 = localDate12.getEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(57);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtCurrentTime(dateTimeZone17);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("allemand");
        java.util.Calendar calendar21 = dateTime18.toCalendar(locale20);
        java.lang.String str22 = locale20.getLanguage();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime18", (dateTime14.compareTo(dateTime18) == 0) == dateTime14.equals(dateTime18));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate9 = property8.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean13 = dateTimeZone12.isFixed();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDate9.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        boolean boolean17 = dateTime15.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Interval interval23 = interval21.withChronology(chronology22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime32.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property34 = dateTime33.year();
        boolean boolean35 = interval23.contains((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Period period36 = interval23.toPeriod();
        org.joda.time.DateTime dateTime38 = dateTime15.withPeriodAdded((org.joda.time.ReadablePeriod) period36, 360240000);
        org.joda.time.LocalDate localDate39 = localDate4.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Interval interval40 = localDate4.toInterval();
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        java.util.Calendar.Builder builder42 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder44 = builder42.setInstant((long) 32770);
        java.util.Calendar calendar45 = builder42.build();
        java.util.TimeZone timeZone46 = calendar45.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.DateTime dateTime48 = dateTime41.withZone(dateTimeZone47);
        java.lang.String str50 = dateTimeZone47.getShortName(1643313600000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime48", (dateTime41.compareTo(dateTime48) == 0) == dateTime41.equals(dateTime48));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        int int15 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = dateTime11.withDurationAdded(536457600013L, 42);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfCentury();
        org.joda.time.LocalDate.Property property21 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property21.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate24 = property21.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone27);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTime dateTime32 = localDate29.toDateTimeAtMidnight(dateTimeZone31);
        int int33 = dateTime32.getMonthOfYear();
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTime dateTime36 = dateTime32.toDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = localDate24.toDateTimeAtStartOfDay(dateTimeZone35);
        java.util.Locale locale43 = new java.util.Locale("weekOfWeekyear", "1969-12", "");
        java.lang.String str44 = locale43.getCountry();
        java.util.Locale locale46 = new java.util.Locale("");
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property48 = localDate47.yearOfCentury();
        org.joda.time.LocalDate.Property property49 = localDate47.yearOfCentury();
        org.joda.time.LocalDate localDate51 = property49.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField52 = property49.getField();
        int int54 = dateTimeField52.get((long) 'u');
        java.util.Locale locale56 = java.util.Locale.TAIWAN;
        java.lang.String str57 = dateTimeField52.getAsText((long) 5, locale56);
        java.lang.String str58 = locale46.getDisplayVariant(locale56);
        java.lang.String str59 = locale56.getDisplayLanguage();
        java.lang.String str60 = locale43.getDisplayName(locale56);
        java.lang.String str61 = dateTimeZone35.getName((long) (short) 10, locale43);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime18.toMutableDateTime(dateTimeZone35);
        org.joda.time.Chronology chronology63 = mutableDateTime62.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant13", (dateTime11.compareTo(instant13) == 0) == dateTime11.equals(instant13));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.DateTime dateTime23 = dateTime16.toDateTimeISO();
        org.joda.time.DateTime dateTime25 = dateTime23.withMillisOfDay(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime22", (dateTime23.compareTo(dateTime22) == 0) == dateTime23.equals(dateTime22));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 6);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) 10);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property12.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str15 = property12.getAsString();
        org.joda.time.LocalDate localDate16 = property12.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        boolean boolean23 = localDate21.isSupported(durationFieldType22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        boolean boolean34 = dateTime32.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Interval interval40 = interval38.withChronology(chronology39);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property42 = localDate41.yearOfCentury();
        org.joda.time.LocalDate localDate43 = property42.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean47 = dateTimeZone46.isFixed();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = localDate43.toDateTimeAtStartOfDay(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = dateTime49.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property51 = dateTime50.year();
        boolean boolean52 = interval40.contains((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Period period53 = interval40.toPeriod();
        org.joda.time.DateTime dateTime55 = dateTime32.withPeriodAdded((org.joda.time.ReadablePeriod) period53, 360240000);
        org.joda.time.LocalDate localDate56 = localDate21.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.LocalDate localDate57 = localDate16.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Chronology chronology58 = localDate16.getChronology();
        org.joda.time.DateTime dateTime59 = dateTime9.withChronology(chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.weekOfWeekyear();
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleAttributes();
        int int63 = property60.getMaximumTextLength(locale61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime59", (dateTime9.compareTo(dateTime59) == 0) == dateTime9.equals(dateTime59));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = yearMonth4.toInterval(dateTimeZone5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = yearMonth4.getFieldTypes();
        org.joda.time.YearMonth.Property property8 = yearMonth4.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = yearMonth4.toString(dateTimeFormatter9);
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = yearMonth12.toInterval(dateTimeZone13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = yearMonth12.getFieldTypes();
        org.joda.time.YearMonth.Property property16 = yearMonth12.year();
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = yearMonth20.toInterval(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.Interval interval24 = interval22.withPeriodAfterStart(readablePeriod23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = interval24.toPeriod(periodType25);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean28 = period26.isSupported(durationFieldType27);
        org.joda.time.YearMonth yearMonth30 = yearMonth18.withPeriodAdded((org.joda.time.ReadablePeriod) period26, 32770);
        org.joda.time.YearMonth yearMonth31 = yearMonth12.minus((org.joda.time.ReadablePeriod) period26);
        boolean boolean32 = yearMonth4.isAfter((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.Chronology chronology33 = yearMonth31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter2.withChronology(chronology33);
        org.joda.time.DurationField durationField36 = chronology33.months();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.monthOfYear();
        org.joda.time.YearMonth yearMonth39 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.Interval interval41 = yearMonth39.toInterval(dateTimeZone40);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray42 = yearMonth39.getFieldTypes();
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = yearMonth44.toInterval(dateTimeZone45);
        org.joda.time.YearMonth yearMonth48 = yearMonth44.minusMonths((int) (short) 1);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonth yearMonth50 = yearMonth48.withChronologyRetainFields(chronology49);
        int int51 = yearMonth39.compareTo((org.joda.time.ReadablePartial) yearMonth50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.YearMonth yearMonth53 = yearMonth50.minus(readablePeriod52);
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.Interval interval57 = yearMonth55.toInterval(dateTimeZone56);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray58 = yearMonth55.getFieldTypes();
        org.joda.time.YearMonth.Property property59 = yearMonth55.year();
        java.lang.String str60 = property59.toString();
        org.joda.time.YearMonth yearMonth61 = property59.getYearMonth();
        int[] intArray62 = yearMonth61.getValues();
        chronology33.validate((org.joda.time.ReadablePartial) yearMonth53, intArray62);
        org.joda.time.DateTimeField dateTimeField64 = chronology33.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField65 = chronology33.dayOfMonth();
        long long69 = chronology33.add((long) 2, (long) 21597772, (int) '#');
        org.joda.time.DurationField durationField70 = chronology33.eras();
        org.joda.time.YearMonth yearMonth71 = new org.joda.time.YearMonth(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField36 and durationField70", Math.signum(durationField36.compareTo(durationField70)) == -Math.signum(durationField70.compareTo(durationField36)));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        org.joda.time.DateTime dateTime15 = property14.withMinimumValue();
        org.joda.time.DateTime dateTime17 = property14.setCopy(20);
        org.joda.time.DateTime dateTime19 = property14.setCopy((int) (byte) -1);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.LocalDate localDate30 = localDate22.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property31 = localDate22.dayOfMonth();
        org.joda.time.LocalDate localDate32 = property31.withMaximumValue();
        org.joda.time.LocalTime localTime33 = null;
        org.joda.time.DateTime dateTime34 = localDate32.toDateTime(localTime33);
        int int35 = localDate32.getEra();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(57);
        org.joda.time.DateTime dateTime38 = localDate32.toDateTimeAtCurrentTime(dateTimeZone37);
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("allemand");
        java.util.Calendar calendar41 = dateTime38.toCalendar(locale40);
        java.lang.String str42 = property14.getAsShortText(locale40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and dateTime38", (dateTime34.compareTo(dateTime38) == 0) == dateTime34.equals(dateTime38));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property2 = localDate1.yearOfCentury();
        org.joda.time.LocalDate localDate3 = property2.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.Chronology chronology11 = dateTime9.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = dateTime22.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str25 = dateTimeFieldType24.getName();
        org.joda.time.DateTime.Property property26 = dateTime23.property(dateTimeFieldType24);
        org.joda.time.DateTime dateTime27 = property26.roundFloorCopy();
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime27.getZone();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.Chronology chronology31 = chronology11.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField32 = chronology11.seconds();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType0.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField34 = chronology11.weekyear();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.DateTime dateTime43 = localDate40.toDateTimeAtMidnight(dateTimeZone42);
        int int44 = dateTime43.getMonthOfYear();
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.DateTime dateTime47 = dateTime43.toDateTime(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime47.getZone();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 15, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.plusMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(365);
        org.joda.time.DateTime dateTime54 = dateTime51.withZone(dateTimeZone53);
        org.joda.time.Chronology chronology55 = chronology11.withZone(dateTimeZone53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and dateTime54", (dateTime49.compareTo(dateTime54) == 0) == dateTime49.equals(dateTime54));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(localTime13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTime dateTime23 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 32772);
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime25.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfCentury();
        org.joda.time.LocalDate localDate33 = property32.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean37 = dateTimeZone36.isFixed();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone36);
        org.joda.time.DateTime dateTime39 = localDate33.toDateTimeAtStartOfDay(dateTimeZone36);
        org.joda.time.DateTime dateTime40 = dateTime39.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str42 = dateTimeFieldType41.getName();
        org.joda.time.DateTime.Property property43 = dateTime40.property(dateTimeFieldType41);
        org.joda.time.DateTime dateTime44 = property43.roundFloorCopy();
        org.joda.time.DateTime.Property property45 = dateTime44.year();
        org.joda.time.DateTime dateTime47 = property45.addToCopy(42);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property49 = localDate48.yearOfCentury();
        org.joda.time.LocalDate localDate50 = property49.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean54 = dateTimeZone53.isFixed();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = localDate50.toDateTimeAtStartOfDay(dateTimeZone53);
        org.joda.time.DateTime dateTime57 = dateTime56.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str59 = dateTimeFieldType58.getName();
        org.joda.time.DateTime.Property property60 = dateTime57.property(dateTimeFieldType58);
        boolean boolean62 = dateTime57.equals((java.lang.Object) 'u');
        boolean boolean63 = dateTime47.isBefore((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property65 = dateTime47.property(dateTimeFieldType64);
        boolean boolean66 = dateTime29.isSupported(dateTimeFieldType64);
        boolean boolean67 = property15.equals((java.lang.Object) dateTime29);
        org.joda.time.Instant instant68 = dateTime29.toInstant();
        org.joda.time.DateTime dateTime69 = dateTime29.toDateTimeISO();
        org.joda.time.DateTime dateTime71 = dateTime29.minusHours(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant68 and dateTime71", (instant68.compareTo(dateTime71) == 0) == instant68.equals(dateTime71));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(localTime13);
        int int15 = localDate12.getEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(57);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtCurrentTime(dateTimeZone17);
        boolean boolean19 = dateTimeZone17.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime18", (dateTime14.compareTo(dateTime18) == 0) == dateTime14.equals(dateTime18));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DateTime dateTime12 = dateTime8.plusMillis(935);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        org.joda.time.Chronology chronology23 = dateTime21.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.monthOfYear();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property27 = localDate26.yearOfCentury();
        org.joda.time.LocalDate localDate28 = property27.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = localDate28.toDateTimeAtStartOfDay(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime34.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str37 = dateTimeFieldType36.getName();
        org.joda.time.DateTime.Property property38 = dateTime35.property(dateTimeFieldType36);
        org.joda.time.DateTime dateTime39 = property38.roundFloorCopy();
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime39.getZone();
        java.util.TimeZone timeZone42 = dateTimeZone41.toTimeZone();
        org.joda.time.Chronology chronology43 = chronology23.withZone(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField44 = chronology43.clockhourOfHalfday();
        org.joda.time.DurationField durationField45 = chronology43.seconds();
        org.joda.time.DurationField durationField46 = chronology43.halfdays();
        org.joda.time.DateTime dateTime47 = dateTime12.withChronology(chronology43);
        org.joda.time.Chronology chronology48 = chronology43.withUTC();
        org.joda.time.DateTimeField dateTimeField49 = chronology43.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField50 = chronology43.era();
        org.joda.time.DurationField durationField51 = chronology43.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField51, durationField24, and durationField45", !(durationField51.compareTo(durationField24) == 0) || (Math.signum(durationField51.compareTo(durationField45)) == Math.signum(durationField24.compareTo(durationField45))));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate3 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property5 = localDate4.yearOfCentury();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean10 = dateTimeZone9.isFixed();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        org.joda.time.Chronology chronology14 = dateTime12.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology14);
        long long17 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalDate localDate19 = property1.addWrapFieldToCopy(122);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = dateTime28.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property30 = dateTime29.year();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfCentury();
        org.joda.time.LocalDate localDate33 = property32.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean37 = dateTimeZone36.isFixed();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone36);
        org.joda.time.DateTime dateTime39 = localDate33.toDateTimeAtStartOfDay(dateTimeZone36);
        org.joda.time.DateTime dateTime40 = dateTime39.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str42 = dateTimeFieldType41.getName();
        org.joda.time.DateTime.Property property43 = dateTime40.property(dateTimeFieldType41);
        org.joda.time.Interval interval44 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime46 = dateTime29.minusDays(32772);
        org.joda.time.DateTime.Property property47 = dateTime29.dayOfWeek();
        org.joda.time.DateTime dateTime49 = dateTime29.plusSeconds(13);
        org.joda.time.DateTime dateTime51 = dateTime49.plusDays(20);
        org.joda.time.DateTime dateTime53 = dateTime51.minusHours(86397);
        int int54 = property1.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean57 = dateTimeZone56.isFixed();
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property59 = localDate58.yearOfCentury();
        org.joda.time.LocalDate localDate60 = property59.getLocalDate();
        org.joda.time.LocalDate localDate62 = localDate60.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property64 = localDate63.yearOfCentury();
        org.joda.time.LocalDate localDate65 = property64.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean69 = dateTimeZone68.isFixed();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone68);
        org.joda.time.DateTime dateTime71 = localDate65.toDateTimeAtStartOfDay(dateTimeZone68);
        org.joda.time.DateTime dateTime72 = localDate62.toDateTimeAtMidnight(dateTimeZone68);
        long long74 = dateTimeZone56.getMillisKeepLocal(dateTimeZone68, (long) 9);
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(dateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean79 = dateTimeZone78.isFixed();
        org.joda.time.LocalDate localDate80 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone78);
        java.util.TimeZone timeZone81 = null;
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forTimeZone(timeZone81);
        org.joda.time.DateTime dateTime83 = localDate80.toDateTimeAtCurrentTime(dateTimeZone82);
        org.joda.time.DateTime dateTime85 = dateTime83.withMillis((long) 32772);
        org.joda.time.DateTime dateTime87 = dateTime85.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime89 = dateTime85.withSecondOfMinute((int) (short) 10);
        org.joda.time.DateTime dateTime91 = dateTime85.minusHours(32772);
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.forOffsetHours(20);
        java.lang.Object obj94 = null;
        boolean boolean95 = dateTimeZone93.equals(obj94);
        org.joda.time.DateTime dateTime96 = dateTime85.withZoneRetainFields(dateTimeZone93);
        org.joda.time.DateTime dateTime97 = dateTime75.withZone(dateTimeZone93);
        long long98 = dateTime75.getMillis();
        int int99 = property1.compareTo((org.joda.time.ReadableInstant) dateTime75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime97", (dateTime16.compareTo(dateTime97) == 0) == dateTime16.equals(dateTime97));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Interval interval19 = interval17.withChronology(chronology18);
        org.joda.time.Duration duration20 = interval17.toDuration();
        org.joda.time.DateTime dateTime21 = dateTime13.plus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.DateTime dateTime24 = dateTime21.withDurationAdded((long) ' ', (int) (byte) 100);
        int int25 = dateTime21.getSecondOfDay();
        org.joda.time.DateTime dateTime27 = dateTime21.plusMonths(57);
        org.joda.time.DateTime dateTime29 = dateTime21.plusMinutes(16);
        org.joda.time.DateTime dateTime32 = dateTime29.withDurationAdded(0L, 57);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale36 = new java.util.Locale("yearOfCentury");
        boolean boolean37 = dateTimeZone34.equals((java.lang.Object) locale36);
        org.joda.time.DateTime dateTime38 = dateTime29.withZone(dateTimeZone34);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property40 = localDate39.yearOfCentury();
        org.joda.time.LocalDate localDate41 = property40.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean45 = dateTimeZone44.isFixed();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = localDate41.toDateTimeAtStartOfDay(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime47.toMutableDateTime();
        org.joda.time.Chronology chronology49 = dateTime47.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.halfdays();
        org.joda.time.DateTimeField dateTimeField51 = chronology49.monthOfYear();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property53 = localDate52.yearOfCentury();
        org.joda.time.LocalDate localDate54 = property53.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean58 = dateTimeZone57.isFixed();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone57);
        org.joda.time.DateTime dateTime60 = localDate54.toDateTimeAtStartOfDay(dateTimeZone57);
        org.joda.time.DateTime dateTime61 = dateTime60.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str63 = dateTimeFieldType62.getName();
        org.joda.time.DateTime.Property property64 = dateTime61.property(dateTimeFieldType62);
        org.joda.time.DateTime dateTime65 = property64.roundFloorCopy();
        org.joda.time.DateTime.Property property66 = dateTime65.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone67 = dateTime65.getZone();
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        org.joda.time.Chronology chronology69 = chronology49.withZone(dateTimeZone67);
        org.joda.time.DurationField durationField70 = chronology49.seconds();
        org.joda.time.Chronology chronology71 = chronology49.withUTC();
        boolean boolean72 = dateTimeZone34.equals((java.lang.Object) chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime38", (dateTime29.compareTo(dateTime38) == 0) == dateTime29.equals(dateTime38));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.plusYears(1970);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField18 = chronology15.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime17", (dateTime12.compareTo(dateTime17) == 0) == dateTime12.equals(dateTime17));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime9.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str26 = dateTimeFieldType25.getName();
        org.joda.time.DateTime.Property property27 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTime dateTime28 = property27.roundFloorCopy();
        org.joda.time.DateTime.Property property29 = dateTime28.year();
        org.joda.time.DateTime dateTime31 = property29.addWrapFieldToCopy(8);
        org.joda.time.DateTime dateTime33 = dateTime31.plusSeconds((-3599));
        org.joda.time.Instant instant34 = dateTime33.toInstant();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property36 = localDate35.yearOfCentury();
        org.joda.time.LocalDate localDate37 = property36.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean41 = dateTimeZone40.isFixed();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = localDate37.toDateTimeAtStartOfDay(dateTimeZone40);
        java.util.Locale locale44 = java.util.Locale.CANADA;
        java.lang.String str45 = locale44.getVariant();
        java.util.Calendar calendar46 = dateTime43.toCalendar(locale44);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean50 = dateTimeZone49.isFixed();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone49);
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        org.joda.time.DateTime dateTime54 = localDate51.toDateTimeAtCurrentTime(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.withMillis((long) 32772);
        org.joda.time.DateTime dateTime58 = dateTime56.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime60 = dateTime58.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone63);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Interval interval66 = interval64.withChronology(chronology65);
        org.joda.time.Duration duration67 = interval64.toDuration();
        org.joda.time.DateTime dateTime68 = dateTime60.plus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableDuration) duration67);
        boolean boolean70 = dateTime43.isAfterNow();
        int int71 = dateTime33.compareTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant34", (dateTime33.compareTo(instant34) == 0) == dateTime33.equals(instant34));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 6);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) 10);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property12.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str15 = property12.getAsString();
        org.joda.time.LocalDate localDate16 = property12.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        boolean boolean23 = localDate21.isSupported(durationFieldType22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        boolean boolean34 = dateTime32.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Interval interval40 = interval38.withChronology(chronology39);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property42 = localDate41.yearOfCentury();
        org.joda.time.LocalDate localDate43 = property42.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean47 = dateTimeZone46.isFixed();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = localDate43.toDateTimeAtStartOfDay(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = dateTime49.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property51 = dateTime50.year();
        boolean boolean52 = interval40.contains((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Period period53 = interval40.toPeriod();
        org.joda.time.DateTime dateTime55 = dateTime32.withPeriodAdded((org.joda.time.ReadablePeriod) period53, 360240000);
        org.joda.time.LocalDate localDate56 = localDate21.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.LocalDate localDate57 = localDate16.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Chronology chronology58 = localDate16.getChronology();
        org.joda.time.DateTime dateTime59 = dateTime9.withChronology(chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.weekOfWeekyear();
        org.joda.time.DateTime dateTime61 = dateTime59.toDateTime();
        long long62 = dateTime59.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime59", (dateTime9.compareTo(dateTime59) == 0) == dateTime9.equals(dateTime59));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.plusYears(1970);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime.Property property18 = dateTime12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime17", (dateTime12.compareTo(dateTime17) == 0) == dateTime12.equals(dateTime17));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.LocalDate.Property property5 = localDate4.centuryOfEra();
        org.joda.time.Chronology chronology6 = localDate4.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.era();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.secondOfDay();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean16 = dateTimeZone15.isFixed();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.LocalDate localDate20 = localDate12.plusMonths((int) (short) 1);
        java.util.Date date21 = localDate12.toDate();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property23 = localDate22.yearOfCentury();
        org.joda.time.LocalDate localDate24 = property23.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDate24.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime30.toMutableDateTime();
        org.joda.time.Chronology chronology32 = dateTime30.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.monthOfYear();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property37 = localDate36.yearOfCentury();
        org.joda.time.LocalDate localDate38 = property37.getLocalDate();
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = property37.getDifference(readableInstant39);
        org.joda.time.LocalDate localDate41 = property37.withMaximumValue();
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        int[] intArray44 = chronology32.get((org.joda.time.ReadablePartial) localDate41, 32772L);
        int int45 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDate12, intArray44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField33", Math.signum(durationField7.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField7)));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        int int15 = dateTime11.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTimeISO();
        java.util.Calendar.Builder builder17 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder19 = builder17.setInstant((long) 32770);
        java.util.Calendar calendar20 = builder19.build();
        boolean boolean22 = calendar20.after((java.lang.Object) 70);
        long long23 = calendar20.getTimeInMillis();
        calendar20.setTimeInMillis(0L);
        boolean boolean26 = mutableDateTime16.equals((java.lang.Object) calendar20);
        calendar20.clear(11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant13", (dateTime11.compareTo(instant13) == 0) == dateTime11.equals(instant13));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        org.joda.time.DateTime dateTime16 = property14.addToCopy(42);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfCentury();
        org.joda.time.LocalDate localDate19 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = dateTime25.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str28 = dateTimeFieldType27.getName();
        org.joda.time.DateTime.Property property29 = dateTime26.property(dateTimeFieldType27);
        boolean boolean31 = dateTime26.equals((java.lang.Object) 'u');
        boolean boolean32 = dateTime16.isBefore((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property34 = dateTime16.property(dateTimeFieldType33);
        org.joda.time.DateTime dateTime35 = property34.roundHalfEvenCopy();
        int int36 = dateTime35.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone39);
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.DateTime dateTime44 = localDate41.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withMillis((long) 32772);
        org.joda.time.DateTime dateTime48 = dateTime46.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property49 = dateTime48.year();
        org.joda.time.Instant instant50 = dateTime48.toInstant();
        int int51 = dateTime48.getWeekyear();
        org.joda.time.DateTime dateTime53 = dateTime48.plus((long) (short) 0);
        boolean boolean54 = dateTime35.isAfter((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and instant50", (dateTime53.compareTo(instant50) == 0) == dateTime53.equals(instant50));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = dateTime13.withMinuteOfHour(11);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int32 = dateTimeZone30.getOffsetFromLocal((long) 6);
        long long34 = dateTimeZone27.getMillisKeepLocal(dateTimeZone30, (long) 10);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property37 = localDate36.yearOfCentury();
        org.joda.time.LocalDate.Property property38 = localDate36.yearOfCentury();
        org.joda.time.LocalDate localDate40 = property38.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str41 = property38.getAsString();
        org.joda.time.LocalDate localDate42 = property38.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean46 = dateTimeZone45.isFixed();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone45);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.minutes();
        boolean boolean49 = localDate47.isSupported(durationFieldType48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property51 = localDate50.yearOfCentury();
        org.joda.time.LocalDate localDate52 = property51.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean56 = dateTimeZone55.isFixed();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone55);
        org.joda.time.DateTime dateTime58 = localDate52.toDateTimeAtStartOfDay(dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime58.toMutableDateTime();
        boolean boolean60 = dateTime58.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone63);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Interval interval66 = interval64.withChronology(chronology65);
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property68 = localDate67.yearOfCentury();
        org.joda.time.LocalDate localDate69 = property68.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean73 = dateTimeZone72.isFixed();
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone72);
        org.joda.time.DateTime dateTime75 = localDate69.toDateTimeAtStartOfDay(dateTimeZone72);
        org.joda.time.DateTime dateTime76 = dateTime75.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property77 = dateTime76.year();
        boolean boolean78 = interval66.contains((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Period period79 = interval66.toPeriod();
        org.joda.time.DateTime dateTime81 = dateTime58.withPeriodAdded((org.joda.time.ReadablePeriod) period79, 360240000);
        org.joda.time.LocalDate localDate82 = localDate47.plus((org.joda.time.ReadablePeriod) period79);
        org.joda.time.LocalDate localDate83 = localDate42.plus((org.joda.time.ReadablePeriod) period79);
        org.joda.time.Chronology chronology84 = localDate42.getChronology();
        org.joda.time.DateTime dateTime85 = dateTime35.withChronology(chronology84);
        org.joda.time.LocalDate localDate86 = new org.joda.time.LocalDate((java.lang.Object) dateTime13, chronology84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and dateTime85", (dateTime35.compareTo(dateTime85) == 0) == dateTime35.equals(dateTime85));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime11.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property15 = dateTime14.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant13", (dateTime14.compareTo(instant13) == 0) == dateTime14.equals(instant13));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.DateTime dateTime4 = dateTime1.withDurationAdded((-1L), (int) (byte) -1);
        org.joda.time.DateTime dateTime6 = dateTime1.plusWeeks(693);
        java.lang.String str8 = dateTime1.toString("360240000");
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.DateTime dateTime13 = dateTime10.withDurationAdded((-1L), (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTime dateTime21 = localDate18.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillis((long) 32772);
        org.joda.time.DateTime dateTime25 = dateTime23.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withDurationAdded(readableDuration28, 292278994);
        java.util.Date date31 = dateTime25.toDate();
        java.util.GregorianCalendar gregorianCalendar32 = dateTime25.toGregorianCalendar();
        boolean boolean33 = dateTime10.isBefore((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime.Property property34 = dateTime10.secondOfDay();
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int43 = dateTimeZone41.getOffsetFromLocal((long) 6);
        long long45 = dateTimeZone38.getMillisKeepLocal(dateTimeZone41, (long) 10);
        org.joda.time.Interval interval46 = localDate36.toInterval(dateTimeZone38);
        org.joda.time.DateTime dateTime47 = localDate35.toDateTimeAtMidnight(dateTimeZone38);
        long long51 = dateTimeZone38.convertLocalToUTC(11L, false, 0L);
        org.joda.time.DateTime dateTime52 = dateTime10.toDateTime(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime1.toMutableDateTime(dateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime52", (dateTime10.compareTo(dateTime52) == 0) == dateTime10.equals(dateTime52));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        java.lang.String str3 = property1.getName();
        long long4 = property1.remainder();
        int int5 = property1.getMinimumValue();
        org.joda.time.LocalDate localDate6 = property1.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property1.getFieldType();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = locale8.stripExtensions();
        int int11 = property1.getMaximumTextLength(locale8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillis((long) 32772);
        org.joda.time.DateTime dateTime23 = dateTime21.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Interval interval31 = interval29.withChronology(chronology30);
        org.joda.time.Duration duration32 = interval29.toDuration();
        org.joda.time.DateTime dateTime33 = dateTime25.plus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property35 = localDate34.yearOfCentury();
        org.joda.time.LocalDate localDate36 = property35.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone39);
        org.joda.time.DateTime dateTime42 = localDate36.toDateTimeAtStartOfDay(dateTimeZone39);
        org.joda.time.DateTime dateTime43 = dateTime33.withZoneRetainFields(dateTimeZone39);
        long long44 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Instant instant45 = dateTime33.toInstant();
        org.joda.time.DateTime dateTime47 = dateTime33.withWeekyear(27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant45", (dateTime33.compareTo(instant45) == 0) == dateTime33.equals(instant45));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 6);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) 10);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property12.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str15 = property12.getAsString();
        org.joda.time.LocalDate localDate16 = property12.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        boolean boolean23 = localDate21.isSupported(durationFieldType22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        boolean boolean34 = dateTime32.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Interval interval40 = interval38.withChronology(chronology39);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property42 = localDate41.yearOfCentury();
        org.joda.time.LocalDate localDate43 = property42.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean47 = dateTimeZone46.isFixed();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = localDate43.toDateTimeAtStartOfDay(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = dateTime49.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property51 = dateTime50.year();
        boolean boolean52 = interval40.contains((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Period period53 = interval40.toPeriod();
        org.joda.time.DateTime dateTime55 = dateTime32.withPeriodAdded((org.joda.time.ReadablePeriod) period53, 360240000);
        org.joda.time.LocalDate localDate56 = localDate21.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.LocalDate localDate57 = localDate16.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Chronology chronology58 = localDate16.getChronology();
        org.joda.time.DateTime dateTime59 = dateTime9.withChronology(chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.weekOfWeekyear();
        org.joda.time.DateTime dateTime61 = dateTime59.toDateTime();
        int int62 = dateTime61.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime61", (dateTime9.compareTo(dateTime61) == 0) == dateTime9.equals(dateTime61));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate9 = property8.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean13 = dateTimeZone12.isFixed();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDate9.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        boolean boolean17 = dateTime15.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Interval interval23 = interval21.withChronology(chronology22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime32.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property34 = dateTime33.year();
        boolean boolean35 = interval23.contains((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Period period36 = interval23.toPeriod();
        org.joda.time.DateTime dateTime38 = dateTime15.withPeriodAdded((org.joda.time.ReadablePeriod) period36, 360240000);
        org.joda.time.LocalDate localDate39 = localDate4.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Interval interval40 = localDate4.toInterval();
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        java.util.Calendar.Builder builder42 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder44 = builder42.setInstant((long) 32770);
        java.util.Calendar calendar45 = builder42.build();
        java.util.TimeZone timeZone46 = calendar45.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.DateTime dateTime48 = dateTime41.withZone(dateTimeZone47);
        int int50 = dateTimeZone47.getOffsetFromLocal((-58790469600000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime48", (dateTime41.compareTo(dateTime48) == 0) == dateTime41.equals(dateTime48));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        int int15 = dateTime11.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTimeISO();
        java.util.Calendar.Builder builder17 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder19 = builder17.setInstant((long) 32770);
        java.util.Calendar calendar20 = builder19.build();
        boolean boolean22 = calendar20.after((java.lang.Object) 70);
        long long23 = calendar20.getTimeInMillis();
        calendar20.setTimeInMillis(0L);
        boolean boolean26 = mutableDateTime16.equals((java.lang.Object) calendar20);
        calendar20.setMinimalDaysInFirstWeek(668);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant13", (dateTime11.compareTo(instant13) == 0) == dateTime11.equals(instant13));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.era();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType0.getField(chronology4);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = localDate12.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.LocalDate localDate24 = localDate12.minusYears(10);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale28.getCountry();
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getLanguage();
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.util.Locale locale37 = java.util.Locale.TAIWAN;
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.util.Locale locale40 = new java.util.Locale("");
        java.lang.String str41 = locale40.getLanguage();
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.lang.String str45 = locale44.getCountry();
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale34, locale36, locale37, locale38, locale40, locale42, locale43, locale44, locale46 };
        java.util.ArrayList<java.util.Locale> localeList48 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList48, localeArray47);
        java.util.Locale locale50 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList48);
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strSet52);
        boolean boolean54 = localDate12.equals((java.lang.Object) strList53);
        long long56 = chronology4.set((org.joda.time.ReadablePartial) localDate12, 1000L);
        org.joda.time.DurationField durationField57 = chronology4.minutes();
        org.joda.time.DurationField durationField58 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField59 = chronology4.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField57 and durationField58", Math.signum(durationField57.compareTo(durationField58)) == -Math.signum(durationField58.compareTo(durationField57)));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        org.joda.time.DateTime dateTime16 = property14.addWrapFieldToCopy(8);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds((-3599));
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime();
        int int21 = dateTime20.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant19", (dateTime20.compareTo(instant19) == 0) == dateTime20.equals(instant19));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Interval interval19 = interval17.withChronology(chronology18);
        org.joda.time.Duration duration20 = interval17.toDuration();
        org.joda.time.DateTime dateTime21 = dateTime13.plus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.DateTime dateTime24 = dateTime21.withDurationAdded((long) ' ', (int) (byte) 100);
        int int25 = dateTime21.getSecondOfDay();
        org.joda.time.DateTime dateTime27 = dateTime21.plusMonths(57);
        org.joda.time.DateTime dateTime29 = dateTime21.plusMinutes(16);
        org.joda.time.DateTime dateTime32 = dateTime29.withDurationAdded(0L, 57);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale36 = new java.util.Locale("yearOfCentury");
        boolean boolean37 = dateTimeZone34.equals((java.lang.Object) locale36);
        org.joda.time.DateTime dateTime38 = dateTime29.withZone(dateTimeZone34);
        long long40 = dateTimeZone34.previousTransition(1050308164619000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime38", (dateTime29.compareTo(dateTime38) == 0) == dateTime29.equals(dateTime38));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Interval interval5 = interval3.withChronology(chronology4);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTime dateTime15 = dateTime14.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property16 = dateTime15.year();
        boolean boolean17 = interval5.contains((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime.Property property18 = dateTime15.yearOfCentury();
        org.joda.time.DateTime.Property property19 = dateTime15.hourOfDay();
        java.lang.String str20 = dateTime15.toString();
        org.joda.time.DateTime dateTime23 = dateTime15.withDurationAdded(21599948L, 366);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = property25.getDifference(readableInstant27);
        org.joda.time.LocalDate localDate29 = property25.withMaximumValue();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.Chronology chronology32 = chronology30.withUTC();
        org.joda.time.DurationField durationField33 = chronology30.seconds();
        org.joda.time.DateTime dateTime34 = dateTime23.withChronology(chronology30);
        org.joda.time.DateTimeField dateTimeField35 = chronology30.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime34", (dateTime23.compareTo(dateTime34) == 0) == dateTime23.equals(dateTime34));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.yearOfCentury();
        org.joda.time.LocalDate localDate6 = property4.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate7 = property4.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        boolean boolean9 = durationFieldType1.isSupported(chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology8);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.LocalDate localDate21 = localDate13.plusMonths((int) (short) 1);
        java.lang.String str22 = localDate21.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTime dateTime30 = localDate27.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = localDate21.toDateTimeAtStartOfDay(dateTimeZone29);
        long long35 = dateTimeZone29.convertLocalToUTC(31536000000L, true, (long) 32770);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) dateTime10, dateTimeZone29);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property38 = localDate37.yearOfCentury();
        org.joda.time.LocalDate localDate40 = localDate37.plusWeeks(32770);
        int int41 = localDate40.size();
        org.joda.time.LocalDate localDate43 = localDate40.withEra((int) (short) 0);
        int int44 = localDate40.getDayOfWeek();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (byte) 100);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean51 = dateTimeZone50.isFixed();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int55 = dateTimeZone53.getOffsetFromLocal((long) 6);
        long long57 = dateTimeZone50.getMillisKeepLocal(dateTimeZone53, (long) 10);
        org.joda.time.Interval interval58 = localDate48.toInterval(dateTimeZone50);
        org.joda.time.DateTime dateTime59 = localDate47.toDateTimeAtMidnight(dateTimeZone50);
        java.lang.String str60 = dateTimeZone50.toString();
        long long62 = dateTimeZone50.nextTransition((long) 0);
        long long64 = dateTimeZone50.previousTransition((long) '4');
        org.joda.time.DateTime dateTime65 = localDate46.toDateTimeAtStartOfDay(dateTimeZone50);
        org.joda.time.DateMidnight dateMidnight66 = localDate40.toDateMidnight(dateTimeZone50);
        org.joda.time.DateTime dateTime67 = dateTime10.withZoneRetainFields(dateTimeZone50);
        boolean boolean69 = dateTime67.isAfter(842400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime36", (dateTime10.compareTo(dateTime36) == 0) == dateTime10.equals(dateTime36));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getCountry();
        java.util.Locale locale8 = locale6.stripExtensions();
        int int9 = property5.getMaximumTextLength(locale8);
        java.lang.String str10 = property5.toString();
        org.joda.time.DurationField durationField11 = property5.getRangeDurationField();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L);
        int int14 = property5.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(57);
        long long20 = dateTimeZone16.convertLocalToUTC((long) ' ', false, 1L);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime13.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime21", (dateTime13.compareTo(mutableDateTime21) == 0) == dateTime13.equals(mutableDateTime21));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate4.centuryOfEra();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone13);
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime16.secondOfMinute();
        org.joda.time.DateTime dateTime20 = dateTime16.plusMillis(4);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone23);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime28 = localDate25.toDateTimeAtMidnight(dateTimeZone27);
        java.lang.String str29 = dateTime28.toString();
        org.joda.time.DateMidnight dateMidnight30 = dateTime28.toDateMidnight();
        org.joda.time.DateTime.Property property31 = dateTime28.weekOfWeekyear();
        int int32 = dateTime28.getCenturyOfEra();
        org.joda.time.Instant instant33 = dateTime28.toInstant();
        org.joda.time.MutableDateTime mutableDateTime34 = instant33.toMutableDateTime();
        boolean boolean35 = dateTime20.isEqual((org.joda.time.ReadableInstant) instant33);
        int int36 = dateTime20.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant33", (dateTime28.compareTo(instant33) == 0) == dateTime28.equals(instant33));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        java.lang.String str11 = localDate10.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate10.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate.Property property23 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property23.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate26 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = localDate26.getFields();
        org.joda.time.DateTime dateTime28 = dateTime20.withFields((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfMinute();
        org.joda.time.DurationField durationField33 = chronology31.seconds();
        org.joda.time.DurationField durationField34 = chronology31.years();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.millisOfDay();
        org.joda.time.DateTime dateTime36 = dateTime20.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField37 = chronology31.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime36", (dateTime20.compareTo(dateTime36) == 0) == dateTime20.equals(dateTime36));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate4.centuryOfEra();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone13);
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime16.secondOfMinute();
        org.joda.time.DateTime dateTime20 = dateTime16.plusMillis(4);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone23);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime28 = localDate25.toDateTimeAtMidnight(dateTimeZone27);
        java.lang.String str29 = dateTime28.toString();
        org.joda.time.DateMidnight dateMidnight30 = dateTime28.toDateMidnight();
        org.joda.time.DateTime.Property property31 = dateTime28.weekOfWeekyear();
        int int32 = dateTime28.getCenturyOfEra();
        org.joda.time.Instant instant33 = dateTime28.toInstant();
        org.joda.time.MutableDateTime mutableDateTime34 = instant33.toMutableDateTime();
        boolean boolean35 = dateTime20.isEqual((org.joda.time.ReadableInstant) instant33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(dateTimeZone36);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfCentury();
        org.joda.time.LocalDate localDate40 = property39.getLocalDate();
        org.joda.time.LocalDate localDate42 = localDate40.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfCentury();
        org.joda.time.LocalDate localDate45 = property44.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean49 = dateTimeZone48.isFixed();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = localDate45.toDateTimeAtStartOfDay(dateTimeZone48);
        org.joda.time.DateTime dateTime52 = localDate42.toDateTimeAtMidnight(dateTimeZone48);
        org.joda.time.LocalDate localDate54 = localDate42.minusYears(10);
        org.joda.time.LocalDate.Property property55 = localDate54.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property55.getFieldType();
        org.joda.time.LocalDate localDate58 = localDate37.withField(dateTimeFieldType56, 86397772);
        org.joda.time.DateTime.Property property59 = dateTime20.property(dateTimeFieldType56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant33", (dateTime28.compareTo(instant33) == 0) == dateTime28.equals(instant33));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        boolean boolean24 = dateTime22.isEqual((long) 1056);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = dateTime33.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str36 = dateTimeFieldType35.getName();
        org.joda.time.DateTime.Property property37 = dateTime34.property(dateTimeFieldType35);
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.DateTimeField dateTimeField39 = property37.getField();
        int int40 = property37.getMaximumValueOverall();
        org.joda.time.format.DateTimePrinter dateTimePrinter41 = null;
        org.joda.time.format.DateTimeParser dateTimeParser42 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter41, dateTimeParser42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter43.withDefaultYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int50 = dateTimeZone48.getOffset((long) 2022);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 32770, dateTimeZone48);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property53 = localDate52.yearOfCentury();
        org.joda.time.LocalDate localDate54 = property53.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean58 = dateTimeZone57.isFixed();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone57);
        org.joda.time.DateTime dateTime60 = localDate54.toDateTimeAtStartOfDay(dateTimeZone57);
        org.joda.time.DateTime dateTime61 = dateTime60.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str63 = dateTimeFieldType62.getName();
        org.joda.time.DateTime.Property property64 = dateTime61.property(dateTimeFieldType62);
        org.joda.time.DateTime dateTime65 = property64.roundFloorCopy();
        org.joda.time.DateTime.Property property66 = dateTime65.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone67 = dateTime65.getZone();
        long long69 = dateTimeZone48.getMillisKeepLocal(dateTimeZone67, (long) 9);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean72 = dateTimeZone71.isFixed();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int76 = dateTimeZone74.getOffsetFromLocal((long) 6);
        long long78 = dateTimeZone71.getMillisKeepLocal(dateTimeZone74, (long) 10);
        long long80 = dateTimeZone48.getMillisKeepLocal(dateTimeZone74, (long) 1970);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter43.withZone(dateTimeZone74);
        java.lang.String str83 = dateTimeZone74.getShortName((long) 796407);
        boolean boolean84 = property37.equals((java.lang.Object) dateTimeZone74);
        org.joda.time.DateTime dateTime85 = dateTime22.toDateTime(dateTimeZone74);
        java.lang.String str86 = dateTimeZone74.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(32772);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTime dateTime14 = localDate5.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property15 = localDate5.yearOfEra();
        int int16 = localDate5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        boolean boolean23 = localDate21.isSupported(durationFieldType22);
        org.joda.time.LocalDate localDate25 = localDate21.minusDays(57);
        org.joda.time.LocalDate localDate27 = localDate21.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        boolean boolean29 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalTime localTime30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate27.toDateTime(localTime30, dateTimeZone31);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate35 = property34.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.LocalDate localDate43 = localDate35.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property44 = localDate43.dayOfWeek();
        org.joda.time.LocalDate localDate46 = property44.addToCopy(10);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        java.lang.String str50 = dateTimeZone48.getName(10L);
        java.util.Locale locale54 = new java.util.Locale("70", "hi!");
        java.lang.String str55 = dateTimeZone48.getName((long) '4', locale54);
        org.joda.time.Interval interval56 = localDate46.toInterval(dateTimeZone48);
        org.joda.time.LocalDate localDate58 = localDate46.plusDays(19);
        int int59 = localDate46.getCenturyOfEra();
        org.joda.time.Chronology chronology60 = localDate46.getChronology();
        org.joda.time.DateTime dateTime61 = dateTime32.toDateTime(chronology60);
        org.joda.time.DateTimeField dateTimeField62 = chronology60.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime61", (dateTime32.compareTo(dateTime61) == 0) == dateTime32.equals(dateTime61));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getEra();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfCentury();
        org.joda.time.LocalDate localDate4 = property3.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime11 = dateTime10.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str13 = dateTimeFieldType12.getName();
        org.joda.time.DateTime.Property property14 = dateTime11.property(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = property14.roundFloorCopy();
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime15.getZone();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime18.toDateTime(chronology21);
        boolean boolean26 = dateTime24.isEqual((long) 1056);
        org.joda.time.DateTime dateTime28 = dateTime24.plusDays(17724494);
        int int29 = dateTime0.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime24", (dateTime18.compareTo(dateTime24) == 0) == dateTime18.equals(dateTime24));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getVariant();
        java.util.Calendar calendar11 = dateTime8.toCalendar(locale9);
        long long12 = dateTime8.getMillis();
        org.joda.time.DateTime dateTime14 = dateTime8.withMillis(536457600013L);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(70);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        int int19 = localDate18.getDayOfYear();
        org.joda.time.LocalDate.Property property20 = localDate18.year();
        int int21 = localDate18.getDayOfMonth();
        org.joda.time.LocalTime localTime22 = null;
        org.joda.time.DateTime dateTime23 = localDate18.toDateTime(localTime22);
        boolean boolean24 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = dateTime33.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property35 = dateTime34.year();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property37 = localDate36.yearOfCentury();
        org.joda.time.LocalDate localDate38 = property37.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean42 = dateTimeZone41.isFixed();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.DateTime dateTime44 = localDate38.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = dateTime44.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str47 = dateTimeFieldType46.getName();
        org.joda.time.DateTime.Property property48 = dateTime45.property(dateTimeFieldType46);
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime51 = dateTime45.withHourOfDay(15);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(13);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime51.toMutableDateTime(dateTimeZone53);
        boolean boolean55 = dateTime23.isBefore((org.joda.time.ReadableInstant) mutableDateTime54);
        int int56 = dateTime23.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and mutableDateTime54", (dateTime51.compareTo(mutableDateTime54) == 0) == dateTime51.equals(mutableDateTime54));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone8);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTime dateTime13 = localDate10.toDateTimeAtCurrentTime(dateTimeZone12);
        boolean boolean14 = localDate5.equals((java.lang.Object) dateTime13);
        java.util.Date date15 = localDate5.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getRangeDurationType();
        boolean boolean18 = localDate5.isSupported(dateTimeFieldType16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = localDate23.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.LocalDate localDate35 = localDate23.minusYears(10);
        boolean boolean36 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate39 = localDate35.withFieldAdded(durationFieldType37, 70);
        org.joda.time.DateTime dateTime40 = localDate35.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime42 = dateTime40.withTimeAtStartOfDay();
        boolean boolean44 = dateTime42.isBefore(21597772L);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property46 = localDate45.yearOfCentury();
        org.joda.time.LocalDate localDate47 = property46.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean51 = dateTimeZone50.isFixed();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone50);
        org.joda.time.DateTime dateTime53 = localDate47.toDateTimeAtStartOfDay(dateTimeZone50);
        org.joda.time.DateTime dateTime54 = dateTime53.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property55 = dateTime54.year();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property57 = localDate56.yearOfCentury();
        org.joda.time.LocalDate localDate58 = property57.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean62 = dateTimeZone61.isFixed();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone61);
        org.joda.time.DateTime dateTime64 = localDate58.toDateTimeAtStartOfDay(dateTimeZone61);
        org.joda.time.DateTime dateTime65 = dateTime64.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str67 = dateTimeFieldType66.getName();
        org.joda.time.DateTime.Property property68 = dateTime65.property(dateTimeFieldType66);
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateTime dateTime71 = dateTime54.minusDays(32772);
        org.joda.time.DateTime.Property property72 = dateTime71.dayOfMonth();
        org.joda.time.DateTime.Property property73 = dateTime71.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType74 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property76 = localDate75.yearOfCentury();
        org.joda.time.LocalDate.Property property77 = localDate75.yearOfCentury();
        org.joda.time.LocalDate localDate79 = property77.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate80 = property77.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology81 = localDate80.getChronology();
        boolean boolean82 = durationFieldType74.isSupported(chronology81);
        org.joda.time.Chronology chronology83 = chronology81.withUTC();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.secondOfMinute();
        org.joda.time.DurationField durationField85 = chronology83.halfdays();
        org.joda.time.DateTime dateTime86 = dateTime71.toDateTime(chronology83);
        org.joda.time.DateTime dateTime87 = dateTime42.toDateTime(chronology83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime71 and dateTime86", (dateTime71.compareTo(dateTime86) == 0) == dateTime71.equals(dateTime86));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth.Property property5 = yearMonth1.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = yearMonth1.toString(dateTimeFormatter6);
        org.joda.time.YearMonth yearMonth9 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = yearMonth9.toInterval(dateTimeZone10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = yearMonth9.getFieldTypes();
        org.joda.time.YearMonth.Property property13 = yearMonth9.year();
        org.joda.time.YearMonth yearMonth15 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Interval interval19 = yearMonth17.toInterval(dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.Interval interval21 = interval19.withPeriodAfterStart(readablePeriod20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = interval21.toPeriod(periodType22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean25 = period23.isSupported(durationFieldType24);
        org.joda.time.YearMonth yearMonth27 = yearMonth15.withPeriodAdded((org.joda.time.ReadablePeriod) period23, 32770);
        org.joda.time.YearMonth yearMonth28 = yearMonth9.minus((org.joda.time.ReadablePeriod) period23);
        boolean boolean29 = yearMonth1.isAfter((org.joda.time.ReadablePartial) yearMonth28);
        org.joda.time.Chronology chronology30 = yearMonth28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfDay();
        org.joda.time.DurationField durationField32 = chronology30.weeks();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.clockhourOfHalfday();
        org.joda.time.DurationField durationField35 = chronology30.years();
        org.joda.time.DurationField durationField36 = chronology30.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField32, and durationField35", !(durationField36.compareTo(durationField32) == 0) || (Math.signum(durationField36.compareTo(durationField35)) == Math.signum(durationField32.compareTo(durationField35))));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(dateTimeZone21);
        int int24 = dateTime13.getMillisOfDay();
        int int25 = dateTime13.getMonthOfYear();
        org.joda.time.DateTime.Property property26 = dateTime13.monthOfYear();
        org.joda.time.DateTime dateTime28 = property26.addToCopy(2022);
        org.joda.time.DateTime.Property property29 = dateTime28.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime23", (dateTime13.compareTo(mutableDateTime23) == 0) == dateTime13.equals(mutableDateTime23));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        boolean boolean25 = dateTime24.isBeforeNow();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property27 = localDate26.yearOfCentury();
        org.joda.time.LocalDate localDate28 = property27.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = localDate28.toDateTimeAtStartOfDay(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime34.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str37 = dateTimeFieldType36.getName();
        org.joda.time.DateTime.Property property38 = dateTime35.property(dateTimeFieldType36);
        org.joda.time.Interval interval39 = property38.toInterval();
        org.joda.time.DateTimeField dateTimeField40 = property38.getField();
        int int41 = property38.getMaximumValueOverall();
        org.joda.time.DateTime dateTime42 = property38.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime44 = dateTime42.withMillisOfSecond((int) (short) 1);
        boolean boolean45 = dateTime24.isEqual((org.joda.time.ReadableInstant) dateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate4.centuryOfEra();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone13);
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime16.secondOfMinute();
        org.joda.time.DateTime dateTime20 = dateTime16.plusMillis(4);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.LocalDate localDate25 = localDate23.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property27 = localDate26.yearOfCentury();
        org.joda.time.LocalDate localDate28 = property27.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = localDate28.toDateTimeAtStartOfDay(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = localDate25.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.DateTime.Property property36 = dateTime35.year();
        org.joda.time.Interval interval37 = property36.toInterval();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfCentury();
        org.joda.time.LocalDate localDate40 = property39.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean44 = dateTimeZone43.isFixed();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone43);
        org.joda.time.DateTime dateTime46 = localDate40.toDateTimeAtStartOfDay(dateTimeZone43);
        org.joda.time.DateTime dateTime47 = dateTime46.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str49 = dateTimeFieldType48.getName();
        org.joda.time.DateTime.Property property50 = dateTime47.property(dateTimeFieldType48);
        org.joda.time.Interval interval51 = property50.toInterval();
        org.joda.time.DateTimeField dateTimeField52 = property50.getField();
        org.joda.time.DateTime dateTime54 = property50.addToCopy(5);
        org.joda.time.DateTime dateTime56 = dateTime54.withWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Interval interval62 = interval60.withChronology(chronology61);
        org.joda.time.Duration duration63 = interval60.toDuration();
        org.joda.time.DateTime dateTime64 = dateTime54.minus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Interval interval65 = interval37.withDurationAfterStart((org.joda.time.ReadableDuration) duration63);
        org.joda.time.DateTime dateTime66 = dateTime16.minus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType68 = dateTimeFieldType67.getRangeDurationType();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology71 = localDate70.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField73 = chronology71.era();
        org.joda.time.DateTimeField dateTimeField74 = dateTimeFieldType67.getField(chronology71);
        boolean boolean75 = dateTime66.isSupported(dateTimeFieldType67);
        java.lang.Object obj76 = null;
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean80 = dateTimeZone79.isFixed();
        org.joda.time.LocalDate localDate81 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone79);
        java.util.TimeZone timeZone82 = null;
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forTimeZone(timeZone82);
        org.joda.time.DateTime dateTime84 = localDate81.toDateTimeAtCurrentTime(dateTimeZone83);
        org.joda.time.DateTime dateTime86 = dateTime84.withMillis((long) 32772);
        org.joda.time.DateTime dateTime88 = dateTime86.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime90 = dateTime86.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology91 = dateTime90.getChronology();
        org.joda.time.Interval interval92 = new org.joda.time.Interval(obj76, chronology91);
        org.joda.time.DateTimeField dateTimeField93 = chronology91.yearOfCentury();
        org.joda.time.DurationField durationField94 = chronology91.centuries();
        org.joda.time.DurationField durationField95 = chronology91.hours();
        org.joda.time.DateTime dateTime96 = dateTime66.toDateTime(chronology91);
        org.joda.time.DateTimeField dateTimeField97 = chronology91.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and dateTime96", (dateTime66.compareTo(dateTime96) == 0) == dateTime66.equals(dateTime96));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(localTime13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.DateTime dateTime17 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.withHourOfDay(7);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone23);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime28 = localDate25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean33 = dateTimeZone32.isFixed();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int37 = dateTimeZone35.getOffsetFromLocal((long) 6);
        long long39 = dateTimeZone32.getMillisKeepLocal(dateTimeZone35, (long) 10);
        org.joda.time.DateTime dateTime40 = dateTime30.withZone(dateTimeZone35);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(1644600996275L, dateTimeZone35);
        java.util.TimeZone timeZone42 = dateTimeZone35.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime19.toMutableDateTime(dateTimeZone35);
        int int44 = mutableDateTime43.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime40", (dateTime30.compareTo(dateTime40) == 0) == dateTime30.equals(dateTime40));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        boolean boolean24 = dateTime22.isEqual((long) 1056);
        java.util.Date date25 = dateTime22.toDate();
        java.time.Instant instant26 = date25.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        org.joda.time.DateTime dateTime16 = property12.addToCopy(5);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfCentury();
        org.joda.time.LocalDate localDate19 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = dateTime25.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str28 = dateTimeFieldType27.getName();
        org.joda.time.DateTime.Property property29 = dateTime26.property(dateTimeFieldType27);
        org.joda.time.DateTime dateTime30 = property29.roundFloorCopy();
        org.joda.time.DateTime.Property property31 = dateTime30.year();
        org.joda.time.DateTime dateTime33 = property31.addWrapFieldToCopy(8);
        org.joda.time.DateTime dateTime35 = dateTime33.plusSeconds((-3599));
        org.joda.time.Instant instant36 = dateTime35.toInstant();
        int int37 = dateTime35.getSecondOfMinute();
        int int38 = property12.getDifference((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property40 = localDate39.yearOfCentury();
        org.joda.time.LocalDate localDate41 = property40.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean45 = dateTimeZone44.isFixed();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = localDate41.toDateTimeAtStartOfDay(dateTimeZone44);
        org.joda.time.DateTime dateTime48 = dateTime47.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str50 = dateTimeFieldType49.getName();
        org.joda.time.DateTime.Property property51 = dateTime48.property(dateTimeFieldType49);
        org.joda.time.DateTime dateTime52 = property51.roundFloorCopy();
        org.joda.time.DateTime.Property property53 = dateTime52.year();
        org.joda.time.DateTime dateTime55 = property53.addWrapFieldToCopy(8);
        org.joda.time.DateTime dateTime57 = dateTime55.plusSeconds((-3599));
        org.joda.time.DateTime dateTime60 = dateTime55.withDurationAdded((-1836000000L), (int) (byte) 1);
        org.joda.time.DateTime dateTime62 = dateTime55.minusSeconds(54);
        org.joda.time.Chronology chronology63 = dateTime55.getChronology();
        org.joda.time.DateTime dateTime65 = dateTime55.plusWeeks(58);
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and dateTime57", (instant36.compareTo(dateTime57) == 0) == instant36.equals(dateTime57));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) (byte) 10);
        java.util.Date date6 = calendar3.getTime();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean10 = dateTimeZone9.isFixed();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone9);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTime dateTime14 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int23 = dateTimeZone21.getOffsetFromLocal((long) 6);
        long long25 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, (long) 10);
        org.joda.time.DateTime dateTime26 = dateTime16.withZone(dateTimeZone21);
        org.joda.time.DateTime.Property property27 = dateTime16.hourOfDay();
        org.joda.time.DateTime dateTime29 = property27.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean33 = dateTimeZone32.isFixed();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone32);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTime dateTime37 = localDate34.toDateTimeAtCurrentTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusYears(2022);
        int int40 = property27.getDifference((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime41 = property27.withMinimumValue();
        boolean boolean42 = calendar3.after((java.lang.Object) dateTime41);
        calendar3.set(69, 50, 116, 1988, 17724494);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime26", (dateTime16.compareTo(dateTime26) == 0) == dateTime16.equals(dateTime26));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addToCopy((long) 935);
        org.joda.time.DateTime dateTime23 = property20.withMaximumValue();
        org.joda.time.DateTime dateTime24 = property20.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra((int) 'u');
        java.lang.String str30 = localDate27.toString();
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtStartOfDay();
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.lang.String str36 = dateTimeZone34.getName(10L);
        java.util.Locale locale40 = new java.util.Locale("70", "hi!");
        java.lang.String str41 = dateTimeZone34.getName((long) '4', locale40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(12L, dateTimeZone34);
        long long45 = dateTimeZone34.convertLocalToUTC((-31445624657L), true);
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime47 = localDate27.toDateTimeAtStartOfDay(dateTimeZone34);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((java.lang.Object) dateTime24, dateTimeZone34);
        boolean boolean49 = dateTimeZone34.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime24 = dateTime22.minusWeeks(69);
        int int25 = dateTime24.getMonthOfYear();
        org.joda.time.DateTime dateTime27 = dateTime24.plusYears(21600000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean4 = dateTimeZone3.isFixed();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone3);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtMidnight(dateTimeZone7);
        int int9 = dateTime8.getMonthOfYear();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = dateTime8.toDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 15, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(365);
        org.joda.time.DateTime dateTime19 = dateTime16.withZone(dateTimeZone18);
        int int21 = dateTimeZone18.getOffsetFromLocal(1L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime19", (dateTime14.compareTo(dateTime19) == 0) == dateTime14.equals(dateTime19));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTime dateTime30 = localDate27.toDateTimeAtMidnight(dateTimeZone29);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.DateMidnight dateMidnight32 = dateTime30.toDateMidnight();
        java.util.Date date33 = dateMidnight32.toDate();
        date33.setDate((int) (short) 10);
        long long36 = date33.getTime();
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.fromDateFields(date33);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean41 = dateTimeZone40.isFixed();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone40);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateTime dateTime45 = localDate42.toDateTimeAtMidnight(dateTimeZone44);
        java.lang.String str46 = dateTime45.toString();
        org.joda.time.DateMidnight dateMidnight47 = dateTime45.toDateMidnight();
        java.util.Date date48 = dateMidnight47.toDate();
        date48.setDate((int) (short) 10);
        boolean boolean51 = date33.before(date48);
        org.joda.time.LocalDate localDate52 = org.joda.time.LocalDate.fromDateFields(date48);
        int int53 = localDate52.getDayOfWeek();
        org.joda.time.LocalDate localDate55 = localDate52.minusWeeks(56316);
        int int56 = localDate52.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean60 = dateTimeZone59.isFixed();
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone59);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.minutes();
        boolean boolean63 = localDate61.isSupported(durationFieldType62);
        org.joda.time.LocalDate.Property property64 = localDate61.centuryOfEra();
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property66 = localDate65.yearOfCentury();
        org.joda.time.LocalDate localDate67 = property66.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean71 = dateTimeZone70.isFixed();
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone70);
        org.joda.time.DateTime dateTime73 = localDate67.toDateTimeAtStartOfDay(dateTimeZone70);
        long long74 = property64.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime76 = dateTime73.plus((long) 2011);
        org.joda.time.DateTime dateTime77 = localDate52.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        int int78 = property20.compareTo((org.joda.time.ReadableInstant) dateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        int int15 = property12.getMaximumValueOverall();
        org.joda.time.DateTime dateTime16 = property12.withMinimumValue();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfCentury();
        org.joda.time.LocalDate localDate19 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone22);
        boolean boolean26 = dateTime25.isBeforeNow();
        boolean boolean28 = dateTime25.isAfter((long) 48);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTime dateTime36 = localDate33.toDateTimeAtMidnight(dateTimeZone35);
        int int37 = dateTime36.getMonthOfYear();
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        java.lang.String str44 = dateTimeZone39.getShortName((long) 2022);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime25.toMutableDateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime47 = dateTime25.minusYears(21597);
        org.joda.time.LocalDate localDate48 = dateTime25.toLocalDate();
        int int49 = property12.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime45", (dateTime8.compareTo(mutableDateTime45) == 0) == dateTime8.equals(mutableDateTime45));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        boolean boolean29 = dateTime28.isBeforeNow();
        int int30 = dateTime28.getDayOfYear();
        boolean boolean31 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology32 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int28 = dateTimeZone26.getOffsetFromLocal((long) 6);
        long long30 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) 10);
        org.joda.time.DateTime dateTime31 = dateTime21.withZone(dateTimeZone26);
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.lang.String str34 = dateTimeZone26.getName(0L, locale33);
        int int35 = dateTimeField11.getMaximumTextLength(locale33);
        long long37 = dateTimeField11.remainder((-863352564362885353L));
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfCentury();
        org.joda.time.LocalDate localDate40 = property39.getLocalDate();
        org.joda.time.LocalDate localDate41 = property39.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate43 = property39.addWrapFieldToCopy(28);
        org.joda.time.LocalDate localDate44 = property39.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property46 = localDate45.yearOfCentury();
        org.joda.time.LocalDate localDate47 = property46.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean51 = dateTimeZone50.isFixed();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone50);
        org.joda.time.DateTime dateTime53 = localDate47.toDateTimeAtStartOfDay(dateTimeZone50);
        org.joda.time.DateTime dateTime54 = dateTime53.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str56 = dateTimeFieldType55.getName();
        org.joda.time.DateTime.Property property57 = dateTime54.property(dateTimeFieldType55);
        org.joda.time.Interval interval58 = property57.toInterval();
        org.joda.time.DateTimeField dateTimeField59 = property57.getField();
        org.joda.time.DateTime dateTime61 = property57.addToCopy(5);
        org.joda.time.DateTime dateTime63 = dateTime61.withWeekyear(10);
        org.joda.time.DateTime.Property property64 = dateTime61.weekOfWeekyear();
        java.util.Locale locale68 = new java.util.Locale("5 Jun 798307 11:57:00 GMT", "PT0S", "1969");
        int int69 = property64.getMaximumTextLength(locale68);
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(locale68);
        java.lang.String str71 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) localDate44, locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime31", (dateTime21.compareTo(dateTime31) == 0) == dateTime21.equals(dateTime31));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.minusWeeks(292275055);
        org.joda.time.DateTime dateTime24 = dateTime22.withMillisOfDay(56165);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime11.plus((long) (short) 0);
        int int17 = dateTime16.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant13", (dateTime16.compareTo(instant13) == 0) == dateTime16.equals(instant13));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears(3);
        int int25 = dateTime24.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean4 = dateTimeZone3.isFixed();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone3);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtMidnight(dateTimeZone7);
        int int9 = dateTime8.getMonthOfYear();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = dateTime8.toDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 15, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType17.getDurationType();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfCentury();
        org.joda.time.LocalDate.Property property21 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property21.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate24 = property21.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        boolean boolean26 = durationFieldType18.isSupported(chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology25);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property29 = localDate28.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone33);
        org.joda.time.DateTime dateTime36 = localDate30.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.LocalDate localDate38 = localDate30.plusMonths((int) (short) 1);
        java.lang.String str39 = localDate38.toString();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean43 = dateTimeZone42.isFixed();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone42);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.DateTime dateTime47 = localDate44.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = localDate38.toDateTimeAtStartOfDay(dateTimeZone46);
        long long52 = dateTimeZone46.convertLocalToUTC(31536000000L, true, (long) 32770);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((java.lang.Object) dateTime27, dateTimeZone46);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property55 = localDate54.yearOfCentury();
        org.joda.time.LocalDate localDate57 = localDate54.plusWeeks(32770);
        int int58 = localDate57.size();
        org.joda.time.LocalDate localDate60 = localDate57.withEra((int) (short) 0);
        int int61 = localDate57.getDayOfWeek();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) (byte) 100);
        org.joda.time.LocalDate localDate64 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean68 = dateTimeZone67.isFixed();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int72 = dateTimeZone70.getOffsetFromLocal((long) 6);
        long long74 = dateTimeZone67.getMillisKeepLocal(dateTimeZone70, (long) 10);
        org.joda.time.Interval interval75 = localDate65.toInterval(dateTimeZone67);
        org.joda.time.DateTime dateTime76 = localDate64.toDateTimeAtMidnight(dateTimeZone67);
        java.lang.String str77 = dateTimeZone67.toString();
        long long79 = dateTimeZone67.nextTransition((long) 0);
        long long81 = dateTimeZone67.previousTransition((long) '4');
        org.joda.time.DateTime dateTime82 = localDate63.toDateTimeAtStartOfDay(dateTimeZone67);
        org.joda.time.DateMidnight dateMidnight83 = localDate57.toDateMidnight(dateTimeZone67);
        org.joda.time.DateTime dateTime84 = dateTime27.withZoneRetainFields(dateTimeZone67);
        org.joda.time.LocalDate localDate85 = new org.joda.time.LocalDate((java.lang.Object) dateTime14, dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime53", (dateTime27.compareTo(dateTime53) == 0) == dateTime27.equals(dateTime53));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate4 = property2.addWrapFieldToCopy((int) (short) -1);
        java.lang.String str5 = property2.getAsString();
        org.joda.time.LocalDate localDate6 = property2.withMinimumValue();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.millisOfSecond();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.DurationField durationField12 = chronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField12, and durationField9", !(durationField9.compareTo(durationField12) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField12.compareTo(durationField9))));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(localTime13);
        int int15 = localDate12.getEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(57);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtCurrentTime(dateTimeZone17);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("allemand");
        java.util.Calendar calendar21 = dateTime18.toCalendar(locale20);
        int int23 = calendar21.getMaximum((int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime18", (dateTime14.compareTo(dateTime18) == 0) == dateTime14.equals(dateTime18));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        org.joda.time.DateTime dateTime16 = property14.addWrapFieldToCopy(8);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds((-3599));
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.lang.String str30 = locale29.getVariant();
        java.util.Calendar calendar31 = dateTime28.toCalendar(locale29);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean35 = dateTimeZone34.isFixed();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone34);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTime dateTime39 = localDate36.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withMillis((long) 32772);
        org.joda.time.DateTime dateTime43 = dateTime41.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Interval interval51 = interval49.withChronology(chronology50);
        org.joda.time.Duration duration52 = interval49.toDuration();
        org.joda.time.DateTime dateTime53 = dateTime45.plus((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Interval interval54 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableDuration) duration52);
        boolean boolean55 = dateTime28.isAfterNow();
        int int56 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property58 = localDate57.yearOfCentury();
        org.joda.time.LocalDate localDate59 = property58.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean63 = dateTimeZone62.isFixed();
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone62);
        org.joda.time.DateTime dateTime65 = localDate59.toDateTimeAtStartOfDay(dateTimeZone62);
        org.joda.time.DateTime dateTime66 = dateTime65.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str68 = dateTimeFieldType67.getName();
        org.joda.time.DateTime.Property property69 = dateTime66.property(dateTimeFieldType67);
        org.joda.time.Interval interval70 = property69.toInterval();
        org.joda.time.DateTimeField dateTimeField71 = property69.getField();
        long long74 = dateTimeField71.add((long) (byte) 10, (-1));
        long long76 = dateTimeField71.roundHalfEven(100L);
        boolean boolean78 = dateTimeField71.isLeap(120L);
        org.joda.time.LocalDate localDate79 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property80 = localDate79.yearOfCentury();
        org.joda.time.LocalDate localDate81 = property80.getLocalDate();
        int int82 = localDate81.getWeekyear();
        int int83 = localDate81.getWeekyear();
        int int84 = dateTimeField71.getMaximumValue((org.joda.time.ReadablePartial) localDate81);
        long long86 = dateTimeField71.roundHalfCeiling((-360L));
        long long89 = dateTimeField71.getDifferenceAsLong(763200000L, (long) 28800);
        long long92 = dateTimeField71.set(31536000000L, 21597);
        org.joda.time.DurationField durationField93 = dateTimeField71.getLeapDurationField();
        int int94 = dateTime28.get(dateTimeField71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean4 = dateTimeZone3.isFixed();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone3);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtMidnight(dateTimeZone7);
        int int9 = dateTime8.getMonthOfYear();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = dateTime8.toDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 15, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(365);
        org.joda.time.DateTime dateTime19 = dateTime16.withZone(dateTimeZone18);
        boolean boolean20 = dateTimeZone18.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime19", (dateTime14.compareTo(dateTime19) == 0) == dateTime14.equals(dateTime19));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime dateTime14 = dateTime13.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = dateTime13.plusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTime dateTime24 = localDate21.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean29 = dateTimeZone28.isFixed();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int33 = dateTimeZone31.getOffsetFromLocal((long) 6);
        long long35 = dateTimeZone28.getMillisKeepLocal(dateTimeZone31, (long) 10);
        org.joda.time.DateTime dateTime36 = dateTime26.withZone(dateTimeZone31);
        org.joda.time.DateTime.Property property37 = dateTime36.weekOfWeekyear();
        org.joda.time.DateTime dateTime39 = dateTime36.withMinuteOfHour(7);
        boolean boolean40 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property43 = localDate42.yearOfCentury();
        org.joda.time.LocalDate localDate44 = property43.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean48 = dateTimeZone47.isFixed();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = localDate44.toDateTimeAtStartOfDay(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime50.toMutableDateTime();
        org.joda.time.Chronology chronology52 = dateTime50.getChronology();
        boolean boolean53 = dateTimeFieldType41.isSupported(chronology52);
        org.joda.time.Chronology chronology54 = chronology52.withUTC();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.secondOfDay();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.dayOfYear();
        org.joda.time.DateTimeField dateTimeField58 = chronology54.clockhourOfHalfday();
        org.joda.time.DateTime dateTime59 = dateTime39.withChronology(chronology54);
        org.joda.time.DateTimeField dateTimeField60 = chronology54.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime59", (dateTime39.compareTo(dateTime59) == 0) == dateTime39.equals(dateTime59));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        java.lang.String str3 = property1.getName();
        org.joda.time.LocalDate localDate4 = property1.getLocalDate();
        org.joda.time.LocalDate localDate6 = property1.addToCopy(31);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int11 = dateTimeZone9.getOffset((long) 2022);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 32770, dateTimeZone9);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DateTime.Property property25 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTime dateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        long long30 = dateTimeZone9.getMillisKeepLocal(dateTimeZone28, (long) 9);
        long long34 = dateTimeZone9.convertLocalToUTC((-1632961261000L), true, (long) 13);
        int int36 = dateTimeZone9.getOffset((long) '4');
        org.joda.time.DateTime dateTime37 = localDate6.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean41 = dateTimeZone40.isFixed();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone40);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateTime dateTime45 = localDate42.toDateTimeAtCurrentTime(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withMillis((long) 32772);
        org.joda.time.DateTime dateTime49 = dateTime47.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime51 = dateTime49.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTime dateTime54 = dateTime49.withDurationAdded(readableDuration52, 292278994);
        org.joda.time.DateTime dateTime56 = dateTime54.minusSeconds(8);
        org.joda.time.Instant instant57 = dateTime54.toInstant();
        org.joda.time.DateTimeZone dateTimeZone58 = instant57.getZone();
        boolean boolean59 = dateTime37.equals((java.lang.Object) dateTimeZone58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and instant57", (dateTime49.compareTo(instant57) == 0) == dateTime49.equals(instant57));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears(3);
        org.joda.time.YearMonth yearMonth25 = new org.joda.time.YearMonth((java.lang.Object) dateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        java.lang.String str11 = localDate10.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate10.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate.Property property23 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property23.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate26 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = localDate26.getFields();
        org.joda.time.DateTime dateTime28 = dateTime20.withFields((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfMinute();
        org.joda.time.DurationField durationField33 = chronology31.seconds();
        org.joda.time.DurationField durationField34 = chronology31.years();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.millisOfDay();
        org.joda.time.DateTime dateTime36 = dateTime20.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField37 = chronology31.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime36", (dateTime20.compareTo(dateTime36) == 0) == dateTime20.equals(dateTime36));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.secondOfMinute();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DurationField durationField30 = durationFieldType24.getField(chronology27);
        org.joda.time.DurationField durationField31 = chronology27.millis();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(315532800002L, chronology27);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withDefaultYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int42 = dateTimeZone40.getOffset((long) 2022);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 32770, dateTimeZone40);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property45 = localDate44.yearOfCentury();
        org.joda.time.LocalDate localDate46 = property45.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean50 = dateTimeZone49.isFixed();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone49);
        org.joda.time.DateTime dateTime52 = localDate46.toDateTimeAtStartOfDay(dateTimeZone49);
        org.joda.time.DateTime dateTime53 = dateTime52.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str55 = dateTimeFieldType54.getName();
        org.joda.time.DateTime.Property property56 = dateTime53.property(dateTimeFieldType54);
        org.joda.time.DateTime dateTime57 = property56.roundFloorCopy();
        org.joda.time.DateTime.Property property58 = dateTime57.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime57.getZone();
        long long61 = dateTimeZone40.getMillisKeepLocal(dateTimeZone59, (long) 9);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean64 = dateTimeZone63.isFixed();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int68 = dateTimeZone66.getOffsetFromLocal((long) 6);
        long long70 = dateTimeZone63.getMillisKeepLocal(dateTimeZone66, (long) 10);
        long long72 = dateTimeZone40.getMillisKeepLocal(dateTimeZone66, (long) 1970);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter35.withZone(dateTimeZone66);
        java.lang.String str75 = dateTimeZone66.getShortName((long) 796407);
        org.joda.time.Chronology chronology76 = chronology27.withZone(dateTimeZone66);
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime16.toMutableDateTime(chronology27);
        boolean boolean79 = mutableDateTime77.isEqual(57L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime17 = localDate7.toDateTimeAtMidnight(dateTimeZone13);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) 9);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone23);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime28 = localDate25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withMillis((long) 32772);
        org.joda.time.DateTime dateTime32 = dateTime30.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime34 = dateTime30.withSecondOfMinute((int) (short) 10);
        org.joda.time.DateTime dateTime36 = dateTime30.minusHours(32772);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(20);
        java.lang.Object obj39 = null;
        boolean boolean40 = dateTimeZone38.equals(obj39);
        org.joda.time.DateTime dateTime41 = dateTime30.withZoneRetainFields(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime20.withZone(dateTimeZone38);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.era();
        long long51 = chronology45.add((-2479L), (long) ' ', 19);
        org.joda.time.DateTimeField dateTimeField52 = chronology45.dayOfMonth();
        org.joda.time.DateTime dateTime53 = dateTime42.withChronology(chronology45);
        int int54 = dateTime42.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime53", (dateTime20.compareTo(dateTime53) == 0) == dateTime20.equals(dateTime53));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(32772);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTime dateTime14 = localDate5.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property15 = localDate5.yearOfEra();
        int int16 = localDate5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        boolean boolean23 = localDate21.isSupported(durationFieldType22);
        org.joda.time.LocalDate localDate25 = localDate21.minusDays(57);
        org.joda.time.LocalDate localDate27 = localDate21.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        boolean boolean29 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalTime localTime30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate27.toDateTime(localTime30, dateTimeZone31);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate35 = property34.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.LocalDate localDate43 = localDate35.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property44 = localDate43.dayOfWeek();
        org.joda.time.LocalDate localDate46 = property44.addToCopy(10);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        java.lang.String str50 = dateTimeZone48.getName(10L);
        java.util.Locale locale54 = new java.util.Locale("70", "hi!");
        java.lang.String str55 = dateTimeZone48.getName((long) '4', locale54);
        org.joda.time.Interval interval56 = localDate46.toInterval(dateTimeZone48);
        org.joda.time.LocalDate localDate58 = localDate46.plusDays(19);
        int int59 = localDate46.getCenturyOfEra();
        org.joda.time.Chronology chronology60 = localDate46.getChronology();
        org.joda.time.DateTime dateTime61 = dateTime32.toDateTime(chronology60);
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime61", (dateTime32.compareTo(dateTime61) == 0) == dateTime32.equals(dateTime61));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) (short) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter2.getZone();
        java.util.Calendar.Builder builder7 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder9 = builder7.setInstant((long) 32770);
        java.util.Calendar calendar10 = builder9.build();
        boolean boolean12 = calendar10.after((java.lang.Object) 70);
        calendar10.set(10, 32772, (int) (byte) 1, 22, 0);
        int int19 = calendar10.getMinimalDaysInFirstWeek();
        int int20 = calendar10.getFirstDayOfWeek();
        int int21 = calendar10.getWeekYear();
        int int22 = calendar10.getWeeksInWeekYear();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.fromCalendarFields(calendar10);
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime26 = dateTime24.minusYears(21600010);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale30 = new java.util.Locale("yearOfCentury");
        boolean boolean31 = dateTimeZone28.equals((java.lang.Object) locale30);
        int int33 = dateTimeZone28.getStandardOffset(9223371988855200000L);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) dateTime24, dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter2.withZone(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime34", (dateTime24.compareTo(dateTime34) == 0) == dateTime24.equals(dateTime34));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str26 = dateTimeFieldType25.getName();
        org.joda.time.DateTime.Property property27 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTime dateTime28 = property27.roundFloorCopy();
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime28.getZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone33);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTime dateTime38 = localDate35.toDateTimeAtMidnight(dateTimeZone37);
        int int39 = dateTime38.getMonthOfYear();
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime(dateTimeZone41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        long long45 = dateTimeZone30.getMillisKeepLocal(dateTimeZone41, (long) 7);
        org.joda.time.DateTime dateTime46 = dateTime14.toDateTime(dateTimeZone41);
        int int47 = dateTime46.getSecondOfMinute();
        org.joda.time.DateTime dateTime49 = dateTime46.minusYears((int) (short) -1);
        org.joda.time.DateTime.Property property50 = dateTime49.year();
        org.joda.time.DateTime dateTime52 = property50.addWrapFieldToCopy((-2740));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime46", (dateTime14.compareTo(dateTime46) == 0) == dateTime14.equals(dateTime46));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(dateTimeZone21);
        long long25 = dateTimeZone21.nextTransition((long) 2922749);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime23", (dateTime13.compareTo(mutableDateTime23) == 0) == dateTime13.equals(mutableDateTime23));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property2 = localDate1.yearOfCentury();
        org.joda.time.LocalDate localDate3 = property2.getLocalDate();
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = property2.getDifference(readableInstant4);
        org.joda.time.LocalDate localDate6 = property2.withMaximumValue();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate9 = property8.getLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate13 = localDate11.plusMonths(32772);
        org.joda.time.LocalDate localDate14 = localDate6.withFields((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTime dateTime15 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property16 = localDate6.yearOfEra();
        int int17 = localDate6.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.minutes();
        boolean boolean24 = localDate22.isSupported(durationFieldType23);
        org.joda.time.LocalDate localDate26 = localDate22.minusDays(57);
        org.joda.time.LocalDate localDate28 = localDate22.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        boolean boolean30 = localDate6.isAfter((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalTime localTime31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate28.toDateTime(localTime31, dateTimeZone32);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property35 = localDate34.yearOfCentury();
        org.joda.time.LocalDate localDate36 = property35.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone39);
        org.joda.time.DateTime dateTime42 = localDate36.toDateTimeAtStartOfDay(dateTimeZone39);
        org.joda.time.LocalDate localDate44 = localDate36.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property45 = localDate44.dayOfWeek();
        org.joda.time.LocalDate localDate47 = property45.addToCopy(10);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        java.lang.String str51 = dateTimeZone49.getName(10L);
        java.util.Locale locale55 = new java.util.Locale("70", "hi!");
        java.lang.String str56 = dateTimeZone49.getName((long) '4', locale55);
        org.joda.time.Interval interval57 = localDate47.toInterval(dateTimeZone49);
        org.joda.time.LocalDate localDate59 = localDate47.plusDays(19);
        int int60 = localDate47.getCenturyOfEra();
        org.joda.time.Chronology chronology61 = localDate47.getChronology();
        org.joda.time.DateTime dateTime62 = dateTime33.toDateTime(chronology61);
        org.joda.time.YearMonth yearMonth63 = new org.joda.time.YearMonth(2656767228L, chronology61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and dateTime62", (dateTime33.compareTo(dateTime62) == 0) == dateTime33.equals(dateTime62));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property23 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime26 = dateTime9.minusDays(32772);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfMonth();
        org.joda.time.DateTime.Property property28 = dateTime26.secondOfMinute();
        org.joda.time.DateTime.Property property29 = dateTime26.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean33 = dateTimeZone32.isFixed();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone32);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTime dateTime37 = localDate34.toDateTimeAtCurrentTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withMillis((long) 32772);
        org.joda.time.DateTime dateTime41 = dateTime39.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property42 = dateTime41.year();
        org.joda.time.Instant instant43 = dateTime41.toInstant();
        int int44 = dateTime41.getWeekyear();
        int int45 = dateTime41.getMillisOfDay();
        org.joda.time.DateTime dateTime47 = dateTime41.withYear(32);
        org.joda.time.DateTime dateTime50 = dateTime41.withDurationAdded((long) 'u', (-7));
        long long51 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant43", (dateTime41.compareTo(instant43) == 0) == dateTime41.equals(instant43));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology19);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.secondOfMinute();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DurationField durationField30 = durationFieldType24.getField(chronology27);
        org.joda.time.DurationField durationField31 = chronology27.millis();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(315532800002L, chronology27);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withDefaultYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int42 = dateTimeZone40.getOffset((long) 2022);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 32770, dateTimeZone40);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property45 = localDate44.yearOfCentury();
        org.joda.time.LocalDate localDate46 = property45.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean50 = dateTimeZone49.isFixed();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone49);
        org.joda.time.DateTime dateTime52 = localDate46.toDateTimeAtStartOfDay(dateTimeZone49);
        org.joda.time.DateTime dateTime53 = dateTime52.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str55 = dateTimeFieldType54.getName();
        org.joda.time.DateTime.Property property56 = dateTime53.property(dateTimeFieldType54);
        org.joda.time.DateTime dateTime57 = property56.roundFloorCopy();
        org.joda.time.DateTime.Property property58 = dateTime57.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime57.getZone();
        long long61 = dateTimeZone40.getMillisKeepLocal(dateTimeZone59, (long) 9);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean64 = dateTimeZone63.isFixed();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int68 = dateTimeZone66.getOffsetFromLocal((long) 6);
        long long70 = dateTimeZone63.getMillisKeepLocal(dateTimeZone66, (long) 10);
        long long72 = dateTimeZone40.getMillisKeepLocal(dateTimeZone66, (long) 1970);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter35.withZone(dateTimeZone66);
        java.lang.String str75 = dateTimeZone66.getShortName((long) 796407);
        org.joda.time.Chronology chronology76 = chronology27.withZone(dateTimeZone66);
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime16.toMutableDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField78 = chronology27.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime17 = localDate7.toDateTimeAtMidnight(dateTimeZone13);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) 9);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone23);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime28 = localDate25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withMillis((long) 32772);
        org.joda.time.DateTime dateTime32 = dateTime30.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime34 = dateTime30.withSecondOfMinute((int) (short) 10);
        org.joda.time.DateTime dateTime36 = dateTime30.minusHours(32772);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(20);
        java.lang.Object obj39 = null;
        boolean boolean40 = dateTimeZone38.equals(obj39);
        org.joda.time.DateTime dateTime41 = dateTime30.withZoneRetainFields(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime20.withZone(dateTimeZone38);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.era();
        long long51 = chronology45.add((-2479L), (long) ' ', 19);
        org.joda.time.DateTimeField dateTimeField52 = chronology45.dayOfMonth();
        org.joda.time.DateTime dateTime53 = dateTime42.withChronology(chronology45);
        org.joda.time.DateTimeField dateTimeField54 = chronology45.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime42", (dateTime20.compareTo(dateTime42) == 0) == dateTime20.equals(dateTime42));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.era();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime9.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.yearOfCentury();
        int int36 = dateTimeField34.get(2275812L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime19.withMillis((long) 86397);
        org.joda.time.DateTime dateTime42 = dateTime40.minusYears(2011);
        org.joda.time.DateTime dateTime44 = dateTime40.minusMinutes(56514);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((long) (short) 1, chronology1);
        org.joda.time.Chronology chronology3 = yearMonth2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.DurationField durationField7 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField4, and durationField6", !(durationField7.compareTo(durationField4) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField4.compareTo(durationField6))));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar.Builder builder6 = builder0.setWeekDate(42, (-1), 14);
        java.util.Calendar.Builder builder7 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder9 = builder7.setInstant((long) 32770);
        java.util.Calendar calendar10 = builder9.build();
        boolean boolean12 = calendar10.after((java.lang.Object) 70);
        calendar10.set(10, 32772, (int) (byte) 1, 22, 0);
        long long19 = calendar10.getTimeInMillis();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = dateTime28.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str31 = dateTimeFieldType30.getName();
        org.joda.time.DateTime.Property property32 = dateTime29.property(dateTimeFieldType30);
        org.joda.time.DateTime dateTime33 = property32.roundFloorCopy();
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime33.getZone();
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        calendar10.setTimeZone(timeZone36);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone36);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.Locale.Builder builder40 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder40.removeUnicodeLocaleAttribute("eras");
        java.util.Locale locale43 = builder42.build();
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone36, locale43);
        java.util.Calendar.Builder builder45 = builder0.setTimeZone(timeZone36);
        java.util.Calendar.Builder builder49 = builder0.setWeekDate(0, (-18), 8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar44", (calendar38.compareTo(calendar44) == 0) == calendar38.equals(calendar44));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfWeek();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.DateMidnight dateMidnight23 = localDate22.toDateMidnight();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate.Property property26 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate28 = property26.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField29 = property26.getField();
        int int31 = dateTimeField29.get((long) 'u');
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property33 = localDate32.yearOfCentury();
        org.joda.time.LocalDate localDate34 = property33.getLocalDate();
        int int35 = dateTimeField29.getMaximumValue((org.joda.time.ReadablePartial) localDate34);
        boolean boolean36 = localDate22.isAfter((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property38 = localDate37.yearOfCentury();
        org.joda.time.LocalDate localDate39 = property38.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean43 = dateTimeZone42.isFixed();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone42);
        org.joda.time.DateTime dateTime45 = localDate39.toDateTimeAtStartOfDay(dateTimeZone42);
        org.joda.time.DateTime dateTime46 = dateTime45.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property47 = dateTime46.year();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property49 = localDate48.yearOfCentury();
        org.joda.time.LocalDate localDate50 = property49.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean54 = dateTimeZone53.isFixed();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = localDate50.toDateTimeAtStartOfDay(dateTimeZone53);
        org.joda.time.DateTime dateTime57 = dateTime56.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str59 = dateTimeFieldType58.getName();
        org.joda.time.DateTime.Property property60 = dateTime57.property(dateTimeFieldType58);
        org.joda.time.Interval interval61 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime63 = dateTime46.minusDays(32772);
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.DateTime dateTime65 = dateTime63.plus(readableDuration64);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime63.getZone();
        org.joda.time.DateMidnight dateMidnight67 = localDate34.toDateMidnight(dateTimeZone66);
        org.joda.time.DateTime dateTime68 = dateTime19.withZoneRetainFields(dateTimeZone66);
        int int69 = dateTime68.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime68", (dateTime9.compareTo(dateTime68) == 0) == dateTime9.equals(dateTime68));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean4 = dateTimeZone3.isFixed();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.minutes();
        boolean boolean7 = localDate5.isSupported(durationFieldType6);
        org.joda.time.LocalDate.Property property8 = localDate5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        org.joda.time.LocalDate localDate11 = property10.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = localDate11.toDateTimeAtStartOfDay(dateTimeZone14);
        long long18 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property19 = dateTime17.secondOfMinute();
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(4);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property23 = localDate22.yearOfCentury();
        org.joda.time.LocalDate localDate24 = property23.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDate24.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.DateTime dateTime31 = dateTime30.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str33 = dateTimeFieldType32.getName();
        org.joda.time.DateTime.Property property34 = dateTime31.property(dateTimeFieldType32);
        org.joda.time.DateTime dateTime35 = dateTime31.withLaterOffsetAtOverlap();
        int int36 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfCentury();
        org.joda.time.LocalDate.Property property40 = localDate38.yearOfCentury();
        org.joda.time.LocalDate localDate42 = property40.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate43 = property40.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology44 = localDate43.getChronology();
        boolean boolean45 = durationFieldType37.isSupported(chronology44);
        org.joda.time.Chronology chronology46 = chronology44.withUTC();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.dayOfYear();
        org.joda.time.Chronology chronology48 = chronology44.withUTC();
        org.joda.time.DateTime dateTime49 = dateTime35.withChronology(chronology48);
        org.joda.time.YearMonth yearMonth50 = new org.joda.time.YearMonth((-3087906970664L), chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime49", (dateTime17.compareTo(dateTime49) == 0) == dateTime17.equals(dateTime49));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        java.lang.String str3 = property1.getName();
        long long4 = property1.remainder();
        int int5 = property1.getMinimumValue();
        org.joda.time.LocalDate localDate6 = property1.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property1.getFieldType();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = locale8.stripExtensions();
        int int11 = property1.getMaximumTextLength(locale8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillis((long) 32772);
        org.joda.time.DateTime dateTime23 = dateTime21.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Interval interval31 = interval29.withChronology(chronology30);
        org.joda.time.Duration duration32 = interval29.toDuration();
        org.joda.time.DateTime dateTime33 = dateTime25.plus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property35 = localDate34.yearOfCentury();
        org.joda.time.LocalDate localDate36 = property35.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone39);
        org.joda.time.DateTime dateTime42 = localDate36.toDateTimeAtStartOfDay(dateTimeZone39);
        org.joda.time.DateTime dateTime43 = dateTime33.withZoneRetainFields(dateTimeZone39);
        long long44 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Instant instant45 = dateTime33.toInstant();
        org.joda.time.Chronology chronology46 = dateTime33.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant45", (dateTime33.compareTo(instant45) == 0) == dateTime33.equals(instant45));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime7.minusHours(17);
        int int12 = dateTime7.getHourOfDay();
        org.joda.time.DateTime.Property property13 = dateTime7.secondOfDay();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = dateTime22.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str25 = dateTimeFieldType24.getName();
        org.joda.time.DateTime.Property property26 = dateTime23.property(dateTimeFieldType24);
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.MutableInterval mutableInterval28 = interval27.toMutableInterval();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property30 = localDate29.yearOfCentury();
        org.joda.time.LocalDate localDate31 = property30.getLocalDate();
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = property30.getDifference(readableInstant32);
        org.joda.time.LocalDate localDate34 = property30.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean38 = dateTimeZone37.isFixed();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone37);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTime dateTime42 = localDate39.toDateTimeAtCurrentTime(dateTimeZone41);
        boolean boolean43 = localDate34.equals((java.lang.Object) dateTime42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate34.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = dateTime45.toDateTime();
        boolean boolean47 = mutableInterval28.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime.Property property48 = dateTime45.millisOfSecond();
        org.joda.time.DateTime dateTime49 = property48.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property51 = localDate50.yearOfCentury();
        org.joda.time.LocalDate localDate52 = property51.getLocalDate();
        org.joda.time.ReadableInstant readableInstant53 = null;
        int int54 = property51.getDifference(readableInstant53);
        org.joda.time.LocalDate localDate55 = property51.withMaximumValue();
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(chronology56);
        org.joda.time.DateTime dateTime58 = dateTime49.withChronology(chronology56);
        org.joda.time.YearMonth yearMonth59 = new org.joda.time.YearMonth((java.lang.Object) dateTime7, chronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and dateTime58", (dateTime45.compareTo(dateTime58) == 0) == dateTime45.equals(dateTime58));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        java.lang.String str3 = localDate1.toString();
        org.joda.time.LocalDate localDate5 = localDate1.minusYears(0);
        org.joda.time.LocalDate.Property property6 = localDate1.year();
        org.joda.time.LocalDate localDate8 = property6.addWrapFieldToCopy(4);
        org.joda.time.LocalDate.Property property9 = localDate8.weekyear();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = dateTime33.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str36 = dateTimeFieldType35.getName();
        org.joda.time.DateTime.Property property37 = dateTime34.property(dateTimeFieldType35);
        org.joda.time.DateTime dateTime38 = property37.roundFloorCopy();
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime38.getZone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean44 = dateTimeZone43.isFixed();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone43);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.DateTime dateTime48 = localDate45.toDateTimeAtMidnight(dateTimeZone47);
        int int49 = dateTime48.getMonthOfYear();
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        org.joda.time.DateTime dateTime52 = dateTime48.toDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone51);
        long long55 = dateTimeZone40.getMillisKeepLocal(dateTimeZone51, (long) 7);
        org.joda.time.DateTime dateTime56 = dateTime24.toDateTime(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime56.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime58 = localDate8.toDateTime((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.LocalDate.Property property59 = localDate8.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime56", (dateTime24.compareTo(dateTime56) == 0) == dateTime24.equals(dateTime56));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(dateTimeZone21);
        int int24 = dateTime13.getMillisOfDay();
        int int25 = dateTime13.getMonthOfYear();
        org.joda.time.Instant instant26 = dateTime13.toInstant();
        org.joda.time.DateTime dateTime27 = dateTime13.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant26", (mutableDateTime23.compareTo(instant26) == 0) == mutableDateTime23.equals(instant26));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(32772);
        org.joda.time.LocalDate localDate8 = localDate4.minusYears((int) (short) 10);
        org.joda.time.LocalDate.Property property9 = localDate4.weekyear();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfMinute();
        org.joda.time.DurationField durationField14 = chronology12.seconds();
        org.joda.time.DurationField durationField15 = chronology12.years();
        boolean boolean16 = localDate4.equals((java.lang.Object) chronology12);
        org.joda.time.DurationField durationField17 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField14, and durationField15", !(durationField17.compareTo(durationField14) == 0) || (Math.signum(durationField17.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = yearMonth1.toInterval(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth1.getFieldTypes();
        org.joda.time.YearMonth yearMonth6 = yearMonth1.withYear((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.eras();
        boolean boolean8 = yearMonth1.equals((java.lang.Object) durationFieldType7);
        int[] intArray9 = yearMonth1.getValues();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = yearMonth14.toInterval(dateTimeZone15);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = yearMonth14.getFieldTypes();
        org.joda.time.YearMonth.Property property18 = yearMonth14.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = yearMonth14.toString(dateTimeFormatter19);
        org.joda.time.YearMonth yearMonth22 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Interval interval24 = yearMonth22.toInterval(dateTimeZone23);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = yearMonth22.getFieldTypes();
        org.joda.time.YearMonth.Property property26 = yearMonth22.year();
        org.joda.time.YearMonth yearMonth28 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth30 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Interval interval32 = yearMonth30.toInterval(dateTimeZone31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.Interval interval34 = interval32.withPeriodAfterStart(readablePeriod33);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = interval34.toPeriod(periodType35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean38 = period36.isSupported(durationFieldType37);
        org.joda.time.YearMonth yearMonth40 = yearMonth28.withPeriodAdded((org.joda.time.ReadablePeriod) period36, 32770);
        org.joda.time.YearMonth yearMonth41 = yearMonth22.minus((org.joda.time.ReadablePeriod) period36);
        boolean boolean42 = yearMonth14.isAfter((org.joda.time.ReadablePartial) yearMonth41);
        org.joda.time.Chronology chronology43 = yearMonth41.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter12.withChronology(chronology43);
        org.joda.time.DurationField durationField46 = chronology43.months();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.monthOfYear();
        org.joda.time.YearMonth yearMonth49 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.Interval interval51 = yearMonth49.toInterval(dateTimeZone50);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray52 = yearMonth49.getFieldTypes();
        org.joda.time.YearMonth yearMonth54 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.Interval interval56 = yearMonth54.toInterval(dateTimeZone55);
        org.joda.time.YearMonth yearMonth58 = yearMonth54.minusMonths((int) (short) 1);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.YearMonth yearMonth60 = yearMonth58.withChronologyRetainFields(chronology59);
        int int61 = yearMonth49.compareTo((org.joda.time.ReadablePartial) yearMonth60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.YearMonth yearMonth63 = yearMonth60.minus(readablePeriod62);
        org.joda.time.YearMonth yearMonth65 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.Interval interval67 = yearMonth65.toInterval(dateTimeZone66);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray68 = yearMonth65.getFieldTypes();
        org.joda.time.YearMonth.Property property69 = yearMonth65.year();
        java.lang.String str70 = property69.toString();
        org.joda.time.YearMonth yearMonth71 = property69.getYearMonth();
        int[] intArray72 = yearMonth71.getValues();
        chronology43.validate((org.joda.time.ReadablePartial) yearMonth63, intArray72);
        org.joda.time.DateTimeField dateTimeField74 = chronology43.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField75 = chronology43.dayOfMonth();
        long long79 = chronology43.add((long) 2, (long) 21597772, (int) '#');
        org.joda.time.DurationField durationField80 = chronology43.eras();
        boolean boolean81 = yearMonth1.equals((java.lang.Object) durationField80);
        int[] intArray82 = yearMonth1.getValues();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField46 and durationField80", Math.signum(durationField46.compareTo(durationField80)) == -Math.signum(durationField80.compareTo(durationField46)));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) (byte) 10);
        java.util.Date date6 = calendar3.getTime();
        date6.setYear(822);
        int int9 = date6.getDate();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean16 = dateTimeZone15.isFixed();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.DateTime dateTime19 = dateTime18.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property20 = dateTime19.year();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = dateTime29.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str32 = dateTimeFieldType31.getName();
        org.joda.time.DateTime.Property property33 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime36 = dateTime30.plusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        int int38 = dateTime37.getYear();
        int int39 = dateTime37.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean43 = dateTimeZone42.isFixed();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone42);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.DateTime dateTime47 = localDate44.toDateTimeAtCurrentTime(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.withMillis((long) 32772);
        org.joda.time.DateTime dateTime51 = dateTime49.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime53 = dateTime51.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.Interval interval57 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Interval interval59 = interval57.withChronology(chronology58);
        org.joda.time.Duration duration60 = interval57.toDuration();
        org.joda.time.DateTime dateTime61 = dateTime53.plus((org.joda.time.ReadableDuration) duration60);
        org.joda.time.DateTime dateTime64 = dateTime61.withDurationAdded((long) ' ', (int) (byte) 100);
        int int65 = dateTime61.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime61.toMutableDateTimeISO();
        int int67 = dateTime37.compareTo((org.joda.time.ReadableInstant) mutableDateTime66);
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property69 = localDate68.yearOfCentury();
        org.joda.time.LocalDate localDate70 = property69.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean74 = dateTimeZone73.isFixed();
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone73);
        org.joda.time.DateTime dateTime76 = localDate70.toDateTimeAtStartOfDay(dateTimeZone73);
        org.joda.time.DateTime dateTime77 = dateTime76.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str79 = dateTimeFieldType78.getName();
        org.joda.time.DateTime.Property property80 = dateTime77.property(dateTimeFieldType78);
        org.joda.time.DateTime dateTime81 = property80.roundFloorCopy();
        org.joda.time.DateTime.Property property82 = dateTime81.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone83 = dateTime81.getZone();
        org.joda.time.DateTime dateTime84 = org.joda.time.DateTime.now(dateTimeZone83);
        org.joda.time.Instant instant85 = dateTime84.toInstant();
        boolean boolean86 = dateTime37.isEqual((org.joda.time.ReadableInstant) dateTime84);
        boolean boolean87 = date6.equals((java.lang.Object) boolean86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime84 and instant85", (dateTime84.compareTo(instant85) == 0) == dateTime84.equals(instant85));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate9 = property8.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean13 = dateTimeZone12.isFixed();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDate9.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        boolean boolean17 = dateTime15.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Interval interval23 = interval21.withChronology(chronology22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime32.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property34 = dateTime33.year();
        boolean boolean35 = interval23.contains((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Period period36 = interval23.toPeriod();
        org.joda.time.DateTime dateTime38 = dateTime15.withPeriodAdded((org.joda.time.ReadablePeriod) period36, 360240000);
        org.joda.time.LocalDate localDate39 = localDate4.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Interval interval40 = localDate4.toInterval();
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        java.util.Calendar.Builder builder42 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder44 = builder42.setInstant((long) 32770);
        java.util.Calendar calendar45 = builder42.build();
        java.util.TimeZone timeZone46 = calendar45.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.DateTime dateTime48 = dateTime41.withZone(dateTimeZone47);
        long long52 = dateTimeZone47.convertLocalToUTC(0L, false, 31800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime48", (dateTime41.compareTo(dateTime48) == 0) == dateTime41.equals(dateTime48));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight(dateTimeZone6);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateMidnight dateMidnight9 = dateTime7.toDateMidnight();
        org.joda.time.DateTime.Property property10 = dateTime7.weekOfWeekyear();
        int int11 = dateTime7.getCenturyOfEra();
        org.joda.time.Instant instant12 = dateTime7.toInstant();
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean15 = mutableDateTime13.isSupported(dateTimeFieldType14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant12", (dateTime7.compareTo(instant12) == 0) == dateTime7.equals(instant12));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = property11.getDifference(readableInstant13);
        org.joda.time.LocalDate localDate15 = property11.withMaximumValue();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property17.getLocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate22 = localDate20.plusMonths(32772);
        org.joda.time.LocalDate localDate23 = localDate15.withFields((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTime dateTime24 = localDate15.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property25 = localDate15.yearOfEra();
        int int26 = localDate15.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.minutes();
        boolean boolean33 = localDate31.isSupported(durationFieldType32);
        org.joda.time.LocalDate localDate35 = localDate31.minusDays(57);
        org.joda.time.LocalDate localDate37 = localDate31.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        boolean boolean39 = localDate15.isAfter((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalTime localTime40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate37.toDateTime(localTime40, dateTimeZone41);
        org.joda.time.Chronology chronology43 = localDate37.getChronology();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((java.lang.Object) dateTime9, chronology43);
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime44", (dateTime8.compareTo(dateTime44) == 0) == dateTime8.equals(dateTime44));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        int int15 = property12.getMaximumValueOverall();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = property12.getDifference(readableInstant16);
        org.joda.time.DateTime dateTime18 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfMonth(20);
        org.joda.time.DateTime dateTime21 = dateTime18.toDateTimeISO();
        org.joda.time.Instant instant22 = dateTime18.toInstant();
        org.joda.time.DateTime dateTime24 = dateTime18.minusSeconds(34530606);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.era();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime9.toDateTime(chronology31);
        org.joda.time.DateTime dateTime33 = dateTime9.toDateTimeISO();
        org.joda.time.DateTime dateTime35 = dateTime9.plusYears(67);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMonths(53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addToCopy((long) 935);
        org.joda.time.DateTime.Property property23 = dateTime22.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime22.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime26 = dateTime24.minusMonths(38);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillisOfDay(4);
        org.joda.time.DateTime.Property property29 = dateTime26.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime24 = dateTime22.minusWeeks(69);
        int int25 = dateTime24.getMonthOfYear();
        int int26 = dateTime24.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Interval interval19 = interval17.withChronology(chronology18);
        org.joda.time.Duration duration20 = interval17.toDuration();
        org.joda.time.DateTime dateTime21 = dateTime13.plus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean25 = dateTimeZone24.isFixed();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone24);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTime dateTime29 = localDate26.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int38 = dateTimeZone36.getOffsetFromLocal((long) 6);
        long long40 = dateTimeZone33.getMillisKeepLocal(dateTimeZone36, (long) 10);
        org.joda.time.DateTime dateTime41 = dateTime31.withZone(dateTimeZone36);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property43 = localDate42.yearOfCentury();
        org.joda.time.LocalDate localDate44 = property43.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean48 = dateTimeZone47.isFixed();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = localDate44.toDateTimeAtStartOfDay(dateTimeZone47);
        boolean boolean51 = dateTime50.isBeforeNow();
        int int52 = dateTime50.getDayOfYear();
        boolean boolean53 = dateTime31.isEqual((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime.Property property54 = dateTime50.dayOfYear();
        org.joda.time.Interval interval55 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration20, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime57 = dateTime50.plusWeeks(19);
        org.joda.time.DateTime dateTime59 = dateTime57.withMinuteOfHour((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime41", (dateTime9.compareTo(dateTime41) == 0) == dateTime9.equals(dateTime41));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(dateTimeZone21);
        int int24 = dateTime13.getMillisOfDay();
        int int25 = dateTime13.getMonthOfYear();
        org.joda.time.Chronology chronology26 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime13.withWeekyear(12);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property30 = localDate29.yearOfCentury();
        org.joda.time.LocalDate localDate31 = property30.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean35 = dateTimeZone34.isFixed();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = localDate31.toDateTimeAtStartOfDay(dateTimeZone34);
        org.joda.time.DateTime dateTime38 = dateTime37.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str40 = dateTimeFieldType39.getName();
        org.joda.time.DateTime.Property property41 = dateTime38.property(dateTimeFieldType39);
        org.joda.time.Interval interval42 = property41.toInterval();
        org.joda.time.DateTimeField dateTimeField43 = property41.getField();
        int int44 = property41.getMaximumValueOverall();
        org.joda.time.DateTime dateTime45 = property41.withMinimumValue();
        boolean boolean47 = dateTime45.isEqual((long) 292278994);
        int int48 = dateTime45.getMillisOfSecond();
        org.joda.time.LocalDate localDate49 = dateTime45.toLocalDate();
        org.joda.time.DateTime dateTime50 = localDate49.toDateTimeAtStartOfDay();
        boolean boolean51 = dateTime28.isEqual((org.joda.time.ReadableInstant) dateTime50);
        int int52 = dateTime28.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime23", (dateTime13.compareTo(mutableDateTime23) == 0) == dateTime13.equals(mutableDateTime23));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        boolean boolean25 = dateTime24.isBeforeNow();
        org.joda.time.DateTime dateTime27 = dateTime24.minusHours(86397772);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfMonth();
        org.joda.time.DateTime dateTime29 = property28.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(32772);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTime dateTime14 = localDate5.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property15 = localDate5.yearOfEra();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalDate localDate17 = property15.withMinimumValue();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfCentury();
        org.joda.time.LocalDate localDate20 = property19.getLocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property24.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean29 = dateTimeZone28.isFixed();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtStartOfDay(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = localDate22.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate35 = property34.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime41.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str44 = dateTimeFieldType43.getName();
        org.joda.time.DateTime.Property property45 = dateTime42.property(dateTimeFieldType43);
        org.joda.time.DateTime dateTime46 = property45.roundFloorCopy();
        org.joda.time.DateTime.Property property47 = dateTime46.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime46.getZone();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean52 = dateTimeZone51.isFixed();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone51);
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        org.joda.time.DateTime dateTime56 = localDate53.toDateTimeAtMidnight(dateTimeZone55);
        int int57 = dateTime56.getMonthOfYear();
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        org.joda.time.DateTime dateTime60 = dateTime56.toDateTime(dateTimeZone59);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone59);
        long long63 = dateTimeZone48.getMillisKeepLocal(dateTimeZone59, (long) 7);
        org.joda.time.DateTime dateTime64 = dateTime32.toDateTime(dateTimeZone59);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property66 = localDate65.yearOfCentury();
        org.joda.time.LocalDate localDate67 = property66.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean71 = dateTimeZone70.isFixed();
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone70);
        org.joda.time.DateTime dateTime73 = localDate67.toDateTimeAtStartOfDay(dateTimeZone70);
        org.joda.time.DateTime dateTime74 = dateTime73.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate75 = dateTime73.toLocalDate();
        int int76 = dateTime73.getDayOfYear();
        boolean boolean78 = dateTime73.isAfter((-2228L));
        int int79 = dateTimeZone59.getOffset((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime80 = localDate17.toDateTimeAtCurrentTime(dateTimeZone59);
        org.joda.time.LocalDate.Property property81 = localDate17.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime64", (dateTime32.compareTo(dateTime64) == 0) == dateTime32.equals(dateTime64));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTime dateTime30 = localDate27.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusYears(2022);
        int int33 = property20.getDifference((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime34 = property20.roundFloorCopy();
        boolean boolean35 = dateTime34.isEqualNow();
        org.joda.time.DateTime.Property property36 = dateTime34.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.era();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime9.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.dayOfYear();
        org.joda.time.Chronology chronology34 = chronology31.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.secondOfMinute();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DurationField durationField7 = durationFieldType1.getField(chronology4);
        org.joda.time.DurationField durationField8 = chronology4.millis();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(315532800002L, chronology4);
        org.joda.time.LocalDate.Property property10 = localDate9.monthOfYear();
        int int11 = localDate9.size();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant12, readableInstant13);
        org.joda.time.DateTime dateTime15 = interval14.getEnd();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.LocalTime localTime17 = dateTime15.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(56297158);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.toLanguageTag();
        java.util.Locale locale26 = new java.util.Locale("5 Jun 798307 11:57:00 GMT", "PT0S", "1969");
        java.lang.String str27 = locale21.getDisplayLanguage(locale26);
        java.lang.String str28 = dateTimeZone19.getName((long) 8771, locale21);
        org.joda.time.DateTime dateTime29 = localDate9.toDateTime(localTime17, dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime15", (dateTime6.compareTo(dateTime15) == 0) == dateTime6.equals(dateTime15));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str26 = dateTimeFieldType25.getName();
        org.joda.time.DateTime.Property property27 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTime dateTime28 = property27.roundFloorCopy();
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime28.getZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone33);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTime dateTime38 = localDate35.toDateTimeAtMidnight(dateTimeZone37);
        int int39 = dateTime38.getMonthOfYear();
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime(dateTimeZone41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        long long45 = dateTimeZone30.getMillisKeepLocal(dateTimeZone41, (long) 7);
        org.joda.time.DateTime dateTime46 = dateTime14.toDateTime(dateTimeZone41);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property48 = localDate47.yearOfCentury();
        org.joda.time.LocalDate localDate49 = property48.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean53 = dateTimeZone52.isFixed();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone52);
        org.joda.time.DateTime dateTime55 = localDate49.toDateTimeAtStartOfDay(dateTimeZone52);
        org.joda.time.DateTime dateTime56 = dateTime55.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate57 = dateTime55.toLocalDate();
        int int58 = dateTime55.getDayOfYear();
        boolean boolean60 = dateTime55.isAfter((-2228L));
        int int61 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime63 = dateTime55.minusSeconds(625);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(4, (int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime55.toMutableDateTime(dateTimeZone66);
        int int69 = dateTimeZone66.getOffset(76872L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime67", (dateTime13.compareTo(mutableDateTime67) == 0) == dateTime13.equals(mutableDateTime67));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, readableDuration15);
        boolean boolean18 = interval16.isBefore(34745187L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant13", (dateTime11.compareTo(instant13) == 0) == dateTime11.equals(instant13));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        int int15 = dateTime11.getMillisOfDay();
        org.joda.time.DateTime dateTime17 = dateTime11.withYear(32);
        org.joda.time.DateTime dateTime18 = dateTime17.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant13", (dateTime11.compareTo(instant13) == 0) == dateTime11.equals(instant13));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = property11.getDifference(readableInstant13);
        org.joda.time.LocalDate localDate15 = property11.withMaximumValue();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property17.getLocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate22 = localDate20.plusMonths(32772);
        org.joda.time.LocalDate localDate23 = localDate15.withFields((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTime dateTime24 = localDate15.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property25 = localDate15.yearOfEra();
        int int26 = localDate15.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.minutes();
        boolean boolean33 = localDate31.isSupported(durationFieldType32);
        org.joda.time.LocalDate localDate35 = localDate31.minusDays(57);
        org.joda.time.LocalDate localDate37 = localDate31.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        boolean boolean39 = localDate15.isAfter((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalTime localTime40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate37.toDateTime(localTime40, dateTimeZone41);
        org.joda.time.Chronology chronology43 = localDate37.getChronology();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((java.lang.Object) dateTime9, chronology43);
        org.joda.time.LocalDateTime localDateTime45 = dateTime9.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime44", (dateTime9.compareTo(dateTime44) == 0) == dateTime9.equals(dateTime44));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate10 = dateTime8.toLocalDate();
        org.joda.time.Interval interval11 = localDate10.toInterval();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property13 = localDate12.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.monthOfYear();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = dateTime33.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str36 = dateTimeFieldType35.getName();
        org.joda.time.DateTime.Property property37 = dateTime34.property(dateTimeFieldType35);
        org.joda.time.DateTime dateTime38 = property37.roundFloorCopy();
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime38.getZone();
        java.util.TimeZone timeZone41 = dateTimeZone40.toTimeZone();
        org.joda.time.Chronology chronology42 = chronology22.withZone(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = chronology42.seconds();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.halfdayOfDay();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(chronology42);
        org.joda.time.Interval interval47 = interval11.withChronology(chronology42);
        org.joda.time.DurationField durationField48 = chronology42.weeks();
        org.joda.time.DurationField durationField49 = chronology42.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField23, and durationField44", !(durationField49.compareTo(durationField23) == 0) || (Math.signum(durationField49.compareTo(durationField44)) == Math.signum(durationField23.compareTo(durationField44))));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addToCopy((long) 935);
        org.joda.time.DateTime dateTime24 = property20.addToCopy(0);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.lang.String str26 = locale25.getCountry();
        java.lang.String str27 = locale25.getDisplayCountry();
        java.util.Set<java.lang.String> strSet28 = locale25.getUnicodeLocaleKeys();
        int int29 = property20.getMaximumTextLength(locale25);
        java.util.Locale.setDefault(locale25);
        java.lang.String str31 = locale25.getDisplayCountry();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property2 = localDate1.yearOfCentury();
        org.joda.time.LocalDate localDate3 = property2.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone6);
        org.joda.time.DateTime dateTime10 = dateTime9.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str12 = dateTimeFieldType11.getName();
        org.joda.time.DateTime.Property property13 = dateTime10.property(dateTimeFieldType11);
        org.joda.time.DateTime dateTime14 = property13.roundFloorCopy();
        org.joda.time.DateTime.Property property15 = dateTime14.year();
        org.joda.time.DateTime dateTime17 = property15.addToCopy(86397);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTime dateTime25 = localDate22.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime17.toMutableDateTime(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((-3369600L), dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime26", (dateTime17.compareTo(mutableDateTime26) == 0) == dateTime17.equals(mutableDateTime26));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.DateTime dateTime4 = dateTime1.withDurationAdded((-1L), (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone7);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 32772);
        org.joda.time.DateTime dateTime16 = dateTime14.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withDurationAdded(readableDuration19, 292278994);
        java.util.Date date22 = dateTime16.toDate();
        java.util.GregorianCalendar gregorianCalendar23 = dateTime16.toGregorianCalendar();
        boolean boolean24 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone27);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTime dateTime32 = localDate29.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withMillis((long) 32772);
        org.joda.time.DateTime dateTime36 = dateTime34.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime38 = dateTime36.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Interval interval44 = interval42.withChronology(chronology43);
        org.joda.time.Duration duration45 = interval42.toDuration();
        org.joda.time.DateTime dateTime46 = dateTime38.plus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean50 = dateTimeZone49.isFixed();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone49);
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        org.joda.time.DateTime dateTime54 = localDate51.toDateTimeAtCurrentTime(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean59 = dateTimeZone58.isFixed();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int63 = dateTimeZone61.getOffsetFromLocal((long) 6);
        long long65 = dateTimeZone58.getMillisKeepLocal(dateTimeZone61, (long) 10);
        org.joda.time.DateTime dateTime66 = dateTime56.withZone(dateTimeZone61);
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property68 = localDate67.yearOfCentury();
        org.joda.time.LocalDate localDate69 = property68.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean73 = dateTimeZone72.isFixed();
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone72);
        org.joda.time.DateTime dateTime75 = localDate69.toDateTimeAtStartOfDay(dateTimeZone72);
        boolean boolean76 = dateTime75.isBeforeNow();
        int int77 = dateTime75.getDayOfYear();
        boolean boolean78 = dateTime56.isEqual((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DateTime.Property property79 = dateTime75.dayOfYear();
        org.joda.time.Interval interval80 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration45, (org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.Interval interval81 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration45);
        org.joda.time.DateTime dateTime83 = dateTime16.minusHours((-34));
        boolean boolean85 = dateTime16.isEqual(62167168118625L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime66", (dateTime14.compareTo(dateTime66) == 0) == dateTime14.equals(dateTime66));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.era();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DurationField durationField6 = chronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        boolean boolean25 = dateTime24.isBeforeNow();
        org.joda.time.DateTime dateTime27 = dateTime24.minusHours(86397772);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfMonth();
        org.joda.time.DateTime dateTime30 = dateTime27.withYear(79);
        org.joda.time.DateTime.Property property31 = dateTime27.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(localTime13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str26 = dateTimeFieldType25.getName();
        org.joda.time.DateTime.Property property27 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTime dateTime28 = property27.roundFloorCopy();
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime28.getZone();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime32 = dateTime14.withZone(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = dateTime14.plusHours(1988);
        org.joda.time.DateTime.Property property35 = dateTime34.weekyear();
        org.joda.time.DateTime dateTime37 = dateTime34.minusSeconds(86399752);
        org.joda.time.Instant instant38 = dateTime37.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime32", (dateTime14.compareTo(dateTime32) == 0) == dateTime14.equals(dateTime32));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone8);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTime dateTime13 = localDate10.toDateTimeAtCurrentTime(dateTimeZone12);
        boolean boolean14 = localDate5.equals((java.lang.Object) dateTime13);
        java.util.Date date15 = localDate5.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getRangeDurationType();
        boolean boolean18 = localDate5.isSupported(dateTimeFieldType16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = localDate23.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.LocalDate localDate35 = localDate23.minusYears(10);
        boolean boolean36 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate39 = localDate35.withFieldAdded(durationFieldType37, 70);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property41 = localDate40.yearOfCentury();
        org.joda.time.LocalDate localDate42 = property41.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean46 = dateTimeZone45.isFixed();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone45);
        org.joda.time.DateTime dateTime48 = localDate42.toDateTimeAtStartOfDay(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime48.toMutableDateTime();
        org.joda.time.Chronology chronology50 = dateTime48.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.halfdays();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.monthOfYear();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property54 = localDate53.yearOfCentury();
        org.joda.time.LocalDate localDate55 = property54.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean59 = dateTimeZone58.isFixed();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone58);
        org.joda.time.DateTime dateTime61 = localDate55.toDateTimeAtStartOfDay(dateTimeZone58);
        org.joda.time.DateTime dateTime62 = dateTime61.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str64 = dateTimeFieldType63.getName();
        org.joda.time.DateTime.Property property65 = dateTime62.property(dateTimeFieldType63);
        org.joda.time.DateTime dateTime66 = property65.roundFloorCopy();
        org.joda.time.DateTime.Property property67 = dateTime66.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime66.getZone();
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        org.joda.time.Chronology chronology70 = chronology50.withZone(dateTimeZone68);
        org.joda.time.DateTimeField dateTimeField71 = chronology70.clockhourOfHalfday();
        org.joda.time.DurationField durationField72 = chronology70.seconds();
        boolean boolean73 = durationFieldType37.isSupported(chronology70);
        org.joda.time.Chronology chronology74 = chronology70.withUTC();
        org.joda.time.DurationField durationField75 = chronology74.halfdays();
        org.joda.time.DateTimeField dateTimeField76 = chronology74.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField51 and durationField75", (durationField51.compareTo(durationField75) == 0) == durationField51.equals(durationField75));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime19.withMillis((long) 86397);
        org.joda.time.Chronology chronology41 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.millisOfSecond();
        org.joda.time.DurationField durationField43 = chronology41.minutes();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str26 = dateTimeFieldType25.getName();
        org.joda.time.DateTime.Property property27 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTime dateTime28 = property27.roundFloorCopy();
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime28.getZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone33);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTime dateTime38 = localDate35.toDateTimeAtMidnight(dateTimeZone37);
        int int39 = dateTime38.getMonthOfYear();
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime(dateTimeZone41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        long long45 = dateTimeZone30.getMillisKeepLocal(dateTimeZone41, (long) 7);
        org.joda.time.DateTime dateTime46 = dateTime14.toDateTime(dateTimeZone41);
        java.util.GregorianCalendar gregorianCalendar47 = dateTime46.toGregorianCalendar();
        boolean boolean49 = gregorianCalendar47.isSet((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime46", (dateTime14.compareTo(dateTime46) == 0) == dateTime14.equals(dateTime46));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        boolean boolean10 = dateTime8.isAfterNow();
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime8.yearOfCentury();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.Chronology chronology16 = dateTimeFormatter15.getChronology();
        boolean boolean17 = dateTimeFormatter15.isParser();
        java.util.Locale locale18 = dateTimeFormatter15.getLocale();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone21);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTime dateTime26 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 32772);
        org.joda.time.DateTime dateTime30 = dateTime28.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime32 = dateTime28.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology33 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.weekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter15.withChronology(chronology33);
        org.joda.time.Chronology chronology36 = dateTimeFormatter35.getChronolgy();
        org.joda.time.DurationField durationField37 = chronology36.halfdays();
        org.joda.time.DurationField durationField38 = chronology36.weekyears();
        org.joda.time.DateTime dateTime39 = dateTime8.toDateTime(chronology36);
        org.joda.time.Chronology chronology40 = chronology36.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime39", (dateTime8.compareTo(dateTime39) == 0) == dateTime8.equals(dateTime39));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.era();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime9.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime9.plusMinutes(2000);
        org.joda.time.DateTime dateTime37 = dateTime9.withDurationAdded(0L, 56384);
        org.joda.time.DateTime dateTime39 = dateTime9.minusSeconds(344);
        int int40 = dateTime39.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(2022);
        org.joda.time.DateTime.Property property10 = dateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTime dateTime18 = localDate15.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int27 = dateTimeZone25.getOffsetFromLocal((long) 6);
        long long29 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) 10);
        org.joda.time.DateTime dateTime30 = dateTime20.withZone(dateTimeZone25);
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.lang.String str33 = dateTimeZone25.getName(0L, locale32);
        org.joda.time.DateTime dateTime34 = dateTime7.toDateTime(dateTimeZone25);
        java.util.TimeZone timeZone35 = dateTimeZone25.toTimeZone();
        boolean boolean36 = dateTimeZone25.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime34", (dateTime7.compareTo(dateTime34) == 0) == dateTime7.equals(dateTime34));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime19.withMillis((long) 86397);
        org.joda.time.Chronology chronology41 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.millisOfSecond();
        java.util.Locale locale44 = new java.util.Locale("");
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property46 = localDate45.yearOfCentury();
        org.joda.time.LocalDate.Property property47 = localDate45.yearOfCentury();
        org.joda.time.LocalDate localDate49 = property47.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField50 = property47.getField();
        int int52 = dateTimeField50.get((long) 'u');
        java.util.Locale locale54 = java.util.Locale.TAIWAN;
        java.lang.String str55 = dateTimeField50.getAsText((long) 5, locale54);
        java.lang.String str56 = locale44.getDisplayVariant(locale54);
        int int57 = dateTimeField42.getMaximumTextLength(locale54);
        long long59 = dateTimeField42.roundFloor((long) 375);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime22 = property20.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone25);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTime dateTime30 = localDate27.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusYears(2022);
        int int33 = property20.getDifference((org.joda.time.ReadableInstant) dateTime32);
        int int34 = property20.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        org.joda.time.LocalDate localDate8 = localDate4.minusDays(57);
        org.joda.time.LocalDate.Property property9 = localDate4.weekyear();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.DateTime dateTime25 = localDate4.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours(2099);
        org.joda.time.DateTime.Property property28 = dateTime25.centuryOfEra();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(86397L);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(6);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone32.isLocalDateTimeGap(localDateTime33);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property36 = localDate35.yearOfCentury();
        org.joda.time.LocalDate localDate37 = property36.getLocalDate();
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property41 = localDate40.yearOfCentury();
        org.joda.time.LocalDate localDate42 = property41.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean46 = dateTimeZone45.isFixed();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone45);
        org.joda.time.DateTime dateTime48 = localDate42.toDateTimeAtStartOfDay(dateTimeZone45);
        org.joda.time.DateTime dateTime49 = localDate39.toDateTimeAtMidnight(dateTimeZone45);
        org.joda.time.DateTime.Property property50 = dateTime49.year();
        int int51 = dateTime49.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime52 = dateTime49.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property53 = dateTime49.monthOfYear();
        org.joda.time.DateTime dateTime54 = dateTime49.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = dateTime49.withZone(dateTimeZone55);
        int int57 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean58 = localDate30.equals((java.lang.Object) dateTimeZone32);
        org.joda.time.DateTime dateTime59 = dateTime25.toDateTime(dateTimeZone32);
        org.joda.time.LocalDate localDate60 = org.joda.time.LocalDate.now(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime56", (dateTime24.compareTo(dateTime56) == 0) == dateTime24.equals(dateTime56));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight(dateTimeZone6);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateMidnight dateMidnight9 = dateTime7.toDateMidnight();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        long long11 = dateTime7.getMillis();
        int int12 = dateTime7.getWeekyear();
        org.joda.time.DateTime dateTime14 = dateTime7.plusWeeks(21597);
        org.joda.time.DateTime dateTime16 = dateTime14.plusHours(56406);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.secondOfMinute();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology21);
        org.joda.time.DurationField durationField24 = durationFieldType18.getField(chronology21);
        org.joda.time.DurationField durationField25 = chronology21.millis();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(315532800002L, chronology21);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now(chronology21);
        org.joda.time.DateTimeField dateTimeField28 = chronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField29 = chronology21.millis();
        org.joda.time.DateTime dateTime30 = dateTime16.withChronology(chronology21);
        org.joda.time.Chronology chronology31 = chronology21.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime30", (dateTime16.compareTo(dateTime30) == 0) == dateTime16.equals(dateTime30));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime dateTime14 = dateTime13.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = dateTime13.plusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone19);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTime dateTime24 = localDate21.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean29 = dateTimeZone28.isFixed();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int33 = dateTimeZone31.getOffsetFromLocal((long) 6);
        long long35 = dateTimeZone28.getMillisKeepLocal(dateTimeZone31, (long) 10);
        org.joda.time.DateTime dateTime36 = dateTime26.withZone(dateTimeZone31);
        org.joda.time.DateTime.Property property37 = dateTime36.weekOfWeekyear();
        org.joda.time.DateTime dateTime39 = dateTime36.withMinuteOfHour(7);
        boolean boolean40 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property43 = localDate42.yearOfCentury();
        org.joda.time.LocalDate localDate44 = property43.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean48 = dateTimeZone47.isFixed();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = localDate44.toDateTimeAtStartOfDay(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime50.toMutableDateTime();
        org.joda.time.Chronology chronology52 = dateTime50.getChronology();
        boolean boolean53 = dateTimeFieldType41.isSupported(chronology52);
        org.joda.time.Chronology chronology54 = chronology52.withUTC();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.secondOfDay();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.dayOfYear();
        org.joda.time.DateTimeField dateTimeField58 = chronology54.clockhourOfHalfday();
        org.joda.time.DateTime dateTime59 = dateTime39.withChronology(chronology54);
        org.joda.time.DateTimeField dateTimeField60 = chronology54.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime59", (dateTime39.compareTo(dateTime59) == 0) == dateTime39.equals(dateTime59));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        java.lang.String str11 = localDate10.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate10.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfCentury();
        org.joda.time.LocalDate.Property property23 = localDate21.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property23.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDate localDate26 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = localDate26.getFields();
        org.joda.time.DateTime dateTime28 = dateTime20.withFields((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfMinute();
        org.joda.time.DurationField durationField33 = chronology31.seconds();
        org.joda.time.DurationField durationField34 = chronology31.years();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.millisOfDay();
        org.joda.time.DateTime dateTime36 = dateTime20.toDateTime(chronology31);
        org.joda.time.DateTime dateTime38 = dateTime36.minusSeconds(940);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.plus(readableDuration39);
        boolean boolean42 = dateTime36.isAfter(34743846L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime36", (dateTime20.compareTo(dateTime36) == 0) == dateTime20.equals(dateTime36));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property12.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property23 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime26 = dateTime20.withHourOfDay(15);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(13);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime26.toMutableDateTime(dateTimeZone28);
        org.joda.time.Instant instant30 = dateTime26.toInstant();
        int int31 = dateTime26.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and instant30", (mutableDateTime29.compareTo(instant30) == 0) == mutableDateTime29.equals(instant30));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtMidnight(dateTimeZone6);
        int int8 = dateTime7.getMonthOfYear();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTime dateTime11 = dateTime7.toDateTime(dateTimeZone10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property13 = localDate12.yearOfCentury();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtStartOfDay(dateTimeZone17);
        boolean boolean21 = dateTime20.isBeforeNow();
        int int22 = dateTime20.getDayOfYear();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone26);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.DateTime dateTime31 = localDate28.toDateTimeAtMidnight(dateTimeZone30);
        int int32 = dateTime31.getMonthOfYear();
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.DateTime dateTime35 = dateTime31.toDateTime(dateTimeZone34);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property37 = localDate36.yearOfCentury();
        org.joda.time.LocalDate localDate38 = property37.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean42 = dateTimeZone41.isFixed();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone41);
        org.joda.time.DateTime dateTime44 = localDate38.toDateTimeAtStartOfDay(dateTimeZone41);
        boolean boolean45 = dateTime44.isBeforeNow();
        int int46 = dateTime44.getDayOfYear();
        org.joda.time.Interval interval47 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime44);
        boolean boolean48 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.YearMonthDay yearMonthDay49 = dateTime20.toYearMonthDay();
        org.joda.time.DateTime.Property property50 = dateTime20.yearOfEra();
        org.joda.time.DateTime dateTime52 = property50.addToCopy(56213);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property54 = localDate53.yearOfCentury();
        org.joda.time.LocalDate localDate55 = property54.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean59 = dateTimeZone58.isFixed();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone58);
        org.joda.time.DateTime dateTime61 = localDate55.toDateTimeAtStartOfDay(dateTimeZone58);
        org.joda.time.LocalDate localDate63 = localDate55.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property64 = localDate55.dayOfMonth();
        org.joda.time.LocalDate localDate65 = property64.withMaximumValue();
        org.joda.time.LocalDate localDate66 = property64.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean70 = dateTimeZone69.isFixed();
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone69);
        java.util.TimeZone timeZone72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        org.joda.time.DateTime dateTime74 = localDate71.toDateTimeAtCurrentTime(dateTimeZone73);
        org.joda.time.DateTime dateTime75 = localDate66.toDateTimeAtStartOfDay(dateTimeZone73);
        boolean boolean77 = dateTimeZone73.isStandardOffset((-1L));
        long long79 = dateTimeZone73.previousTransition(2656800000L);
        org.joda.time.DateTime dateTime80 = dateTime52.withZone(dateTimeZone73);
        org.joda.time.Instant instant81 = dateTime80.toInstant();
        org.joda.time.Instant instant82 = instant81.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime52 and dateTime80", (dateTime52.compareTo(dateTime80) == 0) == dateTime52.equals(dateTime80));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.DateTime.Property property12 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(dateTimeZone21);
        int int24 = dateTime13.getMillisOfDay();
        int int25 = dateTime13.getMonthOfYear();
        org.joda.time.DateTime.Property property26 = dateTime13.monthOfYear();
        java.util.Date date27 = dateTime13.toDate();
        java.lang.Object obj28 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone31);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTime dateTime36 = localDate33.toDateTimeAtCurrentTime(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withMillis((long) 32772);
        org.joda.time.DateTime dateTime40 = dateTime38.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime42 = dateTime38.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        org.joda.time.Interval interval44 = new org.joda.time.Interval(obj28, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.secondOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField48 = chronology43.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int53 = dateTimeZone51.getOffset((long) 2022);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 32770, dateTimeZone51);
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property56 = localDate55.yearOfCentury();
        org.joda.time.LocalDate localDate57 = property56.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean61 = dateTimeZone60.isFixed();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone60);
        org.joda.time.DateTime dateTime63 = localDate57.toDateTimeAtStartOfDay(dateTimeZone60);
        org.joda.time.DateTime dateTime64 = dateTime63.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str66 = dateTimeFieldType65.getName();
        org.joda.time.DateTime.Property property67 = dateTime64.property(dateTimeFieldType65);
        org.joda.time.DateTime dateTime68 = property67.roundFloorCopy();
        org.joda.time.DateTime.Property property69 = dateTime68.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone70 = dateTime68.getZone();
        long long72 = dateTimeZone51.getMillisKeepLocal(dateTimeZone70, (long) 9);
        long long75 = dateTimeZone51.convertLocalToUTC(146817598379000L, false);
        org.joda.time.Chronology chronology76 = chronology43.withZone(dateTimeZone51);
        org.joda.time.DateTime dateTime77 = dateTime13.toDateTime(chronology76);
        org.joda.time.Chronology chronology78 = chronology76.withUTC();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime23", (dateTime13.compareTo(mutableDateTime23) == 0) == dateTime13.equals(mutableDateTime23));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean4 = dateTimeZone3.isFixed();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone3);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtMidnight(dateTimeZone7);
        int int9 = dateTime8.getMonthOfYear();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = dateTime8.toDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 15, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(365);
        org.joda.time.DateTime dateTime19 = dateTime16.withZone(dateTimeZone18);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime19.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime23 = dateTime19.plusSeconds(936);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime21", (dateTime14.compareTo(mutableDateTime21) == 0) == dateTime14.equals(mutableDateTime21));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime9.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.weekyearOfCentury();
        org.joda.time.DurationField durationField18 = chronology14.halfdays();
        org.joda.time.DurationField durationField19 = chronology14.eras();
        org.joda.time.DurationField durationField20 = chronology14.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 292278994);
        org.joda.time.DateTime dateTime18 = dateTime16.minusSeconds(8);
        org.joda.time.Instant instant19 = dateTime16.toInstant();
        org.joda.time.DateTime.Property property20 = dateTime16.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant19", (dateTime16.compareTo(instant19) == 0) == dateTime16.equals(instant19));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = property11.getDifference(readableInstant13);
        org.joda.time.LocalDate localDate15 = property11.withMaximumValue();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property17.getLocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate22 = localDate20.plusMonths(32772);
        org.joda.time.LocalDate localDate23 = localDate15.withFields((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTime dateTime24 = localDate15.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property25 = localDate15.yearOfEra();
        int int26 = localDate15.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.minutes();
        boolean boolean33 = localDate31.isSupported(durationFieldType32);
        org.joda.time.LocalDate localDate35 = localDate31.minusDays(57);
        org.joda.time.LocalDate localDate37 = localDate31.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        boolean boolean39 = localDate15.isAfter((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalTime localTime40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate37.toDateTime(localTime40, dateTimeZone41);
        org.joda.time.Chronology chronology43 = localDate37.getChronology();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((java.lang.Object) dateTime9, chronology43);
        org.joda.time.DurationField durationField45 = chronology43.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime44", (dateTime8.compareTo(dateTime44) == 0) == dateTime8.equals(dateTime44));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        java.util.Date date4 = calendar3.getTime();
        java.util.TimeZone timeZone5 = calendar3.getTimeZone();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.lang.String str7 = locale6.getCountry();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.setDefault(locale6);
        org.joda.time.YearMonth yearMonth11 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Interval interval13 = yearMonth11.toInterval(dateTimeZone12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = yearMonth11.getFieldTypes();
        org.joda.time.YearMonth.Property property15 = yearMonth11.year();
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.lang.String str17 = locale16.getCountry();
        java.util.Locale locale18 = locale16.stripExtensions();
        int int19 = property15.getMaximumTextLength(locale18);
        java.lang.String str20 = locale6.getDisplayName(locale18);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone5, locale18);
        java.util.Locale locale25 = new java.util.Locale("zho", "1970-01-01T00:00:00.000+06:00", "Chinese");
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone5, locale25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar26", (calendar21.compareTo(calendar26) == 0) == calendar21.equals(calendar26));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = yearMonth4.toInterval(dateTimeZone5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = yearMonth4.getFieldTypes();
        org.joda.time.YearMonth.Property property8 = yearMonth4.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = yearMonth4.toString(dateTimeFormatter9);
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = yearMonth12.toInterval(dateTimeZone13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = yearMonth12.getFieldTypes();
        org.joda.time.YearMonth.Property property16 = yearMonth12.year();
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth(0L);
        org.joda.time.YearMonth yearMonth20 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = yearMonth20.toInterval(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.Interval interval24 = interval22.withPeriodAfterStart(readablePeriod23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = interval24.toPeriod(periodType25);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean28 = period26.isSupported(durationFieldType27);
        org.joda.time.YearMonth yearMonth30 = yearMonth18.withPeriodAdded((org.joda.time.ReadablePeriod) period26, 32770);
        org.joda.time.YearMonth yearMonth31 = yearMonth12.minus((org.joda.time.ReadablePeriod) period26);
        boolean boolean32 = yearMonth4.isAfter((org.joda.time.ReadablePartial) yearMonth31);
        org.joda.time.Chronology chronology33 = yearMonth31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter2.withChronology(chronology33);
        org.joda.time.DurationField durationField36 = chronology33.months();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.monthOfYear();
        org.joda.time.YearMonth yearMonth39 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.Interval interval41 = yearMonth39.toInterval(dateTimeZone40);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray42 = yearMonth39.getFieldTypes();
        org.joda.time.YearMonth yearMonth44 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = yearMonth44.toInterval(dateTimeZone45);
        org.joda.time.YearMonth yearMonth48 = yearMonth44.minusMonths((int) (short) 1);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonth yearMonth50 = yearMonth48.withChronologyRetainFields(chronology49);
        int int51 = yearMonth39.compareTo((org.joda.time.ReadablePartial) yearMonth50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.YearMonth yearMonth53 = yearMonth50.minus(readablePeriod52);
        org.joda.time.YearMonth yearMonth55 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.Interval interval57 = yearMonth55.toInterval(dateTimeZone56);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray58 = yearMonth55.getFieldTypes();
        org.joda.time.YearMonth.Property property59 = yearMonth55.year();
        java.lang.String str60 = property59.toString();
        org.joda.time.YearMonth yearMonth61 = property59.getYearMonth();
        int[] intArray62 = yearMonth61.getValues();
        chronology33.validate((org.joda.time.ReadablePartial) yearMonth53, intArray62);
        org.joda.time.DateTimeField dateTimeField64 = chronology33.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField65 = chronology33.dayOfMonth();
        long long69 = chronology33.add((long) 2, (long) 21597772, (int) '#');
        org.joda.time.DurationField durationField70 = chronology33.eras();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology33.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField36 and durationField70", Math.signum(durationField36.compareTo(durationField70)) == -Math.signum(durationField70.compareTo(durationField36)));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property1.getDifference(readableInstant3);
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone8);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTime dateTime13 = localDate10.toDateTimeAtCurrentTime(dateTimeZone12);
        boolean boolean14 = localDate5.equals((java.lang.Object) dateTime13);
        java.util.Date date15 = localDate5.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getRangeDurationType();
        boolean boolean18 = localDate5.isSupported(dateTimeFieldType16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = localDate23.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.LocalDate localDate35 = localDate23.minusYears(10);
        boolean boolean36 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDate localDate39 = localDate35.withFieldAdded(durationFieldType37, 70);
        java.lang.String str40 = durationFieldType37.toString();
        java.lang.Object obj41 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean45 = dateTimeZone44.isFixed();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone44);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.DateTime dateTime49 = localDate46.toDateTimeAtCurrentTime(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.withMillis((long) 32772);
        org.joda.time.DateTime dateTime53 = dateTime51.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime55 = dateTime51.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology56 = dateTime55.getChronology();
        org.joda.time.Interval interval57 = new org.joda.time.Interval(obj41, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.yearOfCentury();
        org.joda.time.DurationField durationField59 = chronology56.minutes();
        org.joda.time.DateTimeField dateTimeField60 = chronology56.weekOfWeekyear();
        org.joda.time.DurationField durationField61 = durationFieldType37.getField(chronology56);
        org.joda.time.DurationField durationField62 = chronology56.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField62, durationField59, and durationField61", !(durationField62.compareTo(durationField59) == 0) || (Math.signum(durationField62.compareTo(durationField61)) == Math.signum(durationField59.compareTo(durationField61))));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) 70);
        calendar3.set(10, 32772, (int) (byte) 1, 22, 0);
        long long12 = calendar3.getTimeInMillis();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DateTime.Property property25 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTime dateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        calendar3.setTimeZone(timeZone29);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone29);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale34);
        java.lang.String str36 = locale33.getDisplayLanguage(locale34);
        java.util.Set<java.lang.Character> charSet37 = locale33.getExtensionKeys();
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone29, locale33);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar31 and calendar38", (calendar31.compareTo(calendar38) == 0) == calendar31.equals(calendar38));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property2 = localDate1.yearOfCentury();
        org.joda.time.LocalDate localDate3 = property2.getLocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTime dateTime15 = localDate5.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property17.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = localDate18.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = dateTime24.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str27 = dateTimeFieldType26.getName();
        org.joda.time.DateTime.Property property28 = dateTime25.property(dateTimeFieldType26);
        org.joda.time.DateTime dateTime29 = property28.roundFloorCopy();
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime29.getZone();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean35 = dateTimeZone34.isFixed();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone34);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTime dateTime39 = localDate36.toDateTimeAtMidnight(dateTimeZone38);
        int int40 = dateTime39.getMonthOfYear();
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.DateTime dateTime43 = dateTime39.toDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone42);
        long long46 = dateTimeZone31.getMillisKeepLocal(dateTimeZone42, (long) 7);
        org.joda.time.DateTime dateTime47 = dateTime15.toDateTime(dateTimeZone42);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property49 = localDate48.yearOfCentury();
        org.joda.time.LocalDate localDate50 = property49.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean54 = dateTimeZone53.isFixed();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = localDate50.toDateTimeAtStartOfDay(dateTimeZone53);
        org.joda.time.DateTime dateTime57 = dateTime56.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate58 = dateTime56.toLocalDate();
        int int59 = dateTime56.getDayOfYear();
        boolean boolean61 = dateTime56.isAfter((-2228L));
        int int62 = dateTimeZone42.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime64 = dateTime56.minusSeconds(625);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(4, (int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime56.toMutableDateTime(dateTimeZone67);
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((-45442239013663L), dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime68", (dateTime14.compareTo(mutableDateTime68) == 0) == dateTime14.equals(mutableDateTime68));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Instant instant13 = dateTime11.toInstant();
        int int14 = dateTime11.getWeekyear();
        int int15 = dateTime11.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTimeISO();
        int int17 = mutableDateTime16.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant13", (dateTime11.compareTo(instant13) == 0) == dateTime11.equals(instant13));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(localTime13);
        int int15 = localDate12.getEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(57);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtCurrentTime(dateTimeZone17);
        int int19 = localDate12.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime18", (dateTime14.compareTo(dateTime18) == 0) == dateTime14.equals(dateTime18));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(0L);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = yearMonth2.toInterval(dateTimeZone3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = yearMonth2.getFieldTypes();
        org.joda.time.YearMonth yearMonth7 = yearMonth2.withYear((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.eras();
        boolean boolean9 = yearMonth2.equals((java.lang.Object) durationFieldType8);
        java.lang.String str10 = durationFieldType8.toString();
        java.lang.String str11 = durationFieldType8.toString();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth((long) (short) 1, chronology13);
        org.joda.time.Chronology chronology15 = yearMonth14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = durationFieldType8.getField(chronology15);
        org.joda.time.YearMonth yearMonth19 = new org.joda.time.YearMonth((-882187200000L), chronology15);
        org.joda.time.DurationField durationField20 = chronology15.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField20, and durationField18", !(durationField18.compareTo(durationField20) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField20.compareTo(durationField18))));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.DateTime dateTime25 = property23.addToCopy(0);
        org.joda.time.DurationField durationField26 = property23.getLeapDurationField();
        java.util.Locale locale27 = java.util.Locale.CANADA;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale31 = new java.util.Locale("yearOfCentury");
        boolean boolean32 = dateTimeZone29.equals((java.lang.Object) locale31);
        java.util.Locale locale35 = new java.util.Locale("5 Jun 798307 11:57:00 GMT", "FRA");
        java.lang.String str36 = locale31.getDisplayName(locale35);
        java.lang.String str37 = locale27.getDisplayName(locale35);
        java.util.Set<java.lang.String> strSet38 = locale27.getUnicodeLocaleKeys();
        java.lang.String str39 = property23.getAsText(locale27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.dayOfWeek();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property5 = localDate4.yearOfCentury();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = property5.getDifference(readableInstant7);
        org.joda.time.LocalDate localDate9 = property5.withMaximumValue();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate16 = localDate14.plusMonths(32772);
        org.joda.time.LocalDate localDate17 = localDate9.withFields((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTime dateTime18 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property19 = localDate9.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTime dateTime27 = localDate24.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int36 = dateTimeZone34.getOffsetFromLocal((long) 6);
        long long38 = dateTimeZone31.getMillisKeepLocal(dateTimeZone34, (long) 10);
        org.joda.time.DateTime dateTime39 = dateTime29.withZone(dateTimeZone34);
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfWeek();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.DateMidnight dateMidnight43 = localDate42.toDateMidnight();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property45 = localDate44.yearOfCentury();
        org.joda.time.LocalDate.Property property46 = localDate44.yearOfCentury();
        org.joda.time.LocalDate localDate48 = property46.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField49 = property46.getField();
        int int51 = dateTimeField49.get((long) 'u');
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property53 = localDate52.yearOfCentury();
        org.joda.time.LocalDate localDate54 = property53.getLocalDate();
        int int55 = dateTimeField49.getMaximumValue((org.joda.time.ReadablePartial) localDate54);
        boolean boolean56 = localDate42.isAfter((org.joda.time.ReadablePartial) localDate54);
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property58 = localDate57.yearOfCentury();
        org.joda.time.LocalDate localDate59 = property58.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean63 = dateTimeZone62.isFixed();
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone62);
        org.joda.time.DateTime dateTime65 = localDate59.toDateTimeAtStartOfDay(dateTimeZone62);
        org.joda.time.DateTime dateTime66 = dateTime65.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property67 = dateTime66.year();
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property69 = localDate68.yearOfCentury();
        org.joda.time.LocalDate localDate70 = property69.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean74 = dateTimeZone73.isFixed();
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone73);
        org.joda.time.DateTime dateTime76 = localDate70.toDateTimeAtStartOfDay(dateTimeZone73);
        org.joda.time.DateTime dateTime77 = dateTime76.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str79 = dateTimeFieldType78.getName();
        org.joda.time.DateTime.Property property80 = dateTime77.property(dateTimeFieldType78);
        org.joda.time.Interval interval81 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.DateTime dateTime83 = dateTime66.minusDays(32772);
        org.joda.time.ReadableDuration readableDuration84 = null;
        org.joda.time.DateTime dateTime85 = dateTime83.plus(readableDuration84);
        org.joda.time.DateTimeZone dateTimeZone86 = dateTime83.getZone();
        org.joda.time.DateMidnight dateMidnight87 = localDate54.toDateMidnight(dateTimeZone86);
        org.joda.time.DateTime dateTime88 = dateTime39.withZoneRetainFields(dateTimeZone86);
        org.joda.time.Interval interval89 = localDate9.toInterval(dateTimeZone86);
        long long91 = chronology2.set((org.joda.time.ReadablePartial) localDate9, (long) (-18));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime39", (dateTime29.compareTo(dateTime39) == 0) == dateTime29.equals(dateTime39));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime9.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.era();
        org.joda.time.DurationField durationField17 = chronology14.weekyears();
        org.joda.time.DurationField durationField18 = chronology14.years();
        org.joda.time.DurationField durationField19 = chronology14.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField18", (durationField17.compareTo(durationField18) == 0) == durationField17.equals(durationField18));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate4.centuryOfEra();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone13);
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime19 = dateTime16.withCenturyOfEra(21597);
        java.util.Calendar calendar20 = java.util.Calendar.getInstance();
        calendar20.setLenient(false);
        java.util.Calendar.Builder builder23 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder25 = builder23.setInstant((long) 32770);
        java.util.Calendar calendar26 = builder25.build();
        boolean boolean28 = calendar26.after((java.lang.Object) 70);
        long long29 = calendar26.getTimeInMillis();
        int int30 = calendar26.getWeeksInWeekYear();
        java.util.TimeZone timeZone31 = calendar26.getTimeZone();
        calendar20.setTimeZone(timeZone31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean36 = dateTimeZone35.isFixed();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone35);
        java.util.Locale locale42 = new java.util.Locale("hi!", "2022-02-11", "2022-02-11");
        java.lang.String str43 = dateTimeZone35.getShortName(729129600000L, locale42);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone31, locale42);
        java.util.Calendar calendar45 = dateTime16.toCalendar(locale42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar20 and calendar44", (calendar20.compareTo(calendar44) == 0) == calendar20.equals(calendar44));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(localTime13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTime dateTime23 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 32772);
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime25.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfCentury();
        org.joda.time.LocalDate localDate33 = property32.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean37 = dateTimeZone36.isFixed();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone36);
        org.joda.time.DateTime dateTime39 = localDate33.toDateTimeAtStartOfDay(dateTimeZone36);
        org.joda.time.DateTime dateTime40 = dateTime39.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str42 = dateTimeFieldType41.getName();
        org.joda.time.DateTime.Property property43 = dateTime40.property(dateTimeFieldType41);
        org.joda.time.DateTime dateTime44 = property43.roundFloorCopy();
        org.joda.time.DateTime.Property property45 = dateTime44.year();
        org.joda.time.DateTime dateTime47 = property45.addToCopy(42);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property49 = localDate48.yearOfCentury();
        org.joda.time.LocalDate localDate50 = property49.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean54 = dateTimeZone53.isFixed();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = localDate50.toDateTimeAtStartOfDay(dateTimeZone53);
        org.joda.time.DateTime dateTime57 = dateTime56.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str59 = dateTimeFieldType58.getName();
        org.joda.time.DateTime.Property property60 = dateTime57.property(dateTimeFieldType58);
        boolean boolean62 = dateTime57.equals((java.lang.Object) 'u');
        boolean boolean63 = dateTime47.isBefore((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property65 = dateTime47.property(dateTimeFieldType64);
        boolean boolean66 = dateTime29.isSupported(dateTimeFieldType64);
        boolean boolean67 = property15.equals((java.lang.Object) dateTime29);
        org.joda.time.Instant instant68 = dateTime29.toInstant();
        org.joda.time.DateTime dateTime69 = dateTime29.toDateTimeISO();
        int int70 = dateTime69.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime69 and instant68", (dateTime69.compareTo(instant68) == 0) == dateTime69.equals(instant68));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Interval interval5 = interval3.withChronology(chronology4);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTime dateTime15 = dateTime14.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property16 = dateTime15.year();
        boolean boolean17 = interval5.contains((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime.Property property18 = dateTime15.yearOfCentury();
        org.joda.time.DateTime.Property property19 = dateTime15.hourOfDay();
        java.lang.String str20 = dateTime15.toString();
        org.joda.time.DateTime dateTime23 = dateTime15.withDurationAdded(21599948L, 366);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.yearOfCentury();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = property25.getDifference(readableInstant27);
        org.joda.time.LocalDate localDate29 = property25.withMaximumValue();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.Chronology chronology32 = chronology30.withUTC();
        org.joda.time.DurationField durationField33 = chronology30.seconds();
        org.joda.time.DateTime dateTime34 = dateTime23.withChronology(chronology30);
        org.joda.time.DateTimeField dateTimeField35 = chronology30.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime34", (dateTime23.compareTo(dateTime34) == 0) == dateTime23.equals(dateTime34));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime8.toMutableDateTime();
        org.joda.time.DateTime dateTime13 = dateTime8.plusDays(935);
        org.joda.time.Instant instant14 = dateTime8.toInstant();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str26 = dateTimeFieldType25.getName();
        org.joda.time.DateTime.Property property27 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.DateTimeField dateTimeField29 = property27.getField();
        int int30 = property27.getMaximumValueOverall();
        org.joda.time.DateTime dateTime31 = property27.withMinimumValue();
        boolean boolean33 = dateTime31.isEqual((long) 292278994);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean38 = dateTimeZone37.isFixed();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone37);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTime dateTime42 = localDate39.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.withMillis((long) 32772);
        org.joda.time.DateTime dateTime46 = dateTime44.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime48 = dateTime46.withWeekyear((int) 'u');
        java.util.Locale locale49 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale49);
        java.util.Calendar calendar51 = dateTime48.toCalendar(locale49);
        java.lang.String str52 = dateTime31.toString("117", locale49);
        org.joda.time.DateTime dateTime53 = dateTime31.toDateTimeISO();
        org.joda.time.DateTime dateTime54 = dateTime53.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean58 = dateTimeZone57.isFixed();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone57);
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        org.joda.time.DateTime dateTime62 = localDate59.toDateTimeAtMidnight(dateTimeZone61);
        int int63 = dateTime62.getMonthOfYear();
        java.util.TimeZone timeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.DateTime dateTime66 = dateTime62.toDateTime(dateTimeZone65);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone65);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone65);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime70 = dateTime53.withZoneRetainFields(dateTimeZone65);
        java.util.Date date71 = dateTime70.toDate();
        int int72 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant14", (mutableDateTime9.compareTo(instant14) == 0) == mutableDateTime9.equals(instant14));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 32772);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DurationField durationField6 = chronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalDate localDate13 = property11.roundCeilingCopy();
        int int14 = property11.getMaximumValueOverall();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property16.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str26 = dateTimeFieldType25.getName();
        org.joda.time.DateTime.Property property27 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTime dateTime28 = property27.withMaximumValue();
        org.joda.time.LocalDate localDate29 = dateTime28.toLocalDate();
        int int30 = dateTime28.getDayOfYear();
        int int31 = property11.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Instant instant32 = dateTime28.toInstant();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate35 = property34.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime41.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str44 = dateTimeFieldType43.getName();
        org.joda.time.DateTime.Property property45 = dateTime42.property(dateTimeFieldType43);
        org.joda.time.DateTime dateTime46 = property45.roundFloorCopy();
        org.joda.time.DateTime.Property property47 = dateTime46.year();
        org.joda.time.DateTime dateTime48 = property47.withMinimumValue();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property50 = localDate49.yearOfCentury();
        org.joda.time.LocalDate localDate51 = property50.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean55 = dateTimeZone54.isFixed();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone54);
        org.joda.time.DateTime dateTime57 = localDate51.toDateTimeAtStartOfDay(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime57.toMutableDateTime();
        org.joda.time.Chronology chronology59 = dateTime57.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.halfdays();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.monthOfYear();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property63 = localDate62.yearOfCentury();
        org.joda.time.LocalDate localDate64 = property63.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean68 = dateTimeZone67.isFixed();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone67);
        org.joda.time.DateTime dateTime70 = localDate64.toDateTimeAtStartOfDay(dateTimeZone67);
        org.joda.time.DateTime dateTime71 = dateTime70.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str73 = dateTimeFieldType72.getName();
        org.joda.time.DateTime.Property property74 = dateTime71.property(dateTimeFieldType72);
        org.joda.time.DateTime dateTime75 = property74.roundFloorCopy();
        org.joda.time.DateTime.Property property76 = dateTime75.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime75.getZone();
        java.util.TimeZone timeZone78 = dateTimeZone77.toTimeZone();
        org.joda.time.Chronology chronology79 = chronology59.withZone(dateTimeZone77);
        org.joda.time.DateTimeField dateTimeField80 = chronology79.clockhourOfHalfday();
        org.joda.time.LocalDate localDate81 = org.joda.time.LocalDate.now(chronology79);
        org.joda.time.DateTimeField dateTimeField82 = chronology79.millisOfDay();
        long long86 = chronology79.add((long) 42, (long) 39, 1970);
        org.joda.time.DateTimeField dateTimeField87 = chronology79.weekyearOfCentury();
        org.joda.time.DateTime dateTime88 = dateTime48.withChronology(chronology79);
        long long89 = dateTime88.getMillis();
        org.joda.time.DateTime.Property property90 = dateTime88.secondOfDay();
        boolean boolean91 = instant32.isEqual((org.joda.time.ReadableInstant) dateTime88);
        int int92 = dateTime88.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant32", (dateTime28.compareTo(instant32) == 0) == dateTime28.equals(instant32));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) '#');
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        long long13 = property12.remainder();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.DateTime dateTime15 = property12.roundCeilingCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.Chronology chronology19 = dateTimeFormatter18.getChronology();
        boolean boolean20 = dateTimeFormatter18.isParser();
        java.util.Locale locale21 = dateTimeFormatter18.getLocale();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean25 = dateTimeZone24.isFixed();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone24);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTime dateTime29 = localDate26.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withMillis((long) 32772);
        org.joda.time.DateTime dateTime33 = dateTime31.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime35 = dateTime31.withSecondOfMinute((int) (short) 10);
        org.joda.time.Chronology chronology36 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.weekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter18.withChronology(chronology36);
        org.joda.time.Chronology chronology39 = dateTimeFormatter38.getChronolgy();
        org.joda.time.DurationField durationField40 = chronology39.halfdays();
        org.joda.time.DurationField durationField41 = chronology39.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.millisOfDay();
        java.util.Locale locale45 = new java.util.Locale("ISOChronology[UTC]");
        int int46 = dateTimeField43.getMaximumTextLength(locale45);
        java.util.Calendar calendar47 = dateTime15.toCalendar(locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField41", (durationField14.compareTo(durationField41) == 0) == durationField14.equals(durationField41));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfCentury();
        org.joda.time.LocalDate localDate15 = property14.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DateTime.Property property25 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTime dateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology30 = chronology10.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfHalfday();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now(chronology30);
        org.joda.time.DurationField durationField35 = chronology30.eras();
        org.joda.time.DurationField durationField36 = chronology30.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField35", Math.signum(durationField11.compareTo(durationField35)) == -Math.signum(durationField35.compareTo(durationField11)));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.LocalDate localDate10 = localDate2.plusMonths((int) (short) 1);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTime(localTime13);
        int int15 = localDate12.getEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(57);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtCurrentTime(dateTimeZone17);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("allemand");
        java.util.Calendar calendar21 = dateTime18.toCalendar(locale20);
        java.time.Instant instant22 = calendar21.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime18", (dateTime14.compareTo(dateTime18) == 0) == dateTime14.equals(dateTime18));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean7 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withPivotYear(17);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean13 = dateTimeZone12.isFixed();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone12);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTime dateTime17 = localDate14.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillis((long) 32772);
        org.joda.time.DateTime dateTime21 = dateTime19.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear(42);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 292278994);
        java.util.Date date27 = dateTime21.toDate();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property29 = localDate28.yearOfCentury();
        org.joda.time.LocalDate localDate30 = property29.getLocalDate();
        org.joda.time.LocalDate localDate32 = localDate30.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfCentury();
        org.joda.time.LocalDate localDate35 = property34.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = localDate32.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfCentury();
        org.joda.time.LocalDate localDate45 = property44.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean49 = dateTimeZone48.isFixed();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = localDate45.toDateTimeAtStartOfDay(dateTimeZone48);
        org.joda.time.DateTime dateTime52 = dateTime51.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str54 = dateTimeFieldType53.getName();
        org.joda.time.DateTime.Property property55 = dateTime52.property(dateTimeFieldType53);
        org.joda.time.DateTime dateTime56 = property55.roundFloorCopy();
        org.joda.time.DateTime.Property property57 = dateTime56.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime56.getZone();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean62 = dateTimeZone61.isFixed();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone61);
        java.util.TimeZone timeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.DateTime dateTime66 = localDate63.toDateTimeAtMidnight(dateTimeZone65);
        int int67 = dateTime66.getMonthOfYear();
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        org.joda.time.DateTime dateTime70 = dateTime66.toDateTime(dateTimeZone69);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone69);
        long long73 = dateTimeZone58.getMillisKeepLocal(dateTimeZone69, (long) 7);
        org.joda.time.DateTime dateTime74 = dateTime42.toDateTime(dateTimeZone69);
        org.joda.time.DateTime dateTime75 = dateTime21.toDateTime(dateTimeZone69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter9.withZone(dateTimeZone69);
        java.util.Locale locale77 = dateTimeFormatter9.getLocale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime74", (dateTime42.compareTo(dateTime74) == 0) == dateTime42.equals(dateTime74));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32772);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) 6);
        long long18 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime19 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withMinuteOfHour(7);
        org.joda.time.DateTime dateTime24 = dateTime19.plusMillis(6);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.yearOfCentury();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean31 = dateTimeZone30.isFixed();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone30);
        boolean boolean34 = dateTime33.isBeforeNow();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(48);
        int int38 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime19.withMillis((long) 86397);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property42 = localDate41.yearOfCentury();
        org.joda.time.LocalDate localDate43 = property42.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean47 = dateTimeZone46.isFixed();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = localDate43.toDateTimeAtStartOfDay(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = dateTime49.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property51 = dateTime50.year();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property53 = localDate52.yearOfCentury();
        org.joda.time.LocalDate localDate54 = property53.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean58 = dateTimeZone57.isFixed();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone57);
        org.joda.time.DateTime dateTime60 = localDate54.toDateTimeAtStartOfDay(dateTimeZone57);
        org.joda.time.DateTime dateTime61 = dateTime60.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str63 = dateTimeFieldType62.getName();
        org.joda.time.DateTime.Property property64 = dateTime61.property(dateTimeFieldType62);
        org.joda.time.Interval interval65 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime67 = dateTime50.minusDays(32772);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.DateTime dateTime69 = dateTime67.plus(readableDuration68);
        org.joda.time.DateTimeZone dateTimeZone70 = dateTime67.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone70);
        org.joda.time.DateTime dateTime72 = dateTime19.withZone(dateTimeZone70);
        org.joda.time.DateTime.Property property73 = dateTime19.year();
        org.joda.time.DateTime dateTime74 = dateTime19.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime74", (dateTime9.compareTo(dateTime74) == 0) == dateTime9.equals(dateTime74));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 32770);
        java.util.Calendar calendar3 = builder2.build();
        boolean boolean5 = calendar3.after((java.lang.Object) 70);
        calendar3.set(10, 32772, (int) (byte) 1, 22, 0);
        int int12 = calendar3.getMinimalDaysInFirstWeek();
        calendar3.set(796407, 2011, 0, 43, 86397);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone21);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTime dateTime26 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 32772);
        org.joda.time.DateTime dateTime30 = dateTime28.minusSeconds((int) '#');
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekOfWeekyear(42);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 1, (long) 12, dateTimeZone35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Interval interval38 = interval36.withChronology(chronology37);
        org.joda.time.Duration duration39 = interval36.toDuration();
        org.joda.time.DateTime dateTime40 = dateTime32.plus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.DateTime dateTime43 = dateTime40.withDurationAdded((long) ' ', (int) (byte) 100);
        int int44 = dateTime40.getSecondOfDay();
        org.joda.time.DateTime dateTime46 = dateTime40.plusMonths(57);
        org.joda.time.DateTime dateTime48 = dateTime40.plusMinutes(16);
        boolean boolean49 = dateTime40.isAfterNow();
        org.joda.time.Instant instant50 = dateTime40.toInstant();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property52 = localDate51.yearOfCentury();
        org.joda.time.LocalDate localDate53 = property52.getLocalDate();
        org.joda.time.LocalDate localDate55 = localDate53.withYearOfEra((int) 'u');
        org.joda.time.LocalDate localDate57 = localDate53.minusYears(11);
        int int58 = localDate57.getYear();
        org.joda.time.LocalDate localDate60 = localDate57.plusDays(100);
        org.joda.time.LocalDate.Property property61 = localDate60.weekyear();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean64 = dateTimeZone63.isFixed();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours(6);
        int int68 = dateTimeZone66.getOffsetFromLocal((long) 6);
        long long70 = dateTimeZone63.getMillisKeepLocal(dateTimeZone66, (long) 10);
        long long72 = dateTimeZone66.nextTransition((long) 'u');
        java.lang.String str73 = dateTimeZone66.toString();
        org.joda.time.DateMidnight dateMidnight74 = localDate60.toDateMidnight(dateTimeZone66);
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property76 = localDate75.yearOfCentury();
        org.joda.time.LocalDate localDate77 = property76.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHours(6);
        boolean boolean81 = dateTimeZone80.isFixed();
        org.joda.time.LocalDate localDate82 = new org.joda.time.LocalDate((java.lang.Object) 0L, dateTimeZone80);
        org.joda.time.DateTime dateTime83 = localDate77.toDateTimeAtStartOfDay(dateTimeZone80);
        org.joda.time.DateTime dateTime84 = dateTime83.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate85 = dateTime83.toLocalDate();
        org.joda.time.LocalDate localDate86 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property87 = localDate86.yearOfCentury();
        org.joda.time.LocalDate localDate88 = property87.getLocalDate();
        java.lang.String str89 = property87.getName();
        long long90 = property87.remainder();
        int int91 = property87.getMinimumValue();
        org.joda.time.LocalDate localDate92 = property87.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = property87.getFieldType();
        boolean boolean94 = localDate85.isSupported(dateTimeFieldType93);
        org.joda.time.DurationFieldType durationFieldType95 = dateTimeFieldType93.getRangeDurationType();
        boolean boolean96 = localDate60.isSupported(dateTimeFieldType93);
        int int97 = instant50.get(dateTimeFieldType93);
        boolean boolean98 = calendar3.before((java.lang.Object) dateTimeFieldType93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and instant50", (dateTime40.compareTo(instant50) == 0) == dateTime40.equals(instant50));
    }
}

