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
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight2.minusMonths((int) (short) 1);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.plus((-1L));
        org.joda.time.Chronology chronology15 = dateMidnight14.getChronology();
        boolean boolean17 = dateMidnight14.isBefore((long) ' ');
        org.joda.time.LocalDate localDate18 = dateMidnight14.toLocalDate();
        int int19 = property9.getDifference((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Instant instant20 = dateMidnight14.toInstant();
        org.joda.time.Instant instant21 = dateMidnight14.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant20", (dateMidnight4.compareTo(instant20) == 0) == dateMidnight4.equals(instant20));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone3);
        java.util.Date date5 = dateMidnight4.toDate();
        org.joda.time.YearMonthDay yearMonthDay6 = dateMidnight4.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay6.withPeriodAdded(readablePeriod7, 11);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.plus((-1L));
        org.joda.time.Chronology chronology15 = dateMidnight14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.centuries();
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay9.withChronologyRetainFields(chronology15);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(0L, chronology15);
        org.joda.time.DurationField durationField19 = chronology15.eras();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 6, chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField19", Math.signum(durationField16.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField16)));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getFirstDayOfWeek();
        int int2 = calendar0.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone4);
        java.util.Date date6 = dateMidnight5.toDate();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        java.util.Date date10 = dateMidnight9.toDate();
        boolean boolean11 = date6.before(date10);
        int int12 = date6.getMonth();
        calendar0.setTime(date6);
        calendar0.setFirstDayOfWeek((int) (short) 1);
        java.time.Instant instant16 = calendar0.toInstant();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        int int18 = calendar17.getFirstDayOfWeek();
        int int19 = calendar17.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone21);
        java.util.Date date23 = dateMidnight22.toDate();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone25);
        java.util.Date date27 = dateMidnight26.toDate();
        boolean boolean28 = date23.before(date27);
        int int29 = date23.getMonth();
        calendar17.setTime(date23);
        java.util.TimeZone timeZone31 = calendar17.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        calendar0.setTimeZone(timeZone31);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.plus((-1L));
        org.joda.time.Chronology chronology39 = dateMidnight38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.secondOfMinute();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology39);
        org.joda.time.LocalDate localDate43 = localDate41.withYearOfEra((int) (byte) 10);
        int int44 = localDate41.getYearOfCentury();
        org.joda.time.LocalTime localTime45 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.plus((-1L));
        org.joda.time.Chronology chronology51 = dateMidnight50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.secondOfMinute();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.LocalDate localDate55 = localDate53.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate57 = localDate53.plusYears((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone59);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight60.plus((-1L));
        org.joda.time.Chronology chronology63 = dateMidnight62.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.secondOfMinute();
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate(chronology63);
        org.joda.time.LocalDate localDate67 = localDate65.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate69 = localDate65.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        java.lang.String str72 = dateTimeZone71.toString();
        org.joda.time.DateTime dateTime73 = localDate69.toDateTimeAtCurrentTime(dateTimeZone71);
        boolean boolean74 = dateTimeZone71.isFixed();
        org.joda.time.DateTime dateTime75 = localDate57.toDateTimeAtCurrentTime(dateTimeZone71);
        org.joda.time.DateTime dateTime76 = localDate41.toDateTime(localTime45, dateTimeZone71);
        java.util.TimeZone timeZone77 = dateTimeZone71.toTimeZone();
        calendar0.setTimeZone(timeZone77);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(timeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar17", (calendar0.compareTo(calendar17) == 0) == calendar0.equals(calendar17));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        java.util.Date date13 = dateMidnight12.toDate();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone15);
        java.util.Date date17 = dateMidnight16.toDate();
        boolean boolean18 = date13.before(date17);
        int int19 = date13.getDay();
        int int20 = date13.getHours();
        date13.setSeconds((int) '4');
        boolean boolean23 = dateTime8.equals((java.lang.Object) date13);
        org.joda.time.DateTime dateTime25 = dateTime8.withYearOfEra((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime8.toMutableDateTime(dateTimeZone28);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime29", (dateTime6.compareTo(mutableDateTime29) == 0) == dateTime6.equals(mutableDateTime29));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight2.minusMonths((int) (short) 1);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.plus((-1L));
        org.joda.time.Chronology chronology15 = dateMidnight14.getChronology();
        boolean boolean17 = dateMidnight14.isBefore((long) ' ');
        org.joda.time.LocalDate localDate18 = dateMidnight14.toLocalDate();
        int int19 = property9.getDifference((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Instant instant20 = dateMidnight14.toInstant();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.plus((-1L));
        org.joda.time.Chronology chronology26 = dateMidnight25.getChronology();
        int int27 = dateMidnight14.compareTo((org.joda.time.ReadableInstant) dateMidnight25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant20", (dateMidnight4.compareTo(instant20) == 0) == dateMidnight4.equals(instant20));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((-1L));
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfMinute();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.LocalDate localDate19 = localDate13.withWeekyear(19);
        org.joda.time.LocalTime localTime20 = null;
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str24 = dateTimeZone22.getNameKey((long) (-1));
        org.joda.time.DateTime dateTime25 = localDate13.toDateTime(localTime20, dateTimeZone22);
        org.joda.time.LocalDate.Property property26 = localDate13.weekyear();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minus((long) (-1));
        org.joda.time.Chronology chronology30 = dateMidnight29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        boolean boolean32 = property26.equals((java.lang.Object) chronology30);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) (byte) 0, 100L, chronology30);
        org.joda.time.DurationField durationField34 = chronology30.eras();
        org.joda.time.DurationField durationField35 = chronology30.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField35, and durationField34", !(durationField34.compareTo(durationField35) == 0) || (Math.signum(durationField34.compareTo(durationField34)) == Math.signum(durationField35.compareTo(durationField34))));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        java.util.Date date13 = dateMidnight12.toDate();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone15);
        java.util.Date date17 = dateMidnight16.toDate();
        boolean boolean18 = date13.before(date17);
        int int19 = date13.getDay();
        int int20 = date13.getHours();
        date13.setSeconds((int) '4');
        boolean boolean23 = dateTime8.equals((java.lang.Object) date13);
        org.joda.time.DateTime dateTime25 = dateTime8.withYearOfEra((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime8.toMutableDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean31 = dateTimeZone30.isFixed();
        boolean boolean32 = dateTimeZone30.isFixed();
        long long34 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) (-292275054));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime29", (dateTime6.compareTo(mutableDateTime29) == 0) == dateTime6.equals(mutableDateTime29));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((-1L));
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfMinute();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.LocalDate localDate19 = localDate13.withWeekyear(19);
        org.joda.time.LocalTime localTime20 = null;
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str24 = dateTimeZone22.getNameKey((long) (-1));
        org.joda.time.DateTime dateTime25 = localDate13.toDateTime(localTime20, dateTimeZone22);
        org.joda.time.LocalDate.Property property26 = localDate13.weekyear();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minus((long) (-1));
        org.joda.time.Chronology chronology30 = dateMidnight29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        boolean boolean32 = property26.equals((java.lang.Object) chronology30);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) (byte) 0, 100L, chronology30);
        org.joda.time.DurationField durationField34 = chronology30.eras();
        org.joda.time.DurationField durationField35 = chronology30.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField35, and durationField34", !(durationField34.compareTo(durationField35) == 0) || (Math.signum(durationField34.compareTo(durationField34)) == Math.signum(durationField35.compareTo(durationField34))));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        java.util.Date date13 = dateMidnight12.toDate();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone15);
        java.util.Date date17 = dateMidnight16.toDate();
        boolean boolean18 = date13.before(date17);
        int int19 = date13.getDay();
        int int20 = date13.getHours();
        date13.setSeconds((int) '4');
        boolean boolean23 = dateTime8.equals((java.lang.Object) date13);
        org.joda.time.DateTime dateTime25 = dateTime8.withYearOfEra((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime8.toMutableDateTime(dateTimeZone28);
        org.joda.time.Instant instant30 = dateTime8.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime29", (dateTime8.compareTo(mutableDateTime29) == 0) == dateTime8.equals(mutableDateTime29));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.hours();
        org.joda.time.DurationField durationField7 = chronology5.centuries();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfWeek();
        org.joda.time.DurationField durationField9 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField6, and durationField7", !(durationField9.compareTo(durationField6) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        java.util.Date date13 = dateMidnight12.toDate();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone15);
        java.util.Date date17 = dateMidnight16.toDate();
        boolean boolean18 = date13.before(date17);
        int int19 = date13.getDay();
        int int20 = date13.getHours();
        date13.setSeconds((int) '4');
        boolean boolean23 = dateTime8.equals((java.lang.Object) date13);
        org.joda.time.DateTime dateTime25 = dateTime8.withYearOfEra((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime8.toMutableDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime8.withWeekyear(34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime29", (dateTime8.compareTo(mutableDateTime29) == 0) == dateTime8.equals(mutableDateTime29));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readableDuration4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.plus(readableDuration8);
        int int10 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone12);
        java.util.Date date14 = dateMidnight13.toDate();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        java.util.Date date18 = dateMidnight17.toDate();
        boolean boolean19 = date14.before(date18);
        int int20 = date14.getDay();
        int int21 = date14.getHours();
        date14.setSeconds((int) '4');
        boolean boolean24 = dateTime9.equals((java.lang.Object) date14);
        org.joda.time.DateTime dateTime26 = dateTime9.withYearOfEra((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime9.toMutableDateTime(dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) 44, dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime30", (dateTime7.compareTo(mutableDateTime30) == 0) == dateTime7.equals(mutableDateTime30));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readableDuration4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.plus(readableDuration8);
        int int10 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone12);
        java.util.Date date14 = dateMidnight13.toDate();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        java.util.Date date18 = dateMidnight17.toDate();
        boolean boolean19 = date14.before(date18);
        int int20 = date14.getDay();
        int int21 = date14.getHours();
        date14.setSeconds((int) '4');
        boolean boolean24 = dateTime9.equals((java.lang.Object) date14);
        org.joda.time.DateTime dateTime26 = dateTime9.withYearOfEra((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime9.toMutableDateTime(dateTimeZone29);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 34, dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime30", (dateTime7.compareTo(mutableDateTime30) == 0) == dateTime7.equals(mutableDateTime30));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.minus((long) (-1));
        org.joda.time.Chronology chronology3 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.minus((long) (-1));
        org.joda.time.Chronology chronology3 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DurationField durationField7 = chronology3.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.plus((-1L));
        org.joda.time.Chronology chronology8 = dateMidnight7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.centuries();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(70L, chronology8);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(23, (int) (short) 10, chronology8);
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight13.withZoneRetainFields(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight13 and dateMidnight17", (dateMidnight13.compareTo(dateMidnight17) == 0) == dateMidnight13.equals(dateMidnight17));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime11 = dateTime2.minusDays(11);
        org.joda.time.DateTime.Property property12 = dateTime11.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int14 = dateTime11.get(dateTimeFieldType13);
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 34545, (-292275054));
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTime();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        int int20 = dateTime17.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant19", (dateTime17.compareTo(instant19) == 0) == dateTime17.equals(instant19));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime11 = dateTime2.minusDays(11);
        org.joda.time.DateTime.Property property12 = dateTime11.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int14 = dateTime11.get(dateTimeFieldType13);
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 34545, (-292275054));
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTime();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        org.joda.time.DateTime.Property property20 = dateTime17.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant19", (dateTime17.compareTo(instant19) == 0) == dateTime17.equals(instant19));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime11 = dateTime2.minusDays(11);
        org.joda.time.DateTime.Property property12 = dateTime11.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int14 = dateTime11.get(dateTimeFieldType13);
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 34545, (-292275054));
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTime();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        int int20 = dateTime17.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant19", (dateTime17.compareTo(instant19) == 0) == dateTime17.equals(instant19));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        java.util.Date date4 = dateMidnight3.toDate();
        org.joda.time.DateMidnight.Property property5 = dateMidnight3.dayOfWeek();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean10 = interval6.isBefore((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DateTime dateTime11 = interval6.getEnd();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.dayOfWeek();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18);
        boolean boolean22 = interval14.isAfter((org.joda.time.ReadableInterval) interval21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((-1L), dateTimeZone24);
        org.joda.time.Interval interval26 = interval14.withStart((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean27 = interval6.overlaps((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.Interval interval29 = interval6.withPeriodAfterStart(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate41 = localDate37.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate43 = localDate37.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property44 = localDate37.centuryOfEra();
        org.joda.time.LocalDate localDate45 = property44.roundCeilingCopy();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.eras();
        org.joda.time.Interval interval48 = interval29.withChronology(chronology46);
        org.joda.time.DurationField durationField49 = chronology46.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField49, and durationField47", !(durationField47.compareTo(durationField49) == 0) || (Math.signum(durationField47.compareTo(durationField47)) == Math.signum(durationField49.compareTo(durationField47))));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        boolean boolean8 = dateMidnight6.equals((java.lang.Object) 100.0f);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.minus(readableDuration9);
        int int11 = dateMidnight6.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minus((long) (-1));
        org.joda.time.Chronology chronology15 = dateMidnight14.getChronology();
        int int16 = dateMidnight14.getYearOfEra();
        boolean boolean17 = dateMidnight6.isEqual((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight6.minus((long) 15);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight6.plusMonths(70);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minus((long) (-1));
        org.joda.time.Chronology chronology25 = dateMidnight24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.clockhourOfHalfday();
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfDay();
        org.joda.time.DateMidnight dateMidnight29 = org.joda.time.DateMidnight.now(chronology27);
        org.joda.time.DateTime dateTime30 = dateMidnight6.toDateTime(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight12 and dateMidnight29", (dateMidnight12.compareTo(dateMidnight29) == 0) == dateMidnight12.equals(dateMidnight29));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.monthOfYear();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.minus(readableDuration5);
        org.joda.time.DateTime.Property property7 = dateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime1.withField(dateTimeFieldType8, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime10.withSecondOfMinute(15);
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.DateTime dateTime17 = dateTime14.toDateTime(dateTimeZone16);
        long long19 = dateTimeZone16.nextTransition((long) (-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime17", (dateTime12.compareTo(dateTime17) == 0) == dateTime12.equals(dateTime17));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 16);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plus((-1L));
        org.joda.time.Chronology chronology12 = dateMidnight11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfMinute();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.DurationField durationField15 = chronology12.days();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 11, chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology12);
        java.util.GregorianCalendar gregorianCalendar19 = dateTime18.toGregorianCalendar();
        org.joda.time.DateTime dateTime21 = dateTime18.minusDays(0);
        org.joda.time.DateTime.Property property22 = dateTime21.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone24);
        java.util.Date date26 = dateMidnight25.toDate();
        org.joda.time.YearMonthDay yearMonthDay27 = dateMidnight25.toYearMonthDay();
        int[] intArray28 = yearMonthDay27.getValues();
        org.joda.time.LocalDate localDate29 = yearMonthDay27.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime32 = localDate29.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime21.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime33", (dateTime18.compareTo(dateTime33) == 0) == dateTime18.equals(dateTime33));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((-1L));
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.secondOfMinute();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DurationField durationField9 = chronology6.days();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 11, chronology6);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.year();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology6);
        java.util.GregorianCalendar gregorianCalendar13 = dateTime12.toGregorianCalendar();
        org.joda.time.DateTime dateTime15 = dateTime12.minusDays(0);
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone18);
        java.util.Date date20 = dateMidnight19.toDate();
        org.joda.time.YearMonthDay yearMonthDay21 = dateMidnight19.toYearMonthDay();
        int[] intArray22 = yearMonthDay21.getValues();
        org.joda.time.LocalDate localDate23 = yearMonthDay21.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime26 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime15.withZoneRetainFields(dateTimeZone25);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone25.getName(45L, locale29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime27", (dateTime12.compareTo(dateTime27) == 0) == dateTime12.equals(dateTime27));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((-1L));
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        boolean boolean9 = dateMidnight6.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property10 = dateMidnight6.centuryOfEra();
        java.lang.String str11 = property10.getAsText();
        org.joda.time.DateMidnight dateMidnight12 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.clockhourOfDay();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight12.withChronology(chronology18);
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (byte) -1, chronology18);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.halfdayOfDay();
        org.joda.time.Chronology chronology24 = chronology18.withUTC();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) 575, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property30 = dateTime27.monthOfYear();
        org.joda.time.DateTime dateTime31 = property30.withMaximumValue();
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes(21);
        org.joda.time.DateTime.Property property34 = dateTime31.weekyear();
        int int35 = property34.getMinimumValueOverall();
        org.joda.time.DateTime dateTime36 = property34.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime38 = dateTime36.withWeekyear(4);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.plus((-1L));
        org.joda.time.Chronology chronology44 = dateMidnight43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.secondOfMinute();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(chronology44);
        org.joda.time.LocalDate localDate48 = localDate46.withYearOfEra((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime54 = dateTime52.plusYears(5);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone57);
        java.util.Date date59 = dateMidnight58.toDate();
        org.joda.time.DateMidnight.Property property60 = dateMidnight58.dayOfWeek();
        org.joda.time.Interval interval61 = new org.joda.time.Interval(readableDuration55, (org.joda.time.ReadableInstant) dateMidnight58);
        org.joda.time.Interval interval64 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean65 = interval61.isBefore((org.joda.time.ReadableInterval) interval64);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = interval61.toPeriod(periodType66);
        org.joda.time.DateTime dateTime68 = dateTime52.minus((org.joda.time.ReadablePeriod) period67);
        org.joda.time.LocalDate localDate70 = localDate48.withPeriodAdded((org.joda.time.ReadablePeriod) period67, 6);
        org.joda.time.DateTime dateTime71 = dateTime36.plus((org.joda.time.ReadablePeriod) period67);
        int[] intArray73 = chronology24.get((org.joda.time.ReadablePeriod) period67, (long) 9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and dateMidnight25", (dateMidnight4.compareTo(dateMidnight25) == 0) == dateMidnight4.equals(dateMidnight25));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        java.util.Date date4 = dateMidnight3.toDate();
        org.joda.time.DateMidnight.Property property5 = dateMidnight3.dayOfWeek();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean10 = interval6.isBefore((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DateTime dateTime11 = interval6.getEnd();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.dayOfWeek();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18);
        boolean boolean22 = interval14.isAfter((org.joda.time.ReadableInterval) interval21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((-1L), dateTimeZone24);
        org.joda.time.Interval interval26 = interval14.withStart((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean27 = interval6.overlaps((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.Interval interval29 = interval6.withPeriodAfterStart(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate41 = localDate37.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate43 = localDate37.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property44 = localDate37.centuryOfEra();
        org.joda.time.LocalDate localDate45 = property44.roundCeilingCopy();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.eras();
        org.joda.time.Interval interval48 = interval29.withChronology(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.clockhourOfHalfday();
        org.joda.time.DurationField durationField50 = chronology46.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField50, and durationField47", !(durationField47.compareTo(durationField50) == 0) || (Math.signum(durationField47.compareTo(durationField47)) == Math.signum(durationField50.compareTo(durationField47))));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTime.Property property6 = dateTime4.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.withMinimumValue();
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plus((-1L));
        org.joda.time.Chronology chronology14 = dateMidnight13.getChronology();
        boolean boolean16 = dateMidnight13.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property17 = dateMidnight13.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight13.minusWeeks(17);
        int int20 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone22);
        java.util.Date date24 = dateMidnight23.toDate();
        org.joda.time.YearMonthDay yearMonthDay25 = dateMidnight23.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.plus((-1L));
        org.joda.time.Chronology chronology31 = dateMidnight30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfMinute();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology31);
        org.joda.time.DurationField durationField34 = chronology31.days();
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay25.withChronologyRetainFields(chronology31);
        org.joda.time.Chronology chronology36 = yearMonthDay35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.minutes();
        org.joda.time.DateTime dateTime38 = dateTime7.withChronology(chronology36);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime38", (dateTime7.compareTo(dateTime38) == 0) == dateTime7.equals(dateTime38));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        int int6 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime8 = dateTime4.minusYears(9);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        java.util.Date date10 = dateTime4.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant9", (dateTime4.compareTo(instant9) == 0) == dateTime4.equals(instant9));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((-1L));
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DurationField durationField11 = chronology7.minutes();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now(chronology7);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((-1L), chronology7);
        org.joda.time.DurationField durationField14 = chronology7.hours();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 11, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField8, and durationField11", !(durationField17.compareTo(durationField8) == 0) || (Math.signum(durationField17.compareTo(durationField11)) == Math.signum(durationField8.compareTo(durationField11))));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.plus((-1L));
        org.joda.time.Chronology chronology10 = dateMidnight9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.secondOfMinute();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DurationField durationField13 = chronology10.days();
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay4.withChronologyRetainFields(chronology10);
        org.joda.time.Chronology chronology15 = yearMonthDay14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.weeks();
        org.joda.time.DurationField durationField17 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField13, and durationField16", !(durationField17.compareTo(durationField13) == 0) || (Math.signum(durationField17.compareTo(durationField16)) == Math.signum(durationField13.compareTo(durationField16))));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        java.util.Date date13 = dateMidnight12.toDate();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone15);
        java.util.Date date17 = dateMidnight16.toDate();
        boolean boolean18 = date13.before(date17);
        int int19 = date13.getDay();
        int int20 = date13.getHours();
        date13.setSeconds((int) '4');
        boolean boolean23 = dateTime8.equals((java.lang.Object) date13);
        org.joda.time.DateTime dateTime25 = dateTime8.withYearOfEra((int) (short) 100);
        int int26 = dateTime8.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minus((long) (-1));
        org.joda.time.Chronology chronology32 = dateMidnight31.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minus(readablePeriod34);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusMinutes(1970);
        int[] intArray40 = timeOfDay39.getValues();
        org.joda.time.TimeOfDay.Property property41 = timeOfDay39.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay42 = property41.withMinimumValue();
        org.joda.time.Chronology chronology43 = timeOfDay42.getChronology();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) (short) -1, (long) 50, chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime8.toMutableDateTime(chronology43);
        org.joda.time.DateTime dateTime47 = dateTime8.withMillisOfDay(12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime45", (dateTime8.compareTo(mutableDateTime45) == 0) == dateTime8.equals(mutableDateTime45));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfMinute();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField9 = localDate7.getField(1);
        org.joda.time.LocalDate localDate11 = localDate7.withDayOfYear(2);
        java.util.Date date12 = localDate11.toDate();
        org.joda.time.LocalDate localDate14 = localDate11.withCenturyOfEra(131);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.plus((-1L));
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight17.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight17.minusMonths((int) (short) 1);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.plus((-1L));
        org.joda.time.Chronology chronology30 = dateMidnight29.getChronology();
        boolean boolean32 = dateMidnight29.isBefore((long) ' ');
        org.joda.time.LocalDate localDate33 = dateMidnight29.toLocalDate();
        int int34 = property24.getDifference((org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.Instant instant35 = dateMidnight29.toInstant();
        org.joda.time.DateTimeZone dateTimeZone36 = instant35.getZone();
        org.joda.time.DateTime dateTime37 = localDate11.toDateTimeAtCurrentTime(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant35", (dateMidnight4.compareTo(instant35) == 0) == dateMidnight4.equals(instant35));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        int int12 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime.Property property13 = dateTime11.dayOfYear();
        boolean boolean14 = dateMidnight2.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.LocalDate localDate16 = dateTime11.toLocalDate();
        org.joda.time.DateTime dateTime17 = dateTime11.toDateTime();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.String str22 = dateTimeZone20.getNameKey((long) (-1));
        java.lang.String str24 = dateTimeZone20.getNameKey((long) (short) 0);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(70L, dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime11.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minus((long) (-1));
        org.joda.time.Chronology chronology30 = dateMidnight29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfHalfday();
        org.joda.time.Chronology chronology32 = chronology30.withUTC();
        org.joda.time.DateTime dateTime33 = dateTime11.withChronology(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime33", (dateTime10.compareTo(dateTime33) == 0) == dateTime10.equals(dateTime33));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.monthOfYear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.minus(readableDuration10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) dateTime11, chronology23);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay4.withChronologyRetainFields(chronology23);
        org.joda.time.DurationField durationField26 = chronology23.weeks();
        org.joda.time.DurationField durationField27 = chronology23.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology23.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField27", Math.signum(durationField26.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField26)));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((-1L));
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.secondOfMinute();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DurationField durationField9 = chronology6.days();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 11, chronology6);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.year();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology6);
        java.util.GregorianCalendar gregorianCalendar13 = dateTime12.toGregorianCalendar();
        org.joda.time.DateTime dateTime15 = dateTime12.minusDays(0);
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone18);
        java.util.Date date20 = dateMidnight19.toDate();
        org.joda.time.YearMonthDay yearMonthDay21 = dateMidnight19.toYearMonthDay();
        int[] intArray22 = yearMonthDay21.getValues();
        org.joda.time.LocalDate localDate23 = yearMonthDay21.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime26 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime15.withZoneRetainFields(dateTimeZone25);
        int int29 = dateTimeZone25.getStandardOffset((long) 70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime27", (dateTime12.compareTo(dateTime27) == 0) == dateTime12.equals(dateTime27));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfMinute();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate11 = localDate7.plusYears((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plus((-1L));
        org.joda.time.Chronology chronology17 = dateMidnight16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.secondOfMinute();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate23 = localDate19.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str26 = dateTimeZone25.toString();
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        boolean boolean28 = dateTimeZone25.isFixed();
        org.joda.time.DateTime dateTime29 = localDate11.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.LocalDate localDate31 = localDate11.withCenturyOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate33 = localDate31.minusYears((int) (byte) 1);
        org.joda.time.DateTime dateTime34 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime36 = dateTime34.plusSeconds((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.plus((-1L));
        org.joda.time.Chronology chronology42 = dateMidnight41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.secondOfMinute();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(chronology42);
        org.joda.time.LocalDate localDate46 = localDate44.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate48 = localDate44.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate50 = localDate44.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property51 = localDate44.centuryOfEra();
        org.joda.time.LocalDate localDate52 = property51.roundCeilingCopy();
        org.joda.time.Chronology chronology53 = localDate52.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.eras();
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime34.toMutableDateTime(chronology53);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(chronology53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and mutableDateTime55", (dateTime34.compareTo(mutableDateTime55) == 0) == dateTime34.equals(mutableDateTime55));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes(32772);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.plus((-1L));
        org.joda.time.Chronology chronology11 = dateMidnight10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.secondOfMinute();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.DurationField durationField14 = chronology11.days();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 11, chronology11);
        org.joda.time.DateTimeField dateTimeField16 = chronology11.year();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology11);
        java.util.GregorianCalendar gregorianCalendar18 = dateTime17.toGregorianCalendar();
        org.joda.time.DateTime dateTime20 = dateTime17.minusDays(0);
        org.joda.time.DateTime.Property property21 = dateTime20.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone23);
        java.util.Date date25 = dateMidnight24.toDate();
        org.joda.time.YearMonthDay yearMonthDay26 = dateMidnight24.toYearMonthDay();
        int[] intArray27 = yearMonthDay26.getValues();
        org.joda.time.LocalDate localDate28 = yearMonthDay26.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = localDate28.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime20.withZoneRetainFields(dateTimeZone30);
        boolean boolean33 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime32", (dateTime20.compareTo(dateTime32) == 0) == dateTime20.equals(dateTime32));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((-1L));
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        boolean boolean9 = dateMidnight6.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property10 = dateMidnight6.centuryOfEra();
        java.lang.String str11 = property10.getAsText();
        org.joda.time.DateMidnight dateMidnight12 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.clockhourOfDay();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight12.withChronology(chronology18);
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (byte) -1, chronology18);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.halfdayOfDay();
        org.joda.time.Chronology chronology24 = chronology18.withUTC();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) 575, chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minus((long) 43);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusWeeks(27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and dateMidnight25", (dateMidnight4.compareTo(dateMidnight25) == 0) == dateMidnight4.equals(dateMidnight25));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        int int6 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime8 = dateTime4.minusYears(9);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        org.joda.time.DateTime.Property property10 = dateTime4.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant9", (dateTime4.compareTo(instant9) == 0) == dateTime4.equals(instant9));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.monthOfYear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.minus(readableDuration10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) dateTime11, chronology23);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay4.withChronologyRetainFields(chronology23);
        org.joda.time.DurationField durationField26 = chronology23.weeks();
        org.joda.time.DurationField durationField27 = chronology23.eras();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology23.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField27", Math.signum(durationField26.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField26)));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay4.withPeriodAdded(readablePeriod5, 11);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay9 = property8.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay10 = property8.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        int int16 = dateTime15.getSecondOfMinute();
        org.joda.time.DateTime.Property property17 = dateTime15.dayOfYear();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime19 = property17.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        boolean boolean24 = dateTimeZone22.isStandardOffset(252L);
        long long26 = dateTimeZone22.nextTransition((long) 26);
        org.joda.time.DateTime dateTime27 = dateTime19.withZone(dateTimeZone22);
        int int28 = property8.compareTo((org.joda.time.ReadableInstant) dateTime27);
        java.lang.String str29 = property8.getAsText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime27", (dateTime19.compareTo(dateTime27) == 0) == dateTime19.equals(dateTime27));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay4.withPeriodAdded(readablePeriod5, 11);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay9 = property8.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay10 = property8.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        int int16 = dateTime15.getSecondOfMinute();
        org.joda.time.DateTime.Property property17 = dateTime15.dayOfYear();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime19 = property17.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        boolean boolean24 = dateTimeZone22.isStandardOffset(252L);
        long long26 = dateTimeZone22.nextTransition((long) 26);
        org.joda.time.DateTime dateTime27 = dateTime19.withZone(dateTimeZone22);
        int int28 = property8.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone30);
        java.util.Date date32 = dateMidnight31.toDate();
        org.joda.time.YearMonthDay yearMonthDay33 = dateMidnight31.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay33.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.plus((-1L));
        org.joda.time.Chronology chronology41 = dateMidnight40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.secondOfMinute();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology41);
        boolean boolean44 = yearMonthDay35.isEqual((org.joda.time.ReadablePartial) localDate43);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        java.lang.String str48 = dateTimeZone46.getNameKey((long) (-1));
        long long50 = dateTimeZone46.convertUTCToLocal((long) 5);
        org.joda.time.DateMidnight dateMidnight51 = localDate43.toDateMidnight(dateTimeZone46);
        org.joda.time.LocalDate localDate53 = localDate43.plusDays(53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.plus((-1L));
        org.joda.time.Chronology chronology59 = dateMidnight58.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.hours();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.dayOfYear();
        org.joda.time.DurationField durationField63 = chronology59.minutes();
        org.joda.time.YearMonthDay yearMonthDay64 = new org.joda.time.YearMonthDay((java.lang.Object) localDate43, chronology59);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone66);
        java.util.Date date68 = dateMidnight67.toDate();
        org.joda.time.YearMonthDay yearMonthDay69 = dateMidnight67.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.plus((-1L));
        org.joda.time.Chronology chronology75 = dateMidnight74.getChronology();
        org.joda.time.DateTimeField dateTimeField76 = chronology75.secondOfMinute();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate(chronology75);
        org.joda.time.DurationField durationField78 = chronology75.days();
        org.joda.time.YearMonthDay yearMonthDay79 = yearMonthDay69.withChronologyRetainFields(chronology75);
        org.joda.time.Chronology chronology80 = yearMonthDay79.getChronology();
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight81.minus((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone84 = dateMidnight81.getZone();
        org.joda.time.DateMidnight dateMidnight85 = yearMonthDay79.toDateMidnight(dateTimeZone84);
        java.util.Set<java.lang.String> strSet86 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean87 = dateTimeZone84.equals((java.lang.Object) strSet86);
        org.joda.time.DateTime dateTime88 = yearMonthDay64.toDateTimeAtCurrentTime(dateTimeZone84);
        boolean boolean90 = dateTimeZone84.isStandardOffset((long) (-1974));
        org.joda.time.DateTime dateTime91 = dateTime27.withZone(dateTimeZone84);
        java.lang.String str93 = dateTimeZone84.getShortName((-25253155306220000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime27", (dateTime19.compareTo(dateTime27) == 0) == dateTime19.equals(dateTime27));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((-1L));
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfMinute();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.LocalDate localDate19 = localDate13.withWeekyear(19);
        org.joda.time.LocalTime localTime20 = null;
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str24 = dateTimeZone22.getNameKey((long) (-1));
        org.joda.time.DateTime dateTime25 = localDate13.toDateTime(localTime20, dateTimeZone22);
        org.joda.time.LocalDate.Property property26 = localDate13.weekyear();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minus((long) (-1));
        org.joda.time.Chronology chronology30 = dateMidnight29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        boolean boolean32 = property26.equals((java.lang.Object) chronology30);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) (byte) 0, 100L, chronology30);
        org.joda.time.DurationField durationField34 = chronology30.eras();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 35);
        org.joda.time.Chronology chronology38 = chronology30.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField39 = chronology38.eras();
        org.joda.time.DurationField durationField40 = chronology38.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField40, and durationField34", !(durationField34.compareTo(durationField40) == 0) || (Math.signum(durationField34.compareTo(durationField34)) == Math.signum(durationField40.compareTo(durationField34))));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        int int7 = dateMidnight6.getCenturyOfEra();
        org.joda.time.Instant instant8 = dateMidnight6.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plus((-1L));
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight11.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime20 = dateTime19.toDateTimeISO();
        int int21 = dateTime20.getSecondOfMinute();
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfYear();
        boolean boolean23 = dateMidnight11.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight11.minusWeeks(292278994);
        org.joda.time.DateMidnight.Property property26 = dateMidnight25.centuryOfEra();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone32);
        java.util.Date date34 = dateMidnight33.toDate();
        org.joda.time.DateMidnight.Property property35 = dateMidnight33.dayOfWeek();
        org.joda.time.Interval interval36 = new org.joda.time.Interval(readableDuration30, (org.joda.time.ReadableInstant) dateMidnight33);
        boolean boolean37 = interval29.isAfter((org.joda.time.ReadableInterval) interval36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.Interval interval39 = interval36.withPeriodAfterStart(readablePeriod38);
        long long40 = interval36.toDurationMillis();
        org.joda.time.Interval interval41 = interval36.toInterval();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone44);
        java.util.Date date46 = dateMidnight45.toDate();
        org.joda.time.DateMidnight.Property property47 = dateMidnight45.dayOfWeek();
        org.joda.time.Interval interval48 = new org.joda.time.Interval(readableDuration42, (org.joda.time.ReadableInstant) dateMidnight45);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean52 = interval48.isBefore((org.joda.time.ReadableInterval) interval51);
        org.joda.time.DateTime dateTime53 = interval48.getEnd();
        org.joda.time.Interval interval56 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone59);
        java.util.Date date61 = dateMidnight60.toDate();
        org.joda.time.DateMidnight.Property property62 = dateMidnight60.dayOfWeek();
        org.joda.time.Interval interval63 = new org.joda.time.Interval(readableDuration57, (org.joda.time.ReadableInstant) dateMidnight60);
        boolean boolean64 = interval56.isAfter((org.joda.time.ReadableInterval) interval63);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((-1L), dateTimeZone66);
        org.joda.time.Interval interval68 = interval56.withStart((org.joda.time.ReadableInstant) dateTime67);
        boolean boolean69 = interval48.overlaps((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Duration duration70 = interval48.toDuration();
        org.joda.time.Interval interval71 = interval41.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration70);
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight25, (org.joda.time.ReadableDuration) duration70);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight6.withDurationAdded((org.joda.time.ReadableDuration) duration70, 36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateMidnight15", (instant8.compareTo(dateMidnight15) == 0) == instant8.equals(dateMidnight15));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfYear();
        org.joda.time.DurationField durationField9 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        int int16 = dateTime15.getSecondOfMinute();
        org.joda.time.DateTime.Property property17 = dateTime15.dayOfYear();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime19 = property17.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        boolean boolean24 = dateTimeZone22.isStandardOffset(252L);
        long long26 = dateTimeZone22.nextTransition((long) 26);
        org.joda.time.DateTime dateTime27 = dateTime19.withZone(dateTimeZone22);
        org.joda.time.Chronology chronology28 = chronology5.withZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime27", (dateTime19.compareTo(dateTime27) == 0) == dateTime19.equals(dateTime27));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        int int6 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime8 = dateTime4.minusYears(9);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime4.minusMinutes(2000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant9", (dateTime4.compareTo(instant9) == 0) == dateTime4.equals(instant9));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.plus((-1L));
        org.joda.time.Chronology chronology8 = dateMidnight7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.centuries();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(70L, chronology8);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(23, (int) (short) 10, chronology8);
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight13.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minus((long) (-1));
        org.joda.time.Chronology chronology21 = dateMidnight20.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.LocalTime localTime23 = timeOfDay22.toLocalTime();
        java.lang.String str24 = timeOfDay22.toString();
        org.joda.time.TimeOfDay.Property property25 = timeOfDay22.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay27 = property25.addNoWrapToCopy(1970);
        int int28 = property25.getMaximumValue();
        org.joda.time.TimeOfDay timeOfDay29 = property25.withMaximumValue();
        int int30 = property25.get();
        java.util.Locale locale31 = null;
        java.lang.String str32 = property25.getAsShortText(locale31);
        boolean boolean33 = dateMidnight13.equals((java.lang.Object) property25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and dateMidnight18", (dateMidnight17.compareTo(dateMidnight18) == 0) == dateMidnight17.equals(dateMidnight18));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTime.Property property6 = dateTime4.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property6.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        boolean boolean13 = dateTimeZone11.isStandardOffset(252L);
        long long15 = dateTimeZone11.nextTransition((long) 26);
        org.joda.time.DateTime dateTime16 = dateTime8.withZone(dateTimeZone11);
        int int18 = dateTimeZone11.getOffset(50L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime16", (dateTime8.compareTo(dateTime16) == 0) == dateTime8.equals(dateTime16));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getFirstDayOfWeek();
        int int2 = calendar0.getWeekYear();
        java.lang.String str3 = calendar0.getCalendarType();
        calendar0.setTimeInMillis((long) 17);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.plus(readableDuration8);
        int int10 = dateTime7.getWeekyear();
        org.joda.time.DateTime dateTime12 = dateTime7.minusSeconds((int) (short) -1);
        org.joda.time.DateTime dateTime15 = dateTime12.withDurationAdded((long) 34, 33330867);
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone18);
        java.util.Date date20 = dateMidnight19.toDate();
        org.joda.time.DateMidnight.Property property21 = dateMidnight19.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight22 = property21.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        org.joda.time.DateMidnight dateMidnight24 = property21.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight25 = property21.withMaximumValue();
        boolean boolean26 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime12.getZone();
        boolean boolean28 = calendar0.before((java.lang.Object) dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant16", (dateTime12.compareTo(instant16) == 0) == dateTime12.equals(instant16));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTime.Property property6 = dateTime4.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.withMinimumValue();
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plus((-1L));
        org.joda.time.Chronology chronology14 = dateMidnight13.getChronology();
        boolean boolean16 = dateMidnight13.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property17 = dateMidnight13.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight13.minusWeeks(17);
        int int20 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone22);
        java.util.Date date24 = dateMidnight23.toDate();
        org.joda.time.YearMonthDay yearMonthDay25 = dateMidnight23.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.plus((-1L));
        org.joda.time.Chronology chronology31 = dateMidnight30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfMinute();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology31);
        org.joda.time.DurationField durationField34 = chronology31.days();
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay25.withChronologyRetainFields(chronology31);
        org.joda.time.Chronology chronology36 = yearMonthDay35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.minutes();
        org.joda.time.DateTime dateTime38 = dateTime7.withChronology(chronology36);
        org.joda.time.DurationField durationField39 = chronology36.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime38", (dateTime7.compareTo(dateTime38) == 0) == dateTime7.equals(dateTime38));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        long long10 = chronology5.add((long) 292278994, (long) 4, 12);
        org.joda.time.DurationField durationField11 = chronology5.years();
        org.joda.time.DurationField durationField12 = chronology5.weekyears();
        org.joda.time.DurationField durationField13 = chronology5.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField13", (durationField11.compareTo(durationField13) == 0) == durationField11.equals(durationField13));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfMinute();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField9 = localDate7.getField(1);
        org.joda.time.LocalDate localDate11 = localDate7.withDayOfYear(2);
        org.joda.time.LocalDate localDate13 = localDate7.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime dateTime14 = localDate13.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear(54);
        org.joda.time.DateTime dateTime18 = dateTime17.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant15", (dateTime14.compareTo(instant15) == 0) == dateTime14.equals(instant15));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        int[] intArray5 = yearMonthDay4.getValues();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay4.withPeriodAdded(readablePeriod6, 22);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(13);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        java.util.Date date15 = dateMidnight14.toDate();
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration11, (org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean21 = interval17.isBefore((org.joda.time.ReadableInterval) interval20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = interval17.toPeriod(periodType22);
        int int25 = period23.getValue((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay8.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.plus((-1L));
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight29.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime38 = dateTime37.toDateTimeISO();
        int int39 = dateTime38.getSecondOfMinute();
        org.joda.time.DateTime.Property property40 = dateTime38.dayOfYear();
        boolean boolean41 = dateMidnight29.isAfter((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime43 = dateTime38.plusSeconds((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.plus((-1L));
        org.joda.time.Chronology chronology49 = dateMidnight48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.secondOfMinute();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology49);
        org.joda.time.DateTimeField dateTimeField53 = localDate51.getField(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = dateTimeField53.getType();
        java.lang.String str55 = dateTimeFieldType54.toString();
        int int56 = dateTime43.get(dateTimeFieldType54);
        boolean boolean57 = yearMonthDay8.isSupported(dateTimeFieldType54);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean59 = yearMonthDay8.isSupported(dateTimeFieldType58);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.plus((-1L));
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight62.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(dateTimeZone67);
        org.joda.time.DateTime dateTime70 = dateTime68.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime71 = dateTime70.toDateTimeISO();
        int int72 = dateTime71.getSecondOfMinute();
        org.joda.time.DateTime.Property property73 = dateTime71.dayOfYear();
        boolean boolean74 = dateMidnight62.isAfter((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime.Property property75 = dateTime71.era();
        org.joda.time.LocalDate localDate76 = dateTime71.toLocalDate();
        org.joda.time.DateTime dateTime77 = dateTime71.toDateTime();
        java.util.TimeZone timeZone79 = null;
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forTimeZone(timeZone79);
        java.lang.String str82 = dateTimeZone80.getNameKey((long) (-1));
        java.lang.String str84 = dateTimeZone80.getNameKey((long) (short) 0);
        org.joda.time.LocalDate localDate85 = new org.joda.time.LocalDate(70L, dateTimeZone80);
        org.joda.time.MutableDateTime mutableDateTime86 = dateTime71.toMutableDateTime(dateTimeZone80);
        org.joda.time.DateMidnight dateMidnight87 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight89 = dateMidnight87.minus((long) (-1));
        org.joda.time.Chronology chronology90 = dateMidnight89.getChronology();
        org.joda.time.DateTimeField dateTimeField91 = chronology90.clockhourOfHalfday();
        org.joda.time.Chronology chronology92 = chronology90.withUTC();
        org.joda.time.DateTime dateTime93 = dateTime71.withChronology(chronology92);
        boolean boolean94 = dateTimeFieldType58.isSupported(chronology92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and dateTime93", (dateTime37.compareTo(dateTime93) == 0) == dateTime37.equals(dateTime93));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        int int7 = dateMidnight6.getCenturyOfEra();
        org.joda.time.Instant instant8 = dateMidnight6.toInstant();
        int int9 = dateMidnight6.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight6.minusDays(999);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.withDurationAdded((-1672531199986L), 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight6 and instant8", (dateMidnight6.compareTo(instant8) == 0) == dateMidnight6.equals(instant8));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 12);
        org.joda.time.LocalTime localTime2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate1.toDateTime(localTime2, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate1.withYearOfEra(12);
        int[] intArray7 = localDate1.getValues();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(22, 11, 7, 7, (int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.plus(readableDuration17);
        org.joda.time.DateTime dateTime20 = dateTime16.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTime dateTime22 = dateTime16.minusDays((int) (byte) 10);
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableDuration14, (org.joda.time.ReadableInstant) dateTime22);
        boolean boolean24 = dateTime22.isEqualNow();
        org.joda.time.DateTime dateTime26 = dateTime22.withWeekOfWeekyear(11);
        boolean boolean27 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.plus((-1L));
        org.joda.time.Chronology chronology33 = dateMidnight32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfMinute();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.Interval interval37 = localDate35.toInterval(dateTimeZone36);
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.Period period39 = interval37.toPeriod();
        org.joda.time.DateTime dateTime41 = dateTime13.withPeriodAdded((org.joda.time.ReadablePeriod) period39, (int) (byte) 100);
        org.joda.time.LocalDate localDate43 = localDate1.withPeriodAdded((org.joda.time.ReadablePeriod) period39, 212);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone45);
        java.util.Date date47 = dateMidnight46.toDate();
        org.joda.time.YearMonthDay yearMonthDay48 = dateMidnight46.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property53 = dateTime50.monthOfYear();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime50.minus(readableDuration54);
        org.joda.time.DateMidnight dateMidnight56 = dateTime55.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone58);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.plus((-1L));
        org.joda.time.Chronology chronology62 = dateMidnight61.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.secondOfMinute();
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate(chronology62);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.Interval interval66 = localDate64.toInterval(dateTimeZone65);
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((java.lang.Object) dateTime55, chronology67);
        org.joda.time.YearMonthDay yearMonthDay69 = yearMonthDay48.withChronologyRetainFields(chronology67);
        org.joda.time.DurationField durationField70 = chronology67.weeks();
        org.joda.time.DurationField durationField71 = chronology67.eras();
        boolean boolean72 = localDate1.equals((java.lang.Object) chronology67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField70 and durationField71", Math.signum(durationField70.compareTo(durationField71)) == -Math.signum(durationField71.compareTo(durationField70)));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plus((-1L));
        org.joda.time.Chronology chronology12 = dateMidnight11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfMinute();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology12);
        boolean boolean15 = yearMonthDay6.isEqual((org.joda.time.ReadablePartial) localDate14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey((long) (-1));
        long long21 = dateTimeZone17.convertUTCToLocal((long) 5);
        org.joda.time.DateMidnight dateMidnight22 = localDate14.toDateMidnight(dateTimeZone17);
        org.joda.time.LocalDate localDate24 = localDate14.plusDays(53);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.plus((-1L));
        org.joda.time.Chronology chronology30 = dateMidnight29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.hours();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.dayOfYear();
        org.joda.time.DurationField durationField34 = chronology30.minutes();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((java.lang.Object) localDate14, chronology30);
        org.joda.time.DateTimeField dateTimeField36 = chronology30.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology30.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField38 = chronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = chronology30.monthOfYear();
        org.joda.time.DurationField durationField40 = chronology30.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField31, and durationField34", !(durationField40.compareTo(durationField31) == 0) || (Math.signum(durationField40.compareTo(durationField34)) == Math.signum(durationField31.compareTo(durationField34))));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfMinute();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate11 = localDate7.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.LocalDate localDate17 = localDate11.withWeekyear(19);
        org.joda.time.LocalTime localTime18 = null;
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.String str22 = dateTimeZone20.getNameKey((long) (-1));
        org.joda.time.DateTime dateTime23 = localDate11.toDateTime(localTime18, dateTimeZone20);
        int int24 = dateTime23.getYear();
        org.joda.time.DateTime.Property property25 = dateTime23.secondOfDay();
        org.joda.time.DateTime dateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTime dateTime27 = dateTime26.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str29 = dateTimeFieldType28.getName();
        boolean boolean30 = dateTime27.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((-1L), dateTimeZone32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.plus(readableDuration34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.plus(readableDuration38);
        int int40 = dateTime33.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime42 = dateTime33.minusDays(11);
        org.joda.time.DateTime.Property property43 = dateTime42.monthOfYear();
        org.joda.time.DateMidnight dateMidnight44 = dateTime42.toDateMidnight();
        org.joda.time.LocalDate localDate45 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.plus((-1L));
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight48.plusWeeks((int) ' ');
        boolean boolean54 = dateMidnight52.equals((java.lang.Object) 100.0f);
        org.joda.time.DateTime dateTime55 = localDate45.toDateTime((org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.Chronology chronology56 = localDate45.getChronology();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((java.lang.Object) dateTime42, chronology56);
        boolean boolean58 = dateTimeFieldType28.isSupported(chronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime57", (dateTime42.compareTo(dateTime57) == 0) == dateTime42.equals(dateTime57));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((-1L));
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.secondOfMinute();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DurationField durationField9 = chronology6.days();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 11, chronology6);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.year();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology6);
        java.util.GregorianCalendar gregorianCalendar13 = dateTime12.toGregorianCalendar();
        org.joda.time.DateTime dateTime15 = dateTime12.minusDays(0);
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone18);
        java.util.Date date20 = dateMidnight19.toDate();
        org.joda.time.YearMonthDay yearMonthDay21 = dateMidnight19.toYearMonthDay();
        int[] intArray22 = yearMonthDay21.getValues();
        org.joda.time.LocalDate localDate23 = yearMonthDay21.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime26 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime15.withZoneRetainFields(dateTimeZone25);
        java.lang.String str28 = dateTimeZone25.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime27", (dateTime12.compareTo(dateTime27) == 0) == dateTime12.equals(dateTime27));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 16);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(22);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis(14400001L);
        org.joda.time.DateTime dateTime10 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        java.util.Date date15 = dateMidnight14.toDate();
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration11, (org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean21 = interval17.isBefore((org.joda.time.ReadableInterval) interval20);
        org.joda.time.DateTime dateTime22 = interval17.getEnd();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone28);
        java.util.Date date30 = dateMidnight29.toDate();
        org.joda.time.DateMidnight.Property property31 = dateMidnight29.dayOfWeek();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29);
        boolean boolean33 = interval25.isAfter((org.joda.time.ReadableInterval) interval32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((-1L), dateTimeZone35);
        org.joda.time.Interval interval37 = interval25.withStart((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean38 = interval17.overlaps((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.Interval interval40 = interval17.withPeriodAfterStart(readablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.plus((-1L));
        org.joda.time.Chronology chronology46 = dateMidnight45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.secondOfMinute();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.LocalDate localDate50 = localDate48.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate52 = localDate48.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate54 = localDate48.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property55 = localDate48.centuryOfEra();
        org.joda.time.LocalDate localDate56 = property55.roundCeilingCopy();
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.eras();
        org.joda.time.Interval interval59 = interval40.withChronology(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime10.toDateTime(chronology57);
        org.joda.time.DateTimeField dateTimeField61 = chronology57.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime60", (dateTime9.compareTo(dateTime60) == 0) == dateTime9.equals(dateTime60));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.DateMidnight.Property property4 = dateMidnight2.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate6 = dateMidnight5.toLocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plus((-1L));
        org.joda.time.Chronology chronology14 = dateMidnight13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate20 = localDate16.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str23 = dateTimeZone22.toString();
        org.joda.time.DateTime dateTime24 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.LocalDate localDate26 = localDate20.withWeekyear(19);
        org.joda.time.LocalTime localTime27 = null;
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str31 = dateTimeZone29.getNameKey((long) (-1));
        org.joda.time.DateTime dateTime32 = localDate20.toDateTime(localTime27, dateTimeZone29);
        java.lang.String str33 = dateTimeZone29.getID();
        org.joda.time.DateTime dateTime34 = localDate8.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime39 = dateTime38.toDateTimeISO();
        int int40 = dateTime39.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.toDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime39.withMinuteOfHour(8);
        org.joda.time.DateTime dateTime46 = dateTime39.withYearOfCentury(34);
        org.joda.time.DateTime.Property property47 = dateTime46.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.plus((-1L));
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight50.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime59 = dateTime58.toDateTimeISO();
        int int60 = dateTime59.getSecondOfMinute();
        org.joda.time.DateTime.Property property61 = dateTime59.dayOfYear();
        boolean boolean62 = dateMidnight50.isAfter((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime.Property property63 = dateTime59.era();
        org.joda.time.Interval interval66 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone69);
        java.util.Date date71 = dateMidnight70.toDate();
        org.joda.time.DateMidnight.Property property72 = dateMidnight70.dayOfWeek();
        org.joda.time.Interval interval73 = new org.joda.time.Interval(readableDuration67, (org.joda.time.ReadableInstant) dateMidnight70);
        boolean boolean74 = interval66.isAfter((org.joda.time.ReadableInterval) interval73);
        org.joda.time.Duration duration75 = interval73.toDuration();
        org.joda.time.DateTime dateTime77 = dateTime59.withDurationAdded((org.joda.time.ReadableDuration) duration75, 52);
        org.joda.time.DateTime dateTime79 = dateTime46.withDurationAdded((org.joda.time.ReadableDuration) duration75, 6);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableDuration) duration75);
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.DateMidnight dateMidnight83 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone82);
        java.util.Date date84 = dateMidnight83.toDate();
        org.joda.time.DateMidnight.Property property85 = dateMidnight83.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight86 = property85.roundFloorCopy();
        boolean boolean87 = dateMidnight86.isBeforeNow();
        boolean boolean88 = dateTime34.isAfter((org.joda.time.ReadableInstant) dateMidnight86);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime90 = dateMidnight86.toDateTime(dateTimeZone89);
        org.joda.time.DateMidnight dateMidnight92 = dateMidnight86.plusDays(34585);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime90", (dateMidnight2.compareTo(dateTime90) == 0) == dateMidnight2.equals(dateTime90));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.monthOfYear();
        org.joda.time.DateTime dateTime5 = property4.withMaximumValue();
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(21);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        int int9 = property8.getMinimumValueOverall();
        org.joda.time.DateTime dateTime10 = property8.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plus((-1L));
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight13.plusWeeks((int) ' ');
        boolean boolean19 = dateMidnight17.equals((java.lang.Object) 100.0f);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight17.minus(readableDuration20);
        int int22 = dateMidnight17.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minus((long) (-1));
        org.joda.time.Chronology chronology26 = dateMidnight25.getChronology();
        int int27 = dateMidnight25.getYearOfEra();
        boolean boolean28 = dateMidnight17.isEqual((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.joda.time.DateTime dateTime31 = dateMidnight25.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime10.withZone(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight23 and dateTime31", (dateMidnight23.compareTo(dateTime31) == 0) == dateMidnight23.equals(dateTime31));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfYear();
        org.joda.time.DurationField durationField9 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.millisOfSecond();
        org.joda.time.DurationField durationField11 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField6, and durationField9", !(durationField11.compareTo(durationField6) == 0) || (Math.signum(durationField11.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfMinute();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField9 = localDate7.getField(1);
        org.joda.time.LocalDate localDate11 = localDate7.withDayOfYear(2);
        org.joda.time.LocalDate localDate13 = localDate7.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime dateTime14 = localDate13.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear(54);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes(34654870);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant15", (dateTime14.compareTo(instant15) == 0) == dateTime14.equals(instant15));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime5.toDateTimeISO();
        int int7 = dateTime6.getSecondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.dayOfYear();
        org.joda.time.DateTime dateTime9 = property8.withMinimumValue();
        org.joda.time.DateTime dateTime10 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plus((-1L));
        org.joda.time.Chronology chronology16 = dateMidnight15.getChronology();
        boolean boolean18 = dateMidnight15.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property19 = dateMidnight15.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight15.minusWeeks(17);
        int int22 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone24);
        java.util.Date date26 = dateMidnight25.toDate();
        org.joda.time.YearMonthDay yearMonthDay27 = dateMidnight25.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.plus((-1L));
        org.joda.time.Chronology chronology33 = dateMidnight32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfMinute();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology33);
        org.joda.time.DurationField durationField36 = chronology33.days();
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay27.withChronologyRetainFields(chronology33);
        org.joda.time.Chronology chronology38 = yearMonthDay37.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.minutes();
        org.joda.time.DateTime dateTime40 = dateTime9.withChronology(chronology38);
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType0.getField(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime40", (dateTime9.compareTo(dateTime40) == 0) == dateTime9.equals(dateTime40));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTime dateTime6 = dateTime2.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTime dateTime8 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.Interval interval9 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime.Property property10 = dateTime8.weekyear();
        org.joda.time.DateTime.Property property11 = dateTime8.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plus((-1L));
        org.joda.time.Chronology chronology17 = dateMidnight16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.secondOfMinute();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate23 = localDate19.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str26 = dateTimeZone25.toString();
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.LocalDate localDate29 = localDate23.withWeekyear(19);
        org.joda.time.LocalTime localTime30 = null;
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.lang.String str34 = dateTimeZone32.getNameKey((long) (-1));
        org.joda.time.DateTime dateTime35 = localDate23.toDateTime(localTime30, dateTimeZone32);
        org.joda.time.LocalDate.Property property36 = localDate23.weekyear();
        org.joda.time.LocalDate.Property property37 = localDate23.dayOfWeek();
        org.joda.time.LocalDate localDate38 = property37.roundFloorCopy();
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.years();
        org.joda.time.DateTime dateTime41 = dateTime8.toDateTime(chronology39);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone43);
        java.util.Date date45 = dateMidnight44.toDate();
        org.joda.time.YearMonthDay yearMonthDay46 = dateMidnight44.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay46.plusDays((int) (short) -1);
        org.joda.time.DateTime dateTime49 = yearMonthDay46.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.plus((-1L));
        org.joda.time.Chronology chronology55 = dateMidnight54.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.secondOfMinute();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(chronology55);
        org.joda.time.LocalDate localDate59 = localDate57.withYearOfEra((int) (byte) 10);
        int int60 = localDate57.getYearOfCentury();
        org.joda.time.LocalTime localTime61 = null;
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone63);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.plus((-1L));
        org.joda.time.Chronology chronology67 = dateMidnight66.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.secondOfMinute();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate(chronology67);
        org.joda.time.LocalDate localDate71 = localDate69.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate73 = localDate69.plusYears((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateMidnight dateMidnight76 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone75);
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight76.plus((-1L));
        org.joda.time.Chronology chronology79 = dateMidnight78.getChronology();
        org.joda.time.DateTimeField dateTimeField80 = chronology79.secondOfMinute();
        org.joda.time.LocalDate localDate81 = new org.joda.time.LocalDate(chronology79);
        org.joda.time.LocalDate localDate83 = localDate81.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate85 = localDate81.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone86 = null;
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forTimeZone(timeZone86);
        java.lang.String str88 = dateTimeZone87.toString();
        org.joda.time.DateTime dateTime89 = localDate85.toDateTimeAtCurrentTime(dateTimeZone87);
        boolean boolean90 = dateTimeZone87.isFixed();
        org.joda.time.DateTime dateTime91 = localDate73.toDateTimeAtCurrentTime(dateTimeZone87);
        org.joda.time.DateTime dateTime92 = localDate57.toDateTime(localTime61, dateTimeZone87);
        java.util.TimeZone timeZone93 = dateTimeZone87.toTimeZone();
        org.joda.time.DateTime dateTime94 = yearMonthDay46.toDateTimeAtMidnight(dateTimeZone87);
        org.joda.time.DateTime.Property property95 = dateTime94.weekOfWeekyear();
        int int96 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime94);
        org.joda.time.DateTime dateTime98 = dateTime94.plus(100L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime41", (dateTime8.compareTo(dateTime41) == 0) == dateTime8.equals(dateTime41));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.monthOfYear();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.minus(readableDuration5);
        org.joda.time.DateTime.Property property7 = dateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime1.withField(dateTimeFieldType8, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime10.withSecondOfMinute(15);
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.DateTime dateTime17 = dateTime14.toDateTime(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime14.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime17", (dateTime14.compareTo(dateTime17) == 0) == dateTime14.equals(dateTime17));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.monthOfYear();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.minus(readableDuration5);
        org.joda.time.DateMidnight dateMidnight7 = dateTime6.toDateMidnight();
        org.joda.time.LocalTime localTime8 = dateTime6.toLocalTime();
        org.joda.time.DateTime dateTime10 = dateTime6.plusSeconds((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plus((-1L));
        org.joda.time.Chronology chronology17 = dateMidnight16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.secondOfMinute();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.DurationField durationField20 = chronology17.days();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 11, chronology17);
        org.joda.time.DateTimeField dateTimeField22 = chronology17.year();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology17);
        java.util.GregorianCalendar gregorianCalendar24 = dateTime23.toGregorianCalendar();
        org.joda.time.DateTime dateTime26 = dateTime23.minusDays(0);
        org.joda.time.DateTime.Property property27 = dateTime26.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone29);
        java.util.Date date31 = dateMidnight30.toDate();
        org.joda.time.YearMonthDay yearMonthDay32 = dateMidnight30.toYearMonthDay();
        int[] intArray33 = yearMonthDay32.getValues();
        org.joda.time.LocalDate localDate34 = yearMonthDay32.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = localDate34.toDateTimeAtCurrentTime(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = dateTime26.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime6.toDateTime(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime38", (dateTime6.compareTo(dateTime38) == 0) == dateTime6.equals(dateTime38));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.minus((long) (-1));
        org.joda.time.Chronology chronology3 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DurationField durationField6 = chronology3.years();
        org.joda.time.DurationField durationField7 = chronology3.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField6", (durationField4.compareTo(durationField6) == 0) == durationField4.equals(durationField6));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfMinute();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Interval interval9 = localDate7.toInterval(dateTimeZone8);
        int int10 = localDate7.getYearOfEra();
        int int11 = localDate7.size();
        org.joda.time.Chronology chronology12 = localDate7.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.plus((-1L));
        org.joda.time.Chronology chronology22 = dateMidnight21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.secondOfMinute();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.LocalDate localDate26 = localDate24.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate28 = localDate24.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.lang.String str31 = dateTimeZone30.toString();
        org.joda.time.DateTime dateTime32 = localDate28.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.Interval interval33 = new org.joda.time.Interval(18746052L, 3283200000L, dateTimeZone30);
        java.lang.String str35 = dateTimeZone30.getNameKey((long) 2022);
        org.joda.time.Chronology chronology36 = chronology12.withZone(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime32", (dateTime14.compareTo(dateTime32) == 0) == dateTime14.equals(dateTime32));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.monthOfYear();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.minus(readableDuration5);
        org.joda.time.DateTime.Property property7 = dateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime1.withField(dateTimeFieldType8, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone12);
        java.util.Date date14 = dateMidnight13.toDate();
        org.joda.time.YearMonthDay yearMonthDay15 = dateMidnight13.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property20 = dateTime17.monthOfYear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.minus(readableDuration21);
        org.joda.time.DateMidnight dateMidnight23 = dateTime22.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.plus((-1L));
        org.joda.time.Chronology chronology29 = dateMidnight28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.secondOfMinute();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.Interval interval33 = localDate31.toInterval(dateTimeZone32);
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) dateTime22, chronology34);
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay15.withChronologyRetainFields(chronology34);
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType8.getField(chronology34);
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology34);
        org.joda.time.DateTimeField dateTimeField39 = chronology34.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.plus((-1L));
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight42.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight42.minusMonths((int) (short) 1);
        org.joda.time.DateMidnight.Property property49 = dateMidnight48.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.plus((-1L));
        org.joda.time.Chronology chronology55 = dateMidnight54.getChronology();
        boolean boolean57 = dateMidnight54.isBefore((long) ' ');
        org.joda.time.LocalDate localDate58 = dateMidnight54.toLocalDate();
        int int59 = property49.getDifference((org.joda.time.ReadableInstant) dateMidnight54);
        org.joda.time.Instant instant60 = dateMidnight54.toInstant();
        org.joda.time.DateTimeZone dateTimeZone61 = instant60.getZone();
        org.joda.time.Chronology chronology62 = chronology34.withZone(dateTimeZone61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight28 and instant60", (dateMidnight28.compareTo(instant60) == 0) == dateMidnight28.equals(instant60));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 12);
        org.joda.time.LocalTime localTime2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate1.toDateTime(localTime2, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate1.withYearOfEra(12);
        int[] intArray7 = localDate1.getValues();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) localDate1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plus((-1L));
        org.joda.time.Chronology chronology14 = dateMidnight13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate20 = localDate16.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str23 = dateTimeZone22.toString();
        org.joda.time.DateTime dateTime24 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        long long27 = dateTimeZone22.adjustOffset((-1659458699000L), true);
        org.joda.time.DateTime dateTime28 = localDate8.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.plus((-1L));
        org.joda.time.Chronology chronology34 = dateMidnight33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.secondOfMinute();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = localDate36.getField(1);
        org.joda.time.LocalDate localDate40 = localDate36.withDayOfYear(2);
        org.joda.time.LocalDate localDate42 = localDate36.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime dateTime43 = localDate42.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant44 = dateTime43.toInstant();
        int int45 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) instant44);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone22.getShortName(20L, locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant44", (dateTime43.compareTo(instant44) == 0) == dateTime43.equals(instant44));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.monthOfYear();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.minus(readableDuration5);
        org.joda.time.DateTime.Property property7 = dateTime1.dayOfMonth();
        org.joda.time.DateTime.Property property8 = dateTime1.centuryOfEra();
        org.joda.time.DateTime.Property property9 = dateTime1.millisOfSecond();
        org.joda.time.Instant instant10 = dateTime1.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime1.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant10", (dateTime11.compareTo(instant10) == 0) == dateTime11.equals(instant10));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plus((-1L));
        org.joda.time.Chronology chronology12 = dateMidnight11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfMinute();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology12);
        boolean boolean15 = yearMonthDay6.isEqual((org.joda.time.ReadablePartial) localDate14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey((long) (-1));
        long long21 = dateTimeZone17.convertUTCToLocal((long) 5);
        org.joda.time.DateMidnight dateMidnight22 = localDate14.toDateMidnight(dateTimeZone17);
        org.joda.time.LocalDate localDate24 = localDate14.plusDays(53);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.plus((-1L));
        org.joda.time.Chronology chronology30 = dateMidnight29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.hours();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.dayOfYear();
        org.joda.time.DurationField durationField34 = chronology30.minutes();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((java.lang.Object) localDate14, chronology30);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone37);
        java.util.Date date39 = dateMidnight38.toDate();
        org.joda.time.YearMonthDay yearMonthDay40 = dateMidnight38.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.plus((-1L));
        org.joda.time.Chronology chronology46 = dateMidnight45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.secondOfMinute();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.DurationField durationField49 = chronology46.days();
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay40.withChronologyRetainFields(chronology46);
        org.joda.time.Chronology chronology51 = yearMonthDay50.getChronology();
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.minus((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone55 = dateMidnight52.getZone();
        org.joda.time.DateMidnight dateMidnight56 = yearMonthDay50.toDateMidnight(dateTimeZone55);
        java.util.Set<java.lang.String> strSet57 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean58 = dateTimeZone55.equals((java.lang.Object) strSet57);
        org.joda.time.DateTime dateTime59 = yearMonthDay35.toDateTimeAtCurrentTime(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.plus((-1L));
        org.joda.time.Chronology chronology65 = dateMidnight64.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.secondOfMinute();
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate(chronology65);
        org.joda.time.DateTimeField dateTimeField69 = localDate67.getField(1);
        org.joda.time.LocalDate localDate71 = localDate67.withDayOfYear(2);
        org.joda.time.LocalDate localDate73 = localDate67.minusWeeks((int) (byte) 1);
        org.joda.time.DateTime dateTime74 = localDate73.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant75 = dateTime74.toInstant();
        org.joda.time.DateTime dateTime77 = dateTime74.withYear(54);
        org.joda.time.DateTime dateTime78 = yearMonthDay35.toDateTime((org.joda.time.ReadableInstant) dateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime74 and instant75", (dateTime74.compareTo(instant75) == 0) == dateTime74.equals(instant75));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minus((long) (-1));
        org.joda.time.Chronology chronology13 = dateMidnight12.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minus(readablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay18.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone27);
        java.util.Date date29 = dateMidnight28.toDate();
        org.joda.time.DateMidnight.Property property30 = dateMidnight28.dayOfWeek();
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableDuration25, (org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean35 = interval31.isBefore((org.joda.time.ReadableInterval) interval34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = interval31.toPeriod(periodType36);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay24.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.DateTime dateTime40 = dateTime2.withPeriodAdded((org.joda.time.ReadablePeriod) period37, 19);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minus((long) (-1));
        org.joda.time.Chronology chronology44 = dateMidnight43.getChronology();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(chronology44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.minus(readablePeriod46);
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay47.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.minusMinutes(1970);
        org.joda.time.Chronology chronology52 = timeOfDay49.getChronology();
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minus((long) (-1));
        org.joda.time.Chronology chronology56 = dateMidnight55.getChronology();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(chronology56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay57.minus(readablePeriod58);
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay59.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay61.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay61.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay65.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone70);
        java.util.Date date72 = dateMidnight71.toDate();
        org.joda.time.DateMidnight.Property property73 = dateMidnight71.dayOfWeek();
        org.joda.time.Interval interval74 = new org.joda.time.Interval(readableDuration68, (org.joda.time.ReadableInstant) dateMidnight71);
        org.joda.time.Interval interval77 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean78 = interval74.isBefore((org.joda.time.ReadableInterval) interval77);
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.Period period80 = interval74.toPeriod(periodType79);
        org.joda.time.TimeOfDay timeOfDay81 = timeOfDay67.minus((org.joda.time.ReadablePeriod) period80);
        org.joda.time.PeriodType periodType82 = period80.getPeriodType();
        int[] intArray85 = chronology52.get((org.joda.time.ReadablePeriod) period80, (long) (-1), (long) 24);
        org.joda.time.DateTimeField dateTimeField86 = chronology52.yearOfEra();
        org.joda.time.DateTime dateTime87 = dateTime2.toDateTime(chronology52);
        org.joda.time.DateTimeField dateTimeField88 = chronology52.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime87", (dateTime2.compareTo(dateTime87) == 0) == dateTime2.equals(dateTime87));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.DateMidnight.Property property4 = dateMidnight2.dayOfWeek();
        java.lang.String str5 = property4.getAsText();
        int int6 = property4.getMinimumValue();
        java.lang.String str7 = property4.toString();
        org.joda.time.DateMidnight dateMidnight8 = property4.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight10 = property4.addToCopy(44);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plus((-1L));
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight14.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTimeISO();
        int int24 = dateTime23.getSecondOfMinute();
        org.joda.time.DateTime.Property property25 = dateTime23.dayOfYear();
        boolean boolean26 = dateMidnight14.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime.Property property27 = dateTime23.era();
        org.joda.time.LocalDate localDate28 = dateTime23.toLocalDate();
        org.joda.time.DateTime dateTime29 = dateTime23.toDateTime();
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.lang.String str34 = dateTimeZone32.getNameKey((long) (-1));
        java.lang.String str36 = dateTimeZone32.getNameKey((long) (short) 0);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(70L, dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime23.toMutableDateTime(dateTimeZone32);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minus((long) (-1));
        org.joda.time.Chronology chronology42 = dateMidnight41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.clockhourOfHalfday();
        org.joda.time.Chronology chronology44 = chronology42.withUTC();
        org.joda.time.DateTime dateTime45 = dateTime23.withChronology(chronology44);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight10.withChronology(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime45", (dateTime22.compareTo(dateTime45) == 0) == dateTime22.equals(dateTime45));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property6 = dateTime3.property(dateTimeFieldType5);
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        org.joda.time.DateTime dateTime8 = property6.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plus((-1L));
        org.joda.time.Chronology chronology14 = dateMidnight13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = localDate16.toInterval(dateTimeZone17);
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.Period period20 = interval18.toPeriod();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.weekyears();
        int int22 = period20.get(durationFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime8.minus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant24 = dateTime8.toInstant();
        org.joda.time.DateTime dateTime25 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime27 = dateTime25.minusMonths(314);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant24", (dateTime8.compareTo(instant24) == 0) == dateTime8.equals(instant24));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks(6);
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.DateTime dateTime12 = dateTime9.withDayOfYear(53);
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        org.joda.time.DateTime.Property property14 = dateTime9.dayOfYear();
        int int15 = property14.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant13", (dateTime9.compareTo(instant13) == 0) == dateTime9.equals(instant13));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.util.Date date0 = new java.util.Date();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        java.util.Date date4 = dateMidnight3.toDate();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone6);
        java.util.Date date8 = dateMidnight7.toDate();
        boolean boolean9 = date4.before(date8);
        int int10 = date8.getHours();
        int int11 = date8.getMonth();
        boolean boolean12 = date0.after(date8);
        date0.setYear((int) 'a');
        java.util.Date date20 = new java.util.Date((int) (byte) 100, 32769, 1970, 34, 52);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone22);
        java.util.Date date24 = dateMidnight23.toDate();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone26);
        java.util.Date date28 = dateMidnight27.toDate();
        boolean boolean29 = date24.before(date28);
        int int30 = date24.getDay();
        int int31 = date24.getHours();
        date24.setSeconds((int) '4');
        java.lang.String str34 = date24.toLocaleString();
        int int35 = date24.getYear();
        boolean boolean36 = date20.before(date24);
        boolean boolean37 = date0.after(date24);
        int int38 = date24.getTimezoneOffset();
        int int39 = date24.getSeconds();
        date24.setDate(1200000);
        date24.setYear(37);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.minus((long) (-1));
        org.joda.time.Chronology chronology47 = dateMidnight46.getChronology();
        org.joda.time.DurationField durationField48 = chronology47.weekyears();
        java.lang.String str49 = chronology47.toString();
        org.joda.time.DurationField durationField50 = chronology47.eras();
        boolean boolean51 = date24.equals((java.lang.Object) chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField48 and durationField50", Math.signum(durationField48.compareTo(durationField50)) == -Math.signum(durationField50.compareTo(durationField48)));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plus((-1L));
        org.joda.time.Chronology chronology12 = dateMidnight11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfMinute();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology12);
        boolean boolean15 = yearMonthDay6.isEqual((org.joda.time.ReadablePartial) localDate14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey((long) (-1));
        long long21 = dateTimeZone17.convertUTCToLocal((long) 5);
        org.joda.time.DateMidnight dateMidnight22 = localDate14.toDateMidnight(dateTimeZone17);
        org.joda.time.LocalDate localDate24 = localDate14.plusDays(53);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.plus((-1L));
        org.joda.time.Chronology chronology30 = dateMidnight29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.hours();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.dayOfYear();
        org.joda.time.DurationField durationField34 = chronology30.minutes();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((java.lang.Object) localDate14, chronology30);
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now(chronology30);
        org.joda.time.DateTimeField dateTimeField37 = chronology30.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone39);
        java.util.Date date41 = dateMidnight40.toDate();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight40.minusWeeks(22);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight43, readablePeriod44);
        org.joda.time.Period period46 = interval45.toPeriod();
        int[] intArray48 = chronology30.get((org.joda.time.ReadablePeriod) period46, 75485789217052L);
        org.joda.time.DurationField durationField49 = chronology30.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField31, and durationField34", !(durationField49.compareTo(durationField31) == 0) || (Math.signum(durationField49.compareTo(durationField34)) == Math.signum(durationField31.compareTo(durationField34))));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.monthOfYear();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.minus(readableDuration5);
        org.joda.time.DateTime.Property property7 = dateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime1.withField(dateTimeFieldType8, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime10.withSecondOfMinute(15);
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.DateTime dateTime17 = dateTime14.toDateTime(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime14.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime17", (dateTime14.compareTo(dateTime17) == 0) == dateTime14.equals(dateTime17));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay4.withPeriodAdded(readablePeriod5, 11);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay9 = property8.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.joda.time.YearMonthDay yearMonthDay11 = property8.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay12 = property8.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property8.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((-1L), dateTimeZone15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime19 = dateTime16.withFieldAdded(durationFieldType17, 16);
        org.joda.time.DateTime dateTime21 = dateTime19.withYearOfEra(22);
        org.joda.time.DateTime dateTime23 = dateTime19.withMillis(14400001L);
        org.joda.time.DateTime dateTime24 = dateTime23.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone27);
        java.util.Date date29 = dateMidnight28.toDate();
        org.joda.time.DateMidnight.Property property30 = dateMidnight28.dayOfWeek();
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableDuration25, (org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean35 = interval31.isBefore((org.joda.time.ReadableInterval) interval34);
        org.joda.time.DateTime dateTime36 = interval31.getEnd();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone42);
        java.util.Date date44 = dateMidnight43.toDate();
        org.joda.time.DateMidnight.Property property45 = dateMidnight43.dayOfWeek();
        org.joda.time.Interval interval46 = new org.joda.time.Interval(readableDuration40, (org.joda.time.ReadableInstant) dateMidnight43);
        boolean boolean47 = interval39.isAfter((org.joda.time.ReadableInterval) interval46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((-1L), dateTimeZone49);
        org.joda.time.Interval interval51 = interval39.withStart((org.joda.time.ReadableInstant) dateTime50);
        boolean boolean52 = interval31.overlaps((org.joda.time.ReadableInterval) interval39);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.Interval interval54 = interval31.withPeriodAfterStart(readablePeriod53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight57.plus((-1L));
        org.joda.time.Chronology chronology60 = dateMidnight59.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.secondOfMinute();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(chronology60);
        org.joda.time.LocalDate localDate64 = localDate62.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate66 = localDate62.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate68 = localDate62.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property69 = localDate62.centuryOfEra();
        org.joda.time.LocalDate localDate70 = property69.roundCeilingCopy();
        org.joda.time.Chronology chronology71 = localDate70.getChronology();
        org.joda.time.DurationField durationField72 = chronology71.eras();
        org.joda.time.Interval interval73 = interval54.withChronology(chronology71);
        org.joda.time.DateTime dateTime74 = dateTime24.toDateTime(chronology71);
        org.joda.time.DateTimeField dateTimeField75 = dateTimeFieldType13.getField(chronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime74", (dateTime23.compareTo(dateTime74) == 0) == dateTime23.equals(dateTime74));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks(6);
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.DateTime dateTime12 = dateTime9.withDayOfYear(53);
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        org.joda.time.DateTime.Property property14 = dateTime9.year();
        int int15 = property14.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant13", (dateTime9.compareTo(instant13) == 0) == dateTime9.equals(instant13));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 16);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(22);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis(14400001L);
        org.joda.time.DateTime dateTime10 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        java.util.Date date15 = dateMidnight14.toDate();
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration11, (org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean21 = interval17.isBefore((org.joda.time.ReadableInterval) interval20);
        org.joda.time.DateTime dateTime22 = interval17.getEnd();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone28);
        java.util.Date date30 = dateMidnight29.toDate();
        org.joda.time.DateMidnight.Property property31 = dateMidnight29.dayOfWeek();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29);
        boolean boolean33 = interval25.isAfter((org.joda.time.ReadableInterval) interval32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((-1L), dateTimeZone35);
        org.joda.time.Interval interval37 = interval25.withStart((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean38 = interval17.overlaps((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.Interval interval40 = interval17.withPeriodAfterStart(readablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.plus((-1L));
        org.joda.time.Chronology chronology46 = dateMidnight45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.secondOfMinute();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.LocalDate localDate50 = localDate48.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate52 = localDate48.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate54 = localDate48.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property55 = localDate48.centuryOfEra();
        org.joda.time.LocalDate localDate56 = property55.roundCeilingCopy();
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.eras();
        org.joda.time.Interval interval59 = interval40.withChronology(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime10.toDateTime(chronology57);
        org.joda.time.DateTime.Property property61 = dateTime60.dayOfWeek();
        int int62 = property61.getMaximumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime60", (dateTime9.compareTo(dateTime60) == 0) == dateTime9.equals(dateTime60));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfMinute();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate11 = localDate7.plusYears((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plus((-1L));
        org.joda.time.Chronology chronology17 = dateMidnight16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.secondOfMinute();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate23 = localDate19.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str26 = dateTimeZone25.toString();
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        boolean boolean28 = dateTimeZone25.isFixed();
        org.joda.time.DateTime dateTime29 = localDate11.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.LocalDate localDate31 = localDate11.minusYears((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        boolean boolean34 = localDate31.isSupported(durationFieldType33);
        org.joda.time.format.DateTimePrinter dateTimePrinter35 = null;
        org.joda.time.format.DateTimeParser dateTimeParser36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter35, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter37.withDefaultYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter37.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter37.withPivotYear(38);
        boolean boolean44 = dateTimeFormatter37.isParser();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.plus((-1L));
        org.joda.time.Chronology chronology50 = dateMidnight49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.centuries();
        long long55 = chronology50.add((long) 292278994, (long) 4, 12);
        org.joda.time.DateTimeField dateTimeField56 = chronology50.hourOfDay();
        org.joda.time.Chronology chronology57 = chronology50.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter37.withChronology(chronology57);
        org.joda.time.DurationField durationField59 = durationFieldType33.getField(chronology57);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.plus((-1L));
        org.joda.time.Chronology chronology65 = dateMidnight64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.hours();
        org.joda.time.DurationField durationField67 = chronology65.centuries();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField69 = chronology65.secondOfDay();
        org.joda.time.DurationField durationField70 = durationFieldType33.getField(chronology65);
        org.joda.time.DateTimeField dateTimeField71 = chronology65.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField70", (durationField59.compareTo(durationField70) == 0) == durationField59.equals(durationField70));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = dateTime4.plusHours((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((-1L), dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.plus(readableDuration11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.plus(readableDuration15);
        int int17 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime20 = property18.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTimeISO();
        int int22 = dateTime4.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.Instant instant23 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime25 = dateTime4.withMillis(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant23", (dateTime4.compareTo(instant23) == 0) == dateTime4.equals(instant23));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.minus(2L);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays(57);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime12.monthOfYear();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.minus(readableDuration16);
        org.joda.time.DateTime.Property property18 = dateTime12.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime dateTime21 = dateTime12.withField(dateTimeFieldType19, (int) ' ');
        org.joda.time.DateTime dateTime23 = dateTime21.withYear(32770);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime29 = dateTime27.plusYears(5);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone32);
        java.util.Date date34 = dateMidnight33.toDate();
        org.joda.time.DateMidnight.Property property35 = dateMidnight33.dayOfWeek();
        org.joda.time.Interval interval36 = new org.joda.time.Interval(readableDuration30, (org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean40 = interval36.isBefore((org.joda.time.ReadableInterval) interval39);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = interval36.toPeriod(periodType41);
        org.joda.time.DateTime dateTime43 = dateTime27.minus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.DateTime dateTime44 = dateTime23.minus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.DateTime dateTime45 = dateTime23.toDateTime();
        org.joda.time.Instant instant46 = dateTime45.toInstant();
        boolean boolean47 = dateMidnight9.isBefore((org.joda.time.ReadableInstant) dateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and instant46", (dateTime45.compareTo(instant46) == 0) == dateTime45.equals(instant46));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        int int4 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime6 = dateTime1.minusSeconds((int) (short) -1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) 34, 33330867);
        org.joda.time.Instant instant10 = dateTime6.toInstant();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone12);
        java.util.Date date14 = dateMidnight13.toDate();
        org.joda.time.DateMidnight.Property property15 = dateMidnight13.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight16 = property15.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.DateMidnight dateMidnight18 = property15.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight19 = property15.withMaximumValue();
        boolean boolean20 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.DateTime dateTime21 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime6.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime6", (instant10.compareTo(dateTime6) == 0) == instant10.equals(dateTime6));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone9);
        java.util.Date date11 = dateMidnight10.toDate();
        org.joda.time.YearMonthDay yearMonthDay12 = dateMidnight10.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.plusDays((int) (short) -1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.dayOfWeek();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean25 = interval21.isBefore((org.joda.time.ReadableInterval) interval24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = interval21.toPeriod(periodType26);
        int int29 = period27.getValue((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.DateTimeField dateTimeField39 = localDate37.getField(1);
        long long41 = dateTimeField39.roundHalfCeiling((long) (byte) 10);
        long long43 = dateTimeField39.remainder((long) 'a');
        org.joda.time.DurationField durationField44 = dateTimeField39.getRangeDurationField();
        boolean boolean45 = period27.equals((java.lang.Object) durationField44);
        int int46 = period27.size();
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay14.withPeriodAdded((org.joda.time.ReadablePeriod) period27, 34522);
        org.joda.time.DateTime dateTime50 = dateTime7.withPeriodAdded((org.joda.time.ReadablePeriod) period27, 2022);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime55 = dateTime54.toDateTimeISO();
        int int56 = dateTime55.getSecondOfMinute();
        int int57 = dateTime55.getMonthOfYear();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = dateTime55.toDateTime(chronology58);
        org.joda.time.DateTime dateTime61 = dateTime59.withYearOfEra((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean63 = dateTime59.isSupported(dateTimeFieldType62);
        java.lang.String str64 = dateTimeFieldType62.getName();
        int int65 = dateTime50.get(dateTimeFieldType62);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        boolean boolean70 = dateTimeZone68.isStandardOffset(252L);
        long long72 = dateTimeZone68.nextTransition((long) 26);
        org.joda.time.DateTime dateTime73 = dateTime50.toDateTime(dateTimeZone68);
        java.util.TimeZone timeZone74 = dateTimeZone68.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime73", (dateTime7.compareTo(dateTime73) == 0) == dateTime7.equals(dateTime73));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        java.util.Date date4 = dateMidnight3.toDate();
        org.joda.time.DateMidnight.Property property5 = dateMidnight3.dayOfWeek();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean10 = interval6.isBefore((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DateTime dateTime11 = interval6.getEnd();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.dayOfWeek();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18);
        boolean boolean22 = interval14.isAfter((org.joda.time.ReadableInterval) interval21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((-1L), dateTimeZone24);
        org.joda.time.Interval interval26 = interval14.withStart((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean27 = interval6.overlaps((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.Interval interval29 = interval6.withPeriodAfterStart(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate41 = localDate37.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate43 = localDate37.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property44 = localDate37.centuryOfEra();
        org.joda.time.LocalDate localDate45 = property44.roundCeilingCopy();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.eras();
        org.joda.time.Interval interval48 = interval29.withChronology(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.millisOfDay();
        org.joda.time.DateTimeField dateTimeField51 = chronology46.clockhourOfDay();
        org.joda.time.DurationField durationField52 = chronology46.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField52, and durationField47", !(durationField47.compareTo(durationField52) == 0) || (Math.signum(durationField47.compareTo(durationField47)) == Math.signum(durationField52.compareTo(durationField47))));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((-1L));
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.secondOfMinute();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DurationField durationField9 = chronology6.days();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 11, chronology6);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.year();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology6);
        java.util.GregorianCalendar gregorianCalendar13 = dateTime12.toGregorianCalendar();
        org.joda.time.DateTime dateTime15 = dateTime12.minusDays(0);
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone18);
        java.util.Date date20 = dateMidnight19.toDate();
        org.joda.time.YearMonthDay yearMonthDay21 = dateMidnight19.toYearMonthDay();
        int[] intArray22 = yearMonthDay21.getValues();
        org.joda.time.LocalDate localDate23 = yearMonthDay21.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime26 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime15.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minus((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone31 = dateMidnight28.getZone();
        boolean boolean33 = dateTimeZone31.isStandardOffset(14400001L);
        boolean boolean35 = dateTimeZone31.isStandardOffset((long) 48);
        int int37 = dateTimeZone31.getStandardOffset(1391247375190L);
        long long39 = dateTimeZone25.getMillisKeepLocal(dateTimeZone31, (long) 2922789);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime27", (dateTime12.compareTo(dateTime27) == 0) == dateTime12.equals(dateTime27));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.minus((long) (-1));
        org.joda.time.Chronology chronology3 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DurationField durationField6 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField6", (durationField4.compareTo(durationField6) == 0) == durationField4.equals(durationField6));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        int int4 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime6 = dateTime1.minusSeconds((int) (short) -1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) 34, 33330867);
        int int10 = dateTime6.getYearOfEra();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minus((long) (-1));
        org.joda.time.Chronology chronology14 = dateMidnight13.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minus(readablePeriod16);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.minusMinutes(1970);
        org.joda.time.Chronology chronology22 = timeOfDay19.getChronology();
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minus((long) (-1));
        org.joda.time.Chronology chronology26 = dateMidnight25.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.minus(readablePeriod28);
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay31.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone40);
        java.util.Date date42 = dateMidnight41.toDate();
        org.joda.time.DateMidnight.Property property43 = dateMidnight41.dayOfWeek();
        org.joda.time.Interval interval44 = new org.joda.time.Interval(readableDuration38, (org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.Interval interval47 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean48 = interval44.isBefore((org.joda.time.ReadableInterval) interval47);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = interval44.toPeriod(periodType49);
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay37.minus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.PeriodType periodType52 = period50.getPeriodType();
        int[] intArray55 = chronology22.get((org.joda.time.ReadablePeriod) period50, (long) (-1), (long) 24);
        org.joda.time.DateTimeField dateTimeField56 = chronology22.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField57 = chronology22.millisOfSecond();
        long long61 = chronology22.add((long) 1, (long) 34620, 25);
        org.joda.time.DateTime dateTime62 = dateTime6.withChronology(chronology22);
        org.joda.time.DurationField durationField63 = chronology22.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime62", (dateTime6.compareTo(dateTime62) == 0) == dateTime6.equals(dateTime62));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withWeekOfWeekyear(6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.minusYears(1970);
        org.joda.time.Interval interval12 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone15);
        java.util.Date date17 = dateMidnight16.toDate();
        org.joda.time.DateMidnight.Property property18 = dateMidnight16.dayOfWeek();
        org.joda.time.Interval interval19 = new org.joda.time.Interval(readableDuration13, (org.joda.time.ReadableInstant) dateMidnight16);
        boolean boolean20 = interval12.isAfter((org.joda.time.ReadableInterval) interval19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.Interval interval22 = interval19.withPeriodAfterStart(readablePeriod21);
        boolean boolean23 = dateMidnight4.equals((java.lang.Object) readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.plus((-1L));
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight26.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight26.minusMonths((int) (short) 1);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.centuryOfEra();
        java.util.GregorianCalendar gregorianCalendar34 = dateMidnight32.toGregorianCalendar();
        boolean boolean35 = dateMidnight4.equals((java.lang.Object) dateMidnight32);
        org.joda.time.YearMonthDay yearMonthDay36 = dateMidnight4.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.plusMinutes(32772);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime39.getZone();
        org.joda.time.Interval interval43 = yearMonthDay36.toInterval(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime39", (dateTime1.compareTo(dateTime39) == 0) == dateTime1.equals(dateTime39));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.minus((long) (-1));
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime dateTime9 = dateTime5.withMinuteOfHour(10);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minus((long) (-1));
        org.joda.time.Chronology chronology13 = dateMidnight12.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minus(readablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMinutes(1970);
        org.joda.time.Chronology chronology21 = timeOfDay18.getChronology();
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minus((long) (-1));
        org.joda.time.Chronology chronology25 = dateMidnight24.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minus(readablePeriod27);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay30.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone39);
        java.util.Date date41 = dateMidnight40.toDate();
        org.joda.time.DateMidnight.Property property42 = dateMidnight40.dayOfWeek();
        org.joda.time.Interval interval43 = new org.joda.time.Interval(readableDuration37, (org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean47 = interval43.isBefore((org.joda.time.ReadableInterval) interval46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = interval43.toPeriod(periodType48);
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay36.minus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.PeriodType periodType51 = period49.getPeriodType();
        int[] intArray54 = chronology21.get((org.joda.time.ReadablePeriod) period49, (long) (-1), (long) 24);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadablePeriod) period49);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Instant instant57 = dateMidnight2.toInstant();
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight2.withYearOfCentury(79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and instant57", (dateMidnight2.compareTo(instant57) == 0) == dateMidnight2.equals(instant57));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone9);
        java.util.Date date11 = dateMidnight10.toDate();
        org.joda.time.YearMonthDay yearMonthDay12 = dateMidnight10.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.plusDays((int) (short) -1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.dayOfWeek();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean25 = interval21.isBefore((org.joda.time.ReadableInterval) interval24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = interval21.toPeriod(periodType26);
        int int29 = period27.getValue((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.DateTimeField dateTimeField39 = localDate37.getField(1);
        long long41 = dateTimeField39.roundHalfCeiling((long) (byte) 10);
        long long43 = dateTimeField39.remainder((long) 'a');
        org.joda.time.DurationField durationField44 = dateTimeField39.getRangeDurationField();
        boolean boolean45 = period27.equals((java.lang.Object) durationField44);
        int int46 = period27.size();
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay14.withPeriodAdded((org.joda.time.ReadablePeriod) period27, 34522);
        org.joda.time.DateTime dateTime50 = dateTime7.withPeriodAdded((org.joda.time.ReadablePeriod) period27, 2022);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime55 = dateTime54.toDateTimeISO();
        int int56 = dateTime55.getSecondOfMinute();
        int int57 = dateTime55.getMonthOfYear();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = dateTime55.toDateTime(chronology58);
        org.joda.time.DateTime dateTime61 = dateTime59.withYearOfEra((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean63 = dateTime59.isSupported(dateTimeFieldType62);
        java.lang.String str64 = dateTimeFieldType62.getName();
        int int65 = dateTime50.get(dateTimeFieldType62);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        boolean boolean70 = dateTimeZone68.isStandardOffset(252L);
        long long72 = dateTimeZone68.nextTransition((long) 26);
        org.joda.time.DateTime dateTime73 = dateTime50.toDateTime(dateTimeZone68);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime73", (dateTime7.compareTo(dateTime73) == 0) == dateTime7.equals(dateTime73));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        java.util.Date date4 = dateMidnight3.toDate();
        org.joda.time.DateMidnight.Property property5 = dateMidnight3.dayOfWeek();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean10 = interval6.isBefore((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DateTime dateTime11 = interval6.getEnd();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.dayOfWeek();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18);
        boolean boolean22 = interval14.isAfter((org.joda.time.ReadableInterval) interval21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((-1L), dateTimeZone24);
        org.joda.time.Interval interval26 = interval14.withStart((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean27 = interval6.overlaps((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.Interval interval29 = interval6.withPeriodAfterStart(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate41 = localDate37.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate43 = localDate37.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property44 = localDate37.centuryOfEra();
        org.joda.time.LocalDate localDate45 = property44.roundCeilingCopy();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.eras();
        org.joda.time.Interval interval48 = interval29.withChronology(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight51 = org.joda.time.DateMidnight.now(chronology46);
        org.joda.time.DateTimeField dateTimeField52 = chronology46.dayOfYear();
        org.joda.time.DurationField durationField53 = chronology46.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField53, and durationField47", !(durationField47.compareTo(durationField53) == 0) || (Math.signum(durationField47.compareTo(durationField47)) == Math.signum(durationField53.compareTo(durationField47))));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime4.monthOfYear();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(21);
        org.joda.time.LocalDateTime localDateTime11 = dateTime8.toLocalDateTime();
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime4", (dateTime2.compareTo(dateTime4) == 0) == dateTime2.equals(dateTime4));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks(6);
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.DateTime dateTime12 = dateTime9.withDayOfYear(53);
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        org.joda.time.DateTime.Property property14 = dateTime9.year();
        org.joda.time.DateTime dateTime16 = property14.addToCopy(34545);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant13", (dateTime9.compareTo(instant13) == 0) == dateTime9.equals(instant13));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusDays(9);
        org.joda.time.LocalDateTime localDateTime4 = dateTime3.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.plus((-1L));
        org.joda.time.Chronology chronology11 = dateMidnight10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType5.getField(chronology11);
        org.joda.time.DateTime.Property property14 = dateTime3.property(dateTimeFieldType5);
        java.lang.String str15 = dateTimeFieldType5.getName();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType5.getDurationType();
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minus((long) (-1));
        org.joda.time.Chronology chronology20 = dateMidnight19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        java.lang.String str22 = chronology20.toString();
        org.joda.time.DurationField durationField23 = chronology20.years();
        org.joda.time.DurationField durationField24 = durationFieldType16.getField(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField23", (durationField21.compareTo(durationField23) == 0) == durationField21.equals(durationField23));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        java.util.Date date4 = dateMidnight3.toDate();
        org.joda.time.DateMidnight.Property property5 = dateMidnight3.dayOfWeek();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean10 = interval6.isBefore((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DateTime dateTime11 = interval6.getEnd();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.dayOfWeek();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18);
        boolean boolean22 = interval14.isAfter((org.joda.time.ReadableInterval) interval21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((-1L), dateTimeZone24);
        org.joda.time.Interval interval26 = interval14.withStart((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean27 = interval6.overlaps((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.Interval interval29 = interval6.withPeriodAfterStart(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate41 = localDate37.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate43 = localDate37.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property44 = localDate37.centuryOfEra();
        org.joda.time.LocalDate localDate45 = property44.roundCeilingCopy();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.eras();
        org.joda.time.Interval interval48 = interval29.withChronology(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight51 = org.joda.time.DateMidnight.now(chronology46);
        org.joda.time.DateTimeField dateTimeField52 = chronology46.dayOfYear();
        java.lang.String str53 = dateTimeField52.getName();
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minus((long) (-1));
        org.joda.time.Chronology chronology57 = dateMidnight56.getChronology();
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate(chronology57);
        int int59 = localDate58.getEra();
        int int60 = localDate58.getYearOfEra();
        java.util.Locale locale62 = null;
        java.lang.String str63 = dateTimeField52.getAsText((org.joda.time.ReadablePartial) localDate58, 45, locale62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight51 and dateMidnight54", (dateMidnight51.compareTo(dateMidnight54) == 0) == dateMidnight51.equals(dateMidnight54));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        int int12 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime.Property property13 = dateTime11.dayOfYear();
        boolean boolean14 = dateMidnight2.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone21);
        java.util.Date date23 = dateMidnight22.toDate();
        org.joda.time.DateMidnight.Property property24 = dateMidnight22.dayOfWeek();
        org.joda.time.Interval interval25 = new org.joda.time.Interval(readableDuration19, (org.joda.time.ReadableInstant) dateMidnight22);
        boolean boolean26 = interval18.isAfter((org.joda.time.ReadableInterval) interval25);
        org.joda.time.Duration duration27 = interval25.toDuration();
        org.joda.time.DateTime dateTime29 = dateTime11.withDurationAdded((org.joda.time.ReadableDuration) duration27, 52);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.DateTime dateTime32 = dateTime11.withFieldAdded(durationFieldType30, 53);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.plus((-1L));
        org.joda.time.Chronology chronology38 = dateMidnight37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone40);
        java.util.Date date42 = dateMidnight41.toDate();
        org.joda.time.YearMonthDay yearMonthDay43 = dateMidnight41.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay43.withPeriodAdded(readablePeriod44, 11);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.plus((-1L));
        org.joda.time.Chronology chronology52 = dateMidnight51.getChronology();
        org.joda.time.DurationField durationField53 = chronology52.centuries();
        org.joda.time.YearMonthDay yearMonthDay54 = yearMonthDay46.withChronologyRetainFields(chronology52);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone56);
        java.util.Date date58 = dateMidnight57.toDate();
        org.joda.time.YearMonthDay yearMonthDay59 = dateMidnight57.toYearMonthDay();
        int[] intArray60 = yearMonthDay59.getValues();
        chronology38.validate((org.joda.time.ReadablePartial) yearMonthDay54, intArray60);
        boolean boolean62 = durationFieldType30.isSupported(chronology38);
        java.lang.String str63 = durationFieldType30.getName();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone65);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight66.plus((-1L));
        org.joda.time.Chronology chronology69 = dateMidnight68.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.secondOfMinute();
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate(chronology69);
        org.joda.time.LocalDate localDate73 = localDate71.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate75 = localDate71.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone76 = null;
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forTimeZone(timeZone76);
        java.lang.String str78 = dateTimeZone77.toString();
        org.joda.time.DateTime dateTime79 = localDate75.toDateTimeAtCurrentTime(dateTimeZone77);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int81 = dateTime79.get(dateTimeFieldType80);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateMidnight dateMidnight85 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone84);
        org.joda.time.DateMidnight dateMidnight87 = dateMidnight85.plus((-1L));
        org.joda.time.Chronology chronology88 = dateMidnight87.getChronology();
        org.joda.time.DateTimeField dateTimeField89 = chronology88.secondOfMinute();
        org.joda.time.LocalDate localDate90 = new org.joda.time.LocalDate(chronology88);
        org.joda.time.DurationField durationField91 = chronology88.days();
        org.joda.time.DateTime dateTime92 = new org.joda.time.DateTime((long) 11, chronology88);
        org.joda.time.DateTimeField dateTimeField93 = chronology88.year();
        org.joda.time.DateTime dateTime94 = dateTime79.toDateTime(chronology88);
        org.joda.time.DurationField durationField95 = durationFieldType30.getField(chronology88);
        org.joda.time.DurationField durationField96 = chronology88.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField96, durationField53, and durationField91", !(durationField96.compareTo(durationField53) == 0) || (Math.signum(durationField96.compareTo(durationField91)) == Math.signum(durationField53.compareTo(durationField91))));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfMinute();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate11 = localDate7.plusYears((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plus((-1L));
        org.joda.time.Chronology chronology17 = dateMidnight16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.secondOfMinute();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate23 = localDate19.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str26 = dateTimeZone25.toString();
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        boolean boolean28 = dateTimeZone25.isFixed();
        org.joda.time.DateTime dateTime29 = localDate11.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.LocalDate localDate31 = localDate11.minusYears((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        boolean boolean34 = localDate31.isSupported(durationFieldType33);
        org.joda.time.format.DateTimePrinter dateTimePrinter35 = null;
        org.joda.time.format.DateTimeParser dateTimeParser36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter35, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter37.withDefaultYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter37.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter37.withPivotYear(38);
        boolean boolean44 = dateTimeFormatter37.isParser();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.plus((-1L));
        org.joda.time.Chronology chronology50 = dateMidnight49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.centuries();
        long long55 = chronology50.add((long) 292278994, (long) 4, 12);
        org.joda.time.DateTimeField dateTimeField56 = chronology50.hourOfDay();
        org.joda.time.Chronology chronology57 = chronology50.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter37.withChronology(chronology57);
        org.joda.time.DurationField durationField59 = durationFieldType33.getField(chronology57);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.plus((-1L));
        org.joda.time.Chronology chronology65 = dateMidnight64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.hours();
        org.joda.time.DurationField durationField67 = chronology65.centuries();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField69 = chronology65.secondOfDay();
        org.joda.time.DurationField durationField70 = durationFieldType33.getField(chronology65);
        org.joda.time.DurationField durationField71 = chronology65.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField70", (durationField59.compareTo(durationField70) == 0) == durationField59.equals(durationField70));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        int int6 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime8 = dateTime4.minusYears(9);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime4.plusWeeks(522);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant9", (dateTime4.compareTo(instant9) == 0) == dateTime4.equals(instant9));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        int int12 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime.Property property13 = dateTime11.dayOfYear();
        boolean boolean14 = dateMidnight2.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        java.util.Date date18 = dateMidnight17.toDate();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.minusWeeks(22);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone23);
        java.util.Date date25 = dateMidnight24.toDate();
        org.joda.time.DateMidnight.Property property26 = dateMidnight24.dayOfWeek();
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readableDuration21, (org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean31 = interval27.isBefore((org.joda.time.ReadableInterval) interval30);
        org.joda.time.DateTime dateTime32 = interval27.getEnd();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone38);
        java.util.Date date40 = dateMidnight39.toDate();
        org.joda.time.DateMidnight.Property property41 = dateMidnight39.dayOfWeek();
        org.joda.time.Interval interval42 = new org.joda.time.Interval(readableDuration36, (org.joda.time.ReadableInstant) dateMidnight39);
        boolean boolean43 = interval35.isAfter((org.joda.time.ReadableInterval) interval42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((-1L), dateTimeZone45);
        org.joda.time.Interval interval47 = interval35.withStart((org.joda.time.ReadableInstant) dateTime46);
        boolean boolean48 = interval27.overlaps((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Duration duration49 = interval27.toDuration();
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight20.withDurationAdded((org.joda.time.ReadableDuration) duration49, 24);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight2.withDurationAdded((org.joda.time.ReadableDuration) duration49, 19);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone59);
        java.util.Date date61 = dateMidnight60.toDate();
        org.joda.time.DateMidnight.Property property62 = dateMidnight60.dayOfWeek();
        org.joda.time.Interval interval63 = new org.joda.time.Interval(readableDuration57, (org.joda.time.ReadableInstant) dateMidnight60);
        boolean boolean64 = interval56.isAfter((org.joda.time.ReadableInterval) interval63);
        org.joda.time.Duration duration65 = interval63.toDuration();
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight53.withDurationAdded((org.joda.time.ReadableDuration) duration65, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration65, readableInstant68);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.plus((-1L));
        org.joda.time.Chronology chronology75 = dateMidnight74.getChronology();
        boolean boolean77 = dateMidnight74.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property78 = dateMidnight74.centuryOfEra();
        java.lang.String str79 = property78.getAsText();
        org.joda.time.DateMidnight dateMidnight80 = property78.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight81 = property78.roundHalfEvenCopy();
        org.joda.time.Interval interval82 = interval69.withStart((org.joda.time.ReadableInstant) dateMidnight81);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight81.plusYears((-19034));
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 41);
        org.joda.time.DateTime dateTime88 = dateMidnight81.toDateTime(dateTimeZone87);
        org.joda.time.DateTime dateTime89 = dateTime88.toDateTime();
        java.util.Date date91 = new java.util.Date((long) '4');
        date91.setTime((long) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay94 = org.joda.time.YearMonthDay.fromDateFields(date91);
        org.joda.time.DateTime dateTime95 = yearMonthDay94.toDateTimeAtCurrentTime();
        int int96 = dateTime89.compareTo((org.joda.time.ReadableInstant) dateTime95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight80 and dateTime89", (dateMidnight80.compareTo(dateTime89) == 0) == dateMidnight80.equals(dateTime89));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readableDuration4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.plus(readableDuration8);
        int int10 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime12 = dateTime3.minusDays(11);
        org.joda.time.DateTime.Property property13 = dateTime12.monthOfYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime12.toDateMidnight();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.plus((-1L));
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight18.plusWeeks((int) ' ');
        boolean boolean24 = dateMidnight22.equals((java.lang.Object) 100.0f);
        org.joda.time.DateTime dateTime25 = localDate15.toDateTime((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.Chronology chronology26 = localDate15.getChronology();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((java.lang.Object) dateTime12, chronology26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 719528, chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime27", (dateTime12.compareTo(dateTime27) == 0) == dateTime12.equals(dateTime27));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfMinute();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate.Property property8 = localDate7.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plus((-1L));
        org.joda.time.Chronology chronology14 = dateMidnight13.getChronology();
        boolean boolean16 = dateMidnight13.isBefore((long) ' ');
        org.joda.time.LocalDate localDate17 = dateMidnight13.toLocalDate();
        org.joda.time.Chronology chronology18 = dateMidnight13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.plus((-1L));
        org.joda.time.Chronology chronology25 = dateMidnight24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.secondOfMinute();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(chronology25);
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate31 = localDate27.plusYears((int) (byte) 0);
        org.joda.time.LocalDate.Property property32 = localDate31.era();
        int int33 = dateTimeField19.getMaximumValue((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate localDate35 = localDate31.minusWeeks(20);
        org.joda.time.LocalDate localDate37 = localDate31.plusMonths((int) (byte) -1);
        int int38 = localDate37.getDayOfMonth();
        boolean boolean39 = localDate7.equals((java.lang.Object) localDate37);
        int int40 = localDate7.getMonthOfYear();
        java.lang.String str42 = localDate7.toString("2");
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.plus((-1L));
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight45.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight45.minusMonths((int) (short) 1);
        org.joda.time.DateMidnight.Property property52 = dateMidnight51.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.plus((-1L));
        org.joda.time.Chronology chronology58 = dateMidnight57.getChronology();
        boolean boolean60 = dateMidnight57.isBefore((long) ' ');
        org.joda.time.LocalDate localDate61 = dateMidnight57.toLocalDate();
        int int62 = property52.getDifference((org.joda.time.ReadableInstant) dateMidnight57);
        org.joda.time.Instant instant63 = dateMidnight57.toInstant();
        org.joda.time.DateTimeZone dateTimeZone64 = instant63.getZone();
        org.joda.time.DateTime dateTime65 = localDate7.toDateTimeAtStartOfDay(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant63", (dateMidnight4.compareTo(instant63) == 0) == dateMidnight4.equals(instant63));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        int int12 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime.Property property13 = dateTime11.dayOfYear();
        boolean boolean14 = dateMidnight2.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        java.util.Date date18 = dateMidnight17.toDate();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.minusWeeks(22);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone23);
        java.util.Date date25 = dateMidnight24.toDate();
        org.joda.time.DateMidnight.Property property26 = dateMidnight24.dayOfWeek();
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readableDuration21, (org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean31 = interval27.isBefore((org.joda.time.ReadableInterval) interval30);
        org.joda.time.DateTime dateTime32 = interval27.getEnd();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone38);
        java.util.Date date40 = dateMidnight39.toDate();
        org.joda.time.DateMidnight.Property property41 = dateMidnight39.dayOfWeek();
        org.joda.time.Interval interval42 = new org.joda.time.Interval(readableDuration36, (org.joda.time.ReadableInstant) dateMidnight39);
        boolean boolean43 = interval35.isAfter((org.joda.time.ReadableInterval) interval42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((-1L), dateTimeZone45);
        org.joda.time.Interval interval47 = interval35.withStart((org.joda.time.ReadableInstant) dateTime46);
        boolean boolean48 = interval27.overlaps((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Duration duration49 = interval27.toDuration();
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight20.withDurationAdded((org.joda.time.ReadableDuration) duration49, 24);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight2.withDurationAdded((org.joda.time.ReadableDuration) duration49, 19);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone59);
        java.util.Date date61 = dateMidnight60.toDate();
        org.joda.time.DateMidnight.Property property62 = dateMidnight60.dayOfWeek();
        org.joda.time.Interval interval63 = new org.joda.time.Interval(readableDuration57, (org.joda.time.ReadableInstant) dateMidnight60);
        boolean boolean64 = interval56.isAfter((org.joda.time.ReadableInterval) interval63);
        org.joda.time.Duration duration65 = interval63.toDuration();
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight53.withDurationAdded((org.joda.time.ReadableDuration) duration65, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration65, readableInstant68);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.plus((-1L));
        org.joda.time.Chronology chronology75 = dateMidnight74.getChronology();
        boolean boolean77 = dateMidnight74.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property78 = dateMidnight74.centuryOfEra();
        java.lang.String str79 = property78.getAsText();
        org.joda.time.DateMidnight dateMidnight80 = property78.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight81 = property78.roundHalfEvenCopy();
        org.joda.time.Interval interval82 = interval69.withStart((org.joda.time.ReadableInstant) dateMidnight81);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight81.plusYears((-19034));
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 41);
        org.joda.time.DateTime dateTime88 = dateMidnight81.toDateTime(dateTimeZone87);
        org.joda.time.DateTime dateTime89 = dateTime88.toDateTime();
        org.joda.time.Chronology chronology90 = dateTime89.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight80 and dateTime89", (dateMidnight80.compareTo(dateTime89) == 0) == dateMidnight80.equals(dateTime89));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay4.withPeriodAdded(readablePeriod5, 11);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.monthOfYear();
        int int9 = property8.getMinimumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay10 = property8.withMinimumValue();
        int int12 = yearMonthDay10.getValue(0);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        int int14 = calendar13.getFirstDayOfWeek();
        int int15 = calendar13.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone21);
        java.util.Date date23 = dateMidnight22.toDate();
        boolean boolean24 = date19.before(date23);
        int int25 = date19.getMonth();
        calendar13.setTime(date19);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone29);
        java.util.Date date31 = dateMidnight30.toDate();
        org.joda.time.DateMidnight.Property property32 = dateMidnight30.dayOfWeek();
        org.joda.time.Interval interval33 = new org.joda.time.Interval(readableDuration27, (org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight30.minusDays(1);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone37);
        java.util.Date date39 = dateMidnight38.toDate();
        org.joda.time.YearMonthDay yearMonthDay40 = dateMidnight38.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay40.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.plus((-1L));
        org.joda.time.Chronology chronology48 = dateMidnight47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.secondOfMinute();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(chronology48);
        boolean boolean51 = yearMonthDay42.isEqual((org.joda.time.ReadablePartial) localDate50);
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        java.lang.String str55 = dateTimeZone53.getNameKey((long) (-1));
        long long57 = dateTimeZone53.convertUTCToLocal((long) 5);
        org.joda.time.DateMidnight dateMidnight58 = localDate50.toDateMidnight(dateTimeZone53);
        org.joda.time.DateTime dateTime59 = dateMidnight35.toDateTime(dateTimeZone53);
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay(dateTimeZone53);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((java.lang.Object) calendar13, dateTimeZone53);
        org.joda.time.Interval interval62 = yearMonthDay10.toInterval(dateTimeZone53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on yearMonthDay4 and localDate61", (yearMonthDay4.compareTo(localDate61) == 0) == yearMonthDay4.equals(localDate61));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusDays((int) (short) -1);
        org.joda.time.DateTime dateTime7 = yearMonthDay4.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime9 = dateTime7.minusMonths(32769);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.plus((-1L));
        org.joda.time.Chronology chronology15 = dateMidnight14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.secondOfMinute();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfEra((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime25 = dateTime23.plusYears(5);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone28);
        java.util.Date date30 = dateMidnight29.toDate();
        org.joda.time.DateMidnight.Property property31 = dateMidnight29.dayOfWeek();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean36 = interval32.isBefore((org.joda.time.ReadableInterval) interval35);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = interval32.toPeriod(periodType37);
        org.joda.time.DateTime dateTime39 = dateTime23.minus((org.joda.time.ReadablePeriod) period38);
        org.joda.time.LocalDate localDate41 = localDate19.withPeriodAdded((org.joda.time.ReadablePeriod) period38, 6);
        org.joda.time.PeriodType periodType42 = period38.getPeriodType();
        org.joda.time.DateTime dateTime44 = dateTime7.withPeriodAdded((org.joda.time.ReadablePeriod) period38, (int) '#');
        org.joda.time.YearMonthDay yearMonthDay45 = dateTime7.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime7.getZone();
        org.joda.time.DateTime dateTime48 = dateTime7.minusMonths(17);
        org.joda.time.DateTime dateTime50 = dateTime7.withSecondOfMinute(48);
        org.joda.time.Instant instant51 = dateTime7.toInstant();
        org.joda.time.DateTime.Property property52 = dateTime7.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and instant51", (dateMidnight2.compareTo(instant51) == 0) == dateMidnight2.equals(instant51));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        boolean boolean8 = dateMidnight6.equals((java.lang.Object) 100.0f);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.minus(readableDuration9);
        int int11 = dateMidnight6.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minus((long) (-1));
        org.joda.time.Chronology chronology15 = dateMidnight14.getChronology();
        int int16 = dateMidnight14.getYearOfEra();
        boolean boolean17 = dateMidnight6.isEqual((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.joda.time.DateTime dateTime20 = dateMidnight14.toDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-1L), dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.plus(readableDuration24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readableDuration28);
        int int30 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.minus((long) (-1));
        org.joda.time.Chronology chronology34 = dateMidnight33.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(chronology34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.minus(readablePeriod36);
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay39.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay39.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone48);
        java.util.Date date50 = dateMidnight49.toDate();
        org.joda.time.DateMidnight.Property property51 = dateMidnight49.dayOfWeek();
        org.joda.time.Interval interval52 = new org.joda.time.Interval(readableDuration46, (org.joda.time.ReadableInstant) dateMidnight49);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean56 = interval52.isBefore((org.joda.time.ReadableInterval) interval55);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = interval52.toPeriod(periodType57);
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay45.minus((org.joda.time.ReadablePeriod) period58);
        org.joda.time.DateTime dateTime61 = dateTime23.withPeriodAdded((org.joda.time.ReadablePeriod) period58, 19);
        java.lang.String str62 = period58.toString();
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone65);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight66.plus((-1L));
        org.joda.time.Chronology chronology69 = dateMidnight68.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.secondOfMinute();
        org.joda.time.DurationField durationField71 = chronology69.millis();
        org.joda.time.DurationField durationField72 = durationFieldType63.getField(chronology69);
        int int73 = period58.get(durationFieldType63);
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight14.withFieldAdded(durationFieldType63, 1971);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight75 and dateTime20", (dateMidnight75.compareTo(dateTime20) == 0) == dateMidnight75.equals(dateTime20));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.minus((long) (-1));
        org.joda.time.Chronology chronology3 = dateMidnight2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfHalfday();
        org.joda.time.Chronology chronology5 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfDay();
        org.joda.time.DateMidnight dateMidnight7 = org.joda.time.DateMidnight.now(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight0 and dateMidnight7", (dateMidnight0.compareTo(dateMidnight7) == 0) == dateMidnight0.equals(dateMidnight7));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 16);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(22);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis(14400001L);
        org.joda.time.DateTime dateTime10 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        java.util.Date date15 = dateMidnight14.toDate();
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration11, (org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean21 = interval17.isBefore((org.joda.time.ReadableInterval) interval20);
        org.joda.time.DateTime dateTime22 = interval17.getEnd();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone28);
        java.util.Date date30 = dateMidnight29.toDate();
        org.joda.time.DateMidnight.Property property31 = dateMidnight29.dayOfWeek();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29);
        boolean boolean33 = interval25.isAfter((org.joda.time.ReadableInterval) interval32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((-1L), dateTimeZone35);
        org.joda.time.Interval interval37 = interval25.withStart((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean38 = interval17.overlaps((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.Interval interval40 = interval17.withPeriodAfterStart(readablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.plus((-1L));
        org.joda.time.Chronology chronology46 = dateMidnight45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.secondOfMinute();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.LocalDate localDate50 = localDate48.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate52 = localDate48.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate54 = localDate48.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property55 = localDate48.centuryOfEra();
        org.joda.time.LocalDate localDate56 = property55.roundCeilingCopy();
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.eras();
        org.joda.time.Interval interval59 = interval40.withChronology(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime10.toDateTime(chronology57);
        org.joda.time.DateTime.Property property61 = dateTime60.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField62 = property61.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime60", (dateTime9.compareTo(dateTime60) == 0) == dateTime9.equals(dateTime60));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        int int7 = dateMidnight6.getCenturyOfEra();
        org.joda.time.Instant instant8 = dateMidnight6.toInstant();
        int int9 = dateMidnight6.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight6.minusDays(999);
        int int12 = dateMidnight11.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight6 and instant8", (dateMidnight6.compareTo(instant8) == 0) == dateMidnight6.equals(instant8));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minus((long) (-1));
        org.joda.time.Chronology chronology13 = dateMidnight12.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minus(readablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay18.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone27);
        java.util.Date date29 = dateMidnight28.toDate();
        org.joda.time.DateMidnight.Property property30 = dateMidnight28.dayOfWeek();
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableDuration25, (org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean35 = interval31.isBefore((org.joda.time.ReadableInterval) interval34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = interval31.toPeriod(periodType36);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay24.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.DateTime dateTime40 = dateTime2.withPeriodAdded((org.joda.time.ReadablePeriod) period37, 19);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minus((long) (-1));
        org.joda.time.Chronology chronology44 = dateMidnight43.getChronology();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(chronology44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.minus(readablePeriod46);
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay47.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.minusMinutes(1970);
        org.joda.time.Chronology chronology52 = timeOfDay49.getChronology();
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minus((long) (-1));
        org.joda.time.Chronology chronology56 = dateMidnight55.getChronology();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(chronology56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay57.minus(readablePeriod58);
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay59.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay61.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay61.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay65.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone70);
        java.util.Date date72 = dateMidnight71.toDate();
        org.joda.time.DateMidnight.Property property73 = dateMidnight71.dayOfWeek();
        org.joda.time.Interval interval74 = new org.joda.time.Interval(readableDuration68, (org.joda.time.ReadableInstant) dateMidnight71);
        org.joda.time.Interval interval77 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean78 = interval74.isBefore((org.joda.time.ReadableInterval) interval77);
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.Period period80 = interval74.toPeriod(periodType79);
        org.joda.time.TimeOfDay timeOfDay81 = timeOfDay67.minus((org.joda.time.ReadablePeriod) period80);
        org.joda.time.PeriodType periodType82 = period80.getPeriodType();
        int[] intArray85 = chronology52.get((org.joda.time.ReadablePeriod) period80, (long) (-1), (long) 24);
        org.joda.time.DateTimeField dateTimeField86 = chronology52.yearOfEra();
        org.joda.time.DateTime dateTime87 = dateTime2.toDateTime(chronology52);
        org.joda.time.DateTimeField dateTimeField88 = chronology52.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime87", (dateTime2.compareTo(dateTime87) == 0) == dateTime2.equals(dateTime87));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 16);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(22);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis(14400001L);
        org.joda.time.DateTime dateTime10 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        java.util.Date date15 = dateMidnight14.toDate();
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration11, (org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean21 = interval17.isBefore((org.joda.time.ReadableInterval) interval20);
        org.joda.time.DateTime dateTime22 = interval17.getEnd();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone28);
        java.util.Date date30 = dateMidnight29.toDate();
        org.joda.time.DateMidnight.Property property31 = dateMidnight29.dayOfWeek();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29);
        boolean boolean33 = interval25.isAfter((org.joda.time.ReadableInterval) interval32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((-1L), dateTimeZone35);
        org.joda.time.Interval interval37 = interval25.withStart((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean38 = interval17.overlaps((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.Interval interval40 = interval17.withPeriodAfterStart(readablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.plus((-1L));
        org.joda.time.Chronology chronology46 = dateMidnight45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.secondOfMinute();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.LocalDate localDate50 = localDate48.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate52 = localDate48.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate54 = localDate48.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property55 = localDate48.centuryOfEra();
        org.joda.time.LocalDate localDate56 = property55.roundCeilingCopy();
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.eras();
        org.joda.time.Interval interval59 = interval40.withChronology(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime10.toDateTime(chronology57);
        org.joda.time.DateTimeField dateTimeField61 = chronology57.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime60", (dateTime9.compareTo(dateTime60) == 0) == dateTime9.equals(dateTime60));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTime dateTime6 = dateTime2.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTime dateTime8 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.Interval interval9 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime.Property property10 = dateTime8.weekyear();
        org.joda.time.DateTime.Property property11 = dateTime8.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plus((-1L));
        org.joda.time.Chronology chronology17 = dateMidnight16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.secondOfMinute();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate23 = localDate19.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str26 = dateTimeZone25.toString();
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.LocalDate localDate29 = localDate23.withWeekyear(19);
        org.joda.time.LocalTime localTime30 = null;
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.lang.String str34 = dateTimeZone32.getNameKey((long) (-1));
        org.joda.time.DateTime dateTime35 = localDate23.toDateTime(localTime30, dateTimeZone32);
        org.joda.time.LocalDate.Property property36 = localDate23.weekyear();
        org.joda.time.LocalDate.Property property37 = localDate23.dayOfWeek();
        org.joda.time.LocalDate localDate38 = property37.roundFloorCopy();
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.years();
        org.joda.time.DateTime dateTime41 = dateTime8.toDateTime(chronology39);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone43);
        java.util.Date date45 = dateMidnight44.toDate();
        org.joda.time.YearMonthDay yearMonthDay46 = dateMidnight44.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay46.plusDays((int) (short) -1);
        org.joda.time.DateTime dateTime49 = yearMonthDay46.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.plus((-1L));
        org.joda.time.Chronology chronology55 = dateMidnight54.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.secondOfMinute();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(chronology55);
        org.joda.time.LocalDate localDate59 = localDate57.withYearOfEra((int) (byte) 10);
        int int60 = localDate57.getYearOfCentury();
        org.joda.time.LocalTime localTime61 = null;
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone63);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.plus((-1L));
        org.joda.time.Chronology chronology67 = dateMidnight66.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.secondOfMinute();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate(chronology67);
        org.joda.time.LocalDate localDate71 = localDate69.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate73 = localDate69.plusYears((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateMidnight dateMidnight76 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone75);
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight76.plus((-1L));
        org.joda.time.Chronology chronology79 = dateMidnight78.getChronology();
        org.joda.time.DateTimeField dateTimeField80 = chronology79.secondOfMinute();
        org.joda.time.LocalDate localDate81 = new org.joda.time.LocalDate(chronology79);
        org.joda.time.LocalDate localDate83 = localDate81.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate85 = localDate81.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone86 = null;
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forTimeZone(timeZone86);
        java.lang.String str88 = dateTimeZone87.toString();
        org.joda.time.DateTime dateTime89 = localDate85.toDateTimeAtCurrentTime(dateTimeZone87);
        boolean boolean90 = dateTimeZone87.isFixed();
        org.joda.time.DateTime dateTime91 = localDate73.toDateTimeAtCurrentTime(dateTimeZone87);
        org.joda.time.DateTime dateTime92 = localDate57.toDateTime(localTime61, dateTimeZone87);
        java.util.TimeZone timeZone93 = dateTimeZone87.toTimeZone();
        org.joda.time.DateTime dateTime94 = yearMonthDay46.toDateTimeAtMidnight(dateTimeZone87);
        org.joda.time.DateTime.Property property95 = dateTime94.weekOfWeekyear();
        int int96 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime94);
        int int97 = dateTime94.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime41", (dateTime8.compareTo(dateTime41) == 0) == dateTime8.equals(dateTime41));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight2.minusMonths((int) (short) 1);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.plus((-1L));
        org.joda.time.Chronology chronology15 = dateMidnight14.getChronology();
        boolean boolean17 = dateMidnight14.isBefore((long) ' ');
        org.joda.time.LocalDate localDate18 = dateMidnight14.toLocalDate();
        int int19 = property9.getDifference((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Instant instant20 = dateMidnight14.toInstant();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone24);
        java.util.Date date26 = dateMidnight25.toDate();
        org.joda.time.YearMonthDay yearMonthDay27 = dateMidnight25.toYearMonthDay();
        int[] intArray28 = yearMonthDay27.getValues();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay27.withPeriodAdded(readablePeriod29, 22);
        java.lang.String str32 = yearMonthDay27.toString();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.plus((-1L));
        org.joda.time.Chronology chronology38 = dateMidnight37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.secondOfMinute();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(chronology38);
        org.joda.time.LocalDate localDate42 = localDate40.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate44 = localDate40.plusYears((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.plus((-1L));
        org.joda.time.Chronology chronology50 = dateMidnight49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.secondOfMinute();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology50);
        org.joda.time.LocalDate localDate54 = localDate52.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate56 = localDate52.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        java.lang.String str59 = dateTimeZone58.toString();
        org.joda.time.DateTime dateTime60 = localDate56.toDateTimeAtCurrentTime(dateTimeZone58);
        boolean boolean61 = dateTimeZone58.isFixed();
        org.joda.time.DateTime dateTime62 = localDate44.toDateTimeAtCurrentTime(dateTimeZone58);
        java.lang.String str63 = dateTimeZone58.toString();
        org.joda.time.Interval interval64 = yearMonthDay27.toInterval(dateTimeZone58);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) 8, dateTimeZone58);
        boolean boolean66 = dateTimeZone21.equals((java.lang.Object) dateTimeZone58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant20", (dateMidnight4.compareTo(instant20) == 0) == dateMidnight4.equals(instant20));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        java.util.Date date4 = dateMidnight3.toDate();
        org.joda.time.YearMonthDay yearMonthDay5 = dateMidnight3.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.monthOfYear();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.minus(readableDuration11);
        org.joda.time.DateMidnight dateMidnight13 = dateTime12.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.plus((-1L));
        org.joda.time.Chronology chronology19 = dateMidnight18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.secondOfMinute();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Interval interval23 = localDate21.toInterval(dateTimeZone22);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) dateTime12, chronology24);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay5.withChronologyRetainFields(chronology24);
        org.joda.time.DurationField durationField27 = chronology24.seconds();
        org.joda.time.DateTimeField dateTimeField28 = chronology24.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField29 = chronology24.weekyearOfCentury();
        org.joda.time.DurationField durationField30 = chronology24.months();
        org.joda.time.DateTimeField dateTimeField31 = chronology24.yearOfEra();
        long long35 = chronology24.add(10035038L, 1640995199609L, 46);
        org.joda.time.DateTimeField dateTimeField36 = chronology24.minuteOfDay();
        org.joda.time.DurationField durationField37 = chronology24.minutes();
        org.joda.time.Chronology chronology38 = chronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) 34693, chronology38);
        org.joda.time.DateTimeZone dateTimeZone43 = chronology38.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and dateMidnight42", (dateMidnight3.compareTo(dateMidnight42) == 0) == dateMidnight3.equals(dateMidnight42));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.monthOfYear();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.minus(readableDuration5);
        org.joda.time.DateTime.Property property7 = dateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime1.withField(dateTimeFieldType8, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime10.withYear(32770);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears(5);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone21);
        java.util.Date date23 = dateMidnight22.toDate();
        org.joda.time.DateMidnight.Property property24 = dateMidnight22.dayOfWeek();
        org.joda.time.Interval interval25 = new org.joda.time.Interval(readableDuration19, (org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.Interval interval28 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean29 = interval25.isBefore((org.joda.time.ReadableInterval) interval28);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = interval25.toPeriod(periodType30);
        org.joda.time.DateTime dateTime32 = dateTime16.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.DateTime dateTime33 = dateTime12.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.DateTime dateTime34 = dateTime12.toDateTime();
        org.joda.time.Instant instant35 = dateTime34.toInstant();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime40 = dateTime39.toDateTimeISO();
        int int41 = dateTime40.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = dateTime40.toDateTime(dateTimeZone42);
        org.joda.time.DateTime.Property property44 = dateTime43.weekOfWeekyear();
        org.joda.time.YearMonthDay yearMonthDay45 = dateTime43.toYearMonthDay();
        boolean boolean46 = dateTime34.isAfter((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and instant35", (dateTime34.compareTo(instant35) == 0) == dateTime34.equals(instant35));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 16);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(22);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis(14400001L);
        org.joda.time.DateTime dateTime10 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        java.util.Date date15 = dateMidnight14.toDate();
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration11, (org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean21 = interval17.isBefore((org.joda.time.ReadableInterval) interval20);
        org.joda.time.DateTime dateTime22 = interval17.getEnd();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone28);
        java.util.Date date30 = dateMidnight29.toDate();
        org.joda.time.DateMidnight.Property property31 = dateMidnight29.dayOfWeek();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29);
        boolean boolean33 = interval25.isAfter((org.joda.time.ReadableInterval) interval32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((-1L), dateTimeZone35);
        org.joda.time.Interval interval37 = interval25.withStart((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean38 = interval17.overlaps((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.Interval interval40 = interval17.withPeriodAfterStart(readablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.plus((-1L));
        org.joda.time.Chronology chronology46 = dateMidnight45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.secondOfMinute();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.LocalDate localDate50 = localDate48.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate52 = localDate48.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate54 = localDate48.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property55 = localDate48.centuryOfEra();
        org.joda.time.LocalDate localDate56 = property55.roundCeilingCopy();
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.eras();
        org.joda.time.Interval interval59 = interval40.withChronology(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime10.toDateTime(chronology57);
        org.joda.time.DateTimeField dateTimeField61 = chronology57.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime60", (dateTime9.compareTo(dateTime60) == 0) == dateTime9.equals(dateTime60));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((-1L));
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfMinute();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.LocalDate localDate19 = localDate13.withWeekyear(19);
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfYear();
        org.joda.time.LocalDate localDate21 = property20.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone23);
        java.util.Date date25 = dateMidnight24.toDate();
        org.joda.time.YearMonthDay yearMonthDay26 = dateMidnight24.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.plus((-1L));
        org.joda.time.Chronology chronology32 = dateMidnight31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.secondOfMinute();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.LocalDate localDate36 = localDate34.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate38 = localDate34.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.lang.String str41 = dateTimeZone40.toString();
        org.joda.time.DateTime dateTime42 = localDate38.toDateTimeAtCurrentTime(dateTimeZone40);
        org.joda.time.LocalDate localDate44 = localDate38.withWeekyear(19);
        org.joda.time.LocalTime localTime45 = null;
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        java.lang.String str49 = dateTimeZone47.getNameKey((long) (-1));
        org.joda.time.DateTime dateTime50 = localDate38.toDateTime(localTime45, dateTimeZone47);
        java.lang.String str52 = dateTimeZone47.getName(1000L);
        org.joda.time.DateTime dateTime53 = yearMonthDay26.toDateTimeAtCurrentTime(dateTimeZone47);
        org.joda.time.Interval interval54 = localDate21.toInterval(dateTimeZone47);
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) ' ', chronology55);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone58);
        java.util.Date date60 = dateMidnight59.toDate();
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight59.minusWeeks(22);
        int int63 = dateMidnight59.getMillisOfDay();
        boolean boolean64 = dateTime56.isAfter((org.joda.time.ReadableInstant) dateMidnight59);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.plus((-1L));
        org.joda.time.Chronology chronology70 = dateMidnight69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.secondOfMinute();
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate(chronology70);
        org.joda.time.DurationField durationField73 = chronology70.days();
        org.joda.time.DateTimeField dateTimeField74 = chronology70.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField75 = chronology70.centuryOfEra();
        org.joda.time.DurationField durationField76 = chronology70.millis();
        org.joda.time.MutableDateTime mutableDateTime77 = dateMidnight59.toMutableDateTime(chronology70);
        org.joda.time.DateTimeField dateTimeField78 = chronology70.millisOfSecond();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (-1), chronology70);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime(chronology70);
        org.joda.time.DurationField durationField81 = chronology70.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField81, durationField73, and durationField76", !(durationField81.compareTo(durationField73) == 0) || (Math.signum(durationField81.compareTo(durationField76)) == Math.signum(durationField73.compareTo(durationField76))));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.minus((long) (-1));
        org.joda.time.Chronology chronology3 = dateMidnight2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfHalfday();
        org.joda.time.Chronology chronology5 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfDay();
        org.joda.time.DateMidnight dateMidnight7 = org.joda.time.DateMidnight.now(chronology5);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.withDayOfYear(42);
        int int10 = dateMidnight9.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight0 and dateMidnight9", (dateMidnight0.compareTo(dateMidnight9) == 0) == dateMidnight0.equals(dateMidnight9));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.minus((long) (-1));
        org.joda.time.Chronology chronology3 = dateMidnight2.getChronology();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.DateTime dateTime5 = localDate4.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plus((-1L));
        org.joda.time.Chronology chronology12 = dateMidnight11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.hours();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType6.getField(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime5.withChronology(chronology12);
        org.joda.time.DateTime dateTime16 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime18 = dateTime16.withMillis(281723794000L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusMonths(25);
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime20.getZone();
        org.joda.time.DateMidnight dateMidnight23 = org.joda.time.DateMidnight.now(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant21", (dateTime20.compareTo(instant21) == 0) == dateTime20.equals(instant21));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 16);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(22);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis(14400001L);
        org.joda.time.DateTime dateTime10 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        java.util.Date date15 = dateMidnight14.toDate();
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration11, (org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean21 = interval17.isBefore((org.joda.time.ReadableInterval) interval20);
        org.joda.time.DateTime dateTime22 = interval17.getEnd();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone28);
        java.util.Date date30 = dateMidnight29.toDate();
        org.joda.time.DateMidnight.Property property31 = dateMidnight29.dayOfWeek();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29);
        boolean boolean33 = interval25.isAfter((org.joda.time.ReadableInterval) interval32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((-1L), dateTimeZone35);
        org.joda.time.Interval interval37 = interval25.withStart((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean38 = interval17.overlaps((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.Interval interval40 = interval17.withPeriodAfterStart(readablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.plus((-1L));
        org.joda.time.Chronology chronology46 = dateMidnight45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.secondOfMinute();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.LocalDate localDate50 = localDate48.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate52 = localDate48.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate54 = localDate48.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property55 = localDate48.centuryOfEra();
        org.joda.time.LocalDate localDate56 = property55.roundCeilingCopy();
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.eras();
        org.joda.time.Interval interval59 = interval40.withChronology(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime10.toDateTime(chronology57);
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay(chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime60", (dateTime9.compareTo(dateTime60) == 0) == dateTime9.equals(dateTime60));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        int int5 = dateTime4.getSecondOfMinute();
        int int6 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime8 = dateTime4.minusYears(9);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime4.plusWeeks(34736);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant9", (dateTime4.compareTo(instant9) == 0) == dateTime4.equals(instant9));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.minus((long) (-1));
        org.joda.time.Chronology chronology3 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone12);
        java.util.Date date14 = dateMidnight13.toDate();
        org.joda.time.DateMidnight.Property property15 = dateMidnight13.dayOfWeek();
        org.joda.time.Interval interval16 = new org.joda.time.Interval(readableDuration10, (org.joda.time.ReadableInstant) dateMidnight13);
        boolean boolean17 = interval9.isAfter((org.joda.time.ReadableInterval) interval16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.Interval interval19 = interval16.withPeriodAfterStart(readablePeriod18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone22);
        java.util.Date date24 = dateMidnight23.toDate();
        org.joda.time.DateMidnight.Property property25 = dateMidnight23.dayOfWeek();
        org.joda.time.Interval interval26 = new org.joda.time.Interval(readableDuration20, (org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean30 = interval26.isBefore((org.joda.time.ReadableInterval) interval29);
        org.joda.time.DateTime dateTime31 = interval26.getEnd();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone37);
        java.util.Date date39 = dateMidnight38.toDate();
        org.joda.time.DateMidnight.Property property40 = dateMidnight38.dayOfWeek();
        org.joda.time.Interval interval41 = new org.joda.time.Interval(readableDuration35, (org.joda.time.ReadableInstant) dateMidnight38);
        boolean boolean42 = interval34.isAfter((org.joda.time.ReadableInterval) interval41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((-1L), dateTimeZone44);
        org.joda.time.Interval interval46 = interval34.withStart((org.joda.time.ReadableInstant) dateTime45);
        boolean boolean47 = interval26.overlaps((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Duration duration48 = interval26.toDuration();
        org.joda.time.Interval interval49 = interval19.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration48);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.plus((-1L));
        org.joda.time.Chronology chronology57 = dateMidnight56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.hours();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.clockhourOfDay();
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) 29, (long) 2022, chronology57);
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minus((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone65);
        java.util.Date date67 = dateMidnight66.toDate();
        org.joda.time.YearMonthDay yearMonthDay68 = dateMidnight66.toYearMonthDay();
        int[] intArray69 = yearMonthDay68.getValues();
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.YearMonthDay yearMonthDay72 = yearMonthDay68.withPeriodAdded(readablePeriod70, 22);
        org.joda.time.YearMonthDay yearMonthDay74 = yearMonthDay72.plusMonths(13);
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone77);
        java.util.Date date79 = dateMidnight78.toDate();
        org.joda.time.DateMidnight.Property property80 = dateMidnight78.dayOfWeek();
        org.joda.time.Interval interval81 = new org.joda.time.Interval(readableDuration75, (org.joda.time.ReadableInstant) dateMidnight78);
        org.joda.time.Interval interval84 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean85 = interval81.isBefore((org.joda.time.ReadableInterval) interval84);
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.Period period87 = interval81.toPeriod(periodType86);
        int int89 = period87.getValue((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay90 = yearMonthDay72.plus((org.joda.time.ReadablePeriod) period87);
        org.joda.time.Interval interval91 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight61, (org.joda.time.ReadablePeriod) period87);
        org.joda.time.Interval interval92 = interval60.withPeriodAfterStart((org.joda.time.ReadablePeriod) period87);
        org.joda.time.Interval interval93 = interval19.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period87);
        long long96 = chronology3.add((org.joda.time.ReadablePeriod) period87, (long) (-19034), 323);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean7 = dateTimeFormatter6.isParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.plus((-1L));
        org.joda.time.Chronology chronology13 = dateMidnight12.getChronology();
        boolean boolean15 = dateMidnight12.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property16 = dateMidnight12.centuryOfEra();
        boolean boolean17 = property16.isLeap();
        org.joda.time.DateMidnight dateMidnight19 = property16.setCopy("0");
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone21);
        java.util.Date date23 = dateMidnight22.toDate();
        org.joda.time.YearMonthDay yearMonthDay24 = dateMidnight22.toYearMonthDay();
        int[] intArray25 = yearMonthDay24.getValues();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay24.withPeriodAdded(readablePeriod26, 22);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.lang.String str32 = dateTimeZone30.getNameKey((long) (-1));
        long long34 = dateTimeZone30.convertUTCToLocal((long) 5);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone30.getName((long) 0, locale36);
        org.joda.time.Interval interval38 = yearMonthDay24.toInterval(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime39 = dateMidnight19.toMutableDateTime(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter6.withZone(dateTimeZone30);
        java.lang.Integer int41 = dateTimeFormatter6.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.DateMidnight dateMidnight44 = org.joda.time.DateMidnight.now(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter6.withZone(dateTimeZone43);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone43);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minus((long) (-1));
        org.joda.time.Chronology chronology50 = dateMidnight49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.weekyears();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.weekyearOfCentury();
        org.joda.time.DurationField durationField53 = chronology50.eras();
        boolean boolean54 = dateMidnight46.equals((java.lang.Object) chronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField51 and durationField53", Math.signum(durationField51.compareTo(durationField53)) == -Math.signum(durationField53.compareTo(durationField51)));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 16);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(22);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property12 = dateTime9.monthOfYear();
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(21);
        org.joda.time.DateTime.Property property16 = dateTime13.weekyear();
        int int17 = property16.getMinimumValueOverall();
        org.joda.time.DateTime dateTime18 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekyear(4);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.plus((-1L));
        org.joda.time.Chronology chronology26 = dateMidnight25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.secondOfMinute();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology26);
        org.joda.time.LocalDate localDate30 = localDate28.withYearOfEra((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears(5);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone39);
        java.util.Date date41 = dateMidnight40.toDate();
        org.joda.time.DateMidnight.Property property42 = dateMidnight40.dayOfWeek();
        org.joda.time.Interval interval43 = new org.joda.time.Interval(readableDuration37, (org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean47 = interval43.isBefore((org.joda.time.ReadableInterval) interval46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = interval43.toPeriod(periodType48);
        org.joda.time.DateTime dateTime50 = dateTime34.minus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.LocalDate localDate52 = localDate30.withPeriodAdded((org.joda.time.ReadablePeriod) period49, 6);
        org.joda.time.DateTime dateTime53 = dateTime18.plus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.DateTime dateTime54 = dateTime7.plus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.DateTime dateTime55 = dateTime54.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minus((long) (-1));
        org.joda.time.Chronology chronology59 = dateMidnight58.getChronology();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(chronology59);
        org.joda.time.DateTime dateTime61 = localDate60.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.plus((-1L));
        org.joda.time.Chronology chronology68 = dateMidnight67.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.hours();
        org.joda.time.DateTimeField dateTimeField70 = dateTimeFieldType62.getField(chronology68);
        org.joda.time.DateTime dateTime71 = dateTime61.withChronology(chronology68);
        org.joda.time.DurationField durationField72 = chronology68.eras();
        org.joda.time.DateTime dateTime73 = dateTime55.toDateTime(chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField69 and durationField72", Math.signum(durationField69.compareTo(durationField72)) == -Math.signum(durationField72.compareTo(durationField69)));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.monthOfYear();
        org.joda.time.DateTime dateTime5 = property4.withMaximumValue();
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(21);
        org.joda.time.LocalDateTime localDateTime8 = dateTime5.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean10 = dateTimeZone9.isFixed();
        boolean boolean11 = dateTimeZone9.isFixed();
        org.joda.time.DateTime dateTime12 = dateTime5.withZoneRetainFields(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minus((long) (-1));
        org.joda.time.Chronology chronology17 = dateMidnight16.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minus(readablePeriod19);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMinutes(1970);
        org.joda.time.Chronology chronology25 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((long) 10, chronology25);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) dateTime12, chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime27", (dateTime1.compareTo(dateTime27) == 0) == dateTime1.equals(dateTime27));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 16);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(22);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis(14400001L);
        org.joda.time.DateTime dateTime10 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        java.util.Date date15 = dateMidnight14.toDate();
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration11, (org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean21 = interval17.isBefore((org.joda.time.ReadableInterval) interval20);
        org.joda.time.DateTime dateTime22 = interval17.getEnd();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone28);
        java.util.Date date30 = dateMidnight29.toDate();
        org.joda.time.DateMidnight.Property property31 = dateMidnight29.dayOfWeek();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29);
        boolean boolean33 = interval25.isAfter((org.joda.time.ReadableInterval) interval32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((-1L), dateTimeZone35);
        org.joda.time.Interval interval37 = interval25.withStart((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean38 = interval17.overlaps((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.Interval interval40 = interval17.withPeriodAfterStart(readablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.plus((-1L));
        org.joda.time.Chronology chronology46 = dateMidnight45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.secondOfMinute();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.LocalDate localDate50 = localDate48.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate52 = localDate48.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate54 = localDate48.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property55 = localDate48.centuryOfEra();
        org.joda.time.LocalDate localDate56 = property55.roundCeilingCopy();
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.eras();
        org.joda.time.Interval interval59 = interval40.withChronology(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime10.toDateTime(chronology57);
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay(chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime60", (dateTime9.compareTo(dateTime60) == 0) == dateTime9.equals(dateTime60));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        java.util.Date date4 = dateMidnight3.toDate();
        org.joda.time.YearMonthDay yearMonthDay5 = dateMidnight3.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay5.withPeriodAdded(readablePeriod6, 11);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plus((-1L));
        org.joda.time.Chronology chronology14 = dateMidnight13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.centuries();
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay8.withChronologyRetainFields(chronology14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(0L, chronology14);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) '#');
        org.joda.time.DateTime dateTime21 = dateTime17.minusMinutes(25);
        org.joda.time.DateTime.Property property22 = dateTime21.year();
        org.joda.time.DateTime dateTime24 = property22.addWrapFieldToCopy(37);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone27);
        java.util.Date date29 = dateMidnight28.toDate();
        org.joda.time.DateMidnight.Property property30 = dateMidnight28.dayOfWeek();
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableDuration25, (org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean35 = interval31.isBefore((org.joda.time.ReadableInterval) interval34);
        org.joda.time.DateTime dateTime36 = interval31.getEnd();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone42);
        java.util.Date date44 = dateMidnight43.toDate();
        org.joda.time.DateMidnight.Property property45 = dateMidnight43.dayOfWeek();
        org.joda.time.Interval interval46 = new org.joda.time.Interval(readableDuration40, (org.joda.time.ReadableInstant) dateMidnight43);
        boolean boolean47 = interval39.isAfter((org.joda.time.ReadableInterval) interval46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((-1L), dateTimeZone49);
        org.joda.time.Interval interval51 = interval39.withStart((org.joda.time.ReadableInstant) dateTime50);
        boolean boolean52 = interval31.overlaps((org.joda.time.ReadableInterval) interval39);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.Interval interval54 = interval31.withPeriodAfterStart(readablePeriod53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight57.plus((-1L));
        org.joda.time.Chronology chronology60 = dateMidnight59.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.secondOfMinute();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(chronology60);
        org.joda.time.LocalDate localDate64 = localDate62.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate66 = localDate62.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate68 = localDate62.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property69 = localDate62.centuryOfEra();
        org.joda.time.LocalDate localDate70 = property69.roundCeilingCopy();
        org.joda.time.Chronology chronology71 = localDate70.getChronology();
        org.joda.time.DurationField durationField72 = chronology71.eras();
        org.joda.time.Interval interval73 = interval54.withChronology(chronology71);
        org.joda.time.DateTimeField dateTimeField74 = chronology71.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField75 = chronology71.millisOfDay();
        org.joda.time.DateTimeField dateTimeField76 = chronology71.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime24.toMutableDateTime(chronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField72", Math.signum(durationField15.compareTo(durationField72)) == -Math.signum(durationField72.compareTo(durationField15)));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.monthOfYear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.minus(readableDuration10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) dateTime11, chronology23);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay4.withChronologyRetainFields(chronology23);
        org.joda.time.DurationField durationField26 = chronology23.seconds();
        org.joda.time.DateTimeField dateTimeField27 = chronology23.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = chronology23.weekyearOfCentury();
        org.joda.time.DurationField durationField29 = chronology23.months();
        org.joda.time.DateTimeField dateTimeField30 = chronology23.yearOfEra();
        long long34 = chronology23.add(10035038L, 1640995199609L, 46);
        org.joda.time.DateTimeField dateTimeField35 = chronology23.minuteOfDay();
        org.joda.time.DurationField durationField36 = chronology23.minutes();
        org.joda.time.Chronology chronology37 = chronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.weekOfWeekyear();
        org.joda.time.DurationField durationField40 = chronology37.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField26, and durationField29", !(durationField40.compareTo(durationField26) == 0) || (Math.signum(durationField40.compareTo(durationField29)) == Math.signum(durationField26.compareTo(durationField29))));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        boolean boolean7 = dateTimeFormatter6.isPrinter();
        int int8 = dateTimeFormatter6.getDefaultYear();
        boolean boolean9 = dateTimeFormatter6.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withPivotYear(24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter6.withOffsetParsed();
        boolean boolean13 = dateTimeFormatter6.isOffsetParsed();
        java.util.Locale locale14 = dateTimeFormatter6.getLocale();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter6.withLocale(locale15);
        int int17 = dateTimeFormatter16.getDefaultYear();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.plus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime20.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTime dateTime26 = dateTime20.minusDays((int) (byte) 10);
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readableDuration18, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime.Property property28 = dateTime26.weekyear();
        org.joda.time.DateTime.Property property29 = dateTime26.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate41 = localDate37.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        java.lang.String str44 = dateTimeZone43.toString();
        org.joda.time.DateTime dateTime45 = localDate41.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.LocalDate localDate47 = localDate41.withWeekyear(19);
        org.joda.time.LocalTime localTime48 = null;
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        java.lang.String str52 = dateTimeZone50.getNameKey((long) (-1));
        org.joda.time.DateTime dateTime53 = localDate41.toDateTime(localTime48, dateTimeZone50);
        org.joda.time.LocalDate.Property property54 = localDate41.weekyear();
        org.joda.time.LocalDate.Property property55 = localDate41.dayOfWeek();
        org.joda.time.LocalDate localDate56 = property55.roundFloorCopy();
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.years();
        org.joda.time.DateTime dateTime59 = dateTime26.toDateTime(chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter16.withChronology(chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime59", (dateTime26.compareTo(dateTime59) == 0) == dateTime26.equals(dateTime59));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime4.toDateTimeISO();
        int int6 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime.Property property7 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.eras();
        boolean boolean10 = property7.equals((java.lang.Object) durationFieldType9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone12);
        int int14 = dateMidnight13.getYear();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfDay();
        org.joda.time.DurationField durationField17 = durationFieldType9.getField(chronology15);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(obj0, chronology15);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight18.withDurationAdded((long) (short) 0, 41);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.plus((-1L));
        org.joda.time.Chronology chronology27 = dateMidnight26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.hours();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.dayOfYear();
        org.joda.time.DurationField durationField31 = chronology27.minutes();
        org.joda.time.DateTimeField dateTimeField32 = chronology27.millisOfDay();
        java.util.Locale locale33 = null;
        int int34 = dateTimeField32.getMaximumShortTextLength(locale33);
        int int35 = dateMidnight21.get(dateTimeField32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField28", Math.signum(durationField17.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField17)));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay4.withPeriodAdded(readablePeriod5, 11);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay9 = property8.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay10 = property8.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        int int16 = dateTime15.getSecondOfMinute();
        org.joda.time.DateTime.Property property17 = dateTime15.dayOfYear();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime19 = property17.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        boolean boolean24 = dateTimeZone22.isStandardOffset(252L);
        long long26 = dateTimeZone22.nextTransition((long) 26);
        org.joda.time.DateTime dateTime27 = dateTime19.withZone(dateTimeZone22);
        int int28 = property8.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone30);
        java.util.Date date32 = dateMidnight31.toDate();
        org.joda.time.YearMonthDay yearMonthDay33 = dateMidnight31.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay33.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.plus((-1L));
        org.joda.time.Chronology chronology41 = dateMidnight40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.secondOfMinute();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology41);
        boolean boolean44 = yearMonthDay35.isEqual((org.joda.time.ReadablePartial) localDate43);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        java.lang.String str48 = dateTimeZone46.getNameKey((long) (-1));
        long long50 = dateTimeZone46.convertUTCToLocal((long) 5);
        org.joda.time.DateMidnight dateMidnight51 = localDate43.toDateMidnight(dateTimeZone46);
        org.joda.time.LocalDate localDate53 = localDate43.plusDays(53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.plus((-1L));
        org.joda.time.Chronology chronology59 = dateMidnight58.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.hours();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.dayOfYear();
        org.joda.time.DurationField durationField63 = chronology59.minutes();
        org.joda.time.YearMonthDay yearMonthDay64 = new org.joda.time.YearMonthDay((java.lang.Object) localDate43, chronology59);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone66);
        java.util.Date date68 = dateMidnight67.toDate();
        org.joda.time.YearMonthDay yearMonthDay69 = dateMidnight67.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.plus((-1L));
        org.joda.time.Chronology chronology75 = dateMidnight74.getChronology();
        org.joda.time.DateTimeField dateTimeField76 = chronology75.secondOfMinute();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate(chronology75);
        org.joda.time.DurationField durationField78 = chronology75.days();
        org.joda.time.YearMonthDay yearMonthDay79 = yearMonthDay69.withChronologyRetainFields(chronology75);
        org.joda.time.Chronology chronology80 = yearMonthDay79.getChronology();
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight81.minus((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone84 = dateMidnight81.getZone();
        org.joda.time.DateMidnight dateMidnight85 = yearMonthDay79.toDateMidnight(dateTimeZone84);
        java.util.Set<java.lang.String> strSet86 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean87 = dateTimeZone84.equals((java.lang.Object) strSet86);
        org.joda.time.DateTime dateTime88 = yearMonthDay64.toDateTimeAtCurrentTime(dateTimeZone84);
        boolean boolean90 = dateTimeZone84.isStandardOffset((long) (-1974));
        org.joda.time.DateTime dateTime91 = dateTime27.withZone(dateTimeZone84);
        org.joda.time.YearMonthDay yearMonthDay92 = new org.joda.time.YearMonthDay(dateTimeZone84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime27", (dateTime19.compareTo(dateTime27) == 0) == dateTime19.equals(dateTime27));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        int int4 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime6 = dateTime1.minusSeconds((int) (short) -1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) 34, 33330867);
        org.joda.time.Instant instant10 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime6.withYear(13);
        int int13 = dateTime12.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant10", (dateTime6.compareTo(instant10) == 0) == dateTime6.equals(instant10));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((-1L));
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        boolean boolean9 = dateMidnight6.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property10 = dateMidnight6.centuryOfEra();
        java.lang.String str11 = property10.getAsText();
        org.joda.time.DateMidnight dateMidnight12 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.clockhourOfDay();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight12.withChronology(chronology18);
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (byte) -1, chronology18);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.halfdayOfDay();
        org.joda.time.Chronology chronology24 = chronology18.withUTC();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) 575, chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minus((long) 43);
        org.joda.time.DateMidnight.Property property28 = dateMidnight25.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight6 and dateMidnight27", (dateMidnight6.compareTo(dateMidnight27) == 0) == dateMidnight6.equals(dateMidnight27));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.monthOfYear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.minus(readableDuration10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) dateTime11, chronology23);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay4.withChronologyRetainFields(chronology23);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        int int27 = calendar26.getFirstDayOfWeek();
        int int28 = calendar26.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone30);
        java.util.Date date32 = dateMidnight31.toDate();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone34);
        java.util.Date date36 = dateMidnight35.toDate();
        boolean boolean37 = date32.before(date36);
        int int38 = date32.getMonth();
        calendar26.setTime(date32);
        java.util.TimeZone timeZone40 = calendar26.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateMidnight dateMidnight42 = yearMonthDay4.toDateMidnight(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.plus((-1L));
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight45.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight45.minusMonths((int) (short) 1);
        org.joda.time.DateMidnight.Property property52 = dateMidnight51.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.plus((-1L));
        org.joda.time.Chronology chronology58 = dateMidnight57.getChronology();
        boolean boolean60 = dateMidnight57.isBefore((long) ' ');
        org.joda.time.LocalDate localDate61 = dateMidnight57.toLocalDate();
        int int62 = property52.getDifference((org.joda.time.ReadableInstant) dateMidnight57);
        org.joda.time.Instant instant63 = dateMidnight57.toInstant();
        org.joda.time.DateTimeZone dateTimeZone64 = instant63.getZone();
        org.joda.time.DateMidnight dateMidnight65 = yearMonthDay4.toDateMidnight(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and instant63", (dateMidnight17.compareTo(instant63) == 0) == dateMidnight17.equals(instant63));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay4.withPeriodAdded(readablePeriod5, 11);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay9 = property8.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay10 = property8.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        int int16 = dateTime15.getSecondOfMinute();
        org.joda.time.DateTime.Property property17 = dateTime15.dayOfYear();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime19 = property17.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        boolean boolean24 = dateTimeZone22.isStandardOffset(252L);
        long long26 = dateTimeZone22.nextTransition((long) 26);
        org.joda.time.DateTime dateTime27 = dateTime19.withZone(dateTimeZone22);
        int int28 = property8.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone30);
        java.util.Date date32 = dateMidnight31.toDate();
        org.joda.time.YearMonthDay yearMonthDay33 = dateMidnight31.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay33.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.plus((-1L));
        org.joda.time.Chronology chronology41 = dateMidnight40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.secondOfMinute();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology41);
        boolean boolean44 = yearMonthDay35.isEqual((org.joda.time.ReadablePartial) localDate43);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        java.lang.String str48 = dateTimeZone46.getNameKey((long) (-1));
        long long50 = dateTimeZone46.convertUTCToLocal((long) 5);
        org.joda.time.DateMidnight dateMidnight51 = localDate43.toDateMidnight(dateTimeZone46);
        org.joda.time.LocalDate localDate53 = localDate43.plusDays(53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.plus((-1L));
        org.joda.time.Chronology chronology59 = dateMidnight58.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.hours();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.dayOfYear();
        org.joda.time.DurationField durationField63 = chronology59.minutes();
        org.joda.time.YearMonthDay yearMonthDay64 = new org.joda.time.YearMonthDay((java.lang.Object) localDate43, chronology59);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone66);
        java.util.Date date68 = dateMidnight67.toDate();
        org.joda.time.YearMonthDay yearMonthDay69 = dateMidnight67.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.plus((-1L));
        org.joda.time.Chronology chronology75 = dateMidnight74.getChronology();
        org.joda.time.DateTimeField dateTimeField76 = chronology75.secondOfMinute();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate(chronology75);
        org.joda.time.DurationField durationField78 = chronology75.days();
        org.joda.time.YearMonthDay yearMonthDay79 = yearMonthDay69.withChronologyRetainFields(chronology75);
        org.joda.time.Chronology chronology80 = yearMonthDay79.getChronology();
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight81.minus((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone84 = dateMidnight81.getZone();
        org.joda.time.DateMidnight dateMidnight85 = yearMonthDay79.toDateMidnight(dateTimeZone84);
        java.util.Set<java.lang.String> strSet86 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean87 = dateTimeZone84.equals((java.lang.Object) strSet86);
        org.joda.time.DateTime dateTime88 = yearMonthDay64.toDateTimeAtCurrentTime(dateTimeZone84);
        boolean boolean90 = dateTimeZone84.isStandardOffset((long) (-1974));
        org.joda.time.DateTime dateTime91 = dateTime27.withZone(dateTimeZone84);
        org.joda.time.DateTime.Property property92 = dateTime91.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime27", (dateTime19.compareTo(dateTime27) == 0) == dateTime19.equals(dateTime27));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus(readablePeriod3);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.year();
        org.joda.time.DateMidnight dateMidnight7 = property5.addWrapFieldToCopy(19);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((-1L), dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.plus(readableDuration11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.plus(readableDuration15);
        int int17 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime20 = property18.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.DateTime dateTime21 = property18.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime22 = property18.roundHalfFloorCopy();
        org.joda.time.TimeOfDay timeOfDay23 = dateTime22.toTimeOfDay();
        boolean boolean24 = dateMidnight7.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property25 = dateTime22.hourOfDay();
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minus((long) (-1));
        org.joda.time.Chronology chronology29 = dateMidnight28.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minus(readablePeriod31);
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay32.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay34.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minusMinutes(12);
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.plusMinutes(8);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.plus((-1L));
        org.joda.time.Chronology chronology48 = dateMidnight47.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.hours();
        org.joda.time.DurationField durationField50 = chronology48.weekyears();
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay40.withChronologyRetainFields(chronology48);
        org.joda.time.DateTime dateTime52 = dateTime22.withFields((org.joda.time.ReadablePartial) timeOfDay40);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight57.plus((-1L));
        org.joda.time.Chronology chronology60 = dateMidnight59.getChronology();
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime54.toMutableDateTime(chronology60);
        org.joda.time.Chronology chronology62 = dateTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.dayOfWeek();
        org.joda.time.DurationField durationField64 = chronology62.eras();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property69 = dateTime66.monthOfYear();
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.DateTime dateTime71 = dateTime66.minus(readableDuration70);
        org.joda.time.DateTime.Property property72 = dateTime66.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime dateTime75 = dateTime66.withField(dateTimeFieldType73, (int) ' ');
        org.joda.time.DateTime dateTime77 = dateTime75.withSecondOfMinute(15);
        org.joda.time.DateTime dateTime79 = dateTime77.withYearOfCentury(14);
        org.joda.time.DateTime.Property property80 = dateTime77.yearOfCentury();
        java.util.TimeZone timeZone81 = null;
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forTimeZone(timeZone81);
        java.lang.String str84 = dateTimeZone82.getNameKey((long) (-1));
        long long86 = dateTimeZone82.convertUTCToLocal((long) 5);
        java.util.Locale locale88 = null;
        java.lang.String str89 = dateTimeZone82.getName((long) 0, locale88);
        java.lang.String str90 = dateTimeZone82.toString();
        org.joda.time.DateTime dateTime91 = new org.joda.time.DateTime((java.lang.Object) dateTime77, dateTimeZone82);
        org.joda.time.Chronology chronology92 = chronology62.withZone(dateTimeZone82);
        org.joda.time.DateTime dateTime93 = dateTime52.toDateTime(dateTimeZone82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField49 and durationField64", Math.signum(durationField49.compareTo(durationField64)) == -Math.signum(durationField64.compareTo(durationField49)));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((-1L));
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.hours();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType0.getField(chronology6);
        org.joda.time.DurationField durationField9 = chronology6.seconds();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(59);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minus((long) (-1));
        org.joda.time.Chronology chronology15 = dateMidnight14.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minus(readablePeriod17);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusMinutes(1970);
        org.joda.time.Chronology chronology23 = timeOfDay20.getChronology();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minus((long) (-1));
        org.joda.time.Chronology chronology27 = dateMidnight26.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minus(readablePeriod29);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay32.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay32.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone41);
        java.util.Date date43 = dateMidnight42.toDate();
        org.joda.time.DateMidnight.Property property44 = dateMidnight42.dayOfWeek();
        org.joda.time.Interval interval45 = new org.joda.time.Interval(readableDuration39, (org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean49 = interval45.isBefore((org.joda.time.ReadableInterval) interval48);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = interval45.toPeriod(periodType50);
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay38.minus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay20.minus((org.joda.time.ReadablePeriod) period51);
        boolean boolean54 = dateTimeZone11.equals((java.lang.Object) period51);
        org.joda.time.MutablePeriod mutablePeriod55 = period51.toMutablePeriod();
        int[] intArray58 = chronology6.get((org.joda.time.ReadablePeriod) period51, (long) (-626), 25260000L);
        org.joda.time.DurationField durationField59 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField7, and durationField9", !(durationField59.compareTo(durationField7) == 0) || (Math.signum(durationField59.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.DateMidnight.Property property4 = dateMidnight2.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate6 = dateMidnight5.toLocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plus((-1L));
        org.joda.time.Chronology chronology14 = dateMidnight13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate20 = localDate16.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str23 = dateTimeZone22.toString();
        org.joda.time.DateTime dateTime24 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.LocalDate localDate26 = localDate20.withWeekyear(19);
        org.joda.time.LocalTime localTime27 = null;
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str31 = dateTimeZone29.getNameKey((long) (-1));
        org.joda.time.DateTime dateTime32 = localDate20.toDateTime(localTime27, dateTimeZone29);
        java.lang.String str33 = dateTimeZone29.getID();
        org.joda.time.DateTime dateTime34 = localDate8.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime39 = dateTime38.toDateTimeISO();
        int int40 = dateTime39.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.toDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime39.withMinuteOfHour(8);
        org.joda.time.DateTime dateTime46 = dateTime39.withYearOfCentury(34);
        org.joda.time.DateTime.Property property47 = dateTime46.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.plus((-1L));
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight50.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime59 = dateTime58.toDateTimeISO();
        int int60 = dateTime59.getSecondOfMinute();
        org.joda.time.DateTime.Property property61 = dateTime59.dayOfYear();
        boolean boolean62 = dateMidnight50.isAfter((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime.Property property63 = dateTime59.era();
        org.joda.time.Interval interval66 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone69);
        java.util.Date date71 = dateMidnight70.toDate();
        org.joda.time.DateMidnight.Property property72 = dateMidnight70.dayOfWeek();
        org.joda.time.Interval interval73 = new org.joda.time.Interval(readableDuration67, (org.joda.time.ReadableInstant) dateMidnight70);
        boolean boolean74 = interval66.isAfter((org.joda.time.ReadableInterval) interval73);
        org.joda.time.Duration duration75 = interval73.toDuration();
        org.joda.time.DateTime dateTime77 = dateTime59.withDurationAdded((org.joda.time.ReadableDuration) duration75, 52);
        org.joda.time.DateTime dateTime79 = dateTime46.withDurationAdded((org.joda.time.ReadableDuration) duration75, 6);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableDuration) duration75);
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.DateMidnight dateMidnight83 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone82);
        java.util.Date date84 = dateMidnight83.toDate();
        org.joda.time.DateMidnight.Property property85 = dateMidnight83.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight86 = property85.roundFloorCopy();
        boolean boolean87 = dateMidnight86.isBeforeNow();
        boolean boolean88 = dateTime34.isAfter((org.joda.time.ReadableInstant) dateMidnight86);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime90 = dateMidnight86.toDateTime(dateTimeZone89);
        org.joda.time.DateMidnight dateMidnight92 = dateMidnight86.minusYears(131);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime90", (dateMidnight2.compareTo(dateTime90) == 0) == dateMidnight2.equals(dateTime90));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getFirstDayOfWeek();
        int int2 = calendar0.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone4);
        java.util.Date date6 = dateMidnight5.toDate();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        java.util.Date date10 = dateMidnight9.toDate();
        boolean boolean11 = date6.before(date10);
        int int12 = date6.getMonth();
        calendar0.setTime(date6);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        java.util.Date date18 = dateMidnight17.toDate();
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.dayOfWeek();
        org.joda.time.Interval interval20 = new org.joda.time.Interval(readableDuration14, (org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight17.minusDays(1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone24);
        java.util.Date date26 = dateMidnight25.toDate();
        org.joda.time.YearMonthDay yearMonthDay27 = dateMidnight25.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay27.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        boolean boolean38 = yearMonthDay29.isEqual((org.joda.time.ReadablePartial) localDate37);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.lang.String str42 = dateTimeZone40.getNameKey((long) (-1));
        long long44 = dateTimeZone40.convertUTCToLocal((long) 5);
        org.joda.time.DateMidnight dateMidnight45 = localDate37.toDateMidnight(dateTimeZone40);
        org.joda.time.DateTime dateTime46 = dateMidnight22.toDateTime(dateTimeZone40);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) calendar0, dateTimeZone40);
        java.lang.String str49 = dateTimeZone40.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on yearMonthDay27 and localDate48", (yearMonthDay27.compareTo(localDate48) == 0) == yearMonthDay27.equals(localDate48));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        java.util.Date date13 = dateMidnight12.toDate();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone15);
        java.util.Date date17 = dateMidnight16.toDate();
        boolean boolean18 = date13.before(date17);
        int int19 = date13.getDay();
        int int20 = date13.getHours();
        date13.setSeconds((int) '4');
        boolean boolean23 = dateTime8.equals((java.lang.Object) date13);
        org.joda.time.DateTime dateTime25 = dateTime8.withYearOfEra((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime8.toMutableDateTime(dateTimeZone28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        int int31 = mutableDateTime29.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant30", (dateTime6.compareTo(instant30) == 0) == dateTime6.equals(instant30));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime3.centuryOfEra();
        org.joda.time.DateTime dateTime6 = property4.addToCopy((long) 16);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) 25);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1, dateTimeZone14);
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) 21, 281723794000L, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime6.withZone(dateTimeZone14);
        boolean boolean19 = dateTimeZone14.isStandardOffset((-2082844800000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime17", (dateTime6.compareTo(dateTime17) == 0) == dateTime6.equals(dateTime17));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((-1L));
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        boolean boolean8 = dateMidnight5.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property9 = dateMidnight5.centuryOfEra();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DateMidnight dateMidnight11 = property9.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plus((-1L));
        org.joda.time.Chronology chronology17 = dateMidnight16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.clockhourOfDay();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight11.withChronology(chronology17);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (byte) -1, chronology17);
        org.joda.time.DateTimeField dateTimeField22 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.yearOfCentury();
        int int25 = dateTimeField23.getLeapAmount((long) 6);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone27);
        java.util.Date date29 = dateMidnight28.toDate();
        org.joda.time.YearMonthDay yearMonthDay30 = dateMidnight28.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property35 = dateTime32.monthOfYear();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.minus(readableDuration36);
        org.joda.time.DateMidnight dateMidnight38 = dateTime37.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.plus((-1L));
        org.joda.time.Chronology chronology44 = dateMidnight43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.secondOfMinute();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(chronology44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.Interval interval48 = localDate46.toInterval(dateTimeZone47);
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((java.lang.Object) dateTime37, chronology49);
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay30.withChronologyRetainFields(chronology49);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray52 = yearMonthDay51.getFieldTypes();
        int int53 = dateTimeField23.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay51);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTime dateTime57 = dateTime55.plus(readableDuration56);
        int int58 = dateTime55.getWeekyear();
        org.joda.time.DateTime dateTime60 = dateTime55.minusSeconds((int) (short) -1);
        org.joda.time.DateTime dateTime63 = dateTime60.withDurationAdded((long) 34, 33330867);
        org.joda.time.Instant instant64 = dateTime60.toInstant();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone66);
        java.util.Date date68 = dateMidnight67.toDate();
        org.joda.time.DateMidnight.Property property69 = dateMidnight67.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight70 = property69.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property69.getFieldType();
        org.joda.time.DateMidnight dateMidnight72 = property69.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight73 = property69.withMaximumValue();
        boolean boolean74 = dateTime60.isEqual((org.joda.time.ReadableInstant) dateMidnight73);
        org.joda.time.DateTimeZone dateTimeZone75 = dateTime60.getZone();
        org.joda.time.Interval interval76 = yearMonthDay51.toInterval(dateTimeZone75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and instant64", (dateTime60.compareTo(instant64) == 0) == dateTime60.equals(instant64));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minus((long) (-1));
        org.joda.time.Chronology chronology13 = dateMidnight12.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minus(readablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay18.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone27);
        java.util.Date date29 = dateMidnight28.toDate();
        org.joda.time.DateMidnight.Property property30 = dateMidnight28.dayOfWeek();
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableDuration25, (org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean35 = interval31.isBefore((org.joda.time.ReadableInterval) interval34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = interval31.toPeriod(periodType36);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay24.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.DateTime dateTime40 = dateTime2.withPeriodAdded((org.joda.time.ReadablePeriod) period37, 19);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minus((long) (-1));
        org.joda.time.Chronology chronology44 = dateMidnight43.getChronology();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(chronology44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.minus(readablePeriod46);
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay47.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.minusMinutes(1970);
        org.joda.time.Chronology chronology52 = timeOfDay49.getChronology();
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minus((long) (-1));
        org.joda.time.Chronology chronology56 = dateMidnight55.getChronology();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(chronology56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay57.minus(readablePeriod58);
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay59.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay61.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay61.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay65.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone70);
        java.util.Date date72 = dateMidnight71.toDate();
        org.joda.time.DateMidnight.Property property73 = dateMidnight71.dayOfWeek();
        org.joda.time.Interval interval74 = new org.joda.time.Interval(readableDuration68, (org.joda.time.ReadableInstant) dateMidnight71);
        org.joda.time.Interval interval77 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean78 = interval74.isBefore((org.joda.time.ReadableInterval) interval77);
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.Period period80 = interval74.toPeriod(periodType79);
        org.joda.time.TimeOfDay timeOfDay81 = timeOfDay67.minus((org.joda.time.ReadablePeriod) period80);
        org.joda.time.PeriodType periodType82 = period80.getPeriodType();
        int[] intArray85 = chronology52.get((org.joda.time.ReadablePeriod) period80, (long) (-1), (long) 24);
        org.joda.time.DateTimeField dateTimeField86 = chronology52.yearOfEra();
        org.joda.time.DateTime dateTime87 = dateTime2.toDateTime(chronology52);
        org.joda.time.DateTime dateTime89 = dateTime87.withYear(54);
        org.joda.time.MutableDateTime mutableDateTime90 = dateTime87.toMutableDateTime();
        org.joda.time.Instant instant91 = mutableDateTime90.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime87", (dateTime2.compareTo(dateTime87) == 0) == dateTime2.equals(dateTime87));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfYear();
        org.joda.time.DurationField durationField9 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.millisOfDay();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(chronology5);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.hourOfDay();
        java.lang.String str13 = property12.getName();
        org.joda.time.TimeOfDay timeOfDay14 = property12.withMinimumValue();
        java.lang.String str15 = property12.getAsString();
        org.joda.time.DurationField durationField16 = property12.getDurationField();
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minus((long) (-1));
        org.joda.time.Chronology chronology20 = dateMidnight19.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minus(readablePeriod22);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMinutes(1);
        java.lang.String str27 = timeOfDay23.toString("+00:00");
        org.joda.time.DateTime dateTime28 = timeOfDay23.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay23.minusMinutes(35);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.plusSeconds(29);
        int int33 = property12.compareTo((org.joda.time.ReadablePartial) timeOfDay30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField16", (durationField6.compareTo(durationField16) == 0) == durationField6.equals(durationField16));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.monthOfYear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.minus(readableDuration10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) dateTime11, chronology23);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay4.withChronologyRetainFields(chronology23);
        org.joda.time.DurationField durationField26 = chronology23.seconds();
        org.joda.time.DurationField durationField27 = chronology23.eras();
        java.lang.String str28 = chronology23.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField27", Math.signum(durationField26.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField26)));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        int int12 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime.Property property13 = dateTime11.dayOfYear();
        boolean boolean14 = dateMidnight2.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        java.util.Date date18 = dateMidnight17.toDate();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.minusWeeks(22);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone23);
        java.util.Date date25 = dateMidnight24.toDate();
        org.joda.time.DateMidnight.Property property26 = dateMidnight24.dayOfWeek();
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readableDuration21, (org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean31 = interval27.isBefore((org.joda.time.ReadableInterval) interval30);
        org.joda.time.DateTime dateTime32 = interval27.getEnd();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone38);
        java.util.Date date40 = dateMidnight39.toDate();
        org.joda.time.DateMidnight.Property property41 = dateMidnight39.dayOfWeek();
        org.joda.time.Interval interval42 = new org.joda.time.Interval(readableDuration36, (org.joda.time.ReadableInstant) dateMidnight39);
        boolean boolean43 = interval35.isAfter((org.joda.time.ReadableInterval) interval42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((-1L), dateTimeZone45);
        org.joda.time.Interval interval47 = interval35.withStart((org.joda.time.ReadableInstant) dateTime46);
        boolean boolean48 = interval27.overlaps((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Duration duration49 = interval27.toDuration();
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight20.withDurationAdded((org.joda.time.ReadableDuration) duration49, 24);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight2.withDurationAdded((org.joda.time.ReadableDuration) duration49, 19);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DateMidnight.Property property55 = dateMidnight53.property(dateTimeFieldType54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean57 = dateMidnight53.isSupported(dateTimeFieldType56);
        java.util.GregorianCalendar gregorianCalendar58 = dateMidnight53.toGregorianCalendar();
        org.joda.time.Instant instant59 = dateMidnight53.toInstant();
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight53.withYear(1222);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight53 and instant59", (dateMidnight53.compareTo(instant59) == 0) == dateMidnight53.equals(instant59));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime.Property property10 = dateTime8.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime8.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime14 = dateTime8.withField(dateTimeFieldType12, (int) 'a');
        org.joda.time.DateTime dateTime16 = dateTime14.withMillis((-60522647076000L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours(59);
        long long22 = dateTimeZone18.convertLocalToUTC((long) (byte) 1, false, (long) (short) -1);
        org.joda.time.DateMidnight dateMidnight23 = org.joda.time.DateMidnight.now(dateTimeZone18);
        org.joda.time.DateTime dateTime24 = dateTime16.withZone(dateTimeZone18);
        long long27 = dateTimeZone18.adjustOffset(999L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime24", (dateTime16.compareTo(dateTime24) == 0) == dateTime16.equals(dateTime24));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = dateTime3.plusHours(44);
        org.joda.time.DateTime dateTime8 = dateTime3.plusMonths(10);
        int int9 = dateTime3.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        java.util.Date date13 = dateMidnight12.toDate();
        org.joda.time.YearMonthDay yearMonthDay14 = dateMidnight12.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(59);
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime3.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime18", (dateTime3.compareTo(mutableDateTime18) == 0) == dateTime3.equals(mutableDateTime18));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.minus((long) (-1));
        org.joda.time.Chronology chronology3 = dateMidnight2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DurationField durationField7 = chronology3.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        int int12 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime.Property property13 = dateTime11.dayOfYear();
        boolean boolean14 = dateMidnight2.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        java.util.Date date18 = dateMidnight17.toDate();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.minusWeeks(22);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone23);
        java.util.Date date25 = dateMidnight24.toDate();
        org.joda.time.DateMidnight.Property property26 = dateMidnight24.dayOfWeek();
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readableDuration21, (org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean31 = interval27.isBefore((org.joda.time.ReadableInterval) interval30);
        org.joda.time.DateTime dateTime32 = interval27.getEnd();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone38);
        java.util.Date date40 = dateMidnight39.toDate();
        org.joda.time.DateMidnight.Property property41 = dateMidnight39.dayOfWeek();
        org.joda.time.Interval interval42 = new org.joda.time.Interval(readableDuration36, (org.joda.time.ReadableInstant) dateMidnight39);
        boolean boolean43 = interval35.isAfter((org.joda.time.ReadableInterval) interval42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((-1L), dateTimeZone45);
        org.joda.time.Interval interval47 = interval35.withStart((org.joda.time.ReadableInstant) dateTime46);
        boolean boolean48 = interval27.overlaps((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Duration duration49 = interval27.toDuration();
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight20.withDurationAdded((org.joda.time.ReadableDuration) duration49, 24);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight2.withDurationAdded((org.joda.time.ReadableDuration) duration49, 19);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone59);
        java.util.Date date61 = dateMidnight60.toDate();
        org.joda.time.DateMidnight.Property property62 = dateMidnight60.dayOfWeek();
        org.joda.time.Interval interval63 = new org.joda.time.Interval(readableDuration57, (org.joda.time.ReadableInstant) dateMidnight60);
        boolean boolean64 = interval56.isAfter((org.joda.time.ReadableInterval) interval63);
        org.joda.time.Duration duration65 = interval63.toDuration();
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight53.withDurationAdded((org.joda.time.ReadableDuration) duration65, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration65, readableInstant68);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.plus((-1L));
        org.joda.time.Chronology chronology75 = dateMidnight74.getChronology();
        boolean boolean77 = dateMidnight74.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property78 = dateMidnight74.centuryOfEra();
        java.lang.String str79 = property78.getAsText();
        org.joda.time.DateMidnight dateMidnight80 = property78.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight81 = property78.roundHalfEvenCopy();
        org.joda.time.Interval interval82 = interval69.withStart((org.joda.time.ReadableInstant) dateMidnight81);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight81.plusYears((-19034));
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 41);
        org.joda.time.DateTime dateTime88 = dateMidnight81.toDateTime(dateTimeZone87);
        org.joda.time.DateMidnight dateMidnight90 = dateMidnight81.withYear(2026);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight80 and dateTime88", (dateMidnight80.compareTo(dateTime88) == 0) == dateMidnight80.equals(dateTime88));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        java.util.Date date13 = dateMidnight12.toDate();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone15);
        java.util.Date date17 = dateMidnight16.toDate();
        boolean boolean18 = date13.before(date17);
        int int19 = date13.getDay();
        int int20 = date13.getHours();
        date13.setSeconds((int) '4');
        boolean boolean23 = dateTime8.equals((java.lang.Object) date13);
        org.joda.time.DateTime dateTime25 = dateTime8.withYearOfEra((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime8.toMutableDateTime(dateTimeZone28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        int int31 = mutableDateTime29.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant30", (dateTime6.compareTo(instant30) == 0) == dateTime6.equals(instant30));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((-1L), dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.plus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minus((long) (-1));
        org.joda.time.Chronology chronology13 = dateMidnight12.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minus(readablePeriod15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay18.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone27);
        java.util.Date date29 = dateMidnight28.toDate();
        org.joda.time.DateMidnight.Property property30 = dateMidnight28.dayOfWeek();
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableDuration25, (org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean35 = interval31.isBefore((org.joda.time.ReadableInterval) interval34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = interval31.toPeriod(periodType36);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay24.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.DateTime dateTime40 = dateTime2.withPeriodAdded((org.joda.time.ReadablePeriod) period37, 19);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minus((long) (-1));
        org.joda.time.Chronology chronology44 = dateMidnight43.getChronology();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(chronology44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.minus(readablePeriod46);
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay47.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.minusMinutes(1970);
        org.joda.time.Chronology chronology52 = timeOfDay49.getChronology();
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minus((long) (-1));
        org.joda.time.Chronology chronology56 = dateMidnight55.getChronology();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(chronology56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay57.minus(readablePeriod58);
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay59.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay61.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay61.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay65.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone70);
        java.util.Date date72 = dateMidnight71.toDate();
        org.joda.time.DateMidnight.Property property73 = dateMidnight71.dayOfWeek();
        org.joda.time.Interval interval74 = new org.joda.time.Interval(readableDuration68, (org.joda.time.ReadableInstant) dateMidnight71);
        org.joda.time.Interval interval77 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean78 = interval74.isBefore((org.joda.time.ReadableInterval) interval77);
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.Period period80 = interval74.toPeriod(periodType79);
        org.joda.time.TimeOfDay timeOfDay81 = timeOfDay67.minus((org.joda.time.ReadablePeriod) period80);
        org.joda.time.PeriodType periodType82 = period80.getPeriodType();
        int[] intArray85 = chronology52.get((org.joda.time.ReadablePeriod) period80, (long) (-1), (long) 24);
        org.joda.time.DateTimeField dateTimeField86 = chronology52.yearOfEra();
        org.joda.time.DateTime dateTime87 = dateTime2.toDateTime(chronology52);
        org.joda.time.DateTime dateTime89 = dateTime87.plusMinutes(292278993);
        int int90 = dateTime89.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime87", (dateTime2.compareTo(dateTime87) == 0) == dateTime2.equals(dateTime87));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        int int12 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime.Property property13 = dateTime11.dayOfYear();
        boolean boolean14 = dateMidnight2.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        java.util.Date date18 = dateMidnight17.toDate();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.minusWeeks(22);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone23);
        java.util.Date date25 = dateMidnight24.toDate();
        org.joda.time.DateMidnight.Property property26 = dateMidnight24.dayOfWeek();
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readableDuration21, (org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean31 = interval27.isBefore((org.joda.time.ReadableInterval) interval30);
        org.joda.time.DateTime dateTime32 = interval27.getEnd();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone38);
        java.util.Date date40 = dateMidnight39.toDate();
        org.joda.time.DateMidnight.Property property41 = dateMidnight39.dayOfWeek();
        org.joda.time.Interval interval42 = new org.joda.time.Interval(readableDuration36, (org.joda.time.ReadableInstant) dateMidnight39);
        boolean boolean43 = interval35.isAfter((org.joda.time.ReadableInterval) interval42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((-1L), dateTimeZone45);
        org.joda.time.Interval interval47 = interval35.withStart((org.joda.time.ReadableInstant) dateTime46);
        boolean boolean48 = interval27.overlaps((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Duration duration49 = interval27.toDuration();
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight20.withDurationAdded((org.joda.time.ReadableDuration) duration49, 24);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight2.withDurationAdded((org.joda.time.ReadableDuration) duration49, 19);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone59);
        java.util.Date date61 = dateMidnight60.toDate();
        org.joda.time.DateMidnight.Property property62 = dateMidnight60.dayOfWeek();
        org.joda.time.Interval interval63 = new org.joda.time.Interval(readableDuration57, (org.joda.time.ReadableInstant) dateMidnight60);
        boolean boolean64 = interval56.isAfter((org.joda.time.ReadableInterval) interval63);
        org.joda.time.Duration duration65 = interval63.toDuration();
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight53.withDurationAdded((org.joda.time.ReadableDuration) duration65, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration65, readableInstant68);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.plus((-1L));
        org.joda.time.Chronology chronology75 = dateMidnight74.getChronology();
        boolean boolean77 = dateMidnight74.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property78 = dateMidnight74.centuryOfEra();
        java.lang.String str79 = property78.getAsText();
        org.joda.time.DateMidnight dateMidnight80 = property78.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight81 = property78.roundHalfEvenCopy();
        org.joda.time.Interval interval82 = interval69.withStart((org.joda.time.ReadableInstant) dateMidnight81);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight81.plusYears((-19034));
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 41);
        org.joda.time.DateTime dateTime88 = dateMidnight81.toDateTime(dateTimeZone87);
        java.lang.String str89 = dateTimeZone87.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight80 and dateTime88", (dateMidnight80.compareTo(dateTime88) == 0) == dateMidnight80.equals(dateTime88));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((-1L));
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.secondOfMinute();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DurationField durationField9 = chronology6.days();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 11, chronology6);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.year();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology6);
        java.util.GregorianCalendar gregorianCalendar13 = dateTime12.toGregorianCalendar();
        org.joda.time.DateTime dateTime15 = dateTime12.minusDays(0);
        org.joda.time.DateTime dateTime17 = dateTime12.plusMillis(100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.plus((-1L));
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight20.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight20.minusMonths((int) (short) 1);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        int int28 = calendar27.getFirstDayOfWeek();
        int int29 = calendar27.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        java.util.Date date33 = dateMidnight32.toDate();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone35);
        java.util.Date date37 = dateMidnight36.toDate();
        boolean boolean38 = date33.before(date37);
        int int39 = date33.getMonth();
        calendar27.setTime(date33);
        java.util.TimeZone timeZone41 = calendar27.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight26.withZoneRetainFields(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = dateTime12.withZoneRetainFields(dateTimeZone42);
        int int45 = dateTime44.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight26 and dateMidnight43", (dateMidnight26.compareTo(dateMidnight43) == 0) == dateMidnight26.equals(dateMidnight43));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((-1L));
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.plusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTimeISO();
        int int14 = dateTime13.getSecondOfMinute();
        org.joda.time.DateTime.Property property15 = dateTime13.dayOfYear();
        boolean boolean16 = dateMidnight4.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone18);
        java.util.Date date20 = dateMidnight19.toDate();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.minusWeeks(22);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone25);
        java.util.Date date27 = dateMidnight26.toDate();
        org.joda.time.DateMidnight.Property property28 = dateMidnight26.dayOfWeek();
        org.joda.time.Interval interval29 = new org.joda.time.Interval(readableDuration23, (org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean33 = interval29.isBefore((org.joda.time.ReadableInterval) interval32);
        org.joda.time.DateTime dateTime34 = interval29.getEnd();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone40);
        java.util.Date date42 = dateMidnight41.toDate();
        org.joda.time.DateMidnight.Property property43 = dateMidnight41.dayOfWeek();
        org.joda.time.Interval interval44 = new org.joda.time.Interval(readableDuration38, (org.joda.time.ReadableInstant) dateMidnight41);
        boolean boolean45 = interval37.isAfter((org.joda.time.ReadableInterval) interval44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((-1L), dateTimeZone47);
        org.joda.time.Interval interval49 = interval37.withStart((org.joda.time.ReadableInstant) dateTime48);
        boolean boolean50 = interval29.overlaps((org.joda.time.ReadableInterval) interval37);
        org.joda.time.Duration duration51 = interval29.toDuration();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight22.withDurationAdded((org.joda.time.ReadableDuration) duration51, 24);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight4.withDurationAdded((org.joda.time.ReadableDuration) duration51, 19);
        org.joda.time.Interval interval58 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone61);
        java.util.Date date63 = dateMidnight62.toDate();
        org.joda.time.DateMidnight.Property property64 = dateMidnight62.dayOfWeek();
        org.joda.time.Interval interval65 = new org.joda.time.Interval(readableDuration59, (org.joda.time.ReadableInstant) dateMidnight62);
        boolean boolean66 = interval58.isAfter((org.joda.time.ReadableInterval) interval65);
        org.joda.time.Duration duration67 = interval65.toDuration();
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight55.withDurationAdded((org.joda.time.ReadableDuration) duration67, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Interval interval71 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration67, readableInstant70);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone73);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight74.plus((-1L));
        org.joda.time.Chronology chronology77 = dateMidnight76.getChronology();
        boolean boolean79 = dateMidnight76.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property80 = dateMidnight76.centuryOfEra();
        java.lang.String str81 = property80.getAsText();
        org.joda.time.DateMidnight dateMidnight82 = property80.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight83 = property80.roundHalfEvenCopy();
        org.joda.time.Interval interval84 = interval71.withStart((org.joda.time.ReadableInstant) dateMidnight83);
        org.joda.time.DateMidnight dateMidnight86 = dateMidnight83.plusYears((-19034));
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 41);
        org.joda.time.DateTime dateTime90 = dateMidnight83.toDateTime(dateTimeZone89);
        org.joda.time.Interval interval91 = new org.joda.time.Interval(1644572307634L, 1644572405721L, dateTimeZone89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight82 and dateTime90", (dateMidnight82.compareTo(dateTime90) == 0) == dateMidnight82.equals(dateTime90));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay4.withPeriodAdded(readablePeriod5, 11);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay9 = property8.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay10 = property8.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        int int16 = dateTime15.getSecondOfMinute();
        org.joda.time.DateTime.Property property17 = dateTime15.dayOfYear();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime19 = property17.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        boolean boolean24 = dateTimeZone22.isStandardOffset(252L);
        long long26 = dateTimeZone22.nextTransition((long) 26);
        org.joda.time.DateTime dateTime27 = dateTime19.withZone(dateTimeZone22);
        int int28 = property8.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone30);
        java.util.Date date32 = dateMidnight31.toDate();
        org.joda.time.YearMonthDay yearMonthDay33 = dateMidnight31.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay33.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.plus((-1L));
        org.joda.time.Chronology chronology41 = dateMidnight40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.secondOfMinute();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology41);
        boolean boolean44 = yearMonthDay35.isEqual((org.joda.time.ReadablePartial) localDate43);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        java.lang.String str48 = dateTimeZone46.getNameKey((long) (-1));
        long long50 = dateTimeZone46.convertUTCToLocal((long) 5);
        org.joda.time.DateMidnight dateMidnight51 = localDate43.toDateMidnight(dateTimeZone46);
        org.joda.time.LocalDate localDate53 = localDate43.plusDays(53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.plus((-1L));
        org.joda.time.Chronology chronology59 = dateMidnight58.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.hours();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.dayOfYear();
        org.joda.time.DurationField durationField63 = chronology59.minutes();
        org.joda.time.YearMonthDay yearMonthDay64 = new org.joda.time.YearMonthDay((java.lang.Object) localDate43, chronology59);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone66);
        java.util.Date date68 = dateMidnight67.toDate();
        org.joda.time.YearMonthDay yearMonthDay69 = dateMidnight67.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.plus((-1L));
        org.joda.time.Chronology chronology75 = dateMidnight74.getChronology();
        org.joda.time.DateTimeField dateTimeField76 = chronology75.secondOfMinute();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate(chronology75);
        org.joda.time.DurationField durationField78 = chronology75.days();
        org.joda.time.YearMonthDay yearMonthDay79 = yearMonthDay69.withChronologyRetainFields(chronology75);
        org.joda.time.Chronology chronology80 = yearMonthDay79.getChronology();
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight81.minus((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone84 = dateMidnight81.getZone();
        org.joda.time.DateMidnight dateMidnight85 = yearMonthDay79.toDateMidnight(dateTimeZone84);
        java.util.Set<java.lang.String> strSet86 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean87 = dateTimeZone84.equals((java.lang.Object) strSet86);
        org.joda.time.DateTime dateTime88 = yearMonthDay64.toDateTimeAtCurrentTime(dateTimeZone84);
        boolean boolean90 = dateTimeZone84.isStandardOffset((long) (-1974));
        org.joda.time.DateTime dateTime91 = dateTime27.withZone(dateTimeZone84);
        org.joda.time.LocalDate localDate92 = new org.joda.time.LocalDate(dateTimeZone84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime27", (dateTime19.compareTo(dateTime27) == 0) == dateTime19.equals(dateTime27));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight2.minusMonths((int) (short) 1);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        int int10 = calendar9.getFirstDayOfWeek();
        int int11 = calendar9.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        java.util.Date date15 = dateMidnight14.toDate();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        boolean boolean20 = date15.before(date19);
        int int21 = date15.getMonth();
        calendar9.setTime(date15);
        java.util.TimeZone timeZone23 = calendar9.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight8.withZoneRetainFields(dateTimeZone24);
        org.joda.time.LocalDate localDate26 = dateMidnight8.toLocalDate();
        org.joda.time.LocalDate localDate28 = localDate26.withWeekOfWeekyear(4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and dateMidnight25", (dateMidnight8.compareTo(dateMidnight25) == 0) == dateMidnight8.equals(dateMidnight25));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 5, true);
        org.joda.time.DateMidnight dateMidnight5 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minus(292278994L);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone9);
        java.util.Date date11 = dateMidnight10.toDate();
        org.joda.time.YearMonthDay yearMonthDay12 = dateMidnight10.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DurationField durationField21 = chronology18.days();
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay12.withChronologyRetainFields(chronology18);
        org.joda.time.Chronology chronology23 = yearMonthDay22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.minutes();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology23);
        org.joda.time.DateTimeField dateTimeField26 = chronology23.era();
        int int27 = dateMidnight7.get(dateTimeField26);
        org.joda.time.DurationField durationField28 = dateTimeField26.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField21, and durationField24", !(durationField28.compareTo(durationField21) == 0) || (Math.signum(durationField28.compareTo(durationField24)) == Math.signum(durationField21.compareTo(durationField24))));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((-1L));
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight3.plusWeeks((int) ' ');
        boolean boolean9 = dateMidnight7.equals((java.lang.Object) 100.0f);
        org.joda.time.DateTime dateTime10 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateMidnight7);
        int int11 = dateTime10.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight15.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight15.minusMonths((int) (short) 1);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        int int23 = calendar22.getFirstDayOfWeek();
        int int24 = calendar22.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone26);
        java.util.Date date28 = dateMidnight27.toDate();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone30);
        java.util.Date date32 = dateMidnight31.toDate();
        boolean boolean33 = date28.before(date32);
        int int34 = date28.getMonth();
        calendar22.setTime(date28);
        java.util.TimeZone timeZone36 = calendar22.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight21.withZoneRetainFields(dateTimeZone37);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(50L, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(dateTimeZone37);
        boolean boolean41 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight40.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight21 and dateMidnight38", (dateMidnight21.compareTo(dateMidnight38) == 0) == dateMidnight21.equals(dateMidnight38));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.minus((long) (-1));
        org.joda.time.Chronology chronology3 = dateMidnight2.getChronology();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.DateTime dateTime5 = localDate4.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plus((-1L));
        org.joda.time.Chronology chronology12 = dateMidnight11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.hours();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType6.getField(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime5.withChronology(chronology12);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.YearMonthDay yearMonthDay20 = dateMidnight18.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay20.withPeriodAdded(readablePeriod21, 11);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay20.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay25 = property24.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.plus((-1L));
        org.joda.time.Chronology chronology31 = dateMidnight30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfMinute();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology31);
        org.joda.time.DurationField durationField34 = chronology31.days();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.dayOfWeek();
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay25.withChronologyRetainFields(chronology31);
        org.joda.time.DateTimeField dateTimeField37 = chronology31.clockhourOfDay();
        org.joda.time.DateTime dateTime38 = dateTime15.toDateTime(chronology31);
        org.joda.time.DurationField durationField39 = chronology31.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField13, and durationField34", !(durationField39.compareTo(durationField13) == 0) || (Math.signum(durationField39.compareTo(durationField34)) == Math.signum(durationField13.compareTo(durationField34))));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((-1L));
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight3.plusWeeks((int) ' ');
        boolean boolean9 = dateMidnight7.equals((java.lang.Object) 100.0f);
        org.joda.time.DateTime dateTime10 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateMidnight7);
        org.joda.time.Chronology chronology11 = localDate0.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plus((-1L));
        org.joda.time.Chronology chronology17 = dateMidnight16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.secondOfMinute();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfEra((int) (byte) 10);
        int int22 = localDate19.getYearOfCentury();
        org.joda.time.LocalTime localTime23 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.plus((-1L));
        org.joda.time.Chronology chronology29 = dateMidnight28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.secondOfMinute();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.LocalDate localDate33 = localDate31.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate35 = localDate31.plusYears((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.plus((-1L));
        org.joda.time.Chronology chronology41 = dateMidnight40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.secondOfMinute();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology41);
        org.joda.time.LocalDate localDate45 = localDate43.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate47 = localDate43.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        java.lang.String str50 = dateTimeZone49.toString();
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtCurrentTime(dateTimeZone49);
        boolean boolean52 = dateTimeZone49.isFixed();
        org.joda.time.DateTime dateTime53 = localDate35.toDateTimeAtCurrentTime(dateTimeZone49);
        org.joda.time.DateTime dateTime54 = localDate19.toDateTime(localTime23, dateTimeZone49);
        java.util.TimeZone timeZone55 = dateTimeZone49.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        org.joda.time.DateTime dateTime57 = localDate0.toDateTimeAtCurrentTime(dateTimeZone56);
        org.joda.time.LocalDate localDate59 = localDate0.minusDays(1999);
        int int60 = localDate59.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone63);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.plus((-1L));
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight64.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight64.minusMonths((int) (short) 1);
        java.util.Calendar calendar71 = java.util.Calendar.getInstance();
        int int72 = calendar71.getFirstDayOfWeek();
        int int73 = calendar71.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateMidnight dateMidnight76 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone75);
        java.util.Date date77 = dateMidnight76.toDate();
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateMidnight dateMidnight80 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone79);
        java.util.Date date81 = dateMidnight80.toDate();
        boolean boolean82 = date77.before(date81);
        int int83 = date77.getMonth();
        calendar71.setTime(date77);
        java.util.TimeZone timeZone85 = calendar71.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.forTimeZone(timeZone85);
        org.joda.time.DateMidnight dateMidnight87 = dateMidnight70.withZoneRetainFields(dateTimeZone86);
        org.joda.time.LocalDate localDate88 = new org.joda.time.LocalDate(50L, dateTimeZone86);
        org.joda.time.DateMidnight dateMidnight89 = new org.joda.time.DateMidnight(dateTimeZone86);
        org.joda.time.Interval interval90 = localDate59.toInterval(dateTimeZone86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateMidnight89", (dateTime10.compareTo(dateMidnight89) == 0) == dateTime10.equals(dateMidnight89));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        java.util.Date date4 = dateMidnight3.toDate();
        org.joda.time.DateMidnight.Property property5 = dateMidnight3.dayOfWeek();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean10 = interval6.isBefore((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DateTime dateTime11 = interval6.getEnd();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.dayOfWeek();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18);
        boolean boolean22 = interval14.isAfter((org.joda.time.ReadableInterval) interval21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((-1L), dateTimeZone24);
        org.joda.time.Interval interval26 = interval14.withStart((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean27 = interval6.overlaps((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.Interval interval29 = interval6.withPeriodAfterStart(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate41 = localDate37.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate43 = localDate37.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property44 = localDate37.centuryOfEra();
        org.joda.time.LocalDate localDate45 = property44.roundCeilingCopy();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.eras();
        org.joda.time.Interval interval48 = interval29.withChronology(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.clockhourOfHalfday();
        org.joda.time.DurationField durationField50 = chronology46.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField50, and durationField47", !(durationField47.compareTo(durationField50) == 0) || (Math.signum(durationField47.compareTo(durationField47)) == Math.signum(durationField50.compareTo(durationField47))));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.monthOfYear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.minus(readableDuration10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) dateTime11, chronology23);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay4.withChronologyRetainFields(chronology23);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        int int27 = calendar26.getFirstDayOfWeek();
        int int28 = calendar26.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone30);
        java.util.Date date32 = dateMidnight31.toDate();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone34);
        java.util.Date date36 = dateMidnight35.toDate();
        boolean boolean37 = date32.before(date36);
        int int38 = date32.getMonth();
        calendar26.setTime(date32);
        java.util.TimeZone timeZone40 = calendar26.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateMidnight dateMidnight42 = yearMonthDay4.toDateMidnight(dateTimeZone41);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay4.minusYears(34612781);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight42", (dateMidnight2.compareTo(dateMidnight42) == 0) == dateMidnight2.equals(dateMidnight42));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((-1L));
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.secondOfMinute();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate12 = localDate8.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate14 = localDate8.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property15 = localDate8.centuryOfEra();
        org.joda.time.LocalDate localDate16 = property15.roundCeilingCopy();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.eras();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) 13, chronology17);
        org.joda.time.DurationField durationField20 = chronology17.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField20, and durationField18", !(durationField18.compareTo(durationField20) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField20.compareTo(durationField18))));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusDays(9);
        org.joda.time.LocalDateTime localDateTime4 = dateTime3.toLocalDateTime();
        org.joda.time.DateTime.Property property5 = dateTime3.secondOfDay();
        org.joda.time.DateTime dateTime7 = dateTime3.minus(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minus((long) (-1));
        org.joda.time.Chronology chronology12 = dateMidnight11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.weekyearOfCentury();
        boolean boolean15 = dateTimeFieldType8.isSupported(chronology12);
        org.joda.time.DurationField durationField16 = chronology12.months();
        org.joda.time.DurationField durationField17 = chronology12.halfdays();
        org.joda.time.DurationField durationField18 = chronology12.years();
        org.joda.time.DateTime dateTime19 = dateTime3.withChronology(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField18", (durationField13.compareTo(durationField18) == 0) == durationField13.equals(durationField18));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone9);
        java.util.Date date11 = dateMidnight10.toDate();
        org.joda.time.YearMonthDay yearMonthDay12 = dateMidnight10.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.plusDays((int) (short) -1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.dayOfWeek();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean25 = interval21.isBefore((org.joda.time.ReadableInterval) interval24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = interval21.toPeriod(periodType26);
        int int29 = period27.getValue((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.DateTimeField dateTimeField39 = localDate37.getField(1);
        long long41 = dateTimeField39.roundHalfCeiling((long) (byte) 10);
        long long43 = dateTimeField39.remainder((long) 'a');
        org.joda.time.DurationField durationField44 = dateTimeField39.getRangeDurationField();
        boolean boolean45 = period27.equals((java.lang.Object) durationField44);
        int int46 = period27.size();
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay14.withPeriodAdded((org.joda.time.ReadablePeriod) period27, 34522);
        org.joda.time.DateTime dateTime50 = dateTime7.withPeriodAdded((org.joda.time.ReadablePeriod) period27, 2022);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime55 = dateTime54.toDateTimeISO();
        int int56 = dateTime55.getSecondOfMinute();
        int int57 = dateTime55.getMonthOfYear();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = dateTime55.toDateTime(chronology58);
        org.joda.time.DateTime dateTime61 = dateTime59.withYearOfEra((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean63 = dateTime59.isSupported(dateTimeFieldType62);
        java.lang.String str64 = dateTimeFieldType62.getName();
        int int65 = dateTime50.get(dateTimeFieldType62);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, (int) (short) 10);
        boolean boolean70 = dateTimeZone68.isStandardOffset(252L);
        long long72 = dateTimeZone68.nextTransition((long) 26);
        org.joda.time.DateTime dateTime73 = dateTime50.toDateTime(dateTimeZone68);
        org.joda.time.DateTime dateTime75 = dateTime50.minusSeconds(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime75 and dateTime73", (dateTime75.compareTo(dateTime73) == 0) == dateTime75.equals(dateTime73));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.monthOfYear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.minus(readableDuration10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) dateTime11, chronology23);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay4.withChronologyRetainFields(chronology23);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay4.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minus((long) (-1));
        org.joda.time.Chronology chronology31 = dateMidnight30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.weekyearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay27.withChronologyRetainFields(chronology31);
        int int35 = yearMonthDay34.getDayOfMonth();
        org.joda.time.Interval interval36 = yearMonthDay34.toInterval();
        org.joda.time.YearMonthDay.Property property37 = yearMonthDay34.monthOfYear();
        int int38 = property37.get();
        org.joda.time.DurationField durationField39 = property37.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone41);
        java.util.Date date43 = dateMidnight42.toDate();
        org.joda.time.YearMonthDay yearMonthDay44 = dateMidnight42.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay44.plusDays((int) (short) -1);
        org.joda.time.DateTime dateTime47 = yearMonthDay44.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.plus((-1L));
        org.joda.time.Chronology chronology53 = dateMidnight52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.secondOfMinute();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(chronology53);
        org.joda.time.LocalDate localDate57 = localDate55.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate59 = localDate55.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        java.lang.String str62 = dateTimeZone61.toString();
        org.joda.time.DateTime dateTime63 = localDate59.toDateTimeAtCurrentTime(dateTimeZone61);
        org.joda.time.LocalDate localDate65 = localDate59.withWeekyear(19);
        org.joda.time.DateTime dateTime66 = dateTime47.withFields((org.joda.time.ReadablePartial) localDate65);
        org.joda.time.LocalDate localDate68 = localDate65.withDayOfYear(252);
        org.joda.time.LocalDate localDate70 = localDate68.plusWeeks(45);
        org.joda.time.LocalDate localDate72 = localDate70.plusMonths((int) (short) 10);
        int int73 = property37.compareTo((org.joda.time.ReadablePartial) localDate70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField39", (durationField32.compareTo(durationField39) == 0) == durationField32.equals(durationField39));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((-1L));
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfMinute();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate11 = localDate7.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.LocalDate localDate17 = localDate11.withWeekyear(19);
        int int18 = localDate11.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.plus((-1L));
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime30 = dateTime29.toDateTimeISO();
        int int31 = dateTime30.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.toDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime30.withMinuteOfHour(8);
        boolean boolean36 = dateMidnight23.equals((java.lang.Object) 8);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight23.minus((-60522647075197L));
        org.joda.time.Interval interval39 = dateMidnight23.toInterval();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone42);
        java.util.Date date44 = dateMidnight43.toDate();
        org.joda.time.DateMidnight.Property property45 = dateMidnight43.dayOfWeek();
        org.joda.time.Interval interval46 = new org.joda.time.Interval(readableDuration40, (org.joda.time.ReadableInstant) dateMidnight43);
        org.joda.time.Interval interval49 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean50 = interval46.isBefore((org.joda.time.ReadableInterval) interval49);
        boolean boolean51 = interval46.containsNow();
        boolean boolean52 = interval39.contains((org.joda.time.ReadableInterval) interval46);
        org.joda.time.Duration duration53 = interval39.toDuration();
        org.joda.time.Period period54 = interval39.toPeriod();
        org.joda.time.LocalDate localDate55 = localDate11.minus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone58);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.plus((-1L));
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight59.plusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight59.minusMonths((int) (short) 1);
        java.util.Calendar calendar66 = java.util.Calendar.getInstance();
        int int67 = calendar66.getFirstDayOfWeek();
        int int68 = calendar66.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone70);
        java.util.Date date72 = dateMidnight71.toDate();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.DateMidnight dateMidnight75 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone74);
        java.util.Date date76 = dateMidnight75.toDate();
        boolean boolean77 = date72.before(date76);
        int int78 = date72.getMonth();
        calendar66.setTime(date72);
        java.util.TimeZone timeZone80 = calendar66.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forTimeZone(timeZone80);
        org.joda.time.DateMidnight dateMidnight82 = dateMidnight65.withZoneRetainFields(dateTimeZone81);
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime((long) 1999, dateTimeZone81);
        org.joda.time.DateTime dateTime84 = localDate11.toDateTimeAtCurrentTime(dateTimeZone81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight65 and dateMidnight82", (dateMidnight65.compareTo(dateMidnight82) == 0) == dateMidnight65.equals(dateMidnight82));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone4);
        java.util.Date date6 = dateMidnight5.toDate();
        org.joda.time.YearMonthDay yearMonthDay7 = dateMidnight5.toYearMonthDay();
        int[] intArray8 = yearMonthDay7.getValues();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay7.withPeriodAdded(readablePeriod9, 22);
        java.lang.String str12 = yearMonthDay7.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfEra((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime28 = dateTime26.plusYears(5);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        java.util.Date date33 = dateMidnight32.toDate();
        org.joda.time.DateMidnight.Property property34 = dateMidnight32.dayOfWeek();
        org.joda.time.Interval interval35 = new org.joda.time.Interval(readableDuration29, (org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean39 = interval35.isBefore((org.joda.time.ReadableInterval) interval38);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = interval35.toPeriod(periodType40);
        org.joda.time.DateTime dateTime42 = dateTime26.minus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.LocalDate localDate44 = localDate22.withPeriodAdded((org.joda.time.ReadablePeriod) period41, 6);
        org.joda.time.PeriodType periodType45 = period41.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay7.minus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.DateTime dateTime48 = dateTime2.withPeriodAdded((org.joda.time.ReadablePeriod) period41, 34522);
        org.joda.time.MutablePeriod mutablePeriod49 = period41.toMutablePeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime24", (dateTime2.compareTo(dateTime24) == 0) == dateTime2.equals(dateTime24));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withOffsetParsed();
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        java.util.Date date10 = dateMidnight9.toDate();
        org.joda.time.YearMonthDay yearMonthDay11 = dateMidnight9.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(59);
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.plus((-1L));
        org.joda.time.Chronology chronology20 = dateMidnight19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfMinute();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.LocalDate localDate24 = localDate22.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate26 = localDate22.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str29 = dateTimeZone28.toString();
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone28);
        boolean boolean31 = dateTimeZone28.isFixed();
        org.joda.time.DateTime dateTime32 = yearMonthDay11.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter5.withZone(dateTimeZone28);
        org.joda.time.Chronology chronology34 = dateTimeFormatter33.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone36);
        java.util.Date date38 = dateMidnight37.toDate();
        org.joda.time.YearMonthDay yearMonthDay39 = dateMidnight37.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property44 = dateTime41.monthOfYear();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime41.minus(readableDuration45);
        org.joda.time.DateMidnight dateMidnight47 = dateTime46.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.plus((-1L));
        org.joda.time.Chronology chronology53 = dateMidnight52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.secondOfMinute();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(chronology53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.Interval interval57 = localDate55.toInterval(dateTimeZone56);
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) dateTime46, chronology58);
        org.joda.time.YearMonthDay yearMonthDay60 = yearMonthDay39.withChronologyRetainFields(chronology58);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance();
        int int62 = calendar61.getFirstDayOfWeek();
        int int63 = calendar61.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone65);
        java.util.Date date67 = dateMidnight66.toDate();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone69);
        java.util.Date date71 = dateMidnight70.toDate();
        boolean boolean72 = date67.before(date71);
        int int73 = date67.getMonth();
        calendar61.setTime(date67);
        java.util.TimeZone timeZone75 = calendar61.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        org.joda.time.DateMidnight dateMidnight77 = yearMonthDay39.toDateMidnight(dateTimeZone76);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateMidnight dateMidnight80 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone79);
        java.util.Date date81 = dateMidnight80.toDate();
        org.joda.time.YearMonthDay yearMonthDay82 = dateMidnight80.toYearMonthDay();
        int[] intArray83 = yearMonthDay82.getValues();
        org.joda.time.LocalDate localDate84 = yearMonthDay82.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime87 = localDate84.toDateTimeAtCurrentTime(dateTimeZone86);
        org.joda.time.DateTime dateTime88 = yearMonthDay39.toDateTimeAtCurrentTime(dateTimeZone86);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = dateTimeFormatter33.withZone(dateTimeZone86);
        long long93 = dateTimeZone86.convertLocalToUTC(1644537600000L, true, 1644572219502L);
        org.joda.time.DateMidnight dateMidnight94 = new org.joda.time.DateMidnight(dateTimeZone86);
        java.util.GregorianCalendar gregorianCalendar95 = dateMidnight94.toGregorianCalendar();
        gregorianCalendar95.setMinimalDaysInFirstWeek(35005);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateMidnight77", (dateMidnight9.compareTo(dateMidnight77) == 0) == dateMidnight9.equals(dateMidnight77));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withOffsetParsed();
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        java.util.Date date10 = dateMidnight9.toDate();
        org.joda.time.YearMonthDay yearMonthDay11 = dateMidnight9.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(59);
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.plus((-1L));
        org.joda.time.Chronology chronology20 = dateMidnight19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfMinute();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.LocalDate localDate24 = localDate22.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate26 = localDate22.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str29 = dateTimeZone28.toString();
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone28);
        boolean boolean31 = dateTimeZone28.isFixed();
        org.joda.time.DateTime dateTime32 = yearMonthDay11.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter5.withZone(dateTimeZone28);
        org.joda.time.Chronology chronology34 = dateTimeFormatter33.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone36);
        java.util.Date date38 = dateMidnight37.toDate();
        org.joda.time.YearMonthDay yearMonthDay39 = dateMidnight37.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property44 = dateTime41.monthOfYear();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime41.minus(readableDuration45);
        org.joda.time.DateMidnight dateMidnight47 = dateTime46.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.plus((-1L));
        org.joda.time.Chronology chronology53 = dateMidnight52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.secondOfMinute();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(chronology53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.Interval interval57 = localDate55.toInterval(dateTimeZone56);
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) dateTime46, chronology58);
        org.joda.time.YearMonthDay yearMonthDay60 = yearMonthDay39.withChronologyRetainFields(chronology58);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance();
        int int62 = calendar61.getFirstDayOfWeek();
        int int63 = calendar61.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone65);
        java.util.Date date67 = dateMidnight66.toDate();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone69);
        java.util.Date date71 = dateMidnight70.toDate();
        boolean boolean72 = date67.before(date71);
        int int73 = date67.getMonth();
        calendar61.setTime(date67);
        java.util.TimeZone timeZone75 = calendar61.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        org.joda.time.DateMidnight dateMidnight77 = yearMonthDay39.toDateMidnight(dateTimeZone76);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateMidnight dateMidnight80 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone79);
        java.util.Date date81 = dateMidnight80.toDate();
        org.joda.time.YearMonthDay yearMonthDay82 = dateMidnight80.toYearMonthDay();
        int[] intArray83 = yearMonthDay82.getValues();
        org.joda.time.LocalDate localDate84 = yearMonthDay82.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime87 = localDate84.toDateTimeAtCurrentTime(dateTimeZone86);
        org.joda.time.DateTime dateTime88 = yearMonthDay39.toDateTimeAtCurrentTime(dateTimeZone86);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = dateTimeFormatter33.withZone(dateTimeZone86);
        long long93 = dateTimeZone86.convertLocalToUTC(1644537600000L, true, 1644572219502L);
        org.joda.time.DateMidnight dateMidnight94 = new org.joda.time.DateMidnight(dateTimeZone86);
        boolean boolean96 = dateTimeZone86.isStandardOffset(34714550L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateMidnight77", (dateMidnight9.compareTo(dateMidnight77) == 0) == dateMidnight9.equals(dateMidnight77));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.monthOfYear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.minus(readableDuration10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) dateTime11, chronology23);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay4.withChronologyRetainFields(chronology23);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        int int27 = calendar26.getFirstDayOfWeek();
        int int28 = calendar26.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone30);
        java.util.Date date32 = dateMidnight31.toDate();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone34);
        java.util.Date date36 = dateMidnight35.toDate();
        boolean boolean37 = date32.before(date36);
        int int38 = date32.getMonth();
        calendar26.setTime(date32);
        java.util.TimeZone timeZone40 = calendar26.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateMidnight dateMidnight42 = yearMonthDay4.toDateMidnight(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone44);
        java.util.Date date46 = dateMidnight45.toDate();
        org.joda.time.YearMonthDay yearMonthDay47 = dateMidnight45.toYearMonthDay();
        int[] intArray48 = yearMonthDay47.getValues();
        org.joda.time.LocalDate localDate49 = yearMonthDay47.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime52 = localDate49.toDateTimeAtCurrentTime(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = yearMonthDay4.toDateTimeAtCurrentTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.plus((-1L));
        org.joda.time.Chronology chronology59 = dateMidnight58.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.secondOfMinute();
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate(chronology59);
        org.joda.time.LocalDate localDate63 = localDate61.withYearOfEra((int) (byte) 10);
        int int64 = localDate61.getDayOfMonth();
        int int65 = localDate61.getYear();
        org.joda.time.DateTime dateTime66 = localDate61.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime68 = dateTime66.withWeekyear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime dateTime71 = dateTime66.withField(dateTimeFieldType69, 37);
        int int72 = dateTimeZone51.getOffset((org.joda.time.ReadableInstant) dateTime66);
        java.lang.String str74 = dateTime66.toString("21");
        org.joda.time.DateTime.Property property75 = dateTime66.era();
        org.joda.time.DateTime dateTime76 = property75.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime78 = dateTime76.withSecondOfMinute(2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight42", (dateMidnight2.compareTo(dateMidnight42) == 0) == dateMidnight2.equals(dateMidnight42));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.monthOfYear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.minus(readableDuration10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((-1L));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.secondOfMinute();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) dateTime11, chronology23);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay4.withChronologyRetainFields(chronology23);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        int int27 = calendar26.getFirstDayOfWeek();
        int int28 = calendar26.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone30);
        java.util.Date date32 = dateMidnight31.toDate();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone34);
        java.util.Date date36 = dateMidnight35.toDate();
        boolean boolean37 = date32.before(date36);
        int int38 = date32.getMonth();
        calendar26.setTime(date32);
        java.util.TimeZone timeZone40 = calendar26.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateMidnight dateMidnight42 = yearMonthDay4.toDateMidnight(dateTimeZone41);
        long long44 = dateTimeZone41.previousTransition((long) 8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight42", (dateMidnight2.compareTo(dateMidnight42) == 0) == dateMidnight2.equals(dateMidnight42));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        java.util.Date date4 = dateMidnight3.toDate();
        org.joda.time.DateMidnight.Property property5 = dateMidnight3.dayOfWeek();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean10 = interval6.isBefore((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DateTime dateTime11 = interval6.getEnd();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone17);
        java.util.Date date19 = dateMidnight18.toDate();
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.dayOfWeek();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18);
        boolean boolean22 = interval14.isAfter((org.joda.time.ReadableInterval) interval21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((-1L), dateTimeZone24);
        org.joda.time.Interval interval26 = interval14.withStart((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean27 = interval6.overlaps((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.Interval interval29 = interval6.withPeriodAfterStart(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plus((-1L));
        org.joda.time.Chronology chronology35 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate41 = localDate37.plusYears((int) (byte) 0);
        org.joda.time.LocalDate localDate43 = localDate37.withDayOfYear((int) '4');
        org.joda.time.LocalDate.Property property44 = localDate37.centuryOfEra();
        org.joda.time.LocalDate localDate45 = property44.roundCeilingCopy();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.eras();
        org.joda.time.Interval interval48 = interval29.withChronology(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight51 = org.joda.time.DateMidnight.now(chronology46);
        org.joda.time.DateTimeField dateTimeField52 = chronology46.dayOfYear();
        java.lang.String str53 = chronology46.toString();
        org.joda.time.DurationField durationField54 = chronology46.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField54, and durationField47", !(durationField47.compareTo(durationField54) == 0) || (Math.signum(durationField47.compareTo(durationField47)) == Math.signum(durationField54.compareTo(durationField47))));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((-1L));
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        boolean boolean8 = dateMidnight5.isBefore((long) ' ');
        org.joda.time.DateMidnight.Property property9 = dateMidnight5.centuryOfEra();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DateMidnight dateMidnight11 = property9.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plus((-1L));
        org.joda.time.Chronology chronology17 = dateMidnight16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.clockhourOfDay();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight11.withChronology(chronology17);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(86400000L, chronology17);
        org.joda.time.DurationField durationField22 = chronology17.eras();
        org.joda.time.DurationField durationField23 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField23", Math.signum(durationField18.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField18)));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.DateTime dateTime5 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minus((long) (-1));
        org.joda.time.Chronology chronology9 = dateMidnight8.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minus(readablePeriod11);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.minusMinutes(1970);
        org.joda.time.Chronology chronology17 = timeOfDay14.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minus((long) (-1));
        org.joda.time.Chronology chronology21 = dateMidnight20.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.minus(readablePeriod23);
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay26.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone35);
        java.util.Date date37 = dateMidnight36.toDate();
        org.joda.time.DateMidnight.Property property38 = dateMidnight36.dayOfWeek();
        org.joda.time.Interval interval39 = new org.joda.time.Interval(readableDuration33, (org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.Interval interval42 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean43 = interval39.isBefore((org.joda.time.ReadableInterval) interval42);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = interval39.toPeriod(periodType44);
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay32.minus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.PeriodType periodType47 = period45.getPeriodType();
        int[] intArray50 = chronology17.get((org.joda.time.ReadablePeriod) period45, (long) (-1), (long) 24);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadablePeriod) period45);
        org.joda.time.DateTime dateTime53 = dateTime5.withYearOfEra((int) (short) 100);
        org.joda.time.DateTime dateTime55 = dateTime5.withSecondOfMinute(39);
        org.joda.time.Interval interval58 = new org.joda.time.Interval((-1L), 1L);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone61);
        java.util.Date date63 = dateMidnight62.toDate();
        org.joda.time.DateMidnight.Property property64 = dateMidnight62.dayOfWeek();
        org.joda.time.Interval interval65 = new org.joda.time.Interval(readableDuration59, (org.joda.time.ReadableInstant) dateMidnight62);
        boolean boolean66 = interval58.isAfter((org.joda.time.ReadableInterval) interval65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.Interval interval68 = interval65.withPeriodAfterStart(readablePeriod67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.Interval interval70 = interval68.withPeriodAfterStart(readablePeriod69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime(dateTimeZone71);
        org.joda.time.DateTime dateTime74 = dateTime72.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property75 = dateTime72.monthOfYear();
        org.joda.time.DateTime dateTime76 = property75.withMaximumValue();
        org.joda.time.DateTime dateTime78 = dateTime76.minusMinutes(21);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone81);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight82.plus((-1L));
        org.joda.time.Chronology chronology85 = dateMidnight84.getChronology();
        org.joda.time.DurationField durationField86 = chronology85.centuries();
        org.joda.time.TimeOfDay timeOfDay87 = new org.joda.time.TimeOfDay(70L, chronology85);
        org.joda.time.DateTime dateTime88 = dateTime78.toDateTime(chronology85);
        org.joda.time.Interval interval89 = interval70.withChronology(chronology85);
        org.joda.time.Chronology chronology90 = chronology85.withUTC();
        org.joda.time.DurationField durationField91 = chronology90.eras();
        org.joda.time.DateTime dateTime92 = dateTime55.toDateTime(chronology90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField86 and durationField91", Math.signum(durationField86.compareTo(durationField91)) == -Math.signum(durationField91.compareTo(durationField86)));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withOffsetParsed();
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        java.util.Date date10 = dateMidnight9.toDate();
        org.joda.time.YearMonthDay yearMonthDay11 = dateMidnight9.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(59);
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.plus((-1L));
        org.joda.time.Chronology chronology20 = dateMidnight19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfMinute();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.LocalDate localDate24 = localDate22.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate26 = localDate22.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str29 = dateTimeZone28.toString();
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone28);
        boolean boolean31 = dateTimeZone28.isFixed();
        org.joda.time.DateTime dateTime32 = yearMonthDay11.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter5.withZone(dateTimeZone28);
        org.joda.time.Chronology chronology34 = dateTimeFormatter33.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone36);
        java.util.Date date38 = dateMidnight37.toDate();
        org.joda.time.YearMonthDay yearMonthDay39 = dateMidnight37.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property44 = dateTime41.monthOfYear();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime41.minus(readableDuration45);
        org.joda.time.DateMidnight dateMidnight47 = dateTime46.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.plus((-1L));
        org.joda.time.Chronology chronology53 = dateMidnight52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.secondOfMinute();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(chronology53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.Interval interval57 = localDate55.toInterval(dateTimeZone56);
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) dateTime46, chronology58);
        org.joda.time.YearMonthDay yearMonthDay60 = yearMonthDay39.withChronologyRetainFields(chronology58);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance();
        int int62 = calendar61.getFirstDayOfWeek();
        int int63 = calendar61.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone65);
        java.util.Date date67 = dateMidnight66.toDate();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone69);
        java.util.Date date71 = dateMidnight70.toDate();
        boolean boolean72 = date67.before(date71);
        int int73 = date67.getMonth();
        calendar61.setTime(date67);
        java.util.TimeZone timeZone75 = calendar61.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        org.joda.time.DateMidnight dateMidnight77 = yearMonthDay39.toDateMidnight(dateTimeZone76);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateMidnight dateMidnight80 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone79);
        java.util.Date date81 = dateMidnight80.toDate();
        org.joda.time.YearMonthDay yearMonthDay82 = dateMidnight80.toYearMonthDay();
        int[] intArray83 = yearMonthDay82.getValues();
        org.joda.time.LocalDate localDate84 = yearMonthDay82.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime87 = localDate84.toDateTimeAtCurrentTime(dateTimeZone86);
        org.joda.time.DateTime dateTime88 = yearMonthDay39.toDateTimeAtCurrentTime(dateTimeZone86);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = dateTimeFormatter33.withZone(dateTimeZone86);
        long long93 = dateTimeZone86.convertLocalToUTC(1644537600000L, true, 1644572219502L);
        org.joda.time.DateMidnight dateMidnight94 = new org.joda.time.DateMidnight(dateTimeZone86);
        boolean boolean96 = dateTimeZone86.isStandardOffset(1644572616800L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateMidnight77", (dateMidnight9.compareTo(dateMidnight77) == 0) == dateMidnight9.equals(dateMidnight77));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone2);
        java.util.Date date4 = dateMidnight3.toDate();
        org.joda.time.YearMonthDay yearMonthDay5 = dateMidnight3.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay5.withPeriodAdded(readablePeriod6, 11);
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay5.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        int int11 = localDate0.get(dateTimeFieldType10);
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType10.getRangeDurationType();
        java.lang.String str13 = durationFieldType12.toString();
        java.lang.String str14 = durationFieldType12.toString();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minus((long) (-1));
        org.joda.time.Chronology chronology18 = dateMidnight17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weekyears();
        java.lang.String str20 = chronology18.toString();
        org.joda.time.DurationField durationField21 = chronology18.years();
        boolean boolean22 = durationFieldType12.isSupported(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField21", (durationField19.compareTo(durationField21) == 0) == durationField19.equals(durationField21));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((-1L));
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime1.toMutableDateTime(chronology7);
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfWeek();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property16 = dateTime13.monthOfYear();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.minus(readableDuration17);
        org.joda.time.DateTime.Property property19 = dateTime13.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime dateTime22 = dateTime13.withField(dateTimeFieldType20, (int) ' ');
        org.joda.time.DateTime dateTime24 = dateTime22.withSecondOfMinute(15);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfCentury(14);
        org.joda.time.DateTime.Property property27 = dateTime24.yearOfCentury();
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str31 = dateTimeZone29.getNameKey((long) (-1));
        long long33 = dateTimeZone29.convertUTCToLocal((long) 5);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone29.getName((long) 0, locale35);
        java.lang.String str37 = dateTimeZone29.toString();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) dateTime24, dateTimeZone29);
        org.joda.time.Chronology chronology39 = chronology9.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField40 = chronology9.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField40, and durationField11", !(durationField11.compareTo(durationField40) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField40.compareTo(durationField11))));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = dateTime3.plusHours(44);
        org.joda.time.DateTime dateTime8 = dateTime3.plusMonths(10);
        int int9 = dateTime3.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone11);
        java.util.Date date13 = dateMidnight12.toDate();
        org.joda.time.YearMonthDay yearMonthDay14 = dateMidnight12.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(59);
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime3.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime3.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and mutableDateTime18", (dateTime19.compareTo(mutableDateTime18) == 0) == dateTime19.equals(mutableDateTime18));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusWeeks(22);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight5, readablePeriod6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight5.withPeriodAdded(readablePeriod8, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) '4');
        org.joda.time.DateMidnight dateMidnight15 = dateTime14.toDateMidnight();
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.centuryOfEra();
        int int17 = dateMidnight5.compareTo((org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getRangeDurationType();
        int int20 = dateMidnight5.get(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.plus((-1L));
        org.joda.time.Chronology chronology28 = dateMidnight27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfMinute();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.LocalDate localDate32 = localDate30.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate34 = localDate30.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.lang.String str37 = dateTimeZone36.toString();
        org.joda.time.DateTime dateTime38 = localDate34.toDateTimeAtCurrentTime(dateTimeZone36);
        org.joda.time.LocalDate localDate40 = localDate34.withWeekyear(19);
        org.joda.time.LocalTime localTime41 = null;
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        java.lang.String str45 = dateTimeZone43.getNameKey((long) (-1));
        org.joda.time.DateTime dateTime46 = localDate34.toDateTime(localTime41, dateTimeZone43);
        org.joda.time.LocalDate.Property property47 = localDate34.weekyear();
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.minus((long) (-1));
        org.joda.time.Chronology chronology51 = dateMidnight50.getChronology();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology51);
        boolean boolean53 = property47.equals((java.lang.Object) chronology51);
        org.joda.time.Interval interval54 = new org.joda.time.Interval((long) (byte) 0, 100L, chronology51);
        org.joda.time.DurationField durationField55 = chronology51.eras();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight5.withChronology(chronology51);
        org.joda.time.DurationField durationField57 = chronology51.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField55, durationField57, and durationField55", !(durationField55.compareTo(durationField57) == 0) || (Math.signum(durationField55.compareTo(durationField55)) == Math.signum(durationField57.compareTo(durationField55))));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay((int) (byte) 100, 3, (-1), (int) (byte) -1);
        java.util.Calendar.Builder builder9 = builder0.setTimeOfDay(22, 28, 34);
        java.util.Calendar.Builder builder13 = builder0.setWeekDate(1022, 39, (int) 'a');
        java.util.Calendar calendar14 = java.util.Calendar.getInstance();
        int int15 = calendar14.getFirstDayOfWeek();
        int int16 = calendar14.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone18);
        java.util.Date date20 = dateMidnight19.toDate();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone22);
        java.util.Date date24 = dateMidnight23.toDate();
        boolean boolean25 = date20.before(date24);
        int int26 = date20.getMonth();
        calendar14.setTime(date20);
        calendar14.setFirstDayOfWeek((int) (short) 1);
        java.time.Instant instant30 = calendar14.toInstant();
        java.util.Calendar calendar31 = java.util.Calendar.getInstance();
        int int32 = calendar31.getFirstDayOfWeek();
        int int33 = calendar31.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone35);
        java.util.Date date37 = dateMidnight36.toDate();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone39);
        java.util.Date date41 = dateMidnight40.toDate();
        boolean boolean42 = date37.before(date41);
        int int43 = date37.getMonth();
        calendar31.setTime(date37);
        java.util.TimeZone timeZone45 = calendar31.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        calendar14.setTimeZone(timeZone45);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.plus((-1L));
        org.joda.time.Chronology chronology53 = dateMidnight52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.secondOfMinute();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(chronology53);
        org.joda.time.LocalDate localDate57 = localDate55.withYearOfEra((int) (byte) 10);
        int int58 = localDate55.getYearOfCentury();
        org.joda.time.LocalTime localTime59 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.plus((-1L));
        org.joda.time.Chronology chronology65 = dateMidnight64.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.secondOfMinute();
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate(chronology65);
        org.joda.time.LocalDate localDate69 = localDate67.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate71 = localDate67.plusYears((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone73);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight74.plus((-1L));
        org.joda.time.Chronology chronology77 = dateMidnight76.getChronology();
        org.joda.time.DateTimeField dateTimeField78 = chronology77.secondOfMinute();
        org.joda.time.LocalDate localDate79 = new org.joda.time.LocalDate(chronology77);
        org.joda.time.LocalDate localDate81 = localDate79.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate83 = localDate79.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone84 = null;
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forTimeZone(timeZone84);
        java.lang.String str86 = dateTimeZone85.toString();
        org.joda.time.DateTime dateTime87 = localDate83.toDateTimeAtCurrentTime(dateTimeZone85);
        boolean boolean88 = dateTimeZone85.isFixed();
        org.joda.time.DateTime dateTime89 = localDate71.toDateTimeAtCurrentTime(dateTimeZone85);
        org.joda.time.DateTime dateTime90 = localDate55.toDateTime(localTime59, dateTimeZone85);
        java.util.TimeZone timeZone91 = dateTimeZone85.toTimeZone();
        calendar14.setTimeZone(timeZone91);
        calendar14.add(100, (int) (byte) 0);
        calendar14.setMinimalDaysInFirstWeek(76);
        java.util.TimeZone timeZone98 = calendar14.getTimeZone();
        java.util.Calendar.Builder builder99 = builder13.setTimeZone(timeZone98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar31", (calendar14.compareTo(calendar31) == 0) == calendar14.equals(calendar31));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plus((-1L));
        org.joda.time.Chronology chronology12 = dateMidnight11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfMinute();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology12);
        boolean boolean15 = yearMonthDay6.isEqual((org.joda.time.ReadablePartial) localDate14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey((long) (-1));
        long long21 = dateTimeZone17.convertUTCToLocal((long) 5);
        org.joda.time.DateMidnight dateMidnight22 = localDate14.toDateMidnight(dateTimeZone17);
        long long26 = dateTimeZone17.convertLocalToUTC((long) '4', true, (long) 52);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.plus((-1L));
        org.joda.time.Chronology chronology33 = dateMidnight32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.centuries();
        long long38 = chronology33.add((long) 292278994, (long) 4, 12);
        org.joda.time.DurationField durationField39 = chronology33.years();
        org.joda.time.DurationField durationField40 = chronology33.weekyears();
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((java.lang.Object) dateTime27, chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField40", (durationField39.compareTo(durationField40) == 0) == durationField39.equals(durationField40));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears(5);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minus((long) (-1));
        org.joda.time.Chronology chronology9 = dateMidnight8.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minus(readablePeriod11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.DateTime dateTime16 = timeOfDay12.toDateTimeToday(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) dateTime3, dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(dateTimeZone14);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay18.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(59);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minus((long) (-1));
        org.joda.time.Chronology chronology25 = dateMidnight24.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.minus(readablePeriod27);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.minusMinutes(1970);
        org.joda.time.Chronology chronology33 = timeOfDay30.getChronology();
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minus((long) (-1));
        org.joda.time.Chronology chronology37 = dateMidnight36.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(chronology37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.minus(readablePeriod39);
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.minusMinutes(1);
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay42.minusMinutes(1970);
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay42.minusSeconds(1);
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.minusMinutes(12);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone51);
        java.util.Date date53 = dateMidnight52.toDate();
        org.joda.time.DateMidnight.Property property54 = dateMidnight52.dayOfWeek();
        org.joda.time.Interval interval55 = new org.joda.time.Interval(readableDuration49, (org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.Interval interval58 = new org.joda.time.Interval((-1L), 1L);
        boolean boolean59 = interval55.isBefore((org.joda.time.ReadableInterval) interval58);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = interval55.toPeriod(periodType60);
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay48.minus((org.joda.time.ReadablePeriod) period61);
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay30.minus((org.joda.time.ReadablePeriod) period61);
        boolean boolean64 = dateTimeZone21.equals((java.lang.Object) period61);
        org.joda.time.DateTime dateTime65 = timeOfDay18.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(dateTimeZone21);
        long long70 = dateTimeZone21.convertLocalToUTC((-1167609599948L), false, (long) 252);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime66", (dateTime1.compareTo(dateTime66) == 0) == dateTime1.equals(dateTime66));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone1);
        java.util.Date date3 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay4 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.plus((-1L));
        org.joda.time.Chronology chronology10 = dateMidnight9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.secondOfMinute();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DurationField durationField13 = chronology10.days();
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay4.withChronologyRetainFields(chronology10);
        org.joda.time.Chronology chronology15 = yearMonthDay14.getChronology();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minus((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone19 = dateMidnight16.getZone();
        org.joda.time.DateMidnight dateMidnight20 = yearMonthDay14.toDateMidnight(dateTimeZone19);
        java.util.Set<java.lang.String> strSet21 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean22 = dateTimeZone19.equals((java.lang.Object) strSet21);
        long long24 = dateTimeZone19.nextTransition(14400001L);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.plus((-1L));
        org.joda.time.Chronology chronology30 = dateMidnight29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfMinute();
        org.joda.time.DurationField durationField32 = chronology30.millis();
        boolean boolean33 = dateTimeZone19.equals((java.lang.Object) chronology30);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.plus((-1L));
        org.joda.time.Chronology chronology39 = dateMidnight38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.secondOfMinute();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology39);
        org.joda.time.LocalDate localDate43 = localDate41.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate45 = localDate41.plusYears((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.plus((-1L));
        org.joda.time.Chronology chronology51 = dateMidnight50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.secondOfMinute();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.LocalDate localDate55 = localDate53.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate57 = localDate53.plusYears((int) (byte) 0);
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        java.lang.String str60 = dateTimeZone59.toString();
        org.joda.time.DateTime dateTime61 = localDate57.toDateTimeAtCurrentTime(dateTimeZone59);
        boolean boolean62 = dateTimeZone59.isFixed();
        org.joda.time.DateTime dateTime63 = localDate45.toDateTimeAtCurrentTime(dateTimeZone59);
        org.joda.time.LocalDate localDate65 = localDate45.withCenturyOfEra((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateMidnight.Property property70 = dateMidnight68.property(dateTimeFieldType69);
        org.joda.time.LocalDate.Property property71 = localDate65.property(dateTimeFieldType69);
        java.util.TimeZone timeZone72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        java.lang.String str74 = dateTimeZone73.toString();
        org.joda.time.Interval interval75 = localDate65.toInterval(dateTimeZone73);
        java.util.TimeZone timeZone76 = dateTimeZone73.toTimeZone();
        org.joda.time.Chronology chronology77 = chronology30.withZone(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField78 = chronology77.dayOfMonth();
        org.joda.time.DurationField durationField79 = chronology77.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField79, durationField13, and durationField32", !(durationField79.compareTo(durationField13) == 0) || (Math.signum(durationField79.compareTo(durationField32)) == Math.signum(durationField13.compareTo(durationField32))));
    }
}

