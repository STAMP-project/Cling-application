import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket5.saveField(dateTimeField6, (int) (short) 0);
        java.lang.Integer int9 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket5.setZone(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime19.withDurationAdded((long) 2022, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime19.getZone();
        int int24 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime.Property property25 = dateTime19.hourOfDay();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.parse("2022-02-21T15:06:35.241+00:00:00.052");
        int int28 = dateTime27.getDayOfYear();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.millisOfSecond();
        org.joda.time.DurationField durationField36 = chronology32.seconds();
        org.joda.time.DurationField durationField37 = chronology32.centuries();
        org.joda.time.DateTimeField dateTimeField38 = chronology32.millisOfSecond();
        org.joda.time.DurationField durationField39 = chronology32.years();
        org.joda.time.Chronology chronology40 = chronology32.withUTC();
        org.joda.time.DurationField durationField41 = chronology40.months();
        boolean boolean42 = durationFieldType29.isSupported(chronology40);
        org.joda.time.DateTimeField dateTimeField43 = chronology40.secondOfMinute();
        org.joda.time.DateTime dateTime44 = dateTime27.withChronology(chronology40);
        long long45 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime47 = dateTime44.plus(readablePeriod46);
        org.joda.time.DateTime dateTime49 = dateTime44.plus((long) 54642810);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime44", (dateTime27.compareTo(dateTime44) == 0) == dateTime27.equals(dateTime44));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours((int) (byte) 0);
        boolean boolean6 = dateTime4.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) 'a');
        boolean boolean11 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime();
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology18 = dateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) dateTime12, chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = chronology18.getZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(788923800000L, chronology18);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekyear((-1));
        org.joda.time.DateTime dateTime29 = dateTime27.plusMonths(10);
        org.joda.time.DateTime.Property property30 = dateTime29.minuteOfDay();
        int int31 = dateTime29.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime35 = dateTime29.withZone(dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.withPeriodAdded(readablePeriod36, 13);
        boolean boolean39 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime41 = dateTime22.withCenturyOfEra(647);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.plusHours((int) (byte) 0);
        boolean boolean47 = dateTime45.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.minusWeeks((int) 'a');
        boolean boolean52 = dateTime45.isAfter((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime53 = dateTime51.toDateTime();
        org.joda.time.Chronology chronology54 = dateTime53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.hourOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = dateTimeField57.getType();
        int int59 = dateTime41.get(dateTimeFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime35", (dateTime29.compareTo(dateTime35) == 0) == dateTime29.equals(dateTime35));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.era();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property14 = localDateTime8.property(dateTimeFieldType13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar19 = dateTime18.toGregorianCalendar();
        org.joda.time.DateTime dateTime21 = dateTime18.withWeekyear((int) 'x');
        int int22 = property14.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology23 = dateTime21.getChronology();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder24.setExtension('a', "cinese");
        java.util.Locale locale28 = builder24.build();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(3061065600001L, chronology23, locale28);
        org.joda.time.DateTimeField dateTimeField30 = chronology23.millisOfSecond();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((-25780780800000L), chronology23);
        org.joda.time.DurationField durationField32 = chronology23.months();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.millisOfSecond();
        org.joda.time.DurationField durationField39 = chronology35.seconds();
        org.joda.time.DurationField durationField40 = chronology35.centuries();
        org.joda.time.DateTimeField dateTimeField41 = chronology35.millisOfSecond();
        org.joda.time.DurationField durationField42 = chronology35.years();
        org.joda.time.Chronology chronology43 = chronology35.withUTC();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.withWeekyear((-1));
        org.joda.time.DateTime dateTime50 = dateTime48.plusMonths(10);
        org.joda.time.DateTime.Property property51 = dateTime50.minuteOfDay();
        int int52 = dateTime50.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone55 = dateTimeZone54.toTimeZone();
        org.joda.time.DateTime dateTime56 = dateTime50.withZone(dateTimeZone54);
        java.util.Locale locale58 = java.util.Locale.ITALIAN;
        java.lang.String str59 = dateTimeZone54.getName((long) 26, locale58);
        long long62 = dateTimeZone54.adjustOffset((long) 657, false);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = dateTime64.plusHours((int) (byte) 0);
        boolean boolean68 = dateTime66.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone70 = dateTimeZone69.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime66.toMutableDateTime(dateTimeZone69);
        long long73 = dateTimeZone54.getMillisKeepLocal(dateTimeZone69, 657L);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(dateTimeZone69);
        org.joda.time.Chronology chronology75 = chronology35.withZone(dateTimeZone69);
        org.joda.time.DateTimeZone dateTimeZone76 = chronology75.getZone();
        java.util.Locale locale78 = java.util.Locale.CHINESE;
        java.lang.String str79 = locale78.getDisplayScript();
        java.lang.String str80 = locale78.getDisplayLanguage();
        java.lang.String str81 = dateTimeZone76.getName(4800697605603L, locale78);
        org.joda.time.Chronology chronology82 = chronology23.withZone(dateTimeZone76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and dateTime56", (dateTime50.compareTo(dateTime56) == 0) == dateTime50.equals(dateTime56));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.era();
        boolean boolean7 = localDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfMinute();
        boolean boolean13 = dateTimeFieldType6.isSupported(chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj0, chronology10);
        org.joda.time.DateTimeField dateTimeField16 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField17 = chronology10.centuries();
        org.joda.time.DurationField durationField18 = chronology10.millis();
        org.joda.time.DateTimeField dateTimeField19 = chronology10.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime26 = property23.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusMinutes(20);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.plus(readableDuration31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks(536);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusHours((int) (byte) 0);
        boolean boolean41 = dateTime39.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusWeeks((int) 'a');
        boolean boolean46 = dateTime39.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime47 = dateTime45.toDateTime();
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology53 = dateTime50.getChronology();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((java.lang.Object) dateTime47, chronology53);
        org.joda.time.DateTimeZone dateTimeZone56 = chronology53.getZone();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(788923800000L, chronology53);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime57.getZone();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.withWeekyear((-1));
        org.joda.time.DateTime dateTime64 = dateTime62.plusMonths(10);
        org.joda.time.DateTime.Property property65 = dateTime64.minuteOfDay();
        int int66 = dateTime64.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        org.joda.time.DateTime dateTime70 = dateTime64.withZone(dateTimeZone68);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.DateTime dateTime73 = dateTime70.withPeriodAdded(readablePeriod71, 13);
        boolean boolean74 = dateTime57.isEqual((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime75 = localDateTime34.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        org.joda.time.LocalDateTime localDateTime77 = localDateTime34.minus(readablePeriod76);
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology80 = localDateTime79.getChronology();
        org.joda.time.LocalDateTime.Property property81 = localDateTime79.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime82 = property81.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime84 = property81.addWrapFieldToCopy(28);
        java.lang.String str86 = localDateTime84.toString("-292275054");
        int int87 = localDateTime84.getMinuteOfHour();
        int[] intArray88 = localDateTime84.getValues();
        int int89 = dateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) localDateTime34, intArray88);
        java.lang.String str90 = localDateTime34.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime64 and dateTime70", (dateTime64.compareTo(dateTime70) == 0) == dateTime64.equals(dateTime70));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours((int) (byte) 0);
        boolean boolean6 = dateTime4.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) 'a');
        boolean boolean11 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime();
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology18 = dateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) dateTime12, chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = chronology18.getZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(788923800000L, chronology18);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekyear((-1));
        org.joda.time.DateTime dateTime29 = dateTime27.plusMonths(10);
        org.joda.time.DateTime.Property property30 = dateTime29.minuteOfDay();
        int int31 = dateTime29.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime35 = dateTime29.withZone(dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.withPeriodAdded(readablePeriod36, 13);
        boolean boolean39 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean40 = dateTime22.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime35", (dateTime29.compareTo(dateTime35) == 0) == dateTime29.equals(dateTime35));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket5.saveField(dateTimeField6, (int) (short) 0);
        java.lang.Integer int9 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket5.setZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekyear((-1));
        org.joda.time.DateTime dateTime17 = dateTime13.plusHours((int) (byte) 100);
        boolean boolean19 = dateTime17.isBefore((long) ' ');
        int int20 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime22 = dateTime17.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.era();
        boolean boolean29 = localDateTime27.isSupported(dateTimeFieldType28);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.secondOfMinute();
        boolean boolean35 = dateTimeFieldType28.isSupported(chronology32);
        org.joda.time.DateTimeField dateTimeField36 = chronology32.clockhourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = dateTimeField36.getType();
        org.joda.time.DateTime dateTime39 = dateTime22.withField(dateTimeFieldType37, 24);
        org.joda.time.Instant instant40 = dateTime39.toInstant();
        java.lang.String str41 = dateTime39.toString();
        org.joda.time.DateTime dateTime43 = dateTime39.minusMillis(52);
        org.joda.time.DateTime dateTime45 = dateTime43.minusYears(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant40", (dateTime39.compareTo(instant40) == 0) == dateTime39.equals(instant40));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        int int6 = dateTime1.getDayOfYear();
        long long7 = dateTime1.getMillis();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.era();
        boolean boolean14 = localDateTime12.isSupported(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.secondOfMinute();
        boolean boolean20 = dateTimeFieldType13.isSupported(chronology17);
        org.joda.time.DateTime dateTime21 = dateTime1.toDateTime(chronology17);
        long long22 = dateTime1.getMillis();
        int int23 = dateTime1.getYear();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime1.plus(readableDuration24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime21", (dateTime27.compareTo(dateTime21) == 0) == dateTime27.equals(dateTime21));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) ' ');
        long long13 = chronology4.set((org.joda.time.ReadablePartial) localDateTime11, (long) 99);
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale14.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 212, chronology4, locale14, (java.lang.Integer) (-1), (-948));
        org.joda.time.DateTimeField dateTimeField19 = chronology4.minuteOfHour();
        org.joda.time.DurationField durationField20 = chronology4.years();
        org.joda.time.DateTimeField dateTimeField21 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = chronology4.minuteOfHour();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder23.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale.Builder builder26 = builder23.clearExtensions();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = chronology29.millisOfSecond();
        org.joda.time.DurationField durationField33 = chronology29.seconds();
        org.joda.time.DurationField durationField34 = chronology29.centuries();
        org.joda.time.DateTimeField dateTimeField35 = chronology29.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.millisOfSecond();
        int int40 = property39.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime41 = property39.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plus(readableDuration42);
        int int44 = localDateTime41.getYearOfCentury();
        java.util.Locale locale46 = new java.util.Locale("15");
        java.lang.String str47 = locale46.getScript();
        java.lang.String str48 = dateTimeField35.getAsShortText((org.joda.time.ReadablePartial) localDateTime41, locale46);
        org.joda.time.LocalDateTime.Property property49 = localDateTime41.hourOfDay();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology57 = localDateTime56.getChronology();
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology57.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology62 = localDateTime61.getChronology();
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now(chronology62);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property69 = dateTime66.centuryOfEra();
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        java.lang.String str71 = locale70.getLanguage();
        java.lang.String str72 = property69.getAsText(locale70);
        java.lang.String str73 = dateTimeField59.getAsText((org.joda.time.ReadablePartial) localDateTime63, (-1), locale70);
        java.util.Locale locale75 = java.util.Locale.ITALIAN;
        java.lang.String str76 = locale75.getLanguage();
        java.lang.String str77 = dateTimeField59.getAsShortText((int) (byte) 10, locale75);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket((long) 9999, chronology53, locale75, (java.lang.Integer) 54616882);
        java.lang.String str80 = property49.getAsText(locale75);
        java.util.Locale.Builder builder81 = builder26.setLocale(locale75);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale75, (java.lang.Integer) 54381, 569);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((java.lang.Object) dateTime85);
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean89 = dateTimeZone88.isFixed();
        org.joda.time.DateTime dateTime90 = new org.joda.time.DateTime(dateTimeZone88);
        long long92 = dateTimeZone88.nextTransition(0L);
        org.joda.time.MutableDateTime mutableDateTime93 = dateTime86.toMutableDateTime(dateTimeZone88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and dateTime85", (dateTime66.compareTo(dateTime85) == 0) == dateTime66.equals(dateTime85));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(chronology4);
        java.lang.String str6 = chronology4.toString();
        org.joda.time.DurationField durationField7 = chronology4.hours();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.secondOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusMonths((int) (byte) 100);
        int[] intArray15 = chronology4.get((org.joda.time.ReadablePartial) localDateTime13, 100L);
        org.joda.time.DateTimeField dateTimeField16 = chronology4.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.weekyearOfCentury();
        long long24 = dateTimeField21.add((long) 2922789, 100L);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 0);
        java.util.Locale locale28 = java.util.Locale.ITALY;
        java.lang.String str29 = locale28.getDisplayVariant();
        java.lang.String str30 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localDateTime26, 576, locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 54399, chronology4, locale28);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 'a', chronology4);
        org.joda.time.DateTimeField dateTimeField33 = chronology4.weekyearOfCentury();
        org.joda.time.Chronology chronology34 = chronology4.withUTC();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusHours((int) (byte) 0);
        boolean boolean40 = dateTime38.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusWeeks((int) 'a');
        boolean boolean45 = dateTime38.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = dateTime44.toDateTime();
        org.joda.time.DateTime dateTime48 = dateTime44.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property53 = localDateTime50.weekyear();
        boolean boolean54 = dateTime48.equals((java.lang.Object) localDateTime50);
        org.joda.time.DateTime dateTime56 = dateTime48.minusMonths(54616882);
        org.joda.time.LocalDateTime localDateTime57 = dateTime56.toLocalDateTime();
        org.joda.time.Chronology chronology58 = localDateTime57.getChronology();
        org.joda.time.LocalDateTime.Property property59 = localDateTime57.weekyear();
        int[] intArray61 = chronology4.get((org.joda.time.ReadablePartial) localDateTime57, 1645456412676L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime36", (dateTime5.compareTo(dateTime36) == 0) == dateTime5.equals(dateTime36));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minusMinutes(26);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime6.withFieldAdded(durationFieldType12, 70);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology18);
        java.lang.String str20 = chronology18.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.Chronology chronology24 = chronology18.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField25 = chronology18.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(35999999L, chronology18);
        org.joda.time.DurationField durationField28 = chronology18.minutes();
        boolean boolean29 = durationFieldType12.isSupported(chronology18);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(chronology33);
        java.lang.String str35 = chronology33.toString();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.Chronology chronology39 = chronology33.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField40 = chronology33.seconds();
        java.util.Locale locale41 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology33, locale41, (java.lang.Integer) 25, 2922789);
        org.joda.time.DurationField durationField45 = durationFieldType12.getField(chronology33);
        org.joda.time.Chronology chronology46 = chronology33.withUTC();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        long long50 = chronology33.add(readablePeriod47, (long) 3, (-456967));
        org.joda.time.Chronology chronology51 = chronology33.withUTC();
        org.joda.time.DurationField durationField52 = chronology51.halfdays();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.weekyearOfCentury();
        org.joda.time.DurationField durationField55 = chronology51.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField55, durationField28, and durationField40", !(durationField55.compareTo(durationField28) == 0) || (Math.signum(durationField55.compareTo(durationField40)) == Math.signum(durationField28.compareTo(durationField40))));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours((int) (byte) 0);
        boolean boolean6 = dateTime4.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime4.toMutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.era();
        int int11 = mutableDateTime9.get(dateTimeFieldType10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.secondOfMinute();
        org.joda.time.DurationField durationField17 = chronology14.millis();
        boolean boolean18 = dateTimeFieldType10.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField19 = chronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology14.hourOfDay();
        org.joda.time.DurationField durationField21 = chronology14.months();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime28 = dateTime26.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime30 = dateTime26.minusDays(0);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime26.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withWeekyear((-1));
        org.joda.time.DateTime dateTime37 = dateTime35.plusMonths(10);
        org.joda.time.DateTime.Property property38 = dateTime37.minuteOfDay();
        int int39 = dateTime37.getYearOfEra();
        boolean boolean40 = dateTime26.isBefore((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology41 = dateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.hourOfHalfday();
        java.util.Locale locale46 = new java.util.Locale("-0001-02-22T15:06:40.971+00:00:00.052");
        java.lang.String str47 = locale46.getScript();
        int int48 = dateTimeField44.getMaximumTextLength(locale46);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 209, chronology14, locale46, (java.lang.Integer) 54822);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime22", (dateTime2.compareTo(dateTime22) == 0) == dateTime2.equals(dateTime22));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime9 = property8.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, 212);
        org.joda.time.DateTime dateTime14 = dateTime9.plusMonths(659);
        org.joda.time.DateTime dateTime15 = dateTime9.withLaterOffsetAtOverlap();
        int int16 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime18 = dateTime9.withMillisOfSecond(581);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusHours((int) (byte) 0);
        boolean boolean24 = dateTime22.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime22.toMutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.era();
        int int29 = mutableDateTime27.get(dateTimeFieldType28);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.secondOfMinute();
        org.joda.time.DurationField durationField35 = chronology32.millis();
        boolean boolean36 = dateTimeFieldType28.isSupported(chronology32);
        org.joda.time.DurationField durationField37 = chronology32.days();
        org.joda.time.DateTimeField dateTimeField38 = chronology32.hourOfDay();
        org.joda.time.DateTime dateTime39 = dateTime18.toDateTime(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime20", (dateTime3.compareTo(dateTime20) == 0) == dateTime3.equals(dateTime20));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        int int6 = dateTime1.getDayOfYear();
        long long7 = dateTime1.getMillis();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.era();
        boolean boolean14 = localDateTime12.isSupported(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.secondOfMinute();
        boolean boolean20 = dateTimeFieldType13.isSupported(chronology17);
        org.joda.time.DateTime dateTime21 = dateTime1.toDateTime(chronology17);
        long long22 = dateTime1.getMillis();
        org.joda.time.DateTime.Property property23 = dateTime1.dayOfWeek();
        int int24 = dateTime1.getWeekyear();
        org.joda.time.DateTime.Property property25 = dateTime1.era();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(chronology29);
        java.lang.String str31 = chronology29.toString();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.Chronology chronology35 = chronology29.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField36 = chronology29.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField37 = chronology29.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(35999999L, chronology29);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays(741);
        int int41 = property25.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime21", (dateTime1.compareTo(dateTime21) == 0) == dateTime1.equals(dateTime21));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime9.plusMinutes(977);
        int int16 = dateTime15.getCenturyOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.minuteOfDay();
        org.joda.time.Instant instant18 = dateTime15.toInstant();
        org.joda.time.DateTime dateTime20 = dateTime15.plusWeeks(212460000);
        org.joda.time.DateTime dateTime22 = dateTime15.plusHours(68984492);
        boolean boolean23 = dateTime22.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(212);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime localDateTime11 = property9.addWrapFieldToCopy(576);
        boolean boolean12 = property9.isLeap();
        org.joda.time.LocalDateTime localDateTime14 = property9.addWrapFieldToCopy(536);
        org.joda.time.LocalDateTime localDateTime15 = property9.roundHalfFloorCopy();
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfEra();
        org.joda.time.DateTime dateTime30 = dateTime27.plusDays(703);
        org.joda.time.DateTime dateTime32 = dateTime30.minusMillis(54402249);
        org.joda.time.DateTime dateTime34 = dateTime30.plusHours(54422487);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean37 = dateTimeZone36.isFixed();
        java.lang.String str39 = dateTimeZone36.getShortName(1645455975652L);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        long long42 = dateTimeZone36.getMillisKeepLocal(dateTimeZone40, (long) 239);
        org.joda.time.DateTime dateTime43 = dateTime34.toDateTime(dateTimeZone36);
        boolean boolean45 = dateTime34.isAfter(1586790457484L);
        org.joda.time.DateTime dateTime47 = dateTime34.withYear(54611912);
        int int48 = property18.getDifference((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.plusHours((int) (byte) 0);
        boolean boolean54 = dateTime52.isEqual((long) (short) 100);
        int int55 = dateTime52.getWeekyear();
        org.joda.time.DateTime dateTime57 = dateTime52.plusMinutes(592);
        org.joda.time.DateTime dateTime59 = dateTime57.withYearOfEra(54658023);
        boolean boolean60 = dateTime34.isEqual((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime50", (dateTime23.compareTo(dateTime50) == 0) == dateTime23.equals(dateTime50));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = localDateTime0.toDateTime(readableInstant1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime13 = dateTime10.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean14 = dateTime13.isEqualNow();
        org.joda.time.LocalDateTime localDateTime15 = dateTime13.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.minus(readablePeriod16);
        org.joda.time.DateTime dateTime19 = dateTime13.minusMillis((-948));
        int int20 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime19);
        java.lang.String str21 = dateTime19.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime6", (dateTime2.compareTo(dateTime6) == 0) == dateTime2.equals(dateTime6));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = dateTime1.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime(chronology5);
        org.joda.time.DateTime.Property property8 = dateTime1.hourOfDay();
        org.joda.time.Instant instant9 = dateTime1.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime15 = dateTime11.plusSeconds(26);
        long long16 = dateTime11.getMillis();
        org.joda.time.DateTime.Property property17 = dateTime11.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime11.getZone();
        long long20 = dateTimeZone18.previousTransition((-3279960000L));
        long long22 = dateTimeZone18.convertUTCToLocal(159466911215598000L);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime11", (dateTime7.compareTo(dateTime11) == 0) == dateTime7.equals(dateTime11));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5, filteringMode7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap11);
        java.util.Locale locale13 = java.util.Locale.US;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfDay();
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getVariant();
        java.lang.String str22 = dateTimeField18.getAsText((-1), locale20);
        boolean boolean23 = locale20.hasExtensions();
        java.util.Set<java.lang.String> strSet24 = locale20.getUnicodeLocaleKeys();
        java.lang.String str25 = locale13.getDisplayCountry(locale20);
        java.util.Set<java.lang.String> strSet26 = locale20.getUnicodeLocaleAttributes();
        boolean boolean27 = strSet26.isEmpty();
        java.util.Set<java.lang.String> strSet28 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar33 = dateTime32.toGregorianCalendar();
        int int34 = dateTime32.getMillisOfSecond();
        org.joda.time.DateTime.Property property35 = dateTime32.minuteOfHour();
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property41 = dateTime38.centuryOfEra();
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.lang.String str43 = locale42.getLanguage();
        java.lang.String str44 = property41.getAsText(locale42);
        java.lang.String str45 = locale36.getDisplayName(locale42);
        int int46 = property35.getMaximumTextLength(locale42);
        java.util.Set<java.lang.String> strSet47 = locale42.getUnicodeLocaleAttributes();
        boolean boolean48 = strSet28.retainAll((java.util.Collection<java.lang.String>) strSet47);
        java.util.Spliterator<java.lang.String> strSpliterator49 = strSet47.spliterator();
        java.lang.String[] strArray51 = java.util.TimeZone.getAvailableIDs(467);
        java.lang.CharSequence[] charSequenceArray52 = strSet47.toArray((java.lang.CharSequence[]) strArray51);
        strSet47.clear();
        java.lang.Object[] objArray54 = strSet47.toArray();
        boolean boolean55 = strSet26.addAll((java.util.Collection<java.lang.String>) strSet47);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime30", (dateTime17.compareTo(dateTime30) == 0) == dateTime17.equals(dateTime30));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds(26);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean17 = dateTime16.isEqualNow();
        org.joda.time.LocalDateTime localDateTime18 = dateTime16.toLocalDateTime();
        int int19 = dateTime16.getMonthOfYear();
        int int20 = dateTime16.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime23 = dateTime16.withDurationAdded(readableDuration21, (int) '#');
        int int24 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime23.minusWeeks(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime9", (dateTime1.compareTo(dateTime9) == 0) == dateTime1.equals(dateTime9));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime6 = dateTime1.plusDays(9999);
        org.joda.time.DateTime.Property property7 = dateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.lang.String str9 = dateTimeFieldType8.toString();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.DurationField durationField15 = chronology12.millis();
        boolean boolean16 = dateTimeFieldType8.isSupported(chronology12);
        boolean boolean17 = dateTime1.isSupported(dateTimeFieldType8);
        java.lang.String str18 = dateTimeFieldType8.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime13", (dateTime1.compareTo(dateTime13) == 0) == dateTime1.equals(dateTime13));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = dateTime1.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTime dateTime6 = dateTime1.withChronology(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime1.minusMillis(887);
        int int9 = dateTime1.getMonthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = dateTime1.toString(dateTimeFormatter10);
        org.joda.time.DateTime.Property property12 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime14 = dateTime1.minusMonths(873);
        org.joda.time.DateTime dateTime16 = dateTime1.withCenturyOfEra(605902);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundHalfEvenCopy();
        java.lang.String str22 = property20.getAsText();
        org.joda.time.LocalDateTime localDateTime23 = property20.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        java.lang.String str26 = dateTimeZone24.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        int int29 = dateTimeZone24.getOffset(0L);
        org.joda.time.DateTime dateTime30 = localDateTime23.toDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        java.lang.String str34 = dateTimeZone32.toString();
        long long36 = dateTimeZone24.getMillisKeepLocal(dateTimeZone32, 1645455977932L);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        boolean boolean41 = locale40.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property46 = dateTime43.centuryOfEra();
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        java.lang.String str48 = locale47.getLanguage();
        java.lang.String str49 = property46.getAsText(locale47);
        java.lang.String str50 = locale40.getDisplayLanguage(locale47);
        java.lang.String str51 = locale47.getISO3Language();
        java.lang.String str52 = dateTimeZone32.getShortName((long) (-60590228), locale47);
        org.joda.time.DateTime dateTime53 = dateTime1.withZone(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime43", (dateTime6.compareTo(dateTime43) == 0) == dateTime6.equals(dateTime43));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours((int) (byte) 0);
        boolean boolean7 = dateTime5.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusWeeks((int) 'a');
        boolean boolean12 = dateTime5.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.months();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 956, chronology14);
        org.joda.time.DurationField durationField17 = chronology14.seconds();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((-162L), chronology14);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusDays(212);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.weekyear();
        org.joda.time.LocalDateTime localDateTime30 = property28.addWrapFieldToCopy(576);
        org.joda.time.LocalDateTime localDateTime31 = property28.withMinimumValue();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime34 = property32.addWrapFieldToCopy(671);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withWeekyear(60590228);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusHours(68838);
        long long40 = chronology14.set((org.joda.time.ReadablePartial) localDateTime38, (-3379377L));
        org.joda.time.Chronology chronology41 = localDateTime38.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField15, and durationField17", !(durationField42.compareTo(durationField15) == 0) || (Math.signum(durationField42.compareTo(durationField17)) == Math.signum(durationField15.compareTo(durationField17))));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField5 = dateTimeField4.getLeapDurationField();
        org.joda.time.DurationField durationField6 = dateTimeField4.getLeapDurationField();
        java.lang.String str7 = dateTimeField4.getName();
        int int9 = dateTimeField4.get((-2837998358353L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekyear((-1));
        org.joda.time.DateTime dateTime15 = dateTime11.plusHours((int) (byte) 100);
        int int16 = dateTime11.getDayOfYear();
        int int17 = dateTime11.getDayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime11.plus((long) 21);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.weekyear();
        int int23 = dateTimeField21.getMinimumValue((long) 'x');
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = property27.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withCenturyOfEra(536);
        int int33 = dateTimeField21.getMinimumValue((org.joda.time.ReadablePartial) localDateTime30);
        int int34 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime11", (dateTime3.compareTo(dateTime11) == 0) == dateTime3.equals(dateTime11));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMinutes(576);
        int int12 = dateTime11.getDayOfMonth();
        int int13 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((-1));
        org.joda.time.DateTime dateTime19 = dateTime15.withMillisOfDay(0);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfSecond();
        org.joda.time.DateTime dateTime22 = dateTime19.minusMillis(24);
        org.joda.time.DateTime dateTime24 = dateTime19.minusHours(70);
        boolean boolean25 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfMinute();
        org.joda.time.DateTime dateTime13 = dateTime10.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.secondOfMinute();
        org.joda.time.DurationField durationField22 = chronology19.millis();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusSeconds((int) ' ');
        long long28 = chronology19.set((org.joda.time.ReadablePartial) localDateTime26, (long) 99);
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.lang.String str30 = locale29.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 212, chronology19, locale29, (java.lang.Integer) (-1), (-948));
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(72000052L, dateTimeZone35);
        dateTimeParserBucket33.setZone(dateTimeZone35);
        long long40 = dateTimeZone15.getMillisKeepLocal(dateTimeZone35, (long) 212);
        java.util.TimeZone timeZone41 = dateTimeZone35.toTimeZone();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime48 = property45.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.weekyear();
        boolean boolean52 = dateTimeZone35.isLocalDateTimeGap(localDateTime50);
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeZone35.getName(979L, locale54);
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology59 = localDateTime58.getChronology();
        org.joda.time.LocalDateTime.Property property60 = localDateTime58.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean62 = localDateTime58.isSupported(dateTimeFieldType61);
        java.lang.String str63 = dateTimeFieldType61.getName();
        int int64 = dateTime56.get(dateTimeFieldType61);
        int int65 = dateTime13.get(dateTimeFieldType61);
        org.joda.time.DateTime.Property property66 = dateTime13.centuryOfEra();
        boolean boolean67 = dateTime13.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime36", (dateTime3.compareTo(dateTime36) == 0) == dateTime3.equals(dateTime36));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime6 = dateTime1.minusSeconds(2022);
        org.joda.time.LocalTime localTime7 = dateTime1.toLocalTime();
        org.joda.time.DateTime dateTime9 = dateTime1.minusYears(16);
        int int10 = dateTime9.getHourOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusDays(353);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.withDurationAdded(readableDuration13, 23);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology19);
        java.lang.String str21 = chronology19.toString();
        org.joda.time.DurationField durationField22 = chronology19.hours();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.dayOfMonth();
        org.joda.time.Chronology chronology24 = chronology19.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = chronology19.secondOfDay();
        org.joda.time.DurationField durationField26 = chronology19.months();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.millisOfSecond();
        int int31 = property30.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime32 = property30.roundHalfCeilingCopy();
        int int33 = localDateTime32.size();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int38 = localDateTime35.get(dateTimeFieldType37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.era();
        int int40 = localDateTime35.indexOf(dateTimeFieldType39);
        int int41 = localDateTime32.get(dateTimeFieldType39);
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology43, locale44, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField48 = null;
        dateTimeParserBucket47.saveField(dateTimeField48, (int) (short) 0);
        java.lang.Integer int51 = dateTimeParserBucket47.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        long long55 = dateTimeZone52.convertLocalToUTC(0L, false);
        dateTimeParserBucket47.setZone(dateTimeZone52);
        org.joda.time.DateTime dateTime57 = localDateTime32.toDateTime(dateTimeZone52);
        org.joda.time.Chronology chronology58 = chronology19.withZone(dateTimeZone52);
        java.util.Locale locale59 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.tz.NameProvider nameProvider60 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale61 = java.util.Locale.ITALIAN;
        java.lang.String str64 = nameProvider60.getName(locale61, "2022-02-21T15:06:28.281+00:00:00.052", "secondOfDay");
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology67 = localDateTime66.getChronology();
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(chronology67);
        org.joda.time.DateTimeField dateTimeField69 = chronology67.clockhourOfDay();
        java.util.Locale locale71 = java.util.Locale.ENGLISH;
        java.lang.String str72 = locale71.getVariant();
        java.lang.String str73 = dateTimeField69.getAsText((-1), locale71);
        java.lang.String str76 = nameProvider60.getShortName(locale71, "2022-02-21T15:06:18.239+00:00:00.052", "en_US");
        java.lang.String str77 = locale59.getDisplayLanguage(locale71);
        java.lang.String str78 = locale59.toLanguageTag();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket(1356998400000L, chronology19, locale59);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime dateTime81 = dateTime12.withChronology(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime20", (dateTime1.compareTo(dateTime20) == 0) == dateTime1.equals(dateTime20));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime.Property property8 = dateTime5.dayOfWeek();
        org.joda.time.DateTime dateTime9 = property8.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime10 = property8.roundHalfCeilingCopy();
        int int11 = dateTime10.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusHours((int) (byte) 0);
        boolean boolean17 = dateTime15.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks((int) 'a');
        boolean boolean22 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime.Property property23 = dateTime15.secondOfDay();
        org.joda.time.DateTime dateTime24 = property23.withMaximumValue();
        org.joda.time.DateTime dateTime25 = property23.roundHalfEvenCopy();
        java.lang.String str26 = dateTime25.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear((-1));
        org.joda.time.DateTime dateTime32 = dateTime28.plusHours((int) (byte) 100);
        int int33 = dateTime28.getDayOfYear();
        int int34 = dateTime28.getDayOfWeek();
        org.joda.time.DateTime dateTime36 = dateTime28.plus((long) 21);
        org.joda.time.Chronology chronology37 = dateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.weekyear();
        org.joda.time.DurationField durationField39 = chronology37.halfdays();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.secondOfMinute();
        org.joda.time.DateTime dateTime41 = dateTime25.toDateTime(chronology37);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekyear((-1));
        org.joda.time.DateMidnight dateMidnight46 = dateTime43.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone47 = dateMidnight46.getZone();
        long long49 = dateTimeZone47.nextTransition((long) 70);
        java.lang.String str51 = dateTimeZone47.getName(10000L);
        org.joda.time.DateTime dateTime52 = dateTime41.withZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime dateTime53 = dateTime10.withZoneRetainFields(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        long long7 = dateTimeField4.add((long) (short) -1, 35999999L);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale11, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket14.saveField(dateTimeField15, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        dateTimeParserBucket14.saveField(dateTimeFieldType18, "it", locale20);
        java.lang.String str22 = locale20.toLanguageTag();
        boolean boolean23 = locale20.hasExtensions();
        java.lang.String str24 = dateTimeField4.getAsText(1148, locale20);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekyear((-1));
        org.joda.time.DateMidnight dateMidnight30 = dateTime27.toDateMidnight();
        int int31 = dateTime27.getSecondOfDay();
        org.joda.time.DateTime.Property property32 = dateTime27.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime43 = dateTime40.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean44 = dateTime43.isEqualNow();
        org.joda.time.DateTime.Property property45 = dateTime43.secondOfMinute();
        org.joda.time.DateTime dateTime47 = property45.addToCopy(0L);
        org.joda.time.DateTimeField dateTimeField48 = property45.getField();
        java.util.Locale locale50 = java.util.Locale.ITALIAN;
        java.lang.String str51 = locale50.getLanguage();
        java.lang.String str52 = locale50.getScript();
        java.lang.String str53 = dateTimeField48.getAsText(15, locale50);
        int int54 = property32.getMaximumTextLength(locale50);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology58 = localDateTime57.getChronology();
        org.joda.time.LocalDateTime localDateTime59 = org.joda.time.LocalDateTime.now(chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology58.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.millisOfSecond();
        org.joda.time.DurationField durationField62 = chronology58.seconds();
        org.joda.time.DurationField durationField63 = chronology58.centuries();
        org.joda.time.DateTimeField dateTimeField64 = chronology58.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField65 = chronology58.monthOfYear();
        java.util.Locale locale66 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket(72000052L, chronology58, locale66);
        java.lang.String str68 = locale50.getDisplayCountry(locale66);
        java.lang.String str69 = dateTimeField4.getAsShortText(2032, locale66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime36", (dateTime27.compareTo(dateTime36) == 0) == dateTime27.equals(dateTime36));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        int int6 = dateTime3.getWeekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.minus(readablePeriod7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear((-1));
        org.joda.time.DateTime dateTime14 = dateTime10.plusHours((int) (byte) 100);
        boolean boolean16 = dateTime14.isBefore((long) ' ');
        int int17 = dateTime14.getYearOfEra();
        org.joda.time.TimeOfDay timeOfDay18 = dateTime14.toTimeOfDay();
        boolean boolean19 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime21 = dateTime3.minusMonths(60590228);
        org.joda.time.DateTime.Property property22 = dateTime3.secondOfDay();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime31 = dateTime30.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.minus(readablePeriod32);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.weekyearOfCentury();
        org.joda.time.DurationField durationField40 = durationFieldType34.getField(chronology37);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.LocalDateTime.Property property44 = localDateTime42.millisOfSecond();
        int int45 = property44.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime46 = property44.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plus(readableDuration47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.withYearOfCentury(11);
        int int51 = localDateTime50.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.plusMonths(85);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusDays(718);
        long long57 = chronology37.set((org.joda.time.ReadablePartial) localDateTime55, (-162L));
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime33.toMutableDateTime(chronology37);
        long long59 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime26", (dateTime1.compareTo(dateTime26) == 0) == dateTime1.equals(dateTime26));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        int int4 = property3.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusHours((int) (byte) 0);
        java.util.Date date9 = dateTime6.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone10.getOffset(readableInstant11);
        int int14 = dateTimeZone10.getStandardOffset((long) 15);
        org.joda.time.DateTime dateTime15 = dateTime6.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusHours((int) (byte) 0);
        java.util.Date date20 = dateTime17.toDate();
        org.joda.time.DateTime.Property property21 = dateTime17.dayOfMonth();
        org.joda.time.DateTime.Property property22 = dateTime17.dayOfMonth();
        java.lang.String str23 = property22.getAsString();
        org.joda.time.DateTime dateTime24 = property22.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusHours((int) (byte) 0);
        java.util.Date date29 = dateTime26.toDate();
        org.joda.time.DateTime.Property property30 = dateTime26.dayOfMonth();
        org.joda.time.DateTime.Property property31 = dateTime26.dayOfMonth();
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = property31.getAsText(locale32);
        int int35 = property22.getMaximumTextLength(locale32);
        org.joda.time.DateTime dateTime36 = property22.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property37 = dateTime36.dayOfMonth();
        int int38 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime36);
        long long39 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        int int40 = dateTime36.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.DateTime dateTime42 = dateTime36.plus(readablePeriod41);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.LocalDateTime.Property property46 = localDateTime44.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = property46.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.era();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology54 = localDateTime53.getChronology();
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(chronology54);
        org.joda.time.DateTime.Property property56 = dateTime55.dayOfYear();
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str58 = locale57.getDisplayCountry();
        java.lang.String str59 = property56.getAsText(locale57);
        int int60 = dateTimeField51.getMaximumTextLength(locale57);
        java.util.Locale locale61 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str62 = locale57.getDisplayScript(locale61);
        java.util.Set<java.lang.String> strSet63 = locale57.getUnicodeLocaleKeys();
        java.lang.String str64 = locale57.getISO3Country();
        java.util.Calendar calendar65 = dateTime36.toCalendar(locale57);
        org.joda.time.LocalDateTime localDateTime66 = org.joda.time.LocalDateTime.fromCalendarFields(calendar65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime55", (dateTime6.compareTo(dateTime55) == 0) == dateTime6.equals(dateTime55));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime9.plusMinutes(977);
        int int16 = dateTime15.getCenturyOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.minuteOfDay();
        org.joda.time.Instant instant18 = dateTime15.toInstant();
        org.joda.time.DateTime dateTime20 = dateTime15.plusWeeks(212460000);
        int int21 = dateTime20.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours((int) (byte) 0);
        boolean boolean14 = dateTime12.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime12.toMutableDateTime(dateTimeZone15);
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.lang.String str20 = dateTimeZone15.getName((long) (byte) 1, locale19);
        java.lang.String str21 = locale19.getScript();
        java.lang.String str22 = locale8.getDisplayScript(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 54596, chronology5, locale19, (java.lang.Integer) 212, (-948));
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket25.getZone();
        java.lang.String str27 = dateTimeZone26.toString();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = property32.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withYear((int) (short) 100);
        org.joda.time.Chronology chronology36 = localDateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.yearOfCentury();
        org.joda.time.DurationField durationField38 = chronology36.weeks();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.millisOfDay();
        org.joda.time.DurationField durationField40 = chronology36.halfdays();
        org.joda.time.DateTime dateTime41 = dateTime28.withChronology(chronology36);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime41", (dateTime2.compareTo(dateTime41) == 0) == dateTime2.equals(dateTime41));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.dayOfMonth();
        org.joda.time.Chronology chronology7 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfDay();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale11, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket14.saveField(dateTimeField15, (int) (short) 0);
        java.lang.Integer int18 = dateTimeParserBucket14.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket14.setZone(dateTimeZone19);
        int int22 = dateTimeZone19.getStandardOffset((long) 1969);
        org.joda.time.Chronology chronology23 = chronology2.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField24 = chronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone26.getOffset(readableInstant27);
        int int30 = dateTimeZone26.getStandardOffset((long) 15);
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withWeekyear((-1));
        org.joda.time.DateMidnight dateMidnight36 = dateTime33.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone37 = dateMidnight36.getZone();
        boolean boolean38 = dateTime31.equals((java.lang.Object) dateTimeZone37);
        java.lang.String str40 = dateTimeZone37.getName(1645455980075L);
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        boolean boolean43 = locale42.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property48 = dateTime45.centuryOfEra();
        java.util.Locale locale49 = java.util.Locale.ITALIAN;
        java.lang.String str50 = locale49.getLanguage();
        java.lang.String str51 = property48.getAsText(locale49);
        java.lang.String str52 = locale42.getDisplayLanguage(locale49);
        java.util.Locale locale53 = null;
        java.lang.String str54 = locale49.getDisplayScript(locale53);
        java.lang.String str55 = dateTimeZone37.getShortName((long) 766, locale49);
        long long57 = dateTimeZone37.nextTransition((long) 541);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.LocalDateTime.Property property61 = localDateTime59.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = property61.roundHalfEvenCopy();
        java.lang.String str63 = property61.getAsText();
        org.joda.time.LocalDateTime localDateTime64 = property61.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone66 = dateTimeZone65.toTimeZone();
        java.lang.String str67 = dateTimeZone65.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone65);
        int int70 = dateTimeZone65.getOffset(0L);
        org.joda.time.DateTime dateTime71 = localDateTime64.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(dateTimeZone65);
        org.joda.time.DateTime.Property property73 = dateTime72.dayOfMonth();
        boolean boolean74 = dateTimeZone37.equals((java.lang.Object) property73);
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.now(dateTimeZone37);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        org.joda.time.Chronology chronology77 = chronology2.withZone(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime31", (dateTime3.compareTo(dateTime31) == 0) == dateTime3.equals(dateTime31));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = dateTime5.withZone(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plus(readableDuration16);
        org.joda.time.DateTime dateTime18 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withDurationAdded(readableDuration19, 99);
        org.joda.time.LocalDateTime.Property property22 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int27 = localDateTime24.get(dateTimeFieldType26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.era();
        int int29 = localDateTime24.indexOf(dateTimeFieldType28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime24.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime24.withDurationAdded(readableDuration31, 647);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusHours((int) (byte) 0);
        boolean boolean39 = dateTime37.isEqual((long) (short) 100);
        org.joda.time.DateTime dateTime40 = localDateTime33.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Instant instant41 = dateTime40.toInstant();
        long long42 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.LocalDateTime localDateTime43 = property22.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and instant41", (dateTime40.compareTo(instant41) == 0) == dateTime40.equals(instant41));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(2922789);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear((-1));
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths(10);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        int int16 = dateTime14.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = dateTime14.withZone(dateTimeZone18);
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = dateTimeZone18.getName((long) 26, locale22);
        long long26 = dateTimeZone18.adjustOffset((long) 657, false);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusHours((int) (byte) 0);
        boolean boolean32 = dateTime30.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime30.toMutableDateTime(dateTimeZone33);
        long long37 = dateTimeZone18.getMillisKeepLocal(dateTimeZone33, 657L);
        org.joda.time.DateTime dateTime38 = dateTime7.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime40 = dateTime38.withCenturyOfEra(121);
        org.joda.time.DateTime.Property property41 = dateTime40.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekyear((-1));
        org.joda.time.DateTime dateTime47 = dateTime45.minusHours(15);
        org.joda.time.DateTime dateTime49 = dateTime45.minusHours(212);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime52 = dateTime45.withDurationAdded(readableDuration50, 4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = dateTime45.toString(dateTimeFormatter53);
        org.joda.time.Instant instant55 = dateTime45.toInstant();
        boolean boolean56 = dateTime40.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant55", (dateTime12.compareTo(instant55) == 0) == dateTime12.equals(instant55));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        int int6 = dateTimeZone1.getStandardOffset((long) 2922789);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.Locale locale9 = java.util.Locale.US;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.lang.String str17 = locale16.getVariant();
        java.lang.String str18 = dateTimeField14.getAsText((-1), locale16);
        boolean boolean19 = locale16.hasExtensions();
        java.util.Set<java.lang.String> strSet20 = locale16.getUnicodeLocaleKeys();
        java.lang.String str21 = locale9.getDisplayCountry(locale16);
        java.lang.String str22 = dateTimeZone1.getShortName((-62168028490925L), locale9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = dateTime1.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime(chronology5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours((int) (byte) 0);
        java.util.Date date12 = dateTime9.toDate();
        org.joda.time.DateTime.Property property13 = dateTime9.dayOfMonth();
        java.lang.String str14 = property13.getAsString();
        boolean boolean15 = property13.isLeap();
        org.joda.time.DateTime dateTime16 = property13.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusHours((int) (byte) 0);
        boolean boolean22 = dateTime20.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime20.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.era();
        int int27 = mutableDateTime25.get(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.secondOfMinute();
        org.joda.time.DurationField durationField33 = chronology30.millis();
        boolean boolean34 = dateTimeFieldType26.isSupported(chronology30);
        java.lang.String str35 = dateTimeFieldType26.getName();
        boolean boolean36 = dateTime16.isSupported(dateTimeFieldType26);
        boolean boolean37 = dateTime7.isSupported(dateTimeFieldType26);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withWeekyear((-1));
        org.joda.time.DateTime dateTime43 = dateTime39.plusHours((int) (byte) 100);
        int int44 = dateTime39.getDayOfYear();
        org.joda.time.DateTime dateTime46 = dateTime39.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime48 = dateTime46.minus((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType49.getRangeDurationType();
        int int51 = dateTime48.get(dateTimeFieldType49);
        org.joda.time.DateTime.Property property52 = dateTime7.property(dateTimeFieldType49);
        java.lang.String str53 = property52.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime7", (dateTime1.compareTo(dateTime7) == 0) == dateTime1.equals(dateTime7));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.withMillisOfDay(0);
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property7 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime5.minusDays(26646);
        org.joda.time.DateTime.Property property10 = dateTime5.year();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = property14.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.era();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property23 = localDateTime17.property(dateTimeFieldType22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime17.withYearOfEra(536);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = property29.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.era();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.plusYears(100);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plus(readablePeriod37);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology41 = localDateTime40.getChronology();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime45 = property42.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusMinutes(20);
        boolean boolean50 = localDateTime38.isAfter((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime38.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology54 = localDateTime53.getChronology();
        org.joda.time.LocalDateTime.Property property55 = localDateTime53.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime56 = property55.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.era();
        boolean boolean58 = localDateTime56.isSupported(dateTimeFieldType57);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology61 = localDateTime60.getChronology();
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now(chronology61);
        org.joda.time.DateTimeField dateTimeField63 = chronology61.secondOfMinute();
        boolean boolean64 = dateTimeFieldType57.isSupported(chronology61);
        int int65 = localDateTime38.indexOf(dateTimeFieldType57);
        int int66 = localDateTime17.get(dateTimeFieldType57);
        boolean boolean67 = dateTime5.isSupported(dateTimeFieldType57);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(chronology70);
        org.joda.time.DateTime dateTime73 = dateTime71.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime75 = dateTime73.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime78 = dateTime75.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean79 = dateTime78.isEqualNow();
        org.joda.time.DateTime.Property property80 = dateTime78.secondOfMinute();
        org.joda.time.DateTime dateTime82 = property80.addToCopy(0L);
        org.joda.time.Chronology chronology83 = dateTime82.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField85 = chronology83.dayOfYear();
        org.joda.time.DateTimeField dateTimeField86 = dateTimeFieldType57.getField(chronology83);
        org.joda.time.DurationFieldType durationFieldType87 = dateTimeFieldType57.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime71", (dateTime1.compareTo(dateTime71) == 0) == dateTime1.equals(dateTime71));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        int int5 = localDateTime4.getEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusHours(54637049);
        int int8 = localDateTime4.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.withYear(2922789);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillisOfSecond(784);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = dateTime19.toString(dateTimeFormatter20);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime28 = property25.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusHours(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int32 = localDateTime28.indexOf(dateTimeFieldType31);
        int int33 = dateTime19.get(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.secondOfMinute();
        org.joda.time.DurationField durationField40 = chronology37.millis();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusSeconds((int) ' ');
        long long46 = chronology37.set((org.joda.time.ReadablePartial) localDateTime44, (long) 99);
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        java.lang.String str48 = locale47.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) 212, chronology37, locale47, (java.lang.Integer) (-1), (-948));
        org.joda.time.DateTimeField dateTimeField52 = chronology37.minuteOfHour();
        org.joda.time.DurationField durationField53 = chronology37.years();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType31.getField(chronology37);
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType9.getField(chronology37);
        int int56 = localDateTime4.get(dateTimeFieldType9);
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType9.getDurationType();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology61 = localDateTime60.getChronology();
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(chronology61);
        org.joda.time.DateTimeZone dateTimeZone63 = chronology61.getZone();
        org.joda.time.DurationField durationField64 = chronology61.centuries();
        org.joda.time.DateTimeField dateTimeField65 = chronology61.hourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(18717750375600L, chronology61);
        boolean boolean67 = dateTimeFieldType9.isSupported(chronology61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime62", (dateTime11.compareTo(dateTime62) == 0) == dateTime11.equals(dateTime62));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DurationField durationField15 = chronology12.months();
        long long18 = durationField15.getDifferenceAsLong((long) 426, (long) 54848886);
        boolean boolean19 = durationField15.isSupported();
        long long22 = durationField15.add(0L, (long) 687);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology25);
        java.lang.String str27 = chronology25.toString();
        org.joda.time.DurationField durationField28 = chronology25.hours();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology31);
        java.lang.String str33 = chronology31.toString();
        org.joda.time.DurationField durationField34 = chronology31.hours();
        int int35 = durationField28.compareTo(durationField34);
        int int38 = durationField34.getValue((long) 60639663, (long) 687);
        boolean boolean39 = durationField34.isSupported();
        int int40 = durationField15.compareTo(durationField34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime26", (dateTime1.compareTo(dateTime26) == 0) == dateTime1.equals(dateTime26));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        int int6 = dateTime1.getDayOfYear();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime1.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime1.withDurationAdded(readableDuration8, (int) (short) 1);
        long long11 = dateTime1.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = property15.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withYear((int) (short) 100);
        org.joda.time.Chronology chronology19 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.hourOfDay();
        org.joda.time.DateTime dateTime22 = dateTime1.withChronology(chronology19);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.plus(readablePeriod23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusDays((-2273068));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime24", (dateTime1.compareTo(dateTime24) == 0) == dateTime1.equals(dateTime24));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfEra((int) 'x');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusWeeks(213);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfMinute();
        org.joda.time.DurationField durationField15 = chronology12.millis();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusSeconds((int) ' ');
        long long21 = chronology12.set((org.joda.time.ReadablePartial) localDateTime19, (long) 99);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withDurationAdded(readableDuration22, 0);
        int int25 = localDateTime19.getMillisOfSecond();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.parse("2022-02-21T15:06:35.241+00:00:00.052");
        boolean boolean28 = localDateTime19.equals((java.lang.Object) dateTime27);
        boolean boolean29 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTime dateTime30 = localDateTime19.toDateTime();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime19.withYearOfCentury(0);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusSeconds(52);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusHours(28);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusMillis(405);
        boolean boolean41 = localDateTime19.isBefore((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(chronology44);
        org.joda.time.DateTime dateTime47 = dateTime45.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime49 = dateTime47.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime52 = dateTime49.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean53 = dateTime52.isEqualNow();
        org.joda.time.LocalDateTime localDateTime54 = dateTime52.toLocalDateTime();
        int int55 = dateTime52.getMonthOfYear();
        int int56 = dateTime52.getSecondOfDay();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology59 = localDateTime58.getChronology();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(chronology59);
        org.joda.time.DateTime dateTime62 = dateTime60.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime64 = dateTime62.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime67 = dateTime64.withDurationAdded((long) 2022, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime64.getZone();
        org.joda.time.MutableDateTime mutableDateTime69 = dateTime52.toMutableDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(dateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(dateTimeZone71);
        org.joda.time.DateTime dateTime74 = dateTime72.withWeekyear((-1));
        org.joda.time.DateTime.Property property75 = dateTime72.dayOfWeek();
        org.joda.time.DateTime.Property property76 = dateTime72.dayOfYear();
        int int77 = dateTimeZone68.getOffset((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime dateTime78 = localDateTime40.toDateTime(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and dateTime72", (dateTime45.compareTo(dateTime72) == 0) == dateTime45.equals(dateTime72));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("-0001-02-22T15:07:53.426+00:00:00.052");
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds((int) ' ');
        long long13 = chronology4.set((org.joda.time.ReadablePartial) localDateTime11, (long) 99);
        org.joda.time.DateTimeField dateTimeField14 = chronology4.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime1.toMutableDateTime(chronology4);
        org.joda.time.DateTimeField dateTimeField16 = chronology4.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime15", (dateTime1.compareTo(mutableDateTime15) == 0) == dateTime1.equals(mutableDateTime15));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar5 = dateTime4.toGregorianCalendar();
        int int6 = dateTime4.getMillisOfSecond();
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfHour();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property13 = dateTime10.centuryOfEra();
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale14.getLanguage();
        java.lang.String str16 = property13.getAsText(locale14);
        java.lang.String str17 = locale8.getDisplayName(locale14);
        int int18 = property7.getMaximumTextLength(locale14);
        java.util.Set<java.lang.String> strSet19 = locale14.getUnicodeLocaleAttributes();
        boolean boolean20 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.Locale.FilteringMode filteringMode31 = null;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList29, filteringMode31);
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.Locale.FilteringMode filteringMode41 = null;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList39, filteringMode41);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList39, filteringMode43);
        boolean boolean45 = strSet19.removeAll((java.util.Collection<java.lang.String>) strList44);
        java.util.stream.Stream<java.lang.String> strStream46 = strSet19.parallelStream();
        java.util.Spliterator<java.lang.String> strSpliterator47 = strSet19.spliterator();
        boolean boolean48 = strSet19.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream49 = strSet19.stream();
        boolean boolean50 = strSet19.isEmpty();
        boolean boolean51 = strSet19.isEmpty();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology54 = localDateTime53.getChronology();
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(chronology54);
        org.joda.time.DateTime dateTime57 = dateTime55.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime59 = dateTime57.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime60 = dateTime59.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime62 = dateTime59.plusDays(467);
        org.joda.time.DateTime dateTime63 = dateTime62.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology66 = localDateTime65.getChronology();
        org.joda.time.DateTime dateTime67 = org.joda.time.DateTime.now(chronology66);
        org.joda.time.DateTime dateTime69 = dateTime67.withYearOfCentury((int) '#');
        org.joda.time.DateMidnight dateMidnight70 = dateTime67.toDateMidnight();
        boolean boolean71 = dateTime62.isAfter((org.joda.time.ReadableInstant) dateMidnight70);
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.DateTime dateTime73 = dateTime62.minus(readableDuration72);
        org.joda.time.DateTime dateTime75 = dateTime73.withDayOfYear(28);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetMillis(54443377);
        int int79 = dateTimeZone77.getOffset(1645456070537L);
        org.joda.time.DateTime dateTime80 = dateTime75.withZoneRetainFields(dateTimeZone77);
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology83 = localDateTime82.getChronology();
        org.joda.time.DateTime dateTime84 = org.joda.time.DateTime.now(chronology83);
        org.joda.time.LocalDateTime localDateTime85 = new org.joda.time.LocalDateTime(chronology83);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.DateTime dateTime87 = localDateTime85.toDateTime(readableInstant86);
        org.joda.time.DateTime dateTime89 = dateTime87.withYearOfEra(68819);
        org.joda.time.DateTimeZone dateTimeZone90 = dateTime89.getZone();
        org.joda.time.DateTime dateTime92 = dateTime89.minusSeconds(54620);
        org.joda.time.DateTime dateTime94 = dateTime89.minus((long) 54546339);
        boolean boolean95 = dateTime75.isAfter((org.joda.time.ReadableInstant) dateTime94);
        boolean boolean96 = strSet19.contains((java.lang.Object) dateTime75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime55", (dateTime2.compareTo(dateTime55) == 0) == dateTime2.equals(dateTime55));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = dateTime1.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime(chronology5);
        org.joda.time.DateTime dateTime9 = dateTime1.plusYears(0);
        int int10 = dateTime9.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime7", (dateTime9.compareTo(dateTime7) == 0) == dateTime9.equals(dateTime7));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime8 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime7.plusDays(467);
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfCentury((int) '#');
        org.joda.time.DateMidnight dateMidnight18 = dateTime15.toDateMidnight();
        boolean boolean19 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime10.minus(readableDuration20);
        org.joda.time.DateTime dateTime23 = dateTime21.withDayOfYear(28);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(54443377);
        int int27 = dateTimeZone25.getOffset(1645456070537L);
        org.joda.time.DateTime dateTime28 = dateTime23.withZoneRetainFields(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime(readableInstant34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra(68819);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime37.getZone();
        org.joda.time.DateTime dateTime40 = dateTime37.minusSeconds(54620);
        org.joda.time.DateTime dateTime42 = dateTime37.minus((long) 54546339);
        boolean boolean43 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withWeekyear((-1));
        org.joda.time.DateTime dateTime49 = dateTime45.withMillisOfDay(0);
        org.joda.time.DateMidnight dateMidnight50 = dateTime49.toDateMidnight();
        org.joda.time.DateTime.Property property51 = dateTime49.era();
        org.joda.time.DateTime dateTime53 = dateTime49.plusMonths(54539123);
        org.joda.time.DateTime dateTime54 = dateTime53.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone55 = dateTime54.getZone();
        boolean boolean56 = dateTime23.isEqual((org.joda.time.ReadableInstant) dateTime54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime45", (dateTime3.compareTo(dateTime45) == 0) == dateTime3.equals(dateTime45));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField6 = chronology3.millis();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusSeconds((int) ' ');
        long long12 = chronology3.set((org.joda.time.ReadablePartial) localDateTime10, (long) 99);
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale13.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 212, chronology3, locale13, (java.lang.Integer) (-1), (-948));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(72000052L, dateTimeZone19);
        dateTimeParserBucket17.setZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusHours((int) (byte) 0);
        boolean boolean28 = dateTime26.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks((int) 'a');
        boolean boolean33 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime34 = dateTime32.toDateTime();
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.hourOfDay();
        org.joda.time.DurationField durationField38 = chronology35.millis();
        org.joda.time.DurationField durationField39 = chronology35.years();
        org.joda.time.DateTimeField dateTimeField40 = chronology35.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField41 = chronology35.minuteOfHour();
        dateTimeParserBucket17.saveField(dateTimeField41, 54555073);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField38", (durationField6.compareTo(durationField38) == 0) == durationField6.equals(durationField38));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime9.plusMinutes(977);
        int int16 = dateTime15.getCenturyOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.minuteOfDay();
        org.joda.time.DateTime.Property property18 = dateTime15.hourOfDay();
        int int19 = property18.getLeapAmount();
        org.joda.time.DateTime dateTime21 = property18.setCopy((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime30 = dateTime29.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime32 = dateTime29.plusDays(467);
        org.joda.time.DateTime dateTime33 = dateTime32.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfCentury((int) '#');
        org.joda.time.DateMidnight dateMidnight40 = dateTime37.toDateMidnight();
        boolean boolean41 = dateTime32.isAfter((org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime32.minus(readableDuration42);
        long long44 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime25", (dateTime1.compareTo(dateTime25) == 0) == dateTime1.equals(dateTime25));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        long long7 = dateTimeField4.add((long) (short) -1, 35999999L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime13 = dateTime9.plusSeconds(26);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfEra();
        org.joda.time.DateTime.Property property15 = dateTime13.dayOfYear();
        org.joda.time.DateTime dateTime17 = dateTime13.plusMonths(149);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime13.getZone();
        org.joda.time.LocalDateTime localDateTime19 = dateTime13.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusSeconds(52);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusHours(28);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withCenturyOfEra(52);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(501);
        int int30 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        int int31 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.minusSeconds(60741308);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.era();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getDisplayVariant();
        boolean boolean37 = locale35.hasExtensions();
        java.util.Locale locale38 = java.util.Locale.UK;
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder39.setExtension('a', "cinese");
        java.util.Locale locale43 = builder39.build();
        java.lang.String str44 = locale38.getDisplayName(locale43);
        org.joda.time.tz.NameProvider nameProvider45 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider45);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider45);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.LocalDateTime.Property property51 = localDateTime49.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime52 = property51.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.era();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology59 = localDateTime58.getChronology();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(chronology59);
        org.joda.time.DateTime.Property property61 = dateTime60.dayOfYear();
        java.util.Locale locale62 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str63 = locale62.getDisplayCountry();
        java.lang.String str64 = property61.getAsText(locale62);
        int int65 = dateTimeField56.getMaximumTextLength(locale62);
        java.lang.String str68 = nameProvider45.getName(locale62, "-0001-02-22T15:06:25.002+00:00:00.052", "2022-02-21T00:00:00.000+00:00:00.052");
        java.lang.String str69 = locale38.getDisplayName(locale62);
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology73 = localDateTime72.getChronology();
        org.joda.time.DateTime dateTime74 = org.joda.time.DateTime.now(chronology73);
        org.joda.time.DateTimeField dateTimeField75 = chronology73.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology78 = localDateTime77.getChronology();
        org.joda.time.LocalDateTime.Property property79 = localDateTime77.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime80 = property79.roundHalfEvenCopy();
        java.lang.String str81 = property79.getAsText();
        org.joda.time.LocalDateTime localDateTime82 = property79.roundCeilingCopy();
        int[] intArray84 = chronology73.get((org.joda.time.ReadablePartial) localDateTime82, 70L);
        java.util.Locale locale87 = new java.util.Locale("21", "52");
        boolean boolean88 = locale87.hasExtensions();
        java.lang.String str89 = locale87.toLanguageTag();
        java.lang.String str90 = locale87.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket91 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology73, locale87);
        java.lang.String str92 = locale62.getDisplayScript(locale87);
        java.lang.String str93 = locale35.getDisplayCountry(locale62);
        java.util.Locale locale96 = new java.util.Locale("22", "-0001-02-22T15:06:44.897+00:00:00.052");
        java.lang.String str97 = locale35.getDisplayName(locale96);
        java.util.Locale locale98 = locale35.stripExtensions();
        java.lang.String str99 = property34.getAsShortText(locale35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime60", (dateTime9.compareTo(dateTime60) == 0) == dateTime9.equals(dateTime60));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekyear((-1));
        org.joda.time.DateTime dateTime15 = dateTime13.plusMonths(10);
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfDay();
        int int17 = dateTime15.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = dateTime15.withZone(dateTimeZone19);
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str24 = dateTimeZone19.getName((long) 26, locale23);
        long long27 = dateTimeZone19.adjustOffset((long) 657, false);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusHours((int) (byte) 0);
        boolean boolean33 = dateTime31.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime31.toMutableDateTime(dateTimeZone34);
        long long38 = dateTimeZone19.getMillisKeepLocal(dateTimeZone34, 657L);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) mutableDateTime9, dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusMinutes(54494992);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.plusMonths((int) 'u');
        int int47 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime46);
        int int48 = localDateTime41.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.LocalDateTime.Property property52 = localDateTime50.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = property52.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.minusHours(21);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(chronology60);
        org.joda.time.DateTime dateTime63 = dateTime61.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime65 = dateTime63.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime66 = dateTime65.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.DateTime dateTime68 = dateTime65.minus(readablePeriod67);
        org.joda.time.DateTime dateTime69 = localDateTime53.toDateTime((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType71 = dateTimeFieldType70.getRangeDurationType();
        java.lang.String str72 = durationFieldType71.toString();
        java.lang.String str73 = durationFieldType71.getName();
        boolean boolean74 = localDateTime53.isSupported(durationFieldType71);
        java.lang.String str75 = durationFieldType71.toString();
        boolean boolean76 = localDateTime41.isSupported(durationFieldType71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime61", (dateTime11.compareTo(dateTime61) == 0) == dateTime11.equals(dateTime61));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime(readableInstant5);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.DateTime.Property property8 = dateTime6.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        boolean boolean16 = localDateTime14.isSupported(dateTimeFieldType15);
        java.util.Date date17 = localDateTime14.toDate();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusSeconds(4);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) 1586790399767L, chronology20);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime6.toMutableDateTime(chronology20);
        long long24 = mutableDateTime23.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours((int) (byte) 0);
        boolean boolean13 = dateTime11.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int) 'a');
        boolean boolean18 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime17.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.weekyear();
        boolean boolean27 = dateTime21.equals((java.lang.Object) localDateTime23);
        int[] intArray29 = chronology7.get((org.joda.time.ReadablePartial) localDateTime23, (long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime34 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime23.minusDays(1970);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime40.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime44 = dateTime42.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime.Property property45 = dateTime44.yearOfEra();
        org.joda.time.DateTime dateTime47 = dateTime44.plusDays(703);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMillis(54402249);
        org.joda.time.DateTime.Property property50 = dateTime49.yearOfEra();
        org.joda.time.DateTime dateTime51 = property50.roundCeilingCopy();
        int int52 = dateTime51.getMinuteOfHour();
        org.joda.time.DateTime dateTime53 = localDateTime36.toDateTime((org.joda.time.ReadableInstant) dateTime51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime40", (dateTime9.compareTo(dateTime40) == 0) == dateTime9.equals(dateTime40));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = dateTime5.withZone(dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withPeriodAdded(readablePeriod12, 13);
        org.joda.time.DateTime dateTime16 = dateTime14.minus((long) 9);
        boolean boolean18 = dateTime14.isBefore((long) 54599);
        java.util.Locale locale21 = new java.util.Locale("999", "1978-05-01T03:32:00.035");
        java.util.Calendar calendar22 = dateTime14.toCalendar(locale21);
        org.joda.time.DateTime dateTime24 = dateTime14.plus((-21L));
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(chronology27);
        java.lang.String str29 = chronology27.toString();
        org.joda.time.DurationField durationField30 = chronology27.hours();
        org.joda.time.DateTimeField dateTimeField31 = chronology27.dayOfMonth();
        org.joda.time.Chronology chronology32 = chronology27.withUTC();
        org.joda.time.DateTimeField dateTimeField33 = chronology27.secondOfDay();
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology35, locale36, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField40 = null;
        dateTimeParserBucket39.saveField(dateTimeField40, (int) (short) 0);
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology44, locale45, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField49 = null;
        dateTimeParserBucket48.saveField(dateTimeField49, (int) (short) 0);
        java.lang.Integer int52 = dateTimeParserBucket48.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket48.setZone(dateTimeZone53);
        dateTimeParserBucket39.setZone(dateTimeZone53);
        org.joda.time.Chronology chronology56 = chronology27.withZone(dateTimeZone53);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology27);
        int int58 = dateTime57.getWeekyear();
        boolean boolean59 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime28", (dateTime1.compareTo(dateTime28) == 0) == dateTime1.equals(dateTime28));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds(26);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean17 = dateTime16.isEqualNow();
        org.joda.time.LocalDateTime localDateTime18 = dateTime16.toLocalDateTime();
        int int19 = dateTime16.getMonthOfYear();
        int int20 = dateTime16.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime23 = dateTime16.withDurationAdded(readableDuration21, (int) '#');
        int int24 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime.Property property25 = dateTime23.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime9", (dateTime1.compareTo(dateTime9) == 0) == dateTime1.equals(dateTime9));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMinutes(20);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks(536);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusHours((int) (byte) 0);
        boolean boolean21 = dateTime19.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusWeeks((int) 'a');
        boolean boolean26 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime();
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology33 = dateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) dateTime27, chronology33);
        org.joda.time.DateTimeZone dateTimeZone36 = chronology33.getZone();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(788923800000L, chronology33);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime37.getZone();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.withWeekyear((-1));
        org.joda.time.DateTime dateTime44 = dateTime42.plusMonths(10);
        org.joda.time.DateTime.Property property45 = dateTime44.minuteOfDay();
        int int46 = dateTime44.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone49 = dateTimeZone48.toTimeZone();
        org.joda.time.DateTime dateTime50 = dateTime44.withZone(dateTimeZone48);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.DateTime dateTime53 = dateTime50.withPeriodAdded(readablePeriod51, 13);
        boolean boolean54 = dateTime37.isEqual((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime55 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime56 = dateTime37.toDateTime();
        int int57 = dateTime56.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone58);
        org.joda.time.DateTime dateTime61 = dateTime59.withWeekyear((-1));
        org.joda.time.DateTime dateTime63 = dateTime59.plusHours((int) (byte) 100);
        org.joda.time.DateTime.Property property64 = dateTime59.era();
        boolean boolean65 = dateTime56.equals((java.lang.Object) dateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime50", (dateTime44.compareTo(dateTime50) == 0) == dateTime44.equals(dateTime50));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology2, locale3, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField7 = null;
        dateTimeParserBucket6.saveField(dateTimeField7, (int) (short) 0);
        java.lang.Integer int10 = dateTimeParserBucket6.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        long long14 = dateTimeZone11.convertLocalToUTC(0L, false);
        dateTimeParserBucket6.setZone(dateTimeZone11);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 948, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.DateTime dateTime19 = property18.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime25 = dateTime23.withMinuteOfHour((int) (short) 10);
        int int26 = dateTime25.getMillisOfDay();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology28, locale29, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField33 = null;
        dateTimeParserBucket32.saveField(dateTimeField33, (int) (short) 0);
        java.lang.Integer int36 = dateTimeParserBucket32.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket32.setZone(dateTimeZone37);
        int int40 = dateTimeZone37.getStandardOffset((long) 1969);
        org.joda.time.DateTime dateTime41 = dateTime25.toDateTime(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekyear((-1));
        org.joda.time.DateTime dateTime47 = dateTime45.plusMonths(10);
        org.joda.time.DateTime.Property property48 = dateTime47.minuteOfDay();
        int int49 = dateTime47.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        org.joda.time.DateTime dateTime53 = dateTime47.withZone(dateTimeZone51);
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        java.lang.String str56 = dateTimeZone51.getName((long) 26, locale55);
        boolean boolean57 = dateTime41.equals((java.lang.Object) dateTimeZone51);
        long long58 = dateTime41.getMillis();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.parse("2022-02-21T15:06:35.241+00:00:00.052");
        org.joda.time.DateTime dateTime62 = dateTime60.plusMinutes(54653050);
        boolean boolean63 = dateTime41.isEqual((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.DateTime dateTime65 = dateTime41.plus(readableDuration64);
        boolean boolean66 = property18.equals((java.lang.Object) readableDuration64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime53", (dateTime47.compareTo(dateTime53) == 0) == dateTime47.equals(dateTime53));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTime.Property property8 = dateTime5.secondOfDay();
        int int9 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime10 = property8.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime12 = property8.setCopy(647);
        org.joda.time.DateTime dateTime14 = dateTime12.minus((long) 26648);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime20 = dateTime16.plusSeconds(26);
        long long21 = dateTime16.getMillis();
        int int22 = dateTime16.getYear();
        int int23 = dateTime16.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = property27.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusHours((int) (byte) 0);
        boolean boolean37 = dateTime35.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusWeeks((int) 'a');
        boolean boolean42 = dateTime35.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = dateTime41.toDateTime();
        org.joda.time.DateTime dateTime45 = dateTime41.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property50 = localDateTime47.weekyear();
        boolean boolean51 = dateTime45.equals((java.lang.Object) localDateTime47);
        int[] intArray53 = chronology31.get((org.joda.time.ReadablePartial) localDateTime47, (long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime58 = localDateTime47.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime47.minusDays(1970);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minusMillis((int) (short) 100);
        org.joda.time.DateTime dateTime63 = dateTime16.withFields((org.joda.time.ReadablePartial) localDateTime62);
        org.joda.time.DateTime dateTime64 = dateTime12.withFields((org.joda.time.ReadablePartial) localDateTime62);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology67 = localDateTime66.getChronology();
        org.joda.time.LocalDateTime.Property property68 = localDateTime66.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime70 = property68.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime71 = property68.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime73 = org.joda.time.DateTime.now(dateTimeZone72);
        org.joda.time.DateTime dateTime75 = dateTime73.withWeekyear((-1));
        org.joda.time.DateTime dateTime77 = dateTime75.plusMonths(10);
        org.joda.time.DateTime.Property property78 = dateTime77.minuteOfDay();
        int int79 = dateTime77.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone82 = dateTimeZone81.toTimeZone();
        org.joda.time.DateTime dateTime83 = dateTime77.withZone(dateTimeZone81);
        org.joda.time.DateTime.Property property84 = dateTime77.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int86 = dateTime77.get(dateTimeFieldType85);
        boolean boolean87 = localDateTime71.isSupported(dateTimeFieldType85);
        java.lang.String str88 = dateTimeFieldType85.getName();
        boolean boolean89 = dateTime12.isSupported(dateTimeFieldType85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime83", (dateTime5.compareTo(dateTime83) == 0) == dateTime5.equals(dateTime83));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = dateTime5.withZone(dateTimeZone9);
        org.joda.time.DateTime.Property property12 = dateTime5.yearOfEra();
        org.joda.time.DateTime.Property property13 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology14 = dateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime11", (dateTime5.compareTo(dateTime11) == 0) == dateTime5.equals(dateTime11));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology3.seconds();
        org.joda.time.DurationField durationField8 = chronology3.centuries();
        org.joda.time.DurationField durationField9 = chronology3.minutes();
        org.joda.time.DurationField durationField10 = chronology3.hours();
        org.joda.time.DateTimeField dateTimeField11 = chronology3.weekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekyear((-1));
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths(10);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        int int20 = dateTime18.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTime dateTime24 = dateTime18.withZone(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(0L, dateTimeZone22);
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale26.getScript();
        java.lang.String str28 = locale26.toLanguageTag();
        java.lang.String str29 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime25, locale26);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.withPeriodAdded(readablePeriod30, 66);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusWeeks((int) 'a');
        int int37 = dateTime36.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime dateTime40 = dateTime36.withField(dateTimeFieldType38, 2);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.LocalDateTime.Property property44 = localDateTime42.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = property44.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime50 = property48.addWrapFieldToCopy((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property48.getFieldType();
        org.joda.time.DateTime.Property property52 = dateTime36.property(dateTimeFieldType51);
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType51.getDurationType();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime32.withFieldAdded(durationFieldType53, 784);
        java.lang.String str56 = durationFieldType53.toString();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.plusHours((int) (byte) 0);
        boolean boolean62 = dateTime60.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = dateTime64.minusWeeks((int) 'a');
        boolean boolean67 = dateTime60.isAfter((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime68 = dateTime66.toDateTime();
        org.joda.time.Chronology chronology69 = dateTime68.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.secondOfDay();
        boolean boolean71 = durationFieldType53.isSupported(chronology69);
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology74 = localDateTime73.getChronology();
        org.joda.time.LocalDateTime.Property property75 = localDateTime73.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime76 = property75.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.withYearOfEra((int) 'x');
        org.joda.time.DurationFieldType durationFieldType79 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime76.withFieldAdded(durationFieldType79, (int) (byte) -1);
        int int82 = localDateTime81.getMinuteOfHour();
        org.joda.time.Chronology chronology83 = localDateTime81.getChronology();
        org.joda.time.DurationField durationField84 = durationFieldType53.getField(chronology83);
        java.util.Locale locale86 = new java.util.Locale("Property[centuryOfEra]");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket89 = new org.joda.time.format.DateTimeParserBucket(1586790452319L, chronology83, locale86, (java.lang.Integer) (-17276168), (int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime24", (dateTime18.compareTo(dateTime24) == 0) == dateTime18.equals(dateTime24));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.minusHours(15);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime(dateTimeZone7);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfEra();
        java.util.Locale locale13 = new java.util.Locale("21", "52");
        boolean boolean14 = locale13.hasExtensions();
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getLanguage();
        int int17 = property10.getMaximumShortTextLength(locale13);
        org.joda.time.DateTime dateTime18 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime19 = property10.getDateTime();
        org.joda.time.DateTimeField dateTimeField20 = property10.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime9", (dateTime5.compareTo(dateTime9) == 0) == dateTime5.equals(dateTime9));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        java.util.Date date7 = dateTime5.toDate();
        org.joda.time.DateTime dateTime9 = dateTime5.withWeekyear(1);
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology11, locale12, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket15.saveField(dateTimeField16, (int) (short) 0);
        java.lang.Integer int19 = dateTimeParserBucket15.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket15.setZone(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekyear((-1));
        org.joda.time.DateTime dateTime27 = dateTime23.plusHours((int) (byte) 100);
        boolean boolean29 = dateTime27.isBefore((long) ' ');
        int int30 = dateTimeZone20.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime32 = dateTime27.minusYears((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        long long36 = dateTimeZone33.convertLocalToUTC(239L, true);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime5, dateTimeZone33);
        org.joda.time.DateTime dateTime40 = dateTime5.withMillis(196639200052L);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(chronology45);
        java.lang.String str47 = chronology45.toString();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone50 = dateTimeZone49.toTimeZone();
        org.joda.time.Chronology chronology51 = chronology45.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField52 = chronology45.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField53 = chronology45.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(35999999L, chronology45);
        boolean boolean55 = durationFieldType41.isSupported(chronology45);
        long long59 = chronology45.add((long) 68819, 35L, 235);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((java.lang.Object) dateTime5, chronology45);
        org.joda.time.DurationField durationField61 = chronology45.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime46", (dateTime1.compareTo(dateTime46) == 0) == dateTime1.equals(dateTime46));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology11);
        java.lang.String str13 = chronology11.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.Chronology chronology17 = chronology11.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField18 = chronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology11.secondOfMinute();
        org.joda.time.DurationField durationField20 = chronology11.minutes();
        org.joda.time.DateTimeField dateTimeField21 = chronology11.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology11.secondOfMinute();
        boolean boolean23 = localDateTime8.equals((java.lang.Object) dateTimeField22);
        int int25 = dateTimeField22.getMaximumValue((long) 15);
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusHours((int) (byte) 0);
        boolean boolean33 = dateTime31.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime31.toMutableDateTime(dateTimeZone34);
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.lang.String str39 = dateTimeZone34.getName((long) (byte) 1, locale38);
        java.lang.String str40 = locale38.getScript();
        java.lang.String str41 = locale27.getDisplayScript(locale38);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar46 = dateTime45.toGregorianCalendar();
        int int47 = dateTime45.getMillisOfSecond();
        org.joda.time.DateTime.Property property48 = dateTime45.minuteOfHour();
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property54 = dateTime51.centuryOfEra();
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        java.lang.String str56 = locale55.getLanguage();
        java.lang.String str57 = property54.getAsText(locale55);
        java.lang.String str58 = locale49.getDisplayName(locale55);
        int int59 = property48.getMaximumTextLength(locale55);
        java.util.Set<java.lang.String> strSet60 = locale55.getUnicodeLocaleAttributes();
        java.lang.String str61 = locale27.getDisplayLanguage(locale55);
        java.lang.String str62 = dateTimeField22.getAsText(54448917, locale55);
        long long65 = dateTimeField22.add(1645456273646L, 3L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime29", (dateTime12.compareTo(dateTime29) == 0) == dateTime12.equals(dateTime29));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("-0001-02-22T15:06:33.492+00:00:00.052");
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology5);
        java.lang.String str7 = chronology5.toString();
        org.joda.time.DurationField durationField8 = chronology5.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.dayOfMonth();
        org.joda.time.Chronology chronology10 = chronology5.withUTC();
        org.joda.time.Chronology chronology11 = chronology5.withUTC();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime1.toMutableDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(chronology25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property32 = dateTime29.centuryOfEra();
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.lang.String str34 = locale33.getLanguage();
        java.lang.String str35 = property32.getAsText(locale33);
        java.lang.String str36 = dateTimeField22.getAsText((org.joda.time.ReadablePartial) localDateTime26, (-1), locale33);
        boolean boolean37 = localDateTime14.isAfter((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusDays(212);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusHours((int) ' ');
        boolean boolean47 = localDateTime26.isBefore((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime26.plus(readablePeriod48);
        long long51 = chronology11.set((org.joda.time.ReadablePartial) localDateTime26, 54518L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime12", (dateTime1.compareTo(mutableDateTime12) == 0) == dateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfMinute();
        org.joda.time.DateTime dateTime14 = property12.addToCopy(0L);
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        org.joda.time.DateTime dateTime16 = property12.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfDay(713);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekyear((-1));
        org.joda.time.DateTime dateTime26 = dateTime22.withMillisOfDay(0);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfSecond();
        org.joda.time.DateTime dateTime29 = dateTime26.minusMillis(24);
        org.joda.time.DateTime dateTime31 = dateTime26.minusYears(168);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology33, locale34, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField38 = null;
        dateTimeParserBucket37.saveField(dateTimeField38, (int) (short) 0);
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology42, locale43, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField47 = null;
        dateTimeParserBucket46.saveField(dateTimeField47, (int) (short) 0);
        java.lang.Integer int50 = dateTimeParserBucket46.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket46.setZone(dateTimeZone51);
        dateTimeParserBucket37.setZone(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.plusHours((int) (byte) 0);
        boolean boolean59 = dateTime57.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime61.minusWeeks((int) 'a');
        boolean boolean64 = dateTime57.isAfter((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTime dateTime65 = dateTime63.toDateTime();
        org.joda.time.DateTime dateTime67 = dateTime63.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property72 = localDateTime69.weekyear();
        boolean boolean73 = dateTime67.equals((java.lang.Object) localDateTime69);
        org.joda.time.DateTimeZone dateTimeZone74 = dateTime67.getZone();
        dateTimeParserBucket37.setZone(dateTimeZone74);
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology78 = localDateTime77.getChronology();
        org.joda.time.LocalDateTime.Property property79 = localDateTime77.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime80 = property79.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property83 = localDateTime82.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime85 = property83.addWrapFieldToCopy((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = property83.getFieldType();
        java.util.Locale locale88 = java.util.Locale.ITALY;
        dateTimeParserBucket37.saveField(dateTimeFieldType86, "2022-02-21T15:06:22.606+00:00:00.052", locale88);
        org.joda.time.DateTime dateTime91 = dateTime26.withField(dateTimeFieldType86, 32);
        int int92 = dateTime20.get(dateTimeFieldType86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime22", (dateTime3.compareTo(dateTime22) == 0) == dateTime3.equals(dateTime22));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekyear((-1));
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(10);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        int int8 = dateTime6.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = dateTime6.withZone(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plusHours((-1));
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusYears(332);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime12", (dateTime6.compareTo(dateTime12) == 0) == dateTime6.equals(dateTime12));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.LocalDateTime localDateTime12 = dateTime10.toLocalDateTime();
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        int int14 = dateTime10.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology17);
        java.lang.String str19 = chronology17.toString();
        org.joda.time.DurationField durationField20 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.dayOfMonth();
        boolean boolean23 = dateTimeField21.isLeap((long) 865);
        int int24 = dateTime10.get(dateTimeField21);
        org.joda.time.tz.NameProvider nameProvider25 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.lang.String str29 = nameProvider25.getName(locale26, "2022-02-21T15:06:28.281+00:00:00.052", "secondOfDay");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider25);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.millisOfSecond();
        org.joda.time.DurationField durationField37 = chronology33.seconds();
        org.joda.time.DurationField durationField38 = chronology33.centuries();
        org.joda.time.DurationField durationField39 = chronology33.minutes();
        org.joda.time.DateTimeField dateTimeField40 = chronology33.monthOfYear();
        org.joda.time.DateTimeField dateTimeField41 = chronology33.millisOfDay();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = property45.addToCopy((long) 3);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology56 = localDateTime55.getChronology();
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(chronology56);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property63 = dateTime60.centuryOfEra();
        java.util.Locale locale64 = java.util.Locale.ITALIAN;
        java.lang.String str65 = locale64.getLanguage();
        java.lang.String str66 = property63.getAsText(locale64);
        java.lang.String str67 = dateTimeField53.getAsText((org.joda.time.ReadablePartial) localDateTime57, (-1), locale64);
        java.util.Locale locale69 = java.util.Locale.ITALIAN;
        java.lang.String str70 = locale69.getLanguage();
        java.lang.String str71 = dateTimeField53.getAsShortText((int) (byte) 10, locale69);
        java.lang.String str72 = dateTimeField41.getAsShortText((org.joda.time.ReadablePartial) localDateTime47, 713, locale69);
        java.util.Locale.setDefault(locale69);
        java.lang.String str76 = nameProvider25.getName(locale69, "2022-02-21T15:06:49.553+00:00:00.052", "11");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider25);
        org.joda.time.tz.NameProvider nameProvider78 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider78);
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology82 = localDateTime81.getChronology();
        org.joda.time.LocalDateTime localDateTime83 = org.joda.time.LocalDateTime.now(chronology82);
        org.joda.time.DateTimeField dateTimeField84 = chronology82.secondOfMinute();
        java.lang.String str86 = dateTimeField84.getAsShortText((-31948L));
        java.util.Locale locale87 = java.util.Locale.KOREA;
        int int88 = dateTimeField84.getMaximumShortTextLength(locale87);
        java.lang.String str91 = nameProvider78.getName(locale87, "halfdays", "2022-02-21T15:06:14.968+00:00:00.052");
        java.util.Set<java.lang.String> strSet92 = locale87.getUnicodeLocaleKeys();
        java.lang.String str95 = nameProvider25.getShortName(locale87, "23", "52");
        int int96 = dateTimeField21.getMaximumShortTextLength(locale87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime60", (dateTime3.compareTo(dateTime60) == 0) == dateTime3.equals(dateTime60));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime(readableInstant5);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.era();
        boolean boolean14 = localDateTime12.isSupported(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.secondOfMinute();
        boolean boolean20 = dateTimeFieldType13.isSupported(chronology17);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(0L, chronology17);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime6.toMutableDateTime(chronology17);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        java.lang.String str25 = dateTimeZone23.getShortName((long) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime22", (dateTime6.compareTo(mutableDateTime22) == 0) == dateTime6.equals(mutableDateTime22));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property14 = dateTime11.centuryOfEra();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getLanguage();
        java.lang.String str17 = property14.getAsText(locale15);
        java.lang.String str18 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDateTime8, (-1), locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = localDateTime8.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime8.minusDays(51);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime31 = dateTime30.withLaterOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime34 = dateTime31.withPeriodAdded(readablePeriod32, 793);
        org.joda.time.DateTime dateTime35 = dateTime34.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime34.getZone();
        org.joda.time.DateTime dateTime38 = dateTime34.withMillisOfDay(58069348);
        org.joda.time.DateTime dateTime39 = localDateTime22.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime26", (dateTime11.compareTo(dateTime26) == 0) == dateTime11.equals(dateTime26));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours((int) (byte) 0);
        java.util.Date date11 = dateTime8.toDate();
        org.joda.time.DateTime.Property property12 = dateTime8.dayOfMonth();
        org.joda.time.DateTime.Property property13 = dateTime8.dayOfMonth();
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale14.getLanguage();
        java.lang.String str16 = property13.getAsText(locale14);
        java.lang.String str17 = property6.getAsShortText(locale14);
        org.joda.time.tz.NameProvider nameProvider18 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str22 = nameProvider18.getName(locale19, "2022-02-21T15:06:28.281+00:00:00.052", "secondOfDay");
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.clockhourOfDay();
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale29.getVariant();
        java.lang.String str31 = dateTimeField27.getAsText((-1), locale29);
        java.lang.String str34 = nameProvider18.getShortName(locale29, "2022-02-21T15:06:18.239+00:00:00.052", "en_US");
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale35.getDisplayScript();
        java.lang.String str40 = nameProvider18.getShortName(locale35, "-1", "");
        java.lang.String str41 = locale35.getDisplayScript();
        java.util.Set<java.lang.String> strSet42 = locale35.getUnicodeLocaleKeys();
        java.lang.String str43 = locale14.getDisplayVariant(locale35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime26", (dateTime1.compareTo(dateTime26) == 0) == dateTime1.equals(dateTime26));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plus(12L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusHours((int) (byte) 0);
        boolean boolean11 = dateTime9.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((int) 'a');
        boolean boolean16 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime15.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.weekyear();
        boolean boolean25 = dateTime19.equals((java.lang.Object) localDateTime21);
        org.joda.time.DateTime dateTime27 = dateTime19.minusMonths(54616882);
        org.joda.time.DateTime.Property property28 = dateTime27.millisOfSecond();
        boolean boolean29 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology31, locale32, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField36 = null;
        dateTimeParserBucket35.saveField(dateTimeField36, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale41 = java.util.Locale.ROOT;
        dateTimeParserBucket35.saveField(dateTimeFieldType39, "it", locale41);
        boolean boolean43 = dateTime1.isSupported(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusHours((int) (byte) 0);
        boolean boolean49 = dateTime47.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime47.toMutableDateTime(dateTimeZone50);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.era();
        int int54 = mutableDateTime52.get(dateTimeFieldType53);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology57 = localDateTime56.getChronology();
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology57.secondOfMinute();
        org.joda.time.DurationField durationField60 = chronology57.millis();
        boolean boolean61 = dateTimeFieldType53.isSupported(chronology57);
        org.joda.time.DateTimeField dateTimeField62 = chronology57.millisOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology57.secondOfDay();
        org.joda.time.DateTime dateTime64 = dateTime1.toDateTime(chronology57);
        org.joda.time.DateTimeField dateTimeField65 = chronology57.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime64", (dateTime1.compareTo(dateTime64) == 0) == dateTime1.equals(dateTime64));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateMidnight dateMidnight6 = dateTime3.toDateMidnight();
        boolean boolean8 = dateTime3.isEqual((long) 999);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = durationFieldType9.getField(chronology12);
        java.lang.String str16 = durationFieldType9.getName();
        org.joda.time.DateTime dateTime18 = dateTime3.withFieldAdded(durationFieldType9, 60595082);
        java.lang.String str19 = durationFieldType9.getName();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(chronology23);
        java.lang.String str25 = chronology23.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.Chronology chronology29 = chronology23.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField30 = chronology23.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = chronology23.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(35999999L, chronology23);
        org.joda.time.DurationField durationField33 = durationFieldType9.getField(chronology23);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusHours((int) (byte) 0);
        boolean boolean40 = dateTime38.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusWeeks((int) 'a');
        boolean boolean45 = dateTime38.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = dateTime44.toDateTime();
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        long long51 = chronology47.add(readablePeriod48, (long) 536, 784);
        org.joda.time.DateTimeField dateTimeField52 = chronology47.secondOfDay();
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("1146");
        java.lang.String str55 = locale54.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(1645456076067L, chronology47, locale54);
        org.joda.time.DurationField durationField57 = chronology47.weekyears();
        boolean boolean58 = durationFieldType9.isSupported(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime36", (dateTime3.compareTo(dateTime36) == 0) == dateTime3.equals(dateTime36));
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str4 = nameProvider0.getName(locale1, "2022-02-21T15:06:28.281+00:00:00.052", "secondOfDay");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime14 = dateTime10.minusDays(0);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear((-1));
        org.joda.time.DateTime dateTime21 = dateTime19.plusMonths(10);
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfDay();
        int int23 = dateTime21.getYearOfEra();
        boolean boolean24 = dateTime10.isBefore((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology25 = dateTime21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime21.getZone();
        java.util.Locale locale30 = new java.util.Locale("-0001-02-22T15:06:25.002+00:00:00.052", "");
        java.util.Locale locale31 = locale30.stripExtensions();
        java.lang.String str32 = dateTimeZone26.getShortName(1645456010538L, locale31);
        java.lang.String str35 = nameProvider0.getName(locale31, "1146", "-0001-02-22T15:06:45.260+00:00:00.052");
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.clockhourOfDay();
        long long42 = dateTimeField40.roundHalfEven((long) 54590);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology47 = localDateTime46.getChronology();
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now(chronology47);
        org.joda.time.DateTimeField dateTimeField49 = chronology47.secondOfMinute();
        org.joda.time.DurationField durationField50 = chronology47.millis();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusSeconds((int) ' ');
        long long56 = chronology47.set((org.joda.time.ReadablePartial) localDateTime54, (long) 99);
        org.joda.time.DurationField durationField57 = chronology47.weekyears();
        java.util.Locale locale60 = new java.util.Locale("-0001-02-22T15:06:25.002+00:00:00.052", "");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(3275220000L, chronology47, locale60, (java.lang.Integer) 768);
        java.lang.String str63 = dateTimeField40.getAsText(23L, locale60);
        java.util.Locale locale64 = locale60.stripExtensions();
        java.lang.String str67 = nameProvider0.getName(locale64, "2022-02-21T15:08:29.870+00:00:00.052", "Cina");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime39", (dateTime8.compareTo(dateTime39) == 0) == dateTime8.equals(dateTime39));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.minusHours(15);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime5.toDateTime(dateTimeZone16);
        int int21 = dateTimeZone16.getOffset((long) 54620217);
        java.lang.String str23 = dateTimeZone16.getNameKey((long) 54637);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime34 = dateTime31.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean35 = dateTime34.isEqualNow();
        org.joda.time.DateTime.Property property36 = dateTime34.secondOfMinute();
        org.joda.time.DateTime dateTime38 = property36.addToCopy(0L);
        int int39 = dateTime38.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withWeekyear((-1));
        org.joda.time.DateTime dateTime45 = dateTime41.plusHours((int) (byte) 100);
        int int46 = dateTime41.getDayOfYear();
        int int47 = dateTime41.getDayOfWeek();
        org.joda.time.DateTime dateTime49 = dateTime41.plus((long) 21);
        org.joda.time.Chronology chronology50 = dateTime49.getChronology();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant52 = null;
        int int53 = dateTimeZone51.getOffset(readableInstant52);
        java.lang.String str55 = dateTimeZone51.getName(0L);
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone51);
        int int58 = dateTimeZone51.getOffset((long) 25);
        java.lang.String str60 = dateTimeZone51.getName((long) 768);
        java.lang.String str61 = dateTimeZone51.toString();
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime49.toMutableDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime63 = dateTime38.withZoneRetainFields(dateTimeZone51);
        long long65 = dateTimeZone16.getMillisKeepLocal(dateTimeZone51, (long) (-292277023));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime27", (dateTime1.compareTo(dateTime27) == 0) == dateTime1.equals(dateTime27));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.millisOfSecond();
        org.joda.time.DurationField durationField21 = chronology17.seconds();
        org.joda.time.DurationField durationField22 = chronology17.centuries();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.millisOfSecond();
        org.joda.time.DurationField durationField24 = chronology17.years();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology17.getZone();
        org.joda.time.DurationField durationField26 = chronology17.minutes();
        org.joda.time.DurationField durationField27 = chronology17.weeks();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(1645455979171L, chronology17);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        int int30 = localDateTime28.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.plusDays(365);
        int int33 = localDateTime32.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withDurationAdded(readableDuration34, 908);
        int int37 = localDateTime32.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology41 = localDateTime40.getChronology();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = property42.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.era();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.dayOfYear();
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str54 = locale53.getDisplayCountry();
        java.lang.String str55 = property52.getAsText(locale53);
        int int56 = dateTimeField47.getMaximumTextLength(locale53);
        java.lang.String str57 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime32, 868, locale53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime51", (dateTime1.compareTo(dateTime51) == 0) == dateTime1.equals(dateTime51));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.secondOfMinute();
        org.joda.time.DurationField durationField8 = chronology5.millis();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusSeconds((int) ' ');
        long long14 = chronology5.set((org.joda.time.ReadablePartial) localDateTime12, (long) 99);
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 212, chronology5, locale15, (java.lang.Integer) (-1), (-948));
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(72000052L, dateTimeZone21);
        dateTimeParserBucket19.setZone(dateTimeZone21);
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (long) 212);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime34 = property31.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.weekyear();
        boolean boolean38 = dateTimeZone21.isLocalDateTimeGap(localDateTime36);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone21.getName(979L, locale40);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.LocalDateTime.Property property46 = localDateTime44.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean48 = localDateTime44.isSupported(dateTimeFieldType47);
        java.lang.String str49 = dateTimeFieldType47.getName();
        int int50 = dateTime42.get(dateTimeFieldType47);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(chronology53);
        java.lang.String str55 = chronology53.toString();
        org.joda.time.DurationField durationField56 = chronology53.hours();
        org.joda.time.DateTimeField dateTimeField57 = chronology53.secondOfDay();
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.plusMonths((int) (byte) 100);
        int[] intArray64 = chronology53.get((org.joda.time.ReadablePartial) localDateTime62, 100L);
        org.joda.time.Chronology chronology65 = chronology53.withUTC();
        org.joda.time.DateTimeField dateTimeField66 = chronology53.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField67 = chronology53.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField68 = dateTimeFieldType47.getField(chronology53);
        int int69 = dateTimeField68.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime54", (dateTime22.compareTo(dateTime54) == 0) == dateTime22.equals(dateTime54));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.weekOfWeekyear();
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale7.getCountry();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology11, locale12, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket15.saveField(dateTimeField16, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale21 = java.util.Locale.ROOT;
        dateTimeParserBucket15.saveField(dateTimeFieldType19, "it", locale21);
        java.lang.String str23 = locale7.getDisplayName(locale21);
        java.lang.String str24 = dateTimeField5.getAsShortText(0, locale21);
        int int25 = dateTimeField5.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withWeekyear(429);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusHours((int) (byte) 0);
        boolean boolean41 = dateTime39.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime39.toMutableDateTime(dateTimeZone42);
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str47 = dateTimeZone42.getShortName((long) (short) 100, locale46);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 999, dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.withWeekyear((-1));
        org.joda.time.DateTime.Property property54 = dateTime51.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology57 = localDateTime56.getChronology();
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology57.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology62 = localDateTime61.getChronology();
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now(chronology62);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property69 = dateTime66.centuryOfEra();
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        java.lang.String str71 = locale70.getLanguage();
        java.lang.String str72 = property69.getAsText(locale70);
        java.lang.String str73 = dateTimeField59.getAsText((org.joda.time.ReadablePartial) localDateTime63, (-1), locale70);
        java.util.Locale locale75 = java.util.Locale.ITALIAN;
        java.lang.String str76 = locale75.getLanguage();
        java.lang.String str77 = dateTimeField59.getAsShortText((int) (byte) 10, locale75);
        java.lang.String str78 = property54.getAsShortText(locale75);
        java.lang.String str79 = dateTimeZone42.getShortName((-53999788L), locale75);
        java.lang.String str80 = locale75.getCountry();
        java.lang.String str81 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localDateTime33, 100, locale75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime37", (dateTime3.compareTo(dateTime37) == 0) == dateTime3.equals(dateTime37));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("Property[millisOfSecond]");
        java.lang.String str7 = nameProvider0.getName(locale4, "weekOfWeekyear", "-0001-02-22T15:07:08.008Z");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale11, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket14.saveField(dateTimeField15, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        dateTimeParserBucket14.saveField(dateTimeFieldType18, "it", locale20);
        java.util.Locale locale25 = new java.util.Locale("ISOChronology[UTC]", "it", "10");
        java.lang.String str26 = locale20.getDisplayScript(locale25);
        java.util.Locale.setDefault(locale25);
        java.util.Set<java.lang.String> strSet28 = locale25.getUnicodeLocaleKeys();
        java.lang.String str29 = locale25.getISO3Country();
        java.lang.String str32 = nameProvider0.getShortName(locale25, "Property[secondOfDay]", "-0001-02-22T15:09:11.514+00:00:00.052");
        java.util.Locale.Builder builder33 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder33.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale.Builder builder36 = builder35.clearExtensions();
        java.util.Locale.Builder builder39 = builder36.setExtension('a', "French");
        java.util.Locale locale40 = builder39.build();
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.lang.String str44 = nameProvider0.getName(locale40, "-0001-02-22T00:11:39.057+00:00:00.052", "46");
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar49 = dateTime48.toGregorianCalendar();
        org.joda.time.DateTime.Property property50 = dateTime48.millisOfSecond();
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.lang.String str52 = locale51.getScript();
        java.util.Calendar calendar53 = dateTime48.toCalendar(locale51);
        java.lang.String str56 = nameProvider0.getName(locale51, "-0001-02-22T00:07:37.724+00:00:00.052", "23");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar49 and calendar53", (gregorianCalendar49.compareTo(calendar53) == 0) == gregorianCalendar49.equals(calendar53));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.months();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfCentury();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.Chronology chronology7 = chronology2.withUTC();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 999, dateTimeZone14);
        org.joda.time.Chronology chronology18 = chronology2.withZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime12", (dateTime6.compareTo(dateTime12) == 0) == dateTime6.equals(dateTime12));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        java.util.Date date7 = dateTime5.toDate();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology11, locale12, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket15.saveField(dateTimeField16, (int) (short) 0);
        java.lang.Integer int19 = dateTimeParserBucket15.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        long long23 = dateTimeZone20.convertLocalToUTC(0L, false);
        dateTimeParserBucket15.setZone(dateTimeZone20);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 948, chronology25);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime31 = property30.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusHours((int) (byte) 0);
        boolean boolean40 = dateTime38.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusWeeks((int) 'a');
        boolean boolean45 = dateTime38.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = dateTime44.toDateTime();
        org.joda.time.DateTime dateTime48 = dateTime44.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property53 = localDateTime50.weekyear();
        boolean boolean54 = dateTime48.equals((java.lang.Object) localDateTime50);
        int[] intArray56 = chronology34.get((org.joda.time.ReadablePartial) localDateTime50, (long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime61 = localDateTime50.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime50.withDayOfMonth(6);
        org.joda.time.DateTime dateTime64 = localDateTime50.toDateTime();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime50.minusHours(483);
        org.joda.time.LocalDateTime.Property property67 = localDateTime50.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = dateTime70.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar73 = dateTime72.toGregorianCalendar();
        int int74 = dateTime72.getMillisOfSecond();
        org.joda.time.DateTime.Property property75 = dateTime72.minuteOfHour();
        java.util.Locale locale76 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime78.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property81 = dateTime78.centuryOfEra();
        java.util.Locale locale82 = java.util.Locale.ITALIAN;
        java.lang.String str83 = locale82.getLanguage();
        java.lang.String str84 = property81.getAsText(locale82);
        java.lang.String str85 = locale76.getDisplayName(locale82);
        int int86 = property75.getMaximumTextLength(locale82);
        java.util.Set<java.lang.String> strSet87 = locale82.getUnicodeLocaleAttributes();
        java.lang.String str88 = locale82.getVariant();
        org.joda.time.LocalDateTime localDateTime89 = property67.setCopy("28", locale82);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket92 = new org.joda.time.format.DateTimeParserBucket((long) 54661560, chronology25, locale82, (java.lang.Integer) 286, 53);
        org.joda.time.DurationField durationField93 = chronology25.millis();
        org.joda.time.DateTime dateTime94 = dateTime5.withChronology(chronology25);
        org.joda.time.DateTime.Property property95 = dateTime94.weekOfWeekyear();
        org.joda.time.DateTime dateTime97 = property95.addToCopy(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime97", (dateTime5.compareTo(dateTime97) == 0) == dateTime5.equals(dateTime97));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime8 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime7.plusDays(467);
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra(13);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime13.plusMillis(54418174);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = dateTime16.toString(dateTimeFormatter17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime26 = dateTime22.minusDays(0);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime22.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekyear((-1));
        org.joda.time.DateTime dateTime33 = dateTime31.plusMonths(10);
        org.joda.time.DateTime.Property property34 = dateTime33.minuteOfDay();
        int int35 = dateTime33.getYearOfEra();
        boolean boolean36 = dateTime22.isBefore((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology37 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.clockhourOfDay();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime16.toMutableDateTime(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime20", (dateTime3.compareTo(dateTime20) == 0) == dateTime3.equals(dateTime20));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.Chronology chronology8 = chronology2.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField9 = chronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField11 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology2.secondOfMinute();
        int int15 = dateTimeField13.getMaximumValue((long) 501);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusDays(212);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.weekyear();
        org.joda.time.LocalDateTime localDateTime27 = property25.addWrapFieldToCopy(576);
        org.joda.time.LocalDateTime localDateTime28 = property25.withMinimumValue();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.plus(readableDuration30);
        java.util.Locale locale36 = new java.util.Locale("54391", "-0001-02-22T15:06:23.107+00:00:00.052", "secondOfDay");
        java.lang.String str37 = locale36.getCountry();
        java.util.Set<java.lang.String> strSet38 = locale36.getUnicodeLocaleKeys();
        java.util.Locale locale39 = java.util.Locale.SIMPLIFIED_CHINESE;
        boolean boolean40 = locale39.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property45 = dateTime42.centuryOfEra();
        java.util.Locale locale46 = java.util.Locale.ITALIAN;
        java.lang.String str47 = locale46.getLanguage();
        java.lang.String str48 = property45.getAsText(locale46);
        java.lang.String str49 = locale39.getDisplayLanguage(locale46);
        java.lang.String str50 = locale36.getDisplayVariant(locale39);
        java.lang.String str51 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime28, 1874, locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime42", (dateTime3.compareTo(dateTime42) == 0) == dateTime3.equals(dateTime42));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = dateTime1.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTime dateTime6 = dateTime1.withChronology(chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime dateTime9 = dateTime6.withField(dateTimeFieldType7, 0);
        int int10 = dateTime6.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusDays(212);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime22 = property20.addWrapFieldToCopy(576);
        org.joda.time.LocalDateTime localDateTime23 = property20.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withWeekOfWeekyear(10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusYears(54391);
        org.joda.time.DateTime dateTime28 = dateTime6.withFields((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.DateTime.Property property29 = dateTime6.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours((int) (byte) 0);
        boolean boolean35 = dateTime33.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime33.toMutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.era();
        int int40 = mutableDateTime38.get(dateTimeFieldType39);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now(chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.secondOfMinute();
        org.joda.time.DurationField durationField46 = chronology43.millis();
        boolean boolean47 = dateTimeFieldType39.isSupported(chronology43);
        org.joda.time.DateTimeField dateTimeField48 = chronology43.millisOfDay();
        org.joda.time.DateTimeField dateTimeField49 = chronology43.hourOfDay();
        boolean boolean51 = dateTimeField49.isLeap(1645456023970L);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now(chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.millisOfSecond();
        org.joda.time.DurationField durationField59 = chronology55.seconds();
        org.joda.time.DurationField durationField60 = chronology55.centuries();
        org.joda.time.DateTimeField dateTimeField61 = chronology55.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField62 = chronology55.monthOfYear();
        java.util.Locale locale63 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket(72000052L, chronology55, locale63);
        java.util.Locale locale65 = locale63.stripExtensions();
        java.util.Locale locale66 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleKeys();
        java.lang.String str68 = locale65.getDisplayScript(locale66);
        int int69 = dateTimeField49.getMaximumShortTextLength(locale65);
        int int70 = property29.getMaximumTextLength(locale65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime6", (dateTime1.compareTo(dateTime6) == 0) == dateTime1.equals(dateTime6));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology3.seconds();
        org.joda.time.DurationField durationField8 = chronology3.centuries();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.millisOfSecond();
        org.joda.time.DurationField durationField10 = chronology3.years();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        java.lang.String str14 = dateTimeZone12.toString();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.clockhourOfDay();
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale22.getVariant();
        java.lang.String str24 = dateTimeField20.getAsText((-1), locale22);
        boolean boolean25 = locale22.hasExtensions();
        java.lang.String str26 = dateTimeZone12.getName(1645455983203L, locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(32400000L, chronology3, locale22, (java.lang.Integer) 483);
        java.util.Locale locale29 = dateTimeParserBucket28.getLocale();
        org.joda.time.Chronology chronology30 = dateTimeParserBucket28.getChronology();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        java.util.GregorianCalendar gregorianCalendar33 = dateTime32.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DateTime dateTime37 = dateTime32.withChronology(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime32.minusMillis(887);
        int int40 = dateTime32.getMonthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = dateTime32.toString(dateTimeFormatter41);
        org.joda.time.DateTime.Property property43 = dateTime32.dayOfWeek();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((java.lang.Object) 35999999L);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int47 = dateTime45.get(dateTimeFieldType46);
        int int48 = dateTime32.get(dateTimeFieldType46);
        boolean boolean49 = dateTimeParserBucket28.restoreState((java.lang.Object) int48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime32", (dateTime19.compareTo(dateTime32) == 0) == dateTime19.equals(dateTime32));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket5.saveField(dateTimeField6, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        dateTimeParserBucket5.saveField(dateTimeFieldType9, "it", locale11);
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType9.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property17.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfEra((int) 'x');
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withFieldAdded(durationFieldType21, (int) (byte) -1);
        java.lang.String str24 = durationFieldType21.getName();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusHours((int) (byte) 0);
        boolean boolean30 = dateTime28.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusWeeks((int) 'a');
        boolean boolean35 = dateTime28.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime();
        org.joda.time.Chronology chronology37 = dateTime36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.months();
        org.joda.time.Chronology chronology39 = chronology37.withUTC();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        boolean boolean41 = durationFieldType21.isSupported(chronology39);
        org.joda.time.DurationField durationField42 = durationFieldType13.getField(chronology39);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = chronology45.getZone();
        org.joda.time.DurationField durationField48 = chronology45.centuries();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.era();
        org.joda.time.DurationField durationField50 = chronology45.years();
        long long52 = durationField50.getValueAsLong(239L);
        int int53 = durationField42.compareTo(durationField50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime46", (dateTime26.compareTo(dateTime46) == 0) == dateTime26.equals(dateTime46));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMinutes(20);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks(15);
        boolean boolean17 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField24 = durationFieldType18.getField(chronology21);
        java.lang.String str25 = durationFieldType18.getName();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime14.withFieldAdded(durationFieldType18, (int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusMillis(743);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(chronology32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime38 = dateTime37.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime40 = dateTime37.plusDays(467);
        org.joda.time.DateTime dateTime41 = dateTime40.toDateTimeISO();
        org.joda.time.DateTime dateTime43 = dateTime41.withYearOfEra(13);
        org.joda.time.DateTime dateTime44 = dateTime43.toDateTime();
        org.joda.time.DateTime dateTime46 = dateTime43.plusMillis(54418174);
        org.joda.time.DateTime dateTime47 = localDateTime29.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        int int48 = dateTime43.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.millisOfSecond();
        org.joda.time.DurationField durationField55 = chronology51.seconds();
        org.joda.time.DurationField durationField56 = chronology51.centuries();
        org.joda.time.DateTimeField dateTimeField57 = chronology51.millisOfSecond();
        org.joda.time.DurationField durationField58 = chronology51.years();
        org.joda.time.Chronology chronology59 = chronology51.withUTC();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime62.withWeekyear((-1));
        org.joda.time.DateTime dateTime66 = dateTime64.plusMonths(10);
        org.joda.time.DateTime.Property property67 = dateTime66.minuteOfDay();
        int int68 = dateTime66.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone71 = dateTimeZone70.toTimeZone();
        org.joda.time.DateTime dateTime72 = dateTime66.withZone(dateTimeZone70);
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        java.lang.String str75 = dateTimeZone70.getName((long) 26, locale74);
        long long78 = dateTimeZone70.adjustOffset((long) 657, false);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime80 = org.joda.time.DateTime.now(dateTimeZone79);
        org.joda.time.DateTime dateTime82 = dateTime80.plusHours((int) (byte) 0);
        boolean boolean84 = dateTime82.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone86 = dateTimeZone85.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime87 = dateTime82.toMutableDateTime(dateTimeZone85);
        long long89 = dateTimeZone70.getMillisKeepLocal(dateTimeZone85, 657L);
        org.joda.time.DateTime dateTime90 = new org.joda.time.DateTime(dateTimeZone85);
        org.joda.time.Chronology chronology91 = chronology51.withZone(dateTimeZone85);
        org.joda.time.DateTimeField dateTimeField92 = chronology91.weekyear();
        org.joda.time.DateTimeField dateTimeField93 = chronology91.secondOfDay();
        org.joda.time.DateTimeField dateTimeField94 = chronology91.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime95 = dateTime43.toMutableDateTime(chronology91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime62", (dateTime22.compareTo(dateTime62) == 0) == dateTime22.equals(dateTime62));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        boolean boolean7 = dateTime5.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime5.toMutableDateTime(dateTimeZone8);
        int int10 = dateTime5.getDayOfMonth();
        int int11 = dateTime5.getDayOfWeek();
        org.joda.time.TimeOfDay timeOfDay12 = dateTime5.toTimeOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekyear((-1));
        org.joda.time.DateTime dateTime20 = dateTime18.plusMonths(10);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        int int22 = dateTime20.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTime dateTime26 = dateTime20.withZone(dateTimeZone24);
        long long29 = dateTimeZone24.adjustOffset((long) 86399, true);
        long long32 = dateTimeZone24.convertLocalToUTC(196545600000L, false);
        org.joda.time.DateTime dateTime33 = dateTime14.withZone(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime33.toDateTime(dateTimeZone35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime39 = dateTime33.withDurationAdded(readableDuration37, 13);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundHalfEvenCopy();
        java.lang.String str45 = property43.getAsText();
        org.joda.time.LocalDateTime localDateTime46 = property43.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone48 = dateTimeZone47.toTimeZone();
        java.lang.String str49 = dateTimeZone47.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone47);
        int int52 = dateTimeZone47.getOffset(0L);
        org.joda.time.DateTime dateTime53 = localDateTime46.toDateTime(dateTimeZone47);
        int int55 = dateTimeZone47.getOffset((long) 12);
        java.util.Locale locale58 = new java.util.Locale("15");
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar63 = dateTime62.toGregorianCalendar();
        int int64 = dateTime62.getMillisOfSecond();
        org.joda.time.DateTime.Property property65 = dateTime62.minuteOfHour();
        java.util.Locale locale66 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(dateTimeZone67);
        org.joda.time.DateTime dateTime70 = dateTime68.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property71 = dateTime68.centuryOfEra();
        java.util.Locale locale72 = java.util.Locale.ITALIAN;
        java.lang.String str73 = locale72.getLanguage();
        java.lang.String str74 = property71.getAsText(locale72);
        java.lang.String str75 = locale66.getDisplayName(locale72);
        int int76 = property65.getMaximumTextLength(locale72);
        java.lang.String str77 = locale58.getDisplayName(locale72);
        java.lang.String str78 = dateTimeZone47.getShortName(1645456023918L, locale58);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((java.lang.Object) readableDuration37, dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime33", (dateTime5.compareTo(dateTime33) == 0) == dateTime5.equals(dateTime33));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology3.seconds();
        org.joda.time.DurationField durationField8 = chronology3.centuries();
        org.joda.time.DurationField durationField9 = chronology3.minutes();
        org.joda.time.DurationField durationField10 = chronology3.hours();
        org.joda.time.DateTimeField dateTimeField11 = chronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology3.weekyear();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.millisOfSecond();
        org.joda.time.DurationField durationField20 = chronology16.seconds();
        org.joda.time.DurationField durationField21 = chronology16.centuries();
        org.joda.time.DurationField durationField22 = chronology16.minutes();
        org.joda.time.DurationField durationField23 = chronology16.hours();
        org.joda.time.DateTimeField dateTimeField24 = chronology16.weekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekyear((-1));
        org.joda.time.DateTime dateTime31 = dateTime29.plusMonths(10);
        org.joda.time.DateTime.Property property32 = dateTime31.minuteOfDay();
        int int33 = dateTime31.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        org.joda.time.DateTime dateTime37 = dateTime31.withZone(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(0L, dateTimeZone35);
        java.util.Locale locale39 = java.util.Locale.ITALIAN;
        java.lang.String str40 = locale39.getScript();
        java.lang.String str41 = locale39.toLanguageTag();
        java.lang.String str42 = dateTimeField24.getAsText((org.joda.time.ReadablePartial) localDateTime38, locale39);
        java.lang.String str43 = locale39.getDisplayLanguage();
        java.lang.String str44 = locale39.getISO3Country();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 54617985, chronology3, locale39, (java.lang.Integer) 103, 54439);
        long long48 = dateTimeParserBucket47.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeParserBucket47.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime37", (dateTime31.compareTo(dateTime37) == 0) == dateTime31.equals(dateTime37));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = dateTime5.withZone(dateTimeZone9);
        org.joda.time.DateTime.Property property12 = dateTime5.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int14 = dateTime5.get(dateTimeFieldType13);
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType13.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime11", (dateTime5.compareTo(dateTime11) == 0) == dateTime5.equals(dateTime11));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours((int) (byte) 0);
        boolean boolean6 = dateTime4.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) 'a');
        boolean boolean11 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime10.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.weekyear();
        boolean boolean20 = dateTime14.equals((java.lang.Object) localDateTime16);
        org.joda.time.DateTime dateTime22 = dateTime14.minusMonths(54616882);
        org.joda.time.LocalDateTime localDateTime23 = dateTime22.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfMonth();
        org.joda.time.Chronology chronology25 = localDateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.weekOfWeekyear();
        org.joda.time.DurationField durationField27 = chronology25.days();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = property31.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.era();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.dayOfYear();
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str43 = locale42.getDisplayCountry();
        java.lang.String str44 = property41.getAsText(locale42);
        int int45 = dateTimeField36.getMaximumTextLength(locale42);
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str47 = locale42.getDisplayScript(locale46);
        java.util.Set<java.lang.String> strSet48 = locale42.getUnicodeLocaleKeys();
        java.lang.String str49 = locale42.getISO3Country();
        java.lang.String str50 = locale42.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket(17452800052L, chronology25, locale42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime40", (dateTime2.compareTo(dateTime40) == 0) == dateTime2.equals(dateTime40));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        java.util.Locale locale1 = new java.util.Locale("-0001-02-22T15:06:40.971+00:00:00.052");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.DateTime.Property property8 = dateTime6.millisOfSecond();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale9.getScript();
        java.util.Calendar calendar11 = dateTime6.toCalendar(locale9);
        java.lang.String str12 = locale1.getDisplayName(locale9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar7 and calendar11", (gregorianCalendar7.compareTo(calendar11) == 0) == gregorianCalendar7.equals(calendar11));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfYear();
        org.joda.time.DateTime dateTime6 = dateTime3.minus((long) 671);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology8, locale9, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket12.saveField(dateTimeField13, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale18 = java.util.Locale.ROOT;
        dateTimeParserBucket12.saveField(dateTimeFieldType16, "it", locale18);
        int int20 = dateTime3.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfEvenCopy();
        java.lang.String str26 = property24.getAsText();
        org.joda.time.LocalDateTime localDateTime27 = property24.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        java.lang.String str30 = dateTimeZone28.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        int int33 = dateTimeZone28.getOffset(0L);
        org.joda.time.DateTime dateTime34 = localDateTime27.toDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        java.lang.String str38 = dateTimeZone36.toString();
        long long40 = dateTimeZone28.getMillisKeepLocal(dateTimeZone36, 1645455977932L);
        boolean boolean41 = dateTime3.equals((java.lang.Object) dateTimeZone28);
        org.joda.time.DateTime dateTime43 = dateTime3.minusMillis(575);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime49 = dateTime47.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime51 = dateTime47.minusDays(0);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime47.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.withWeekyear((-1));
        org.joda.time.DateTime dateTime58 = dateTime56.plusMonths(10);
        org.joda.time.DateTime.Property property59 = dateTime58.minuteOfDay();
        int int60 = dateTime58.getYearOfEra();
        boolean boolean61 = dateTime47.isBefore((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology62 = dateTime58.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.minuteOfDay();
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder68 = builder65.setExtension('a', "cinese");
        java.util.Locale locale69 = builder65.build();
        java.lang.String str70 = locale69.getDisplayVariant();
        java.lang.String str71 = dateTimeField63.getAsShortText((long) 346, locale69);
        org.joda.time.DurationField durationField72 = dateTimeField63.getDurationField();
        int int73 = dateTime43.get(dateTimeField63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime45", (dateTime3.compareTo(dateTime45) == 0) == dateTime3.equals(dateTime45));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        java.util.Locale locale1 = new java.util.Locale("");
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(chronology9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property16 = dateTime13.centuryOfEra();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale17.getLanguage();
        java.lang.String str19 = property16.getAsText(locale17);
        java.lang.String str20 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime10, (-1), locale17);
        long long23 = dateTimeField6.add((long) 99, (long) 26);
        long long25 = dateTimeField6.roundFloor(12167496377932L);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("2");
        java.lang.String str35 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime29, 54625758, locale34);
        java.lang.String str36 = locale34.getDisplayCountry();
        java.lang.String str37 = locale1.getDisplayScript(locale34);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology41 = localDateTime40.getChronology();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.weekyearOfCentury();
        org.joda.time.DurationField durationField44 = durationFieldType38.getField(chronology41);
        org.joda.time.DateTimeField dateTimeField45 = chronology41.millisOfDay();
        org.joda.time.DateTimeField dateTimeField46 = chronology41.weekyear();
        org.joda.time.DurationField durationField47 = chronology41.centuries();
        boolean boolean48 = durationField47.isSupported();
        org.joda.time.DurationFieldType durationFieldType49 = durationField47.getType();
        boolean boolean50 = locale1.equals((java.lang.Object) durationField47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime42", (dateTime13.compareTo(dateTime42) == 0) == dateTime13.equals(dateTime42));
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology3);
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.Chronology chronology9 = chronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField10 = chronology3.seconds();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology3, locale11, (java.lang.Integer) 25, 2922789);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime21 = property18.addWrapFieldToCopy(28);
        org.joda.time.DateTimeField dateTimeField22 = property18.getField();
        java.lang.String str24 = dateTimeField22.getAsShortText((long) (short) 10);
        dateTimeParserBucket14.saveField(dateTimeField22, (int) '#');
        java.lang.Integer int27 = dateTimeParserBucket14.getPivotYear();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology29, locale30, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField34 = null;
        dateTimeParserBucket33.saveField(dateTimeField34, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale39 = java.util.Locale.ROOT;
        dateTimeParserBucket33.saveField(dateTimeFieldType37, "it", locale39);
        java.lang.String str41 = dateTimeFieldType37.getName();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant44 = null;
        int int45 = dateTimeZone43.getOffset(readableInstant44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone43);
        boolean boolean48 = dateTimeZone43.isStandardOffset(1645456005603L);
        java.util.Locale locale52 = new java.util.Locale("clockhourOfDay", "86399");
        java.lang.String str53 = dateTimeZone43.getName(1645456257724L, locale52);
        java.util.Locale locale54 = null;
        java.lang.String str55 = locale52.getDisplayScript(locale54);
        dateTimeParserBucket14.saveField(dateTimeFieldType37, "years", locale52);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.plusHours((int) (byte) 0);
        boolean boolean62 = dateTime60.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = dateTime64.minusWeeks((int) 'a');
        boolean boolean67 = dateTime60.isAfter((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime68 = dateTime66.toDateTime();
        org.joda.time.Chronology chronology69 = dateTime68.getChronology();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime71.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology74 = dateTime71.getChronology();
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.now(chronology74);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((java.lang.Object) dateTime68, chronology74);
        org.joda.time.DateTimeZone dateTimeZone77 = chronology74.getZone();
        java.lang.String str79 = dateTimeZone77.getName((long) 54620217);
        dateTimeParserBucket14.setZone(dateTimeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime46", (dateTime4.compareTo(dateTime46) == 0) == dateTime4.equals(dateTime46));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyearOfCentury();
        long long7 = dateTimeField4.add((long) 2922789, 100L);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getDisplayVariant();
        java.lang.String str13 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDateTime9, 576, locale11);
        long long15 = dateTimeField4.roundHalfEven(0L);
        long long17 = dateTimeField4.remainder((long) 54599);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property38 = dateTime35.centuryOfEra();
        java.util.Locale locale39 = java.util.Locale.ITALIAN;
        java.lang.String str40 = locale39.getLanguage();
        java.lang.String str41 = property38.getAsText(locale39);
        java.lang.String str42 = dateTimeField28.getAsText((org.joda.time.ReadablePartial) localDateTime32, (-1), locale39);
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.lang.String str45 = locale44.getLanguage();
        java.lang.String str46 = dateTimeField28.getAsShortText((int) (byte) 10, locale44);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) 9999, chronology22, locale44, (java.lang.Integer) 54616882);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology56 = localDateTime55.getChronology();
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(chronology56);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property63 = dateTime60.centuryOfEra();
        java.util.Locale locale64 = java.util.Locale.ITALIAN;
        java.lang.String str65 = locale64.getLanguage();
        java.lang.String str66 = property63.getAsText(locale64);
        java.lang.String str67 = dateTimeField53.getAsText((org.joda.time.ReadablePartial) localDateTime57, (-1), locale64);
        java.lang.String str68 = locale44.getDisplayScript(locale64);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology71 = localDateTime70.getChronology();
        org.joda.time.LocalDateTime localDateTime72 = org.joda.time.LocalDateTime.now(chronology71);
        org.joda.time.DateTimeField dateTimeField73 = chronology71.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology76 = localDateTime75.getChronology();
        org.joda.time.LocalDateTime localDateTime77 = org.joda.time.LocalDateTime.now(chronology76);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime80 = org.joda.time.DateTime.now(dateTimeZone79);
        org.joda.time.DateTime dateTime82 = dateTime80.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property83 = dateTime80.centuryOfEra();
        java.util.Locale locale84 = java.util.Locale.ITALIAN;
        java.lang.String str85 = locale84.getLanguage();
        java.lang.String str86 = property83.getAsText(locale84);
        java.lang.String str87 = dateTimeField73.getAsText((org.joda.time.ReadablePartial) localDateTime77, (-1), locale84);
        java.util.Locale locale89 = java.util.Locale.ITALIAN;
        java.lang.String str90 = locale89.getLanguage();
        java.lang.String str91 = dateTimeField73.getAsShortText((int) (byte) 10, locale89);
        java.lang.String str92 = locale89.getDisplayVariant();
        java.lang.String str93 = locale64.getDisplayCountry(locale89);
        java.lang.String str94 = locale64.toLanguageTag();
        java.lang.String str95 = dateTimeField4.getAsText(0, locale64);
        java.lang.String str96 = locale64.getLanguage();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime35", (dateTime3.compareTo(dateTime35) == 0) == dateTime3.equals(dateTime35));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        boolean boolean7 = dateTime5.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime5.toMutableDateTime(dateTimeZone8);
        int int10 = dateTime5.getDayOfMonth();
        int int11 = dateTime5.getDayOfWeek();
        org.joda.time.TimeOfDay timeOfDay12 = dateTime5.toTimeOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = dateTime5.isSupported(dateTimeFieldType13);
        int int15 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) dateTime16);
        org.joda.time.DateTime dateTime19 = dateTime17.withYearOfEra(714);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime30 = dateTime27.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean31 = dateTime30.isEqualNow();
        org.joda.time.DateTime.Property property32 = dateTime30.secondOfMinute();
        org.joda.time.DateTime dateTime34 = property32.addToCopy(0L);
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime19.toMutableDateTime(chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime23", (dateTime1.compareTo(dateTime23) == 0) == dateTime1.equals(dateTime23));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyearOfCentury();
        long long7 = dateTimeField4.add((long) 2922789, 100L);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getDisplayVariant();
        java.lang.String str13 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDateTime9, 576, locale11);
        java.lang.String str14 = locale11.getScript();
        boolean boolean15 = locale11.hasExtensions();
        java.lang.String str17 = locale11.getUnicodeLocaleType("24");
        java.lang.String str18 = locale11.getDisplayVariant();
        java.util.Set<java.lang.String> strSet19 = locale11.getUnicodeLocaleAttributes();
        java.util.Spliterator<java.lang.String> strSpliterator20 = strSet19.spliterator();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusHours((int) (byte) 0);
        boolean boolean26 = dateTime24.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusWeeks((int) 'a');
        boolean boolean31 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime32 = dateTime30.toDateTime();
        org.joda.time.DateTime dateTime34 = dateTime30.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property39 = localDateTime36.weekyear();
        boolean boolean40 = dateTime34.equals((java.lang.Object) localDateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime34.getZone();
        org.joda.time.DateTime.Property property42 = dateTime34.secondOfDay();
        org.joda.time.DateTime dateTime44 = property42.addToCopy(1645456049161L);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology48 = localDateTime47.getChronology();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.era();
        boolean boolean52 = localDateTime50.isSupported(dateTimeFieldType51);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now(chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.secondOfMinute();
        boolean boolean58 = dateTimeFieldType51.isSupported(chronology55);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(0L, chronology55);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime61.minusWeeks((int) 'a');
        int int64 = dateTime63.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime dateTime67 = dateTime63.withField(dateTimeFieldType65, 2);
        boolean boolean68 = dateTime59.isSupported(dateTimeFieldType65);
        org.joda.time.DateTime dateTime70 = dateTime59.withYearOfCentury(0);
        int int71 = property42.compareTo((org.joda.time.ReadableInstant) dateTime59);
        java.lang.String str72 = property42.toString();
        boolean boolean73 = strSet19.equals((java.lang.Object) property42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime22", (dateTime3.compareTo(dateTime22) == 0) == dateTime3.equals(dateTime22));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime8 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime7.plusDays(467);
        org.joda.time.LocalDateTime localDateTime11 = dateTime10.toLocalDateTime();
        org.joda.time.DateTime dateTime13 = dateTime10.plusDays(784);
        int int14 = dateTime10.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        java.lang.String str17 = dateTimeZone15.toString();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.era();
        boolean boolean24 = localDateTime22.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime22);
        boolean boolean26 = dateTimeZone15.isLocalDateTimeGap(localDateTime25);
        org.joda.time.DateTime dateTime27 = dateTime10.withZone(dateTimeZone15);
        org.joda.time.DateTime.Property property28 = dateTime27.millisOfSecond();
        org.joda.time.DateTime dateTime29 = dateTime27.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekyear((-1));
        org.joda.time.DateTime dateTime35 = dateTime31.plusHours((int) (byte) 100);
        int int36 = dateTime31.getDayOfYear();
        java.util.GregorianCalendar gregorianCalendar37 = dateTime31.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime40 = dateTime31.withDurationAdded(readableDuration38, (int) (short) 1);
        org.joda.time.DateTime dateTime42 = dateTime31.minusWeeks(54710708);
        boolean boolean43 = dateTime27.isBefore((org.joda.time.ReadableInstant) dateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime31", (dateTime3.compareTo(dateTime31) == 0) == dateTime3.equals(dateTime31));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean2 = strSet0.add("10");
        java.util.stream.Stream<java.lang.String> strStream3 = strSet0.parallelStream();
        java.util.Set<java.lang.String> strSet4 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean5 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet4);
        strSet4.clear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours((int) (byte) 0);
        java.util.Date date11 = dateTime8.toDate();
        org.joda.time.DateTime.Property property12 = dateTime8.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property12.getFieldType();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusMillis(99);
        int int21 = property12.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property22 = localDateTime15.dayOfYear();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundCeilingCopy();
        boolean boolean24 = strSet4.equals((java.lang.Object) localDateTime23);
        java.util.stream.Stream<java.lang.String> strStream25 = strSet4.stream();
        org.joda.time.tz.Provider provider26 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone28 = provider26.getZone("");
        org.joda.time.DateTimeZone dateTimeZone30 = provider26.getZone("10");
        java.util.Set<java.lang.String> strSet31 = provider26.getAvailableIDs();
        java.util.Set<java.lang.String> strSet32 = provider26.getAvailableIDs();
        java.util.Spliterator<java.lang.String> strSpliterator33 = strSet32.spliterator();
        boolean boolean34 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet32);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.LocalDateTime.Property property38 = localDateTime36.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = property38.roundHalfEvenCopy();
        java.lang.String str40 = property38.getAsText();
        org.joda.time.LocalDateTime localDateTime41 = property38.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        java.lang.String str44 = dateTimeZone42.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone42);
        int int47 = dateTimeZone42.getOffset(0L);
        org.joda.time.DateTime dateTime48 = localDateTime41.toDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone50);
        java.lang.String str52 = dateTimeZone50.toString();
        long long54 = dateTimeZone42.getMillisKeepLocal(dateTimeZone50, 1645455977932L);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone50);
        boolean boolean56 = strSet32.equals((java.lang.Object) localDateTime55);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.LocalDateTime.Property property61 = localDateTime59.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime63 = property61.addWrapFieldToCopy((int) (short) -1);
        int int64 = property61.getMinimumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property61.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = property61.getFieldType();
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology69 = localDateTime68.getChronology();
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(chronology69);
        org.joda.time.DateTimeZone dateTimeZone71 = chronology69.getZone();
        org.joda.time.DurationField durationField72 = chronology69.centuries();
        org.joda.time.DateTimeField dateTimeField73 = dateTimeFieldType66.getField(chronology69);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) 54573740, chronology69);
        boolean boolean75 = strSet32.equals((java.lang.Object) 54573740);
        java.util.Iterator<java.lang.String> strItor76 = strSet32.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime70", (dateTime8.compareTo(dateTime70) == 0) == dateTime8.equals(dateTime70));
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.LocalDateTime localDateTime12 = dateTime10.toLocalDateTime();
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        int int14 = dateTime10.getYearOfEra();
        org.joda.time.DateTime.Property property15 = dateTime10.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear((-1));
        org.joda.time.DateTime dateTime21 = dateTime19.plusMonths(10);
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfDay();
        int int23 = dateTime21.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = dateTime21.withZone(dateTimeZone25);
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.lang.String str30 = dateTimeZone25.getName((long) 26, locale29);
        java.lang.String str31 = locale29.getISO3Language();
        java.lang.String str32 = property15.getAsText(locale29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime17", (dateTime3.compareTo(dateTime17) == 0) == dateTime3.equals(dateTime17));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DateTime dateTime7 = dateTime2.withChronology(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = dateTime2.withZoneRetainFields(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 69243, dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        java.lang.String str5 = property3.getAsText();
        org.joda.time.LocalDateTime localDateTime6 = property3.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        java.lang.String str9 = dateTimeZone7.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        int int12 = dateTimeZone7.getOffset(0L);
        org.joda.time.DateTime dateTime13 = localDateTime6.toDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours(948);
        org.joda.time.DateMidnight dateMidnight17 = dateTime16.toDateMidnight();
        org.joda.time.DateTime dateTime20 = dateTime16.withDurationAdded((long) 26, 1901);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = property24.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        java.util.GregorianCalendar gregorianCalendar28 = dateTime27.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime27.withChronology(chronology31);
        boolean boolean33 = localDateTime25.equals((java.lang.Object) dateTime32);
        org.joda.time.DateTime dateTime35 = dateTime32.plusWeeks(894);
        boolean boolean36 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime32", (dateTime14.compareTo(dateTime32) == 0) == dateTime14.equals(dateTime32));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket5.saveField(dateTimeField6, (int) (short) 0);
        java.lang.Integer int9 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket5.setZone(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime19.withDurationAdded((long) 2022, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime19.getZone();
        int int24 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime.Property property25 = dateTime19.hourOfDay();
        org.joda.time.DateTime.Property property26 = dateTime19.secondOfMinute();
        org.joda.time.DateTime dateTime27 = property26.roundFloorCopy();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology29, locale30, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField34 = null;
        dateTimeParserBucket33.saveField(dateTimeField34, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale39 = java.util.Locale.ROOT;
        dateTimeParserBucket33.saveField(dateTimeFieldType37, "it", locale39);
        java.lang.Integer int41 = dateTimeParserBucket33.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekyear((-1));
        org.joda.time.DateTime dateTime47 = dateTime45.plusMonths(10);
        org.joda.time.DateTime.Property property48 = dateTime47.minuteOfDay();
        org.joda.time.DateTime dateTime49 = property48.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property50 = dateTime49.secondOfDay();
        org.joda.time.DateTime.Property property51 = dateTime49.era();
        int int52 = dateTime49.getWeekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.DateTime dateTime54 = dateTime49.plus(readableDuration53);
        org.joda.time.DateTime.Property property55 = dateTime49.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property55.getFieldType();
        dateTimeParserBucket33.saveField(dateTimeFieldType56, 780);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.plusHours((int) (byte) 0);
        boolean boolean64 = dateTime62.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.minusWeeks((int) 'a');
        boolean boolean69 = dateTime62.isAfter((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTime.Property property70 = dateTime62.secondOfDay();
        org.joda.time.DateTime dateTime71 = property70.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology74 = localDateTime73.getChronology();
        org.joda.time.LocalDateTime.Property property75 = localDateTime73.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime76 = property75.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.era();
        boolean boolean78 = localDateTime76.isSupported(dateTimeFieldType77);
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology81 = localDateTime80.getChronology();
        org.joda.time.LocalDateTime localDateTime82 = org.joda.time.LocalDateTime.now(chronology81);
        org.joda.time.DateTimeField dateTimeField83 = chronology81.secondOfMinute();
        boolean boolean84 = dateTimeFieldType77.isSupported(chronology81);
        int int85 = dateTime71.get(dateTimeFieldType77);
        dateTimeParserBucket33.saveField(dateTimeFieldType77, 54735);
        int int88 = dateTime27.get(dateTimeFieldType77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime43", (dateTime15.compareTo(dateTime43) == 0) == dateTime15.equals(dateTime43));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours((int) (byte) 0);
        boolean boolean6 = dateTime4.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) 'a');
        boolean boolean11 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime();
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology18 = dateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) dateTime12, chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = chronology18.getZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(788923800000L, chronology18);
        long long26 = chronology18.add((long) (-16002), (long) 333, 54437);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime33 = dateTime29.plusSeconds(26);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime41 = dateTime39.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime44 = dateTime41.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean45 = dateTime44.isEqualNow();
        org.joda.time.LocalDateTime localDateTime46 = dateTime44.toLocalDateTime();
        int int47 = dateTime44.getMonthOfYear();
        int int48 = dateTime44.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime51 = dateTime44.withDurationAdded(readableDuration49, (int) '#');
        int int52 = dateTime29.compareTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        org.joda.time.LocalDateTime.Property property56 = localDateTime54.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime57 = property56.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean60 = dateTimeZone59.isFixed();
        org.joda.time.DateTime dateTime61 = localDateTime57.toDateTime(dateTimeZone59);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime61.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.DateTime dateTime64 = dateTime61.plus(readableDuration63);
        boolean boolean65 = dateTime29.isEqual((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean67 = dateTime29.equals((java.lang.Object) 459);
        boolean boolean68 = dateTime29.isAfterNow();
        boolean boolean70 = dateTime29.isBefore((long) 356);
        org.joda.time.DateTime dateTime71 = localDateTime27.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime37", (dateTime2.compareTo(dateTime37) == 0) == dateTime2.equals(dateTime37));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology19);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusMillis(405);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusYears(68782378);
        int int26 = dateTimeField16.getMaximumValue((org.joda.time.ReadablePartial) localDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime20", (dateTime1.compareTo(dateTime20) == 0) == dateTime1.equals(dateTime20));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.secondOfMinute();
        org.joda.time.DurationField durationField8 = chronology5.millis();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusSeconds((int) ' ');
        long long14 = chronology5.set((org.joda.time.ReadablePartial) localDateTime12, (long) 99);
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 212, chronology5, locale15, (java.lang.Integer) (-1), (-948));
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(72000052L, dateTimeZone21);
        dateTimeParserBucket19.setZone(dateTimeZone21);
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (long) 212);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime34 = property31.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.weekyear();
        boolean boolean38 = dateTimeZone21.isLocalDateTimeGap(localDateTime36);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone21.getName(979L, locale40);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.LocalDateTime.Property property46 = localDateTime44.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean48 = localDateTime44.isSupported(dateTimeFieldType47);
        java.lang.String str49 = dateTimeFieldType47.getName();
        int int50 = dateTime42.get(dateTimeFieldType47);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(chronology53);
        java.lang.String str55 = chronology53.toString();
        org.joda.time.DurationField durationField56 = chronology53.hours();
        org.joda.time.DateTimeField dateTimeField57 = chronology53.secondOfDay();
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.plusMonths((int) (byte) 100);
        int[] intArray64 = chronology53.get((org.joda.time.ReadablePartial) localDateTime62, 100L);
        org.joda.time.Chronology chronology65 = chronology53.withUTC();
        org.joda.time.DateTimeField dateTimeField66 = chronology53.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField67 = chronology53.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField68 = dateTimeFieldType47.getField(chronology53);
        org.joda.time.DurationFieldType durationFieldType69 = dateTimeFieldType47.getDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime54", (dateTime22.compareTo(dateTime54) == 0) == dateTime22.equals(dateTime54));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(40);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours((int) (byte) 0);
        boolean boolean8 = dateTime6.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusWeeks((int) 'a');
        boolean boolean13 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime();
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology20 = dateTime17.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(chronology20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) dateTime14, chronology20);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology20.add(readablePeriod23, (long) 1, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField27 = chronology20.era();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(213L, chronology20);
        boolean boolean29 = dateTimeZone1.equals((java.lang.Object) chronology20);
        java.util.Locale locale34 = new java.util.Locale("ISOChronology[UTC]", "it", "10");
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology38);
        java.lang.String str40 = chronology38.toString();
        org.joda.time.DurationField durationField41 = chronology38.hours();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.dayOfMonth();
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 887, chronology38, locale43, (java.lang.Integer) 641);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology48 = localDateTime47.getChronology();
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(chronology48);
        java.lang.String str50 = chronology48.toString();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        org.joda.time.Chronology chronology54 = chronology48.withZone(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField55 = chronology48.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField56 = chronology48.year();
        long long58 = dateTimeField56.roundHalfEven((long) 28);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = dateTimeField56.getType();
        dateTimeParserBucket45.saveField(dateTimeFieldType59, 222);
        java.lang.Integer int62 = dateTimeParserBucket45.getOffsetInteger();
        java.util.Locale locale63 = dateTimeParserBucket45.getLocale();
        java.lang.String str64 = locale34.getDisplayVariant(locale63);
        java.lang.String str65 = dateTimeZone1.getName((long) 981, locale63);
        java.lang.String str66 = dateTimeZone1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime39", (dateTime4.compareTo(dateTime39) == 0) == dateTime4.equals(dateTime39));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology3);
        java.lang.String str5 = chronology3.toString();
        org.joda.time.tz.NameProvider nameProvider6 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str10 = nameProvider6.getName(locale7, "2022-02-21T15:06:28.281+00:00:00.052", "secondOfDay");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((-2329199948L), chronology3, locale7, (java.lang.Integer) 212);
        org.joda.time.DateTimeField dateTimeField13 = chronology3.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekyear((-1));
        org.joda.time.DateTime dateTime20 = dateTime16.plusHours((int) (byte) 100);
        int int21 = dateTime16.getDayOfYear();
        int int22 = dateTime16.getDayOfWeek();
        org.joda.time.DateTime dateTime24 = dateTime16.plus((long) 21);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekyear();
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder28.setExtension('a', "cinese");
        java.util.Locale locale32 = builder28.build();
        java.util.Locale locale33 = builder28.build();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (-292275054), chronology25, locale33);
        java.util.Set<java.lang.Character> charSet35 = locale33.getExtensionKeys();
        int int36 = dateTimeField13.getMaximumTextLength(locale33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfMinute();
        org.joda.time.DateTime dateTime14 = property12.addToCopy(0L);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        java.lang.Object obj16 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology19);
        java.lang.String str21 = chronology19.toString();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.weekOfWeekyear();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj16, chronology19);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime14.toMutableDateTime(chronology19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusHours((int) (byte) 0);
        java.util.Date date29 = dateTime26.toDate();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone30.getOffset(readableInstant31);
        int int34 = dateTimeZone30.getStandardOffset((long) 15);
        org.joda.time.DateTime dateTime35 = dateTime26.withZone(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        org.joda.time.DateTime dateTime37 = dateTime14.toDateTime(dateTimeZone36);
        int int38 = dateTime37.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property43 = dateTime40.centuryOfEra();
        org.joda.time.DurationField durationField44 = property43.getRangeDurationField();
        int int45 = property43.getMaximumValue();
        org.joda.time.DateTime dateTime46 = property43.withMaximumValue();
        org.joda.time.DateTime dateTime47 = property43.roundCeilingCopy();
        org.joda.time.DateTime dateTime49 = dateTime47.plusDays(26);
        int int50 = dateTime47.getDayOfYear();
        org.joda.time.DateTime dateTime51 = dateTime47.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.withWeekyear((-1));
        org.joda.time.DateTime.Property property56 = dateTime53.centuryOfEra();
        org.joda.time.DateTime.Property property57 = dateTime53.minuteOfHour();
        boolean boolean58 = dateTime47.isEqual((org.joda.time.ReadableInstant) dateTime53);
        boolean boolean59 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime26", (dateTime3.compareTo(dateTime26) == 0) == dateTime3.equals(dateTime26));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = dateTime1.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime(chronology5);
        org.joda.time.DateTime dateTime9 = dateTime1.withYear(104);
        org.joda.time.DateTime dateTime11 = dateTime1.minus(2000L);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusSeconds((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readablePeriod16);
        org.joda.time.DateTime dateTime18 = localDateTime15.toDateTime();
        org.joda.time.DateTime.Property property19 = dateTime18.year();
        org.joda.time.DateTime dateTime21 = property19.addToCopy((long) 1970);
        boolean boolean22 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime21.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime7", (dateTime1.compareTo(dateTime7) == 0) == dateTime1.equals(dateTime7));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket5.saveField(dateTimeField6, (int) (short) 0);
        java.lang.Integer int9 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket5.setZone(dateTimeZone10);
        int int13 = dateTimeZone10.getStandardOffset((long) 1969);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long17 = dateTimeZone10.getMillisKeepLocal(dateTimeZone15, (long) 99);
        java.lang.String str18 = dateTimeZone15.toString();
        java.util.TimeZone timeZone19 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusHours((int) (byte) 0);
        boolean boolean25 = dateTime23.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusWeeks((int) 'a');
        boolean boolean30 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime31 = dateTime29.toDateTime();
        org.joda.time.DateTime dateTime33 = dateTime29.minusMillis((int) (byte) 10);
        org.joda.time.DateTime.Property property34 = dateTime29.monthOfYear();
        org.joda.time.DateTime dateTime36 = dateTime29.minusMillis(73);
        org.joda.time.Instant instant37 = dateTime36.toInstant();
        java.util.Date date38 = dateTime36.toDate();
        boolean boolean39 = timeZone19.inDaylightTime(date38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant37", (dateTime36.compareTo(instant37) == 0) == dateTime36.equals(instant37));
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyearOfCentury();
        java.lang.String str6 = dateTimeField4.getAsShortText(10L);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        int int12 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.DurationField durationField13 = dateTimeField4.getDurationField();
        java.lang.String str15 = dateTimeField4.getAsShortText(1645455983203L);
        int int18 = dateTimeField4.getDifference(109258L, 196620775200000L);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder20.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale locale23 = builder22.build();
        java.util.Locale.Builder builder25 = builder22.removeUnicodeLocaleAttribute("ita");
        java.util.Locale locale26 = builder22.build();
        java.util.Locale.Builder builder28 = builder22.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder30 = builder28.removeUnicodeLocaleAttribute("54868077");
        java.util.Locale.Category category31 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale32 = java.util.Locale.getDefault(category31);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusHours((int) (byte) 0);
        boolean boolean38 = dateTime36.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime36.toMutableDateTime(dateTimeZone39);
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.lang.String str44 = dateTimeZone39.getName((long) (byte) 1, locale43);
        java.lang.String str45 = locale43.getScript();
        java.lang.String str46 = locale32.getDisplayScript(locale43);
        java.lang.String str47 = locale32.getDisplayVariant();
        boolean boolean48 = locale32.hasExtensions();
        java.util.Locale.Builder builder49 = builder28.setLocale(locale32);
        java.lang.String str50 = dateTimeField4.getAsShortText(743, locale32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime34", (dateTime3.compareTo(dateTime34) == 0) == dateTime3.equals(dateTime34));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean6 = localDateTime4.isSupported(durationFieldType5);
        org.joda.time.Chronology chronology7 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withYear(541);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours((int) (byte) 0);
        boolean boolean15 = dateTime13.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks((int) 'a');
        boolean boolean20 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime.Property property21 = dateTime13.secondOfDay();
        org.joda.time.DateTime dateTime22 = property21.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekyear((-1));
        org.joda.time.DateTime dateTime28 = dateTime26.minusHours(15);
        java.lang.String str29 = dateTime28.toString();
        long long30 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime32 = property21.addToCopy(74L);
        org.joda.time.DateTime.Property property33 = dateTime32.era();
        boolean boolean34 = localDateTime9.equals((java.lang.Object) dateTime32);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.millisOfSecond();
        org.joda.time.DurationField durationField41 = chronology37.seconds();
        org.joda.time.DurationField durationField42 = chronology37.centuries();
        org.joda.time.DateTimeField dateTimeField43 = chronology37.millisOfSecond();
        org.joda.time.DurationField durationField44 = chronology37.years();
        org.joda.time.Chronology chronology45 = chronology37.withUTC();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.DateTime dateTime47 = dateTime32.toDateTime(chronology37);
        org.joda.time.DateTime dateTime49 = dateTime47.plusMillis(54776);
        org.joda.time.DateTime dateTime51 = dateTime49.plusMinutes(772);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime47", (dateTime32.compareTo(dateTime47) == 0) == dateTime32.equals(dateTime47));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        int int6 = dateTime1.getDayOfYear();
        int int7 = dateTime1.getDayOfWeek();
        org.joda.time.DateTime dateTime9 = dateTime1.plus((long) 21);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.DateTime.Property property11 = dateTime9.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime14 = dateTime12.minusMonths(954);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.millisOfSecond();
        org.joda.time.DurationField durationField21 = chronology17.seconds();
        org.joda.time.DurationField durationField22 = chronology17.centuries();
        org.joda.time.DurationField durationField23 = chronology17.minutes();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTime dateTime25 = dateTime12.toDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int30 = localDateTime27.get(dateTimeFieldType29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.era();
        int int32 = localDateTime27.indexOf(dateTimeFieldType31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime27.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime34 = property33.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime35 = property33.roundHalfFloorCopy();
        org.joda.time.Interval interval36 = property33.toInterval();
        org.joda.time.LocalDateTime localDateTime37 = property33.withMaximumValue();
        int[] intArray39 = chronology17.get((org.joda.time.ReadablePartial) localDateTime37, (long) 997);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime25", (dateTime12.compareTo(dateTime25) == 0) == dateTime12.equals(dateTime25));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMonths((int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours((int) (byte) 0);
        boolean boolean15 = dateTime13.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime13.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.era();
        int int20 = mutableDateTime18.get(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.secondOfMinute();
        org.joda.time.DurationField durationField26 = chronology23.millis();
        boolean boolean27 = dateTimeFieldType19.isSupported(chronology23);
        boolean boolean28 = dateTime9.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekyear((-1));
        org.joda.time.DateTime dateTime34 = dateTime32.plusMonths(10);
        org.joda.time.DateTime.Property property35 = dateTime34.minuteOfDay();
        boolean boolean36 = dateTime9.equals((java.lang.Object) dateTime34);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusWeeks((int) 'a');
        int int41 = dateTime40.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime dateTime44 = dateTime40.withField(dateTimeFieldType42, 2);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology47 = localDateTime46.getChronology();
        org.joda.time.LocalDateTime.Property property48 = localDateTime46.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime49 = property48.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime54 = property52.addWrapFieldToCopy((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property52.getFieldType();
        org.joda.time.DateTime.Property property56 = dateTime40.property(dateTimeFieldType55);
        org.joda.time.DateTime dateTime58 = dateTime9.withField(dateTimeFieldType55, 6);
        org.joda.time.DateTime dateTime60 = dateTime9.withWeekOfWeekyear(7);
        org.joda.time.DateTime dateTime62 = dateTime9.minusMillis(202);
        org.joda.time.DateTime.Property property63 = dateTime9.weekyear();
        java.lang.Object obj64 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology67 = localDateTime66.getChronology();
        org.joda.time.LocalDateTime.Property property68 = localDateTime66.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime69 = property68.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.era();
        boolean boolean71 = localDateTime69.isSupported(dateTimeFieldType70);
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology74 = localDateTime73.getChronology();
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.now(chronology74);
        org.joda.time.DateTimeField dateTimeField76 = chronology74.secondOfMinute();
        boolean boolean77 = dateTimeFieldType70.isSupported(chronology74);
        org.joda.time.DateTimeField dateTimeField78 = chronology74.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(obj64, chronology74);
        org.joda.time.DateTimeField dateTimeField80 = chronology74.minuteOfDay();
        long long82 = dateTimeField80.roundFloor((long) 907);
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology85 = localDateTime84.getChronology();
        org.joda.time.DateTime dateTime86 = org.joda.time.DateTime.now(chronology85);
        org.joda.time.DateTimeField dateTimeField87 = chronology85.clockhourOfDay();
        java.util.Locale locale89 = java.util.Locale.ENGLISH;
        java.lang.String str90 = locale89.getVariant();
        java.lang.String str91 = dateTimeField87.getAsText((-1), locale89);
        boolean boolean92 = locale89.hasExtensions();
        java.util.Set<java.lang.String> strSet93 = locale89.getUnicodeLocaleKeys();
        int int94 = dateTimeField80.getMaximumTextLength(locale89);
        java.lang.String str95 = property63.getAsShortText(locale89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime86", (dateTime1.compareTo(dateTime86) == 0) == dateTime1.equals(dateTime86));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = durationFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField7 = chronology3.monthOfYear();
        org.joda.time.DurationField durationField8 = chronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusHours((int) (byte) 0);
        boolean boolean16 = dateTime14.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) 'a');
        boolean boolean21 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime();
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        java.lang.String str24 = chronology23.toString();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology23);
        org.joda.time.DateTimeField dateTimeField26 = chronology23.minuteOfHour();
        int int28 = dateTimeField26.get((long) 86399999);
        org.joda.time.DurationField durationField29 = dateTimeField26.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = dateTimeField26.getType();
        java.util.Locale.Category category32 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale33 = java.util.Locale.getDefault(category32);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.LocalDateTime.Property property37 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime40 = property37.addWrapFieldToCopy(28);
        org.joda.time.DateTimeField dateTimeField41 = property37.getField();
        org.joda.time.DurationField durationField42 = dateTimeField41.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar48 = dateTime47.toGregorianCalendar();
        int int49 = dateTime47.getMillisOfSecond();
        org.joda.time.DateTime.Property property50 = dateTime47.minuteOfHour();
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property56 = dateTime53.centuryOfEra();
        java.util.Locale locale57 = java.util.Locale.ITALIAN;
        java.lang.String str58 = locale57.getLanguage();
        java.lang.String str59 = property56.getAsText(locale57);
        java.lang.String str60 = locale51.getDisplayName(locale57);
        int int61 = property50.getMaximumTextLength(locale57);
        java.util.Set<java.lang.String> strSet62 = locale57.getUnicodeLocaleAttributes();
        java.lang.String str63 = dateTimeField41.getAsText(1146, locale57);
        java.util.Locale.setDefault(category32, locale57);
        java.util.Locale locale65 = java.util.Locale.getDefault(category32);
        java.lang.String str66 = dateTimeField26.getAsShortText(54555817, locale65);
        java.lang.String str67 = dateTimeField9.getAsText((long) 115, locale65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime12", (dateTime4.compareTo(dateTime12) == 0) == dateTime4.equals(dateTime12));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        int int6 = dateTime1.getDayOfYear();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime1.toGregorianCalendar();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = durationFieldType8.getField(chronology11);
        java.lang.String str15 = durationFieldType8.getName();
        org.joda.time.DateTime dateTime17 = dateTime1.withFieldAdded(durationFieldType8, (int) (short) 10);
        java.util.GregorianCalendar gregorianCalendar18 = dateTime1.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime12", (dateTime1.compareTo(dateTime12) == 0) == dateTime1.equals(dateTime12));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime9.plusMinutes(977);
        int int16 = dateTime15.getCenturyOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.minuteOfDay();
        int int18 = dateTime15.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekyear((-1));
        org.joda.time.DateTime dateTime24 = dateTime20.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.plus(readableDuration25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusMonths((int) '#');
        org.joda.time.DateTime dateTime30 = dateTime26.withYearOfCentury((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.millisOfSecond();
        org.joda.time.DurationField durationField37 = chronology33.seconds();
        org.joda.time.DurationField durationField38 = chronology33.centuries();
        org.joda.time.DateTimeField dateTimeField39 = chronology33.millisOfSecond();
        org.joda.time.DurationField durationField40 = chronology33.years();
        org.joda.time.Chronology chronology41 = chronology33.withUTC();
        org.joda.time.DateTime dateTime42 = dateTime30.withChronology(chronology41);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime15.toMutableDateTime(chronology41);
        boolean boolean44 = mutableDateTime43.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime42", (dateTime30.compareTo(dateTime42) == 0) == dateTime30.equals(dateTime42));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.secondOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusMonths((int) (byte) 100);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePartial) localDateTime11, 100L);
        org.joda.time.Chronology chronology14 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekyear((-1));
        org.joda.time.DateTime dateTime22 = dateTime20.plusMonths(10);
        org.joda.time.DateTime.Property property23 = dateTime22.minuteOfDay();
        boolean boolean24 = dateTime22.isBeforeNow();
        org.joda.time.LocalDateTime localDateTime25 = dateTime22.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusYears(52596048);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withMillisOfDay(345);
        long long31 = chronology14.set((org.joda.time.ReadablePartial) localDateTime29, (long) 54936);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime18", (dateTime3.compareTo(dateTime18) == 0) == dateTime3.equals(dateTime18));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(chronology4);
        java.lang.String str6 = chronology4.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.Chronology chronology10 = chronology4.withZone(dateTimeZone8);
        org.joda.time.DurationField durationField11 = chronology4.seconds();
        long long15 = chronology4.add((long) 13, 788923800000L, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime22 = property19.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime26 = property25.withMaximumValue();
        int int27 = localDateTime26.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = property31.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusHours((int) (byte) 0);
        boolean boolean41 = dateTime39.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusWeeks((int) 'a');
        boolean boolean46 = dateTime39.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime47 = dateTime45.toDateTime();
        org.joda.time.DateTime dateTime49 = dateTime45.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.weekyear();
        boolean boolean55 = dateTime49.equals((java.lang.Object) localDateTime51);
        int[] intArray57 = chronology35.get((org.joda.time.ReadablePartial) localDateTime51, (long) (byte) 1);
        chronology4.validate((org.joda.time.ReadablePartial) localDateTime26, intArray57);
        org.joda.time.DateTimeField dateTimeField59 = chronology4.millisOfDay();
        org.joda.time.DurationField durationField60 = chronology4.weeks();
        org.joda.time.DurationField durationField61 = chronology4.years();
        org.joda.time.DateTimeField dateTimeField62 = chronology4.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(1645455600000L, chronology4);
        org.joda.time.DateTimeField dateTimeField64 = chronology4.hourOfDay();
        org.joda.time.DurationField durationField65 = durationFieldType0.getField(chronology4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime37", (dateTime5.compareTo(dateTime37) == 0) == dateTime5.equals(dateTime37));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(chronology5);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale7.getCountry();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology11, locale12, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket15.saveField(dateTimeField16, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale21 = java.util.Locale.ROOT;
        dateTimeParserBucket15.saveField(dateTimeFieldType19, "it", locale21);
        java.lang.String str23 = locale7.getDisplayName(locale21);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 52, chronology5, locale21, (java.lang.Integer) 73, (int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundHalfEvenCopy();
        java.lang.String str32 = property30.getAsText();
        org.joda.time.LocalDateTime localDateTime33 = property30.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        java.lang.String str36 = dateTimeZone34.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        int int39 = dateTimeZone34.getOffset(0L);
        org.joda.time.DateTime dateTime40 = localDateTime33.toDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone42);
        java.lang.String str44 = dateTimeZone42.toString();
        long long46 = dateTimeZone34.getMillisKeepLocal(dateTimeZone42, 1645455977932L);
        org.joda.time.tz.NameProvider nameProvider48 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider48);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider48);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime55 = property54.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology58 = localDateTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.era();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology62 = localDateTime61.getChronology();
        org.joda.time.DateTime dateTime63 = org.joda.time.DateTime.now(chronology62);
        org.joda.time.DateTime.Property property64 = dateTime63.dayOfYear();
        java.util.Locale locale65 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str66 = locale65.getDisplayCountry();
        java.lang.String str67 = property64.getAsText(locale65);
        int int68 = dateTimeField59.getMaximumTextLength(locale65);
        java.lang.String str71 = nameProvider48.getName(locale65, "-0001-02-22T15:06:25.002+00:00:00.052", "2022-02-21T00:00:00.000+00:00:00.052");
        java.util.Locale locale74 = new java.util.Locale("weekOfWeekyear", "-0001-02-22T15:06:41.898+00:00:00.052");
        java.lang.String str77 = nameProvider48.getShortName(locale74, "-0001-02-22T15:06:33.492+00:00:00.052", "2022-02-21T15:06:22.606+00:00:00.052");
        java.lang.String str78 = dateTimeZone42.getShortName(63789433677281L, locale74);
        boolean boolean79 = dateTimeParserBucket26.restoreState((java.lang.Object) locale74);
        java.util.Locale locale80 = dateTimeParserBucket26.getLocale();
        long long81 = dateTimeParserBucket26.computeMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime63", (dateTime2.compareTo(dateTime63) == 0) == dateTime2.equals(dateTime63));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        int int6 = dateTime1.getDayOfYear();
        org.joda.time.DateTime.Property property7 = dateTime1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property7.getAsShortText(locale9);
        org.joda.time.DateTime dateTime11 = property7.roundCeilingCopy();
        org.joda.time.DateTime dateTime12 = property7.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekyear((-1));
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths(10);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime20 = property19.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime12.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.millisOfSecond();
        org.joda.time.DurationField durationField31 = chronology27.seconds();
        org.joda.time.DurationField durationField32 = chronology27.centuries();
        org.joda.time.DurationField durationField33 = chronology27.minutes();
        org.joda.time.DurationField durationField34 = chronology27.years();
        org.joda.time.DateTimeField dateTimeField35 = chronology27.weekyearOfCentury();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(chronology27);
        int int37 = dateTime36.getDayOfMonth();
        int int38 = dateTime36.getMinuteOfHour();
        org.joda.time.DateTime dateTime40 = dateTime36.minusWeeks(54617985);
        boolean boolean41 = dateTime23.isEqual((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime36", (dateTime1.compareTo(dateTime36) == 0) == dateTime1.equals(dateTime36));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.millisOfSecond();
        org.joda.time.DurationField durationField15 = chronology11.seconds();
        org.joda.time.DurationField durationField16 = chronology11.centuries();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.millisOfSecond();
        org.joda.time.DurationField durationField18 = chronology11.years();
        org.joda.time.Chronology chronology19 = chronology11.withUTC();
        org.joda.time.DurationField durationField20 = chronology19.months();
        boolean boolean21 = durationFieldType8.isSupported(chronology19);
        org.joda.time.DateTime dateTime23 = dateTime5.withFieldAdded(durationFieldType8, 54370010);
        org.joda.time.DateTime dateTime25 = dateTime23.withYear(807);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusWeeks((int) 'a');
        int int30 = dateTime29.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime dateTime33 = dateTime29.withField(dateTimeFieldType31, 2);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.millisOfSecond();
        org.joda.time.DurationField durationField40 = chronology36.seconds();
        org.joda.time.DurationField durationField41 = chronology36.centuries();
        org.joda.time.DurationField durationField42 = chronology36.minutes();
        org.joda.time.DurationField durationField43 = chronology36.hours();
        org.joda.time.DateTimeField dateTimeField44 = chronology36.weekyear();
        org.joda.time.DateTimeField dateTimeField45 = chronology36.hourOfHalfday();
        org.joda.time.DurationField durationField46 = chronology36.months();
        org.joda.time.DateTimeField dateTimeField47 = chronology36.dayOfWeek();
        boolean boolean48 = dateTimeFieldType31.isSupported(chronology36);
        org.joda.time.DateTime.Property property49 = dateTime25.property(dateTimeFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime27", (dateTime3.compareTo(dateTime27) == 0) == dateTime3.equals(dateTime27));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekyear((-1));
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(10);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        int int8 = dateTime6.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = dateTime6.withZone(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(0L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plusHours((-1));
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.weeks();
        java.lang.String str19 = durationField18.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime12", (dateTime6.compareTo(dateTime12) == 0) == dateTime6.equals(dateTime12));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = dateTime5.withZone(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plus(readableDuration16);
        org.joda.time.DateTime dateTime18 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.DateTime dateTime20 = dateTime5.withMinuteOfHour(0);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone21.getOffset(readableInstant22);
        java.lang.String str25 = dateTimeZone21.getName(0L);
        java.lang.String str26 = dateTimeZone21.toString();
        int int28 = dateTimeZone21.getStandardOffset(36000766L);
        org.joda.time.DateTime dateTime29 = dateTime20.withZoneRetainFields(dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime20.minus(readableDuration30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean34 = dateTimeZone33.isFixed();
        java.lang.String str36 = dateTimeZone33.getShortName(1645455975652L);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        long long41 = dateTimeZone33.getMillisKeepLocal(dateTimeZone38, (long) 718);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.plusHours((int) (byte) 0);
        boolean boolean48 = dateTime46.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone50 = dateTimeZone49.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime46.toMutableDateTime(dateTimeZone49);
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str54 = dateTimeZone49.getShortName((long) (short) 100, locale53);
        java.lang.String str55 = dateTimeZone38.getShortName((long) 459, locale53);
        java.lang.String str57 = dateTimeZone38.getName(1586790429754L);
        java.lang.String str59 = dateTimeZone38.getNameKey((long) 54710708);
        org.joda.time.DateTime dateTime60 = dateTime20.toDateTime(dateTimeZone38);
        int int61 = dateTime60.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime11", (dateTime5.compareTo(dateTime11) == 0) == dateTime5.equals(dateTime11));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateMidnight dateMidnight4 = dateTime1.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekyear((-1));
        org.joda.time.DateTime dateTime11 = dateTime9.minusHours(15);
        org.joda.time.DateTime dateTime13 = dateTime9.minusHours(212);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime9.withDurationAdded(readableDuration14, 4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = dateTime9.toString(dateTimeFormatter17);
        boolean boolean19 = dateMidnight4.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekyear((-1));
        org.joda.time.DateTime dateTime25 = dateTime21.withMillisOfDay(0);
        org.joda.time.LocalDate localDate26 = dateTime25.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusHours((int) (byte) 0);
        boolean boolean32 = dateTime30.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime30.toMutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.era();
        int int37 = mutableDateTime35.get(dateTimeFieldType36);
        boolean boolean38 = dateTime25.isSupported(dateTimeFieldType36);
        boolean boolean39 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Instant instant40 = dateTime25.toInstant();
        org.joda.time.DateTime.Property property41 = dateTime25.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.secondOfMinute();
        org.joda.time.DurationField durationField48 = chronology45.millis();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minusSeconds((int) ' ');
        long long54 = chronology45.set((org.joda.time.ReadablePartial) localDateTime52, (long) 99);
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        java.lang.String str56 = locale55.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 212, chronology45, locale55, (java.lang.Integer) (-1), (-948));
        org.joda.time.DateTimeField dateTimeField60 = chronology45.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField61 = chronology45.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField62 = chronology45.hourOfDay();
        org.joda.time.Chronology chronology63 = chronology45.withUTC();
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        long long67 = chronology45.add(readablePeriod64, (-900000L), 647709);
        org.joda.time.DateTime dateTime68 = dateTime25.toDateTime(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant40", (dateMidnight4.compareTo(instant40) == 0) == dateMidnight4.equals(instant40));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.minuteOfHour();
        int int16 = dateTimeField15.getMaximumValue();
        long long19 = dateTimeField15.add((long) 8, 168);
        int int22 = dateTimeField15.getDifference(1645456241539L, (-31948L));
        int int23 = dateTimeField15.getMinimumValue();
        long long26 = dateTimeField15.add(1586790452319L, 11407144L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        java.lang.String str30 = dateTimeZone28.toString();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.clockhourOfDay();
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.lang.String str39 = locale38.getVariant();
        java.lang.String str40 = dateTimeField36.getAsText((-1), locale38);
        boolean boolean41 = locale38.hasExtensions();
        java.lang.String str42 = dateTimeZone28.getName(1645455983203L, locale38);
        java.lang.String str43 = locale38.getDisplayScript();
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.lang.String str45 = locale44.getScript();
        java.util.Locale locale46 = java.util.Locale.ENGLISH;
        java.lang.String str47 = locale46.getVariant();
        java.lang.String str48 = locale44.getDisplayName(locale46);
        java.lang.String str49 = locale38.getDisplayCountry(locale44);
        java.util.Set<java.lang.String> strSet50 = locale38.getUnicodeLocaleAttributes();
        java.lang.String str51 = dateTimeField15.getAsText((-28399611336819721L), locale38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime35", (dateTime1.compareTo(dateTime35) == 0) == dateTime1.equals(dateTime35));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTime.Property property8 = dateTime5.secondOfDay();
        int int9 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime10 = property8.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar15 = dateTime14.toGregorianCalendar();
        org.joda.time.DateTime.Property property16 = dateTime14.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekyear((-1));
        org.joda.time.DateTime dateTime22 = dateTime18.plusHours((int) (byte) 100);
        org.joda.time.DateTime.Property property23 = dateTime18.era();
        int int24 = property16.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = dateTime18.toString(dateTimeFormatter25);
        org.joda.time.DateTime.Property property27 = dateTime18.millisOfSecond();
        int int28 = dateTime18.getEra();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime35 = property32.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withWeekyear((int) (short) 10);
        int int38 = localDateTime37.getMonthOfYear();
        java.lang.String str39 = localDateTime37.toString();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withWeekOfWeekyear(34);
        int int42 = localDateTime41.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekyear((-1));
        org.joda.time.DateTime dateTime48 = dateTime46.plusMonths(10);
        org.joda.time.DateTime.Property property49 = dateTime48.minuteOfDay();
        int int50 = dateTime48.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTime dateTime54 = dateTime48.withZone(dateTimeZone52);
        long long57 = dateTimeZone52.adjustOffset((long) 86399, true);
        long long60 = dateTimeZone52.convertLocalToUTC(196545600000L, false);
        org.joda.time.DateTime dateTime61 = localDateTime41.toDateTime(dateTimeZone52);
        boolean boolean62 = dateTime18.isBefore((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = dateTime18.toMutableDateTime(chronology63);
        int int65 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and dateTime54", (dateTime48.compareTo(dateTime54) == 0) == dateTime48.equals(dateTime54));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        int int4 = dateTime3.getMillisOfSecond();
        org.joda.time.DateTime.Property property5 = dateTime3.secondOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(244, 0);
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTime(dateTimeZone9);
        org.joda.time.Instant instant11 = dateTime6.toInstant();
        boolean boolean13 = dateTime6.isBefore((long) 54525);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime9 = property8.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(readableDuration10, 212);
        boolean boolean14 = dateTime12.isAfter(35999999L);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime25 = dateTime22.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean26 = dateTime25.isEqualNow();
        org.joda.time.DateTime.Property property27 = dateTime25.secondOfMinute();
        org.joda.time.DateTime dateTime29 = property27.addToCopy(0L);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.era();
        boolean boolean37 = localDateTime35.isSupported(dateTimeFieldType36);
        long long39 = chronology30.set((org.joda.time.ReadablePartial) localDateTime35, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime12.toMutableDateTime(chronology30);
        org.joda.time.DateTime dateTime42 = dateTime12.minusMinutes(54470207);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(chronology45);
        java.lang.String str47 = chronology45.toString();
        org.joda.time.DurationField durationField48 = chronology45.hours();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(chronology51);
        java.lang.String str53 = chronology51.toString();
        org.joda.time.DurationField durationField54 = chronology51.hours();
        int int55 = durationField48.compareTo(durationField54);
        int int57 = durationField48.getValue(35999998999L);
        boolean boolean58 = durationField48.isSupported();
        long long60 = durationField48.getMillis((long) 241);
        java.lang.String str61 = durationField48.getName();
        long long64 = durationField48.getValueAsLong(1586790458726L, (-62135596800000L));
        long long66 = durationField48.getValueAsLong(0L);
        org.joda.time.DurationFieldType durationFieldType67 = durationField48.getType();
        org.joda.time.DateTime dateTime69 = dateTime42.withFieldAdded(durationFieldType67, 831);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime71.withWeekyear((-1));
        org.joda.time.DateTime dateTime75 = dateTime73.plusMonths(10);
        org.joda.time.MutableDateTime mutableDateTime76 = dateTime73.toMutableDateTime();
        org.joda.time.DateTime dateTime78 = dateTime73.plusDays(0);
        boolean boolean79 = dateTime42.isBefore((org.joda.time.ReadableInstant) dateTime73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime52 and dateTime71", (dateTime52.compareTo(dateTime71) == 0) == dateTime52.equals(dateTime71));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        org.joda.time.DateTime.Property property6 = dateTime1.era();
        org.joda.time.DateTime dateTime8 = dateTime1.minusHours((int) 'x');
        org.joda.time.DateTime.Property property9 = dateTime1.dayOfWeek();
        org.joda.time.Instant instant10 = dateTime1.toInstant();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime1.minus(readableDuration11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(75);
        org.joda.time.DateTime dateTime15 = dateTime1.withZoneRetainFields(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime1", (instant10.compareTo(dateTime1) == 0) == instant10.equals(dateTime1));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMinutes(20);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks(15);
        boolean boolean17 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField24 = durationFieldType18.getField(chronology21);
        java.lang.String str25 = durationFieldType18.getName();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime14.withFieldAdded(durationFieldType18, (int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusHours(559);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours((int) (byte) 0);
        boolean boolean35 = dateTime33.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusWeeks((int) 'a');
        boolean boolean40 = dateTime33.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime.Property property41 = dateTime33.secondOfDay();
        org.joda.time.DateTime dateTime42 = property41.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekyear((-1));
        org.joda.time.DateTime dateTime48 = dateTime46.minusHours(15);
        java.lang.String str49 = dateTime48.toString();
        long long50 = property41.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime52 = property41.addToCopy(74L);
        org.joda.time.DateTime.Property property53 = dateTime52.era();
        org.joda.time.DateTime dateTime54 = property53.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusWeeks((int) 'a');
        int int59 = dateTime58.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime dateTime62 = dateTime58.withField(dateTimeFieldType60, 2);
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology65 = localDateTime64.getChronology();
        org.joda.time.LocalDateTime.Property property66 = localDateTime64.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime67 = property66.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime72 = property70.addWrapFieldToCopy((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property70.getFieldType();
        org.joda.time.DateTime.Property property74 = dateTime58.property(dateTimeFieldType73);
        int int75 = dateTime54.get(dateTimeFieldType73);
        int int76 = localDateTime29.indexOf(dateTimeFieldType73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime31", (dateTime22.compareTo(dateTime31) == 0) == dateTime22.equals(dateTime31));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.Chronology chronology8 = chronology2.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField9 = chronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField11 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology2.secondOfMinute();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder14.setExtension('a', "cinese");
        java.util.Locale.Builder builder19 = builder14.setLanguageTag("coreano");
        java.util.Locale.Builder builder21 = builder14.removeUnicodeLocaleAttribute("999");
        java.util.Locale.Builder builder23 = builder21.setLanguage("ja");
        java.util.Locale.Builder builder25 = builder23.setVariant("54596");
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.getDefault(category26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusHours((int) (byte) 0);
        boolean boolean33 = dateTime31.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime31.toMutableDateTime(dateTimeZone34);
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.lang.String str39 = dateTimeZone34.getName((long) (byte) 1, locale38);
        java.lang.String str40 = locale38.getScript();
        java.lang.String str41 = locale27.getDisplayScript(locale38);
        java.lang.String str42 = locale27.getDisplayVariant();
        java.util.Locale.Builder builder43 = builder23.setLocale(locale27);
        int int44 = dateTimeField13.getMaximumShortTextLength(locale27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime29", (dateTime3.compareTo(dateTime29) == 0) == dateTime3.equals(dateTime29));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        java.util.Date date4 = dateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        int int9 = dateTimeZone5.getStandardOffset((long) 15);
        org.joda.time.DateTime dateTime10 = dateTime1.withZone(dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusMillis(99);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekyear((-1));
        org.joda.time.DateTime dateTime27 = dateTime23.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readableDuration28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMonths((int) '#');
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusHours((int) (byte) 0);
        boolean boolean37 = dateTime35.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime35.toMutableDateTime(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.era();
        int int42 = mutableDateTime40.get(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.secondOfMinute();
        org.joda.time.DurationField durationField48 = chronology45.millis();
        boolean boolean49 = dateTimeFieldType41.isSupported(chronology45);
        boolean boolean50 = dateTime31.isSupported(dateTimeFieldType41);
        org.joda.time.LocalDateTime.Property property51 = localDateTime19.property(dateTimeFieldType41);
        boolean boolean52 = localDateTime17.isSupported(dateTimeFieldType41);
        int int53 = dateTime10.get(dateTimeFieldType41);
        int int54 = dateTime10.getMillisOfSecond();
        org.joda.time.DateTime.Property property55 = dateTime10.weekOfWeekyear();
        org.joda.time.Chronology chronology57 = null;
        java.util.Locale locale58 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology57, locale58, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField62 = null;
        dateTimeParserBucket61.saveField(dateTimeField62, (int) (short) 0);
        dateTimeParserBucket61.setOffset((java.lang.Integer) 54619321);
        java.lang.Integer int67 = dateTimeParserBucket61.getOffsetInteger();
        java.util.Locale locale70 = new java.util.Locale("21", "52");
        java.lang.String str71 = locale70.getVariant();
        boolean boolean72 = dateTimeParserBucket61.restoreState((java.lang.Object) locale70);
        int int73 = dateTimeParserBucket61.getOffset();
        boolean boolean74 = dateTime10.equals((java.lang.Object) dateTimeParserBucket61);
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology77 = localDateTime76.getChronology();
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(chronology77);
        org.joda.time.DateTimeField dateTimeField79 = chronology77.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = dateTimeField79.getType();
        java.lang.String str82 = dateTimeField79.getAsText(1645456039972L);
        dateTimeParserBucket61.saveField(dateTimeField79, 944);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime78", (dateTime1.compareTo(dateTime78) == 0) == dateTime1.equals(dateTime78));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology10);
        boolean boolean13 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime7.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusHours((int) (byte) 0);
        java.util.Date date19 = dateTime16.toDate();
        org.joda.time.DateTime.Property property20 = dateTime16.dayOfMonth();
        org.joda.time.DateTime.Property property21 = dateTime16.dayOfMonth();
        java.lang.String str22 = property21.getAsString();
        org.joda.time.DateTime dateTime23 = property21.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours((int) (byte) 0);
        java.util.Date date28 = dateTime25.toDate();
        org.joda.time.DateTime.Property property29 = dateTime25.dayOfMonth();
        org.joda.time.DateTime.Property property30 = dateTime25.dayOfMonth();
        java.util.Locale locale31 = java.util.Locale.ITALIAN;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = property30.getAsText(locale31);
        int int34 = property21.getMaximumTextLength(locale31);
        org.joda.time.DateTime dateTime35 = property21.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfMonth();
        org.joda.time.DateTime dateTime38 = property36.addToCopy(80);
        org.joda.time.DateTime dateTime40 = dateTime38.withYearOfCentury(96);
        int int41 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime38);
        java.util.Date date42 = dateTime38.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime16", (dateTime3.compareTo(dateTime16) == 0) == dateTime3.equals(dateTime16));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Spliterator<java.lang.String> strSpliterator1 = strSet0.spliterator();
        java.util.Locale locale5 = new java.util.Locale("54391", "-0001-02-22T15:06:23.107+00:00:00.052", "secondOfDay");
        java.lang.String str6 = locale5.getCountry();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        boolean boolean9 = locale8.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property14 = dateTime11.centuryOfEra();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getLanguage();
        java.lang.String str17 = property14.getAsText(locale15);
        java.lang.String str18 = locale8.getDisplayLanguage(locale15);
        java.lang.String str19 = locale5.getDisplayVariant(locale8);
        java.util.Set<java.lang.String> strSet20 = locale8.getUnicodeLocaleKeys();
        boolean boolean21 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.plusHours((int) (byte) 0);
        java.util.Date date26 = dateTime23.toDate();
        org.joda.time.DateTime.Property property27 = dateTime23.dayOfMonth();
        org.joda.time.DateTime.Property property28 = dateTime23.dayOfMonth();
        java.lang.String str29 = property28.getAsString();
        org.joda.time.DateTime dateTime30 = property28.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusHours((int) (byte) 0);
        java.util.Date date35 = dateTime32.toDate();
        org.joda.time.DateTime.Property property36 = dateTime32.dayOfMonth();
        org.joda.time.DateTime.Property property37 = dateTime32.dayOfMonth();
        java.util.Locale locale38 = java.util.Locale.ITALIAN;
        java.lang.String str39 = locale38.getLanguage();
        java.lang.String str40 = property37.getAsText(locale38);
        int int41 = property28.getMaximumTextLength(locale38);
        java.util.Set<java.lang.String> strSet42 = locale38.getUnicodeLocaleAttributes();
        boolean boolean43 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet42);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime47.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime51 = dateTime49.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime54 = dateTime51.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean55 = dateTime54.isEqualNow();
        org.joda.time.DateTime.Property property56 = dateTime54.secondOfMinute();
        org.joda.time.DateTime dateTime58 = property56.addToCopy(0L);
        org.joda.time.DateTime dateTime60 = dateTime58.plusMinutes(100);
        int int61 = dateTime60.getMillisOfDay();
        int int62 = dateTime60.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.DateTime dateTime64 = dateTime60.plus(readableDuration63);
        long long65 = dateTime64.getMillis();
        boolean boolean66 = strSet42.equals((java.lang.Object) long65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime47", (dateTime11.compareTo(dateTime47) == 0) == dateTime11.equals(dateTime47));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale6 = new java.util.Locale("1978-05-01T03:32:00.087", "2022-02-21T15:06:23.483+00:00:00.052", "centuries");
        java.lang.String str9 = nameProvider0.getName(locale6, "118", "2022-02-21T15:06:59.270+00:00:00.052");
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.lang.String str17 = locale16.getVariant();
        java.lang.String str18 = dateTimeField14.getAsText((-1), locale16);
        java.lang.String str19 = locale16.getScript();
        java.lang.String str22 = nameProvider0.getName(locale16, "-0001-02-22T15:07:08.804Z", "Japanese");
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale23.getLanguage();
        java.lang.String str25 = locale23.toLanguageTag();
        java.lang.String str28 = nameProvider0.getShortName(locale23, "java.io.IOException: java.io.IOException: 15", "2022-02-21T15:06:59.270+00:00:00.052");
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder29.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder34 = builder32.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale.Builder builder35 = builder32.clearExtensions();
        java.util.Locale.Builder builder37 = builder32.setVariant("years");
        java.util.Locale locale38 = builder37.build();
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder40 = builder31.setLocale(locale38);
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder41.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale.Builder builder44 = builder41.clearExtensions();
        java.util.Locale.Builder builder45 = builder41.clear();
        java.util.Locale.Builder builder46 = builder45.clear();
        java.util.Locale.Builder builder47 = builder45.clear();
        java.util.Locale locale48 = builder47.build();
        java.util.Locale.Builder builder49 = builder31.setLocale(locale48);
        java.util.Locale locale50 = builder49.build();
        java.lang.String str53 = nameProvider0.getShortName(locale50, "54628033", "1970-01-01T00:00:00.087");
        java.lang.String str54 = locale50.getLanguage();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar59 = dateTime58.toGregorianCalendar();
        org.joda.time.DateTime dateTime61 = dateTime58.withWeekyear((int) 'x');
        org.joda.time.DateTime.Property property62 = dateTime58.minuteOfDay();
        org.joda.time.DateTime dateTime64 = dateTime58.withYearOfEra(104);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.era();
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.minus(readableDuration68);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime71.plusHours((int) (byte) 0);
        boolean boolean75 = dateTime73.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime77 = org.joda.time.DateTime.now(dateTimeZone76);
        org.joda.time.DateTime dateTime79 = dateTime77.minusWeeks((int) 'a');
        boolean boolean80 = dateTime73.isAfter((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.DateTime dateTime81 = localDateTime69.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime69.minus(readablePeriod82);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean85 = localDateTime69.isSupported(dateTimeFieldType84);
        boolean boolean86 = dateTime64.isSupported(dateTimeFieldType84);
        boolean boolean87 = locale50.equals((java.lang.Object) dateTime64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime56", (dateTime13.compareTo(dateTime56) == 0) == dateTime13.equals(dateTime56));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateMidnight dateMidnight4 = dateTime1.toDateMidnight();
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.DateTime dateTime8 = dateTime1.toDateTimeISO();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.secondOfMinute();
        org.joda.time.DurationField durationField13 = chronology9.minutes();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int18 = localDateTime15.get(dateTimeFieldType17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.era();
        int int20 = localDateTime15.indexOf(dateTimeFieldType19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime15.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime15.withDurationAdded(readableDuration22, 647);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusHours((int) (byte) 0);
        boolean boolean30 = dateTime28.isEqual((long) (short) 100);
        org.joda.time.DateTime dateTime31 = localDateTime24.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime24.withPeriodAdded(readablePeriod32, 344);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.weekyearOfCentury();
        java.lang.String str41 = dateTimeField39.getAsShortText(10L);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology44 = localDateTime43.getChronology();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundHalfEvenCopy();
        int int47 = dateTimeField39.getMinimumValue((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray48 = localDateTime46.getFieldTypes();
        int int49 = localDateTime46.getSecondOfMinute();
        int[] intArray50 = localDateTime46.getValues();
        chronology9.validate((org.joda.time.ReadablePartial) localDateTime24, intArray50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime38", (dateTime26.compareTo(dateTime38) == 0) == dateTime26.equals(dateTime38));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        int int4 = dateTime3.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime3.withField(dateTimeFieldType5, 2);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime17 = property15.addWrapFieldToCopy((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        org.joda.time.DateTime.Property property19 = dateTime3.property(dateTimeFieldType18);
        org.joda.time.DateTime dateTime20 = dateTime3.toDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusSeconds(848);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime30 = dateTime26.plusSeconds(26);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime34.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime38 = dateTime36.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime41 = dateTime38.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean42 = dateTime41.isEqualNow();
        org.joda.time.LocalDateTime localDateTime43 = dateTime41.toLocalDateTime();
        int int44 = dateTime41.getMonthOfYear();
        int int45 = dateTime41.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.DateTime dateTime48 = dateTime41.withDurationAdded(readableDuration46, (int) '#');
        int int49 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime48);
        int int50 = dateTime24.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime34", (dateTime1.compareTo(dateTime34) == 0) == dateTime1.equals(dateTime34));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.millis();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField6", Math.signum(durationField5.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField5)));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar4 = dateTime3.toGregorianCalendar();
        int int5 = dateTime3.getMillisOfSecond();
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfHour();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property12 = dateTime9.centuryOfEra();
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = property12.getAsText(locale13);
        java.lang.String str16 = locale7.getDisplayName(locale13);
        int int17 = property6.getMaximumTextLength(locale13);
        int int18 = property6.getMinimumValueOverall();
        org.joda.time.DateTime dateTime19 = property6.getDateTime();
        org.joda.time.DateTimeField dateTimeField20 = property6.getField();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfYear();
        org.joda.time.DateTime dateTime27 = dateTime24.minus((long) 671);
        int int28 = dateTime24.getDayOfYear();
        long long29 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime30 = property6.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime24", (dateTime1.compareTo(dateTime24) == 0) == dateTime1.equals(dateTime24));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        java.lang.String str4 = chronology2.toString();
        org.joda.time.DurationField durationField5 = chronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.dayOfMonth();
        org.joda.time.Chronology chronology7 = chronology2.withUTC();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.weekyearOfCentury();
        java.lang.String str15 = dateTimeField13.getAsShortText(10L);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfEvenCopy();
        int int21 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYear(54399);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours((int) (byte) 0);
        boolean boolean29 = dateTime27.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime27.toMutableDateTime(dateTimeZone30);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.era();
        int int34 = mutableDateTime32.get(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.secondOfMinute();
        org.joda.time.DurationField durationField40 = chronology37.millis();
        boolean boolean41 = dateTimeFieldType33.isSupported(chronology37);
        org.joda.time.DateTimeField dateTimeField42 = chronology37.millisOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology37.hourOfDay();
        org.joda.time.tz.NameProvider nameProvider45 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider45);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider45);
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("Property[millisOfSecond]");
        java.lang.String str52 = nameProvider45.getName(locale49, "weekOfWeekyear", "-0001-02-22T15:07:08.008Z");
        java.lang.String str53 = dateTimeField43.getAsText((long) (byte) 0, locale49);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minusSeconds(52);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minusHours(28);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusMillis(405);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.withYearOfEra(64);
        org.joda.time.LocalDateTime.Property property64 = localDateTime61.era();
        org.joda.time.LocalDateTime localDateTime65 = property64.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.withMillisOfDay(592);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType69 = dateTimeFieldType68.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.withFieldAdded(durationFieldType69, 2035);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology75 = localDateTime74.getChronology();
        org.joda.time.LocalDateTime.Property property76 = localDateTime74.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime78 = property76.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime79 = property76.roundHalfCeilingCopy();
        int[] intArray80 = localDateTime79.getValues();
        int[] intArray82 = dateTimeField43.addWrapPartial((org.joda.time.ReadablePartial) localDateTime71, 781, intArray80, 0);
        chronology7.validate((org.joda.time.ReadablePartial) localDateTime23, intArray80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime25", (dateTime3.compareTo(dateTime25) == 0) == dateTime3.equals(dateTime25));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.LocalDateTime localDateTime12 = dateTime10.toLocalDateTime();
        int int13 = dateTime10.getMonthOfYear();
        int int14 = dateTime10.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime10.withDurationAdded(readableDuration15, (int) '#');
        org.joda.time.DateTime dateTime19 = dateTime10.minusWeeks(11);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(54639889);
        org.joda.time.DateTime dateTime24 = dateTime21.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology25 = dateTime21.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime24", (dateTime21.compareTo(dateTime24) == 0) == dateTime21.equals(dateTime24));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar4 = dateTime3.toGregorianCalendar();
        org.joda.time.DateTime dateTime6 = dateTime3.withWeekyear((int) 'x');
        org.joda.time.DateTime.Property property7 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime9 = dateTime3.withYearOfEra(104);
        org.joda.time.DateTime.Property property10 = dateTime3.year();
        org.joda.time.Instant instant11 = dateTime3.toInstant();
        org.joda.time.DateTime.Property property12 = dateTime3.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusHours((int) (byte) 0);
        java.util.Date date17 = dateTime14.toDate();
        org.joda.time.DateTime.Property property18 = dateTime14.dayOfMonth();
        java.lang.String str19 = property18.getAsString();
        boolean boolean20 = property18.isLeap();
        org.joda.time.DateTime dateTime21 = property18.withMaximumValue();
        int int22 = property12.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = property12.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant11", (dateTime3.compareTo(instant11) == 0) == dateTime3.equals(instant11));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        java.lang.String str5 = property3.toString();
        org.joda.time.LocalDateTime localDateTime6 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property12.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusHours((int) (byte) 0);
        boolean boolean22 = dateTime20.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusWeeks((int) 'a');
        boolean boolean27 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime26.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property35 = localDateTime32.weekyear();
        boolean boolean36 = dateTime30.equals((java.lang.Object) localDateTime32);
        int[] intArray38 = chronology16.get((org.joda.time.ReadablePartial) localDateTime32, (long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime43 = localDateTime32.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime.Property property44 = dateTime42.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime42.plus(readableDuration45);
        long long47 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime50 = dateTime46.withDurationAdded((long) 115, 54622);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime54.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime58 = dateTime56.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime.Property property59 = dateTime58.yearOfEra();
        org.joda.time.DateTime dateTime60 = property59.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.DateTime dateTime63 = dateTime60.withDurationAdded(readableDuration61, 212);
        org.joda.time.DateTime dateTime65 = dateTime60.plusMonths(659);
        org.joda.time.DateTime dateTime66 = dateTime60.withLaterOffsetAtOverlap();
        boolean boolean67 = dateTime46.isBefore((org.joda.time.ReadableInstant) dateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime54", (dateTime18.compareTo(dateTime54) == 0) == dateTime18.equals(dateTime54));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket5.saveField(dateTimeField6, (int) (short) 0);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 54619321);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfMinute();
        java.lang.String str17 = dateTimeField15.getAsShortText((-31948L));
        dateTimeParserBucket5.saveField(dateTimeField15, 505);
        java.util.Set<java.lang.String> strSet20 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean22 = strSet20.add("10");
        boolean boolean23 = dateTimeParserBucket5.restoreState((java.lang.Object) "10");
        dateTimeParserBucket5.setOffset(54523837);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1645456059);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(chronology32);
        java.lang.String str34 = chronology32.toString();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.Chronology chronology38 = chronology32.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField39 = chronology32.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField40 = chronology32.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(35999999L, chronology32);
        boolean boolean42 = durationFieldType28.isSupported(chronology32);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.weekOfWeekyear();
        org.joda.time.DurationField durationField47 = durationFieldType28.getField(chronology45);
        org.joda.time.DateTimeField dateTimeField48 = chronology45.dayOfWeek();
        dateTimeParserBucket5.saveField(dateTimeField48, 68916679);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withWeekyear((-1));
        org.joda.time.DateTime dateTime56 = dateTime54.plusMonths(10);
        org.joda.time.DateTime.Property property57 = dateTime56.minuteOfDay();
        int int58 = dateTime56.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone61 = dateTimeZone60.toTimeZone();
        org.joda.time.DateTime dateTime62 = dateTime56.withZone(dateTimeZone60);
        long long65 = dateTimeZone60.adjustOffset((long) 86399, true);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime67 = org.joda.time.DateTime.now(dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime67.withWeekyear((-1));
        org.joda.time.DateTime dateTime71 = dateTime67.withMillisOfDay(0);
        org.joda.time.DateTime.Property property72 = dateTime71.millisOfSecond();
        org.joda.time.DateTime dateTime74 = dateTime71.minusMillis(24);
        int int75 = dateTimeZone60.getOffset((org.joda.time.ReadableInstant) dateTime74);
        boolean boolean77 = dateTimeZone60.isStandardOffset(31L);
        java.lang.String str78 = dateTimeZone60.getID();
        int int80 = dateTimeZone60.getOffsetFromLocal(143105949158400000L);
        dateTimeParserBucket5.setZone(dateTimeZone60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and dateTime52", (dateTime33.compareTo(dateTime52) == 0) == dateTime33.equals(dateTime52));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Instant instant11 = dateTime3.toInstant();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour((int) (short) 10);
        int int18 = dateTime17.getMillisOfDay();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology20, locale21, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField25 = null;
        dateTimeParserBucket24.saveField(dateTimeField25, (int) (short) 0);
        java.lang.Integer int28 = dateTimeParserBucket24.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket24.setZone(dateTimeZone29);
        int int32 = dateTimeZone29.getStandardOffset((long) 1969);
        org.joda.time.DateTime dateTime33 = dateTime17.toDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekyear((-1));
        org.joda.time.DateTime dateTime39 = dateTime37.plusMonths(10);
        org.joda.time.DateTime.Property property40 = dateTime39.minuteOfDay();
        int int41 = dateTime39.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone44 = dateTimeZone43.toTimeZone();
        org.joda.time.DateTime dateTime45 = dateTime39.withZone(dateTimeZone43);
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        java.lang.String str48 = dateTimeZone43.getName((long) 26, locale47);
        boolean boolean49 = dateTime33.equals((java.lang.Object) dateTimeZone43);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((java.lang.Object) instant11, dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime45", (dateTime39.compareTo(dateTime45) == 0) == dateTime39.equals(dateTime45));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        int int7 = dateTime5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = dateTime5.withZone(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plus(readableDuration16);
        org.joda.time.DateTime dateTime18 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        int int20 = dateTime18.getMinuteOfHour();
        org.joda.time.DateTime dateTime22 = dateTime18.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime23 = dateTime18.toLocalDateTime();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology26, locale27, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField31 = null;
        dateTimeParserBucket30.saveField(dateTimeField31, (int) (short) 0);
        java.lang.Integer int34 = dateTimeParserBucket30.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket30.setZone(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekyear((-1));
        org.joda.time.DateTime dateTime42 = dateTime38.plusHours((int) (byte) 100);
        boolean boolean44 = dateTime42.isBefore((long) ' ');
        int int45 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = dateTimeZone35.isLocalDateTimeGap(localDateTime46);
        boolean boolean49 = dateTimeZone35.isStandardOffset(1645455983203L);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(1645455979996L, dateTimeZone35);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.dayOfMonth();
        int int52 = localDateTime50.size();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusDays(212);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.weekyear();
        org.joda.time.LocalDateTime localDateTime64 = property62.addWrapFieldToCopy(576);
        org.joda.time.LocalDateTime localDateTime65 = property62.withMinimumValue();
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.dayOfMonth();
        int int67 = localDateTime65.getHourOfDay();
        int int68 = localDateTime65.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime65.plusSeconds(584);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.plus(readablePeriod71);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime74 = org.joda.time.DateTime.now(dateTimeZone73);
        org.joda.time.DateTime dateTime76 = dateTime74.withWeekyear((-1));
        org.joda.time.DateTime dateTime78 = dateTime76.plusMonths(10);
        org.joda.time.DateTime.Property property79 = dateTime78.minuteOfDay();
        boolean boolean80 = dateTime78.isBeforeNow();
        org.joda.time.LocalDateTime localDateTime81 = dateTime78.toLocalDateTime();
        int int82 = localDateTime72.compareTo((org.joda.time.ReadablePartial) localDateTime81);
        int int83 = localDateTime72.getSecondOfMinute();
        int int84 = localDateTime50.compareTo((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime23.withFields((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetHours(12);
        long long91 = dateTimeZone87.convertLocalToUTC((long) (short) 1, true, (long) 865);
        long long94 = dateTimeZone87.convertLocalToUTC(0L, false);
        org.joda.time.DateTime dateTime95 = localDateTime23.toDateTime(dateTimeZone87);
        org.joda.time.LocalDateTime localDateTime97 = localDateTime23.minusSeconds(687);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime11", (dateTime5.compareTo(dateTime11) == 0) == dateTime5.equals(dateTime11));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours((int) (byte) 0);
        boolean boolean6 = dateTime4.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) 'a');
        boolean boolean11 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime();
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology18 = dateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) dateTime12, chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = chronology18.getZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(788923800000L, chronology18);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekyear((-1));
        org.joda.time.DateTime dateTime29 = dateTime27.plusMonths(10);
        org.joda.time.DateTime.Property property30 = dateTime29.minuteOfDay();
        int int31 = dateTime29.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime35 = dateTime29.withZone(dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.withPeriodAdded(readablePeriod36, 13);
        boolean boolean39 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime41 = dateTime22.withCenturyOfEra(647);
        int int42 = dateTime41.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property43 = dateTime41.secondOfDay();
        org.joda.time.DateTime.Property property44 = dateTime41.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime35", (dateTime29.compareTo(dateTime35) == 0) == dateTime29.equals(dateTime35));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds(54647283);
        org.joda.time.TimeOfDay timeOfDay7 = dateTime6.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear((-1));
        org.joda.time.DateTime dateTime13 = dateTime11.plusMonths(10);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        int int15 = dateTime13.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = dateTime13.withZone(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plus(readableDuration24);
        org.joda.time.DateTime dateTime26 = dateTime13.withFields((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime26.getZone();
        int int28 = dateTime26.getMinuteOfHour();
        org.joda.time.DateTime dateTime30 = dateTime26.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime31 = dateTime26.toLocalDateTime();
        org.joda.time.DateTime dateTime32 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime19", (dateTime13.compareTo(dateTime19) == 0) == dateTime13.equals(dateTime19));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.millisOfSecond();
        int int13 = property12.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plus(readableDuration15);
        int int17 = localDateTime14.getYearOfCentury();
        java.util.Locale locale19 = new java.util.Locale("15");
        java.lang.String str20 = locale19.getScript();
        java.lang.String str21 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime14, locale19);
        org.joda.time.LocalDateTime.Property property22 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int27 = localDateTime24.get(dateTimeFieldType26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.era();
        int int29 = localDateTime24.indexOf(dateTimeFieldType28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime24.dayOfMonth();
        int int31 = localDateTime24.getCenturyOfEra();
        boolean boolean32 = localDateTime14.isEqual((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime38 = dateTime36.withMinuteOfHour((int) (short) 10);
        int int39 = dateTime38.getMillisOfDay();
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology41, locale42, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField46 = null;
        dateTimeParserBucket45.saveField(dateTimeField46, (int) (short) 0);
        java.lang.Integer int49 = dateTimeParserBucket45.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket45.setZone(dateTimeZone50);
        int int53 = dateTimeZone50.getStandardOffset((long) 1969);
        org.joda.time.DateTime dateTime54 = dateTime38.toDateTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.withWeekyear((-1));
        org.joda.time.DateTime dateTime60 = dateTime58.plusMonths(10);
        org.joda.time.DateTime.Property property61 = dateTime60.minuteOfDay();
        int int62 = dateTime60.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone65 = dateTimeZone64.toTimeZone();
        org.joda.time.DateTime dateTime66 = dateTime60.withZone(dateTimeZone64);
        java.util.Locale locale68 = java.util.Locale.ITALIAN;
        java.lang.String str69 = dateTimeZone64.getName((long) 26, locale68);
        boolean boolean70 = dateTime54.equals((java.lang.Object) dateTimeZone64);
        org.joda.time.DateTime dateTime71 = dateTime54.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant73 = null;
        int int74 = dateTimeZone72.getOffset(readableInstant73);
        int int76 = dateTimeZone72.getStandardOffset((long) 15);
        java.lang.String str78 = dateTimeZone72.getName((long) (short) -1);
        int int80 = dateTimeZone72.getOffset((long) 15);
        java.lang.String str82 = dateTimeZone72.getNameKey((long) 112);
        boolean boolean83 = dateTimeZone72.isFixed();
        org.joda.time.DateTime dateTime84 = dateTime71.withZone(dateTimeZone72);
        org.joda.time.DateTime dateTime85 = org.joda.time.DateTime.now(dateTimeZone72);
        org.joda.time.DateTime dateTime86 = localDateTime24.toDateTime(dateTimeZone72);
        org.joda.time.Chronology chronology87 = dateTime86.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and dateTime66", (dateTime60.compareTo(dateTime66) == 0) == dateTime60.equals(dateTime66));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = dateTimeField5.getLeapDurationField();
        org.joda.time.DurationField durationField7 = dateTimeField5.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusHours(21);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plusMillis(577);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int27 = localDateTime24.get(dateTimeFieldType26);
        boolean boolean28 = localDateTime20.equals((java.lang.Object) dateTimeFieldType26);
        int int29 = localDateTime12.indexOf(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime12.minusHours(54641);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        int int33 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property38 = localDateTime35.weekOfWeekyear();
        int int39 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime.Property property40 = localDateTime35.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property41 = localDateTime35.centuryOfEra();
        int int42 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.Chronology chronology43 = localDateTime35.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusHours((int) (byte) 0);
        boolean boolean49 = dateTime47.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusWeeks((int) 'a');
        boolean boolean54 = dateTime47.isAfter((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime55 = dateTime53.toDateTime();
        org.joda.time.Chronology chronology56 = dateTime55.getChronology();
        java.lang.String str57 = chronology56.toString();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(chronology56);
        org.joda.time.DurationField durationField59 = chronology56.months();
        org.joda.time.DurationField durationField60 = chronology56.minutes();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology63 = localDateTime62.getChronology();
        org.joda.time.LocalDateTime.Property property64 = localDateTime62.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime65 = property64.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology68 = localDateTime67.getChronology();
        org.joda.time.LocalDateTime.Property property69 = localDateTime67.era();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.plusYears(100);
        int[] intArray72 = localDateTime67.getValues();
        long long74 = chronology56.set((org.joda.time.ReadablePartial) localDateTime67, (long) 54658957);
        org.joda.time.DateTimeField dateTimeField75 = chronology56.year();
        java.util.Locale locale79 = new java.util.Locale("21", "52");
        boolean boolean80 = locale79.hasExtensions();
        java.lang.String str81 = locale79.getScript();
        java.lang.String str82 = locale79.getDisplayScript();
        java.lang.String str83 = dateTimeField75.getAsText(86348052, locale79);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((long) 54639889, chronology43, locale79);
        java.lang.String str85 = locale79.getDisplayCountry();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime45", (dateTime4.compareTo(dateTime45) == 0) == dateTime4.equals(dateTime45));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime3.withChronology(chronology6);
        boolean boolean10 = dateTime8.isEqual((long) 54625758);
        int int11 = dateTime8.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime13.withChronology(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime13.toMutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime8.toMutableDateTime(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime18", (dateTime3.compareTo(dateTime18) == 0) == dateTime3.equals(dateTime18));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = chronology3.getZone();
        org.joda.time.DurationField durationField6 = chronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.hourOfDay();
        org.joda.time.DurationField durationField8 = chronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.minuteOfHour();
        org.joda.time.DurationField durationField10 = chronology3.weekyears();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(40);
        org.joda.time.Chronology chronology13 = chronology3.withZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone14.getOffset(readableInstant15);
        int int18 = dateTimeZone14.getStandardOffset((long) 15);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekyear((-1));
        org.joda.time.DateMidnight dateMidnight24 = dateTime21.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        boolean boolean26 = dateTime19.equals((java.lang.Object) dateTimeZone25);
        java.lang.String str28 = dateTimeZone25.getName(1645455980075L);
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        boolean boolean31 = locale30.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property36 = dateTime33.centuryOfEra();
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        java.lang.String str38 = locale37.getLanguage();
        java.lang.String str39 = property36.getAsText(locale37);
        java.lang.String str40 = locale30.getDisplayLanguage(locale37);
        java.util.Locale locale41 = null;
        java.lang.String str42 = locale37.getDisplayScript(locale41);
        java.lang.String str43 = dateTimeZone25.getShortName((long) 766, locale37);
        long long45 = dateTimeZone25.nextTransition((long) 541);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology48 = localDateTime47.getChronology();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundHalfEvenCopy();
        java.lang.String str51 = property49.getAsText();
        org.joda.time.LocalDateTime localDateTime52 = property49.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone54 = dateTimeZone53.toTimeZone();
        java.lang.String str55 = dateTimeZone53.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone53);
        int int58 = dateTimeZone53.getOffset(0L);
        org.joda.time.DateTime dateTime59 = localDateTime52.toDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.DateTime.Property property61 = dateTime60.dayOfMonth();
        boolean boolean62 = dateTimeZone25.equals((java.lang.Object) property61);
        java.util.Locale locale63 = java.util.Locale.ITALIAN;
        java.lang.String str64 = locale63.getScript();
        java.util.Locale locale65 = java.util.Locale.ENGLISH;
        java.lang.String str66 = locale65.getVariant();
        java.lang.String str67 = locale63.getDisplayName(locale65);
        int int68 = property61.getMaximumTextLength(locale65);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket(1645456171130L, chronology3, locale65, (java.lang.Integer) 54842, 60741593);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime19", (dateTime4.compareTo(dateTime19) == 0) == dateTime4.equals(dateTime19));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = chronology2.getZone();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfDay();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("Cina");
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.removeUnicodeLocaleAttribute("Feb");
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder15 = builder11.setLocale(locale14);
        java.util.Locale locale16 = builder15.build();
        java.lang.String str17 = locale10.getDisplayScript(locale16);
        java.lang.String str18 = dateTimeField7.getAsShortText(54429L, locale10);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime25 = property22.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusMinutes(20);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plus(readableDuration30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks(536);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusHours((int) (byte) 0);
        boolean boolean40 = dateTime38.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusWeeks((int) 'a');
        boolean boolean45 = dateTime38.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = dateTime44.toDateTime();
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.minusWeeks((int) 'a');
        org.joda.time.Chronology chronology52 = dateTime49.getChronology();
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((java.lang.Object) dateTime46, chronology52);
        org.joda.time.DateTimeZone dateTimeZone55 = chronology52.getZone();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(788923800000L, chronology52);
        org.joda.time.DateTimeZone dateTimeZone57 = dateTime56.getZone();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone58);
        org.joda.time.DateTime dateTime61 = dateTime59.withWeekyear((-1));
        org.joda.time.DateTime dateTime63 = dateTime61.plusMonths(10);
        org.joda.time.DateTime.Property property64 = dateTime63.minuteOfDay();
        int int65 = dateTime63.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        org.joda.time.DateTime dateTime69 = dateTime63.withZone(dateTimeZone67);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.DateTime dateTime72 = dateTime69.withPeriodAdded(readablePeriod70, 13);
        boolean boolean73 = dateTime56.isEqual((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime dateTime74 = localDateTime33.toDateTime((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Chronology chronology75 = dateTime74.getChronology();
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((java.lang.Object) 54429L, chronology75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime36", (dateTime3.compareTo(dateTime36) == 0) == dateTime3.equals(dateTime36));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = dateTime1.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTime dateTime6 = dateTime1.withChronology(chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = dateTime1.withZoneRetainFields(dateTimeZone7);
        java.lang.String str10 = dateTimeZone7.toString();
        boolean boolean12 = dateTimeZone7.isStandardOffset(54590948L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime6", (dateTime1.compareTo(dateTime6) == 0) == dateTime1.equals(dateTime6));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.minusHours(15);
        org.joda.time.DateTime dateTime7 = dateTime5.withCenturyOfEra(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = dateTime7.toString(dateTimeFormatter8);
        int int10 = dateTime7.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        java.lang.String str13 = dateTimeZone11.toString();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.era();
        boolean boolean20 = localDateTime18.isSupported(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18);
        boolean boolean22 = dateTimeZone11.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTime dateTime23 = dateTime7.toDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours((int) (byte) 0);
        boolean boolean29 = dateTime27.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusWeeks((int) 'a');
        boolean boolean34 = dateTime27.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime35 = dateTime33.toDateTime();
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        java.lang.String str37 = chronology36.toString();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology36);
        org.joda.time.DateTimeField dateTimeField39 = chronology36.millisOfDay();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(chronology36);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusMonths(54481);
        org.joda.time.LocalDateTime.Property property44 = localDateTime41.monthOfYear();
        org.joda.time.DateTime dateTime45 = dateTime23.withFields((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology48 = localDateTime47.getChronology();
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(chronology48);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.DurationField durationField51 = chronology48.millis();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField53 = chronology48.centuryOfEra();
        org.joda.time.DurationField durationField54 = chronology48.years();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology48.getZone();
        org.joda.time.Chronology chronology56 = chronology48.withUTC();
        boolean boolean57 = localDateTime41.equals((java.lang.Object) chronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime49", (dateTime1.compareTo(dateTime49) == 0) == dateTime1.equals(dateTime49));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset((long) 15);
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone0);
        long long9 = dateTimeZone0.convertLocalToUTC((long) 54481, false, (long) 54494155);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekyear((-1));
        org.joda.time.DateTime dateTime15 = dateTime11.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.plus(readableDuration16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths((int) '#');
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusHours((int) (byte) 0);
        boolean boolean25 = dateTime23.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime23.toMutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.era();
        int int30 = mutableDateTime28.get(dateTimeFieldType29);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.secondOfMinute();
        org.joda.time.DurationField durationField36 = chronology33.millis();
        boolean boolean37 = dateTimeFieldType29.isSupported(chronology33);
        boolean boolean38 = dateTime19.isSupported(dateTimeFieldType29);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.withWeekyear((-1));
        org.joda.time.DateTime dateTime44 = dateTime42.plusMonths(10);
        org.joda.time.DateTime.Property property45 = dateTime44.minuteOfDay();
        boolean boolean46 = dateTime19.equals((java.lang.Object) dateTime44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusWeeks((int) 'a');
        int int51 = dateTime50.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime dateTime54 = dateTime50.withField(dateTimeFieldType52, 2);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology57 = localDateTime56.getChronology();
        org.joda.time.LocalDateTime.Property property58 = localDateTime56.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime59 = property58.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.withYear((int) (short) 100);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime64 = property62.addWrapFieldToCopy((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property62.getFieldType();
        org.joda.time.DateTime.Property property66 = dateTime50.property(dateTimeFieldType65);
        org.joda.time.DateTime dateTime68 = dateTime19.withField(dateTimeFieldType65, 6);
        org.joda.time.DateTime dateTime70 = dateTime68.plusMillis(535);
        org.joda.time.DateTime dateTime72 = dateTime68.plusHours(54491);
        org.joda.time.Instant instant73 = dateTime68.toInstant();
        int int74 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTime dateTime75 = dateTime68.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        org.joda.time.DateTime dateTime78 = dateTime75.withPeriodAdded(readablePeriod76, 54707);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime68 and instant73", (dateTime68.compareTo(instant73) == 0) == dateTime68.equals(instant73));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusWeeks((int) 'x');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusMonths(292278993);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readableDuration10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime16 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.minus(readablePeriod17);
        int int19 = localDateTime18.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.plusHours(977);
        boolean boolean27 = dateTime25.isAfter((long) 671);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int32 = localDateTime29.get(dateTimeFieldType31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.era();
        int int34 = localDateTime29.indexOf(dateTimeFieldType33);
        boolean boolean35 = dateTime25.isSupported(dateTimeFieldType33);
        boolean boolean36 = localDateTime18.isSupported(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(chronology39);
        java.lang.String str41 = chronology39.toString();
        org.joda.time.DurationField durationField42 = chronology39.hours();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.dayOfMonth();
        long long46 = dateTimeField43.add((long) 660, 54634221);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = dateTimeField43.getType();
        boolean boolean48 = localDateTime18.isSupported(dateTimeFieldType47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime40", (dateTime15.compareTo(dateTime40) == 0) == dateTime15.equals(dateTime40));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.era();
        boolean boolean7 = localDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfMinute();
        boolean boolean13 = dateTimeFieldType6.isSupported(chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj0, chronology10);
        org.joda.time.DateTimeField dateTimeField16 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField17 = chronology10.centuries();
        org.joda.time.DurationField durationField18 = chronology10.millis();
        org.joda.time.DateTimeField dateTimeField19 = chronology10.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfYear();
        org.joda.time.DateTime dateTime26 = dateTime23.minus((long) 671);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology28, locale29, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField33 = null;
        dateTimeParserBucket32.saveField(dateTimeField33, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        dateTimeParserBucket32.saveField(dateTimeFieldType36, "it", locale38);
        int int40 = dateTime23.get(dateTimeFieldType36);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.LocalDateTime.Property property44 = localDateTime42.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = property44.roundHalfEvenCopy();
        java.lang.String str46 = property44.getAsText();
        org.joda.time.LocalDateTime localDateTime47 = property44.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone49 = dateTimeZone48.toTimeZone();
        java.lang.String str50 = dateTimeZone48.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone48);
        int int53 = dateTimeZone48.getOffset(0L);
        org.joda.time.DateTime dateTime54 = localDateTime47.toDateTime(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone56);
        java.lang.String str58 = dateTimeZone56.toString();
        long long60 = dateTimeZone48.getMillisKeepLocal(dateTimeZone56, 1645455977932L);
        boolean boolean61 = dateTime23.equals((java.lang.Object) dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime62 = dateTime23.toLocalDateTime();
        org.joda.time.DateTimeField[] dateTimeFieldArray63 = localDateTime62.getFields();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(dateTimeZone64);
        org.joda.time.DateTime dateTime67 = dateTime65.plusHours((int) (byte) 0);
        boolean boolean69 = dateTime67.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime71.minusWeeks((int) 'a');
        boolean boolean74 = dateTime67.isAfter((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime75 = dateTime73.toDateTime();
        org.joda.time.Chronology chronology76 = dateTime75.getChronology();
        java.lang.String str77 = chronology76.toString();
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(chronology76);
        org.joda.time.DateTimeField dateTimeField79 = chronology76.minuteOfHour();
        int int81 = dateTimeField79.get((long) 86399999);
        org.joda.time.DurationField durationField82 = dateTimeField79.getRangeDurationField();
        int int85 = dateTimeField79.getDifference(63839718000L, 1645455996066L);
        java.util.Locale locale88 = new java.util.Locale("weekOfWeekyear", "-0001-02-22T15:06:41.898+00:00:00.052");
        int int89 = dateTimeField79.getMaximumTextLength(locale88);
        java.util.Locale locale94 = new java.util.Locale("2022-02-21T15:06:57.614+00:00:00.052", "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)", "Property[dayOfMonth]");
        java.lang.String str95 = dateTimeField79.getAsText(1586790415117L, locale94);
        java.lang.String str96 = locale94.getCountry();
        java.lang.String str97 = dateTimeField19.getAsShortText((org.joda.time.ReadablePartial) localDateTime62, locale94);
        org.joda.time.LocalDateTime.Property property98 = localDateTime62.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime65", (dateTime23.compareTo(dateTime65) == 0) == dateTime23.equals(dateTime65));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime.Property property11 = dateTime3.secondOfDay();
        org.joda.time.DateTime dateTime12 = property11.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.era();
        boolean boolean19 = localDateTime17.isSupported(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology22 = localDateTime21.getChronology();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.secondOfMinute();
        boolean boolean25 = dateTimeFieldType18.isSupported(chronology22);
        int int26 = dateTime12.get(dateTimeFieldType18);
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType18.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(chronology32);
        java.lang.String str34 = chronology32.toString();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.Chronology chronology38 = chronology32.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField39 = chronology32.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField40 = chronology32.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(35999999L, chronology32);
        org.joda.time.DurationField durationField42 = chronology32.minutes();
        org.joda.time.DurationField durationField43 = chronology32.hours();
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 559, chronology32, locale44, (java.lang.Integer) 822, 54381);
        org.joda.time.DateTimeField dateTimeField48 = chronology32.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField49 = chronology32.yearOfEra();
        org.joda.time.DateTimeField dateTimeField50 = chronology32.weekyearOfCentury();
        org.joda.time.DurationField durationField51 = chronology32.months();
        org.joda.time.DateTimeField dateTimeField52 = chronology32.era();
        org.joda.time.DurationField durationField53 = chronology32.weeks();
        boolean boolean54 = dateTimeFieldType18.isSupported(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime33", (dateTime1.compareTo(dateTime33) == 0) == dateTime1.equals(dateTime33));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfMinute();
        org.joda.time.DateTime dateTime14 = property12.addToCopy(0L);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(100);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology18, locale19, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField23 = null;
        dateTimeParserBucket22.saveField(dateTimeField23, (int) (short) 0);
        java.lang.Integer int26 = dateTimeParserBucket22.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        long long30 = dateTimeZone27.convertLocalToUTC(0L, false);
        dateTimeParserBucket22.setZone(dateTimeZone27);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket22.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.years();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.dayOfWeek();
        org.joda.time.DateTime dateTime35 = dateTime16.toDateTime(chronology32);
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekyear((-1));
        org.joda.time.DateTime dateTime42 = dateTime40.plusMonths(10);
        org.joda.time.DateTime.Property property43 = dateTime42.minuteOfDay();
        int int44 = dateTime42.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone47 = dateTimeZone46.toTimeZone();
        org.joda.time.DateTime dateTime48 = dateTime42.withZone(dateTimeZone46);
        org.joda.time.DateTime.Property property49 = dateTime42.yearOfEra();
        org.joda.time.DateTime.Property property50 = dateTime42.year();
        org.joda.time.LocalDate localDate51 = dateTime42.toLocalDate();
        int int52 = property36.compareTo((org.joda.time.ReadablePartial) localDate51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime38", (dateTime3.compareTo(dateTime38) == 0) == dateTime3.equals(dateTime38));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime6 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime8 = dateTime6.withYear(1146);
        int int9 = dateTime6.getYearOfCentury();
        org.joda.time.DateTime dateTime11 = dateTime6.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.minusMonths(584);
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra(689);
        boolean boolean16 = dateTime15.isBeforeNow();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillis(4607910980029L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property23 = dateTime20.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(72000052L, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime20.withZoneRetainFields(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.millisOfSecond();
        org.joda.time.DurationField durationField35 = chronology31.seconds();
        org.joda.time.DurationField durationField36 = chronology31.centuries();
        org.joda.time.DateTimeField dateTimeField37 = chronology31.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.plusMillis(99);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.plusHours((int) (byte) 0);
        boolean boolean50 = dateTime48.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusWeeks((int) 'a');
        boolean boolean55 = dateTime48.isAfter((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime56 = dateTime54.toDateTime();
        org.joda.time.Chronology chronology57 = dateTime56.getChronology();
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.LocalDateTime.Property property61 = localDateTime59.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = property61.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.withDayOfYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.withMillisOfSecond(1);
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) 0);
        int[] intArray69 = localDateTime68.getValues();
        chronology57.validate((org.joda.time.ReadablePartial) localDateTime66, intArray69);
        int int71 = dateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) localDateTime44, intArray69);
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology74 = localDateTime73.getChronology();
        org.joda.time.LocalDateTime.Property property75 = localDateTime73.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime76 = property75.withMaximumValue();
        int int77 = localDateTime76.getEra();
        int int78 = dateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) localDateTime76);
        java.util.Locale locale79 = java.util.Locale.CANADA;
        int int80 = dateTimeField37.getMaximumShortTextLength(locale79);
        java.lang.String str81 = locale79.getDisplayVariant();
        java.util.Calendar calendar82 = dateTime28.toCalendar(locale79);
        int int83 = dateTime28.getWeekyear();
        org.joda.time.DateTime.Property property84 = dateTime28.dayOfMonth();
        boolean boolean85 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime28", (dateTime3.compareTo(dateTime28) == 0) == dateTime3.equals(dateTime28));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        int int6 = dateTime1.getDayOfYear();
        long long7 = dateTime1.getMillis();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.era();
        boolean boolean14 = localDateTime12.isSupported(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.secondOfMinute();
        boolean boolean20 = dateTimeFieldType13.isSupported(chronology17);
        org.joda.time.DateTime dateTime21 = dateTime1.toDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime32 = dateTime29.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean33 = dateTime32.isEqualNow();
        org.joda.time.DateTime.Property property34 = dateTime32.secondOfMinute();
        org.joda.time.DateTime dateTime36 = property34.addToCopy(0L);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMinutes(100);
        int int39 = dateTime38.getMillisOfDay();
        org.joda.time.DateTime dateTime41 = dateTime38.plusWeeks((int) '4');
        int int42 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime44 = dateTime41.plusSeconds(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime21", (dateTime1.compareTo(dateTime21) == 0) == dateTime1.equals(dateTime21));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "cinese");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("coreano");
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("999");
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property13 = dateTime10.centuryOfEra();
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale14.getLanguage();
        java.lang.String str16 = property13.getAsText(locale14);
        java.lang.String str17 = locale8.getDisplayName(locale14);
        java.lang.String str19 = locale14.getExtension('a');
        java.util.Locale.Builder builder20 = builder7.setLocale(locale14);
        java.lang.Object obj22 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology25);
        java.lang.String str27 = chronology25.toString();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.weekOfWeekyear();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj22, chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology25.getZone();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology33, locale34, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField38 = null;
        dateTimeParserBucket37.saveField(dateTimeField38, (int) (short) 0);
        dateTimeParserBucket37.setOffset((java.lang.Integer) 54647283);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeParserBucket37.getZone();
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        boolean boolean46 = locale45.hasExtensions();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology49 = localDateTime48.getChronology();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.clockhourOfDay();
        java.util.Locale locale53 = java.util.Locale.ENGLISH;
        java.lang.String str54 = locale53.getVariant();
        java.lang.String str55 = dateTimeField51.getAsText((-1), locale53);
        java.lang.String str56 = locale45.getDisplayScript(locale53);
        java.lang.String str57 = dateTimeZone43.getShortName((long) 54501901, locale53);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 54630234, chronology25, locale53, (java.lang.Integer) 54622);
        java.util.Set<java.lang.String> strSet60 = locale53.getUnicodeLocaleAttributes();
        java.lang.String str61 = locale53.getDisplayVariant();
        java.lang.String str62 = locale53.toLanguageTag();
        java.lang.String str63 = locale14.getDisplayName(locale53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime26", (dateTime10.compareTo(dateTime26) == 0) == dateTime10.equals(dateTime26));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.era();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.property(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks((int) 'a');
        java.util.GregorianCalendar gregorianCalendar20 = dateTime19.toGregorianCalendar();
        org.joda.time.DateTime dateTime22 = dateTime19.withWeekyear((int) 'x');
        int int23 = property15.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology24 = dateTime22.getChronology();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = chronology24.add(readablePeriod25, (long) 894, 54623847);
        org.joda.time.DurationField durationField29 = chronology24.hours();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 457071, chronology24);
        org.joda.time.DurationField durationField31 = durationFieldType0.getField(chronology24);
        java.lang.Object obj32 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.era();
        boolean boolean39 = localDateTime37.isSupported(dateTimeFieldType38);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now(chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.secondOfMinute();
        boolean boolean45 = dateTimeFieldType38.isSupported(chronology42);
        org.joda.time.DateTimeField dateTimeField46 = chronology42.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(obj32, chronology42);
        org.joda.time.DurationField durationField48 = chronology42.minutes();
        org.joda.time.DurationField durationField49 = chronology42.weeks();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now(chronology42);
        org.joda.time.DurationField durationField51 = durationFieldType0.getField(chronology42);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime57 = dateTime53.plusSeconds(26);
        long long58 = dateTime53.getMillis();
        org.joda.time.DateTime dateTime60 = dateTime53.minus((long) 13);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.DateTime dateTime63 = dateTime53.withPeriodAdded(readablePeriod61, 86348052);
        org.joda.time.Chronology chronology64 = dateTime63.getChronology();
        org.joda.time.DurationField durationField65 = durationFieldType0.getField(chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField65 and durationField51", (durationField65.compareTo(durationField51) == 0) == durationField65.equals(durationField51));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int) 'a');
        boolean boolean10 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime9.plusMinutes(977);
        int int16 = dateTime15.getCenturyOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.minuteOfDay();
        org.joda.time.Instant instant18 = dateTime15.toInstant();
        org.joda.time.DateTime dateTime20 = dateTime15.plusWeeks(212460000);
        org.joda.time.DateTime dateTime22 = dateTime15.plusHours(68984492);
        int int23 = dateTime22.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology3);
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DurationField durationField6 = chronology3.hours();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.dayOfMonth();
        org.joda.time.Chronology chronology8 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours((int) (byte) 0);
        java.util.Date date14 = dateTime11.toDate();
        org.joda.time.DateTime.Property property15 = dateTime11.dayOfMonth();
        org.joda.time.DateTime.Property property16 = dateTime11.dayOfMonth();
        java.lang.String str17 = property16.getAsString();
        org.joda.time.DateTime dateTime19 = property16.addToCopy((long) 15);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfDay();
        org.joda.time.DurationField durationField21 = property20.getDurationField();
        org.joda.time.DateTime dateTime22 = property20.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekyear((-1));
        org.joda.time.DateTime dateTime28 = dateTime26.minusHours(15);
        org.joda.time.DateTime dateTime30 = dateTime26.minusHours(212);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime33 = dateTime26.withDurationAdded(readableDuration31, 4);
        int int34 = dateTime33.getMinuteOfHour();
        org.joda.time.DateTime.Property property35 = dateTime33.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = property39.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.LocalDateTime.Property property44 = localDateTime42.era();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.plusYears(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property48 = localDateTime42.property(dateTimeFieldType47);
        org.joda.time.DurationField durationField49 = property48.getLeapDurationField();
        org.joda.time.DurationField durationField50 = property48.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withWeekyear((-1));
        org.joda.time.DateMidnight dateMidnight55 = dateTime52.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone56 = dateMidnight55.getZone();
        org.joda.time.MutableDateTime mutableDateTime57 = dateMidnight55.toMutableDateTime();
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology59, locale60, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField64 = null;
        dateTimeParserBucket63.saveField(dateTimeField64, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale69 = java.util.Locale.ROOT;
        dateTimeParserBucket63.saveField(dateTimeFieldType67, "it", locale69);
        java.lang.String str71 = locale69.getISO3Country();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime73 = org.joda.time.DateTime.now(dateTimeZone72);
        org.joda.time.DateTime dateTime75 = dateTime73.plusHours((int) (byte) 0);
        java.util.Date date76 = dateTime73.toDate();
        org.joda.time.DateTime.Property property77 = dateTime73.dayOfMonth();
        org.joda.time.DateTime.Property property78 = dateTime73.dayOfMonth();
        java.util.Locale locale79 = java.util.Locale.ITALIAN;
        java.lang.String str80 = locale79.getLanguage();
        java.lang.String str81 = property78.getAsText(locale79);
        java.lang.String str82 = locale69.getDisplayScript(locale79);
        boolean boolean83 = mutableDateTime57.equals((java.lang.Object) locale79);
        java.lang.String str84 = locale79.getDisplayLanguage();
        int int85 = property48.getMaximumShortTextLength(locale79);
        java.util.Calendar calendar86 = dateTime33.toCalendar(locale79);
        java.lang.String str87 = property20.getAsText(locale79);
        java.util.Set<java.lang.String> strSet88 = locale79.getUnicodeLocaleAttributes();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket89 = new org.joda.time.format.DateTimeParserBucket(1586790666508L, chronology3, locale79);
        long long93 = chronology3.add((long) (byte) 10, 1645456004706L, 54596);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime11", (dateTime4.compareTo(dateTime11) == 0) == dateTime4.equals(dateTime11));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket5.saveField(dateTimeField6, (int) (short) 0);
        java.lang.Integer int9 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket5.setZone(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime19.withDurationAdded((long) 2022, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime19.getZone();
        int int24 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime26 = dateTime19.minusSeconds(52);
        org.joda.time.DateTime.Property property27 = dateTime19.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusHours((int) (byte) 0);
        boolean boolean33 = dateTime31.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.minusWeeks((int) 'a');
        boolean boolean38 = dateTime31.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTime();
        org.joda.time.DateTime dateTime41 = dateTime37.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.weekyear();
        boolean boolean47 = dateTime41.equals((java.lang.Object) localDateTime43);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime41.getZone();
        org.joda.time.DateTime.Property property49 = dateTime41.secondOfDay();
        org.joda.time.DateTime dateTime51 = property49.addToCopy(1645456049161L);
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.util.Locale locale53 = locale52.stripExtensions();
        java.lang.String str54 = locale52.getDisplayVariant();
        java.lang.String str55 = property49.getAsShortText(locale52);
        java.lang.String str56 = locale52.getDisplayScript();
        java.lang.String str57 = property27.getAsShortText(locale52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime29", (dateTime15.compareTo(dateTime29) == 0) == dateTime15.equals(dateTime29));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours((int) (byte) 0);
        boolean boolean6 = dateTime4.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) 'a');
        boolean boolean11 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property12 = dateTime4.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime14.getZone();
        java.lang.String str18 = dateTimeZone17.toString();
        org.joda.time.DateTime dateTime19 = dateTime4.toDateTime(dateTimeZone17);
        long long21 = dateTimeZone17.nextTransition((long) 132);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1960, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.millisOfSecond();
        org.joda.time.DurationField durationField38 = chronology34.seconds();
        org.joda.time.DurationField durationField39 = chronology34.centuries();
        org.joda.time.DateTimeField dateTimeField40 = chronology34.millisOfSecond();
        org.joda.time.DurationField durationField41 = chronology34.years();
        org.joda.time.Chronology chronology42 = chronology34.withUTC();
        org.joda.time.DurationField durationField43 = chronology42.months();
        boolean boolean44 = durationFieldType31.isSupported(chronology42);
        org.joda.time.DateTime dateTime46 = dateTime28.withFieldAdded(durationFieldType31, 54370010);
        java.lang.String str47 = durationFieldType31.getName();
        boolean boolean48 = localDateTime22.isSupported(durationFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime26", (dateTime2.compareTo(dateTime26) == 0) == dateTime2.equals(dateTime26));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        java.lang.String str8 = dateTimeField6.getAsShortText((-31948L));
        java.util.Locale locale9 = java.util.Locale.KOREA;
        int int10 = dateTimeField6.getMaximumShortTextLength(locale9);
        java.lang.String str13 = nameProvider0.getName(locale9, "halfdays", "2022-02-21T15:06:14.968+00:00:00.052");
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 999, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekyear((-1));
        org.joda.time.DateTime dateTime29 = dateTime25.plus(12L);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours((int) (byte) 0);
        boolean boolean35 = dateTime33.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusWeeks((int) 'a');
        boolean boolean40 = dateTime33.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime41 = dateTime39.toDateTime();
        org.joda.time.DateTime dateTime43 = dateTime39.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property48 = localDateTime45.weekyear();
        boolean boolean49 = dateTime43.equals((java.lang.Object) localDateTime45);
        org.joda.time.DateTime dateTime51 = dateTime43.minusMonths(54616882);
        org.joda.time.DateTime.Property property52 = dateTime51.millisOfSecond();
        boolean boolean53 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale56 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology55, locale56, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField60 = null;
        dateTimeParserBucket59.saveField(dateTimeField60, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale65 = java.util.Locale.ROOT;
        dateTimeParserBucket59.saveField(dateTimeFieldType63, "it", locale65);
        boolean boolean67 = dateTime25.isSupported(dateTimeFieldType63);
        int int68 = dateTimeZone20.getOffset((org.joda.time.ReadableInstant) dateTime25);
        java.util.Locale locale73 = new java.util.Locale("minuteOfHour", "java.io.IOException: 2022-02-21T15:06:22.606+00:00:00.052", "Korean");
        java.lang.String str74 = dateTimeZone20.getShortName(1645456202598L, locale73);
        java.lang.String str77 = nameProvider0.getShortName(locale73, "Property[hourOfDay]", "2022-02-21T15:11:19.476");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime25", (dateTime18.compareTo(dateTime25) == 0) == dateTime18.equals(dateTime25));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property19 = dateTime16.centuryOfEra();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = property19.getAsText(locale20);
        java.lang.String str23 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime13, (-1), locale20);
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str26 = locale25.getLanguage();
        java.lang.String str27 = dateTimeField9.getAsShortText((int) (byte) 10, locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 9999, chronology3, locale25, (java.lang.Integer) 54616882);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(chronology37);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property44 = dateTime41.centuryOfEra();
        java.util.Locale locale45 = java.util.Locale.ITALIAN;
        java.lang.String str46 = locale45.getLanguage();
        java.lang.String str47 = property44.getAsText(locale45);
        java.lang.String str48 = dateTimeField34.getAsText((org.joda.time.ReadablePartial) localDateTime38, (-1), locale45);
        java.lang.String str49 = locale25.getDisplayScript(locale45);
        java.util.Set<java.lang.String> strSet50 = locale45.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withWeekyear((-1));
        org.joda.time.DateTime dateTime56 = dateTime54.plusMonths(10);
        org.joda.time.DateTime.Property property57 = dateTime56.minuteOfDay();
        int int58 = dateTime56.getYearOfEra();
        org.joda.time.DateTime.Property property59 = dateTime56.secondOfDay();
        int int60 = property59.getMaximumValue();
        org.joda.time.DateTime dateTime61 = property59.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime63 = property59.setCopy(647);
        org.joda.time.MutableDateTime mutableDateTime64 = dateTime63.toMutableDateTimeISO();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology67 = localDateTime66.getChronology();
        org.joda.time.LocalDateTime.Property property68 = localDateTime66.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime69 = property68.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean72 = dateTimeZone71.isFixed();
        org.joda.time.DateTime dateTime73 = localDateTime69.toDateTime(dateTimeZone71);
        org.joda.time.DateTime dateTime74 = dateTime63.withZone(dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime75 = dateTime74.toMutableDateTime();
        java.lang.String str76 = mutableDateTime75.toString();
        org.joda.time.ReadWritableDateTime[] readWritableDateTimeArray77 = new org.joda.time.ReadWritableDateTime[] { mutableDateTime75 };
        org.joda.time.ReadWritableDateTime[] readWritableDateTimeArray78 = strSet50.toArray(readWritableDateTimeArray77);
        java.util.stream.Stream<java.lang.String> strStream79 = strSet50.stream();
        java.lang.Object[] objArray80 = strSet50.toArray();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime63 and dateTime74", (dateTime63.compareTo(dateTime74) == 0) == dateTime63.equals(dateTime74));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 999, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekyear((-1));
        org.joda.time.DateTime dateTime15 = dateTime11.plus(12L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusHours((int) (byte) 0);
        boolean boolean21 = dateTime19.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusWeeks((int) 'a');
        boolean boolean26 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime();
        org.joda.time.DateTime dateTime29 = dateTime25.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property34 = localDateTime31.weekyear();
        boolean boolean35 = dateTime29.equals((java.lang.Object) localDateTime31);
        org.joda.time.DateTime dateTime37 = dateTime29.minusMonths(54616882);
        org.joda.time.DateTime.Property property38 = dateTime37.millisOfSecond();
        boolean boolean39 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology41, locale42, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField46 = null;
        dateTimeParserBucket45.saveField(dateTimeField46, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale51 = java.util.Locale.ROOT;
        dateTimeParserBucket45.saveField(dateTimeFieldType49, "it", locale51);
        boolean boolean53 = dateTime11.isSupported(dateTimeFieldType49);
        int int54 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property59 = dateTime56.centuryOfEra();
        org.joda.time.DurationField durationField60 = property59.getRangeDurationField();
        int int61 = property59.getMaximumValue();
        org.joda.time.DateTime dateTime62 = property59.withMaximumValue();
        org.joda.time.DateTime dateTime63 = property59.roundCeilingCopy();
        org.joda.time.DateTime dateTime65 = dateTime63.plusDays(26);
        int int66 = dateTime63.getDayOfYear();
        org.joda.time.DateTime dateTime67 = dateTime63.withEarlierOffsetAtOverlap();
        boolean boolean68 = dateTimeZone6.equals((java.lang.Object) dateTime67);
        long long72 = dateTimeZone6.convertLocalToUTC((long) 54425, false, 1645456184630L);
        int int74 = dateTimeZone6.getStandardOffset((long) 640);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime11", (dateTime4.compareTo(dateTime11) == 0) == dateTime4.equals(dateTime11));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        boolean boolean5 = dateTime3.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime15 = property12.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withWeekyear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekyear((-1));
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(10);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        int int25 = dateTime23.getYearOfEra();
        org.joda.time.DateTime.Property property26 = dateTime23.secondOfDay();
        int int27 = property26.getMaximumValue();
        org.joda.time.DateTime dateTime28 = property26.getDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.plus(12L);
        org.joda.time.DateTime dateTime31 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        boolean boolean32 = dateTimeZone6.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology35, locale36, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField40 = null;
        dateTimeParserBucket39.saveField(dateTimeField40, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.util.Locale locale45 = java.util.Locale.ROOT;
        dateTimeParserBucket39.saveField(dateTimeFieldType43, "it", locale45);
        java.util.Locale locale50 = new java.util.Locale("ISOChronology[UTC]", "it", "10");
        java.lang.String str51 = locale45.getDisplayScript(locale50);
        java.lang.String str52 = dateTimeZone6.getShortName((long) 54658743, locale50);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone54);
        long long57 = dateTimeZone54.previousTransition((long) 54377);
        int int59 = dateTimeZone54.getOffset(0L);
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = dateTime64.plusHours((int) (byte) 0);
        boolean boolean68 = dateTime66.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = dateTime70.minusWeeks((int) 'a');
        boolean boolean73 = dateTime66.isAfter((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime dateTime74 = dateTime72.toDateTime();
        org.joda.time.DateTime dateTime76 = dateTime72.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property81 = localDateTime78.weekyear();
        boolean boolean82 = dateTime76.equals((java.lang.Object) localDateTime78);
        org.joda.time.DateTimeZone dateTimeZone83 = dateTime76.getZone();
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime62, dateTimeZone83);
        boolean boolean85 = dateTime60.isAfter((org.joda.time.ReadableInstant) dateTime62);
        int int86 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime62", (dateTime1.compareTo(dateTime62) == 0) == dateTime1.equals(dateTime62));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology3);
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.Chronology chronology9 = chronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField10 = chronology3.seconds();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology3, locale11, (java.lang.Integer) 25, 2922789);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime21 = property18.addWrapFieldToCopy(28);
        org.joda.time.DateTimeField dateTimeField22 = property18.getField();
        java.lang.String str24 = dateTimeField22.getAsShortText((long) (short) 10);
        dateTimeParserBucket14.saveField(dateTimeField22, (int) '#');
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(chronology34);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property41 = dateTime38.centuryOfEra();
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.lang.String str43 = locale42.getLanguage();
        java.lang.String str44 = property41.getAsText(locale42);
        java.lang.String str45 = dateTimeField31.getAsText((org.joda.time.ReadablePartial) localDateTime35, (-1), locale42);
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        java.lang.String str48 = locale47.getLanguage();
        java.lang.String str49 = dateTimeField31.getAsShortText((int) (byte) 10, locale47);
        long long51 = dateTimeField31.roundHalfFloor((long) 9999);
        dateTimeParserBucket14.saveField(dateTimeField31, 2035);
        java.util.Locale locale57 = new java.util.Locale("-0001-02-22T15:06:45.260+00:00:00.052", "1970-01-01T00:00:00.999+00:00:00.052");
        java.lang.String str58 = dateTimeField31.getAsText(54742, locale57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime38", (dateTime4.compareTo(dateTime38) == 0) == dateTime4.equals(dateTime38));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology3);
        java.lang.String str5 = chronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj0, chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '#');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusMonths((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusDays(212);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusMinutes(212);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.weekyear();
        org.joda.time.LocalDateTime localDateTime21 = property19.addWrapFieldToCopy(576);
        boolean boolean22 = property19.isLeap();
        org.joda.time.LocalDateTime localDateTime23 = property19.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = property27.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.era();
        int int34 = dateTimeField32.getMaximumValue((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property39 = dateTime36.centuryOfEra();
        java.util.Locale locale40 = java.util.Locale.ITALIAN;
        java.lang.String str41 = locale40.getLanguage();
        java.lang.String str42 = property39.getAsText(locale40);
        int int43 = dateTimeField32.getMaximumShortTextLength(locale40);
        java.lang.String str44 = locale40.getScript();
        int int45 = property19.getMaximumShortTextLength(locale40);
        org.joda.time.LocalDateTime localDateTime46 = property19.getLocalDateTime();
        long long48 = chronology3.set((org.joda.time.ReadablePartial) localDateTime46, (long) 54632993);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime36", (dateTime4.compareTo(dateTime36) == 0) == dateTime4.equals(dateTime36));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths(10);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfDay();
        org.joda.time.LocalTime localTime9 = dateTime7.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours((int) (byte) 0);
        boolean boolean15 = dateTime13.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks((int) 'a');
        boolean boolean20 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime19.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime25 = dateTime19.plusMinutes(977);
        long long26 = dateTime19.getMillis();
        org.joda.time.Chronology chronology27 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.millisOfSecond();
        org.joda.time.DurationField durationField29 = chronology27.seconds();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime7.toMutableDateTime(chronology27);
        org.joda.time.DateTime dateTime31 = dateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property32 = dateTime7.monthOfYear();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime39 = property36.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusWeeks(162);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.minus(readableDuration44);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology48 = localDateTime47.getChronology();
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime49.withYearOfCentury((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.era();
        int int53 = dateTime49.get(dateTimeFieldType52);
        int int54 = localDateTime41.get(dateTimeFieldType52);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, (int) (short) 1);
        org.joda.time.DateTime dateTime58 = localDateTime41.toDateTime(dateTimeZone57);
        boolean boolean60 = dateTimeZone57.isStandardOffset((long) 310);
        java.lang.String str62 = dateTimeZone57.getName(1645456424386L);
        org.joda.time.DateTime dateTime63 = dateTime7.withZoneRetainFields(dateTimeZone57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime49", (dateTime1.compareTo(dateTime49) == 0) == dateTime1.equals(dateTime49));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfMinute();
        org.joda.time.DateTime dateTime14 = property12.addToCopy(0L);
        org.joda.time.DateTime dateTime15 = dateTime14.withLaterOffsetAtOverlap();
        int int16 = dateTime15.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.millisOfSecond();
        int int21 = property20.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime22 = property20.roundHalfCeilingCopy();
        int int23 = localDateTime22.size();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int28 = localDateTime25.get(dateTimeFieldType27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.era();
        int int30 = localDateTime25.indexOf(dateTimeFieldType29);
        int int31 = localDateTime22.get(dateTimeFieldType29);
        int int32 = localDateTime22.getEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = localDateTime22.getFieldTypes();
        org.joda.time.LocalDateTime.Property property34 = localDateTime22.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(72000052L, dateTimeZone36);
        long long41 = dateTimeZone36.convertLocalToUTC(0L, true);
        org.joda.time.DateTime dateTime42 = localDateTime22.toDateTime(dateTimeZone36);
        long long45 = dateTimeZone36.convertLocalToUTC(1586790562765L, true);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime47 = dateTime15.withZone(dateTimeZone36);
        org.joda.time.DateTime.Property property48 = dateTime15.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime37", (dateTime3.compareTo(dateTime37) == 0) == dateTime3.equals(dateTime37));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = chronology2.add(readablePeriod6, 70L, 981);
        org.joda.time.DurationField durationField10 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology2.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField12, and durationField10", !(durationField10.compareTo(durationField12) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField12.compareTo(durationField10))));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        java.lang.String str5 = property3.getAsText();
        org.joda.time.LocalDateTime localDateTime6 = property3.roundCeilingCopy();
        int int7 = localDateTime6.getDayOfWeek();
        int int8 = localDateTime6.getYear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusHours(130);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withYear(561);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime23 = dateTime20.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean24 = dateTime23.isEqualNow();
        org.joda.time.DateTime.Property property25 = dateTime23.secondOfMinute();
        org.joda.time.DateTime dateTime26 = dateTime23.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.secondOfMinute();
        org.joda.time.DurationField durationField35 = chronology32.millis();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusSeconds((int) ' ');
        long long41 = chronology32.set((org.joda.time.ReadablePartial) localDateTime39, (long) 99);
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.lang.String str43 = locale42.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 212, chronology32, locale42, (java.lang.Integer) (-1), (-948));
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(72000052L, dateTimeZone48);
        dateTimeParserBucket46.setZone(dateTimeZone48);
        long long53 = dateTimeZone28.getMillisKeepLocal(dateTimeZone48, (long) 212);
        java.util.TimeZone timeZone54 = dateTimeZone48.toTimeZone();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology57 = localDateTime56.getChronology();
        org.joda.time.LocalDateTime.Property property58 = localDateTime56.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime59 = property58.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime61 = property58.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.weekyear();
        boolean boolean65 = dateTimeZone48.isLocalDateTimeGap(localDateTime63);
        java.util.Locale locale67 = null;
        java.lang.String str68 = dateTimeZone48.getName(979L, locale67);
        org.joda.time.DateTime dateTime69 = org.joda.time.DateTime.now(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology72 = localDateTime71.getChronology();
        org.joda.time.LocalDateTime.Property property73 = localDateTime71.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean75 = localDateTime71.isSupported(dateTimeFieldType74);
        java.lang.String str76 = dateTimeFieldType74.getName();
        int int77 = dateTime69.get(dateTimeFieldType74);
        int int78 = dateTime26.get(dateTimeFieldType74);
        boolean boolean79 = localDateTime12.isSupported(dateTimeFieldType74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime49", (dateTime16.compareTo(dateTime49) == 0) == dateTime16.equals(dateTime49));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        int int6 = dateTime5.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology10);
        java.lang.String str12 = chronology10.toString();
        org.joda.time.DurationField durationField13 = chronology10.hours();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = dateTimeField14.getLeapDurationField();
        long long18 = dateTimeField14.add(1645456023970L, (long) 1995);
        long long20 = dateTimeField14.roundHalfEven(1586790423701L);
        boolean boolean21 = dateTime5.equals((java.lang.Object) 1586790423701L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology1, locale2, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology7, locale8, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket11.saveField(dateTimeField12, (int) (short) 0);
        java.lang.Integer int15 = dateTimeParserBucket11.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket11.setZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekyear((-1));
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (byte) 100);
        boolean boolean25 = dateTime23.isBefore((long) ' ');
        int int26 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime23);
        dateTimeParserBucket5.setZone(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean33 = localDateTime29.isSupported(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusHours((int) (byte) 0);
        boolean boolean39 = dateTime37.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusWeeks((int) 'a');
        boolean boolean44 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime45 = dateTime43.toDateTime();
        org.joda.time.Chronology chronology46 = dateTime45.getChronology();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        long long50 = chronology46.add(readablePeriod47, (long) 536, 784);
        org.joda.time.DurationField durationField51 = chronology46.weeks();
        org.joda.time.DateTimeField dateTimeField52 = chronology46.hourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = chronology46.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType32.getField(chronology46);
        dateTimeParserBucket5.saveField(dateTimeField54, 776);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property61 = localDateTime58.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime58.withWeekyear(2022);
        int int64 = localDateTime58.getDayOfWeek();
        int int65 = localDateTime58.size();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology68 = localDateTime67.getChronology();
        org.joda.time.LocalDateTime.Property property69 = localDateTime67.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime70 = property69.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.era();
        boolean boolean72 = localDateTime70.isSupported(dateTimeFieldType71);
        java.lang.String str73 = dateTimeFieldType71.toString();
        int int74 = localDateTime58.get(dateTimeFieldType71);
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology77 = localDateTime76.getChronology();
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(chronology77);
        java.lang.String str79 = chronology77.toString();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone82 = dateTimeZone81.toTimeZone();
        org.joda.time.Chronology chronology83 = chronology77.withZone(dateTimeZone81);
        org.joda.time.DateTimeField dateTimeField84 = chronology77.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField85 = chronology77.secondOfMinute();
        java.lang.String str86 = chronology77.toString();
        boolean boolean87 = dateTimeFieldType71.isSupported(chronology77);
        dateTimeParserBucket5.saveField(dateTimeFieldType71, 2017);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime78", (dateTime19.compareTo(dateTime78) == 0) == dateTime19.equals(dateTime78));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMonths((int) '#');
        org.joda.time.DateTime dateTime11 = dateTime7.withMillisOfDay(86399);
        org.joda.time.DateTime.Property property12 = dateTime7.millisOfSecond();
        org.joda.time.DateTime dateTime14 = dateTime7.minusDays(233);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.yearOfCentury();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.Chronology chronology22 = chronology17.withUTC();
        org.joda.time.DateTime dateTime23 = dateTime14.toDateTime(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime21", (dateTime1.compareTo(dateTime21) == 0) == dateTime1.equals(dateTime21));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        java.util.Date date7 = localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusSeconds(4);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withFieldAdded(durationFieldType10, 213);
        java.lang.String str13 = localDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours((int) (byte) 0);
        boolean boolean19 = dateTime17.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime17.toMutableDateTime(dateTimeZone20);
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str25 = dateTimeZone20.getShortName((long) (short) 100, locale24);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.weekyearOfCentury();
        org.joda.time.DurationField durationField32 = durationFieldType26.getField(chronology29);
        org.joda.time.DateTimeField dateTimeField33 = chronology29.monthOfYear();
        org.joda.time.DurationField durationField34 = chronology29.millis();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology29.getZone();
        long long37 = dateTimeZone20.getMillisKeepLocal(dateTimeZone35, 79594438000L);
        org.joda.time.DateTime dateTime38 = localDateTime12.toDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime30", (dateTime15.compareTo(dateTime30) == 0) == dateTime15.equals(dateTime30));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(2922789);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfSecond(784);
        org.joda.time.DateTime.Property property10 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime(readableInstant13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime25 = dateTime22.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean26 = dateTime25.isEqualNow();
        org.joda.time.LocalDateTime localDateTime27 = dateTime25.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.minus(readablePeriod28);
        org.joda.time.DateTime dateTime31 = dateTime25.minusMillis((-948));
        int int32 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime31);
        int int33 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime18", (dateTime1.compareTo(dateTime18) == 0) == dateTime1.equals(dateTime18));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime15 = dateTime12.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean16 = dateTime15.isEqualNow();
        org.joda.time.DateTime.Property property17 = dateTime15.secondOfMinute();
        org.joda.time.DateTime dateTime19 = property17.addToCopy(0L);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes(100);
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology23, locale24, (java.lang.Integer) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField28 = null;
        dateTimeParserBucket27.saveField(dateTimeField28, (int) (short) 0);
        java.lang.Integer int31 = dateTimeParserBucket27.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        dateTimeParserBucket27.setZone(dateTimeZone32);
        int int35 = dateTimeZone32.getStandardOffset((long) 1969);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long39 = dateTimeZone32.getMillisKeepLocal(dateTimeZone37, (long) 99);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime41 = dateTime21.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTime dateTime42 = dateTime1.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTime dateTime45 = dateTime1.withDurationAdded((long) 174, 142);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime1", (dateTime8.compareTo(dateTime1) == 0) == dateTime8.equals(dateTime1));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.withMillisOfDay(0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.weekyearOfCentury();
        org.joda.time.DateTime dateTime11 = dateTime1.toDateTime(chronology8);
        java.lang.String str12 = dateTime1.toString();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime1.plus(readablePeriod13);
        org.joda.time.DateTime dateTime16 = dateTime1.withYearOfEra(1973);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime1", (dateTime9.compareTo(dateTime1) == 0) == dateTime9.equals(dateTime1));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekyear((-1));
        org.joda.time.DateMidnight dateMidnight6 = dateTime3.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = dateMidnight6.toMutableDateTime();
        int int9 = dateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours((int) (byte) 0);
        java.util.Date date14 = dateTime11.toDate();
        org.joda.time.DateTime.Property property15 = dateTime11.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear((-1));
        org.joda.time.DateTime dateTime21 = dateTime17.plusHours((int) (byte) 100);
        int int22 = dateTime17.getDayOfYear();
        int int23 = property15.getDifference((org.joda.time.ReadableInstant) dateTime17);
        boolean boolean24 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime17);
        boolean boolean26 = dateTime1.isEqual((long) 239);
        int int27 = dateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(chronology30);
        org.joda.time.DateTime dateTime33 = dateTime31.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime35 = dateTime33.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime38 = dateTime35.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean39 = dateTime38.isEqualNow();
        org.joda.time.DateTime.Property property40 = dateTime38.secondOfMinute();
        org.joda.time.DateTime dateTime42 = property40.addToCopy(0L);
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        java.lang.Object obj44 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology47 = localDateTime46.getChronology();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(chronology47);
        java.lang.String str49 = chronology47.toString();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.weekOfWeekyear();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(obj44, chronology47);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime42.toMutableDateTime(chronology47);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.plusHours((int) (byte) 0);
        java.util.Date date57 = dateTime54.toDate();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant59 = null;
        int int60 = dateTimeZone58.getOffset(readableInstant59);
        int int62 = dateTimeZone58.getStandardOffset((long) 15);
        org.joda.time.DateTime dateTime63 = dateTime54.withZone(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime63.getZone();
        org.joda.time.DateTime dateTime65 = dateTime42.toDateTime(dateTimeZone64);
        int int66 = dateTime65.getMillisOfDay();
        int int67 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime31", (dateTime3.compareTo(dateTime31) == 0) == dateTime3.equals(dateTime31));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((-1));
        org.joda.time.DateTime dateTime5 = dateTime1.withMillisOfDay(0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.weekyearOfCentury();
        org.joda.time.DateTime dateTime11 = dateTime1.toDateTime(chronology8);
        org.joda.time.DateTime dateTime13 = dateTime1.plusMillis(54381);
        org.joda.time.DateTime dateTime15 = dateTime1.withDayOfMonth(25);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime21 = dateTime17.plusSeconds(26);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfEra();
        org.joda.time.DateTime dateTime23 = property22.roundCeilingCopy();
        org.joda.time.DateTime dateTime24 = property22.getDateTime();
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays(8);
        boolean boolean27 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime26);
        java.lang.String str28 = dateTime1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime17", (dateTime9.compareTo(dateTime17) == 0) == dateTime9.equals(dateTime17));
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours((int) (byte) 0);
        java.util.Date date4 = dateTime1.toDate();
        org.joda.time.DateTime dateTime6 = dateTime1.minusYears(121);
        org.joda.time.DateTime dateTime7 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime7.plusHours(749);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours((int) (byte) 0);
        boolean boolean15 = dateTime13.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks((int) 'a');
        boolean boolean20 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime19.minusMillis((int) (byte) 10);
        boolean boolean25 = dateTime23.isAfter(7279200000L);
        org.joda.time.DateTime dateTime27 = dateTime23.minusMonths(887);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfDay(577);
        org.joda.time.DateTime dateTime31 = dateTime27.minusMinutes(52596048);
        int int32 = dateTime27.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone33.getOffset(readableInstant34);
        java.lang.String str37 = dateTimeZone33.getName(0L);
        java.lang.String str38 = dateTimeZone33.toString();
        int int40 = dateTimeZone33.getStandardOffset(36000766L);
        long long42 = dateTimeZone33.nextTransition(31657L);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime27.toMutableDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime44 = dateTime9.withZone(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology47 = localDateTime46.getChronology();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(chronology47);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime51 = property50.withMinimumValue();
        boolean boolean52 = dateTimeZone33.isLocalDateTimeGap(localDateTime51);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        org.joda.time.LocalDateTime.Property property56 = localDateTime54.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime57 = property56.roundHalfEvenCopy();
        java.lang.String str58 = property56.getAsText();
        org.joda.time.LocalDateTime localDateTime59 = property56.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone61 = dateTimeZone60.toTimeZone();
        java.lang.String str62 = dateTimeZone60.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone60);
        int int65 = dateTimeZone60.getOffset(0L);
        org.joda.time.DateTime dateTime66 = localDateTime59.toDateTime(dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone68);
        java.lang.String str70 = dateTimeZone68.toString();
        long long72 = dateTimeZone60.getMillisKeepLocal(dateTimeZone68, 1645455977932L);
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime localDateTime74 = org.joda.time.LocalDateTime.now(dateTimeZone68);
        java.util.Locale locale76 = java.util.Locale.SIMPLIFIED_CHINESE;
        boolean boolean77 = locale76.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime79 = org.joda.time.DateTime.now(dateTimeZone78);
        org.joda.time.DateTime dateTime81 = dateTime79.minusWeeks((int) 'a');
        org.joda.time.DateTime.Property property82 = dateTime79.centuryOfEra();
        java.util.Locale locale83 = java.util.Locale.ITALIAN;
        java.lang.String str84 = locale83.getLanguage();
        java.lang.String str85 = property82.getAsText(locale83);
        java.lang.String str86 = locale76.getDisplayLanguage(locale83);
        java.lang.String str87 = locale83.getISO3Language();
        java.lang.String str88 = dateTimeZone68.getShortName((long) (-60590228), locale83);
        org.joda.time.DateTime dateTime89 = localDateTime51.toDateTime(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime48", (dateTime1.compareTo(dateTime48) == 0) == dateTime1.equals(dateTime48));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(chronology4);
        java.lang.String str6 = chronology4.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.Chronology chronology10 = chronology4.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField11 = chronology4.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology4.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(35999999L, chronology4);
        boolean boolean14 = durationFieldType0.isSupported(chronology4);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = durationFieldType0.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfEvenCopy();
        int int26 = localDateTime25.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.secondOfMinute();
        org.joda.time.DurationField durationField32 = dateTimeField31.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 0);
        int[] intArray39 = localDateTime38.getValues();
        int int40 = dateTimeField31.getMaximumValue((org.joda.time.ReadablePartial) localDateTime34, intArray39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime34.minusSeconds((int) 'u');
        org.joda.time.LocalDateTime localDateTime43 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now(chronology46);
        org.joda.time.DateTimeField dateTimeField48 = chronology46.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.millisOfSecond();
        org.joda.time.DurationField durationField50 = chronology46.seconds();
        org.joda.time.DurationField durationField51 = chronology46.centuries();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        long long55 = chronology46.add(readablePeriod52, (long) 'x', (int) '4');
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology58 = localDateTime57.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int60 = localDateTime57.get(dateTimeFieldType59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.withMillisOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plus(readablePeriod63);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology67 = localDateTime66.getChronology();
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now(chronology67);
        org.joda.time.DateTimeField dateTimeField69 = chronology67.secondOfMinute();
        org.joda.time.DurationField durationField70 = dateTimeField69.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((long) 0);
        int[] intArray77 = localDateTime76.getValues();
        int int78 = dateTimeField69.getMaximumValue((org.joda.time.ReadablePartial) localDateTime72, intArray77);
        chronology46.validate((org.joda.time.ReadablePartial) localDateTime62, intArray77);
        chronology17.validate((org.joda.time.ReadablePartial) localDateTime34, intArray77);
        org.joda.time.DateTimeZone dateTimeZone81 = chronology17.getZone();
        org.joda.time.DurationField durationField82 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField82, durationField19, and durationField50", !(durationField82.compareTo(durationField19) == 0) || (Math.signum(durationField82.compareTo(durationField50)) == Math.signum(durationField19.compareTo(durationField50))));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 2022, (int) (short) 100);
        boolean boolean11 = dateTime10.isEqualNow();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfMinute();
        org.joda.time.DateTime dateTime14 = property12.addToCopy(0L);
        org.joda.time.DateTime dateTime15 = dateTime14.withLaterOffsetAtOverlap();
        int int16 = dateTime14.getMonthOfYear();
        int int17 = dateTime14.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekyear((-1));
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(10);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        int int25 = dateTime23.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = dateTime23.withZone(dateTimeZone27);
        org.joda.time.DateTime.Property property30 = dateTime23.yearOfEra();
        org.joda.time.DateTime.Property property31 = dateTime23.year();
        org.joda.time.DateTime dateTime32 = property31.withMaximumValue();
        org.joda.time.DateTime dateTime33 = property31.roundHalfCeilingCopy();
        boolean boolean34 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime19", (dateTime3.compareTo(dateTime19) == 0) == dateTime3.equals(dateTime19));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(28);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMinutes(20);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks(15);
        boolean boolean17 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField24 = durationFieldType18.getField(chronology21);
        java.lang.String str25 = durationFieldType18.getName();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime14.withFieldAdded(durationFieldType18, (int) (byte) -1);
        java.lang.String str28 = durationFieldType18.toString();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.secondOfMinute();
        org.joda.time.DurationField durationField34 = chronology31.millis();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusSeconds((int) ' ');
        long long40 = chronology31.set((org.joda.time.ReadablePartial) localDateTime38, (long) 99);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.LocalDateTime.Property property44 = localDateTime42.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = property44.withMaximumValue();
        java.lang.String str46 = property44.toString();
        org.joda.time.LocalDateTime localDateTime47 = property44.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.millisOfSecond();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.weekyear();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.plusHours((int) (byte) 0);
        java.util.Date date58 = dateTime55.toDate();
        org.joda.time.DateTime.Property property59 = dateTime55.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property59.getFieldType();
        boolean boolean61 = localDateTime53.isSupported(dateTimeFieldType60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.LocalDateTime localDateTime63 = localDateTime53.plus(readablePeriod62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.plusYears(0);
        boolean boolean66 = localDateTime47.isEqual((org.joda.time.ReadablePartial) localDateTime65);
        java.util.Date date67 = localDateTime47.toDate();
        long long69 = chronology31.set((org.joda.time.ReadablePartial) localDateTime47, 0L);
        org.joda.time.DurationField durationField70 = durationFieldType18.getField(chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime55", (dateTime22.compareTo(dateTime55) == 0) == dateTime22.equals(dateTime55));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        boolean boolean12 = dateTimeFieldType5.isSupported(chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.clockhourOfDay();
        boolean boolean15 = dateTimeField13.isLeap(7279200000L);
        org.joda.time.DurationField durationField16 = dateTimeField13.getRangeDurationField();
        long long19 = dateTimeField13.add(1L, (long) 100);
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        boolean boolean22 = locale21.hasExtensions();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.clockhourOfDay();
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale29.getVariant();
        java.lang.String str31 = dateTimeField27.getAsText((-1), locale29);
        java.lang.String str32 = locale21.getDisplayScript(locale29);
        java.lang.String str33 = dateTimeField13.getAsShortText(54596, locale29);
        java.lang.String str34 = dateTimeField13.getName();
        long long36 = dateTimeField13.roundHalfEven(780L);
        long long38 = dateTimeField13.roundHalfCeiling((long) 209);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.Chronology chronology41 = localDateTime40.getChronology();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = property42.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withYearOfEra((int) 'x');
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.plusHours((int) (byte) 0);
        boolean boolean52 = dateTime50.isEqual((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.minusWeeks((int) 'a');
        boolean boolean57 = dateTime50.isAfter((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = dateTime56.toDateTime();
        org.joda.time.DateTime dateTime60 = dateTime56.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 0);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property65 = localDateTime62.weekyear();
        boolean boolean66 = dateTime60.equals((java.lang.Object) localDateTime62);
        int[] intArray68 = chronology46.get((org.joda.time.ReadablePartial) localDateTime62, (long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime62.withMillisOfDay(25);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minusSeconds(68782378);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) 0);
        int[] intArray75 = localDateTime74.getValues();
        boolean boolean76 = localDateTime72.isEqual((org.joda.time.ReadablePartial) localDateTime74);
        int int77 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDateTime74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime48", (dateTime26.compareTo(dateTime48) == 0) == dateTime26.equals(dateTime48));
    }
}

