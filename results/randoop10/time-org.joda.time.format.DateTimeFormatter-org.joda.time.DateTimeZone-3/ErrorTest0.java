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
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DurationField durationField10 = chronology6.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField10, and durationField8", !(durationField8.compareTo(durationField10) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField10.compareTo(durationField8))));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DurationField durationField11 = chronology6.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField11, and durationField8", !(durationField8.compareTo(durationField11) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField11.compareTo(durationField8))));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DurationField durationField10 = chronology6.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField10, and durationField8", !(durationField8.compareTo(durationField10) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField10.compareTo(durationField8))));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = instant1.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime3.toGregorianCalendar();
        gregorianCalendar4.setTimeInMillis((long) (-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime3", (instant1.compareTo(dateTime3) == 0) == instant1.equals(dateTime3));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology6.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField10, and durationField8", !(durationField8.compareTo(durationField10) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField10.compareTo(durationField8))));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        int[] intArray22 = chronology14.get((org.joda.time.ReadablePartial) timeOfDay17, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, chronology14);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        org.joda.time.Chronology chronology30 = instant28.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        int[] intArray38 = chronology30.get((org.joda.time.ReadablePartial) timeOfDay33, (long) (short) -1);
        mutableDateTime23.setChronology(chronology30);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(chronology30);
        boolean boolean41 = dateTimeFieldType6.isSupported(chronology30);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight5.withField(dateTimeFieldType6, 11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and mutableDateTime23", (dateMidnight5.compareTo(mutableDateTime23) == 0) == dateMidnight5.equals(mutableDateTime23));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Interval interval8 = interval5.withDurationBeforeEnd(readableDuration7);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = instant10.toMutableDateTimeISO();
        org.joda.time.Interval interval13 = interval8.withStart((org.joda.time.ReadableInstant) instant10);
        long long14 = interval13.getStartMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime12", (instant10.compareTo(mutableDateTime12) == 0) == instant10.equals(mutableDateTime12));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.plus(readableDuration4);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) (byte) 100);
        boolean boolean9 = instant5.isBefore((org.joda.time.ReadableInstant) instant8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime3", (instant5.compareTo(mutableDateTime3) == 0) == instant5.equals(mutableDateTime3));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DurationField durationField10 = chronology6.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField10, and durationField8", !(durationField8.compareTo(durationField10) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField10.compareTo(durationField8))));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight2.getZone();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        long long18 = dateTimeField16.roundHalfFloor(0L);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        int int20 = dateTimeField16.getMaximumShortTextLength(locale19);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = locale21.getDisplayName(locale23);
        java.lang.String str26 = locale19.getDisplayLanguage(locale21);
        java.lang.String str27 = dateTimeZone7.getName((long) 'x', locale21);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property31 = timeOfDay30.minuteOfHour();
        java.lang.String str32 = property31.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        org.joda.time.Chronology chronology40 = instant38.getChronology();
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        int[] intArray48 = chronology40.get((org.joda.time.ReadablePartial) timeOfDay43, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(0L, chronology40);
        int int50 = mutableDateTime49.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime49.property(dateTimeFieldType51);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime58 = timeOfDay55.toDateTime((org.joda.time.ReadableInstant) instant57);
        org.joda.time.Chronology chronology59 = instant57.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.clockhourOfHalfday();
        long long62 = dateTimeField60.roundHalfFloor(0L);
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        int int64 = dateTimeField60.getMaximumShortTextLength(locale63);
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale66 = locale65.stripExtensions();
        java.util.Locale locale67 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = locale65.getDisplayName(locale67);
        java.lang.String str70 = locale63.getDisplayLanguage(locale65);
        java.util.Calendar calendar71 = mutableDateTime49.toCalendar(locale65);
        int int72 = property31.getMaximumTextLength(locale65);
        org.joda.time.TimeOfDay timeOfDay75 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant77 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime78 = timeOfDay75.toDateTime((org.joda.time.ReadableInstant) instant77);
        org.joda.time.Chronology chronology79 = instant77.getChronology();
        org.joda.time.DateTimeField dateTimeField80 = chronology79.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField81 = chronology79.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField82 = chronology79.hourOfDay();
        java.util.Locale locale85 = new java.util.Locale("zh");
        java.lang.String str86 = dateTimeField82.getAsShortText((-2678399965L), locale85);
        int int87 = property31.getMaximumShortTextLength(locale85);
        java.lang.String str88 = locale21.getDisplayName(locale85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and mutableDateTime49", (dateMidnight2.compareTo(mutableDateTime49) == 0) == dateMidnight2.equals(mutableDateTime49));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Interval interval8 = interval5.withDurationBeforeEnd(readableDuration7);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = instant10.toMutableDateTimeISO();
        org.joda.time.Interval interval13 = interval8.withStart((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval19 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean20 = interval16.abuts((org.joda.time.ReadableInterval) interval19);
        long long21 = interval19.getStartMillis();
        org.joda.time.Interval interval23 = interval19.withStartMillis((long) (short) -1);
        boolean boolean24 = interval13.abuts((org.joda.time.ReadableInterval) interval23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime12", (instant10.compareTo(mutableDateTime12) == 0) == instant10.equals(mutableDateTime12));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.set((int) (short) 100, (int) '#', (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight45.withWeekyear(2);
        org.joda.time.DateMidnight.Property property50 = dateMidnight45.weekOfWeekyear();
        java.lang.String str51 = property50.getAsString();
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant56 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime57 = timeOfDay54.toDateTime((org.joda.time.ReadableInstant) instant56);
        org.joda.time.Chronology chronology58 = instant56.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.clockhourOfHalfday();
        long long61 = dateTimeField59.roundHalfFloor(0L);
        java.util.Locale locale62 = java.util.Locale.TRADITIONAL_CHINESE;
        int int63 = dateTimeField59.getMaximumShortTextLength(locale62);
        int int64 = property50.getMaximumShortTextLength(locale62);
        boolean boolean65 = calendar38.before((java.lang.Object) int64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateMidnight45", (mutableDateTime16.compareTo(dateMidnight45) == 0) == mutableDateTime16.equals(dateMidnight45));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str4 = dateTimeZone3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone3);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        int[] intArray22 = chronology14.get((org.joda.time.ReadablePartial) timeOfDay17, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, chronology14);
        int int24 = mutableDateTime23.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime23.property(dateTimeFieldType25);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.clockhourOfHalfday();
        long long36 = dateTimeField34.roundHalfFloor(0L);
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        int int38 = dateTimeField34.getMaximumShortTextLength(locale37);
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Locale locale41 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale42 = locale41.stripExtensions();
        java.lang.String str43 = locale39.getDisplayName(locale41);
        java.lang.String str44 = locale37.getDisplayLanguage(locale39);
        java.util.Calendar calendar45 = mutableDateTime23.toCalendar(locale39);
        java.lang.String str46 = dateTimeZone3.getShortName((long) 0, locale39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant12", (dateTime5.compareTo(instant12) == 0) == dateTime5.equals(instant12));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        int[] intArray23 = chronology15.get((org.joda.time.ReadablePartial) timeOfDay18, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, chronology15);
        int int25 = mutableDateTime24.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime24.property(dateTimeFieldType26);
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.property(dateTimeFieldType29);
        mutableDateTime28.setDayOfMonth(3);
        mutableDateTime28.setMinuteOfDay(35);
        mutableDateTime28.addHours(9);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime28.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundFloor();
        boolean boolean39 = dateMidnight5.isAfter((org.joda.time.ReadableInstant) mutableDateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and mutableDateTime38", (dateMidnight5.compareTo(mutableDateTime38) == 0) == dateMidnight5.equals(mutableDateTime38));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(14);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded(readableDuration12, (int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime11.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime20 = dateTime18.plusDays(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = null;
        boolean boolean24 = dateTimeFieldType21.isSupported(chronology23);
        boolean boolean25 = dateTime7.isSupported(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight28.withWeekyear(2);
        org.joda.time.DateMidnight.Property property33 = dateMidnight28.weekOfWeekyear();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        org.joda.time.Chronology chronology41 = instant39.getChronology();
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        int[] intArray49 = chronology41.get((org.joda.time.ReadablePartial) timeOfDay44, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(0L, chronology41);
        org.joda.time.DurationField durationField51 = chronology41.weeks();
        org.joda.time.DateTimeField dateTimeField52 = chronology41.dayOfYear();
        org.joda.time.DateTimeField dateTimeField53 = chronology41.weekOfWeekyear();
        org.joda.time.DateTime dateTime54 = dateMidnight28.toDateTime(chronology41);
        boolean boolean55 = dateTimeFieldType21.isSupported(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight28 and mutableDateTime50", (dateMidnight28.compareTo(mutableDateTime50) == 0) == dateMidnight28.equals(mutableDateTime50));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = instant1.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime3.toGregorianCalendar();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.weekOfWeekyear();
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded(readableDuration15, (int) (byte) 0);
        org.joda.time.DateTime dateTime19 = dateTime14.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime14.minus(readableDuration20);
        org.joda.time.DateTime dateTime23 = dateTime14.minusSeconds((int) (byte) 100);
        int int24 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology25 = dateTime23.getChronology();
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(chronology25);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.withDurationAdded(readableDuration31, (int) (byte) 0);
        org.joda.time.DateTime dateTime35 = dateTime30.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime39 = dateTime37.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime39.getZone();
        java.lang.String str41 = dateTimeZone40.getID();
        org.joda.time.Interval interval42 = yearMonthDay26.toInterval(dateTimeZone40);
        boolean boolean43 = gregorianCalendar4.after((java.lang.Object) interval42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime3", (instant1.compareTo(dateTime3) == 0) == instant1.equals(dateTime3));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        calendar38.clear(10);
        calendar38.clear();
        calendar38.clear(7);
        org.joda.time.Interval interval54 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval57 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean58 = interval54.abuts((org.joda.time.ReadableInterval) interval57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Interval interval60 = interval57.withDurationBeforeEnd(readableDuration59);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone63 = instant62.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = instant62.toMutableDateTimeISO();
        org.joda.time.Interval interval65 = interval60.withStart((org.joda.time.ReadableInstant) instant62);
        boolean boolean66 = calendar38.after((java.lang.Object) interval65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime64", (instant5.compareTo(mutableDateTime64) == 0) == instant5.equals(mutableDateTime64));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology23);
        org.joda.time.DateTimeField dateTimeField34 = chronology23.weekOfWeekyear();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        org.joda.time.Chronology chronology43 = instant41.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.clockhourOfHalfday();
        long long46 = dateTimeField44.roundHalfFloor(0L);
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        int int48 = dateTimeField44.getMaximumShortTextLength(locale47);
        java.lang.String str49 = locale47.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology36, locale47);
        java.lang.Integer int51 = dateTimeParserBucket50.getPivotYear();
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone54 = instant53.getZone();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight57.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight57.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone62 = dateMidnight57.getZone();
        long long64 = dateTimeZone54.getMillisKeepLocal(dateTimeZone62, 10L);
        dateTimeParserBucket50.setZone(dateTimeZone54);
        org.joda.time.Chronology chronology66 = chronology23.withZone(dateTimeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateMidnight57", (mutableDateTime16.compareTo(dateMidnight57) == 0) == mutableDateTime16.equals(dateMidnight57));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.withWeekyear(2);
        boolean boolean12 = interval2.isBefore((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone16.toTimeZone();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight9.withZoneRetainFields(dateTimeZone16);
        java.lang.String str21 = dateTimeZone16.getNameKey((-2678399L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateMidnight19", (dateMidnight9.compareTo(dateMidnight19) == 0) == dateMidnight9.equals(dateMidnight19));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str4 = dateTimeZone3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone3);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(2);
        org.joda.time.DateTime dateTime20 = dateTime16.withHourOfDay(10);
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays((int) 'x');
        boolean boolean23 = dateTime5.isBefore((org.joda.time.ReadableInstant) dateTime22);
        int int24 = dateTime22.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.Interval interval9 = interval5.withStartMillis((long) (short) -1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, chronology25);
        org.joda.time.DurationField durationField35 = chronology25.weeks();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((-86340000L), chronology25);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField38 = chronology25.dayOfWeek();
        mutableDateTime13.setChronology(chronology25);
        org.joda.time.Interval interval40 = interval9.withChronology(chronology25);
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.MutableInterval mutableInterval42 = interval40.toMutableInterval();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean49 = interval45.abuts((org.joda.time.ReadableInterval) interval48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.withWeekyear(2);
        boolean boolean55 = interval45.isBefore((org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Interval interval57 = interval45.withDurationAfterStart(readableDuration56);
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval63 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean64 = interval60.abuts((org.joda.time.ReadableInterval) interval63);
        boolean boolean65 = interval63.containsNow();
        boolean boolean66 = interval57.abuts((org.joda.time.ReadableInterval) interval63);
        long long67 = interval63.toDurationMillis();
        boolean boolean68 = interval40.isBefore((org.joda.time.ReadableInterval) interval63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime34 and dateMidnight52", (mutableDateTime34.compareTo(dateMidnight52) == 0) == mutableDateTime34.equals(dateMidnight52));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        int[] intArray20 = chronology12.get((org.joda.time.ReadablePartial) timeOfDay15, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, chronology12);
        int int22 = mutableDateTime21.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.property(dateTimeFieldType23);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfHalfday();
        long long34 = dateTimeField32.roundHalfFloor(0L);
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        int int36 = dateTimeField32.getMaximumShortTextLength(locale35);
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.lang.String str41 = locale37.getDisplayName(locale39);
        java.lang.String str42 = locale35.getDisplayLanguage(locale37);
        java.util.Calendar calendar43 = mutableDateTime21.toCalendar(locale37);
        int int44 = property3.getMaximumTextLength(locale37);
        java.lang.String str45 = property3.getAsString();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone47);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight48.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight48.minusMonths((-1));
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.plus(readableDuration54);
        int int56 = property3.compareTo((org.joda.time.ReadableInstant) dateMidnight55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateMidnight48", (mutableDateTime21.compareTo(dateMidnight48) == 0) == mutableDateTime21.equals(dateMidnight48));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology6);
        org.joda.time.DurationField durationField12 = chronology6.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField12, and durationField8", !(durationField8.compareTo(durationField12) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField12.compareTo(durationField8))));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.minusYears((int) ' ');
        boolean boolean11 = dateMidnight10.isBeforeNow();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        int[] intArray27 = chronology19.get((org.joda.time.ReadablePartial) timeOfDay22, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, chronology19);
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime41 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) instant40);
        int[] intArray43 = chronology35.get((org.joda.time.ReadablePartial) timeOfDay38, (long) (short) -1);
        mutableDateTime28.setChronology(chronology35);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(chronology35);
        org.joda.time.LocalTime localTime47 = localTime45.minusMillis(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType48.getDurationType();
        boolean boolean50 = localTime45.isSupported(dateTimeFieldType48);
        org.joda.time.DateMidnight.Property property51 = dateMidnight10.property(dateTimeFieldType48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and mutableDateTime28", (dateMidnight2.compareTo(mutableDateTime28) == 0) == dateMidnight2.equals(mutableDateTime28));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusWeeks((int) (short) 100);
        org.joda.time.Interval interval9 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean16 = interval12.abuts((org.joda.time.ReadableInterval) interval15);
        long long17 = interval15.getStartMillis();
        org.joda.time.Interval interval19 = interval15.withStartMillis((long) (short) -1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Instant instant22 = instant20.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime23.add(readablePeriod24, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime41 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) instant40);
        int[] intArray43 = chronology35.get((org.joda.time.ReadablePartial) timeOfDay38, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, chronology35);
        org.joda.time.DurationField durationField45 = chronology35.weeks();
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((-86340000L), chronology35);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology35);
        org.joda.time.DateTimeField dateTimeField48 = chronology35.dayOfWeek();
        mutableDateTime23.setChronology(chronology35);
        org.joda.time.Interval interval50 = interval19.withChronology(chronology35);
        boolean boolean51 = interval9.isBefore((org.joda.time.ReadableInterval) interval50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime44", (dateMidnight3.compareTo(mutableDateTime44) == 0) == dateMidnight3.equals(mutableDateTime44));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight2.getZone();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight2.withZoneRetainFields(dateTimeZone10);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        org.joda.time.Instant instant19 = instant15.withDurationAdded((long) (byte) 100, (int) (short) 1);
        org.joda.time.DateTime dateTime20 = instant15.toDateTimeISO();
        org.joda.time.DateTime dateTime21 = instant15.toDateTimeISO();
        boolean boolean22 = dateMidnight13.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime20", (instant9.compareTo(dateTime20) == 0) == instant9.equals(dateTime20));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight24.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone29 = dateMidnight24.getZone();
        java.lang.String str30 = dateTimeZone29.toString();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime21.toMutableDateTime(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateMidnight24", (mutableDateTime21.compareTo(dateMidnight24) == 0) == mutableDateTime21.equals(dateMidnight24));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Interval interval8 = interval5.withDurationBeforeEnd(readableDuration7);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = instant10.toMutableDateTimeISO();
        org.joda.time.Interval interval13 = interval8.withStart((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval19 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean20 = interval16.abuts((org.joda.time.ReadableInterval) interval19);
        long long21 = interval19.getStartMillis();
        org.joda.time.Interval interval23 = interval19.withStartMillis((long) (short) -1);
        org.joda.time.Interval interval24 = interval13.overlap((org.joda.time.ReadableInterval) interval19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime12", (instant10.compareTo(mutableDateTime12) == 0) == instant10.equals(mutableDateTime12));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 52, chronology7);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        mutableDateTime11.setChronology(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField20, and durationField9", !(durationField9.compareTo(durationField20) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField20.compareTo(durationField9))));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getDurationType();
        mutableDateTime3.add(durationFieldType6, (int) (byte) 0);
        java.lang.String str9 = durationFieldType6.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime3", (instant1.compareTo(mutableDateTime3) == 0) == instant1.equals(mutableDateTime3));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        int int9 = property8.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        int[] intArray26 = chronology18.get((org.joda.time.ReadablePartial) timeOfDay21, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(0L, chronology18);
        org.joda.time.DurationField durationField28 = chronology18.weeks();
        org.joda.time.DateTimeField dateTimeField29 = chronology18.monthOfYear();
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = instant31.getZone();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withDurationAdded(readableDuration34, (int) (byte) 0);
        org.joda.time.DateTime dateTime38 = dateTime33.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime40 = dateTime38.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime42 = dateTime40.plusDays(2);
        org.joda.time.TimeOfDay timeOfDay43 = dateTime42.toTimeOfDay();
        long long45 = chronology18.set((org.joda.time.ReadablePartial) timeOfDay43, 0L);
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(chronology18);
        int int47 = dateTime46.getCenturyOfEra();
        int int48 = property8.getDifference((org.joda.time.ReadableInstant) dateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and mutableDateTime27", (dateMidnight2.compareTo(mutableDateTime27) == 0) == dateMidnight2.equals(mutableDateTime27));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology7);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        int[] intArray26 = chronology18.get((org.joda.time.ReadablePartial) timeOfDay21, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(0L, chronology18);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.DateTime dateTime29 = dateTime9.toDateTime(chronology18);
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property32 = localTime31.hourOfDay();
        org.joda.time.LocalTime localTime33 = property32.roundFloorCopy();
        org.joda.time.LocalTime localTime35 = property32.setCopy(0);
        org.joda.time.LocalTime localTime37 = property32.addWrapFieldToCopy(19);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean44 = interval40.abuts((org.joda.time.ReadableInterval) interval43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.withWeekyear(2);
        boolean boolean50 = interval40.isBefore((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Interval interval52 = interval40.withDurationAfterStart(readableDuration51);
        org.joda.time.Duration duration53 = interval40.toDuration();
        org.joda.time.Interval interval56 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean60 = interval56.abuts((org.joda.time.ReadableInterval) interval59);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.withWeekyear(2);
        boolean boolean66 = interval56.isBefore((org.joda.time.ReadableInstant) dateMidnight63);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.Interval interval68 = interval56.withDurationAfterStart(readableDuration67);
        org.joda.time.Duration duration69 = interval56.toDuration();
        int int70 = duration53.compareTo((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Period period71 = duration53.toPeriod();
        org.joda.time.LocalTime localTime72 = localTime37.minus((org.joda.time.ReadablePeriod) period71);
        org.joda.time.LocalTime localTime74 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime76 = localTime74.minusMinutes((int) (short) 1);
        int int77 = localTime74.getMillisOfDay();
        org.joda.time.LocalTime.Property property78 = localTime74.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType79 = org.joda.time.DurationFieldType.millis();
        boolean boolean80 = localTime74.isSupported(durationFieldType79);
        boolean boolean81 = period71.isSupported(durationFieldType79);
        int[] intArray83 = chronology18.get((org.joda.time.ReadablePeriod) period71, 54493278L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime27 and dateMidnight47", (mutableDateTime27.compareTo(dateMidnight47) == 0) == mutableDateTime27.equals(dateMidnight47));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.Chronology chronology23 = timeOfDay2.getChronology();
        org.joda.time.Chronology chronology24 = chronology23.withUTC();
        org.joda.time.DurationField durationField25 = chronology24.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField25, and durationField21", !(durationField21.compareTo(durationField25) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField25.compareTo(durationField21))));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DurationField durationField18 = chronology8.weeks();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((-86340000L), chronology8);
        int[] intArray20 = localTime19.getValues();
        org.joda.time.LocalTime localTime22 = localTime19.plusMinutes((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime25 = localTime19.withPeriodAdded(readablePeriod23, (int) '4');
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime19.plus(readablePeriod26);
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime31 = localTime29.minusMinutes((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.seconds();
        boolean boolean33 = localTime29.isSupported(durationFieldType32);
        org.joda.time.LocalTime localTime35 = localTime19.withFieldAdded(durationFieldType32, 366);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.withEra(1);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.withCenturyOfEra(2);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.plusMonths(2022);
        org.joda.time.Chronology chronology45 = dateMidnight42.getChronology();
        org.joda.time.DurationField durationField46 = durationFieldType32.getField(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateMidnight38", (mutableDateTime17.compareTo(dateMidnight38) == 0) == mutableDateTime17.equals(dateMidnight38));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DurationField durationField18 = chronology8.weeks();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((-86340000L), chronology8);
        int[] intArray20 = localTime19.getValues();
        org.joda.time.LocalTime localTime22 = localTime19.plusMinutes((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime25 = localTime19.withPeriodAdded(readablePeriod23, (int) '4');
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime19.plus(readablePeriod26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localTime19.toDateTimeToday(dateTimeZone28);
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property32 = localTime31.hourOfDay();
        org.joda.time.LocalTime localTime33 = property32.withMinimumValue();
        java.util.Locale locale34 = java.util.Locale.UK;
        int int35 = property32.getMaximumTextLength(locale34);
        org.joda.time.LocalTime localTime36 = property32.getLocalTime();
        org.joda.time.LocalTime localTime37 = property32.roundHalfFloorCopy();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean44 = interval40.abuts((org.joda.time.ReadableInterval) interval43);
        org.joda.time.LocalTime localTime46 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property47 = localTime46.hourOfDay();
        org.joda.time.LocalTime localTime48 = property47.roundFloorCopy();
        org.joda.time.LocalTime localTime50 = property47.setCopy(0);
        org.joda.time.LocalTime localTime52 = property47.addWrapFieldToCopy(19);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval58 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean59 = interval55.abuts((org.joda.time.ReadableInterval) interval58);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.withWeekyear(2);
        boolean boolean65 = interval55.isBefore((org.joda.time.ReadableInstant) dateMidnight62);
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.Interval interval67 = interval55.withDurationAfterStart(readableDuration66);
        org.joda.time.Duration duration68 = interval55.toDuration();
        org.joda.time.Interval interval71 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval74 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean75 = interval71.abuts((org.joda.time.ReadableInterval) interval74);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone77);
        org.joda.time.DateMidnight dateMidnight80 = dateMidnight78.withWeekyear(2);
        boolean boolean81 = interval71.isBefore((org.joda.time.ReadableInstant) dateMidnight78);
        org.joda.time.ReadableDuration readableDuration82 = null;
        org.joda.time.Interval interval83 = interval71.withDurationAfterStart(readableDuration82);
        org.joda.time.Duration duration84 = interval71.toDuration();
        int int85 = duration68.compareTo((org.joda.time.ReadableDuration) duration84);
        org.joda.time.Period period86 = duration68.toPeriod();
        org.joda.time.LocalTime localTime87 = localTime52.minus((org.joda.time.ReadablePeriod) period86);
        org.joda.time.Interval interval88 = interval43.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period86);
        org.joda.time.LocalTime localTime89 = localTime37.minus((org.joda.time.ReadablePeriod) period86);
        org.joda.time.DateTime dateTime90 = dateTime29.plus((org.joda.time.ReadablePeriod) period86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateMidnight62", (mutableDateTime17.compareTo(dateMidnight62) == 0) == mutableDateTime17.equals(dateMidnight62));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime18.toMutableDateTime(chronology26);
        java.lang.String str30 = chronology26.toString();
        org.joda.time.DurationField durationField31 = chronology26.eras();
        org.joda.time.DurationField durationField32 = chronology26.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField32, and durationField31", !(durationField31.compareTo(durationField32) == 0) || (Math.signum(durationField31.compareTo(durationField31)) == Math.signum(durationField32.compareTo(durationField31))));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.plus(readableDuration4);
        org.joda.time.Chronology chronology6 = instant2.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant2", (mutableDateTime3.compareTo(instant2) == 0) == mutableDateTime3.equals(instant2));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean14 = interval10.abuts((org.joda.time.ReadableInterval) interval13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Interval interval16 = interval13.withDurationBeforeEnd(readableDuration15);
        org.joda.time.Interval interval17 = interval5.overlap((org.joda.time.ReadableInterval) interval13);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, chronology25);
        mutableDateTime34.setYear(3);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone39 = instant38.getZone();
        mutableDateTime34.setZone(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone39);
        boolean boolean42 = interval13.contains((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTime((org.joda.time.ReadableInstant) instant49);
        org.joda.time.Chronology chronology51 = instant49.getChronology();
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0L, chronology51);
        org.joda.time.Chronology chronology56 = timeOfDay55.getChronology();
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property60 = timeOfDay59.minuteOfHour();
        java.lang.String str61 = property60.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime67 = timeOfDay64.toDateTime((org.joda.time.ReadableInstant) instant66);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.DateTime dateTime70 = dateTime67.withPeriodAdded(readablePeriod68, (int) (short) 0);
        int int71 = property60.compareTo((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTime dateTime72 = dateTime67.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((java.lang.Object) dateTime67);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.DateTime dateTime75 = dateTime73.minus(readablePeriod74);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str79 = dateTimeZone78.toString();
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod74, dateTimeZone78);
        org.joda.time.DateTime dateTime81 = timeOfDay55.toDateTimeToday(dateTimeZone78);
        java.lang.String str83 = dateTimeZone78.getNameKey((long) 5);
        org.joda.time.DateTime dateTime84 = dateTime41.toDateTime(dateTimeZone78);
        int int85 = dateTime84.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and mutableDateTime80", (dateTime41.compareTo(mutableDateTime80) == 0) == dateTime41.equals(mutableDateTime80));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0L, chronology21);
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property30 = timeOfDay29.minuteOfHour();
        java.lang.String str31 = property30.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.withPeriodAdded(readablePeriod38, (int) (short) 0);
        int int41 = property30.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime42 = dateTime37.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((java.lang.Object) dateTime37);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.minus(readablePeriod44);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str49 = dateTimeZone48.toString();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod44, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = timeOfDay25.toDateTimeToday(dateTimeZone48);
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTime((org.joda.time.ReadableInstant) instant58);
        org.joda.time.Chronology chronology60 = instant58.getChronology();
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant65 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime66 = timeOfDay63.toDateTime((org.joda.time.ReadableInstant) instant65);
        int[] intArray68 = chronology60.get((org.joda.time.ReadablePartial) timeOfDay63, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(0L, chronology60);
        java.util.Locale locale71 = new java.util.Locale("zh");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology60, locale71, (java.lang.Integer) (-292275054));
        org.joda.time.TimeOfDay timeOfDay74 = timeOfDay25.withChronologyRetainFields(chronology60);
        org.joda.time.DateTime dateTime75 = dateTime10.withChronology(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime50", (dateTime3.compareTo(mutableDateTime50) == 0) == dateTime3.equals(mutableDateTime50));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        org.joda.time.DurationFieldType durationFieldType18 = durationField17.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType19.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.hourOfDay();
        long long34 = chronology26.add(0L, (-11491200000L), (int) '#');
        org.joda.time.DurationField durationField35 = durationFieldType18.getField(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField28", Math.signum(durationField35.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField35)));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0L, chronology9);
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.months();
        org.joda.time.DurationField durationField16 = chronology14.eras();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 2922789, chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField16", Math.signum(durationField15.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField15)));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0L, chronology8);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.months();
        org.joda.time.DurationField durationField15 = chronology13.eras();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField15", Math.signum(durationField14.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField14)));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology6.getZone();
        org.joda.time.DurationField durationField13 = chronology6.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField13, and durationField8", !(durationField8.compareTo(durationField13) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField13.compareTo(durationField8))));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        mutableDateTime16.setMinuteOfDay(8);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str40 = dateTimeZone39.toString();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone39);
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone39);
        java.lang.String str44 = dateTimeZone39.getID();
        mutableDateTime16.setZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime41", (instant5.compareTo(dateTime41) == 0) == instant5.equals(dateTime41));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime10.withHourOfDay(10);
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays((int) 'x');
        org.joda.time.DateTime dateTime18 = dateTime16.plus((long) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0L, chronology27);
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property36 = timeOfDay35.minuteOfHour();
        java.lang.String str37 = property36.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.withPeriodAdded(readablePeriod44, (int) (short) 0);
        int int47 = property36.compareTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime48 = dateTime43.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((java.lang.Object) dateTime43);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.minus(readablePeriod50);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str55 = dateTimeZone54.toString();
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod50, dateTimeZone54);
        org.joda.time.DateTime dateTime57 = timeOfDay31.toDateTimeToday(dateTimeZone54);
        org.joda.time.DateTime dateTime59 = dateTime57.minusYears(1);
        org.joda.time.DateTime dateTime60 = dateTime57.withLaterOffsetAtOverlap();
        boolean boolean61 = dateTime16.isBefore((org.joda.time.ReadableInstant) dateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime56", (dateTime3.compareTo(mutableDateTime56) == 0) == dateTime3.equals(mutableDateTime56));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone15);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = localTime10.toDateTimeToday(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime17", (instant4.compareTo(dateTime17) == 0) == instant4.equals(dateTime17));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.TimeOfDay timeOfDay7 = property3.addToCopy(34);
        java.lang.String str8 = property3.getName();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology15.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.clockhourOfHalfday();
        long long28 = dateTimeField26.roundHalfFloor(0L);
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        int int30 = dateTimeField26.getMaximumShortTextLength(locale29);
        java.lang.String str31 = locale29.getLanguage();
        int int32 = dateTimeField18.getMaximumTextLength(locale29);
        int int33 = property3.getMaximumShortTextLength(locale29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField17", Math.signum(durationField5.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField5)));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.util.Locale locale3 = new java.util.Locale("\u516c\u5143", "0", "weekOfWeekyear");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        int[] intArray20 = chronology12.get((org.joda.time.ReadablePartial) timeOfDay15, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, chronology12);
        org.joda.time.DurationField durationField22 = chronology12.weeks();
        org.joda.time.DateTimeField dateTimeField23 = chronology12.dayOfYear();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        long long28 = chronology12.set((org.joda.time.ReadablePartial) localTime25, (-2678399900L));
        boolean boolean29 = strSet4.equals((java.lang.Object) chronology12);
        org.joda.time.DurationField durationField30 = chronology12.weeks();
        org.joda.time.DurationField durationField31 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField32 = chronology12.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField31", Math.signum(durationField22.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField22)));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone4);
        int int8 = mutableDateTime7.getMillisOfDay();
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        org.joda.time.DateTime dateTime12 = instant10.toDateTime();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant10.withDurationAdded(readableDuration13, (int) 'x');
        org.joda.time.DateTime dateTime16 = instant10.toDateTimeISO();
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) instant10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime12", (dateTime6.compareTo(dateTime12) == 0) == dateTime6.equals(dateTime12));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.weekOfWeekyear();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime9.minus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime9.minusSeconds((int) (byte) 100);
        int int19 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology20 = dateTime18.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(chronology20);
        org.joda.time.YearMonthDay.Property property22 = yearMonthDay21.dayOfMonth();
        int int23 = property22.getMaximumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay24 = property22.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray28 = timeOfDay27.getValues();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay31.minusMinutes((int) '4');
        int int37 = timeOfDay27.compareTo((org.joda.time.ReadablePartial) timeOfDay31);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Chronology chronology44 = instant42.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfHalfday();
        org.joda.time.DurationField durationField46 = chronology44.eras();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay27.withChronologyRetainFields(chronology44);
        int[] intArray48 = timeOfDay47.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTime((org.joda.time.ReadableInstant) instant55);
        org.joda.time.Chronology chronology57 = instant55.getChronology();
        org.joda.time.TimeOfDay timeOfDay60 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime63 = timeOfDay60.toDateTime((org.joda.time.ReadableInstant) instant62);
        int[] intArray65 = chronology57.get((org.joda.time.ReadablePartial) timeOfDay60, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(0L, chronology57);
        org.joda.time.TimeOfDay timeOfDay69 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant71 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime72 = timeOfDay69.toDateTime((org.joda.time.ReadableInstant) instant71);
        org.joda.time.Chronology chronology73 = instant71.getChronology();
        org.joda.time.TimeOfDay timeOfDay76 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant78 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime79 = timeOfDay76.toDateTime((org.joda.time.ReadableInstant) instant78);
        int[] intArray81 = chronology73.get((org.joda.time.ReadablePartial) timeOfDay76, (long) (short) -1);
        mutableDateTime66.setChronology(chronology73);
        org.joda.time.DateTimeField dateTimeField83 = dateTimeFieldType49.getField(chronology73);
        int int84 = timeOfDay47.indexOf(dateTimeFieldType49);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str90 = dateTimeZone89.toString();
        org.joda.time.DateTime dateTime91 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone89);
        org.joda.time.MutableDateTime mutableDateTime92 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone89);
        int int94 = dateTimeZone89.getStandardOffset((long) ' ');
        org.joda.time.DateTime dateTime95 = yearMonthDay24.toDateTime(timeOfDay47, dateTimeZone89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime91", (instant2.compareTo(dateTime91) == 0) == instant2.equals(dateTime91));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.dayOfWeek();
        org.joda.time.DurationField durationField13 = chronology6.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField13, and durationField8", !(durationField8.compareTo(durationField13) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField13.compareTo(durationField8))));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        int int18 = mutableDateTime17.getEra();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.setDayOfYear(6);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        int[] intArray37 = chronology29.get((org.joda.time.ReadablePartial) timeOfDay32, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, chronology29);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        int[] intArray53 = chronology45.get((org.joda.time.ReadablePartial) timeOfDay48, (long) (short) -1);
        mutableDateTime38.setChronology(chronology45);
        boolean boolean55 = mutableDateTime38.isEqualNow();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime38.secondOfDay();
        boolean boolean57 = mutableDateTime38.isAfterNow();
        mutableDateTime38.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime38.add(readablePeriod60);
        mutableDateTime38.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime38, dateTimeZone65);
        mutableDateTime66.addMinutes((int) (short) -1);
        mutableDateTime66.addHours(0);
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) mutableDateTime66);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime17.year();
        org.joda.time.DateTimeField dateTimeField73 = property72.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and mutableDateTime66", (mutableDateTime17.compareTo(mutableDateTime66) == 0) == mutableDateTime17.equals(mutableDateTime66));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        mutableDateTime16.addMonths((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime16.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime38 = property35.addWrapField(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Chronology chronology46 = instant44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfHalfday();
        org.joda.time.DurationField durationField48 = chronology46.eras();
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType39.getField(chronology46);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology53 = chronology46.withZone(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField54 = chronology53.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime38.toMutableDateTime(chronology53);
        org.joda.time.Interval interval58 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval61 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean62 = interval58.abuts((org.joda.time.ReadableInterval) interval61);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.withWeekyear(2);
        boolean boolean68 = interval58.isBefore((org.joda.time.ReadableInstant) dateMidnight65);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.Interval interval70 = interval58.withDurationAfterStart(readableDuration69);
        org.joda.time.Duration duration71 = interval58.toDuration();
        mutableDateTime38.add((org.joda.time.ReadableDuration) duration71, 1439);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime38 and mutableDateTime55", (mutableDateTime38.compareTo(mutableDateTime55) == 0) == mutableDateTime38.equals(mutableDateTime55));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        mutableDateTime16.addMonths((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime16.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime38 = property35.addWrapField(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Chronology chronology46 = instant44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfHalfday();
        org.joda.time.DurationField durationField48 = chronology46.eras();
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType39.getField(chronology46);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology53 = chronology46.withZone(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField54 = chronology53.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime38.toMutableDateTime(chronology53);
        org.joda.time.DateTimeField dateTimeField56 = chronology53.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and mutableDateTime55", (mutableDateTime16.compareTo(mutableDateTime55) == 0) == mutableDateTime16.equals(mutableDateTime55));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.util.Locale locale3 = new java.util.Locale("\u516c\u5143", "0", "weekOfWeekyear");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        int[] intArray20 = chronology12.get((org.joda.time.ReadablePartial) timeOfDay15, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, chronology12);
        org.joda.time.DurationField durationField22 = chronology12.weeks();
        org.joda.time.DateTimeField dateTimeField23 = chronology12.dayOfYear();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        long long28 = chronology12.set((org.joda.time.ReadablePartial) localTime25, (-2678399900L));
        boolean boolean29 = strSet4.equals((java.lang.Object) chronology12);
        org.joda.time.DurationField durationField30 = chronology12.weeks();
        org.joda.time.DurationField durationField31 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField32 = chronology12.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField31", Math.signum(durationField22.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField22)));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DurationField durationField18 = chronology8.weeks();
        org.joda.time.DurationField durationField19 = chronology8.months();
        org.joda.time.DurationField durationField20 = chronology8.months();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder21.clear();
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = locale24.getISO3Country();
        java.util.Locale.Builder builder26 = builder21.setLocale(locale24);
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        org.joda.time.tz.NameProvider nameProvider28 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfHalfday();
        org.joda.time.DurationField durationField38 = chronology36.eras();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType29.getField(chronology36);
        long long42 = dateTimeField39.add((long) (short) 100, (long) (byte) -1);
        boolean boolean43 = dateTimeField39.isSupported();
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTime((org.joda.time.ReadableInstant) instant49);
        org.joda.time.Chronology chronology51 = instant49.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.clockhourOfHalfday();
        long long54 = dateTimeField52.roundHalfFloor(0L);
        java.util.Locale locale55 = java.util.Locale.TRADITIONAL_CHINESE;
        int int56 = dateTimeField52.getMaximumShortTextLength(locale55);
        java.lang.String str57 = locale55.getLanguage();
        java.util.Locale locale58 = locale55.stripExtensions();
        java.lang.String str59 = dateTimeField39.getAsShortText((long) 10, locale55);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight62.withWeekyear(2);
        org.joda.time.DateMidnight.Property property67 = dateMidnight62.weekOfWeekyear();
        java.lang.String str68 = property67.getAsString();
        java.util.Locale locale69 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale70 = locale69.stripExtensions();
        int int71 = property67.getMaximumTextLength(locale69);
        java.lang.String str72 = locale55.getDisplayCountry(locale69);
        java.lang.String str75 = nameProvider28.getName(locale55, "Tue Apr 30 00:00:00 UTC 1912", "\u897f\u5143");
        java.lang.String str76 = locale55.getISO3Language();
        java.util.Locale.Builder builder77 = builder27.setLocale(locale55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket(60000L, chronology8, locale55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField38", Math.signum(durationField18.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField18)));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField12 = dateTimeField11.getDurationField();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.DateTime dateTime17 = timeOfDay16.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay16.hourOfDay();
        java.lang.String str19 = property18.getAsText();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfHalfday();
        long long39 = dateTimeField37.roundHalfFloor(0L);
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        int int41 = dateTimeField37.getMaximumShortTextLength(locale40);
        java.lang.String str42 = locale40.getLanguage();
        int int43 = dateTimeField29.getMaximumTextLength(locale40);
        java.lang.String str44 = property18.getAsText(locale40);
        java.lang.String str45 = dateTimeField11.getAsShortText(54007846, locale40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField28", Math.signum(durationField12.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField12)));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        mutableDateTime4.setMinuteOfHour((int) (byte) 0);
        mutableDateTime4.setWeekyear(32769);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology16 = instant14.getChronology();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        int[] intArray24 = chronology16.get((org.joda.time.ReadablePartial) timeOfDay19, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, chronology16);
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        int[] intArray40 = chronology32.get((org.joda.time.ReadablePartial) timeOfDay35, (long) (short) -1);
        mutableDateTime25.setChronology(chronology32);
        boolean boolean42 = mutableDateTime25.isEqualNow();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime25.secondOfDay();
        boolean boolean44 = mutableDateTime25.isAfterNow();
        mutableDateTime25.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime25.add(readablePeriod47);
        mutableDateTime25.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime25, dateTimeZone52);
        mutableDateTime4.setZone(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and mutableDateTime53", (mutableDateTime25.compareTo(mutableDateTime53) == 0) == mutableDateTime25.equals(mutableDateTime53));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.DateTime dateTime3 = timeOfDay2.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay2.hourOfDay();
        java.lang.String str5 = property4.getAsText();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        long long25 = dateTimeField23.roundHalfFloor(0L);
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        int int27 = dateTimeField23.getMaximumShortTextLength(locale26);
        java.lang.String str28 = locale26.getLanguage();
        int int29 = dateTimeField15.getMaximumTextLength(locale26);
        java.lang.String str30 = property4.getAsText(locale26);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        org.joda.time.Chronology chronology38 = instant36.getChronology();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        int[] intArray46 = chronology38.get((org.joda.time.ReadablePartial) timeOfDay41, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(0L, chronology38);
        org.joda.time.DurationField durationField48 = chronology38.weeks();
        org.joda.time.DateTimeField dateTimeField49 = chronology38.dayOfYear();
        org.joda.time.DateTimeField dateTimeField50 = chronology38.yearOfEra();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTime((org.joda.time.ReadableInstant) instant55);
        org.joda.time.Chronology chronology57 = instant55.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.clockhourOfHalfday();
        long long60 = dateTimeField58.roundHalfFloor(0L);
        java.util.Locale locale61 = java.util.Locale.TRADITIONAL_CHINESE;
        int int62 = dateTimeField58.getMaximumShortTextLength(locale61);
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale64 = locale63.stripExtensions();
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale66 = locale65.stripExtensions();
        java.lang.String str67 = locale63.getDisplayName(locale65);
        java.lang.String str68 = locale61.getDisplayLanguage(locale63);
        java.lang.String str69 = locale61.getDisplayScript();
        int int70 = dateTimeField50.getMaximumTextLength(locale61);
        java.lang.String str71 = property4.getAsText(locale61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField48", Math.signum(durationField14.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField14)));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.addWeekyears((int) (short) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone40 = instant39.getZone();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime44 = dateTime41.withDurationAdded(readableDuration42, (int) (byte) 0);
        org.joda.time.DateTime dateTime46 = dateTime41.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.plusMinutes((int) (byte) 10);
        int int49 = dateTime48.getDayOfYear();
        boolean boolean50 = mutableDateTime16.equals((java.lang.Object) int49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime16.era();
        org.joda.time.DateTime dateTime52 = mutableDateTime16.toDateTimeISO();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTime((org.joda.time.ReadableInstant) instant59);
        org.joda.time.Chronology chronology61 = instant59.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.clockhourOfHalfday();
        long long64 = dateTimeField62.roundHalfFloor(0L);
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        int int66 = dateTimeField62.getMaximumShortTextLength(locale65);
        java.lang.String str67 = locale65.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology54, locale65);
        java.lang.Integer int69 = dateTimeParserBucket68.getPivotYear();
        dateTimeParserBucket68.setOffset(53891);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours(11);
        long long76 = dateTimeZone73.adjustOffset((long) 'x', true);
        long long79 = dateTimeZone73.adjustOffset((long) 6, false);
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(dateTimeZone73);
        dateTimeParserBucket68.setZone(dateTimeZone73);
        mutableDateTime16.setZone(dateTimeZone73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and mutableDateTime80", (dateTime41.compareTo(mutableDateTime80) == 0) == dateTime41.equals(mutableDateTime80));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology8);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay((-2678399900L), chronology8);
        int int11 = timeOfDay10.getHourOfDay();
        org.joda.time.TimeOfDay.Property property12 = timeOfDay10.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str18 = dateTimeZone17.toString();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone17);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.secondOfMinute();
        org.joda.time.DateTime dateTime22 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime19", (instant6.compareTo(dateTime19) == 0) == instant6.equals(dateTime19));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology16 = instant14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfHalfday();
        long long19 = dateTimeField17.roundHalfFloor(0L);
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        int int21 = dateTimeField17.getMaximumShortTextLength(locale20);
        java.lang.String str22 = locale20.getLanguage();
        int int23 = dateTimeField9.getMaximumTextLength(locale20);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime27 = localTime25.minusMinutes((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.seconds();
        boolean boolean29 = localTime25.isSupported(durationFieldType28);
        int int30 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Chronology chronology39 = instant37.getChronology();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        int[] intArray47 = chronology39.get((org.joda.time.ReadablePartial) timeOfDay42, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(0L, chronology39);
        org.joda.time.DurationField durationField49 = chronology39.weeks();
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((-86340000L), chronology39);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalTime localTime52 = localTime50.minus(readablePeriod51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalTime localTime54 = localTime52.minus(readablePeriod53);
        int int55 = dateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) localTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField49", Math.signum(durationField8.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField8)));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology14 = chronology7.withZone(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.minusHours(12);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, chronology25);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        org.joda.time.Chronology chronology41 = instant39.getChronology();
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        int[] intArray49 = chronology41.get((org.joda.time.ReadablePartial) timeOfDay44, (long) (short) -1);
        mutableDateTime34.setChronology(chronology41);
        boolean boolean51 = mutableDateTime34.isEqualNow();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime34.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.millis();
        mutableDateTime34.add(durationFieldType53, (int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant60 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime61 = timeOfDay58.toDateTime((org.joda.time.ReadableInstant) instant60);
        org.joda.time.Chronology chronology62 = instant60.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.clockhourOfHalfday();
        org.joda.time.DurationField durationField64 = durationFieldType53.getField(chronology62);
        org.joda.time.TimeOfDay timeOfDay66 = timeOfDay17.withFieldAdded(durationFieldType53, 26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField64", Math.signum(durationField9.compareTo(durationField64)) == -Math.signum(durationField64.compareTo(durationField9)));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.roll(3, true);
        int int42 = calendar38.getFirstDayOfWeek();
        calendar38.set(5, 32772, 999, 36000000, 0);
        int int50 = calendar38.getGreatestMinimum(2);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone58 = dateMidnight53.getZone();
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.clockhourOfHalfday();
        long long69 = dateTimeField67.roundHalfFloor(0L);
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        int int71 = dateTimeField67.getMaximumShortTextLength(locale70);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale73 = locale72.stripExtensions();
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = locale72.getDisplayName(locale74);
        java.lang.String str77 = locale70.getDisplayLanguage(locale72);
        java.lang.String str78 = dateTimeZone58.getName((long) 'x', locale72);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(locale72);
        java.util.Date date80 = calendar79.getTime();
        calendar38.setTime(date80);
        int int82 = date80.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar79", (calendar38.compareTo(calendar79) == 0) == calendar38.equals(calendar79));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology14 = chronology7.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField15 = chronology7.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField15, and durationField9", !(durationField9.compareTo(durationField15) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField15.compareTo(durationField9))));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.Interval interval9 = interval5.withStartMillis((long) (short) -1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, chronology25);
        org.joda.time.DurationField durationField35 = chronology25.weeks();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((-86340000L), chronology25);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField38 = chronology25.dayOfWeek();
        mutableDateTime13.setChronology(chronology25);
        org.joda.time.Interval interval40 = interval9.withChronology(chronology25);
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology49 = instant47.getChronology();
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime55 = timeOfDay52.toDateTime((org.joda.time.ReadableInstant) instant54);
        int[] intArray57 = chronology49.get((org.joda.time.ReadablePartial) timeOfDay52, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(0L, chronology49);
        mutableDateTime58.setYear(3);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone63 = instant62.getZone();
        mutableDateTime58.setZone(dateTimeZone63);
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = dateTime41.toDateTime(dateTimeZone63);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str72 = dateTimeZone71.toString();
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone71);
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(dateTimeZone71);
        java.lang.String str76 = dateTimeZone71.getID();
        org.joda.time.DateTime dateTime77 = dateTime41.toDateTime(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime75", (instant10.compareTo(dateTime75) == 0) == instant10.equals(dateTime75));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withPeriodAdded(readablePeriod6, (int) (short) 0);
        org.joda.time.DateTime.Property property9 = dateTime5.hourOfDay();
        org.joda.time.LocalTime localTime10 = dateTime5.toLocalTime();
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfWeek();
        java.lang.String str13 = chronology11.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField15 = chronology11.eras();
        org.joda.time.DurationField durationField16 = chronology11.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField16, and durationField15", !(durationField15.compareTo(durationField16) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField16.compareTo(durationField15))));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology14 = chronology7.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = chronology7.weekyear();
        org.joda.time.DurationField durationField16 = dateTimeField15.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField16, and durationField9", !(durationField9.compareTo(durationField16) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField16.compareTo(durationField9))));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology7.dayOfYear();
        java.lang.String str20 = dateTimeField18.getAsShortText(58665600010L);
        int int21 = dateTimeField18.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTime((org.joda.time.ReadableInstant) instant26);
        org.joda.time.Chronology chronology28 = instant26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology28.eras();
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.now(chronology28);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(chronology28);
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str35 = locale34.getDisplayLanguage();
        java.lang.String str36 = locale34.getISO3Language();
        java.lang.String str37 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localTime32, 5, locale34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField30", Math.signum(durationField17.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField17)));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        org.joda.time.DurationField durationField12 = chronology7.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField12, and durationField9", !(durationField9.compareTo(durationField12) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField12.compareTo(durationField9))));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        mutableDateTime4.setMinuteOfHour((int) (byte) 0);
        mutableDateTime4.setWeekyear(32769);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone14);
        int int19 = dateTimeZone14.getStandardOffset((long) ' ');
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) 21, dateTimeZone14);
        mutableDateTime4.setZoneRetainFields(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime16", (instant2.compareTo(dateTime16) == 0) == instant2.equals(dateTime16));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(11);
        long long4 = dateTimeZone1.adjustOffset((long) 'x', true);
        long long7 = dateTimeZone1.adjustOffset((long) 6, false);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded(readableDuration14, (int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime13.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime.Property property21 = dateTime20.dayOfWeek();
        org.joda.time.DateTime dateTime22 = property21.getDateTime();
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfMonth();
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Locale locale26 = locale24.stripExtensions();
        java.lang.String str27 = locale26.getISO3Country();
        int int28 = property23.getMaximumShortTextLength(locale26);
        java.lang.String str29 = dateTimeZone1.getName((long) 512, locale26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime13", (mutableDateTime8.compareTo(dateTime13) == 0) == mutableDateTime8.equals(dateTime13));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        int int6 = yearMonthDay5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay5.minus(readablePeriod7);
        org.joda.time.Chronology chronology9 = yearMonthDay5.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.DurationField durationField12 = chronology9.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property4 = timeOfDay3.minuteOfHour();
        java.lang.String str5 = property4.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withPeriodAdded(readablePeriod12, (int) (short) 0);
        int int15 = property4.compareTo((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime16 = dateTime11.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str23 = dateTimeZone22.toString();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod18, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(81L, dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        int[] intArray41 = chronology33.get((org.joda.time.ReadablePartial) timeOfDay36, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(0L, chronology33);
        int int43 = mutableDateTime42.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime42.property(dateTimeFieldType44);
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.property(dateTimeFieldType47);
        mutableDateTime46.setDayOfMonth(3);
        mutableDateTime46.setMinuteOfDay(35);
        mutableDateTime46.setMillis((long) 15);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone58 = instant57.getZone();
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.weekOfWeekyear();
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone63 = instant62.getZone();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(dateTimeZone63);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.DateTime dateTime67 = dateTime64.withDurationAdded(readableDuration65, (int) (byte) 0);
        org.joda.time.DateTime dateTime69 = dateTime64.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.DateTime dateTime71 = dateTime64.minus(readableDuration70);
        org.joda.time.DateTime dateTime73 = dateTime64.minusSeconds((int) (byte) 100);
        int int74 = mutableDateTime59.compareTo((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone76);
        org.joda.time.DateMidnight dateMidnight79 = dateMidnight77.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight77.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone82 = dateMidnight77.getZone();
        org.joda.time.DateTime dateTime83 = mutableDateTime59.toDateTime(dateTimeZone82);
        mutableDateTime46.setZone(dateTimeZone82);
        long long86 = dateTimeZone22.getMillisKeepLocal(dateTimeZone82, (long) 1439);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and dateTime64", (mutableDateTime24.compareTo(dateTime64) == 0) == mutableDateTime24.equals(dateTime64));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str4 = dateTimeZone3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone3);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(2);
        org.joda.time.DateTime dateTime20 = dateTime16.withHourOfDay(10);
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays((int) 'x');
        boolean boolean23 = dateTime5.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = dateTime5.plusMinutes(5);
        org.joda.time.DateTime dateTime27 = dateTime25.minus((long) 69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(14, (-1));
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        int[] intArray20 = chronology12.get((org.joda.time.ReadablePartial) timeOfDay15, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, chronology12);
        mutableDateTime21.setYear(3);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        mutableDateTime21.setZone(dateTimeZone26);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(0L, dateTimeZone26);
        java.util.TimeZone timeZone29 = dateTimeZone26.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        org.joda.time.Chronology chronology38 = instant36.getChronology();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        int[] intArray46 = chronology38.get((org.joda.time.ReadablePartial) timeOfDay41, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(0L, chronology38);
        mutableDateTime47.setYear(3);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone52 = instant51.getZone();
        mutableDateTime47.setZone(dateTimeZone52);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(0L, dateTimeZone52);
        java.util.TimeZone timeZone55 = dateTimeZone52.toTimeZone();
        boolean boolean56 = timeZone29.hasSameRules(timeZone55);
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant61 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime62 = timeOfDay59.toDateTime((org.joda.time.ReadableInstant) instant61);
        org.joda.time.Chronology chronology63 = instant61.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.clockhourOfHalfday();
        long long66 = dateTimeField64.roundHalfFloor(0L);
        java.util.Locale locale67 = java.util.Locale.TRADITIONAL_CHINESE;
        int int68 = dateTimeField64.getMaximumShortTextLength(locale67);
        java.util.Locale locale69 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale70 = locale69.stripExtensions();
        java.util.Locale locale71 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale72 = locale71.stripExtensions();
        java.lang.String str73 = locale69.getDisplayName(locale71);
        java.lang.String str74 = locale67.getDisplayLanguage(locale69);
        java.util.Calendar calendar75 = java.util.Calendar.getInstance(timeZone55, locale69);
        java.lang.String str76 = timeZone55.getID();
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(timeZone55);
        java.util.Calendar.Builder builder78 = builder3.setTimeZone(timeZone55);
        java.util.Calendar.Builder builder82 = builder3.setWeekDate(1032, 53897, 723960000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar75 and calendar77", (calendar75.compareTo(calendar77) == 0) == calendar75.equals(calendar77));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        int int18 = mutableDateTime17.getEra();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.setDayOfYear(6);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        int[] intArray37 = chronology29.get((org.joda.time.ReadablePartial) timeOfDay32, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, chronology29);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        int[] intArray53 = chronology45.get((org.joda.time.ReadablePartial) timeOfDay48, (long) (short) -1);
        mutableDateTime38.setChronology(chronology45);
        boolean boolean55 = mutableDateTime38.isEqualNow();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime38.secondOfDay();
        boolean boolean57 = mutableDateTime38.isAfterNow();
        mutableDateTime38.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime38.add(readablePeriod60);
        mutableDateTime38.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime38, dateTimeZone65);
        mutableDateTime66.addMinutes((int) (short) -1);
        mutableDateTime66.addHours(0);
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) mutableDateTime66);
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime66);
        org.joda.time.DateTime dateTime73 = localTime72.toDateTimeToday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and mutableDateTime66", (mutableDateTime17.compareTo(mutableDateTime66) == 0) == mutableDateTime17.equals(mutableDateTime66));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Interval interval8 = interval5.withDurationBeforeEnd(readableDuration7);
        boolean boolean9 = interval8.isBeforeNow();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Interval interval11 = interval8.withDurationBeforeEnd(readableDuration10);
        boolean boolean13 = interval8.isBefore((long) 3);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Interval interval15 = interval8.withDurationBeforeEnd(readableDuration14);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, chronology23);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Chronology chronology39 = instant37.getChronology();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        int[] intArray47 = chronology39.get((org.joda.time.ReadablePartial) timeOfDay42, (long) (short) -1);
        mutableDateTime32.setChronology(chronology39);
        mutableDateTime32.addMonths((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime32.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime54 = property51.addWrapField(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant60 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime61 = timeOfDay58.toDateTime((org.joda.time.ReadableInstant) instant60);
        org.joda.time.Chronology chronology62 = instant60.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.clockhourOfHalfday();
        org.joda.time.DurationField durationField64 = chronology62.eras();
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType55.getField(chronology62);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology69 = chronology62.withZone(dateTimeZone68);
        org.joda.time.DateTimeField dateTimeField70 = chronology69.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime54.toMutableDateTime(chronology69);
        org.joda.time.Interval interval72 = interval15.withChronology(chronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime32 and mutableDateTime71", (mutableDateTime32.compareTo(mutableDateTime71) == 0) == mutableDateTime32.equals(mutableDateTime71));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 52, chronology8);
        org.joda.time.DurationField durationField13 = durationFieldType0.getField(chronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField13, and durationField10", !(durationField10.compareTo(durationField13) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField13.compareTo(durationField10))));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.util.Date date6 = new java.util.Date((int) '#', 100, 23, 30, 0, (int) (short) 10);
        int int7 = date6.getYear();
        date6.setMonth(42);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        int[] intArray25 = chronology17.get((org.joda.time.ReadablePartial) timeOfDay20, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, chronology17);
        int int27 = mutableDateTime26.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime26.property(dateTimeFieldType28);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfHalfday();
        long long39 = dateTimeField37.roundHalfFloor(0L);
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        int int41 = dateTimeField37.getMaximumShortTextLength(locale40);
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.util.Locale locale44 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale45 = locale44.stripExtensions();
        java.lang.String str46 = locale42.getDisplayName(locale44);
        java.lang.String str47 = locale40.getDisplayLanguage(locale42);
        java.util.Calendar calendar48 = mutableDateTime26.toCalendar(locale42);
        calendar48.roll(3, true);
        int int52 = calendar48.getFirstDayOfWeek();
        calendar48.set(5, 32772, 999, 36000000, 0);
        int int60 = calendar48.getGreatestMinimum(2);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight63.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone68 = dateMidnight63.getZone();
        org.joda.time.TimeOfDay timeOfDay72 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant74 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime75 = timeOfDay72.toDateTime((org.joda.time.ReadableInstant) instant74);
        org.joda.time.Chronology chronology76 = instant74.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = chronology76.clockhourOfHalfday();
        long long79 = dateTimeField77.roundHalfFloor(0L);
        java.util.Locale locale80 = java.util.Locale.TRADITIONAL_CHINESE;
        int int81 = dateTimeField77.getMaximumShortTextLength(locale80);
        java.util.Locale locale82 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale83 = locale82.stripExtensions();
        java.util.Locale locale84 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale85 = locale84.stripExtensions();
        java.lang.String str86 = locale82.getDisplayName(locale84);
        java.lang.String str87 = locale80.getDisplayLanguage(locale82);
        java.lang.String str88 = dateTimeZone68.getName((long) 'x', locale82);
        java.util.Calendar calendar89 = java.util.Calendar.getInstance(locale82);
        java.util.Date date90 = calendar89.getTime();
        calendar48.setTime(date90);
        int int92 = date90.getMonth();
        int int93 = date6.compareTo(date90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar48 and calendar89", (calendar48.compareTo(calendar89) == 0) == calendar48.equals(calendar89));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        int int14 = dateTimeField11.getDifference((long) (short) -1, (long) 69);
        long long17 = dateTimeField11.set((-11491200000L), 3);
        org.joda.time.DurationField durationField18 = dateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField18, and durationField9", !(durationField9.compareTo(durationField18) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField18.compareTo(durationField9))));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.DateTime dateTime23 = timeOfDay2.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property24 = timeOfDay2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        org.joda.time.DurationField durationField26 = property24.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField26, and durationField21", !(durationField21.compareTo(durationField26) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField26.compareTo(durationField21))));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.minusMonths((-1));
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.minus(readablePeriod8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight2.withZoneRetainFields(dateTimeZone14);
        int int19 = dateMidnight2.getHourOfDay();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight2.minusMonths((int) '4');
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean28 = interval24.abuts((org.joda.time.ReadableInterval) interval27);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean35 = interval31.abuts((org.joda.time.ReadableInterval) interval34);
        long long36 = interval34.getStartMillis();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval42 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean43 = interval39.abuts((org.joda.time.ReadableInterval) interval42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Interval interval45 = interval42.withDurationBeforeEnd(readableDuration44);
        org.joda.time.Interval interval46 = interval34.overlap((org.joda.time.ReadableInterval) interval42);
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        org.joda.time.Chronology chronology54 = instant52.getChronology();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTime((org.joda.time.ReadableInstant) instant59);
        int[] intArray62 = chronology54.get((org.joda.time.ReadablePartial) timeOfDay57, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(0L, chronology54);
        mutableDateTime63.setYear(3);
        org.joda.time.Instant instant67 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone68 = instant67.getZone();
        mutableDateTime63.setZone(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(dateTimeZone68);
        boolean boolean71 = interval42.contains((org.joda.time.ReadableInstant) dateTime70);
        boolean boolean72 = interval27.contains((org.joda.time.ReadableInterval) interval42);
        org.joda.time.Period period73 = interval42.toPeriod();
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight2.minus((org.joda.time.ReadablePeriod) period73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant52", (dateTime16.compareTo(instant52) == 0) == dateTime16.equals(instant52));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime16.add(readablePeriod38);
        mutableDateTime16.setMillis((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime16.dayOfYear();
        int int43 = mutableDateTime16.getSecondOfDay();
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTime((org.joda.time.ReadableInstant) instant49);
        org.joda.time.Chronology chronology51 = instant49.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.clockhourOfHalfday();
        org.joda.time.DurationField durationField53 = chronology51.eras();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) 52, chronology51);
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant60 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime61 = timeOfDay58.toDateTime((org.joda.time.ReadableInstant) instant60);
        org.joda.time.Chronology chronology62 = instant60.getChronology();
        mutableDateTime55.setChronology(chronology62);
        org.joda.time.Interval interval66 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval69 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean70 = interval66.abuts((org.joda.time.ReadableInterval) interval69);
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.Interval interval72 = interval69.withDurationBeforeEnd(readableDuration71);
        boolean boolean73 = interval72.isBeforeNow();
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = interval72.toPeriod(periodType74);
        long long78 = chronology62.add((org.joda.time.ReadablePeriod) period75, (long) 23, 32769);
        org.joda.time.PeriodType periodType79 = period75.getPeriodType();
        mutableDateTime16.add((org.joda.time.ReadablePeriod) period75, 1903);
        org.joda.time.MutablePeriod mutablePeriod82 = period75.toMutablePeriod();
        org.joda.time.TimeOfDay timeOfDay87 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant89 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime90 = timeOfDay87.toDateTime((org.joda.time.ReadableInstant) instant89);
        org.joda.time.Chronology chronology91 = instant89.getChronology();
        org.joda.time.DateMidnight dateMidnight92 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology91);
        org.joda.time.DateTimeField dateTimeField93 = chronology91.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField94 = chronology91.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay95 = new org.joda.time.TimeOfDay(0L, chronology91);
        org.joda.time.DateTimeField dateTimeField96 = chronology91.secondOfMinute();
        org.joda.time.DurationField durationField97 = chronology91.weeks();
        org.joda.time.DurationFieldType durationFieldType98 = durationField97.getType();
        int int99 = period75.get(durationFieldType98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField53 and durationField97", Math.signum(durationField53.compareTo(durationField97)) == -Math.signum(durationField97.compareTo(durationField53)));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean14 = interval10.abuts((org.joda.time.ReadableInterval) interval13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Interval interval16 = interval13.withDurationBeforeEnd(readableDuration15);
        org.joda.time.Interval interval17 = interval5.overlap((org.joda.time.ReadableInterval) interval13);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, chronology25);
        mutableDateTime34.setYear(3);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone39 = instant38.getZone();
        mutableDateTime34.setZone(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone39);
        boolean boolean42 = interval13.contains((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTime((org.joda.time.ReadableInstant) instant49);
        org.joda.time.Chronology chronology51 = instant49.getChronology();
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0L, chronology51);
        org.joda.time.Chronology chronology56 = timeOfDay55.getChronology();
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property60 = timeOfDay59.minuteOfHour();
        java.lang.String str61 = property60.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime67 = timeOfDay64.toDateTime((org.joda.time.ReadableInstant) instant66);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.DateTime dateTime70 = dateTime67.withPeriodAdded(readablePeriod68, (int) (short) 0);
        int int71 = property60.compareTo((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTime dateTime72 = dateTime67.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((java.lang.Object) dateTime67);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.DateTime dateTime75 = dateTime73.minus(readablePeriod74);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str79 = dateTimeZone78.toString();
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod74, dateTimeZone78);
        org.joda.time.DateTime dateTime81 = timeOfDay55.toDateTimeToday(dateTimeZone78);
        java.lang.String str83 = dateTimeZone78.getNameKey((long) 5);
        org.joda.time.DateTime dateTime84 = dateTime41.toDateTime(dateTimeZone78);
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.DateMidnight dateMidnight87 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone86);
        org.joda.time.DateMidnight dateMidnight89 = dateMidnight87.withEra(1);
        org.joda.time.DateMidnight dateMidnight91 = dateMidnight89.withCenturyOfEra(2);
        org.joda.time.DateMidnight dateMidnight93 = dateMidnight91.plusMonths(2022);
        org.joda.time.DateMidnight dateMidnight95 = dateMidnight93.withWeekOfWeekyear(2);
        boolean boolean96 = dateTime84.isAfter((org.joda.time.ReadableInstant) dateMidnight93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and mutableDateTime80", (dateTime41.compareTo(mutableDateTime80) == 0) == dateTime41.equals(mutableDateTime80));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.millis();
        mutableDateTime16.add(durationFieldType35, (int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Chronology chronology44 = instant42.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfHalfday();
        org.joda.time.DurationField durationField46 = durationFieldType35.getField(chronology44);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        org.joda.time.Chronology chronology54 = instant52.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.clockhourOfHalfday();
        org.joda.time.DurationField durationField56 = chronology54.eras();
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType47.getField(chronology54);
        long long60 = dateTimeField57.add((long) (short) 100, (long) (byte) -1);
        boolean boolean61 = dateTimeField57.isSupported();
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime65 = localTime63.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime67 = localTime63.withMillisOfDay((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay71 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant73 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime74 = timeOfDay71.toDateTime((org.joda.time.ReadableInstant) instant73);
        org.joda.time.TimeOfDay timeOfDay76 = timeOfDay71.minusMinutes((int) '4');
        int[] intArray77 = timeOfDay76.getValues();
        int[] intArray79 = dateTimeField57.add((org.joda.time.ReadablePartial) localTime63, 36000000, intArray77, 52);
        org.joda.time.LocalTime localTime81 = localTime63.minusMinutes(11);
        org.joda.time.Chronology chronology82 = localTime81.getChronology();
        boolean boolean83 = durationFieldType35.isSupported(chronology82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField46 and durationField56", Math.signum(durationField46.compareTo(durationField56)) == -Math.signum(durationField56.compareTo(durationField46)));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.millis();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType10.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.hourOfDay();
        int int24 = dateTimeField21.getDifference((long) (short) -1, (long) 69);
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime28 = localTime26.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime30 = localTime26.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime.Property property31 = localTime26.minuteOfHour();
        int int32 = dateTimeField21.getMaximumValue((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.withSecondOfMinute((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property38 = timeOfDay37.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay40 = property38.addWrapFieldToCopy(1);
        int int41 = property38.getMinimumValueOverall();
        int int42 = property38.getMaximumValue();
        java.lang.String str43 = property38.getAsString();
        org.joda.time.TimeOfDay timeOfDay45 = property38.setCopy((int) (byte) 10);
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("DateTimeField[minuteOfDay]");
        java.lang.String str48 = dateTimeField21.getAsShortText((org.joda.time.ReadablePartial) timeOfDay45, locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket(54656420L, chronology7, locale47, (java.lang.Integer) 999, 816);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField19", Math.signum(durationField8.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField8)));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withPeriodAdded(readablePeriod11, (int) (short) 0);
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime15 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime10);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        int[] intArray34 = chronology26.get((org.joda.time.ReadablePartial) timeOfDay29, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, chronology26);
        int int36 = mutableDateTime35.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime35.property(dateTimeFieldType37);
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.property(dateTimeFieldType40);
        mutableDateTime39.addYears((int) '4');
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime39.add(readablePeriod44);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str49 = dateTimeZone48.toString();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight((java.lang.Object) mutableDateTime39, dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime18, dateTimeZone48);
        int int53 = dateTime18.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime52", (dateTime10.compareTo(mutableDateTime52) == 0) == dateTime10.equals(mutableDateTime52));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.roll(3, true);
        int int42 = calendar38.getFirstDayOfWeek();
        calendar38.set(5, 32772, 999, 36000000, 0);
        int int50 = calendar38.getGreatestMinimum(2);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone58 = dateMidnight53.getZone();
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.clockhourOfHalfday();
        long long69 = dateTimeField67.roundHalfFloor(0L);
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        int int71 = dateTimeField67.getMaximumShortTextLength(locale70);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale73 = locale72.stripExtensions();
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = locale72.getDisplayName(locale74);
        java.lang.String str77 = locale70.getDisplayLanguage(locale72);
        java.lang.String str78 = dateTimeZone58.getName((long) 'x', locale72);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(locale72);
        java.util.Date date80 = calendar79.getTime();
        calendar38.setTime(date80);
        java.lang.String str82 = calendar38.getCalendarType();
        calendar38.setMinimalDaysInFirstWeek(53897496);
        org.joda.time.LocalTime localTime85 = org.joda.time.LocalTime.fromCalendarFields(calendar38);
        org.joda.time.Chronology chronology86 = localTime85.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar79", (calendar38.compareTo(calendar79) == 0) == calendar38.equals(calendar79));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        long long15 = chronology7.add(0L, (-11491200000L), (int) '#');
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(chronology7);
        org.joda.time.DurationField durationField17 = chronology7.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField17, and durationField9", !(durationField9.compareTo(durationField17) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField17.compareTo(durationField9))));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.roll(3, true);
        int int42 = calendar38.getFirstDayOfWeek();
        calendar38.set(5, 32772, 999, 36000000, 0);
        int int50 = calendar38.getGreatestMinimum(2);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone58 = dateMidnight53.getZone();
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.clockhourOfHalfday();
        long long69 = dateTimeField67.roundHalfFloor(0L);
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        int int71 = dateTimeField67.getMaximumShortTextLength(locale70);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale73 = locale72.stripExtensions();
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = locale72.getDisplayName(locale74);
        java.lang.String str77 = locale70.getDisplayLanguage(locale72);
        java.lang.String str78 = dateTimeZone58.getName((long) 'x', locale72);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(locale72);
        java.util.Date date80 = calendar79.getTime();
        calendar38.setTime(date80);
        int int82 = date80.getMonth();
        long long83 = date80.getTime();
        long long84 = date80.getTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar79", (calendar38.compareTo(calendar79) == 0) == calendar38.equals(calendar79));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology6.getZone();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(dateTimeZone12);
        java.util.TimeZone timeZone15 = dateTimeZone12.toTimeZone();
        java.time.ZoneId zoneId16 = timeZone15.toZoneId();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone(zoneId16);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale locale20 = builder19.build();
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet22 = locale20.getExtensionKeys();
        java.lang.String str23 = locale20.getDisplayName();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone17, locale20);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        int[] intArray41 = chronology33.get((org.joda.time.ReadablePartial) timeOfDay36, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(0L, chronology33);
        org.joda.time.DurationField durationField43 = chronology33.weeks();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((-86340000L), chronology33);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalTime localTime46 = localTime44.minus(readablePeriod45);
        org.joda.time.LocalTime localTime48 = localTime46.withMillisOfSecond(100);
        boolean boolean49 = calendar24.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField43", Math.signum(durationField8.compareTo(durationField43)) == -Math.signum(durationField43.compareTo(durationField8)));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        long long13 = dateTimeField10.add((long) (short) 100, (long) (byte) -1);
        boolean boolean14 = dateTimeField10.isSupported();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        long long25 = dateTimeField23.roundHalfFloor(0L);
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        int int27 = dateTimeField23.getMaximumShortTextLength(locale26);
        java.lang.String str28 = locale26.getLanguage();
        java.util.Locale locale29 = locale26.stripExtensions();
        java.lang.String str30 = dateTimeField10.getAsShortText((long) 10, locale26);
        long long33 = dateTimeField10.addWrapField((long) 845, 11);
        org.joda.time.DurationField durationField34 = dateTimeField10.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField34, and durationField9", !(durationField9.compareTo(durationField34) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField34.compareTo(durationField9))));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.roll(3, true);
        int int42 = calendar38.getFirstDayOfWeek();
        calendar38.set(5, 32772, 999, 36000000, 0);
        int int50 = calendar38.getGreatestMinimum(2);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone58 = dateMidnight53.getZone();
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.clockhourOfHalfday();
        long long69 = dateTimeField67.roundHalfFloor(0L);
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        int int71 = dateTimeField67.getMaximumShortTextLength(locale70);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale73 = locale72.stripExtensions();
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = locale72.getDisplayName(locale74);
        java.lang.String str77 = locale70.getDisplayLanguage(locale72);
        java.lang.String str78 = dateTimeZone58.getName((long) 'x', locale72);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(locale72);
        java.util.Date date80 = calendar79.getTime();
        calendar38.setTime(date80);
        org.joda.time.LocalDate localDate82 = org.joda.time.LocalDate.fromDateFields(date80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar79", (calendar38.compareTo(calendar79) == 0) == calendar38.equals(calendar79));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.Interval interval9 = interval5.withStartMillis((long) (short) -1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, chronology25);
        org.joda.time.DurationField durationField35 = chronology25.weeks();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((-86340000L), chronology25);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField38 = chronology25.dayOfWeek();
        mutableDateTime13.setChronology(chronology25);
        org.joda.time.Interval interval40 = interval9.withChronology(chronology25);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(chronology25);
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime45 = localTime43.minusMinutes((int) (short) 1);
        int int46 = localTime43.getMillisOfDay();
        org.joda.time.LocalTime localTime48 = localTime43.plusSeconds(100);
        org.joda.time.LocalTime.Property property49 = localTime43.minuteOfHour();
        boolean boolean50 = property49.isLeap();
        org.joda.time.LocalTime localTime52 = property49.addWrapFieldToCopy(20);
        org.joda.time.DateTimeField[] dateTimeFieldArray53 = localTime52.getFields();
        int int54 = localTime52.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTime((org.joda.time.ReadableInstant) instant59);
        org.joda.time.Chronology chronology61 = instant59.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.clockhourOfHalfday();
        org.joda.time.DurationField durationField63 = chronology61.eras();
        org.joda.time.DateTimeField dateTimeField64 = chronology61.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay67 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant69 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime70 = timeOfDay67.toDateTime((org.joda.time.ReadableInstant) instant69);
        org.joda.time.Chronology chronology71 = instant69.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.clockhourOfHalfday();
        long long74 = dateTimeField72.roundHalfFloor(0L);
        java.util.Locale locale75 = java.util.Locale.TRADITIONAL_CHINESE;
        int int76 = dateTimeField72.getMaximumShortTextLength(locale75);
        java.lang.String str77 = locale75.getLanguage();
        int int78 = dateTimeField64.getMaximumTextLength(locale75);
        org.joda.time.LocalTime localTime80 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime82 = localTime80.minusMinutes((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType83 = org.joda.time.DurationFieldType.seconds();
        boolean boolean84 = localTime80.isSupported(durationFieldType83);
        int int85 = dateTimeField64.getMaximumValue((org.joda.time.ReadablePartial) localTime80);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = dateTimeField64.getType();
        boolean boolean87 = localTime52.isSupported(dateTimeFieldType86);
        boolean boolean88 = localTime41.isSupported(dateTimeFieldType86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField63", Math.signum(durationField35.compareTo(durationField63)) == -Math.signum(durationField63.compareTo(durationField35)));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.roll(3, true);
        int int42 = calendar38.getFirstDayOfWeek();
        calendar38.set(5, 32772, 999, 36000000, 0);
        int int50 = calendar38.getGreatestMinimum(2);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone58 = dateMidnight53.getZone();
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.clockhourOfHalfday();
        long long69 = dateTimeField67.roundHalfFloor(0L);
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        int int71 = dateTimeField67.getMaximumShortTextLength(locale70);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale73 = locale72.stripExtensions();
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = locale72.getDisplayName(locale74);
        java.lang.String str77 = locale70.getDisplayLanguage(locale72);
        java.lang.String str78 = dateTimeZone58.getName((long) 'x', locale72);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(locale72);
        java.util.Date date80 = calendar79.getTime();
        calendar38.setTime(date80);
        java.lang.String str82 = calendar38.getCalendarType();
        calendar38.setMinimalDaysInFirstWeek(53897496);
        org.joda.time.LocalTime localTime85 = org.joda.time.LocalTime.fromCalendarFields(calendar38);
        org.joda.time.Instant instant86 = new org.joda.time.Instant((java.lang.Object) calendar38);
        org.joda.time.Instant instant88 = instant86.withMillis(120L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar79", (calendar38.compareTo(calendar79) == 0) == calendar38.equals(calendar79));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.millis();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology17.getZone();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(dateTimeZone23);
        java.util.TimeZone timeZone26 = dateTimeZone23.toTimeZone();
        java.time.ZoneId zoneId27 = timeZone26.toZoneId();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone(zoneId27);
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale locale31 = builder30.build();
        java.util.Set<java.lang.Character> charSet32 = locale31.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet33 = locale31.getExtensionKeys();
        java.lang.String str34 = locale31.getDisplayName();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone28, locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(1645455695647L, chronology7, locale31, (java.lang.Integer) 53910);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField19", Math.signum(durationField8.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField8)));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withPeriodAdded(readablePeriod11, (int) (short) 0);
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime15 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime10);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        int[] intArray34 = chronology26.get((org.joda.time.ReadablePartial) timeOfDay29, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, chronology26);
        int int36 = mutableDateTime35.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime35.property(dateTimeFieldType37);
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.property(dateTimeFieldType40);
        mutableDateTime39.addYears((int) '4');
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime39.add(readablePeriod44);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str49 = dateTimeZone48.toString();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight((java.lang.Object) mutableDateTime39, dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime18, dateTimeZone48);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime52", (dateTime10.compareTo(mutableDateTime52) == 0) == dateTime10.equals(mutableDateTime52));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime13 = dateTime10.withYear(0);
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded((long) 201, 2922789);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime20 = localTime18.minusMinutes((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.seconds();
        boolean boolean22 = localTime18.isSupported(durationFieldType21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.millis();
        java.lang.String str24 = durationFieldType23.getName();
        org.joda.time.LocalTime localTime26 = localTime18.withFieldAdded(durationFieldType23, 70);
        org.joda.time.DateTime dateTime28 = dateTime16.withFieldAdded(durationFieldType23, 11);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight31.withWeekyear(2);
        org.joda.time.DateMidnight.Property property36 = dateMidnight31.weekOfWeekyear();
        java.lang.String str37 = property36.getAsString();
        org.joda.time.DateMidnight dateMidnight39 = property36.addWrapFieldToCopy(8);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.yearOfEra();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withDayOfMonth(21);
        int int43 = dateMidnight42.getEra();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime49 = timeOfDay46.toDateTime((org.joda.time.ReadableInstant) instant48);
        org.joda.time.Chronology chronology50 = instant48.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.clockhourOfHalfday();
        org.joda.time.DurationField durationField52 = chronology50.eras();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField54 = chronology50.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight42.withChronology(chronology50);
        org.joda.time.Chronology chronology56 = dateMidnight55.getChronology();
        boolean boolean57 = durationFieldType23.isSupported(chronology56);
        org.joda.time.DurationField durationField58 = chronology56.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField58, and durationField52", !(durationField52.compareTo(durationField58) == 0) || (Math.signum(durationField52.compareTo(durationField52)) == Math.signum(durationField58.compareTo(durationField52))));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded(readableDuration7, (int) (short) 1);
        int int10 = dateTime6.getDayOfYear();
        int int11 = dateTime6.getDayOfMonth();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        int[] intArray28 = chronology20.get((org.joda.time.ReadablePartial) timeOfDay23, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, chronology20);
        mutableDateTime29.setYear(3);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        mutableDateTime29.setZone(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(dateTimeZone34);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) '#', dateTimeZone34);
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime6.withChronology(chronology38);
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Chronology chronology46 = instant44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfHalfday();
        long long49 = dateTimeField47.roundHalfFloor(0L);
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        int int51 = dateTimeField47.getMaximumShortTextLength(locale50);
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale53 = locale52.stripExtensions();
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale55 = locale54.stripExtensions();
        java.lang.String str56 = locale52.getDisplayName(locale54);
        java.lang.String str57 = locale50.getDisplayLanguage(locale52);
        java.lang.String str58 = locale50.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology38, locale50);
        org.joda.time.DateTimeField dateTimeField60 = chronology38.weekyearOfCentury();
        org.joda.time.Chronology chronology61 = chronology38.withUTC();
        org.joda.time.TimeOfDay timeOfDay63 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 100);
        int int64 = timeOfDay63.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        org.joda.time.Chronology chronology72 = instant70.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.clockhourOfHalfday();
        org.joda.time.DurationField durationField74 = chronology72.eras();
        org.joda.time.DateTimeField dateTimeField75 = dateTimeFieldType65.getField(chronology72);
        long long78 = dateTimeField75.add((long) (short) 100, (long) (byte) -1);
        boolean boolean79 = dateTimeField75.isSupported();
        org.joda.time.LocalTime localTime81 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime83 = localTime81.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime85 = localTime81.withMillisOfDay((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay89 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant91 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime92 = timeOfDay89.toDateTime((org.joda.time.ReadableInstant) instant91);
        org.joda.time.TimeOfDay timeOfDay94 = timeOfDay89.minusMinutes((int) '4');
        int[] intArray95 = timeOfDay94.getValues();
        int[] intArray97 = dateTimeField75.add((org.joda.time.ReadablePartial) localTime81, 36000000, intArray95, 52);
        chronology61.validate((org.joda.time.ReadablePartial) timeOfDay63, intArray95);
        org.joda.time.DurationField durationField99 = chronology61.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField99, and durationField74", !(durationField74.compareTo(durationField99) == 0) || (Math.signum(durationField74.compareTo(durationField74)) == Math.signum(durationField99.compareTo(durationField74))));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0L, chronology8);
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.minuteOfHour();
        java.lang.String str18 = property17.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.withPeriodAdded(readablePeriod25, (int) (short) 0);
        int int28 = property17.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime29 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) dateTime24);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.minus(readablePeriod31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str36 = dateTimeZone35.toString();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod31, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = timeOfDay12.toDateTimeToday(dateTimeZone35);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        int[] intArray55 = chronology47.get((org.joda.time.ReadablePartial) timeOfDay50, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(0L, chronology47);
        java.util.Locale locale58 = new java.util.Locale("zh");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology47, locale58, (java.lang.Integer) (-292275054));
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay12.withChronologyRetainFields(chronology47);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.DateTimeZone dateTimeZone63 = chronology47.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime37 and mutableDateTime62", (mutableDateTime37.compareTo(mutableDateTime62) == 0) == mutableDateTime37.equals(mutableDateTime62));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.DateTime dateTime3 = timeOfDay2.toDateTimeToday();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime3.minusHours(100);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0L, chronology17);
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.minuteOfHour();
        java.lang.String str27 = property26.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withPeriodAdded(readablePeriod34, (int) (short) 0);
        int int37 = property26.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime38 = dateTime33.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((java.lang.Object) dateTime33);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.minus(readablePeriod40);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str45 = dateTimeZone44.toString();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod40, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = timeOfDay21.toDateTimeToday(dateTimeZone44);
        java.lang.String str49 = dateTimeZone44.getNameKey((long) 5);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (-11491200), dateTimeZone44);
        boolean boolean52 = dateTimeZone44.isStandardOffset((long) 22);
        int int54 = dateTimeZone44.getOffset((long) 1978);
        org.joda.time.DateTime dateTime55 = dateTime3.withZone(dateTimeZone44);
        java.lang.String str57 = dateTimeZone44.getNameKey((long) 35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime55", (dateTime3.compareTo(dateTime55) == 0) == dateTime3.equals(dateTime55));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(201, 6);
        int int5 = dateTimeZone3.getOffset(2596441L);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj0, dateTimeZone3);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((long) (-457079));
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        org.joda.time.DateTime dateTime10 = mutableDateTime6.toDateTime(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime10", (mutableDateTime6.compareTo(dateTime10) == 0) == mutableDateTime6.equals(dateTime10));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        long long9 = dateTimeField7.roundHalfFloor(0L);
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        int int11 = dateTimeField7.getMaximumShortTextLength(locale10);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale12.getDisplayName(locale14);
        java.lang.String str17 = locale10.getDisplayLanguage(locale12);
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleAttributes();
        int int19 = strSet18.size();
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, strMap23);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "\u4e2d\u6587\u53f0\u7063)", "zh", "hi!", "\u4e2d\u6587", "1970-01-01T00:00:00.000Z", "zh" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, strMap36);
        boolean boolean38 = strSet18.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37);
        java.util.Spliterator<java.lang.String> strSpliterator39 = strSet18.spliterator();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.clockhourOfHalfday();
        org.joda.time.DurationField durationField49 = chronology47.eras();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType40.getField(chronology47);
        long long53 = dateTimeField50.add((long) (short) 100, (long) (byte) -1);
        boolean boolean54 = dateTimeField50.isSupported();
        org.joda.time.LocalTime localTime56 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime58 = localTime56.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime60 = localTime56.withMillisOfDay((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime67 = timeOfDay64.toDateTime((org.joda.time.ReadableInstant) instant66);
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay64.minusMinutes((int) '4');
        int[] intArray70 = timeOfDay69.getValues();
        int[] intArray72 = dateTimeField50.add((org.joda.time.ReadablePartial) localTime56, 36000000, intArray70, 52);
        org.joda.time.LocalTime localTime74 = localTime56.minusMinutes(11);
        boolean boolean75 = strSet18.equals((java.lang.Object) localTime56);
        org.joda.time.LocalTime.Property property76 = localTime56.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType77 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DurationField durationField79 = durationFieldType77.getField(chronology78);
        boolean boolean80 = localTime56.isSupported(durationFieldType77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField49 and durationField79", Math.signum(durationField49.compareTo(durationField79)) == -Math.signum(durationField79.compareTo(durationField49)));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 52, chronology7);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis((long) (byte) 100);
        long long15 = instant12.getMillis();
        boolean boolean16 = mutableDateTime11.isAfter((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Instant instant19 = instant12.withDurationAdded(35L, (-1));
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean26 = interval22.abuts((org.joda.time.ReadableInterval) interval25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.withWeekyear(2);
        boolean boolean32 = interval22.isBefore((org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Interval interval34 = interval22.withDurationAfterStart(readableDuration33);
        org.joda.time.Duration duration35 = interval22.toDuration();
        org.joda.time.Instant instant36 = instant19.minus((org.joda.time.ReadableDuration) duration35);
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Chronology chronology46 = instant44.getChronology();
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTime((org.joda.time.ReadableInstant) instant51);
        int[] intArray54 = chronology46.get((org.joda.time.ReadablePartial) timeOfDay49, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(0L, chronology46);
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant60 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime61 = timeOfDay58.toDateTime((org.joda.time.ReadableInstant) instant60);
        org.joda.time.Chronology chronology62 = instant60.getChronology();
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant67 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime68 = timeOfDay65.toDateTime((org.joda.time.ReadableInstant) instant67);
        int[] intArray70 = chronology62.get((org.joda.time.ReadablePartial) timeOfDay65, (long) (short) -1);
        mutableDateTime55.setChronology(chronology62);
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime(chronology62);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime((long) (byte) 0, chronology62);
        org.joda.time.DateTimeField dateTimeField74 = chronology62.halfdayOfDay();
        long long78 = chronology62.add((long) 'a', (long) 32769, 31);
        org.joda.time.TimeOfDay timeOfDay79 = new org.joda.time.TimeOfDay((-2678399965L), chronology62);
        org.joda.time.DurationField durationField80 = chronology62.halfdays();
        org.joda.time.DurationField durationField81 = chronology62.minutes();
        boolean boolean82 = duration35.equals((java.lang.Object) chronology62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField80", Math.signum(durationField9.compareTo(durationField80)) == -Math.signum(durationField80.compareTo(durationField9)));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DurationField durationField18 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.dayOfYear();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        long long24 = chronology8.set((org.joda.time.ReadablePartial) localTime21, (-2678399900L));
        org.joda.time.DurationField durationField25 = chronology8.years();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay(1645455601439L, chronology8);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime49 = timeOfDay46.toDateTime((org.joda.time.ReadableInstant) instant48);
        org.joda.time.Chronology chronology50 = instant48.getChronology();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTime((org.joda.time.ReadableInstant) instant55);
        int[] intArray58 = chronology50.get((org.joda.time.ReadablePartial) timeOfDay53, (long) (short) -1);
        mutableDateTime43.setChronology(chronology50);
        mutableDateTime43.addMonths((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime43.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant67 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime68 = timeOfDay65.toDateTime((org.joda.time.ReadableInstant) instant67);
        org.joda.time.Chronology chronology69 = instant67.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.clockhourOfHalfday();
        org.joda.time.DurationField durationField71 = chronology69.eras();
        org.joda.time.DateTimeField dateTimeField72 = chronology69.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone73 = chronology69.getZone();
        org.joda.time.DateTimeField dateTimeField74 = chronology69.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay77 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant79 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime80 = timeOfDay77.toDateTime((org.joda.time.ReadableInstant) instant79);
        org.joda.time.Chronology chronology81 = instant79.getChronology();
        org.joda.time.DateTimeField dateTimeField82 = chronology81.clockhourOfHalfday();
        org.joda.time.DurationField durationField83 = chronology81.eras();
        org.joda.time.DateTimeField dateTimeField84 = chronology81.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone85 = chronology81.getZone();
        org.joda.time.Chronology chronology86 = chronology69.withZone(dateTimeZone85);
        int int88 = dateTimeZone85.getOffset(8035L);
        mutableDateTime43.setZone(dateTimeZone85);
        java.util.GregorianCalendar gregorianCalendar90 = mutableDateTime43.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime91 = mutableDateTime43.toMutableDateTime();
        mutableDateTime91.setWeekOfWeekyear(16);
        boolean boolean94 = localTime26.equals((java.lang.Object) mutableDateTime91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField71", Math.signum(durationField18.compareTo(durationField71)) == -Math.signum(durationField71.compareTo(durationField18)));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str4 = dateTimeZone3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime6.copy();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        int[] intArray23 = chronology15.get((org.joda.time.ReadablePartial) timeOfDay18, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, chronology15);
        int int25 = mutableDateTime24.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime24.property(dateTimeFieldType26);
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.roundCeiling();
        mutableDateTime29.addYears(10);
        boolean boolean32 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) mutableDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant13", (dateTime5.compareTo(instant13) == 0) == dateTime5.equals(instant13));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone4);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded(readableDuration14, (int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime13.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime22 = dateTime20.plusDays(2);
        org.joda.time.DateTime dateTime24 = dateTime20.withHourOfDay(10);
        int int25 = dateTime24.getYear();
        org.joda.time.DateTime.Property property26 = dateTime24.minuteOfHour();
        org.joda.time.DateTime dateTime28 = dateTime24.minusWeeks(52);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        int[] intArray44 = chronology36.get((org.joda.time.ReadablePartial) timeOfDay39, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, chronology36);
        mutableDateTime45.setMinuteOfHour(15);
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime45.add(readableDuration48, 53897);
        boolean boolean51 = dateTime24.isBefore((org.joda.time.ReadableInstant) mutableDateTime45);
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant11", (dateTime6.compareTo(instant11) == 0) == dateTime6.equals(instant11));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DurationField durationField18 = chronology8.weeks();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((-86340000L), chronology8);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.clockhourOfHalfday();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) 31, chronology29);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Chronology chronology39 = instant37.getChronology();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        int[] intArray47 = chronology39.get((org.joda.time.ReadablePartial) timeOfDay42, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(0L, chronology39);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        org.joda.time.Chronology chronology55 = instant53.getChronology();
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant60 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime61 = timeOfDay58.toDateTime((org.joda.time.ReadableInstant) instant60);
        int[] intArray63 = chronology55.get((org.joda.time.ReadablePartial) timeOfDay58, (long) (short) -1);
        mutableDateTime48.setChronology(chronology55);
        mutableDateTime48.addMonths((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime48.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay70 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant72 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime73 = timeOfDay70.toDateTime((org.joda.time.ReadableInstant) instant72);
        org.joda.time.Chronology chronology74 = instant72.getChronology();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.clockhourOfHalfday();
        org.joda.time.DurationField durationField76 = chronology74.eras();
        org.joda.time.DateTimeField dateTimeField77 = chronology74.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone78 = chronology74.getZone();
        org.joda.time.DateTimeField dateTimeField79 = chronology74.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay82 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant84 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime85 = timeOfDay82.toDateTime((org.joda.time.ReadableInstant) instant84);
        org.joda.time.Chronology chronology86 = instant84.getChronology();
        org.joda.time.DateTimeField dateTimeField87 = chronology86.clockhourOfHalfday();
        org.joda.time.DurationField durationField88 = chronology86.eras();
        org.joda.time.DateTimeField dateTimeField89 = chronology86.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone90 = chronology86.getZone();
        org.joda.time.Chronology chronology91 = chronology74.withZone(dateTimeZone90);
        int int93 = dateTimeZone90.getOffset(8035L);
        mutableDateTime48.setZone(dateTimeZone90);
        org.joda.time.Chronology chronology95 = chronology29.withZone(dateTimeZone90);
        mutableDateTime20.setZone(dateTimeZone90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField76", Math.signum(durationField18.compareTo(durationField76)) == -Math.signum(durationField76.compareTo(durationField18)));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight5.withFields((org.joda.time.ReadablePartial) timeOfDay10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.withDayOfMonth(4);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.centuryOfEra();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay17.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withPeriodAdded(readablePeriod26, (int) (short) 0);
        int int29 = property18.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime30 = dateTime25.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) dateTime25);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.minus(readablePeriod32);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str37 = dateTimeZone36.toString();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod32, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight13.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(438);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = dateMidnight39.toDateTime(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime38 and mutableDateTime42", (mutableDateTime38.compareTo(mutableDateTime42) == 0) == mutableDateTime38.equals(mutableDateTime42));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withPeriodAdded(readablePeriod6, (int) (short) 0);
        boolean boolean9 = dateTime5.isAfterNow();
        org.joda.time.DateTime dateTime11 = dateTime5.plus((long) 15);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.minuteOfHour();
        java.lang.String str16 = property15.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.withPeriodAdded(readablePeriod23, (int) (short) 0);
        int int26 = property15.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime27 = dateTime22.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.clockhourOfHalfday();
        long long38 = dateTimeField36.roundHalfFloor(0L);
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        int int40 = dateTimeField36.getMaximumShortTextLength(locale39);
        java.lang.String str41 = locale39.getLanguage();
        java.lang.String str42 = locale39.getLanguage();
        java.util.Calendar calendar43 = dateTime27.toCalendar(locale39);
        java.util.Calendar calendar44 = dateTime11.toCalendar(locale39);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTime((org.joda.time.ReadableInstant) instant51);
        org.joda.time.Chronology chronology53 = instant51.getChronology();
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology53);
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.fromMillisOfDay((-2678399900L), chronology53);
        boolean boolean56 = calendar44.after((java.lang.Object) chronology53);
        org.joda.time.TimeOfDay timeOfDay57 = org.joda.time.TimeOfDay.fromCalendarFields(calendar44);
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.TimeOfDay timeOfDay69 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant71 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime72 = timeOfDay69.toDateTime((org.joda.time.ReadableInstant) instant71);
        int[] intArray74 = chronology66.get((org.joda.time.ReadablePartial) timeOfDay69, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(0L, chronology66);
        mutableDateTime75.setYear(3);
        org.joda.time.Instant instant79 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone80 = instant79.getZone();
        mutableDateTime75.setZone(dateTimeZone80);
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight(dateTimeZone80);
        org.joda.time.LocalTime localTime83 = new org.joda.time.LocalTime((long) '#', dateTimeZone80);
        org.joda.time.LocalTime localTime84 = new org.joda.time.LocalTime((java.lang.Object) calendar44, dateTimeZone80);
        int int86 = dateTimeZone80.getStandardOffset((long) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on timeOfDay57 and localTime84", (timeOfDay57.compareTo(localTime84) == 0) == timeOfDay57.equals(localTime84));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime16.add(readablePeriod38);
        mutableDateTime16.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, dateTimeZone43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime16.monthOfYear();
        org.joda.time.DateTimeField dateTimeField46 = property45.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and mutableDateTime44", (mutableDateTime16.compareTo(mutableDateTime44) == 0) == mutableDateTime16.equals(mutableDateTime44));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.DateTime dateTime23 = timeOfDay2.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property24 = timeOfDay2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        org.joda.time.TimeOfDay timeOfDay27 = property24.addWrapFieldToCopy(24);
        org.joda.time.DurationField durationField28 = property24.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField28, and durationField21", !(durationField21.compareTo(durationField28) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField28.compareTo(durationField21))));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 52, chronology7);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        mutableDateTime11.setChronology(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField20, and durationField9", !(durationField9.compareTo(durationField20) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField20.compareTo(durationField9))));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology7.dayOfYear();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        long long23 = chronology7.set((org.joda.time.ReadablePartial) localTime20, (-2678399900L));
        org.joda.time.DurationField durationField24 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField25 = chronology7.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField24", Math.signum(durationField17.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField17)));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withEra(1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withCenturyOfEra(2);
        int int7 = dateMidnight4.getDayOfYear();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology14.eras();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(chronology14);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(chronology14);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight21.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone26 = dateMidnight21.getZone();
        long long30 = dateTimeZone26.convertLocalToUTC(0L, true, (long) 5);
        java.lang.String str32 = dateTimeZone26.getName((long) 4);
        org.joda.time.Chronology chronology33 = chronology14.withZone(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight4.withChronology(chronology14);
        org.joda.time.DateTimeField dateTimeField35 = chronology14.dayOfWeek();
        int int37 = dateTimeField35.getMinimumValue((long) 45);
        org.joda.time.DurationField durationField38 = dateTimeField35.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField38, and durationField16", !(durationField16.compareTo(durationField38) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField38.compareTo(durationField16))));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone4);
        int int8 = mutableDateTime7.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.withDurationAdded((long) 2, 100);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight14.withFields((org.joda.time.ReadablePartial) timeOfDay19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.withDayOfMonth(4);
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.centuryOfEra();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property27 = timeOfDay26.minuteOfHour();
        java.lang.String str28 = property27.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.withPeriodAdded(readablePeriod35, (int) (short) 0);
        int int38 = property27.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime39 = dateTime34.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((java.lang.Object) dateTime34);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.DateTime dateTime42 = dateTime40.minus(readablePeriod41);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str46 = dateTimeZone45.toString();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod41, dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight22.withZoneRetainFields(dateTimeZone45);
        int int49 = dateMidnight22.getYearOfEra();
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime7, (org.joda.time.ReadableInstant) dateMidnight22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant33", (dateTime6.compareTo(instant33) == 0) == dateTime6.equals(instant33));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withPeriodAdded(readablePeriod6, (int) (short) 0);
        boolean boolean9 = dateTime5.isAfterNow();
        org.joda.time.DateTime dateTime11 = dateTime5.plus((long) 15);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.minuteOfHour();
        java.lang.String str16 = property15.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.withPeriodAdded(readablePeriod23, (int) (short) 0);
        int int26 = property15.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime27 = dateTime22.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.clockhourOfHalfday();
        long long38 = dateTimeField36.roundHalfFloor(0L);
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        int int40 = dateTimeField36.getMaximumShortTextLength(locale39);
        java.lang.String str41 = locale39.getLanguage();
        java.lang.String str42 = locale39.getLanguage();
        java.util.Calendar calendar43 = dateTime27.toCalendar(locale39);
        java.util.Calendar calendar44 = dateTime11.toCalendar(locale39);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTime((org.joda.time.ReadableInstant) instant51);
        org.joda.time.Chronology chronology53 = instant51.getChronology();
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology53);
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.fromMillisOfDay((-2678399900L), chronology53);
        boolean boolean56 = calendar44.after((java.lang.Object) chronology53);
        org.joda.time.TimeOfDay timeOfDay57 = org.joda.time.TimeOfDay.fromCalendarFields(calendar44);
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.TimeOfDay timeOfDay69 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant71 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime72 = timeOfDay69.toDateTime((org.joda.time.ReadableInstant) instant71);
        int[] intArray74 = chronology66.get((org.joda.time.ReadablePartial) timeOfDay69, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(0L, chronology66);
        mutableDateTime75.setYear(3);
        org.joda.time.Instant instant79 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone80 = instant79.getZone();
        mutableDateTime75.setZone(dateTimeZone80);
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight(dateTimeZone80);
        org.joda.time.LocalTime localTime83 = new org.joda.time.LocalTime((long) '#', dateTimeZone80);
        org.joda.time.LocalTime localTime84 = new org.joda.time.LocalTime((java.lang.Object) calendar44, dateTimeZone80);
        int int85 = calendar44.getFirstDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on timeOfDay57 and localTime84", (timeOfDay57.compareTo(localTime84) == 0) == timeOfDay57.equals(localTime84));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime10.withHourOfDay(10);
        org.joda.time.DateTime.Property property15 = dateTime14.monthOfYear();
        org.joda.time.DateTime dateTime17 = property15.addToCopy(53963);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0L, chronology26);
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property35 = timeOfDay34.minuteOfHour();
        java.lang.String str36 = property35.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime45 = dateTime42.withPeriodAdded(readablePeriod43, (int) (short) 0);
        int int46 = property35.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime47 = dateTime42.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((java.lang.Object) dateTime42);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.minus(readablePeriod49);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str54 = dateTimeZone53.toString();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod49, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = timeOfDay30.toDateTimeToday(dateTimeZone53);
        org.joda.time.DateTime dateTime57 = dateTime17.toDateTime(dateTimeZone53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime55", (dateTime3.compareTo(mutableDateTime55) == 0) == dateTime3.equals(mutableDateTime55));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DurationField durationField18 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.monthOfYear();
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.withDurationAdded(readableDuration24, (int) (byte) 0);
        org.joda.time.DateTime dateTime28 = dateTime23.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime32 = dateTime30.plusDays(2);
        org.joda.time.TimeOfDay timeOfDay33 = dateTime32.toTimeOfDay();
        long long35 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay33, 0L);
        org.joda.time.DateTimeField dateTimeField36 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField37 = chronology8.millis();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(2592000000L, chronology8);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray44 = timeOfDay43.getValues();
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTime((org.joda.time.ReadableInstant) instant49);
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay47.minusMinutes((int) '4');
        int int53 = timeOfDay43.compareTo((org.joda.time.ReadablePartial) timeOfDay47);
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTime((org.joda.time.ReadableInstant) instant58);
        org.joda.time.Chronology chronology60 = instant58.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.clockhourOfHalfday();
        org.joda.time.DurationField durationField62 = chronology60.eras();
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay43.withChronologyRetainFields(chronology60);
        org.joda.time.Chronology chronology64 = timeOfDay43.getChronology();
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder66 = builder65.clearExtensions();
        java.util.Locale locale67 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder68 = builder66.setLocale(locale67);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) 266, chronology64, locale67);
        long long71 = dateTimeParserBucket69.computeMillis(false);
        org.joda.time.LocalTime localTime73 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property74 = localTime73.hourOfDay();
        org.joda.time.LocalTime localTime76 = property74.addCopy(21);
        org.joda.time.LocalTime localTime77 = property74.withMinimumValue();
        org.joda.time.LocalTime localTime79 = property74.setCopy(2);
        org.joda.time.LocalTime localTime80 = property74.roundHalfFloorCopy();
        org.joda.time.Chronology chronology81 = localTime80.getChronology();
        org.joda.time.DateTimeField dateTimeField82 = chronology81.dayOfWeek();
        dateTimeParserBucket69.saveField(dateTimeField82, 0);
        int int85 = dateMidnight39.get(dateTimeField82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField62", Math.signum(durationField18.compareTo(durationField62)) == -Math.signum(durationField62.compareTo(durationField18)));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(201, 6);
        int int5 = dateTimeZone3.getOffset(2596441L);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj0, dateTimeZone3);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((long) (-457079));
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        org.joda.time.DateTime dateTime10 = mutableDateTime6.toDateTime(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime10", (mutableDateTime6.compareTo(dateTime10) == 0) == mutableDateTime6.equals(dateTime10));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0L, chronology10);
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, chronology23);
        org.joda.time.DurationField durationField33 = chronology23.weeks();
        org.joda.time.Chronology chronology34 = chronology23.withUTC();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay14.withChronologyRetainFields(chronology34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Chronology chronology44 = instant42.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfHalfday();
        long long47 = dateTimeField45.roundHalfFloor(0L);
        java.util.Locale locale48 = java.util.Locale.TRADITIONAL_CHINESE;
        int int49 = dateTimeField45.getMaximumShortTextLength(locale48);
        java.lang.String str50 = locale48.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology37, locale48);
        int int52 = dateTimeParserBucket51.getOffset();
        java.util.Locale locale53 = dateTimeParserBucket51.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket(1645455561258L, chronology34, locale53, (java.lang.Integer) 29);
        org.joda.time.DurationField durationField56 = chronology34.eras();
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay((long) 54090086, chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField33 and durationField56", Math.signum(durationField33.compareTo(durationField56)) == -Math.signum(durationField56.compareTo(durationField33)));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology18.getZone();
        org.joda.time.Chronology chronology23 = chronology6.withZone(dateTimeZone22);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean30 = interval26.abuts((org.joda.time.ReadableInterval) interval29);
        long long31 = interval29.getStartMillis();
        org.joda.time.Interval interval33 = interval29.withStartMillis((long) (short) -1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Instant instant36 = instant34.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime37 = instant36.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime37.add(readablePeriod38, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology49 = instant47.getChronology();
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime55 = timeOfDay52.toDateTime((org.joda.time.ReadableInstant) instant54);
        int[] intArray57 = chronology49.get((org.joda.time.ReadablePartial) timeOfDay52, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(0L, chronology49);
        org.joda.time.DurationField durationField59 = chronology49.weeks();
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime((-86340000L), chronology49);
        org.joda.time.MutableDateTime mutableDateTime61 = org.joda.time.MutableDateTime.now(chronology49);
        org.joda.time.DateTimeField dateTimeField62 = chronology49.dayOfWeek();
        mutableDateTime37.setChronology(chronology49);
        org.joda.time.Interval interval64 = interval33.withChronology(chronology49);
        org.joda.time.DateTime dateTime65 = interval64.getEnd();
        org.joda.time.TimeOfDay timeOfDay69 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant71 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime72 = timeOfDay69.toDateTime((org.joda.time.ReadableInstant) instant71);
        org.joda.time.Chronology chronology73 = instant71.getChronology();
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology73);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology73);
        org.joda.time.TimeOfDay timeOfDay76 = new org.joda.time.TimeOfDay((java.lang.Object) dateTime65, chronology73);
        org.joda.time.TimeOfDay timeOfDay78 = timeOfDay76.minusMillis(2744);
        org.joda.time.TimeOfDay.Property property79 = timeOfDay76.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay81 = property79.addToCopy(292278994);
        long long83 = chronology23.set((org.joda.time.ReadablePartial) timeOfDay81, 54770408L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField59", Math.signum(durationField8.compareTo(durationField59)) == -Math.signum(durationField59.compareTo(durationField8)));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.years();
        java.lang.String str1 = durationFieldType0.getName();
        java.util.Date date5 = new java.util.Date(0, (int) '4', 0);
        int int6 = date5.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromDateFields(date5);
        int int8 = yearMonthDay7.getYear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay7.minus(readablePeriod9);
        org.joda.time.Chronology chronology11 = yearMonthDay7.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField13 = chronology11.eras();
        org.joda.time.DurationField durationField14 = durationFieldType0.getField(chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField14, and durationField13", !(durationField13.compareTo(durationField14) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField14.compareTo(durationField13))));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.Chronology chronology23 = timeOfDay2.getChronology();
        org.joda.time.Chronology chronology24 = chronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfYear();
        org.joda.time.DurationField durationField26 = dateTimeField25.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField26, and durationField21", !(durationField21.compareTo(durationField26) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField26.compareTo(durationField21))));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(chronology6);
        org.joda.time.DurationField durationField12 = chronology6.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField12, and durationField8", !(durationField8.compareTo(durationField12) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField12.compareTo(durationField8))));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        mutableDateTime16.setYear(3);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        mutableDateTime16.setZone(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone21);
        java.lang.String str25 = dateTimeZone21.getName((long) 'x');
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        int[] intArray41 = chronology33.get((org.joda.time.ReadablePartial) timeOfDay36, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(0L, chronology33);
        org.joda.time.DurationField durationField43 = chronology33.weeks();
        org.joda.time.DateTimeField dateTimeField44 = chronology33.dayOfYear();
        org.joda.time.LocalTime localTime46 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        long long49 = chronology33.set((org.joda.time.ReadablePartial) localTime46, (-2678399900L));
        boolean boolean50 = dateTimeZone21.equals((java.lang.Object) chronology33);
        org.joda.time.DurationField durationField51 = chronology33.months();
        org.joda.time.DateTimeField dateTimeField52 = chronology33.weekOfWeekyear();
        org.joda.time.DurationField durationField53 = chronology33.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField43, and durationField51", !(durationField53.compareTo(durationField43) == 0) || (Math.signum(durationField53.compareTo(durationField51)) == Math.signum(durationField43.compareTo(durationField51))));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str4 = dateTimeZone3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone3);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(2);
        org.joda.time.DateTime dateTime20 = dateTime16.withHourOfDay(10);
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays((int) 'x');
        boolean boolean23 = dateTime5.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = dateTime5.plusMinutes(5);
        org.joda.time.DateTime dateTime27 = dateTime25.plus(293139054069L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        int int3 = localDateTime0.getHourOfDay();
        int int4 = localDateTime0.getWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withDayOfMonth(15);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusYears(0);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded(readableDuration15, (int) (byte) 0);
        org.joda.time.DateTime dateTime19 = dateTime14.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime27 = dateTime23.withYearOfCentury(3);
        org.joda.time.DateTime dateTime29 = dateTime23.plusDays((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.withDurationAdded(readableDuration30, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime35 = dateTime32.withField(dateTimeFieldType33, (int) (short) 10);
        int int36 = localDateTime7.get(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusSeconds(12);
        org.joda.time.Chronology chronology40 = localDateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.minuteOfDay();
        boolean boolean42 = dateTimeFieldType33.isSupported(chronology40);
        boolean boolean43 = localDateTime6.isSupported(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime6.withWeekyear(369);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withMillisOfDay(53956956);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str53 = dateTimeZone52.toString();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(600000L, dateTimeZone52);
        org.joda.time.DateTime dateTime57 = localDateTime47.toDateTime(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime54", (instant12.compareTo(dateTime54) == 0) == instant12.equals(dateTime54));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime5.toDateMidnight();
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime5.minusHours(59);
        org.joda.time.DateTime dateTime12 = dateTime5.withLaterOffsetAtOverlap();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.millis();
        org.joda.time.DurationField durationField21 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.dayOfMonth();
        org.joda.time.DateTime dateTime23 = dateTime12.withChronology(chronology19);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray27 = timeOfDay26.getValues();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay30.minusMinutes((int) '4');
        int int36 = timeOfDay26.compareTo((org.joda.time.ReadablePartial) timeOfDay30);
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        org.joda.time.Chronology chronology43 = instant41.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.clockhourOfHalfday();
        org.joda.time.DurationField durationField45 = chronology43.eras();
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay26.withChronologyRetainFields(chronology43);
        org.joda.time.Chronology chronology47 = timeOfDay26.getChronology();
        org.joda.time.Chronology chronology48 = chronology47.withUTC();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime23.toMutableDateTime(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField45", Math.signum(durationField20.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField20)));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        long long9 = dateTimeField7.roundHalfFloor(0L);
        long long11 = dateTimeField7.roundHalfFloor((long) 11);
        org.joda.time.DurationField durationField12 = dateTimeField7.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = chronology21.eras();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType14.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.hourOfDay();
        int int28 = dateTimeField25.getDifference((long) (short) -1, (long) 69);
        long long31 = dateTimeField25.set((-11491200000L), 3);
        long long33 = dateTimeField25.roundHalfEven((long) 40);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight37.withWeekyear(2);
        org.joda.time.DateMidnight.Property property42 = dateMidnight37.weekOfWeekyear();
        java.lang.String str43 = property42.getAsString();
        java.util.Locale locale44 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale45 = locale44.stripExtensions();
        int int46 = property42.getMaximumTextLength(locale44);
        java.lang.String str47 = dateTimeField25.getAsText(54023014, locale44);
        java.lang.String str48 = dateTimeField7.getAsShortText(54795564L, locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField23", Math.signum(durationField12.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField12)));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime8.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight21.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone26 = dateMidnight21.getZone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.clockhourOfHalfday();
        long long37 = dateTimeField35.roundHalfFloor(0L);
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        int int39 = dateTimeField35.getMaximumShortTextLength(locale38);
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale41 = locale40.stripExtensions();
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.lang.String str44 = locale40.getDisplayName(locale42);
        java.lang.String str45 = locale38.getDisplayLanguage(locale40);
        java.lang.String str46 = dateTimeZone26.getName((long) 'x', locale40);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(dateTimeZone26);
        java.util.TimeZone timeZone48 = dateTimeZone26.toTimeZone();
        boolean boolean49 = dateTimeZone26.isFixed();
        long long51 = dateTimeZone16.getMillisKeepLocal(dateTimeZone26, 0L);
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((java.lang.Object) dateTime8, dateTimeZone16);
        boolean boolean53 = dateTimeZone16.isFixed();
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime55", (dateTime3.compareTo(dateTime55) == 0) == dateTime3.equals(dateTime55));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        long long1 = instant0.getMillis();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean8 = interval4.abuts((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean15 = interval11.abuts((org.joda.time.ReadableInterval) interval14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withWeekyear(2);
        boolean boolean21 = interval11.isBefore((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Interval interval23 = interval11.withDurationAfterStart(readableDuration22);
        org.joda.time.Duration duration24 = interval11.toDuration();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean31 = interval27.abuts((org.joda.time.ReadableInterval) interval30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.withWeekyear(2);
        boolean boolean37 = interval27.isBefore((org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Interval interval39 = interval27.withDurationAfterStart(readableDuration38);
        org.joda.time.Duration duration40 = interval27.toDuration();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean47 = interval43.abuts((org.joda.time.ReadableInterval) interval46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.withWeekyear(2);
        boolean boolean53 = interval43.isBefore((org.joda.time.ReadableInstant) dateMidnight50);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Interval interval55 = interval43.withDurationAfterStart(readableDuration54);
        org.joda.time.Duration duration56 = interval43.toDuration();
        int int57 = duration40.compareTo((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Period period58 = duration40.toPeriod();
        boolean boolean59 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Interval interval60 = interval4.withDurationAfterStart((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Instant instant61 = instant0.minus((org.joda.time.ReadableDuration) duration24);
        java.lang.Object obj62 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(201, 6);
        int int67 = dateTimeZone65.getOffset(2596441L);
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj62, dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime((java.lang.Object) instant61, dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant61 and mutableDateTime68", (instant61.compareTo(mutableDateTime68) == 0) == instant61.equals(mutableDateTime68));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        int int6 = yearMonthDay5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay5.minus(readablePeriod7);
        org.joda.time.Chronology chronology9 = yearMonthDay5.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.DurationField durationField12 = chronology9.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.year();
        int int4 = localDateTime0.getMillisOfDay();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.weekOfWeekyear();
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded(readableDuration15, (int) (byte) 0);
        org.joda.time.DateTime dateTime19 = dateTime14.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime14.minus(readableDuration20);
        org.joda.time.DateTime dateTime23 = dateTime14.minusSeconds((int) (byte) 100);
        int int24 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight27.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone32 = dateMidnight27.getZone();
        org.joda.time.DateTime dateTime33 = mutableDateTime9.toDateTime(dateTimeZone32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        org.joda.time.Chronology chronology41 = instant39.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.clockhourOfHalfday();
        org.joda.time.DurationField durationField43 = chronology41.eras();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType34.getField(chronology41);
        long long47 = dateTimeField44.add((long) (short) 100, (long) (byte) -1);
        boolean boolean48 = dateTimeField44.isSupported();
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime52 = localTime50.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime54 = localTime50.withMillisOfDay((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant60 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime61 = timeOfDay58.toDateTime((org.joda.time.ReadableInstant) instant60);
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay58.minusMinutes((int) '4');
        int[] intArray64 = timeOfDay63.getValues();
        int[] intArray66 = dateTimeField44.add((org.joda.time.ReadablePartial) localTime50, 36000000, intArray64, 52);
        org.joda.time.LocalTime localTime68 = localTime50.minusMinutes(11);
        int int69 = localTime68.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay72 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay74 = timeOfDay72.withSecondOfMinute((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property75 = timeOfDay74.hourOfDay();
        boolean boolean76 = localTime68.isAfter((org.joda.time.ReadablePartial) timeOfDay74);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetMillis(32769);
        org.joda.time.DateTime dateTime79 = localTime68.toDateTimeToday(dateTimeZone78);
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime33, dateTimeZone78);
        org.joda.time.DateTime dateTime81 = localDateTime0.toDateTime(dateTimeZone78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and mutableDateTime80", (mutableDateTime9.compareTo(mutableDateTime80) == 0) == mutableDateTime9.equals(mutableDateTime80));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.property(dateTimeFieldType21);
        mutableDateTime20.setDayOfMonth(3);
        mutableDateTime20.setMinuteOfDay(35);
        mutableDateTime20.addHours(9);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime20.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundFloor();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Chronology chronology39 = instant37.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.clockhourOfHalfday();
        long long42 = dateTimeField40.roundHalfFloor(0L);
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        int int44 = dateTimeField40.getMaximumShortTextLength(locale43);
        java.lang.String str45 = locale43.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology32, locale43);
        java.lang.Integer int47 = dateTimeParserBucket46.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        org.joda.time.Chronology chronology55 = instant53.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.eras();
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType48.getField(chronology55);
        long long61 = dateTimeField58.add((long) (short) 100, (long) (byte) -1);
        boolean boolean62 = dateTimeField58.isSupported();
        dateTimeParserBucket46.saveField(dateTimeField58, 0);
        mutableDateTime30.setRounding(dateTimeField58);
        org.joda.time.DurationField durationField66 = dateTimeField58.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField57, durationField66, and durationField57", !(durationField57.compareTo(durationField66) == 0) || (Math.signum(durationField57.compareTo(durationField57)) == Math.signum(durationField66.compareTo(durationField57))));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone4);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays(0);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) dateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant13", (dateTime6.compareTo(instant13) == 0) == dateTime6.equals(instant13));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withPeriodAdded(readablePeriod6, (int) (short) 0);
        org.joda.time.DateTime.Property property9 = dateTime5.hourOfDay();
        org.joda.time.LocalTime localTime10 = dateTime5.toLocalTime();
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfWeek();
        java.lang.String str13 = chronology11.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.minuteOfDay();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(chronology11);
        org.joda.time.DateTimeField dateTimeField16 = chronology11.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology11.weeks();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray22 = timeOfDay21.getValues();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay25.minusMinutes((int) '4');
        int int31 = timeOfDay21.compareTo((org.joda.time.ReadablePartial) timeOfDay25);
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay21.minusMinutes((int) '#');
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay21.minusMinutes(23);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay21.plusMinutes(70);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property41 = timeOfDay40.minuteOfHour();
        java.lang.String str42 = property41.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.DateTime dateTime51 = dateTime48.withPeriodAdded(readablePeriod49, (int) (short) 0);
        int int52 = property41.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime53 = dateTime48.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTime((org.joda.time.ReadableInstant) instant59);
        org.joda.time.Chronology chronology61 = instant59.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.clockhourOfHalfday();
        org.joda.time.DurationField durationField63 = chronology61.eras();
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType54.getField(chronology61);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology68 = chronology61.withZone(dateTimeZone67);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((java.lang.Object) dateTime53, chronology68);
        int[] intArray70 = localTime69.getValues();
        chronology11.validate((org.joda.time.ReadablePartial) timeOfDay37, intArray70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField63", Math.signum(durationField18.compareTo(durationField63)) == -Math.signum(durationField63.compareTo(durationField18)));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded(readableDuration5, (int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.minusSeconds((int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime9.centuryOfEra();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.DateTime dateTime12 = property10.roundFloorCopy();
        org.joda.time.DateTime dateTime14 = dateTime12.withMillisOfDay(40);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        int[] intArray30 = chronology22.get((org.joda.time.ReadablePartial) timeOfDay25, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(0L, chronology22);
        int int32 = mutableDateTime31.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime31.property(dateTimeFieldType33);
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.property(dateTimeFieldType36);
        mutableDateTime35.setDayOfMonth(3);
        mutableDateTime35.setMinuteOfDay(35);
        mutableDateTime35.setMillis((long) 15);
        org.joda.time.Chronology chronology44 = mutableDateTime35.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.millis();
        org.joda.time.DateTime dateTime46 = dateTime14.withChronology(chronology44);
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.DurationField durationField49 = chronology47.eras();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 2000, chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField45 and durationField49", Math.signum(durationField45.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField45)));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime16.add(readablePeriod38);
        mutableDateTime16.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, dateTimeZone43);
        mutableDateTime44.addMinutes((int) (short) -1);
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean53 = interval49.abuts((org.joda.time.ReadableInterval) interval52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Interval interval55 = interval52.withDurationBeforeEnd(readableDuration54);
        boolean boolean56 = interval55.isBeforeNow();
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = interval55.toPeriod(periodType57);
        mutableDateTime44.add((org.joda.time.ReadablePeriod) period58);
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.DateTime dateTime67 = dateTime65.withYearOfEra(14);
        org.joda.time.DateTime dateTime68 = dateTime67.toDateTime();
        mutableDateTime44.setMillis((org.joda.time.ReadableInstant) dateTime68);
        boolean boolean71 = dateTime68.isBefore(72576000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime44 and dateTime68", (mutableDateTime44.compareTo(dateTime68) == 0) == mutableDateTime44.equals(dateTime68));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.plusHours(15);
        org.joda.time.TimeOfDay.Property property5 = timeOfDay2.minuteOfHour();
        java.lang.String str6 = property5.toString();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.millisOfSecond();
        int int20 = dateTimeField18.getMaximumValue((-1880L));
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        org.joda.time.Chronology chronology30 = instant28.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        int[] intArray38 = chronology30.get((org.joda.time.ReadablePartial) timeOfDay33, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(0L, chronology30);
        mutableDateTime39.setYear(3);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone44 = instant43.getZone();
        mutableDateTime39.setZone(dateTimeZone44);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(0L, dateTimeZone44);
        java.util.TimeZone timeZone47 = dateTimeZone44.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime55 = timeOfDay52.toDateTime((org.joda.time.ReadableInstant) instant54);
        org.joda.time.Chronology chronology56 = instant54.getChronology();
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant61 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime62 = timeOfDay59.toDateTime((org.joda.time.ReadableInstant) instant61);
        int[] intArray64 = chronology56.get((org.joda.time.ReadablePartial) timeOfDay59, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(0L, chronology56);
        mutableDateTime65.setYear(3);
        org.joda.time.Instant instant69 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone70 = instant69.getZone();
        mutableDateTime65.setZone(dateTimeZone70);
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime(0L, dateTimeZone70);
        java.util.TimeZone timeZone73 = dateTimeZone70.toTimeZone();
        boolean boolean74 = timeZone47.hasSameRules(timeZone73);
        java.util.Locale locale75 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(timeZone73, locale75);
        java.lang.String str77 = dateTimeField18.getAsText(14L, locale75);
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(locale75);
        java.lang.String str79 = property5.getAsShortText(locale75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar76 and calendar78", (calendar76.compareTo(calendar78) == 0) == calendar76.equals(calendar78));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        boolean boolean8 = interval5.isBeforeNow();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean15 = interval11.abuts((org.joda.time.ReadableInterval) interval14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withWeekyear(2);
        boolean boolean21 = interval11.isBefore((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Interval interval23 = interval11.withDurationAfterStart(readableDuration22);
        org.joda.time.Duration duration24 = interval11.toDuration();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean31 = interval27.abuts((org.joda.time.ReadableInterval) interval30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.withWeekyear(2);
        boolean boolean37 = interval27.isBefore((org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Interval interval39 = interval27.withDurationAfterStart(readableDuration38);
        org.joda.time.Duration duration40 = interval27.toDuration();
        int int41 = duration24.compareTo((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Interval interval42 = interval5.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration24);
        long long43 = interval5.getStartMillis();
        boolean boolean44 = interval5.containsNow();
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone47 = instant46.getZone();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone47);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime51 = dateTime48.withDurationAdded(readableDuration49, (int) (byte) 0);
        org.joda.time.DateTime dateTime53 = dateTime48.minusSeconds((int) (short) 1);
        org.joda.time.DateTime.Property property54 = dateTime53.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime.Property property56 = dateTime53.property(dateTimeFieldType55);
        boolean boolean57 = interval5.equals((java.lang.Object) property56);
        org.joda.time.Interval interval58 = interval5.toInterval();
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant63 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime64 = timeOfDay61.toDateTime((org.joda.time.ReadableInstant) instant63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.DateTime dateTime67 = dateTime64.withPeriodAdded(readablePeriod65, (int) (short) 0);
        org.joda.time.DateTime.Property property68 = dateTime64.hourOfDay();
        org.joda.time.LocalTime localTime69 = dateTime64.toLocalTime();
        org.joda.time.Chronology chronology70 = localTime69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.dayOfWeek();
        java.lang.String str72 = chronology70.toString();
        org.joda.time.DateTimeField dateTimeField73 = chronology70.minuteOfDay();
        org.joda.time.DurationField durationField74 = chronology70.eras();
        org.joda.time.Interval interval75 = interval58.withChronology(chronology70);
        org.joda.time.DurationField durationField76 = chronology70.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField76, and durationField74", !(durationField74.compareTo(durationField76) == 0) || (Math.signum(durationField74.compareTo(durationField74)) == Math.signum(durationField76.compareTo(durationField74))));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withPeriodAdded(readablePeriod6, (int) (short) 0);
        org.joda.time.DateTime.Property property9 = dateTime5.hourOfDay();
        org.joda.time.LocalTime localTime10 = dateTime5.toLocalTime();
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfWeek();
        java.lang.String str13 = chronology11.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.clockhourOfHalfday();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DurationField durationField17 = chronology11.hours();
        org.joda.time.DurationField durationField18 = chronology11.weeks();
        org.joda.time.DateTimeField dateTimeField19 = chronology11.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.withSecondOfMinute((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property25 = timeOfDay24.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay27 = property25.addWrapFieldToCopy(1);
        org.joda.time.TimeOfDay timeOfDay29 = property25.addWrapFieldToCopy((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.minusSeconds(13);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray35 = timeOfDay34.getValues();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime41 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) instant40);
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay38.minusMinutes((int) '4');
        int int44 = timeOfDay34.compareTo((org.joda.time.ReadablePartial) timeOfDay38);
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTime((org.joda.time.ReadableInstant) instant49);
        org.joda.time.Chronology chronology51 = instant49.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.clockhourOfHalfday();
        org.joda.time.DurationField durationField53 = chronology51.eras();
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay34.withChronologyRetainFields(chronology51);
        org.joda.time.Chronology chronology55 = chronology51.withUTC();
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone58 = instant57.getZone();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(dateTimeZone58);
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.DateTime dateTime62 = dateTime59.withDurationAdded(readableDuration60, (int) (byte) 0);
        org.joda.time.DateTime dateTime64 = dateTime59.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime66 = dateTime64.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime68 = dateTime66.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone69 = dateTime68.getZone();
        java.lang.String str70 = dateTimeZone69.getID();
        org.joda.time.Chronology chronology71 = chronology51.withZone(dateTimeZone69);
        org.joda.time.TimeOfDay timeOfDay74 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.DateTime dateTime75 = timeOfDay74.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property76 = timeOfDay74.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay77 = property76.withMaximumValue();
        boolean boolean78 = dateTimeZone69.equals((java.lang.Object) timeOfDay77);
        int[] intArray79 = timeOfDay77.getValues();
        chronology11.validate((org.joda.time.ReadablePartial) timeOfDay31, intArray79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField53", Math.signum(durationField17.compareTo(durationField53)) == -Math.signum(durationField53.compareTo(durationField17)));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 35);
        org.joda.time.DateMidnight dateMidnight2 = localDate1.toDateMidnight();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = instant4.toMutableDateTimeISO();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property10 = timeOfDay9.minuteOfHour();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.withPeriodAdded(readablePeriod18, (int) (short) 0);
        int int21 = property10.compareTo((org.joda.time.ReadableInstant) dateTime17);
        boolean boolean22 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str26 = dateTimeZone25.toString();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(dateTimeZone25);
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.clockhourOfHalfday();
        long long38 = dateTimeField36.roundHalfFloor(0L);
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        int int40 = dateTimeField36.getMaximumShortTextLength(locale39);
        java.lang.String str41 = locale39.getLanguage();
        java.lang.String str42 = locale39.getLanguage();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology49 = instant47.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.year();
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant56 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime57 = timeOfDay54.toDateTime((org.joda.time.ReadableInstant) instant56);
        org.joda.time.Chronology chronology58 = instant56.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.clockhourOfHalfday();
        long long61 = dateTimeField59.roundHalfFloor(0L);
        java.util.Locale locale62 = java.util.Locale.TRADITIONAL_CHINESE;
        int int63 = dateTimeField59.getMaximumShortTextLength(locale62);
        java.lang.String str64 = locale62.getScript();
        java.lang.String str65 = dateTimeField50.getAsText((int) (short) 1, locale62);
        java.util.Locale locale69 = new java.util.Locale("\u516c\u5143", "0", "weekOfWeekyear");
        java.lang.String str70 = locale62.getDisplayLanguage(locale69);
        java.lang.String str71 = locale39.getDisplayVariant(locale69);
        java.lang.String str72 = dateTimeZone25.getShortName((long) 22, locale69);
        mutableDateTime6.setZone(dateTimeZone25);
        org.joda.time.DateTime dateTime74 = localDate1.toDateTimeAtCurrentTime(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime6", (instant4.compareTo(mutableDateTime6) == 0) == instant4.equals(mutableDateTime6));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.roll(3, true);
        int int42 = calendar38.getFirstDayOfWeek();
        calendar38.set(5, 32772, 999, 36000000, 0);
        int int50 = calendar38.getGreatestMinimum(2);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone58 = dateMidnight53.getZone();
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.clockhourOfHalfday();
        long long69 = dateTimeField67.roundHalfFloor(0L);
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        int int71 = dateTimeField67.getMaximumShortTextLength(locale70);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale73 = locale72.stripExtensions();
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = locale72.getDisplayName(locale74);
        java.lang.String str77 = locale70.getDisplayLanguage(locale72);
        java.lang.String str78 = dateTimeZone58.getName((long) 'x', locale72);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(locale72);
        java.util.Date date80 = calendar79.getTime();
        calendar38.setTime(date80);
        java.lang.String str82 = calendar38.getCalendarType();
        calendar38.setMinimalDaysInFirstWeek(53897496);
        org.joda.time.LocalTime localTime85 = org.joda.time.LocalTime.fromCalendarFields(calendar38);
        org.joda.time.Instant instant86 = new org.joda.time.Instant((java.lang.Object) calendar38);
        org.joda.time.Instant instant87 = instant86.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar79", (calendar38.compareTo(calendar79) == 0) == calendar38.equals(calendar79));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(20);
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        int[] intArray17 = chronology9.get((org.joda.time.ReadablePartial) timeOfDay12, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, chronology9);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        mutableDateTime18.setChronology(chronology25);
        boolean boolean35 = mutableDateTime18.isEqualNow();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime18.secondOfDay();
        boolean boolean37 = mutableDateTime18.isAfterNow();
        mutableDateTime18.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime18.add(readablePeriod40);
        mutableDateTime18.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime18, dateTimeZone45);
        long long48 = dateTimeZone1.getMillisKeepLocal(dateTimeZone45, 1645455522846L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and mutableDateTime46", (mutableDateTime18.compareTo(mutableDateTime46) == 0) == mutableDateTime18.equals(mutableDateTime46));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        int int18 = mutableDateTime17.getEra();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.setDayOfYear(6);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        int[] intArray37 = chronology29.get((org.joda.time.ReadablePartial) timeOfDay32, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, chronology29);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        int[] intArray53 = chronology45.get((org.joda.time.ReadablePartial) timeOfDay48, (long) (short) -1);
        mutableDateTime38.setChronology(chronology45);
        boolean boolean55 = mutableDateTime38.isEqualNow();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime38.secondOfDay();
        boolean boolean57 = mutableDateTime38.isAfterNow();
        mutableDateTime38.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime38.add(readablePeriod60);
        mutableDateTime38.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime38, dateTimeZone65);
        mutableDateTime66.addMinutes((int) (short) -1);
        mutableDateTime66.addHours(0);
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) mutableDateTime66);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime17.weekyear();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateMidnight dateMidnight76 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone75);
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight76.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight80 = dateMidnight76.withWeekyear(2);
        org.joda.time.DateMidnight.Property property81 = dateMidnight76.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight76.withYearOfCentury(1);
        int int84 = dateMidnight83.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod85 = null;
        org.joda.time.DateMidnight dateMidnight86 = dateMidnight83.plus(readablePeriod85);
        org.joda.time.DateMidnight dateMidnight88 = dateMidnight83.plusYears(10);
        org.joda.time.DateMidnight.Property property89 = dateMidnight83.year();
        int int90 = dateMidnight83.getDayOfWeek();
        org.joda.time.DateTime dateTime91 = new org.joda.time.DateTime((java.lang.Object) dateMidnight83);
        long long92 = property73.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and mutableDateTime66", (mutableDateTime17.compareTo(mutableDateTime66) == 0) == mutableDateTime17.equals(mutableDateTime66));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        int[] intArray19 = chronology11.get((org.joda.time.ReadablePartial) timeOfDay14, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology11);
        org.joda.time.DurationField durationField21 = chronology11.weeks();
        org.joda.time.DateTimeField dateTimeField22 = chronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = chronology11.weekOfWeekyear();
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.lang.String str26 = dateTimeField23.getAsShortText(10L, locale25);
        boolean boolean27 = locale25.hasExtensions();
        java.lang.String str30 = nameProvider0.getShortName(locale25, "2922750", "2022-02-21");
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        org.joda.time.Chronology chronology37 = instant35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.clockhourOfHalfday();
        long long40 = dateTimeField38.roundHalfFloor(0L);
        java.util.Locale locale41 = java.util.Locale.TRADITIONAL_CHINESE;
        int int42 = dateTimeField38.getMaximumShortTextLength(locale41);
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale44 = locale43.stripExtensions();
        java.util.Locale locale45 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale46 = locale45.stripExtensions();
        java.lang.String str47 = locale43.getDisplayName(locale45);
        java.lang.String str48 = locale41.getDisplayLanguage(locale43);
        java.lang.String str49 = locale41.getDisplayLanguage();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight52.withDurationAdded((long) 2, 100);
        int int56 = dateMidnight55.getDayOfMonth();
        java.util.GregorianCalendar gregorianCalendar57 = dateMidnight55.toGregorianCalendar();
        gregorianCalendar57.setTimeInMillis(14L);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant67 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime68 = timeOfDay65.toDateTime((org.joda.time.ReadableInstant) instant67);
        org.joda.time.Chronology chronology69 = instant67.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.clockhourOfHalfday();
        org.joda.time.DurationField durationField71 = chronology69.eras();
        org.joda.time.DateTimeField dateTimeField72 = dateTimeFieldType62.getField(chronology69);
        long long75 = dateTimeField72.add((long) (short) 100, (long) (byte) -1);
        boolean boolean76 = dateTimeField72.isSupported();
        org.joda.time.TimeOfDay timeOfDay80 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant82 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime83 = timeOfDay80.toDateTime((org.joda.time.ReadableInstant) instant82);
        org.joda.time.Chronology chronology84 = instant82.getChronology();
        org.joda.time.DateTimeField dateTimeField85 = chronology84.clockhourOfHalfday();
        long long87 = dateTimeField85.roundHalfFloor(0L);
        java.util.Locale locale88 = java.util.Locale.TRADITIONAL_CHINESE;
        int int89 = dateTimeField85.getMaximumShortTextLength(locale88);
        java.lang.String str90 = locale88.getLanguage();
        java.util.Locale locale91 = locale88.stripExtensions();
        java.lang.String str92 = dateTimeField72.getAsShortText((long) 10, locale88);
        java.util.Map<java.lang.String, java.lang.Integer> strMap93 = gregorianCalendar57.getDisplayNames(11, (int) (byte) 0, locale88);
        java.lang.String str94 = locale41.getDisplayScript(locale88);
        java.lang.String str97 = nameProvider0.getName(locale88, "\u4e0a\u5348 12:53:00", "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField71", Math.signum(durationField21.compareTo(durationField71)) == -Math.signum(durationField71.compareTo(durationField21)));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withPeriodAdded(readablePeriod11, (int) (short) 0);
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime15 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime10);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        int[] intArray34 = chronology26.get((org.joda.time.ReadablePartial) timeOfDay29, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, chronology26);
        int int36 = mutableDateTime35.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime35.property(dateTimeFieldType37);
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.property(dateTimeFieldType40);
        mutableDateTime39.addYears((int) '4');
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime39.add(readablePeriod44);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str49 = dateTimeZone48.toString();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight((java.lang.Object) mutableDateTime39, dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime18, dateTimeZone48);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone56 = instant55.getZone();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone56);
        java.util.TimeZone timeZone58 = dateTimeZone56.toTimeZone();
        boolean boolean59 = dateTimeZone56.isFixed();
        java.util.TimeZone timeZone60 = dateTimeZone56.toTimeZone();
        org.joda.time.DateTime dateTime61 = dateTime18.withZone(dateTimeZone56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime52", (dateTime10.compareTo(mutableDateTime52) == 0) == dateTime10.equals(mutableDateTime52));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(dateTimeZone4);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes(53977);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withDurationAdded((long) (short) 10, 1);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight14.minus((long) (byte) 10);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Instant instant22 = instant20.withMillis((long) (byte) 100);
        org.joda.time.DateTime dateTime23 = instant20.toDateTimeISO();
        java.util.Date date27 = new java.util.Date(0, (int) '4', 0);
        int int28 = date27.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay29 = org.joda.time.YearMonthDay.fromDateFields(date27);
        int int30 = yearMonthDay29.getYear();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay29.plus(readablePeriod31);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean39 = interval35.abuts((org.joda.time.ReadableInterval) interval38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Interval interval41 = interval38.withDurationBeforeEnd(readableDuration40);
        boolean boolean42 = interval41.isBeforeNow();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = interval41.toPeriod(periodType43);
        java.lang.String str45 = period44.toString();
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay29.minus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.DateTime dateTime48 = dateTime23.withPeriodAdded((org.joda.time.ReadablePeriod) period44, 53989396);
        org.joda.time.MutablePeriod mutablePeriod49 = period44.toMutablePeriod();
        org.joda.time.PeriodType periodType50 = mutablePeriod49.getPeriodType();
        java.lang.String str51 = mutablePeriod49.toString();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight19.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod49, 1645455555);
        org.joda.time.LocalTime localTime54 = localTime11.plus((org.joda.time.ReadablePeriod) mutablePeriod49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant22", (mutableDateTime7.compareTo(instant22) == 0) == mutableDateTime7.equals(instant22));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        mutableDateTime17.setChronology(chronology24);
        mutableDateTime17.addMonths((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime17.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime39 = property36.addWrapField(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.clockhourOfHalfday();
        org.joda.time.DurationField durationField49 = chronology47.eras();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType40.getField(chronology47);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology54 = chronology47.withZone(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = chronology54.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime39.toMutableDateTime(chronology54);
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(12L, chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and mutableDateTime56", (mutableDateTime17.compareTo(mutableDateTime56) == 0) == mutableDateTime17.equals(mutableDateTime56));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.era();
        org.joda.time.DurationField durationField34 = chronology23.seconds();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.DurationField durationField36 = chronology23.days();
        org.joda.time.Chronology chronology37 = chronology23.withUTC();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology23);
        org.joda.time.DurationField durationField39 = chronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField34, and durationField36", !(durationField39.compareTo(durationField34) == 0) || (Math.signum(durationField39.compareTo(durationField36)) == Math.signum(durationField34.compareTo(durationField36))));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology7.getZone();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(chronology7);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 32772, chronology7);
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.LocalTime localTime16 = property14.addWrapFieldToCopy(1970);
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfSecond(795);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        int[] intArray35 = chronology27.get((org.joda.time.ReadablePartial) timeOfDay30, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, chronology27);
        org.joda.time.DurationField durationField37 = chronology27.weeks();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((-86340000L), chronology27);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime40 = localTime38.minus(readablePeriod39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalTime localTime42 = localTime40.minus(readablePeriod41);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay((-1880L));
        org.joda.time.LocalTime localTime45 = localTime42.withFields((org.joda.time.ReadablePartial) timeOfDay44);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTime((org.joda.time.ReadableInstant) instant51);
        org.joda.time.Chronology chronology53 = instant51.getChronology();
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTime((org.joda.time.ReadableInstant) instant58);
        int[] intArray61 = chronology53.get((org.joda.time.ReadablePartial) timeOfDay56, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(0L, chronology53);
        mutableDateTime62.setYear(3);
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone67 = instant66.getZone();
        mutableDateTime62.setZone(dateTimeZone67);
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight(dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(dateTimeZone67);
        long long73 = dateTimeZone67.convertLocalToUTC((long) 31, false);
        java.util.Locale.Category category75 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale76 = java.util.Locale.getDefault(category75);
        java.lang.String str77 = dateTimeZone67.getShortName(670L, locale76);
        org.joda.time.DateTime dateTime78 = localTime45.toDateTimeToday(dateTimeZone67);
        org.joda.time.LocalTime localTime80 = localTime45.plusMinutes(0);
        int int81 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField37", Math.signum(durationField9.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField9)));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight5.withFields((org.joda.time.ReadablePartial) timeOfDay10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.withDayOfMonth(4);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.centuryOfEra();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay17.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withPeriodAdded(readablePeriod26, (int) (short) 0);
        int int29 = property18.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime30 = dateTime25.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) dateTime25);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.minus(readablePeriod32);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str37 = dateTimeZone36.toString();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod32, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight13.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(438);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = dateMidnight39.toDateTime(dateTimeZone41);
        int int45 = dateTimeZone41.getStandardOffset(1870L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime38 and mutableDateTime42", (mutableDateTime38.compareTo(mutableDateTime42) == 0) == mutableDateTime38.equals(mutableDateTime42));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0L, chronology9);
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        int[] intArray30 = chronology22.get((org.joda.time.ReadablePartial) timeOfDay25, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(0L, chronology22);
        org.joda.time.DurationField durationField32 = chronology22.weeks();
        org.joda.time.Chronology chronology33 = chronology22.withUTC();
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay13.withChronologyRetainFields(chronology33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        org.joda.time.Chronology chronology43 = instant41.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.clockhourOfHalfday();
        long long46 = dateTimeField44.roundHalfFloor(0L);
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        int int48 = dateTimeField44.getMaximumShortTextLength(locale47);
        java.lang.String str49 = locale47.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology36, locale47);
        int int51 = dateTimeParserBucket50.getOffset();
        java.util.Locale locale52 = dateTimeParserBucket50.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket(1645455561258L, chronology33, locale52, (java.lang.Integer) 29);
        org.joda.time.DurationField durationField55 = chronology33.eras();
        org.joda.time.DurationField durationField56 = chronology33.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField32 and durationField55", Math.signum(durationField32.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField32)));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone1.nextTransition(1L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 10, dateTimeZone1);
        int int5 = dateTime4.getYearOfEra();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray9 = timeOfDay8.getValues();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.minusMinutes((int) '4');
        int int18 = timeOfDay8.compareTo((org.joda.time.ReadablePartial) timeOfDay12);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.clockhourOfHalfday();
        org.joda.time.DurationField durationField27 = chronology25.eras();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay8.withChronologyRetainFields(chronology25);
        org.joda.time.Chronology chronology29 = timeOfDay8.getChronology();
        org.joda.time.Chronology chronology30 = chronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime4.toMutableDateTime(chronology30);
        org.joda.time.DurationField durationField33 = chronology30.eras();
        org.joda.time.DurationField durationField34 = chronology30.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField34, and durationField27", !(durationField27.compareTo(durationField34) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField34.compareTo(durationField27))));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withPeriodAdded(readablePeriod6, (int) (short) 0);
        boolean boolean9 = dateTime5.isAfterNow();
        org.joda.time.DateTime dateTime11 = dateTime5.plus((long) 15);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.minuteOfHour();
        java.lang.String str16 = property15.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.withPeriodAdded(readablePeriod23, (int) (short) 0);
        int int26 = property15.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime27 = dateTime22.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.clockhourOfHalfday();
        long long38 = dateTimeField36.roundHalfFloor(0L);
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        int int40 = dateTimeField36.getMaximumShortTextLength(locale39);
        java.lang.String str41 = locale39.getLanguage();
        java.lang.String str42 = locale39.getLanguage();
        java.util.Calendar calendar43 = dateTime27.toCalendar(locale39);
        java.util.Calendar calendar44 = dateTime11.toCalendar(locale39);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTime((org.joda.time.ReadableInstant) instant51);
        org.joda.time.Chronology chronology53 = instant51.getChronology();
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology53);
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.fromMillisOfDay((-2678399900L), chronology53);
        boolean boolean56 = calendar44.after((java.lang.Object) chronology53);
        org.joda.time.TimeOfDay timeOfDay57 = org.joda.time.TimeOfDay.fromCalendarFields(calendar44);
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.TimeOfDay timeOfDay69 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant71 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime72 = timeOfDay69.toDateTime((org.joda.time.ReadableInstant) instant71);
        int[] intArray74 = chronology66.get((org.joda.time.ReadablePartial) timeOfDay69, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(0L, chronology66);
        mutableDateTime75.setYear(3);
        org.joda.time.Instant instant79 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone80 = instant79.getZone();
        mutableDateTime75.setZone(dateTimeZone80);
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight(dateTimeZone80);
        org.joda.time.LocalTime localTime83 = new org.joda.time.LocalTime((long) '#', dateTimeZone80);
        org.joda.time.LocalTime localTime84 = new org.joda.time.LocalTime((java.lang.Object) calendar44, dateTimeZone80);
        calendar44.setFirstDayOfWeek(54253959);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on timeOfDay57 and localTime84", (timeOfDay57.compareTo(localTime84) == 0) == timeOfDay57.equals(localTime84));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str4 = dateTimeZone3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        int int7 = mutableDateTime6.getWeekyear();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology16 = instant14.getChronology();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        int[] intArray24 = chronology16.get((org.joda.time.ReadablePartial) timeOfDay19, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, chronology16);
        org.joda.time.DurationField durationField26 = chronology16.weeks();
        org.joda.time.DateTimeField dateTimeField27 = chronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(1642777165372L, chronology16);
        mutableDateTime6.setChronology(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant14", (dateTime5.compareTo(instant14) == 0) == dateTime5.equals(instant14));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight5.withFields((org.joda.time.ReadablePartial) timeOfDay10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.withDayOfMonth(4);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.centuryOfEra();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay17.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withPeriodAdded(readablePeriod26, (int) (short) 0);
        int int29 = property18.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime30 = dateTime25.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) dateTime25);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.minus(readablePeriod32);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str37 = dateTimeZone36.toString();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod32, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight13.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(438);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = dateMidnight39.toDateTime(dateTimeZone41);
        int int45 = dateTimeZone41.getOffset(77760000497L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime38 and mutableDateTime42", (mutableDateTime38.compareTo(mutableDateTime42) == 0) == mutableDateTime38.equals(mutableDateTime42));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology14 = chronology7.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = chronology7.weekyear();
        org.joda.time.DurationField durationField16 = chronology7.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField16, and durationField9", !(durationField9.compareTo(durationField16) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField16.compareTo(durationField9))));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        mutableDateTime16.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime16.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundCeiling();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime49 = timeOfDay46.toDateTime((org.joda.time.ReadableInstant) instant48);
        org.joda.time.Chronology chronology50 = instant48.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.clockhourOfHalfday();
        org.joda.time.DurationField durationField52 = chronology50.eras();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType43.getField(chronology50);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology57 = chronology50.withZone(dateTimeZone56);
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = mutableDateTime41.toDateTime(dateTimeZone56);
        java.lang.String str61 = dateTimeZone56.getNameKey((long) (-1955));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime59", (mutableDateTime16.compareTo(dateTime59) == 0) == mutableDateTime16.equals(dateTime59));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(chronology6);
        org.joda.time.DateTimeField dateTimeField12 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField13 = dateTimeField12.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField13, and durationField8", !(durationField8.compareTo(durationField13) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField13.compareTo(durationField8))));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean4 = dateTimeZone2.isFixed();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.minusMonths((int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay5.minusDays(11);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay5.minusYears(7);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay11.year();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight15.withWeekyear(2);
        org.joda.time.DateMidnight.Property property20 = dateMidnight15.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight22 = property20.addWrapFieldToCopy(1439);
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str30 = dateTimeZone29.toString();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone29);
        int int34 = dateTimeZone29.getStandardOffset((long) ' ');
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) 21, dateTimeZone29);
        org.joda.time.DateTime dateTime36 = dateMidnight22.toDateTime(dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight37 = yearMonthDay11.toDateMidnight(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight22 and dateTime36", (dateMidnight22.compareTo(dateTime36) == 0) == dateMidnight22.equals(dateTime36));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology7.monthOfYear();
        int int20 = dateTimeField18.get((long) 42);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTime((org.joda.time.ReadableInstant) instant26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = dateTime27.toString(dateTimeFormatter28);
        int int30 = dateTime27.getSecondOfMinute();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.minus(readableDuration31);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Chronology chronology39 = instant37.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.minutes();
        org.joda.time.DateTime dateTime41 = dateTime32.withChronology(chronology39);
        org.joda.time.DateTimeField dateTimeField42 = chronology39.secondOfMinute();
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology39);
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime49 = timeOfDay46.toDateTime((org.joda.time.ReadableInstant) instant48);
        boolean boolean51 = timeOfDay46.equals((java.lang.Object) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant56 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime57 = timeOfDay54.toDateTime((org.joda.time.ReadableInstant) instant56);
        org.joda.time.Chronology chronology58 = instant56.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.clockhourOfHalfday();
        org.joda.time.DurationField durationField60 = chronology58.eras();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology58.getZone();
        org.joda.time.DateTimeField dateTimeField63 = chronology58.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField64 = chronology58.dayOfWeek();
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay46.withChronologyRetainFields(chronology58);
        int[] intArray66 = timeOfDay65.getValues();
        int int67 = dateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localTime43, intArray66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField60", Math.signum(durationField17.compareTo(durationField60)) == -Math.signum(durationField60.compareTo(durationField17)));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withPeriodAdded(readablePeriod11, (int) (short) 0);
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime15 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime10);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime dateTime20 = dateTime16.withYear(31);
        org.joda.time.DateTime dateTime22 = dateTime16.plusWeeks(23);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean29 = interval25.abuts((org.joda.time.ReadableInterval) interval28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withWeekyear(2);
        boolean boolean35 = interval25.isBefore((org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Interval interval37 = interval25.withDurationAfterStart(readableDuration36);
        org.joda.time.Duration duration38 = interval25.toDuration();
        long long39 = duration38.getMillis();
        org.joda.time.DateTime dateTime40 = dateTime16.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime42 = dateTime16.minusSeconds(36000100);
        org.joda.time.DateTime dateTime44 = dateTime42.minusSeconds(235);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMillis(35);
        org.joda.time.DateTime dateTime48 = dateTime44.minusMonths(0);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str54 = dateTimeZone53.toString();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone53);
        int int57 = mutableDateTime56.getMillisOfDay();
        int int58 = mutableDateTime56.getYearOfCentury();
        boolean boolean59 = dateTime44.isEqual((org.joda.time.ReadableInstant) mutableDateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime55", (instant9.compareTo(dateTime55) == 0) == instant9.equals(dateTime55));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        int int13 = dateTime12.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str20 = dateTimeZone19.toString();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone19);
        int int24 = dateTimeZone19.getStandardOffset((long) ' ');
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) 21, dateTimeZone19);
        java.lang.String str27 = dateTimeZone19.getNameKey(4662316800000L);
        org.joda.time.DateTime dateTime28 = dateTime12.toDateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime21", (instant1.compareTo(dateTime21) == 0) == instant1.equals(dateTime21));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.Interval interval9 = interval5.withStartMillis((long) (short) -1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, chronology25);
        org.joda.time.DurationField durationField35 = chronology25.weeks();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((-86340000L), chronology25);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField38 = chronology25.dayOfWeek();
        mutableDateTime13.setChronology(chronology25);
        org.joda.time.Interval interval40 = interval9.withChronology(chronology25);
        org.joda.time.DurationField durationField41 = chronology25.eras();
        org.joda.time.DateTimeField dateTimeField42 = chronology25.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField41", Math.signum(durationField35.compareTo(durationField41)) == -Math.signum(durationField41.compareTo(durationField35)));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withPeriodAdded(readablePeriod6, (int) (short) 0);
        boolean boolean9 = dateTime5.isAfterNow();
        org.joda.time.DateTime dateTime11 = dateTime5.plus((long) 15);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.minuteOfHour();
        java.lang.String str16 = property15.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.withPeriodAdded(readablePeriod23, (int) (short) 0);
        int int26 = property15.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime27 = dateTime22.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.clockhourOfHalfday();
        long long38 = dateTimeField36.roundHalfFloor(0L);
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        int int40 = dateTimeField36.getMaximumShortTextLength(locale39);
        java.lang.String str41 = locale39.getLanguage();
        java.lang.String str42 = locale39.getLanguage();
        java.util.Calendar calendar43 = dateTime27.toCalendar(locale39);
        java.util.Calendar calendar44 = dateTime11.toCalendar(locale39);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTime((org.joda.time.ReadableInstant) instant51);
        org.joda.time.Chronology chronology53 = instant51.getChronology();
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology53);
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.fromMillisOfDay((-2678399900L), chronology53);
        boolean boolean56 = calendar44.after((java.lang.Object) chronology53);
        org.joda.time.TimeOfDay timeOfDay57 = org.joda.time.TimeOfDay.fromCalendarFields(calendar44);
        org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant64 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime65 = timeOfDay62.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology66 = instant64.getChronology();
        org.joda.time.TimeOfDay timeOfDay69 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant71 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime72 = timeOfDay69.toDateTime((org.joda.time.ReadableInstant) instant71);
        int[] intArray74 = chronology66.get((org.joda.time.ReadablePartial) timeOfDay69, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(0L, chronology66);
        mutableDateTime75.setYear(3);
        org.joda.time.Instant instant79 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone80 = instant79.getZone();
        mutableDateTime75.setZone(dateTimeZone80);
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight(dateTimeZone80);
        org.joda.time.LocalTime localTime83 = new org.joda.time.LocalTime((long) '#', dateTimeZone80);
        org.joda.time.LocalTime localTime84 = new org.joda.time.LocalTime((java.lang.Object) calendar44, dateTimeZone80);
        java.time.Instant instant85 = calendar44.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on timeOfDay57 and localTime84", (timeOfDay57.compareTo(localTime84) == 0) == timeOfDay57.equals(localTime84));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology6.getZone();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(dateTimeZone12);
        java.util.TimeZone timeZone15 = dateTimeZone12.toTimeZone();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone15);
        java.time.ZoneId zoneId17 = timeZone15.toZoneId();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone(zoneId17);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay21.minuteOfHour();
        java.lang.String str23 = property22.getAsShortText();
        org.joda.time.DurationField durationField24 = property22.getDurationField();
        org.joda.time.TimeOfDay timeOfDay26 = property22.addToCopy(34);
        java.lang.String str27 = property22.getName();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.withSecondOfMinute((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property33 = timeOfDay32.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay35 = property33.addWrapFieldToCopy(1);
        int int36 = property33.getMinimumValueOverall();
        int int37 = property33.getMaximumValue();
        org.joda.time.TimeOfDay timeOfDay39 = property33.setCopy(0);
        org.joda.time.TimeOfDay timeOfDay40 = property33.withMinimumValue();
        org.joda.time.DateTime dateTime41 = timeOfDay40.toDateTimeToday();
        java.util.Date date42 = dateTime41.toDate();
        boolean boolean43 = property22.equals((java.lang.Object) date42);
        date42.setSeconds(54047506);
        boolean boolean46 = timeZone18.inDaylightTime(date42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField24", Math.signum(durationField8.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField8)));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.set(12, 36000000, (int) 'a', 8, 23, 14);
        long long46 = calendar38.getTimeInMillis();
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Instant instant49 = instant47.plus((long) 2);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Instant instant51 = instant49.minus(readableDuration50);
        org.joda.time.DateTime dateTime52 = instant51.toDateTime();
        org.joda.time.DateTime dateTime54 = dateTime52.minusSeconds(16);
        org.joda.time.DateTime.Property property55 = dateTime54.weekyear();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone58);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight59.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusWeeks((int) (short) 100);
        org.joda.time.Interval interval65 = new org.joda.time.Interval(readableDuration56, (org.joda.time.ReadableInstant) dateMidnight64);
        org.joda.time.DateMidnight.Property property66 = dateMidnight64.era();
        org.joda.time.DateMidnight dateMidnight67 = property66.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.minusMonths((int) (byte) 1);
        long long70 = property55.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight67);
        int int71 = dateMidnight67.getMillisOfDay();
        boolean boolean72 = calendar38.equals((java.lang.Object) int71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant49 and dateTime52", (instant49.compareTo(dateTime52) == 0) == instant49.equals(dateTime52));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTimeISO();
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.Instant instant5 = new org.joda.time.Instant(58L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(73785600021L, chronology6);
        int int9 = timeOfDay8.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and mutableDateTime2", (dateMidnight1.compareTo(mutableDateTime2) == 0) == dateMidnight1.equals(mutableDateTime2));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.Interval interval9 = interval5.withStartMillis((long) (short) -1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, chronology25);
        org.joda.time.DurationField durationField35 = chronology25.weeks();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((-86340000L), chronology25);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField38 = chronology25.dayOfWeek();
        mutableDateTime13.setChronology(chronology25);
        org.joda.time.Interval interval40 = interval9.withChronology(chronology25);
        org.joda.time.DurationField durationField41 = chronology25.eras();
        org.joda.time.DurationField durationField42 = chronology25.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField41", Math.signum(durationField35.compareTo(durationField41)) == -Math.signum(durationField41.compareTo(durationField35)));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis((long) (byte) 100);
        org.joda.time.DateTime dateTime4 = instant1.toDateTimeISO();
        org.joda.time.Instant instant5 = instant1.toInstant();
        org.joda.time.Chronology chronology6 = instant1.getChronology();
        org.joda.time.Chronology chronology7 = instant1.getChronology();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 54021076, chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime4", (instant1.compareTo(dateTime4) == 0) == instant1.equals(dateTime4));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (byte) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant2.plus(readableDuration3);
        org.joda.time.Instant instant6 = instant2.minus(94611019623794000L);
        org.joda.time.MutableDateTime mutableDateTime7 = instant2.toMutableDateTime();
        org.joda.time.Instant instant10 = instant2.withDurationAdded(946684800000L, 54264);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime7", (instant2.compareTo(mutableDateTime7) == 0) == instant2.equals(mutableDateTime7));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology7);
        java.util.Locale locale15 = new java.util.Locale("Jan", "January", "secondOfDay");
        java.lang.String str16 = locale15.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(18000001L, chronology7, locale15);
        long long20 = dateTimeParserBucket17.computeMillis(false, "54023014");
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime24 = localTime22.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime26 = localTime22.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime.Property property27 = localTime22.minuteOfHour();
        org.joda.time.Chronology chronology28 = localTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.weekyear();
        long long31 = dateTimeField29.roundHalfCeiling(0L);
        org.joda.time.DurationField durationField32 = dateTimeField29.getLeapDurationField();
        long long35 = dateTimeField29.addWrapField(4460321842L, 53910);
        dateTimeParserBucket17.saveField(dateTimeField29, 54308538);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField32", Math.signum(durationField9.compareTo(durationField32)) == -Math.signum(durationField32.compareTo(durationField9)));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.Chronology chronology23 = timeOfDay2.getChronology();
        org.joda.time.Chronology chronology24 = chronology23.withUTC();
        org.joda.time.DurationField durationField25 = chronology24.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField25, and durationField21", !(durationField21.compareTo(durationField25) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField25.compareTo(durationField21))));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.Chronology chronology23 = chronology19.withUTC();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        int[] intArray40 = chronology32.get((org.joda.time.ReadablePartial) timeOfDay35, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, chronology32);
        mutableDateTime41.setYear(3);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone46 = instant45.getZone();
        mutableDateTime41.setZone(dateTimeZone46);
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(dateTimeZone46);
        java.lang.String str50 = dateTimeZone46.getName((long) 'x');
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant56 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime57 = timeOfDay54.toDateTime((org.joda.time.ReadableInstant) instant56);
        org.joda.time.Chronology chronology58 = instant56.getChronology();
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant63 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime64 = timeOfDay61.toDateTime((org.joda.time.ReadableInstant) instant63);
        int[] intArray66 = chronology58.get((org.joda.time.ReadablePartial) timeOfDay61, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(0L, chronology58);
        org.joda.time.DurationField durationField68 = chronology58.weeks();
        org.joda.time.DateTimeField dateTimeField69 = chronology58.dayOfYear();
        org.joda.time.LocalTime localTime71 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property72 = localTime71.secondOfMinute();
        long long74 = chronology58.set((org.joda.time.ReadablePartial) localTime71, (-2678399900L));
        boolean boolean75 = dateTimeZone46.equals((java.lang.Object) chronology58);
        org.joda.time.DurationField durationField76 = chronology58.months();
        org.joda.time.DurationFieldType durationFieldType77 = durationField76.getType();
        org.joda.time.DateMidnight dateMidnight79 = dateMidnight24.withFieldAdded(durationFieldType77, 672);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField68", Math.signum(durationField21.compareTo(durationField68)) == -Math.signum(durationField68.compareTo(durationField21)));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.Interval interval9 = interval5.withStartMillis((long) (short) -1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, chronology25);
        org.joda.time.DurationField durationField35 = chronology25.weeks();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((-86340000L), chronology25);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField38 = chronology25.dayOfWeek();
        mutableDateTime13.setChronology(chronology25);
        org.joda.time.Interval interval40 = interval9.withChronology(chronology25);
        org.joda.time.DurationField durationField41 = chronology25.eras();
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField41", Math.signum(durationField35.compareTo(durationField41)) == -Math.signum(durationField41.compareTo(durationField35)));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime10 = property9.withMinimumValue();
        org.joda.time.DateTime dateTime11 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withMillisOfDay(40);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTime((org.joda.time.ReadableInstant) instant26);
        int[] intArray29 = chronology21.get((org.joda.time.ReadablePartial) timeOfDay24, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(0L, chronology21);
        int int31 = mutableDateTime30.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime30.property(dateTimeFieldType32);
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.property(dateTimeFieldType35);
        mutableDateTime34.setDayOfMonth(3);
        mutableDateTime34.setMinuteOfDay(35);
        mutableDateTime34.setMillis((long) 15);
        org.joda.time.Chronology chronology43 = mutableDateTime34.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.millis();
        org.joda.time.DateTime dateTime45 = dateTime13.withChronology(chronology43);
        org.joda.time.Chronology chronology46 = dateTime45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology46);
        org.joda.time.DurationField durationField48 = chronology46.eras();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField44 and durationField48", Math.signum(durationField44.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField44)));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded(readableDuration5, (int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        long long17 = dateTimeZone14.convertLocalToUTC((long) 35, true);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(4460347660L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusDays(14);
        org.joda.time.DateTime dateTime21 = localDateTime18.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(11);
        long long26 = dateTimeZone23.adjustOffset((long) 'x', true);
        java.lang.String str27 = dateTimeZone23.getID();
        org.joda.time.DateTime dateTime28 = dateTime21.withZone(dateTimeZone23);
        org.joda.time.DateTime dateTime29 = dateTime28.withEarlierOffsetAtOverlap();
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withZone(dateTimeZone33);
        org.joda.time.format.DateTimeParser dateTimeParser35 = dateTimeFormatter32.getParser();
        boolean boolean36 = dateTimeFormatter32.isParser();
        org.joda.time.Chronology chronology37 = dateTimeFormatter32.getChronolgy();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property41 = localDateTime38.yearOfCentury();
        int int42 = localDateTime38.getDayOfYear();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.withFieldAdded(durationFieldType43, 23);
        org.joda.time.LocalDateTime.Property property46 = localDateTime38.millisOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime38.withCenturyOfEra((int) 'a');
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone51 = instant50.getZone();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight54.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone59 = dateMidnight54.getZone();
        long long61 = dateTimeZone51.getMillisKeepLocal(dateTimeZone59, 10L);
        org.joda.time.DateTime dateTime62 = localDateTime38.toDateTime(dateTimeZone59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter32.withZone(dateTimeZone59);
        org.joda.time.DateTime dateTime64 = dateTime28.toDateTime(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime28", (dateTime21.compareTo(dateTime28) == 0) == dateTime21.equals(dateTime28));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.roundFloorCopy();
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.era();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology4.millis();
        org.joda.time.Chronology chronology9 = chronology4.withUTC();
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = org.joda.time.DateMidnight.now(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.DateTime dateTime19 = timeOfDay18.toDateTimeToday();
        org.joda.time.DateTime dateTime21 = dateTime19.plusWeeks((int) '4');
        org.joda.time.TimeOfDay timeOfDay22 = dateTime19.toTimeOfDay();
        boolean boolean23 = dateTimeZone12.equals((java.lang.Object) timeOfDay22);
        org.joda.time.Chronology chronology24 = timeOfDay22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property28 = timeOfDay27.minuteOfHour();
        java.lang.String str29 = property28.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.withPeriodAdded(readablePeriod36, (int) (short) 0);
        int int39 = property28.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime40 = dateTime35.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Chronology chronology48 = instant46.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.clockhourOfHalfday();
        org.joda.time.DurationField durationField50 = chronology48.eras();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType41.getField(chronology48);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology55 = chronology48.withZone(dateTimeZone54);
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime((java.lang.Object) dateTime40, chronology55);
        int[] intArray57 = localTime56.getValues();
        chronology9.validate((org.joda.time.ReadablePartial) timeOfDay22, intArray57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField50", Math.signum(durationField8.compareTo(durationField50)) == -Math.signum(durationField50.compareTo(durationField8)));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-21");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.millisOfSecond();
        mutableDateTime2.setRounding(dateTimeField14);
        mutableDateTime2.setMillisOfSecond(31);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.seconds();
        mutableDateTime2.add(durationFieldType18, 2054);
        mutableDateTime1.add(durationFieldType18, 54047);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.withEra(1);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.withCenturyOfEra(2);
        int int30 = dateMidnight27.getDayOfYear();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        org.joda.time.Chronology chronology37 = instant35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.clockhourOfHalfday();
        org.joda.time.DurationField durationField39 = chronology37.eras();
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.now(chronology37);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(chronology37);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone43);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight44.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone49 = dateMidnight44.getZone();
        long long53 = dateTimeZone49.convertLocalToUTC(0L, true, (long) 5);
        java.lang.String str55 = dateTimeZone49.getName((long) 4);
        org.joda.time.Chronology chronology56 = chronology37.withZone(dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight27.withChronology(chronology37);
        long long61 = chronology37.add((long) 54038, 72576000000L, 451);
        org.joda.time.DurationField durationField62 = durationFieldType18.getField(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField62, and durationField39", !(durationField39.compareTo(durationField62) == 0) || (Math.signum(durationField39.compareTo(durationField39)) == Math.signum(durationField62.compareTo(durationField39))));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.weekOfWeekyear();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime9.minus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime9.minusSeconds((int) (byte) 100);
        int int19 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology20 = dateTime18.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(chronology20);
        org.joda.time.YearMonthDay.Property property22 = yearMonthDay21.dayOfMonth();
        int int23 = property22.getMaximumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay24 = property22.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay26 = property22.addToCopy(1970);
        org.joda.time.YearMonthDay yearMonthDay28 = property22.addWrapFieldToCopy(54124246);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(438);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = yearMonthDay28.toDateTimeAtCurrentTime(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime31", (dateTime9.compareTo(mutableDateTime31) == 0) == dateTime9.equals(mutableDateTime31));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.util.Locale locale3 = new java.util.Locale("\u516c\u5143", "0", "weekOfWeekyear");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        int[] intArray20 = chronology12.get((org.joda.time.ReadablePartial) timeOfDay15, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, chronology12);
        org.joda.time.DurationField durationField22 = chronology12.weeks();
        org.joda.time.DateTimeField dateTimeField23 = chronology12.dayOfYear();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        long long28 = chronology12.set((org.joda.time.ReadablePartial) localTime25, (-2678399900L));
        boolean boolean29 = strSet4.equals((java.lang.Object) chronology12);
        org.joda.time.DurationField durationField30 = chronology12.weeks();
        org.joda.time.DurationField durationField31 = chronology12.eras();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField31", Math.signum(durationField22.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField22)));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.Chronology chronology23 = timeOfDay2.getChronology();
        org.joda.time.Chronology chronology24 = chronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfYear();
        org.joda.time.DurationField durationField26 = chronology24.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField26, and durationField21", !(durationField21.compareTo(durationField26) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField26.compareTo(durationField21))));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.minutes();
        org.joda.time.DurationField durationField8 = chronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.centuryOfEra();
        org.joda.time.DurationField durationField10 = chronology6.weekyears();
        org.joda.time.DurationField durationField11 = chronology6.weekyears();
        java.lang.String str12 = chronology6.toString();
        org.joda.time.DurationField durationField13 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField7, and durationField8", !(durationField13.compareTo(durationField7) == 0) || (Math.signum(durationField13.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType5.getField(chronology12);
        long long18 = dateTimeField15.add((long) (short) 100, (long) (byte) -1);
        boolean boolean19 = dateTimeField15.isSupported();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime23 = localTime21.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime25 = localTime21.withMillisOfDay((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay29.minusMinutes((int) '4');
        int[] intArray35 = timeOfDay34.getValues();
        int[] intArray37 = dateTimeField15.add((org.joda.time.ReadablePartial) localTime21, 36000000, intArray35, 52);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = dateTimeField15.getType();
        long long40 = dateTimeField15.roundCeiling(31L);
        mutableDateTime4.setRounding(dateTimeField15);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime4.hourOfDay();
        int int43 = mutableDateTime4.getYearOfCentury();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property47 = timeOfDay46.minuteOfHour();
        java.lang.String str48 = property47.getAsShortText();
        org.joda.time.DurationField durationField49 = property47.getDurationField();
        boolean boolean50 = durationField49.isSupported();
        java.lang.String str51 = durationField49.toString();
        long long52 = durationField49.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType53 = durationField49.getType();
        mutableDateTime4.add(durationFieldType53, 53977);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField49", Math.signum(durationField14.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField14)));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2");
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTimeISO();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) ' ');
        long long8 = chronology4.set((org.joda.time.ReadablePartial) localDate6, 4460347660L);
        org.joda.time.DateTime dateTime9 = dateTime2.toDateTime(chronology4);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        int[] intArray25 = chronology17.get((org.joda.time.ReadablePartial) timeOfDay20, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, chronology17);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        int[] intArray41 = chronology33.get((org.joda.time.ReadablePartial) timeOfDay36, (long) (short) -1);
        mutableDateTime26.setChronology(chronology33);
        boolean boolean43 = mutableDateTime26.isEqualNow();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime26.secondOfDay();
        boolean boolean45 = mutableDateTime26.isAfterNow();
        mutableDateTime26.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime26.add(readablePeriod48);
        mutableDateTime26.setMillis((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime26.dayOfYear();
        int int53 = mutableDateTime26.getSecondOfDay();
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime26.copy();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str58 = dateTimeZone57.toString();
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight62.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone67 = dateMidnight62.getZone();
        org.joda.time.TimeOfDay timeOfDay71 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant73 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime74 = timeOfDay71.toDateTime((org.joda.time.ReadableInstant) instant73);
        org.joda.time.Chronology chronology75 = instant73.getChronology();
        org.joda.time.DateTimeField dateTimeField76 = chronology75.clockhourOfHalfday();
        long long78 = dateTimeField76.roundHalfFloor(0L);
        java.util.Locale locale79 = java.util.Locale.TRADITIONAL_CHINESE;
        int int80 = dateTimeField76.getMaximumShortTextLength(locale79);
        java.util.Locale locale81 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale82 = locale81.stripExtensions();
        java.util.Locale locale83 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale84 = locale83.stripExtensions();
        java.lang.String str85 = locale81.getDisplayName(locale83);
        java.lang.String str86 = locale79.getDisplayLanguage(locale81);
        java.lang.String str87 = dateTimeZone67.getName((long) 'x', locale81);
        org.joda.time.LocalTime localTime88 = new org.joda.time.LocalTime(dateTimeZone67);
        java.util.TimeZone timeZone89 = dateTimeZone67.toTimeZone();
        boolean boolean90 = dateTimeZone67.isFixed();
        long long92 = dateTimeZone57.getMillisKeepLocal(dateTimeZone67, 0L);
        org.joda.time.LocalTime localTime93 = new org.joda.time.LocalTime(dateTimeZone57);
        org.joda.time.MutableDateTime mutableDateTime94 = new org.joda.time.MutableDateTime(dateTimeZone57);
        mutableDateTime26.setZoneRetainFields(dateTimeZone57);
        boolean boolean96 = dateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime94", (instant3.compareTo(mutableDateTime94) == 0) == instant3.equals(mutableDateTime94));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = property7.addWrapFieldToCopy(1439);
        org.joda.time.LocalDate localDate10 = dateMidnight9.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone16);
        int int21 = dateTimeZone16.getStandardOffset((long) ' ');
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) 21, dateTimeZone16);
        org.joda.time.DateTime dateTime23 = dateMidnight9.toDateTime(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfHalfday();
        long long34 = dateTimeField32.roundHalfFloor(0L);
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        int int36 = dateTimeField32.getMaximumShortTextLength(locale35);
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.lang.String str41 = locale37.getDisplayName(locale39);
        java.lang.String str42 = locale35.getDisplayLanguage(locale37);
        java.util.Set<java.lang.String> strSet43 = locale37.getUnicodeLocaleAttributes();
        java.util.Locale locale44 = locale37.stripExtensions();
        java.lang.String str45 = dateTimeZone16.getName((long) 53965423, locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateTime23", (dateMidnight9.compareTo(dateTime23) == 0) == dateMidnight9.equals(dateTime23));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.millisOfSecond();
        int int12 = dateTimeField10.getMaximumValue((-1880L));
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        int[] intArray30 = chronology22.get((org.joda.time.ReadablePartial) timeOfDay25, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(0L, chronology22);
        mutableDateTime31.setYear(3);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = instant35.getZone();
        mutableDateTime31.setZone(dateTimeZone36);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(0L, dateTimeZone36);
        java.util.TimeZone timeZone39 = dateTimeZone36.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Chronology chronology48 = instant46.getChronology();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        int[] intArray56 = chronology48.get((org.joda.time.ReadablePartial) timeOfDay51, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, chronology48);
        mutableDateTime57.setYear(3);
        org.joda.time.Instant instant61 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone62 = instant61.getZone();
        mutableDateTime57.setZone(dateTimeZone62);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(0L, dateTimeZone62);
        java.util.TimeZone timeZone65 = dateTimeZone62.toTimeZone();
        boolean boolean66 = timeZone39.hasSameRules(timeZone65);
        java.util.Locale locale67 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone65, locale67);
        java.lang.String str69 = dateTimeField10.getAsText(14L, locale67);
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(locale67);
        java.lang.String str71 = locale67.getISO3Country();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar68 and calendar70", (calendar68.compareTo(calendar70) == 0) == calendar68.equals(calendar70));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str6 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone5);
        int int10 = dateTimeZone5.getStandardOffset((long) ' ');
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = dateTimeZone5.getName((long) 3, locale12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 28, dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.withDurationAdded(readableDuration22, (int) (short) 1);
        long long25 = dateTime24.getMillis();
        org.joda.time.DateTime.Property property26 = dateTime24.dayOfMonth();
        org.joda.time.Chronology chronology27 = dateTime24.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime15.withChronology(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant20", (dateTime7.compareTo(instant20) == 0) == dateTime7.equals(instant20));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone4);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.minuteOfHour();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.addWrapField(53956);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime13 = dateMidnight12.toMutableDateTimeISO();
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        long long15 = instant14.getMillis();
        org.joda.time.Instant instant18 = instant14.withDurationAdded((long) 1970, 32769);
        org.joda.time.DateTime dateTime19 = instant18.toDateTimeISO();
        mutableDateTime13.setDate((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Period period24 = interval23.toPeriod();
        mutableDateTime13.add((org.joda.time.ReadablePeriod) period24, 11);
        int int27 = period24.size();
        mutableDateTime11.add((org.joda.time.ReadablePeriod) period24);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.Chronology chronology32 = localTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.minuteOfHour();
        int int34 = dateTimeField33.getMaximumValue();
        org.joda.time.tz.NameProvider nameProvider36 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider36);
        java.util.Locale.Category category38 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale39 = java.util.Locale.getDefault(category38);
        java.lang.String str42 = nameProvider36.getShortName(locale39, "2022", "hi!");
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology49 = instant47.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.clockhourOfHalfday();
        org.joda.time.DurationField durationField51 = chronology49.eras();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime58 = timeOfDay55.toDateTime((org.joda.time.ReadableInstant) instant57);
        org.joda.time.Chronology chronology59 = instant57.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.clockhourOfHalfday();
        long long62 = dateTimeField60.roundHalfFloor(0L);
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        int int64 = dateTimeField60.getMaximumShortTextLength(locale63);
        java.lang.String str65 = locale63.getLanguage();
        int int66 = dateTimeField52.getMaximumTextLength(locale63);
        org.joda.time.LocalTime localTime68 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime70 = localTime68.minusMinutes((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType71 = org.joda.time.DurationFieldType.seconds();
        boolean boolean72 = localTime68.isSupported(durationFieldType71);
        int int73 = dateTimeField52.getMaximumValue((org.joda.time.ReadablePartial) localTime68);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = dateTimeField52.getType();
        java.util.Locale locale76 = java.util.Locale.CHINESE;
        java.lang.String str77 = dateTimeField52.getAsShortText(5, locale76);
        java.lang.String str80 = nameProvider36.getShortName(locale76, "21", "Tue Apr 30 00:00:00 GMT+00:00 1912");
        java.util.Locale.Builder builder81 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder82 = builder81.clear();
        java.util.Locale locale83 = builder82.build();
        java.lang.String str86 = nameProvider36.getShortName(locale83, "2022-02-21T15:00:08.304Z", "Property[minuteOfHour]");
        java.util.Locale locale88 = java.util.Locale.forLanguageTag("2022-02-21T15:00:19.446Z");
        java.lang.String str91 = nameProvider36.getShortName(locale88, "DateTimeField[hourOfHalfday]", "DurationField[minutes]");
        java.util.Locale locale92 = java.util.Locale.getDefault();
        java.lang.String str93 = locale92.getLanguage();
        java.lang.String str94 = locale92.getScript();
        java.lang.String str97 = nameProvider36.getShortName(locale92, "Germany", "Fri Sep 26 01:58:06 GMT+00:00 2949");
        java.lang.String str98 = dateTimeField33.getAsText(54147686, locale92);
        mutableDateTime11.setRounding(dateTimeField33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant47", (dateTime6.compareTo(instant47) == 0) == dateTime6.equals(instant47));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField11, and durationField8", !(durationField8.compareTo(durationField11) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField11.compareTo(durationField8))));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 52, chronology7);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        mutableDateTime11.setChronology(chronology18);
        int int20 = mutableDateTime11.getDayOfMonth();
        java.lang.Object obj21 = mutableDateTime11.clone();
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DurationField durationField24 = durationFieldType22.getField(chronology23);
        mutableDateTime11.add(durationFieldType22, 54262517);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField24", Math.signum(durationField9.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField9)));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str4 = dateTimeZone3.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.centuryOfEra();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded(readableDuration12, (int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime11.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime20 = dateTime18.plusDays(2);
        int int21 = dateTime20.getWeekOfWeekyear();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        int[] intArray39 = chronology31.get((org.joda.time.ReadablePartial) timeOfDay34, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(0L, chronology31);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        int[] intArray55 = chronology47.get((org.joda.time.ReadablePartial) timeOfDay50, (long) (short) -1);
        mutableDateTime40.setChronology(chronology47);
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) (byte) 0, chronology47);
        org.joda.time.DateTimeField dateTimeField59 = chronology47.secondOfMinute();
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(chronology47);
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime67 = timeOfDay64.toDateTime((org.joda.time.ReadableInstant) instant66);
        org.joda.time.Chronology chronology68 = instant66.getChronology();
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology68);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(chronology68);
        org.joda.time.TimeOfDay timeOfDay75 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant77 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime78 = timeOfDay75.toDateTime((org.joda.time.ReadableInstant) instant77);
        org.joda.time.Chronology chronology79 = instant77.getChronology();
        org.joda.time.TimeOfDay timeOfDay82 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant84 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime85 = timeOfDay82.toDateTime((org.joda.time.ReadableInstant) instant84);
        int[] intArray87 = chronology79.get((org.joda.time.ReadablePartial) timeOfDay82, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime(0L, chronology79);
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime((long) (-1), chronology79);
        org.joda.time.DateTime dateTime90 = dateTime70.toDateTime(chronology79);
        org.joda.time.DateTime.Property property91 = dateTime90.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone92 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime93 = dateTime90.withZoneRetainFields(dateTimeZone92);
        org.joda.time.DateTime dateTime94 = dateMidnight60.toDateTime(dateTimeZone92);
        org.joda.time.DateMidnight dateMidnight95 = new org.joda.time.DateMidnight(86399999L, dateTimeZone92);
        boolean boolean96 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateMidnight95);
        int int97 = property7.getDifference((org.joda.time.ReadableInstant) dateMidnight95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant9", (dateTime5.compareTo(instant9) == 0) == dateTime5.equals(instant9));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray4 = timeOfDay3.getValues();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay7.minusMinutes((int) '4');
        int int13 = timeOfDay3.compareTo((org.joda.time.ReadablePartial) timeOfDay7);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay3.withChronologyRetainFields(chronology20);
        org.joda.time.Chronology chronology24 = timeOfDay3.getChronology();
        org.joda.time.Chronology chronology25 = chronology24.withUTC();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay(54574925L, chronology24);
        org.joda.time.DurationField durationField27 = chronology24.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField27, and durationField22", !(durationField22.compareTo(durationField27) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField27.compareTo(durationField22))));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        int[] intArray19 = chronology11.get((org.joda.time.ReadablePartial) timeOfDay14, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology11);
        mutableDateTime20.setYear(3);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        mutableDateTime20.setZone(dateTimeZone25);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(0L, dateTimeZone25);
        java.util.TimeZone timeZone28 = dateTimeZone25.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        org.joda.time.Chronology chronology37 = instant35.getChronology();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        int[] intArray45 = chronology37.get((org.joda.time.ReadablePartial) timeOfDay40, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, chronology37);
        mutableDateTime46.setYear(3);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone51 = instant50.getZone();
        mutableDateTime46.setZone(dateTimeZone51);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(0L, dateTimeZone51);
        java.util.TimeZone timeZone54 = dateTimeZone51.toTimeZone();
        boolean boolean55 = timeZone28.hasSameRules(timeZone54);
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant60 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime61 = timeOfDay58.toDateTime((org.joda.time.ReadableInstant) instant60);
        org.joda.time.Chronology chronology62 = instant60.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.clockhourOfHalfday();
        long long65 = dateTimeField63.roundHalfFloor(0L);
        java.util.Locale locale66 = java.util.Locale.TRADITIONAL_CHINESE;
        int int67 = dateTimeField63.getMaximumShortTextLength(locale66);
        java.util.Locale locale68 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale69 = locale68.stripExtensions();
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale71 = locale70.stripExtensions();
        java.lang.String str72 = locale68.getDisplayName(locale70);
        java.lang.String str73 = locale66.getDisplayLanguage(locale68);
        java.util.Calendar calendar74 = java.util.Calendar.getInstance(timeZone54, locale68);
        java.lang.String str75 = timeZone54.getID();
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(timeZone54);
        java.util.Calendar.Builder builder77 = builder2.setTimeZone(timeZone54);
        java.util.Calendar.Builder builder79 = builder77.setLenient(false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar74 and calendar76", (calendar74.compareTo(calendar76) == 0) == calendar74.equals(calendar76));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime16.add(readablePeriod38);
        mutableDateTime16.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, dateTimeZone43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime16.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime46 and mutableDateTime44", (mutableDateTime46.compareTo(mutableDateTime44) == 0) == mutableDateTime46.equals(mutableDateTime44));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 52, chronology7);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        mutableDateTime11.setChronology(chronology18);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean26 = interval22.abuts((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Interval interval28 = interval25.withDurationBeforeEnd(readableDuration27);
        boolean boolean29 = interval28.isBeforeNow();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = interval28.toPeriod(periodType30);
        long long34 = chronology18.add((org.joda.time.ReadablePeriod) period31, (long) 23, 32769);
        org.joda.time.DateTimeField dateTimeField35 = chronology18.millisOfDay();
        org.joda.time.DurationField durationField36 = chronology18.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField36, and durationField9", !(durationField9.compareTo(durationField36) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField36.compareTo(durationField9))));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.Chronology chronology23 = timeOfDay2.getChronology();
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime30 = dateTime27.withDurationAdded(readableDuration28, (int) (byte) 0);
        org.joda.time.DateTime dateTime32 = dateTime27.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime36 = dateTime34.plusDays(2);
        org.joda.time.DateTime dateTime38 = dateTime36.minusMillis((int) (short) 0);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekyear(35);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime38.getZone();
        boolean boolean43 = dateTimeZone41.isStandardOffset(0L);
        org.joda.time.DateTime dateTime44 = timeOfDay2.toDateTimeToday(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(53917543);
        org.joda.time.DateTime dateTime47 = dateTime44.withZone(dateTimeZone46);
        org.joda.time.DateTime.Property property48 = dateTime44.secondOfMinute();
        org.joda.time.DateTime dateTime49 = property48.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and dateTime47", (dateTime49.compareTo(dateTime47) == 0) == dateTime49.equals(dateTime47));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = property7.addWrapFieldToCopy(1439);
        org.joda.time.LocalDate localDate10 = dateMidnight9.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone16);
        int int21 = dateTimeZone16.getStandardOffset((long) ' ');
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) 21, dateTimeZone16);
        org.joda.time.DateTime dateTime23 = dateMidnight9.toDateTime(dateTimeZone16);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateTime23", (dateMidnight9.compareTo(dateTime23) == 0) == dateMidnight9.equals(dateTime23));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        long long13 = dateTimeField10.add((long) (short) 100, (long) (byte) -1);
        boolean boolean14 = dateTimeField10.isSupported();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime18 = localTime16.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime20 = localTime16.withMillisOfDay((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTime((org.joda.time.ReadableInstant) instant26);
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay24.minusMinutes((int) '4');
        int[] intArray30 = timeOfDay29.getValues();
        int[] intArray32 = dateTimeField10.add((org.joda.time.ReadablePartial) localTime16, 36000000, intArray30, 52);
        org.joda.time.LocalTime localTime34 = localTime16.minusMinutes(11);
        org.joda.time.Chronology chronology35 = localTime16.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField36, and durationField9", !(durationField9.compareTo(durationField36) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField36.compareTo(durationField9))));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.TimeOfDay timeOfDay6 = property3.getTimeOfDay();
        java.lang.String str7 = property3.getName();
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology16 = instant14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType9.getField(chronology16);
        long long22 = dateTimeField19.add((long) (short) 100, (long) (byte) -1);
        boolean boolean24 = dateTimeField19.isLeap((long) 1439);
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale30 = new java.util.Locale("\u516c\u5143", "0", "weekOfWeekyear");
        java.lang.String str31 = dateTimeField19.getAsShortText(readablePartial25, (int) (byte) 1, locale30);
        java.util.Locale.Category category32 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale33 = java.util.Locale.getDefault(category32);
        java.lang.String str34 = locale30.getDisplayLanguage(locale33);
        int int35 = property3.getMaximumTextLength(locale30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField18", Math.signum(durationField5.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField5)));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone4);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.minuteOfHour();
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.withDurationAdded(readableDuration13, (int) (byte) 0);
        org.joda.time.DateTime dateTime17 = dateTime12.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime12.minus(readableDuration18);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTime((org.joda.time.ReadableInstant) instant26);
        org.joda.time.Chronology chronology28 = instant26.getChronology();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology28);
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.fromMillisOfDay((-2678399900L), chronology28);
        org.joda.time.DateTime dateTime31 = dateTime12.toDateTime(chronology28);
        org.joda.time.DateTimeZone dateTimeZone32 = chronology28.getZone();
        mutableDateTime7.setZoneRetainFields(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant10", (dateTime6.compareTo(instant10) == 0) == dateTime6.equals(instant10));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay2.withChronologyRetainFields(chronology19);
        org.joda.time.DateTimeField[] dateTimeFieldArray23 = timeOfDay2.getFields();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay2.minusMinutes((int) (short) 0);
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay28 = property26.setCopy(481);
        org.joda.time.DurationField durationField29 = property26.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField29, and durationField21", !(durationField21.compareTo(durationField29) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField29.compareTo(durationField21))));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(54692911L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        org.joda.time.Instant instant4 = org.joda.time.Instant.parse("1904-04-30");
        org.joda.time.DateTime dateTime5 = instant4.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime6 = instant4.toMutableDateTime();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        java.util.Locale locale19 = new java.util.Locale("zh");
        java.lang.String str20 = dateTimeField16.getAsShortText((-2678399965L), locale19);
        long long23 = dateTimeField16.getDifferenceAsLong((long) 3, (long) (-292275054));
        mutableDateTime6.setRounding(dateTimeField16);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime6.copy();
        mutableDateTime25.addSeconds(958);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime5", (instant4.compareTo(dateTime5) == 0) == instant4.equals(dateTime5));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate7 = property6.withMinimumValue();
        org.joda.time.LocalDate localDate9 = property6.addToCopy(9);
        org.joda.time.LocalDate localDate10 = property6.roundCeilingCopy();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.plus(readablePeriod12);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay13.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay15 = property14.withMinimumValue();
        org.joda.time.Interval interval16 = yearMonthDay15.toInterval();
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay15.plusYears(10);
        org.joda.time.DateMidnight dateMidnight19 = yearMonthDay18.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.withDurationAdded((long) '4', 1904);
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.Instant instant25 = instant23.withMillis((long) (byte) 100);
        org.joda.time.DateTime dateTime26 = instant23.toDateTimeISO();
        java.util.Date date30 = new java.util.Date(0, (int) '4', 0);
        int int31 = date30.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay32 = org.joda.time.YearMonthDay.fromDateFields(date30);
        int int33 = yearMonthDay32.getYear();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay32.plus(readablePeriod34);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean42 = interval38.abuts((org.joda.time.ReadableInterval) interval41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Interval interval44 = interval41.withDurationBeforeEnd(readableDuration43);
        boolean boolean45 = interval44.isBeforeNow();
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = interval44.toPeriod(periodType46);
        java.lang.String str48 = period47.toString();
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay32.minus((org.joda.time.ReadablePeriod) period47);
        org.joda.time.DateTime dateTime51 = dateTime26.withPeriodAdded((org.joda.time.ReadablePeriod) period47, 53989396);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight22.minus((org.joda.time.ReadablePeriod) period47);
        long long53 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.DateMidnight.Property property54 = dateMidnight22.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight55 = property54.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and dateTime26", (instant23.compareTo(dateTime26) == 0) == instant23.equals(dateTime26));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = instant1.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime3.toGregorianCalendar();
        org.joda.time.DateTime dateTime6 = dateTime3.minusYears((int) '#');
        int int7 = dateTime6.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 2922789);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusYears(0);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.withDurationAdded(readableDuration18, (int) (byte) 0);
        org.joda.time.DateTime dateTime22 = dateTime17.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime26 = dateTime24.plusDays(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int28 = dateTime26.get(dateTimeFieldType27);
        org.joda.time.DateTime dateTime30 = dateTime26.withYearOfCentury(3);
        org.joda.time.DateTime dateTime32 = dateTime26.plusDays((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.withDurationAdded(readableDuration33, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime38 = dateTime35.withField(dateTimeFieldType36, (int) (short) 10);
        int int39 = localDateTime10.get(dateTimeFieldType36);
        boolean boolean40 = localDateTime9.isSupported(dateTimeFieldType36);
        org.joda.time.DateTime.Property property41 = dateTime6.property(dateTimeFieldType36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime3", (instant1.compareTo(dateTime3) == 0) == instant1.equals(dateTime3));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.DateTime dateTime3 = timeOfDay2.toDateTimeToday();
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DateMidnight dateMidnight5 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime7 = dateTime3.minusMillis(11);
        org.joda.time.Instant instant8 = dateTime3.toInstant();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 54236);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean18 = interval14.abuts((org.joda.time.ReadableInterval) interval17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.withWeekyear(2);
        boolean boolean24 = interval14.isBefore((org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Interval interval26 = interval14.withDurationAfterStart(readableDuration25);
        org.joda.time.Duration duration27 = interval14.toDuration();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean34 = interval30.abuts((org.joda.time.ReadableInterval) interval33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.withWeekyear(2);
        boolean boolean40 = interval30.isBefore((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Interval interval42 = interval30.withDurationAfterStart(readableDuration41);
        org.joda.time.Duration duration43 = interval30.toDuration();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean50 = interval46.abuts((org.joda.time.ReadableInterval) interval49);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.withWeekyear(2);
        boolean boolean56 = interval46.isBefore((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.Interval interval58 = interval46.withDurationAfterStart(readableDuration57);
        org.joda.time.Duration duration59 = interval46.toDuration();
        org.joda.time.Interval interval62 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval65 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean66 = interval62.abuts((org.joda.time.ReadableInterval) interval65);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone68);
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight69.withWeekyear(2);
        boolean boolean72 = interval62.isBefore((org.joda.time.ReadableInstant) dateMidnight69);
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.Interval interval74 = interval62.withDurationAfterStart(readableDuration73);
        org.joda.time.Duration duration75 = interval62.toDuration();
        int int76 = duration59.compareTo((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Period period77 = duration59.toPeriod();
        boolean boolean78 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration59);
        boolean boolean79 = duration27.isEqual((org.joda.time.ReadableDuration) duration43);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone81);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight82.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight86 = dateMidnight82.withWeekyear(2);
        org.joda.time.DateMidnight.Property property87 = dateMidnight82.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight89 = dateMidnight82.withYearOfCentury(1);
        boolean boolean90 = duration27.equals((java.lang.Object) 1);
        org.joda.time.Duration duration91 = duration27.toDuration();
        java.lang.String str92 = duration27.toString();
        org.joda.time.Instant instant93 = instant11.minus((org.joda.time.ReadableDuration) duration27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant93", (dateTime3.compareTo(instant93) == 0) == dateTime3.equals(instant93));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("T00:01:00.000");
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks(54034);
        org.joda.time.DateTime dateTime5 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        int[] intArray23 = chronology15.get((org.joda.time.ReadablePartial) timeOfDay18, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, chronology15);
        java.lang.Object obj25 = mutableDateTime24.clone();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        int[] intArray42 = chronology34.get((org.joda.time.ReadablePartial) timeOfDay37, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(0L, chronology34);
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime49 = timeOfDay46.toDateTime((org.joda.time.ReadableInstant) instant48);
        org.joda.time.Chronology chronology50 = instant48.getChronology();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTime((org.joda.time.ReadableInstant) instant55);
        int[] intArray58 = chronology50.get((org.joda.time.ReadablePartial) timeOfDay53, (long) (short) -1);
        mutableDateTime43.setChronology(chronology50);
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(chronology50);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (byte) 0, chronology50);
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime24.toMutableDateTime(chronology50);
        org.joda.time.DateTimeField dateTimeField63 = chronology50.centuryOfEra();
        org.joda.time.TimeOfDay timeOfDay64 = org.joda.time.TimeOfDay.fromMillisOfDay(9L, chronology50);
        org.joda.time.DurationField durationField65 = chronology50.days();
        org.joda.time.DateTime dateTime66 = dateTime6.toDateTime(chronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime6", (instant1.compareTo(dateTime6) == 0) == instant1.equals(dateTime6));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = instant1.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime3.toGregorianCalendar();
        gregorianCalendar4.set(35, 365, 235);
        int int9 = gregorianCalendar4.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone10 = gregorianCalendar4.getTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime3", (instant1.compareTo(dateTime3) == 0) == instant1.equals(dateTime3));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 52, chronology7);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        mutableDateTime11.setChronology(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField20, and durationField9", !(durationField9.compareTo(durationField20) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField20.compareTo(durationField9))));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        boolean boolean8 = timeOfDay3.equals((java.lang.Object) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology15.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology15.getZone();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology15.dayOfWeek();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay3.withChronologyRetainFields(chronology15);
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.fromMillisOfDay((-36806400000L), chronology15);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property26 = localTime25.hourOfDay();
        org.joda.time.LocalTime localTime27 = property26.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField28 = property26.getField();
        boolean boolean29 = dateTimeField28.isSupported();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = dateTimeField28.getType();
        org.joda.time.TimeOfDay.Property property31 = timeOfDay23.property(dateTimeFieldType30);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTime((org.joda.time.ReadableInstant) instant39);
        org.joda.time.Chronology chronology41 = instant39.getChronology();
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        int[] intArray49 = chronology41.get((org.joda.time.ReadablePartial) timeOfDay44, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(0L, chronology41);
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTime((org.joda.time.ReadableInstant) instant55);
        org.joda.time.Chronology chronology57 = instant55.getChronology();
        org.joda.time.TimeOfDay timeOfDay60 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime63 = timeOfDay60.toDateTime((org.joda.time.ReadableInstant) instant62);
        int[] intArray65 = chronology57.get((org.joda.time.ReadablePartial) timeOfDay60, (long) (short) -1);
        mutableDateTime50.setChronology(chronology57);
        org.joda.time.DurationField durationField67 = chronology57.seconds();
        org.joda.time.DurationField durationField68 = chronology57.halfdays();
        org.joda.time.DateTimeField dateTimeField69 = chronology57.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight72.withWeekyear(2);
        org.joda.time.DateMidnight.Property property77 = dateMidnight72.weekOfWeekyear();
        java.lang.String str78 = property77.getAsString();
        java.util.Locale locale79 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale80 = locale79.stripExtensions();
        int int81 = property77.getMaximumTextLength(locale79);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket(1645455656432L, chronology57, locale79, (java.lang.Integer) (-1), 54866999);
        java.lang.String str85 = timeOfDay23.toString("\u661f\u671f\u56db", locale79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField67", Math.signum(durationField17.compareTo(durationField67)) == -Math.signum(durationField67.compareTo(durationField17)));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withSecondOfMinute((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay7 = property5.addWrapFieldToCopy(1);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = property5.getAsShortText(locale8);
        org.joda.time.DurationField durationField10 = property5.getDurationField();
        org.joda.time.TimeOfDay timeOfDay12 = property5.addToCopy(26);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusSeconds(34);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfHalfday();
        org.joda.time.DurationField durationField25 = chronology23.eras();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType16.getField(chronology23);
        org.joda.time.DateTimeField dateTimeField27 = chronology23.hourOfDay();
        int int30 = dateTimeField27.getDifference((long) (short) -1, (long) 69);
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime34 = localTime32.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime36 = localTime32.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime.Property property37 = localTime32.minuteOfHour();
        int int38 = dateTimeField27.getMaximumValue((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.withSecondOfMinute((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property44 = timeOfDay43.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay46 = property44.addWrapFieldToCopy(1);
        int int47 = property44.getMinimumValueOverall();
        int int48 = property44.getMaximumValue();
        java.lang.String str49 = property44.getAsString();
        org.joda.time.TimeOfDay timeOfDay51 = property44.setCopy((int) (byte) 10);
        java.util.Locale locale53 = java.util.Locale.forLanguageTag("DateTimeField[minuteOfDay]");
        java.lang.String str54 = dateTimeField27.getAsShortText((org.joda.time.ReadablePartial) timeOfDay51, locale53);
        java.lang.String str55 = property15.getAsShortText(locale53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField25", Math.signum(durationField10.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField10)));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        boolean boolean7 = timeOfDay2.equals((java.lang.Object) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology14.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology14.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology14.dayOfWeek();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay2.withChronologyRetainFields(chronology14);
        org.joda.time.DurationField durationField22 = chronology14.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField22, and durationField16", !(durationField16.compareTo(durationField22) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField22.compareTo(durationField16))));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight5.withFields((org.joda.time.ReadablePartial) timeOfDay10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.withDayOfMonth(4);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.centuryOfEra();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay17.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withPeriodAdded(readablePeriod26, (int) (short) 0);
        int int29 = property18.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime30 = dateTime25.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) dateTime25);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.minus(readablePeriod32);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str37 = dateTimeZone36.toString();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod32, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight13.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(438);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = dateMidnight39.toDateTime(dateTimeZone41);
        int int44 = dateMidnight39.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime38 and mutableDateTime42", (mutableDateTime38.compareTo(mutableDateTime42) == 0) == mutableDateTime38.equals(mutableDateTime42));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray4 = timeOfDay3.getValues();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay7.minusMinutes((int) '4');
        int int13 = timeOfDay3.compareTo((org.joda.time.ReadablePartial) timeOfDay7);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay3.withChronologyRetainFields(chronology20);
        org.joda.time.Chronology chronology24 = timeOfDay3.getChronology();
        org.joda.time.Chronology chronology25 = timeOfDay3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight28.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone33 = dateMidnight28.getZone();
        int int35 = dateTimeZone33.getStandardOffset(0L);
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale38 = java.util.Locale.CHINA;
        java.lang.String str39 = locale37.getDisplayScript(locale38);
        java.lang.String str40 = locale38.toLanguageTag();
        java.lang.String str41 = dateTimeZone33.getShortName((long) (byte) 10, locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology25, locale38, (java.lang.Integer) 36000000, 19);
        org.joda.time.DateTimeField dateTimeField45 = chronology25.dayOfWeek();
        org.joda.time.DurationField durationField46 = chronology25.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField46, and durationField22", !(durationField22.compareTo(durationField46) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField46.compareTo(durationField22))));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology18.getZone();
        org.joda.time.Chronology chronology23 = chronology6.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = chronology23.centuryOfEra();
        org.joda.time.DurationField durationField25 = chronology23.eras();
        org.joda.time.DurationField durationField26 = chronology23.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField26, and durationField8", !(durationField8.compareTo(durationField26) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField26.compareTo(durationField8))));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        long long9 = dateTimeField7.roundHalfFloor(0L);
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        int int11 = dateTimeField7.getMaximumShortTextLength(locale10);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale12.getDisplayName(locale14);
        java.lang.String str17 = locale10.getDisplayLanguage(locale12);
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleAttributes();
        int int19 = strSet18.size();
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, strMap23);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "\u4e2d\u6587\u53f0\u7063)", "zh", "hi!", "\u4e2d\u6587", "1970-01-01T00:00:00.000Z", "zh" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, strMap36);
        boolean boolean38 = strSet18.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37);
        java.util.Spliterator<java.lang.String> strSpliterator39 = strSet18.spliterator();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.clockhourOfHalfday();
        org.joda.time.DurationField durationField49 = chronology47.eras();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType40.getField(chronology47);
        long long53 = dateTimeField50.add((long) (short) 100, (long) (byte) -1);
        boolean boolean54 = dateTimeField50.isSupported();
        org.joda.time.LocalTime localTime56 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime58 = localTime56.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime60 = localTime56.withMillisOfDay((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime67 = timeOfDay64.toDateTime((org.joda.time.ReadableInstant) instant66);
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay64.minusMinutes((int) '4');
        int[] intArray70 = timeOfDay69.getValues();
        int[] intArray72 = dateTimeField50.add((org.joda.time.ReadablePartial) localTime56, 36000000, intArray70, 52);
        org.joda.time.LocalTime localTime74 = localTime56.minusMinutes(11);
        boolean boolean75 = strSet18.equals((java.lang.Object) localTime56);
        org.joda.time.Chronology chronology76 = localTime56.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = chronology76.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField78 = chronology76.yearOfCentury();
        org.joda.time.DurationField durationField79 = chronology76.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField79, and durationField49", !(durationField49.compareTo(durationField79) == 0) || (Math.signum(durationField49.compareTo(durationField49)) == Math.signum(durationField79.compareTo(durationField49))));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withPeriodAdded(readablePeriod11, (int) (short) 0);
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.TimeOfDay timeOfDay16 = property3.addToCopy(23);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(0L, chronology24);
        org.joda.time.DurationField durationField34 = chronology24.weeks();
        org.joda.time.DateTimeField dateTimeField35 = chronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField36 = chronology24.weekOfWeekyear();
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.lang.String str39 = dateTimeField36.getAsShortText(10L, locale38);
        boolean boolean40 = locale38.hasExtensions();
        java.lang.String str41 = property3.getAsText(locale38);
        java.lang.String str42 = property3.getAsText();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime49 = timeOfDay46.toDateTime((org.joda.time.ReadableInstant) instant48);
        org.joda.time.Chronology chronology50 = instant48.getChronology();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTime((org.joda.time.ReadableInstant) instant55);
        int[] intArray58 = chronology50.get((org.joda.time.ReadablePartial) timeOfDay53, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(0L, chronology50);
        mutableDateTime59.setYear(3);
        int int62 = mutableDateTime59.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime59.minuteOfDay();
        int int64 = property63.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime65 = property63.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime66 = property63.roundCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay70 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant72 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime73 = timeOfDay70.toDateTime((org.joda.time.ReadableInstant) instant72);
        org.joda.time.Chronology chronology74 = instant72.getChronology();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.clockhourOfHalfday();
        org.joda.time.DurationField durationField76 = chronology74.eras();
        org.joda.time.DateTimeField dateTimeField77 = dateTimeFieldType67.getField(chronology74);
        long long80 = dateTimeField77.add((long) (short) 100, (long) (byte) -1);
        boolean boolean82 = dateTimeField77.isLeap((long) 1439);
        org.joda.time.ReadablePartial readablePartial83 = null;
        java.util.Locale locale88 = new java.util.Locale("\u516c\u5143", "0", "weekOfWeekyear");
        java.lang.String str89 = dateTimeField77.getAsShortText(readablePartial83, (int) (byte) 1, locale88);
        java.lang.String str90 = property63.getAsText(locale88);
        int int91 = property3.getMaximumTextLength(locale88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField34 and durationField76", Math.signum(durationField34.compareTo(durationField76)) == -Math.signum(durationField76.compareTo(durationField34)));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Interval interval8 = interval5.withDurationBeforeEnd(readableDuration7);
        boolean boolean9 = interval8.isBeforeNow();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Interval interval11 = interval8.withDurationBeforeEnd(readableDuration10);
        boolean boolean13 = interval8.isBefore((long) 3);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Interval interval15 = interval8.withDurationBeforeEnd(readableDuration14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(0L, chronology24);
        int int34 = mutableDateTime33.getEra();
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) mutableDateTime33);
        mutableDateTime33.setDayOfYear(6);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        int[] intArray53 = chronology45.get((org.joda.time.ReadablePartial) timeOfDay48, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(0L, chronology45);
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTime((org.joda.time.ReadableInstant) instant59);
        org.joda.time.Chronology chronology61 = instant59.getChronology();
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime67 = timeOfDay64.toDateTime((org.joda.time.ReadableInstant) instant66);
        int[] intArray69 = chronology61.get((org.joda.time.ReadablePartial) timeOfDay64, (long) (short) -1);
        mutableDateTime54.setChronology(chronology61);
        boolean boolean71 = mutableDateTime54.isEqualNow();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime54.secondOfDay();
        boolean boolean73 = mutableDateTime54.isAfterNow();
        mutableDateTime54.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        mutableDateTime54.add(readablePeriod76);
        mutableDateTime54.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime54, dateTimeZone81);
        mutableDateTime82.addMinutes((int) (short) -1);
        mutableDateTime82.addHours(0);
        mutableDateTime33.setMillis((org.joda.time.ReadableInstant) mutableDateTime82);
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime33.year();
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime33.weekyear();
        org.joda.time.Interval interval90 = interval8.withStart((org.joda.time.ReadableInstant) mutableDateTime33);
        boolean boolean91 = interval8.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and mutableDateTime82", (mutableDateTime33.compareTo(mutableDateTime82) == 0) == mutableDateTime33.equals(mutableDateTime82));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone4);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean17 = interval13.abuts((org.joda.time.ReadableInterval) interval16);
        long long18 = interval16.getStartMillis();
        org.joda.time.Interval interval20 = interval16.withStartMillis((long) (short) -1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant23 = instant21.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime24 = instant23.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime24.add(readablePeriod25, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        int[] intArray44 = chronology36.get((org.joda.time.ReadablePartial) timeOfDay39, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, chronology36);
        org.joda.time.DurationField durationField46 = chronology36.weeks();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((-86340000L), chronology36);
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.DateTimeField dateTimeField49 = chronology36.dayOfWeek();
        mutableDateTime24.setChronology(chronology36);
        org.joda.time.Interval interval51 = interval20.withChronology(chronology36);
        org.joda.time.DateTime dateTime52 = interval51.getEnd();
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTime((org.joda.time.ReadableInstant) instant58);
        org.joda.time.Chronology chronology60 = instant58.getChronology();
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology60);
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay((java.lang.Object) dateTime52, chronology60);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime((long) 34, chronology60);
        org.joda.time.DateTimeField dateTimeField65 = chronology60.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone66 = chronology60.getZone();
        org.joda.time.DateTime dateTime67 = mutableDateTime7.toDateTime(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant34", (dateTime6.compareTo(instant34) == 0) == dateTime6.equals(instant34));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        int[] intArray17 = chronology9.get((org.joda.time.ReadablePartial) timeOfDay12, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, chronology9);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime19.toMutableDateTime(chronology27);
        java.lang.String str31 = chronology27.toString();
        org.joda.time.DurationField durationField32 = chronology27.eras();
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) 82, chronology27);
        org.joda.time.DurationField durationField34 = chronology27.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField34, and durationField32", !(durationField32.compareTo(durationField34) == 0) || (Math.signum(durationField32.compareTo(durationField32)) == Math.signum(durationField34.compareTo(durationField32))));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withPeriodAdded(readablePeriod6, (int) (short) 0);
        org.joda.time.DateTime.Property property9 = dateTime5.hourOfDay();
        org.joda.time.LocalTime localTime10 = dateTime5.toLocalTime();
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfWeek();
        java.lang.String str13 = chronology11.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField15 = chronology11.centuries();
        org.joda.time.DurationFieldType durationFieldType16 = durationField15.getType();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray20 = timeOfDay19.getValues();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay23.minusMinutes((int) '4');
        int int29 = timeOfDay19.compareTo((org.joda.time.ReadablePartial) timeOfDay23);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfHalfday();
        org.joda.time.DurationField durationField38 = chronology36.eras();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay19.withChronologyRetainFields(chronology36);
        org.joda.time.Chronology chronology40 = timeOfDay19.getChronology();
        org.joda.time.Chronology chronology41 = timeOfDay19.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.eras();
        org.joda.time.DurationField durationField43 = durationFieldType16.getField(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField43 and durationField38", Math.signum(durationField43.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField43)));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology16 = instant14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfHalfday();
        long long19 = dateTimeField17.roundHalfFloor(0L);
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        int int21 = dateTimeField17.getMaximumShortTextLength(locale20);
        java.lang.String str22 = locale20.getLanguage();
        int int23 = dateTimeField9.getMaximumTextLength(locale20);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime27 = localTime25.minusMinutes((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.seconds();
        boolean boolean29 = localTime25.isSupported(durationFieldType28);
        int int30 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.DurationField durationField31 = dateTimeField9.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField31, and durationField8", !(durationField8.compareTo(durationField31) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField31.compareTo(durationField8))));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology6.getZone();
        org.joda.time.DurationField durationField15 = chronology6.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField15, and durationField8", !(durationField8.compareTo(durationField15) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField15.compareTo(durationField8))));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology7.dayOfYear();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        long long23 = chronology7.set((org.joda.time.ReadablePartial) localTime20, (-2678399900L));
        org.joda.time.DurationField durationField24 = chronology7.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField27 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.withEra(1);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withCenturyOfEra(2);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.plusMonths(2022);
        org.joda.time.Chronology chronology37 = dateMidnight34.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.weekyearOfCentury();
        java.util.Calendar.Builder builder40 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder42 = builder40.setLenient(false);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime49 = timeOfDay46.toDateTime((org.joda.time.ReadableInstant) instant48);
        org.joda.time.Chronology chronology50 = instant48.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.clockhourOfHalfday();
        org.joda.time.DurationField durationField52 = chronology50.eras();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType43.getField(chronology50);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.Chronology chronology57 = chronology50.withZone(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField58 = chronology57.millisOfDay();
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant65 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime66 = timeOfDay63.toDateTime((org.joda.time.ReadableInstant) instant65);
        org.joda.time.Chronology chronology67 = instant65.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.clockhourOfHalfday();
        long long70 = dateTimeField68.roundHalfFloor(0L);
        java.util.Locale locale71 = java.util.Locale.TRADITIONAL_CHINESE;
        int int72 = dateTimeField68.getMaximumShortTextLength(locale71);
        java.util.Locale locale73 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale74 = locale73.stripExtensions();
        java.util.Locale locale75 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale76 = locale75.stripExtensions();
        java.lang.String str77 = locale73.getDisplayName(locale75);
        java.lang.String str78 = locale71.getDisplayLanguage(locale73);
        java.lang.String str79 = locale71.getDisplayLanguage();
        java.lang.String str80 = locale60.getDisplayLanguage(locale71);
        java.lang.String str81 = dateTimeField58.getAsText(50400000, locale71);
        java.util.Calendar.Builder builder82 = builder40.setLocale(locale71);
        java.lang.String str83 = dateTimeField38.getAsShortText(1645455730874L, locale71);
        int int84 = dateTimeField27.getMaximumTextLength(locale71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField52", Math.signum(durationField17.compareTo(durationField52)) == -Math.signum(durationField52.compareTo(durationField17)));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight5.withFields((org.joda.time.ReadablePartial) timeOfDay10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight5.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withFieldAdded(durationFieldType15, 53943310);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0L, chronology27);
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        org.joda.time.Chronology chronology40 = instant38.getChronology();
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        int[] intArray48 = chronology40.get((org.joda.time.ReadablePartial) timeOfDay43, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(0L, chronology40);
        org.joda.time.DurationField durationField50 = chronology40.weeks();
        org.joda.time.Chronology chronology51 = chronology40.withUTC();
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay31.withChronologyRetainFields(chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTime((org.joda.time.ReadableInstant) instant59);
        org.joda.time.Chronology chronology61 = instant59.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.clockhourOfHalfday();
        long long64 = dateTimeField62.roundHalfFloor(0L);
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        int int66 = dateTimeField62.getMaximumShortTextLength(locale65);
        java.lang.String str67 = locale65.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology54, locale65);
        int int69 = dateTimeParserBucket68.getOffset();
        java.util.Locale locale70 = dateTimeParserBucket68.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket(1645455561258L, chronology51, locale70, (java.lang.Integer) 29);
        org.joda.time.DurationField durationField73 = chronology51.eras();
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime((java.lang.Object) dateMidnight14, chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField50 and durationField73", Math.signum(durationField50.compareTo(durationField73)) == -Math.signum(durationField73.compareTo(durationField50)));
    }
}

