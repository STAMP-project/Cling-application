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
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) 10, chronology24);
        org.joda.time.DateTime dateTime28 = dateTime26.minusHours(7);
        org.joda.time.DateTime dateTime30 = dateTime28.plusYears((int) (byte) 0);
        int int31 = dateTime30.getMonthOfYear();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology35);
        mutablePeriod36.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod36.add(0L);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        int int49 = dateMidnight48.getYearOfEra();
        org.joda.time.Chronology chronology50 = dateMidnight48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology50);
        mutablePeriod36.add(0L, chronology50);
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (-1), chronology50);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(chronology57);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.minusDays((int) (short) -1);
        int int61 = dateMidnight60.getYearOfEra();
        org.joda.time.Chronology chronology62 = dateMidnight60.getChronology();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology62);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (short) 10, chronology62);
        org.joda.time.MutableDateTime mutableDateTime65 = dateMidnight53.toMutableDateTime(chronology62);
        mutableDateTime65.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime65.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime65.toMutableDateTime(dateTimeZone69);
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray72 = yearMonthDay71.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = yearMonthDay71.toDateTimeAtCurrentTime(dateTimeZone73);
        org.joda.time.Duration duration75 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime65, (org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.PeriodType periodType78 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType79 = periodType78.withWeeksRemoved();
        org.joda.time.Period period80 = new org.joda.time.Period((long) 1970, (long) 3, periodType78);
        org.joda.time.Period period81 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableDuration) duration75, periodType78);
        boolean boolean82 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime74", (dateTime14.compareTo(dateTime74) == 0) == dateTime14.equals(dateTime74));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours(10L);
        long long6 = duration5.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusDays((int) (short) -1);
        int int15 = dateMidnight14.getYearOfEra();
        org.joda.time.Chronology chronology16 = dateMidnight14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) 10, chronology16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime18.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime25 = dateTime18.minusMonths(5);
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime23", (dateTime18.compareTo(mutableDateTime23) == 0) == dateTime18.equals(mutableDateTime23));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime15", (dateTime10.compareTo(mutableDateTime15) == 0) == dateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 10, chronology6);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay7, (org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean15 = timeOfDay11.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.clockhourOfDay();
        boolean boolean26 = dateTimeFieldType14.isSupported(chronology23);
        boolean boolean27 = localTime4.isSupported(dateTimeFieldType14);
        org.joda.time.LocalTime localTime29 = localTime4.plusHours(11);
        org.joda.time.LocalTime localTime31 = localTime4.withMillisOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = localTime31.toDateTimeToday(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight19 and dateTime33", (dateMidnight19.compareTo(dateTime33) == 0) == dateMidnight19.equals(dateTime33));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.halfdayOfDay();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) '#');
        int int16 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) '4');
        boolean boolean19 = localDate1.isBefore((org.joda.time.ReadablePartial) localDate18);
        int int20 = localDate1.getCenturyOfEra();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.withZoneRetainFields(dateTimeZone25);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.minusDays((int) (short) -1);
        int int34 = dateMidnight33.getYearOfEra();
        org.joda.time.Chronology chronology35 = dateMidnight33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (short) 10, chronology35);
        org.joda.time.DateTime dateTime39 = dateTime37.plusSeconds(14);
        boolean boolean40 = dateMidnight26.isBefore((org.joda.time.ReadableInstant) dateTime39);
        boolean boolean41 = localDate1.equals((java.lang.Object) dateTime39);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology44);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((java.lang.Object) chronology44);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay((long) 10, chronology48);
        org.joda.time.DateTimeField[] dateTimeFieldArray50 = timeOfDay49.getFields();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay((long) 10, chronology52);
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = timeOfDay53.getFields();
        org.joda.time.Period period55 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay49, (org.joda.time.ReadablePartial) timeOfDay53);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean57 = timeOfDay53.isSupported(dateTimeFieldType56);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusDays((int) (short) -1);
        int int64 = dateMidnight63.getYearOfEra();
        org.joda.time.Chronology chronology65 = dateMidnight63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.clockhourOfDay();
        boolean boolean68 = dateTimeFieldType56.isSupported(chronology65);
        boolean boolean69 = localTime46.isSupported(dateTimeFieldType56);
        org.joda.time.LocalTime localTime71 = localTime46.plusHours(11);
        org.joda.time.LocalTime localTime73 = localTime46.withMillisOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime75 = localTime73.toDateTimeToday(dateTimeZone74);
        org.joda.time.Interval interval76 = localDate1.toInterval(dateTimeZone74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight6 and dateTime75", (dateMidnight6.compareTo(dateTime75) == 0) == dateMidnight6.equals(dateTime75));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        org.joda.time.DateTime dateTime49 = interval48.getEnd();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withYear(9);
        org.joda.time.DateTime dateTime4 = yearMonthDay3.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays((int) (short) -1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        int int14 = dateMidnight13.getYearOfEra();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 10, chronology15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime17.toMutableDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime24 = dateTime17.minusMonths(5);
        boolean boolean25 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime22", (dateTime17.compareTo(mutableDateTime22) == 0) == dateTime17.equals(mutableDateTime22));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology3);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) chronology3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((long) 10, chronology7);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = timeOfDay8.getFields();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((long) 10, chronology11);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = timeOfDay12.getFields();
        org.joda.time.Period period14 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay8, (org.joda.time.ReadablePartial) timeOfDay12);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean16 = timeOfDay12.isSupported(dateTimeFieldType15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.clockhourOfDay();
        boolean boolean27 = dateTimeFieldType15.isSupported(chronology24);
        boolean boolean28 = localTime5.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime localTime30 = localTime5.plusHours(11);
        org.joda.time.LocalTime localTime32 = localTime5.withMillisOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime34 = localTime32.toDateTimeToday(dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(52L, dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight20 and dateTime34", (dateMidnight20.compareTo(dateTime34) == 0) == dateMidnight20.equals(dateTime34));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime dateTime17 = dateTime12.plusMinutes(1);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime19.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant18", (dateTime19.compareTo(instant18) == 0) == dateTime19.equals(instant18));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(7);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property64 = dateTime61.centuryOfEra();
        int int65 = dateTime61.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime61.getZone();
        org.joda.time.Interval interval67 = interval48.withStart((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableDuration69, readableInstant70);
        org.joda.time.PeriodType periodType72 = period71.getPeriodType();
        org.joda.time.Period period73 = new org.joda.time.Period(1645488000L, periodType72);
        org.joda.time.Interval interval74 = interval67.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) '#');
        int int13 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology16);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) chronology16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((long) 10, chronology20);
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = timeOfDay21.getFields();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((long) 10, chronology24);
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = timeOfDay25.getFields();
        org.joda.time.Period period27 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay21, (org.joda.time.ReadablePartial) timeOfDay25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean29 = timeOfDay25.isSupported(dateTimeFieldType28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.clockhourOfDay();
        boolean boolean40 = dateTimeFieldType28.isSupported(chronology37);
        boolean boolean41 = localTime18.isSupported(dateTimeFieldType28);
        org.joda.time.LocalTime localTime43 = localTime18.plusHours(11);
        org.joda.time.LocalTime localTime45 = localTime18.withMillisOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime47 = localTime45.toDateTimeToday(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = localDate12.toDateTimeAtMidnight(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and dateTime47", (dateMidnight3.compareTo(dateTime47) == 0) == dateMidnight3.equals(dateTime47));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime dateTime17 = dateTime12.plusMinutes(1);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTimeISO();
        org.joda.time.DateTime dateTime21 = dateTime17.withWeekyear(20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime17", (instant18.compareTo(dateTime17) == 0) == instant18.equals(dateTime17));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(7);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property64 = dateTime61.centuryOfEra();
        int int65 = dateTime61.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime61.getZone();
        org.joda.time.Interval interval67 = interval48.withStart((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = dateTime61.withChronology(chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        long long1 = instant0.getMillis();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTime();
        org.joda.time.Instant instant5 = instant0.withMillis((long) (-23641));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime3", (instant0.compareTo(mutableDateTime3) == 0) == instant0.equals(mutableDateTime3));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        long long1 = instant0.getMillis();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.Instant instant10 = instant0.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 10, chronology19);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (short) 100, chronology30);
        org.joda.time.DateTime dateTime34 = dateTime21.withChronology(chronology30);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.minusDays((int) (short) -1);
        long long41 = dateMidnight38.getMillis();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.days();
        org.joda.time.Period period43 = duration36.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight38, periodType42);
        org.joda.time.MutableDateTime mutableDateTime44 = dateMidnight38.toMutableDateTimeISO();
        int int45 = mutableDateTime44.getDayOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.minusDays((int) (short) -1);
        int int52 = dateMidnight51.getYearOfEra();
        org.joda.time.Chronology chronology53 = dateMidnight51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology53);
        mutableDateTime44.setChronology(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime21.withChronology(chronology53);
        org.joda.time.DateTime dateTime59 = dateTime56.withDurationAdded(0L, 1);
        int int60 = instant10.compareTo((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        long long2 = duration1.getStandardSeconds();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod7.add(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutablePeriod7.add(0L, chronology21);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (-1), chronology21);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight24.toMutableDateTime(chronology33);
        mutableDateTime36.setYear(2022);
        mutableDateTime36.setYear((-1));
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.dayOfYear();
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        long long48 = dateMidnight45.getMillis();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.days();
        org.joda.time.Period period50 = duration43.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight45, periodType49);
        org.joda.time.MutableDateTime mutableDateTime51 = dateMidnight45.toMutableDateTimeISO();
        int int52 = mutableDateTime51.getDayOfYear();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        int int59 = dateMidnight58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateMidnight58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology60);
        mutableDateTime51.setChronology(chronology60);
        mutableDateTime36.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime36.era();
        org.joda.time.DateTimeZone dateTimeZone65 = mutableDateTime36.getZone();
        org.joda.time.Instant instant66 = mutableDateTime36.toInstant();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight(chronology67);
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight68.minusDays((int) (short) -1);
        org.joda.time.Duration duration72 = org.joda.time.Duration.standardHours(10L);
        long long73 = duration72.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight70, (org.joda.time.ReadableDuration) duration72);
        org.joda.time.Period period75 = duration72.toPeriod();
        org.joda.time.Duration duration77 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration81 = duration77.withDurationAdded((org.joda.time.ReadableDuration) duration79, 12);
        org.joda.time.Duration duration82 = duration79.toDuration();
        boolean boolean83 = duration72.isEqual((org.joda.time.ReadableDuration) duration82);
        org.joda.time.Duration duration84 = duration72.toDuration();
        org.joda.time.Instant instant85 = instant66.minus((org.joda.time.ReadableDuration) duration84);
        org.joda.time.Period period86 = duration1.toPeriodTo((org.joda.time.ReadableInstant) instant85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime36 and instant66", (mutableDateTime36.compareTo(instant66) == 0) == mutableDateTime36.equals(instant66));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime dateTime17 = dateTime12.plusMinutes(1);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTimeISO();
        org.joda.time.Period period21 = org.joda.time.Period.hours(3);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology30);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusDays((int) (short) -1);
        int int40 = dateMidnight39.getYearOfEra();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.millisOfDay();
        org.joda.time.DateTime dateTime44 = dateTime33.withChronology(chronology41);
        org.joda.time.Period period45 = new org.joda.time.Period((long) 22, chronology41);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.days();
        org.joda.time.Period period48 = new org.joda.time.Period(1645488000000L, periodType47);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.seconds();
        boolean boolean50 = periodType47.isSupported(durationFieldType49);
        org.joda.time.Period period52 = period45.withFieldAdded(durationFieldType49, (-292275054));
        boolean boolean53 = period21.isSupported(durationFieldType49);
        org.joda.time.DateTime dateTime54 = dateTime19.minus((org.joda.time.ReadablePeriod) period21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant18", (dateTime19.compareTo(instant18) == 0) == dateTime19.equals(instant18));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        long long1 = instant0.getMillis();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTime();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration9 = duration5.withDurationAdded((org.joda.time.ReadableDuration) duration7, 12);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration15 = duration11.withDurationAdded((org.joda.time.ReadableDuration) duration13, 12);
        boolean boolean16 = duration9.isEqual((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Seconds seconds17 = duration9.toStandardSeconds();
        org.joda.time.Instant instant18 = instant0.minus((org.joda.time.ReadableDuration) duration9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime3", (instant0.compareTo(mutableDateTime3) == 0) == instant0.equals(mutableDateTime3));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        int int18 = timeZone14.getOffset(70L);
        int int20 = timeZone14.getOffset(1648166400036L);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        long long28 = dateMidnight25.getMillis();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.days();
        org.joda.time.Period period30 = duration23.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight25, periodType29);
        org.joda.time.MutableDateTime mutableDateTime31 = dateMidnight25.toMutableDateTimeISO();
        int int32 = mutableDateTime31.getDayOfYear();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        mutableDateTime31.setChronology(chronology40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(chronology43);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.withZoneRetainFields(dateTimeZone47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusDays((int) (short) -1);
        int int53 = dateMidnight52.getYearOfEra();
        org.joda.time.Chronology chronology54 = dateMidnight52.getChronology();
        long long55 = dateMidnight52.getMillis();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableDuration56, readableInstant57);
        org.joda.time.PeriodType periodType59 = period58.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight48, (org.joda.time.ReadableInstant) dateMidnight52, periodType59);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight52.withWeekyear(59);
        java.util.Locale locale65 = new java.util.Locale("PeriodType[Standard]", "");
        java.util.Calendar calendar66 = dateMidnight52.toCalendar(locale65);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) 122, chronology40, locale65, (java.lang.Integer) 6);
        java.lang.String str69 = timeZone14.getDisplayName(locale65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar66", (calendar11.compareTo(calendar66) == 0) == calendar11.equals(calendar66));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        long long1 = instant0.getMillis();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTime();
        org.joda.time.Instant instant6 = instant0.withDurationAdded((long) 292269054, 32769);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime3", (instant0.compareTo(mutableDateTime3) == 0) == instant0.equals(mutableDateTime3));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime dateTime17 = dateTime12.plusMinutes(1);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTimeISO();
        int int20 = dateTime19.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant18", (dateTime19.compareTo(instant18) == 0) == dateTime19.equals(instant18));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology4);
        mutablePeriod5.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod5.add(0L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        mutablePeriod5.add(0L, chronology19);
        boolean boolean22 = dateTimeFieldType1.isSupported(chronology19);
        org.joda.time.DurationField durationField23 = chronology19.hours();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay((-1L), chronology19);
        org.joda.time.DurationField durationField25 = chronology19.seconds();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology19.getZone();
        org.joda.time.DurationField durationField27 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField23, and durationField25", !(durationField27.compareTo(durationField23) == 0) || (Math.signum(durationField27.compareTo(durationField25)) == Math.signum(durationField23.compareTo(durationField25))));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime33.era();
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime33.getZone();
        org.joda.time.Instant instant63 = mutableDateTime33.toInstant();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        org.joda.time.Duration duration69 = org.joda.time.Duration.standardHours(10L);
        long long70 = duration69.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight67, (org.joda.time.ReadableDuration) duration69);
        org.joda.time.Period period72 = duration69.toPeriod();
        org.joda.time.Duration duration74 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration76 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration78 = duration74.withDurationAdded((org.joda.time.ReadableDuration) duration76, 12);
        org.joda.time.Duration duration79 = duration76.toDuration();
        boolean boolean80 = duration69.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Duration duration81 = duration69.toDuration();
        org.joda.time.Instant instant82 = instant63.minus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Instant instant85 = instant82.withDurationAdded((long) 54152181, (int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant63", (mutableDateTime33.compareTo(instant63) == 0) == mutableDateTime33.equals(instant63));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime33.era();
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime33.getZone();
        org.joda.time.Instant instant63 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime33.era();
        org.joda.time.DurationField durationField65 = property64.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant63", (mutableDateTime33.compareTo(instant63) == 0) == mutableDateTime33.equals(instant63));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.Instant instant10 = instant6.withDurationAdded(99L, 2000);
        org.joda.time.DateTime dateTime11 = instant10.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        java.lang.String str49 = duration46.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardHours(10L);
        long long9 = duration8.getStandardSeconds();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration13 = duration8.plus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Duration duration15 = duration12.withMillis((long) 19);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant17 = dateMidnight3.toInstant();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.clockhourOfDay();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTime dateTime30 = dateTime28.minusSeconds(4);
        org.joda.time.LocalTime localTime31 = dateTime30.toLocalTime();
        org.joda.time.LocalTime.Property property32 = localTime31.millisOfSecond();
        org.joda.time.LocalTime localTime34 = property32.addCopy(10);
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight3.toMutableDateTime(chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and dateMidnight23", (instant17.compareTo(dateMidnight23) == 0) == instant17.equals(dateMidnight23));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime33.era();
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime33.getZone();
        org.joda.time.Instant instant63 = mutableDateTime33.toInstant();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        org.joda.time.Duration duration69 = org.joda.time.Duration.standardHours(10L);
        long long70 = duration69.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight67, (org.joda.time.ReadableDuration) duration69);
        org.joda.time.Period period72 = duration69.toPeriod();
        org.joda.time.Duration duration74 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration76 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration78 = duration74.withDurationAdded((org.joda.time.ReadableDuration) duration76, 12);
        org.joda.time.Duration duration79 = duration76.toDuration();
        boolean boolean80 = duration69.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Duration duration81 = duration69.toDuration();
        org.joda.time.Instant instant82 = instant63.minus((org.joda.time.ReadableDuration) duration81);
        boolean boolean84 = instant82.isAfter(52L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant63", (mutableDateTime33.compareTo(instant63) == 0) == mutableDateTime33.equals(instant63));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        long long24 = dateMidnight21.getMillis();
        java.util.Locale locale28 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar29 = dateMidnight21.toCalendar(locale28);
        int int31 = calendar29.getLeastMaximum(3);
        java.util.TimeZone timeZone32 = calendar29.getTimeZone();
        timeZone32.setID("PT0S");
        java.lang.String str35 = timeZone32.getID();
        boolean boolean36 = timeZone14.hasSameRules(timeZone32);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.minusDays((int) (short) -1);
        int int41 = dateMidnight40.getYearOfEra();
        org.joda.time.Chronology chronology42 = dateMidnight40.getChronology();
        long long43 = dateMidnight40.getMillis();
        java.util.Locale locale47 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar48 = dateMidnight40.toCalendar(locale47);
        int int50 = calendar48.getLeastMaximum(3);
        java.util.TimeZone timeZone51 = calendar48.getTimeZone();
        timeZone51.setID("PT0S");
        java.lang.String str54 = timeZone51.getID();
        timeZone51.setRawOffset((-3));
        boolean boolean57 = timeZone14.hasSameRules(timeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar48", (calendar11.compareTo(calendar48) == 0) == calendar11.equals(calendar48));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withWeekyear(366);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant6", (dateMidnight5.compareTo(instant6) == 0) == dateMidnight5.equals(instant6));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight3.toMutableDateTimeISO();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.withZoneRetainFields(dateTimeZone14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        long long22 = dateMidnight19.getMillis();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableDuration23, readableInstant24);
        org.joda.time.PeriodType periodType26 = period25.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight15, (org.joda.time.ReadableInstant) dateMidnight19, periodType26);
        mutablePeriod27.add(0L);
        mutableDateTime9.add((org.joda.time.ReadablePeriod) mutablePeriod27);
        mutablePeriod27.setMinutes(667);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology37);
        mutablePeriod38.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod38.add(0L);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(chronology47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.minusDays((int) (short) -1);
        int int51 = dateMidnight50.getYearOfEra();
        org.joda.time.Chronology chronology52 = dateMidnight50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology52);
        mutablePeriod38.add(0L, chronology52);
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((long) (-1), chronology52);
        org.joda.time.DurationField durationField56 = chronology52.weeks();
        org.joda.time.DateTimeField dateTimeField57 = chronology52.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField58 = chronology52.millisOfDay();
        mutablePeriod27.setPeriod((-27424800L), chronology52);
        org.joda.time.DurationField durationField60 = chronology52.eras();
        org.joda.time.DurationField durationField61 = chronology52.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField56 and durationField60", Math.signum(durationField56.compareTo(durationField60)) == -Math.signum(durationField60.compareTo(durationField56)));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        long long1 = instant0.getMillis();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.Instant instant10 = instant0.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.withZoneRetainFields(dateTimeZone15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        long long23 = dateMidnight20.getMillis();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableDuration24, readableInstant25);
        org.joda.time.PeriodType periodType27 = period26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight16, (org.joda.time.ReadableInstant) dateMidnight20, periodType27);
        org.joda.time.PeriodType periodType29 = periodType27.withHoursRemoved();
        org.joda.time.PeriodType periodType30 = periodType27.withWeeksRemoved();
        java.util.Calendar.Builder builder31 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder33 = builder31.setInstant(4320000000L);
        java.util.Date date35 = new java.util.Date((long) 1);
        date35.setHours(15);
        date35.setMinutes(59);
        java.util.Calendar.Builder builder40 = builder33.setInstant(date35);
        boolean boolean41 = periodType30.equals((java.lang.Object) builder40);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology44);
        org.joda.time.format.PeriodFormatter periodFormatter46 = null;
        java.lang.String str47 = mutablePeriod45.toString(periodFormatter46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.minusDays((int) (short) -1);
        int int52 = dateMidnight51.getYearOfEra();
        int int53 = dateMidnight51.getWeekyear();
        org.joda.time.Duration duration54 = mutablePeriod45.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight51);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusDays((int) (short) -1);
        int int64 = dateMidnight63.getYearOfEra();
        org.joda.time.Chronology chronology65 = dateMidnight63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology65.getZone();
        org.joda.time.DateTimeField dateTimeField69 = chronology65.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) 11, chronology65);
        mutablePeriod45.setPeriod((long) 31, 1645455769622L, chronology65);
        org.joda.time.Period period72 = duration8.toPeriod(periodType30, chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        int int8 = dateTime7.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration13, readableInstant14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight9, periodType16);
        int int18 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant19 = dateMidnight5.toInstant();
        org.joda.time.Instant instant21 = instant19.plus((long) 32769);
        org.joda.time.Instant instant24 = instant19.withDurationAdded((long) 726, 20);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = yearMonthDay25.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        int int37 = mutablePeriod32.getValue(0);
        mutablePeriod32.addMinutes(0);
        mutablePeriod32.setMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay25.minus((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.Chronology chronology43 = yearMonthDay42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = instant19.toMutableDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant19", (dateMidnight3.compareTo(instant19) == 0) == dateMidnight3.equals(instant19));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(periodType5);
        org.joda.time.format.PeriodFormatter periodFormatter7 = null;
        java.lang.String str8 = mutablePeriod6.toString(periodFormatter7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        int int11 = dateMidnight10.getMillisOfSecond();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', periodType13, chronology14);
        org.joda.time.Period period17 = period15.withDays((int) ' ');
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight10, (org.joda.time.ReadablePeriod) period17);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval20 = yearMonthDay19.toInterval();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        long long27 = dateMidnight24.getMillis();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.days();
        org.joda.time.Period period29 = duration22.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight24, periodType28);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime31 = yearMonthDay30.toDateTimeAtMidnight();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period29, (org.joda.time.ReadableInstant) dateTime31);
        boolean boolean33 = interval20.abuts((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Interval interval34 = interval18.overlap((org.joda.time.ReadableInterval) interval32);
        long long35 = interval18.getEndMillis();
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval37 = yearMonthDay36.toInterval();
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval39 = yearMonthDay38.toInterval();
        org.joda.time.Interval interval40 = interval37.gap((org.joda.time.ReadableInterval) interval39);
        boolean boolean41 = interval18.abuts((org.joda.time.ReadableInterval) interval39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(chronology42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.minusDays((int) (short) -1);
        long long46 = dateMidnight43.getMillis();
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight43.withMillis((long) 7);
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(chronology51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.minusDays((int) (short) -1);
        long long55 = dateMidnight52.getMillis();
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.days();
        org.joda.time.Period period57 = duration50.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight52, periodType56);
        org.joda.time.MutableDateTime mutableDateTime58 = dateMidnight52.toMutableDateTimeISO();
        int int59 = dateMidnight48.compareTo((org.joda.time.ReadableInstant) mutableDateTime58);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight48.plusWeeks(10);
        org.joda.time.Interval interval62 = dateMidnight61.toInterval();
        boolean boolean63 = interval18.abuts((org.joda.time.ReadableInterval) interval62);
        mutablePeriod6.add((org.joda.time.ReadableInterval) interval18);
        boolean boolean65 = interval1.isAfter((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(chronology66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight69.withZoneRetainFields(dateTimeZone70);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight(chronology72);
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight73.minusDays((int) (short) -1);
        int int76 = dateMidnight75.getYearOfEra();
        org.joda.time.Chronology chronology77 = dateMidnight75.getChronology();
        long long78 = dateMidnight75.getMillis();
        org.joda.time.ReadableDuration readableDuration79 = null;
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableDuration79, readableInstant80);
        org.joda.time.PeriodType periodType82 = period81.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight71, (org.joda.time.ReadableInstant) dateMidnight75, periodType82);
        int int84 = dateMidnight71.getDayOfYear();
        org.joda.time.Instant instant85 = dateMidnight71.toInstant();
        org.joda.time.Interval interval86 = interval1.withEnd((org.joda.time.ReadableInstant) instant85);
        boolean boolean88 = interval1.isAfter((long) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight26 and instant85", (dateMidnight26.compareTo(instant85) == 0) == dateMidnight26.equals(instant85));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        int int15 = timeZone14.getRawOffset();
        java.util.Calendar.Builder builder16 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder18 = builder16.setInstant(4320000000L);
        java.util.Calendar.Builder builder20 = builder18.setInstant((long) (short) 100);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        long long27 = dateMidnight24.getMillis();
        java.util.Locale locale31 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar32 = dateMidnight24.toCalendar(locale31);
        int int34 = calendar32.getLeastMaximum(3);
        java.util.TimeZone timeZone35 = calendar32.getTimeZone();
        timeZone35.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone35);
        java.util.Calendar.Builder builder39 = builder18.setTimeZone(timeZone35);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay((long) 10, chronology41);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = timeOfDay42.getFields();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay((long) 10, chronology45);
        org.joda.time.DateTimeField[] dateTimeFieldArray47 = timeOfDay46.getFields();
        org.joda.time.Period period48 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay42, (org.joda.time.ReadablePartial) timeOfDay46);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay((long) 10, chronology50);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray52 = timeOfDay51.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay51.plusSeconds((int) '4');
        int int55 = timeOfDay42.compareTo((org.joda.time.ReadablePartial) timeOfDay51);
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay42.withMillisOfSecond(1);
        org.joda.time.TimeOfDay.Property property58 = timeOfDay42.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property58.getFieldType();
        java.util.Locale locale60 = java.util.Locale.FRANCE;
        java.lang.String str61 = property58.getAsText(locale60);
        int int62 = property58.get();
        java.util.Locale locale63 = null;
        int int64 = property58.getMaximumTextLength(locale63);
        org.joda.time.TimeOfDay timeOfDay66 = property58.addWrapFieldToCopy((int) (short) -1);
        java.util.Locale locale67 = java.util.Locale.KOREA;
        java.lang.String str68 = locale67.getCountry();
        int int69 = property58.getMaximumTextLength(locale67);
        org.joda.time.TimeOfDay timeOfDay70 = property58.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay71 = property58.withMinimumValue();
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale76 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Locale locale77 = java.util.Locale.JAPAN;
        boolean boolean78 = locale77.hasExtensions();
        java.lang.String str79 = locale77.getDisplayCountry();
        java.lang.String str80 = locale76.getDisplayScript(locale77);
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(locale76);
        java.lang.String str82 = locale72.getDisplayScript(locale76);
        int int83 = property58.getMaximumTextLength(locale76);
        java.util.Calendar calendar84 = java.util.Calendar.getInstance(timeZone35, locale76);
        java.util.Calendar calendar85 = java.util.Calendar.getInstance(timeZone14, locale76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar32", (calendar11.compareTo(calendar32) == 0) == calendar11.equals(calendar32));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology9);
        mutablePeriod10.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod10.add(0L);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        mutablePeriod10.add(0L, chronology24);
        org.joda.time.Period period27 = new org.joda.time.Period((long) 0, (long) 6, chronology24);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(2, 12, (int) (short) 10, 3, (int) (byte) 1, chronology24);
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now(chronology24);
        java.util.Date date30 = localDate29.toDate();
        org.joda.time.LocalDate.Property property31 = localDate29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(dateTimeZone39);
        org.joda.time.DateMidnight dateMidnight41 = org.joda.time.DateMidnight.now(dateTimeZone39);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.withWeekOfWeekyear(12);
        int int44 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateMidnight43);
        org.joda.time.DateMidnight dateMidnight45 = localDate29.toDateMidnight(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.now(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.Duration duration52 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableDuration) duration52);
        int int54 = dateTime49.getMillisOfSecond();
        org.joda.time.DateTime dateTime56 = dateTime49.minusMonths(53);
        org.joda.time.DateTime dateTime58 = dateTime49.withYearOfCentury(3);
        int int59 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Instant instant60 = org.joda.time.Instant.now();
        long long61 = instant60.getMillis();
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardHours(10L);
        long long64 = duration63.getStandardSeconds();
        org.joda.time.Duration duration67 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration68 = duration63.plus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Period period69 = duration68.toPeriod();
        org.joda.time.Duration duration72 = duration68.withDurationAdded(100L, 3);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(chronology73);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight74.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight76.withZoneRetainFields(dateTimeZone77);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.DateMidnight dateMidnight80 = new org.joda.time.DateMidnight(chronology79);
        org.joda.time.DateMidnight dateMidnight82 = dateMidnight80.minusDays((int) (short) -1);
        int int83 = dateMidnight82.getYearOfEra();
        org.joda.time.Chronology chronology84 = dateMidnight82.getChronology();
        long long85 = dateMidnight82.getMillis();
        org.joda.time.ReadableDuration readableDuration86 = null;
        org.joda.time.ReadableInstant readableInstant87 = null;
        org.joda.time.Period period88 = new org.joda.time.Period(readableDuration86, readableInstant87);
        org.joda.time.PeriodType periodType89 = period88.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight78, (org.joda.time.ReadableInstant) dateMidnight82, periodType89);
        int int91 = dateMidnight78.getMillisOfDay();
        org.joda.time.Interval interval92 = duration68.toIntervalFrom((org.joda.time.ReadableInstant) dateMidnight78);
        org.joda.time.Instant instant93 = instant60.plus((org.joda.time.ReadableDuration) duration68);
        int int94 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) instant93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant60", (dateTime36.compareTo(instant60) == 0) == dateTime36.equals(instant60));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        long long1 = instant0.getMillis();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.Instant instant10 = instant0.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusDays((int) (short) -1);
        int int15 = dateMidnight14.getYearOfEra();
        int int16 = dateMidnight14.getWeekyear();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight14, readableInstant17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours(10L);
        long long25 = duration24.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight22, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.Period period27 = duration24.toPeriod();
        org.joda.time.Duration duration30 = duration24.withDurationAdded((long) (short) 0, (int) (byte) 0);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration36 = duration32.withDurationAdded((org.joda.time.ReadableDuration) duration34, 12);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration42 = duration38.withDurationAdded((org.joda.time.ReadableDuration) duration40, 12);
        boolean boolean43 = duration36.isEqual((org.joda.time.ReadableDuration) duration40);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.now(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableDuration) duration50);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        int int59 = dateMidnight58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateMidnight58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (short) 10, chronology60);
        org.joda.time.DateTime dateTime64 = dateTime62.minusHours(7);
        org.joda.time.DateTime dateTime66 = dateTime64.plusYears((int) (byte) 0);
        int int67 = dateTime66.getMonthOfYear();
        org.joda.time.Interval interval68 = duration50.toIntervalFrom((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean69 = duration40.isLongerThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Duration duration71 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration75 = duration71.withDurationAdded((org.joda.time.ReadableDuration) duration73, 12);
        org.joda.time.Duration duration77 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration81 = duration77.withDurationAdded((org.joda.time.ReadableDuration) duration79, 12);
        boolean boolean82 = duration75.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Seconds seconds83 = duration75.toStandardSeconds();
        int int84 = duration50.compareTo((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Duration duration86 = duration24.withDurationAdded((org.joda.time.ReadableDuration) duration75, 15);
        org.joda.time.Duration duration88 = duration24.plus((long) 5);
        mutablePeriod18.setPeriod((org.joda.time.ReadableDuration) duration88);
        org.joda.time.Instant instant90 = instant10.minus((org.joda.time.ReadableDuration) duration88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        long long49 = instant47.getMillis();
        org.joda.time.Instant instant51 = instant47.plus((-2100623334000L));
        org.joda.time.Instant instant52 = instant47.toInstant();
        org.joda.time.Duration duration54 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration58 = duration54.withDurationAdded((org.joda.time.ReadableDuration) duration56, 12);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate61 = org.joda.time.LocalDate.now(dateTimeZone60);
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone60);
        org.joda.time.Duration duration65 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime62, (org.joda.time.ReadableDuration) duration65);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight(chronology70);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight71.minusDays((int) (short) -1);
        int int74 = dateMidnight73.getYearOfEra();
        org.joda.time.Chronology chronology75 = dateMidnight73.getChronology();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology75);
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) (short) 10, chronology75);
        org.joda.time.DateTime dateTime79 = dateTime77.minusHours(7);
        org.joda.time.DateTime dateTime81 = dateTime79.plusYears((int) (byte) 0);
        int int82 = dateTime81.getMonthOfYear();
        org.joda.time.Interval interval83 = duration65.toIntervalFrom((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Duration duration84 = duration54.minus((org.joda.time.ReadableDuration) duration65);
        org.joda.time.Instant instant85 = instant52.plus((org.joda.time.ReadableDuration) duration54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant52", (dateTime23.compareTo(instant52) == 0) == dateTime23.equals(instant52));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration5 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration3, 12);
        org.joda.time.Duration duration6 = duration3.toDuration();
        org.joda.time.Instant instant8 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks((-3));
        org.joda.time.Interval interval12 = duration3.toIntervalTo((org.joda.time.ReadableInstant) dateTime11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime9", (instant8.compareTo(dateTime9) == 0) == instant8.equals(dateTime9));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime10 = yearMonthDay9.toDateTimeAtMidnight();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateTime10);
        java.lang.String str12 = interval11.toString();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval14 = yearMonthDay13.toInterval();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval16 = yearMonthDay15.toInterval();
        org.joda.time.Interval interval17 = interval14.gap((org.joda.time.ReadableInterval) interval16);
        boolean boolean19 = interval14.isBefore(100L);
        java.lang.String str20 = interval14.toString();
        boolean boolean21 = interval11.isBefore((org.joda.time.ReadableInterval) interval14);
        org.joda.time.Chronology chronology22 = interval11.getChronology();
        org.joda.time.Duration duration23 = interval11.toDuration();
        org.joda.time.Instant instant25 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime26 = instant25.toDateTimeISO();
        org.joda.time.DateTime dateTime28 = dateTime26.plusWeeks((-3));
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.standard();
        org.joda.time.Period period30 = duration23.toPeriodTo((org.joda.time.ReadableInstant) dateTime26, periodType29);
        org.joda.time.Period period32 = period30.minusWeeks(122);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant25 and dateTime26", (instant25.compareTo(dateTime26) == 0) == instant25.equals(dateTime26));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration13, readableInstant14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight9, periodType16);
        int int18 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant19 = dateMidnight5.toInstant();
        org.joda.time.Instant instant21 = instant19.plus((long) 32769);
        org.joda.time.Instant instant24 = instant19.withDurationAdded((long) 726, 20);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = yearMonthDay25.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        int int37 = mutablePeriod32.getValue(0);
        mutablePeriod32.addMinutes(0);
        mutablePeriod32.setMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay25.minus((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.Chronology chronology43 = yearMonthDay42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = instant19.toMutableDateTime(chronology43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant19", (dateMidnight3.compareTo(instant19) == 0) == dateMidnight3.equals(instant19));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration5 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration3, 12);
        org.joda.time.Period period6 = new org.joda.time.Period();
        boolean boolean7 = duration1.equals((java.lang.Object) period6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight9.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight9.minus((org.joda.time.ReadableDuration) duration19);
        boolean boolean22 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology26);
        mutablePeriod27.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod27.add(0L);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusDays((int) (short) -1);
        int int40 = dateMidnight39.getYearOfEra();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology41);
        mutablePeriod27.add(0L, chronology41);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((long) (-1), chronology41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.minusDays((int) (short) -1);
        int int52 = dateMidnight51.getYearOfEra();
        org.joda.time.Chronology chronology53 = dateMidnight51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 10, chronology53);
        org.joda.time.MutableDateTime mutableDateTime56 = dateMidnight44.toMutableDateTime(chronology53);
        mutableDateTime56.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime56.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime56.toMutableDateTime(dateTimeZone60);
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray63 = yearMonthDay62.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = yearMonthDay62.toDateTimeAtCurrentTime(dateTimeZone64);
        org.joda.time.Duration duration66 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime56, (org.joda.time.ReadableInstant) dateTime65);
        mutableDateTime56.addYears(9);
        mutableDateTime56.addYears(59);
        org.joda.time.Interval interval71 = duration1.toIntervalTo((org.joda.time.ReadableInstant) mutableDateTime56);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(528, 16);
        mutableDateTime56.setZoneRetainFields(dateTimeZone74);
        int int76 = mutableDateTime56.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime65", (dateTime16.compareTo(dateTime65) == 0) == dateTime16.equals(dateTime65));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusDays((int) (short) -1);
        int int53 = dateMidnight52.getYearOfEra();
        org.joda.time.Chronology chronology54 = dateMidnight52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.clockhourOfDay();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology54);
        org.joda.time.DateTimeField dateTimeField58 = chronology54.dayOfYear();
        org.joda.time.DateTimeField dateTimeField59 = chronology54.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField60 = chronology54.centuryOfEra();
        boolean boolean61 = duration13.equals((java.lang.Object) dateTimeField60);
        org.joda.time.Seconds seconds62 = duration13.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime57", (dateTime23.compareTo(dateTime57) == 0) == dateTime23.equals(dateTime57));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) 10, chronology14);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds(14);
        boolean boolean19 = dateMidnight5.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTimeISO();
        org.joda.time.DateTime dateTime21 = dateTime18.toDateTime();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology25);
        mutablePeriod26.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod26.add(0L);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        mutablePeriod26.add(0L, chronology40);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (-1), chronology40);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(chronology47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.minusDays((int) (short) -1);
        int int51 = dateMidnight50.getYearOfEra();
        org.joda.time.Chronology chronology52 = dateMidnight50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (short) 10, chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = dateMidnight43.toMutableDateTime(chronology52);
        mutableDateTime55.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime55.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime55.toMutableDateTime(dateTimeZone59);
        int int61 = mutableDateTime60.getSecondOfMinute();
        mutableDateTime60.setWeekyear(53);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str66 = localDate65.toString();
        org.joda.time.LocalDate.Property property67 = localDate65.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = localDate65.toString(dateTimeFormatter68);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(dateTimeZone71);
        int int74 = dateTimeZone71.getOffsetFromLocal((long) (short) -1);
        java.lang.String str75 = dateTimeZone71.getID();
        org.joda.time.DateTime dateTime76 = localDate65.toDateTimeAtCurrentTime(dateTimeZone71);
        mutableDateTime60.setZone(dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime21.toMutableDateTime(dateTimeZone71);
        long long80 = dateTimeZone71.nextTransition(1645401600003000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime78", (dateTime18.compareTo(mutableDateTime78) == 0) == dateTime18.equals(mutableDateTime78));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay0.dayOfMonth();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod7.add(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutablePeriod7.add(0L, chronology21);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (-1), chronology21);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight24.toMutableDateTime(chronology33);
        mutableDateTime36.setYear(2022);
        mutableDateTime36.setYear((-1));
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.dayOfYear();
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        long long48 = dateMidnight45.getMillis();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.days();
        org.joda.time.Period period50 = duration43.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight45, periodType49);
        org.joda.time.MutableDateTime mutableDateTime51 = dateMidnight45.toMutableDateTimeISO();
        int int52 = mutableDateTime51.getDayOfYear();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        int int59 = dateMidnight58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateMidnight58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology60);
        mutableDateTime51.setChronology(chronology60);
        mutableDateTime36.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        mutableDateTime36.addYears((int) (byte) -1);
        int int66 = property2.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.YearMonthDay yearMonthDay67 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime68 = yearMonthDay67.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay70 = yearMonthDay67.withDayOfMonth(7);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours(21);
        org.joda.time.DateMidnight dateMidnight73 = yearMonthDay70.toDateMidnight(dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate76 = org.joda.time.LocalDate.now(dateTimeZone75);
        org.joda.time.DateTime dateTime77 = org.joda.time.DateTime.now(dateTimeZone75);
        org.joda.time.DateTime dateTime79 = dateTime77.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime80 = dateTime77.toDateTime();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.DateMidnight dateMidnight84 = new org.joda.time.DateMidnight(chronology83);
        org.joda.time.DateMidnight dateMidnight86 = dateMidnight84.minusDays((int) (short) -1);
        int int87 = dateMidnight86.getYearOfEra();
        org.joda.time.Chronology chronology88 = dateMidnight86.getChronology();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology88);
        org.joda.time.DateTime dateTime90 = dateTime80.withChronology(chronology88);
        org.joda.time.DateMidnight dateMidnight91 = dateMidnight73.withChronology(chronology88);
        org.joda.time.DateMidnight dateMidnight93 = dateMidnight73.plusYears(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime77 and dateTime90", (dateTime77.compareTo(dateTime90) == 0) == dateTime77.equals(dateTime90));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusSeconds(2);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        long long14 = dateMidnight11.getMillis();
        org.joda.time.DateMidnight.Property property15 = dateMidnight11.weekyear();
        org.joda.time.DateMidnight dateMidnight16 = property15.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight17 = property15.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime7.withField(dateTimeFieldType18, 32769);
        org.joda.time.LocalDateTime.Property property21 = localDateTime7.year();
        org.joda.time.LocalDateTime.Property property22 = localDateTime7.year();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.withZoneRetainFields(dateTimeZone27);
        org.joda.time.Instant instant29 = dateMidnight28.toInstant();
        org.joda.time.Chronology chronology30 = instant29.getChronology();
        int int31 = property22.getDifference((org.joda.time.ReadableInstant) instant29);
        long long32 = property22.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight11 and instant29", (dateMidnight11.compareTo(instant29) == 0) == dateMidnight11.equals(instant29));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(dateTimeZone1);
        int int4 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        java.lang.String str5 = dateTimeZone1.getID();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate.Property property11 = localDate9.weekyear();
        org.joda.time.LocalDate localDate12 = property11.roundFloorCopy();
        org.joda.time.LocalDate localDate14 = localDate12.withYear(32769);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval16 = yearMonthDay15.toInterval();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay15.withChronologyRetainFields(chronology17);
        org.joda.time.DateTime dateTime19 = yearMonthDay15.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        int int26 = dateMidnight25.getYearOfEra();
        org.joda.time.Chronology chronology27 = dateMidnight25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.halfdayOfDay();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) '#');
        int int33 = dateTimeField30.getMinimumValue((org.joda.time.ReadablePartial) localDate32);
        org.joda.time.Period period34 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate35 = localDate32.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay15.minus((org.joda.time.ReadablePeriod) period34);
        java.lang.String str37 = yearMonthDay15.toString();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime40 = yearMonthDay15.toDateTimeAtMidnight(dateTimeZone39);
        org.joda.time.Interval interval41 = localDate12.toInterval(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime7.withZoneRetainFields(dateTimeZone39);
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.days();
        org.joda.time.Period period46 = new org.joda.time.Period(1645488000000L, periodType45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(periodType45);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(periodType45);
        org.joda.time.PeriodType periodType49 = periodType45.withHoursRemoved();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.Period period59 = new org.joda.time.Period((long) 726, periodType45, chronology57);
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime7.toMutableDateTime(chronology57);
        org.joda.time.DateTimeField dateTimeField61 = chronology57.secondOfMinute();
        org.joda.time.DurationField durationField62 = dateTimeField61.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime60", (dateTime7.compareTo(mutableDateTime60) == 0) == dateTime7.equals(mutableDateTime60));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        int int13 = dateTime12.getCenturyOfEra();
        int int14 = dateTime12.getSecondOfMinute();
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime17 = property15.addToCopy((long) (byte) 0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology21);
        mutablePeriod22.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod22.add(0L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        mutablePeriod22.add(0L, chronology36);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (-1), chronology36);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(chronology43);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.minusDays((int) (short) -1);
        int int47 = dateMidnight46.getYearOfEra();
        org.joda.time.Chronology chronology48 = dateMidnight46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (short) 10, chronology48);
        org.joda.time.MutableDateTime mutableDateTime51 = dateMidnight39.toMutableDateTime(chronology48);
        mutableDateTime51.setYear(2022);
        mutableDateTime51.setYear((-1));
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime57 = property56.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime58 = property56.roundHalfEven();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        mutableDateTime58.setZone(dateTimeZone60);
        java.util.TimeZone timeZone62 = dateTimeZone60.toTimeZone();
        org.joda.time.DateTime dateTime63 = dateTime17.withZone(dateTimeZone60);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime63", (dateTime12.compareTo(dateTime63) == 0) == dateTime12.equals(dateTime63));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        boolean boolean2 = periodType0.equals((java.lang.Object) instant1);
        org.joda.time.DateTime dateTime3 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTime();
        org.joda.time.DateTime.Property property5 = dateTime4.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime4", (instant1.compareTo(dateTime4) == 0) == instant1.equals(dateTime4));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.Instant instant10 = instant6.withDurationAdded(99L, 2000);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) 15);
        org.joda.time.Instant instant14 = instant6.withDurationAdded((org.joda.time.ReadableDuration) duration12, 23);
        org.joda.time.Instant instant17 = instant14.withDurationAdded((long) 105, 902);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        long long49 = duration46.getStandardMinutes();
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(periodType52);
        org.joda.time.PeriodType periodType54 = periodType52.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 58, (long) 139, periodType52);
        org.joda.time.PeriodType periodType56 = periodType52.withMinutesRemoved();
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusDays((int) (short) -1);
        long long64 = dateMidnight61.getMillis();
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.days();
        org.joda.time.Period period66 = duration59.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight61, periodType65);
        org.joda.time.MutableDateTime mutableDateTime67 = dateMidnight61.toMutableDateTimeISO();
        int int68 = mutableDateTime67.getDayOfYear();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(chronology71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.minusDays((int) (short) -1);
        int int75 = dateMidnight74.getYearOfEra();
        org.joda.time.Chronology chronology76 = dateMidnight74.getChronology();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology76);
        mutableDateTime67.setChronology(chronology76);
        java.lang.String str79 = chronology76.toString();
        org.joda.time.LocalDate localDate80 = new org.joda.time.LocalDate(18748801970L, chronology76);
        org.joda.time.Period period81 = duration46.toPeriod(periodType56, chronology76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration13, readableInstant14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight9, periodType16);
        int int18 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant19 = dateMidnight5.toInstant();
        org.joda.time.Instant instant21 = instant19.plus((long) 32769);
        org.joda.time.Instant instant24 = instant19.withDurationAdded((long) 726, 20);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = yearMonthDay25.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        int int37 = mutablePeriod32.getValue(0);
        mutablePeriod32.addMinutes(0);
        mutablePeriod32.setMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay25.minus((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.Chronology chronology43 = yearMonthDay42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = instant19.toMutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = instant19.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime44", (dateMidnight3.compareTo(mutableDateTime44) == 0) == dateMidnight3.equals(mutableDateTime44));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.days();
        org.joda.time.Period period17 = new org.joda.time.Period(1645488000000L, periodType16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration18, readableInstant19);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period22 = period17.normalizedStandard(periodType21);
        org.joda.time.Period period23 = duration13.toPeriodTo(readableInstant14, periodType21);
        org.joda.time.Duration duration26 = duration13.withDurationAdded((long) 53, 5);
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(locale27);
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromCalendarFields(calendar28);
        org.joda.time.DateTime dateTime30 = localTime29.toDateTimeToday();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime30);
        java.util.GregorianCalendar gregorianCalendar32 = dateTime30.toGregorianCalendar();
        int int33 = dateTime30.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and gregorianCalendar32", (calendar28.compareTo(gregorianCalendar32) == 0) == calendar28.equals(gregorianCalendar32));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((-3));
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfYear(20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.withZoneRetainFields(dateTimeZone6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        long long14 = dateMidnight11.getMillis();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration15, readableInstant16);
        org.joda.time.PeriodType periodType18 = period17.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight7, (org.joda.time.ReadableInstant) dateMidnight11, periodType18);
        int int20 = dateMidnight7.getDayOfYear();
        org.joda.time.Instant instant21 = dateMidnight7.toInstant();
        org.joda.time.Instant instant23 = instant21.plus((long) 32769);
        org.joda.time.Instant instant26 = instant21.withDurationAdded((long) 726, 20);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = yearMonthDay27.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        int int39 = mutablePeriod34.getValue(0);
        mutablePeriod34.addMinutes(0);
        mutablePeriod34.setMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay27.minus((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.Chronology chronology45 = yearMonthDay44.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = instant21.toMutableDateTime(chronology45);
        org.joda.time.Period period47 = new org.joda.time.Period((-2240611200000L), 39312000000L, chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant21", (dateMidnight5.compareTo(instant21) == 0) == dateMidnight5.equals(instant21));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        org.joda.time.Duration duration50 = duration46.withMillis(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateTime dateTime4 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay0.plusMonths(0);
        org.joda.time.DateMidnight dateMidnight7 = yearMonthDay6.toDateMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = yearMonthDay6.getFieldTypes();
        org.joda.time.Chronology chronology9 = yearMonthDay6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.Chronology chronology11 = chronology9.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime10", (dateTime4.compareTo(mutableDateTime10) == 0) == dateTime4.equals(mutableDateTime10));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval2 = yearMonthDay1.toInterval();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay1.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.plusMonths(0);
        org.joda.time.DateMidnight dateMidnight8 = yearMonthDay7.toDateMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = yearMonthDay7.getFieldTypes();
        org.joda.time.Chronology chronology10 = yearMonthDay7.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(1645455870872L, chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime11", (dateTime5.compareTo(mutableDateTime11) == 0) == dateTime5.equals(mutableDateTime11));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime6 = dateTime3.toDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTime dateTime16 = dateTime6.withChronology(chronology14);
        org.joda.time.DateTime.Property property17 = dateTime16.year();
        org.joda.time.DateTime dateTime18 = property17.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime19 = property17.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime16", (dateTime3.compareTo(dateTime16) == 0) == dateTime3.equals(dateTime16));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration5 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration3, 12);
        org.joda.time.Period period6 = new org.joda.time.Period();
        boolean boolean7 = duration1.equals((java.lang.Object) period6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight9.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight9.minus((org.joda.time.ReadableDuration) duration19);
        boolean boolean22 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology26);
        mutablePeriod27.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod27.add(0L);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusDays((int) (short) -1);
        int int40 = dateMidnight39.getYearOfEra();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology41);
        mutablePeriod27.add(0L, chronology41);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((long) (-1), chronology41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.minusDays((int) (short) -1);
        int int52 = dateMidnight51.getYearOfEra();
        org.joda.time.Chronology chronology53 = dateMidnight51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 10, chronology53);
        org.joda.time.MutableDateTime mutableDateTime56 = dateMidnight44.toMutableDateTime(chronology53);
        mutableDateTime56.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime56.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime56.toMutableDateTime(dateTimeZone60);
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray63 = yearMonthDay62.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = yearMonthDay62.toDateTimeAtCurrentTime(dateTimeZone64);
        org.joda.time.Duration duration66 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime56, (org.joda.time.ReadableInstant) dateTime65);
        mutableDateTime56.addYears(9);
        mutableDateTime56.addYears(59);
        org.joda.time.Interval interval71 = duration1.toIntervalTo((org.joda.time.ReadableInstant) mutableDateTime56);
        mutableDateTime56.add((long) 58);
        java.lang.Object obj74 = mutableDateTime56.clone();
        mutableDateTime56.addSeconds(54242996);
        mutableDateTime56.addSeconds(5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime65", (dateTime16.compareTo(dateTime65) == 0) == dateTime16.equals(dateTime65));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTime();
        int int8 = mutableDateTime7.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(7);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property64 = dateTime61.centuryOfEra();
        int int65 = dateTime61.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime61.getZone();
        org.joda.time.Interval interval67 = interval48.withStart((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime68 = interval67.getEnd();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration5 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration3, 12);
        org.joda.time.Period period6 = new org.joda.time.Period();
        boolean boolean7 = duration1.equals((java.lang.Object) period6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight9.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight9.minus((org.joda.time.ReadableDuration) duration19);
        boolean boolean22 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology26);
        mutablePeriod27.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod27.add(0L);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusDays((int) (short) -1);
        int int40 = dateMidnight39.getYearOfEra();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology41);
        mutablePeriod27.add(0L, chronology41);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((long) (-1), chronology41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.minusDays((int) (short) -1);
        int int52 = dateMidnight51.getYearOfEra();
        org.joda.time.Chronology chronology53 = dateMidnight51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 10, chronology53);
        org.joda.time.MutableDateTime mutableDateTime56 = dateMidnight44.toMutableDateTime(chronology53);
        mutableDateTime56.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime56.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime56.toMutableDateTime(dateTimeZone60);
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray63 = yearMonthDay62.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = yearMonthDay62.toDateTimeAtCurrentTime(dateTimeZone64);
        org.joda.time.Duration duration66 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime56, (org.joda.time.ReadableInstant) dateTime65);
        mutableDateTime56.addYears(9);
        mutableDateTime56.addYears(59);
        org.joda.time.Interval interval71 = duration1.toIntervalTo((org.joda.time.ReadableInstant) mutableDateTime56);
        mutableDateTime56.add((long) 58);
        java.lang.Object obj74 = mutableDateTime56.clone();
        mutableDateTime56.addSeconds(54242996);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime56.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime65", (dateTime16.compareTo(dateTime65) == 0) == dateTime16.equals(dateTime65));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology11.getZone();
        org.joda.time.DateTime dateTime15 = yearMonthDay0.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        long long22 = dateMidnight19.getMillis();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.Period period24 = duration17.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight19, periodType23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateMidnight19.toMutableDateTimeISO();
        int int26 = mutableDateTime25.getDayOfYear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        mutableDateTime25.setChronology(chronology34);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology40);
        mutablePeriod41.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod41.add(0L);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(chronology50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusDays((int) (short) -1);
        int int54 = dateMidnight53.getYearOfEra();
        org.joda.time.Chronology chronology55 = dateMidnight53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology55);
        mutablePeriod41.add(0L, chronology55);
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((long) (-1), chronology55);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight(chronology62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.minusDays((int) (short) -1);
        int int66 = dateMidnight65.getYearOfEra();
        org.joda.time.Chronology chronology67 = dateMidnight65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology67);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (short) 10, chronology67);
        org.joda.time.MutableDateTime mutableDateTime70 = dateMidnight58.toMutableDateTime(chronology67);
        mutableDateTime70.setWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((long) 22, dateTimeZone75);
        mutableDateTime70.setZoneRetainFields(dateTimeZone75);
        org.joda.time.DateTime dateTime78 = mutableDateTime25.toDateTime(dateTimeZone75);
        org.joda.time.Chronology chronology79 = mutableDateTime25.getChronology();
        org.joda.time.YearMonthDay yearMonthDay80 = yearMonthDay0.withChronologyRetainFields(chronology79);
        org.joda.time.DateTimeField dateTimeField81 = chronology79.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField82 = chronology79.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight7 and dateTime78", (dateMidnight7.compareTo(dateTime78) == 0) == dateMidnight7.equals(dateTime78));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(363, 31, (int) 'u', 667);
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval7 = yearMonthDay6.toInterval();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay6.withChronologyRetainFields(chronology8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) (short) -1);
        int int16 = dateMidnight15.getYearOfEra();
        org.joda.time.Chronology chronology17 = dateMidnight15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology17.getZone();
        org.joda.time.DateTime dateTime21 = yearMonthDay6.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        long long28 = dateMidnight25.getMillis();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.days();
        org.joda.time.Period period30 = duration23.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight25, periodType29);
        org.joda.time.MutableDateTime mutableDateTime31 = dateMidnight25.toMutableDateTimeISO();
        int int32 = mutableDateTime31.getDayOfYear();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        mutableDateTime31.setChronology(chronology40);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology46);
        mutablePeriod47.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod47.add(0L);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(chronology56);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight57.minusDays((int) (short) -1);
        int int60 = dateMidnight59.getYearOfEra();
        org.joda.time.Chronology chronology61 = dateMidnight59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology61);
        mutablePeriod47.add(0L, chronology61);
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((long) (-1), chronology61);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight(chronology68);
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight69.minusDays((int) (short) -1);
        int int72 = dateMidnight71.getYearOfEra();
        org.joda.time.Chronology chronology73 = dateMidnight71.getChronology();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology73);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) (short) 10, chronology73);
        org.joda.time.MutableDateTime mutableDateTime76 = dateMidnight64.toMutableDateTime(chronology73);
        mutableDateTime76.setWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime((long) 22, dateTimeZone81);
        mutableDateTime76.setZoneRetainFields(dateTimeZone81);
        org.joda.time.DateTime dateTime84 = mutableDateTime31.toDateTime(dateTimeZone81);
        org.joda.time.Chronology chronology85 = mutableDateTime31.getChronology();
        org.joda.time.YearMonthDay yearMonthDay86 = yearMonthDay6.withChronologyRetainFields(chronology85);
        mutablePeriod4.setPeriod(3276917812000L, chronology85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight13 and dateTime84", (dateMidnight13.compareTo(dateTime84) == 0) == dateMidnight13.equals(dateTime84));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration5 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration3, 12);
        org.joda.time.Period period6 = new org.joda.time.Period();
        boolean boolean7 = duration1.equals((java.lang.Object) period6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight9.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight9.minus((org.joda.time.ReadableDuration) duration19);
        boolean boolean22 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology26);
        mutablePeriod27.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod27.add(0L);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusDays((int) (short) -1);
        int int40 = dateMidnight39.getYearOfEra();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology41);
        mutablePeriod27.add(0L, chronology41);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((long) (-1), chronology41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.minusDays((int) (short) -1);
        int int52 = dateMidnight51.getYearOfEra();
        org.joda.time.Chronology chronology53 = dateMidnight51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 10, chronology53);
        org.joda.time.MutableDateTime mutableDateTime56 = dateMidnight44.toMutableDateTime(chronology53);
        mutableDateTime56.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime56.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime56.toMutableDateTime(dateTimeZone60);
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray63 = yearMonthDay62.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = yearMonthDay62.toDateTimeAtCurrentTime(dateTimeZone64);
        org.joda.time.Duration duration66 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime56, (org.joda.time.ReadableInstant) dateTime65);
        mutableDateTime56.addYears(9);
        mutableDateTime56.addYears(59);
        org.joda.time.Interval interval71 = duration1.toIntervalTo((org.joda.time.ReadableInstant) mutableDateTime56);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(528, 16);
        mutableDateTime56.setZoneRetainFields(dateTimeZone74);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime65", (dateTime16.compareTo(dateTime65) == 0) == dateTime16.equals(dateTime65));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        int int13 = dateTime12.getCenturyOfEra();
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusDays((int) (short) -1);
        int int19 = dateMidnight18.getYearOfEra();
        org.joda.time.Chronology chronology20 = dateMidnight18.getChronology();
        long long21 = dateMidnight18.getMillis();
        org.joda.time.DateMidnight.Property property22 = dateMidnight18.weekyear();
        org.joda.time.DateMidnight dateMidnight23 = property22.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight24 = property22.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property22.getFieldType();
        org.joda.time.DateMidnight dateMidnight26 = property22.roundHalfFloorCopy();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology30);
        mutablePeriod31.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod31.add(0L);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        int int44 = dateMidnight43.getYearOfEra();
        org.joda.time.Chronology chronology45 = dateMidnight43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology45);
        mutablePeriod31.add(0L, chronology45);
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((long) (-1), chronology45);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.MutableDateTime mutableDateTime60 = dateMidnight48.toMutableDateTime(chronology57);
        org.joda.time.DateMidnight.Property property61 = dateMidnight48.dayOfMonth();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay64 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval65 = yearMonthDay64.toInterval();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.YearMonthDay yearMonthDay67 = yearMonthDay64.withChronologyRetainFields(chronology66);
        org.joda.time.DateTime dateTime68 = yearMonthDay64.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(chronology71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.minusDays((int) (short) -1);
        int int75 = dateMidnight74.getYearOfEra();
        org.joda.time.Chronology chronology76 = dateMidnight74.getChronology();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField79 = chronology76.halfdayOfDay();
        org.joda.time.LocalDate localDate81 = new org.joda.time.LocalDate((long) '#');
        int int82 = dateTimeField79.getMinimumValue((org.joda.time.ReadablePartial) localDate81);
        org.joda.time.Period period83 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate84 = localDate81.plus((org.joda.time.ReadablePeriod) period83);
        org.joda.time.YearMonthDay yearMonthDay85 = yearMonthDay64.minus((org.joda.time.ReadablePeriod) period83);
        java.lang.String str86 = yearMonthDay64.toString();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime89 = yearMonthDay64.toDateTimeAtMidnight(dateTimeZone88);
        org.joda.time.Interval interval90 = localDate63.toInterval(dateTimeZone88);
        org.joda.time.DateMidnight dateMidnight91 = dateMidnight48.withZoneRetainFields(dateTimeZone88);
        org.joda.time.DateMidnight dateMidnight92 = dateMidnight26.withZoneRetainFields(dateTimeZone88);
        org.joda.time.DateTime dateTime93 = dateTime12.withZone(dateTimeZone88);
        org.joda.time.LocalDate localDate94 = org.joda.time.LocalDate.now(dateTimeZone88);
        org.joda.time.LocalDate.Property property95 = localDate94.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime93", (dateTime12.compareTo(dateTime93) == 0) == dateTime12.equals(dateTime93));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = timeOfDay2.getFields();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 10, chronology5);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusSeconds((int) '4');
        int int15 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay2.withMillisOfSecond(1);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay2.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.lang.String str21 = property18.getAsText(locale20);
        int int22 = property18.get();
        java.util.Locale locale23 = null;
        int int24 = property18.getMaximumTextLength(locale23);
        org.joda.time.TimeOfDay timeOfDay26 = property18.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = timeOfDay26.toDateTimeToday(dateTimeZone29);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology36);
        mutablePeriod37.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod37.add(0L);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        int int50 = dateMidnight49.getYearOfEra();
        org.joda.time.Chronology chronology51 = dateMidnight49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology51);
        mutablePeriod37.add(0L, chronology51);
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((long) (-1), chronology51);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(chronology58);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.minusDays((int) (short) -1);
        int int62 = dateMidnight61.getYearOfEra();
        org.joda.time.Chronology chronology63 = dateMidnight61.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology63);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (short) 10, chronology63);
        org.joda.time.MutableDateTime mutableDateTime66 = dateMidnight54.toMutableDateTime(chronology63);
        mutableDateTime66.setYear(2022);
        mutableDateTime66.setYear((-1));
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime66.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime72 = property71.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime73 = property71.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight76 = new org.joda.time.DateMidnight(dateTimeZone75);
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime73, dateTimeZone75);
        long long79 = dateTimeZone29.getMillisKeepLocal(dateTimeZone75, (long) 201);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime66 and dateTime77", (mutableDateTime66.compareTo(dateTime77) == 0) == mutableDateTime66.equals(dateTime77));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        long long1 = instant0.getMillis();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.Instant instant10 = instant0.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.DateTime dateTime11 = instant10.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        org.joda.time.DateMidnight dateMidnight8 = property7.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight9 = property7.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight10 = property7.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minus((long) 363);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology16);
        mutablePeriod17.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod17.add(0L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology31);
        mutablePeriod17.add(0L, chronology31);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((long) (-1), chronology31);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) (short) -1);
        int int42 = dateMidnight41.getYearOfEra();
        org.joda.time.Chronology chronology43 = dateMidnight41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (short) 10, chronology43);
        org.joda.time.MutableDateTime mutableDateTime46 = dateMidnight34.toMutableDateTime(chronology43);
        mutableDateTime46.setYear(2022);
        mutableDateTime46.setYear((-1));
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfYear();
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(chronology54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.minusDays((int) (short) -1);
        long long58 = dateMidnight55.getMillis();
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.days();
        org.joda.time.Period period60 = duration53.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight55, periodType59);
        org.joda.time.MutableDateTime mutableDateTime61 = dateMidnight55.toMutableDateTimeISO();
        int int62 = mutableDateTime61.getDayOfYear();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(chronology65);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight66.minusDays((int) (short) -1);
        int int69 = dateMidnight68.getYearOfEra();
        org.joda.time.Chronology chronology70 = dateMidnight68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology70);
        mutableDateTime61.setChronology(chronology70);
        mutableDateTime46.setTime((org.joda.time.ReadableInstant) mutableDateTime61);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime46.era();
        org.joda.time.DateTimeZone dateTimeZone75 = mutableDateTime46.getZone();
        org.joda.time.Instant instant76 = mutableDateTime46.toInstant();
        org.joda.time.Instant instant78 = instant76.plus(3024000000L);
        org.joda.time.Duration duration80 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration82 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration84 = duration80.withDurationAdded((org.joda.time.ReadableDuration) duration82, 12);
        org.joda.time.Duration duration85 = duration82.toDuration();
        org.joda.time.Duration duration87 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration89 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration91 = duration87.withDurationAdded((org.joda.time.ReadableDuration) duration89, 12);
        org.joda.time.ReadableInstant readableInstant92 = null;
        org.joda.time.Period period93 = duration89.toPeriodFrom(readableInstant92);
        boolean boolean94 = duration85.isShorterThan((org.joda.time.ReadableDuration) duration89);
        org.joda.time.Instant instant96 = instant76.withDurationAdded((org.joda.time.ReadableDuration) duration89, (-59));
        org.joda.time.DateMidnight dateMidnight97 = dateMidnight12.plus((org.joda.time.ReadableDuration) duration89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime46 and instant76", (mutableDateTime46.compareTo(instant76) == 0) == mutableDateTime46.equals(instant76));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateTime dateTime4 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay0.plusMonths(0);
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay0.dayOfMonth();
        org.joda.time.DateTime dateTime8 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay0.withYear(903);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 902, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = yearMonthDay10.toDateMidnight(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.Instant instant10 = instant6.withDurationAdded(99L, 2000);
        org.joda.time.Instant instant11 = instant6.toInstant();
        org.joda.time.Instant instant13 = instant6.minus((long) 25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (byte) 100, 8, 15, (int) (byte) 0, (int) (byte) 0, 5, (int) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology10);
        mutablePeriod11.setPeriod((long) (short) 10, (long) (short) -1);
        int int15 = mutablePeriod11.getMonths();
        mutablePeriod11.addMinutes((int) (short) 0);
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((long) 10, chronology20);
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = timeOfDay21.getFields();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((long) 10, chronology24);
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = timeOfDay25.getFields();
        org.joda.time.Period period27 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay21, (org.joda.time.ReadablePartial) timeOfDay25);
        int[] intArray28 = timeOfDay25.getValues();
        org.joda.time.DateTime dateTime29 = timeOfDay25.toDateTimeToday();
        org.joda.time.DateMidnight dateMidnight30 = dateTime29.toDateMidnight();
        org.joda.time.DateTime dateTime32 = dateTime29.withMillisOfSecond(3);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology42);
        mutablePeriod43.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod43.add(0L);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutablePeriod43.add(0L, chronology57);
        org.joda.time.Period period60 = new org.joda.time.Period((long) 0, (long) 6, chronology57);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(2, 12, (int) (short) 10, 3, (int) (byte) 1, chronology57);
        boolean boolean62 = dateTime32.isAfter((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean63 = dateTime18.isBefore((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime.Property property64 = dateTime18.secondOfDay();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(chronology65);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight66.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight68.withZoneRetainFields(dateTimeZone69);
        org.joda.time.Instant instant71 = dateMidnight70.toInstant();
        org.joda.time.Chronology chronology72 = instant71.getChronology();
        org.joda.time.Instant instant75 = instant71.withDurationAdded(99L, 2000);
        org.joda.time.Instant instant76 = instant71.toInstant();
        org.joda.time.Interval interval77 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) instant71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight55 and instant71", (dateMidnight55.compareTo(instant71) == 0) == dateMidnight55.equals(instant71));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.joda.time.Instant instant9 = instant6.minus((-79200000L));
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(2000L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded(0L, (-23641));
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime9 = dateTime7.minusMonths((int) (short) 100);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration15 = duration11.withDurationAdded((org.joda.time.ReadableDuration) duration13, 12);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusDays((int) (short) -1);
        int int31 = dateMidnight30.getYearOfEra();
        org.joda.time.Chronology chronology32 = dateMidnight30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) 10, chronology32);
        org.joda.time.DateTime dateTime36 = dateTime34.minusHours(7);
        org.joda.time.DateTime dateTime38 = dateTime36.plusYears((int) (byte) 0);
        int int39 = dateTime38.getMonthOfYear();
        org.joda.time.Interval interval40 = duration22.toIntervalFrom((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Duration duration41 = duration11.minus((org.joda.time.ReadableDuration) duration22);
        boolean boolean42 = dateTime7.equals((java.lang.Object) duration22);
        org.joda.time.Duration duration45 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        long long50 = dateMidnight47.getMillis();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight47.withMillis((long) 7);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration45, (org.joda.time.ReadableInstant) dateMidnight47, periodType53);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((int) (byte) 100, 8, 15, (int) (byte) 0, (int) (byte) 0, 5, (int) ' ');
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period64 = duration45.toPeriodTo((org.joda.time.ReadableInstant) dateTime62, periodType63);
        boolean boolean65 = duration22.isLongerThan((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Instant instant66 = instant5.plus((org.joda.time.ReadableDuration) duration22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime2", (instant5.compareTo(mutableDateTime2) == 0) == instant5.equals(mutableDateTime2));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 10, chronology6);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay7, (org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean15 = timeOfDay11.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.clockhourOfDay();
        boolean boolean26 = dateTimeFieldType14.isSupported(chronology23);
        boolean boolean27 = localTime4.isSupported(dateTimeFieldType14);
        org.joda.time.LocalTime localTime29 = localTime4.plusHours(11);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod34.add(0L);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(chronology43);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.minusDays((int) (short) -1);
        int int47 = dateMidnight46.getYearOfEra();
        org.joda.time.Chronology chronology48 = dateMidnight46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology48);
        mutablePeriod34.add(0L, chronology48);
        boolean boolean51 = dateTimeFieldType30.isSupported(chronology48);
        org.joda.time.DurationField durationField52 = chronology48.hours();
        org.joda.time.DurationFieldType durationFieldType53 = durationField52.getType();
        org.joda.time.LocalTime localTime55 = localTime29.withFieldAdded(durationFieldType53, 0);
        org.joda.time.Instant instant56 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology57 = instant56.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.dayOfYear();
        org.joda.time.DurationField durationField59 = durationFieldType53.getField(chronology57);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField52 and durationField59", (durationField52.compareTo(durationField59) == 0) == durationField52.equals(durationField59));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) '#');
        int int13 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.Period period14 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate15 = localDate12.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.LocalDate.Property property16 = localDate15.dayOfYear();
        org.joda.time.Chronology chronology17 = localDate15.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.centuries();
        long long20 = durationField18.getMillis(59);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((java.lang.Object) long20);
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) '4', (long) 122);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusDays((int) (short) -1);
        int int31 = dateMidnight30.getYearOfEra();
        org.joda.time.Chronology chronology32 = dateMidnight30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.clockhourOfDay();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology32);
        org.joda.time.DateMidnight dateMidnight36 = dateTime35.toDateMidnight();
        org.joda.time.DateTime.Property property37 = dateTime35.centuryOfEra();
        boolean boolean38 = duration24.equals((java.lang.Object) dateTime35);
        org.joda.time.Duration duration39 = duration21.plus((org.joda.time.ReadableDuration) duration24);
        long long40 = duration39.getMillis();
        java.util.Locale locale41 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleKeys();
        strSet42.clear();
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType45 = periodType44.withWeeksRemoved();
        java.lang.String str46 = periodType44.getName();
        boolean boolean47 = strSet42.contains((java.lang.Object) periodType44);
        org.joda.time.PeriodType periodType48 = periodType44.withMinutesRemoved();
        org.joda.time.PeriodType periodType49 = periodType44.withMonthsRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology56);
        mutablePeriod57.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod57.add(0L);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(chronology66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.minusDays((int) (short) -1);
        int int70 = dateMidnight69.getYearOfEra();
        org.joda.time.Chronology chronology71 = dateMidnight69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology71);
        mutablePeriod57.add(0L, chronology71);
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight((long) (-1), chronology71);
        org.joda.time.DateTimeField dateTimeField75 = dateTimeFieldType52.getField(chronology71);
        org.joda.time.DurationField durationField76 = chronology71.centuries();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate((long) (short) 0, chronology71);
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(50400L, chronology71);
        org.joda.time.DateTimeField dateTimeField79 = chronology71.era();
        org.joda.time.Period period80 = duration39.toPeriod(periodType49, chronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField76", (durationField18.compareTo(durationField76) == 0) == durationField18.equals(durationField76));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration5 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration3, 12);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology9);
        mutablePeriod10.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod10.add(0L);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        mutablePeriod10.add(0L, chronology24);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (-1), chronology24);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = dateMidnight27.toMutableDateTime(chronology36);
        org.joda.time.Duration duration42 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime39.add((org.joda.time.ReadableDuration) duration42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.hourOfDay();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime39.centuryOfEra();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) mutableDateTime39);
        mutableDateTime39.setDayOfYear(16);
        org.joda.time.Instant instant49 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime mutableDateTime50 = instant49.toMutableDateTime();
        mutableDateTime50.setHourOfDay((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime39 and instant49", (mutableDateTime39.compareTo(instant49) == 0) == mutableDateTime39.equals(instant49));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 10, chronology25);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMonths(10);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 10, chronology38);
        org.joda.time.DateTime dateTime41 = dateTime29.toDateTime(chronology38);
        org.joda.time.DurationField durationField42 = chronology38.days();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property48 = localDateTime45.yearOfEra();
        org.joda.time.LocalDateTime localDateTime49 = property48.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime50 = property48.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime51 = property48.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.withMillisOfSecond(21);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        int int59 = dateMidnight58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateMidnight58.getChronology();
        long long61 = dateMidnight58.getMillis();
        java.util.Locale locale65 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar66 = dateMidnight58.toCalendar(locale65);
        java.lang.String str67 = dateTimeField43.getAsShortText((org.joda.time.ReadablePartial) localDateTime51, 69, locale65);
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone14, locale65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar66", (calendar11.compareTo(calendar66) == 0) == calendar11.equals(calendar66));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.Instant instant10 = instant6.withDurationAdded(99L, 2000);
        org.joda.time.Instant instant11 = instant6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime12 = instant6.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((-3));
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        long long11 = dateMidnight8.getMillis();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.Period period13 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight8.toMutableDateTimeISO();
        int int15 = mutableDateTime14.getDayOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        mutableDateTime14.setChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField26 = chronology23.year();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = chronology23.add(readablePeriod27, 68400007L, 32778);
        org.joda.time.DateTime dateTime31 = dateTime2.toDateTime(chronology23);
        org.joda.time.DateTime.Property property32 = dateTime31.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime31", (instant1.compareTo(dateTime31) == 0) == instant1.equals(dateTime31));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(53, 4, 528);
        java.util.Calendar.Builder builder9 = builder4.setTimeOfDay(23, 726, 32778, 7);
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        calendar11.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar11.setFirstDayOfWeek(11);
        calendar11.setMinimalDaysInFirstWeek(363);
        java.util.TimeZone timeZone18 = calendar11.getTimeZone();
        java.util.Calendar.Builder builder19 = builder9.setTimeZone(timeZone18);
        java.util.Calendar.Builder builder20 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder22 = builder20.setInstant(4320000000L);
        java.util.Calendar.Builder builder24 = builder22.setInstant((long) (short) 100);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        long long31 = dateMidnight28.getMillis();
        java.util.Locale locale35 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar36 = dateMidnight28.toCalendar(locale35);
        int int38 = calendar36.getLeastMaximum(3);
        java.util.TimeZone timeZone39 = calendar36.getTimeZone();
        timeZone39.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone39);
        java.util.Calendar.Builder builder43 = builder22.setTimeZone(timeZone39);
        java.util.Calendar.Builder builder45 = builder43.setInstant((long) 366);
        java.util.Calendar.Builder builder47 = builder43.setLenient(true);
        java.util.Calendar.Builder builder48 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder50 = builder48.setInstant(4320000000L);
        java.util.Calendar.Builder builder52 = builder50.setInstant((long) (short) 100);
        java.util.Calendar calendar53 = builder50.build();
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(locale54);
        calendar55.setFirstDayOfWeek(24);
        calendar55.setTimeInMillis((-1L));
        java.util.TimeZone timeZone60 = calendar55.getTimeZone();
        java.util.TimeZone timeZone61 = java.util.TimeZone.getDefault();
        boolean boolean62 = timeZone60.hasSameRules(timeZone61);
        java.util.Locale locale66 = new java.util.Locale("ISOChronology[Etc/UTC]", "24", "Days");
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleAttributes();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone61, locale66);
        calendar53.setTimeZone(timeZone61);
        java.util.Calendar.Builder builder70 = builder43.setTimeZone(timeZone61);
        java.util.Calendar.Builder builder71 = builder19.setTimeZone(timeZone61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar68", (calendar11.compareTo(calendar68) == 0) == calendar11.equals(calendar68));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Period period51 = duration50.toPeriod();
        org.joda.time.Interval interval52 = interval48.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        long long49 = instant47.getMillis();
        org.joda.time.Instant instant51 = instant47.plus((-2100623334000L));
        org.joda.time.Instant instant53 = instant51.minus((long) 9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(7);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property64 = dateTime61.centuryOfEra();
        int int65 = dateTime61.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime61.getZone();
        org.joda.time.Interval interval67 = interval48.withStart((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Duration duration69 = org.joda.time.Duration.standardHours(10L);
        long long70 = duration69.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight71.withMillis((long) 24);
        long long74 = dateMidnight73.getMillis();
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration69, (org.joda.time.ReadableInstant) dateMidnight73);
        org.joda.time.Period period76 = duration69.toPeriod();
        org.joda.time.Period period78 = period76.minusMillis((int) (short) 10);
        int int79 = period78.getMinutes();
        int int80 = period78.getMonths();
        org.joda.time.Interval interval81 = interval67.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        java.lang.String str3 = calendar1.getCalendarType();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology7);
        mutablePeriod8.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod8.add(0L);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        mutablePeriod8.add(0L, chronology22);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (-1), chronology22);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (short) 10, chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = dateMidnight25.toMutableDateTime(chronology34);
        org.joda.time.DurationField durationField38 = chronology34.minutes();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology34.getZone();
        boolean boolean40 = dateTimeZone39.isFixed();
        java.util.TimeZone timeZone41 = dateTimeZone39.toTimeZone();
        java.lang.String str42 = timeZone41.getID();
        calendar1.setTimeZone(timeZone41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        int int48 = dateMidnight47.getYearOfEra();
        org.joda.time.Chronology chronology49 = dateMidnight47.getChronology();
        long long50 = dateMidnight47.getMillis();
        java.util.Locale locale54 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar55 = dateMidnight47.toCalendar(locale54);
        int int57 = calendar55.getLeastMaximum(3);
        java.util.TimeZone timeZone58 = calendar55.getTimeZone();
        int int59 = timeZone58.getRawOffset();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone58);
        calendar1.setTimeZone(timeZone58);
        java.util.Locale locale62 = java.util.Locale.UK;
        java.lang.String str63 = locale62.getISO3Country();
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone58, locale62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar60", (calendar1.compareTo(calendar60) == 0) == calendar1.equals(calendar60));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        java.lang.String str17 = timeZone14.getID();
        java.lang.String str18 = timeZone14.getID();
        java.lang.String str19 = timeZone14.getID();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        calendar21.setFirstDayOfWeek(24);
        calendar21.setTimeInMillis((-1L));
        java.util.TimeZone timeZone26 = calendar21.getTimeZone();
        int int27 = calendar21.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        long long34 = dateMidnight31.getMillis();
        java.util.Locale locale38 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar39 = dateMidnight31.toCalendar(locale38);
        int int41 = calendar39.getLeastMaximum(3);
        java.util.TimeZone timeZone42 = calendar39.getTimeZone();
        int int43 = timeZone42.getRawOffset();
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone42);
        calendar21.setTimeZone(timeZone42);
        boolean boolean46 = timeZone14.hasSameRules(timeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar39", (calendar11.compareTo(calendar39) == 0) == calendar11.equals(calendar39));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(53, 4, 528);
        java.util.Calendar.Builder builder9 = builder4.setTimeOfDay(23, 726, 32778, 7);
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        calendar11.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar11.setFirstDayOfWeek(11);
        calendar11.setMinimalDaysInFirstWeek(363);
        java.util.TimeZone timeZone18 = calendar11.getTimeZone();
        java.util.Calendar.Builder builder19 = builder9.setTimeZone(timeZone18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.withZoneRetainFields(dateTimeZone24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        long long32 = dateMidnight29.getMillis();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableDuration33, readableInstant34);
        org.joda.time.PeriodType periodType36 = period35.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight25, (org.joda.time.ReadableInstant) dateMidnight29, periodType36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight29.withWeekyear(59);
        java.util.Locale locale42 = new java.util.Locale("PeriodType[Standard]", "");
        java.util.Calendar calendar43 = dateMidnight29.toCalendar(locale42);
        java.util.Calendar.Builder builder44 = builder9.setLocale(locale42);
        java.util.Locale locale45 = java.util.Locale.PRC;
        java.lang.String str46 = locale45.toLanguageTag();
        java.util.Locale locale50 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Locale locale51 = java.util.Locale.JAPAN;
        boolean boolean52 = locale51.hasExtensions();
        java.lang.String str53 = locale51.getDisplayCountry();
        java.lang.String str54 = locale50.getDisplayScript(locale51);
        java.lang.String str55 = locale45.getDisplayVariant(locale51);
        java.util.Set<java.lang.String> strSet56 = locale45.getUnicodeLocaleKeys();
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(locale45);
        java.lang.String str58 = locale42.getDisplayVariant(locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar57", (calendar11.compareTo(calendar57) == 0) == calendar11.equals(calendar57));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        java.util.Date date50 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay51 = org.joda.time.YearMonthDay.fromDateFields(date50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay51.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField53 = property52.getField();
        org.joda.time.DateTimeField dateTimeField54 = property52.getField();
        org.joda.time.YearMonthDay yearMonthDay55 = property52.withMinimumValue();
        boolean boolean56 = interval48.equals((java.lang.Object) yearMonthDay55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours(10L);
        long long6 = duration5.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration5);
        long long8 = duration5.getStandardDays();
        org.joda.time.Instant instant10 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime11 = instant10.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.Duration duration18 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableDuration) duration18);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) 528, (-2100623334000L));
        org.joda.time.Duration duration24 = duration22.plus((long) 3);
        org.joda.time.Duration duration25 = duration24.toDuration();
        mutablePeriod19.setPeriod((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Instant instant27 = instant10.minus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration29 = duration5.withDurationAdded((org.joda.time.ReadableDuration) duration25, 870);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime11", (instant10.compareTo(dateTime11) == 0) == instant10.equals(dateTime11));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(19);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology18);
        mutablePeriod19.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod19.add(0L);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        mutablePeriod19.add(0L, chronology33);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (-1), chronology33);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        int int44 = dateMidnight43.getYearOfEra();
        org.joda.time.Chronology chronology45 = dateMidnight43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 10, chronology45);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight36.toMutableDateTime(chronology45);
        mutableDateTime48.setWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) 22, dateTimeZone53);
        mutableDateTime48.setZoneRetainFields(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(528, 16);
        long long60 = dateTimeZone53.getMillisKeepLocal(dateTimeZone58, (long) 50);
        org.joda.time.DateTime dateTime61 = dateTime12.withZone(dateTimeZone58);
        org.joda.time.DateTime dateTime63 = dateTime12.plusDays(10);
        org.joda.time.DateTime.Property property64 = dateTime63.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime61", (dateTime12.compareTo(dateTime61) == 0) == dateTime12.equals(dateTime61));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime10 = yearMonthDay9.toDateTimeAtMidnight();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateTime10);
        java.lang.String str12 = interval11.toString();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval14 = yearMonthDay13.toInterval();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval16 = yearMonthDay15.toInterval();
        org.joda.time.Interval interval17 = interval14.gap((org.joda.time.ReadableInterval) interval16);
        boolean boolean19 = interval14.isBefore(100L);
        java.lang.String str20 = interval14.toString();
        boolean boolean21 = interval11.isBefore((org.joda.time.ReadableInterval) interval14);
        org.joda.time.Chronology chronology22 = interval11.getChronology();
        org.joda.time.Duration duration23 = interval11.toDuration();
        org.joda.time.Instant instant25 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime26 = instant25.toDateTimeISO();
        org.joda.time.DateTime dateTime28 = dateTime26.plusWeeks((-3));
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.standard();
        org.joda.time.Period period30 = duration23.toPeriodTo((org.joda.time.ReadableInstant) dateTime26, periodType29);
        org.joda.time.Duration duration31 = duration23.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant25 and dateTime26", (instant25.compareTo(dateTime26) == 0) == instant25.equals(dateTime26));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setMinimalDaysInFirstWeek((int) (short) 1);
        boolean boolean5 = calendar1.before((java.lang.Object) 18748801970L);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromCalendarFields(calendar1);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromCalendarFields(calendar8);
        java.lang.String str10 = calendar8.getCalendarType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology14);
        mutablePeriod15.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod15.add(0L);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        int int28 = dateMidnight27.getYearOfEra();
        org.joda.time.Chronology chronology29 = dateMidnight27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology29);
        mutablePeriod15.add(0L, chronology29);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (-1), chronology29);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusDays((int) (short) -1);
        int int40 = dateMidnight39.getYearOfEra();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (short) 10, chronology41);
        org.joda.time.MutableDateTime mutableDateTime44 = dateMidnight32.toMutableDateTime(chronology41);
        org.joda.time.DurationField durationField45 = chronology41.minutes();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology41.getZone();
        boolean boolean47 = dateTimeZone46.isFixed();
        java.util.TimeZone timeZone48 = dateTimeZone46.toTimeZone();
        java.lang.String str49 = timeZone48.getID();
        calendar8.setTimeZone(timeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(chronology51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.minusDays((int) (short) -1);
        int int55 = dateMidnight54.getYearOfEra();
        org.joda.time.Chronology chronology56 = dateMidnight54.getChronology();
        long long57 = dateMidnight54.getMillis();
        java.util.Locale locale61 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar62 = dateMidnight54.toCalendar(locale61);
        int int64 = calendar62.getLeastMaximum(3);
        java.util.TimeZone timeZone65 = calendar62.getTimeZone();
        int int66 = timeZone65.getRawOffset();
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone65);
        calendar8.setTimeZone(timeZone65);
        calendar1.setTimeZone(timeZone65);
        java.lang.String str70 = timeZone65.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar8", (calendar1.compareTo(calendar8) == 0) == calendar1.equals(calendar8));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        long long8 = dateMidnight5.getMillis();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.days();
        org.joda.time.Period period10 = duration3.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight5, periodType9);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime12 = yearMonthDay11.toDateTimeAtMidnight();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period10, (org.joda.time.ReadableInstant) dateTime12);
        boolean boolean14 = interval1.abuts((org.joda.time.ReadableInterval) interval13);
        long long15 = interval13.getEndMillis();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        long long28 = dateMidnight25.getMillis();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight25.withMillis((long) 7);
        org.joda.time.Interval interval31 = dateMidnight30.toInterval();
        mutablePeriod23.setPeriod((org.joda.time.ReadableInterval) interval31);
        boolean boolean33 = interval13.overlaps((org.joda.time.ReadableInterval) interval31);
        java.lang.String str34 = interval31.toString();
        org.joda.time.MutableInterval mutableInterval35 = interval31.toMutableInterval();
        org.joda.time.Instant instant37 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime38 = instant37.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.Duration duration45 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration49 = new org.joda.time.Duration((long) 528, (-2100623334000L));
        org.joda.time.Duration duration51 = duration49.plus((long) 3);
        org.joda.time.Duration duration52 = duration51.toDuration();
        mutablePeriod46.setPeriod((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Instant instant54 = instant37.minus((org.joda.time.ReadableDuration) duration52);
        boolean boolean55 = mutableInterval35.equals((java.lang.Object) duration52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight30 and instant37", (dateMidnight30.compareTo(instant37) == 0) == dateMidnight30.equals(instant37));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate.Property property6 = localDate4.weekyear();
        int int7 = localDate4.getCenturyOfEra();
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtMidnight();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant13 = instant11.plus(1L);
        org.joda.time.Instant instant16 = instant13.withDurationAdded((long) 54152181, (-1));
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration22 = duration18.withDurationAdded((org.joda.time.ReadableDuration) duration20, 12);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableDuration) duration29);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusDays((int) (short) -1);
        int int38 = dateMidnight37.getYearOfEra();
        org.joda.time.Chronology chronology39 = dateMidnight37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (short) 10, chronology39);
        org.joda.time.DateTime dateTime43 = dateTime41.minusHours(7);
        org.joda.time.DateTime dateTime45 = dateTime43.plusYears((int) (byte) 0);
        int int46 = dateTime45.getMonthOfYear();
        org.joda.time.Interval interval47 = duration29.toIntervalFrom((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration48 = duration18.minus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration51 = duration48.withDurationAdded(4320000000L, 16);
        org.joda.time.Instant instant53 = instant16.withDurationAdded((org.joda.time.ReadableDuration) duration48, (int) (byte) 100);
        boolean boolean54 = interval9.isBefore((org.joda.time.ReadableInstant) instant16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant13", (dateTime8.compareTo(instant13) == 0) == dateTime8.equals(instant13));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((-3));
        org.joda.time.DateTime dateTime5 = dateTime4.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        int int4 = localDate1.getCenturyOfEra();
        org.joda.time.DateTime dateTime5 = localDate1.toDateTimeAtCurrentTime();
        int int6 = localDate1.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone9);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology19.getZone();
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone22);
        long long25 = dateTimeZone9.getMillisKeepLocal(dateTimeZone22, (long) 667);
        org.joda.time.DateMidnight dateMidnight26 = localDate1.toDateMidnight(dateTimeZone22);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone22);
        int int28 = dateTime27.getYearOfEra();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withZoneRetainFields(dateTimeZone33);
        org.joda.time.Instant instant35 = dateMidnight34.toInstant();
        org.joda.time.Chronology chronology36 = instant35.getChronology();
        org.joda.time.Instant instant39 = instant35.withDurationAdded(99L, 2000);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) instant39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and instant35", (dateMidnight17.compareTo(instant35) == 0) == dateMidnight17.equals(instant35));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((-3));
        org.joda.time.Duration duration8 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        long long13 = dateMidnight10.getMillis();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withMillis((long) 7);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, (org.joda.time.ReadableInstant) dateMidnight10, periodType16);
        int int18 = dateMidnight10.getDayOfMonth();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology23);
        mutablePeriod24.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod24.add(0L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        mutablePeriod24.add(0L, chronology38);
        org.joda.time.Period period41 = new org.joda.time.Period((long) 0, (long) 6, chronology38);
        org.joda.time.DateTime dateTime42 = dateMidnight10.toDateTime(chronology38);
        java.util.Locale locale43 = java.util.Locale.KOREA;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(100L, chronology38, locale43, (java.lang.Integer) 6);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeParserBucket45.getZone();
        dateTimeParserBucket45.setOffset(69);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket45.getChronology();
        org.joda.time.DateTimeZone dateTimeZone50 = chronology49.getZone();
        org.joda.time.DateTimeField dateTimeField51 = chronology49.year();
        org.joda.time.DateTime dateTime52 = dateTime4.toDateTime(chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTime();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', periodType9, chronology10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        mutableDateTime7.add((org.joda.time.ReadablePeriod) period11, 54202913);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        org.joda.time.DateMidnight dateMidnight8 = property7.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight9 = property7.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight10 = property7.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minus((long) 363);
        org.joda.time.Instant instant14 = org.joda.time.Instant.parse("1970");
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withZoneRetainFields(dateTimeZone19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        long long27 = dateMidnight24.getMillis();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableDuration28, readableInstant29);
        org.joda.time.PeriodType periodType31 = period30.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) dateMidnight24, periodType31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours(10L);
        long long39 = duration38.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight36, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight20.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Instant instant42 = instant14.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours(10L);
        long long45 = duration44.getStandardSeconds();
        org.joda.time.Duration duration48 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration49 = duration44.plus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration50 = duration48.toDuration();
        org.joda.time.Instant instant51 = instant42.plus((org.joda.time.ReadableDuration) duration50);
        boolean boolean52 = dateMidnight12.isAfter((org.joda.time.ReadableInstant) instant42);
        org.joda.time.DateTime dateTime53 = instant42.toDateTime();
        org.joda.time.DateTime dateTime54 = instant42.toDateTime();
        org.joda.time.DateTime dateTime56 = dateTime54.minusWeeks(54193192);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant42 and dateTime53", (instant42.compareTo(dateTime53) == 0) == instant42.equals(dateTime53));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(19);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology18);
        mutablePeriod19.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod19.add(0L);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        mutablePeriod19.add(0L, chronology33);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (-1), chronology33);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        int int44 = dateMidnight43.getYearOfEra();
        org.joda.time.Chronology chronology45 = dateMidnight43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 10, chronology45);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight36.toMutableDateTime(chronology45);
        mutableDateTime48.setWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) 22, dateTimeZone53);
        mutableDateTime48.setZoneRetainFields(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(528, 16);
        long long60 = dateTimeZone53.getMillisKeepLocal(dateTimeZone58, (long) 50);
        org.joda.time.DateTime dateTime61 = dateTime12.withZone(dateTimeZone58);
        int int63 = dateTimeZone58.getStandardOffset(1645455778071L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime61", (dateTime12.compareTo(dateTime61) == 0) == dateTime12.equals(dateTime61));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod7.add(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutablePeriod7.add(0L, chronology21);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (-1), chronology21);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType2.getField(chronology21);
        org.joda.time.DurationField durationField26 = chronology21.centuries();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 0, chronology21);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(50400L, chronology21);
        org.joda.time.DateTimeField dateTimeField29 = chronology21.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology21.eras();
        org.joda.time.DateTimeField dateTimeField31 = chronology21.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField30", Math.signum(durationField26.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField26)));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime40, dateTimeZone42);
        boolean boolean45 = dateTimeZone42.isFixed();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusWeeks(2922750);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and dateTime44", (mutableDateTime33.compareTo(dateTime44) == 0) == mutableDateTime33.equals(dateTime44));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology19);
        mutablePeriod20.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod20.add(0L);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        mutablePeriod20.add(0L, chronology34);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (-1), chronology34);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 10, chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight37.toMutableDateTime(chronology46);
        mutableDateTime49.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime49.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime49.toMutableDateTime(dateTimeZone53);
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = yearMonthDay55.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay55.toDateTimeAtCurrentTime(dateTimeZone57);
        org.joda.time.Duration duration59 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType63 = periodType62.withWeeksRemoved();
        org.joda.time.Period period64 = new org.joda.time.Period((long) 1970, (long) 3, periodType62);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration59, periodType62);
        org.joda.time.DateTime.Property property66 = dateTime14.dayOfYear();
        org.joda.time.DateTime.Property property67 = dateTime14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate70 = org.joda.time.LocalDate.now(dateTimeZone69);
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone69);
        org.joda.time.Duration duration74 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime71, (org.joda.time.ReadableDuration) duration74);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology80);
        mutablePeriod81.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod81.add(0L);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.DateMidnight dateMidnight91 = new org.joda.time.DateMidnight(chronology90);
        org.joda.time.DateMidnight dateMidnight93 = dateMidnight91.minusDays((int) (short) -1);
        int int94 = dateMidnight93.getYearOfEra();
        org.joda.time.Chronology chronology95 = dateMidnight93.getChronology();
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology95);
        mutablePeriod81.add(0L, chronology95);
        boolean boolean98 = dateTimeFieldType77.isSupported(chronology95);
        org.joda.time.MutableDateTime mutableDateTime99 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime14, chronology95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime58 and dateTime71", (dateTime58.compareTo(dateTime71) == 0) == dateTime58.equals(dateTime71));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight3.toMutableDateTimeISO();
        int int10 = mutableDateTime9.getDayOfYear();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutableDateTime9.setChronology(chronology18);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology24);
        mutablePeriod25.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod25.add(0L);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusDays((int) (short) -1);
        int int38 = dateMidnight37.getYearOfEra();
        org.joda.time.Chronology chronology39 = dateMidnight37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology39);
        mutablePeriod25.add(0L, chronology39);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (-1), chronology39);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        int int50 = dateMidnight49.getYearOfEra();
        org.joda.time.Chronology chronology51 = dateMidnight49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (short) 10, chronology51);
        org.joda.time.MutableDateTime mutableDateTime54 = dateMidnight42.toMutableDateTime(chronology51);
        mutableDateTime54.setWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) 22, dateTimeZone59);
        mutableDateTime54.setZoneRetainFields(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = mutableDateTime9.toDateTime(dateTimeZone59);
        org.joda.time.Chronology chronology63 = mutableDateTime9.getChronology();
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        mutableDateTime9.add(readablePeriod64, 0);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime9.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and dateTime62", (dateMidnight3.compareTo(dateTime62) == 0) == dateMidnight3.equals(dateTime62));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) '#');
        int int13 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) '4');
        org.joda.time.LocalDate localDate17 = localDate15.minusYears(1);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (short) 10, chronology26);
        org.joda.time.DateTime dateTime30 = dateTime28.minusHours(7);
        org.joda.time.DateTime dateTime32 = dateTime30.plusYears((int) (byte) 0);
        int int33 = dateTime32.getMonthOfYear();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology37);
        mutablePeriod38.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod38.add(0L);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(chronology47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.minusDays((int) (short) -1);
        int int51 = dateMidnight50.getYearOfEra();
        org.joda.time.Chronology chronology52 = dateMidnight50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology52);
        mutablePeriod38.add(0L, chronology52);
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((long) (-1), chronology52);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(chronology59);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight60.minusDays((int) (short) -1);
        int int63 = dateMidnight62.getYearOfEra();
        org.joda.time.Chronology chronology64 = dateMidnight62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (short) 10, chronology64);
        org.joda.time.MutableDateTime mutableDateTime67 = dateMidnight55.toMutableDateTime(chronology64);
        mutableDateTime67.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime67.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime67.toMutableDateTime(dateTimeZone71);
        org.joda.time.YearMonthDay yearMonthDay73 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray74 = yearMonthDay73.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = yearMonthDay73.toDateTimeAtCurrentTime(dateTimeZone75);
        org.joda.time.Duration duration77 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime67, (org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.PeriodType periodType80 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType81 = periodType80.withWeeksRemoved();
        org.joda.time.Period period82 = new org.joda.time.Period((long) 1970, (long) 3, periodType80);
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableDuration) duration77, periodType80);
        org.joda.time.DateTime.Property property84 = dateTime32.dayOfYear();
        org.joda.time.DateTime.Property property85 = dateTime32.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate88 = org.joda.time.LocalDate.now(dateTimeZone87);
        org.joda.time.DateTime dateTime89 = org.joda.time.DateTime.now(dateTimeZone87);
        org.joda.time.Duration duration92 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime89, (org.joda.time.ReadableDuration) duration92);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.LocalDate localDate95 = localDate15.plus((org.joda.time.ReadablePeriod) mutablePeriod94);
        mutablePeriod94.addMillis(32770);
        mutablePeriod94.addMonths(1968);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime76 and dateTime89", (dateTime76.compareTo(dateTime89) == 0) == dateTime76.equals(dateTime89));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate.Property property6 = localDate4.weekyear();
        int int7 = localDate4.getCenturyOfEra();
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtMidnight();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.Interval interval18 = interval9.withDurationAfterStart((org.joda.time.ReadableDuration) duration16);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval20 = yearMonthDay19.toInterval();
        org.joda.time.Interval interval21 = interval9.overlap((org.joda.time.ReadableInterval) interval20);
        long long22 = interval20.getEndMillis();
        boolean boolean23 = interval20.isBeforeNow();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.halfdayOfDay();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) '#');
        int int37 = dateTimeField34.getMinimumValue((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.LocalDate localDate39 = localDate36.withYearOfEra((int) '4');
        org.joda.time.DateTimeField dateTimeField41 = localDate36.getField((int) (byte) 0);
        org.joda.time.LocalDate localDate43 = localDate36.plusYears(8);
        int int44 = localDate43.getWeekOfWeekyear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.minusDays((int) (short) -1);
        int int52 = dateMidnight51.getYearOfEra();
        org.joda.time.Chronology chronology53 = dateMidnight51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 10, chronology53);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean57 = dateTime55.isSupported(dateTimeFieldType56);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusDays((int) (short) -1);
        int int64 = dateMidnight63.getYearOfEra();
        org.joda.time.Chronology chronology65 = dateMidnight63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.clockhourOfDay();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(chronology65);
        org.joda.time.DateTime dateTime70 = dateTime68.minusSeconds(4);
        org.joda.time.DateTimeZone dateTimeZone71 = dateTime70.getZone();
        org.joda.time.DateTime dateTime72 = dateTime55.toDateTime(dateTimeZone71);
        org.joda.time.Interval interval73 = localDate43.toInterval(dateTimeZone71);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight(chronology76);
        org.joda.time.DateMidnight dateMidnight79 = dateMidnight77.minusDays((int) (short) -1);
        int int80 = dateMidnight79.getYearOfEra();
        org.joda.time.Chronology chronology81 = dateMidnight79.getChronology();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology81);
        org.joda.time.YearMonthDay yearMonthDay83 = new org.joda.time.YearMonthDay(chronology81);
        org.joda.time.DurationField durationField84 = chronology81.centuries();
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime(chronology81);
        boolean boolean86 = interval73.isAfter((org.joda.time.ReadableInstant) mutableDateTime85);
        boolean boolean87 = interval20.overlaps((org.joda.time.ReadableInterval) interval73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime68", (dateTime13.compareTo(dateTime68) == 0) == dateTime13.equals(dateTime68));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.format.PeriodFormatter periodFormatter2 = null;
        java.lang.String str3 = mutablePeriod1.toString(periodFormatter2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        int int6 = dateMidnight5.getMillisOfSecond();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', periodType8, chronology9);
        org.joda.time.Period period12 = period10.withDays((int) ' ');
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadablePeriod) period12);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval15 = yearMonthDay14.toInterval();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        long long22 = dateMidnight19.getMillis();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.Period period24 = duration17.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight19, periodType23);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime26 = yearMonthDay25.toDateTimeAtMidnight();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period24, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean28 = interval15.abuts((org.joda.time.ReadableInterval) interval27);
        org.joda.time.Interval interval29 = interval13.overlap((org.joda.time.ReadableInterval) interval27);
        long long30 = interval13.getEndMillis();
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval32 = yearMonthDay31.toInterval();
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval34 = yearMonthDay33.toInterval();
        org.joda.time.Interval interval35 = interval32.gap((org.joda.time.ReadableInterval) interval34);
        boolean boolean36 = interval13.abuts((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.minusDays((int) (short) -1);
        long long41 = dateMidnight38.getMillis();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight38.withMillis((long) 7);
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        long long50 = dateMidnight47.getMillis();
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.days();
        org.joda.time.Period period52 = duration45.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight47, periodType51);
        org.joda.time.MutableDateTime mutableDateTime53 = dateMidnight47.toMutableDateTimeISO();
        int int54 = dateMidnight43.compareTo((org.joda.time.ReadableInstant) mutableDateTime53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight43.plusWeeks(10);
        org.joda.time.Interval interval57 = dateMidnight56.toInterval();
        boolean boolean58 = interval13.abuts((org.joda.time.ReadableInterval) interval57);
        mutablePeriod1.add((org.joda.time.ReadableInterval) interval13);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str62 = localDate61.toString();
        org.joda.time.LocalDate.Property property63 = localDate61.weekyear();
        org.joda.time.LocalDate localDate65 = localDate61.plusWeeks((int) (byte) 1);
        java.util.Date date67 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay68 = org.joda.time.YearMonthDay.fromDateFields(date67);
        org.joda.time.YearMonthDay.Property property69 = yearMonthDay68.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay70 = property69.getYearMonthDay();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(chronology73);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight74.minusDays((int) (short) -1);
        int int77 = dateMidnight76.getYearOfEra();
        org.joda.time.Chronology chronology78 = dateMidnight76.getChronology();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology78);
        org.joda.time.DateTimeField dateTimeField80 = chronology78.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone81 = chronology78.getZone();
        org.joda.time.DateTime dateTime82 = yearMonthDay70.toDateTimeAtCurrentTime(dateTimeZone81);
        long long84 = dateTimeZone81.previousTransition((long) '#');
        org.joda.time.DateTime dateTime85 = localDate65.toDateTimeAtStartOfDay(dateTimeZone81);
        org.joda.time.DateMidnight dateMidnight86 = new org.joda.time.DateMidnight(dateTimeZone81);
        org.joda.time.Instant instant87 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology88 = instant87.getChronology();
        org.joda.time.DateTime dateTime89 = instant87.toDateTimeISO();
        org.joda.time.Instant instant91 = instant87.withMillis(45960758L);
        mutablePeriod1.setPeriod((org.joda.time.ReadableInstant) dateMidnight86, (org.joda.time.ReadableInstant) instant91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant87 and dateTime89", (instant87.compareTo(dateTime89) == 0) == instant87.equals(dateTime89));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        java.util.GregorianCalendar gregorianCalendar4 = dateMidnight1.toGregorianCalendar();
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar4);
        int int7 = gregorianCalendar4.getGreatestMinimum(0);
        gregorianCalendar4.setMinimalDaysInFirstWeek((-24356254));
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology13);
        mutablePeriod14.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod14.add(0L);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        int int27 = dateMidnight26.getYearOfEra();
        org.joda.time.Chronology chronology28 = dateMidnight26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology28);
        mutablePeriod14.add(0L, chronology28);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (-1), chronology28);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (short) 10, chronology40);
        org.joda.time.MutableDateTime mutableDateTime43 = dateMidnight31.toMutableDateTime(chronology40);
        org.joda.time.DurationField durationField44 = chronology40.minutes();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology40.getZone();
        boolean boolean46 = dateTimeZone45.isFixed();
        int int48 = dateTimeZone45.getOffsetFromLocal(62135638488000L);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((java.lang.Object) gregorianCalendar4, dateTimeZone45);
        int int51 = gregorianCalendar4.getActualMinimum(3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateTime49", (dateMidnight1.compareTo(dateTime49) == 0) == dateMidnight1.equals(dateTime49));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((-3));
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        long long11 = dateMidnight8.getMillis();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.Period period13 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight8.toMutableDateTimeISO();
        int int15 = mutableDateTime14.getDayOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        mutableDateTime14.setChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField26 = chronology23.year();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = chronology23.add(readablePeriod27, 68400007L, 32778);
        org.joda.time.DateTime dateTime31 = dateTime2.toDateTime(chronology23);
        int int32 = dateTime31.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime31", (instant1.compareTo(dateTime31) == 0) == instant1.equals(dateTime31));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.Instant instant10 = instant6.withDurationAdded(99L, 2000);
        org.joda.time.Instant instant11 = instant6.toInstant();
        org.joda.time.Instant instant13 = instant6.minus((-1901759334L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        java.util.GregorianCalendar gregorianCalendar4 = dateMidnight1.toGregorianCalendar();
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar4);
        int int7 = gregorianCalendar4.getGreatestMinimum(0);
        gregorianCalendar4.setMinimalDaysInFirstWeek((-24356254));
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology13);
        mutablePeriod14.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod14.add(0L);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        int int27 = dateMidnight26.getYearOfEra();
        org.joda.time.Chronology chronology28 = dateMidnight26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology28);
        mutablePeriod14.add(0L, chronology28);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (-1), chronology28);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (short) 10, chronology40);
        org.joda.time.MutableDateTime mutableDateTime43 = dateMidnight31.toMutableDateTime(chronology40);
        org.joda.time.DurationField durationField44 = chronology40.minutes();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology40.getZone();
        boolean boolean46 = dateTimeZone45.isFixed();
        int int48 = dateTimeZone45.getOffsetFromLocal(62135638488000L);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((java.lang.Object) gregorianCalendar4, dateTimeZone45);
        java.lang.Object obj50 = gregorianCalendar4.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateTime49", (dateMidnight1.compareTo(dateTime49) == 0) == dateMidnight1.equals(dateTime49));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) 100, chronology11);
        org.joda.time.DurationField durationField15 = durationFieldType2.getField(chronology11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.hourOfDay();
        org.joda.time.DurationField durationField23 = durationFieldType2.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField24 = chronology21.dayOfYear();
        org.joda.time.Period period25 = new org.joda.time.Period((long) 21, periodType1, chronology21);
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology21);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight26.withDurationAdded((long) 100, 53);
        org.joda.time.Instant instant30 = dateMidnight26.toInstant();
        org.joda.time.DateMidnight.Property property31 = dateMidnight26.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight7 and instant30", (dateMidnight7.compareTo(instant30) == 0) == dateMidnight7.equals(instant30));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        long long49 = instant47.getMillis();
        org.joda.time.Instant instant51 = instant47.plus((-2100623334000L));
        org.joda.time.Instant instant52 = instant47.toInstant();
        org.joda.time.Instant instant54 = instant52.withMillis(1645455600001L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant52", (dateTime23.compareTo(instant52) == 0) == dateTime23.equals(instant52));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        boolean boolean3 = periodType1.equals((java.lang.Object) instant2);
        org.joda.time.PeriodType periodType4 = periodType1.withYearsRemoved();
        java.lang.String str5 = periodType1.getName();
        org.joda.time.PeriodType periodType6 = periodType1.withYearsRemoved();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        int int14 = dateMidnight13.getYearOfEra();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology15);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.millisOfDay();
        org.joda.time.DateTime dateTime29 = dateTime18.withChronology(chronology26);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) -1, chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.halfdayOfDay();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((-259200000L), periodType6, chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime18", (instant2.compareTo(dateTime18) == 0) == instant2.equals(dateTime18));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.Instant instant10 = instant6.withDurationAdded(99L, 2000);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) 15);
        org.joda.time.Instant instant14 = instant6.withDurationAdded((org.joda.time.ReadableDuration) duration12, 23);
        org.joda.time.Duration duration17 = duration12.withDurationAdded(1648166400035L, 26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setWeekOfWeekyear((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.secondOfMinute();
        java.lang.String str37 = mutableDateTime33.toString();
        int int38 = mutableDateTime33.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.weekOfWeekyear();
        mutableDateTime33.setYear(50);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        int int49 = dateMidnight48.getYearOfEra();
        org.joda.time.Chronology chronology50 = dateMidnight48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (short) 10, chronology50);
        org.joda.time.DateTime dateTime54 = dateTime52.plusSeconds(14);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateTime dateTime57 = dateTime52.withDurationAdded(readableDuration55, (int) (short) 100);
        boolean boolean58 = mutableDateTime33.isAfter((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        org.joda.time.DateTimeField dateTimeField68 = chronology66.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) 5, dateTimeZone70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.minusSeconds((int) '#');
        int int74 = dateTimeField68.getMaximumValue((org.joda.time.ReadablePartial) localDateTime71);
        org.joda.time.Chronology chronology75 = localDateTime71.getChronology();
        org.joda.time.DateTime dateTime76 = dateTime57.withChronology(chronology75);
        org.joda.time.DateTime.Property property77 = dateTime57.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime76", (dateTime32.compareTo(dateTime76) == 0) == dateTime32.equals(dateTime76));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((-3));
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        long long11 = dateMidnight8.getMillis();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.Period period13 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight8.toMutableDateTimeISO();
        int int15 = mutableDateTime14.getDayOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        mutableDateTime14.setChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField26 = chronology23.year();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = chronology23.add(readablePeriod27, 68400007L, 32778);
        org.joda.time.DateTime dateTime31 = dateTime2.toDateTime(chronology23);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay((long) 10, chronology33);
        org.joda.time.DateTimeField[] dateTimeFieldArray35 = timeOfDay34.getFields();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay((long) 10, chronology37);
        org.joda.time.DateTimeField[] dateTimeFieldArray39 = timeOfDay38.getFields();
        org.joda.time.Period period40 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay34, (org.joda.time.ReadablePartial) timeOfDay38);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean42 = timeOfDay38.isSupported(dateTimeFieldType41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        int int49 = dateMidnight48.getYearOfEra();
        org.joda.time.Chronology chronology50 = dateMidnight48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.clockhourOfDay();
        boolean boolean53 = dateTimeFieldType41.isSupported(chronology50);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(chronology50);
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(chronology50);
        int int56 = dateTime55.getSecondOfDay();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime31", (instant1.compareTo(dateTime31) == 0) == instant1.equals(dateTime31));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        int int13 = dateTime12.getCenturyOfEra();
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTimeISO();
        org.joda.time.DateTime dateTime16 = dateTime12.plusDays(0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime22 = dateTime20.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime23 = dateTime20.toDateTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology31);
        org.joda.time.DateTime dateTime33 = dateTime23.withChronology(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime16.toDateTime(chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime33", (dateTime20.compareTo(dateTime33) == 0) == dateTime20.equals(dateTime33));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) 10, chronology14);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds(14);
        boolean boolean19 = dateMidnight5.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTimeISO();
        org.joda.time.DateTime dateTime21 = dateTime18.toDateTime();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology25);
        mutablePeriod26.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod26.add(0L);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        mutablePeriod26.add(0L, chronology40);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (-1), chronology40);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(chronology47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.minusDays((int) (short) -1);
        int int51 = dateMidnight50.getYearOfEra();
        org.joda.time.Chronology chronology52 = dateMidnight50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (short) 10, chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = dateMidnight43.toMutableDateTime(chronology52);
        mutableDateTime55.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime55.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime55.toMutableDateTime(dateTimeZone59);
        int int61 = mutableDateTime60.getSecondOfMinute();
        mutableDateTime60.setWeekyear(53);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str66 = localDate65.toString();
        org.joda.time.LocalDate.Property property67 = localDate65.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = localDate65.toString(dateTimeFormatter68);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(dateTimeZone71);
        int int74 = dateTimeZone71.getOffsetFromLocal((long) (short) -1);
        java.lang.String str75 = dateTimeZone71.getID();
        org.joda.time.DateTime dateTime76 = localDate65.toDateTimeAtCurrentTime(dateTimeZone71);
        mutableDateTime60.setZone(dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime21.toMutableDateTime(dateTimeZone71);
        org.joda.time.DateTime.Property property79 = dateTime21.minuteOfHour();
        org.joda.time.DateTime dateTime81 = dateTime21.withCenturyOfEra(321);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and mutableDateTime78", (dateTime21.compareTo(mutableDateTime78) == 0) == dateTime21.equals(mutableDateTime78));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        int int11 = dateMidnight10.getYearOfEra();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        long long13 = dateMidnight10.getMillis();
        org.joda.time.DateMidnight.Property property14 = dateMidnight10.weekyear();
        org.joda.time.DateMidnight dateMidnight15 = property14.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight16 = property14.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property14.getFieldType();
        org.joda.time.DateMidnight dateMidnight18 = property14.roundHalfFloorCopy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology22);
        mutablePeriod23.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod23.add(0L);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology37);
        mutablePeriod23.add(0L, chronology37);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (-1), chronology37);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        int int48 = dateMidnight47.getYearOfEra();
        org.joda.time.Chronology chronology49 = dateMidnight47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (short) 10, chronology49);
        org.joda.time.MutableDateTime mutableDateTime52 = dateMidnight40.toMutableDateTime(chronology49);
        org.joda.time.DateMidnight.Property property53 = dateMidnight40.dayOfMonth();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval57 = yearMonthDay56.toInterval();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.YearMonthDay yearMonthDay59 = yearMonthDay56.withChronologyRetainFields(chronology58);
        org.joda.time.DateTime dateTime60 = yearMonthDay56.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight(chronology63);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.minusDays((int) (short) -1);
        int int67 = dateMidnight66.getYearOfEra();
        org.joda.time.Chronology chronology68 = dateMidnight66.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField71 = chronology68.halfdayOfDay();
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate((long) '#');
        int int74 = dateTimeField71.getMinimumValue((org.joda.time.ReadablePartial) localDate73);
        org.joda.time.Period period75 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate76 = localDate73.plus((org.joda.time.ReadablePeriod) period75);
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay56.minus((org.joda.time.ReadablePeriod) period75);
        java.lang.String str78 = yearMonthDay56.toString();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime81 = yearMonthDay56.toDateTimeAtMidnight(dateTimeZone80);
        org.joda.time.Interval interval82 = localDate55.toInterval(dateTimeZone80);
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight40.withZoneRetainFields(dateTimeZone80);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight18.withZoneRetainFields(dateTimeZone80);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(39312000000L, dateTimeZone80);
        long long87 = dateTimeZone2.getMillisKeepLocal(dateTimeZone80, 1645455767309L);
        int int89 = dateTimeZone2.getOffset(1648166400001L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime60", (dateTime4.compareTo(dateTime60) == 0) == dateTime4.equals(dateTime60));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight1.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight1.minus((org.joda.time.ReadableDuration) duration11);
        long long14 = duration11.getStandardSeconds();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 10, chronology23);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours(7);
        org.joda.time.DateTime dateTime29 = dateTime27.plusYears((int) (byte) 0);
        int int30 = dateTime29.getDayOfYear();
        java.lang.String str32 = dateTime29.toString("2022/02/21 15:02:53");
        java.util.Date date34 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay35 = org.joda.time.YearMonthDay.fromDateFields(date34);
        org.joda.time.YearMonthDay.Property property36 = yearMonthDay35.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay37 = property36.getYearMonthDay();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        int int44 = dateMidnight43.getYearOfEra();
        org.joda.time.Chronology chronology45 = dateMidnight43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = chronology45.getZone();
        org.joda.time.DateTime dateTime49 = yearMonthDay37.toDateTimeAtCurrentTime(dateTimeZone48);
        long long51 = dateTimeZone48.previousTransition((long) '#');
        org.joda.time.DateTime dateTime52 = dateTime29.toDateTime(dateTimeZone48);
        org.joda.time.Period period53 = duration11.toPeriodTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Period period55 = org.joda.time.Period.years((int) (byte) 1);
        org.joda.time.PeriodType periodType56 = period55.getPeriodType();
        org.joda.time.PeriodType periodType57 = periodType56.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(periodType57);
        org.joda.time.YearMonthDay yearMonthDay59 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval60 = yearMonthDay59.toInterval();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.YearMonthDay yearMonthDay62 = yearMonthDay59.withChronologyRetainFields(chronology61);
        org.joda.time.DateTime dateTime63 = yearMonthDay59.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(chronology66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.minusDays((int) (short) -1);
        int int70 = dateMidnight69.getYearOfEra();
        org.joda.time.Chronology chronology71 = dateMidnight69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology71);
        org.joda.time.DateTimeField dateTimeField73 = chronology71.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField74 = chronology71.halfdayOfDay();
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate((long) '#');
        int int77 = dateTimeField74.getMinimumValue((org.joda.time.ReadablePartial) localDate76);
        org.joda.time.Period period78 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate79 = localDate76.plus((org.joda.time.ReadablePeriod) period78);
        org.joda.time.YearMonthDay yearMonthDay80 = yearMonthDay59.minus((org.joda.time.ReadablePeriod) period78);
        java.lang.String str81 = yearMonthDay59.toString();
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime84 = yearMonthDay59.toDateTimeAtMidnight(dateTimeZone83);
        org.joda.time.Duration duration85 = mutablePeriod58.toDurationTo((org.joda.time.ReadableInstant) dateTime84);
        boolean boolean86 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime63", (dateTime8.compareTo(dateTime63) == 0) == dateTime8.equals(dateTime63));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        long long4 = dateMidnight1.getMillis();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withMillis((long) 7);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        long long13 = dateMidnight10.getMillis();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.days();
        org.joda.time.Period period15 = duration8.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight10, periodType14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateMidnight10.toMutableDateTimeISO();
        int int17 = dateMidnight6.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight6.dayOfYear();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight6.withDayOfMonth(4);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology23);
        mutablePeriod24.setPeriod((long) (short) 10, (long) (short) -1);
        int int29 = mutablePeriod24.getValue(0);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.minusDays((int) (short) -1);
        org.joda.time.Duration duration34 = mutablePeriod24.toDurationTo((org.joda.time.ReadableInstant) dateMidnight31);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration40 = duration36.withDurationAdded((org.joda.time.ReadableDuration) duration38, 12);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableDuration) duration47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(7);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 0);
        int int64 = dateTime63.getMonthOfYear();
        org.joda.time.Interval interval65 = duration47.toIntervalFrom((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Duration duration66 = duration36.minus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Duration duration67 = duration34.plus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight(chronology70);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight71.minusDays((int) (short) -1);
        int int74 = dateMidnight73.getYearOfEra();
        org.joda.time.Chronology chronology75 = dateMidnight73.getChronology();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology75);
        org.joda.time.DateTimeField dateTimeField77 = chronology75.clockhourOfDay();
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(chronology75);
        org.joda.time.DateTimeField dateTimeField79 = chronology75.dayOfYear();
        org.joda.time.DateTimeField dateTimeField80 = chronology75.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField81 = chronology75.centuryOfEra();
        boolean boolean82 = duration34.equals((java.lang.Object) dateTimeField81);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight6.withDurationAdded((org.joda.time.ReadableDuration) duration34, 44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime78", (dateTime44.compareTo(dateTime78) == 0) == dateTime44.equals(dateTime78));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration13, readableInstant14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight9, periodType16);
        int int18 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant19 = dateMidnight5.toInstant();
        org.joda.time.Instant instant21 = instant19.plus((long) 32769);
        org.joda.time.Instant instant24 = instant19.withDurationAdded((long) 726, 20);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = yearMonthDay25.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        int int37 = mutablePeriod32.getValue(0);
        mutablePeriod32.addMinutes(0);
        mutablePeriod32.setMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay25.minus((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.Chronology chronology43 = yearMonthDay42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = instant19.toMutableDateTime(chronology43);
        int int45 = mutableDateTime44.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant19", (dateMidnight3.compareTo(instant19) == 0) == dateMidnight3.equals(instant19));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(chronology1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        int int14 = dateMidnight13.getYearOfEra();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 10, chronology15);
        org.joda.time.DateTime dateTime19 = dateTime17.plusSeconds(14);
        boolean boolean20 = dateMidnight6.isBefore((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTimeISO();
        org.joda.time.DateTime dateTime23 = dateTime19.withDayOfWeek(1);
        org.joda.time.DateTime dateTime25 = dateTime23.plus((long) '#');
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay((long) 10, chronology27);
        org.joda.time.DateTimeField[] dateTimeFieldArray29 = timeOfDay28.getFields();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.minusHours(19);
        org.joda.time.Chronology chronology32 = timeOfDay28.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime23.withChronology(chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period((-58L), chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime33", (dateTime23.compareTo(dateTime33) == 0) == dateTime23.equals(dateTime33));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours(10L);
        long long4 = duration3.getStandardSeconds();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration8 = duration3.plus((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Duration duration12 = duration8.withDurationAdded(100L, 3);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withZoneRetainFields(dateTimeZone17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        long long25 = dateMidnight22.getMillis();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration26, readableInstant27);
        org.joda.time.PeriodType periodType29 = period28.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight18, (org.joda.time.ReadableInstant) dateMidnight22, periodType29);
        int int31 = dateMidnight18.getMillisOfDay();
        org.joda.time.Interval interval32 = duration8.toIntervalFrom((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Instant instant33 = instant0.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.MutableDateTime mutableDateTime34 = instant33.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime35 = instant33.toMutableDateTime();
        org.joda.time.Chronology chronology36 = instant33.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant33 and mutableDateTime34", (instant33.compareTo(mutableDateTime34) == 0) == instant33.equals(mutableDateTime34));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod4.getSeconds();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology12);
        mutablePeriod13.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod13.add(0L);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        int int26 = dateMidnight25.getYearOfEra();
        org.joda.time.Chronology chronology27 = dateMidnight25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology27);
        mutablePeriod13.add(0L, chronology27);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (-1), chronology27);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusDays((int) (short) -1);
        int int38 = dateMidnight37.getYearOfEra();
        org.joda.time.Chronology chronology39 = dateMidnight37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (short) 10, chronology39);
        org.joda.time.MutableDateTime mutableDateTime42 = dateMidnight30.toMutableDateTime(chronology39);
        org.joda.time.Duration duration45 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime42.add((org.joda.time.ReadableDuration) duration45);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        int int57 = dateMidnight56.getYearOfEra();
        org.joda.time.Chronology chronology58 = dateMidnight56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (short) 10, chronology58);
        org.joda.time.DateTime dateTime62 = dateTime60.minusMonths(10);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(chronology66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.minusDays((int) (short) -1);
        int int70 = dateMidnight69.getYearOfEra();
        org.joda.time.Chronology chronology71 = dateMidnight69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (short) 10, chronology71);
        org.joda.time.DateTime dateTime74 = dateTime62.toDateTime(chronology71);
        org.joda.time.DurationField durationField75 = chronology71.days();
        mutablePeriod4.setPeriod((long) 31, 4320000000L, chronology71);
        org.joda.time.DurationField durationField77 = chronology71.centuries();
        org.joda.time.LocalTime localTime78 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology71);
        org.joda.time.DurationField durationField79 = chronology71.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField79, durationField75, and durationField77", !(durationField79.compareTo(durationField75) == 0) || (Math.signum(durationField79.compareTo(durationField77)) == Math.signum(durationField75.compareTo(durationField77))));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval9 = yearMonthDay8.toInterval();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval11 = yearMonthDay10.toInterval();
        org.joda.time.Interval interval12 = interval9.gap((org.joda.time.ReadableInterval) interval11);
        boolean boolean14 = interval9.isBefore(100L);
        long long15 = interval9.toDurationMillis();
        long long16 = interval9.getStartMillis();
        org.joda.time.Duration duration17 = interval9.toDuration();
        org.joda.time.Instant instant18 = instant6.plus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.DateTime dateTime19 = instant18.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        int int13 = dateTime12.getCenturyOfEra();
        int int14 = dateTime12.getSecondOfMinute();
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime12.minusMinutes(0);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology23);
        mutablePeriod24.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod24.add(0L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        mutablePeriod24.add(0L, chronology38);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (-1), chronology38);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        int int49 = dateMidnight48.getYearOfEra();
        org.joda.time.Chronology chronology50 = dateMidnight48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (short) 10, chronology50);
        org.joda.time.MutableDateTime mutableDateTime53 = dateMidnight41.toMutableDateTime(chronology50);
        org.joda.time.DurationField durationField54 = chronology50.minutes();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(0L, chronology50);
        org.joda.time.TimeOfDay timeOfDay56 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0, chronology50);
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay56.withSecondOfMinute(13);
        org.joda.time.DateTime dateTime59 = timeOfDay58.toDateTimeToday();
        org.joda.time.Instant instant60 = dateTime59.toInstant();
        org.joda.time.Chronology chronology61 = instant60.getChronology();
        org.joda.time.Instant instant62 = instant60.toInstant();
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) instant60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime59 and instant60", (dateTime59.compareTo(instant60) == 0) == dateTime59.equals(instant60));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = timeOfDay2.getFields();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 10, chronology5);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusSeconds((int) '4');
        int int15 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay2.withMillisOfSecond(1);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay2.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.lang.String str21 = property18.getAsText(locale20);
        int int22 = property18.get();
        java.util.Locale locale23 = null;
        int int24 = property18.getMaximumTextLength(locale23);
        org.joda.time.TimeOfDay timeOfDay26 = property18.addWrapFieldToCopy((int) (short) -1);
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.lang.String str28 = locale27.getCountry();
        int int29 = property18.getMaximumTextLength(locale27);
        org.joda.time.TimeOfDay timeOfDay30 = property18.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay31 = property18.withMinimumValue();
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale36 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        boolean boolean38 = locale37.hasExtensions();
        java.lang.String str39 = locale37.getDisplayCountry();
        java.lang.String str40 = locale36.getDisplayScript(locale37);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(locale36);
        java.lang.String str42 = locale32.getDisplayScript(locale36);
        int int43 = property18.getMaximumTextLength(locale36);
        int int44 = property18.getMaximumValue();
        int int45 = property18.getMinimumValue();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology48);
        mutablePeriod49.setPeriod((long) (short) 10, (long) (short) -1);
        int int54 = mutablePeriod49.getValue(0);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        org.joda.time.Duration duration59 = mutablePeriod49.toDurationTo((org.joda.time.ReadableInstant) dateMidnight56);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.days();
        org.joda.time.Period period63 = new org.joda.time.Period(1645488000000L, periodType62);
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period(readableDuration64, readableInstant65);
        org.joda.time.PeriodType periodType67 = period66.getPeriodType();
        org.joda.time.Period period68 = period63.normalizedStandard(periodType67);
        org.joda.time.Period period69 = duration59.toPeriodTo(readableInstant60, periodType67);
        org.joda.time.Duration duration72 = duration59.withDurationAdded((long) 53, 5);
        java.util.Locale locale73 = java.util.Locale.GERMAN;
        java.util.Calendar calendar74 = java.util.Calendar.getInstance(locale73);
        org.joda.time.LocalTime localTime75 = org.joda.time.LocalTime.fromCalendarFields(calendar74);
        org.joda.time.DateTime dateTime76 = localTime75.toDateTimeToday();
        org.joda.time.Period period77 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration72, (org.joda.time.ReadableInstant) dateTime76);
        boolean boolean78 = property18.equals((java.lang.Object) duration72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar41 and calendar74", (calendar41.compareTo(calendar74) == 0) == calendar41.equals(calendar74));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime dateTime17 = dateTime12.plusMinutes(1);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTimeISO();
        org.joda.time.DateTime dateTime22 = dateTime19.withDurationAdded(1148925513600001L, (int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant18", (dateTime19.compareTo(instant18) == 0) == dateTime19.equals(instant18));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        int int61 = mutableDateTime48.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime48.millisOfDay();
        org.joda.time.Instant instant63 = mutableDateTime48.toInstant();
        mutableDateTime48.addHours(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and instant63", (dateMidnight14.compareTo(instant63) == 0) == dateMidnight14.equals(instant63));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology5);
        mutablePeriod6.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod6.add(0L);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusDays((int) (short) -1);
        int int19 = dateMidnight18.getYearOfEra();
        org.joda.time.Chronology chronology20 = dateMidnight18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology20);
        mutablePeriod6.add(0L, chronology20);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (-1), chronology20);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusDays((int) (short) -1);
        int int31 = dateMidnight30.getYearOfEra();
        org.joda.time.Chronology chronology32 = dateMidnight30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) 10, chronology32);
        org.joda.time.MutableDateTime mutableDateTime35 = dateMidnight23.toMutableDateTime(chronology32);
        org.joda.time.DurationField durationField36 = chronology32.minutes();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, chronology32);
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0, chronology32);
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.withSecondOfMinute(13);
        org.joda.time.DateTime dateTime41 = timeOfDay40.toDateTimeToday();
        org.joda.time.Instant instant42 = dateTime41.toInstant();
        org.joda.time.Chronology chronology43 = instant42.getChronology();
        org.joda.time.Instant instant44 = instant42.toInstant();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardHours(10L);
        long long51 = duration50.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight48, (org.joda.time.ReadableDuration) duration50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        int int57 = dateMidnight56.getYearOfEra();
        int int58 = dateMidnight56.getWeekyear();
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight56, readableInstant59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology63);
        mutablePeriod64.setPeriod((long) (short) 10, (long) (short) -1);
        int int69 = mutablePeriod64.getValue(0);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight(chronology70);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight71.minusDays((int) (short) -1);
        org.joda.time.Duration duration74 = mutablePeriod64.toDurationTo((org.joda.time.ReadableInstant) dateMidnight71);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.days();
        org.joda.time.Period period78 = new org.joda.time.Period(1645488000000L, periodType77);
        org.joda.time.ReadableDuration readableDuration79 = null;
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableDuration79, readableInstant80);
        org.joda.time.PeriodType periodType82 = period81.getPeriodType();
        org.joda.time.Period period83 = period78.normalizedStandard(periodType82);
        org.joda.time.Period period84 = duration74.toPeriodTo(readableInstant75, periodType82);
        java.lang.String str85 = periodType82.getName();
        org.joda.time.Period period86 = duration50.toPeriodTo(readableInstant59, periodType82);
        org.joda.time.Instant instant87 = instant44.plus((org.joda.time.ReadableDuration) duration50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant44", (dateTime41.compareTo(instant44) == 0) == dateTime41.equals(instant44));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        long long7 = dateMidnight4.getMillis();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withMillis((long) 7);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) (short) -1);
        long long16 = dateMidnight13.getMillis();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.days();
        org.joda.time.Period period18 = duration11.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight13, periodType17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight13.toMutableDateTimeISO();
        int int20 = dateMidnight9.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight9.dayOfYear();
        int int22 = dateMidnight9.getWeekyear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight9.minusYears(59);
        boolean boolean25 = dateTime2.equals((java.lang.Object) dateMidnight9);
        org.joda.time.TimeOfDay timeOfDay26 = dateTime2.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateMidnight9", (instant1.compareTo(dateMidnight9) == 0) == instant1.equals(dateMidnight9));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        long long49 = instant47.getMillis();
        org.joda.time.Instant instant51 = instant47.plus((-2100623334000L));
        org.joda.time.Instant instant52 = instant47.toInstant();
        org.joda.time.DateTime dateTime53 = instant52.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant52", (dateTime23.compareTo(instant52) == 0) == dateTime23.equals(instant52));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.days();
        org.joda.time.Period period4 = new org.joda.time.Period(1645488000000L, periodType3);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(periodType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        int int14 = dateMidnight13.getYearOfEra();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) 100, chronology15);
        org.joda.time.DurationField durationField19 = durationFieldType6.getField(chronology15);
        int int20 = periodType3.indexOf(durationFieldType6);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        int int28 = dateMidnight27.getYearOfEra();
        org.joda.time.Chronology chronology29 = dateMidnight27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (short) 10, chronology29);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.clockhourOfDay();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (short) 100, chronology40);
        org.joda.time.DateTime dateTime44 = dateTime31.withChronology(chronology40);
        org.joda.time.DurationField durationField45 = durationFieldType6.getField(chronology40);
        org.joda.time.Period period46 = new org.joda.time.Period((long) 54193192, (long) 363, chronology40);
        org.joda.time.DurationField durationField47 = chronology40.eras();
        org.joda.time.DurationField durationField48 = chronology40.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField47", Math.signum(durationField19.compareTo(durationField47)) == -Math.signum(durationField47.compareTo(durationField19)));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        int int61 = mutableDateTime48.getMillisOfDay();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight(chronology62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.minusDays((int) (short) -1);
        int int66 = dateMidnight65.getYearOfEra();
        org.joda.time.Chronology chronology67 = dateMidnight65.getChronology();
        org.joda.time.MutableDateTime mutableDateTime68 = dateMidnight65.toMutableDateTime();
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime48, (org.joda.time.ReadableInstant) dateMidnight65, periodType69);
        mutableDateTime48.addWeeks(11);
        org.joda.time.Instant instant73 = mutableDateTime48.toInstant();
        org.joda.time.MutableDateTime mutableDateTime74 = instant73.toMutableDateTime();
        mutableDateTime74.addWeekyears(105);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime48 and instant73", (mutableDateTime48.compareTo(instant73) == 0) == mutableDateTime48.equals(instant73));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-2), (long) 86399999);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        java.lang.String str9 = chronology8.toString();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology8);
        boolean boolean11 = interval2.contains((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology14);
        mutablePeriod15.addSeconds(24);
        org.joda.time.Interval interval18 = interval2.withPeriodAfterStart((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        long long20 = mutableInterval19.getEndMillis();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        long long27 = dateMidnight24.getMillis();
        org.joda.time.DateMidnight.Property property28 = dateMidnight24.weekyear();
        org.joda.time.DateMidnight dateMidnight29 = property28.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight30 = property28.roundCeilingCopy();
        org.joda.time.DateTime dateTime31 = dateMidnight30.toDateTime();
        org.joda.time.DateTime dateTime34 = dateTime31.withDurationAdded((long) 9, 7);
        org.joda.time.DateTime dateTime36 = dateTime34.plus(1645455775116L);
        org.joda.time.Instant instant37 = dateTime34.toInstant();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 10, chronology46);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology57.clockhourOfDay();
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime((long) (short) 100, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime48.withChronology(chronology57);
        org.joda.time.DateTime.Property property62 = dateTime48.yearOfCentury();
        org.joda.time.DateTime dateTime64 = dateTime48.withDayOfMonth(19);
        org.joda.time.Duration duration66 = org.joda.time.Duration.standardHours(10L);
        long long67 = duration66.getStandardSeconds();
        org.joda.time.Duration duration70 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration71 = duration66.plus((org.joda.time.ReadableDuration) duration70);
        org.joda.time.DateTime dateTime72 = dateTime64.plus((org.joda.time.ReadableDuration) duration71);
        org.joda.time.Instant instant73 = instant37.minus((org.joda.time.ReadableDuration) duration71);
        boolean boolean74 = mutableInterval19.equals((java.lang.Object) duration71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and instant37", (dateTime34.compareTo(instant37) == 0) == dateTime34.equals(instant37));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.joda.time.Instant instant9 = instant6.minus((-79200000L));
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration13, readableInstant14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight9, periodType16);
        int int18 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant19 = dateMidnight5.toInstant();
        org.joda.time.Instant instant21 = instant19.plus((long) 32769);
        org.joda.time.MutableDateTime mutableDateTime22 = instant19.toMutableDateTimeISO();
        mutableDateTime22.addWeekyears(903);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant19", (dateMidnight3.compareTo(instant19) == 0) == dateMidnight3.equals(instant19));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        java.lang.String str17 = timeZone14.getID();
        java.util.TimeZone.setDefault(timeZone14);
        int int19 = timeZone14.getRawOffset();
        timeZone14.setID("P2720W5D");
        timeZone14.setID("02:03:10.221");
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale24);
        calendar25.setMinimalDaysInFirstWeek((int) (short) 1);
        int int28 = calendar25.getWeeksInWeekYear();
        calendar25.set(24, 667, 5);
        long long33 = calendar25.getTimeInMillis();
        calendar25.set(904, (int) (byte) 10, 38, (int) (byte) -1, (int) (short) -1);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        int int44 = dateMidnight43.getYearOfEra();
        org.joda.time.Chronology chronology45 = dateMidnight43.getChronology();
        long long46 = dateMidnight43.getMillis();
        org.joda.time.DateMidnight.Property property47 = dateMidnight43.weekyear();
        org.joda.time.DateMidnight dateMidnight48 = property47.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight49 = property47.getDateMidnight();
        int int50 = dateMidnight49.getEra();
        java.util.Date date51 = dateMidnight49.toDate();
        org.joda.time.LocalDate localDate52 = org.joda.time.LocalDate.fromDateFields(date51);
        calendar25.setTime(date51);
        boolean boolean54 = timeZone14.inDaylightTime(date51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar25", (calendar11.compareTo(calendar25) == 0) == calendar11.equals(calendar25));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        int int61 = mutableDateTime48.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime48.millisOfDay();
        org.joda.time.Instant instant63 = mutableDateTime48.toInstant();
        mutableDateTime48.add(1591737177600001L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and instant63", (dateMidnight14.compareTo(instant63) == 0) == dateMidnight14.equals(instant63));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology8);
        mutablePeriod9.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod9.add(0L);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        mutablePeriod9.add(0L, chronology23);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (-1), chronology23);
        org.joda.time.DurationField durationField27 = chronology23.weeks();
        org.joda.time.DateTime dateTime28 = dateMidnight3.toDateTime(chronology23);
        org.joda.time.DurationField durationField29 = chronology23.seconds();
        org.joda.time.DurationField durationField30 = chronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField27, and durationField29", !(durationField30.compareTo(durationField27) == 0) || (Math.signum(durationField30.compareTo(durationField29)) == Math.signum(durationField27.compareTo(durationField29))));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        long long1 = instant0.getMillis();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        int int11 = dateMidnight10.getYearOfEra();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 10, chronology12);
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours(7);
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology20);
        mutablePeriod21.setPeriod((long) (short) 10, (long) (short) -1);
        int int26 = mutablePeriod21.getValue(0);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusDays((int) (short) -1);
        org.joda.time.Duration duration31 = mutablePeriod21.toDurationTo((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusDays((int) (short) -1);
        int int38 = dateMidnight37.getYearOfEra();
        org.joda.time.Chronology chronology39 = dateMidnight37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.halfdayOfDay();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight28, chronology39);
        org.joda.time.DateTime dateTime44 = dateTime16.withChronology(chronology39);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.now(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = dateTime16.toDateTime(dateTimeZone46);
        mutableDateTime3.setZone(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime3", (instant0.compareTo(mutableDateTime3) == 0) == instant0.equals(mutableDateTime3));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.joda.time.Instant instant9 = instant6.minus((-79200000L));
        org.joda.time.Period period11 = org.joda.time.Period.millis(0);
        int int12 = period11.getSeconds();
        org.joda.time.Duration duration13 = period11.toStandardDuration();
        org.joda.time.Instant instant14 = instant6.plus((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration15 = duration13.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        org.joda.time.DateMidnight dateMidnight8 = property7.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight9 = property7.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight10 = property7.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minus((long) 363);
        org.joda.time.Instant instant14 = org.joda.time.Instant.parse("1970");
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withZoneRetainFields(dateTimeZone19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        long long27 = dateMidnight24.getMillis();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableDuration28, readableInstant29);
        org.joda.time.PeriodType periodType31 = period30.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) dateMidnight24, periodType31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours(10L);
        long long39 = duration38.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight36, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight20.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Instant instant42 = instant14.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours(10L);
        long long45 = duration44.getStandardSeconds();
        org.joda.time.Duration duration48 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration49 = duration44.plus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration50 = duration48.toDuration();
        org.joda.time.Instant instant51 = instant42.plus((org.joda.time.ReadableDuration) duration50);
        boolean boolean52 = dateMidnight12.isAfter((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Instant instant53 = instant42.toInstant();
        org.joda.time.DateTime dateTime54 = instant53.toDateTimeISO();
        org.joda.time.DateTime dateTime55 = instant53.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant53 and dateTime54", (instant53.compareTo(dateTime54) == 0) == instant53.equals(dateTime54));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        java.lang.String str17 = timeZone14.getID();
        timeZone14.setRawOffset((-3));
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        boolean boolean22 = calendar21.isWeekDateSupported();
        calendar21.roll(0, true);
        int int27 = calendar21.getActualMinimum(1);
        calendar21.set(4, (-1), (int) '#');
        int int32 = calendar21.getMinimalDaysInFirstWeek();
        int int33 = calendar21.getWeekYear();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusDays((int) (short) -1);
        int int38 = dateMidnight37.getYearOfEra();
        org.joda.time.Chronology chronology39 = dateMidnight37.getChronology();
        long long40 = dateMidnight37.getMillis();
        java.util.Locale locale44 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar45 = dateMidnight37.toCalendar(locale44);
        int int47 = calendar45.getLeastMaximum(3);
        java.util.TimeZone timeZone48 = calendar45.getTimeZone();
        timeZone48.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        long long58 = dateMidnight55.getMillis();
        java.util.Locale locale62 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar63 = dateMidnight55.toCalendar(locale62);
        int int65 = calendar63.getLeastMaximum(3);
        java.util.TimeZone timeZone66 = calendar63.getTimeZone();
        timeZone66.setID("PT0S");
        java.lang.String str69 = timeZone66.getID();
        boolean boolean70 = timeZone48.hasSameRules(timeZone66);
        calendar21.setTimeZone(timeZone48);
        boolean boolean72 = timeZone14.hasSameRules(timeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar45", (calendar11.compareTo(calendar45) == 0) == calendar11.equals(calendar45));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology19);
        mutablePeriod20.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod20.add(0L);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        mutablePeriod20.add(0L, chronology34);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (-1), chronology34);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 10, chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight37.toMutableDateTime(chronology46);
        mutableDateTime49.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime49.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime49.toMutableDateTime(dateTimeZone53);
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = yearMonthDay55.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay55.toDateTimeAtCurrentTime(dateTimeZone57);
        org.joda.time.Duration duration59 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType63 = periodType62.withWeeksRemoved();
        org.joda.time.Period period64 = new org.joda.time.Period((long) 1970, (long) 3, periodType62);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration59, periodType62);
        org.joda.time.DateTime.Property property66 = dateTime14.dayOfYear();
        org.joda.time.DateTime.Property property67 = dateTime14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate70 = org.joda.time.LocalDate.now(dateTimeZone69);
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone69);
        org.joda.time.Duration duration74 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime71, (org.joda.time.ReadableDuration) duration74);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime71.getZone();
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(dateTimeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime58 and dateTime71", (dateTime58.compareTo(dateTime71) == 0) == dateTime58.equals(dateTime71));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.DateTime.Property property16 = dateTime14.monthOfYear();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(dateTimeZone28);
        int int30 = dateMidnight29.getSecondOfMinute();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.minutes();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.clockhourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = dateTimeField38.getType();
        int int40 = dateMidnight29.get(dateTimeFieldType39);
        boolean boolean41 = dateTime17.equals((java.lang.Object) dateTimeFieldType39);
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType39.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate45 = org.joda.time.LocalDate.now(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime48 = dateTime46.withMillisOfSecond(53);
        int int49 = dateTime46.getWeekOfWeekyear();
        java.util.Locale locale51 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleKeys();
        strSet52.clear();
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType55 = periodType54.withWeeksRemoved();
        java.lang.String str56 = periodType54.getName();
        boolean boolean57 = strSet52.contains((java.lang.Object) periodType54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(chronology58);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.minusDays((int) (short) -1);
        int int62 = dateMidnight61.getYearOfEra();
        org.joda.time.Chronology chronology63 = dateMidnight61.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.minutes();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.clockhourOfHalfday();
        org.joda.time.Period period66 = new org.joda.time.Period((long) 726, periodType54, chronology63);
        org.joda.time.DateTimeField dateTimeField67 = chronology63.clockhourOfDay();
        org.joda.time.YearMonthDay yearMonthDay68 = new org.joda.time.YearMonthDay(chronology63);
        org.joda.time.DateTime dateTime69 = dateTime46.toDateTime(chronology63);
        boolean boolean70 = durationFieldType42.isSupported(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and dateTime69", (dateTime46.compareTo(dateTime69) == 0) == dateTime46.equals(dateTime69));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusDays((int) (short) -1);
        int int53 = dateMidnight52.getYearOfEra();
        org.joda.time.Chronology chronology54 = dateMidnight52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.clockhourOfDay();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology54);
        org.joda.time.DateTimeField dateTimeField58 = chronology54.dayOfYear();
        org.joda.time.DateTimeField dateTimeField59 = chronology54.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField60 = chronology54.centuryOfEra();
        boolean boolean61 = duration13.equals((java.lang.Object) dateTimeField60);
        long long63 = dateTimeField60.roundHalfCeiling(1645455784413L);
        long long65 = dateTimeField60.roundCeiling(36000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime57", (dateTime23.compareTo(dateTime57) == 0) == dateTime23.equals(dateTime57));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime40, dateTimeZone42);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay(dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight46 = org.joda.time.DateMidnight.now(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and dateTime44", (mutableDateTime33.compareTo(dateTime44) == 0) == mutableDateTime33.equals(dateTime44));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        long long1 = instant0.getMillis();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval7 = yearMonthDay6.toInterval();
        org.joda.time.Interval interval8 = interval5.gap((org.joda.time.ReadableInterval) interval7);
        boolean boolean10 = interval5.isBefore(100L);
        long long11 = interval5.toDurationMillis();
        long long12 = interval5.getStartMillis();
        org.joda.time.Duration duration13 = interval5.toDuration();
        org.joda.time.Instant instant14 = instant0.minus((org.joda.time.ReadableDuration) duration13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime3", (instant0.compareTo(mutableDateTime3) == 0) == instant0.equals(mutableDateTime3));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        java.util.GregorianCalendar gregorianCalendar4 = dateMidnight1.toGregorianCalendar();
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar4);
        int int7 = gregorianCalendar4.getGreatestMinimum(0);
        gregorianCalendar4.setMinimalDaysInFirstWeek((-24356254));
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology13);
        mutablePeriod14.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod14.add(0L);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        int int27 = dateMidnight26.getYearOfEra();
        org.joda.time.Chronology chronology28 = dateMidnight26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology28);
        mutablePeriod14.add(0L, chronology28);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (-1), chronology28);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (short) 10, chronology40);
        org.joda.time.MutableDateTime mutableDateTime43 = dateMidnight31.toMutableDateTime(chronology40);
        org.joda.time.DurationField durationField44 = chronology40.minutes();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology40.getZone();
        boolean boolean46 = dateTimeZone45.isFixed();
        int int48 = dateTimeZone45.getOffsetFromLocal(62135638488000L);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((java.lang.Object) gregorianCalendar4, dateTimeZone45);
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar) gregorianCalendar4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateTime49", (dateMidnight1.compareTo(dateTime49) == 0) == dateMidnight1.equals(dateTime49));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.monthOfYear();
        int int39 = mutableDateTime33.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime33, readableInstant40);
        java.lang.String str42 = mutableDateTime33.toString();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime33.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.now(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableDuration) duration50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        long long56 = dateMidnight53.getMillis();
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight53.withMillis((long) 7);
        org.joda.time.Interval interval59 = dateMidnight58.toInterval();
        mutablePeriod51.setPeriod((org.joda.time.ReadableInterval) interval59);
        mutableDateTime33.add((org.joda.time.ReadablePeriod) mutablePeriod51, 31);
        mutableDateTime33.addHours(139);
        org.joda.time.Duration duration66 = org.joda.time.Duration.standardSeconds((long) 15);
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Instant instant68 = new org.joda.time.Instant();
        boolean boolean69 = periodType67.equals((java.lang.Object) instant68);
        org.joda.time.PeriodType periodType70 = periodType67.withYearsRemoved();
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime33, (org.joda.time.ReadableDuration) duration66, periodType67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and instant68", (dateTime47.compareTo(instant68) == 0) == dateTime47.equals(instant68));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = org.joda.time.DateMidnight.now(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight6, readableInstant7, periodType8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight6.withYearOfEra(2349);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusYears(4);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (-23641));
        org.joda.time.Chronology chronology16 = instant15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology16);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withChronology(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime17", (dateTime4.compareTo(mutableDateTime17) == 0) == dateTime4.equals(mutableDateTime17));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration13, readableInstant14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight9, periodType16);
        int int18 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant19 = dateMidnight5.toInstant();
        java.lang.String str20 = dateMidnight5.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant19", (dateMidnight5.compareTo(instant19) == 0) == dateMidnight5.equals(instant19));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 10, chronology6);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay7, (org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean15 = timeOfDay11.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.clockhourOfDay();
        boolean boolean26 = dateTimeFieldType14.isSupported(chronology23);
        boolean boolean27 = localTime4.isSupported(dateTimeFieldType14);
        org.joda.time.LocalTime localTime29 = localTime4.plusHours(11);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod34.add(0L);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(chronology43);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.minusDays((int) (short) -1);
        int int47 = dateMidnight46.getYearOfEra();
        org.joda.time.Chronology chronology48 = dateMidnight46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology48);
        mutablePeriod34.add(0L, chronology48);
        boolean boolean51 = dateTimeFieldType30.isSupported(chronology48);
        org.joda.time.DurationField durationField52 = chronology48.hours();
        org.joda.time.DurationFieldType durationFieldType53 = durationField52.getType();
        org.joda.time.LocalTime localTime55 = localTime29.withFieldAdded(durationFieldType53, 0);
        org.joda.time.Instant instant56 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology57 = instant56.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.dayOfYear();
        org.joda.time.DurationField durationField59 = durationFieldType53.getField(chronology57);
        org.joda.time.DurationFieldType durationFieldType60 = durationField59.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology64);
        mutablePeriod65.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod65.add(0L);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateMidnight dateMidnight75 = new org.joda.time.DateMidnight(chronology74);
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight75.minusDays((int) (short) -1);
        int int78 = dateMidnight77.getYearOfEra();
        org.joda.time.Chronology chronology79 = dateMidnight77.getChronology();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology79);
        mutablePeriod65.add(0L, chronology79);
        boolean boolean82 = dateTimeFieldType61.isSupported(chronology79);
        boolean boolean83 = durationFieldType60.isSupported(chronology79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField52 and durationField59", (durationField52.compareTo(durationField59) == 0) == durationField52.equals(durationField59));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration13, readableInstant14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight9, periodType16);
        int int18 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant19 = dateMidnight5.toInstant();
        org.joda.time.Instant instant21 = instant19.plus((long) 32769);
        org.joda.time.Instant instant24 = instant19.withDurationAdded((long) 726, 20);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = yearMonthDay25.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        int int37 = mutablePeriod32.getValue(0);
        mutablePeriod32.addMinutes(0);
        mutablePeriod32.setMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay25.minus((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.Chronology chronology43 = yearMonthDay42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = instant19.toMutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = instant19.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime44", (dateMidnight3.compareTo(mutableDateTime44) == 0) == dateMidnight3.equals(mutableDateTime44));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime33.era();
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime33.getZone();
        org.joda.time.Instant instant63 = mutableDateTime33.toInstant();
        org.joda.time.Instant instant65 = instant63.plus(3024000000L);
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration69 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration71 = duration67.withDurationAdded((org.joda.time.ReadableDuration) duration69, 12);
        org.joda.time.Duration duration72 = duration69.toDuration();
        org.joda.time.Duration duration74 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration76 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration78 = duration74.withDurationAdded((org.joda.time.ReadableDuration) duration76, 12);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Period period80 = duration76.toPeriodFrom(readableInstant79);
        boolean boolean81 = duration72.isShorterThan((org.joda.time.ReadableDuration) duration76);
        org.joda.time.Instant instant83 = instant63.withDurationAdded((org.joda.time.ReadableDuration) duration76, (-59));
        org.joda.time.Instant instant85 = instant83.withMillis((long) 197022);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant63", (mutableDateTime33.compareTo(instant63) == 0) == mutableDateTime33.equals(instant63));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(19);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology18);
        mutablePeriod19.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod19.add(0L);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        mutablePeriod19.add(0L, chronology33);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (-1), chronology33);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        int int44 = dateMidnight43.getYearOfEra();
        org.joda.time.Chronology chronology45 = dateMidnight43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 10, chronology45);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight36.toMutableDateTime(chronology45);
        mutableDateTime48.setWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) 22, dateTimeZone53);
        mutableDateTime48.setZoneRetainFields(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(528, 16);
        long long60 = dateTimeZone53.getMillisKeepLocal(dateTimeZone58, (long) 50);
        org.joda.time.DateTime dateTime61 = dateTime12.withZone(dateTimeZone58);
        org.joda.time.DateTime dateTime63 = dateTime12.plusDays(10);
        org.joda.time.DateTime.Property property64 = dateTime63.weekyear();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology67);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((java.lang.Object) chronology67);
        java.lang.String str70 = localTime69.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean72 = localTime69.isSupported(dateTimeFieldType71);
        boolean boolean73 = dateTime63.isSupported(dateTimeFieldType71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime61", (dateTime12.compareTo(dateTime61) == 0) == dateTime12.equals(dateTime61));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfSecond(10);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours(10L);
        long long11 = duration10.getStandardSeconds();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withDurationAdded((org.joda.time.ReadableDuration) duration10, (int) (short) 10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours(10L);
        long long20 = duration19.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight17, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        long long26 = dateMidnight23.getMillis();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight23.withMillis((long) 7);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        long long35 = dateMidnight32.getMillis();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.days();
        org.joda.time.Period period37 = duration30.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight32, periodType36);
        org.joda.time.MutableDateTime mutableDateTime38 = dateMidnight32.toMutableDateTimeISO();
        int int39 = dateMidnight28.compareTo((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight28.plusWeeks(10);
        org.joda.time.Period period42 = duration19.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.Duration duration45 = duration19.withDurationAdded((long) (short) 1, 100);
        boolean boolean46 = duration10.isEqual((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Instant instant47 = instant1.minus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTime dateTime48 = instant1.toDateTimeISO();
        org.joda.time.DateTime.Property property49 = dateTime48.millisOfSecond();
        org.joda.time.DateTime dateTime50 = property49.roundFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime50", (instant1.compareTo(dateTime50) == 0) == instant1.equals(dateTime50));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970");
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        long long7 = dateMidnight4.getMillis();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withMillis((long) 7);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) (short) -1);
        long long16 = dateMidnight13.getMillis();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.days();
        org.joda.time.Period period18 = duration11.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight13, periodType17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight13.toMutableDateTimeISO();
        int int20 = dateMidnight9.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight9.dayOfYear();
        int int22 = dateMidnight9.getWeekyear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight9.minusYears(59);
        boolean boolean25 = dateTime2.equals((java.lang.Object) dateMidnight9);
        org.joda.time.Instant instant27 = org.joda.time.Instant.parse("1970");
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration33 = duration29.withDurationAdded((org.joda.time.ReadableDuration) duration31, 12);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.Duration duration40 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableDuration) duration40);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        int int49 = dateMidnight48.getYearOfEra();
        org.joda.time.Chronology chronology50 = dateMidnight48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (short) 10, chronology50);
        org.joda.time.DateTime dateTime54 = dateTime52.minusHours(7);
        org.joda.time.DateTime dateTime56 = dateTime54.plusYears((int) (byte) 0);
        int int57 = dateTime56.getMonthOfYear();
        org.joda.time.Interval interval58 = duration40.toIntervalFrom((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration59 = duration29.minus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Instant instant61 = instant27.withDurationAdded((org.joda.time.ReadableDuration) duration40, 122);
        org.joda.time.DateTime dateTime63 = dateTime2.withDurationAdded((org.joda.time.ReadableDuration) duration40, 66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateMidnight9", (instant1.compareTo(dateMidnight9) == 0) == instant1.equals(dateMidnight9));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        calendar1.setTimeInMillis((-1L));
        java.util.TimeZone timeZone6 = calendar1.getTimeZone();
        int int7 = calendar1.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        long long14 = dateMidnight11.getMillis();
        java.util.Locale locale18 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar19 = dateMidnight11.toCalendar(locale18);
        int int21 = calendar19.getLeastMaximum(3);
        java.util.TimeZone timeZone22 = calendar19.getTimeZone();
        int int23 = timeZone22.getRawOffset();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone22);
        calendar1.setTimeZone(timeZone22);
        timeZone22.setRawOffset((int) (byte) 10);
        java.lang.String str28 = timeZone22.getID();
        java.util.Calendar.Builder builder29 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder31 = builder29.setInstant(4320000000L);
        java.util.Calendar.Builder builder33 = builder31.setInstant((long) (short) 100);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusDays((int) (short) -1);
        int int38 = dateMidnight37.getYearOfEra();
        org.joda.time.Chronology chronology39 = dateMidnight37.getChronology();
        long long40 = dateMidnight37.getMillis();
        java.util.Locale locale44 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar45 = dateMidnight37.toCalendar(locale44);
        int int47 = calendar45.getLeastMaximum(3);
        java.util.TimeZone timeZone48 = calendar45.getTimeZone();
        timeZone48.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone48);
        java.util.Calendar.Builder builder52 = builder31.setTimeZone(timeZone48);
        org.joda.time.tz.NameProvider nameProvider53 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str57 = nameProvider53.getShortName(locale54, "DateTimeField[clockhourOfDay]", "PT0S");
        java.util.Locale locale58 = java.util.Locale.KOREA;
        java.lang.String str59 = locale58.getDisplayName();
        java.lang.String str62 = nameProvider53.getShortName(locale58, "490", "873");
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone48, locale58);
        boolean boolean64 = timeZone22.hasSameRules(timeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar45", (calendar19.compareTo(calendar45) == 0) == calendar19.equals(calendar45));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration13, readableInstant14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight9, periodType16);
        int int18 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant19 = dateMidnight5.toInstant();
        org.joda.time.DateMidnight.Property property20 = dateMidnight5.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant19", (dateMidnight5.compareTo(instant19) == 0) == dateMidnight5.equals(instant19));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration13, readableInstant14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight9, periodType16);
        int int18 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant19 = dateMidnight5.toInstant();
        org.joda.time.Instant instant21 = instant19.plus((long) 32769);
        org.joda.time.Instant instant24 = instant19.withDurationAdded((long) 726, 20);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = yearMonthDay25.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        int int37 = mutablePeriod32.getValue(0);
        mutablePeriod32.addMinutes(0);
        mutablePeriod32.setMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay25.minus((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.Chronology chronology43 = yearMonthDay42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = instant19.toMutableDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant19", (dateMidnight3.compareTo(instant19) == 0) == dateMidnight3.equals(instant19));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration5 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration3, 12);
        org.joda.time.Period period6 = new org.joda.time.Period();
        boolean boolean7 = duration1.equals((java.lang.Object) period6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight9.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight9.minus((org.joda.time.ReadableDuration) duration19);
        boolean boolean22 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.withZoneRetainFields(dateTimeZone27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        long long35 = dateMidnight32.getMillis();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableDuration36, readableInstant37);
        org.joda.time.PeriodType periodType39 = period38.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight28, (org.joda.time.ReadableInstant) dateMidnight32, periodType39);
        int int41 = dateMidnight28.getDayOfYear();
        org.joda.time.Instant instant42 = dateMidnight28.toInstant();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) instant42, periodType43);
        int int45 = periodType43.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight11 and instant42", (dateMidnight11.compareTo(instant42) == 0) == dateMidnight11.equals(instant42));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        org.joda.time.DateTime.Property property12 = dateTime10.centuryOfEra();
        org.joda.time.DateTime dateTime14 = property12.addWrapFieldToCopy(122);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        long long16 = instant15.getMillis();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours(10L);
        long long19 = duration18.getStandardSeconds();
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration23 = duration18.plus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.Period period24 = duration23.toPeriod();
        org.joda.time.Duration duration27 = duration23.withDurationAdded(100L, 3);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.withZoneRetainFields(dateTimeZone32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusDays((int) (short) -1);
        int int38 = dateMidnight37.getYearOfEra();
        org.joda.time.Chronology chronology39 = dateMidnight37.getChronology();
        long long40 = dateMidnight37.getMillis();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableDuration41, readableInstant42);
        org.joda.time.PeriodType periodType44 = period43.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight33, (org.joda.time.ReadableInstant) dateMidnight37, periodType44);
        int int46 = dateMidnight33.getMillisOfDay();
        org.joda.time.Interval interval47 = duration23.toIntervalFrom((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.Instant instant48 = instant15.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.MutableDateTime mutableDateTime49 = instant48.toMutableDateTimeISO();
        org.joda.time.Duration duration50 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) instant48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant15", (dateTime10.compareTo(instant15) == 0) == dateTime10.equals(instant15));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration5 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration3, 12);
        org.joda.time.Period period6 = new org.joda.time.Period();
        boolean boolean7 = duration1.equals((java.lang.Object) period6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight9.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight9.minus((org.joda.time.ReadableDuration) duration19);
        boolean boolean22 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Seconds seconds23 = duration19.toStandardSeconds();
        org.joda.time.Duration duration25 = duration19.withMillis(45960758L);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTime();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology30);
        mutablePeriod31.setPeriod((long) (short) 10, (long) (short) -1);
        int int36 = mutablePeriod31.getValue(0);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.minusDays((int) (short) -1);
        org.joda.time.Duration duration41 = mutablePeriod31.toDurationTo((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.days();
        org.joda.time.Period period45 = new org.joda.time.Period(1645488000000L, periodType44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableDuration46, readableInstant47);
        org.joda.time.PeriodType periodType49 = period48.getPeriodType();
        org.joda.time.Period period50 = period45.normalizedStandard(periodType49);
        org.joda.time.Period period51 = duration41.toPeriodTo(readableInstant42, periodType49);
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.days();
        org.joda.time.Period period53 = duration41.toPeriod(periodType52);
        org.joda.time.Duration duration55 = duration41.plus(36001L);
        org.joda.time.Instant instant57 = instant26.withDurationAdded((org.joda.time.ReadableDuration) duration55, 921);
        boolean boolean58 = duration25.isEqual((org.joda.time.ReadableDuration) duration55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant26", (dateTime16.compareTo(instant26) == 0) == dateTime16.equals(instant26));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime33.toMutableDateTime(dateTimeZone37);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = yearMonthDay39.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay39.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.Duration duration43 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime33, (org.joda.time.ReadableInstant) dateTime42);
        mutableDateTime33.addYears(9);
        org.joda.time.Chronology chronology46 = null;
        mutableDateTime33.setChronology(chronology46);
        mutableDateTime33.setMillisOfDay(0);
        mutableDateTime33.addSeconds(2024);
        org.joda.time.Instant instant52 = mutableDateTime33.toInstant();
        org.joda.time.Instant instant53 = instant52.toInstant();
        org.joda.time.DateTime dateTime54 = instant53.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant53", (mutableDateTime33.compareTo(instant53) == 0) == mutableDateTime33.equals(instant53));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime33.era();
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime33.getZone();
        org.joda.time.Instant instant63 = mutableDateTime33.toInstant();
        org.joda.time.Instant instant65 = instant63.plus(3024000000L);
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration69 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration71 = duration67.withDurationAdded((org.joda.time.ReadableDuration) duration69, 12);
        org.joda.time.Duration duration72 = duration69.toDuration();
        org.joda.time.Duration duration74 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration76 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration78 = duration74.withDurationAdded((org.joda.time.ReadableDuration) duration76, 12);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Period period80 = duration76.toPeriodFrom(readableInstant79);
        boolean boolean81 = duration72.isShorterThan((org.joda.time.ReadableDuration) duration76);
        org.joda.time.Instant instant83 = instant63.withDurationAdded((org.joda.time.ReadableDuration) duration76, (-59));
        org.joda.time.MutableDateTime mutableDateTime84 = instant83.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant63", (mutableDateTime33.compareTo(instant63) == 0) == mutableDateTime33.equals(instant63));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(2000L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded(0L, (-23641));
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime2", (instant5.compareTo(mutableDateTime2) == 0) == instant5.equals(mutableDateTime2));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight3.withCenturyOfEra(12);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusYears(52);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.year();
        org.joda.time.DateMidnight.Property property15 = dateMidnight13.monthOfYear();
        org.joda.time.DateMidnight dateMidnight16 = property15.roundCeilingCopy();
        org.joda.time.DateMidnight dateMidnight17 = property15.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology24);
        mutablePeriod25.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod25.add(0L);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusDays((int) (short) -1);
        int int38 = dateMidnight37.getYearOfEra();
        org.joda.time.Chronology chronology39 = dateMidnight37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology39);
        mutablePeriod25.add(0L, chronology39);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (-1), chronology39);
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType20.getField(chronology39);
        org.joda.time.DurationField durationField44 = chronology39.centuries();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology39);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(50400L, chronology39);
        org.joda.time.DateTimeField dateTimeField47 = chronology39.clockhourOfHalfday();
        org.joda.time.DurationField durationField48 = chronology39.eras();
        org.joda.time.DateTime dateTime49 = dateMidnight17.toDateTime(chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField44 and durationField48", Math.signum(durationField44.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField44)));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(19);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology18);
        mutablePeriod19.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod19.add(0L);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        mutablePeriod19.add(0L, chronology33);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (-1), chronology33);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        int int44 = dateMidnight43.getYearOfEra();
        org.joda.time.Chronology chronology45 = dateMidnight43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 10, chronology45);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight36.toMutableDateTime(chronology45);
        mutableDateTime48.setWeekOfWeekyear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) 22, dateTimeZone53);
        mutableDateTime48.setZoneRetainFields(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(528, 16);
        long long60 = dateTimeZone53.getMillisKeepLocal(dateTimeZone58, (long) 50);
        org.joda.time.DateTime dateTime61 = dateTime12.withZone(dateTimeZone58);
        org.joda.time.DateTime dateTime63 = dateTime12.plusDays(10);
        org.joda.time.DateTime.Property property64 = dateTime63.weekyear();
        org.joda.time.DateTime dateTime65 = dateTime63.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime61", (dateTime12.compareTo(dateTime61) == 0) == dateTime12.equals(dateTime61));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology4);
        mutablePeriod5.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod5.add(0L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        mutablePeriod5.add(0L, chronology19);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (-1), chronology19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (short) 10, chronology31);
        org.joda.time.MutableDateTime mutableDateTime34 = dateMidnight22.toMutableDateTime(chronology31);
        mutableDateTime34.setYear(2022);
        mutableDateTime34.setYear((-1));
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime41 = property39.roundHalfEven();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        mutableDateTime41.setZone(dateTimeZone43);
        boolean boolean45 = dateTimeZone43.isFixed();
        org.joda.time.DateTime dateTime46 = localDate0.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.withZoneRetainFields(dateTimeZone53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        int int59 = dateMidnight58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateMidnight58.getChronology();
        long long61 = dateMidnight58.getMillis();
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableDuration62, readableInstant63);
        org.joda.time.PeriodType periodType65 = period64.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight54, (org.joda.time.ReadableInstant) dateMidnight58, periodType65);
        org.joda.time.Period period67 = new org.joda.time.Period((long) 3, (long) 32769, periodType65);
        java.util.Date date69 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay70 = org.joda.time.YearMonthDay.fromDateFields(date69);
        org.joda.time.YearMonthDay.Property property71 = yearMonthDay70.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay72 = property71.getYearMonthDay();
        org.joda.time.Chronology chronology73 = yearMonthDay72.getChronology();
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(chronology73);
        boolean boolean75 = periodType65.equals((java.lang.Object) chronology73);
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate((java.lang.Object) localDate0, chronology73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and dateTime74", (dateTime46.compareTo(dateTime74) == 0) == dateTime46.equals(dateTime74));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        int int61 = mutableDateTime48.getMillisOfDay();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight(chronology62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.minusDays((int) (short) -1);
        int int66 = dateMidnight65.getYearOfEra();
        org.joda.time.Chronology chronology67 = dateMidnight65.getChronology();
        org.joda.time.MutableDateTime mutableDateTime68 = dateMidnight65.toMutableDateTime();
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime48, (org.joda.time.ReadableInstant) dateMidnight65, periodType69);
        mutableDateTime48.addWeeks(11);
        org.joda.time.Instant instant73 = mutableDateTime48.toInstant();
        org.joda.time.DateTime dateTime74 = instant73.toDateTime();
        org.joda.time.DateTime.Property property75 = dateTime74.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime48 and instant73", (mutableDateTime48.compareTo(instant73) == 0) == mutableDateTime48.equals(instant73));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 10, chronology6);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay7, (org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean15 = timeOfDay11.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.clockhourOfDay();
        boolean boolean26 = dateTimeFieldType14.isSupported(chronology23);
        boolean boolean27 = localTime4.isSupported(dateTimeFieldType14);
        org.joda.time.LocalTime localTime29 = localTime4.plusHours(11);
        org.joda.time.LocalTime localTime31 = localTime4.withMillisOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.year();
        boolean boolean33 = localTime31.isSupported(dateTimeFieldType32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int35 = localTime31.get(dateTimeFieldType34);
        org.joda.time.Instant instant36 = org.joda.time.Instant.now();
        long long37 = instant36.getMillis();
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardHours(10L);
        long long40 = duration39.getStandardSeconds();
        org.joda.time.Duration duration43 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration44 = duration39.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Period period45 = duration44.toPeriod();
        org.joda.time.Duration duration48 = duration44.withDurationAdded(100L, 3);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.withZoneRetainFields(dateTimeZone53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        int int59 = dateMidnight58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateMidnight58.getChronology();
        long long61 = dateMidnight58.getMillis();
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableDuration62, readableInstant63);
        org.joda.time.PeriodType periodType65 = period64.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight54, (org.joda.time.ReadableInstant) dateMidnight58, periodType65);
        int int67 = dateMidnight54.getMillisOfDay();
        org.joda.time.Interval interval68 = duration44.toIntervalFrom((org.joda.time.ReadableInstant) dateMidnight54);
        org.joda.time.Instant instant69 = instant36.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.MutableDateTime mutableDateTime70 = instant69.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime71 = instant69.toMutableDateTime();
        org.joda.time.Chronology chronology72 = instant69.getChronology();
        boolean boolean73 = dateTimeFieldType34.isSupported(chronology72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant69 and mutableDateTime70", (instant69.compareTo(mutableDateTime70) == 0) == instant69.equals(mutableDateTime70));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        int int4 = localDate1.getCenturyOfEra();
        org.joda.time.DateTime dateTime5 = localDate1.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology9);
        mutablePeriod10.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod10.add(0L);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        mutablePeriod10.add(0L, chronology24);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (-1), chronology24);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = dateMidnight27.toMutableDateTime(chronology36);
        mutableDateTime39.setYear(2022);
        int int42 = mutableDateTime39.getYearOfEra();
        mutableDateTime39.addMonths(11);
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardHours(10L);
        long long47 = duration46.getStandardSeconds();
        org.joda.time.Duration duration50 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration51 = duration46.plus((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Duration duration52 = duration50.toDuration();
        mutableDateTime39.add((org.joda.time.ReadableDuration) duration50);
        mutableDateTime39.setMillis((long) 52);
        java.lang.Object obj56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology60);
        mutablePeriod61.setPeriod((long) (short) 10, (long) (short) -1);
        int int66 = mutablePeriod61.getValue(0);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight(chronology67);
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight68.minusDays((int) (short) -1);
        org.joda.time.Duration duration71 = mutablePeriod61.toDurationTo((org.joda.time.ReadableInstant) dateMidnight68);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateMidnight dateMidnight75 = new org.joda.time.DateMidnight(chronology74);
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight75.minusDays((int) (short) -1);
        int int78 = dateMidnight77.getYearOfEra();
        org.joda.time.Chronology chronology79 = dateMidnight77.getChronology();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology79);
        org.joda.time.DateTimeField dateTimeField81 = chronology79.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField82 = chronology79.halfdayOfDay();
        org.joda.time.LocalDate localDate83 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight68, chronology79);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(obj56, periodType57, chronology79);
        mutableDateTime39.setChronology(chronology79);
        org.joda.time.DateTime dateTime86 = dateTime5.toDateTime(chronology79);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate90 = org.joda.time.LocalDate.now(dateTimeZone89);
        org.joda.time.DateTime dateTime91 = org.joda.time.DateTime.now(dateTimeZone89);
        org.joda.time.MutableDateTime mutableDateTime92 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone89);
        org.joda.time.DateTime dateTime93 = dateTime86.toDateTime(dateTimeZone89);
        org.joda.time.DateTime.Property property94 = dateTime86.millisOfSecond();
        org.joda.time.Interval interval95 = property94.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime93", (dateTime5.compareTo(dateTime93) == 0) == dateTime5.equals(dateTime93));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.Instant instant10 = instant6.withDurationAdded(99L, 2000);
        org.joda.time.Instant instant11 = instant6.toInstant();
        org.joda.time.Instant instant14 = instant11.withDurationAdded(0L, 541537);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant14", (dateMidnight3.compareTo(instant14) == 0) == dateMidnight3.equals(instant14));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.days();
        org.joda.time.Period period2 = new org.joda.time.Period(1645488000000L, periodType1);
        int int3 = period2.getMinutes();
        org.joda.time.Period period5 = org.joda.time.Period.years((int) (byte) 1);
        org.joda.time.PeriodType periodType6 = period5.getPeriodType();
        java.lang.Object obj7 = null;
        boolean boolean8 = periodType6.equals(obj7);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology12);
        mutablePeriod13.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod13.add(0L);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        int int26 = dateMidnight25.getYearOfEra();
        org.joda.time.Chronology chronology27 = dateMidnight25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology27);
        mutablePeriod13.add(0L, chronology27);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (-1), chronology27);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusDays((int) (short) -1);
        int int38 = dateMidnight37.getYearOfEra();
        org.joda.time.Chronology chronology39 = dateMidnight37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (short) 10, chronology39);
        org.joda.time.MutableDateTime mutableDateTime42 = dateMidnight30.toMutableDateTime(chronology39);
        mutableDateTime42.setYear(2022);
        mutableDateTime42.setYear((-1));
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.dayOfYear();
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(chronology50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusDays((int) (short) -1);
        long long54 = dateMidnight51.getMillis();
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.days();
        org.joda.time.Period period56 = duration49.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight51, periodType55);
        org.joda.time.MutableDateTime mutableDateTime57 = dateMidnight51.toMutableDateTimeISO();
        int int58 = mutableDateTime57.getDayOfYear();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        mutableDateTime57.setChronology(chronology66);
        mutableDateTime42.setTime((org.joda.time.ReadableInstant) mutableDateTime57);
        int int70 = mutableDateTime57.getMillisOfDay();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(chronology71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.minusDays((int) (short) -1);
        int int75 = dateMidnight74.getYearOfEra();
        org.joda.time.Chronology chronology76 = dateMidnight74.getChronology();
        org.joda.time.MutableDateTime mutableDateTime77 = dateMidnight74.toMutableDateTime();
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime57, (org.joda.time.ReadableInstant) dateMidnight74, periodType78);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight(dateTimeZone81);
        int int84 = dateTimeZone81.getOffsetFromLocal((long) 1970);
        mutableDateTime57.setZone(dateTimeZone81);
        org.joda.time.YearMonthDay yearMonthDay86 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime87 = yearMonthDay86.toDateTimeAtMidnight();
        org.joda.time.YearMonthDay yearMonthDay89 = yearMonthDay86.withYear(9);
        org.joda.time.DateTime dateTime90 = yearMonthDay89.toDateTimeAtCurrentTime();
        boolean boolean91 = mutableDateTime57.isAfter((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.ReadableDuration readableDuration92 = null;
        org.joda.time.Interval interval93 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime90, readableDuration92);
        boolean boolean94 = periodType6.equals((java.lang.Object) readableDuration92);
        org.joda.time.Period period95 = period2.withPeriodType(periodType6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight23 and mutableDateTime57", (dateMidnight23.compareTo(mutableDateTime57) == 0) == dateMidnight23.equals(mutableDateTime57));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime6 = dateTime3.toDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTime dateTime16 = dateTime6.withChronology(chronology14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 10, chronology25);
        org.joda.time.DateTime dateTime29 = dateTime27.minusHours(7);
        org.joda.time.DateTime dateTime31 = dateTime29.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property32 = dateTime29.centuryOfEra();
        int int33 = dateTime29.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime29.getZone();
        org.joda.time.DateTime dateTime35 = dateTime16.toDateTime(dateTimeZone34);
        org.joda.time.DateTime.Property property36 = dateTime35.weekyear();
        org.joda.time.DateTime dateTime37 = property36.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime16", (dateTime3.compareTo(dateTime16) == 0) == dateTime3.equals(dateTime16));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.plusMonths(76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant6", (dateMidnight5.compareTo(instant6) == 0) == dateMidnight5.equals(instant6));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        org.joda.time.DateMidnight.Property property34 = dateMidnight21.dayOfMonth();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval38 = yearMonthDay37.toInterval();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay37.withChronologyRetainFields(chronology39);
        org.joda.time.DateTime dateTime41 = yearMonthDay37.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        int int48 = dateMidnight47.getYearOfEra();
        org.joda.time.Chronology chronology49 = dateMidnight47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.halfdayOfDay();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) '#');
        int int55 = dateTimeField52.getMinimumValue((org.joda.time.ReadablePartial) localDate54);
        org.joda.time.Period period56 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate57 = localDate54.plus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.YearMonthDay yearMonthDay58 = yearMonthDay37.minus((org.joda.time.ReadablePeriod) period56);
        java.lang.String str59 = yearMonthDay37.toString();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime62 = yearMonthDay37.toDateTimeAtMidnight(dateTimeZone61);
        org.joda.time.Interval interval63 = localDate36.toInterval(dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight21.withZoneRetainFields(dateTimeZone61);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(dateTimeZone61);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime65", (dateTime41.compareTo(dateTime65) == 0) == dateTime41.equals(dateTime65));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        java.lang.String str3 = calendar1.getCalendarType();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology7);
        mutablePeriod8.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod8.add(0L);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        mutablePeriod8.add(0L, chronology22);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (-1), chronology22);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (short) 10, chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = dateMidnight25.toMutableDateTime(chronology34);
        org.joda.time.DurationField durationField38 = chronology34.minutes();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology34.getZone();
        boolean boolean40 = dateTimeZone39.isFixed();
        java.util.TimeZone timeZone41 = dateTimeZone39.toTimeZone();
        java.lang.String str42 = timeZone41.getID();
        calendar1.setTimeZone(timeZone41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        int int48 = dateMidnight47.getYearOfEra();
        org.joda.time.Chronology chronology49 = dateMidnight47.getChronology();
        long long50 = dateMidnight47.getMillis();
        java.util.Locale locale54 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar55 = dateMidnight47.toCalendar(locale54);
        int int57 = calendar55.getLeastMaximum(3);
        java.util.TimeZone timeZone58 = calendar55.getTimeZone();
        int int59 = timeZone58.getRawOffset();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone58);
        calendar1.setTimeZone(timeZone58);
        java.lang.String str62 = calendar1.getCalendarType();
        calendar1.setFirstDayOfWeek(528);
        java.util.Locale locale65 = java.util.Locale.GERMAN;
        java.util.Calendar calendar66 = java.util.Calendar.getInstance(locale65);
        calendar66.setFirstDayOfWeek(24);
        calendar66.setTimeInMillis((-1L));
        java.util.TimeZone timeZone71 = calendar66.getTimeZone();
        java.util.TimeZone timeZone72 = java.util.TimeZone.getDefault();
        boolean boolean73 = timeZone71.hasSameRules(timeZone72);
        calendar1.setTimeZone(timeZone72);
        java.util.TimeZone.setDefault(timeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar60", (calendar1.compareTo(calendar60) == 0) == calendar1.equals(calendar60));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime33.era();
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime33.getZone();
        org.joda.time.Instant instant63 = mutableDateTime33.toInstant();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        org.joda.time.Duration duration69 = org.joda.time.Duration.standardHours(10L);
        long long70 = duration69.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight67, (org.joda.time.ReadableDuration) duration69);
        org.joda.time.Period period72 = duration69.toPeriod();
        org.joda.time.Duration duration74 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration76 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration78 = duration74.withDurationAdded((org.joda.time.ReadableDuration) duration76, 12);
        org.joda.time.Duration duration79 = duration76.toDuration();
        boolean boolean80 = duration69.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Duration duration81 = duration69.toDuration();
        org.joda.time.Instant instant82 = instant63.minus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Chronology chronology83 = instant63.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant63", (mutableDateTime33.compareTo(instant63) == 0) == mutableDateTime33.equals(instant63));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology4);
        mutablePeriod5.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod5.add(0L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        mutablePeriod5.add(0L, chronology19);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (-1), chronology19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (short) 10, chronology31);
        org.joda.time.MutableDateTime mutableDateTime34 = dateMidnight22.toMutableDateTime(chronology31);
        mutableDateTime34.setYear(2022);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.minusDays((int) (short) -1);
        int int43 = dateMidnight42.getYearOfEra();
        org.joda.time.Chronology chronology44 = dateMidnight42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.halfdayOfDay();
        mutableDateTime34.setRounding(dateTimeField47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime34.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime51 = property49.addWrapField(2022);
        org.joda.time.MutableDateTime mutableDateTime53 = property49.add(52);
        org.joda.time.MutableDateTime mutableDateTime54 = property49.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime54.toMutableDateTime();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(chronology58);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.minusDays((int) (short) -1);
        int int62 = dateMidnight61.getYearOfEra();
        org.joda.time.Chronology chronology63 = dateMidnight61.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology63);
        org.joda.time.DateTimeField dateTimeField65 = chronology63.millisOfDay();
        org.joda.time.DateTimeField dateTimeField66 = chronology63.era();
        org.joda.time.DurationField durationField67 = chronology63.weeks();
        org.joda.time.Chronology chronology68 = chronology63.withUTC();
        org.joda.time.Chronology chronology69 = chronology68.withUTC();
        mutableDateTime55.setChronology(chronology69);
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay((long) 15, chronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime34 and mutableDateTime55", (mutableDateTime34.compareTo(mutableDateTime55) == 0) == mutableDateTime34.equals(mutableDateTime55));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology7.getZone();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear(100);
        org.joda.time.LocalDate localDate15 = localDate13.plusWeeks(870);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        java.util.Date date19 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay20 = org.joda.time.YearMonthDay.fromDateFields(date19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay20.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay22 = property21.getYearMonthDay();
        org.joda.time.Chronology chronology23 = yearMonthDay22.getChronology();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusDays((int) (short) -1);
        int int31 = dateMidnight30.getYearOfEra();
        org.joda.time.Chronology chronology32 = dateMidnight30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology32.getZone();
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(dateTimeZone35);
        int int37 = dateMidnight36.getSecondOfMinute();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) (short) -1);
        int int42 = dateMidnight41.getYearOfEra();
        org.joda.time.Chronology chronology43 = dateMidnight41.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.minutes();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = dateTimeField45.getType();
        int int47 = dateMidnight36.get(dateTimeFieldType46);
        int int48 = dateTime24.get(dateTimeFieldType46);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime17.property(dateTimeFieldType46);
        boolean boolean50 = localDate13.isSupported(dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateTime24", (mutableDateTime17.compareTo(dateTime24) == 0) == mutableDateTime17.equals(dateTime24));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-2), (long) 86399999);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        java.lang.String str9 = chronology8.toString();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology8);
        boolean boolean11 = interval2.contains((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology14);
        mutablePeriod15.addSeconds(24);
        org.joda.time.Interval interval18 = interval2.withPeriodAfterStart((org.joda.time.ReadablePeriod) mutablePeriod15);
        long long19 = interval2.toDurationMillis();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        int int27 = dateMidnight26.getYearOfEra();
        org.joda.time.Chronology chronology28 = dateMidnight26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (short) 10, chronology28);
        org.joda.time.DateTime dateTime32 = dateTime30.minusHours(7);
        org.joda.time.DateTime dateTime34 = dateTime32.plusYears((int) (byte) 0);
        int int35 = dateTime34.getMonthOfYear();
        org.joda.time.DateTime dateTime37 = dateTime34.minus((long) 100);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration43 = duration39.withDurationAdded((org.joda.time.ReadableDuration) duration41, 12);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.now(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableDuration) duration50);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        int int59 = dateMidnight58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateMidnight58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (short) 10, chronology60);
        org.joda.time.DateTime dateTime64 = dateTime62.minusHours(7);
        org.joda.time.DateTime dateTime66 = dateTime64.plusYears((int) (byte) 0);
        int int67 = dateTime66.getMonthOfYear();
        org.joda.time.Interval interval68 = duration50.toIntervalFrom((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Duration duration69 = duration39.minus((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate72 = org.joda.time.LocalDate.now(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = org.joda.time.DateTime.now(dateTimeZone71);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration50, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateMidnight dateMidnight76 = new org.joda.time.DateMidnight(chronology75);
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight76.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateMidnight dateMidnight80 = dateMidnight78.withZoneRetainFields(dateTimeZone79);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight(chronology81);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight82.minusDays((int) (short) -1);
        int int85 = dateMidnight84.getYearOfEra();
        org.joda.time.Chronology chronology86 = dateMidnight84.getChronology();
        long long87 = dateMidnight84.getMillis();
        org.joda.time.ReadableDuration readableDuration88 = null;
        org.joda.time.ReadableInstant readableInstant89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period(readableDuration88, readableInstant89);
        org.joda.time.PeriodType periodType91 = period90.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight80, (org.joda.time.ReadableInstant) dateMidnight84, periodType91);
        org.joda.time.PeriodType periodType93 = periodType91.withHoursRemoved();
        org.joda.time.PeriodType periodType94 = periodType91.withWeeksRemoved();
        java.lang.String str95 = periodType94.toString();
        org.joda.time.Period period96 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime73, periodType94);
        org.joda.time.Interval interval97 = interval2.withPeriodAfterStart((org.joda.time.ReadablePeriod) period96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime47", (dateTime10.compareTo(dateTime47) == 0) == dateTime10.equals(dateTime47));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        java.lang.String str3 = calendar1.getCalendarType();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology7);
        mutablePeriod8.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod8.add(0L);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        mutablePeriod8.add(0L, chronology22);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (-1), chronology22);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (short) 10, chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = dateMidnight25.toMutableDateTime(chronology34);
        org.joda.time.DurationField durationField38 = chronology34.minutes();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology34.getZone();
        boolean boolean40 = dateTimeZone39.isFixed();
        java.util.TimeZone timeZone41 = dateTimeZone39.toTimeZone();
        java.lang.String str42 = timeZone41.getID();
        calendar1.setTimeZone(timeZone41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        int int48 = dateMidnight47.getYearOfEra();
        org.joda.time.Chronology chronology49 = dateMidnight47.getChronology();
        long long50 = dateMidnight47.getMillis();
        java.util.Locale locale54 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar55 = dateMidnight47.toCalendar(locale54);
        int int57 = calendar55.getLeastMaximum(3);
        java.util.TimeZone timeZone58 = calendar55.getTimeZone();
        int int59 = timeZone58.getRawOffset();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone58);
        calendar1.setTimeZone(timeZone58);
        java.lang.String str62 = timeZone58.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar60", (calendar1.compareTo(calendar60) == 0) == calendar1.equals(calendar60));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.withZoneRetainFields(dateTimeZone6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        long long14 = dateMidnight11.getMillis();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration15, readableInstant16);
        org.joda.time.PeriodType periodType18 = period17.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight7, (org.joda.time.ReadableInstant) dateMidnight11, periodType18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours(10L);
        long long26 = duration25.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight23, (org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight7.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Instant instant29 = instant1.minus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withMillisOfSecond(10);
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardHours(10L);
        long long38 = duration37.getStandardSeconds();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime33.withDurationAdded((org.joda.time.ReadableDuration) duration37, (int) (short) 10);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        boolean boolean43 = duration37.isEqual((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Instant instant44 = instant29.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTime dateTime45 = instant29.toDateTime();
        org.joda.time.DateTime dateTime46 = instant29.toDateTime();
        org.joda.time.DateTime dateTime48 = dateTime46.plusDays(528);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and dateTime45", (instant29.compareTo(dateTime45) == 0) == instant29.equals(dateTime45));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.plus(1L);
        org.joda.time.Instant instant6 = instant3.withDurationAdded((long) 54152181, (-1));
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology11);
        mutablePeriod12.setPeriod((long) (short) 10, (long) (short) -1);
        int int17 = mutablePeriod12.getValue(0);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        org.joda.time.Duration duration22 = mutablePeriod12.toDurationTo((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration28 = duration24.withDurationAdded((org.joda.time.ReadableDuration) duration26, 12);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.Duration duration35 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        int int44 = dateMidnight43.getYearOfEra();
        org.joda.time.Chronology chronology45 = dateMidnight43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 10, chronology45);
        org.joda.time.DateTime dateTime49 = dateTime47.minusHours(7);
        org.joda.time.DateTime dateTime51 = dateTime49.plusYears((int) (byte) 0);
        int int52 = dateTime51.getMonthOfYear();
        org.joda.time.Interval interval53 = duration35.toIntervalFrom((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Duration duration54 = duration24.minus((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Duration duration55 = duration22.plus((org.joda.time.ReadableDuration) duration35);
        boolean boolean56 = duration8.isEqual((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Duration duration59 = duration35.withDurationAdded((long) 999, 53);
        org.joda.time.Instant instant60 = instant6.minus((org.joda.time.ReadableDuration) duration59);
        org.joda.time.Instant instant62 = instant60.plus((-36000001L));
        org.joda.time.Instant instant63 = instant62.toInstant();
        org.joda.time.Instant instant64 = instant62.toInstant();
        org.joda.time.DateTime dateTime65 = instant62.toDateTime();
        boolean boolean67 = instant62.isBefore(31L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant62 and dateTime65", (instant62.compareTo(dateTime65) == 0) == instant62.equals(dateTime65));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime33.era();
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime33.getZone();
        org.joda.time.Instant instant63 = mutableDateTime33.toInstant();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        org.joda.time.Duration duration69 = org.joda.time.Duration.standardHours(10L);
        long long70 = duration69.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight67, (org.joda.time.ReadableDuration) duration69);
        org.joda.time.Period period72 = duration69.toPeriod();
        org.joda.time.Duration duration74 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration76 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration78 = duration74.withDurationAdded((org.joda.time.ReadableDuration) duration76, 12);
        org.joda.time.Duration duration79 = duration76.toDuration();
        boolean boolean80 = duration69.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Duration duration81 = duration69.toDuration();
        org.joda.time.Instant instant82 = instant63.minus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Seconds seconds83 = duration81.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant63", (mutableDateTime33.compareTo(instant63) == 0) == mutableDateTime33.equals(instant63));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval2 = yearMonthDay1.toInterval();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay1.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.halfdayOfDay();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) '#');
        int int19 = dateTimeField16.getMinimumValue((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.Period period20 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate21 = localDate18.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay1.minus((org.joda.time.ReadablePeriod) period20);
        int int23 = yearMonthDay22.getYear();
        int int24 = yearMonthDay22.size();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = dateTime28.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime31 = dateTime28.toDateTime();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusDays((int) (short) -1);
        int int38 = dateMidnight37.getYearOfEra();
        org.joda.time.Chronology chronology39 = dateMidnight37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology39);
        org.joda.time.DateTime dateTime41 = dateTime31.withChronology(chronology39);
        org.joda.time.Chronology chronology42 = dateTime41.getChronology();
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay22.withChronologyRetainFields(chronology42);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay((-1901759951L), chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime28", (dateTime5.compareTo(dateTime28) == 0) == dateTime5.equals(dateTime28));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = yearMonthDay0.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        int int12 = mutablePeriod7.getValue(0);
        mutablePeriod7.addMinutes(0);
        mutablePeriod7.setMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay0.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.DateTime dateTime18 = yearMonthDay17.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        int int26 = dateMidnight25.getYearOfEra();
        org.joda.time.Chronology chronology27 = dateMidnight25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) 10, chronology27);
        org.joda.time.DateTime dateTime31 = dateTime29.minusHours(7);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) (byte) 0);
        int int34 = dateTime33.getMonthOfYear();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology38);
        mutablePeriod39.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod39.add(0L);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.minusDays((int) (short) -1);
        int int52 = dateMidnight51.getYearOfEra();
        org.joda.time.Chronology chronology53 = dateMidnight51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology53);
        mutablePeriod39.add(0L, chronology53);
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight((long) (-1), chronology53);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusDays((int) (short) -1);
        int int64 = dateMidnight63.getYearOfEra();
        org.joda.time.Chronology chronology65 = dateMidnight63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology65);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (short) 10, chronology65);
        org.joda.time.MutableDateTime mutableDateTime68 = dateMidnight56.toMutableDateTime(chronology65);
        mutableDateTime68.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime68.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime68.toMutableDateTime(dateTimeZone72);
        org.joda.time.YearMonthDay yearMonthDay74 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray75 = yearMonthDay74.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = yearMonthDay74.toDateTimeAtCurrentTime(dateTimeZone76);
        org.joda.time.Duration duration78 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime68, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.PeriodType periodType81 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType82 = periodType81.withWeeksRemoved();
        org.joda.time.Period period83 = new org.joda.time.Period((long) 1970, (long) 3, periodType81);
        org.joda.time.Period period84 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableDuration) duration78, periodType81);
        org.joda.time.DateTime.Property property85 = dateTime33.dayOfYear();
        org.joda.time.DateTime.Property property86 = dateTime33.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate89 = org.joda.time.LocalDate.now(dateTimeZone88);
        org.joda.time.DateTime dateTime90 = org.joda.time.DateTime.now(dateTimeZone88);
        org.joda.time.Duration duration93 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime90, (org.joda.time.ReadableDuration) duration93);
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTimeZone dateTimeZone96 = dateTime90.getZone();
        org.joda.time.DateTime dateTime97 = yearMonthDay17.toDateTimeAtCurrentTime(dateTimeZone96);
        org.joda.time.YearMonthDay yearMonthDay99 = yearMonthDay17.plusDays(960);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime90", (dateTime3.compareTo(dateTime90) == 0) == dateTime3.equals(dateTime90));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) '#');
        long long2 = duration1.getMillis();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        long long9 = dateMidnight6.getMillis();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.days();
        org.joda.time.Period period11 = duration4.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight6, periodType10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight6.toMutableDateTimeISO();
        int int13 = mutableDateTime12.getDayOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutableDateTime12.setChronology(chronology21);
        org.joda.time.Period period24 = duration1.toPeriodTo((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime12.setMillisOfDay((int) (byte) 1);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.withZoneRetainFields(dateTimeZone31);
        org.joda.time.Instant instant33 = dateMidnight32.toInstant();
        org.joda.time.Chronology chronology34 = instant33.getChronology();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval36 = yearMonthDay35.toInterval();
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval38 = yearMonthDay37.toInterval();
        org.joda.time.Interval interval39 = interval36.gap((org.joda.time.ReadableInterval) interval38);
        boolean boolean41 = interval36.isBefore(100L);
        long long42 = interval36.toDurationMillis();
        long long43 = interval36.getStartMillis();
        org.joda.time.Duration duration44 = interval36.toDuration();
        org.joda.time.Instant instant45 = instant33.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        org.joda.time.Duration duration51 = org.joda.time.Duration.standardHours(10L);
        long long52 = duration51.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight49, (org.joda.time.ReadableDuration) duration51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(chronology54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.minusDays((int) (short) -1);
        long long58 = dateMidnight55.getMillis();
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight55.withMillis((long) 7);
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight(chronology63);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.minusDays((int) (short) -1);
        long long67 = dateMidnight64.getMillis();
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.days();
        org.joda.time.Period period69 = duration62.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight64, periodType68);
        org.joda.time.MutableDateTime mutableDateTime70 = dateMidnight64.toMutableDateTimeISO();
        int int71 = dateMidnight60.compareTo((org.joda.time.ReadableInstant) mutableDateTime70);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight60.plusWeeks(10);
        org.joda.time.Period period74 = duration51.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight73);
        org.joda.time.Duration duration77 = duration51.withDurationAdded((long) (short) 1, 100);
        org.joda.time.Instant instant78 = instant33.minus((org.joda.time.ReadableDuration) duration51);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant33", (dateMidnight8.compareTo(instant33) == 0) == dateMidnight8.equals(instant33));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime40, dateTimeZone42);
        boolean boolean45 = dateTimeZone42.isFixed();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone42);
        java.lang.String str48 = dateTimeZone42.getShortName((long) 75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and dateTime44", (mutableDateTime33.compareTo(dateTime44) == 0) == mutableDateTime33.equals(dateTime44));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        boolean boolean4 = periodType2.equals((java.lang.Object) instant3);
        org.joda.time.PeriodType periodType5 = periodType2.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withMillisRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withMinutesRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.clockhourOfDay();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100, chronology18);
        org.joda.time.DurationField durationField22 = durationFieldType9.getField(chronology18);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        int int27 = dateMidnight26.getYearOfEra();
        org.joda.time.Chronology chronology28 = dateMidnight26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfDay();
        org.joda.time.DurationField durationField30 = durationFieldType9.getField(chronology28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField32 = chronology28.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField33 = chronology28.centuryOfEra();
        boolean boolean34 = dateTimeFieldType8.isSupported(chronology28);
        org.joda.time.Period period35 = new org.joda.time.Period(19818086410921L, 55406L, periodType5, chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime31", (instant3.compareTo(dateTime31) == 0) == instant3.equals(dateTime31));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate.Property property4 = localDate2.year();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTime();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTime dateTime21 = dateTime11.withChronology(chronology19);
        org.joda.time.DateTime.Property property22 = dateTime21.year();
        org.joda.time.DateTime.Property property23 = dateTime21.minuteOfDay();
        org.joda.time.Period period25 = org.joda.time.Period.years((int) (byte) 1);
        org.joda.time.DateTime dateTime26 = dateTime21.minus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Duration duration31 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str34 = localDate33.toString();
        org.joda.time.LocalDate.Property property35 = localDate33.weekyear();
        int int36 = localDate33.getCenturyOfEra();
        org.joda.time.DateTime dateTime37 = localDate33.toDateTimeAtMidnight();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration31, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.withMillis((long) 24);
        long long42 = dateMidnight41.getMillis();
        int int43 = dateMidnight41.getDayOfYear();
        org.joda.time.Period period45 = org.joda.time.Period.hours(3);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight41, (org.joda.time.ReadablePeriod) period45);
        org.joda.time.Interval interval47 = interval38.withPeriodAfterStart((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(chronology50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusDays((int) (short) -1);
        long long54 = dateMidnight51.getMillis();
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.days();
        org.joda.time.Period period56 = duration49.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight51, periodType55);
        org.joda.time.MutableDateTime mutableDateTime57 = dateMidnight51.toMutableDateTimeISO();
        int int58 = mutableDateTime57.getDayOfYear();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        mutableDateTime57.setChronology(chronology66);
        org.joda.time.DateTimeField dateTimeField69 = chronology66.year();
        org.joda.time.Interval interval70 = interval38.withChronology(chronology66);
        org.joda.time.Period period71 = new org.joda.time.Period((long) 292269054, 2627135940001L, chronology66);
        org.joda.time.MutablePeriod mutablePeriod72 = period71.toMutablePeriod();
        org.joda.time.Period period74 = period71.minusMillis(228);
        org.joda.time.Period period75 = period25.withFields((org.joda.time.ReadablePeriod) period71);
        org.joda.time.LocalDate localDate76 = localDate2.plus((org.joda.time.ReadablePeriod) period75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime21", (dateTime8.compareTo(dateTime21) == 0) == dateTime8.equals(dateTime21));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime33.era();
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime33.getZone();
        org.joda.time.Instant instant63 = mutableDateTime33.toInstant();
        org.joda.time.Instant instant65 = instant63.plus(3024000000L);
        org.joda.time.Chronology chronology66 = instant65.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant63", (mutableDateTime33.compareTo(instant63) == 0) == mutableDateTime33.equals(instant63));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime6 = dateTime3.toDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTime dateTime16 = dateTime6.withChronology(chronology14);
        org.joda.time.DateTime.Property property17 = dateTime16.year();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime19 = property17.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime16", (dateTime3.compareTo(dateTime16) == 0) == dateTime3.equals(dateTime16));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration13, readableInstant14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight9, periodType16);
        int int18 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant19 = dateMidnight5.toInstant();
        org.joda.time.Instant instant21 = instant19.plus((long) 32769);
        org.joda.time.DateTime dateTime22 = instant19.toDateTimeISO();
        org.joda.time.DateTime.Property property23 = dateTime22.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant19", (dateMidnight3.compareTo(instant19) == 0) == dateMidnight3.equals(instant19));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.joda.time.Instant instant9 = instant6.minus((-79200000L));
        org.joda.time.Period period11 = org.joda.time.Period.millis(0);
        int int12 = period11.getSeconds();
        org.joda.time.Duration duration13 = period11.toStandardDuration();
        org.joda.time.Instant instant14 = instant6.plus((org.joda.time.ReadableDuration) duration13);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime16 = yearMonthDay15.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime18 = dateTime16.minusMonths((int) (short) 100);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration24 = duration20.withDurationAdded((org.joda.time.ReadableDuration) duration22, 12);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.Duration duration31 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableDuration) duration31);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusDays((int) (short) -1);
        int int40 = dateMidnight39.getYearOfEra();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (short) 10, chronology41);
        org.joda.time.DateTime dateTime45 = dateTime43.minusHours(7);
        org.joda.time.DateTime dateTime47 = dateTime45.plusYears((int) (byte) 0);
        int int48 = dateTime47.getMonthOfYear();
        org.joda.time.Interval interval49 = duration31.toIntervalFrom((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Duration duration50 = duration20.minus((org.joda.time.ReadableDuration) duration31);
        boolean boolean51 = dateTime16.equals((java.lang.Object) duration31);
        org.joda.time.Duration duration54 = duration31.withDurationAdded((long) 19, 363);
        boolean boolean55 = duration13.isLongerThan((org.joda.time.ReadableDuration) duration54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfWeek();
        int int17 = property16.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime15", (dateTime10.compareTo(mutableDateTime15) == 0) == dateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime6 = dateTime3.toDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTime dateTime16 = dateTime6.withChronology(chronology14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 10, chronology25);
        org.joda.time.DateTime dateTime29 = dateTime27.minusHours(7);
        org.joda.time.DateTime dateTime31 = dateTime29.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property32 = dateTime29.centuryOfEra();
        int int33 = dateTime29.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime29.getZone();
        org.joda.time.DateTime dateTime35 = dateTime16.toDateTime(dateTimeZone34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusDays((int) (short) -1);
        int int40 = dateMidnight39.getYearOfEra();
        int int41 = dateMidnight39.getWeekyear();
        org.joda.time.YearMonthDay yearMonthDay42 = dateMidnight39.toYearMonthDay();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight39.withFields((org.joda.time.ReadablePartial) localDate44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        int int50 = dateMidnight49.getYearOfEra();
        org.joda.time.Chronology chronology51 = dateMidnight49.getChronology();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight49.plusYears(100);
        org.joda.time.DateMidnight.Property property54 = dateMidnight49.yearOfEra();
        boolean boolean55 = dateMidnight45.isAfter((org.joda.time.ReadableInstant) dateMidnight49);
        org.joda.time.YearMonthDay yearMonthDay56 = dateMidnight45.toYearMonthDay();
        boolean boolean57 = dateTime35.isEqual((org.joda.time.ReadableInstant) dateMidnight45);
        org.joda.time.DateMidnight.Property property58 = dateMidnight45.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime16", (dateTime3.compareTo(dateTime16) == 0) == dateTime3.equals(dateTime16));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime6 = dateTime3.toDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTime dateTime16 = dateTime6.withChronology(chronology14);
        org.joda.time.DateTime.Property property17 = dateTime16.year();
        org.joda.time.DateTime.Property property18 = dateTime16.minuteOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        int int26 = dateMidnight25.getYearOfEra();
        org.joda.time.Chronology chronology27 = dateMidnight25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) 10, chronology27);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMonths(10);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (short) 10, chronology40);
        org.joda.time.DateTime dateTime43 = dateTime31.toDateTime(chronology40);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology53);
        mutablePeriod54.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod54.add(0L);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight(chronology63);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.minusDays((int) (short) -1);
        int int67 = dateMidnight66.getYearOfEra();
        org.joda.time.Chronology chronology68 = dateMidnight66.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology68);
        mutablePeriod54.add(0L, chronology68);
        org.joda.time.Period period71 = new org.joda.time.Period((long) 0, (long) 6, chronology68);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime(2, 12, (int) (short) 10, 3, (int) (byte) 1, chronology68);
        org.joda.time.DateTime dateTime73 = dateTime31.withChronology(chronology68);
        org.joda.time.DateTimeField dateTimeField74 = chronology68.yearOfEra();
        boolean boolean75 = property18.equals((java.lang.Object) dateTimeField74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime16", (dateTime3.compareTo(dateTime16) == 0) == dateTime3.equals(dateTime16));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateTime dateTime4 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        int int11 = dateMidnight10.getYearOfEra();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.halfdayOfDay();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) '#');
        int int18 = dateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.Period period19 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate20 = localDate17.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay0.minus((org.joda.time.ReadablePeriod) period19);
        int int22 = yearMonthDay21.getYear();
        int int23 = yearMonthDay21.size();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime30 = dateTime27.toDateTime();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        org.joda.time.DateTime dateTime40 = dateTime30.withChronology(chronology38);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay21.withChronologyRetainFields(chronology41);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray43 = yearMonthDay21.getFieldTypes();
        org.joda.time.DateTime dateTime44 = yearMonthDay21.toDateTimeAtCurrentTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime40", (dateTime27.compareTo(dateTime40) == 0) == dateTime27.equals(dateTime40));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime40, dateTimeZone42);
        java.lang.String str45 = dateTimeZone42.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and dateTime44", (mutableDateTime33.compareTo(dateTime44) == 0) == mutableDateTime33.equals(dateTime44));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = yearMonthDay0.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = yearMonthDay0.getFieldType((int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay0.withYear(156);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime13 = dateTime11.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime14 = dateTime11.toDateTime();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        org.joda.time.DateTime dateTime24 = dateTime14.withChronology(chronology22);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology33);
        org.joda.time.DateTime dateTime37 = dateTime35.minusHours(7);
        org.joda.time.DateTime dateTime39 = dateTime37.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property40 = dateTime37.centuryOfEra();
        int int41 = dateTime37.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime37.getZone();
        org.joda.time.DateTime dateTime43 = dateTime24.toDateTime(dateTimeZone42);
        java.lang.String str44 = dateTimeZone42.getID();
        org.joda.time.DateTime dateTime45 = yearMonthDay7.toDateTimeAtCurrentTime(dateTimeZone42);
        boolean boolean47 = dateTime45.isEqual(1000L);
        org.joda.time.DateTime dateTime49 = dateTime45.minusMinutes(339);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime11", (dateTime3.compareTo(dateTime11) == 0) == dateTime3.equals(dateTime11));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(15L);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("de_DE");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateMidnight dateMidnight6 = localDate2.toDateMidnight(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(2208986640000L, dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.withDurationAdded((long) 32778, 913);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology14);
        mutablePeriod15.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod15.add(0L);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        int int28 = dateMidnight27.getYearOfEra();
        org.joda.time.Chronology chronology29 = dateMidnight27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology29);
        mutablePeriod15.add(0L, chronology29);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (-1), chronology29);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusDays((int) (short) -1);
        int int40 = dateMidnight39.getYearOfEra();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (short) 10, chronology41);
        org.joda.time.MutableDateTime mutableDateTime44 = dateMidnight32.toMutableDateTime(chronology41);
        org.joda.time.DurationField durationField45 = chronology41.minutes();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology41.getZone();
        boolean boolean47 = dateTimeZone46.isFixed();
        java.util.TimeZone timeZone48 = dateTimeZone46.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight10.toMutableDateTime(dateTimeZone46);
        int int51 = dateTimeZone46.getStandardOffset((long) 192);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight7 and mutableDateTime49", (dateMidnight7.compareTo(mutableDateTime49) == 0) == dateMidnight7.equals(mutableDateTime49));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        int int15 = timeZone14.getRawOffset();
        java.util.Calendar.Builder builder16 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder18 = builder16.setInstant(4320000000L);
        java.util.Calendar.Builder builder20 = builder18.setInstant((long) (short) 100);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        long long27 = dateMidnight24.getMillis();
        java.util.Locale locale31 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar32 = dateMidnight24.toCalendar(locale31);
        int int34 = calendar32.getLeastMaximum(3);
        java.util.TimeZone timeZone35 = calendar32.getTimeZone();
        timeZone35.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone35);
        java.util.Calendar.Builder builder39 = builder18.setTimeZone(timeZone35);
        java.util.TimeZone.setDefault(timeZone35);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        long long47 = dateMidnight44.getMillis();
        java.util.Locale locale51 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar52 = dateMidnight44.toCalendar(locale51);
        int int54 = calendar52.getLeastMaximum(3);
        java.util.TimeZone timeZone55 = calendar52.getTimeZone();
        timeZone55.setID("PT0S");
        int int59 = timeZone55.getOffset(70L);
        int int61 = timeZone55.getOffset(1648166400036L);
        boolean boolean62 = timeZone35.hasSameRules(timeZone55);
        boolean boolean63 = timeZone14.hasSameRules(timeZone55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar32", (calendar11.compareTo(calendar32) == 0) == calendar11.equals(calendar32));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (byte) 100, 8, 15, (int) (byte) 0, (int) (byte) 0, 5, (int) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology10);
        mutablePeriod11.setPeriod((long) (short) 10, (long) (short) -1);
        int int15 = mutablePeriod11.getMonths();
        mutablePeriod11.addMinutes((int) (short) 0);
        org.joda.time.DateTime dateTime18 = dateTime7.plus((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((long) 10, chronology20);
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = timeOfDay21.getFields();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((long) 10, chronology24);
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = timeOfDay25.getFields();
        org.joda.time.Period period27 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay21, (org.joda.time.ReadablePartial) timeOfDay25);
        int[] intArray28 = timeOfDay25.getValues();
        org.joda.time.DateTime dateTime29 = timeOfDay25.toDateTimeToday();
        org.joda.time.DateMidnight dateMidnight30 = dateTime29.toDateMidnight();
        org.joda.time.DateTime dateTime32 = dateTime29.withMillisOfSecond(3);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology42);
        mutablePeriod43.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod43.add(0L);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutablePeriod43.add(0L, chronology57);
        org.joda.time.Period period60 = new org.joda.time.Period((long) 0, (long) 6, chronology57);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(2, 12, (int) (short) 10, 3, (int) (byte) 1, chronology57);
        boolean boolean62 = dateTime32.isAfter((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean63 = dateTime18.isBefore((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime.Property property64 = dateTime18.dayOfMonth();
        org.joda.time.Instant instant65 = dateTime18.toInstant();
        org.joda.time.Chronology chronology66 = instant65.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant65", (dateTime18.compareTo(instant65) == 0) == dateTime18.equals(instant65));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime15 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.Instant instant16 = dateTime14.toInstant();
        org.joda.time.YearMonthDay yearMonthDay17 = dateTime14.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant16", (dateTime14.compareTo(instant16) == 0) == dateTime14.equals(instant16));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("ISOChronology[Etc/UTC]");
        java.util.TimeZone.setDefault(timeZone1);
        java.time.ZoneId zoneId3 = timeZone1.toZoneId();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId3);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone(zoneId3);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone(zoneId3);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone(zoneId3);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        int int14 = dateMidnight13.getYearOfEra();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusMillis(0);
        int[] intArray22 = new int[] {};
        int int23 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localDateTime21, intArray22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.plusMonths(31);
        int int30 = localDateTime29.getYearOfCentury();
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale31);
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale31.getDisplayCountry(locale33);
        java.lang.String str35 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) localDateTime29, locale33);
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone7, locale33);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.minusDays((int) (short) -1);
        int int43 = dateMidnight42.getYearOfEra();
        org.joda.time.Chronology chronology44 = dateMidnight42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.millisOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.era();
        java.util.Locale locale51 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.lang.String str52 = locale51.getDisplayName();
        java.util.Locale.setDefault(locale51);
        int int54 = dateTimeField47.getMaximumShortTextLength(locale51);
        java.lang.String str55 = timeZone7.getDisplayName(locale51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar36", (calendar32.compareTo(calendar36) == 0) == calendar32.equals(calendar36));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withYearOfEra(201);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant6", (dateMidnight5.compareTo(instant6) == 0) == dateMidnight5.equals(instant6));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.plus(1L);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardHours(10L);
        long long10 = duration9.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight7, (org.joda.time.ReadableDuration) duration9);
        org.joda.time.Period period12 = duration9.toPeriod();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 10, chronology21);
        org.joda.time.DateTime dateTime25 = dateTime23.minusHours(7);
        org.joda.time.DateTime dateTime27 = dateTime25.plusYears((int) (byte) 0);
        int int28 = dateTime27.getMonthOfYear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology32);
        mutablePeriod33.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod33.add(0L);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(chronology42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.minusDays((int) (short) -1);
        int int46 = dateMidnight45.getYearOfEra();
        org.joda.time.Chronology chronology47 = dateMidnight45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology47);
        mutablePeriod33.add(0L, chronology47);
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (-1), chronology47);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(chronology54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.minusDays((int) (short) -1);
        int int58 = dateMidnight57.getYearOfEra();
        org.joda.time.Chronology chronology59 = dateMidnight57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (short) 10, chronology59);
        org.joda.time.MutableDateTime mutableDateTime62 = dateMidnight50.toMutableDateTime(chronology59);
        mutableDateTime62.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime62.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime62.toMutableDateTime(dateTimeZone66);
        org.joda.time.YearMonthDay yearMonthDay68 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray69 = yearMonthDay68.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = yearMonthDay68.toDateTimeAtCurrentTime(dateTimeZone70);
        org.joda.time.Duration duration72 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime62, (org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType76 = periodType75.withWeeksRemoved();
        org.joda.time.Period period77 = new org.joda.time.Period((long) 1970, (long) 3, periodType75);
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration72, periodType75);
        org.joda.time.Period period79 = duration9.toPeriod(periodType75);
        org.joda.time.Instant instant80 = instant3.plus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Instant instant83 = instant3.withDurationAdded(3576897800000L, 870);
        org.joda.time.Duration duration85 = org.joda.time.Duration.standardHours(10L);
        long long86 = duration85.getStandardSeconds();
        org.joda.time.Duration duration89 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration90 = duration85.plus((org.joda.time.ReadableDuration) duration89);
        org.joda.time.Duration duration91 = duration89.toDuration();
        long long92 = duration91.getMillis();
        org.joda.time.PeriodType periodType93 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Instant instant94 = new org.joda.time.Instant();
        boolean boolean95 = periodType93.equals((java.lang.Object) instant94);
        org.joda.time.PeriodType periodType96 = periodType93.withYearsRemoved();
        org.joda.time.Period period97 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant3, (org.joda.time.ReadableDuration) duration91, periodType96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime71 and instant94", (dateTime71.compareTo(instant94) == 0) == dateTime71.equals(instant94));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        long long49 = instant47.getMillis();
        org.joda.time.Instant instant51 = instant47.plus((-2100623334000L));
        org.joda.time.MutableDateTime mutableDateTime52 = instant51.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant47", (dateTime23.compareTo(instant47) == 0) == dateTime23.equals(instant47));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.days();
        org.joda.time.Period period17 = new org.joda.time.Period(1645488000000L, periodType16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration18, readableInstant19);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period22 = period17.normalizedStandard(periodType21);
        org.joda.time.Period period23 = duration13.toPeriodTo(readableInstant14, periodType21);
        org.joda.time.Duration duration26 = duration13.withDurationAdded((long) 53, 5);
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(locale27);
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromCalendarFields(calendar28);
        org.joda.time.DateTime dateTime30 = localTime29.toDateTimeToday();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime30);
        java.util.GregorianCalendar gregorianCalendar32 = dateTime30.toGregorianCalendar();
        org.joda.time.DateTime.Property property33 = dateTime30.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and gregorianCalendar32", (calendar28.compareTo(gregorianCalendar32) == 0) == calendar28.equals(gregorianCalendar32));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.plus(1L);
        org.joda.time.Instant instant6 = instant3.withDurationAdded((long) 54152181, (-1));
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology11);
        mutablePeriod12.setPeriod((long) (short) 10, (long) (short) -1);
        int int17 = mutablePeriod12.getValue(0);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        org.joda.time.Duration duration22 = mutablePeriod12.toDurationTo((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration28 = duration24.withDurationAdded((org.joda.time.ReadableDuration) duration26, 12);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.Duration duration35 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        int int44 = dateMidnight43.getYearOfEra();
        org.joda.time.Chronology chronology45 = dateMidnight43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 10, chronology45);
        org.joda.time.DateTime dateTime49 = dateTime47.minusHours(7);
        org.joda.time.DateTime dateTime51 = dateTime49.plusYears((int) (byte) 0);
        int int52 = dateTime51.getMonthOfYear();
        org.joda.time.Interval interval53 = duration35.toIntervalFrom((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Duration duration54 = duration24.minus((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Duration duration55 = duration22.plus((org.joda.time.ReadableDuration) duration35);
        boolean boolean56 = duration8.isEqual((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Duration duration59 = duration35.withDurationAdded((long) 999, 53);
        org.joda.time.Instant instant60 = instant6.minus((org.joda.time.ReadableDuration) duration59);
        org.joda.time.Instant instant62 = instant60.plus((-36000001L));
        org.joda.time.Instant instant63 = instant62.toInstant();
        org.joda.time.Instant instant64 = instant62.toInstant();
        org.joda.time.DateTime dateTime65 = instant62.toDateTimeISO();
        org.joda.time.Instant instant68 = instant62.withDurationAdded((long) 25, 960);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant62 and dateTime65", (instant62.compareTo(dateTime65) == 0) == instant62.equals(dateTime65));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localTime2.toDateTimeToday();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        java.lang.String str5 = property4.toString();
        java.util.Locale locale9 = new java.util.Locale("15:02:03.805", "DurationField[weekyears]", "Standard");
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        java.lang.String str11 = property4.getAsShortText(locale9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar10", (calendar1.compareTo(calendar10) == 0) == calendar1.equals(calendar10));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setWeekOfWeekyear((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.secondOfMinute();
        java.lang.String str37 = mutableDateTime33.toString();
        int int38 = mutableDateTime33.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.weekOfWeekyear();
        mutableDateTime33.setYear(50);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        int int49 = dateMidnight48.getYearOfEra();
        org.joda.time.Chronology chronology50 = dateMidnight48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (short) 10, chronology50);
        org.joda.time.DateTime dateTime54 = dateTime52.plusSeconds(14);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateTime dateTime57 = dateTime52.withDurationAdded(readableDuration55, (int) (short) 100);
        boolean boolean58 = mutableDateTime33.isAfter((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(chronology59);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight60.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.withZoneRetainFields(dateTimeZone63);
        org.joda.time.Instant instant65 = dateMidnight64.toInstant();
        org.joda.time.MutableDateTime mutableDateTime66 = instant65.toMutableDateTime();
        mutableDateTime33.setMillis((org.joda.time.ReadableInstant) mutableDateTime66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight16 and instant65", (dateMidnight16.compareTo(instant65) == 0) == dateMidnight16.equals(instant65));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration13, readableInstant14);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight9, periodType16);
        int int18 = dateMidnight5.getDayOfYear();
        org.joda.time.Instant instant19 = dateMidnight5.toInstant();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight5.minusYears(54145870);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant19", (dateMidnight5.compareTo(instant19) == 0) == dateMidnight5.equals(instant19));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateMidnight dateMidnight4 = yearMonthDay3.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay3.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay8 = property7.getYearMonthDay();
        org.joda.time.Interval interval9 = yearMonthDay8.toInterval();
        long long10 = interval9.getStartMillis();
        org.joda.time.Chronology chronology11 = interval9.getChronology();
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology19);
        mutablePeriod20.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod20.add(0L);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        mutablePeriod20.add(0L, chronology34);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (-1), chronology34);
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType15.getField(chronology34);
        org.joda.time.DurationField durationField39 = chronology34.centuries();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) (short) 0, chronology34);
        org.joda.time.DateTimeField dateTimeField41 = chronology34.era();
        org.joda.time.DateTime dateTime42 = instant12.toDateTime(chronology34);
        org.joda.time.Interval interval43 = interval9.withChronology(chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant12", (dateTime6.compareTo(instant12) == 0) == dateTime6.equals(instant12));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) 905);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.withZoneRetainFields(dateTimeZone6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        long long14 = dateMidnight11.getMillis();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration15, readableInstant16);
        org.joda.time.PeriodType periodType18 = period17.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight7, (org.joda.time.ReadableInstant) dateMidnight11, periodType18);
        int int20 = dateMidnight7.getDayOfYear();
        org.joda.time.Instant instant21 = dateMidnight7.toInstant();
        org.joda.time.Instant instant23 = instant21.plus((long) 32769);
        org.joda.time.Instant instant26 = instant21.withDurationAdded((long) 726, 20);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = yearMonthDay27.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        int int39 = mutablePeriod34.getValue(0);
        mutablePeriod34.addMinutes(0);
        mutablePeriod34.setMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay27.minus((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.Chronology chronology45 = yearMonthDay44.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = instant21.toMutableDateTime(chronology45);
        org.joda.time.Interval interval47 = duration1.toIntervalTo((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant21", (dateMidnight5.compareTo(instant21) == 0) == dateMidnight5.equals(instant21));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant(4320000000L);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) (short) 100);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        long long11 = dateMidnight8.getMillis();
        java.util.Locale locale15 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar16 = dateMidnight8.toCalendar(locale15);
        int int18 = calendar16.getLeastMaximum(3);
        java.util.TimeZone timeZone19 = calendar16.getTimeZone();
        timeZone19.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone19);
        java.util.Calendar.Builder builder23 = builder2.setTimeZone(timeZone19);
        java.util.TimeZone.setDefault(timeZone19);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        long long31 = dateMidnight28.getMillis();
        java.util.Locale locale35 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar36 = dateMidnight28.toCalendar(locale35);
        int int38 = calendar36.getLeastMaximum(3);
        java.util.TimeZone timeZone39 = calendar36.getTimeZone();
        timeZone39.setID("PT0S");
        int int43 = timeZone39.getOffset(70L);
        int int45 = timeZone39.getOffset(1648166400036L);
        boolean boolean46 = timeZone19.hasSameRules(timeZone39);
        java.util.TimeZone.setDefault(timeZone39);
        timeZone39.setRawOffset((int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar16 and calendar36", (calendar16.compareTo(calendar36) == 0) == calendar16.equals(calendar36));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.Instant instant10 = instant6.withDurationAdded(99L, 2000);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) 15);
        org.joda.time.Instant instant14 = instant6.withDurationAdded((org.joda.time.ReadableDuration) duration12, 23);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMillisOfSecond(10);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours(10L);
        long long23 = duration22.getStandardSeconds();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withDurationAdded((org.joda.time.ReadableDuration) duration22, (int) (short) 10);
        org.joda.time.Duration duration26 = duration22.toDuration();
        boolean boolean27 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(53, 4, 528);
        java.util.Calendar.Builder builder9 = builder4.setTimeOfDay(23, 726, 32778, 7);
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        calendar11.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar11.setFirstDayOfWeek(11);
        calendar11.setMinimalDaysInFirstWeek(363);
        java.util.TimeZone timeZone18 = calendar11.getTimeZone();
        java.util.Calendar.Builder builder19 = builder9.setTimeZone(timeZone18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.withZoneRetainFields(dateTimeZone24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        long long32 = dateMidnight29.getMillis();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableDuration33, readableInstant34);
        org.joda.time.PeriodType periodType36 = period35.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight25, (org.joda.time.ReadableInstant) dateMidnight29, periodType36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight29.withWeekyear(59);
        java.util.Locale locale42 = new java.util.Locale("PeriodType[Standard]", "");
        java.util.Calendar calendar43 = dateMidnight29.toCalendar(locale42);
        java.util.Calendar.Builder builder44 = builder9.setLocale(locale42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        int int49 = dateMidnight48.getYearOfEra();
        org.joda.time.Chronology chronology50 = dateMidnight48.getChronology();
        long long51 = dateMidnight48.getMillis();
        java.util.Locale locale55 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar56 = dateMidnight48.toCalendar(locale55);
        int int58 = calendar56.getLeastMaximum(3);
        java.util.TimeZone timeZone59 = calendar56.getTimeZone();
        timeZone59.setID("PT0S");
        java.lang.String str62 = timeZone59.getID();
        java.lang.String str63 = timeZone59.getID();
        java.lang.String str64 = timeZone59.getID();
        java.util.Locale locale65 = java.util.Locale.PRC;
        java.lang.String str66 = locale65.toLanguageTag();
        java.lang.String str67 = locale65.getDisplayScript();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone59, locale65);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(chronology71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.minusDays((int) (short) -1);
        int int75 = dateMidnight74.getYearOfEra();
        org.joda.time.Chronology chronology76 = dateMidnight74.getChronology();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(dateTimeZone79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.plusMillis(0);
        int[] intArray83 = new int[] {};
        int int84 = dateTimeField78.getMaximumValue((org.joda.time.ReadablePartial) localDateTime82, intArray83);
        int int86 = dateTimeField78.getMinimumValue((long) 1);
        java.util.Locale locale88 = java.util.Locale.CHINA;
        java.util.Set<java.lang.String> strSet89 = locale88.getUnicodeLocaleKeys();
        java.lang.String str90 = dateTimeField78.getAsText(1645488000000000L, locale88);
        java.util.Calendar calendar91 = java.util.Calendar.getInstance(timeZone59, locale88);
        java.util.Locale locale92 = java.util.Locale.ROOT;
        java.util.Calendar calendar93 = java.util.Calendar.getInstance(timeZone59, locale92);
        int int95 = timeZone59.getOffset(0L);
        timeZone59.setRawOffset(749);
        java.util.Calendar.Builder builder98 = builder44.setTimeZone(timeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar68", (calendar11.compareTo(calendar68) == 0) == calendar11.equals(calendar68));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        boolean boolean2 = calendar1.isWeekDateSupported();
        calendar1.roll(0, true);
        int int7 = calendar1.getActualMinimum(1);
        calendar1.set(4, (-1), (int) '#');
        int int12 = calendar1.getMinimalDaysInFirstWeek();
        int int13 = calendar1.getWeekYear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        long long20 = dateMidnight17.getMillis();
        java.util.Locale locale24 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar25 = dateMidnight17.toCalendar(locale24);
        int int27 = calendar25.getLeastMaximum(3);
        java.util.TimeZone timeZone28 = calendar25.getTimeZone();
        timeZone28.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        long long38 = dateMidnight35.getMillis();
        java.util.Locale locale42 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar43 = dateMidnight35.toCalendar(locale42);
        int int45 = calendar43.getLeastMaximum(3);
        java.util.TimeZone timeZone46 = calendar43.getTimeZone();
        timeZone46.setID("PT0S");
        java.lang.String str49 = timeZone46.getID();
        boolean boolean50 = timeZone28.hasSameRules(timeZone46);
        calendar1.setTimeZone(timeZone28);
        timeZone28.setRawOffset(54383277);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar25 and calendar43", (calendar25.compareTo(calendar43) == 0) == calendar25.equals(calendar43));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        boolean boolean4 = periodType2.equals((java.lang.Object) instant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfWeek();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 22, (long) 1968, periodType2, chronology10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology17);
        mutablePeriod18.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod18.add(0L);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusDays((int) (short) -1);
        int int31 = dateMidnight30.getYearOfEra();
        org.joda.time.Chronology chronology32 = dateMidnight30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology32);
        mutablePeriod18.add(0L, chronology32);
        boolean boolean35 = dateTimeFieldType14.isSupported(chronology32);
        org.joda.time.DurationField durationField36 = chronology32.hours();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.fromMillisOfDay((-1L), chronology32);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray38 = localTime37.getFieldTypes();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay((long) 10, chronology40);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray42 = timeOfDay41.getFieldTypes();
        int int43 = timeOfDay41.getSecondOfMinute();
        org.joda.time.LocalTime localTime44 = localTime37.withFields((org.joda.time.ReadablePartial) timeOfDay41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.minusDays((int) (short) -1);
        int int52 = dateMidnight51.getYearOfEra();
        org.joda.time.Chronology chronology53 = dateMidnight51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.clockhourOfDay();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology53);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(chronology59);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight60.minusDays((int) (short) -1);
        int int63 = dateMidnight62.getYearOfEra();
        org.joda.time.Chronology chronology64 = dateMidnight62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology64);
        org.joda.time.DateTimeField dateTimeField66 = chronology64.millisOfDay();
        org.joda.time.DateTime dateTime67 = dateTime56.withChronology(chronology64);
        org.joda.time.Period period68 = new org.joda.time.Period((long) 22, chronology64);
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.days();
        org.joda.time.Period period71 = new org.joda.time.Period(1645488000000L, periodType70);
        org.joda.time.DurationFieldType durationFieldType72 = org.joda.time.DurationFieldType.seconds();
        boolean boolean73 = periodType70.isSupported(durationFieldType72);
        org.joda.time.Period period75 = period68.withFieldAdded(durationFieldType72, (-292275054));
        boolean boolean76 = localTime44.isSupported(durationFieldType72);
        int int77 = periodType2.indexOf(durationFieldType72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime56", (instant3.compareTo(dateTime56) == 0) == instant3.equals(dateTime56));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 10, chronology6);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay7, (org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean15 = timeOfDay11.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.clockhourOfDay();
        boolean boolean26 = dateTimeFieldType14.isSupported(chronology23);
        boolean boolean27 = localTime4.isSupported(dateTimeFieldType14);
        org.joda.time.LocalTime localTime29 = localTime4.plusHours(11);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod34.add(0L);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(chronology43);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.minusDays((int) (short) -1);
        int int47 = dateMidnight46.getYearOfEra();
        org.joda.time.Chronology chronology48 = dateMidnight46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology48);
        mutablePeriod34.add(0L, chronology48);
        boolean boolean51 = dateTimeFieldType30.isSupported(chronology48);
        org.joda.time.DurationField durationField52 = chronology48.hours();
        org.joda.time.DurationFieldType durationFieldType53 = durationField52.getType();
        org.joda.time.LocalTime localTime55 = localTime29.withFieldAdded(durationFieldType53, 0);
        org.joda.time.Instant instant56 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology57 = instant56.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.dayOfYear();
        org.joda.time.DurationField durationField59 = durationFieldType53.getField(chronology57);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DurationField durationField61 = durationFieldType53.getField(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField61 and durationField59", (durationField61.compareTo(durationField59) == 0) == durationField61.equals(durationField59));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.withZoneRetainFields(dateTimeZone6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        long long14 = dateMidnight11.getMillis();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration15, readableInstant16);
        org.joda.time.PeriodType periodType18 = period17.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight7, (org.joda.time.ReadableInstant) dateMidnight11, periodType18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours(10L);
        long long26 = duration25.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight23, (org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight7.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Instant instant29 = instant1.minus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration32 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        long long37 = dateMidnight34.getMillis();
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight34.withMillis((long) 7);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateMidnight34, periodType40);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((int) (byte) 100, 8, 15, (int) (byte) 0, (int) (byte) 0, 5, (int) ' ');
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period51 = duration32.toPeriodTo((org.joda.time.ReadableInstant) dateTime49, periodType50);
        org.joda.time.Instant instant52 = instant1.minus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Hours hours53 = duration32.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateMidnight39", (instant1.compareTo(dateMidnight39) == 0) == instant1.equals(dateMidnight39));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval9 = yearMonthDay8.toInterval();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval11 = yearMonthDay10.toInterval();
        org.joda.time.Interval interval12 = interval9.gap((org.joda.time.ReadableInterval) interval11);
        boolean boolean14 = interval9.isBefore(100L);
        long long15 = interval9.toDurationMillis();
        long long16 = interval9.getStartMillis();
        org.joda.time.Duration duration17 = interval9.toDuration();
        org.joda.time.Instant instant18 = instant6.plus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Period period19 = duration17.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        java.lang.String str3 = calendar1.getCalendarType();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology7);
        mutablePeriod8.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod8.add(0L);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        mutablePeriod8.add(0L, chronology22);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) (-1), chronology22);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (short) 10, chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = dateMidnight25.toMutableDateTime(chronology34);
        org.joda.time.DurationField durationField38 = chronology34.minutes();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology34.getZone();
        boolean boolean40 = dateTimeZone39.isFixed();
        java.util.TimeZone timeZone41 = dateTimeZone39.toTimeZone();
        java.lang.String str42 = timeZone41.getID();
        calendar1.setTimeZone(timeZone41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        int int48 = dateMidnight47.getYearOfEra();
        org.joda.time.Chronology chronology49 = dateMidnight47.getChronology();
        long long50 = dateMidnight47.getMillis();
        java.util.Locale locale54 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar55 = dateMidnight47.toCalendar(locale54);
        int int57 = calendar55.getLeastMaximum(3);
        java.util.TimeZone timeZone58 = calendar55.getTimeZone();
        int int59 = timeZone58.getRawOffset();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone58);
        calendar1.setTimeZone(timeZone58);
        java.lang.String str62 = calendar1.getCalendarType();
        calendar1.setFirstDayOfWeek(528);
        java.util.Locale locale65 = java.util.Locale.GERMAN;
        java.util.Calendar calendar66 = java.util.Calendar.getInstance(locale65);
        calendar66.setFirstDayOfWeek(24);
        calendar66.setTimeInMillis((-1L));
        java.util.TimeZone timeZone71 = calendar66.getTimeZone();
        java.util.TimeZone timeZone72 = java.util.TimeZone.getDefault();
        boolean boolean73 = timeZone71.hasSameRules(timeZone72);
        calendar1.setTimeZone(timeZone72);
        int int75 = timeZone72.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar60", (calendar1.compareTo(calendar60) == 0) == calendar1.equals(calendar60));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        int int17 = localDateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusDays(37);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.withZoneRetainFields(dateTimeZone26);
        org.joda.time.Instant instant28 = dateMidnight27.toInstant();
        org.joda.time.DateTime dateTime29 = instant28.toDateTimeISO();
        org.joda.time.Instant instant31 = instant28.minus((-79200000L));
        org.joda.time.Period period33 = org.joda.time.Period.millis(0);
        int int34 = period33.getSeconds();
        org.joda.time.Duration duration35 = period33.toStandardDuration();
        org.joda.time.Instant instant36 = instant28.plus((org.joda.time.ReadableDuration) duration35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime19.withDurationAdded((org.joda.time.ReadableDuration) duration35, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant28", (dateMidnight5.compareTo(instant28) == 0) == dateMidnight5.equals(instant28));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property15 = dateTime12.centuryOfEra();
        org.joda.time.DateTime dateTime17 = dateTime12.minusMonths(70);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate.Property property21 = localDate19.weekyear();
        org.joda.time.LocalDate localDate23 = property21.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = yearMonthDay24.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay24.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = yearMonthDay24.getFieldType((int) (byte) 1);
        boolean boolean30 = localDate23.isSupported(dateTimeFieldType29);
        int int31 = dateTime17.get(dateTimeFieldType29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology40);
        mutablePeriod41.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod41.add(0L);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(chronology50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusDays((int) (short) -1);
        int int54 = dateMidnight53.getYearOfEra();
        org.joda.time.Chronology chronology55 = dateMidnight53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology55);
        mutablePeriod41.add(0L, chronology55);
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((long) (-1), chronology55);
        org.joda.time.DurationField durationField59 = chronology55.weeks();
        org.joda.time.DateTime dateTime60 = dateMidnight35.toDateTime(chronology55);
        org.joda.time.DateTimeField dateTimeField61 = chronology55.era();
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType29.getField(chronology55);
        org.joda.time.DurationField durationField63 = chronology55.halfdays();
        org.joda.time.DurationField durationField64 = chronology55.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField64, durationField59, and durationField63", !(durationField64.compareTo(durationField59) == 0) || (Math.signum(durationField64.compareTo(durationField63)) == Math.signum(durationField59.compareTo(durationField63))));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateTime dateTime4 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay0.plusMonths(0);
        org.joda.time.DateMidnight dateMidnight7 = yearMonthDay6.toDateMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = yearMonthDay6.getFieldTypes();
        org.joda.time.Chronology chronology9 = yearMonthDay6.getChronology();
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay6.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay6.plusMonths((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime19 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.plus((long) 32772);
        org.joda.time.DateTime dateTime23 = dateTime19.plusSeconds((-2720));
        org.joda.time.DateTime dateTime25 = dateTime23.plusWeeks(960052);
        org.joda.time.DateTime dateTime26 = yearMonthDay12.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.days();
        org.joda.time.Period period2 = new org.joda.time.Period(1645488000000L, periodType1);
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(periodType1);
        java.lang.String str4 = periodType1.toString();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology8);
        mutablePeriod9.setPeriod((long) (short) 10, (long) (short) -1);
        int int14 = mutablePeriod9.getValue(0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusDays((int) (short) -1);
        org.joda.time.Duration duration19 = mutablePeriod9.toDurationTo((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.days();
        org.joda.time.Period period23 = new org.joda.time.Period(1645488000000L, periodType22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableDuration24, readableInstant25);
        org.joda.time.PeriodType periodType27 = period26.getPeriodType();
        org.joda.time.Period period28 = period23.normalizedStandard(periodType27);
        org.joda.time.Period period29 = duration19.toPeriodTo(readableInstant20, periodType27);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 0, periodType27);
        mutablePeriod30.addMonths(667);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.centuries();
        int int34 = mutablePeriod30.get(durationFieldType33);
        int int35 = periodType1.indexOf(durationFieldType33);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate39 = org.joda.time.LocalDate.now(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime40.withMillisOfSecond(53);
        org.joda.time.DateTime dateTime43 = dateTime40.toDateTime();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        int int50 = dateMidnight49.getYearOfEra();
        org.joda.time.Chronology chronology51 = dateMidnight49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology51);
        org.joda.time.DateTime dateTime53 = dateTime43.withChronology(chronology51);
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay(81L, chronology51);
        org.joda.time.DurationField durationField55 = durationFieldType33.getField(chronology51);
        org.joda.time.DateTimeField dateTimeField56 = chronology51.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and dateTime53", (dateTime40.compareTo(dateTime53) == 0) == dateTime40.equals(dateTime53));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 10, chronology6);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay7, (org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean15 = timeOfDay11.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.clockhourOfDay();
        boolean boolean26 = dateTimeFieldType14.isSupported(chronology23);
        boolean boolean27 = localTime4.isSupported(dateTimeFieldType14);
        org.joda.time.LocalTime localTime29 = localTime4.withSecondOfMinute(9);
        org.joda.time.LocalTime localTime31 = localTime29.plusMillis(16);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) '#', periodType33, chronology34);
        org.joda.time.LocalTime localTime36 = localTime29.minus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.LocalTime.Property property37 = localTime29.secondOfMinute();
        org.joda.time.DurationField durationField38 = property37.getDurationField();
        org.joda.time.LocalTime localTime40 = property37.addCopy((int) 'u');
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        int int49 = dateMidnight48.getYearOfEra();
        org.joda.time.Chronology chronology50 = dateMidnight48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.clockhourOfDay();
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((long) (short) 100, chronology50);
        org.joda.time.DurationField durationField54 = durationFieldType41.getField(chronology50);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        int int59 = dateMidnight58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateMidnight58.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.hourOfDay();
        org.joda.time.DurationField durationField62 = durationFieldType41.getField(chronology60);
        org.joda.time.DurationField durationField63 = chronology60.hours();
        org.joda.time.DateTimeField dateTimeField64 = chronology60.dayOfYear();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(chronology60);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay((long) 10, chronology67);
        org.joda.time.DateTimeField[] dateTimeFieldArray69 = timeOfDay68.getFields();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.TimeOfDay timeOfDay72 = new org.joda.time.TimeOfDay((long) 10, chronology71);
        org.joda.time.DateTimeField[] dateTimeFieldArray73 = timeOfDay72.getFields();
        org.joda.time.Period period74 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay68, (org.joda.time.ReadablePartial) timeOfDay72);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean76 = timeOfDay72.isSupported(dateTimeFieldType75);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.DateMidnight dateMidnight80 = new org.joda.time.DateMidnight(chronology79);
        org.joda.time.DateMidnight dateMidnight82 = dateMidnight80.minusDays((int) (short) -1);
        int int83 = dateMidnight82.getYearOfEra();
        org.joda.time.Chronology chronology84 = dateMidnight82.getChronology();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology84);
        org.joda.time.DateTimeField dateTimeField86 = chronology84.clockhourOfDay();
        boolean boolean87 = dateTimeFieldType75.isSupported(chronology84);
        org.joda.time.DateTime dateTime89 = dateTime65.withField(dateTimeFieldType75, 6);
        org.joda.time.DateTime dateTime91 = dateTime89.withCenturyOfEra(16);
        int int92 = property37.getDifference((org.joda.time.ReadableInstant) dateTime89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField38 and durationField54", (durationField38.compareTo(durationField54) == 0) == durationField38.equals(durationField54));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableDuration) duration6);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology11);
        mutablePeriod12.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod12.add(0L);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        mutablePeriod12.add(0L, chronology26);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (-1), chronology26);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 10, chronology38);
        org.joda.time.MutableDateTime mutableDateTime41 = dateMidnight29.toMutableDateTime(chronology38);
        mutableDateTime41.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime41.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime41.toMutableDateTime(dateTimeZone45);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray48 = yearMonthDay47.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay47.toDateTimeAtCurrentTime(dateTimeZone49);
        org.joda.time.Duration duration51 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime41, (org.joda.time.ReadableInstant) dateTime50);
        boolean boolean52 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration51);
        long long53 = duration6.getStandardDays();
        long long54 = duration6.getStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime50", (dateTime3.compareTo(dateTime50) == 0) == dateTime3.equals(dateTime50));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval9 = yearMonthDay8.toInterval();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval11 = yearMonthDay10.toInterval();
        org.joda.time.Interval interval12 = interval9.gap((org.joda.time.ReadableInterval) interval11);
        boolean boolean14 = interval9.isBefore(100L);
        long long15 = interval9.toDurationMillis();
        long long16 = interval9.getStartMillis();
        org.joda.time.Duration duration17 = interval9.toDuration();
        org.joda.time.Instant instant18 = instant6.plus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant6", (dateMidnight3.compareTo(instant6) == 0) == dateMidnight3.equals(instant6));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property3.roundFloorCopy();
        org.joda.time.LocalDate localDate5 = property3.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTime(localTime6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant11 = instant9.plus(1L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) (short) -1);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours(10L);
        long long18 = duration17.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight15, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Period period20 = duration17.toPeriod();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        int int28 = dateMidnight27.getYearOfEra();
        org.joda.time.Chronology chronology29 = dateMidnight27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (short) 10, chronology29);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours(7);
        org.joda.time.DateTime dateTime35 = dateTime33.plusYears((int) (byte) 0);
        int int36 = dateTime35.getMonthOfYear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology40);
        mutablePeriod41.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod41.add(0L);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(chronology50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusDays((int) (short) -1);
        int int54 = dateMidnight53.getYearOfEra();
        org.joda.time.Chronology chronology55 = dateMidnight53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology55);
        mutablePeriod41.add(0L, chronology55);
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((long) (-1), chronology55);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight(chronology62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.minusDays((int) (short) -1);
        int int66 = dateMidnight65.getYearOfEra();
        org.joda.time.Chronology chronology67 = dateMidnight65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology67);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (short) 10, chronology67);
        org.joda.time.MutableDateTime mutableDateTime70 = dateMidnight58.toMutableDateTime(chronology67);
        mutableDateTime70.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime70.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = mutableDateTime70.toMutableDateTime(dateTimeZone74);
        org.joda.time.YearMonthDay yearMonthDay76 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray77 = yearMonthDay76.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateTime dateTime79 = yearMonthDay76.toDateTimeAtCurrentTime(dateTimeZone78);
        org.joda.time.Duration duration80 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime70, (org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.PeriodType periodType83 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType84 = periodType83.withWeeksRemoved();
        org.joda.time.Period period85 = new org.joda.time.Period((long) 1970, (long) 3, periodType83);
        org.joda.time.Period period86 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableDuration) duration80, periodType83);
        org.joda.time.Period period87 = duration17.toPeriod(periodType83);
        org.joda.time.Instant instant88 = instant11.plus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Instant instant91 = instant88.withDurationAdded((long) 823, 9);
        org.joda.time.DateTime dateTime92 = instant88.toDateTimeISO();
        org.joda.time.Duration duration94 = org.joda.time.Duration.parse("PT0.010S");
        org.joda.time.Instant instant96 = instant88.withDurationAdded((org.joda.time.ReadableDuration) duration94, 32778);
        org.joda.time.DateTime dateTime97 = dateTime7.plus((org.joda.time.ReadableDuration) duration94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant88 and dateTime92", (instant88.compareTo(dateTime92) == 0) == instant88.equals(dateTime92));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        int int4 = localDate1.getCenturyOfEra();
        org.joda.time.DateTime dateTime5 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTime();
        int int9 = dateTime5.getMillisOfDay();
        org.joda.time.DateTime dateTime12 = dateTime5.withDurationAdded(1645455743145L, 69);
        org.joda.time.DateTime dateTime14 = dateTime12.withYear(156);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology19);
        mutablePeriod20.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod20.add(0L);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        mutablePeriod20.add(0L, chronology34);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (-1), chronology34);
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType15.getField(chronology34);
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.days();
        org.joda.time.Period period41 = new org.joda.time.Period(1645488000000L, periodType40);
        org.joda.time.Period period42 = period41.normalizedStandard();
        int int43 = period42.getSeconds();
        int[] intArray45 = chronology34.get((org.joda.time.ReadablePeriod) period42, (long) (short) 0);
        int int46 = period42.getHours();
        int int47 = period42.getMinutes();
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType51 = periodType50.withWeeksRemoved();
        org.joda.time.Period period52 = new org.joda.time.Period((long) 1970, (long) 3, periodType50);
        org.joda.time.Hours hours53 = period52.toStandardHours();
        org.joda.time.Period period54 = period42.plus((org.joda.time.ReadablePeriod) period52);
        org.joda.time.DateTime dateTime55 = dateTime12.minus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology59);
        mutablePeriod60.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod60.add(0L);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight(chronology69);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight70.minusDays((int) (short) -1);
        int int73 = dateMidnight72.getYearOfEra();
        org.joda.time.Chronology chronology74 = dateMidnight72.getChronology();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology74);
        mutablePeriod60.add(0L, chronology74);
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight((long) (-1), chronology74);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight(chronology81);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight82.minusDays((int) (short) -1);
        int int85 = dateMidnight84.getYearOfEra();
        org.joda.time.Chronology chronology86 = dateMidnight84.getChronology();
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology86);
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime((long) (short) 10, chronology86);
        org.joda.time.MutableDateTime mutableDateTime89 = dateMidnight77.toMutableDateTime(chronology86);
        org.joda.time.DurationField durationField90 = chronology86.minutes();
        org.joda.time.DateTimeZone dateTimeZone91 = chronology86.getZone();
        boolean boolean92 = dateTimeZone91.isFixed();
        java.util.TimeZone timeZone93 = dateTimeZone91.toTimeZone();
        java.lang.String str95 = dateTimeZone91.getName((long) 365);
        org.joda.time.MutableDateTime mutableDateTime96 = dateTime12.toMutableDateTime(dateTimeZone91);
        org.joda.time.Instant instant97 = mutableDateTime96.toInstant();
        org.joda.time.Instant instant98 = instant97.toInstant();
        org.joda.time.LocalDate localDate99 = new org.joda.time.LocalDate((java.lang.Object) instant98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant98", (dateTime12.compareTo(instant98) == 0) == dateTime12.equals(instant98));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        long long1 = instant0.getMillis();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTime();
        org.joda.time.Instant instant4 = instant0.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime3", (instant4.compareTo(mutableDateTime3) == 0) == instant4.equals(mutableDateTime3));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.LocalDate localDate1 = dateMidnight0.toLocalDate();
        org.joda.time.Instant instant2 = dateMidnight0.toInstant();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.withWeekyear(54191870);
        int int5 = dateMidnight4.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight0 and instant2", (dateMidnight0.compareTo(instant2) == 0) == dateMidnight0.equals(instant2));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.monthOfYear();
        int int39 = mutableDateTime33.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime33, readableInstant40);
        org.joda.time.Duration duration42 = interval41.toDuration();
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        long long49 = dateMidnight46.getMillis();
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.days();
        org.joda.time.Period period51 = duration44.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight46, periodType50);
        org.joda.time.Duration duration52 = duration42.minus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.withZoneRetainFields(dateTimeZone57);
        org.joda.time.Instant instant59 = dateMidnight58.toInstant();
        org.joda.time.DateTime dateTime60 = instant59.toDateTimeISO();
        org.joda.time.Interval interval61 = duration42.toIntervalFrom((org.joda.time.ReadableInstant) dateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight16 and instant59", (dateMidnight16.compareTo(instant59) == 0) == dateMidnight16.equals(instant59));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology5);
        mutablePeriod6.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod6.add(0L);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusDays((int) (short) -1);
        int int19 = dateMidnight18.getYearOfEra();
        org.joda.time.Chronology chronology20 = dateMidnight18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology20);
        mutablePeriod6.add(0L, chronology20);
        boolean boolean23 = dateTimeFieldType2.isSupported(chronology20);
        org.joda.time.DurationField durationField24 = chronology20.hours();
        org.joda.time.DateTimeField dateTimeField25 = chronology20.millisOfDay();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now(chronology20);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval28 = yearMonthDay27.toInterval();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay27.withChronologyRetainFields(chronology29);
        org.joda.time.DateTime dateTime31 = yearMonthDay27.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay27.plusMonths(0);
        org.joda.time.DateTime dateTime34 = yearMonthDay27.toDateTimeAtMidnight();
        int int35 = localDate26.compareTo((org.joda.time.ReadablePartial) yearMonthDay27);
        org.joda.time.Chronology chronology36 = localDate26.getChronology();
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale locale38 = builder37.build();
        boolean boolean39 = locale38.hasExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(53L, chronology36, locale38);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(54138649L, chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and mutableDateTime41", (dateTime31.compareTo(mutableDateTime41) == 0) == dateTime31.equals(mutableDateTime41));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime33.era();
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime33.getZone();
        org.joda.time.Instant instant63 = mutableDateTime33.toInstant();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        org.joda.time.Duration duration69 = org.joda.time.Duration.standardHours(10L);
        long long70 = duration69.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight67, (org.joda.time.ReadableDuration) duration69);
        org.joda.time.Period period72 = duration69.toPeriod();
        org.joda.time.Duration duration74 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration76 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration78 = duration74.withDurationAdded((org.joda.time.ReadableDuration) duration76, 12);
        org.joda.time.Duration duration79 = duration76.toDuration();
        boolean boolean80 = duration69.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Duration duration81 = duration69.toDuration();
        org.joda.time.Instant instant82 = instant63.minus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.MutableDateTime mutableDateTime83 = instant82.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant63", (mutableDateTime33.compareTo(instant63) == 0) == mutableDateTime33.equals(instant63));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.LocalDate localDate5 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate6 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate7 = property3.roundCeilingCopy();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        long long14 = dateMidnight11.getMillis();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.days();
        org.joda.time.Period period16 = duration9.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight11, periodType15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateMidnight11.toMutableDateTimeISO();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.withZoneRetainFields(dateTimeZone22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        int int28 = dateMidnight27.getYearOfEra();
        org.joda.time.Chronology chronology29 = dateMidnight27.getChronology();
        long long30 = dateMidnight27.getMillis();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableDuration31, readableInstant32);
        org.joda.time.PeriodType periodType34 = period33.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight23, (org.joda.time.ReadableInstant) dateMidnight27, periodType34);
        mutablePeriod35.add(0L);
        mutableDateTime17.add((org.joda.time.ReadablePeriod) mutablePeriod35);
        mutablePeriod35.setMinutes(667);
        org.joda.time.LocalDate localDate42 = localDate7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod35, 7);
        mutablePeriod35.setYears((int) 'a');
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.withZoneRetainFields(dateTimeZone49);
        org.joda.time.Instant instant51 = dateMidnight50.toInstant();
        org.joda.time.Chronology chronology52 = instant51.getChronology();
        org.joda.time.Instant instant55 = instant51.withDurationAdded(99L, 2000);
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardSeconds((long) 15);
        org.joda.time.Instant instant59 = instant51.withDurationAdded((org.joda.time.ReadableDuration) duration57, 23);
        mutablePeriod35.setPeriod((org.joda.time.ReadableDuration) duration57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight13 and instant51", (dateMidnight13.compareTo(instant51) == 0) == dateMidnight13.equals(instant51));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        long long2 = duration1.getStandardSeconds();
        org.joda.time.Duration duration5 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration6 = duration1.plus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology9);
        mutablePeriod10.setPeriod((long) (short) 10, (long) (short) -1);
        int int15 = mutablePeriod10.getValue(0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        org.joda.time.Duration duration20 = mutablePeriod10.toDurationTo((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.Period period24 = new org.joda.time.Period(1645488000000L, periodType23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableDuration25, readableInstant26);
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        org.joda.time.Period period29 = period24.normalizedStandard(periodType28);
        org.joda.time.Period period30 = duration20.toPeriodTo(readableInstant21, periodType28);
        long long31 = duration20.getMillis();
        org.joda.time.Duration duration34 = duration20.withDurationAdded((long) (short) 1, 5);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours(10L);
        long long37 = duration36.getStandardSeconds();
        org.joda.time.Duration duration40 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration41 = duration36.plus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration42 = duration40.toDuration();
        org.joda.time.Duration duration44 = duration40.plus(0L);
        org.joda.time.Duration duration46 = duration40.plus((-2240611200000L));
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology49);
        mutablePeriod50.setPeriod((long) (short) 10, (long) (short) -1);
        int int55 = mutablePeriod50.getValue(0);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(chronology56);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight57.minusDays((int) (short) -1);
        org.joda.time.Duration duration60 = mutablePeriod50.toDurationTo((org.joda.time.ReadableInstant) dateMidnight57);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.days();
        org.joda.time.Period period64 = new org.joda.time.Period(1645488000000L, periodType63);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableDuration65, readableInstant66);
        org.joda.time.PeriodType periodType68 = period67.getPeriodType();
        org.joda.time.Period period69 = period64.normalizedStandard(periodType68);
        org.joda.time.Period period70 = duration60.toPeriodTo(readableInstant61, periodType68);
        org.joda.time.Duration duration73 = duration60.withDurationAdded((long) 53, 5);
        java.util.Locale locale74 = java.util.Locale.GERMAN;
        java.util.Calendar calendar75 = java.util.Calendar.getInstance(locale74);
        org.joda.time.LocalTime localTime76 = org.joda.time.LocalTime.fromCalendarFields(calendar75);
        org.joda.time.DateTime dateTime77 = localTime76.toDateTimeToday();
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration73, (org.joda.time.ReadableInstant) dateTime77);
        int int79 = duration46.compareTo((org.joda.time.ReadableDuration) duration73);
        boolean boolean80 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.Duration duration81 = duration6.minus((org.joda.time.ReadableDuration) duration73);
        org.joda.time.Instant instant82 = new org.joda.time.Instant();
        long long83 = instant82.getMillis();
        org.joda.time.Instant instant84 = instant82.toInstant();
        org.joda.time.Instant instant86 = instant82.withMillis(101L);
        org.joda.time.PeriodType periodType88 = org.joda.time.PeriodType.days();
        org.joda.time.Period period89 = new org.joda.time.Period(1645488000000L, periodType88);
        org.joda.time.ReadableDuration readableDuration90 = null;
        org.joda.time.ReadableInstant readableInstant91 = null;
        org.joda.time.Period period92 = new org.joda.time.Period(readableDuration90, readableInstant91);
        org.joda.time.PeriodType periodType93 = period92.getPeriodType();
        org.joda.time.Period period94 = period89.normalizedStandard(periodType93);
        org.joda.time.Period period95 = duration73.toPeriodFrom((org.joda.time.ReadableInstant) instant82, periodType93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime77 and instant82", (dateTime77.compareTo(instant82) == 0) == dateTime77.equals(instant82));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        long long7 = dateMidnight4.getMillis();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.days();
        org.joda.time.Period period9 = duration2.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight4, periodType8);
        org.joda.time.MutableDateTime mutableDateTime10 = dateMidnight4.toMutableDateTimeISO();
        int int11 = mutableDateTime10.getDayOfYear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        mutableDateTime10.setChronology(chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.withZoneRetainFields(dateTimeZone26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        long long34 = dateMidnight31.getMillis();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableDuration35, readableInstant36);
        org.joda.time.PeriodType periodType38 = period37.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight27, (org.joda.time.ReadableInstant) dateMidnight31, periodType38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight31.withWeekyear(59);
        java.util.Locale locale44 = new java.util.Locale("PeriodType[Standard]", "");
        java.util.Calendar calendar45 = dateMidnight31.toCalendar(locale44);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 122, chronology19, locale44, (java.lang.Integer) 6);
        dateTimeParserBucket47.setOffset(1439);
        dateTimeParserBucket47.setOffset((java.lang.Integer) 600);
        java.util.Locale locale52 = dateTimeParserBucket47.getLocale();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        int int57 = dateMidnight56.getYearOfEra();
        org.joda.time.Chronology chronology58 = dateMidnight56.getChronology();
        long long59 = dateMidnight56.getMillis();
        java.util.Locale locale63 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar64 = dateMidnight56.toCalendar(locale63);
        int int66 = calendar64.getLeastMaximum(3);
        java.util.TimeZone timeZone67 = calendar64.getTimeZone();
        timeZone67.setID("PT0S");
        java.lang.String str70 = timeZone67.getID();
        java.lang.String str71 = timeZone67.getID();
        java.lang.String str72 = timeZone67.getID();
        java.util.Locale locale73 = java.util.Locale.PRC;
        java.lang.String str74 = locale73.toLanguageTag();
        java.lang.String str75 = locale73.getDisplayScript();
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(timeZone67, locale73);
        java.lang.String str77 = locale73.getScript();
        java.lang.String str78 = locale73.toLanguageTag();
        java.lang.String str79 = locale52.getDisplayVariant(locale73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar45 and calendar64", (calendar45.compareTo(calendar64) == 0) == calendar45.equals(calendar64));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.DateTime dateTime2 = instant0.toDateTimeISO();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod7.add(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutablePeriod7.add(0L, chronology21);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (-1), chronology21);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight24.toMutableDateTime(chronology33);
        mutableDateTime36.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime36.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime36.toMutableDateTime(dateTimeZone40);
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray43 = yearMonthDay42.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTimeAtCurrentTime(dateTimeZone44);
        org.joda.time.Duration duration46 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime36, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime36.era();
        boolean boolean48 = instant0.equals((java.lang.Object) mutableDateTime36);
        org.joda.time.Chronology chronology49 = instant0.getChronology();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime2", (instant0.compareTo(dateTime2) == 0) == instant0.equals(dateTime2));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone2);
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withChronology(chronology7);
        java.util.GregorianCalendar gregorianCalendar9 = dateTime8.toGregorianCalendar();
        gregorianCalendar9.set(5, (int) (byte) -1, 667, 870, 54202913);
        java.lang.String str16 = gregorianCalendar9.getCalendarType();
        java.lang.String str17 = gregorianCalendar9.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime8", (dateTime4.compareTo(dateTime8) == 0) == dateTime4.equals(dateTime8));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        long long2 = duration1.getStandardSeconds();
        org.joda.time.Duration duration5 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration6 = duration1.plus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.Duration duration7 = duration5.toDuration();
        org.joda.time.Duration duration9 = duration5.plus(0L);
        org.joda.time.Duration duration11 = duration5.plus((-2240611200000L));
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology16);
        mutablePeriod17.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod17.add(0L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology31);
        mutablePeriod17.add(0L, chronology31);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((long) (-1), chronology31);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) (short) -1);
        int int42 = dateMidnight41.getYearOfEra();
        org.joda.time.Chronology chronology43 = dateMidnight41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (short) 10, chronology43);
        org.joda.time.MutableDateTime mutableDateTime46 = dateMidnight34.toMutableDateTime(chronology43);
        mutableDateTime46.setYear(2022);
        mutableDateTime46.setYear((-1));
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfYear();
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(chronology54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.minusDays((int) (short) -1);
        long long58 = dateMidnight55.getMillis();
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.days();
        org.joda.time.Period period60 = duration53.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight55, periodType59);
        org.joda.time.MutableDateTime mutableDateTime61 = dateMidnight55.toMutableDateTimeISO();
        int int62 = mutableDateTime61.getDayOfYear();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(chronology65);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight66.minusDays((int) (short) -1);
        int int69 = dateMidnight68.getYearOfEra();
        org.joda.time.Chronology chronology70 = dateMidnight68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology70);
        mutableDateTime61.setChronology(chronology70);
        mutableDateTime46.setTime((org.joda.time.ReadableInstant) mutableDateTime61);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime46.era();
        org.joda.time.DateTimeZone dateTimeZone75 = mutableDateTime46.getZone();
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((long) 6, dateTimeZone75);
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Instant instant78 = new org.joda.time.Instant();
        boolean boolean79 = periodType77.equals((java.lang.Object) instant78);
        org.joda.time.PeriodType periodType80 = periodType77.withYearsRemoved();
        java.lang.String str81 = periodType77.getName();
        org.joda.time.PeriodType periodType82 = periodType77.withYearsRemoved();
        org.joda.time.PeriodType periodType83 = periodType82.withWeeksRemoved();
        org.joda.time.Period period84 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, (org.joda.time.ReadableInstant) mutableDateTime76, periodType82);
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate88 = org.joda.time.LocalDate.now(dateTimeZone87);
        org.joda.time.DateTime dateTime89 = org.joda.time.DateTime.now(dateTimeZone87);
        org.joda.time.MutableDateTime mutableDateTime90 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone87);
        org.joda.time.DateMidnight dateMidnight91 = org.joda.time.DateMidnight.now(dateTimeZone87);
        org.joda.time.ReadableInstant readableInstant92 = null;
        org.joda.time.PeriodType periodType93 = null;
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight91, readableInstant92, periodType93);
        org.joda.time.MutablePeriod mutablePeriod95 = mutablePeriod94.copy();
        mutableDateTime76.add((org.joda.time.ReadablePeriod) mutablePeriod95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant78 and dateTime89", (instant78.compareTo(dateTime89) == 0) == instant78.equals(dateTime89));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.util.Date date6 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromDateFields(date6);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay7.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay9 = property8.getYearMonthDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) (short) -1);
        int int16 = dateMidnight15.getYearOfEra();
        org.joda.time.Chronology chronology17 = dateMidnight15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology17.getZone();
        org.joda.time.DateTime dateTime21 = yearMonthDay9.toDateTimeAtCurrentTime(dateTimeZone20);
        boolean boolean23 = dateTimeZone20.isStandardOffset((long) 0);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((int) (byte) -1, 5, 1, dateTimeZone20);
        org.joda.time.Interval interval25 = new org.joda.time.Interval(3250799989L, 60480000000L, dateTimeZone20);
        long long26 = interval25.getEndMillis();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.days();
        org.joda.time.Period period29 = new org.joda.time.Period(1645488000000L, periodType28);
        org.joda.time.Period period30 = period29.normalizedStandard();
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        long long37 = dateMidnight34.getMillis();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.days();
        org.joda.time.Period period39 = duration32.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight34, periodType38);
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime41 = yearMonthDay40.toDateTimeAtMidnight();
        org.joda.time.Interval interval42 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period39, (org.joda.time.ReadableInstant) dateTime41);
        java.lang.String str43 = interval42.toString();
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval45 = yearMonthDay44.toInterval();
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval47 = yearMonthDay46.toInterval();
        org.joda.time.Interval interval48 = interval45.gap((org.joda.time.ReadableInterval) interval47);
        boolean boolean50 = interval45.isBefore(100L);
        java.lang.String str51 = interval45.toString();
        boolean boolean52 = interval42.isBefore((org.joda.time.ReadableInterval) interval45);
        org.joda.time.Chronology chronology53 = interval42.getChronology();
        org.joda.time.Duration duration54 = interval42.toDuration();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.withZoneRetainFields(dateTimeZone59);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (short) 10, chronology69);
        org.joda.time.DateTime dateTime73 = dateTime71.plusSeconds(14);
        boolean boolean74 = dateMidnight60.isBefore((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime75 = dateTime73.toDateTimeISO();
        org.joda.time.DateTime dateTime77 = dateTime73.withDayOfWeek(1);
        org.joda.time.DateTime dateTime79 = dateTime77.plus((long) '#');
        org.joda.time.DateTime dateTime81 = dateTime79.withWeekyear((int) (byte) 10);
        int int82 = dateTime81.getHourOfDay();
        boolean boolean83 = interval42.contains((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime dateTime85 = dateTime81.withHourOfDay(8);
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight88 = new org.joda.time.DateMidnight(dateTimeZone87);
        int int90 = dateTimeZone87.getOffsetFromLocal((long) 1970);
        org.joda.time.MutableDateTime mutableDateTime91 = dateTime85.toMutableDateTime(dateTimeZone87);
        boolean boolean92 = period29.equals((java.lang.Object) dateTimeZone87);
        org.joda.time.Interval interval93 = interval25.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime85 and mutableDateTime91", (dateTime85.compareTo(mutableDateTime91) == 0) == dateTime85.equals(mutableDateTime91));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setMinimalDaysInFirstWeek((int) (short) 1);
        boolean boolean5 = calendar1.before((java.lang.Object) 18748801970L);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromCalendarFields(calendar1);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromCalendarFields(calendar8);
        java.lang.String str10 = calendar8.getCalendarType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology14);
        mutablePeriod15.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod15.add(0L);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        int int28 = dateMidnight27.getYearOfEra();
        org.joda.time.Chronology chronology29 = dateMidnight27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology29);
        mutablePeriod15.add(0L, chronology29);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (-1), chronology29);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusDays((int) (short) -1);
        int int40 = dateMidnight39.getYearOfEra();
        org.joda.time.Chronology chronology41 = dateMidnight39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (short) 10, chronology41);
        org.joda.time.MutableDateTime mutableDateTime44 = dateMidnight32.toMutableDateTime(chronology41);
        org.joda.time.DurationField durationField45 = chronology41.minutes();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology41.getZone();
        boolean boolean47 = dateTimeZone46.isFixed();
        java.util.TimeZone timeZone48 = dateTimeZone46.toTimeZone();
        java.lang.String str49 = timeZone48.getID();
        calendar8.setTimeZone(timeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(chronology51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.minusDays((int) (short) -1);
        int int55 = dateMidnight54.getYearOfEra();
        org.joda.time.Chronology chronology56 = dateMidnight54.getChronology();
        long long57 = dateMidnight54.getMillis();
        java.util.Locale locale61 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar62 = dateMidnight54.toCalendar(locale61);
        int int64 = calendar62.getLeastMaximum(3);
        java.util.TimeZone timeZone65 = calendar62.getTimeZone();
        int int66 = timeZone65.getRawOffset();
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone65);
        calendar8.setTimeZone(timeZone65);
        calendar1.setTimeZone(timeZone65);
        java.util.TimeZone.setDefault(timeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar8", (calendar1.compareTo(calendar8) == 0) == calendar1.equals(calendar8));
    }
}

