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
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.Interval interval5 = dateMidnight4.toInterval();
        org.joda.time.Interval interval7 = interval5.withStartMillis((long) 0);
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(chronology8);
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DurationField durationField13 = chronology8.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField12", Math.signum(durationField9.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField9)));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.Instant instant24 = instant21.withMillis(0L);
        org.joda.time.Instant instant26 = instant24.plus((long) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.DateTime dateTime24 = dateTime22.minusWeeks(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = dateTime3.toString(dateTimeFormatter4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTime.Property property24 = dateTime7.year();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight0, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight0, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        mutableDateTime29.setYear(1969);
        boolean boolean32 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight0.minusYears(0);
        org.joda.time.DateMidnight.Property property35 = dateMidnight34.yearOfEra();
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate38 = localDate36.plusYears(10);
        boolean boolean40 = localDate36.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (-1), chronology42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime49 = dateTime43.plusMonths((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay50 = dateTime49.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay50.minusDays(10);
        org.joda.time.Period period53 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate36, (org.joda.time.ReadablePartial) yearMonthDay52);
        org.joda.time.YearMonthDay.Property property54 = yearMonthDay52.year();
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.lang.String str56 = locale55.getISO3Language();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (-1), chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.yearOfEra();
        org.joda.time.DateTime dateTime62 = property60.addToCopy((int) ' ');
        java.util.Locale locale63 = java.util.Locale.ITALY;
        int int64 = property60.getMaximumShortTextLength(locale63);
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("PT0S");
        int int67 = property60.getMaximumShortTextLength(locale66);
        java.lang.String str68 = locale55.getDisplayVariant(locale66);
        java.lang.String str69 = property54.getAsText(locale55);
        java.util.Locale.setDefault(locale55);
        java.util.Calendar calendar71 = dateMidnight34.toCalendar(locale55);
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property74 = dateMidnight73.dayOfYear();
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight73.minusDays(0);
        org.joda.time.Interval interval77 = dateMidnight76.toInterval();
        org.joda.time.Interval interval79 = interval77.withStartMillis((long) 0);
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.DurationField durationField81 = chronology80.days();
        org.joda.time.DateTimeField dateTimeField82 = chronology80.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight83 = org.joda.time.DateMidnight.now(chronology80);
        org.joda.time.DurationField durationField84 = chronology80.eras();
        org.joda.time.DateMidnight dateMidnight85 = dateMidnight34.withChronology(chronology80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField81 and durationField84", Math.signum(durationField81.compareTo(durationField84)) == -Math.signum(durationField84.compareTo(durationField81)));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.Instant instant23 = instant21.toInstant();
        org.joda.time.DateTime dateTime24 = instant21.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.Instant instant24 = instant21.withMillis(0L);
        org.joda.time.MutableDateTime mutableDateTime25 = instant24.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.Instant instant24 = instant21.withMillis(0L);
        org.joda.time.Instant instant26 = instant24.withMillis((-259200000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime23 = instant21.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.Instant instant24 = instant21.withMillis(0L);
        org.joda.time.MutableDateTime mutableDateTime25 = instant24.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.Duration duration82 = org.joda.time.Duration.standardHours((long) ' ');
        org.joda.time.Duration duration84 = duration82.withMillis(212941770400L);
        org.joda.time.Instant instant86 = instant78.withDurationAdded((org.joda.time.ReadableDuration) duration82, 0);
        org.joda.time.MutableDateTime mutableDateTime87 = instant78.toMutableDateTime();
        org.joda.time.DateTime dateTime88 = instant78.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant78 and mutableDateTime87", (instant78.compareTo(mutableDateTime87) == 0) == instant78.equals(mutableDateTime87));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getYear();
        int int4 = localDate0.getCenturyOfEra();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.minusDays(0);
        org.joda.time.Interval interval10 = dateMidnight9.toInterval();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) 3);
        int int13 = yearMonthDay12.size();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight9.withFields((org.joda.time.ReadablePartial) yearMonthDay12);
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay12.minusDays((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.years();
        boolean boolean22 = period20.isSupported(durationFieldType21);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay12.withFieldAdded(durationFieldType21, 7);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime26 = yearMonthDay12.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight27 = localDate0.toDateMidnight(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight6 and dateTime26", (dateMidnight6.compareTo(dateTime26) == 0) == dateMidnight6.equals(dateTime26));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.Period period7 = period5.plusDays(2022);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period9 = period7.withPeriodType(periodType8);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfYear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.minusDays(0);
        org.joda.time.Interval interval15 = dateMidnight14.toInterval();
        org.joda.time.Interval interval17 = interval15.withStartMillis((long) 0);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology18);
        org.joda.time.Period period23 = new org.joda.time.Period((long) 21, (long) 9, periodType8, chronology18);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.clockhourOfDay();
        org.joda.time.DurationField durationField25 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField25", Math.signum(durationField19.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField19)));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.LocalTime localTime7 = dateTime6.toLocalTime();
        org.joda.time.Instant instant8 = dateTime6.toInstant();
        int int9 = dateTime6.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.Instant instant24 = instant21.withMillis(0L);
        org.joda.time.DateMidnight dateMidnight25 = org.joda.time.DateMidnight.now();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.withCenturyOfEra(2022);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight25.plusYears((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay30 = dateMidnight25.toYearMonthDay();
        org.joda.time.LocalDate localDate31 = dateMidnight25.toLocalDate();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight25.minusYears(53);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        mutableDateTime35.setDayOfYear(1);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        mutableDateTime35.setZone(dateTimeZone38);
        mutableDateTime35.setMillis((long) (short) -1);
        org.joda.time.Interval interval42 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight33, (org.joda.time.ReadableInstant) mutableDateTime35);
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.lang.String str45 = mutableDateTime35.toString("days", locale44);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType47 = periodType46.withYearsRemoved();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant24, (org.joda.time.ReadableInstant) mutableDateTime35, periodType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime23 = instant21.toMutableDateTime();
        org.joda.time.Instant instant24 = instant21.toInstant();
        org.joda.time.Instant instant26 = instant21.plus((long) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.Instant instant23 = instant21.toInstant();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) 12);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (-1), chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (-1), chronology30);
        org.joda.time.Duration duration32 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (-1), chronology34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (-1), chronology37);
        org.joda.time.Duration duration39 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        mutableDateTime44.setZoneRetainFields(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(dateTimeZone47);
        mutableDateTime42.setZoneRetainFields(dateTimeZone47);
        long long52 = dateTimeZone47.adjustOffset((long) 49, false);
        org.joda.time.DateTime dateTime53 = dateTime28.toDateTime(dateTimeZone47);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration25, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Period period55 = duration25.toPeriod();
        org.joda.time.Instant instant57 = instant21.withDurationAdded((org.joda.time.ReadableDuration) duration25, (int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusDays(2022);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period11 = period9.withPeriodType(periodType10);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.dayOfYear();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.minusDays(0);
        org.joda.time.Interval interval17 = dateMidnight16.toInterval();
        org.joda.time.Interval interval19 = interval17.withStartMillis((long) 0);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.days();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight23 = org.joda.time.DateMidnight.now(chronology20);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(chronology20);
        org.joda.time.Period period25 = new org.joda.time.Period((long) 21, (long) 9, periodType10, chronology20);
        org.joda.time.DateTimeField dateTimeField26 = chronology20.clockhourOfDay();
        org.joda.time.DurationField durationField27 = chronology20.eras();
        org.joda.time.Period period28 = new org.joda.time.Period(0L, 32772L, chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField27", Math.signum(durationField21.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField21)));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.plusYears(10);
        boolean boolean4 = localDate0.equals((java.lang.Object) 0);
        org.joda.time.LocalDate.Property property5 = localDate0.weekOfWeekyear();
        org.joda.time.Period period7 = org.joda.time.Period.hours((int) (short) 100);
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded((org.joda.time.ReadablePeriod) period7, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forID("UTC");
        org.joda.time.DateTime dateTime12 = localDate0.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (-1), chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (-1), chronology27);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        mutableDateTime34.setZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        mutableDateTime32.setZoneRetainFields(dateTimeZone37);
        long long42 = dateTimeZone37.adjustOffset((long) 49, false);
        org.joda.time.DateTime dateTime43 = dateTime18.toDateTime(dateTimeZone37);
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) (byte) 1, (long) 9, dateTimeZone37);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.lang.String str47 = locale46.getISO3Language();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (-1), chronology49);
        org.joda.time.DateTime.Property property51 = dateTime50.yearOfEra();
        org.joda.time.DateTime dateTime53 = property51.addToCopy((int) ' ');
        java.util.Locale locale54 = java.util.Locale.ITALY;
        int int55 = property51.getMaximumShortTextLength(locale54);
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("PT0S");
        int int58 = property51.getMaximumShortTextLength(locale57);
        java.lang.String str59 = locale46.getDisplayVariant(locale57);
        java.lang.String str60 = locale46.toLanguageTag();
        java.lang.String str61 = dateTimeZone37.getName((long) (-1), locale46);
        java.lang.String str62 = dateTimeZone11.getShortName(1L, locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime38", (dateTime12.compareTo(mutableDateTime38) == 0) == dateTime12.equals(mutableDateTime38));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        int int4 = period3.getWeeks();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = period8.normalizedStandard(periodType9);
        org.joda.time.Period period12 = period10.minusDays(0);
        org.joda.time.Period period13 = period3.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period15 = period13.minusYears(0);
        int[] intArray16 = period13.getValues();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean21 = dateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int23 = dateTime19.get(dateTimeFieldType22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        mutableDateTime27.setZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        mutableDateTime25.setZoneRetainFields(dateTimeZone30);
        long long35 = dateTimeZone30.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime19.toMutableDateTime(dateTimeZone30);
        org.joda.time.Instant instant38 = dateTime19.toInstant();
        org.joda.time.DateTime dateTime39 = instant38.toDateTimeISO();
        org.joda.time.Instant instant40 = instant38.toInstant();
        org.joda.time.Duration duration41 = period13.toDurationFrom((org.joda.time.ReadableInstant) instant38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant38", (dateTime19.compareTo(instant38) == 0) == dateTime19.equals(instant38));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime23 = instant21.toMutableDateTime();
        org.joda.time.Instant instant24 = instant21.toInstant();
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant24", (dateTime2.compareTo(instant24) == 0) == dateTime2.equals(instant24));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime23 = instant21.toMutableDateTime();
        org.joda.time.Instant instant24 = instant21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime25 = instant24.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant24", (dateTime2.compareTo(instant24) == 0) == dateTime2.equals(instant24));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.Interval interval5 = dateMidnight4.toInterval();
        org.joda.time.Interval interval7 = interval5.withStartMillis((long) 0);
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(chronology8);
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(chronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField12", Math.signum(durationField9.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField9)));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withZone(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime5.dayOfWeek();
        org.joda.time.DateTime dateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        org.joda.time.DateTime dateTime13 = property11.addToCopy((long) 100);
        org.joda.time.DateTime dateTime14 = property11.roundFloorCopy();
        int int15 = dateTime14.getDayOfMonth();
        org.joda.time.Instant instant16 = dateTime14.toInstant();
        org.joda.time.Instant instant19 = instant16.withDurationAdded((long) 25, 3);
        org.joda.time.Instant instant20 = instant19.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant16", (dateTime10.compareTo(instant16) == 0) == dateTime10.equals(instant16));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime23 = instant21.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.Period period7 = period5.plusDays(2022);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period9 = period7.withPeriodType(periodType8);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfYear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.minusDays(0);
        org.joda.time.Interval interval15 = dateMidnight14.toInterval();
        org.joda.time.Interval interval17 = interval15.withStartMillis((long) 0);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology18);
        org.joda.time.Period period23 = new org.joda.time.Period((long) 21, (long) 9, periodType8, chronology18);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.clockhourOfDay();
        org.joda.time.DurationField durationField25 = chronology18.eras();
        org.joda.time.DurationField durationField26 = chronology18.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField25", Math.signum(durationField19.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField19)));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) 59);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withDurationAdded((long) 97, (-7194));
        org.joda.time.Instant instant10 = instant7.withDurationAdded(0L, 200);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime5 = property3.addToCopy((long) 10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (-1), chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), chronology10);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfDay();
        org.joda.time.DateTime dateTime19 = property17.addToCopy((long) 100);
        org.joda.time.DateTime dateTime20 = property17.roundFloorCopy();
        int int21 = dateTime20.getDayOfMonth();
        org.joda.time.Instant instant22 = dateTime20.toInstant();
        org.joda.time.Instant instant25 = instant22.withDurationAdded((long) 25, 3);
        boolean boolean26 = dateTime5.isAfter((org.joda.time.ReadableInstant) instant25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant22", (dateTime16.compareTo(instant22) == 0) == dateTime16.equals(instant22));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate3 = localDate0.plusWeeks(100);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property5 = localDate4.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property5.addWrapFieldToCopy(0);
        int int8 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateMidnight dateMidnight9 = localDate7.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfYear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.minusDays(0);
        org.joda.time.Interval interval15 = dateMidnight14.toInterval();
        org.joda.time.Interval interval17 = interval15.withStartMillis((long) 0);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight9.withChronology(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.DateTimeField dateTimeField22 = chronology18.weekyearOfCentury();
        org.joda.time.DurationField durationField23 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField23", Math.signum(durationField19.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField19)));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.Interval interval5 = dateMidnight4.toInterval();
        org.joda.time.Interval interval7 = interval5.withStartMillis((long) 0);
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.centuries();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.centuryOfEra();
        long long13 = dateTimeField10.set((long) ' ', "55");
        long long16 = dateTimeField10.getDifferenceAsLong(511L, 0L);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate19 = localDate17.plusYears(10);
        org.joda.time.LocalDate.Property property20 = localDate19.year();
        org.joda.time.LocalDate localDate22 = property20.addToCopy((int) (byte) -1);
        org.joda.time.LocalDate localDate23 = property20.roundHalfCeilingCopy();
        java.util.Locale locale24 = java.util.Locale.JAPANESE;
        java.lang.String str25 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) localDate23, locale24);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale24);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("English");
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.lang.String str34 = locale33.getISO3Language();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfEra();
        org.joda.time.DateTime dateTime40 = property38.addToCopy((int) ' ');
        java.util.Locale locale41 = java.util.Locale.ITALY;
        int int42 = property38.getMaximumShortTextLength(locale41);
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("PT0S");
        int int45 = property38.getMaximumShortTextLength(locale44);
        java.lang.String str46 = locale33.getDisplayVariant(locale44);
        java.lang.String str47 = dateTimeField31.getAsText((int) '4', locale44);
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        java.lang.String str50 = locale49.getISO3Language();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (-1), chronology52);
        org.joda.time.DateTime.Property property54 = dateTime53.yearOfEra();
        org.joda.time.DateTime dateTime56 = property54.addToCopy((int) ' ');
        java.util.Locale locale57 = java.util.Locale.ITALY;
        int int58 = property54.getMaximumShortTextLength(locale57);
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("PT0S");
        int int61 = property54.getMaximumShortTextLength(locale60);
        java.lang.String str62 = locale49.getDisplayVariant(locale60);
        java.lang.String str63 = dateTimeField31.getAsText(1, locale49);
        java.lang.String str64 = locale49.getISO3Language();
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(timeZone28, locale49);
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("DurationField[days]");
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone28, locale67);
        java.lang.String str69 = locale24.getDisplayLanguage(locale67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar65", (calendar26.compareTo(calendar65) == 0) == calendar26.equals(calendar65));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) 59);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withDurationAdded((long) 97, (-7194));
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.Instant instant24 = instant21.withMillis(0L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Duration duration31 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (-1), chronology33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.Duration duration38 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTime();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, (org.joda.time.ReadableInstant) dateTime37);
        boolean boolean41 = dateTime37.isAfterNow();
        org.joda.time.DateTime dateTime43 = dateTime37.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime44 = dateTime43.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean46 = localDateTime44.isSupported(dateTimeFieldType45);
        org.joda.time.DateTime dateTime47 = localDateTime44.toDateTime();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.withDayOfWeek(2);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime44.plusMinutes((int) (byte) -1);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (-1), chronology53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (-1), chronology56);
        org.joda.time.Duration duration58 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Duration duration60 = duration58.plus((long) 'u');
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = null;
        java.lang.String str65 = dateTime63.toString(dateTimeFormatter64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = dateTime63.toDateTime(dateTimeZone66);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (-1), chronology69);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (-1), chronology72);
        org.joda.time.Duration duration74 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) (-1), chronology76);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) (-1), chronology79);
        org.joda.time.Duration duration81 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime77, (org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableDuration) duration81);
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime67, (org.joda.time.ReadableDuration) duration81);
        boolean boolean84 = duration60.isEqual((org.joda.time.ReadableDuration) duration81);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime44.minus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Instant instant87 = instant24.withDurationAdded((org.joda.time.ReadableDuration) duration81, 49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) 59);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.Instant instant6 = instant1.plus((-1555099569L));
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (-1), chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        long long9 = duration8.getStandardMinutes();
        long long10 = duration8.getStandardSeconds();
        long long11 = duration8.getMillis();
        org.joda.time.Instant instant12 = instant0.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.DateTime dateTime13 = instant0.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime14 = instant0.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.Interval interval5 = dateMidnight4.toInterval();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) 3);
        int int8 = yearMonthDay7.size();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withFields((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay7.minusDays((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        boolean boolean17 = period15.isSupported(durationFieldType16);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay7.withFieldAdded(durationFieldType16, 7);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime21 = yearMonthDay7.toDateTimeAtMidnight(dateTimeZone20);
        boolean boolean23 = dateTimeZone20.isStandardOffset((long) 54480953);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateTime21", (dateMidnight1.compareTo(dateTime21) == 0) == dateMidnight1.equals(dateTime21));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (-1), chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        long long9 = duration8.getStandardMinutes();
        long long10 = duration8.getStandardSeconds();
        long long11 = duration8.getMillis();
        org.joda.time.Instant instant12 = instant0.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime18);
        long long20 = duration19.getStandardMinutes();
        org.joda.time.Duration duration21 = duration19.toDuration();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfEra();
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.Duration duration41 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableDuration) duration41);
        int int43 = duration19.compareTo((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (-1), chronology48);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (-1), chronology52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (-1), chronology55);
        org.joda.time.Duration duration57 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = dateTime56.toDateTime();
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration50, (org.joda.time.ReadableInstant) dateTime56);
        boolean boolean60 = dateTime56.isAfterNow();
        org.joda.time.DateTime dateTime62 = dateTime56.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime63 = dateTime62.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean65 = localDateTime63.isSupported(dateTimeFieldType64);
        org.joda.time.DateTime dateTime66 = localDateTime63.toDateTime();
        org.joda.time.Period period67 = duration19.toPeriodTo((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Instant instant68 = instant12.minus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateTime dateTime69 = instant12.toDateTime();
        org.joda.time.Instant instant71 = instant12.plus(691200048L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime69", (instant12.compareTo(dateTime69) == 0) == instant12.equals(dateTime69));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime8 = dateTime2.plusMonths((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay9 = dateTime8.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.plusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = yearMonthDay9.toDateMidnight(dateTimeZone14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone14, chronology16);
        mutableDateTime17.addMinutes(1969);
        mutableDateTime17.setDate((long) 5);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (-1), chronology30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (-1), chronology33);
        org.joda.time.Duration duration35 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        mutableDateTime40.setZoneRetainFields(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone43);
        mutableDateTime38.setZoneRetainFields(dateTimeZone43);
        long long48 = dateTimeZone43.adjustOffset((long) 49, false);
        org.joda.time.DateTime dateTime49 = dateTime24.toDateTime(dateTimeZone43);
        mutableDateTime17.setZoneRetainFields(dateTimeZone43);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, readableInstant52, periodType53);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = period54.normalizedStandard(periodType55);
        java.lang.String str57 = period54.toString();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (-1), chronology59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Duration duration64 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = dateTime63.withZone(dateTimeZone65);
        org.joda.time.Duration duration67 = period54.toDurationFrom((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime68 = dateTime66.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime70 = dateTime68.minusMinutes((int) '4');
        boolean boolean71 = dateTime70.isEqualNow();
        mutableDateTime17.setDate((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Instant instant73 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (-1), chronology75);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (-1), chronology78);
        org.joda.time.Duration duration80 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime76, (org.joda.time.ReadableInstant) dateTime79);
        long long81 = duration80.getStandardMinutes();
        org.joda.time.Instant instant83 = instant73.withDurationAdded((org.joda.time.ReadableDuration) duration80, 2);
        long long84 = duration80.getStandardDays();
        org.joda.time.DateTime dateTime85 = dateTime70.minus((org.joda.time.ReadableDuration) duration80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime44 and instant73", (mutableDateTime44.compareTo(instant73) == 0) == mutableDateTime44.equals(instant73));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = period10.normalizedStandard(periodType11);
        org.joda.time.DateTime dateTime14 = dateTime2.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 2022);
        org.joda.time.DateTime.Property property15 = dateTime2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime2.toDateTime(dateTimeZone16);
        org.joda.time.LocalDate localDate18 = dateTime17.toLocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths(54);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        mutableDateTime22.setZoneRetainFields(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        long long29 = dateTimeZone25.adjustOffset((long) (byte) 0, false);
        long long31 = dateTimeZone25.convertUTCToLocal(0L);
        org.joda.time.DateTime dateTime32 = localDate20.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(358);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = dateTime37.toString(dateTimeFormatter38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.toDateTime(dateTimeZone40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = period45.normalizedStandard(periodType46);
        org.joda.time.DateTime dateTime49 = dateTime37.withPeriodAdded((org.joda.time.ReadablePeriod) period45, 2022);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = dateTime37.toDateTime(dateTimeZone50);
        org.joda.time.LocalDate localDate52 = dateTime51.toLocalDate();
        org.joda.time.LocalDate localDate54 = localDate52.withYear(1969);
        org.joda.time.LocalDate localDate56 = localDate52.plusWeeks(31);
        int int57 = localDate56.size();
        org.joda.time.Chronology chronology58 = localDate56.getChronology();
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime34.toMutableDateTime(chronology58);
        org.joda.time.DurationField durationField60 = chronology58.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and mutableDateTime59", (dateTime34.compareTo(mutableDateTime59) == 0) == dateTime34.equals(mutableDateTime59));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.Instant instant23 = instant21.toInstant();
        org.joda.time.DateTime dateTime24 = instant21.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) 59);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withDurationAdded((long) 97, (-7194));
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.Instant instant23 = instant21.toInstant();
        org.joda.time.DateTime dateTime24 = instant23.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant23", (dateTime2.compareTo(instant23) == 0) == dateTime2.equals(instant23));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.Instant instant82 = instant78.plus((long) 3);
        org.joda.time.Instant instant84 = instant82.plus((long) 3);
        org.joda.time.Instant instant86 = instant84.minus(32769L);
        org.joda.time.Chronology chronology87 = instant86.getChronology();
        org.joda.time.MutableDateTime mutableDateTime88 = instant86.toMutableDateTimeISO();
        org.joda.time.Chronology chronology89 = instant86.getChronology();
        org.joda.time.Instant instant90 = instant86.toInstant();
        org.joda.time.Instant instant91 = instant86.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime88 and instant91", (mutableDateTime88.compareTo(instant91) == 0) == mutableDateTime88.equals(instant91));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 41);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (-1), chronology7);
        org.joda.time.Duration duration9 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime8);
        long long10 = duration9.getStandardHours();
        org.joda.time.Instant instant11 = instant1.minus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Instant instant13 = instant11.plus((long) 43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime2", (instant11.compareTo(dateTime2) == 0) == instant11.equals(dateTime2));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 59);
        mutablePeriod1.addSeconds(11);
        mutablePeriod1.addDays((-1));
        org.joda.time.PeriodType periodType6 = mutablePeriod1.getPeriodType();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.withZone(dateTimeZone14);
        org.joda.time.DateTime.Property property16 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property18 = dateTime17.millisOfDay();
        org.joda.time.DateTime dateTime20 = property18.addToCopy((long) 100);
        org.joda.time.DateTime dateTime21 = property18.roundFloorCopy();
        int int22 = dateTime21.getDayOfMonth();
        org.joda.time.Instant instant23 = dateTime21.toInstant();
        org.joda.time.ReadableInstant readableInstant24 = null;
        mutablePeriod1.setPeriod((org.joda.time.ReadableInstant) dateTime21, readableInstant24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant23", (dateTime21.compareTo(instant23) == 0) == dateTime21.equals(instant23));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 41);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (-1), chronology7);
        org.joda.time.Duration duration9 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime8);
        long long10 = duration9.getStandardHours();
        org.joda.time.Instant instant11 = instant1.minus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration22 = duration20.plus((long) 'u');
        mutableDateTime13.add((org.joda.time.ReadableDuration) duration22, (-1));
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (-1), chronology28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Duration duration35 = duration33.plus((long) 'u');
        mutableDateTime26.add((org.joda.time.ReadableDuration) duration35, (-1));
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (-1), chronology42);
        org.joda.time.Duration duration44 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime46 = dateTime40.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period49 = new org.joda.time.Period((long) 1, periodType48);
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime26, (org.joda.time.ReadableInstant) dateTime46, periodType48);
        mutableDateTime26.setMillis((long) 1969);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (-1), chronology57);
        org.joda.time.Duration duration59 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Duration duration61 = duration59.plus((long) 'u');
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (-1), chronology63);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean66 = dateTime64.isSupported(dateTimeFieldType65);
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period68 = duration59.toPeriodTo((org.joda.time.ReadableInstant) dateTime64, periodType67);
        org.joda.time.Period period69 = duration22.toPeriodTo((org.joda.time.ReadableInstant) mutableDateTime26, periodType67);
        org.joda.time.Duration duration70 = period69.toStandardDuration();
        org.joda.time.Instant instant71 = instant11.plus((org.joda.time.ReadableDuration) duration70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant71 and dateTime2", (instant71.compareTo(dateTime2) == 0) == instant71.equals(dateTime2));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str5 = nameProvider0.getShortName(locale2, "Italienisch", "allemand");
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("English");
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType8.getField(chronology9);
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.lang.String str13 = locale12.getISO3Language();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfEra();
        org.joda.time.DateTime dateTime19 = property17.addToCopy((int) ' ');
        java.util.Locale locale20 = java.util.Locale.ITALY;
        int int21 = property17.getMaximumShortTextLength(locale20);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("PT0S");
        int int24 = property17.getMaximumShortTextLength(locale23);
        java.lang.String str25 = locale12.getDisplayVariant(locale23);
        java.lang.String str26 = dateTimeField10.getAsText((int) '4', locale23);
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.lang.String str29 = locale28.getISO3Language();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfEra();
        org.joda.time.DateTime dateTime35 = property33.addToCopy((int) ' ');
        java.util.Locale locale36 = java.util.Locale.ITALY;
        int int37 = property33.getMaximumShortTextLength(locale36);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("PT0S");
        int int40 = property33.getMaximumShortTextLength(locale39);
        java.lang.String str41 = locale28.getDisplayVariant(locale39);
        java.lang.String str42 = dateTimeField10.getAsText(1, locale28);
        java.lang.String str43 = locale28.getISO3Language();
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone7, locale28);
        java.util.Locale locale46 = java.util.Locale.forLanguageTag("DurationField[days]");
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone7, locale46);
        java.lang.String str50 = nameProvider0.getShortName(locale46, "Franz\366sisch", "31.12.1969 23:20:59");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar44 and calendar47", (calendar44.compareTo(calendar47) == 0) == calendar44.equals(calendar47));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.DateTime dateTime81 = instant78.toDateTime();
        org.joda.time.Instant instant82 = instant78.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant82 and dateTime81", (instant82.compareTo(dateTime81) == 0) == instant82.equals(dateTime81));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate3 = localDate0.plusWeeks(100);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property5 = localDate4.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property5.addWrapFieldToCopy(0);
        int int8 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateMidnight dateMidnight9 = localDate7.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfYear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.minusDays(0);
        org.joda.time.Interval interval15 = dateMidnight14.toInterval();
        org.joda.time.Interval interval17 = interval15.withStartMillis((long) 0);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight9.withChronology(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.DateTimeField dateTimeField22 = chronology18.weekyearOfCentury();
        org.joda.time.DurationField durationField23 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField23", Math.signum(durationField19.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField19)));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 31);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant3 = instant1.toInstant();
        long long4 = instant1.getMillis();
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (-1), chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), chronology10);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Duration duration21 = duration19.plus((long) 'u');
        org.joda.time.Period period22 = duration21.toPeriod();
        boolean boolean23 = duration12.isEqual((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Instant instant24 = instant1.minus((org.joda.time.ReadableDuration) duration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime5", (instant1.compareTo(mutableDateTime5) == 0) == instant1.equals(mutableDateTime5));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 41);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (-1), chronology7);
        org.joda.time.Duration duration9 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime8);
        long long10 = duration9.getStandardHours();
        org.joda.time.Instant instant11 = instant1.minus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Period period12 = duration9.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.Duration duration82 = org.joda.time.Duration.standardHours((long) ' ');
        org.joda.time.Duration duration84 = duration82.withMillis(212941770400L);
        org.joda.time.Instant instant86 = instant78.withDurationAdded((org.joda.time.ReadableDuration) duration82, 0);
        org.joda.time.MutableDateTime mutableDateTime87 = instant78.toMutableDateTime();
        long long88 = instant78.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant78 and mutableDateTime87", (instant78.compareTo(mutableDateTime87) == 0) == instant78.equals(mutableDateTime87));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.plusYears(10);
        boolean boolean4 = localDate0.equals((java.lang.Object) 0);
        org.joda.time.LocalDate.Property property5 = localDate0.weekOfWeekyear();
        org.joda.time.Period period7 = org.joda.time.Period.hours((int) (short) 100);
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded((org.joda.time.ReadablePeriod) period7, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forID("UTC");
        org.joda.time.DateTime dateTime12 = localDate0.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        mutableDateTime33.setZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone36);
        mutableDateTime31.setZoneRetainFields(dateTimeZone36);
        long long41 = dateTimeZone36.adjustOffset((long) 49, false);
        org.joda.time.DateTime dateTime42 = dateTime17.toDateTime(dateTimeZone36);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (byte) 1, (long) 9, dateTimeZone36);
        java.lang.String str44 = interval43.toString();
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property47 = dateMidnight46.dayOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight46.withChronology(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight46.withYear(32);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours((long) 12);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (-1), chronology55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (-1), chronology58);
        org.joda.time.Duration duration60 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableDuration) duration67);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        mutableDateTime72.setZoneRetainFields(dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone75 = mutableDateTime72.getZone();
        org.joda.time.MutableDateTime mutableDateTime76 = org.joda.time.MutableDateTime.now(dateTimeZone75);
        mutableDateTime70.setZoneRetainFields(dateTimeZone75);
        long long80 = dateTimeZone75.adjustOffset((long) 49, false);
        org.joda.time.DateTime dateTime81 = dateTime56.toDateTime(dateTimeZone75);
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration53, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight51.withDurationAdded((org.joda.time.ReadableDuration) duration53, 57);
        org.joda.time.Interval interval85 = interval43.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Duration duration87 = duration53.minus((long) 1990);
        org.joda.time.PeriodType periodType88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration53, periodType88);
        org.joda.time.DateTimeZone dateTimeZone90 = null;
        org.joda.time.MutableDateTime mutableDateTime91 = new org.joda.time.MutableDateTime(dateTimeZone90);
        mutableDateTime91.setDayOfYear(1);
        org.joda.time.DateTimeZone dateTimeZone94 = null;
        mutableDateTime91.setZone(dateTimeZone94);
        org.joda.time.MutableDateTime.Property property96 = mutableDateTime91.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime98 = property96.addWrapField(53847);
        org.joda.time.Period period99 = duration53.toPeriodFrom((org.joda.time.ReadableInstant) mutableDateTime98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime37", (dateTime12.compareTo(mutableDateTime37) == 0) == dateTime12.equals(mutableDateTime37));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) 59);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.dayOfYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.minusDays(0);
        org.joda.time.Interval interval9 = dateMidnight8.toInterval();
        org.joda.time.Interval interval12 = new org.joda.time.Interval(0L, (long) 12);
        long long13 = interval12.getStartMillis();
        boolean boolean14 = interval9.isAfter((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean19 = dateTime17.isSupported(dateTimeFieldType18);
        org.joda.time.DateMidnight dateMidnight20 = dateTime17.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.withWeekOfWeekyear((int) (short) 1);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (-1), chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (-1), chronology27);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (-1), chronology34);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration38 = duration36.plus((long) 'u');
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (-1), chronology40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean43 = dateTime41.isSupported(dateTimeFieldType42);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period45 = duration36.toPeriodTo((org.joda.time.ReadableInstant) dateTime41, periodType44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableDuration) duration29, periodType44);
        org.joda.time.Seconds seconds47 = duration29.toStandardSeconds();
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property49 = localDate48.yearOfCentury();
        org.joda.time.LocalDate localDate51 = localDate48.plusWeeks(100);
        org.joda.time.LocalDate localDate52 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property53 = localDate52.yearOfCentury();
        org.joda.time.LocalDate localDate55 = property53.addWrapFieldToCopy(0);
        int int56 = localDate51.compareTo((org.joda.time.ReadablePartial) localDate55);
        org.joda.time.DateMidnight dateMidnight57 = localDate55.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property60 = dateMidnight59.dayOfYear();
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight59.minusDays(0);
        org.joda.time.Interval interval63 = dateMidnight62.toInterval();
        org.joda.time.Interval interval65 = interval63.withStartMillis((long) 0);
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        org.joda.time.DurationField durationField67 = chronology66.days();
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight57.withChronology(chronology66);
        org.joda.time.DateMidnight dateMidnight69 = org.joda.time.DateMidnight.now(chronology66);
        org.joda.time.DurationField durationField70 = chronology66.weekyears();
        boolean boolean71 = duration29.equals((java.lang.Object) durationField70);
        org.joda.time.Interval interval72 = interval12.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration75 = duration29.withDurationAdded((long) 8, 49);
        org.joda.time.Instant instant77 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration75, 786575);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateMidnight5", (instant1.compareTo(dateMidnight5) == 0) == instant1.equals(dateMidnight5));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.Interval interval5 = dateMidnight4.toInterval();
        org.joda.time.Interval interval8 = new org.joda.time.Interval(0L, (long) 12);
        long long9 = interval8.getStartMillis();
        boolean boolean10 = interval5.isAfter((org.joda.time.ReadableInterval) interval8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.years();
        boolean boolean16 = period14.isSupported(durationFieldType15);
        org.joda.time.Interval interval17 = interval8.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Chronology chronology18 = interval8.getChronology();
        org.joda.time.DateMidnight dateMidnight19 = org.joda.time.DateMidnight.now();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.withCenturyOfEra(2022);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight19.plusYears((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay24 = dateMidnight19.toYearMonthDay();
        org.joda.time.LocalDate localDate25 = dateMidnight19.toLocalDate();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight19.minusYears(53);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight19.minus((long) (-54));
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (-1), chronology34);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration38 = duration36.plus((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        mutableDateTime40.setDayOfYear(1);
        int int43 = mutableDateTime40.getSecondOfMinute();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = dateTime46.toString(dateTimeFormatter47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = dateTime46.toDateTime(dateTimeZone49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (-1), chronology52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (-1), chronology55);
        org.joda.time.Duration duration57 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (-1), chronology59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Duration duration64 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableDuration) duration64);
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableDuration) duration64);
        mutableDateTime40.add((org.joda.time.ReadableDuration) duration64);
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.minutes();
        int int69 = periodType68.size();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration36, (org.joda.time.ReadableInstant) mutableDateTime40, periodType68);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight29.withDurationAdded((org.joda.time.ReadableDuration) duration36, 15);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.minus((-2082844800000L));
        org.joda.time.Interval interval75 = interval8.withEnd((org.joda.time.ReadableInstant) dateMidnight72);
        org.joda.time.Interval interval77 = interval75.withEndMillis((long) 32769);
        org.joda.time.Instant instant79 = new org.joda.time.Instant((long) 41);
        org.joda.time.DateTime dateTime80 = instant79.toDateTime();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime((long) (-1), chronology82);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((long) (-1), chronology85);
        org.joda.time.Duration duration87 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime83, (org.joda.time.ReadableInstant) dateTime86);
        long long88 = duration87.getStandardHours();
        org.joda.time.Instant instant89 = instant79.minus((org.joda.time.ReadableDuration) duration87);
        boolean boolean90 = interval77.isBefore((org.joda.time.ReadableInstant) instant79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime80 and instant79", (dateTime80.compareTo(instant79) == 0) == dateTime80.equals(instant79));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.Instant instant82 = instant78.plus((long) 3);
        org.joda.time.DateTime dateTime83 = instant82.toDateTimeISO();
        org.joda.time.DateTime dateTime84 = instant82.toDateTimeISO();
        org.joda.time.DateTime.Property property85 = dateTime84.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant82 and dateTime83", (instant82.compareTo(dateTime83) == 0) == instant82.equals(dateTime83));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime7 = dateTime5.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Duration duration27 = duration25.plus((long) 'u');
        mutableDateTime18.add((org.joda.time.ReadableDuration) duration27, (-1));
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (-1), chronology34);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime38 = dateTime32.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period41 = new org.joda.time.Period((long) 1, periodType40);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime18, (org.joda.time.ReadableInstant) dateTime38, periodType40);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property45 = dateMidnight44.dayOfYear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight44.minusDays(0);
        org.joda.time.Interval interval48 = dateMidnight47.toInterval();
        org.joda.time.Interval interval50 = interval48.withStartMillis((long) 0);
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 50, periodType40, chronology51);
        org.joda.time.Period period53 = new org.joda.time.Period((long) 2022, (long) 45, chronology51);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 5, chronology51);
        org.joda.time.DateTimeField dateTimeField55 = chronology51.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(49L, 0L, chronology51);
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate59 = localDate57.plusYears(10);
        boolean boolean61 = localDate57.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (-1), chronology63);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (-1), chronology66);
        org.joda.time.Duration duration68 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTime dateTime70 = dateTime64.plusMonths((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay71 = dateTime70.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay73 = yearMonthDay71.minusDays(10);
        org.joda.time.Period period74 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate57, (org.joda.time.ReadablePartial) yearMonthDay73);
        int[] intArray76 = chronology51.get((org.joda.time.ReadablePartial) yearMonthDay73, (long) 292278993);
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        mutableDateTime80.setZoneRetainFields(dateTimeZone81);
        org.joda.time.DateTimeZone dateTimeZone83 = mutableDateTime80.getZone();
        org.joda.time.MutableDateTime mutableDateTime84 = org.joda.time.MutableDateTime.now(dateTimeZone83);
        mutableDateTime78.setZoneRetainFields(dateTimeZone83);
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime(dateTimeZone83);
        org.joda.time.DateTime dateTime87 = yearMonthDay73.toDateTimeAtMidnight(dateTimeZone83);
        org.joda.time.Chronology chronology88 = yearMonthDay73.getChronology();
        org.joda.time.MutableDateTime mutableDateTime89 = dateTime7.toMutableDateTime(chronology88);
        java.util.Locale locale91 = new java.util.Locale("52");
        java.util.Locale locale92 = locale91.stripExtensions();
        java.util.Locale locale93 = null;
        java.lang.String str94 = locale91.getDisplayCountry(locale93);
        java.util.Calendar calendar95 = dateTime7.toCalendar(locale91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime89", (dateTime2.compareTo(mutableDateTime89) == 0) == dateTime2.equals(mutableDateTime89));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 41);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (-1), chronology7);
        org.joda.time.Duration duration9 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime8);
        long long10 = duration9.getStandardHours();
        org.joda.time.Instant instant11 = instant1.minus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime2", (instant11.compareTo(dateTime2) == 0) == instant11.equals(dateTime2));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight3 = property2.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.dayOfYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.minusDays(0);
        org.joda.time.Interval interval9 = dateMidnight8.toInterval();
        org.joda.time.Interval interval11 = interval9.withStartMillis((long) 0);
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        long long18 = chronology12.getDateTimeMillis(41, 7, 3, 3);
        org.joda.time.DateTime dateTime19 = dateMidnight3.toDateTime(chronology12);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight3.minusWeeks((int) (short) 1);
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("31 Dec 1969 23:59:59 GMT");
        boolean boolean25 = timeZone22.hasSameRules(timeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = dateMidnight21.toMutableDateTime(dateTimeZone26);
        java.lang.String str29 = dateTimeZone26.getName((long) 53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight21 and mutableDateTime27", (dateMidnight21.compareTo(mutableDateTime27) == 0) == dateMidnight21.equals(mutableDateTime27));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.Interval interval5 = dateMidnight4.toInterval();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) 3);
        int int8 = yearMonthDay7.size();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withFields((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay7.minusDays((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        boolean boolean17 = period15.isSupported(durationFieldType16);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay7.withFieldAdded(durationFieldType16, 7);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime21 = yearMonthDay7.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight22 = org.joda.time.DateMidnight.now();
        org.joda.time.DateMidnight dateMidnight23 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (-1), chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = dateTime26.toString(dateTimeFormatter27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (-1), chronology35);
        org.joda.time.Duration duration37 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (-1), chronology42);
        org.joda.time.Duration duration44 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableDuration) duration44);
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableDuration) duration44);
        org.joda.time.DateTime.Property property47 = dateTime30.year();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight23, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight23, dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        mutableDateTime52.setYear(1969);
        boolean boolean55 = dateMidnight23.isEqual((org.joda.time.ReadableInstant) mutableDateTime52);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (-1), chronology57);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (-1), chronology60);
        org.joda.time.Duration duration62 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Duration duration64 = duration62.plus((long) 'u');
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.standard();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight23, (org.joda.time.ReadableDuration) duration62, periodType65);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration62);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight22.withDayOfWeek((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime70 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        mutableDateTime74.setZoneRetainFields(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone77 = mutableDateTime74.getZone();
        org.joda.time.MutableDateTime mutableDateTime78 = org.joda.time.MutableDateTime.now(dateTimeZone77);
        mutableDateTime72.setZoneRetainFields(dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(dateTimeZone77);
        mutableDateTime70.setZoneRetainFields(dateTimeZone77);
        java.lang.String str83 = dateTimeZone77.getName((long) 51);
        org.joda.time.DateMidnight dateMidnight84 = new org.joda.time.DateMidnight((java.lang.Object) dateMidnight69, dateTimeZone77);
        org.joda.time.DateTime dateTime85 = yearMonthDay7.toDateTimeAtCurrentTime(dateTimeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateTime21", (dateMidnight1.compareTo(dateTime21) == 0) == dateMidnight1.equals(dateTime21));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (-1), chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = dateTime14.toString(dateTimeFormatter15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (-1), chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (-1), chronology30);
        org.joda.time.Duration duration32 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration32);
        org.joda.time.DateTime.Property property35 = dateTime18.year();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight11, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight11, dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        mutableDateTime40.setYear(1969);
        boolean boolean43 = dateMidnight11.isEqual((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (-1), chronology48);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Duration duration52 = duration50.plus((long) 'u');
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.standard();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight11, (org.joda.time.ReadableDuration) duration50, periodType53);
        mutablePeriod54.addSeconds(42);
        mutablePeriod54.addWeeks((-1));
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (-1), chronology60);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (-1), chronology63);
        org.joda.time.Duration duration65 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = dateTime64.withZone(dateTimeZone66);
        org.joda.time.DateTime.Property property68 = dateTime64.dayOfWeek();
        org.joda.time.DateTime dateTime69 = property68.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property70 = dateTime69.millisOfDay();
        org.joda.time.DateTime dateTime72 = property70.addToCopy((long) 100);
        org.joda.time.Duration duration73 = mutablePeriod54.toDurationFrom((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (-1), chronology75);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (-1), chronology78);
        org.joda.time.Duration duration80 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime76, (org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.Duration duration82 = duration80.plus((long) 'u');
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) (-1), chronology84);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean87 = dateTime85.isSupported(dateTimeFieldType86);
        org.joda.time.PeriodType periodType88 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period89 = duration80.toPeriodTo((org.joda.time.ReadableInstant) dateTime85, periodType88);
        boolean boolean90 = duration73.isShorterThan((org.joda.time.ReadableDuration) duration80);
        org.joda.time.Interval interval91 = new org.joda.time.Interval((org.joda.time.ReadableInstant) instant10, (org.joda.time.ReadableDuration) duration80);
        org.joda.time.MutableDateTime mutableDateTime92 = instant10.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime93 = instant10.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime92", (instant10.compareTo(mutableDateTime92) == 0) == instant10.equals(mutableDateTime92));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 31);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant3 = instant1.toInstant();
        long long4 = instant1.getMillis();
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.Instant instant8 = instant1.withDurationAdded((long) (-15), 90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime5", (instant1.compareTo(mutableDateTime5) == 0) == instant1.equals(mutableDateTime5));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.plusYears(10);
        boolean boolean4 = localDate0.equals((java.lang.Object) 0);
        org.joda.time.LocalDate.Property property5 = localDate0.weekOfWeekyear();
        org.joda.time.Period period7 = org.joda.time.Period.hours((int) (short) 100);
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded((org.joda.time.ReadablePeriod) period7, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forID("UTC");
        org.joda.time.DateTime dateTime12 = localDate0.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        mutableDateTime33.setZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone36);
        mutableDateTime31.setZoneRetainFields(dateTimeZone36);
        long long41 = dateTimeZone36.adjustOffset((long) 49, false);
        org.joda.time.DateTime dateTime42 = dateTime17.toDateTime(dateTimeZone36);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (byte) 1, (long) 9, dateTimeZone36);
        java.lang.String str44 = interval43.toString();
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property47 = dateMidnight46.dayOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight46.withChronology(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight46.withYear(32);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours((long) 12);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (-1), chronology55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (-1), chronology58);
        org.joda.time.Duration duration60 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableDuration) duration67);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        mutableDateTime72.setZoneRetainFields(dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone75 = mutableDateTime72.getZone();
        org.joda.time.MutableDateTime mutableDateTime76 = org.joda.time.MutableDateTime.now(dateTimeZone75);
        mutableDateTime70.setZoneRetainFields(dateTimeZone75);
        long long80 = dateTimeZone75.adjustOffset((long) 49, false);
        org.joda.time.DateTime dateTime81 = dateTime56.toDateTime(dateTimeZone75);
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration53, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight51.withDurationAdded((org.joda.time.ReadableDuration) duration53, 57);
        org.joda.time.Interval interval85 = interval43.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Duration duration87 = duration53.minus((long) 1990);
        org.joda.time.PeriodType periodType88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration53, periodType88);
        org.joda.time.MutablePeriod mutablePeriod90 = period89.toMutablePeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime37", (dateTime12.compareTo(mutableDateTime37) == 0) == dateTime12.equals(mutableDateTime37));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.Instant instant82 = instant78.plus((long) 3);
        org.joda.time.Instant instant84 = instant82.plus((long) 3);
        org.joda.time.Instant instant86 = instant84.minus(32769L);
        org.joda.time.MutableDateTime mutableDateTime87 = instant84.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime87.secondOfDay();
        org.joda.time.Instant instant90 = new org.joda.time.Instant((long) 31);
        org.joda.time.Chronology chronology91 = instant90.getChronology();
        boolean boolean92 = mutableDateTime87.isBefore((org.joda.time.ReadableInstant) instant90);
        boolean boolean93 = instant90.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant84 and mutableDateTime87", (instant84.compareTo(mutableDateTime87) == 0) == instant84.equals(mutableDateTime87));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.Period period8 = period6.plusDays(2022);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period10 = period8.withPeriodType(periodType9);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.dayOfYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight12.minusDays(0);
        org.joda.time.Interval interval16 = dateMidnight15.toInterval();
        org.joda.time.Interval interval18 = interval16.withStartMillis((long) 0);
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.days();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight22 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(chronology19);
        org.joda.time.Period period24 = new org.joda.time.Period((long) 21, (long) 9, periodType9, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = chronology19.clockhourOfDay();
        org.joda.time.DurationField durationField26 = chronology19.eras();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(113605027200032L, chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField26", Math.signum(durationField20.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField20)));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime7 = dateTime5.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("PT0S");
        java.util.Calendar calendar12 = dateTime7.toCalendar(locale11);
        int int13 = calendar12.getFirstDayOfWeek();
        java.util.Date date14 = calendar12.getTime();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromCalendarFields(calendar12);
        long long16 = calendar12.getTimeInMillis();
        org.joda.time.Instant instant18 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant20 = instant18.minus((long) 59);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.dayOfYear();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.minusDays(0);
        org.joda.time.Interval interval27 = dateMidnight26.toInterval();
        org.joda.time.Interval interval29 = interval27.withStartMillis((long) 0);
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.yearOfCentury();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 90, chronology30);
        org.joda.time.DateTimeField dateTimeField34 = chronology30.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime35 = instant18.toMutableDateTime(chronology30);
        boolean boolean36 = calendar12.after((java.lang.Object) chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateMidnight23", (instant18.compareTo(dateMidnight23) == 0) == instant18.equals(dateMidnight23));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.Interval interval5 = dateMidnight4.toInterval();
        org.joda.time.Interval interval7 = interval5.withStartMillis((long) 0);
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(chronology8);
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField12", Math.signum(durationField9.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField9)));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTime dateTime79 = instant10.toDateTime();
        org.joda.time.Instant instant82 = instant10.withDurationAdded(0L, 494);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant82 and dateTime79", (instant82.compareTo(dateTime79) == 0) == instant82.equals(dateTime79));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime23 = instant21.toMutableDateTime();
        org.joda.time.Instant instant24 = instant21.toInstant();
        org.joda.time.Instant instant26 = instant24.minus((long) 3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant24", (dateTime2.compareTo(instant24) == 0) == dateTime2.equals(instant24));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate3 = localDate0.plusWeeks(100);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property5 = localDate4.yearOfCentury();
        org.joda.time.LocalDate localDate7 = property5.addWrapFieldToCopy(0);
        int int8 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateMidnight dateMidnight9 = localDate7.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfYear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.minusDays(0);
        org.joda.time.Interval interval15 = dateMidnight14.toInterval();
        org.joda.time.Interval interval17 = interval15.withStartMillis((long) 0);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight9.withChronology(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.DateTimeField dateTimeField22 = chronology18.weekyearOfCentury();
        org.joda.time.DurationField durationField23 = chronology18.eras();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (-1), chronology25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (-1), chronology28);
        org.joda.time.Duration duration30 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime32 = dateTime26.plusMonths((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime32.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay33.minusDays(10);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (-1), chronology37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (-1), chronology40);
        org.joda.time.Duration duration42 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = dateTime41.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withZone(dateTimeZone44);
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("PT0S");
        java.util.Calendar calendar48 = dateTime43.toCalendar(locale47);
        int int49 = calendar48.getFirstDayOfWeek();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(periodType50);
        boolean boolean52 = calendar48.after((java.lang.Object) mutablePeriod51);
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay35.plus((org.joda.time.ReadablePeriod) mutablePeriod51);
        int int54 = yearMonthDay53.getDayOfMonth();
        long long56 = chronology18.set((org.joda.time.ReadablePartial) yearMonthDay53, 1105019787737L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField23", Math.signum(durationField19.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField19)));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (-1), chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        long long9 = duration8.getStandardMinutes();
        long long10 = duration8.getStandardSeconds();
        long long11 = duration8.getMillis();
        org.joda.time.Instant instant12 = instant0.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.DateTime dateTime13 = instant0.toDateTimeISO();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardMinutes((long) 21);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = dateTime18.toString(dateTimeFormatter19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTime(dateTimeZone21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = period26.normalizedStandard(periodType27);
        org.joda.time.DateTime dateTime30 = dateTime18.withPeriodAdded((org.joda.time.ReadablePeriod) period26, 2022);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime18.toDateTime(dateTimeZone31);
        org.joda.time.LocalDate localDate33 = dateTime32.toLocalDate();
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(periodType34);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) dateTime32, periodType34);
        org.joda.time.Instant instant37 = instant0.plus((org.joda.time.ReadableDuration) duration15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 31);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant3 = instant1.toInstant();
        long long4 = instant1.getMillis();
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.DateTime dateTime6 = instant1.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime5", (instant1.compareTo(mutableDateTime5) == 0) == instant1.equals(mutableDateTime5));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime12);
        boolean boolean16 = dateTime12.isAfterNow();
        org.joda.time.DateTime dateTime18 = dateTime12.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime();
        int int21 = dateTime20.getSecondOfDay();
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime();
        org.joda.time.DateTime.Property property23 = dateTime22.millisOfDay();
        org.joda.time.DateTime dateTime25 = property23.addToCopy(38);
        org.joda.time.Instant instant26 = dateTime25.toInstant();
        org.joda.time.DateTime.Property property27 = dateTime25.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant26", (dateTime25.compareTo(instant26) == 0) == dateTime25.equals(instant26));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.Duration duration11 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration13 = duration11.plus((long) 'u');
        mutableDateTime4.add((org.joda.time.ReadableDuration) duration13, (-1));
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime24 = dateTime18.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period27 = new org.joda.time.Period((long) 1, periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime4, (org.joda.time.ReadableInstant) dateTime24, periodType26);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.dayOfYear();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight30.minusDays(0);
        org.joda.time.Interval interval34 = dateMidnight33.toInterval();
        org.joda.time.Interval interval36 = interval34.withStartMillis((long) 0);
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 50, periodType26, chronology37);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) 17, chronology37);
        org.joda.time.DurationField durationField40 = chronology37.days();
        org.joda.time.DurationField durationField41 = chronology37.days();
        org.joda.time.DateTimeField dateTimeField42 = chronology37.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology37.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField44 = chronology37.hourOfDay();
        org.joda.time.Period period45 = new org.joda.time.Period(32L, chronology37);
        org.joda.time.DurationField durationField46 = chronology37.eras();
        long long50 = chronology37.add((long) 1967, 14962036L, 786575);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField40 and durationField46", Math.signum(durationField40.compareTo(durationField46)) == -Math.signum(durationField46.compareTo(durationField40)));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Instant instant2 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant4 = instant2.minus((long) 59);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.dayOfYear();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.minusDays(0);
        org.joda.time.Interval interval11 = dateMidnight10.toInterval();
        org.joda.time.Interval interval13 = interval11.withStartMillis((long) 0);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.days();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 90, chronology14);
        org.joda.time.DateTimeField dateTimeField18 = chronology14.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime19 = instant2.toMutableDateTime(chronology14);
        org.joda.time.Period period20 = new org.joda.time.Period((long) 84959999, chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateMidnight7", (instant2.compareTo(dateMidnight7) == 0) == instant2.equals(dateMidnight7));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.DateMidnight.Property property5 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight6 = property5.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight7 = property5.roundHalfEvenCopy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime20);
        boolean boolean24 = dateTime20.isAfterNow();
        org.joda.time.DateTime dateTime26 = dateTime20.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime27 = dateTime26.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean29 = localDateTime27.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        mutableDateTime31.setDayOfYear(1);
        int int34 = mutableDateTime31.getSecondOfMinute();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = dateTime37.toString(dateTimeFormatter38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.toDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (-1), chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (-1), chronology46);
        org.joda.time.Duration duration48 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (-1), chronology50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (-1), chronology53);
        org.joda.time.Duration duration55 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableDuration) duration55);
        mutableDateTime31.add((org.joda.time.ReadableDuration) duration55);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime27.withDurationAdded((org.joda.time.ReadableDuration) duration55, 23);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = period64.normalizedStandard(periodType65);
        org.joda.time.Period period68 = period66.minusDays(0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray69 = period68.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime27.plus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight7.withPeriodAdded((org.joda.time.ReadablePeriod) period68, 44);
        org.joda.time.Instant instant73 = dateMidnight7.toInstant();
        org.joda.time.Instant instant76 = instant73.withDurationAdded((long) 17, (-54));
        org.joda.time.Instant instant78 = instant76.plus((long) 78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant73", (dateMidnight1.compareTo(instant73) == 0) == dateMidnight1.equals(instant73));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfCentury();
        org.joda.time.LocalDate localDate5 = localDate2.plusWeeks(100);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy(0);
        int int10 = localDate5.compareTo((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateMidnight dateMidnight11 = localDate9.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.dayOfYear();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.minusDays(0);
        org.joda.time.Interval interval17 = dateMidnight16.toInterval();
        org.joda.time.Interval interval19 = interval17.withStartMillis((long) 0);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.days();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withChronology(chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 12, chronology20);
        org.joda.time.DurationField durationField25 = chronology20.eras();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((-378269989000L), chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField25", Math.signum(durationField21.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField21)));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTime dateTime79 = instant10.toDateTime();
        org.joda.time.DateTime dateTime80 = instant10.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime79", (instant10.compareTo(dateTime79) == 0) == instant10.equals(dateTime79));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.Period period7 = period5.plusDays(2022);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period9 = period7.withPeriodType(periodType8);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfYear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.minusDays(0);
        org.joda.time.Interval interval15 = dateMidnight14.toInterval();
        org.joda.time.Interval interval17 = interval15.withStartMillis((long) 0);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology18);
        org.joda.time.Period period23 = new org.joda.time.Period((long) 21, (long) 9, periodType8, chronology18);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.clockhourOfDay();
        org.joda.time.DurationField durationField25 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField25", Math.signum(durationField19.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField19)));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Period period4 = new org.joda.time.Period(22, 0, 24, (int) (short) 1);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate7 = localDate5.plusYears(10);
        org.joda.time.LocalDate.Property property8 = localDate7.year();
        org.joda.time.LocalDate localDate10 = property8.addToCopy((int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField11 = property8.getField();
        org.joda.time.DurationField durationField12 = property8.getLeapDurationField();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime21 = dateTime15.plusMonths((int) (short) 100);
        int int22 = property8.compareTo((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime21.getDayOfWeek();
        org.joda.time.Duration duration24 = period4.toDurationTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(518400000L, chronology26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, (org.joda.time.ReadableInstant) dateMidnight27);
        org.joda.time.Instant instant29 = dateMidnight27.toInstant();
        org.joda.time.Instant instant31 = instant29.withMillis((long) 13);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardHours((long) 12);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (-1), chronology35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (-1), chronology38);
        org.joda.time.Duration duration40 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (-1), chronology42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableDuration) duration47);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        mutableDateTime52.setZoneRetainFields(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = mutableDateTime52.getZone();
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(dateTimeZone55);
        mutableDateTime50.setZoneRetainFields(dateTimeZone55);
        long long60 = dateTimeZone55.adjustOffset((long) 49, false);
        org.joda.time.DateTime dateTime61 = dateTime36.toDateTime(dateTimeZone55);
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration33, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Period period63 = duration33.toPeriod();
        org.joda.time.Period period64 = duration33.toPeriod();
        java.lang.String str65 = duration33.toString();
        org.joda.time.Instant instant66 = instant31.minus((org.joda.time.ReadableDuration) duration33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight27 and instant29", (dateMidnight27.compareTo(instant29) == 0) == dateMidnight27.equals(instant29));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = period10.normalizedStandard(periodType11);
        org.joda.time.DateTime dateTime14 = dateTime2.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 2022);
        org.joda.time.DateTime.Property property15 = dateTime2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime2.toDateTime(dateTimeZone16);
        org.joda.time.LocalDate localDate18 = dateTime17.toLocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths(54);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        mutableDateTime22.setZoneRetainFields(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        long long29 = dateTimeZone25.adjustOffset((long) (byte) 0, false);
        long long31 = dateTimeZone25.convertUTCToLocal(0L);
        org.joda.time.DateTime dateTime32 = localDate20.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(358);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = dateTime37.toString(dateTimeFormatter38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.toDateTime(dateTimeZone40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = period45.normalizedStandard(periodType46);
        org.joda.time.DateTime dateTime49 = dateTime37.withPeriodAdded((org.joda.time.ReadablePeriod) period45, 2022);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = dateTime37.toDateTime(dateTimeZone50);
        org.joda.time.LocalDate localDate52 = dateTime51.toLocalDate();
        org.joda.time.LocalDate localDate54 = localDate52.withYear(1969);
        org.joda.time.LocalDate localDate56 = localDate52.plusWeeks(31);
        int int57 = localDate56.size();
        org.joda.time.Chronology chronology58 = localDate56.getChronology();
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime34.toMutableDateTime(chronology58);
        org.joda.time.DurationField durationField60 = chronology58.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and mutableDateTime59", (dateTime34.compareTo(mutableDateTime59) == 0) == dateTime34.equals(mutableDateTime59));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.Interval interval5 = dateMidnight4.toInterval();
        org.joda.time.MutableInterval mutableInterval6 = interval5.toMutableInterval();
        org.joda.time.Instant instant8 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant10 = instant8.minus((long) 59);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.dayOfYear();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.minusDays(0);
        org.joda.time.Interval interval17 = dateMidnight16.toInterval();
        org.joda.time.Interval interval19 = interval17.withStartMillis((long) 0);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.days();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfCentury();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 90, chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime25 = instant8.toMutableDateTime(chronology20);
        org.joda.time.Interval interval26 = interval5.withStart((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (-1), chronology28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (-1), chronology35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (-1), chronology38);
        org.joda.time.Duration duration40 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime41 = dateTime39.toDateTime();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration33, (org.joda.time.ReadableInstant) dateTime39);
        boolean boolean43 = dateTime39.isAfterNow();
        org.joda.time.DateTime dateTime45 = dateTime39.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime46 = dateTime45.toLocalDateTime();
        org.joda.time.DateTime dateTime47 = dateTime45.toDateTime();
        int int48 = dateTime47.getSecondOfDay();
        org.joda.time.DateTime dateTime49 = dateTime47.toDateTime();
        int int50 = dateTime49.getCenturyOfEra();
        boolean boolean51 = interval26.contains((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant8", (dateMidnight1.compareTo(instant8) == 0) == dateMidnight1.equals(instant8));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.DateTime dateTime81 = instant78.toDateTime();
        org.joda.time.DateTime dateTime82 = instant78.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant78 and dateTime81", (instant78.compareTo(dateTime81) == 0) == instant78.equals(dateTime81));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 41);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (-1), chronology7);
        org.joda.time.Duration duration9 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime8);
        long long10 = duration9.getStandardHours();
        org.joda.time.Instant instant11 = instant1.minus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        org.joda.time.MutableDateTime mutableDateTime17 = property14.addWrapField(8);
        org.joda.time.MutableDateTime mutableDateTime18 = property14.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = period25.normalizedStandard(periodType26);
        java.lang.String str28 = period25.toString();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (-1), chronology30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (-1), chronology33);
        org.joda.time.Duration duration35 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.withZone(dateTimeZone36);
        org.joda.time.Duration duration38 = period25.toDurationFrom((org.joda.time.ReadableInstant) dateTime37);
        mutableDateTime21.add((org.joda.time.ReadableDuration) duration38, 12);
        mutableDateTime18.add((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Instant instant42 = instant1.minus((org.joda.time.ReadableDuration) duration38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant42", (dateTime2.compareTo(instant42) == 0) == dateTime2.equals(instant42));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.plusYears(10);
        boolean boolean4 = localDate0.equals((java.lang.Object) 0);
        org.joda.time.LocalDate.Property property5 = localDate0.weekOfWeekyear();
        org.joda.time.Period period7 = org.joda.time.Period.hours((int) (short) 100);
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded((org.joda.time.ReadablePeriod) period7, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forID("UTC");
        org.joda.time.DateTime dateTime12 = localDate0.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        mutableDateTime33.setZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone36);
        mutableDateTime31.setZoneRetainFields(dateTimeZone36);
        long long41 = dateTimeZone36.adjustOffset((long) 49, false);
        org.joda.time.DateTime dateTime42 = dateTime17.toDateTime(dateTimeZone36);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (byte) 1, (long) 9, dateTimeZone36);
        java.lang.String str44 = interval43.toString();
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property47 = dateMidnight46.dayOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight46.withChronology(chronology48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight46.withYear(32);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours((long) 12);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (-1), chronology55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (-1), chronology58);
        org.joda.time.Duration duration60 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableDuration) duration67);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        mutableDateTime72.setZoneRetainFields(dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone75 = mutableDateTime72.getZone();
        org.joda.time.MutableDateTime mutableDateTime76 = org.joda.time.MutableDateTime.now(dateTimeZone75);
        mutableDateTime70.setZoneRetainFields(dateTimeZone75);
        long long80 = dateTimeZone75.adjustOffset((long) 49, false);
        org.joda.time.DateTime dateTime81 = dateTime56.toDateTime(dateTimeZone75);
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration53, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight51.withDurationAdded((org.joda.time.ReadableDuration) duration53, 57);
        org.joda.time.Interval interval85 = interval43.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Duration duration87 = duration53.minus((long) 1990);
        org.joda.time.PeriodType periodType88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration53, periodType88);
        org.joda.time.Duration duration92 = duration53.withDurationAdded((long) 5570, 54017);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime37", (dateTime12.compareTo(mutableDateTime37) == 0) == dateTime12.equals(mutableDateTime37));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (-1), chronology7);
        org.joda.time.Duration duration9 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 1, periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((java.lang.Object) dateTimeZone10, periodType13);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) 12, periodType13);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType17.getDurationType();
        int int19 = mutablePeriod16.indexOf(durationFieldType18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) 34);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.yearOfEra();
        mutableDateTime23.add((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        mutableDateTime23.setZoneRetainFields(dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime23.add(readablePeriod30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = period35.normalizedStandard(periodType36);
        org.joda.time.Period period39 = period37.minusDays(0);
        org.joda.time.Period period41 = period37.withMonths((int) 'a');
        mutableDateTime23.add((org.joda.time.ReadablePeriod) period41);
        int int43 = mutableDateTime23.getWeekyear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (-1), chronology48);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime51 = dateTime49.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withZone(dateTimeZone52);
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("PT0S");
        java.util.Calendar calendar56 = dateTime51.toCalendar(locale55);
        int int57 = calendar56.getFirstDayOfWeek();
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(periodType58);
        boolean boolean60 = calendar56.after((java.lang.Object) mutablePeriod59);
        int int62 = calendar56.getGreatestMinimum(0);
        calendar56.set(32, 0, 54);
        int int68 = calendar56.getMaximum(9);
        org.joda.time.LocalTime localTime69 = org.joda.time.LocalTime.fromCalendarFields(calendar56);
        org.joda.time.LocalTime localTime71 = localTime69.withMillisOfSecond(24);
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property74 = dateMidnight73.dayOfYear();
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight73.minusDays(0);
        org.joda.time.Interval interval77 = dateMidnight76.toInterval();
        org.joda.time.Interval interval79 = interval77.withStartMillis((long) 0);
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.DurationField durationField81 = chronology80.days();
        org.joda.time.DateTimeField dateTimeField82 = chronology80.yearOfCentury();
        boolean boolean83 = localTime71.equals((java.lang.Object) chronology80);
        org.joda.time.MutableDateTime mutableDateTime84 = mutableDateTime23.toMutableDateTime(chronology80);
        org.joda.time.DateTimeField dateTimeField85 = chronology80.clockhourOfDay();
        mutablePeriod16.setPeriod((org.joda.time.ReadableDuration) duration21, chronology80);
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime((long) 292278993, chronology80);
        org.joda.time.DurationField durationField88 = chronology80.eras();
        org.joda.time.DateTimeField dateTimeField89 = chronology80.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField81 and durationField88", Math.signum(durationField81.compareTo(durationField88)) == -Math.signum(durationField88.compareTo(durationField81)));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime12);
        boolean boolean16 = dateTime12.isAfterNow();
        org.joda.time.DateTime dateTime18 = dateTime12.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime();
        org.joda.time.DateMidnight dateMidnight21 = dateTime20.toDateMidnight();
        org.joda.time.Instant instant22 = dateTime20.toInstant();
        int int23 = dateTime20.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant22", (dateTime20.compareTo(instant22) == 0) == dateTime20.equals(instant22));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (-1), chronology7);
        org.joda.time.Duration duration9 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 1, periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((java.lang.Object) dateTimeZone10, periodType13);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) 12, periodType13);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType17.getDurationType();
        int int19 = mutablePeriod16.indexOf(durationFieldType18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) 34);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.yearOfEra();
        mutableDateTime23.add((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        mutableDateTime23.setZoneRetainFields(dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime23.add(readablePeriod30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = period35.normalizedStandard(periodType36);
        org.joda.time.Period period39 = period37.minusDays(0);
        org.joda.time.Period period41 = period37.withMonths((int) 'a');
        mutableDateTime23.add((org.joda.time.ReadablePeriod) period41);
        int int43 = mutableDateTime23.getWeekyear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (-1), chronology48);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime51 = dateTime49.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withZone(dateTimeZone52);
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("PT0S");
        java.util.Calendar calendar56 = dateTime51.toCalendar(locale55);
        int int57 = calendar56.getFirstDayOfWeek();
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(periodType58);
        boolean boolean60 = calendar56.after((java.lang.Object) mutablePeriod59);
        int int62 = calendar56.getGreatestMinimum(0);
        calendar56.set(32, 0, 54);
        int int68 = calendar56.getMaximum(9);
        org.joda.time.LocalTime localTime69 = org.joda.time.LocalTime.fromCalendarFields(calendar56);
        org.joda.time.LocalTime localTime71 = localTime69.withMillisOfSecond(24);
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property74 = dateMidnight73.dayOfYear();
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight73.minusDays(0);
        org.joda.time.Interval interval77 = dateMidnight76.toInterval();
        org.joda.time.Interval interval79 = interval77.withStartMillis((long) 0);
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.DurationField durationField81 = chronology80.days();
        org.joda.time.DateTimeField dateTimeField82 = chronology80.yearOfCentury();
        boolean boolean83 = localTime71.equals((java.lang.Object) chronology80);
        org.joda.time.MutableDateTime mutableDateTime84 = mutableDateTime23.toMutableDateTime(chronology80);
        org.joda.time.DateTimeField dateTimeField85 = chronology80.clockhourOfDay();
        mutablePeriod16.setPeriod((org.joda.time.ReadableDuration) duration21, chronology80);
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime((long) 292278993, chronology80);
        org.joda.time.DurationField durationField88 = chronology80.eras();
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime(chronology80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField81 and durationField88", Math.signum(durationField81.compareTo(durationField88)) == -Math.signum(durationField88.compareTo(durationField81)));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) 59);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Duration duration16 = duration14.plus((long) 'u');
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration16, (-1));
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime27 = dateTime21.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period30 = new org.joda.time.Period((long) 1, periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime7, (org.joda.time.ReadableInstant) dateTime27, periodType29);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property34 = dateMidnight33.dayOfYear();
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight33.minusDays(0);
        org.joda.time.Interval interval37 = dateMidnight36.toInterval();
        org.joda.time.Interval interval39 = interval37.withStartMillis((long) 0);
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 50, periodType29, chronology40);
        mutableDateTime4.add((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateMidnight33", (instant1.compareTo(dateMidnight33) == 0) == instant1.equals(dateMidnight33));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.plusYears(10);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.LocalDate localDate5 = property3.addToCopy((int) (byte) -1);
        org.joda.time.LocalDate localDate6 = property3.roundHalfCeilingCopy();
        java.lang.String str7 = property3.getName();
        org.joda.time.LocalDate localDate8 = property3.roundCeilingCopy();
        org.joda.time.Instant instant10 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant12 = instant10.minus((long) 59);
        org.joda.time.MutableDateTime mutableDateTime13 = instant10.toMutableDateTime();
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.LocalDate localDate15 = property3.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime13", (instant10.compareTo(mutableDateTime13) == 0) == instant10.equals(mutableDateTime13));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) 59);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTimeISO();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(periodType6);
        mutablePeriod7.addDays((int) '#');
        org.joda.time.DurationFieldType[] durationFieldTypeArray10 = mutablePeriod7.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.dayOfYear();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.minusDays(0);
        org.joda.time.Interval interval17 = dateMidnight16.toInterval();
        org.joda.time.Interval interval19 = interval17.withStartMillis((long) 0);
        org.joda.time.Interval interval20 = interval19.toInterval();
        boolean boolean21 = interval19.isAfterNow();
        mutablePeriod7.setPeriod((org.joda.time.ReadableInterval) interval19);
        org.joda.time.DateTime dateTime23 = interval19.getStart();
        org.joda.time.DateTime dateTime25 = dateTime23.withMillisOfDay(969);
        org.joda.time.DateTime dateTime27 = dateTime23.minusDays(100375);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfCentury(0);
        org.joda.time.DateTime dateTime30 = dateTime27.withLaterOffsetAtOverlap();
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) dateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.DateMidnight.Property property5 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight6 = property5.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight7 = property5.roundHalfEvenCopy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime20);
        boolean boolean24 = dateTime20.isAfterNow();
        org.joda.time.DateTime dateTime26 = dateTime20.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime27 = dateTime26.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean29 = localDateTime27.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        mutableDateTime31.setDayOfYear(1);
        int int34 = mutableDateTime31.getSecondOfMinute();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = dateTime37.toString(dateTimeFormatter38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.toDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (-1), chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (-1), chronology46);
        org.joda.time.Duration duration48 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (-1), chronology50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (-1), chronology53);
        org.joda.time.Duration duration55 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableDuration) duration55);
        mutableDateTime31.add((org.joda.time.ReadableDuration) duration55);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime27.withDurationAdded((org.joda.time.ReadableDuration) duration55, 23);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = period64.normalizedStandard(periodType65);
        org.joda.time.Period period68 = period66.minusDays(0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray69 = period68.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime27.plus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight7.withPeriodAdded((org.joda.time.ReadablePeriod) period68, 44);
        org.joda.time.Instant instant73 = dateMidnight7.toInstant();
        org.joda.time.LocalDate localDate74 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property75 = localDate74.yearOfCentury();
        org.joda.time.LocalDate localDate77 = localDate74.plusWeeks(100);
        org.joda.time.DateTime dateTime78 = localDate77.toDateTimeAtStartOfDay();
        int int79 = localDate77.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight80 = localDate77.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight7.withFields((org.joda.time.ReadablePartial) localDate77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight7 and instant73", (dateMidnight7.compareTo(instant73) == 0) == dateMidnight7.equals(instant73));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setSecondOfDay((int) (byte) 100);
        java.lang.String str4 = mutableDateTime1.toString();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.secondOfDay();
        mutableDateTime1.add(1645455609819L);
        java.lang.Object obj8 = null;
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        org.joda.time.LocalDate localDate12 = property10.addWrapFieldToCopy(0);
        int[] intArray13 = localDate12.getValues();
        org.joda.time.LocalDate localDate15 = localDate12.plusMonths(59);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType18);
        org.joda.time.LocalDate localDate20 = localDate15.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Chronology chronology21 = localDate15.getChronology();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(obj8, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime1, chronology21);
        org.joda.time.Chronology chronology24 = chronology21.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime23", (mutableDateTime1.compareTo(dateTime23) == 0) == mutableDateTime1.equals(dateTime23));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withCenturyOfEra(2022);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Duration duration15 = duration13.plus((long) 'u');
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration15, (-1));
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (-1), chronology22);
        org.joda.time.Duration duration24 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime20.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period29 = new org.joda.time.Period((long) 1, periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime6, (org.joda.time.ReadableInstant) dateTime26, periodType28);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.dayOfYear();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight32.minusDays(0);
        org.joda.time.Interval interval36 = dateMidnight35.toInterval();
        org.joda.time.Interval interval38 = interval36.withStartMillis((long) 0);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 50, periodType28, chronology39);
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay((long) 17, chronology39);
        org.joda.time.DurationField durationField42 = chronology39.days();
        long long45 = durationField42.add(10L, (int) (short) 0);
        int int47 = durationField42.getValue((long) 19);
        org.joda.time.DurationFieldType durationFieldType48 = durationField42.getType();
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight2.withFieldAdded(durationFieldType48, 2013);
        org.joda.time.MutableDateTime mutableDateTime51 = dateMidnight2.toMutableDateTime();
        java.lang.String str52 = mutableDateTime51.toString();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime51.era();
        org.joda.time.DateTimeField dateTimeField54 = property53.getField();
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property57 = dateMidnight56.dayOfYear();
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight56.minusDays(0);
        org.joda.time.Interval interval60 = dateMidnight59.toInterval();
        org.joda.time.Interval interval62 = interval60.withStartMillis((long) 0);
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.centuries();
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate(chronology63);
        org.joda.time.LocalDate localDate67 = localDate65.withWeekyear(49);
        org.joda.time.LocalDate.Property property68 = localDate65.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(dateTimeZone69);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (-1), chronology72);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (-1), chronology75);
        org.joda.time.Duration duration77 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime73, (org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Duration duration79 = duration77.plus((long) 'u');
        mutableDateTime70.add((org.joda.time.ReadableDuration) duration79, (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.DateTimeField dateTimeField84 = dateTimeFieldType82.getField(chronology83);
        mutableDateTime70.setRounding(dateTimeField84);
        int int87 = dateTimeField84.getMaximumValue(100L);
        long long89 = dateTimeField84.roundHalfCeiling((long) (short) -1);
        java.lang.String str90 = dateTimeField84.getName();
        int int91 = dateTimeField84.getMinimumValue();
        java.util.Locale locale93 = java.util.Locale.FRANCE;
        java.lang.String str94 = dateTimeField84.getAsShortText(32772, locale93);
        java.lang.String str95 = locale93.getDisplayVariant();
        java.util.Locale.setDefault(locale93);
        java.lang.String str97 = dateTimeField54.getAsShortText((org.joda.time.ReadablePartial) localDate65, locale93);
        java.lang.String str98 = dateTimeField54.toString();
        org.joda.time.DurationField durationField99 = dateTimeField54.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField99, durationField42, and durationField64", !(durationField99.compareTo(durationField42) == 0) || (Math.signum(durationField99.compareTo(durationField64)) == Math.signum(durationField42.compareTo(durationField64))));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        long long7 = duration6.getStandardMinutes();
        org.joda.time.Duration duration8 = duration6.toDuration();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfEra();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime16 = dateTime13.withCenturyOfEra(46);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = dateTime19.toString(dateTimeFormatter20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.toDateTime(dateTimeZone22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = period27.normalizedStandard(periodType28);
        org.joda.time.DateTime dateTime31 = dateTime19.withPeriodAdded((org.joda.time.ReadablePeriod) period27, 2022);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime19.toDateTime(dateTimeZone32);
        boolean boolean34 = dateTime13.equals((java.lang.Object) dateTime19);
        long long35 = dateTime19.getMillis();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 40, chronology37);
        int int39 = mutableDateTime38.getYearOfCentury();
        mutableDateTime38.setTime(21, (int) ' ', 20, 11);
        boolean boolean45 = dateTime19.isAfter((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField49 = property48.getField();
        org.joda.time.MutableDateTime mutableDateTime51 = property48.addWrapField(8);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay(dateTimeZone52);
        org.joda.time.TimeOfDay.Property property54 = timeOfDay53.secondOfMinute();
        java.lang.String str55 = property54.toString();
        org.joda.time.TimeOfDay timeOfDay57 = property54.addNoWrapToCopy(13);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTimeToday(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = mutableDateTime51.toDateTime(dateTimeZone59);
        mutableDateTime38.setZone(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime47 and dateTime61", (mutableDateTime47.compareTo(dateTime61) == 0) == mutableDateTime47.equals(dateTime61));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        java.lang.String str8 = period5.toString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (-1), chronology13);
        org.joda.time.Duration duration15 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withZone(dateTimeZone16);
        org.joda.time.Duration duration18 = period5.toDurationFrom((org.joda.time.ReadableInstant) dateTime17);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration18, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.yearOfEra();
        org.joda.time.Interval interval25 = duration18.toIntervalTo((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.weekyear();
        org.joda.time.Instant instant27 = mutableDateTime22.toInstant();
        mutableDateTime22.addSeconds(494);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant27", (mutableDateTime1.compareTo(instant27) == 0) == mutableDateTime1.equals(instant27));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (-1), chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = dateTime14.toString(dateTimeFormatter15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (-1), chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (-1), chronology30);
        org.joda.time.Duration duration32 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration32);
        org.joda.time.DateTime.Property property35 = dateTime18.year();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight11, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight11, dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        mutableDateTime40.setYear(1969);
        boolean boolean43 = dateMidnight11.isEqual((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (-1), chronology48);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Duration duration52 = duration50.plus((long) 'u');
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.standard();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight11, (org.joda.time.ReadableDuration) duration50, periodType53);
        mutablePeriod54.addSeconds(42);
        mutablePeriod54.addWeeks((-1));
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (-1), chronology60);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (-1), chronology63);
        org.joda.time.Duration duration65 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = dateTime64.withZone(dateTimeZone66);
        org.joda.time.DateTime.Property property68 = dateTime64.dayOfWeek();
        org.joda.time.DateTime dateTime69 = property68.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property70 = dateTime69.millisOfDay();
        org.joda.time.DateTime dateTime72 = property70.addToCopy((long) 100);
        org.joda.time.Duration duration73 = mutablePeriod54.toDurationFrom((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (-1), chronology75);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (-1), chronology78);
        org.joda.time.Duration duration80 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime76, (org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.Duration duration82 = duration80.plus((long) 'u');
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) (-1), chronology84);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean87 = dateTime85.isSupported(dateTimeFieldType86);
        org.joda.time.PeriodType periodType88 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period89 = duration80.toPeriodTo((org.joda.time.ReadableInstant) dateTime85, periodType88);
        boolean boolean90 = duration73.isShorterThan((org.joda.time.ReadableDuration) duration80);
        org.joda.time.Interval interval91 = new org.joda.time.Interval((org.joda.time.ReadableInstant) instant10, (org.joda.time.ReadableDuration) duration80);
        org.joda.time.DateTime dateTime92 = instant10.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime93 = instant10.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime92", (instant10.compareTo(dateTime92) == 0) == instant10.equals(dateTime92));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        java.lang.String str8 = period5.toString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (-1), chronology13);
        org.joda.time.Duration duration15 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withZone(dateTimeZone16);
        org.joda.time.Duration duration18 = period5.toDurationFrom((org.joda.time.ReadableInstant) dateTime17);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration18, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.yearOfEra();
        org.joda.time.Interval interval25 = duration18.toIntervalTo((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.weekyear();
        org.joda.time.Instant instant27 = mutableDateTime22.toInstant();
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate31 = localDate29.plusYears(10);
        org.joda.time.LocalDate.Property property32 = localDate29.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        mutableDateTime37.setZoneRetainFields(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        mutableDateTime35.setZoneRetainFields(dateTimeZone40);
        long long45 = dateTimeZone40.convertLocalToUTC((long) 17, true);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 41, dateTimeZone40);
        org.joda.time.DateTime dateTime47 = localDate29.toDateTimeAtMidnight(dateTimeZone40);
        boolean boolean49 = dateTimeZone40.isStandardOffset((long) 365);
        java.lang.String str50 = dateTimeZone40.toString();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((-33376L), dateTimeZone40);
        mutableDateTime22.setZone(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant27", (mutableDateTime1.compareTo(instant27) == 0) == mutableDateTime1.equals(instant27));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        mutableDateTime4.setZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        mutableDateTime2.setZoneRetainFields(dateTimeZone7);
        long long12 = dateTimeZone7.convertLocalToUTC((long) 17, true);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 11, dateTimeZone7);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        mutableDateTime16.setSecondOfDay((int) (byte) 100);
        int int19 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant23 = instant21.minus(6380816029878993L);
        boolean boolean24 = dateTime20.isBefore((org.joda.time.ReadableInstant) instant23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant21", (mutableDateTime8.compareTo(instant21) == 0) == mutableDateTime8.equals(instant21));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        mutableDateTime1.setZoneRetainFields(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        long long8 = dateTimeZone4.adjustOffset((long) (byte) 0, false);
        long long10 = dateTimeZone4.convertUTCToLocal(0L);
        java.lang.String str11 = dateTimeZone4.getID();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.dayOfYear();
        org.joda.time.DateMidnight dateMidnight16 = property15.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfYear();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight18.minusDays(0);
        org.joda.time.Interval interval22 = dateMidnight21.toInterval();
        org.joda.time.Interval interval24 = interval22.withStartMillis((long) 0);
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.days();
        long long31 = chronology25.getDateTimeMillis(41, 7, 3, 3);
        org.joda.time.DateTime dateTime32 = dateMidnight16.toDateTime(chronology25);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight16.minusWeeks((int) (short) 1);
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone37 = java.util.TimeZone.getTimeZone("31 Dec 1969 23:59:59 GMT");
        boolean boolean38 = timeZone35.hasSameRules(timeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.MutableDateTime mutableDateTime40 = dateMidnight34.toMutableDateTime(dateTimeZone39);
        org.joda.time.Interval interval41 = localDate12.toInterval(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight34 and mutableDateTime40", (dateMidnight34.compareTo(mutableDateTime40) == 0) == dateMidnight34.equals(mutableDateTime40));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(2022);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (-1), chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.withZone(dateTimeZone9);
        org.joda.time.DateTime.Property property11 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime12 = property11.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime15 = property13.addToCopy((long) 100);
        org.joda.time.DateTime dateTime16 = property13.roundFloorCopy();
        int int17 = dateTime16.getDayOfMonth();
        org.joda.time.Instant instant18 = dateTime16.toInstant();
        org.joda.time.MutableDateTime mutableDateTime19 = instant18.toMutableDateTime();
        org.joda.time.DateTime dateTime20 = instant18.toDateTimeISO();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (-1), chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfEra();
        boolean boolean25 = instant18.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period1, (org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant18", (dateTime12.compareTo(instant18) == 0) == dateTime12.equals(instant18));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfCentury();
        int int5 = localDate3.getDayOfWeek();
        int int6 = localDate3.getYear();
        int int7 = localDate3.getCenturyOfEra();
        org.joda.time.LocalDate.Property property8 = localDate3.yearOfEra();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDate3, 32, locale10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(periodType12);
        org.joda.time.MutablePeriod mutablePeriod14 = mutablePeriod13.toMutablePeriod();
        int int15 = mutablePeriod14.getMillis();
        org.joda.time.LocalDate localDate17 = localDate3.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod14, (int) '4');
        org.joda.time.LocalDate localDate19 = localDate3.withYearOfCentury(57);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        int int21 = localDate3.get(dateTimeFieldType20);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property23 = localDate22.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property23.addWrapFieldToCopy(0);
        int[] intArray26 = localDate25.getValues();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        org.joda.time.MutableDateTime mutableDateTime32 = property29.addWrapField(8);
        org.joda.time.DateTimeField dateTimeField33 = property29.getField();
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate36 = localDate34.plusYears(10);
        org.joda.time.LocalDate localDate38 = localDate34.withYearOfEra(54);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        int int43 = period42.getWeeks();
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = period47.normalizedStandard(periodType48);
        org.joda.time.Period period51 = period49.minusDays(0);
        org.joda.time.Period period52 = period42.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Period period54 = period52.minusYears(0);
        int[] intArray55 = period52.getValues();
        int int56 = dateTimeField33.getMinimumValue((org.joda.time.ReadablePartial) localDate34, intArray55);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        mutableDateTime58.setZoneRetainFields(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime58.getZone();
        org.joda.time.MutableDateTime mutableDateTime62 = org.joda.time.MutableDateTime.now(dateTimeZone61);
        boolean boolean64 = dateTimeZone61.isStandardOffset((long) 32769);
        org.joda.time.Interval interval65 = localDate34.toInterval(dateTimeZone61);
        org.joda.time.DateTime dateTime66 = localDate25.toDateTimeAtMidnight(dateTimeZone61);
        int int67 = localDate3.compareTo((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis(50116);
        org.joda.time.MutableDateTime mutableDateTime70 = org.joda.time.MutableDateTime.now(dateTimeZone69);
        java.lang.String str72 = dateTimeZone69.getNameKey((long) 4);
        org.joda.time.DateTime dateTime73 = localDate25.toDateTimeAtStartOfDay(dateTimeZone69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime62 and mutableDateTime70", (mutableDateTime62.compareTo(mutableDateTime70) == 0) == mutableDateTime62.equals(mutableDateTime70));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.Instant instant82 = instant78.plus((long) 3);
        org.joda.time.Instant instant84 = instant82.plus((long) 3);
        org.joda.time.Instant instant86 = instant84.minus(32769L);
        org.joda.time.MutableDateTime mutableDateTime87 = instant84.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime87.secondOfDay();
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime87.centuryOfEra();
        int int90 = property89.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant84 and mutableDateTime87", (instant84.compareTo(mutableDateTime87) == 0) == instant84.equals(mutableDateTime87));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withCenturyOfEra(2022);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.plusYears((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay5 = dateMidnight0.toYearMonthDay();
        org.joda.time.LocalDate localDate6 = dateMidnight0.toLocalDate();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.minusYears(53);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        mutableDateTime10.setDayOfYear(1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        mutableDateTime10.setZone(dateTimeZone13);
        mutableDateTime10.setMillis((long) (short) -1);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadableInstant) mutableDateTime10);
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = mutableDateTime10.toString("days", locale19);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale19);
        java.lang.String str22 = locale19.getCountry();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getDefault();
        java.lang.String str24 = timeZone23.getID();
        int int26 = timeZone23.getOffset((long) 999);
        timeZone23.setID("secondOfMinute");
        java.util.Locale.Category category29 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale30 = java.util.Locale.getDefault(category29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfEra();
        org.joda.time.DateTime dateTime36 = property34.addToCopy((int) ' ');
        java.util.Locale locale37 = java.util.Locale.ITALY;
        int int38 = property34.getMaximumShortTextLength(locale37);
        java.lang.String str39 = locale30.getDisplayLanguage(locale37);
        java.lang.String str40 = locale37.getDisplayName();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone23, locale37);
        java.util.Locale.Category category42 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale43 = java.util.Locale.getDefault(category42);
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category42, locale44);
        java.lang.String str47 = locale37.getDisplayLanguage(locale44);
        java.lang.String str48 = locale19.getDisplayVariant(locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar41", (calendar21.compareTo(calendar41) == 0) == calendar21.equals(calendar41));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime23 = instant21.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = instant21.toMutableDateTime();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate27 = localDate25.plusYears(10);
        boolean boolean29 = localDate25.equals((java.lang.Object) 0);
        org.joda.time.LocalDate.Property property30 = localDate25.weekOfWeekyear();
        org.joda.time.LocalDate localDate32 = localDate25.withCenturyOfEra(1978);
        org.joda.time.LocalDate localDate34 = localDate32.plusDays(57);
        org.joda.time.DateTime dateTime35 = localDate32.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology36 = localDate32.getChronology();
        mutableDateTime24.setChronology(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.Interval interval5 = dateMidnight4.toInterval();
        org.joda.time.MutableInterval mutableInterval6 = interval5.toMutableInterval();
        org.joda.time.Instant instant8 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant10 = instant8.minus((long) 59);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.dayOfYear();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.minusDays(0);
        org.joda.time.Interval interval17 = dateMidnight16.toInterval();
        org.joda.time.Interval interval19 = interval17.withStartMillis((long) 0);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.days();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfCentury();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 90, chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime25 = instant8.toMutableDateTime(chronology20);
        org.joda.time.Interval interval26 = interval5.withStart((org.joda.time.ReadableInstant) instant8);
        java.util.Locale locale27 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        boolean boolean29 = strSet28.isEmpty();
        java.util.Iterator<java.lang.String> strItor30 = strSet28.iterator();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (-1), chronology35);
        org.joda.time.Duration duration37 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.withZone(dateTimeZone38);
        org.joda.time.DateTime.Property property40 = dateTime36.dayOfWeek();
        org.joda.time.DateTime dateTime41 = property40.roundHalfFloorCopy();
        boolean boolean42 = strSet28.equals((java.lang.Object) property40);
        org.joda.time.DateTime dateTime43 = property40.withMaximumValue();
        org.joda.time.DateTime.Property property44 = dateTime43.weekyear();
        org.joda.time.LocalDate localDate45 = dateTime43.toLocalDate();
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime43.toMutableDateTime();
        org.joda.time.Interval interval47 = interval26.withEnd((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant8", (dateMidnight1.compareTo(instant8) == 0) == dateMidnight1.equals(instant8));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) 59);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withDurationAdded((long) 97, (-7194));
        org.joda.time.Instant instant9 = instant1.withMillis(100L);
        org.joda.time.Instant instant11 = instant9.minus(50116069L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (-1), chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        long long9 = duration8.getStandardMinutes();
        long long10 = duration8.getStandardSeconds();
        long long11 = duration8.getMillis();
        org.joda.time.Instant instant12 = instant0.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime18);
        long long20 = duration19.getStandardMinutes();
        org.joda.time.Duration duration21 = duration19.toDuration();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfEra();
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.Duration duration41 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableDuration) duration41);
        int int43 = duration19.compareTo((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (-1), chronology48);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (-1), chronology52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (-1), chronology55);
        org.joda.time.Duration duration57 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = dateTime56.toDateTime();
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration50, (org.joda.time.ReadableInstant) dateTime56);
        boolean boolean60 = dateTime56.isAfterNow();
        org.joda.time.DateTime dateTime62 = dateTime56.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime63 = dateTime62.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean65 = localDateTime63.isSupported(dateTimeFieldType64);
        org.joda.time.DateTime dateTime66 = localDateTime63.toDateTime();
        org.joda.time.Period period67 = duration19.toPeriodTo((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Instant instant68 = instant12.minus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateTime dateTime69 = instant12.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime70 = instant12.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime69", (instant12.compareTo(dateTime69) == 0) == instant12.equals(dateTime69));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfEra();
        org.joda.time.DateTime dateTime6 = property4.addToCopy((long) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.withYear(53);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfEra();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int) (byte) 1);
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime26 = dateTime13.withWeekyear(51);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property28 = localDate27.yearOfCentury();
        org.joda.time.LocalDate localDate30 = localDate27.plusWeeks(100);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfCentury();
        org.joda.time.LocalDate localDate34 = property32.addWrapFieldToCopy(0);
        int int35 = localDate30.compareTo((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.DateMidnight dateMidnight36 = localDate34.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.dayOfYear();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight38.minusDays(0);
        org.joda.time.Interval interval42 = dateMidnight41.toInterval();
        org.joda.time.Interval interval44 = interval42.withStartMillis((long) 0);
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.days();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight36.withChronology(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = org.joda.time.DateMidnight.now(chronology45);
        org.joda.time.DateTime dateTime49 = dateTime13.toDateTime(chronology45);
        java.lang.String str50 = dateTime13.toString();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        mutableDateTime55.setZoneRetainFields(dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime55.getZone();
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(dateTimeZone58);
        mutableDateTime53.setZoneRetainFields(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(dateTimeZone58);
        mutableDateTime51.setZoneRetainFields(dateTimeZone58);
        org.joda.time.DateTime dateTime63 = dateTime13.toDateTime(dateTimeZone58);
        int int65 = dateTimeZone58.getOffset((long) 48);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime8.toMutableDateTime(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((java.lang.Object) 1645455467855L, dateTimeZone58);
        org.joda.time.DateTime dateTime71 = dateTime69.withYearOfEra(780);
        org.joda.time.LocalDate localDate72 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate74 = localDate72.plusYears(10);
        org.joda.time.LocalDate.Property property75 = localDate74.year();
        org.joda.time.LocalDate localDate77 = property75.addToCopy((int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField78 = property75.getField();
        org.joda.time.DurationField durationField79 = property75.getLeapDurationField();
        java.lang.String str80 = property75.getAsText();
        org.joda.time.LocalDate localDate81 = property75.withMinimumValue();
        boolean boolean82 = dateTime69.equals((java.lang.Object) property75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField46 and durationField79", (durationField46.compareTo(durationField79) == 0) == durationField46.equals(durationField79));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.Instant instant82 = instant78.plus((long) 3);
        org.joda.time.Instant instant84 = instant82.plus((long) 3);
        org.joda.time.Instant instant86 = instant84.minus(32769L);
        org.joda.time.Chronology chronology87 = instant86.getChronology();
        org.joda.time.MutableDateTime mutableDateTime88 = instant86.toMutableDateTimeISO();
        org.joda.time.Instant instant90 = instant86.plus((long) 2031);
        org.joda.time.Chronology chronology91 = instant90.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant86 and mutableDateTime88", (instant86.compareTo(mutableDateTime88) == 0) == instant86.equals(mutableDateTime88));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime7 = dateTime5.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("PT0S");
        java.util.Calendar calendar12 = dateTime7.toCalendar(locale11);
        calendar12.setFirstDayOfWeek(10);
        int int15 = calendar12.getFirstDayOfWeek();
        int int16 = calendar12.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (-1), chronology21);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withZone(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime26.withEarlierOffsetAtOverlap();
        int int28 = dateTime26.getYearOfEra();
        java.util.GregorianCalendar gregorianCalendar29 = dateTime26.toGregorianCalendar();
        gregorianCalendar29.setTimeInMillis((long) 32772);
        java.util.Date date33 = new java.util.Date((long) (byte) -1);
        date33.setMinutes(20);
        int int36 = date33.getYear();
        gregorianCalendar29.setTime(date33);
        calendar12.setTime(date33);
        date33.setDate((-14));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and gregorianCalendar29", (calendar12.compareTo(gregorianCalendar29) == 0) == calendar12.equals(gregorianCalendar29));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setDayOfYear(1);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.set("32");
        org.joda.time.MutableDateTime mutableDateTime7 = property4.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime9 = property4.add(32);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) 31);
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant14 = instant11.minus((long) 32);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours(100L);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (-1), chronology21);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (-1), chronology25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (-1), chronology28);
        org.joda.time.Duration duration30 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType33);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = period34.normalizedStandard(periodType35);
        java.lang.String str37 = period34.toString();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (-1), chronology42);
        org.joda.time.Duration duration44 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.withZone(dateTimeZone45);
        org.joda.time.Duration duration47 = period34.toDurationFrom((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Duration duration48 = duration30.plus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(dateTimeZone49);
        int int51 = timeOfDay50.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay50.plusSeconds((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay53.minusSeconds(45);
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay55.plusHours((int) (byte) -1);
        boolean boolean58 = duration47.equals((java.lang.Object) timeOfDay57);
        boolean boolean59 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Duration duration60 = duration16.minus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Instant instant61 = instant11.minus((org.joda.time.ReadableDuration) duration60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime19", (instant14.compareTo(dateTime19) == 0) == instant14.equals(dateTime19));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = dateTime5.toString(dateTimeFormatter6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.Duration duration16 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (-1), chronology21);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration23);
        long long26 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology28 = null;
        boolean boolean29 = durationFieldType27.isSupported(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime9.withFieldAdded(durationFieldType27, 69);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = period35.normalizedStandard(periodType36);
        java.lang.String str38 = period35.toString();
        org.joda.time.Period period40 = period35.plusWeeks((int) 'a');
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(periodType41);
        mutablePeriod42.addDays((int) '#');
        org.joda.time.DurationFieldType[] durationFieldTypeArray45 = mutablePeriod42.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod46 = mutablePeriod42.toMutablePeriod();
        org.joda.time.Period period47 = period35.withFields((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.DateTime dateTime49 = dateTime31.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod42, 22);
        org.joda.time.Instant instant50 = dateTime31.toInstant();
        org.joda.time.MutableDateTime mutableDateTime51 = instant50.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(dateTimeZone54);
        org.joda.time.TimeOfDay.Property property56 = timeOfDay55.secondOfMinute();
        java.lang.String str57 = property56.toString();
        org.joda.time.TimeOfDay timeOfDay59 = property56.addNoWrapToCopy(13);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.DateTime dateTime62 = timeOfDay59.toDateTimeToday(dateTimeZone61);
        org.joda.time.Interval interval63 = new org.joda.time.Interval(62009410680000L, 164111270400029L, dateTimeZone61);
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime51.toMutableDateTime(dateTimeZone61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant50", (dateTime31.compareTo(instant50) == 0) == dateTime31.equals(instant50));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        int int3 = dateMidnight1.getEra();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight1.minus(86400000L);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.centuryOfEra();
        org.joda.time.Instant instant7 = dateMidnight5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (-1), chronology13);
        org.joda.time.Duration duration15 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime();
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) dateTime21);
        boolean boolean25 = dateTime21.isAfterNow();
        org.joda.time.DateTime dateTime27 = dateTime21.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime28 = dateTime27.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean30 = localDateTime28.isSupported(dateTimeFieldType29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        mutableDateTime32.setDayOfYear(1);
        int int35 = mutableDateTime32.getSecondOfMinute();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (-1), chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = dateTime38.toString(dateTimeFormatter39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime(dateTimeZone41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (-1), chronology44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (-1), chronology47);
        org.joda.time.Duration duration49 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableDuration) duration56);
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableDuration) duration56);
        mutableDateTime32.add((org.joda.time.ReadableDuration) duration56);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime28.withDurationAdded((org.joda.time.ReadableDuration) duration56, 23);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (-1), chronology63);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (-1), chronology66);
        org.joda.time.Duration duration68 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime67);
        long long69 = duration68.getStandardMinutes();
        org.joda.time.Duration duration70 = duration68.toDuration();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (-1), chronology72);
        org.joda.time.DateTime.Property property74 = dateTime73.yearOfEra();
        org.joda.time.DateTime dateTime75 = dateTime73.toDateTime();
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration68, (org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DurationFieldType durationFieldType77 = org.joda.time.DurationFieldType.years();
        boolean boolean78 = period76.isSupported(durationFieldType77);
        java.lang.String str79 = durationFieldType77.toString();
        boolean boolean80 = localDateTime61.isSupported(durationFieldType77);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime61.withWeekOfWeekyear((int) ' ');
        org.joda.time.LocalDateTime localDateTime84 = localDateTime61.minusMillis(19);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime84.minusSeconds(4);
        org.joda.time.LocalDateTime.Property property87 = localDateTime84.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime88 = property87.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime89 = property87.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime90 = property87.withMaximumValue();
        int int91 = localDateTime90.getWeekOfWeekyear();
        org.joda.time.PeriodType periodType93 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType94 = periodType93.withMonthsRemoved();
        org.joda.time.PeriodType periodType95 = periodType94.withMillisRemoved();
        org.joda.time.Period period96 = new org.joda.time.Period((long) 396, periodType95);
        org.joda.time.LocalDateTime localDateTime97 = localDateTime90.minus((org.joda.time.ReadablePeriod) period96);
        mutableDateTime8.add((org.joda.time.ReadablePeriod) period96, 54070091);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant7", (dateMidnight5.compareTo(instant7) == 0) == dateMidnight5.equals(instant7));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("52");
        org.joda.time.Instant instant2 = org.joda.time.Instant.now();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.dayOfYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.minusDays(0);
        org.joda.time.Interval interval9 = dateMidnight8.toInterval();
        org.joda.time.Interval interval11 = interval9.withStartMillis((long) 0);
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        long long18 = chronology12.getDateTimeMillis(41, 7, 3, 3);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(86400013L, chronology12);
        org.joda.time.DateTimeField dateTimeField20 = chronology12.monthOfYear();
        org.joda.time.DateTime dateTime21 = instant2.toDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime1.toMutableDateTime(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime21", (instant2.compareTo(dateTime21) == 0) == instant2.equals(dateTime21));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateMidnight dateMidnight5 = dateTime2.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.withWeekOfWeekyear((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        mutableDateTime12.setZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime10.setZoneRetainFields(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 292278993, dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight5.withZoneRetainFields(dateTimeZone15);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = dateTime24.toString(dateTimeFormatter25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.toDateTime(dateTimeZone27);
        org.joda.time.LocalTime localTime29 = dateTime28.toLocalTime();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean34 = dateTime32.isSupported(dateTimeFieldType33);
        org.joda.time.LocalTime.Property property35 = localTime29.property(dateTimeFieldType33);
        org.joda.time.LocalTime localTime36 = property35.roundHalfCeilingCopy();
        int int37 = localTime36.size();
        org.joda.time.Chronology chronology38 = localTime36.getChronology();
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((-3010381356739L), chronology38);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(50116);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        java.lang.String str44 = dateTimeZone41.getNameKey((long) 4);
        org.joda.time.Chronology chronology45 = chronology38.withZone(dateTimeZone41);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((java.lang.Object) dateMidnight5, chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and mutableDateTime42", (mutableDateTime16.compareTo(mutableDateTime42) == 0) == mutableDateTime16.equals(mutableDateTime42));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.DateMidnight.Property property5 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight6 = property5.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight7 = property5.roundHalfEvenCopy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime20);
        boolean boolean24 = dateTime20.isAfterNow();
        org.joda.time.DateTime dateTime26 = dateTime20.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime27 = dateTime26.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean29 = localDateTime27.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        mutableDateTime31.setDayOfYear(1);
        int int34 = mutableDateTime31.getSecondOfMinute();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = dateTime37.toString(dateTimeFormatter38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.toDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (-1), chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (-1), chronology46);
        org.joda.time.Duration duration48 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (-1), chronology50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (-1), chronology53);
        org.joda.time.Duration duration55 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableDuration) duration55);
        mutableDateTime31.add((org.joda.time.ReadableDuration) duration55);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime27.withDurationAdded((org.joda.time.ReadableDuration) duration55, 23);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = period64.normalizedStandard(periodType65);
        org.joda.time.Period period68 = period66.minusDays(0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray69 = period68.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime27.plus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight7.withPeriodAdded((org.joda.time.ReadablePeriod) period68, 44);
        org.joda.time.Instant instant73 = dateMidnight7.toInstant();
        org.joda.time.Instant instant76 = instant73.withDurationAdded((long) 17, (-54));
        org.joda.time.Instant instant78 = instant76.plus(32701591036800518L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant73", (dateMidnight1.compareTo(instant73) == 0) == dateMidnight1.equals(instant73));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(36L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone2);
        mutableDateTime3.setDayOfYear(1);
        int int6 = mutableDateTime3.getSecondOfMinute();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = dateTime9.toString(dateTimeFormatter10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (-1), chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (-1), chronology25);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration27);
        mutableDateTime3.add((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration31 = duration27.toDuration();
        org.joda.time.Instant instant32 = instant1.plus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.MutableDateTime mutableDateTime33 = instant1.toMutableDateTime();
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = dateTime37.toString(dateTimeFormatter38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.toDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (-1), chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (-1), chronology46);
        org.joda.time.Duration duration48 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (-1), chronology50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (-1), chronology53);
        org.joda.time.Duration duration55 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.DateTime.Property property58 = dateTime41.year();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight34, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime60 = dateTime41.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime62 = dateTime41.minusYears(3);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(periodType63);
        mutablePeriod64.addDays((int) '#');
        org.joda.time.DurationFieldType[] durationFieldTypeArray67 = mutablePeriod64.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod68 = mutablePeriod64.toMutablePeriod();
        mutablePeriod68.setYears(292278993);
        org.joda.time.Period period72 = org.joda.time.Period.millis(1969);
        org.joda.time.Period period74 = period72.minusMillis((int) (short) -1);
        org.joda.time.Period period76 = period72.plusMinutes(41);
        mutablePeriod68.setPeriod((org.joda.time.ReadablePeriod) period72);
        org.joda.time.Period period79 = period72.minusWeeks(20);
        org.joda.time.Period period81 = period79.plusHours(23);
        org.joda.time.DateTime dateTime83 = dateTime41.withPeriodAdded((org.joda.time.ReadablePeriod) period81, 34);
        int int84 = instant1.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime33", (instant1.compareTo(mutableDateTime33) == 0) == instant1.equals(mutableDateTime33));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime3.setZoneRetainFields(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        mutableDateTime1.setZoneRetainFields(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(dateTimeZone6);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = period17.normalizedStandard(periodType18);
        java.lang.String str20 = period17.toString();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        org.joda.time.Period period27 = period17.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Seconds seconds28 = period27.toStandardSeconds();
        org.joda.time.Period period29 = period27.toPeriod();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period31 = period27.normalizedStandard(periodType30);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property34 = dateMidnight33.dayOfYear();
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight33.minusDays(0);
        org.joda.time.Interval interval37 = dateMidnight36.toInterval();
        org.joda.time.Interval interval39 = interval37.withStartMillis((long) 0);
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.centuries();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.centuryOfEra();
        org.joda.time.DurationField durationField43 = chronology40.halfdays();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(chronology40);
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(chronology40);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(86400013L, 1335967560000L, periodType30, chronology40);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology40);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight11.withChronology(chronology40);
        org.joda.time.DateMidnight.Property property49 = dateMidnight48.monthOfYear();
        org.joda.time.Instant instant50 = dateMidnight48.toInstant();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight48.minusMonths(122);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight10 and instant50", (dateMidnight10.compareTo(instant50) == 0) == dateMidnight10.equals(instant50));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int3 = timeZone0.getOffset((long) 999);
        timeZone0.setID("secondOfMinute");
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.DateTime dateTime13 = property11.addToCopy((int) ' ');
        java.util.Locale locale14 = java.util.Locale.ITALY;
        int int15 = property11.getMaximumShortTextLength(locale14);
        java.lang.String str16 = locale7.getDisplayLanguage(locale14);
        java.lang.String str17 = locale14.getDisplayName();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone0, locale14);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category19, locale21);
        java.lang.String str24 = locale14.getDisplayLanguage(locale21);
        java.util.Set<java.lang.Character> charSet25 = locale21.getExtensionKeys();
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        org.joda.time.DateMidnight dateMidnight28 = org.joda.time.DateMidnight.now();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.withCenturyOfEra(2022);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight28.plusYears((int) (byte) 0);
        org.joda.time.YearMonthDay yearMonthDay33 = dateMidnight28.toYearMonthDay();
        org.joda.time.LocalDate localDate34 = dateMidnight28.toLocalDate();
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight28.minusYears(53);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone37);
        mutableDateTime38.setDayOfYear(1);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        mutableDateTime38.setZone(dateTimeZone41);
        mutableDateTime38.setMillis((long) (short) -1);
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight36, (org.joda.time.ReadableInstant) mutableDateTime38);
        java.util.Locale locale47 = java.util.Locale.ENGLISH;
        java.lang.String str48 = mutableDateTime38.toString("days", locale47);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(locale47);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType50.getField(chronology51);
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.lang.String str55 = locale54.getISO3Language();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (-1), chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.yearOfEra();
        org.joda.time.DateTime dateTime61 = property59.addToCopy((int) ' ');
        java.util.Locale locale62 = java.util.Locale.ITALY;
        int int63 = property59.getMaximumShortTextLength(locale62);
        java.util.Locale locale65 = java.util.Locale.forLanguageTag("PT0S");
        int int66 = property59.getMaximumShortTextLength(locale65);
        java.lang.String str67 = locale54.getDisplayVariant(locale65);
        java.lang.String str68 = dateTimeField52.getAsText((int) '4', locale65);
        java.util.Locale locale70 = java.util.Locale.GERMAN;
        java.lang.String str71 = locale70.getISO3Language();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) (-1), chronology73);
        org.joda.time.DateTime.Property property75 = dateTime74.yearOfEra();
        org.joda.time.DateTime dateTime77 = property75.addToCopy((int) ' ');
        java.util.Locale locale78 = java.util.Locale.ITALY;
        int int79 = property75.getMaximumShortTextLength(locale78);
        java.util.Locale locale81 = java.util.Locale.forLanguageTag("PT0S");
        int int82 = property75.getMaximumShortTextLength(locale81);
        java.lang.String str83 = locale70.getDisplayVariant(locale81);
        java.lang.String str84 = dateTimeField52.getAsText(1, locale70);
        java.lang.String str85 = locale70.getISO3Language();
        java.lang.String str86 = locale47.getDisplayLanguage(locale70);
        java.util.Locale.Builder builder87 = builder26.setLocale(locale70);
        java.lang.String str88 = locale21.getDisplayName(locale70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar49", (calendar18.compareTo(calendar49) == 0) == calendar18.equals(calendar49));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.Instant instant82 = instant78.plus((long) 3);
        org.joda.time.Instant instant84 = instant82.plus((long) 3);
        org.joda.time.Instant instant86 = instant84.minus(32769L);
        org.joda.time.Chronology chronology87 = instant86.getChronology();
        org.joda.time.MutableDateTime mutableDateTime88 = instant86.toMutableDateTimeISO();
        org.joda.time.Chronology chronology89 = instant86.getChronology();
        org.joda.time.DateTimeField dateTimeField90 = chronology89.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant86 and mutableDateTime88", (instant86.compareTo(mutableDateTime88) == 0) == instant86.equals(mutableDateTime88));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(dateTimeZone1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.plusSeconds((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusSeconds(45);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.plusHours((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfYear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.minusDays(0);
        org.joda.time.Interval interval15 = dateMidnight14.toInterval();
        org.joda.time.Interval interval17 = interval15.withStartMillis((long) 0);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay9.withChronologyRetainFields(chronology18);
        org.joda.time.DurationField durationField21 = chronology18.seconds();
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) 9, chronology18);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField19, and durationField21", !(durationField24.compareTo(durationField19) == 0) || (Math.signum(durationField24.compareTo(durationField21)) == Math.signum(durationField19.compareTo(durationField21))));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 36);
        org.joda.time.Duration duration3 = duration1.withMillis(0L);
        org.joda.time.Period period8 = new org.joda.time.Period(22, 0, 24, (int) (short) 1);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate11 = localDate9.plusYears(10);
        org.joda.time.LocalDate.Property property12 = localDate11.year();
        org.joda.time.LocalDate localDate14 = property12.addToCopy((int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        org.joda.time.DurationField durationField16 = property12.getLeapDurationField();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (-1), chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (-1), chronology21);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = dateTime19.plusMonths((int) (short) 100);
        int int26 = property12.compareTo((org.joda.time.ReadableInstant) dateTime25);
        int int27 = dateTime25.getDayOfWeek();
        org.joda.time.Duration duration28 = period8.toDurationTo((org.joda.time.ReadableInstant) dateTime25);
        java.lang.String str29 = duration28.toString();
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.standard();
        org.joda.time.Period period40 = new org.joda.time.Period(100L, periodType39);
        org.joda.time.Period period41 = new org.joda.time.Period((int) '4', (-292275054), (int) (short) 1, 1970, 45, 5, (int) (short) 0, (int) (byte) 0, periodType39);
        org.joda.time.Period period42 = duration28.toPeriod(periodType39);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (-1), chronology48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Duration duration53 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Duration duration55 = duration53.plus((long) 'u');
        mutableDateTime46.add((org.joda.time.ReadableDuration) duration55, (-1));
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (-1), chronology59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Duration duration64 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTime dateTime66 = dateTime60.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period69 = new org.joda.time.Period((long) 1, periodType68);
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime46, (org.joda.time.ReadableInstant) dateTime66, periodType68);
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property73 = dateMidnight72.dayOfYear();
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight72.minusDays(0);
        org.joda.time.Interval interval76 = dateMidnight75.toInterval();
        org.joda.time.Interval interval78 = interval76.withStartMillis((long) 0);
        org.joda.time.Chronology chronology79 = interval78.getChronology();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) 50, periodType68, chronology79);
        org.joda.time.YearMonthDay yearMonthDay81 = new org.joda.time.YearMonthDay((long) 17, chronology79);
        org.joda.time.DurationField durationField82 = chronology79.days();
        org.joda.time.Period period83 = duration1.toPeriod(periodType39, chronology79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField82", (durationField16.compareTo(durationField82) == 0) == durationField16.equals(durationField82));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.weekyear();
        org.joda.time.LocalDate.Property property3 = localDate0.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property5 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate0.withCenturyOfEra(48);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (-1), chronology13);
        org.joda.time.Duration duration15 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withZone(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime19 = property18.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfDay();
        org.joda.time.DateTime dateTime22 = property20.addToCopy((long) 100);
        org.joda.time.DateTime dateTime23 = property20.roundFloorCopy();
        int int24 = dateTime23.getDayOfMonth();
        org.joda.time.Instant instant25 = dateTime23.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTime();
        org.joda.time.DateTime dateTime27 = localDate7.toDateTime((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant25", (dateTime19.compareTo(instant25) == 0) == dateTime19.equals(instant25));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (-1), chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Duration duration10 = duration8.plus((long) 'u');
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration10, (-1));
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime21 = dateTime15.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period24 = new org.joda.time.Period((long) 1, periodType23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableInstant) dateTime21, periodType23);
        mutableDateTime1.setMillis((long) 1969);
        mutableDateTime1.addHours(2022);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (-1), chronology34);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration38 = duration36.plus((long) 'u');
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (-1), chronology40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean43 = dateTime41.isSupported(dateTimeFieldType42);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period45 = duration36.toPeriodTo((org.joda.time.ReadableInstant) dateTime41, periodType44);
        boolean boolean46 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime1.centuryOfEra();
        org.joda.time.Instant instant48 = org.joda.time.Instant.now();
        long long49 = instant48.getMillis();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        long long57 = duration56.getStandardMinutes();
        long long58 = duration56.getStandardSeconds();
        long long59 = duration56.getMillis();
        org.joda.time.Instant instant60 = instant48.plus((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Instant instant63 = instant48.withDurationAdded((long) 56, 28);
        org.joda.time.DateTime dateTime64 = instant48.toDateTime();
        boolean boolean65 = property47.equals((java.lang.Object) instant48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant48 and dateTime64", (instant48.compareTo(dateTime64) == 0) == instant48.equals(dateTime64));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(4, 9, 22, (int) '#');
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.LocalTime localTime7 = localTime5.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 59, chronology8);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (-1), chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Duration duration18 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.withZone(dateTimeZone19);
        org.joda.time.DateTime.Property property21 = dateTime17.dayOfWeek();
        org.joda.time.DateTime dateTime22 = property21.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property23 = dateTime22.millisOfDay();
        org.joda.time.DateTime dateTime25 = property23.addToCopy((long) 100);
        org.joda.time.DateTime dateTime26 = property23.roundFloorCopy();
        int int27 = dateTime26.getDayOfMonth();
        org.joda.time.Instant instant28 = dateTime26.toInstant();
        org.joda.time.MutableDateTime mutableDateTime29 = instant28.toMutableDateTime();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (-1), chronology34);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, readableInstant38, periodType39);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = period40.normalizedStandard(periodType41);
        java.lang.String str43 = period40.toString();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (-1), chronology48);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = dateTime49.withZone(dateTimeZone51);
        org.joda.time.Duration duration53 = period40.toDurationFrom((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Duration duration54 = duration36.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (-1), chronology58);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (-1), chronology61);
        org.joda.time.Duration duration63 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime59, (org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTime dateTime64 = dateTime62.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = dateTime64.withZone(dateTimeZone65);
        org.joda.time.DateTime.Property property67 = dateTime66.yearOfCentury();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration56, (org.joda.time.ReadableInstant) dateTime66);
        boolean boolean69 = duration54.isLongerThan((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Duration duration71 = duration56.withMillis(50L);
        org.joda.time.Instant instant72 = instant28.minus((org.joda.time.ReadableDuration) duration56);
        mutableDateTime11.add((org.joda.time.ReadableDuration) duration56, 4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant28", (dateTime22.compareTo(instant28) == 0) == dateTime22.equals(instant28));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime7 = dateTime5.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("PT0S");
        java.util.Calendar calendar12 = dateTime7.toCalendar(locale11);
        org.joda.time.DateTime dateTime14 = dateTime7.withSecondOfMinute(4);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.dayOfYear();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight16.minusDays(0);
        org.joda.time.Interval interval20 = dateMidnight19.toInterval();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(0L, (long) 12);
        long long24 = interval23.getStartMillis();
        boolean boolean25 = interval20.isAfter((org.joda.time.ReadableInterval) interval23);
        long long26 = interval23.getEndMillis();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.dayOfYear();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.minusDays(0);
        org.joda.time.Interval interval32 = dateMidnight31.toInterval();
        org.joda.time.Interval interval34 = interval32.withStartMillis((long) 0);
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.centuries();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.centuryOfEra();
        org.joda.time.Interval interval38 = interval23.withChronology(chronology35);
        org.joda.time.DurationField durationField39 = chronology35.days();
        org.joda.time.DateTime dateTime40 = dateTime14.toDateTime(chronology35);
        org.joda.time.DateTimeField dateTimeField41 = chronology35.era();
        org.joda.time.DurationField durationField42 = chronology35.halfdays();
        org.joda.time.DurationField durationField43 = chronology35.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField36, and durationField39", !(durationField43.compareTo(durationField36) == 0) || (Math.signum(durationField43.compareTo(durationField39)) == Math.signum(durationField36.compareTo(durationField39))));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        mutableDateTime24.setZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        mutableDateTime22.setZoneRetainFields(dateTimeZone27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean34 = dateTime32.isSupported(dateTimeFieldType33);
        org.joda.time.DateMidnight dateMidnight35 = dateTime32.toDateMidnight();
        boolean boolean36 = mutableDateTime22.isEqual((org.joda.time.ReadableInstant) dateTime32);
        boolean boolean37 = mutableDateTime20.isEqual((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime20.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.getMutableDateTime();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType42);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = period43.normalizedStandard(periodType44);
        java.lang.String str46 = period43.toString();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (-1), chronology48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Duration duration53 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = dateTime52.withZone(dateTimeZone54);
        org.joda.time.Duration duration56 = period43.toDurationFrom((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (-1), chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.yearOfEra();
        org.joda.time.DateTime dateTime62 = property60.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str64 = periodType63.getName();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration56, (org.joda.time.ReadableInstant) dateTime62, periodType63);
        org.joda.time.DateTime dateTime66 = dateTime62.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate67 = dateTime62.toLocalDate();
        org.joda.time.DateTime dateTime69 = dateTime62.withCenturyOfEra(53830);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime39, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Instant instant71 = mutableDateTime39.toInstant();
        mutableDateTime39.setYear(54007);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant71", (dateTime2.compareTo(instant71) == 0) == dateTime2.equals(instant71));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.minusDays(0);
        org.joda.time.DateMidnight.Property property5 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight6 = property5.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight7 = property5.roundHalfEvenCopy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime20);
        boolean boolean24 = dateTime20.isAfterNow();
        org.joda.time.DateTime dateTime26 = dateTime20.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime27 = dateTime26.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean29 = localDateTime27.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        mutableDateTime31.setDayOfYear(1);
        int int34 = mutableDateTime31.getSecondOfMinute();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = dateTime37.toString(dateTimeFormatter38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.toDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (-1), chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (-1), chronology46);
        org.joda.time.Duration duration48 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (-1), chronology50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (-1), chronology53);
        org.joda.time.Duration duration55 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableDuration) duration55);
        mutableDateTime31.add((org.joda.time.ReadableDuration) duration55);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime27.withDurationAdded((org.joda.time.ReadableDuration) duration55, 23);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = period64.normalizedStandard(periodType65);
        org.joda.time.Period period68 = period66.minusDays(0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray69 = period68.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime27.plus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight7.withPeriodAdded((org.joda.time.ReadablePeriod) period68, 44);
        org.joda.time.Instant instant73 = dateMidnight7.toInstant();
        org.joda.time.MutableDateTime mutableDateTime74 = instant73.toMutableDateTimeISO();
        mutableDateTime74.addWeeks((-631));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant73", (dateMidnight1.compareTo(instant73) == 0) == dateMidnight1.equals(instant73));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (-1), chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        long long9 = duration8.getStandardMinutes();
        long long10 = duration8.getStandardSeconds();
        long long11 = duration8.getMillis();
        org.joda.time.Instant instant12 = instant0.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate17 = property15.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate19 = localDate17.withDayOfYear(8);
        org.joda.time.LocalDate localDate21 = localDate17.plusDays((int) 'x');
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime29 = dateTime27.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withZone(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime31.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime34 = dateTime32.minusMonths(4);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) dateTime34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        mutableDateTime40.setZoneRetainFields(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone43);
        mutableDateTime38.setZoneRetainFields(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        mutableDateTime36.setZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTime dateTime48 = localDate35.toDateTimeAtMidnight(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.Interval interval50 = localDate17.toInterval(dateTimeZone43);
        mutableDateTime13.setZoneRetainFields(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime36", (instant0.compareTo(mutableDateTime36) == 0) == instant0.equals(mutableDateTime36));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.addDays((int) '#');
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = mutablePeriod1.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod1.toMutablePeriod();
        mutablePeriod5.setYears(292278993);
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = dateTime13.toString(dateTimeFormatter14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1), chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (-1), chronology22);
        org.joda.time.Duration duration24 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Duration duration31 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableDuration) duration31);
        org.joda.time.DateTime.Property property34 = dateTime17.year();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight10, (org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateMidnight.Property property36 = dateMidnight10.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight38 = property36.addWrapFieldToCopy((int) 'u');
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight40 = property39.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (-1), chronology42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime48 = dateTime46.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.withZone(dateTimeZone49);
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("PT0S");
        java.util.Calendar calendar53 = dateTime48.toCalendar(locale52);
        int int54 = calendar53.getFirstDayOfWeek();
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(periodType55);
        boolean boolean57 = calendar53.after((java.lang.Object) mutablePeriod56);
        int int59 = calendar53.getGreatestMinimum(0);
        calendar53.set(32, 0, 54);
        int int65 = calendar53.getMaximum(9);
        org.joda.time.LocalTime localTime66 = org.joda.time.LocalTime.fromCalendarFields(calendar53);
        org.joda.time.LocalTime localTime68 = localTime66.withMillisOfSecond(24);
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property71 = dateMidnight70.dayOfYear();
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight70.minusDays(0);
        org.joda.time.Interval interval74 = dateMidnight73.toInterval();
        org.joda.time.Interval interval76 = interval74.withStartMillis((long) 0);
        org.joda.time.Chronology chronology77 = interval76.getChronology();
        org.joda.time.DurationField durationField78 = chronology77.days();
        org.joda.time.DateTimeField dateTimeField79 = chronology77.yearOfCentury();
        boolean boolean80 = localTime68.equals((java.lang.Object) chronology77);
        org.joda.time.DurationField durationField81 = chronology77.days();
        org.joda.time.DateMidnight dateMidnight82 = dateMidnight40.withChronology(chronology77);
        org.joda.time.DurationField durationField83 = chronology77.days();
        org.joda.time.DurationField durationField84 = chronology77.minutes();
        org.joda.time.Chronology chronology85 = chronology77.withUTC();
        mutablePeriod5.setPeriod((-58975516800000L), (-61186060800001L), chronology85);
        org.joda.time.DurationField durationField87 = chronology85.days();
        org.joda.time.DurationField durationField88 = chronology85.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField78 and durationField87", (durationField78.compareTo(durationField87) == 0) == durationField78.equals(durationField87));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.Instant instant82 = instant78.plus((long) 3);
        org.joda.time.Instant instant84 = instant82.plus((long) 3);
        org.joda.time.Instant instant86 = instant84.minus(32769L);
        org.joda.time.Chronology chronology87 = instant86.getChronology();
        org.joda.time.MutableDateTime mutableDateTime88 = instant86.toMutableDateTimeISO();
        org.joda.time.Instant instant90 = instant86.plus((long) 2031);
        org.joda.time.Instant instant91 = instant86.toInstant();
        org.joda.time.Instant instant92 = instant86.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime88 and instant92", (mutableDateTime88.compareTo(instant92) == 0) == mutableDateTime88.equals(instant92));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (-1), chronology4);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime12);
        boolean boolean16 = dateTime12.isAfterNow();
        org.joda.time.DateTime dateTime18 = dateTime12.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime();
        org.joda.time.DateMidnight dateMidnight21 = dateTime20.toDateMidnight();
        org.joda.time.Instant instant22 = dateTime20.toInstant();
        int int23 = dateTime20.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant22", (dateTime20.compareTo(instant22) == 0) == dateTime20.equals(instant22));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime23 = instant21.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = instant21.toMutableDateTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Duration duration31 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime30);
        long long32 = duration31.getStandardHours();
        org.joda.time.Instant instant34 = instant21.withDurationAdded((org.joda.time.ReadableDuration) duration31, 38);
        org.joda.time.Instant instant37 = instant21.withDurationAdded(1645401599317L, 56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (-1), chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        long long9 = duration8.getStandardMinutes();
        long long10 = duration8.getStandardSeconds();
        long long11 = duration8.getMillis();
        org.joda.time.Instant instant12 = instant0.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (-1), chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime18);
        long long20 = duration19.getStandardMinutes();
        org.joda.time.Duration duration21 = duration19.toDuration();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfEra();
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.Duration duration41 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableDuration) duration41);
        int int43 = duration19.compareTo((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (-1), chronology48);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (-1), chronology52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (-1), chronology55);
        org.joda.time.Duration duration57 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = dateTime56.toDateTime();
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration50, (org.joda.time.ReadableInstant) dateTime56);
        boolean boolean60 = dateTime56.isAfterNow();
        org.joda.time.DateTime dateTime62 = dateTime56.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime63 = dateTime62.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean65 = localDateTime63.isSupported(dateTimeFieldType64);
        org.joda.time.DateTime dateTime66 = localDateTime63.toDateTime();
        org.joda.time.Period period67 = duration19.toPeriodTo((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Instant instant68 = instant12.minus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.MutableDateTime mutableDateTime69 = instant68.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime70 = instant68.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant68 and mutableDateTime69", (instant68.compareTo(mutableDateTime69) == 0) == instant68.equals(mutableDateTime69));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (-1), chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = dateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int6 = dateTime2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime8.setZoneRetainFields(dateTimeZone13);
        long long18 = dateTimeZone13.adjustOffset((long) 49, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant21 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime23 = instant21.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = instant21.toMutableDateTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Duration duration31 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime30);
        long long32 = duration31.getStandardHours();
        org.joda.time.Instant instant34 = instant21.withDurationAdded((org.joda.time.ReadableDuration) duration31, 38);
        org.joda.time.Instant instant37 = instant21.withDurationAdded((long) 100806, 78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMinutes((int) ' ');
        int int4 = timeOfDay3.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay3.plusMinutes(20);
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.plusSeconds(69);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.plusMinutes(33);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(periodType11);
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod12.toMutablePeriod();
        int int14 = mutablePeriod13.getMillis();
        org.joda.time.PeriodType periodType15 = mutablePeriod13.getPeriodType();
        mutablePeriod13.setPeriod((long) 1969, (long) 46);
        mutablePeriod13.addHours(11);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay10.minus((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.minusSeconds(361);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        long long25 = instant24.getMillis();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (-1), chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (-1), chronology30);
        org.joda.time.Duration duration32 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime31);
        long long33 = duration32.getStandardMinutes();
        long long34 = duration32.getStandardSeconds();
        long long35 = duration32.getMillis();
        org.joda.time.Instant instant36 = instant24.plus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Instant instant39 = instant24.withDurationAdded((long) 56, 28);
        org.joda.time.DateTime dateTime40 = instant24.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        mutableDateTime44.setZoneRetainFields(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(dateTimeZone47);
        mutableDateTime42.setZoneRetainFields(dateTimeZone47);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean54 = dateTime52.isSupported(dateTimeFieldType53);
        org.joda.time.DateMidnight dateMidnight55 = dateTime52.toDateMidnight();
        boolean boolean56 = mutableDateTime42.isEqual((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        mutableDateTime60.setZoneRetainFields(dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime60.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(dateTimeZone63);
        mutableDateTime58.setZoneRetainFields(dateTimeZone63);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone63);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(dateTimeZone63);
        org.joda.time.DateTime dateTime68 = dateTime52.toDateTime(dateTimeZone63);
        org.joda.time.MutableDateTime mutableDateTime69 = dateTime40.toMutableDateTime(dateTimeZone63);
        org.joda.time.DateTime dateTime70 = timeOfDay21.toDateTimeToday(dateTimeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime40", (instant24.compareTo(dateTime40) == 0) == instant24.equals(dateTime40));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime3.setZoneRetainFields(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        mutableDateTime1.setZoneRetainFields(dateTimeZone6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), chronology10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean13 = dateTime11.isSupported(dateTimeFieldType12);
        org.joda.time.DateMidnight dateMidnight14 = dateTime11.toDateMidnight();
        boolean boolean15 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) dateTime11);
        int int16 = mutableDateTime1.getMinuteOfDay();
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.Period period19 = org.joda.time.Period.minutes(292278993);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(518400000L, chronology23);
        org.joda.time.Period period25 = duration21.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight24);
        boolean boolean26 = period19.equals((java.lang.Object) period25);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period19);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) ' ');
        java.util.TimeZone timeZone34 = java.util.TimeZone.getTimeZone("English");
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType35.getField(chronology36);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.lang.String str40 = locale39.getISO3Language();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (-1), chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.yearOfEra();
        org.joda.time.DateTime dateTime46 = property44.addToCopy((int) ' ');
        java.util.Locale locale47 = java.util.Locale.ITALY;
        int int48 = property44.getMaximumShortTextLength(locale47);
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("PT0S");
        int int51 = property44.getMaximumShortTextLength(locale50);
        java.lang.String str52 = locale39.getDisplayVariant(locale50);
        java.lang.String str53 = dateTimeField37.getAsText((int) '4', locale50);
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.lang.String str56 = locale55.getISO3Language();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (-1), chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.yearOfEra();
        org.joda.time.DateTime dateTime62 = property60.addToCopy((int) ' ');
        java.util.Locale locale63 = java.util.Locale.ITALY;
        int int64 = property60.getMaximumShortTextLength(locale63);
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("PT0S");
        int int67 = property60.getMaximumShortTextLength(locale66);
        java.lang.String str68 = locale55.getDisplayVariant(locale66);
        java.lang.String str69 = dateTimeField37.getAsText(1, locale55);
        java.lang.String str70 = locale55.getISO3Language();
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(timeZone34, locale55);
        java.lang.String str72 = dateTimeZone31.getName((long) 2922750, locale55);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(dateTimeZone31);
        mutableDateTime28.setZoneRetainFields(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and mutableDateTime73", (mutableDateTime7.compareTo(mutableDateTime73) == 0) == mutableDateTime7.equals(mutableDateTime73));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (-1), chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), chronology5);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime6);
        long long8 = duration7.getStandardMinutes();
        org.joda.time.Instant instant10 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (-1), chronology15);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        java.lang.String str27 = period24.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (-1), chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (-1), chronology32);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.Duration duration37 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-1), chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) ' ');
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearWeekDay();
        java.lang.String str45 = periodType44.getName();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime43, periodType44);
        org.joda.time.DateTime dateTime47 = dateTime18.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (-1), chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (-1), chronology54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration58 = duration56.plus((long) 'u');
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration58, (-1));
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (-1), chronology65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1, periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime69, periodType71);
        mutableDateTime49.setMillis((long) 1969);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.Seconds seconds77 = duration37.toStandardSeconds();
        org.joda.time.Instant instant78 = instant10.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant80 = instant78.plus(86400013L);
        org.joda.time.Instant instant82 = instant78.plus((long) 3);
        org.joda.time.Instant instant84 = instant82.plus((long) 3);
        org.joda.time.Instant instant86 = instant84.minus(32769L);
        org.joda.time.MutableDateTime mutableDateTime87 = instant84.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime88 = instant84.toMutableDateTime();
        mutableDateTime88.addWeeks((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant84 and mutableDateTime87", (instant84.compareTo(mutableDateTime87) == 0) == instant84.equals(mutableDateTime87));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.addWrapField(8);
        org.joda.time.DateTimeField dateTimeField6 = property2.getField();
        org.joda.time.MutableDateTime mutableDateTime8 = property2.addWrapField(100);
        mutableDateTime8.setTime((long) (byte) 100);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.era();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.dayOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = dateTime17.toString(dateTimeFormatter18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.toDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (-1), chronology30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (-1), chronology33);
        org.joda.time.Duration duration35 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration35);
        long long38 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology40 = null;
        boolean boolean41 = durationFieldType39.isSupported(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime21.withFieldAdded(durationFieldType39, 69);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = period47.normalizedStandard(periodType48);
        java.lang.String str50 = period47.toString();
        org.joda.time.Period period52 = period47.plusWeeks((int) 'a');
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(periodType53);
        mutablePeriod54.addDays((int) '#');
        org.joda.time.DurationFieldType[] durationFieldTypeArray57 = mutablePeriod54.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod58 = mutablePeriod54.toMutablePeriod();
        org.joda.time.Period period59 = period47.withFields((org.joda.time.ReadablePeriod) mutablePeriod54);
        org.joda.time.DateTime dateTime61 = dateTime43.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod54, 22);
        org.joda.time.Instant instant62 = dateTime43.toInstant();
        org.joda.time.DateTime dateTime64 = dateTime43.minus(1642377600000L);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime43.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property67 = dateTime43.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant62 and mutableDateTime66", (instant62.compareTo(mutableDateTime66) == 0) == instant62.equals(mutableDateTime66));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        mutableDateTime4.setZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        mutableDateTime2.setZoneRetainFields(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay10.plusDays(17);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay10.plusDays(53809);
        int int15 = yearMonthDay10.size();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property17 = localDate16.yearOfCentury();
        org.joda.time.LocalDate localDate19 = localDate16.plusWeeks(100);
        org.joda.time.LocalDate localDate21 = localDate16.minusMonths(31);
        org.joda.time.LocalDate.Property property22 = localDate16.weekOfWeekyear();
        java.lang.String str23 = property22.getAsShortText();
        org.joda.time.LocalDate localDate24 = property22.withMaximumValue();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property28 = localDate27.yearOfCentury();
        org.joda.time.LocalDate localDate30 = localDate27.plusWeeks(100);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfCentury();
        org.joda.time.LocalDate localDate34 = property32.addWrapFieldToCopy(0);
        int int35 = localDate30.compareTo((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.DateMidnight dateMidnight36 = localDate34.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.dayOfYear();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight38.minusDays(0);
        org.joda.time.Interval interval42 = dateMidnight41.toInterval();
        org.joda.time.Interval interval44 = interval42.withStartMillis((long) 0);
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.days();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight36.withChronology(chronology45);
        org.joda.time.DateTimeField dateTimeField48 = chronology45.halfdayOfDay();
        long long52 = chronology45.add((long) 51, 10L, 46);
        org.joda.time.DateTimeField dateTimeField53 = chronology45.era();
        org.joda.time.DurationField durationField54 = chronology45.halfdays();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (short) -1, periodType26, chronology45);
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay10, (org.joda.time.ReadablePartial) localDate24, periodType26);
        org.joda.time.format.DateTimePrinter dateTimePrinter57 = null;
        org.joda.time.format.DateTimeParser dateTimeParser58 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter57, dateTimeParser58);
        boolean boolean60 = dateTimeFormatter59.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter59.withPivotYear((java.lang.Integer) 1439);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter62.withOffsetParsed();
        org.joda.time.LocalDate localDate64 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate66 = localDate64.plusYears(10);
        org.joda.time.LocalDate.Property property67 = localDate64.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        mutableDateTime72.setZoneRetainFields(dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone75 = mutableDateTime72.getZone();
        org.joda.time.MutableDateTime mutableDateTime76 = org.joda.time.MutableDateTime.now(dateTimeZone75);
        mutableDateTime70.setZoneRetainFields(dateTimeZone75);
        long long80 = dateTimeZone75.convertLocalToUTC((long) 17, true);
        org.joda.time.LocalDate localDate81 = new org.joda.time.LocalDate((long) 41, dateTimeZone75);
        org.joda.time.DateTime dateTime82 = localDate64.toDateTimeAtMidnight(dateTimeZone75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter63.withZone(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime(dateTimeZone84);
        org.joda.time.MutableDateTime.Property property86 = mutableDateTime85.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime88 = property86.set(23);
        org.joda.time.Chronology chronology89 = mutableDateTime88.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter90 = dateTimeFormatter83.withChronology(chronology89);
        org.joda.time.Period period91 = new org.joda.time.Period(1439L, periodType26, chronology89);
        org.joda.time.DurationField durationField92 = chronology89.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField92, durationField46, and durationField54", !(durationField92.compareTo(durationField46) == 0) || (Math.signum(durationField92.compareTo(durationField54)) == Math.signum(durationField46.compareTo(durationField54))));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 41);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        mutableDateTime1.setZoneRetainFields(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.set(22);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.era();
        java.lang.String str9 = mutableDateTime7.toString();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime7.copy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1), chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (-1), chronology20);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Duration duration24 = duration22.plus((long) 'u');
        mutableDateTime15.add((org.joda.time.ReadableDuration) duration24, (-1));
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (-1), chronology28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (-1), chronology31);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime35 = dateTime29.plusMonths((int) (short) 100);
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period38 = new org.joda.time.Period((long) 1, periodType37);
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime15, (org.joda.time.ReadableInstant) dateTime35, periodType37);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.dayOfYear();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight41.minusDays(0);
        org.joda.time.Interval interval45 = dateMidnight44.toInterval();
        org.joda.time.Interval interval47 = interval45.withStartMillis((long) 0);
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 50, periodType37, chronology48);
        org.joda.time.Period period50 = new org.joda.time.Period((long) 2022, (long) 45, chronology48);
        org.joda.time.DateTimeField dateTimeField51 = chronology48.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology48.seconds();
        org.joda.time.DateTimeField dateTimeField53 = chronology48.year();
        org.joda.time.Interval interval56 = new org.joda.time.Interval(0L, (long) 12);
        org.joda.time.Period period57 = interval56.toPeriod();
        int int58 = period57.getYears();
        org.joda.time.Days days59 = period57.toStandardDays();
        int[] intArray62 = chronology48.get((org.joda.time.ReadablePeriod) days59, 2272147200000L, 1640995200000L);
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime10.toMutableDateTime(chronology48);
        org.joda.time.DurationField durationField64 = chronology48.eras();
        org.joda.time.DateTimeField dateTimeField65 = chronology48.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField52 and durationField64", Math.signum(durationField52.compareTo(durationField64)) == -Math.signum(durationField64.compareTo(durationField52)));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.addWrapField(8);
        org.joda.time.DateTimeField dateTimeField6 = property2.getField();
        org.joda.time.MutableDateTime mutableDateTime8 = property2.addWrapField(100);
        mutableDateTime8.setTime((long) (byte) 100);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.era();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(0L);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.dayOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = dateTime17.toString(dateTimeFormatter18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.toDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (-1), chronology26);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (-1), chronology30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (-1), chronology33);
        org.joda.time.Duration duration35 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration35);
        long long38 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology40 = null;
        boolean boolean41 = durationFieldType39.isSupported(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime21.withFieldAdded(durationFieldType39, 69);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = period47.normalizedStandard(periodType48);
        java.lang.String str50 = period47.toString();
        org.joda.time.Period period52 = period47.plusWeeks((int) 'a');
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(periodType53);
        mutablePeriod54.addDays((int) '#');
        org.joda.time.DurationFieldType[] durationFieldTypeArray57 = mutablePeriod54.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod58 = mutablePeriod54.toMutablePeriod();
        org.joda.time.Period period59 = period47.withFields((org.joda.time.ReadablePeriod) mutablePeriod54);
        org.joda.time.DateTime dateTime61 = dateTime43.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod54, 22);
        org.joda.time.Instant instant62 = dateTime43.toInstant();
        org.joda.time.DateTime dateTime64 = dateTime43.minus(1642377600000L);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) dateTime43);
        mutableDateTime8.setMillisOfDay(2078);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant62", (dateTime43.compareTo(instant62) == 0) == dateTime43.equals(instant62));
    }
}

