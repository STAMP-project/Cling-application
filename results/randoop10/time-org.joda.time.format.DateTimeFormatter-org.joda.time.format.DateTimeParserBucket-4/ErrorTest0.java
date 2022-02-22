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
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.dayOfMonth();
        org.joda.time.DurationField durationField12 = chronology7.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField12, and durationField9", !(durationField9.compareTo(durationField12) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField12.compareTo(durationField9))));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight49.withDurationAdded((long) 2, 100);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay55.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight52.withFields((org.joda.time.ReadablePartial) timeOfDay57);
        boolean boolean59 = calendar38.after((java.lang.Object) dateMidnight52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateMidnight52", (mutableDateTime16.compareTo(dateMidnight52) == 0) == mutableDateTime16.equals(dateMidnight52));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(2022);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = instant4.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone7 = instant4.getZone();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) instant2, dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime6", (instant2.compareTo(mutableDateTime6) == 0) == instant2.equals(mutableDateTime6));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant1.withDurationAdded(readableDuration4, 70);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime3", (instant8.compareTo(mutableDateTime3) == 0) == instant8.equals(mutableDateTime3));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean32 = interval28.abuts((org.joda.time.ReadableInterval) interval31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Interval interval34 = interval31.withDurationBeforeEnd(readableDuration33);
        org.joda.time.Interval interval37 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean41 = interval37.abuts((org.joda.time.ReadableInterval) interval40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Interval interval43 = interval40.withDurationBeforeEnd(readableDuration42);
        org.joda.time.Period period44 = interval40.toPeriod();
        org.joda.time.Interval interval45 = interval31.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period44);
        long long48 = chronology19.add((org.joda.time.ReadablePeriod) period44, (long) 363, 20);
        org.joda.time.DurationField durationField49 = chronology19.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField49, and durationField21", !(durationField21.compareTo(durationField49) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField49.compareTo(durationField21))));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.Interval interval8 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean12 = interval8.abuts((org.joda.time.ReadableInterval) interval11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Interval interval14 = interval11.withDurationBeforeEnd(readableDuration13);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean21 = interval17.abuts((org.joda.time.ReadableInterval) interval20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Interval interval23 = interval20.withDurationBeforeEnd(readableDuration22);
        org.joda.time.Period period24 = interval20.toPeriod();
        org.joda.time.Interval interval25 = interval11.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period24);
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder26.setExtension('x', "zh");
        boolean boolean30 = period24.equals((java.lang.Object) builder26);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight2.withPeriodAdded((org.joda.time.ReadablePeriod) period24, 2022);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.halfdays();
        int int34 = period24.get(durationFieldType33);
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime41 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) instant40);
        org.joda.time.Chronology chronology42 = instant40.getChronology();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        int[] intArray50 = chronology42.get((org.joda.time.ReadablePartial) timeOfDay45, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, chronology42);
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant56 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime57 = timeOfDay54.toDateTime((org.joda.time.ReadableInstant) instant56);
        org.joda.time.Chronology chronology58 = instant56.getChronology();
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant63 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime64 = timeOfDay61.toDateTime((org.joda.time.ReadableInstant) instant63);
        int[] intArray66 = chronology58.get((org.joda.time.ReadablePartial) timeOfDay61, (long) (short) -1);
        mutableDateTime51.setChronology(chronology58);
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime(chronology58);
        org.joda.time.DateTimeField dateTimeField69 = chronology58.weekOfWeekyear();
        org.joda.time.DurationField durationField70 = chronology58.seconds();
        boolean boolean71 = durationFieldType33.isSupported(chronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and mutableDateTime51", (dateMidnight2.compareTo(mutableDateTime51) == 0) == dateMidnight2.equals(mutableDateTime51));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.year();
        org.joda.time.DurationField durationField12 = chronology6.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField12, and durationField8", !(durationField8.compareTo(durationField12) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField12.compareTo(durationField8))));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        boolean boolean34 = mutableDateTime17.isEqualNow();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime17.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight38.withDurationAdded((long) (short) 10, 1);
        mutableDateTime17.setDate((org.joda.time.ReadableInstant) dateMidnight41);
        mutableDateTime17.setMinuteOfHour(0);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime17.era();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime17.weekOfWeekyear();
        mutableDateTime17.setWeekOfWeekyear(30);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.DateTime dateTime52 = mutableDateTime17.toDateTime(dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) 11, dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateTime52", (mutableDateTime17.compareTo(dateTime52) == 0) == mutableDateTime17.equals(dateTime52));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime8.hourOfDay();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate14.toDateMidnight(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate14.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property20 = localDate14.yearOfEra();
        org.joda.time.LocalDate localDate22 = localDate14.minusMonths((int) '#');
        int int23 = localDate22.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        org.joda.time.DateTime dateTime26 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        boolean boolean27 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str32 = dateTimeZone31.toString();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(0L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime8.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime35", (dateTime3.compareTo(dateTime35) == 0) == dateTime3.equals(dateTime35));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight37.withDurationAdded((long) (short) 10, 1);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateMidnight40);
        mutableDateTime16.setMinuteOfHour(0);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime16.era();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime16.weekOfWeekyear();
        mutableDateTime16.setWeekOfWeekyear(30);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.DateTime dateTime51 = mutableDateTime16.toDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusMonths((-292275054));
        org.joda.time.DateTime.Property property54 = dateTime53.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime51", (mutableDateTime16.compareTo(dateTime51) == 0) == mutableDateTime16.equals(dateTime51));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        mutableDateTime16.setMillisOfDay((int) (short) 100);
        int int37 = mutableDateTime16.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        int[] intArray53 = chronology45.get((org.joda.time.ReadablePartial) timeOfDay48, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(0L, chronology45);
        mutableDateTime54.setYear(3);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone59 = instant58.getZone();
        mutableDateTime54.setZone(dateTimeZone59);
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(dateTimeZone59);
        java.lang.String str63 = dateTimeZone59.getName((long) 'x');
        mutableDateTime16.setZoneRetainFields(dateTimeZone59);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        org.joda.time.Chronology chronology72 = instant70.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.clockhourOfHalfday();
        org.joda.time.DurationField durationField74 = chronology72.eras();
        org.joda.time.DateTimeField dateTimeField75 = dateTimeFieldType65.getField(chronology72);
        org.joda.time.DateTimeField dateTimeField76 = chronology72.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, chronology72);
        org.joda.time.DurationField durationField78 = chronology72.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField78, and durationField74", !(durationField74.compareTo(durationField78) == 0) || (Math.signum(durationField74.compareTo(durationField74)) == Math.signum(durationField78.compareTo(durationField74))));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DateTimeField dateTimeField27 = chronology19.yearOfCentury();
        org.joda.time.DurationField durationField28 = dateTimeField27.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField28, and durationField21", !(durationField21.compareTo(durationField28) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField28.compareTo(durationField21))));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology6.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField11, and durationField8", !(durationField8.compareTo(durationField11) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField11.compareTo(durationField8))));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime8.hourOfDay();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate14.toDateMidnight(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate14.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property20 = localDate14.yearOfEra();
        org.joda.time.LocalDate localDate22 = localDate14.minusMonths((int) '#');
        int int23 = localDate22.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        org.joda.time.DateTime dateTime26 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        boolean boolean27 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str32 = dateTimeZone31.toString();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(0L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime8.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime37 = dateTime35.withDayOfMonth(19);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight40.withWeekyear(2);
        org.joda.time.DateMidnight.Property property45 = dateMidnight40.weekOfWeekyear();
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.lang.String str47 = property45.getAsShortText(locale46);
        boolean boolean48 = dateTime37.equals((java.lang.Object) property45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime35", (dateTime3.compareTo(dateTime35) == 0) == dateTime3.equals(dateTime35));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.tz.NameProvider nameProvider13 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property17.getFieldType();
        org.joda.time.DurationField durationField19 = property17.getDurationField();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        int[] intArray35 = chronology27.get((org.joda.time.ReadablePartial) timeOfDay30, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, chronology27);
        int int37 = mutableDateTime36.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime36.property(dateTimeFieldType38);
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
        java.util.Calendar calendar58 = mutableDateTime36.toCalendar(locale52);
        java.lang.String str59 = property17.getAsShortText(locale52);
        java.lang.String str60 = locale52.getDisplayName();
        java.lang.String str63 = nameProvider13.getName(locale52, "0", "\u5341\u4e8c\u6708");
        java.lang.String str64 = locale52.getDisplayName();
        java.lang.String str65 = dateTimeField11.getAsText(10, locale52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField19", Math.signum(durationField8.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField8)));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight37.withDurationAdded((long) (short) 10, 1);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateMidnight40);
        mutableDateTime16.setMinuteOfHour(0);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime16.era();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime16.weekOfWeekyear();
        mutableDateTime16.setWeekOfWeekyear(30);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.DateTime dateTime51 = mutableDateTime16.toDateTime(dateTimeZone50);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone54 = instant53.getZone();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTime dateTime58 = dateTime55.withDurationAdded(readableDuration56, (int) (byte) 0);
        int int59 = dateTime58.getMillisOfDay();
        org.joda.time.Instant instant61 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone62 = instant61.getZone();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(dateTimeZone62);
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.DateTime dateTime66 = dateTime63.withDurationAdded(readableDuration64, (int) (byte) 0);
        org.joda.time.DateTime dateTime68 = dateTime63.minusSeconds((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime70 = org.joda.time.MutableDateTime.now(dateTimeZone69);
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((java.lang.Object) dateTime68, dateTimeZone69);
        int int73 = dateTime58.compareTo((org.joda.time.ReadableInstant) dateTime72);
        boolean boolean74 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) dateTime58);
        boolean boolean76 = dateTime58.isEqual((long) (-1645515250));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime51", (mutableDateTime16.compareTo(dateTime51) == 0) == mutableDateTime16.equals(dateTime51));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DurationField durationField27 = chronology19.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField27, and durationField21", !(durationField21.compareTo(durationField27) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField27.compareTo(durationField21))));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime8.hourOfDay();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate14.toDateMidnight(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate14.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property20 = localDate14.yearOfEra();
        org.joda.time.LocalDate localDate22 = localDate14.minusMonths((int) '#');
        int int23 = localDate22.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        org.joda.time.DateTime dateTime26 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        boolean boolean27 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str32 = dateTimeZone31.toString();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(0L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime8.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime35", (dateTime3.compareTo(dateTime35) == 0) == dateTime3.equals(dateTime35));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType15.getField(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime14, chronology22);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.minuteOfDay();
        long long28 = mutableDateTime26.getMillis();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.withDurationAdded(readableDuration35, (int) (short) 1);
        long long38 = dateTime37.getMillis();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str42 = dateTimeZone41.toString();
        long long46 = dateTimeZone41.convertLocalToUTC((long) 10, false, (long) 0);
        org.joda.time.DateTime dateTime47 = dateTime37.toDateTime(dateTimeZone41);
        mutableDateTime26.setZone(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime47", (dateTime21.compareTo(dateTime47) == 0) == dateTime21.equals(dateTime47));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight37.withDurationAdded((long) (short) 10, 1);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateMidnight40);
        mutableDateTime16.setMinuteOfHour(0);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime16.era();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime16.weekOfWeekyear();
        mutableDateTime16.setWeekOfWeekyear(30);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.DateTime dateTime51 = mutableDateTime16.toDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusMonths((-292275054));
        org.joda.time.DateTime.Property property54 = dateTime53.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime51", (mutableDateTime16.compareTo(dateTime51) == 0) == mutableDateTime16.equals(dateTime51));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        mutableDateTime16.setMillisOfDay((int) (short) 100);
        int int37 = mutableDateTime16.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        int[] intArray53 = chronology45.get((org.joda.time.ReadablePartial) timeOfDay48, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(0L, chronology45);
        mutableDateTime54.setYear(3);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone59 = instant58.getZone();
        mutableDateTime54.setZone(dateTimeZone59);
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(dateTimeZone59);
        java.lang.String str63 = dateTimeZone59.getName((long) 'x');
        mutableDateTime16.setZoneRetainFields(dateTimeZone59);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        org.joda.time.Chronology chronology72 = instant70.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.clockhourOfHalfday();
        org.joda.time.DurationField durationField74 = chronology72.eras();
        org.joda.time.DateTimeField dateTimeField75 = dateTimeFieldType65.getField(chronology72);
        org.joda.time.DateTimeField dateTimeField76 = chronology72.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, chronology72);
        org.joda.time.DurationField durationField78 = chronology72.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField78, and durationField74", !(durationField74.compareTo(durationField78) == 0) || (Math.signum(durationField74.compareTo(durationField74)) == Math.signum(durationField78.compareTo(durationField74))));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(chronology6);
        org.joda.time.DurationField durationField13 = chronology6.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField13, and durationField8", !(durationField8.compareTo(durationField13) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField13.compareTo(durationField8))));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.Chronology chronology13 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfMinute();
        org.joda.time.DurationField durationField15 = chronology13.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField15, and durationField9", !(durationField9.compareTo(durationField15) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField15.compareTo(durationField9))));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.monthOfYear();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property19 = dateTime14.hourOfDay();
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
        org.joda.time.DateTimeField dateTimeField38 = chronology27.weekOfWeekyear();
        org.joda.time.DateTime dateTime39 = dateTime14.toDateTime(chronology27);
        org.joda.time.DateTime.Property property40 = dateTime14.dayOfWeek();
        boolean boolean41 = mutableDateTime4.isBefore((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime43 = dateTime14.plusDays(303);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone46);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight47.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property53 = dateMidnight52.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean55 = dateMidnight52.isSupported(dateTimeFieldType54);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay60 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime63 = timeOfDay60.toDateTime((org.joda.time.ReadableInstant) instant62);
        org.joda.time.Chronology chronology64 = instant62.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.clockhourOfHalfday();
        org.joda.time.DurationField durationField66 = chronology64.eras();
        org.joda.time.DateTimeField dateTimeField67 = dateTimeFieldType57.getField(chronology64);
        org.joda.time.DateTimeField dateTimeField68 = chronology64.hourOfDay();
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((long) 22, chronology64);
        org.joda.time.DateTimeField dateTimeField70 = dateTimeFieldType54.getField(chronology64);
        org.joda.time.DateMidnight dateMidnight71 = org.joda.time.DateMidnight.now(chronology64);
        org.joda.time.Instant instant74 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone75 = instant74.getZone();
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone75);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime76.minuteOfDay();
        java.util.Locale locale78 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str79 = property77.getAsShortText(locale78);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((-2678399900L), chronology64, locale78, (java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone82 = dateTimeParserBucket81.getZone();
        org.joda.time.DateTime dateTime83 = dateTime14.toDateTime(dateTimeZone82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField37 and durationField66", Math.signum(durationField37.compareTo(durationField66)) == -Math.signum(durationField66.compareTo(durationField37)));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, (int) (short) 1);
        long long9 = dateTime8.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str13 = dateTimeZone12.toString();
        long long17 = dateTimeZone12.convertLocalToUTC((long) 10, false, (long) 0);
        org.joda.time.DateTime dateTime18 = dateTime8.toDateTime(dateTimeZone12);
        java.lang.String str19 = dateTimeZone12.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime18", (dateTime5.compareTo(dateTime18) == 0) == dateTime5.equals(dateTime18));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        mutableDateTime16.setMillisOfDay(2);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded(readableDuration26, (int) (byte) 0);
        org.joda.time.DateTime dateTime30 = dateTime25.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime34 = dateTime32.plusDays(2);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Chronology chronology44 = instant42.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfHalfday();
        org.joda.time.DurationField durationField46 = chronology44.eras();
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType37.getField(chronology44);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime36, chronology44);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime16.toMutableDateTime(chronology44);
        org.joda.time.DurationField durationField50 = chronology44.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField50, and durationField46", !(durationField46.compareTo(durationField50) == 0) || (Math.signum(durationField46.compareTo(durationField46)) == Math.signum(durationField50.compareTo(durationField46))));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.ReadablePartial readablePartial26 = null;
        int[] intArray31 = new int[] { 31, 400, 400, 365 };
        int int32 = dateTimeField25.getMaximumValue(readablePartial26, intArray31);
        org.joda.time.DurationField durationField33 = dateTimeField25.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField33, and durationField21", !(durationField21.compareTo(durationField33) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField33.compareTo(durationField21))));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DurationFieldType durationFieldType9 = durationField8.getType();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        int[] intArray25 = chronology17.get((org.joda.time.ReadablePartial) timeOfDay20, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, chronology17);
        org.joda.time.DurationField durationField27 = chronology17.weeks();
        long long30 = durationField27.subtract((long) (byte) -1, (long) 5);
        long long33 = durationField27.getValueAsLong((long) ' ', (long) 2);
        boolean boolean34 = durationField27.isSupported();
        int int35 = durationField8.compareTo(durationField27);
        long long38 = durationField27.getDifferenceAsLong((long) 13, (long) 26724);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField27, and durationField8", !(durationField8.compareTo(durationField27) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField27.compareTo(durationField8))));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = locale25.getDisplayName(locale27);
        java.lang.String str30 = dateTimeZone22.getName(100L, locale27);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(0L, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime41 = dateTime38.withDurationAdded(readableDuration39, (int) (short) 1);
        long long42 = dateTime41.getMillis();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str46 = dateTimeZone45.toString();
        long long50 = dateTimeZone45.convertLocalToUTC((long) 10, false, (long) 0);
        org.joda.time.DateTime dateTime51 = dateTime41.toDateTime(dateTimeZone45);
        boolean boolean52 = dateMidnight32.isBefore((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime51", (dateTime7.compareTo(dateTime51) == 0) == dateTime7.equals(dateTime51));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.TimeOfDay timeOfDay8 = property3.addToCopy(12);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = dateTimeField16.getLeapDurationField();
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str20 = dateTimeField16.getAsShortText((long) 365, locale19);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.year();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray33 = timeOfDay32.getValues();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay36.minusMinutes((int) '4');
        int int42 = timeOfDay32.compareTo((org.joda.time.ReadablePartial) timeOfDay36);
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology49 = instant47.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.clockhourOfHalfday();
        org.joda.time.DurationField durationField51 = chronology49.eras();
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay32.withChronologyRetainFields(chronology49);
        org.joda.time.DateTimeField[] dateTimeFieldArray53 = timeOfDay32.getFields();
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTime((org.joda.time.ReadableInstant) instant58);
        org.joda.time.Chronology chronology60 = instant58.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.clockhourOfHalfday();
        long long63 = dateTimeField61.roundHalfFloor(0L);
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        int int65 = dateTimeField61.getMaximumShortTextLength(locale64);
        java.lang.String str66 = locale64.getLanguage();
        java.lang.String str67 = dateTimeField29.getAsShortText((org.joda.time.ReadablePartial) timeOfDay32, locale64);
        java.lang.String str68 = locale64.getDisplayVariant();
        java.lang.String str69 = locale19.getDisplayName(locale64);
        int int70 = property3.getMaximumShortTextLength(locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField51", Math.signum(durationField5.compareTo(durationField51)) == -Math.signum(durationField51.compareTo(durationField5)));
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
        int int18 = mutableDateTime17.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.property(dateTimeFieldType19);
        mutableDateTime17.setMillisOfDay(2);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.withDurationAdded(readableDuration27, (int) (byte) 0);
        org.joda.time.DateTime dateTime31 = dateTime26.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime33 = dateTime31.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime35 = dateTime33.plusDays(2);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.clockhourOfHalfday();
        org.joda.time.DurationField durationField47 = chronology45.eras();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType38.getField(chronology45);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime37, chronology45);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime17.toMutableDateTime(chronology45);
        org.joda.time.DateTimeField dateTimeField51 = chronology45.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField52 = chronology45.hourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(1645688116958L, chronology45);
        org.joda.time.DurationField durationField54 = chronology45.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField54, and durationField47", !(durationField47.compareTo(durationField54) == 0) || (Math.signum(durationField47.compareTo(durationField47)) == Math.signum(durationField54.compareTo(durationField47))));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight37.withDurationAdded((long) (short) 10, 1);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateMidnight40);
        mutableDateTime16.setMinuteOfHour(0);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime16.era();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime16.weekOfWeekyear();
        mutableDateTime16.setWeekOfWeekyear(30);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.DateTime dateTime51 = mutableDateTime16.toDateTime(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime51", (mutableDateTime16.compareTo(dateTime51) == 0) == mutableDateTime16.equals(dateTime51));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType3.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.hourOfDay();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology10);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(chronology10);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, 2, chronology10);
        org.joda.time.tz.NameProvider nameProvider18 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay21.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        org.joda.time.DurationField durationField24 = property22.getDurationField();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        int[] intArray40 = chronology32.get((org.joda.time.ReadablePartial) timeOfDay35, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, chronology32);
        int int42 = mutableDateTime41.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime41.property(dateTimeFieldType43);
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTime((org.joda.time.ReadableInstant) instant49);
        org.joda.time.Chronology chronology51 = instant49.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.clockhourOfHalfday();
        long long54 = dateTimeField52.roundHalfFloor(0L);
        java.util.Locale locale55 = java.util.Locale.TRADITIONAL_CHINESE;
        int int56 = dateTimeField52.getMaximumShortTextLength(locale55);
        java.util.Locale locale57 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale58 = locale57.stripExtensions();
        java.util.Locale locale59 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale60 = locale59.stripExtensions();
        java.lang.String str61 = locale57.getDisplayName(locale59);
        java.lang.String str62 = locale55.getDisplayLanguage(locale57);
        java.util.Calendar calendar63 = mutableDateTime41.toCalendar(locale57);
        java.lang.String str64 = property22.getAsShortText(locale57);
        java.lang.String str65 = locale57.getDisplayName();
        java.lang.String str68 = nameProvider18.getName(locale57, "0", "\u5341\u4e8c\u6708");
        java.lang.String str69 = locale57.getDisplayName();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField24", Math.signum(durationField12.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField12)));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight37.withDurationAdded((long) (short) 10, 1);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateMidnight40);
        mutableDateTime16.setMinuteOfHour(0);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime16.era();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime16.weekOfWeekyear();
        mutableDateTime16.setWeekOfWeekyear(30);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.DateTime dateTime51 = mutableDateTime16.toDateTime(dateTimeZone50);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime51", (mutableDateTime16.compareTo(dateTime51) == 0) == mutableDateTime16.equals(dateTime51));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.Chronology chronology27 = chronology19.withUTC();
        org.joda.time.DurationField durationField28 = chronology19.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField28, and durationField21", !(durationField21.compareTo(durationField28) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField28.compareTo(durationField21))));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DateTimeField dateTimeField27 = chronology19.yearOfCentury();
        java.lang.String str28 = chronology19.toString();
        org.joda.time.Chronology chronology29 = chronology19.withUTC();
        org.joda.time.DurationField durationField30 = chronology29.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField30, and durationField21", !(durationField21.compareTo(durationField30) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField30.compareTo(durationField21))));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime8.hourOfDay();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate14.toDateMidnight(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate14.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property20 = localDate14.yearOfEra();
        org.joda.time.LocalDate localDate22 = localDate14.minusMonths((int) '#');
        int int23 = localDate22.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        org.joda.time.DateTime dateTime26 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        boolean boolean27 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str32 = dateTimeZone31.toString();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(0L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime8.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime37 = dateTime35.withDayOfMonth(19);
        org.joda.time.DateTime dateTime38 = dateTime37.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime35", (dateTime3.compareTo(dateTime35) == 0) == dateTime3.equals(dateTime35));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (-292275054));
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusYears((-292275054));
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded(readableDuration8, (int) (byte) 0);
        org.joda.time.DateTime dateTime12 = dateTime7.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property17 = dateTime12.hourOfDay();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean20 = localDate18.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = localDate18.toDateMidnight(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localDate18.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property24 = localDate18.yearOfEra();
        org.joda.time.LocalDate localDate26 = localDate18.minusMonths((int) '#');
        int int27 = localDate26.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone29 = dateMidnight28.getZone();
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        boolean boolean31 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str36 = dateTimeZone35.toString();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(0L, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime12.withZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.Interval interval40 = yearMonthDay1.toInterval(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime39", (dateTime7.compareTo(dateTime39) == 0) == dateTime7.equals(dateTime39));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DurationFieldType durationFieldType9 = durationField8.getType();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        int[] intArray25 = chronology17.get((org.joda.time.ReadablePartial) timeOfDay20, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, chronology17);
        org.joda.time.DurationField durationField27 = chronology17.weeks();
        long long30 = durationField27.subtract((long) (byte) -1, (long) 5);
        long long33 = durationField27.getValueAsLong((long) ' ', (long) 2);
        boolean boolean34 = durationField27.isSupported();
        int int35 = durationField8.compareTo(durationField27);
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        org.joda.time.Chronology chronology43 = instant41.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.year();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.minuteOfHour();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean52 = interval48.abuts((org.joda.time.ReadableInterval) interval51);
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Interval interval54 = interval51.withDurationBeforeEnd(readableDuration53);
        org.joda.time.Interval interval57 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean61 = interval57.abuts((org.joda.time.ReadableInterval) interval60);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.Interval interval63 = interval60.withDurationBeforeEnd(readableDuration62);
        org.joda.time.Interval interval66 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval69 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean70 = interval66.abuts((org.joda.time.ReadableInterval) interval69);
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.Interval interval72 = interval69.withDurationBeforeEnd(readableDuration71);
        org.joda.time.Period period73 = interval69.toPeriod();
        org.joda.time.Interval interval74 = interval60.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period73);
        org.joda.time.Interval interval75 = interval51.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period73);
        int[] intArray78 = chronology43.get((org.joda.time.ReadablePeriod) period73, (long) 363, (long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime79 = org.joda.time.MutableDateTime.now(chronology43);
        org.joda.time.DateTimeField dateTimeField80 = chronology43.dayOfMonth();
        org.joda.time.TimeOfDay timeOfDay81 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 26723186, chronology43);
        org.joda.time.DurationField durationField82 = chronology43.years();
        int int83 = durationField27.compareTo(durationField82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField27, and durationField8", !(durationField8.compareTo(durationField27) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField27.compareTo(durationField8))));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(10, 11, 11, 20);
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfSecond((int) (byte) 100);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded(readableDuration12, (int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime11.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime11.minus(readableDuration17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.plus(readableDuration19);
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean24 = interval23.isBeforeNow();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean31 = interval27.abuts((org.joda.time.ReadableInterval) interval30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Interval interval33 = interval30.withDurationBeforeEnd(readableDuration32);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean40 = interval36.abuts((org.joda.time.ReadableInterval) interval39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Interval interval42 = interval39.withDurationBeforeEnd(readableDuration41);
        org.joda.time.Period period43 = interval39.toPeriod();
        org.joda.time.Interval interval44 = interval30.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period43);
        java.util.Locale.Builder builder45 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder48 = builder45.setExtension('x', "zh");
        boolean boolean49 = period43.equals((java.lang.Object) builder45);
        org.joda.time.Interval interval50 = interval23.withPeriodAfterStart((org.joda.time.ReadablePeriod) period43);
        org.joda.time.DateTime dateTime51 = dateTime20.plus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.LocalTime localTime53 = localTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period43, 19);
        org.joda.time.MutablePeriod mutablePeriod54 = period43.toMutablePeriod();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTime((org.joda.time.ReadableInstant) instant59);
        org.joda.time.Chronology chronology61 = instant59.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.clockhourOfHalfday();
        org.joda.time.DurationField durationField63 = chronology61.eras();
        boolean boolean64 = mutablePeriod54.equals((java.lang.Object) chronology61);
        org.joda.time.TimeOfDay timeOfDay69 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant71 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime72 = timeOfDay69.toDateTime((org.joda.time.ReadableInstant) instant71);
        org.joda.time.Chronology chronology73 = instant71.getChronology();
        org.joda.time.TimeOfDay timeOfDay76 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant78 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime79 = timeOfDay76.toDateTime((org.joda.time.ReadableInstant) instant78);
        int[] intArray81 = chronology73.get((org.joda.time.ReadablePartial) timeOfDay76, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime(0L, chronology73);
        mutableDateTime82.setYear(3);
        org.joda.time.Instant instant86 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone87 = instant86.getZone();
        mutableDateTime82.setZone(dateTimeZone87);
        org.joda.time.DateMidnight dateMidnight89 = new org.joda.time.DateMidnight(dateTimeZone87);
        org.joda.time.MutableDateTime mutableDateTime90 = new org.joda.time.MutableDateTime((long) 7, dateTimeZone87);
        java.lang.String str92 = dateTimeZone87.getShortName(363L);
        org.joda.time.Chronology chronology93 = chronology61.withZone(dateTimeZone87);
        org.joda.time.DateTime dateTime94 = new org.joda.time.DateTime((long) 26723186, chronology93);
        org.joda.time.DurationField durationField95 = chronology93.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField63, durationField95, and durationField63", !(durationField63.compareTo(durationField95) == 0) || (Math.signum(durationField63.compareTo(durationField63)) == Math.signum(durationField95.compareTo(durationField63))));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean11 = dateMidnight8.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType13.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.hourOfDay();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 22, chronology20);
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType10.getField(chronology20);
        org.joda.time.DateMidnight dateMidnight27 = org.joda.time.DateMidnight.now(chronology20);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.minuteOfDay();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str35 = property33.getAsShortText(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((-2678399900L), chronology20, locale34, (java.lang.Integer) 0);
        long long41 = chronology20.add((long) 2, (long) 4, 70);
        org.joda.time.DateTimeField dateTimeField42 = chronology20.hourOfHalfday();
        org.joda.time.DurationField durationField43 = chronology20.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField43, and durationField22", !(durationField22.compareTo(durationField43) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField43.compareTo(durationField22))));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        org.joda.time.DateTimeField dateTimeField23 = chronology19.centuryOfEra();
        org.joda.time.Chronology chronology24 = chronology19.withUTC();
        org.joda.time.DurationField durationField25 = chronology24.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField25, and durationField21", !(durationField21.compareTo(durationField25) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField25.compareTo(durationField21))));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight37.withDurationAdded((long) (short) 10, 1);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateMidnight40);
        mutableDateTime16.setMinuteOfHour(0);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime16.era();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime16.weekOfWeekyear();
        mutableDateTime16.setWeekOfWeekyear(30);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.DateTime dateTime51 = mutableDateTime16.toDateTime(dateTimeZone50);
        int int53 = dateTimeZone50.getOffsetFromLocal(5923854936000229L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime51", (mutableDateTime16.compareTo(dateTime51) == 0) == mutableDateTime16.equals(dateTime51));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(10, 11, 11, 20);
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str18 = locale17.getDisplayLanguage();
        boolean boolean19 = localTime16.equals((java.lang.Object) locale17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localTime16, locale20);
        long long23 = dateTimeField11.roundHalfEven((long) 2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = dateTimeField11.getType();
        org.joda.time.DurationField durationField25 = dateTimeField11.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField25, and durationField9", !(durationField9.compareTo(durationField25) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField25.compareTo(durationField9))));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(0L);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusMonths((int) (short) -1);
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean10 = interval6.abuts((org.joda.time.ReadableInterval) interval9);
        long long11 = interval9.getStartMillis();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.Interval interval13 = interval9.withPeriodAfterStart(readablePeriod12);
        org.joda.time.DateTime dateTime14 = interval9.getStart();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean17 = localDate15.isSupported(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = localDate15.toDateMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate15.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property21 = localDate15.yearOfEra();
        org.joda.time.LocalDate localDate23 = localDate15.minusMonths((int) '#');
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean30 = interval26.abuts((org.joda.time.ReadableInterval) interval29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Interval interval32 = interval29.withDurationBeforeEnd(readableDuration31);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean39 = interval35.abuts((org.joda.time.ReadableInterval) interval38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Interval interval41 = interval38.withDurationBeforeEnd(readableDuration40);
        org.joda.time.Period period42 = interval38.toPeriod();
        org.joda.time.Interval interval43 = interval29.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period42);
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder47 = builder44.setExtension('x', "zh");
        boolean boolean48 = period42.equals((java.lang.Object) builder44);
        org.joda.time.LocalDate localDate49 = localDate15.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.DateTime dateTime50 = dateTime14.minus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay3.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.DateTime dateTime52 = yearMonthDay3.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate53 = yearMonthDay3.toLocalDate();
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone56 = instant55.getZone();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone56);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime60 = dateTime57.withDurationAdded(readableDuration58, (int) (byte) 0);
        org.joda.time.DateTime dateTime62 = dateTime57.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime64 = dateTime62.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime66 = dateTime62.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property67 = dateTime62.hourOfDay();
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean70 = localDate68.isSupported(dateTimeFieldType69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = localDate68.toDateMidnight(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = localDate68.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property74 = localDate68.yearOfEra();
        org.joda.time.LocalDate localDate76 = localDate68.minusMonths((int) '#');
        int int77 = localDate76.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone79 = dateMidnight78.getZone();
        org.joda.time.DateTime dateTime80 = localDate76.toDateTimeAtStartOfDay(dateTimeZone79);
        boolean boolean81 = dateTime62.isEqual((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str86 = dateTimeZone85.toString();
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime(0L, dateTimeZone85);
        org.joda.time.DateTime dateTime88 = dateTime62.withZoneRetainFields(dateTimeZone85);
        java.lang.String str89 = dateTimeZone85.getID();
        org.joda.time.DateTime dateTime90 = yearMonthDay3.toDateTimeAtMidnight(dateTimeZone85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime87", (dateTime14.compareTo(dateTime87) == 0) == dateTime14.equals(dateTime87));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DurationField durationField11 = chronology6.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField11, and durationField8", !(durationField8.compareTo(durationField11) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField11.compareTo(durationField8))));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(10, 11, 11, 20);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond((int) (byte) 100);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withDurationAdded(readableDuration11, (int) (byte) 0);
        org.joda.time.DateTime dateTime15 = dateTime10.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime10.minus(readableDuration16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.plus(readableDuration18);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean23 = interval22.isBeforeNow();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean30 = interval26.abuts((org.joda.time.ReadableInterval) interval29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Interval interval32 = interval29.withDurationBeforeEnd(readableDuration31);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean39 = interval35.abuts((org.joda.time.ReadableInterval) interval38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Interval interval41 = interval38.withDurationBeforeEnd(readableDuration40);
        org.joda.time.Period period42 = interval38.toPeriod();
        org.joda.time.Interval interval43 = interval29.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period42);
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder47 = builder44.setExtension('x', "zh");
        boolean boolean48 = period42.equals((java.lang.Object) builder44);
        org.joda.time.Interval interval49 = interval22.withPeriodAfterStart((org.joda.time.ReadablePeriod) period42);
        org.joda.time.DateTime dateTime50 = dateTime19.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.LocalTime localTime52 = localTime4.withPeriodAdded((org.joda.time.ReadablePeriod) period42, 19);
        org.joda.time.MutablePeriod mutablePeriod53 = period42.toMutablePeriod();
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTime((org.joda.time.ReadableInstant) instant58);
        org.joda.time.Chronology chronology60 = instant58.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.clockhourOfHalfday();
        org.joda.time.DurationField durationField62 = chronology60.eras();
        boolean boolean63 = mutablePeriod53.equals((java.lang.Object) chronology60);
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        org.joda.time.Chronology chronology72 = instant70.getChronology();
        org.joda.time.TimeOfDay timeOfDay75 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant77 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime78 = timeOfDay75.toDateTime((org.joda.time.ReadableInstant) instant77);
        int[] intArray80 = chronology72.get((org.joda.time.ReadablePartial) timeOfDay75, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(0L, chronology72);
        mutableDateTime81.setYear(3);
        org.joda.time.Instant instant85 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone86 = instant85.getZone();
        mutableDateTime81.setZone(dateTimeZone86);
        org.joda.time.DateMidnight dateMidnight88 = new org.joda.time.DateMidnight(dateTimeZone86);
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime((long) 7, dateTimeZone86);
        java.lang.String str91 = dateTimeZone86.getShortName(363L);
        org.joda.time.Chronology chronology92 = chronology60.withZone(dateTimeZone86);
        org.joda.time.DurationField durationField93 = chronology60.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField62, durationField93, and durationField62", !(durationField62.compareTo(durationField93) == 0) || (Math.signum(durationField62.compareTo(durationField62)) == Math.signum(durationField93.compareTo(durationField62))));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology8);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay18.minuteOfHour();
        java.lang.String str20 = property19.getAsShortText();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        org.joda.time.TimeOfDay timeOfDay23 = property19.addNoWrapToCopy(100);
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        int int25 = property19.getMaximumTextLength(locale24);
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str27 = locale24.getDisplayName(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-86700000L), chronology8, locale26, (java.lang.Integer) 17);
        dateTimeParserBucket29.setPivotYear((java.lang.Integer) 26702077);
        dateTimeParserBucket29.setPivotYear((java.lang.Integer) 112);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property39 = timeOfDay38.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        org.joda.time.DurationField durationField41 = property39.getDurationField();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology49 = instant47.getChronology();
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime55 = timeOfDay52.toDateTime((org.joda.time.ReadableInstant) instant54);
        int[] intArray57 = chronology49.get((org.joda.time.ReadablePartial) timeOfDay52, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(0L, chronology49);
        int int59 = mutableDateTime58.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime58.property(dateTimeFieldType60);
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime67 = timeOfDay64.toDateTime((org.joda.time.ReadableInstant) instant66);
        org.joda.time.Chronology chronology68 = instant66.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = chronology68.clockhourOfHalfday();
        long long71 = dateTimeField69.roundHalfFloor(0L);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        int int73 = dateTimeField69.getMaximumShortTextLength(locale72);
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.util.Locale locale76 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale77 = locale76.stripExtensions();
        java.lang.String str78 = locale74.getDisplayName(locale76);
        java.lang.String str79 = locale72.getDisplayLanguage(locale74);
        java.util.Calendar calendar80 = mutableDateTime58.toCalendar(locale74);
        java.lang.String str81 = property39.getAsShortText(locale74);
        int int82 = property39.getMinimumValue();
        java.util.Locale locale85 = new java.util.Locale("Chinese", "10");
        java.lang.String str86 = locale85.getDisplayScript();
        java.lang.String str87 = locale85.getDisplayName();
        java.lang.String str88 = property39.getAsShortText(locale85);
        dateTimeParserBucket29.saveField(dateTimeFieldType34, "zh", locale85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField41", Math.signum(durationField10.compareTo(durationField41)) == -Math.signum(durationField41.compareTo(durationField10)));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField2 = chronology1.weeks();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology1.eras();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(chronology1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField4", Math.signum(durationField2.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField2)));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        java.util.TimeZone timeZone4 = dateTimeZone2.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        long long14 = dateTimeField12.roundHalfFloor(0L);
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        int int16 = dateTimeField12.getMaximumShortTextLength(locale15);
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale17.getDisplayName(locale19);
        java.lang.String str22 = locale15.getDisplayLanguage(locale17);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone4, locale15);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromCalendarFields(calendar23);
        java.util.Date date28 = new java.util.Date(7, 100, 1);
        java.util.Calendar.Builder builder29 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder31 = builder29.setInstant((long) 3);
        java.util.Date date35 = new java.util.Date(0, (int) '4', 0);
        int int36 = date35.getMinutes();
        date35.setYear(12);
        java.util.Calendar.Builder builder39 = builder29.setInstant(date35);
        java.util.Calendar.Builder builder40 = new java.util.Calendar.Builder();
        java.util.Date date44 = new java.util.Date(0, (int) '4', 0);
        int int45 = date44.getMinutes();
        date44.setYear(12);
        java.util.Calendar.Builder builder48 = builder40.setInstant(date44);
        boolean boolean49 = date35.after(date44);
        boolean boolean50 = date28.after(date44);
        calendar23.setTime(date28);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str55 = dateTimeZone54.toString();
        java.util.TimeZone timeZone56 = dateTimeZone54.toTimeZone();
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
        java.util.Calendar calendar75 = java.util.Calendar.getInstance(timeZone56, locale67);
        java.util.TimeZone.setDefault(timeZone56);
        org.joda.time.TimeOfDay timeOfDay79 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant81 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime82 = timeOfDay79.toDateTime((org.joda.time.ReadableInstant) instant81);
        org.joda.time.Chronology chronology83 = instant81.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.clockhourOfHalfday();
        long long86 = dateTimeField84.roundHalfFloor(0L);
        java.util.Locale locale87 = java.util.Locale.TRADITIONAL_CHINESE;
        int int88 = dateTimeField84.getMaximumShortTextLength(locale87);
        java.util.Locale locale89 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale90 = locale89.stripExtensions();
        java.util.Locale locale91 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale92 = locale91.stripExtensions();
        java.lang.String str93 = locale89.getDisplayName(locale91);
        java.lang.String str94 = locale87.getDisplayLanguage(locale89);
        java.lang.String str95 = locale87.toLanguageTag();
        java.util.Calendar calendar96 = java.util.Calendar.getInstance(timeZone56, locale87);
        calendar96.setLenient(false);
        boolean boolean99 = calendar23.after((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar75 and calendar96", (calendar75.compareTo(calendar96) == 0) == calendar75.equals(calendar96));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DurationFieldType durationFieldType9 = durationField8.getType();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = dateTime15.toString(dateTimeFormatter16);
        org.joda.time.DateTime dateTime19 = dateTime15.minusYears(2022);
        org.joda.time.DateTime.Property property20 = dateTime15.minuteOfHour();
        org.joda.time.DateTime dateTime21 = property20.withMaximumValue();
        org.joda.time.DateTime dateTime22 = property20.getDateTime();
        org.joda.time.DateTime dateTime24 = property20.addToCopy(19L);
        org.joda.time.DurationField durationField25 = property20.getDurationField();
        int int26 = durationField8.compareTo(durationField25);
        long long29 = durationField25.add(1920019L, 30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField25, and durationField8", !(durationField8.compareTo(durationField25) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField25.compareTo(durationField8))));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        int[] intArray17 = chronology9.get((org.joda.time.ReadablePartial) timeOfDay12, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, chronology9);
        int int19 = mutableDateTime18.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.property(dateTimeFieldType20);
        mutableDateTime18.setMillisOfDay(2);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime30 = dateTime27.withDurationAdded(readableDuration28, (int) (byte) 0);
        org.joda.time.DateTime dateTime32 = dateTime27.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime36 = dateTime34.plusDays(2);
        org.joda.time.DateTime dateTime38 = dateTime36.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Chronology chronology46 = instant44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfHalfday();
        org.joda.time.DurationField durationField48 = chronology46.eras();
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType39.getField(chronology46);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime38, chronology46);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime18.toMutableDateTime(chronology46);
        org.joda.time.DateTimeField dateTimeField52 = chronology46.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField53 = chronology46.hourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(1645688116958L, chronology46);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((-86400000L), chronology46);
        org.joda.time.DurationField durationField56 = chronology46.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField48, durationField56, and durationField48", !(durationField48.compareTo(durationField56) == 0) || (Math.signum(durationField48.compareTo(durationField48)) == Math.signum(durationField56.compareTo(durationField48))));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology15.eras();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType8.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.hourOfDay();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean31 = dateMidnight28.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        org.joda.time.Chronology chronology40 = instant38.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField42 = chronology40.eras();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType33.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.hourOfDay();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) 22, chronology40);
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType30.getField(chronology40);
        int int47 = localTime20.indexOf(dateTimeFieldType30);
        org.joda.time.DateTime.Property property48 = dateTime5.property(dateTimeFieldType30);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay51.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay51.withMillisOfSecond(1);
        org.joda.time.Chronology chronology59 = timeOfDay58.getChronology();
        boolean boolean60 = dateTimeFieldType30.isSupported(chronology59);
        org.joda.time.DurationField durationField61 = chronology59.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField61, and durationField17", !(durationField17.compareTo(durationField61) == 0) || (Math.signum(durationField17.compareTo(durationField17)) == Math.signum(durationField61.compareTo(durationField17))));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology7);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology7);
        java.lang.String str14 = chronology7.toString();
        org.joda.time.DurationField durationField15 = chronology7.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField15, and durationField9", !(durationField9.compareTo(durationField15) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField15.compareTo(durationField9))));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean7 = interval3.abuts((org.joda.time.ReadableInterval) interval6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Interval interval9 = interval6.withDurationBeforeEnd(readableDuration8);
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean16 = interval12.abuts((org.joda.time.ReadableInterval) interval15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Interval interval18 = interval15.withDurationBeforeEnd(readableDuration17);
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean25 = interval21.abuts((org.joda.time.ReadableInterval) interval24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Interval interval27 = interval24.withDurationBeforeEnd(readableDuration26);
        org.joda.time.Period period28 = interval24.toPeriod();
        org.joda.time.Interval interval29 = interval15.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Interval interval30 = interval6.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period28);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Interval interval32 = interval6.withDurationAfterStart(readableDuration31);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Chronology chronology39 = instant37.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.clockhourOfHalfday();
        org.joda.time.DurationField durationField41 = chronology39.eras();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology39.getZone();
        org.joda.time.DateTimeField dateTimeField44 = chronology39.clockhourOfDay();
        org.joda.time.Interval interval45 = interval6.withChronology(chronology39);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(100L, chronology39);
        org.joda.time.DurationField durationField47 = chronology39.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField47, and durationField41", !(durationField41.compareTo(durationField47) == 0) || (Math.signum(durationField41.compareTo(durationField41)) == Math.signum(durationField47.compareTo(durationField41))));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime3.minus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime3.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime13 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime3.minus(readableDuration14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight18.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean26 = dateMidnight23.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.clockhourOfHalfday();
        org.joda.time.DurationField durationField37 = chronology35.eras();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType28.getField(chronology35);
        org.joda.time.DateTimeField dateTimeField39 = chronology35.hourOfDay();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) 22, chronology35);
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType25.getField(chronology35);
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(chronology35);
        org.joda.time.Chronology chronology43 = chronology35.withUTC();
        org.joda.time.DateTimeField dateTimeField44 = chronology35.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime15.toMutableDateTime(chronology35);
        org.joda.time.DurationField durationField46 = chronology35.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField46, and durationField37", !(durationField37.compareTo(durationField46) == 0) || (Math.signum(durationField37.compareTo(durationField37)) == Math.signum(durationField46.compareTo(durationField37))));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 23, chronology1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded(readableDuration7, (int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime6.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusDays(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight20.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property26 = dateMidnight25.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean28 = dateMidnight25.isSupported(dateTimeFieldType27);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        org.joda.time.Chronology chronology37 = instant35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.clockhourOfHalfday();
        org.joda.time.DurationField durationField39 = chronology37.eras();
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType30.getField(chronology37);
        org.joda.time.DateTimeField dateTimeField41 = chronology37.hourOfDay();
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) 22, chronology37);
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType27.getField(chronology37);
        org.joda.time.DateMidnight dateMidnight44 = org.joda.time.DateMidnight.now(chronology37);
        boolean boolean45 = dateTimeFieldType16.isSupported(chronology37);
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay2.withChronologyRetainFields(chronology37);
        org.joda.time.DateTimeField dateTimeField47 = chronology37.secondOfDay();
        org.joda.time.DurationField durationField48 = chronology37.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField48, and durationField39", !(durationField39.compareTo(durationField48) == 0) || (Math.signum(durationField39.compareTo(durationField39)) == Math.signum(durationField48.compareTo(durationField39))));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField2 = chronology1.weeks();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField4", Math.signum(durationField2.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField2)));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology15.eras();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType8.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.hourOfDay();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean31 = dateMidnight28.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        org.joda.time.Chronology chronology40 = instant38.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField42 = chronology40.eras();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType33.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.hourOfDay();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) 22, chronology40);
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType30.getField(chronology40);
        int int47 = localTime20.indexOf(dateTimeFieldType30);
        org.joda.time.DateTime.Property property48 = dateTime5.property(dateTimeFieldType30);
        org.joda.time.DateTime dateTime49 = property48.roundHalfEvenCopy();
        org.joda.time.DurationField durationField50 = property48.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField50, and durationField17", !(durationField17.compareTo(durationField50) == 0) || (Math.signum(durationField17.compareTo(durationField17)) == Math.signum(durationField50.compareTo(durationField17))));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType1.getField(chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 303, chronology8);
        org.joda.time.DateTimeField dateTimeField16 = chronology8.hourOfDay();
        org.joda.time.DurationField durationField17 = chronology8.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField17, and durationField10", !(durationField10.compareTo(durationField17) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField17.compareTo(durationField10))));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        long long28 = dateTimeField25.set((long) (byte) 0, (int) (byte) 10);
        java.lang.String str29 = dateTimeField25.getName();
        int int30 = dateTimeField25.getMaximumValue();
        org.joda.time.DurationField durationField31 = dateTimeField25.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField31, and durationField21", !(durationField21.compareTo(durationField31) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField31.compareTo(durationField21))));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.property(dateTimeFieldType19);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.clockhourOfHalfday();
        long long30 = dateTimeField28.roundHalfFloor(0L);
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        int int32 = dateTimeField28.getMaximumShortTextLength(locale31);
        java.util.Locale locale33 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale34 = locale33.stripExtensions();
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = locale31.getDisplayLanguage(locale33);
        java.util.Calendar calendar39 = mutableDateTime17.toCalendar(locale33);
        int int40 = calendar39.getWeekYear();
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
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime(1L, dateTimeZone63);
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime((java.lang.Object) calendar39, dateTimeZone63);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(0L, dateTimeZone63);
        int int69 = dateTime68.getYear();
        org.joda.time.TimeOfDay timeOfDay70 = dateTime68.toTimeOfDay();
        org.joda.time.DateTime dateTime72 = dateTime68.plusMillis(24654035);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localTime67 and timeOfDay70", (localTime67.compareTo(timeOfDay70) == 0) == localTime67.equals(timeOfDay70));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        long long28 = dateTimeField25.set((long) (byte) 0, (int) (byte) 10);
        java.lang.String str29 = dateTimeField25.getName();
        int int30 = dateTimeField25.getMaximumValue();
        org.joda.time.tz.NameProvider nameProvider32 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property36 = timeOfDay35.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property36.getFieldType();
        org.joda.time.DurationField durationField38 = property36.getDurationField();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Chronology chronology46 = instant44.getChronology();
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTime((org.joda.time.ReadableInstant) instant51);
        int[] intArray54 = chronology46.get((org.joda.time.ReadablePartial) timeOfDay49, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(0L, chronology46);
        int int56 = mutableDateTime55.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime55.property(dateTimeFieldType57);
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant63 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime64 = timeOfDay61.toDateTime((org.joda.time.ReadableInstant) instant63);
        org.joda.time.Chronology chronology65 = instant63.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.clockhourOfHalfday();
        long long68 = dateTimeField66.roundHalfFloor(0L);
        java.util.Locale locale69 = java.util.Locale.TRADITIONAL_CHINESE;
        int int70 = dateTimeField66.getMaximumShortTextLength(locale69);
        java.util.Locale locale71 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale72 = locale71.stripExtensions();
        java.util.Locale locale73 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale74 = locale73.stripExtensions();
        java.lang.String str75 = locale71.getDisplayName(locale73);
        java.lang.String str76 = locale69.getDisplayLanguage(locale71);
        java.util.Calendar calendar77 = mutableDateTime55.toCalendar(locale71);
        java.lang.String str78 = property36.getAsShortText(locale71);
        java.lang.String str79 = locale71.getDisplayName();
        java.lang.String str82 = nameProvider32.getName(locale71, "0", "\u5341\u4e8c\u6708");
        java.lang.String str83 = locale71.getDisplayName();
        java.lang.String str84 = dateTimeField25.getAsShortText(0L, locale71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField38", Math.signum(durationField21.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField21)));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(365, 0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.property(dateTimeFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withMillisOfDay((int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekyear();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean15 = interval14.isBeforeNow();
        org.joda.time.Period period16 = interval14.toPeriod();
        boolean boolean17 = localDateTime10.equals((java.lang.Object) period16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.withDurationAdded(readableDuration22, (int) (byte) 0);
        org.joda.time.DateTime dateTime26 = dateTime21.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime21.minus(readableDuration27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.plus(readableDuration29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime30);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period16, (org.joda.time.ReadableInstant) mutableDateTime31);
        boolean boolean33 = dateTimeZone2.equals((java.lang.Object) period16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime21", (dateTime3.compareTo(dateTime21) == 0) == dateTime3.equals(dateTime21));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        mutableDateTime16.setMillisOfDay(2);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded(readableDuration26, (int) (byte) 0);
        org.joda.time.DateTime dateTime30 = dateTime25.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime34 = dateTime32.plusDays(2);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Chronology chronology44 = instant42.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfHalfday();
        org.joda.time.DurationField durationField46 = chronology44.eras();
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType37.getField(chronology44);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime36, chronology44);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime16.toMutableDateTime(chronology44);
        int int50 = mutableDateTime49.getDayOfYear();
        org.joda.time.Chronology chronology51 = mutableDateTime49.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField52, and durationField46", !(durationField46.compareTo(durationField52) == 0) || (Math.signum(durationField46.compareTo(durationField46)) == Math.signum(durationField52.compareTo(durationField46))));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, (int) (short) 1);
        long long9 = dateTime8.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str13 = dateTimeZone12.toString();
        long long17 = dateTimeZone12.convertLocalToUTC((long) 10, false, (long) 0);
        org.joda.time.DateTime dateTime18 = dateTime8.toDateTime(dateTimeZone12);
        org.joda.time.DateTime.Property property19 = dateTime8.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime18", (dateTime8.compareTo(dateTime18) == 0) == dateTime8.equals(dateTime18));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DurationFieldType durationFieldType9 = durationField8.getType();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        int[] intArray25 = chronology17.get((org.joda.time.ReadablePartial) timeOfDay20, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, chronology17);
        org.joda.time.DurationField durationField27 = chronology17.weeks();
        long long30 = durationField27.subtract((long) (byte) -1, (long) 5);
        long long33 = durationField27.getValueAsLong((long) ' ', (long) 2);
        boolean boolean34 = durationField27.isSupported();
        int int35 = durationField8.compareTo(durationField27);
        long long38 = durationField27.add((-86643376179000L), 993);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField27, and durationField8", !(durationField8.compareTo(durationField27) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField27.compareTo(durationField8))));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.lang.String str9 = property7.getAsShortText(locale8);
        org.joda.time.DateMidnight dateMidnight10 = property7.roundHalfFloorCopy();
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.yearOfEra();
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.withDurationAdded(readableDuration18, (int) (byte) 0);
        org.joda.time.DateTime dateTime22 = dateTime17.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime26 = dateTime22.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property27 = dateTime22.hourOfDay();
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
        org.joda.time.DateTimeField dateTimeField46 = chronology35.weekOfWeekyear();
        org.joda.time.DateTime dateTime47 = dateTime22.toDateTime(chronology35);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) (byte) 1, 1645514694169L, chronology35);
        org.joda.time.DateTimeField dateTimeField49 = chronology35.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight10.withChronology(chronology35);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime58 = timeOfDay55.toDateTime((org.joda.time.ReadableInstant) instant57);
        org.joda.time.Chronology chronology59 = instant57.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.clockhourOfHalfday();
        org.joda.time.DurationField durationField61 = chronology59.eras();
        org.joda.time.Interval interval62 = new org.joda.time.Interval((long) (byte) 10, 30L, chronology59);
        org.joda.time.MutableDateTime mutableDateTime63 = dateMidnight10.toMutableDateTime(chronology59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField45 and durationField61", Math.signum(durationField45.compareTo(durationField61)) == -Math.signum(durationField61.compareTo(durationField45)));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weeks();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 157, chronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMillis((int) (byte) 0);
        boolean boolean12 = dateTime11.isEqualNow();
        org.joda.time.DateTime dateTime14 = dateTime11.plusWeeks(36000000);
        org.joda.time.DateTime dateTime16 = dateTime11.plusDays(2008);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean27 = dateMidnight24.isSupported(dateTimeFieldType26);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfHalfday();
        org.joda.time.DurationField durationField38 = chronology36.eras();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType29.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.hourOfDay();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) 22, chronology36);
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType26.getField(chronology36);
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(chronology36);
        org.joda.time.Chronology chronology44 = chronology36.withUTC();
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((java.lang.Object) dateTime11, chronology36);
        org.joda.time.DateTimeField dateTimeField46 = chronology36.monthOfYear();
        java.lang.String str47 = chronology36.toString();
        org.joda.time.DurationField durationField48 = chronology36.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField48, and durationField38", !(durationField38.compareTo(durationField48) == 0) || (Math.signum(durationField38.compareTo(durationField38)) == Math.signum(durationField48.compareTo(durationField38))));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(2022);
        org.joda.time.DateTime dateTime11 = dateTime9.plus(2L);
        org.joda.time.DateTime dateTime13 = dateTime9.plusMinutes(59);
        int int14 = dateTime13.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean25 = dateMidnight22.isSupported(dateTimeFieldType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.clockhourOfHalfday();
        org.joda.time.DurationField durationField36 = chronology34.eras();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType27.getField(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.hourOfDay();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) 22, chronology34);
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType24.getField(chronology34);
        org.joda.time.DateMidnight dateMidnight41 = org.joda.time.DateMidnight.now(chronology34);
        org.joda.time.Chronology chronology42 = chronology34.withUTC();
        org.joda.time.DateTime dateTime43 = dateTime13.toDateTime(chronology34);
        org.joda.time.DurationField durationField44 = chronology34.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField44, and durationField36", !(durationField36.compareTo(durationField44) == 0) || (Math.signum(durationField36.compareTo(durationField36)) == Math.signum(durationField44.compareTo(durationField36))));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology7.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.clockhourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology7);
        org.joda.time.DateTimeField dateTimeField15 = chronology7.millisOfSecond();
        org.joda.time.DurationField durationField16 = dateTimeField15.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField16, and durationField9", !(durationField9.compareTo(durationField16) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField16.compareTo(durationField9))));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology15.eras();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType8.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.hourOfDay();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean31 = dateMidnight28.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        org.joda.time.Chronology chronology40 = instant38.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField42 = chronology40.eras();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType33.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.hourOfDay();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) 22, chronology40);
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType30.getField(chronology40);
        int int47 = localTime20.indexOf(dateTimeFieldType30);
        org.joda.time.DateTime.Property property48 = dateTime5.property(dateTimeFieldType30);
        org.joda.time.DateTime dateTime49 = property48.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime51.add(durationFieldType52, 24);
        org.joda.time.Instant instant56 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone57 = instant56.getZone();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(dateTimeZone57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime61 = dateTime58.withDurationAdded(readableDuration59, (int) (byte) 0);
        org.joda.time.DateTime dateTime63 = dateTime58.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.DateTime dateTime65 = dateTime58.minus(readableDuration64);
        org.joda.time.DateTime dateTime67 = dateTime58.plus(0L);
        org.joda.time.LocalTime localTime68 = dateTime58.toLocalTime();
        org.joda.time.Chronology chronology69 = localTime68.getChronology();
        org.joda.time.DurationField durationField70 = durationFieldType52.getField(chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime49.toMutableDateTime(chronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField70", Math.signum(durationField17.compareTo(durationField70)) == -Math.signum(durationField70.compareTo(durationField17)));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DateTimeField dateTimeField27 = chronology19.yearOfCentury();
        java.lang.String str28 = chronology19.toString();
        org.joda.time.Chronology chronology29 = chronology19.withUTC();
        org.joda.time.DurationField durationField30 = chronology29.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField30, and durationField21", !(durationField21.compareTo(durationField30) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField30.compareTo(durationField21))));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology8);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(52L, chronology8);
        org.joda.time.DurationField durationField19 = chronology8.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField19, and durationField10", !(durationField10.compareTo(durationField19) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField19.compareTo(durationField10))));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.Chronology chronology13 = chronology7.withUTC();
        org.joda.time.Chronology chronology14 = chronology13.withUTC();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now(chronology14);
        org.joda.time.DurationField durationField16 = chronology14.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField16, and durationField9", !(durationField9.compareTo(durationField16) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField16.compareTo(durationField9))));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        int int5 = dateMidnight4.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean7 = dateMidnight4.isSupported(dateTimeFieldType6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.minusMonths(1969);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded(readableDuration14, (int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime13.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime22 = dateTime18.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property23 = dateTime18.hourOfDay();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean26 = localDate24.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = localDate24.toDateMidnight(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = localDate24.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property30 = localDate24.yearOfEra();
        org.joda.time.LocalDate localDate32 = localDate24.minusMonths((int) '#');
        int int33 = localDate32.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone35 = dateMidnight34.getZone();
        org.joda.time.DateTime dateTime36 = localDate32.toDateTimeAtStartOfDay(dateTimeZone35);
        boolean boolean37 = dateTime18.isEqual((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str42 = dateTimeZone41.toString();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(0L, dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime18.withZoneRetainFields(dateTimeZone41);
        java.lang.String str45 = dateTimeZone41.getID();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight4.withZoneRetainFields(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime46", (dateTime13.compareTo(dateTime46) == 0) == dateTime13.equals(dateTime46));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMillis((int) (byte) 0);
        boolean boolean12 = dateTime11.isEqualNow();
        org.joda.time.DateTime dateTime14 = dateTime11.plusWeeks(36000000);
        org.joda.time.DateTime dateTime16 = dateTime11.plusDays(2008);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean27 = dateMidnight24.isSupported(dateTimeFieldType26);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfHalfday();
        org.joda.time.DurationField durationField38 = chronology36.eras();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType29.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.hourOfDay();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) 22, chronology36);
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType26.getField(chronology36);
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(chronology36);
        org.joda.time.Chronology chronology44 = chronology36.withUTC();
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((java.lang.Object) dateTime11, chronology36);
        org.joda.time.DateTimeField dateTimeField46 = chronology36.monthOfYear();
        java.lang.String str47 = chronology36.toString();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime56 = dateTime53.withDurationAdded(readableDuration54, (int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay57 = dateTime56.toTimeOfDay();
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone60 = instant59.getZone();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight63.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone68 = dateMidnight63.getZone();
        long long70 = dateTimeZone60.getMillisKeepLocal(dateTimeZone68, 10L);
        org.joda.time.LocalTime localTime71 = org.joda.time.LocalTime.now(dateTimeZone68);
        long long73 = dateTimeZone68.nextTransition((long) '4');
        org.joda.time.DateTime dateTime74 = timeOfDay57.toDateTimeToday(dateTimeZone68);
        org.joda.time.Chronology chronology75 = chronology36.withZone(dateTimeZone68);
        org.joda.time.DurationField durationField76 = chronology75.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField76, and durationField38", !(durationField38.compareTo(durationField76) == 0) || (Math.signum(durationField38.compareTo(durationField38)) == Math.signum(durationField76.compareTo(durationField38))));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.Chronology chronology13 = chronology7.withUTC();
        org.joda.time.DurationField durationField14 = chronology13.eras();
        org.joda.time.DurationField durationField15 = chronology13.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField15, and durationField9", !(durationField9.compareTo(durationField15) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField15.compareTo(durationField9))));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, (int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay9 = dateTime8.toTimeOfDay();
        org.joda.time.DateTime.Property property10 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime12 = property10.addToCopy((long) 21);
        org.joda.time.DateTime dateTime13 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime15 = property10.addWrapFieldToCopy(62737472);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(26767834);
        org.joda.time.DateTime dateTime18 = dateTime15.toDateTime(dateTimeZone17);
        boolean boolean20 = dateTimeZone17.isStandardOffset((long) (-1645515269));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime18", (dateTime15.compareTo(dateTime18) == 0) == dateTime15.equals(dateTime18));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology15.eras();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType8.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.hourOfDay();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean31 = dateMidnight28.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        org.joda.time.Chronology chronology40 = instant38.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField42 = chronology40.eras();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType33.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.hourOfDay();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) 22, chronology40);
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType30.getField(chronology40);
        int int47 = localTime20.indexOf(dateTimeFieldType30);
        org.joda.time.DateTime.Property property48 = dateTime5.property(dateTimeFieldType30);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay51.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay51.withMillisOfSecond(1);
        org.joda.time.Chronology chronology59 = timeOfDay58.getChronology();
        boolean boolean60 = dateTimeFieldType30.isSupported(chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.era();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.weekOfWeekyear();
        org.joda.time.DurationField durationField63 = chronology59.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField63, and durationField17", !(durationField17.compareTo(durationField63) == 0) || (Math.signum(durationField17.compareTo(durationField17)) == Math.signum(durationField63.compareTo(durationField17))));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readableDuration13);
        org.joda.time.Chronology chronology15 = dateTime12.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField16, and durationField9", !(durationField9.compareTo(durationField16) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField16.compareTo(durationField9))));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("clockhourOfHalfday");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1, locale2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.clockhourOfHalfday();
        long long15 = dateTimeField13.roundHalfFloor(0L);
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        int int17 = dateTimeField13.getMaximumShortTextLength(locale16);
        java.lang.String str18 = locale16.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology5, locale16);
        java.util.Locale locale20 = dateTimeParserBucket19.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.secondOfDay();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale24 = locale23.stripExtensions();
        dateTimeParserBucket19.saveField(dateTimeFieldType21, "zh", locale23);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        int[] intArray41 = chronology33.get((org.joda.time.ReadablePartial) timeOfDay36, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(0L, chronology33);
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology49 = instant47.getChronology();
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime55 = timeOfDay52.toDateTime((org.joda.time.ReadableInstant) instant54);
        int[] intArray57 = chronology49.get((org.joda.time.ReadablePartial) timeOfDay52, (long) (short) -1);
        mutableDateTime42.setChronology(chronology49);
        boolean boolean59 = mutableDateTime42.isEqualNow();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime42.secondOfDay();
        mutableDateTime42.setMillisOfDay((int) (short) 100);
        int int63 = mutableDateTime42.getHourOfDay();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime42.hourOfDay();
        boolean boolean65 = dateTimeParserBucket19.restoreState((java.lang.Object) mutableDateTime42);
        org.joda.time.Instant instant67 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone68 = instant67.getZone();
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(dateTimeZone68);
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.DateTime dateTime72 = dateTime69.withDurationAdded(readableDuration70, (int) (byte) 0);
        int int73 = dateTime72.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int75 = dateTime72.get(dateTimeFieldType74);
        org.joda.time.TimeOfDay timeOfDay79 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property80 = timeOfDay79.minuteOfHour();
        java.lang.String str81 = property80.getAsShortText();
        org.joda.time.DateTimeField dateTimeField82 = property80.getField();
        org.joda.time.TimeOfDay timeOfDay84 = property80.addNoWrapToCopy(100);
        java.util.Locale locale85 = java.util.Locale.TRADITIONAL_CHINESE;
        int int86 = property80.getMaximumTextLength(locale85);
        java.util.Locale locale87 = java.util.Locale.GERMANY;
        java.lang.String str88 = locale85.getDisplayName(locale87);
        dateTimeParserBucket19.saveField(dateTimeFieldType74, "\u7f8e\u570b", locale87);
        java.util.Calendar calendar90 = java.util.Calendar.getInstance(timeZone1, locale87);
        int int92 = timeZone1.getOffset(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar90", (calendar3.compareTo(calendar90) == 0) == calendar3.equals(calendar90));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight5.withFields((org.joda.time.ReadablePartial) timeOfDay10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfWeek();
        mutableDateTime12.add((long) 1);
        org.joda.time.DateTimeField dateTimeField16 = mutableDateTime12.getRoundingField();
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.withDurationAdded(readableDuration21, (int) (byte) 0);
        org.joda.time.DateTime dateTime25 = dateTime20.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime29 = dateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property30 = dateTime25.hourOfDay();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean33 = localDate31.isSupported(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = localDate31.toDateMidnight(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = localDate31.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property37 = localDate31.yearOfEra();
        org.joda.time.LocalDate localDate39 = localDate31.minusMonths((int) '#');
        int int40 = localDate39.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone42 = dateMidnight41.getZone();
        org.joda.time.DateTime dateTime43 = localDate39.toDateTimeAtStartOfDay(dateTimeZone42);
        boolean boolean44 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str49 = dateTimeZone48.toString();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(0L, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime25.withZoneRetainFields(dateTimeZone48);
        mutableDateTime12.setZoneRetainFields(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime50", (dateMidnight2.compareTo(dateTime50) == 0) == dateMidnight2.equals(dateTime50));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        org.joda.time.DurationField durationField19 = chronology8.eras();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((-3L), chronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
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
        java.lang.Object obj17 = mutableDateTime16.clone();
        int int18 = mutableDateTime16.getMinuteOfHour();
        mutableDateTime16.addMinutes((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.clockhourOfHalfday();
        org.joda.time.DurationField durationField31 = chronology29.eras();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType22.getField(chronology29);
        org.joda.time.DateTimeField dateTimeField33 = chronology29.hourOfDay();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) 22, chronology29);
        mutableDateTime16.setChronology(chronology29);
        org.joda.time.DateTimeField dateTimeField36 = chronology29.secondOfDay();
        org.joda.time.DurationField durationField37 = chronology29.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField37, and durationField31", !(durationField31.compareTo(durationField37) == 0) || (Math.signum(durationField31.compareTo(durationField31)) == Math.signum(durationField37.compareTo(durationField31))));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        int int14 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime15 = dateTime12.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime10", (dateTime3.compareTo(mutableDateTime10) == 0) == dateTime3.equals(mutableDateTime10));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.Interval interval9 = interval5.withPeriodAfterStart(readablePeriod8);
        org.joda.time.DateTime dateTime10 = interval9.getStart();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        int[] intArray26 = chronology18.get((org.joda.time.ReadablePartial) timeOfDay21, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(0L, chronology18);
        int int28 = mutableDateTime27.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime27.property(dateTimeFieldType29);
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
        java.util.Calendar calendar49 = mutableDateTime27.toCalendar(locale43);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean51 = calendar49.after((java.lang.Object) dateTimeFieldType50);
        org.joda.time.DateTime.Property property52 = dateTime10.property(dateTimeFieldType50);
        org.joda.time.DateTime dateTime53 = property52.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property54 = dateTime53.monthOfYear();
        org.joda.time.DateTime.Property property55 = dateTime53.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime27", (dateTime10.compareTo(mutableDateTime27) == 0) == dateTime10.equals(mutableDateTime27));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((int) (short) 100);
        int int8 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withWeekyear(32769);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusMinutes((-292275054));
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMinuteOfHour(2);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean24 = interval20.abuts((org.joda.time.ReadableInterval) interval23);
        long long25 = interval23.getStartMillis();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean32 = interval28.abuts((org.joda.time.ReadableInterval) interval31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Interval interval34 = interval31.withDurationBeforeEnd(readableDuration33);
        org.joda.time.Interval interval35 = interval23.overlap((org.joda.time.ReadableInterval) interval31);
        org.joda.time.Duration duration36 = interval31.toDuration();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime17.withDurationAdded((org.joda.time.ReadableDuration) duration36, 112);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime10.plus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Instant instant40 = instant2.minus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) instant40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant40 and dateTime4", (instant40.compareTo(dateTime4) == 0) == instant40.equals(dateTime4));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withEra(1);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withDurationAdded((long) 2, (int) (byte) 1);
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        int int9 = dateMidnight7.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight7.plusMonths(40);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded(readableDuration16, (int) (byte) 0);
        org.joda.time.DateTime dateTime20 = dateTime15.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime24 = dateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property25 = dateTime20.hourOfDay();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean28 = localDate26.isSupported(dateTimeFieldType27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = localDate26.toDateMidnight(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = localDate26.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property32 = localDate26.yearOfEra();
        org.joda.time.LocalDate localDate34 = localDate26.minusMonths((int) '#');
        int int35 = localDate34.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone37 = dateMidnight36.getZone();
        org.joda.time.DateTime dateTime38 = localDate34.toDateTimeAtStartOfDay(dateTimeZone37);
        boolean boolean39 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str44 = dateTimeZone43.toString();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(0L, dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime20.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone43);
        int int48 = dateMidnight11.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime45", (dateMidnight2.compareTo(dateTime45) == 0) == dateMidnight2.equals(dateTime45));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "\u4e2d\u6587\u53f0\u7063)", "zh", "hi!", "\u4e2d\u6587", "1970-01-01T00:00:00.000Z", "zh" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.lang.String str15 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList13);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) str15);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = dateTime22.toString(dateTimeFormatter23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.clockhourOfHalfday();
        org.joda.time.DurationField durationField34 = chronology32.eras();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType25.getField(chronology32);
        org.joda.time.DateTimeField dateTimeField36 = chronology32.hourOfDay();
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(chronology32);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone39);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight40.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property46 = dateMidnight45.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean48 = dateMidnight45.isSupported(dateTimeFieldType47);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTime((org.joda.time.ReadableInstant) instant55);
        org.joda.time.Chronology chronology57 = instant55.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.clockhourOfHalfday();
        org.joda.time.DurationField durationField59 = chronology57.eras();
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType50.getField(chronology57);
        org.joda.time.DateTimeField dateTimeField61 = chronology57.hourOfDay();
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime((long) 22, chronology57);
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType47.getField(chronology57);
        int int64 = localTime37.indexOf(dateTimeFieldType47);
        org.joda.time.DateTime.Property property65 = dateTime22.property(dateTimeFieldType47);
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        org.joda.time.TimeOfDay timeOfDay73 = timeOfDay68.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay75 = timeOfDay68.withMillisOfSecond(1);
        org.joda.time.Chronology chronology76 = timeOfDay75.getChronology();
        boolean boolean77 = dateTimeFieldType47.isSupported(chronology76);
        boolean boolean78 = dateMidnight16.isSupported(dateTimeFieldType47);
        org.joda.time.DurationFieldType durationFieldType79 = dateTimeFieldType47.getDurationType();
        org.joda.time.TimeOfDay timeOfDay83 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant85 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime86 = timeOfDay83.toDateTime((org.joda.time.ReadableInstant) instant85);
        org.joda.time.Chronology chronology87 = instant85.getChronology();
        org.joda.time.DateTimeField dateTimeField88 = chronology87.clockhourOfHalfday();
        org.joda.time.DurationField durationField89 = chronology87.eras();
        org.joda.time.DateTimeField dateTimeField90 = chronology87.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone91 = chronology87.getZone();
        org.joda.time.DateTimeField dateTimeField92 = chronology87.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField93 = chronology87.clockhourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay94 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology87);
        org.joda.time.DateTime dateTime95 = org.joda.time.DateTime.now(chronology87);
        org.joda.time.DateTimeField dateTimeField96 = chronology87.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField97 = chronology87.centuryOfEra();
        org.joda.time.DurationField durationField98 = durationFieldType79.getField(chronology87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField98, and durationField34", !(durationField34.compareTo(durationField98) == 0) || (Math.signum(durationField34.compareTo(durationField34)) == Math.signum(durationField98.compareTo(durationField34))));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean11 = dateMidnight8.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType13.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.hourOfDay();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 22, chronology20);
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType10.getField(chronology20);
        org.joda.time.DateMidnight dateMidnight27 = org.joda.time.DateMidnight.now(chronology20);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.minuteOfDay();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str35 = property33.getAsShortText(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((-2678399900L), chronology20, locale34, (java.lang.Integer) 0);
        long long41 = chronology20.add((long) 2, (long) 4, 70);
        org.joda.time.DateTimeField dateTimeField42 = chronology20.hourOfHalfday();
        org.joda.time.DurationField durationField43 = chronology20.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField43, and durationField22", !(durationField22.compareTo(durationField43) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField43.compareTo(durationField22))));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        int[] intArray18 = chronology10.get((org.joda.time.ReadablePartial) timeOfDay13, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, chronology10);
        org.joda.time.DurationField durationField20 = chronology10.weeks();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property23 = localTime22.hourOfDay();
        org.joda.time.LocalTime localTime24 = property23.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property23.setCopy(0);
        org.joda.time.LocalTime localTime28 = property23.addWrapFieldToCopy(7);
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray32 = timeOfDay31.getValues();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay35.minusMinutes((int) '4');
        int int41 = timeOfDay31.compareTo((org.joda.time.ReadablePartial) timeOfDay35);
        org.joda.time.DateTimeField[] dateTimeFieldArray42 = timeOfDay35.getFields();
        int[] intArray43 = timeOfDay35.getValues();
        chronology10.validate((org.joda.time.ReadablePartial) localTime28, intArray43);
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTime((org.joda.time.ReadableInstant) instant49);
        org.joda.time.Chronology chronology51 = instant49.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.clockhourOfHalfday();
        long long54 = dateTimeField52.roundHalfFloor(0L);
        java.util.Locale locale55 = java.util.Locale.TRADITIONAL_CHINESE;
        int int56 = dateTimeField52.getMaximumShortTextLength(locale55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) (-292275054), chronology10, locale55, (java.lang.Integer) 2000, 982);
        org.joda.time.DurationField durationField60 = durationFieldType0.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField61 = chronology10.secondOfDay();
        org.joda.time.DurationField durationField62 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField62, durationField20, and durationField60", !(durationField62.compareTo(durationField20) == 0) || (Math.signum(durationField62.compareTo(durationField60)) == Math.signum(durationField20.compareTo(durationField60))));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, (int) (short) 1);
        long long9 = dateTime8.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str13 = dateTimeZone12.toString();
        long long17 = dateTimeZone12.convertLocalToUTC((long) 10, false, (long) 0);
        org.joda.time.DateTime dateTime18 = dateTime8.toDateTime(dateTimeZone12);
        long long20 = dateTimeZone12.nextTransition((long) (-292275054));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime18", (dateTime5.compareTo(dateTime18) == 0) == dateTime5.equals(dateTime18));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        int[] intArray19 = chronology11.get((org.joda.time.ReadablePartial) timeOfDay14, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology11);
        java.lang.Object obj21 = mutableDateTime20.clone();
        int int22 = mutableDateTime20.getMinuteOfHour();
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
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone44);
        mutableDateTime20.setZoneRetainFields(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(604800000L, dateTimeZone44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter2.withZone(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeFormatter49.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter49.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter51.withZoneUTC();
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone54 = dateMidnight53.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter51.withZone(dateTimeZone54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter51.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter56.withDefaultYear(428);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone60);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight61.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property67 = dateMidnight66.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean69 = dateMidnight66.isSupported(dateTimeFieldType68);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay74 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant76 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime77 = timeOfDay74.toDateTime((org.joda.time.ReadableInstant) instant76);
        org.joda.time.Chronology chronology78 = instant76.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.clockhourOfHalfday();
        org.joda.time.DurationField durationField80 = chronology78.eras();
        org.joda.time.DateTimeField dateTimeField81 = dateTimeFieldType71.getField(chronology78);
        org.joda.time.DateTimeField dateTimeField82 = chronology78.hourOfDay();
        org.joda.time.LocalTime localTime83 = new org.joda.time.LocalTime((long) 22, chronology78);
        org.joda.time.DateTimeField dateTimeField84 = dateTimeFieldType68.getField(chronology78);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter58.withChronology(chronology78);
        org.joda.time.DurationField durationField86 = chronology78.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField80, durationField86, and durationField80", !(durationField80.compareTo(durationField86) == 0) || (Math.signum(durationField80.compareTo(durationField80)) == Math.signum(durationField86.compareTo(durationField80))));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology8);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property19 = timeOfDay18.minuteOfHour();
        java.lang.String str20 = property19.getAsShortText();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        org.joda.time.TimeOfDay timeOfDay23 = property19.addNoWrapToCopy(100);
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        int int25 = property19.getMaximumTextLength(locale24);
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str27 = locale24.getDisplayName(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-86700000L), chronology8, locale26, (java.lang.Integer) 17);
        org.joda.time.DurationField durationField30 = chronology8.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField30, and durationField10", !(durationField10.compareTo(durationField30) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField30.compareTo(durationField10))));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(10, 11, 11, 20);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond((int) (byte) 100);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withDurationAdded(readableDuration11, (int) (byte) 0);
        org.joda.time.DateTime dateTime15 = dateTime10.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime10.minus(readableDuration16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.plus(readableDuration18);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean23 = interval22.isBeforeNow();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean30 = interval26.abuts((org.joda.time.ReadableInterval) interval29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Interval interval32 = interval29.withDurationBeforeEnd(readableDuration31);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean39 = interval35.abuts((org.joda.time.ReadableInterval) interval38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Interval interval41 = interval38.withDurationBeforeEnd(readableDuration40);
        org.joda.time.Period period42 = interval38.toPeriod();
        org.joda.time.Interval interval43 = interval29.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period42);
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder47 = builder44.setExtension('x', "zh");
        boolean boolean48 = period42.equals((java.lang.Object) builder44);
        org.joda.time.Interval interval49 = interval22.withPeriodAfterStart((org.joda.time.ReadablePeriod) period42);
        org.joda.time.DateTime dateTime50 = dateTime19.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.LocalTime localTime52 = localTime4.withPeriodAdded((org.joda.time.ReadablePeriod) period42, 19);
        org.joda.time.MutablePeriod mutablePeriod53 = period42.toMutablePeriod();
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTime((org.joda.time.ReadableInstant) instant58);
        org.joda.time.Chronology chronology60 = instant58.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.clockhourOfHalfday();
        org.joda.time.DurationField durationField62 = chronology60.eras();
        boolean boolean63 = mutablePeriod53.equals((java.lang.Object) chronology60);
        org.joda.time.DurationField durationField64 = chronology60.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField62, durationField64, and durationField62", !(durationField62.compareTo(durationField64) == 0) || (Math.signum(durationField62.compareTo(durationField62)) == Math.signum(durationField64.compareTo(durationField62))));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(2022);
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfSecond();
        org.joda.time.DateTime.Property property11 = dateTime9.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int13 = dateTime9.get(dateTimeFieldType12);
        org.joda.time.Instant instant14 = dateTime9.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(2022);
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfSecond();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays(26702386);
        long long13 = dateTime9.getMillis();
        org.joda.time.LocalDate localDate14 = dateTime9.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear(69);
        int int15 = dateTime14.getMinuteOfDay();
        org.joda.time.Chronology chronology16 = dateTime14.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime10", (dateTime3.compareTo(mutableDateTime10) == 0) == dateTime3.equals(mutableDateTime10));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime10.withHourOfDay(22);
        org.joda.time.DateTime dateTime16 = dateTime14.withDayOfYear(9);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight22.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone27 = dateMidnight22.getZone();
        long long29 = dateTimeZone19.getMillisKeepLocal(dateTimeZone27, 10L);
        boolean boolean31 = dateTimeZone19.isStandardOffset((long) 365);
        org.joda.time.DateTime dateTime32 = dateTime14.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime34 = dateTime14.withYearOfEra(26708123);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears(87);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone38 = dateMidnight37.getZone();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withMillis((long) (short) -1);
        boolean boolean42 = dateTime34.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime.Property property43 = dateTime39.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime41", (instant1.compareTo(dateTime41) == 0) == instant1.equals(dateTime41));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType1.getField(chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology8);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(chronology8);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 1439, chronology8);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.minuteOfDay();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        int[] intArray37 = chronology29.get((org.joda.time.ReadablePartial) timeOfDay32, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, chronology29);
        int int39 = mutableDateTime38.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime38.property(dateTimeFieldType40);
        mutableDateTime38.setMillisOfDay(2);
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property47 = timeOfDay46.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        org.joda.time.DurationField durationField49 = property47.getDurationField();
        boolean boolean50 = mutableDateTime38.equals((java.lang.Object) durationField49);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone53 = instant52.getZone();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateTime dateTime57 = dateTime54.withDurationAdded(readableDuration55, (int) (byte) 0);
        org.joda.time.DateTime dateTime59 = dateTime54.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime61 = dateTime59.plusMinutes((int) (byte) 10);
        int int62 = dateTime61.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime63 = dateTime61.toDateTimeISO();
        org.joda.time.Interval interval66 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval69 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean70 = interval66.abuts((org.joda.time.ReadableInterval) interval69);
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.Interval interval72 = interval69.withDurationBeforeEnd(readableDuration71);
        org.joda.time.Interval interval75 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval78 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean79 = interval75.abuts((org.joda.time.ReadableInterval) interval78);
        org.joda.time.ReadableDuration readableDuration80 = null;
        org.joda.time.Interval interval81 = interval78.withDurationBeforeEnd(readableDuration80);
        org.joda.time.Interval interval84 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval87 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean88 = interval84.abuts((org.joda.time.ReadableInterval) interval87);
        org.joda.time.ReadableDuration readableDuration89 = null;
        org.joda.time.Interval interval90 = interval87.withDurationBeforeEnd(readableDuration89);
        org.joda.time.Period period91 = interval87.toPeriod();
        org.joda.time.Interval interval92 = interval78.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period91);
        org.joda.time.Interval interval93 = interval69.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period91);
        org.joda.time.DateTime dateTime94 = dateTime61.plus((org.joda.time.ReadablePeriod) period91);
        mutableDateTime38.add((org.joda.time.ReadablePeriod) period91, 0);
        mutableDateTime20.add((org.joda.time.ReadablePeriod) period91);
        org.joda.time.LocalTime localTime98 = localTime15.minus((org.joda.time.ReadablePeriod) period91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField49", Math.signum(durationField10.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField10)));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType1.getField(chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 303, chronology8);
        org.joda.time.DateTimeField dateTimeField16 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField19 = chronology8.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField19, and durationField10", !(durationField10.compareTo(durationField19) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField19.compareTo(durationField10))));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        long long6 = dateTimeField4.roundFloor(982L);
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
        int int46 = calendar45.getWeekYear();
        calendar45.set((int) (byte) -1, (int) (byte) 100, 0, 8, (int) (short) 100);
        calendar45.set((int) (byte) 0, 35, 100, (int) 'a', 2000);
        org.joda.time.TimeOfDay timeOfDay59 = org.joda.time.TimeOfDay.fromCalendarFields(calendar45);
        calendar45.clear();
        org.joda.time.LocalTime localTime61 = org.joda.time.LocalTime.fromCalendarFields(calendar45);
        java.util.Locale locale65 = new java.util.Locale("\u5341\u4e8c\u6708", "hi!", "10");
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleKeys();
        org.joda.time.TimeOfDay timeOfDay69 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant71 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime72 = timeOfDay69.toDateTime((org.joda.time.ReadableInstant) instant71);
        org.joda.time.Chronology chronology73 = instant71.getChronology();
        org.joda.time.DateTimeField dateTimeField74 = chronology73.clockhourOfHalfday();
        org.joda.time.DurationField durationField75 = chronology73.eras();
        org.joda.time.DateTimeField dateTimeField76 = chronology73.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay79 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant81 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime82 = timeOfDay79.toDateTime((org.joda.time.ReadableInstant) instant81);
        org.joda.time.Chronology chronology83 = instant81.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.clockhourOfHalfday();
        long long86 = dateTimeField84.roundHalfFloor(0L);
        java.util.Locale locale87 = java.util.Locale.TRADITIONAL_CHINESE;
        int int88 = dateTimeField84.getMaximumShortTextLength(locale87);
        java.lang.String str89 = locale87.getLanguage();
        int int90 = dateTimeField76.getMaximumTextLength(locale87);
        java.lang.String str91 = locale65.getDisplayVariant(locale87);
        java.util.Locale locale94 = new java.util.Locale("PT0S", "Property[millisOfSecond]");
        java.lang.String str95 = locale65.getDisplayCountry(locale94);
        java.lang.String str96 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localTime61, locale65);
        org.joda.time.DurationField durationField97 = dateTimeField4.getLeapDurationField();
        org.joda.time.DurationField durationField98 = dateTimeField4.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField75, durationField98, and durationField75", !(durationField75.compareTo(durationField98) == 0) || (Math.signum(durationField75.compareTo(durationField75)) == Math.signum(durationField98.compareTo(durationField75))));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.year();
        org.joda.time.DurationField durationField12 = chronology6.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField12, and durationField8", !(durationField8.compareTo(durationField12) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField12.compareTo(durationField8))));
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
        int int18 = mutableDateTime17.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.property(dateTimeFieldType19);
        mutableDateTime17.setMillisOfDay(2);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.withDurationAdded(readableDuration27, (int) (byte) 0);
        org.joda.time.DateTime dateTime31 = dateTime26.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime33 = dateTime31.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime35 = dateTime33.plusDays(2);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.clockhourOfHalfday();
        org.joda.time.DurationField durationField47 = chronology45.eras();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType38.getField(chronology45);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime37, chronology45);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime17.toMutableDateTime(chronology45);
        org.joda.time.DateTimeField dateTimeField51 = chronology45.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField52 = chronology45.hourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(1645688116958L, chronology45);
        org.joda.time.DurationField durationField54 = chronology45.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField54, and durationField47", !(durationField47.compareTo(durationField54) == 0) || (Math.signum(durationField47.compareTo(durationField47)) == Math.signum(durationField54.compareTo(durationField47))));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.add(100L);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology11.getZone();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.clockhourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology11);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DateTimeField dateTimeField21 = chronology11.year();
        mutableDateTime1.setRounding(dateTimeField21);
        int int23 = mutableDateTime1.getMonthOfYear();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        org.joda.time.Chronology chronology30 = instant28.getChronology();
        org.joda.time.DateTime dateTime31 = instant28.toDateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.plusWeeks(2022);
        org.joda.time.DateTime.Property property34 = dateTime33.millisOfSecond();
        org.joda.time.DateTime dateTime35 = dateTime33.toDateTimeISO();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        org.joda.time.Chronology chronology43 = instant41.getChronology();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime49 = timeOfDay46.toDateTime((org.joda.time.ReadableInstant) instant48);
        int[] intArray51 = chronology43.get((org.joda.time.ReadablePartial) timeOfDay46, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(0L, chronology43);
        org.joda.time.DurationField durationField53 = chronology43.weeks();
        org.joda.time.LocalTime localTime55 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property56 = localTime55.hourOfDay();
        org.joda.time.LocalTime localTime57 = property56.roundFloorCopy();
        org.joda.time.LocalTime localTime59 = property56.setCopy(0);
        org.joda.time.LocalTime localTime61 = property56.addWrapFieldToCopy(7);
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray65 = timeOfDay64.getValues();
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        org.joda.time.TimeOfDay timeOfDay73 = timeOfDay68.minusMinutes((int) '4');
        int int74 = timeOfDay64.compareTo((org.joda.time.ReadablePartial) timeOfDay68);
        org.joda.time.DateTimeField[] dateTimeFieldArray75 = timeOfDay68.getFields();
        int[] intArray76 = timeOfDay68.getValues();
        chronology43.validate((org.joda.time.ReadablePartial) localTime61, intArray76);
        org.joda.time.DurationField durationField78 = chronology43.days();
        org.joda.time.LocalTime localTime79 = org.joda.time.LocalTime.now(chronology43);
        org.joda.time.DurationField durationField80 = chronology43.minutes();
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(chronology43);
        int int82 = dateTime35.compareTo((org.joda.time.ReadableInstant) mutableDateTime81);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField53", Math.signum(durationField13.compareTo(durationField53)) == -Math.signum(durationField53.compareTo(durationField13)));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        mutableDateTime16.setMillisOfDay(2);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded(readableDuration26, (int) (byte) 0);
        org.joda.time.DateTime dateTime30 = dateTime25.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime34 = dateTime32.plusDays(2);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Chronology chronology44 = instant42.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfHalfday();
        org.joda.time.DurationField durationField46 = chronology44.eras();
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType37.getField(chronology44);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime36, chronology44);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime16.toMutableDateTime(chronology44);
        int int50 = mutableDateTime49.getDayOfYear();
        org.joda.time.Chronology chronology51 = mutableDateTime49.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField52, and durationField46", !(durationField46.compareTo(durationField52) == 0) || (Math.signum(durationField46.compareTo(durationField46)) == Math.signum(durationField52.compareTo(durationField46))));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.Chronology chronology13 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfMinute();
        org.joda.time.DurationField durationField15 = chronology13.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField15, and durationField9", !(durationField9.compareTo(durationField15) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField15.compareTo(durationField9))));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        long long13 = chronology8.add(0L, (long) 3, 4503347);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.withDurationAdded(readableDuration18, (int) (byte) 0);
        org.joda.time.DateTime dateTime22 = dateTime17.minusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime26 = localTime24.minusMinutes((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.seconds();
        boolean boolean28 = localTime24.isSupported(durationFieldType27);
        org.joda.time.DateTime dateTime30 = dateTime22.withFieldAdded(durationFieldType27, 0);
        org.joda.time.DateTime.Property property31 = dateTime30.monthOfYear();
        org.joda.time.DateTime dateTime33 = dateTime30.plusHours((int) (short) -1);
        org.joda.time.DateTime dateTime35 = dateTime30.minusDays(0);
        java.util.Locale locale40 = new java.util.Locale("\u5341\u4e8c\u6708", "hi!", "10");
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleKeys();
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Chronology chronology48 = instant46.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.clockhourOfHalfday();
        org.joda.time.DurationField durationField50 = chronology48.eras();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant56 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime57 = timeOfDay54.toDateTime((org.joda.time.ReadableInstant) instant56);
        org.joda.time.Chronology chronology58 = instant56.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.clockhourOfHalfday();
        long long61 = dateTimeField59.roundHalfFloor(0L);
        java.util.Locale locale62 = java.util.Locale.TRADITIONAL_CHINESE;
        int int63 = dateTimeField59.getMaximumShortTextLength(locale62);
        java.lang.String str64 = locale62.getLanguage();
        int int65 = dateTimeField51.getMaximumTextLength(locale62);
        java.lang.String str66 = locale40.getDisplayVariant(locale62);
        java.lang.String str67 = dateTime35.toString("8", locale62);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 100, chronology8, locale62, (java.lang.Integer) 454);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.TimeOfDay timeOfDay74 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant76 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime77 = timeOfDay74.toDateTime((org.joda.time.ReadableInstant) instant76);
        org.joda.time.Chronology chronology78 = instant76.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.clockhourOfHalfday();
        long long81 = dateTimeField79.roundHalfFloor(0L);
        java.util.Locale locale82 = java.util.Locale.TRADITIONAL_CHINESE;
        int int83 = dateTimeField79.getMaximumShortTextLength(locale82);
        java.lang.String str84 = locale82.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket85 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology71, locale82);
        java.util.Locale locale86 = dateTimeParserBucket85.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = org.joda.time.DateTimeFieldType.secondOfDay();
        java.util.Locale locale89 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale90 = locale89.stripExtensions();
        dateTimeParserBucket85.saveField(dateTimeFieldType87, "zh", locale89);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket94 = new org.joda.time.format.DateTimeParserBucket(25200000L, chronology8, locale89, (java.lang.Integer) (-46800000), 312);
        org.joda.time.DurationField durationField95 = chronology8.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField50, durationField95, and durationField50", !(durationField50.compareTo(durationField95) == 0) || (Math.signum(durationField50.compareTo(durationField50)) == Math.signum(durationField95.compareTo(durationField50))));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.Chronology chronology13 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.clockhourOfHalfday();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.DurationField durationField17 = chronology13.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField17, and durationField9", !(durationField9.compareTo(durationField17) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField17.compareTo(durationField9))));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTime dateTime8 = instant5.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.plusWeeks(2022);
        org.joda.time.DateTime dateTime12 = dateTime10.plus(2L);
        org.joda.time.DateTime dateTime14 = dateTime10.plusMinutes(59);
        int int15 = dateTime14.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight18.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean26 = dateMidnight23.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.clockhourOfHalfday();
        org.joda.time.DurationField durationField37 = chronology35.eras();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType28.getField(chronology35);
        org.joda.time.DateTimeField dateTimeField39 = chronology35.hourOfDay();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) 22, chronology35);
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType25.getField(chronology35);
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(chronology35);
        org.joda.time.Chronology chronology43 = chronology35.withUTC();
        org.joda.time.DateTime dateTime44 = dateTime14.toDateTime(chronology35);
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket(1645511099224L, chronology35, locale45, (java.lang.Integer) 121);
        org.joda.time.DurationField durationField48 = chronology35.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField48, and durationField37", !(durationField37.compareTo(durationField48) == 0) || (Math.signum(durationField37.compareTo(durationField37)) == Math.signum(durationField48.compareTo(durationField37))));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime3.minus(readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.plus(readableDuration11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        long long25 = dateTimeField23.roundHalfFloor(0L);
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        int int27 = dateTimeField23.getMaximumShortTextLength(locale26);
        java.lang.String str28 = locale26.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology15, locale26);
        java.util.Locale locale30 = dateTimeParserBucket29.getLocale();
        long long33 = dateTimeParserBucket29.computeMillis(true, "");
        dateTimeParserBucket29.setPivotYear((java.lang.Integer) 7359830);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket29.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.weekyears();
        long long39 = durationField37.getMillis((int) (byte) 100);
        boolean boolean40 = mutableDateTime13.equals((java.lang.Object) durationField37);
        mutableDateTime13.addHours(1970);
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray46 = timeOfDay45.getValues();
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTime((org.joda.time.ReadableInstant) instant51);
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay49.minusMinutes((int) '4');
        int int55 = timeOfDay45.compareTo((org.joda.time.ReadablePartial) timeOfDay49);
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant60 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime61 = timeOfDay58.toDateTime((org.joda.time.ReadableInstant) instant60);
        org.joda.time.Chronology chronology62 = instant60.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.clockhourOfHalfday();
        org.joda.time.DurationField durationField64 = chronology62.eras();
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay45.withChronologyRetainFields(chronology62);
        org.joda.time.DateTimeField dateTimeField66 = chronology62.centuryOfEra();
        org.joda.time.Chronology chronology67 = chronology62.withUTC();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime13.toMutableDateTime(chronology62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField37 and durationField64", Math.signum(durationField37.compareTo(durationField64)) == -Math.signum(durationField64.compareTo(durationField37)));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType2.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.hourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology9);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(chronology9);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, 2, chronology9);
        org.joda.time.DateTimeField dateTimeField17 = chronology9.year();
        org.joda.time.Chronology chronology18 = chronology9.withUTC();
        org.joda.time.DurationField durationField19 = chronology18.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField19, and durationField11", !(durationField11.compareTo(durationField19) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField19.compareTo(durationField11))));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology7.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.clockhourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology7);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField17 = chronology7.year();
        org.joda.time.DurationField durationField18 = chronology7.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField18, and durationField9", !(durationField9.compareTo(durationField18) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField18.compareTo(durationField9))));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMinutes(35);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.Instant instant12 = instant8.withDurationAdded((long) (byte) 100, (int) (short) 1);
        org.joda.time.DateTime dateTime13 = instant12.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = dateTime13.withYearOfEra(26719339);
        int int17 = property5.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime13", (instant12.compareTo(dateTime13) == 0) == instant12.equals(dateTime13));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(2022);
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfSecond();
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTimeISO();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        int[] intArray27 = chronology19.get((org.joda.time.ReadablePartial) timeOfDay22, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, chronology19);
        org.joda.time.DurationField durationField29 = chronology19.weeks();
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property32 = localTime31.hourOfDay();
        org.joda.time.LocalTime localTime33 = property32.roundFloorCopy();
        org.joda.time.LocalTime localTime35 = property32.setCopy(0);
        org.joda.time.LocalTime localTime37 = property32.addWrapFieldToCopy(7);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray41 = timeOfDay40.getValues();
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay44.minusMinutes((int) '4');
        int int50 = timeOfDay40.compareTo((org.joda.time.ReadablePartial) timeOfDay44);
        org.joda.time.DateTimeField[] dateTimeFieldArray51 = timeOfDay44.getFields();
        int[] intArray52 = timeOfDay44.getValues();
        chronology19.validate((org.joda.time.ReadablePartial) localTime37, intArray52);
        org.joda.time.DurationField durationField54 = chronology19.days();
        org.joda.time.LocalTime localTime55 = org.joda.time.LocalTime.now(chronology19);
        org.joda.time.DurationField durationField56 = chronology19.minutes();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(chronology19);
        int int58 = dateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.DateTime dateTime60 = dateTime11.plusSeconds(121);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withMillis((long) (-46800000));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(30);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime13.toDateTime(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime16", (dateTime3.compareTo(mutableDateTime16) == 0) == dateTime3.equals(mutableDateTime16));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType15.getField(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime14, chronology22);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.minuteOfDay();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime31.withDurationAdded(readableDuration32, (int) (byte) 0);
        org.joda.time.DateTime dateTime36 = dateTime31.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMinutes((int) (byte) 10);
        int int39 = dateTime38.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime40 = dateTime38.toDateTimeISO();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean47 = interval43.abuts((org.joda.time.ReadableInterval) interval46);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Interval interval49 = interval46.withDurationBeforeEnd(readableDuration48);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean56 = interval52.abuts((org.joda.time.ReadableInterval) interval55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.Interval interval58 = interval55.withDurationBeforeEnd(readableDuration57);
        org.joda.time.Interval interval61 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean65 = interval61.abuts((org.joda.time.ReadableInterval) interval64);
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.Interval interval67 = interval64.withDurationBeforeEnd(readableDuration66);
        org.joda.time.Period period68 = interval64.toPeriod();
        org.joda.time.Interval interval69 = interval55.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Interval interval70 = interval46.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateTime dateTime71 = dateTime38.plus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime26, (org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone76);
        org.joda.time.DateMidnight dateMidnight79 = dateMidnight77.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight77.withWeekyear(2);
        org.joda.time.DateMidnight.Property property82 = dateMidnight77.weekOfWeekyear();
        java.util.Locale locale83 = java.util.Locale.CHINESE;
        java.lang.String str84 = property82.getAsShortText(locale83);
        java.lang.String str85 = dateTimeZone73.getShortName((long) 9, locale83);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime(dateTimeZone73);
        int int87 = dateTime86.getMinuteOfHour();
        org.joda.time.DateTime dateTime89 = dateTime86.plusMillis(26702077);
        mutableDateTime26.setTime((org.joda.time.ReadableInstant) dateTime86);
        mutableDateTime26.addHours(60);
        mutableDateTime26.addMillis((-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime86", (dateTime3.compareTo(dateTime86) == 0) == dateTime3.equals(dateTime86));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusWeeks((int) (short) 100);
        int int9 = dateMidnight6.getCenturyOfEra();
        int int10 = dateMidnight6.getMinuteOfHour();
        int int11 = dateMidnight6.getEra();
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded(readableDuration16, (int) (byte) 0);
        org.joda.time.DateTime dateTime20 = dateTime15.minusSeconds((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime15.toMutableDateTime();
        org.joda.time.Chronology chronology22 = mutableDateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DateTime dateTime24 = dateMidnight6.toDateTime(chronology22);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(2L, chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and dateTime24", (dateMidnight3.compareTo(dateTime24) == 0) == dateMidnight3.equals(dateTime24));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.Instant instant4 = instant1.minus(259200000L);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight7.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusWeeks(0);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis((long) (byte) 100);
        org.joda.time.Instant instant17 = instant14.toInstant();
        org.joda.time.DateTime dateTime18 = instant17.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.minusMinutes((-292275054));
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMinuteOfHour(2);
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean32 = interval28.abuts((org.joda.time.ReadableInterval) interval31);
        long long33 = interval31.getStartMillis();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean40 = interval36.abuts((org.joda.time.ReadableInterval) interval39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Interval interval42 = interval39.withDurationBeforeEnd(readableDuration41);
        org.joda.time.Interval interval43 = interval31.overlap((org.joda.time.ReadableInterval) interval39);
        org.joda.time.Duration duration44 = interval39.toDuration();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime25.withDurationAdded((org.joda.time.ReadableDuration) duration44, 112);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusYears((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime.Property property51 = localDateTime47.property(dateTimeFieldType50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime47.withMillisOfDay((int) '#');
        org.joda.time.Interval interval56 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean60 = interval56.abuts((org.joda.time.ReadableInterval) interval59);
        long long61 = interval59.getStartMillis();
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval67 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean68 = interval64.abuts((org.joda.time.ReadableInterval) interval67);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.Interval interval70 = interval67.withDurationBeforeEnd(readableDuration69);
        org.joda.time.Interval interval71 = interval59.overlap((org.joda.time.ReadableInterval) interval67);
        org.joda.time.Duration duration72 = interval67.toDuration();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime47.withDurationAdded((org.joda.time.ReadableDuration) duration72, 25);
        boolean boolean75 = duration44.isLongerThan((org.joda.time.ReadableDuration) duration72);
        org.joda.time.Instant instant76 = instant17.minus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight13.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Instant instant79 = instant4.withDurationAdded((org.joda.time.ReadableDuration) duration44, 2023);
        org.joda.time.Instant instant82 = instant4.withDurationAdded((long) 176, (int) (short) 1);
        org.joda.time.Chronology chronology83 = instant4.getChronology();
        org.joda.time.DateMidnight dateMidnight84 = new org.joda.time.DateMidnight(chronology83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear(69);
        org.joda.time.DateTime dateTime16 = dateTime12.plusMinutes(9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime10", (dateTime3.compareTo(mutableDateTime10) == 0) == dateTime3.equals(mutableDateTime10));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTime dateTime9 = instant6.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks(2022);
        org.joda.time.DateTime dateTime13 = dateTime11.plus(2L);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMinutes(59);
        int int16 = dateTime15.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean27 = dateMidnight24.isSupported(dateTimeFieldType26);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfHalfday();
        org.joda.time.DurationField durationField38 = chronology36.eras();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType29.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.hourOfDay();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) 22, chronology36);
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType26.getField(chronology36);
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(chronology36);
        org.joda.time.Chronology chronology44 = chronology36.withUTC();
        org.joda.time.DateTime dateTime45 = dateTime15.toDateTime(chronology36);
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(1645511099224L, chronology36, locale46, (java.lang.Integer) 121);
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.fromMillisOfDay(16136630092819045L, chronology36);
        org.joda.time.DateTimeField dateTimeField50 = chronology36.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField51 = chronology36.minuteOfDay();
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("2022-02-22T07:27:01.386Z");
        java.lang.String str55 = dateTimeField51.getAsText(1034184430944000L, locale54);
        int int56 = dateTimeField51.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime9", (instant6.compareTo(dateTime9) == 0) == instant6.equals(dateTime9));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        int int11 = dateTime10.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime10.plusDays(1);
        org.joda.time.DateTime dateTime14 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property15 = dateTime14.year();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillis((long) 19);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = instant19.toMutableDateTimeISO();
        org.joda.time.Instant instant23 = instant19.withMillis((long) 292278993);
        org.joda.time.MutableDateTime mutableDateTime24 = instant23.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean26 = mutableDateTime24.isSupported(dateTimeFieldType25);
        int int27 = dateTime14.get(dateTimeFieldType25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime21", (instant1.compareTo(mutableDateTime21) == 0) == instant1.equals(mutableDateTime21));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTime();
        mutableDateTime4.setDate(688343132317454L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime3", (instant0.compareTo(mutableDateTime3) == 0) == instant0.equals(mutableDateTime3));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        int int7 = dateTime6.getMillisOfDay();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded(readableDuration12, (int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime11.minusSeconds((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) dateTime16, dateTimeZone17);
        int int21 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = dateTime20.withMillisOfSecond(493);
        org.joda.time.DateTime.Property property24 = dateTime20.centuryOfEra();
        org.joda.time.DateTime dateTime25 = dateTime20.toDateTimeISO();
        org.joda.time.DateTime dateTime27 = dateTime25.withMillis((long) 26749467);
        org.joda.time.DateTime dateTime29 = dateTime27.minusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime31 = dateTime29.withYearOfEra(23782);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime18", (dateTime3.compareTo(mutableDateTime18) == 0) == dateTime3.equals(mutableDateTime18));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime4.dayOfMonth();
        mutableDateTime4.setMinuteOfDay(1);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay((java.lang.Object) mutableDateTime4);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean27 = interval26.isBeforeNow();
        org.joda.time.Period period28 = interval26.toPeriod();
        java.lang.String str29 = period28.toString();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay23.withPeriodAdded((org.joda.time.ReadablePeriod) period28, 1969);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight34.withDurationAdded((long) 2, 100);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean44 = interval40.abuts((org.joda.time.ReadableInterval) interval43);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Interval interval46 = interval43.withDurationBeforeEnd(readableDuration45);
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean53 = interval49.abuts((org.joda.time.ReadableInterval) interval52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Interval interval55 = interval52.withDurationBeforeEnd(readableDuration54);
        org.joda.time.Period period56 = interval52.toPeriod();
        org.joda.time.Interval interval57 = interval43.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period56);
        java.util.Locale.Builder builder58 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder61 = builder58.setExtension('x', "zh");
        boolean boolean62 = period56.equals((java.lang.Object) builder58);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight34.withPeriodAdded((org.joda.time.ReadablePeriod) period56, 2022);
        org.joda.time.TimeOfDay timeOfDay66 = timeOfDay31.withPeriodAdded((org.joda.time.ReadablePeriod) period56, (-46800000));
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone68);
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight69.withWeekyear(2);
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period56, (org.joda.time.ReadableInstant) dateMidnight71);
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.Interval interval74 = interval72.withDurationAfterStart(readableDuration73);
        org.joda.time.Instant instant75 = new org.joda.time.Instant();
        org.joda.time.Instant instant77 = instant75.withMillis((long) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime78 = instant77.toMutableDateTime();
        org.joda.time.Instant instant80 = instant77.plus(5183940000L);
        org.joda.time.Interval interval81 = interval74.withEnd((org.joda.time.ReadableInstant) instant80);
        org.joda.time.Interval interval82 = interval74.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant77 and mutableDateTime78", (instant77.compareTo(mutableDateTime78) == 0) == instant77.equals(mutableDateTime78));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = localDate0.minusMonths((int) '#');
        int int9 = localDate8.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight13 = org.joda.time.DateMidnight.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean17 = localDate15.isSupported(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = localDate15.toDateMidnight(dateTimeZone18);
        int int20 = dateMidnight19.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean22 = dateMidnight19.isSupported(dateTimeFieldType21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight19.minusMonths(1969);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withDurationAdded(readableDuration29, (int) (byte) 0);
        org.joda.time.DateTime dateTime33 = dateTime28.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime35 = dateTime33.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime37 = dateTime33.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property38 = dateTime33.hourOfDay();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean41 = localDate39.isSupported(dateTimeFieldType40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = localDate39.toDateMidnight(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = localDate39.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property45 = localDate39.yearOfEra();
        org.joda.time.LocalDate localDate47 = localDate39.minusMonths((int) '#');
        int int48 = localDate47.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone50 = dateMidnight49.getZone();
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtStartOfDay(dateTimeZone50);
        boolean boolean52 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str57 = dateTimeZone56.toString();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(0L, dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime33.withZoneRetainFields(dateTimeZone56);
        java.lang.String str60 = dateTimeZone56.getID();
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight19.withZoneRetainFields(dateTimeZone56);
        long long64 = dateTimeZone11.getMillisKeepLocal(dateTimeZone56, 1555200000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and dateTime28", (mutableDateTime14.compareTo(dateTime28) == 0) == mutableDateTime14.equals(dateTime28));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(0L);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusMonths((int) (short) -1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean6 = localDate4.isSupported(dateTimeFieldType5);
        int int7 = yearMonthDay1.indexOf(dateTimeFieldType5);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.joda.time.DateTime dateTime11 = yearMonthDay1.toDateTimeAtCurrentTime(dateTimeZone10);
        int int12 = yearMonthDay1.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay1.plusDays(240);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight15.getZone();
        org.joda.time.DateMidnight.Property property17 = dateMidnight15.era();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight15.withYearOfEra(17);
        org.joda.time.DateMidnight.Property property20 = dateMidnight15.weekyear();
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = instant22.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone25 = instant22.getZone();
        long long27 = dateTimeZone25.convertUTCToLocal(365L);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight15.withZoneRetainFields(dateTimeZone25);
        org.joda.time.Instant instant29 = dateMidnight28.toInstant();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean32 = localDate30.isSupported(dateTimeFieldType31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = localDate30.toDateMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDate30.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property36 = localDate30.yearOfEra();
        org.joda.time.LocalDate localDate38 = localDate30.minusMonths((int) '#');
        int int39 = localDate38.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone41 = dateMidnight40.getZone();
        org.joda.time.DateTime dateTime42 = localDate38.toDateTimeAtStartOfDay(dateTimeZone41);
        long long44 = dateTimeZone41.previousTransition((long) 9);
        java.lang.String str46 = dateTimeZone41.getNameKey((long) 7327559);
        boolean boolean48 = dateTimeZone41.isStandardOffset(982L);
        long long52 = dateTimeZone41.convertLocalToUTC((-61851081600000L), true, (-4327316724217437000L));
        org.joda.time.MutableDateTime mutableDateTime53 = dateMidnight28.toMutableDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime54 = yearMonthDay14.toDateTimeAtCurrentTime(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime24", (instant9.compareTo(mutableDateTime24) == 0) == instant9.equals(mutableDateTime24));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DurationField durationField11 = chronology6.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField11, and durationField8", !(durationField8.compareTo(durationField11) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField11.compareTo(durationField8))));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.monthOfYear();
        mutableDateTime4.setWeekyear(24654035);
        java.util.Date date8 = mutableDateTime4.toDate();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.DateTime dateTime18 = instant15.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.plusWeeks(2022);
        org.joda.time.DateTime dateTime22 = dateTime20.plus(2L);
        org.joda.time.DateTime dateTime24 = dateTime20.plusMinutes(59);
        int int25 = dateTime24.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property34 = dateMidnight33.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean36 = dateMidnight33.isSupported(dateTimeFieldType35);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.clockhourOfHalfday();
        org.joda.time.DurationField durationField47 = chronology45.eras();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType38.getField(chronology45);
        org.joda.time.DateTimeField dateTimeField49 = chronology45.hourOfDay();
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) 22, chronology45);
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType35.getField(chronology45);
        org.joda.time.DateMidnight dateMidnight52 = org.joda.time.DateMidnight.now(chronology45);
        org.joda.time.Chronology chronology53 = chronology45.withUTC();
        org.joda.time.DateTime dateTime54 = dateTime24.toDateTime(chronology45);
        java.util.Locale locale55 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket(1645511099224L, chronology45, locale55, (java.lang.Integer) 121);
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.fromMillisOfDay(16136630092819045L, chronology45);
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime((java.lang.Object) date8, chronology45);
        org.joda.time.DateTimeField dateTimeField60 = chronology45.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime18", (instant2.compareTo(dateTime18) == 0) == instant2.equals(dateTime18));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType15.getField(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime14, chronology22);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.minuteOfDay();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime31.withDurationAdded(readableDuration32, (int) (byte) 0);
        org.joda.time.DateTime dateTime36 = dateTime31.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMinutes((int) (byte) 10);
        int int39 = dateTime38.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime40 = dateTime38.toDateTimeISO();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean47 = interval43.abuts((org.joda.time.ReadableInterval) interval46);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Interval interval49 = interval46.withDurationBeforeEnd(readableDuration48);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean56 = interval52.abuts((org.joda.time.ReadableInterval) interval55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.Interval interval58 = interval55.withDurationBeforeEnd(readableDuration57);
        org.joda.time.Interval interval61 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean65 = interval61.abuts((org.joda.time.ReadableInterval) interval64);
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.Interval interval67 = interval64.withDurationBeforeEnd(readableDuration66);
        org.joda.time.Period period68 = interval64.toPeriod();
        org.joda.time.Interval interval69 = interval55.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Interval interval70 = interval46.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateTime dateTime71 = dateTime38.plus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime26, (org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone76);
        org.joda.time.DateMidnight dateMidnight79 = dateMidnight77.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight77.withWeekyear(2);
        org.joda.time.DateMidnight.Property property82 = dateMidnight77.weekOfWeekyear();
        java.util.Locale locale83 = java.util.Locale.CHINESE;
        java.lang.String str84 = property82.getAsShortText(locale83);
        java.lang.String str85 = dateTimeZone73.getShortName((long) 9, locale83);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime(dateTimeZone73);
        int int87 = dateTime86.getMinuteOfHour();
        org.joda.time.DateTime dateTime89 = dateTime86.plusMillis(26702077);
        mutableDateTime26.setTime((org.joda.time.ReadableInstant) dateTime86);
        mutableDateTime26.addHours(60);
        mutableDateTime26.addMonths((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime86", (dateTime3.compareTo(dateTime86) == 0) == dateTime3.equals(dateTime86));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime3.minus(readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.plus(readableDuration11);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMonths((-1645515250));
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight15.getZone();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime14.withZone(dateTimeZone16);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime17", (dateTime3.compareTo(dateTime17) == 0) == dateTime3.equals(dateTime17));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (byte) 100);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMinutes((-292275054));
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMinuteOfHour(2);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean18 = interval14.abuts((org.joda.time.ReadableInterval) interval17);
        long long19 = interval17.getStartMillis();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean26 = interval22.abuts((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Interval interval28 = interval25.withDurationBeforeEnd(readableDuration27);
        org.joda.time.Interval interval29 = interval17.overlap((org.joda.time.ReadableInterval) interval25);
        org.joda.time.Duration duration30 = interval25.toDuration();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime11.withDurationAdded((org.joda.time.ReadableDuration) duration30, 112);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusYears((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime.Property property37 = localDateTime33.property(dateTimeFieldType36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.withMillisOfDay((int) '#');
        org.joda.time.Interval interval42 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval45 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean46 = interval42.abuts((org.joda.time.ReadableInterval) interval45);
        long long47 = interval45.getStartMillis();
        org.joda.time.Interval interval50 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval53 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean54 = interval50.abuts((org.joda.time.ReadableInterval) interval53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.Interval interval56 = interval53.withDurationBeforeEnd(readableDuration55);
        org.joda.time.Interval interval57 = interval45.overlap((org.joda.time.ReadableInterval) interval53);
        org.joda.time.Duration duration58 = interval53.toDuration();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime33.withDurationAdded((org.joda.time.ReadableDuration) duration58, 25);
        boolean boolean61 = duration30.isLongerThan((org.joda.time.ReadableDuration) duration58);
        org.joda.time.Instant instant62 = instant3.minus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Instant instant65 = instant62.withDurationAdded((long) (-1645515300), (int) (byte) 10);
        org.joda.time.Instant instant66 = instant62.toInstant();
        org.joda.time.Instant instant68 = instant62.withMillis(31449600575L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant62 and dateTime4", (instant62.compareTo(dateTime4) == 0) == instant62.equals(dateTime4));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        org.joda.time.DurationField durationField35 = chronology23.seconds();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology23);
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = dateTime42.toString(dateTimeFormatter43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        org.joda.time.Chronology chronology52 = instant50.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.clockhourOfHalfday();
        org.joda.time.DurationField durationField54 = chronology52.eras();
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType45.getField(chronology52);
        org.joda.time.DateTimeField dateTimeField56 = chronology52.hourOfDay();
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(chronology52);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone59);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight60.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property66 = dateMidnight65.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean68 = dateMidnight65.isSupported(dateTimeFieldType67);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay73 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant75 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime76 = timeOfDay73.toDateTime((org.joda.time.ReadableInstant) instant75);
        org.joda.time.Chronology chronology77 = instant75.getChronology();
        org.joda.time.DateTimeField dateTimeField78 = chronology77.clockhourOfHalfday();
        org.joda.time.DurationField durationField79 = chronology77.eras();
        org.joda.time.DateTimeField dateTimeField80 = dateTimeFieldType70.getField(chronology77);
        org.joda.time.DateTimeField dateTimeField81 = chronology77.hourOfDay();
        org.joda.time.LocalTime localTime82 = new org.joda.time.LocalTime((long) 22, chronology77);
        org.joda.time.DateTimeField dateTimeField83 = dateTimeFieldType67.getField(chronology77);
        int int84 = localTime57.indexOf(dateTimeFieldType67);
        org.joda.time.DateTime.Property property85 = dateTime42.property(dateTimeFieldType67);
        org.joda.time.DurationFieldType durationFieldType86 = dateTimeFieldType67.getDurationType();
        org.joda.time.DurationFieldType durationFieldType87 = dateTimeFieldType67.getDurationType();
        java.lang.String str88 = dateTimeFieldType67.toString();
        org.joda.time.DateTime dateTime90 = dateTime36.withField(dateTimeFieldType67, 26942);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField54", Math.signum(durationField35.compareTo(durationField54)) == -Math.signum(durationField54.compareTo(durationField35)));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(2022);
        org.joda.time.DateTime dateTime11 = dateTime9.plus(2L);
        org.joda.time.DateTime dateTime13 = dateTime9.plusMinutes(59);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTimeISO();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean21 = interval17.abuts((org.joda.time.ReadableInterval) interval20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Interval interval23 = interval20.withDurationBeforeEnd(readableDuration22);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean30 = interval26.abuts((org.joda.time.ReadableInterval) interval29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Interval interval32 = interval29.withDurationBeforeEnd(readableDuration31);
        org.joda.time.Period period33 = interval29.toPeriod();
        org.joda.time.Interval interval34 = interval20.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period35 = interval34.toPeriod();
        org.joda.time.DateTime dateTime36 = dateTime14.minus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Chronology chronology44 = instant42.getChronology();
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTime((org.joda.time.ReadableInstant) instant49);
        int[] intArray52 = chronology44.get((org.joda.time.ReadablePartial) timeOfDay47, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(0L, chronology44);
        int int54 = mutableDateTime53.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime53.property(dateTimeFieldType55);
        org.joda.time.MutableDateTime mutableDateTime57 = property56.roundHalfEven();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.yearOfEra();
        java.lang.Object obj59 = mutableDateTime57.clone();
        mutableDateTime57.setMillis((long) 2922730);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.minuteOfHour();
        int int63 = dateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
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
        org.joda.time.Instant instant33 = mutableDateTime16.toInstant();
        org.joda.time.DateTime dateTime34 = instant33.toDateTime();
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(35);
        org.joda.time.DateTime.Property property37 = dateTime36.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField38 = property37.getField();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight41.withWeekyear(2);
        org.joda.time.DateMidnight.Property property46 = dateMidnight41.weekOfWeekyear();
        java.lang.String str47 = property46.getAsString();
        java.util.Locale locale48 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str49 = property46.getAsShortText(locale48);
        long long50 = property46.remainder();
        org.joda.time.DateMidnight dateMidnight51 = property46.roundHalfEvenCopy();
        long long52 = property37.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime34", (mutableDateTime16.compareTo(dateTime34) == 0) == mutableDateTime16.equals(dateTime34));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        int int7 = dateTime6.getMillisOfDay();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded(readableDuration12, (int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime11.minusSeconds((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) dateTime16, dateTimeZone17);
        int int21 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = dateTime20.withMillisOfSecond(493);
        org.joda.time.DateTime dateTime25 = dateTime20.withMinuteOfHour((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime18", (dateTime3.compareTo(mutableDateTime18) == 0) == dateTime3.equals(mutableDateTime18));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 511589);
        org.joda.time.Instant instant3 = instant1.minus((-36000000L));
        org.joda.time.Instant instant5 = instant3.plus(60000L);
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTime();
        org.joda.time.Instant instant7 = instant5.toInstant();
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.LocalDate localDate9 = dateTime8.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime6", (instant5.compareTo(mutableDateTime6) == 0) == instant5.equals(mutableDateTime6));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths(70);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean18 = interval14.abuts((org.joda.time.ReadableInterval) interval17);
        long long19 = interval17.getStartMillis();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean26 = interval22.abuts((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Interval interval28 = interval25.withDurationBeforeEnd(readableDuration27);
        org.joda.time.Interval interval29 = interval17.overlap((org.joda.time.ReadableInterval) interval25);
        org.joda.time.Duration duration30 = interval25.toDuration();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight11.withDurationAdded((org.joda.time.ReadableDuration) duration30, 0);
        org.joda.time.Instant instant33 = instant0.minus((org.joda.time.ReadableDuration) duration30);
        long long34 = duration30.getMillis();
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.Instant instant37 = instant35.withMillis((long) (byte) 100);
        org.joda.time.Instant instant38 = instant35.toInstant();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusYears((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime.Property property43 = localDateTime39.property(dateTimeFieldType42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.withMillisOfDay((int) '#');
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean52 = interval48.abuts((org.joda.time.ReadableInterval) interval51);
        long long53 = interval51.getStartMillis();
        org.joda.time.Interval interval56 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean60 = interval56.abuts((org.joda.time.ReadableInterval) interval59);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Interval interval62 = interval59.withDurationBeforeEnd(readableDuration61);
        org.joda.time.Interval interval63 = interval51.overlap((org.joda.time.ReadableInterval) interval59);
        org.joda.time.Duration duration64 = interval59.toDuration();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime39.withDurationAdded((org.joda.time.ReadableDuration) duration64, 25);
        org.joda.time.Instant instant67 = instant35.plus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.minusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.minusMinutes((-292275054));
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.withMinuteOfHour(2);
        org.joda.time.Interval interval77 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean81 = interval77.abuts((org.joda.time.ReadableInterval) interval80);
        long long82 = interval80.getStartMillis();
        org.joda.time.Interval interval85 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval88 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean89 = interval85.abuts((org.joda.time.ReadableInterval) interval88);
        org.joda.time.ReadableDuration readableDuration90 = null;
        org.joda.time.Interval interval91 = interval88.withDurationBeforeEnd(readableDuration90);
        org.joda.time.Interval interval92 = interval80.overlap((org.joda.time.ReadableInterval) interval88);
        org.joda.time.Duration duration93 = interval88.toDuration();
        org.joda.time.LocalDateTime localDateTime95 = localDateTime74.withDurationAdded((org.joda.time.ReadableDuration) duration93, 112);
        boolean boolean96 = duration64.isShorterThan((org.joda.time.ReadableDuration) duration93);
        long long97 = duration64.getMillis();
        boolean boolean98 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded(readableDuration5, (int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.minusSeconds((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) dateTime9, dateTimeZone10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 7361852, dateTimeZone10);
        int int16 = dateTimeZone10.getStandardOffset(2L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime11", (dateTime4.compareTo(mutableDateTime11) == 0) == dateTime4.equals(mutableDateTime11));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, (int) (short) 1);
        long long9 = dateTime8.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str13 = dateTimeZone12.toString();
        long long17 = dateTimeZone12.convertLocalToUTC((long) 10, false, (long) 0);
        org.joda.time.DateTime dateTime18 = dateTime8.toDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime18", (dateTime5.compareTo(dateTime18) == 0) == dateTime5.equals(dateTime18));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology7.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.clockhourOfDay();
        long long16 = chronology7.add((long) (-1), (-1L), (int) '4');
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 9, chronology7);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean24 = interval20.abuts((org.joda.time.ReadableInterval) interval23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Interval interval26 = interval23.withDurationBeforeEnd(readableDuration25);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean33 = interval29.abuts((org.joda.time.ReadableInterval) interval32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Interval interval35 = interval32.withDurationBeforeEnd(readableDuration34);
        org.joda.time.Period period36 = interval32.toPeriod();
        org.joda.time.Interval interval37 = interval23.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period36);
        int[] intArray39 = chronology7.get((org.joda.time.ReadablePeriod) period36, (long) 748);
        org.joda.time.DurationField durationField40 = chronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField40, and durationField9", !(durationField9.compareTo(durationField40) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField40.compareTo(durationField9))));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        int int39 = calendar38.getWeekYear();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property43 = timeOfDay42.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property43.getFieldType();
        org.joda.time.DurationField durationField45 = property43.getDurationField();
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(dateTimeZone48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime52 = dateTime49.withDurationAdded(readableDuration50, (int) (byte) 0);
        org.joda.time.DateTime dateTime54 = dateTime49.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime56 = dateTime54.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime58 = dateTime56.plusDays(2);
        org.joda.time.DateTime dateTime60 = dateTime56.withHourOfDay(22);
        int int61 = property43.compareTo((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean62 = calendar38.after((java.lang.Object) int61);
        java.util.Date date63 = calendar38.getTime();
        org.joda.time.TimeOfDay timeOfDay64 = org.joda.time.TimeOfDay.fromCalendarFields(calendar38);
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        org.joda.time.Chronology chronology72 = instant70.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.clockhourOfHalfday();
        org.joda.time.DurationField durationField74 = chronology72.eras();
        org.joda.time.DateTimeField dateTimeField75 = chronology72.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone76 = chronology72.getZone();
        org.joda.time.DateTimeField dateTimeField77 = chronology72.clockhourOfDay();
        long long81 = chronology72.add((long) (-1), (-1L), (int) '4');
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime((long) 9, chronology72);
        org.joda.time.TimeOfDay timeOfDay83 = new org.joda.time.TimeOfDay(chronology72);
        boolean boolean84 = calendar38.before((java.lang.Object) chronology72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField45 and durationField74", Math.signum(durationField45.compareTo(durationField74)) == -Math.signum(durationField74.compareTo(durationField45)));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean11 = dateMidnight8.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType13.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.hourOfDay();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 22, chronology20);
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType10.getField(chronology20);
        org.joda.time.DateMidnight dateMidnight27 = org.joda.time.DateMidnight.now(chronology20);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.minuteOfDay();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str35 = property33.getAsShortText(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((-2678399900L), chronology20, locale34, (java.lang.Integer) 0);
        long long41 = chronology20.add((long) 2, (long) 4, 70);
        org.joda.time.DateTimeField dateTimeField42 = chronology20.hourOfHalfday();
        org.joda.time.DurationField durationField43 = chronology20.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField43, and durationField22", !(durationField22.compareTo(durationField43) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField43.compareTo(durationField22))));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight37.withDurationAdded((long) (short) 10, 1);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateMidnight40);
        mutableDateTime16.setMinuteOfHour(0);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime16.era();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime16.weekOfWeekyear();
        mutableDateTime16.setWeekOfWeekyear(30);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.DateTime dateTime51 = mutableDateTime16.toDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusMonths((-292275054));
        org.joda.time.DateTime dateTime55 = dateTime53.plusSeconds((-1645515509));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime51", (mutableDateTime16.compareTo(dateTime51) == 0) == mutableDateTime16.equals(dateTime51));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.era();
        org.joda.time.DurationField durationField14 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology6.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology6.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField16, and durationField8", !(durationField8.compareTo(durationField16) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField16.compareTo(durationField8))));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTime dateTime7 = instant4.toDateTimeISO();
        org.joda.time.DateTime dateTime8 = instant4.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes(35);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMillis((int) (byte) 0);
        boolean boolean12 = dateTime11.isEqualNow();
        org.joda.time.DateTime dateTime14 = dateTime11.plusWeeks(36000000);
        org.joda.time.DateTime dateTime16 = dateTime11.plusDays(2008);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean27 = dateMidnight24.isSupported(dateTimeFieldType26);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfHalfday();
        org.joda.time.DurationField durationField38 = chronology36.eras();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType29.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.hourOfDay();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) 22, chronology36);
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType26.getField(chronology36);
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(chronology36);
        org.joda.time.Chronology chronology44 = chronology36.withUTC();
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((java.lang.Object) dateTime11, chronology36);
        org.joda.time.DateTimeField dateTimeField46 = chronology36.monthOfYear();
        org.joda.time.DurationField durationField47 = dateTimeField46.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField47, and durationField38", !(durationField38.compareTo(durationField47) == 0) || (Math.signum(durationField38.compareTo(durationField38)) == Math.signum(durationField47.compareTo(durationField38))));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(0L);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusMonths((int) (short) -1);
        org.joda.time.YearMonthDay.Property property4 = yearMonthDay3.monthOfYear();
        int int5 = property4.get();
        org.joda.time.YearMonthDay yearMonthDay6 = property4.withMinimumValue();
        org.joda.time.Instant instant8 = org.joda.time.Instant.parse("11");
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        int int10 = property4.compareTo((org.joda.time.ReadableInstant) instant8);
        org.joda.time.YearMonthDay yearMonthDay11 = property4.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField12 = property4.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime9", (instant8.compareTo(dateTime9) == 0) == instant8.equals(dateTime9));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType2.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.hourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology9);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(chronology9);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, 2, chronology9);
        org.joda.time.DateTimeField dateTimeField17 = chronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.era();
        org.joda.time.DurationField durationField19 = chronology9.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField19, and durationField11", !(durationField11.compareTo(durationField19) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField19.compareTo(durationField11))));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfMonth();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.clockhourOfHalfday();
        long long24 = dateTimeField22.roundHalfFloor(0L);
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        int int26 = dateTimeField22.getMaximumShortTextLength(locale25);
        java.lang.String str27 = locale25.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology14, locale25);
        java.util.Locale locale29 = dateTimeParserBucket28.getLocale();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        int[] intArray44 = chronology36.get((org.joda.time.ReadablePartial) timeOfDay39, (long) (short) -1);
        boolean boolean45 = dateTimeParserBucket28.restoreState((java.lang.Object) (short) -1);
        java.util.Locale locale46 = dateTimeParserBucket28.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(9L, chronology8, locale46, (java.lang.Integer) 11, 365);
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay((long) (short) -1, chronology8);
        org.joda.time.DurationField durationField51 = chronology8.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField51, and durationField10", !(durationField10.compareTo(durationField51) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField51.compareTo(durationField10))));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.year();
        org.joda.time.DurationField durationField8 = chronology6.years();
        org.joda.time.DurationField durationField9 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        mutableDateTime20.addWeekyears(70);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime20.millisOfSecond();
        org.joda.time.DurationField durationField24 = property23.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.roundCeiling();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.clockhourOfHalfday();
        org.joda.time.DurationField durationField36 = chronology34.eras();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = chronology34.getZone();
        org.joda.time.DateTimeField dateTimeField39 = chronology34.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = chronology34.clockhourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology34);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property45 = timeOfDay44.minuteOfHour();
        java.lang.String str46 = property45.getAsShortText();
        org.joda.time.DateTimeField dateTimeField47 = property45.getField();
        org.joda.time.TimeOfDay timeOfDay49 = property45.addNoWrapToCopy(100);
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        int int51 = property45.getMaximumTextLength(locale50);
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        java.lang.String str53 = locale50.getDisplayName(locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((-86700000L), chronology34, locale52, (java.lang.Integer) 17);
        mutableDateTime25.setChronology(chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField36", Math.signum(durationField24.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField24)));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 3);
        java.util.Calendar.Builder builder6 = builder0.setWeekDate((int) 'a', 30, (int) 'x');
        java.util.Calendar.Builder builder10 = builder6.setWeekDate(52, 0, 35);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("0493-02-01");
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone12, locale13);
        java.util.Calendar.Builder builder15 = builder6.setTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str19 = dateTimeZone18.toString();
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.clockhourOfHalfday();
        long long30 = dateTimeField28.roundHalfFloor(0L);
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        int int32 = dateTimeField28.getMaximumShortTextLength(locale31);
        java.util.Locale locale33 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale34 = locale33.stripExtensions();
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = locale31.getDisplayLanguage(locale33);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone20, locale31);
        java.util.TimeZone.setDefault(timeZone20);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Chronology chronology48 = instant46.getChronology();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        int[] intArray56 = chronology48.get((org.joda.time.ReadablePartial) timeOfDay51, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, chronology48);
        org.joda.time.TimeOfDay timeOfDay60 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime63 = timeOfDay60.toDateTime((org.joda.time.ReadableInstant) instant62);
        org.joda.time.Chronology chronology64 = instant62.getChronology();
        org.joda.time.TimeOfDay timeOfDay67 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant69 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime70 = timeOfDay67.toDateTime((org.joda.time.ReadableInstant) instant69);
        int[] intArray72 = chronology64.get((org.joda.time.ReadablePartial) timeOfDay67, (long) (short) -1);
        mutableDateTime57.setChronology(chronology64);
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime(chronology64);
        org.joda.time.DateTimeField dateTimeField75 = chronology64.weekOfWeekyear();
        java.util.Locale locale77 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale78 = locale77.stripExtensions();
        java.util.Locale locale79 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale80 = locale79.stripExtensions();
        java.lang.String str81 = locale77.getDisplayName(locale79);
        java.lang.String str82 = dateTimeField75.getAsText(2022, locale77);
        java.util.Calendar calendar83 = java.util.Calendar.getInstance(timeZone20, locale77);
        java.util.TimeZone.setDefault(timeZone20);
        int int86 = timeZone20.getOffset((long) 100);
        java.util.TimeZone timeZone88 = java.util.TimeZone.getTimeZone("clockhourOfHalfday");
        boolean boolean89 = timeZone20.hasSameRules(timeZone88);
        java.util.Locale locale91 = new java.util.Locale("10");
        java.util.Calendar calendar92 = java.util.Calendar.getInstance(timeZone88, locale91);
        java.util.Calendar.Builder builder93 = builder6.setTimeZone(timeZone88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar39", (calendar14.compareTo(calendar39) == 0) == calendar14.equals(calendar39));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean11 = dateMidnight8.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType13.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.hourOfDay();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 22, chronology20);
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType10.getField(chronology20);
        org.joda.time.DateMidnight dateMidnight27 = org.joda.time.DateMidnight.now(chronology20);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.minuteOfDay();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str35 = property33.getAsShortText(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((-2678399900L), chronology20, locale34, (java.lang.Integer) 0);
        long long41 = chronology20.add((long) 2, (long) 4, 70);
        org.joda.time.DateTimeField dateTimeField42 = chronology20.hourOfHalfday();
        boolean boolean43 = dateTimeField42.isSupported();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property47 = timeOfDay46.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        org.joda.time.DurationField durationField49 = property47.getDurationField();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTime((org.joda.time.ReadableInstant) instant55);
        org.joda.time.Chronology chronology57 = instant55.getChronology();
        org.joda.time.TimeOfDay timeOfDay60 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime63 = timeOfDay60.toDateTime((org.joda.time.ReadableInstant) instant62);
        int[] intArray65 = chronology57.get((org.joda.time.ReadablePartial) timeOfDay60, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(0L, chronology57);
        int int67 = mutableDateTime66.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime66.property(dateTimeFieldType68);
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
        java.util.Calendar calendar88 = mutableDateTime66.toCalendar(locale82);
        java.lang.String str89 = property47.getAsShortText(locale82);
        java.lang.String str90 = locale82.getDisplayVariant();
        java.lang.String str91 = locale82.toLanguageTag();
        int int92 = dateTimeField42.getMaximumShortTextLength(locale82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField49", Math.signum(durationField22.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField22)));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        java.lang.Object obj17 = mutableDateTime16.clone();
        int int18 = mutableDateTime16.getMinuteOfHour();
        mutableDateTime16.addMinutes((int) (byte) 10);
        mutableDateTime16.setMillis(0L);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime16.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfEven();
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withDurationAdded(readableDuration29, (int) (byte) 0);
        org.joda.time.DateTime dateTime33 = dateTime28.minusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime37 = localTime35.minusMinutes((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.seconds();
        boolean boolean39 = localTime35.isSupported(durationFieldType38);
        org.joda.time.DateTime dateTime41 = dateTime33.withFieldAdded(durationFieldType38, 0);
        org.joda.time.DateTime.Property property42 = dateTime41.monthOfYear();
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone45 = instant44.getZone();
        org.joda.time.DateTime dateTime46 = dateTime41.withZoneRetainFields(dateTimeZone45);
        org.joda.time.DateTime.Property property47 = dateTime41.millisOfSecond();
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone50 = instant49.getZone();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTime dateTime54 = dateTime51.withDurationAdded(readableDuration52, (int) (byte) 0);
        org.joda.time.DateTime dateTime56 = dateTime51.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTime dateTime58 = dateTime51.minus(readableDuration57);
        org.joda.time.DateTime dateTime60 = dateTime51.plus(0L);
        org.joda.time.LocalTime localTime61 = dateTime51.toLocalTime();
        org.joda.time.Chronology chronology62 = localTime61.getChronology();
        org.joda.time.Chronology chronology63 = chronology62.withUTC();
        org.joda.time.DateTime dateTime64 = dateTime41.withChronology(chronology63);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime24, chronology63);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str69 = dateTimeZone68.toString();
        long long73 = dateTimeZone68.convertLocalToUTC((long) 10, false, (long) 0);
        org.joda.time.DateMidnight dateMidnight74 = org.joda.time.DateMidnight.now(dateTimeZone68);
        mutableDateTime24.setZone(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and dateTime65", (mutableDateTime24.compareTo(dateTime65) == 0) == mutableDateTime24.equals(dateTime65));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(0L);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusMonths((int) (short) -1);
        org.joda.time.YearMonthDay.Property property4 = yearMonthDay3.monthOfYear();
        int int5 = property4.get();
        org.joda.time.YearMonthDay yearMonthDay7 = property4.addWrapFieldToCopy(4);
        org.joda.time.YearMonthDay yearMonthDay9 = property4.addToCopy(12);
        org.joda.time.YearMonthDay yearMonthDay10 = property4.withMaximumValue();
        org.joda.time.Chronology chronology11 = yearMonthDay10.getChronology();
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay10.plusDays(0);
        int[] intArray14 = yearMonthDay10.getValues();
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone17 = instant16.getZone();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded(readableDuration19, (int) (byte) 0);
        org.joda.time.DateTime dateTime23 = dateTime18.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime25 = dateTime23.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime27 = dateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property28 = dateTime23.hourOfDay();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean31 = localDate29.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = localDate29.toDateMidnight(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localDate29.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property35 = localDate29.yearOfEra();
        org.joda.time.LocalDate localDate37 = localDate29.minusMonths((int) '#');
        int int38 = localDate37.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone40 = dateMidnight39.getZone();
        org.joda.time.DateTime dateTime41 = localDate37.toDateTimeAtStartOfDay(dateTimeZone40);
        boolean boolean42 = dateTime23.isEqual((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str47 = dateTimeZone46.toString();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(0L, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime23.withZoneRetainFields(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(dateTimeZone46);
        org.joda.time.DateTime dateTime51 = yearMonthDay10.toDateTimeAtCurrentTime(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime50", (dateTime18.compareTo(dateTime50) == 0) == dateTime18.equals(dateTime50));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        int[] intArray21 = chronology13.get((org.joda.time.ReadablePartial) timeOfDay16, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(0L, chronology13);
        int int23 = mutableDateTime22.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.property(dateTimeFieldType24);
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.clockhourOfHalfday();
        long long35 = dateTimeField33.roundHalfFloor(0L);
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        int int37 = dateTimeField33.getMaximumShortTextLength(locale36);
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale39 = locale38.stripExtensions();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale38.getDisplayName(locale40);
        java.lang.String str43 = locale36.getDisplayLanguage(locale38);
        java.util.Calendar calendar44 = mutableDateTime22.toCalendar(locale38);
        java.lang.String str45 = property3.getAsShortText(locale38);
        int int46 = property3.get();
        org.joda.time.TimeOfDay timeOfDay47 = property3.withMinimumValue();
        java.lang.String str48 = property3.getAsText();
        org.joda.time.TimeOfDay timeOfDay50 = property3.addToCopy(48);
        java.lang.String str51 = property3.getName();
        java.util.Locale.Category category52 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale53 = java.util.Locale.getDefault(category52);
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("Chinesisch (Taiwan)");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) (-1645515250), chronology55, locale57);
        java.util.Locale.setDefault(category52, locale57);
        java.util.Locale locale60 = java.util.Locale.getDefault(category52);
        java.lang.String str61 = property3.getAsShortText(locale60);
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray65 = timeOfDay64.getValues();
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        org.joda.time.TimeOfDay timeOfDay73 = timeOfDay68.minusMinutes((int) '4');
        int int74 = timeOfDay64.compareTo((org.joda.time.ReadablePartial) timeOfDay68);
        org.joda.time.TimeOfDay timeOfDay77 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant79 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime80 = timeOfDay77.toDateTime((org.joda.time.ReadableInstant) instant79);
        org.joda.time.Chronology chronology81 = instant79.getChronology();
        org.joda.time.DateTimeField dateTimeField82 = chronology81.clockhourOfHalfday();
        org.joda.time.DurationField durationField83 = chronology81.eras();
        org.joda.time.TimeOfDay timeOfDay84 = timeOfDay64.withChronologyRetainFields(chronology81);
        org.joda.time.DateTimeField[] dateTimeFieldArray85 = timeOfDay64.getFields();
        org.joda.time.Interval interval88 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean89 = interval88.isBeforeNow();
        org.joda.time.Period period90 = interval88.toPeriod();
        java.lang.String str91 = period90.toString();
        org.joda.time.MutablePeriod mutablePeriod92 = period90.toMutablePeriod();
        org.joda.time.TimeOfDay timeOfDay94 = timeOfDay64.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod92, 0);
        org.joda.time.DateTime dateTime95 = timeOfDay64.toDateTimeToday();
        int int96 = property3.compareTo((org.joda.time.ReadablePartial) timeOfDay64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField83", Math.signum(durationField5.compareTo(durationField83)) == -Math.signum(durationField83.compareTo(durationField5)));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DurationFieldType durationFieldType9 = durationField8.getType();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = dateTime15.toString(dateTimeFormatter16);
        org.joda.time.DateTime dateTime19 = dateTime15.minusYears(2022);
        org.joda.time.DateTime.Property property20 = dateTime15.minuteOfHour();
        org.joda.time.DateTime dateTime21 = property20.withMaximumValue();
        org.joda.time.DateTime dateTime22 = property20.getDateTime();
        org.joda.time.DateTime dateTime24 = property20.addToCopy(19L);
        org.joda.time.DurationField durationField25 = property20.getDurationField();
        int int26 = durationField8.compareTo(durationField25);
        long long29 = durationField25.getDifferenceAsLong(0L, (-21214800000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField25, and durationField8", !(durationField8.compareTo(durationField25) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField25.compareTo(durationField8))));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property21 = localTime20.hourOfDay();
        org.joda.time.LocalTime localTime22 = property21.roundFloorCopy();
        org.joda.time.LocalTime localTime24 = property21.setCopy(0);
        org.joda.time.LocalTime localTime26 = property21.addWrapFieldToCopy(7);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray30 = timeOfDay29.getValues();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay33.minusMinutes((int) '4');
        int int39 = timeOfDay29.compareTo((org.joda.time.ReadablePartial) timeOfDay33);
        org.joda.time.DateTimeField[] dateTimeFieldArray40 = timeOfDay33.getFields();
        int[] intArray41 = timeOfDay33.getValues();
        chronology8.validate((org.joda.time.ReadablePartial) localTime26, intArray41);
        org.joda.time.DurationField durationField43 = chronology8.days();
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(chronology8);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) 26817989, chronology8);
        org.joda.time.DurationField durationField47 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField18, and durationField43", !(durationField47.compareTo(durationField18) == 0) || (Math.signum(durationField47.compareTo(durationField43)) == Math.signum(durationField18.compareTo(durationField43))));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTime dateTime8 = instant5.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.plusWeeks(2022);
        org.joda.time.DateTime dateTime12 = dateTime10.plus(2L);
        org.joda.time.DateTime dateTime14 = dateTime10.plusMinutes(59);
        int int15 = dateTime14.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight18.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean26 = dateMidnight23.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.clockhourOfHalfday();
        org.joda.time.DurationField durationField37 = chronology35.eras();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType28.getField(chronology35);
        org.joda.time.DateTimeField dateTimeField39 = chronology35.hourOfDay();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) 22, chronology35);
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType25.getField(chronology35);
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(chronology35);
        org.joda.time.Chronology chronology43 = chronology35.withUTC();
        org.joda.time.DateTime dateTime44 = dateTime14.toDateTime(chronology35);
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket(1645511099224L, chronology35, locale45, (java.lang.Integer) 121);
        org.joda.time.DateTimeField dateTimeField48 = chronology35.minuteOfDay();
        org.joda.time.DurationField durationField49 = chronology35.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField49, and durationField37", !(durationField37.compareTo(durationField49) == 0) || (Math.signum(durationField37.compareTo(durationField37)) == Math.signum(durationField49.compareTo(durationField37))));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.dayOfMonth();
        int int11 = dateTimeField10.getMaximumValue();
        java.lang.String str12 = dateTimeField10.toString();
        org.joda.time.DurationField durationField13 = dateTimeField10.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField13, and durationField8", !(durationField8.compareTo(durationField13) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField13.compareTo(durationField8))));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight37.withDurationAdded((long) (short) 10, 1);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateMidnight40);
        mutableDateTime16.setMinuteOfHour(0);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime16.era();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime16.weekOfWeekyear();
        mutableDateTime16.setWeekOfWeekyear(30);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.joda.time.DateTime dateTime51 = mutableDateTime16.toDateTime(dateTimeZone50);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone54 = instant53.getZone();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTime dateTime58 = dateTime55.withDurationAdded(readableDuration56, (int) (byte) 0);
        int int59 = dateTime58.getMillisOfDay();
        org.joda.time.Instant instant61 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone62 = instant61.getZone();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(dateTimeZone62);
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.DateTime dateTime66 = dateTime63.withDurationAdded(readableDuration64, (int) (byte) 0);
        org.joda.time.DateTime dateTime68 = dateTime63.minusSeconds((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime70 = org.joda.time.MutableDateTime.now(dateTimeZone69);
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((java.lang.Object) dateTime68, dateTimeZone69);
        int int73 = dateTime58.compareTo((org.joda.time.ReadableInstant) dateTime72);
        boolean boolean74 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime76 = dateTime58.withMillisOfSecond((int) 'u');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime51", (mutableDateTime16.compareTo(dateTime51) == 0) == mutableDateTime16.equals(dateTime51));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DateTimeField dateTimeField27 = chronology19.yearOfCentury();
        org.joda.time.DurationField durationField28 = dateTimeField27.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField28, and durationField21", !(durationField21.compareTo(durationField28) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField28.compareTo(durationField21))));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        int int11 = dateTime10.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTimeISO();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean19 = interval15.abuts((org.joda.time.ReadableInterval) interval18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Interval interval21 = interval18.withDurationBeforeEnd(readableDuration20);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean28 = interval24.abuts((org.joda.time.ReadableInterval) interval27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Interval interval30 = interval27.withDurationBeforeEnd(readableDuration29);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean37 = interval33.abuts((org.joda.time.ReadableInterval) interval36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Interval interval39 = interval36.withDurationBeforeEnd(readableDuration38);
        org.joda.time.Period period40 = interval36.toPeriod();
        org.joda.time.Interval interval41 = interval27.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Interval interval42 = interval18.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period40);
        org.joda.time.DateTime dateTime43 = dateTime10.plus((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone47 = instant46.getZone();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.weekOfWeekyear();
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone52 = instant51.getZone();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime56 = dateTime53.withDurationAdded(readableDuration54, (int) (byte) 0);
        org.joda.time.DateTime dateTime58 = dateTime53.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime60 = dateTime53.minus(readableDuration59);
        org.joda.time.DateTime dateTime62 = dateTime53.minusSeconds((int) (byte) 100);
        int int63 = mutableDateTime48.compareTo((org.joda.time.ReadableInstant) dateTime62);
        mutableDateTime48.addMonths(112);
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        org.joda.time.Chronology chronology72 = instant70.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.clockhourOfHalfday();
        org.joda.time.DurationField durationField74 = chronology72.eras();
        org.joda.time.DateTimeField dateTimeField75 = chronology72.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone76 = chronology72.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone76);
        mutableDateTime48.setZone(dateTimeZone76);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetMillis((-1645515260));
        mutableDateTime48.setZoneRetainFields(dateTimeZone80);
        boolean boolean82 = dateTimeZone80.isFixed();
        org.joda.time.DateTime dateTime83 = dateTime10.withZone(dateTimeZone80);
        org.joda.time.DateTime dateTime85 = dateTime10.minus((long) 1969);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime83", (dateTime10.compareTo(dateTime83) == 0) == dateTime10.equals(dateTime83));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean11 = dateMidnight8.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType13.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.hourOfDay();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 22, chronology20);
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType10.getField(chronology20);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean33 = interval29.abuts((org.joda.time.ReadableInterval) interval32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Interval interval35 = interval32.withDurationBeforeEnd(readableDuration34);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean42 = interval38.abuts((org.joda.time.ReadableInterval) interval41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Interval interval44 = interval41.withDurationBeforeEnd(readableDuration43);
        org.joda.time.Period period45 = interval41.toPeriod();
        org.joda.time.Interval interval46 = interval32.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period45);
        long long49 = chronology20.add((org.joda.time.ReadablePeriod) period45, (long) 363, 20);
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime55 = timeOfDay52.toDateTime((org.joda.time.ReadableInstant) instant54);
        org.joda.time.Chronology chronology56 = instant54.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.clockhourOfHalfday();
        long long59 = dateTimeField57.roundHalfFloor(0L);
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        int int61 = dateTimeField57.getMaximumShortTextLength(locale60);
        java.util.Locale locale62 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale63 = locale62.stripExtensions();
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale65 = locale64.stripExtensions();
        java.lang.String str66 = locale62.getDisplayName(locale64);
        java.lang.String str67 = locale60.getDisplayLanguage(locale62);
        java.lang.String str68 = locale60.toLanguageTag();
        java.util.Set<java.lang.String> strSet69 = locale60.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 428, chronology20, locale60);
        org.joda.time.DurationField durationField71 = chronology20.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField71, and durationField22", !(durationField22.compareTo(durationField71) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField71.compareTo(durationField22))));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology7.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.clockhourOfDay();
        long long16 = chronology7.add((long) (-1), (-1L), (int) '4');
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 9, chronology7);
        org.joda.time.DurationField durationField18 = chronology7.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField18, and durationField9", !(durationField9.compareTo(durationField18) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField18.compareTo(durationField9))));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.monthOfYear();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime4.add(readableDuration6, (int) (short) 10);
        boolean boolean9 = mutableDateTime4.isEqualNow();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime4.add(durationFieldType10, (int) 'u');
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTime((org.joda.time.ReadableInstant) instant26);
        int[] intArray29 = chronology21.get((org.joda.time.ReadablePartial) timeOfDay24, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(0L, chronology21);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (-1), chronology21);
        org.joda.time.DateTimeField dateTimeField32 = chronology21.dayOfYear();
        org.joda.time.DurationField durationField33 = durationFieldType10.getField(chronology21);
        org.joda.time.DurationField durationField34 = chronology21.years();
        org.joda.time.DurationField durationField35 = chronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField33, and durationField34", !(durationField35.compareTo(durationField33) == 0) || (Math.signum(durationField35.compareTo(durationField34)) == Math.signum(durationField33.compareTo(durationField34))));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType2.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.hourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology9);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(chronology9);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, 2, chronology9);
        org.joda.time.DateTimeField dateTimeField17 = chronology9.year();
        long long19 = dateTimeField17.roundHalfCeiling((long) 26702386);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = dateTimeField17.getType();
        org.joda.time.DurationField durationField21 = dateTimeField17.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField21, and durationField11", !(durationField11.compareTo(durationField21) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField21.compareTo(durationField11))));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.Chronology chronology27 = chronology19.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = chronology19.minuteOfDay();
        org.joda.time.DurationField durationField29 = chronology19.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField29, and durationField21", !(durationField21.compareTo(durationField29) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField29.compareTo(durationField21))));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(0L);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusMonths((int) (short) -1);
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean10 = interval6.abuts((org.joda.time.ReadableInterval) interval9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Interval interval12 = interval9.withDurationBeforeEnd(readableDuration11);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean19 = interval15.abuts((org.joda.time.ReadableInterval) interval18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Interval interval21 = interval18.withDurationBeforeEnd(readableDuration20);
        org.joda.time.Period period22 = interval18.toPeriod();
        org.joda.time.Interval interval23 = interval9.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period22);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay3.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.DateMidnight dateMidnight25 = yearMonthDay3.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay3.withYear(493);
        int int28 = yearMonthDay3.size();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean35 = interval31.abuts((org.joda.time.ReadableInterval) interval34);
        long long36 = interval34.getStartMillis();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.Interval interval38 = interval34.withPeriodAfterStart(readablePeriod37);
        org.joda.time.Interval interval40 = interval38.withEndMillis((long) 26688);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone43 = instant42.getZone();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime47 = dateTime44.withDurationAdded(readableDuration45, (int) (byte) 0);
        org.joda.time.DateTime dateTime49 = dateTime44.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime51 = dateTime49.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime53 = dateTime51.plusDays(2);
        org.joda.time.Interval interval54 = interval40.withEnd((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime56 = dateTime53.plusMinutes((int) (short) 1);
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean59 = localDate57.isSupported(dateTimeFieldType58);
        org.joda.time.DateTime dateTime61 = dateTime53.withField(dateTimeFieldType58, (int) (byte) 0);
        org.joda.time.DateTime dateTime63 = dateTime61.plusMonths(2922730);
        org.joda.time.DateTime dateTime64 = yearMonthDay3.toDateTime((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean67 = localDate65.isSupported(dateTimeFieldType66);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateMidnight dateMidnight69 = localDate65.toDateMidnight(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = localDate65.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate72 = localDate65.plusDays((int) (byte) 0);
        java.lang.String str74 = localDate72.toString("0");
        org.joda.time.LocalDate localDate76 = localDate72.plusMonths((-46800000));
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetMillis(30);
        org.joda.time.DateTime dateTime79 = localDate72.toDateTimeAtCurrentTime(dateTimeZone78);
        org.joda.time.DateTime dateTime80 = yearMonthDay3.toDateTimeAtMidnight(dateTimeZone78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime79", (dateTime44.compareTo(dateTime79) == 0) == dateTime44.equals(dateTime79));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        org.joda.time.DurationField durationField19 = chronology8.eras();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) 26914105, chronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.Chronology chronology27 = chronology19.withUTC();
        org.joda.time.DurationField durationField28 = chronology27.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField28, and durationField21", !(durationField21.compareTo(durationField28) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField28.compareTo(durationField21))));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 3);
        java.util.Calendar.Builder builder4 = builder2.setLenient(false);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str8 = dateTimeZone7.toString();
        java.util.TimeZone timeZone9 = dateTimeZone7.toTimeZone();
        java.util.Calendar.Builder builder10 = builder2.setTimeZone(timeZone9);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        int[] intArray26 = chronology18.get((org.joda.time.ReadablePartial) timeOfDay21, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(0L, chronology18);
        int int28 = mutableDateTime27.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime27.property(dateTimeFieldType29);
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
        java.util.Calendar calendar49 = mutableDateTime27.toCalendar(locale43);
        int int50 = calendar49.getWeekYear();
        calendar49.set((int) (byte) -1, (int) (byte) 100, 0, 8, (int) (short) 100);
        int int58 = calendar49.getGreatestMinimum(10);
        calendar49.set(312, (int) (short) 1, 6, (-1645515289), 1);
        java.util.TimeZone timeZone65 = calendar49.getTimeZone();
        java.util.Date date66 = calendar49.getTime();
        java.util.Calendar.Builder builder67 = builder2.setInstant(date66);
        java.util.Calendar calendar68 = builder67.build();
        java.util.Calendar calendar69 = builder67.build();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar49 and calendar68", (calendar49.compareTo(calendar68) == 0) == calendar49.equals(calendar68));
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
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType15.getField(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime14, chronology22);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.minuteOfDay();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime31.withDurationAdded(readableDuration32, (int) (byte) 0);
        org.joda.time.DateTime dateTime36 = dateTime31.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMinutes((int) (byte) 10);
        int int39 = dateTime38.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime40 = dateTime38.toDateTimeISO();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean47 = interval43.abuts((org.joda.time.ReadableInterval) interval46);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Interval interval49 = interval46.withDurationBeforeEnd(readableDuration48);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean56 = interval52.abuts((org.joda.time.ReadableInterval) interval55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.Interval interval58 = interval55.withDurationBeforeEnd(readableDuration57);
        org.joda.time.Interval interval61 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean65 = interval61.abuts((org.joda.time.ReadableInterval) interval64);
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.Interval interval67 = interval64.withDurationBeforeEnd(readableDuration66);
        org.joda.time.Period period68 = interval64.toPeriod();
        org.joda.time.Interval interval69 = interval55.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Interval interval70 = interval46.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateTime dateTime71 = dateTime38.plus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime26, (org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateTimeField dateTimeField73 = mutableDateTime26.getRoundingField();
        org.joda.time.TimeOfDay timeOfDay76 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property77 = timeOfDay76.minuteOfHour();
        java.lang.String str78 = property77.getAsShortText();
        org.joda.time.DateTimeField dateTimeField79 = property77.getField();
        org.joda.time.TimeOfDay timeOfDay81 = property77.addNoWrapToCopy(100);
        java.util.Locale locale82 = java.util.Locale.TRADITIONAL_CHINESE;
        int int83 = property77.getMaximumTextLength(locale82);
        org.joda.time.TimeOfDay timeOfDay84 = property77.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay86 = timeOfDay84.minusMillis(1969);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = timeOfDay86.getFieldType(0);
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime26.property(dateTimeFieldType88);
        org.joda.time.DurationField durationField90 = property89.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField90, and durationField24", !(durationField24.compareTo(durationField90) == 0) || (Math.signum(durationField24.compareTo(durationField24)) == Math.signum(durationField90.compareTo(durationField24))));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        boolean boolean19 = interval13.isAfter((long) 1970);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) 10);
        org.joda.time.Interval interval23 = interval13.gap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.DateTime dateTime24 = interval22.getEnd();
        long long25 = interval22.toDurationMillis();
        org.joda.time.DateTime dateTime26 = interval22.getEnd();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.DateTime dateTime34 = instant31.toDateTime();
        org.joda.time.DateTime dateTime36 = dateTime34.plusWeeks(2022);
        org.joda.time.DateTime dateTime38 = dateTime36.plus(2L);
        org.joda.time.DateTime dateTime40 = dateTime36.plusMinutes(59);
        org.joda.time.DateTime dateTime42 = dateTime40.withMillisOfDay(7333089);
        boolean boolean43 = interval22.isAfter((org.joda.time.ReadableInstant) dateTime42);
        long long44 = interval22.getEndMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant31 and dateTime34", (instant31.compareTo(dateTime34) == 0) == instant31.equals(dateTime34));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean4 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology16 = instant14.getChronology();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        int[] intArray24 = chronology16.get((org.joda.time.ReadablePartial) timeOfDay19, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, chronology16);
        java.lang.Object obj26 = mutableDateTime25.clone();
        int int27 = mutableDateTime25.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime41 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) instant40);
        int[] intArray43 = chronology35.get((org.joda.time.ReadablePartial) timeOfDay38, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, chronology35);
        mutableDateTime44.setYear(3);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone49 = instant48.getZone();
        mutableDateTime44.setZone(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone49);
        mutableDateTime25.setZoneRetainFields(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(604800000L, dateTimeZone49);
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(dateTimeZone49);
        java.lang.String str56 = dateTimeZone49.getShortName((long) (-1645515253));
        org.joda.time.DateTime dateTime57 = dateTime7.withZoneRetainFields(dateTimeZone49);
        org.joda.time.TimeOfDay timeOfDay58 = dateTime7.toTimeOfDay();
        int int59 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime7);
        int int60 = dateTime7.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime51", (mutableDateTime6.compareTo(dateTime51) == 0) == mutableDateTime6.equals(dateTime51));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(2022);
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfSecond();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays(26702386);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        int[] intArray28 = chronology20.get((org.joda.time.ReadablePartial) timeOfDay23, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, chronology20);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        int[] intArray44 = chronology36.get((org.joda.time.ReadablePartial) timeOfDay39, (long) (short) -1);
        mutableDateTime29.setChronology(chronology36);
        boolean boolean46 = mutableDateTime29.isEqualNow();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime29.secondOfDay();
        mutableDateTime29.setMillisOfDay((int) (short) 100);
        int int50 = mutableDateTime29.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant56 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime57 = timeOfDay54.toDateTime((org.joda.time.ReadableInstant) instant56);
        org.joda.time.Chronology chronology58 = instant56.getChronology();
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant63 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime64 = timeOfDay61.toDateTime((org.joda.time.ReadableInstant) instant63);
        int[] intArray66 = chronology58.get((org.joda.time.ReadablePartial) timeOfDay61, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(0L, chronology58);
        mutableDateTime67.setYear(3);
        org.joda.time.Instant instant71 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone72 = instant71.getZone();
        mutableDateTime67.setZone(dateTimeZone72);
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(dateTimeZone72);
        java.lang.String str76 = dateTimeZone72.getName((long) 'x');
        mutableDateTime29.setZoneRetainFields(dateTimeZone72);
        org.joda.time.LocalTime localTime79 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime81 = localTime79.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime83 = localTime79.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime.Property property84 = localTime79.minuteOfHour();
        org.joda.time.LocalTime localTime86 = property84.addWrapFieldToCopy(10);
        boolean boolean87 = dateTimeZone72.equals((java.lang.Object) property84);
        org.joda.time.DateTime dateTime88 = dateTime12.toDateTime(dateTimeZone72);
        org.joda.time.LocalDate localDate89 = org.joda.time.LocalDate.now(dateTimeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMinutes(35);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMinutes(22);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime6.getFields();
        int int10 = localDateTime6.getEra();
        int int11 = localDateTime6.getCenturyOfEra();
        boolean boolean13 = localDateTime6.equals((java.lang.Object) "Property[hourOfDay]");
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.plusMonths(26804900);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime17 = instant16.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight20.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusMonths(70);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean34 = interval30.abuts((org.joda.time.ReadableInterval) interval33);
        long long35 = interval33.getStartMillis();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean42 = interval38.abuts((org.joda.time.ReadableInterval) interval41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Interval interval44 = interval41.withDurationBeforeEnd(readableDuration43);
        org.joda.time.Interval interval45 = interval33.overlap((org.joda.time.ReadableInterval) interval41);
        org.joda.time.Duration duration46 = interval41.toDuration();
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight27.withDurationAdded((org.joda.time.ReadableDuration) duration46, 0);
        org.joda.time.Instant instant49 = instant16.minus((org.joda.time.ReadableDuration) duration46);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime6.minus((org.joda.time.ReadableDuration) duration46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime17", (instant16.compareTo(mutableDateTime17) == 0) == instant16.equals(mutableDateTime17));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology15.eras();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType8.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.hourOfDay();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean31 = dateMidnight28.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        org.joda.time.Chronology chronology40 = instant38.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField42 = chronology40.eras();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType33.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.hourOfDay();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) 22, chronology40);
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType30.getField(chronology40);
        int int47 = localTime20.indexOf(dateTimeFieldType30);
        org.joda.time.DateTime.Property property48 = dateTime5.property(dateTimeFieldType30);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay51.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay51.withMillisOfSecond(1);
        org.joda.time.Chronology chronology59 = timeOfDay58.getChronology();
        boolean boolean60 = dateTimeFieldType30.isSupported(chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.era();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.weekOfWeekyear();
        org.joda.time.DurationField durationField63 = chronology59.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField63, and durationField17", !(durationField17.compareTo(durationField63) == 0) || (Math.signum(durationField17.compareTo(durationField17)) == Math.signum(durationField63.compareTo(durationField17))));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        org.joda.time.Instant instant33 = mutableDateTime16.toInstant();
        org.joda.time.DateTime dateTime34 = instant33.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime35 = instant33.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime34", (mutableDateTime16.compareTo(dateTime34) == 0) == mutableDateTime16.equals(dateTime34));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) (byte) 100, (int) (short) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(2);
        org.joda.time.DateTime dateTime20 = dateTime16.withHourOfDay(22);
        int int21 = dateTime16.getMonthOfYear();
        boolean boolean22 = instant1.isEqual((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime23 = instant1.toDateTimeISO();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean26 = localDate24.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = localDate24.toDateMidnight(dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate24.minusMonths((int) (short) 10);
        int int31 = localDate24.getDayOfYear();
        org.joda.time.LocalDate.Property property32 = localDate24.monthOfYear();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean35 = localDate33.isSupported(dateTimeFieldType34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = localDate33.toDateMidnight(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = localDate33.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate40 = localDate33.plusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean43 = dateTimeZone41.equals((java.lang.Object) 604800000L);
        org.joda.time.Interval interval44 = localDate33.toInterval(dateTimeZone41);
        org.joda.time.Interval interval45 = localDate24.toInterval(dateTimeZone41);
        java.lang.String str47 = dateTimeZone41.getName((long) 363);
        org.joda.time.DateTime dateTime48 = dateTime23.toDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime50 = dateTime48.plusYears(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime50", (instant1.compareTo(dateTime50) == 0) == instant1.equals(dateTime50));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withMillis((long) 292278993);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMinutes((-292275054));
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour(2);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean19 = interval15.abuts((org.joda.time.ReadableInterval) interval18);
        long long20 = interval18.getStartMillis();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean27 = interval23.abuts((org.joda.time.ReadableInterval) interval26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Interval interval29 = interval26.withDurationBeforeEnd(readableDuration28);
        org.joda.time.Interval interval30 = interval18.overlap((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Duration duration31 = interval26.toDuration();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime12.withDurationAdded((org.joda.time.ReadableDuration) duration31, 112);
        org.joda.time.Period period34 = duration31.toPeriod();
        org.joda.time.Period period35 = duration31.toPeriod();
        org.joda.time.Instant instant37 = instant5.withDurationAdded((org.joda.time.ReadableDuration) duration31, 185505);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime3", (instant1.compareTo(mutableDateTime3) == 0) == instant1.equals(mutableDateTime3));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.monthOfYear();
        int int6 = mutableDateTime4.getMillisOfSecond();
        mutableDateTime4.addYears(3);
        mutableDateTime4.addMonths(60000);
        int int11 = mutableDateTime4.getDayOfMonth();
        java.lang.Object obj12 = null;
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        int[] intArray28 = chronology20.get((org.joda.time.ReadablePartial) timeOfDay23, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, chronology20);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        int[] intArray44 = chronology36.get((org.joda.time.ReadablePartial) timeOfDay39, (long) (short) -1);
        mutableDateTime29.setChronology(chronology36);
        boolean boolean46 = mutableDateTime29.isEqualNow();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime29.secondOfDay();
        org.joda.time.DateTime dateTime48 = mutableDateTime29.toDateTimeISO();
        org.joda.time.DateTime dateTime50 = dateTime48.withMillis((long) 1970);
        org.joda.time.DateTime.Property property51 = dateTime50.minuteOfHour();
        org.joda.time.DateTime dateTime52 = property51.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.minus(readableDuration53);
        org.joda.time.DateTime dateTime56 = dateTime52.minusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone58);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight59.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone64 = dateMidnight59.getZone();
        org.joda.time.DateTime dateTime65 = dateTime52.toDateTime(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj12, dateTimeZone64);
        mutableDateTime4.setZone(dateTimeZone64);
        org.joda.time.DateMidnight dateMidnight68 = org.joda.time.DateMidnight.now(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and dateTime65", (mutableDateTime29.compareTo(dateTime65) == 0) == mutableDateTime29.equals(dateTime65));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(0L);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusMonths((int) (short) -1);
        org.joda.time.YearMonthDay.Property property4 = yearMonthDay3.monthOfYear();
        int int5 = property4.get();
        org.joda.time.YearMonthDay yearMonthDay6 = property4.withMinimumValue();
        org.joda.time.Instant instant8 = org.joda.time.Instant.parse("11");
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        int int10 = property4.compareTo((org.joda.time.ReadableInstant) instant8);
        org.joda.time.YearMonthDay yearMonthDay11 = property4.withMaximumValue();
        java.lang.String str12 = property4.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime9", (instant8.compareTo(dateTime9) == 0) == instant8.equals(dateTime9));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        java.lang.Object obj17 = mutableDateTime16.clone();
        int int18 = mutableDateTime16.getMinuteOfHour();
        mutableDateTime16.addMinutes((int) (byte) 10);
        mutableDateTime16.setMillis(0L);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime16.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.add((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime26 = property23.roundHalfFloor();
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
        boolean boolean60 = mutableDateTime43.isEqualNow();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime43.secondOfDay();
        mutableDateTime43.setMillisOfDay((int) (short) 100);
        int int64 = mutableDateTime43.getHourOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime43.hourOfDay();
        org.joda.time.Instant instant67 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime68 = instant67.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime69 = instant67.toMutableDateTimeISO();
        int int70 = mutableDateTime43.compareTo((org.joda.time.ReadableInstant) instant67);
        org.joda.time.Instant instant72 = instant67.withMillis((-4928L));
        org.joda.time.DateTime dateTime73 = instant72.toDateTime();
        org.joda.time.Interval interval76 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval79 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean80 = interval76.abuts((org.joda.time.ReadableInterval) interval79);
        long long81 = interval79.getStartMillis();
        org.joda.time.Interval interval84 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval87 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean88 = interval84.abuts((org.joda.time.ReadableInterval) interval87);
        org.joda.time.ReadableDuration readableDuration89 = null;
        org.joda.time.Interval interval90 = interval87.withDurationBeforeEnd(readableDuration89);
        org.joda.time.Interval interval91 = interval79.overlap((org.joda.time.ReadableInterval) interval87);
        org.joda.time.Duration duration92 = interval87.toDuration();
        long long93 = duration92.getMillis();
        org.joda.time.Instant instant94 = instant72.plus((org.joda.time.ReadableDuration) duration92);
        mutableDateTime26.add((org.joda.time.ReadableDuration) duration92, 27070);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime68", (instant5.compareTo(dateTime68) == 0) == instant5.equals(dateTime68));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(0L);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusMonths((int) (short) -1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean6 = localDate4.isSupported(dateTimeFieldType5);
        int int7 = yearMonthDay1.indexOf(dateTimeFieldType5);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay1.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean12 = dateTimeZone10.equals((java.lang.Object) 604800000L);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight14 = yearMonthDay1.toDateMidnight(dateTimeZone10);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay1.year();
        int int16 = yearMonthDay1.getDayOfMonth();
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = localDate22.toDateMidnight(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate22.minusMonths((int) (short) 10);
        int int29 = localDate22.getDayOfMonth();
        org.joda.time.LocalDate.Property property30 = localDate22.year();
        org.joda.time.LocalDate localDate31 = property30.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate33 = localDate31.plusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtMidnight(dateTimeZone34);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.withDurationAdded(readableDuration40, (int) (byte) 0);
        org.joda.time.DateTime dateTime44 = dateTime39.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMinutes((int) (byte) 10);
        int int47 = dateTime46.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime49 = dateTime46.plusDays(1);
        boolean boolean50 = dateTime35.isEqual((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTimeZone dateTimeZone51 = dateTime35.getZone();
        boolean boolean53 = dateTimeZone51.isStandardOffset((-52436155480518457L));
        boolean boolean55 = dateTimeZone51.isStandardOffset((-3600000L));
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) ' ', dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime20.toMutableDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime58 = yearMonthDay1.toDateTimeAtMidnight(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime20", (dateTime13.compareTo(dateTime20) == 0) == dateTime13.equals(dateTime20));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 511589);
        org.joda.time.Instant instant3 = instant1.minus((-36000000L));
        org.joda.time.Instant instant5 = instant3.plus(60000L);
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTime();
        org.joda.time.Instant instant7 = instant5.toInstant();
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime6", (instant7.compareTo(mutableDateTime6) == 0) == instant7.equals(mutableDateTime6));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        int int6 = dateMidnight5.getDayOfMonth();
        int int7 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant8 = dateMidnight5.toInstant();
        org.joda.time.Instant instant10 = instant8.plus((-36000000L));
        org.joda.time.Instant instant12 = instant10.plus((long) 1901);
        org.joda.time.Instant instant14 = instant12.plus((long) 1910);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and instant8", (dateMidnight2.compareTo(instant8) == 0) == dateMidnight2.equals(instant8));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology15.eras();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType8.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.hourOfDay();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean31 = dateMidnight28.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        org.joda.time.Chronology chronology40 = instant38.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField42 = chronology40.eras();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType33.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.hourOfDay();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) 22, chronology40);
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType30.getField(chronology40);
        int int47 = localTime20.indexOf(dateTimeFieldType30);
        org.joda.time.DateTime.Property property48 = dateTime5.property(dateTimeFieldType30);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay51.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay51.withMillisOfSecond(1);
        org.joda.time.Chronology chronology59 = timeOfDay58.getChronology();
        boolean boolean60 = dateTimeFieldType30.isSupported(chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.era();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.monthOfYear();
        org.joda.time.DurationField durationField63 = chronology59.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField63, and durationField17", !(durationField17.compareTo(durationField63) == 0) || (Math.signum(durationField17.compareTo(durationField17)) == Math.signum(durationField63.compareTo(durationField17))));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.lang.String[] strArray65 = new java.lang.String[] { "\u4e0a\u5348 12:00:00", "11", "2022", "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z", "halfdays", "\u53f0\u7063", "weekyear", "GMT+10:00", "hourOfDay", "chinese (10)", "hourOfHalfday", "DateTimeField[dayOfMonth]", "1970-01-01T00:00:00.002Z", "hi!", "\u4e2d\u6587", "2022-02-22T00:00:00.000Z", "2022-02-22T00:00:00.000Z", "DateTimeField[dayOfMonth]", "GMT", "1970-01-01T00:00:00.000Z", "era", "0", "DateTimeField[dayOfMonth]", "\u4e2d\u6587\u53f0\u7063)", "zh_TW", "DateTimeField[clockhourOfHalfday]", "T00:01:00.000", "00:00:00.000", "Property[minuteOfHour]", "hi!", "PT0S", "dayOfMonth", "+00:00", "1970", "+00:00", "10:11:11.020", "GMT", "12", "\u4e2d\u6587\u53f0\u7063)", "2022-02-22T00:00:00.000Z", "Chinesisch (Taiwan)", "+10:00", "weekyear", "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", "12", "\u4e2d\u6587\u53f0\u7063)", "millisOfDay", "DateTimeField[dayOfMonth]", "zh", "2022", "1970-01-01", "zh_TW", "Property[minuteOfHour]", "java.io.IOException: ", "Sat Jul 30 00:00:00 GMT+10:00 1904", "1", "minuteOfHour", "Tue", "11", "zh", "12", "1970-01-01T00:00:00.000Z", "+00:0012", "2022", "millisOfDay" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        org.joda.time.TimeOfDay timeOfDay70 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant72 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime73 = timeOfDay70.toDateTime((org.joda.time.ReadableInstant) instant72);
        boolean boolean74 = strSet66.equals((java.lang.Object) dateTime73);
        int int75 = dateTime73.getDayOfMonth();
        org.joda.time.TimeOfDay timeOfDay76 = dateTime73.toTimeOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay80 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant82 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime83 = timeOfDay80.toDateTime((org.joda.time.ReadableInstant) instant82);
        org.joda.time.Chronology chronology84 = instant82.getChronology();
        org.joda.time.DateTimeField dateTimeField85 = chronology84.clockhourOfHalfday();
        org.joda.time.DurationField durationField86 = chronology84.eras();
        org.joda.time.DateTimeField dateTimeField87 = dateTimeFieldType77.getField(chronology84);
        org.joda.time.DateTimeField dateTimeField88 = chronology84.hourOfDay();
        org.joda.time.LocalTime localTime89 = new org.joda.time.LocalTime(chronology84);
        org.joda.time.Chronology chronology90 = chronology84.withUTC();
        org.joda.time.Chronology chronology91 = chronology90.withUTC();
        org.joda.time.TimeOfDay timeOfDay92 = timeOfDay76.withChronologyRetainFields(chronology90);
        org.joda.time.DurationField durationField93 = chronology90.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField86, durationField93, and durationField86", !(durationField86.compareTo(durationField93) == 0) || (Math.signum(durationField86.compareTo(durationField86)) == Math.signum(durationField93.compareTo(durationField86))));
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
        org.joda.time.DateTimeField dateTimeField24 = chronology20.centuryOfEra();
        org.joda.time.Chronology chronology25 = chronology20.withUTC();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) 'a', chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.monthOfYear();
        org.joda.time.DurationField durationField28 = chronology25.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField28, and durationField22", !(durationField22.compareTo(durationField28) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField28.compareTo(durationField22))));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight5.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight5.plusDays(13);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.withDayOfMonth((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 6);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight12, dateTimeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean19 = localDate17.isSupported(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = localDate17.toDateMidnight(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate17.plusMonths((-1));
        org.joda.time.LocalDate.Property property24 = localDate23.era();
        org.joda.time.LocalDate localDate25 = property24.getLocalDate();
        org.joda.time.LocalDate localDate27 = property24.addWrapFieldToCopy((-1));
        org.joda.time.LocalDate localDate28 = property24.withMinimumValue();
        org.joda.time.LocalDate localDate29 = property24.roundCeilingCopy();
        org.joda.time.LocalDate localDate30 = property24.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight12.withFields((org.joda.time.ReadablePartial) localDate30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and mutableDateTime16", (dateMidnight2.compareTo(mutableDateTime16) == 0) == dateMidnight2.equals(mutableDateTime16));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType15.getField(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime14, chronology22);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.minuteOfDay();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime31.withDurationAdded(readableDuration32, (int) (byte) 0);
        org.joda.time.DateTime dateTime36 = dateTime31.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMinutes((int) (byte) 10);
        int int39 = dateTime38.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime40 = dateTime38.toDateTimeISO();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean47 = interval43.abuts((org.joda.time.ReadableInterval) interval46);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Interval interval49 = interval46.withDurationBeforeEnd(readableDuration48);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean56 = interval52.abuts((org.joda.time.ReadableInterval) interval55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.Interval interval58 = interval55.withDurationBeforeEnd(readableDuration57);
        org.joda.time.Interval interval61 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean65 = interval61.abuts((org.joda.time.ReadableInterval) interval64);
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.Interval interval67 = interval64.withDurationBeforeEnd(readableDuration66);
        org.joda.time.Period period68 = interval64.toPeriod();
        org.joda.time.Interval interval69 = interval55.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Interval interval70 = interval46.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateTime dateTime71 = dateTime38.plus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime26, (org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateTimeField dateTimeField73 = mutableDateTime26.getRoundingField();
        org.joda.time.TimeOfDay timeOfDay76 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property77 = timeOfDay76.minuteOfHour();
        java.lang.String str78 = property77.getAsShortText();
        org.joda.time.DateTimeField dateTimeField79 = property77.getField();
        org.joda.time.TimeOfDay timeOfDay81 = property77.addNoWrapToCopy(100);
        java.util.Locale locale82 = java.util.Locale.TRADITIONAL_CHINESE;
        int int83 = property77.getMaximumTextLength(locale82);
        org.joda.time.TimeOfDay timeOfDay84 = property77.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay86 = timeOfDay84.minusMillis(1969);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = timeOfDay86.getFieldType(0);
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime26.property(dateTimeFieldType88);
        long long90 = property89.remainder();
        org.joda.time.DurationField durationField91 = property89.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField91, and durationField24", !(durationField24.compareTo(durationField91) == 0) || (Math.signum(durationField24.compareTo(durationField24)) == Math.signum(durationField91.compareTo(durationField24))));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(10, 11, 11, 20);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond((int) (byte) 100);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withDurationAdded(readableDuration11, (int) (byte) 0);
        org.joda.time.DateTime dateTime15 = dateTime10.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime10.minus(readableDuration16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.plus(readableDuration18);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean23 = interval22.isBeforeNow();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean30 = interval26.abuts((org.joda.time.ReadableInterval) interval29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Interval interval32 = interval29.withDurationBeforeEnd(readableDuration31);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean39 = interval35.abuts((org.joda.time.ReadableInterval) interval38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Interval interval41 = interval38.withDurationBeforeEnd(readableDuration40);
        org.joda.time.Period period42 = interval38.toPeriod();
        org.joda.time.Interval interval43 = interval29.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period42);
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder47 = builder44.setExtension('x', "zh");
        boolean boolean48 = period42.equals((java.lang.Object) builder44);
        org.joda.time.Interval interval49 = interval22.withPeriodAfterStart((org.joda.time.ReadablePeriod) period42);
        org.joda.time.DateTime dateTime50 = dateTime19.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.LocalTime localTime52 = localTime4.withPeriodAdded((org.joda.time.ReadablePeriod) period42, 19);
        org.joda.time.MutablePeriod mutablePeriod53 = period42.toMutablePeriod();
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTime((org.joda.time.ReadableInstant) instant58);
        org.joda.time.Chronology chronology60 = instant58.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.clockhourOfHalfday();
        org.joda.time.DurationField durationField62 = chronology60.eras();
        boolean boolean63 = mutablePeriod53.equals((java.lang.Object) chronology60);
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        org.joda.time.Chronology chronology72 = instant70.getChronology();
        org.joda.time.TimeOfDay timeOfDay75 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant77 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime78 = timeOfDay75.toDateTime((org.joda.time.ReadableInstant) instant77);
        int[] intArray80 = chronology72.get((org.joda.time.ReadablePartial) timeOfDay75, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(0L, chronology72);
        mutableDateTime81.setYear(3);
        org.joda.time.Instant instant85 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone86 = instant85.getZone();
        mutableDateTime81.setZone(dateTimeZone86);
        org.joda.time.DateMidnight dateMidnight88 = new org.joda.time.DateMidnight(dateTimeZone86);
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime((long) 7, dateTimeZone86);
        java.lang.String str91 = dateTimeZone86.getShortName(363L);
        org.joda.time.Chronology chronology92 = chronology60.withZone(dateTimeZone86);
        org.joda.time.DateTimeField dateTimeField93 = chronology92.yearOfCentury();
        long long95 = dateTimeField93.remainder(120000L);
        org.joda.time.DurationField durationField96 = dateTimeField93.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField62, durationField96, and durationField62", !(durationField62.compareTo(durationField96) == 0) || (Math.signum(durationField62.compareTo(durationField62)) == Math.signum(durationField96.compareTo(durationField62))));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("0493-02-01");
        java.util.Calendar.Builder builder2 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) 3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str8 = dateTimeZone7.toString();
        java.util.TimeZone timeZone9 = dateTimeZone7.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology16 = instant14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfHalfday();
        long long19 = dateTimeField17.roundHalfFloor(0L);
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        int int21 = dateTimeField17.getMaximumShortTextLength(locale20);
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.lang.String str26 = locale22.getDisplayName(locale24);
        java.lang.String str27 = locale20.getDisplayLanguage(locale22);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone9, locale20);
        java.util.TimeZone.setDefault(timeZone9);
        java.util.Calendar.Builder builder30 = builder2.setTimeZone(timeZone9);
        boolean boolean31 = timeZone1.hasSameRules(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str35 = dateTimeZone34.toString();
        java.util.TimeZone timeZone36 = dateTimeZone34.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        org.joda.time.Chronology chronology43 = instant41.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.clockhourOfHalfday();
        long long46 = dateTimeField44.roundHalfFloor(0L);
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        int int48 = dateTimeField44.getMaximumShortTextLength(locale47);
        java.util.Locale locale49 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale50 = locale49.stripExtensions();
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale52 = locale51.stripExtensions();
        java.lang.String str53 = locale49.getDisplayName(locale51);
        java.lang.String str54 = locale47.getDisplayLanguage(locale49);
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone36, locale47);
        java.util.TimeZone.setDefault(timeZone36);
        timeZone36.setID("DateTimeField[yearOfEra]");
        boolean boolean59 = timeZone1.hasSameRules(timeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar55", (calendar28.compareTo(calendar55) == 0) == calendar28.equals(calendar55));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean32 = interval28.abuts((org.joda.time.ReadableInterval) interval31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Interval interval34 = interval31.withDurationBeforeEnd(readableDuration33);
        org.joda.time.Interval interval37 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean41 = interval37.abuts((org.joda.time.ReadableInterval) interval40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Interval interval43 = interval40.withDurationBeforeEnd(readableDuration42);
        org.joda.time.Period period44 = interval40.toPeriod();
        org.joda.time.Interval interval45 = interval31.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period44);
        long long48 = chronology19.add((org.joda.time.ReadablePeriod) period44, (long) 363, 20);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean52 = interval51.isBeforeNow();
        org.joda.time.Interval interval53 = interval51.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(chronology54);
        int[] intArray57 = chronology19.get((org.joda.time.ReadablePartial) localTime55, (-1725357600000L));
        org.joda.time.DurationField durationField58 = chronology19.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField58, and durationField21", !(durationField21.compareTo(durationField58) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField58.compareTo(durationField21))));
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
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.Chronology chronology13 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = dateTimeField15.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField16, and durationField9", !(durationField9.compareTo(durationField16) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField16.compareTo(durationField9))));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology7.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(3098892765600052L, chronology7);
        boolean boolean14 = dateTime13.isBeforeNow();
        org.joda.time.DateTime dateTime16 = dateTime13.withYear(44);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property20 = timeOfDay19.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property20.getFieldType();
        org.joda.time.DurationField durationField22 = property20.getDurationField();
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.withDurationAdded(readableDuration27, (int) (byte) 0);
        org.joda.time.DateTime dateTime31 = dateTime26.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime33 = dateTime31.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime35 = dateTime33.plusDays(2);
        org.joda.time.DateTime dateTime37 = dateTime33.withHourOfDay(22);
        int int38 = property20.compareTo((org.joda.time.ReadableInstant) dateTime33);
        int int39 = property20.getMaximumValue();
        java.lang.String str40 = property20.getAsText();
        org.joda.time.TimeOfDay timeOfDay41 = property20.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay43 = property20.addWrapFieldToCopy(2008);
        org.joda.time.DurationField durationField44 = property20.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField45 = property20.getField();
        boolean boolean46 = dateTime16.equals((java.lang.Object) property20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField22", Math.signum(durationField9.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField9)));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime8.hourOfDay();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate14.toDateMidnight(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate14.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property20 = localDate14.yearOfEra();
        org.joda.time.LocalDate localDate22 = localDate14.minusMonths((int) '#');
        int int23 = localDate22.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        org.joda.time.DateTime dateTime26 = localDate22.toDateTimeAtStartOfDay(dateTimeZone25);
        boolean boolean27 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str32 = dateTimeZone31.toString();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(0L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime8.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime.Property property35 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime36 = property35.roundCeilingCopy();
        org.joda.time.DateTime dateTime38 = property35.addToCopy((long) 292275055);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.withWeekyear(2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = dateMidnight41.toString(dateTimeFormatter44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight41.plusMonths(53);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight41.withDayOfMonth(22);
        int int50 = dateMidnight49.getDayOfYear();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean57 = interval53.abuts((org.joda.time.ReadableInterval) interval56);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.Interval interval59 = interval56.withDurationBeforeEnd(readableDuration58);
        org.joda.time.Interval interval62 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval65 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean66 = interval62.abuts((org.joda.time.ReadableInterval) interval65);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.Interval interval68 = interval65.withDurationBeforeEnd(readableDuration67);
        org.joda.time.Period period69 = interval65.toPeriod();
        org.joda.time.Interval interval70 = interval56.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period69);
        java.util.Locale.Builder builder71 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder74 = builder71.setExtension('x', "zh");
        boolean boolean75 = period69.equals((java.lang.Object) builder71);
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight49.withPeriodAdded((org.joda.time.ReadablePeriod) period69, 22);
        org.joda.time.DateTime dateTime78 = dateTime38.plus((org.joda.time.ReadablePeriod) period69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and dateMidnight41", (dateTime33.compareTo(dateMidnight41) == 0) == dateTime33.equals(dateMidnight41));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(2);
        org.joda.time.DateTime dateTime20 = dateTime16.withHourOfDay(22);
        int int21 = property3.compareTo((org.joda.time.ReadableInstant) dateTime16);
        int int22 = property3.getMaximumValue();
        java.lang.String str23 = property3.getAsText();
        org.joda.time.TimeOfDay timeOfDay24 = property3.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay26 = property3.addWrapFieldToCopy(2008);
        org.joda.time.TimeOfDay timeOfDay28 = property3.setCopy("6");
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        org.joda.time.Chronology chronology37 = instant35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.clockhourOfHalfday();
        org.joda.time.DurationField durationField39 = chronology37.eras();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.dayOfYear();
        org.joda.time.DateTimeField dateTimeField41 = chronology37.dayOfMonth();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime49 = timeOfDay46.toDateTime((org.joda.time.ReadableInstant) instant48);
        org.joda.time.Chronology chronology50 = instant48.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.clockhourOfHalfday();
        long long53 = dateTimeField51.roundHalfFloor(0L);
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        int int55 = dateTimeField51.getMaximumShortTextLength(locale54);
        java.lang.String str56 = locale54.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology43, locale54);
        java.util.Locale locale58 = dateTimeParserBucket57.getLocale();
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant63 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime64 = timeOfDay61.toDateTime((org.joda.time.ReadableInstant) instant63);
        org.joda.time.Chronology chronology65 = instant63.getChronology();
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        int[] intArray73 = chronology65.get((org.joda.time.ReadablePartial) timeOfDay68, (long) (short) -1);
        boolean boolean74 = dateTimeParserBucket57.restoreState((java.lang.Object) (short) -1);
        java.util.Locale locale75 = dateTimeParserBucket57.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket(9L, chronology37, locale75, (java.lang.Integer) 11, 365);
        java.util.Locale locale79 = dateTimeParserBucket78.getLocale();
        org.joda.time.DateTimeZone dateTimeZone80 = dateTimeParserBucket78.getZone();
        org.joda.time.DateTime dateTime81 = timeOfDay28.toDateTimeToday(dateTimeZone80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField39", Math.signum(durationField5.compareTo(durationField39)) == -Math.signum(durationField39.compareTo(durationField5)));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean10 = dateMidnight7.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField23 = chronology19.hourOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 22, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.DurationField durationField26 = chronology19.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField26, and durationField21", !(durationField21.compareTo(durationField26) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField26.compareTo(durationField21))));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType1.getField(chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 26789081, chronology8);
        org.joda.time.DateTimeZone dateTimeZone14 = chronology8.getZone();
        org.joda.time.DurationField durationField15 = chronology8.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField15, and durationField10", !(durationField10.compareTo(durationField15) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField15.compareTo(durationField10))));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, (int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.withHourOfDay(8);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.era();
        org.joda.time.DateTime dateTime25 = dateTime8.toDateTime(chronology17);
        long long26 = dateTime25.getMillis();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        int[] intArray41 = chronology33.get((org.joda.time.ReadablePartial) timeOfDay36, (long) (short) -1);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(chronology33);
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property46 = timeOfDay45.minuteOfHour();
        java.lang.String str47 = property46.getAsShortText();
        org.joda.time.DateTimeField dateTimeField48 = property46.getField();
        org.joda.time.TimeOfDay timeOfDay50 = property46.addNoWrapToCopy(100);
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        int int52 = property46.getMaximumTextLength(locale51);
        org.joda.time.DurationField durationField53 = property46.getDurationField();
        boolean boolean54 = localTime42.equals((java.lang.Object) property46);
        org.joda.time.LocalTime localTime56 = localTime42.plusHours(26700803);
        org.joda.time.LocalTime localTime58 = localTime42.plusSeconds(7361852);
        boolean boolean59 = dateTime25.equals((java.lang.Object) localTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField53", Math.signum(durationField19.compareTo(durationField53)) == -Math.signum(durationField53.compareTo(durationField19)));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        java.util.TimeZone timeZone4 = dateTimeZone2.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        long long14 = dateTimeField12.roundHalfFloor(0L);
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        int int16 = dateTimeField12.getMaximumShortTextLength(locale15);
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale17.getDisplayName(locale19);
        java.lang.String str22 = locale15.getDisplayLanguage(locale17);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone4, locale15);
        java.util.TimeZone.setDefault(timeZone4);
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        int[] intArray40 = chronology32.get((org.joda.time.ReadablePartial) timeOfDay35, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, chronology32);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Chronology chronology48 = instant46.getChronology();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        int[] intArray56 = chronology48.get((org.joda.time.ReadablePartial) timeOfDay51, (long) (short) -1);
        mutableDateTime41.setChronology(chronology48);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(chronology48);
        org.joda.time.DateTimeField dateTimeField59 = chronology48.weekOfWeekyear();
        java.util.Locale locale61 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale64 = locale63.stripExtensions();
        java.lang.String str65 = locale61.getDisplayName(locale63);
        java.lang.String str66 = dateTimeField59.getAsText(2022, locale61);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone4, locale61);
        java.util.TimeZone.setDefault(timeZone4);
        int int70 = timeZone4.getOffset((long) 100);
        java.util.TimeZone timeZone72 = java.util.TimeZone.getTimeZone("clockhourOfHalfday");
        boolean boolean73 = timeZone4.hasSameRules(timeZone72);
        java.util.Locale locale75 = new java.util.Locale("10");
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(timeZone72, locale75);
        java.lang.String str77 = locale75.getLanguage();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar76", (calendar23.compareTo(calendar76) == 0) == calendar23.equals(calendar76));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(2);
        org.joda.time.DateTime dateTime20 = dateTime16.withHourOfDay(22);
        int int21 = property3.compareTo((org.joda.time.ReadableInstant) dateTime16);
        int int22 = property3.getMaximumValue();
        java.lang.String str23 = property3.getAsText();
        org.joda.time.TimeOfDay timeOfDay24 = property3.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay26 = property3.addWrapFieldToCopy(2008);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant32 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.clockhourOfHalfday();
        org.joda.time.DurationField durationField36 = chronology34.eras();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.dayOfYear();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.dayOfMonth();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.clockhourOfHalfday();
        long long50 = dateTimeField48.roundHalfFloor(0L);
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        int int52 = dateTimeField48.getMaximumShortTextLength(locale51);
        java.lang.String str53 = locale51.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology40, locale51);
        java.util.Locale locale55 = dateTimeParserBucket54.getLocale();
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant60 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime61 = timeOfDay58.toDateTime((org.joda.time.ReadableInstant) instant60);
        org.joda.time.Chronology chronology62 = instant60.getChronology();
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant67 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime68 = timeOfDay65.toDateTime((org.joda.time.ReadableInstant) instant67);
        int[] intArray70 = chronology62.get((org.joda.time.ReadablePartial) timeOfDay65, (long) (short) -1);
        boolean boolean71 = dateTimeParserBucket54.restoreState((java.lang.Object) (short) -1);
        java.util.Locale locale72 = dateTimeParserBucket54.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = new org.joda.time.format.DateTimeParserBucket(9L, chronology34, locale72, (java.lang.Integer) 11, 365);
        dateTimeParserBucket75.setOffset((java.lang.Integer) 26688);
        java.util.Locale locale78 = dateTimeParserBucket75.getLocale();
        java.lang.String str79 = property3.getAsShortText(locale78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField36", Math.signum(durationField5.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField5)));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        mutableDateTime16.setWeekyear((int) (short) 100);
        int int21 = mutableDateTime16.getMonthOfYear();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime25 = localTime23.minusMinutes((int) (short) 1);
        int int26 = localTime23.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight29.withDurationAdded((long) 2, 100);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight32.withFields((org.joda.time.ReadablePartial) timeOfDay37);
        boolean boolean39 = localTime23.equals((java.lang.Object) timeOfDay37);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int41 = localTime23.get(dateTimeFieldType40);
        int int42 = mutableDateTime16.get(dateTimeFieldType40);
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType40.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        org.joda.time.Chronology chronology52 = instant50.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.clockhourOfHalfday();
        org.joda.time.DurationField durationField54 = chronology52.eras();
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType45.getField(chronology52);
        org.joda.time.DateTimeField dateTimeField56 = chronology52.hourOfDay();
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(chronology52);
        org.joda.time.Chronology chronology58 = chronology52.withUTC();
        org.joda.time.Chronology chronology59 = chronology58.withUTC();
        java.util.Locale locale62 = new java.util.Locale("1970-01-01T00:00:00.002Z", "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.util.Locale locale63 = locale62.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((-86700000L), chronology59, locale62, (java.lang.Integer) (-600));
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType40.getField(chronology59);
        org.joda.time.DurationField durationField67 = chronology59.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField54, durationField67, and durationField54", !(durationField54.compareTo(durationField67) == 0) || (Math.signum(durationField54.compareTo(durationField54)) == Math.signum(durationField67.compareTo(durationField54))));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean11 = dateMidnight8.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType13.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.hourOfDay();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 22, chronology20);
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType10.getField(chronology20);
        org.joda.time.DateMidnight dateMidnight27 = org.joda.time.DateMidnight.now(chronology20);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.minuteOfDay();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str35 = property33.getAsShortText(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((-2678399900L), chronology20, locale34, (java.lang.Integer) 0);
        long long41 = chronology20.add((long) 2, (long) 4, 70);
        org.joda.time.DateTimeField dateTimeField42 = chronology20.hourOfHalfday();
        org.joda.time.DurationField durationField43 = dateTimeField42.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField43, and durationField22", !(durationField22.compareTo(durationField43) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField43.compareTo(durationField22))));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean3 = interval2.isBeforeNow();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean7 = interval6.isBeforeNow();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean14 = interval10.abuts((org.joda.time.ReadableInterval) interval13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Interval interval16 = interval13.withDurationBeforeEnd(readableDuration15);
        org.joda.time.Interval interval19 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean23 = interval19.abuts((org.joda.time.ReadableInterval) interval22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Interval interval25 = interval22.withDurationBeforeEnd(readableDuration24);
        org.joda.time.Period period26 = interval22.toPeriod();
        org.joda.time.Interval interval27 = interval13.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period26);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder28.setExtension('x', "zh");
        boolean boolean32 = period26.equals((java.lang.Object) builder28);
        org.joda.time.Interval interval33 = interval6.withPeriodAfterStart((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Interval interval34 = interval2.withPeriodAfterStart((org.joda.time.ReadablePeriod) period26);
        boolean boolean36 = interval2.isBefore((long) 493);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) 26723186);
        org.joda.time.Interval interval39 = interval2.withEnd((org.joda.time.ReadableInstant) instant38);
        boolean boolean40 = instant38.isBeforeNow();
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime42 = instant41.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone44);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight45.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusMonths(70);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval58 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean59 = interval55.abuts((org.joda.time.ReadableInterval) interval58);
        long long60 = interval58.getStartMillis();
        org.joda.time.Interval interval63 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval66 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean67 = interval63.abuts((org.joda.time.ReadableInterval) interval66);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.Interval interval69 = interval66.withDurationBeforeEnd(readableDuration68);
        org.joda.time.Interval interval70 = interval58.overlap((org.joda.time.ReadableInterval) interval66);
        org.joda.time.Duration duration71 = interval66.toDuration();
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight52.withDurationAdded((org.joda.time.ReadableDuration) duration71, 0);
        org.joda.time.Instant instant74 = instant41.minus((org.joda.time.ReadableDuration) duration71);
        org.joda.time.Instant instant76 = instant38.withDurationAdded((org.joda.time.ReadableDuration) duration71, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant41 and mutableDateTime42", (instant41.compareTo(mutableDateTime42) == 0) == instant41.equals(mutableDateTime42));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = dateMidnight2.toString(dateTimeFormatter5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight2.plusMonths(53);
        org.joda.time.DateMidnight.Property property9 = dateMidnight2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight12.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.plusWeeks(0);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis((long) (byte) 100);
        org.joda.time.Instant instant22 = instant19.toInstant();
        org.joda.time.DateTime dateTime23 = instant22.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.minusMinutes((-292275054));
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withMinuteOfHour(2);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean37 = interval33.abuts((org.joda.time.ReadableInterval) interval36);
        long long38 = interval36.getStartMillis();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean45 = interval41.abuts((org.joda.time.ReadableInterval) interval44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Interval interval47 = interval44.withDurationBeforeEnd(readableDuration46);
        org.joda.time.Interval interval48 = interval36.overlap((org.joda.time.ReadableInterval) interval44);
        org.joda.time.Duration duration49 = interval44.toDuration();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime30.withDurationAdded((org.joda.time.ReadableDuration) duration49, 112);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusYears((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.property(dateTimeFieldType55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.withMillisOfDay((int) '#');
        org.joda.time.Interval interval61 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean65 = interval61.abuts((org.joda.time.ReadableInterval) interval64);
        long long66 = interval64.getStartMillis();
        org.joda.time.Interval interval69 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval72 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean73 = interval69.abuts((org.joda.time.ReadableInterval) interval72);
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.Interval interval75 = interval72.withDurationBeforeEnd(readableDuration74);
        org.joda.time.Interval interval76 = interval64.overlap((org.joda.time.ReadableInterval) interval72);
        org.joda.time.Duration duration77 = interval72.toDuration();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime52.withDurationAdded((org.joda.time.ReadableDuration) duration77, 25);
        boolean boolean80 = duration49.isLongerThan((org.joda.time.ReadableDuration) duration77);
        org.joda.time.Instant instant81 = instant22.minus((org.joda.time.ReadableDuration) duration49);
        org.joda.time.DateMidnight dateMidnight82 = dateMidnight18.plus((org.joda.time.ReadableDuration) duration49);
        org.joda.time.Duration duration83 = duration49.toDuration();
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight2.minus((org.joda.time.ReadableDuration) duration83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and dateTime23", (instant19.compareTo(dateTime23) == 0) == instant19.equals(dateTime23));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime10.withHourOfDay(22);
        org.joda.time.DateTime dateTime16 = dateTime14.withDayOfYear(9);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight22.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone27 = dateMidnight22.getZone();
        long long29 = dateTimeZone19.getMillisKeepLocal(dateTimeZone27, 10L);
        boolean boolean31 = dateTimeZone19.isStandardOffset((long) 365);
        org.joda.time.DateTime dateTime32 = dateTime14.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime34 = dateTime14.withYearOfEra(26708123);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears(87);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone38 = dateMidnight37.getZone();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withMillis((long) (short) -1);
        boolean boolean42 = dateTime34.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime44 = dateTime39.minusDays(451);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime41", (instant1.compareTo(dateTime41) == 0) == instant1.equals(dateTime41));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        int[] intArray19 = chronology11.get((org.joda.time.ReadablePartial) timeOfDay14, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology11);
        java.lang.Object obj21 = mutableDateTime20.clone();
        int int22 = mutableDateTime20.getMinuteOfHour();
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
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone44);
        mutableDateTime20.setZoneRetainFields(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(604800000L, dateTimeZone44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter2.withZone(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeFormatter49.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter49.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter51.withZoneUTC();
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone54 = dateMidnight53.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter51.withZone(dateTimeZone54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter51.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter56.withDefaultYear(428);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone60);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight61.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property67 = dateMidnight66.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean69 = dateMidnight66.isSupported(dateTimeFieldType68);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay74 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant76 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime77 = timeOfDay74.toDateTime((org.joda.time.ReadableInstant) instant76);
        org.joda.time.Chronology chronology78 = instant76.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.clockhourOfHalfday();
        org.joda.time.DurationField durationField80 = chronology78.eras();
        org.joda.time.DateTimeField dateTimeField81 = dateTimeFieldType71.getField(chronology78);
        org.joda.time.DateTimeField dateTimeField82 = chronology78.hourOfDay();
        org.joda.time.LocalTime localTime83 = new org.joda.time.LocalTime((long) 22, chronology78);
        org.joda.time.DateTimeField dateTimeField84 = dateTimeFieldType68.getField(chronology78);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter58.withChronology(chronology78);
        org.joda.time.DurationField durationField86 = chronology78.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField80, durationField86, and durationField80", !(durationField80.compareTo(durationField86) == 0) || (Math.signum(durationField80.compareTo(durationField80)) == Math.signum(durationField86.compareTo(durationField80))));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.year();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.minuteOfHour();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean15 = interval11.abuts((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Interval interval17 = interval14.withDurationBeforeEnd(readableDuration16);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean24 = interval20.abuts((org.joda.time.ReadableInterval) interval23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Interval interval26 = interval23.withDurationBeforeEnd(readableDuration25);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean33 = interval29.abuts((org.joda.time.ReadableInterval) interval32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Interval interval35 = interval32.withDurationBeforeEnd(readableDuration34);
        org.joda.time.Period period36 = interval32.toPeriod();
        org.joda.time.Interval interval37 = interval23.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Interval interval38 = interval14.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period36);
        int[] intArray41 = chronology6.get((org.joda.time.ReadablePeriod) period36, (long) 363, (long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusMinutes(4503347);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean49 = interval48.isBeforeNow();
        org.joda.time.Period period50 = interval48.toPeriod();
        java.lang.String str51 = period50.toString();
        org.joda.time.MutablePeriod mutablePeriod52 = period50.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod53 = period50.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone57);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight58.withWeekyear(2);
        org.joda.time.DateMidnight.Property property63 = dateMidnight58.weekOfWeekyear();
        java.util.Locale locale64 = java.util.Locale.CHINESE;
        java.lang.String str65 = property63.getAsShortText(locale64);
        java.lang.String str66 = dateTimeZone54.getShortName((long) 9, locale64);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime68 = org.joda.time.MutableDateTime.now(dateTimeZone54);
        org.joda.time.Chronology chronology69 = mutableDateTime68.getChronology();
        org.joda.time.Chronology chronology70 = mutableDateTime68.getChronology();
        boolean boolean71 = mutablePeriod53.equals((java.lang.Object) chronology70);
        org.joda.time.DateTime dateTime72 = dateTime45.plus((org.joda.time.ReadablePeriod) mutablePeriod53);
        java.lang.String str73 = mutablePeriod53.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime42 and dateTime67", (mutableDateTime42.compareTo(dateTime67) == 0) == mutableDateTime42.equals(dateTime67));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.hourOfDay();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.Chronology chronology13 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekOfWeekyear();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.year();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.minuteOfHour();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean31 = interval27.abuts((org.joda.time.ReadableInterval) interval30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Interval interval33 = interval30.withDurationBeforeEnd(readableDuration32);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean40 = interval36.abuts((org.joda.time.ReadableInterval) interval39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Interval interval42 = interval39.withDurationBeforeEnd(readableDuration41);
        org.joda.time.Interval interval45 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean49 = interval45.abuts((org.joda.time.ReadableInterval) interval48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Interval interval51 = interval48.withDurationBeforeEnd(readableDuration50);
        org.joda.time.Period period52 = interval48.toPeriod();
        org.joda.time.Interval interval53 = interval39.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period52);
        org.joda.time.Interval interval54 = interval30.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period52);
        int[] intArray57 = chronology22.get((org.joda.time.ReadablePeriod) period52, (long) 363, (long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime58 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.DateTimeField dateTimeField59 = chronology22.dayOfMonth();
        org.joda.time.TimeOfDay timeOfDay60 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 26723186, chronology22);
        org.joda.time.DurationField durationField61 = chronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField62 = chronology22.secondOfMinute();
        java.util.Locale locale63 = java.util.Locale.GERMAN;
        boolean boolean64 = locale63.hasExtensions();
        int int65 = dateTimeField62.getMaximumShortTextLength(locale63);
        int int66 = dateTimeField14.getMaximumShortTextLength(locale63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField61", Math.signum(durationField9.compareTo(durationField61)) == -Math.signum(durationField61.compareTo(durationField9)));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology7.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.clockhourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4, chronology7);
        org.joda.time.DateTimeField dateTimeField15 = chronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = chronology7.secondOfMinute();
        org.joda.time.DurationField durationField17 = dateTimeField16.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField17, and durationField9", !(durationField9.compareTo(durationField17) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField17.compareTo(durationField9))));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        java.lang.Object obj17 = mutableDateTime16.clone();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = dateTime23.toString(dateTimeFormatter24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTime((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.clockhourOfHalfday();
        org.joda.time.DurationField durationField35 = chronology33.eras();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType26.getField(chronology33);
        org.joda.time.DateTimeField dateTimeField37 = chronology33.hourOfDay();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(chronology33);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight41.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property47 = dateMidnight46.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean49 = dateMidnight46.isSupported(dateTimeFieldType48);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant56 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime57 = timeOfDay54.toDateTime((org.joda.time.ReadableInstant) instant56);
        org.joda.time.Chronology chronology58 = instant56.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.clockhourOfHalfday();
        org.joda.time.DurationField durationField60 = chronology58.eras();
        org.joda.time.DateTimeField dateTimeField61 = dateTimeFieldType51.getField(chronology58);
        org.joda.time.DateTimeField dateTimeField62 = chronology58.hourOfDay();
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((long) 22, chronology58);
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType48.getField(chronology58);
        int int65 = localTime38.indexOf(dateTimeFieldType48);
        org.joda.time.DateTime.Property property66 = dateTime23.property(dateTimeFieldType48);
        org.joda.time.DurationFieldType durationFieldType67 = dateTimeFieldType48.getDurationType();
        mutableDateTime16.add(durationFieldType67, 5);
        org.joda.time.TimeOfDay timeOfDay73 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant75 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime76 = timeOfDay73.toDateTime((org.joda.time.ReadableInstant) instant75);
        org.joda.time.Chronology chronology77 = instant75.getChronology();
        org.joda.time.TimeOfDay timeOfDay80 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant82 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime83 = timeOfDay80.toDateTime((org.joda.time.ReadableInstant) instant82);
        int[] intArray85 = chronology77.get((org.joda.time.ReadablePartial) timeOfDay80, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime(0L, chronology77);
        org.joda.time.DurationField durationField87 = chronology77.halfdays();
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime(chronology77);
        org.joda.time.DateTime dateTime89 = org.joda.time.DateTime.now(chronology77);
        boolean boolean90 = durationFieldType67.isSupported(chronology77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField87", Math.signum(durationField35.compareTo(durationField87)) == -Math.signum(durationField87.compareTo(durationField35)));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        org.joda.time.DateTime dateTime35 = mutableDateTime16.toDateTimeISO();
        org.joda.time.LocalTime localTime36 = dateTime35.toLocalTime();
        java.util.GregorianCalendar gregorianCalendar37 = dateTime35.toGregorianCalendar();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        int[] intArray53 = chronology45.get((org.joda.time.ReadablePartial) timeOfDay48, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(0L, chronology45);
        int int55 = mutableDateTime54.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime54.property(dateTimeFieldType56);
        mutableDateTime54.setMillisOfDay(2);
        org.joda.time.Instant instant61 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone62 = instant61.getZone();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(dateTimeZone62);
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.DateTime dateTime66 = dateTime63.withDurationAdded(readableDuration64, (int) (byte) 0);
        org.joda.time.DateTime dateTime68 = dateTime63.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime70 = dateTime68.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime72 = dateTime70.plusDays(2);
        org.joda.time.DateTime dateTime74 = dateTime72.minusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay78 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant80 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime81 = timeOfDay78.toDateTime((org.joda.time.ReadableInstant) instant80);
        org.joda.time.Chronology chronology82 = instant80.getChronology();
        org.joda.time.DateTimeField dateTimeField83 = chronology82.clockhourOfHalfday();
        org.joda.time.DurationField durationField84 = chronology82.eras();
        org.joda.time.DateTimeField dateTimeField85 = dateTimeFieldType75.getField(chronology82);
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime74, chronology82);
        org.joda.time.MutableDateTime mutableDateTime87 = mutableDateTime54.toMutableDateTime(chronology82);
        org.joda.time.DateTimeField dateTimeField88 = chronology82.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField89 = chronology82.hourOfHalfday();
        boolean boolean90 = gregorianCalendar37.before((java.lang.Object) chronology82);
        org.joda.time.DurationField durationField91 = chronology82.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField84, durationField91, and durationField84", !(durationField84.compareTo(durationField91) == 0) || (Math.signum(durationField84.compareTo(durationField84)) == Math.signum(durationField91.compareTo(durationField84))));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.dayOfMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        long long23 = dateTimeField21.roundHalfFloor(0L);
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        int int25 = dateTimeField21.getMaximumShortTextLength(locale24);
        java.lang.String str26 = locale24.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology13, locale24);
        java.util.Locale locale28 = dateTimeParserBucket27.getLocale();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Chronology chronology35 = instant33.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime41 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) instant40);
        int[] intArray43 = chronology35.get((org.joda.time.ReadablePartial) timeOfDay38, (long) (short) -1);
        boolean boolean44 = dateTimeParserBucket27.restoreState((java.lang.Object) (short) -1);
        java.util.Locale locale45 = dateTimeParserBucket27.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(9L, chronology7, locale45, (java.lang.Integer) 11, 365);
        java.util.Locale locale49 = dateTimeParserBucket48.getLocale();
        long long52 = dateTimeParserBucket48.computeMillis(false, "25");
        org.joda.time.Chronology chronology53 = dateTimeParserBucket48.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.hourOfDay();
        org.joda.time.DurationField durationField55 = chronology53.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField55, and durationField9", !(durationField9.compareTo(durationField55) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField55.compareTo(durationField9))));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property21 = localTime20.hourOfDay();
        org.joda.time.LocalTime localTime22 = property21.roundFloorCopy();
        org.joda.time.LocalTime localTime24 = property21.setCopy(0);
        org.joda.time.LocalTime localTime26 = property21.addWrapFieldToCopy(7);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray30 = timeOfDay29.getValues();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay33.minusMinutes((int) '4');
        int int39 = timeOfDay29.compareTo((org.joda.time.ReadablePartial) timeOfDay33);
        org.joda.time.DateTimeField[] dateTimeFieldArray40 = timeOfDay33.getFields();
        int[] intArray41 = timeOfDay33.getValues();
        chronology8.validate((org.joda.time.ReadablePartial) localTime26, intArray41);
        org.joda.time.DurationField durationField43 = chronology8.days();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(52L, chronology8);
        org.joda.time.DurationField durationField45 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField18, and durationField43", !(durationField45.compareTo(durationField18) == 0) || (Math.signum(durationField45.compareTo(durationField43)) == Math.signum(durationField18.compareTo(durationField43))));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay3.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay3.withMillisOfSecond(1);
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str15 = dateTimeZone14.toString();
        java.util.TimeZone timeZone16 = dateTimeZone14.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfHalfday();
        long long26 = dateTimeField24.roundHalfFloor(0L);
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        int int28 = dateTimeField24.getMaximumShortTextLength(locale27);
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale30 = locale29.stripExtensions();
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = locale27.getDisplayLanguage(locale29);
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone16, locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(75600035L, chronology11, locale27);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(chronology11);
        org.joda.time.DurationField durationField38 = chronology11.weeks();
        long long40 = durationField38.getMillis(26731222);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.clockhourOfHalfday();
        org.joda.time.DurationField durationField49 = chronology47.eras();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology47.getZone();
        org.joda.time.DateTimeField dateTimeField52 = chronology47.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = chronology47.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField54 = chronology47.era();
        org.joda.time.DurationField durationField55 = chronology47.eras();
        int int56 = durationField38.compareTo(durationField55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField55, durationField38, and durationField55", !(durationField55.compareTo(durationField38) == 0) || (Math.signum(durationField55.compareTo(durationField55)) == Math.signum(durationField38.compareTo(durationField55))));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        java.util.TimeZone timeZone4 = dateTimeZone2.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        long long14 = dateTimeField12.roundHalfFloor(0L);
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        int int16 = dateTimeField12.getMaximumShortTextLength(locale15);
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale17.getDisplayName(locale19);
        java.lang.String str22 = locale15.getDisplayLanguage(locale17);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone4, locale15);
        java.util.TimeZone.setDefault(timeZone4);
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        int[] intArray40 = chronology32.get((org.joda.time.ReadablePartial) timeOfDay35, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, chronology32);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Chronology chronology48 = instant46.getChronology();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        int[] intArray56 = chronology48.get((org.joda.time.ReadablePartial) timeOfDay51, (long) (short) -1);
        mutableDateTime41.setChronology(chronology48);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(chronology48);
        org.joda.time.DateTimeField dateTimeField59 = chronology48.weekOfWeekyear();
        java.util.Locale locale61 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale64 = locale63.stripExtensions();
        java.lang.String str65 = locale61.getDisplayName(locale63);
        java.lang.String str66 = dateTimeField59.getAsText(2022, locale61);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone4, locale61);
        java.util.TimeZone.setDefault(timeZone4);
        int int70 = timeZone4.getOffset((long) 100);
        java.util.TimeZone timeZone72 = java.util.TimeZone.getTimeZone("clockhourOfHalfday");
        boolean boolean73 = timeZone4.hasSameRules(timeZone72);
        java.util.Locale locale75 = new java.util.Locale("10");
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(timeZone72, locale75);
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(timeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar76", (calendar23.compareTo(calendar76) == 0) == calendar23.equals(calendar76));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType1.getField(chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 365, chronology8);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfEra();
        org.joda.time.DurationField durationField15 = chronology8.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField15, and durationField10", !(durationField10.compareTo(durationField15) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField15.compareTo(durationField10))));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean11 = dateMidnight8.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType13.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.hourOfDay();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 22, chronology20);
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType10.getField(chronology20);
        org.joda.time.DateMidnight dateMidnight27 = org.joda.time.DateMidnight.now(chronology20);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.minuteOfDay();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str35 = property33.getAsShortText(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((-2678399900L), chronology20, locale34, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField38 = chronology20.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField38, and durationField22", !(durationField22.compareTo(durationField38) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField38.compareTo(durationField22))));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale2.getDisplayName();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((-1725357600000L), chronology1, locale2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(30);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        dateTimeParserBucket4.setZone(dateTimeZone6);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property11 = localTime10.hourOfDay();
        org.joda.time.LocalTime localTime12 = property11.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime14 = property11.setCopy(1);
        org.joda.time.LocalTime localTime16 = property11.setCopy(14);
        org.joda.time.LocalTime localTime17 = property11.roundHalfEvenCopy();
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localTime17.toDateTimeToday(dateTimeZone20);
        dateTimeParserBucket4.setZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateTime21", (mutableDateTime7.compareTo(dateTime21) == 0) == mutableDateTime7.equals(dateTime21));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay2.minusMinutes((int) (short) -1);
        int int15 = timeOfDay14.size();
        java.lang.String str17 = timeOfDay14.toString("1");
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.year();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.minuteOfHour();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean33 = interval29.abuts((org.joda.time.ReadableInterval) interval32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Interval interval35 = interval32.withDurationBeforeEnd(readableDuration34);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean42 = interval38.abuts((org.joda.time.ReadableInterval) interval41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Interval interval44 = interval41.withDurationBeforeEnd(readableDuration43);
        org.joda.time.Interval interval47 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval50 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean51 = interval47.abuts((org.joda.time.ReadableInterval) interval50);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.Interval interval53 = interval50.withDurationBeforeEnd(readableDuration52);
        org.joda.time.Period period54 = interval50.toPeriod();
        org.joda.time.Interval interval55 = interval41.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Interval interval56 = interval32.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period54);
        int[] intArray59 = chronology24.get((org.joda.time.ReadablePeriod) period54, (long) 363, (long) (byte) 100);
        org.joda.time.TimeOfDay timeOfDay60 = timeOfDay14.plus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay60.withSecondOfMinute(50);
        org.joda.time.TimeOfDay timeOfDay66 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant68 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime69 = timeOfDay66.toDateTime((org.joda.time.ReadableInstant) instant68);
        org.joda.time.Chronology chronology70 = instant68.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.clockhourOfHalfday();
        org.joda.time.DurationField durationField72 = chronology70.eras();
        org.joda.time.DateTimeField dateTimeField73 = chronology70.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone74 = chronology70.getZone();
        org.joda.time.DateTimeField dateTimeField75 = chronology70.clockhourOfDay();
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(3098892765600052L, chronology70);
        org.joda.time.TimeOfDay timeOfDay77 = timeOfDay62.withChronologyRetainFields(chronology70);
        org.joda.time.TimeOfDay.Property property78 = timeOfDay62.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay82 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant84 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime85 = timeOfDay82.toDateTime((org.joda.time.ReadableInstant) instant84);
        org.joda.time.Chronology chronology86 = instant84.getChronology();
        org.joda.time.DateTimeField dateTimeField87 = chronology86.clockhourOfHalfday();
        org.joda.time.DurationField durationField88 = chronology86.eras();
        org.joda.time.DateTimeField dateTimeField89 = dateTimeFieldType79.getField(chronology86);
        org.joda.time.DateTimeField dateTimeField90 = chronology86.hourOfDay();
        org.joda.time.DateTime dateTime91 = new org.joda.time.DateTime(chronology86);
        org.joda.time.TimeOfDay timeOfDay92 = timeOfDay62.withChronologyRetainFields(chronology86);
        org.joda.time.DateTimeField dateTimeField93 = chronology86.yearOfCentury();
        org.joda.time.DurationField durationField94 = dateTimeField93.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField72, durationField94, and durationField72", !(durationField72.compareTo(durationField94) == 0) || (Math.signum(durationField72.compareTo(durationField72)) == Math.signum(durationField94.compareTo(durationField72))));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTimeISO();
        mutableDateTime2.addSeconds(24);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.monthOfYear();
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime9.add(readableDuration11, (int) (short) 10);
        boolean boolean14 = mutableDateTime9.isEqualNow();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime9.add(durationFieldType15, (int) 'u');
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean21 = interval20.isBeforeNow();
        org.joda.time.Period period22 = interval20.toPeriod();
        mutableDateTime9.add((org.joda.time.ReadablePeriod) period22, 21);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime29 = localTime27.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime31 = localTime27.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime.Property property32 = localTime27.minuteOfHour();
        org.joda.time.Chronology chronology33 = localTime27.getChronology();
        org.joda.time.DurationField durationField34 = durationFieldType25.getField(chronology33);
        int int35 = period22.get(durationFieldType25);
        mutableDateTime2.add(durationFieldType25, 0);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Chronology chronology46 = instant44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfHalfday();
        long long49 = dateTimeField47.roundHalfFloor(0L);
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        int int51 = dateTimeField47.getMaximumShortTextLength(locale50);
        java.lang.String str52 = locale50.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology39, locale50);
        java.util.Locale locale54 = dateTimeParserBucket53.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.secondOfDay();
        java.util.Locale locale57 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale58 = locale57.stripExtensions();
        dateTimeParserBucket53.saveField(dateTimeFieldType55, "zh", locale57);
        dateTimeParserBucket53.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone62 = dateTimeParserBucket53.getZone();
        org.joda.time.Chronology chronology63 = dateTimeParserBucket53.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.eras();
        mutableDateTime2.setChronology(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField34 and durationField64", Math.signum(durationField34.compareTo(durationField64)) == -Math.signum(durationField64.compareTo(durationField34)));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withDurationAdded((long) 2, 100);
        int int14 = dateMidnight2.compareTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight2.plus(readablePeriod15);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = dateTime22.toString(dateTimeFormatter23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.clockhourOfHalfday();
        org.joda.time.DurationField durationField34 = chronology32.eras();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType25.getField(chronology32);
        org.joda.time.DateTimeField dateTimeField36 = chronology32.hourOfDay();
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(chronology32);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone39);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight40.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property46 = dateMidnight45.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean48 = dateMidnight45.isSupported(dateTimeFieldType47);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant55 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTime((org.joda.time.ReadableInstant) instant55);
        org.joda.time.Chronology chronology57 = instant55.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.clockhourOfHalfday();
        org.joda.time.DurationField durationField59 = chronology57.eras();
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType50.getField(chronology57);
        org.joda.time.DateTimeField dateTimeField61 = chronology57.hourOfDay();
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime((long) 22, chronology57);
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType47.getField(chronology57);
        int int64 = localTime37.indexOf(dateTimeFieldType47);
        org.joda.time.DateTime.Property property65 = dateTime22.property(dateTimeFieldType47);
        org.joda.time.DurationFieldType durationFieldType66 = dateTimeFieldType47.getDurationType();
        org.joda.time.DurationFieldType durationFieldType67 = dateTimeFieldType47.getDurationType();
        java.lang.String str68 = dateTimeFieldType47.toString();
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight2.withField(dateTimeFieldType47, 366);
        org.joda.time.Interval interval73 = new org.joda.time.Interval(30L, 1920019L);
        org.joda.time.TimeOfDay timeOfDay77 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant79 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime80 = timeOfDay77.toDateTime((org.joda.time.ReadableInstant) instant79);
        org.joda.time.Chronology chronology81 = instant79.getChronology();
        org.joda.time.TimeOfDay timeOfDay84 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant86 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime87 = timeOfDay84.toDateTime((org.joda.time.ReadableInstant) instant86);
        int[] intArray89 = chronology81.get((org.joda.time.ReadablePartial) timeOfDay84, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime90 = new org.joda.time.MutableDateTime(0L, chronology81);
        org.joda.time.DurationField durationField91 = chronology81.halfdays();
        org.joda.time.MutableDateTime mutableDateTime92 = new org.joda.time.MutableDateTime(chronology81);
        boolean boolean93 = interval73.contains((org.joda.time.ReadableInstant) mutableDateTime92);
        boolean boolean94 = dateMidnight2.isBefore((org.joda.time.ReadableInstant) mutableDateTime92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField34 and durationField91", Math.signum(durationField34.compareTo(durationField91)) == -Math.signum(durationField91.compareTo(durationField34)));
    }
}

