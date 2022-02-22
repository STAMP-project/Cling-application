import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        java.lang.String str11 = property10.toString();
        int int12 = property10.getMaximumValue();
        int int13 = property10.getMaximumValueOverall();
        org.joda.time.DateTime dateTime14 = property10.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property10.getFieldType();
        org.joda.time.Instant instant16 = new org.joda.time.Instant();
        boolean boolean18 = instant16.isEqual(10L);
        int int19 = property10.compareTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.DateTime dateTime20 = instant16.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime21 = instant16.toMutableDateTime();
        boolean boolean22 = languageRange1.equals((java.lang.Object) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant16", (dateTime9.compareTo(instant16) == 0) == dateTime9.equals(instant16));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.Duration duration3 = duration2.toDuration();
        org.joda.time.ReadableDuration readableDuration4 = null;
        boolean boolean5 = duration3.isLongerThan(readableDuration4);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Days days7 = org.joda.time.Days.daysIn(readableInterval6);
        org.joda.time.Duration duration8 = days7.toStandardDuration();
        org.joda.time.Duration duration9 = duration8.toDuration();
        org.joda.time.ReadableDuration readableDuration10 = null;
        boolean boolean11 = duration9.isLongerThan(readableDuration10);
        boolean boolean12 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMillis((int) ' ');
        int int17 = dateTime14.getEra();
        org.joda.time.DateTime dateTime19 = dateTime14.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime21 = dateTime14.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval22 = duration3.toIntervalTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime14.withChronology(chronology23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property26 = dateTime14.property(dateTimeFieldType25);
        org.joda.time.DateTime dateTime28 = dateTime14.minus((long) 1727999);
        long long29 = dateTime14.getMillis();
        org.joda.time.DateTime dateTime31 = dateTime14.withWeekyear(0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusYears((int) '4');
        org.joda.time.DateTime.Property property36 = dateTime33.dayOfWeek();
        org.joda.time.DateTime dateTime38 = dateTime33.plusSeconds(553);
        org.joda.time.Instant instant39 = dateTime33.toInstant();
        int int40 = dateTime31.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant39", (dateTime14.compareTo(instant39) == 0) == dateTime14.equals(instant39));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Days days6 = org.joda.time.Days.daysIn(readableInterval5);
        org.joda.time.Duration duration7 = days6.toStandardDuration();
        org.joda.time.Duration duration8 = duration7.toDuration();
        org.joda.time.ReadableDuration readableDuration9 = null;
        boolean boolean10 = duration8.isLongerThan(readableDuration9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Days days12 = org.joda.time.Days.daysIn(readableInterval11);
        org.joda.time.Duration duration13 = days12.toStandardDuration();
        org.joda.time.Duration duration14 = duration13.toDuration();
        org.joda.time.ReadableDuration readableDuration15 = null;
        boolean boolean16 = duration14.isLongerThan(readableDuration15);
        boolean boolean17 = duration8.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis((int) ' ');
        int int22 = dateTime19.getEra();
        org.joda.time.DateTime dateTime24 = dateTime19.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime26 = dateTime19.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval27 = duration8.toIntervalTo((org.joda.time.ReadableInstant) dateTime19);
        mutablePeriod4.add((org.joda.time.ReadableInterval) interval27);
        mutablePeriod4.addYears((int) ' ');
        mutablePeriod4.setSeconds((int) (byte) 100);
        mutablePeriod4.setDays((int) (short) 100);
        int int35 = mutablePeriod4.getMillis();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusMillis((int) ' ');
        int int40 = dateTime37.getEra();
        org.joda.time.DateTime dateTime42 = dateTime37.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime44 = dateTime37.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime45 = dateTime44.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime47 = dateTime45.plusMonths((int) 'u');
        org.joda.time.Duration duration48 = mutablePeriod4.toDurationTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Instant instant50 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration48, 59);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.plusYears((int) '4');
        org.joda.time.DateTime.Property property55 = dateTime52.dayOfWeek();
        org.joda.time.DateTime dateTime58 = dateTime52.withDurationAdded((long) 100, 0);
        org.joda.time.ReadableInterval readableInterval59 = null;
        org.joda.time.Days days60 = org.joda.time.Days.daysIn(readableInterval59);
        org.joda.time.Duration duration61 = days60.toStandardDuration();
        org.joda.time.Duration duration62 = duration61.toDuration();
        org.joda.time.ReadableDuration readableDuration63 = null;
        boolean boolean64 = duration62.isLongerThan(readableDuration63);
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.Days days66 = org.joda.time.Days.daysIn(readableInterval65);
        org.joda.time.Duration duration67 = days66.toStandardDuration();
        org.joda.time.Duration duration68 = duration67.toDuration();
        org.joda.time.ReadableDuration readableDuration69 = null;
        boolean boolean70 = duration68.isLongerThan(readableDuration69);
        boolean boolean71 = duration62.isShorterThan((org.joda.time.ReadableDuration) duration68);
        org.joda.time.Period period72 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableDuration) duration68);
        int int73 = duration48.compareTo((org.joda.time.ReadableDuration) duration68);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(dateTimeZone74);
        org.joda.time.DateTime dateTime77 = dateTime75.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime79 = org.joda.time.DateTime.now(dateTimeZone78);
        org.joda.time.DateTime dateTime81 = dateTime79.minusMillis((int) ' ');
        int int82 = dateTime79.getEra();
        int int83 = dateTime77.compareTo((org.joda.time.ReadableInstant) dateTime79);
        int int84 = dateTime77.getEra();
        org.joda.time.PeriodType periodType85 = null;
        org.joda.time.Period period86 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration48, (org.joda.time.ReadableInstant) dateTime77, periodType85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime19", (instant0.compareTo(dateTime19) == 0) == instant0.equals(dateTime19));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant5 = instant0.withDurationAdded((long) 352, (int) '#');
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.joda.time.LocalTime localTime8 = dateTime7.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusYears((int) '4');
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime16 = dateTime10.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime dateTime18 = dateTime16.withYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMillis((int) ' ');
        int int31 = dateTime28.getEra();
        int int32 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime34.dayOfWeek();
        org.joda.time.DateTime dateTime40 = dateTime34.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property41 = dateTime34.minuteOfHour();
        org.joda.time.DateTime dateTime43 = dateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime43.getZone();
        long long47 = dateTimeZone44.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime28.toMutableDateTime(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime54 = dateTime50.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime48, (org.joda.time.ReadableInstant) dateTime50);
        boolean boolean56 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime50);
        boolean boolean57 = dateTime18.isEqual((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime59 = dateTime20.withYearOfEra(21);
        org.joda.time.DateTime dateTime60 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime10", (instant0.compareTo(dateTime10) == 0) == instant0.equals(dateTime10));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        int int4 = dateTime1.getEra();
        org.joda.time.DateTime.Property property5 = dateTime1.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Days days7 = org.joda.time.Days.daysIn(readableInterval6);
        org.joda.time.Duration duration8 = days7.toStandardDuration();
        org.joda.time.Duration duration9 = duration8.toDuration();
        org.joda.time.DateTime dateTime11 = dateTime1.withDurationAdded((org.joda.time.ReadableDuration) duration9, (-1));
        org.joda.time.Duration duration13 = duration9.plus((-1L));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis((int) ' ');
        int int22 = dateTime19.getEra();
        int int23 = dateTime17.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusYears((int) '4');
        org.joda.time.DateTime.Property property28 = dateTime25.dayOfWeek();
        org.joda.time.DateTime dateTime31 = dateTime25.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property32 = dateTime25.minuteOfHour();
        org.joda.time.DateTime dateTime34 = dateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime34.getZone();
        long long38 = dateTimeZone35.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime19.toMutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime45 = dateTime41.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime39, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Interval interval47 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime49 = dateTime41.minusMonths(1);
        org.joda.time.DateTime dateTime51 = dateTime49.minus((long) (short) -1);
        org.joda.time.Duration duration54 = new org.joda.time.Duration(2022L, 1100L);
        org.joda.time.Duration duration55 = duration54.toDuration();
        org.joda.time.Instant instant56 = new org.joda.time.Instant();
        boolean boolean58 = instant56.isEqual(10L);
        org.joda.time.Instant instant59 = instant56.toInstant();
        org.joda.time.Period period60 = duration54.toPeriodFrom((org.joda.time.ReadableInstant) instant56);
        org.joda.time.Instant instant63 = instant56.withDurationAdded((long) 'x', 900);
        org.joda.time.Instant instant66 = instant56.withDurationAdded((-61058221506524L), 0);
        org.joda.time.Instant instant67 = instant56.toInstant();
        org.joda.time.Chronology chronology68 = instant67.getChronology();
        org.joda.time.DateTime dateTime69 = dateTime51.withChronology(chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant56", (dateTime15.compareTo(instant56) == 0) == dateTime15.equals(instant56));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant5 = instant0.withDurationAdded((long) 352, (int) '#');
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.Instant instant9 = instant6.withMillis(5064938391L);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        org.joda.time.Duration duration16 = duration13.toDuration();
        org.joda.time.Instant instant17 = instant6.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant19 = instant17.plus(694L);
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Days days25 = org.joda.time.Days.daysIn(readableInterval24);
        org.joda.time.Duration duration26 = days25.toStandardDuration();
        org.joda.time.Duration duration27 = duration26.toDuration();
        org.joda.time.ReadableDuration readableDuration28 = null;
        boolean boolean29 = duration27.isLongerThan(readableDuration28);
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.Days days31 = org.joda.time.Days.daysIn(readableInterval30);
        org.joda.time.Duration duration32 = days31.toStandardDuration();
        org.joda.time.Duration duration33 = duration32.toDuration();
        org.joda.time.ReadableDuration readableDuration34 = null;
        boolean boolean35 = duration33.isLongerThan(readableDuration34);
        boolean boolean36 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMillis((int) ' ');
        int int41 = dateTime38.getEra();
        org.joda.time.DateTime dateTime43 = dateTime38.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime45 = dateTime38.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval46 = duration27.toIntervalTo((org.joda.time.ReadableInstant) dateTime38);
        mutablePeriod23.add((org.joda.time.ReadableInterval) interval46);
        mutablePeriod23.addYears((int) ' ');
        mutablePeriod23.setSeconds((int) (byte) 100);
        mutablePeriod23.setDays((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.minusMillis((int) ' ');
        int int58 = dateTime55.getEra();
        org.joda.time.DateTime.Property property59 = dateTime55.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.Days days61 = org.joda.time.Days.daysIn(readableInterval60);
        org.joda.time.Duration duration62 = days61.toStandardDuration();
        org.joda.time.Duration duration63 = duration62.toDuration();
        org.joda.time.DateTime dateTime65 = dateTime55.withDurationAdded((org.joda.time.ReadableDuration) duration63, (-1));
        org.joda.time.Duration duration67 = duration63.plus((-1L));
        long long68 = duration63.getStandardMinutes();
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration63);
        java.lang.Object obj70 = null;
        boolean boolean71 = duration63.equals(obj70);
        org.joda.time.Duration duration73 = duration63.plus(433426032194400000L);
        org.joda.time.Instant instant74 = instant17.plus((org.joda.time.ReadableDuration) duration63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime38", (instant0.compareTo(dateTime38) == 0) == instant0.equals(dateTime38));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        int int4 = dateTime1.getEra();
        org.joda.time.DateTime dateTime6 = dateTime1.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime8 = dateTime1.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMonths((int) 'u');
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.DateTime dateTime13 = property12.getDateTime();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.Instant instant15 = dateTime13.toInstant();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMillis((int) ' ');
        int int20 = dateTime17.getEra();
        org.joda.time.DateTime.Property property21 = dateTime17.secondOfMinute();
        org.joda.time.DateTime dateTime22 = property21.roundHalfFloorCopy();
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds25 = seconds23.multipliedBy(1);
        boolean boolean26 = property21.equals((java.lang.Object) seconds23);
        org.joda.time.DateTime dateTime27 = property21.roundFloorCopy();
        int int28 = instant15.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Days days30 = org.joda.time.Days.days(3425459);
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded((org.joda.time.ReadablePeriod) days30, 768);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfDay();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        org.joda.time.Duration duration10 = days9.toStandardDuration();
        org.joda.time.Duration duration11 = duration10.toDuration();
        org.joda.time.ReadableDuration readableDuration12 = null;
        boolean boolean13 = duration11.isLongerThan(readableDuration12);
        org.joda.time.Duration duration14 = duration11.toDuration();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears((int) '4');
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfWeek();
        org.joda.time.DateTime dateTime22 = dateTime16.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property23 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime16.toDateTime();
        int int25 = dateTime24.getWeekyear();
        org.joda.time.DateTime dateTime27 = dateTime24.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, (org.joda.time.ReadableInstant) dateTime24, periodType28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration11.toIntervalFrom(readableInstant30);
        org.joda.time.DateTime dateTime32 = dateTime6.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours(374);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime6.toMutableDateTime(dateTimeZone35);
        int int37 = dateTime6.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime36", (dateTime6.compareTo(mutableDateTime36) == 0) == dateTime6.equals(mutableDateTime36));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime3 = property2.withMaximumValue();
        int int4 = dateTime3.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusYears((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime13 = dateTime7.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property14 = dateTime7.secondOfMinute();
        org.joda.time.Chronology chronology15 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfMonth();
        org.joda.time.DurationField durationField17 = chronology15.millis();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1, chronology15);
        org.joda.time.DateTime dateTime19 = dateTime3.withChronology(chronology15);
        org.joda.time.DateTime.Property property20 = dateTime19.year();
        java.lang.String str21 = property20.getName();
        long long22 = property20.remainder();
        org.joda.time.Interval interval23 = property20.toInterval();
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        long long25 = interval23.getEndMillis();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        java.lang.String str32 = locale31.toLanguageTag();
        java.util.Calendar calendar33 = dateTime29.toCalendar(locale31);
        org.joda.time.Instant instant34 = dateTime29.toInstant();
        org.joda.time.Instant instant36 = instant34.minus(4978567167L);
        boolean boolean37 = interval23.isAfter((org.joda.time.ReadableInstant) instant34);
        org.joda.time.DateTime dateTime38 = interval23.getStart();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant34", (dateTime9.compareTo(instant34) == 0) == dateTime9.equals(instant34));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        boolean boolean3 = instant1.isEqual(10L);
        org.joda.time.Instant instant6 = instant1.withDurationAdded((long) 352, (int) '#');
        org.joda.time.Instant instant7 = instant6.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean9 = instant6.isSupported(dateTimeFieldType8);
        org.joda.time.Instant instant11 = instant6.withMillis((long) 36);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(53706273L, chronology12);
        org.joda.time.DurationField durationField14 = chronology12.weeks();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) '4');
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfWeek();
        org.joda.time.DateTime dateTime23 = dateTime17.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property24 = dateTime17.secondOfMinute();
        org.joda.time.Chronology chronology25 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfMonth();
        org.joda.time.DurationField durationField27 = durationFieldType15.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.dayOfWeek();
        org.joda.time.DurationField durationField29 = chronology25.minutes();
        int int30 = durationField14.compareTo(durationField29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime17", (instant1.compareTo(dateTime17) == 0) == instant1.equals(dateTime17));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        java.lang.String str6 = dateTimeZone2.getNameKey((long) 1);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime7);
        java.lang.String str9 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.previousTransition(4492800004L);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("DateTimeField[secondOfMinute]");
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears((int) '4');
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        int int22 = property19.compareTo((org.joda.time.ReadableInstant) dateTime21);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = property19.getAsText(locale23);
        java.lang.String str26 = locale23.getExtension('u');
        java.lang.String str27 = locale14.getDisplayVariant(locale23);
        java.util.Set<java.lang.String> strSet28 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str29 = dateTimeZone2.getShortName(0L, locale23);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        long long34 = dateTimeZone2.getMillisKeepLocal(dateTimeZone31, 1756800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime32", (dateTime1.compareTo(dateTime32) == 0) == dateTime1.equals(dateTime32));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.DateTime dateTime5 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = instant3.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime5", (instant3.compareTo(dateTime5) == 0) == instant3.equals(dateTime5));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (-31));
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime3 = property2.getDateTime();
        org.joda.time.Hours hours4 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours5 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours6 = hours5.negated();
        org.joda.time.Hours hours7 = hours4.plus(hours5);
        org.joda.time.Hours hours8 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours9 = hours7.plus(hours8);
        org.joda.time.Duration duration10 = hours9.toStandardDuration();
        org.joda.time.Duration duration13 = duration10.withDurationAdded(53667874L, 627);
        org.joda.time.DateTime dateTime14 = dateTime3.minus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property16 = dateTime3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(92000);
        java.lang.String str19 = dateTimeZone18.getID();
        long long22 = dateTimeZone18.convertLocalToUTC((long) (-2147483648), true);
        int int24 = dateTimeZone18.getOffset((long) 97);
        org.joda.time.DateTime dateTime25 = dateTime3.withZone(dateTimeZone18);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType29 = periodType28.withSecondsRemoved();
        org.joda.time.Hours hours30 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours31 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours32 = hours30.plus(hours31);
        org.joda.time.DurationFieldType durationFieldType33 = hours30.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusYears((int) '4');
        org.joda.time.DateTime.Property property39 = dateTime36.dayOfWeek();
        org.joda.time.DateTime dateTime42 = dateTime36.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property43 = dateTime36.secondOfMinute();
        org.joda.time.Chronology chronology44 = dateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.dayOfMonth();
        org.joda.time.DurationField durationField46 = chronology44.millis();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) 1, chronology44);
        boolean boolean48 = durationFieldType33.isSupported(chronology44);
        org.joda.time.Period period49 = new org.joda.time.Period(4320000001L, periodType29, chronology44);
        org.joda.time.PeriodType periodType50 = periodType29.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.plusYears((int) '4');
        org.joda.time.DateTime.Property property55 = dateTime52.dayOfWeek();
        org.joda.time.DateTime dateTime58 = dateTime52.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property59 = dateTime52.secondOfMinute();
        org.joda.time.Chronology chronology60 = dateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.dayOfMonth();
        org.joda.time.DurationField durationField62 = chronology60.weeks();
        org.joda.time.DateTimeField dateTimeField63 = chronology60.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField64 = chronology60.weekyear();
        org.joda.time.DateTimeField dateTimeField65 = chronology60.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField66 = chronology60.clockhourOfDay();
        org.joda.time.DurationField durationField67 = chronology60.months();
        org.joda.time.DateTimeField dateTimeField68 = chronology60.minuteOfDay();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(53636489L, periodType50, chronology60);
        org.joda.time.DurationField durationField70 = chronology60.weeks();
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime3.toMutableDateTime(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime25", (dateTime3.compareTo(dateTime25) == 0) == dateTime3.equals(dateTime25));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) "2022-01-31T14:55:44.715Z");
        org.joda.time.Instant instant3 = new org.joda.time.Instant((long) (-1));
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(chronology4);
        org.joda.time.Instant instant7 = new org.joda.time.Instant(31795200000L);
        org.joda.time.Instant instant9 = instant7.plus(1645455223752L);
        org.joda.time.DateTime dateTime10 = instant7.toDateTime();
        org.joda.time.Instant instant12 = instant7.withMillis((-58375933528000L));
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime20 = dateTime14.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property21 = dateTime14.minuteOfHour();
        org.joda.time.DateTime dateTime23 = dateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusYears((int) '4');
        org.joda.time.DateTime.Property property29 = dateTime26.dayOfWeek();
        org.joda.time.DateTime dateTime32 = dateTime26.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property33 = dateTime26.minuteOfHour();
        org.joda.time.DateTime dateTime35 = dateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        long long39 = dateTimeZone36.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMillis((int) ' ');
        int int44 = dateTime41.getEra();
        org.joda.time.DateTime dateTime46 = dateTime41.minusMinutes((int) (short) 1);
        int int47 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime41.getZone();
        org.joda.time.ReadableInterval readableInterval49 = null;
        org.joda.time.Days days50 = org.joda.time.Days.daysIn(readableInterval49);
        org.joda.time.Duration duration51 = days50.toStandardDuration();
        org.joda.time.Duration duration52 = duration51.toDuration();
        org.joda.time.ReadableDuration readableDuration53 = null;
        boolean boolean54 = duration52.isLongerThan(readableDuration53);
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.Days days56 = org.joda.time.Days.daysIn(readableInterval55);
        org.joda.time.Duration duration57 = days56.toStandardDuration();
        org.joda.time.Duration duration58 = duration57.toDuration();
        org.joda.time.ReadableDuration readableDuration59 = null;
        boolean boolean60 = duration58.isLongerThan(readableDuration59);
        boolean boolean61 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration58);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime63 = org.joda.time.DateTime.now(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusMillis((int) ' ');
        int int66 = dateTime63.getEra();
        org.joda.time.DateTime dateTime68 = dateTime63.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime70 = dateTime63.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval71 = duration52.toIntervalTo((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Duration duration72 = duration52.toDuration();
        org.joda.time.Duration duration74 = duration72.plus((-74649556800000L));
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableDuration) duration74);
        boolean boolean76 = dateTime23.isEqual((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime.Property property77 = dateTime23.secondOfDay();
        boolean boolean78 = instant7.isAfter((org.joda.time.ReadableInstant) dateTime23);
        boolean boolean79 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime10", (instant7.compareTo(dateTime10) == 0) == instant7.equals(dateTime10));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.Instant instant2 = new org.joda.time.Instant(31795200000L);
        org.joda.time.Instant instant4 = instant2.plus(1645455223752L);
        org.joda.time.DateTime dateTime5 = instant2.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfWeek();
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property15 = dateTime8.secondOfMinute();
        org.joda.time.Chronology chronology16 = dateTime8.getChronology();
        org.joda.time.Period period19 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.Period period26 = period23.plusMinutes((int) (byte) 0);
        mutablePeriod20.mergePeriod((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period29 = period23.minusMonths((int) ' ');
        org.joda.time.Period period30 = period29.toPeriod();
        int[] intArray32 = chronology16.get((org.joda.time.ReadablePeriod) period29, (long) 48);
        org.joda.time.DateTimeZone dateTimeZone33 = chronology16.getZone();
        org.joda.time.Minutes minutes34 = org.joda.time.Minutes.TWO;
        int int35 = minutes34.getMinutes();
        org.joda.time.Minutes minutes36 = minutes34.negated();
        int[] intArray38 = chronology16.get((org.joda.time.ReadablePeriod) minutes34, (long) 86399);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(36000000L, chronology16);
        org.joda.time.DateTimeField dateTimeField40 = chronology16.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.plusYears((int) '4');
        org.joda.time.DateTime.Property property45 = dateTime42.dayOfWeek();
        org.joda.time.DateTime dateTime48 = dateTime42.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property49 = dateTime42.secondOfMinute();
        org.joda.time.Chronology chronology50 = dateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.dayOfMonth();
        org.joda.time.DurationField durationField52 = chronology50.halfdays();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.millisOfSecond();
        org.joda.time.DurationField durationField54 = chronology50.weeks();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTime dateTime60 = dateTime58.plusMillis((int) (short) -1);
        org.joda.time.DateTime dateTime62 = dateTime58.plusDays((-1));
        org.joda.time.DateTime dateTime64 = dateTime62.withYear((int) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay65 = dateTime64.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime67 = org.joda.time.DateTime.now(dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime67.plusYears((int) '4');
        org.joda.time.DateTime.Property property70 = dateTime67.dayOfWeek();
        org.joda.time.DateTime dateTime73 = dateTime67.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property74 = dateTime67.secondOfMinute();
        org.joda.time.Chronology chronology75 = dateTime67.getChronology();
        org.joda.time.Period period78 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod79 = period78.toMutablePeriod();
        org.joda.time.Period period82 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod83 = period82.toMutablePeriod();
        org.joda.time.Period period85 = period82.plusMinutes((int) (byte) 0);
        mutablePeriod79.mergePeriod((org.joda.time.ReadablePeriod) period82);
        org.joda.time.Period period88 = period82.minusMonths((int) ' ');
        org.joda.time.Period period89 = period88.toPeriod();
        int[] intArray91 = chronology75.get((org.joda.time.ReadablePeriod) period88, (long) 48);
        chronology50.validate((org.joda.time.ReadablePartial) timeOfDay65, intArray91);
        int[] intArray94 = chronology16.get((org.joda.time.ReadablePartial) timeOfDay65, 1645455423965L);
        org.joda.time.DateTime dateTime95 = dateTime5.withChronology(chronology16);
        org.joda.time.Period period96 = new org.joda.time.Period((long) 919, chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime5", (instant2.compareTo(dateTime5) == 0) == instant2.equals(dateTime5));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.daysIn(readableInterval4);
        org.joda.time.Duration duration6 = days5.toStandardDuration();
        org.joda.time.Duration duration7 = duration6.toDuration();
        org.joda.time.ReadableDuration readableDuration8 = null;
        boolean boolean9 = duration7.isLongerThan(readableDuration8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        boolean boolean16 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) ' ');
        int int21 = dateTime18.getEra();
        org.joda.time.DateTime dateTime23 = dateTime18.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime25 = dateTime18.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval26 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime18);
        mutablePeriod3.add((org.joda.time.ReadableInterval) interval26);
        org.joda.time.MutableInterval mutableInterval28 = interval26.toMutableInterval();
        org.joda.time.Instant instant30 = new org.joda.time.Instant(1728000000L);
        org.joda.time.Instant instant32 = instant30.withMillis(0L);
        org.joda.time.DateTime dateTime33 = instant32.toDateTime();
        boolean boolean34 = mutableInterval28.isBefore((org.joda.time.ReadableInstant) instant32);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant32.minus(readableDuration35);
        org.joda.time.DateTime dateTime37 = instant32.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant32", (dateTime33.compareTo(instant32) == 0) == dateTime33.equals(instant32));
    }
}

