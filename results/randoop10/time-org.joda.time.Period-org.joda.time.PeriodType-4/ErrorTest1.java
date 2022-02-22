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
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.Chronology chronology12 = chronology9.withUTC();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology9.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField14", Math.signum(durationField11.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField11)));
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
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.Days days26 = org.joda.time.Days.daysIn(readableInterval25);
        org.joda.time.Duration duration27 = days26.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.Days days29 = org.joda.time.Days.daysIn(readableInterval28);
        org.joda.time.Duration duration30 = days29.toStandardDuration();
        org.joda.time.Duration duration31 = duration30.toDuration();
        org.joda.time.ReadableDuration readableDuration32 = null;
        boolean boolean33 = duration31.isLongerThan(readableDuration32);
        org.joda.time.Duration duration35 = duration27.withDurationAdded(readableDuration32, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusYears((int) '4');
        org.joda.time.DateTime.Property property40 = dateTime37.dayOfWeek();
        org.joda.time.DateTime dateTime43 = dateTime37.withDurationAdded((long) 100, 0);
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.Days days45 = org.joda.time.Days.daysIn(readableInterval44);
        org.joda.time.Duration duration46 = days45.toStandardDuration();
        org.joda.time.Duration duration47 = duration46.toDuration();
        org.joda.time.ReadableDuration readableDuration48 = null;
        boolean boolean49 = duration47.isLongerThan(readableDuration48);
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.Days days51 = org.joda.time.Days.daysIn(readableInterval50);
        org.joda.time.Duration duration52 = days51.toStandardDuration();
        org.joda.time.Duration duration53 = duration52.toDuration();
        org.joda.time.ReadableDuration readableDuration54 = null;
        boolean boolean55 = duration53.isLongerThan(readableDuration54);
        boolean boolean56 = duration47.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableDuration) duration53);
        boolean boolean58 = duration35.isEqual((org.joda.time.ReadableDuration) duration53);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.plusYears((int) '4');
        org.joda.time.DateTime.Property property63 = dateTime60.dayOfWeek();
        org.joda.time.DateTime dateTime66 = dateTime60.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property67 = dateTime60.minuteOfHour();
        org.joda.time.DateTime dateTime68 = dateTime60.toDateTime();
        java.lang.String str69 = dateTime68.toString();
        org.joda.time.Period period70 = duration53.toPeriodTo((org.joda.time.ReadableInstant) dateTime68);
        int int71 = dateTime68.getYear();
        org.joda.time.Duration duration72 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime68);
        int int73 = dateTime68.getEra();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis(131);
        org.joda.time.DateTime dateTime76 = dateTime68.withZone(dateTimeZone75);
        java.util.TimeZone timeZone77 = dateTimeZone75.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime76", (dateTime14.compareTo(dateTime76) == 0) == dateTime14.equals(dateTime76));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.Period period1 = org.joda.time.Period.hours(32);
        org.joda.time.Period period4 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period8 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.Period period11 = period8.plusMinutes((int) (byte) 0);
        mutablePeriod5.mergePeriod((org.joda.time.ReadablePeriod) period8);
        mutablePeriod5.addMonths((int) 'u');
        mutablePeriod5.addHours((int) (byte) -1);
        org.joda.time.Period period19 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.Period period22 = period19.plusMinutes((int) (byte) 0);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getDurationType();
        boolean boolean28 = periodType25.isSupported(durationFieldType27);
        boolean boolean29 = period22.isSupported(durationFieldType27);
        int int30 = mutablePeriod5.indexOf(durationFieldType27);
        java.lang.String str31 = durationFieldType27.toString();
        org.joda.time.Period period33 = period1.withFieldAdded(durationFieldType27, 105);
        org.joda.time.Period period36 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod37 = period36.toMutablePeriod();
        org.joda.time.Period period40 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod41 = period40.toMutablePeriod();
        org.joda.time.Period period43 = period40.plusMinutes((int) (byte) 0);
        mutablePeriod37.mergePeriod((org.joda.time.ReadablePeriod) period40);
        mutablePeriod37.addMonths((int) 'u');
        mutablePeriod37.addHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.plusYears((int) '4');
        org.joda.time.DateTime.Property property56 = dateTime53.dayOfWeek();
        org.joda.time.DateTime dateTime59 = dateTime53.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property60 = dateTime53.secondOfMinute();
        org.joda.time.Chronology chronology61 = dateTime53.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.dayOfMonth();
        org.joda.time.Period period63 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology61);
        org.joda.time.DurationField durationField64 = chronology61.months();
        mutablePeriod37.setPeriod((long) 1814400, chronology61);
        org.joda.time.DateTimeField dateTimeField66 = chronology61.yearOfCentury();
        org.joda.time.DurationField durationField67 = chronology61.eras();
        boolean boolean68 = durationFieldType27.isSupported(chronology61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField64 and durationField67", Math.signum(durationField64.compareTo(durationField67)) == -Math.signum(durationField67.compareTo(durationField64)));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
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
        long long28 = interval26.getStartMillis();
        org.joda.time.Chronology chronology29 = interval26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime.Property property32 = dateTime31.dayOfMonth();
        java.lang.String str33 = property32.toString();
        int int34 = property32.getMaximumValue();
        int int35 = property32.getMaximumValueOverall();
        org.joda.time.DateTime dateTime36 = property32.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra(436);
        org.joda.time.DateTime dateTime40 = dateTime36.withWeekyear(16);
        boolean boolean41 = interval26.isBefore((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime.Property property42 = dateTime36.year();
        org.joda.time.DurationField durationField43 = property42.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property42.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType45.getRangeDurationType();
        org.joda.time.Period period49 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod50 = period49.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.Days days52 = org.joda.time.Days.daysIn(readableInterval51);
        org.joda.time.Duration duration53 = days52.toStandardDuration();
        org.joda.time.Duration duration54 = duration53.toDuration();
        org.joda.time.ReadableDuration readableDuration55 = null;
        boolean boolean56 = duration54.isLongerThan(readableDuration55);
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.Days days58 = org.joda.time.Days.daysIn(readableInterval57);
        org.joda.time.Duration duration59 = days58.toStandardDuration();
        org.joda.time.Duration duration60 = duration59.toDuration();
        org.joda.time.ReadableDuration readableDuration61 = null;
        boolean boolean62 = duration60.isLongerThan(readableDuration61);
        boolean boolean63 = duration54.isShorterThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(dateTimeZone64);
        org.joda.time.DateTime dateTime67 = dateTime65.minusMillis((int) ' ');
        int int68 = dateTime65.getEra();
        org.joda.time.DateTime dateTime70 = dateTime65.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime72 = dateTime65.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval73 = duration54.toIntervalTo((org.joda.time.ReadableInstant) dateTime65);
        mutablePeriod50.add((org.joda.time.ReadableInterval) interval73);
        org.joda.time.MutableInterval mutableInterval75 = interval73.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime77 = org.joda.time.DateTime.now(dateTimeZone76);
        org.joda.time.DateTime dateTime79 = dateTime77.plusYears((int) '4');
        boolean boolean80 = interval73.isAfter((org.joda.time.ReadableInstant) dateTime77);
        long long81 = interval73.getEndMillis();
        org.joda.time.Chronology chronology82 = interval73.getChronology();
        boolean boolean83 = durationFieldType46.isSupported(chronology82);
        org.joda.time.Chronology chronology84 = chronology82.withUTC();
        org.joda.time.DateTimeZone dateTimeZone85 = chronology84.getZone();
        org.joda.time.DurationField durationField86 = chronology84.hours();
        boolean boolean87 = dateTimeFieldType44.isSupported(chronology84);
        org.joda.time.DurationField durationField88 = chronology84.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField88, durationField43, and durationField86", !(durationField88.compareTo(durationField43) == 0) || (Math.signum(durationField88.compareTo(durationField86)) == Math.signum(durationField43.compareTo(durationField86))));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = dateTime3.isSupported(dateTimeFieldType5);
        org.joda.time.Period period7 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusYears((int) '4');
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime16 = dateTime10.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property17 = dateTime10.secondOfMinute();
        org.joda.time.Chronology chronology18 = dateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.dayOfMonth();
        org.joda.time.DurationField durationField20 = durationFieldType8.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime3.toMutableDateTime(chronology18);
        org.joda.time.DurationField durationField23 = chronology18.eras();
        org.joda.time.Chronology chronology24 = chronology18.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField23", Math.signum(durationField20.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField20)));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField17 = chronology9.halfdays();
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        org.joda.time.Period period23 = period20.plusSeconds((int) (short) 1);
        org.joda.time.Weeks weeks24 = period23.toStandardWeeks();
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeks((-52));
        org.joda.time.Weeks weeks27 = weeks24.minus(weeks26);
        int int28 = weeks26.getWeeks();
        org.joda.time.Weeks weeks29 = weeks26.negated();
        int[] intArray32 = chronology9.get((org.joda.time.ReadablePeriod) weeks29, (long) 26381294, 85622400000L);
        org.joda.time.DateTimeField dateTimeField33 = chronology9.centuryOfEra();
        org.joda.time.DurationField durationField34 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField11, and durationField17", !(durationField34.compareTo(durationField11) == 0) || (Math.signum(durationField34.compareTo(durationField17)) == Math.signum(durationField11.compareTo(durationField17))));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        boolean boolean5 = dateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(55);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(dateTimeZone7);
        int int10 = dateTime9.getYear();
        org.joda.time.DateTime.Property property11 = dateTime9.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMillis((int) ' ');
        int int20 = dateTime17.getEra();
        int int21 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis((int) ' ');
        org.joda.time.Duration duration26 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime23);
        long long27 = duration26.getMillis();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMillis((int) ' ');
        int int32 = dateTime29.getEra();
        org.joda.time.DateTime dateTime34 = dateTime29.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime36 = dateTime29.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime37 = dateTime36.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime39 = dateTime37.minusMillis((int) 'u');
        org.joda.time.Period period42 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.Days days45 = org.joda.time.Days.daysIn(readableInterval44);
        org.joda.time.Duration duration46 = days45.toStandardDuration();
        org.joda.time.Duration duration47 = duration46.toDuration();
        org.joda.time.ReadableDuration readableDuration48 = null;
        boolean boolean49 = duration47.isLongerThan(readableDuration48);
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.Days days51 = org.joda.time.Days.daysIn(readableInterval50);
        org.joda.time.Duration duration52 = days51.toStandardDuration();
        org.joda.time.Duration duration53 = duration52.toDuration();
        org.joda.time.ReadableDuration readableDuration54 = null;
        boolean boolean55 = duration53.isLongerThan(readableDuration54);
        boolean boolean56 = duration47.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.minusMillis((int) ' ');
        int int61 = dateTime58.getEra();
        org.joda.time.DateTime dateTime63 = dateTime58.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime65 = dateTime58.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval66 = duration47.toIntervalTo((org.joda.time.ReadableInstant) dateTime58);
        mutablePeriod43.add((org.joda.time.ReadableInterval) interval66);
        org.joda.time.MutableInterval mutableInterval68 = interval66.toMutableInterval();
        java.lang.String str69 = mutableInterval68.toString();
        org.joda.time.Chronology chronology70 = mutableInterval68.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.centuryOfEra();
        int int72 = dateTime39.get(dateTimeField71);
        java.util.Date date73 = dateTime39.toDate();
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime13", (dateTime1.compareTo(dateTime13) == 0) == dateTime1.equals(dateTime13));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.toDateTime(dateTimeZone2);
        org.joda.time.Instant instant4 = dateTime1.toInstant();
        org.joda.time.Instant instant6 = instant4.plus(1645514149289L);
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant4", (dateTime1.compareTo(instant4) == 0) == dateTime1.equals(instant4));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMillis(8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.secondOfMinute();
        org.joda.time.Chronology chronology19 = dateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.dayOfMonth();
        org.joda.time.DurationField durationField21 = chronology19.millis();
        org.joda.time.Period period24 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
        org.joda.time.Period period27 = period24.plusSeconds((int) (short) 1);
        org.joda.time.Days days28 = period27.toStandardDays();
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.Days days30 = org.joda.time.Days.daysIn(readableInterval29);
        java.lang.String str31 = days30.toString();
        boolean boolean32 = days28.isGreaterThan(days30);
        long long35 = chronology19.add((org.joda.time.ReadablePeriod) days30, (long) ' ', (int) ' ');
        org.joda.time.DateTimeField dateTimeField36 = chronology19.hourOfHalfday();
        org.joda.time.DateTime dateTime37 = dateTime9.toDateTime(chronology19);
        org.joda.time.DateTime.Property property38 = dateTime9.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = dateTime40.withZone(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusYears((int) '4');
        org.joda.time.DateTime.Property property48 = dateTime45.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        int int51 = property48.compareTo((org.joda.time.ReadableInstant) dateTime50);
        java.util.Locale locale52 = java.util.Locale.FRANCE;
        java.lang.String str53 = property48.getAsText(locale52);
        java.util.Calendar calendar54 = dateTime40.toCalendar(locale52);
        org.joda.time.DateTime dateTime56 = dateTime40.withEra((int) (byte) 0);
        org.joda.time.Days days57 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime40.getZone();
        org.joda.time.Instant instant59 = new org.joda.time.Instant();
        org.joda.time.Instant instant62 = instant59.withDurationAdded((long) 12, 6);
        org.joda.time.Duration duration64 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.Days days66 = org.joda.time.Days.daysIn(readableInterval65);
        org.joda.time.Duration duration67 = days66.toStandardDuration();
        org.joda.time.Duration duration68 = duration67.toDuration();
        boolean boolean69 = duration64.isLongerThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Instant instant70 = instant59.minus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.millisOfDay();
        java.lang.String str72 = dateTimeFieldType71.getName();
        int int73 = instant70.get(dateTimeFieldType71);
        org.joda.time.Instant instant75 = instant70.plus(1645363166167L);
        int int76 = dateTime40.compareTo((org.joda.time.ReadableInstant) instant75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant59", (dateTime1.compareTo(instant59) == 0) == dateTime1.equals(instant59));
    }
}

