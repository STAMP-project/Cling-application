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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight8.plusDays(743);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        java.lang.String str24 = localDate23.toString();
        org.joda.time.LocalDate localDate26 = localDate23.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.eras();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology27.getZone();
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight8.withZoneRetainFields(dateTimeZone29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) (short) 1, chronology33);
        int int35 = localDate34.getDayOfYear();
        org.joda.time.LocalTime localTime36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDate34.toDateTime(localTime36, dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = localDate34.toDateMidnight(dateTimeZone39);
        org.joda.time.DateMidnight.Property property41 = dateMidnight40.yearOfEra();
        int int42 = dateMidnight40.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = dateMidnight40.isSupported(dateTimeFieldType43);
        org.joda.time.Period period49 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight40.minus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone52 = dateMidnight51.getZone();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (short) 1, chronology54);
        java.lang.String str56 = localDate55.toString();
        org.joda.time.LocalDate localDate58 = localDate55.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight51.withFields((org.joda.time.ReadablePartial) localDate58);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight51.withField(dateTimeFieldType60, 842);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) (byte) 100, chronology64);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(chronology66);
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime67.copy();
        org.joda.time.Duration duration69 = period65.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime68);
        org.joda.time.Period period71 = period65.plusDays((int) (byte) 10);
        org.joda.time.Duration duration72 = period71.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight51.minus((org.joda.time.ReadableDuration) duration72);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight50.minus((org.joda.time.ReadableDuration) duration72);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight8.withDurationAdded((org.joda.time.ReadableDuration) duration72, 53994970);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and dateMidnight31", (dateMidnight8.compareTo(dateMidnight31) == 0) == dateMidnight8.equals(dateMidnight31));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withCenturyOfEra(1);
        org.joda.time.DateTime dateTime3 = dateMidnight2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime4 = dateMidnight2.toMutableDateTimeISO();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 100, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.copy();
        org.joda.time.Duration duration11 = period7.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.Seconds seconds12 = period7.toStandardSeconds();
        org.joda.time.Period period14 = period7.plusYears(0);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight2.withPeriodAdded((org.joda.time.ReadablePeriod) period7, 10);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology23);
        long long29 = chronology23.add((long) 891, (long) 6, 53678034);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((java.lang.Object) dateMidnight2, chronology23);
        org.joda.time.DurationField durationField31 = chronology23.seconds();
        org.joda.time.Chronology chronology32 = chronology23.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and mutableDateTime25", (mutableDateTime9.compareTo(mutableDateTime25) == 0) == mutableDateTime9.equals(mutableDateTime25));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 14, chronology16);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight8.withChronology(chronology16);
        int int21 = dateMidnight8.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight8.withMillis((long) 53730034);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.withCenturyOfEra(39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight23 and dateMidnight20", (dateMidnight23.compareTo(dateMidnight20) == 0) == dateMidnight23.equals(dateMidnight20));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime2.copy();
        mutableDateTime2.addMinutes(0);
        java.lang.String str6 = mutableDateTime2.toString();
        int int7 = mutableDateTime2.getYearOfEra();
        org.joda.time.Chronology chronology8 = mutableDateTime2.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((-27422466L), chronology8);
        org.joda.time.Chronology chronology11 = chronology8.withUTC();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DurationField durationField13 = chronology11.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime12", (mutableDateTime2.compareTo(dateTime12) == 0) == mutableDateTime2.equals(dateTime12));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (byte) 100, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.Duration duration10 = period6.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime9);
        int int11 = period6.size();
        org.joda.time.Period period13 = period6.withWeeks(842);
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = period6.getFieldTypes();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.forFields(durationFieldTypeArray14);
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 1, chronology19);
        java.lang.String str21 = localDate20.toString();
        org.joda.time.LocalDate localDate23 = localDate20.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) 1, chronology24);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay25.plusMonths(53617719);
        int int28 = yearMonthDay25.getDayOfMonth();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        java.lang.String str32 = localDate31.toString();
        org.joda.time.LocalDate localDate34 = localDate31.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay25.withChronologyRetainFields(chronology35);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 53669143, (long) 53720429, periodType16, chronology35);
        org.joda.time.PeriodType periodType39 = periodType16.withSecondsRemoved();
        java.lang.String str40 = periodType16.getName();
        java.lang.String str41 = periodType16.getName();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 1, chronology46);
        java.lang.String str48 = localDate47.toString();
        org.joda.time.LocalDate localDate50 = localDate47.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.yearOfEra();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType44.getField(chronology51);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology51);
        org.joda.time.Period period55 = new org.joda.time.Period((long) (-1), periodType43, chronology51);
        org.joda.time.DateTimeField dateTimeField56 = chronology51.centuryOfEra();
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now(chronology51);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(970376274000L, (long) 6257, periodType16, chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime54", (mutableDateTime8.compareTo(dateTime54) == 0) == mutableDateTime8.equals(dateTime54));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.Chronology chronology8 = instant4.getChronology();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) periodType9, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.plusYears((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withYearOfEra(47);
        int int19 = localDateTime18.size();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plusSeconds(53621101);
        long long23 = chronology8.set((org.joda.time.ReadablePartial) localDateTime21, (long) 958);
        org.joda.time.Period period25 = org.joda.time.Period.days(53773731);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 100, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime30.copy();
        org.joda.time.Duration duration32 = period28.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime31);
        int int33 = period28.size();
        org.joda.time.format.PeriodFormatter periodFormatter34 = null;
        java.lang.String str35 = period28.toString(periodFormatter34);
        int int36 = period28.getSeconds();
        java.util.Locale locale37 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(10L, (-1L), periodType41, chronology42);
        org.joda.time.Period period44 = period43.normalizedStandard();
        boolean boolean45 = strSet38.contains((java.lang.Object) period44);
        org.joda.time.Period period46 = period28.plus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Period period47 = period25.withFields((org.joda.time.ReadablePeriod) period46);
        org.joda.time.Period period49 = period46.withHours(843);
        long long52 = chronology8.add((org.joda.time.ReadablePeriod) period46, 0L, 327);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime30", (instant4.compareTo(mutableDateTime30) == 0) == instant4.equals(mutableDateTime30));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone2 = dateMidnight1.getZone();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.plusYears(53619079);
        int int5 = dateMidnight4.getYearOfEra();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        java.lang.String str11 = localDate10.toString();
        org.joda.time.LocalDate localDate13 = localDate10.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight6.withFields((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight6.withField(dateTimeFieldType15, 842);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight6.plus((long) (byte) -1);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone22 = dateMidnight21.getZone();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 1, chronology24);
        java.lang.String str26 = localDate25.toString();
        org.joda.time.LocalDate localDate28 = localDate25.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight21.withFields((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight21.withField(dateTimeFieldType30, 842);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) 100, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime37.copy();
        org.joda.time.Duration duration39 = period35.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.Period period41 = period35.plusDays((int) (byte) 10);
        org.joda.time.Duration duration42 = period41.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight21.minus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight19.plus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(readableDuration46, readableInstant47, periodType48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        mutablePeriod49.add(readableDuration50);
        mutablePeriod49.addMonths((int) '#');
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) (short) 1, chronology55);
        int int57 = localDate56.getDayOfYear();
        org.joda.time.LocalTime localTime58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = localDate56.toDateTime(localTime58, dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = localDate56.toDateMidnight(dateTimeZone61);
        org.joda.time.DateMidnight.Property property63 = dateMidnight62.yearOfEra();
        int int64 = dateMidnight62.getMinuteOfHour();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period((long) (byte) 100, chronology66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(chronology68);
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime69.copy();
        org.joda.time.Duration duration71 = period67.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime70);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight62.plus((org.joda.time.ReadableDuration) duration71);
        mutablePeriod49.add((org.joda.time.ReadableDuration) duration71);
        org.joda.time.PeriodType periodType74 = org.joda.time.PeriodType.years();
        java.lang.String str75 = periodType74.getName();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(periodType74);
        org.joda.time.PeriodType periodType77 = periodType74.withYearsRemoved();
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant45, (org.joda.time.ReadableDuration) duration71, periodType77);
        org.joda.time.PeriodType periodType79 = periodType77.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) dateMidnight44, periodType79);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateMidnight.Property property82 = dateMidnight44.property(dateTimeFieldType81);
        org.joda.time.DateMidnight dateMidnight83 = property82.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight84 = property82.roundHalfFloorCopy();
        java.util.TimeZone timeZone86 = java.util.TimeZone.getTimeZone("Days");
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forTimeZone(timeZone86);
        org.joda.time.DateMidnight dateMidnight88 = dateMidnight84.withZoneRetainFields(dateTimeZone87);
        org.joda.time.LocalTime localTime89 = new org.joda.time.LocalTime((long) 2057, dateTimeZone87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight84 and dateMidnight88", (dateMidnight84.compareTo(dateMidnight88) == 0) == dateMidnight84.equals(dateMidnight88));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = chronology6.getZone();
        org.joda.time.DurationField durationField9 = chronology6.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField9, and durationField7", !(durationField7.compareTo(durationField9) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField9.compareTo(durationField7))));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        int int11 = dateMidnight8.getMonthOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate localDate20 = localDate17.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.eras();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) dateMidnight8, chronology21);
        org.joda.time.DateTime dateTime26 = dateTime24.minusYears(15);
        org.joda.time.DateTime.Property property27 = dateTime26.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and dateTime24", (dateMidnight8.compareTo(dateTime24) == 0) == dateMidnight8.equals(dateTime24));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.plusYears(53619079);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        int int6 = mutableDateTime5.getMillisOfSecond();
        boolean boolean7 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) mutableDateTime5);
        int int8 = mutableDateTime5.getMillisOfSecond();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.joda.time.Instant instant12 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        mutableDateTime10.setChronology(chronology13);
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant9", (mutableDateTime5.compareTo(instant9) == 0) == mutableDateTime5.equals(instant9));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 53677);
        org.joda.time.Instant instant4 = instant1.withDurationAdded((long) 53655716, 52);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localTime5.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMonths(10);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        org.joda.time.DateTime.Property property14 = dateTime10.year();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 100, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.copy();
        org.joda.time.Duration duration21 = period17.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
        mutableDateTime24.addMinutes(904);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, (org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.Instant instant29 = instant4.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTime dateTime30 = instant29.toDateTimeISO();
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and dateTime30", (instant29.compareTo(dateTime30) == 0) == instant29.equals(dateTime30));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Instant instant16 = instant4.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate.Property property21 = localDate19.year();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.LocalDate localDate23 = property21.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate24 = property21.roundFloorCopy();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime26.copy();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(readableDuration28, readableInstant29, periodType30);
        mutablePeriod31.addYears((int) (byte) 0);
        int int34 = mutablePeriod31.getMonths();
        mutablePeriod31.clear();
        mutableDateTime26.add((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 1, chronology38);
        java.lang.String str40 = localDate39.toString();
        org.joda.time.LocalDate localDate42 = localDate39.withYearOfEra((int) (byte) 100);
        int int43 = localDate39.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DateTime dateTime46 = localDate39.toDateTime((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone48 = dateMidnight47.getZone();
        boolean boolean50 = dateTimeZone48.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate51 = org.joda.time.LocalDate.now(dateTimeZone48);
        java.lang.String str53 = dateTimeZone48.getNameKey((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime45.toMutableDateTime(dateTimeZone48);
        long long57 = dateTimeZone48.convertLocalToUTC((long) 27, false);
        org.joda.time.DateTime dateTime58 = mutableDateTime26.toDateTime(dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight59 = localDate24.toDateMidnight(dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.withMillis(53706371L);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.years();
        java.lang.String str63 = periodType62.getName();
        org.joda.time.PeriodType periodType64 = periodType62.withMonthsRemoved();
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(periodType65);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((java.lang.Object) periodType65, dateTimeZone67);
        int int69 = localDateTime68.getDayOfMonth();
        int int70 = localDateTime68.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property71 = localDateTime68.millisOfSecond();
        int int72 = localDateTime68.getEra();
        org.joda.time.LocalDateTime.Property property73 = localDateTime68.era();
        boolean boolean74 = periodType62.equals((java.lang.Object) property73);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) dateMidnight59, periodType62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime8", (instant4.compareTo(mutableDateTime8) == 0) == instant4.equals(mutableDateTime8));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(53618333);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfEra();
        org.joda.time.DateTime dateTime15 = dateTime6.toDateTime(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone17 = dateMidnight16.getZone();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 1, chronology19);
        java.lang.String str21 = localDate20.toString();
        org.joda.time.LocalDate localDate23 = localDate20.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight16.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight16.withField(dateTimeFieldType25, 842);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 100, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime32.copy();
        org.joda.time.Duration duration34 = period30.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.Period period36 = period30.plusDays((int) (byte) 10);
        org.joda.time.Duration duration37 = period36.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration37);
        java.lang.String str39 = duration37.toString();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 100, chronology41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime44.copy();
        org.joda.time.Duration duration46 = period42.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.Period period48 = period42.plusDays((int) (byte) 10);
        int int49 = period48.getHours();
        org.joda.time.Period period51 = period48.plusMonths(2);
        org.joda.time.PeriodType periodType52 = period48.getPeriodType();
        org.joda.time.PeriodType periodType53 = periodType52.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableDuration) duration37, periodType53);
        mutablePeriod54.addYears(53856268);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime15", (dateTime6.compareTo(dateTime15) == 0) == dateTime6.equals(dateTime15));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 100, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.Duration duration16 = period12.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.DateTime.Property property18 = dateTime5.monthOfYear();
        org.joda.time.DateTime.Property property19 = dateTime5.yearOfCentury();
        org.joda.time.Instant instant20 = dateTime5.toInstant();
        org.joda.time.Instant instant22 = instant20.plus((long) 53695639);
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant20", (dateTime5.compareTo(instant20) == 0) == dateTime5.equals(instant20));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        long long4 = instant1.getMillis();
        org.joda.time.Instant instant7 = instant1.withDurationAdded((long) 410, 988);
        org.joda.time.MutableDateTime mutableDateTime8 = instant1.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.joda.time.Period period22 = new org.joda.time.Period(58385L, 0L, periodType13, chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.hourOfHalfday();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((java.lang.Object) chronology9, chronology20);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime3", (instant1.compareTo(mutableDateTime3) == 0) == instant1.equals(mutableDateTime3));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = dateMidnight8.isSupported(dateTimeFieldType11);
        org.joda.time.Instant instant13 = dateMidnight8.toInstant();
        org.joda.time.DateMidnight.Property property14 = dateMidnight8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant13", (dateMidnight8.compareTo(instant13) == 0) == dateMidnight8.equals(instant13));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        int int11 = dateMidnight8.getMonthOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate localDate20 = localDate17.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.eras();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) dateMidnight8, chronology21);
        org.joda.time.DateTime dateTime26 = dateTime24.minusYears(15);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 100, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime32.copy();
        org.joda.time.Duration duration34 = period30.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime33);
        int int35 = period30.size();
        org.joda.time.Period period37 = period30.withWeeks(842);
        org.joda.time.DurationFieldType[] durationFieldTypeArray38 = period30.getFieldTypes();
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.forFields(durationFieldTypeArray38);
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 1, chronology43);
        java.lang.String str45 = localDate44.toString();
        org.joda.time.LocalDate localDate47 = localDate44.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfEra();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType41.getField(chronology48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) (byte) 100, chronology52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology54);
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime55.copy();
        org.joda.time.Duration duration57 = period53.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime56);
        org.joda.time.Period period59 = period53.plusDays((int) (byte) 10);
        int int60 = period59.getHours();
        org.joda.time.Period period62 = period59.plusMonths(2);
        org.joda.time.Period period64 = period59.minusMonths(12);
        org.joda.time.Period period66 = period59.withYears(2057);
        int[] intArray68 = chronology48.get((org.joda.time.ReadablePeriod) period66, 259200000L);
        org.joda.time.DurationField durationField69 = chronology48.weeks();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(871L, periodType39, chronology48);
        org.joda.time.DateTimeField dateTimeField71 = chronology48.millisOfDay();
        org.joda.time.DateTime dateTime72 = dateTime24.toDateTime(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField69", Math.signum(durationField22.compareTo(durationField69)) == -Math.signum(durationField69.compareTo(durationField22)));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfEven();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.set("20");
        java.lang.Object obj7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight8.getZone();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj7, dateTimeZone9);
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime.Property property13 = dateTime11.monthOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.monthOfYear();
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.Instant instant24 = dateMidnight23.toInstant();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.minusWeeks(590);
        boolean boolean27 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateMidnight26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateMidnight23", (mutableDateTime1.compareTo(dateMidnight23) == 0) == mutableDateTime1.equals(dateMidnight23));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.Interval interval11 = dateMidnight8.toInterval();
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight8.toMutableDateTime();
        mutableDateTime12.addWeeks(53669883);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate localDate20 = localDate17.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfEra();
        org.joda.time.DurationField durationField23 = chronology21.seconds();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, chronology21);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime25", (mutableDateTime12.compareTo(mutableDateTime25) == 0) == mutableDateTime12.equals(mutableDateTime25));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 14, chronology16);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight8.withChronology(chronology16);
        int int21 = dateMidnight8.getDayOfMonth();
        int int22 = dateMidnight8.getYearOfEra();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight8.plusMonths(53764222);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) 100, chronology26);
        org.joda.time.Seconds seconds28 = period27.toStandardSeconds();
        int int29 = period27.getMonths();
        int int30 = period27.getHours();
        org.joda.time.Period period32 = period27.plusSeconds(53619770);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight8.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateMidnight33.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and dateMidnight20", (dateMidnight8.compareTo(dateMidnight20) == 0) == dateMidnight8.equals(dateMidnight20));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        java.lang.String str14 = localDate13.toString();
        org.joda.time.LocalDate localDate16 = localDate13.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight9.withFields((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableDuration18, readableInstant19, periodType20);
        mutablePeriod21.setMillis(0);
        org.joda.time.LocalDate localDate24 = localDate16.plus((org.joda.time.ReadablePeriod) mutablePeriod21);
        int[] intArray27 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod21, (long) 53645, (long) 53625309);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        java.lang.String str32 = localDate31.toString();
        org.joda.time.LocalDate localDate34 = localDate31.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfEra();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology35);
        org.joda.time.DateTimeField dateTimeField39 = chronology35.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = chronology35.year();
        mutablePeriod21.add((long) 533, chronology35);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 1, chronology43);
        java.lang.String str45 = localDate44.toString();
        org.joda.time.LocalDate localDate47 = localDate44.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(chronology48);
        org.joda.time.DateTimeField dateTimeField51 = chronology48.era();
        org.joda.time.DurationField durationField52 = chronology48.hours();
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.withCenturyOfEra(0);
        org.joda.time.Interval interval56 = dateMidnight53.toInterval();
        mutablePeriod21.add((org.joda.time.ReadableInterval) interval56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateMidnight53", (dateMidnight9.compareTo(dateMidnight53) == 0) == dateMidnight9.equals(dateMidnight53));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withCenturyOfEra(1);
        org.joda.time.DateTime dateTime3 = dateMidnight2.toDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight2.withChronology(chronology10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType13.getField(chronology20);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight12.withChronology(chronology20);
        org.joda.time.DateMidnight.Property property26 = dateMidnight12.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight12", (dateMidnight2.compareTo(dateMidnight12) == 0) == dateMidnight2.equals(dateMidnight12));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        java.lang.String str5 = mutableDateTime1.toString();
        int int6 = mutableDateTime1.getYearOfEra();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.millisOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.copy();
        mutableDateTime10.addMinutes(0);
        java.lang.String str14 = mutableDateTime10.toString();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        boolean boolean19 = dateTimeFormatter18.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone23 = dateMidnight22.getZone();
        boolean boolean25 = dateTimeZone23.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter21.withZone(dateTimeZone23);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 53628506, dateTimeZone23);
        mutableDateTime10.setZoneRetainFields(dateTimeZone23);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (byte) 100, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime34.copy();
        org.joda.time.Duration duration36 = period32.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime35);
        mutableDateTime10.add((org.joda.time.ReadableDuration) duration36, 53625309);
        org.joda.time.Period period39 = duration36.toPeriod();
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.days();
        java.lang.String str41 = periodType40.toString();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableDuration) duration36, periodType40);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 1, chronology44);
        int int46 = localDate45.getDayOfYear();
        org.joda.time.LocalTime localTime47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = localDate45.toDateTime(localTime47, dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateMidnight dateMidnight51 = localDate45.toDateMidnight(dateTimeZone50);
        org.joda.time.DateMidnight.Property property52 = dateMidnight51.yearOfEra();
        int int53 = dateMidnight51.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = null;
        boolean boolean55 = dateMidnight51.isSupported(dateTimeFieldType54);
        org.joda.time.Period period60 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight51.minus((org.joda.time.ReadablePeriod) period60);
        org.joda.time.Instant instant62 = new org.joda.time.Instant();
        org.joda.time.Instant instant64 = instant62.withMillis((-27422466L));
        org.joda.time.Chronology chronology65 = instant62.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.clockhourOfHalfday();
        int int67 = dateMidnight51.get(dateTimeField66);
        org.joda.time.Interval interval68 = dateMidnight51.toInterval();
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight51.minusDays(53813156);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateMidnight70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant62", (mutableDateTime2.compareTo(instant62) == 0) == mutableDateTime2.equals(instant62));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        long long4 = instant1.getMillis();
        org.joda.time.Instant instant6 = instant1.minus(1645455255594L);
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime3", (instant1.compareTo(mutableDateTime3) == 0) == instant1.equals(mutableDateTime3));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType3.getField(chronology10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology10);
        org.joda.time.Period period14 = new org.joda.time.Period((long) (-1), periodType2, chronology10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.centuryOfEra();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(chronology10);
        org.joda.time.Chronology chronology17 = chronology10.withUTC();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj0, chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 1, chronology20);
        int int22 = localDate21.getDayOfYear();
        org.joda.time.LocalDate.Property property23 = localDate21.weekOfWeekyear();
        org.joda.time.LocalDate localDate24 = property23.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate25 = property23.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime27.copy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        mutableDateTime28.setZone(dateTimeZone29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime28.minuteOfDay();
        long long32 = property31.remainder();
        org.joda.time.MutableDateTime mutableDateTime33 = property31.roundHalfCeiling();
        int int34 = property23.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (short) 1, chronology36);
        java.lang.String str38 = localDate37.toString();
        org.joda.time.LocalDate localDate40 = localDate37.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.eras();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.year();
        mutableDateTime33.setChronology(chronology41);
        org.joda.time.DateTime dateTime45 = dateTime18.toDateTime(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime27", (dateTime13.compareTo(mutableDateTime27) == 0) == dateTime13.equals(mutableDateTime27));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 53643303);
        mutableDateTime1.addDays(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        java.lang.String str11 = localDate10.toString();
        org.joda.time.LocalDate localDate13 = localDate10.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology14);
        boolean boolean17 = dateTimeFieldType4.isSupported(chronology14);
        java.lang.String str18 = chronology14.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology14.getZone();
        org.joda.time.DateTime dateTime20 = mutableDateTime1.toDateTime(dateTimeZone19);
        java.lang.String str21 = dateTimeZone19.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime20", (mutableDateTime1.compareTo(dateTime20) == 0) == mutableDateTime1.equals(dateTime20));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.plusYears(53619079);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        int int6 = mutableDateTime5.getMillisOfSecond();
        boolean boolean7 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) mutableDateTime5);
        int int8 = mutableDateTime5.getMillisOfSecond();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.joda.time.Instant instant12 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        mutableDateTime10.setChronology(chronology13);
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.addHours(53790700);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant9", (mutableDateTime5.compareTo(instant9) == 0) == mutableDateTime5.equals(instant9));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        long long4 = instant1.getMillis();
        org.joda.time.Chronology chronology5 = instant1.getChronology();
        org.joda.time.Instant instant8 = instant1.withDurationAdded(1645455391393L, 277);
        org.joda.time.Instant instant9 = instant1.toInstant();
        org.joda.time.Instant instant11 = instant9.plus((long) 53662339);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime3", (instant9.compareTo(mutableDateTime3) == 0) == instant9.equals(mutableDateTime3));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration9, readableInstant10, periodType11);
        mutablePeriod12.setMillis(0);
        org.joda.time.LocalDate localDate15 = localDate7.plus((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.LocalDate localDate17 = localDate15.withWeekyear((int) ' ');
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone19 = dateMidnight18.getZone();
        boolean boolean21 = dateTimeZone19.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = localDate15.toDateTimeAtStartOfDay(dateTimeZone19);
        java.lang.String str24 = localDate15.toString();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone26 = dateMidnight25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localDate15.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getRangeDurationType();
        boolean boolean31 = localDate15.isSupported(durationFieldType30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        java.lang.String str36 = localDate35.toString();
        org.joda.time.LocalDate localDate38 = localDate35.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(chronology39);
        org.joda.time.DurationField durationField42 = chronology39.years();
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) 53629078, chronology39);
        org.joda.time.DateTimeField dateTimeField44 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField45 = chronology39.weekOfWeekyear();
        boolean boolean46 = durationFieldType30.isSupported(chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime27 and mutableDateTime41", (mutableDateTime27.compareTo(mutableDateTime41) == 0) == mutableDateTime27.equals(mutableDateTime41));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022-02-21T14:55:44.806Z");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        mutableDateTime5.setZone(dateTimeZone6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        int int11 = localDate10.getDayOfYear();
        org.joda.time.LocalTime localTime12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate10.toDateTime(localTime12, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = localDate10.toDateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.yearOfEra();
        int int18 = dateMidnight16.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property19 = dateMidnight16.year();
        boolean boolean20 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.hours();
        mutableDateTime23.add(durationFieldType24, (int) (byte) 0);
        int int27 = periodType21.indexOf(durationFieldType24);
        mutableDateTime5.add(durationFieldType24, 0);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime5.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundCeiling();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) (short) 1, chronology33);
        java.lang.String str35 = localDate34.toString();
        org.joda.time.LocalDate localDate37 = localDate34.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) (short) 1, chronology39);
        java.lang.String str41 = localDate40.toString();
        org.joda.time.LocalDate localDate43 = localDate40.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property44 = localDate40.weekOfWeekyear();
        org.joda.time.DateTime dateTime45 = localDate40.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone47 = dateMidnight46.getZone();
        boolean boolean49 = dateTimeZone47.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime50 = dateTime45.withZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime dateTime51 = localDate37.toDateTimeAtStartOfDay(dateTimeZone47);
        mutableDateTime31.setZoneRetainFields(dateTimeZone47);
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) 865, dateTimeZone47);
        org.joda.time.DateTime dateTime54 = dateTime1.withZone(dateTimeZone47);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime54", (dateTime1.compareTo(dateTime54) == 0) == dateTime1.equals(dateTime54));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight8.withMillis((long) ' ');
        int int14 = dateMidnight13.getYear();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.minus((long) 32769);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.year();
        org.joda.time.DateMidnight dateMidnight18 = property17.roundFloorCopy();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime20.copy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        mutableDateTime21.setZone(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.minuteOfDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 1, chronology26);
        java.lang.String str28 = localDate27.toString();
        org.joda.time.LocalDate localDate30 = localDate27.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.eras();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.year();
        mutableDateTime21.setChronology(chronology31);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime21.hourOfDay();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime21.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getRangeDurationType();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime21.property(dateTimeFieldType37);
        org.joda.time.DateMidnight.Property property40 = dateMidnight18.property(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and mutableDateTime21", (mutableDateTime20.compareTo(mutableDateTime21) == 0) == mutableDateTime20.equals(mutableDateTime21));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(53618333);
        org.joda.time.DateTime dateTime8 = dateTime4.plusSeconds((int) (byte) -1);
        org.joda.time.DateTime.Property property9 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime11 = dateTime4.minusMonths(53659661);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate localDate20 = localDate17.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (short) 1, chronology21);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay22.plusMonths(53617719);
        int int25 = yearMonthDay22.getDayOfMonth();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 1, chronology27);
        java.lang.String str29 = localDate28.toString();
        org.joda.time.LocalDate localDate31 = localDate28.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay22.withChronologyRetainFields(chronology32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj13, chronology32);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(0L, chronology32);
        boolean boolean37 = dateTime4.isEqual((org.joda.time.ReadableInstant) mutableDateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime35", (dateTime0.compareTo(dateTime35) == 0) == dateTime0.equals(dateTime35));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType4.getField(chronology11);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology11);
        org.joda.time.Period period15 = new org.joda.time.Period((long) (-1), periodType3, chronology11);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        java.lang.String str19 = localDate18.toString();
        org.joda.time.LocalDate localDate21 = localDate18.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 53643546, periodType3, chronology22);
        org.joda.time.PeriodType periodType25 = periodType3.withDaysRemoved();
        org.joda.time.Period period26 = new org.joda.time.Period((long) 12, periodType25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 1, chronology28);
        java.lang.String str30 = localDate29.toString();
        org.joda.time.LocalDate localDate32 = localDate29.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(readableDuration34, readableInstant35, periodType36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutablePeriod37.add(readableDuration38);
        mutablePeriod37.addYears((int) (short) 100);
        java.lang.Object obj42 = mutablePeriod37.clone();
        mutablePeriod37.setSeconds(904);
        org.joda.time.LocalDate localDate45 = localDate32.minus((org.joda.time.ReadablePeriod) mutablePeriod37);
        int int46 = localDate32.getYearOfEra();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime48.copy();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        mutableDateTime49.setZone(dateTimeZone50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime49.minuteOfDay();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime56 = dateTime53.withFieldAdded(durationFieldType54, (int) (byte) 0);
        mutableDateTime49.add(durationFieldType54, 8);
        boolean boolean59 = localDate32.isSupported(durationFieldType54);
        int int60 = periodType25.indexOf(durationFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime48", (dateTime14.compareTo(mutableDateTime48) == 0) == dateTime14.equals(mutableDateTime48));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType3 = periodType2.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        mutableDateTime6.add(durationFieldType7, (int) (byte) 0);
        int int10 = periodType4.indexOf(durationFieldType7);
        boolean boolean11 = periodType2.isSupported(durationFieldType7);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        mutableDateTime13.addMinutes(0);
        java.lang.String str17 = mutableDateTime13.toString();
        int int18 = mutableDateTime13.getYearOfEra();
        org.joda.time.Chronology chronology19 = mutableDateTime13.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 53644667, (long) (byte) 100, periodType2, chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = chronology19.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField23, and durationField20", !(durationField20.compareTo(durationField23) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField23.compareTo(durationField20))));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        java.util.Date date2 = dateTime1.toDate();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        int int6 = localDate5.getDayOfYear();
        org.joda.time.LocalTime localTime7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate5.toDateTime(localTime7, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = localDate5.toDateMidnight(dateTimeZone10);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.yearOfEra();
        int int13 = dateMidnight11.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property14 = dateMidnight11.year();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.plusYears((int) ' ');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight11);
        org.joda.time.LocalDate.Property property18 = localDate17.dayOfYear();
        org.joda.time.Chronology chronology19 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DateTime dateTime21 = dateTime1.toDateTime(chronology19);
        org.joda.time.Period period22 = new org.joda.time.Period((long) 53653004, chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime21", (dateTime1.compareTo(dateTime21) == 0) == dateTime1.equals(dateTime21));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((-27422466L));
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableDuration4, readableInstant5, periodType6);
        mutablePeriod7.addYears((int) (byte) 0);
        int int10 = mutablePeriod7.getMonths();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableDuration11, readableInstant12, periodType13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutablePeriod14.add(readableDuration15);
        mutablePeriod14.addMonths((int) '#');
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 1, chronology20);
        int int22 = localDate21.getDayOfYear();
        org.joda.time.LocalTime localTime23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate21.toDateTime(localTime23, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = localDate21.toDateMidnight(dateTimeZone26);
        org.joda.time.DateMidnight.Property property28 = dateMidnight27.yearOfEra();
        int int29 = dateMidnight27.getMinuteOfHour();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (byte) 100, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime34.copy();
        org.joda.time.Duration duration36 = period32.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight27.plus((org.joda.time.ReadableDuration) duration36);
        mutablePeriod14.add((org.joda.time.ReadableDuration) duration36);
        mutablePeriod7.setPeriod((org.joda.time.ReadableDuration) duration36);
        java.lang.String str40 = duration36.toString();
        org.joda.time.Instant instant42 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration36, 53691414);
        org.joda.time.Chronology chronology43 = instant0.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime34", (instant0.compareTo(mutableDateTime34) == 0) == instant0.equals(mutableDateTime34));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withCenturyOfEra(1);
        org.joda.time.DateTime dateTime3 = dateMidnight2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime4 = dateMidnight2.toMutableDateTimeISO();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 100, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.copy();
        org.joda.time.Duration duration11 = period7.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.Seconds seconds12 = period7.toStandardSeconds();
        org.joda.time.Period period14 = period7.plusYears(0);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight2.withPeriodAdded((org.joda.time.ReadablePeriod) period7, 10);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology23);
        long long29 = chronology23.add((long) 891, (long) 6, 53678034);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((java.lang.Object) dateMidnight2, chronology23);
        org.joda.time.DateMidnight.Property property31 = dateMidnight2.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and mutableDateTime25", (mutableDateTime9.compareTo(mutableDateTime25) == 0) == mutableDateTime9.equals(mutableDateTime25));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 100, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableDuration5, readableInstant6, periodType7);
        mutablePeriod8.addYears((int) (byte) 0);
        int int11 = mutablePeriod8.getMonths();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableDuration12, readableInstant13, periodType14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutablePeriod15.add(readableDuration16);
        mutablePeriod15.addMonths((int) '#');
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 1, chronology21);
        int int23 = localDate22.getDayOfYear();
        org.joda.time.LocalTime localTime24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate22.toDateTime(localTime24, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = localDate22.toDateMidnight(dateTimeZone27);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.yearOfEra();
        int int30 = dateMidnight28.getMinuteOfHour();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (byte) 100, chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime35.copy();
        org.joda.time.Duration duration37 = period33.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight28.plus((org.joda.time.ReadableDuration) duration37);
        mutablePeriod15.add((org.joda.time.ReadableDuration) duration37);
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration37);
        mutablePeriod8.setMinutes(999);
        org.joda.time.Period period43 = period3.minus((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.DurationFieldType[] durationFieldTypeArray44 = period43.getFieldTypes();
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.forFields(durationFieldTypeArray44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 1, chronology48);
        java.lang.String str50 = localDate49.toString();
        org.joda.time.LocalDate localDate52 = localDate49.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology53 = localDate52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.yearOfEra();
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType46.getField(chronology53);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology53);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1921, periodType45, chronology53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime35 and dateTime56", (mutableDateTime35.compareTo(dateTime56) == 0) == mutableDateTime35.equals(dateTime56));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime2.copy();
        mutableDateTime2.addMinutes(0);
        java.lang.String str6 = mutableDateTime2.toString();
        int int7 = mutableDateTime2.getYearOfEra();
        org.joda.time.Chronology chronology8 = mutableDateTime2.getChronology();
        org.joda.time.Chronology chronology9 = mutableDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.centuryOfEra();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(0L, chronology9);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight12.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableDuration21, readableInstant22, periodType23);
        mutablePeriod24.setMillis(0);
        org.joda.time.LocalDate localDate27 = localDate19.plus((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.LocalDate localDate29 = localDate27.withWeekyear((int) ' ');
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone31 = dateMidnight30.getZone();
        boolean boolean33 = dateTimeZone31.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = localDate27.toDateTimeAtStartOfDay(dateTimeZone31);
        java.lang.String str36 = localDate27.toString();
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone38 = dateMidnight37.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = localDate27.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.DateTime.Property property41 = dateTime40.monthOfYear();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 1, chronology43);
        int int45 = localDate44.getDayOfYear();
        org.joda.time.LocalTime localTime46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDate44.toDateTime(localTime46, dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = localDate44.toDateMidnight(dateTimeZone49);
        org.joda.time.DateMidnight.Property property51 = dateMidnight50.yearOfEra();
        int int52 = dateMidnight50.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property53 = dateMidnight50.year();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight50.withMillis((long) ' ');
        int int56 = dateMidnight55.getYear();
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight55.minus((long) 32769);
        org.joda.time.DateMidnight.Property property59 = dateMidnight58.dayOfYear();
        org.joda.time.DateMidnight dateMidnight60 = property59.roundCeilingCopy();
        mutablePeriod11.setPeriod((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateMidnight60);
        mutablePeriod11.setDays(53905568);
        org.joda.time.Period period65 = org.joda.time.Period.minutes(988);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) period65);
        org.joda.time.format.DateTimePrinter dateTimePrinter68 = null;
        org.joda.time.format.DateTimeParser dateTimeParser69 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter68, dateTimeParser69);
        org.joda.time.format.DateTimeParser dateTimeParser71 = dateTimeFormatter70.getParser();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((long) (short) 1, chronology73);
        java.lang.String str75 = localDate74.toString();
        org.joda.time.LocalDate localDate77 = localDate74.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology78 = localDate77.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(chronology78);
        org.joda.time.DateTimeField dateTimeField81 = chronology78.era();
        org.joda.time.DateTimeField dateTimeField82 = chronology78.millisOfSecond();
        org.joda.time.DurationField durationField83 = chronology78.years();
        org.joda.time.LocalDate localDate84 = org.joda.time.LocalDate.now(chronology78);
        org.joda.time.MutableDateTime mutableDateTime85 = org.joda.time.MutableDateTime.now(chronology78);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter70.withChronology(chronology78);
        java.lang.String str87 = chronology78.toString();
        mutablePeriod11.add((long) 52980288, chronology78);
        org.joda.time.LocalTime localTime89 = org.joda.time.LocalTime.now(chronology78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime39 and mutableDateTime80", (mutableDateTime39.compareTo(mutableDateTime80) == 0) == mutableDateTime39.equals(mutableDateTime80));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        mutableDateTime1.setSecondOfDay(21);
        int int7 = mutableDateTime1.getDayOfMonth();
        mutableDateTime1.addSeconds(8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        int int13 = localDate12.getDayOfYear();
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTime(localTime14, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate12.toDateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.yearOfEra();
        int int20 = dateMidnight18.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property21 = dateMidnight18.year();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        long long25 = dateTimeField22.set(0L, 53629078);
        long long28 = dateTimeField22.set(0L, 53662339);
        int int30 = dateTimeField22.getMaximumValue((long) 53741688);
        mutableDateTime1.setRounding(dateTimeField22);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) (short) 1, chronology33);
        int int35 = localDate34.getDayOfYear();
        org.joda.time.LocalTime localTime36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDate34.toDateTime(localTime36, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime42 = dateTime38.withYear(53639477);
        org.joda.time.DateTime dateTime44 = dateTime42.minusWeeks(53636547);
        org.joda.time.DateTime dateTime46 = dateTime44.withHourOfDay(0);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Instant instant48 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant50 = instant48.minus((long) 751);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(chronology51);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime52.copy();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        mutableDateTime53.setZone(dateTimeZone54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime53.minuteOfDay();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime60 = dateTime57.withFieldAdded(durationFieldType58, (int) (byte) 0);
        mutableDateTime53.add(durationFieldType58, 8);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) (short) 1, chronology64);
        int int66 = localDate65.getDayOfYear();
        org.joda.time.LocalTime localTime67 = null;
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = localDate65.toDateTime(localTime67, dateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateMidnight dateMidnight71 = localDate65.toDateMidnight(dateTimeZone70);
        org.joda.time.DateMidnight.Property property72 = dateMidnight71.yearOfEra();
        int int73 = dateMidnight71.getMinuteOfHour();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((long) (byte) 100, chronology75);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(chronology77);
        org.joda.time.MutableDateTime mutableDateTime79 = mutableDateTime78.copy();
        org.joda.time.Duration duration80 = period76.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime79);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight71.plus((org.joda.time.ReadableDuration) duration80);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (byte) 100, chronology83);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime(chronology85);
        org.joda.time.MutableDateTime mutableDateTime87 = mutableDateTime86.copy();
        org.joda.time.Duration duration88 = period84.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime87);
        java.lang.String str89 = duration88.toString();
        boolean boolean90 = duration80.isShorterThan((org.joda.time.ReadableDuration) duration88);
        mutableDateTime53.add((org.joda.time.ReadableDuration) duration88);
        org.joda.time.Instant instant92 = instant50.plus((org.joda.time.ReadableDuration) duration88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant48", (mutableDateTime1.compareTo(instant48) == 0) == mutableDateTime1.equals(instant48));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        int int11 = dateMidnight8.getMonthOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate localDate20 = localDate17.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.eras();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) dateMidnight8, chronology21);
        org.joda.time.DateTime dateTime26 = dateTime24.minusYears(15);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 1, chronology28);
        java.lang.String str30 = localDate29.toString();
        org.joda.time.LocalDate localDate32 = localDate29.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        java.lang.String str36 = localDate35.toString();
        org.joda.time.LocalDate localDate38 = localDate35.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property39 = localDate35.weekOfWeekyear();
        org.joda.time.DateTime dateTime40 = localDate35.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone42 = dateMidnight41.getZone();
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime45 = dateTime40.withZoneRetainFields(dateTimeZone42);
        org.joda.time.DateTime dateTime46 = localDate32.toDateTimeAtStartOfDay(dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight47 = org.joda.time.DateMidnight.now(dateTimeZone42);
        long long49 = dateTimeZone42.convertUTCToLocal((long) 53628335);
        long long51 = dateTimeZone42.nextTransition((long) 53632562);
        org.joda.time.DateTime dateTime52 = dateTime24.toDateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime54 = dateTime52.plusMonths(53725998);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and dateTime24", (dateMidnight8.compareTo(dateTime24) == 0) == dateMidnight8.equals(dateTime24));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) (byte) 100, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime6.copy();
        org.joda.time.Duration duration8 = period4.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.getMutableDateTime();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, (long) 0, periodType13, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (byte) 100, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime20.copy();
        org.joda.time.Duration duration22 = period18.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(readableDuration23, readableInstant24, periodType25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutablePeriod26.add(readableDuration27);
        mutablePeriod26.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableDuration31, readableInstant32, periodType33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        mutablePeriod34.add(readableDuration35);
        mutablePeriod34.addMonths((int) '#');
        mutablePeriod26.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableDuration40, readableInstant41, periodType42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutablePeriod43.add(readableDuration44);
        mutablePeriod43.addMonths((int) '#');
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 1, chronology49);
        int int51 = localDate50.getDayOfYear();
        org.joda.time.LocalTime localTime52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate50.toDateTime(localTime52, dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = localDate50.toDateMidnight(dateTimeZone55);
        org.joda.time.DateMidnight.Property property57 = dateMidnight56.yearOfEra();
        int int58 = dateMidnight56.getMinuteOfHour();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((long) (byte) 100, chronology60);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(chronology62);
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime63.copy();
        org.joda.time.Duration duration65 = period61.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime64);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight56.plus((org.joda.time.ReadableDuration) duration65);
        mutablePeriod43.add((org.joda.time.ReadableDuration) duration65);
        mutablePeriod26.add((org.joda.time.ReadableDuration) duration65);
        mutableDateTime21.add((org.joda.time.ReadableDuration) duration65);
        mutablePeriod15.add((org.joda.time.ReadableDuration) duration65);
        mutableDateTime10.add((org.joda.time.ReadableDuration) duration65);
        org.joda.time.Instant instant72 = instant0.minus((org.joda.time.ReadableDuration) duration65);
        org.joda.time.DateTimeZone dateTimeZone73 = instant0.getZone();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate((long) (short) 1, chronology75);
        java.lang.String str77 = localDate76.toString();
        org.joda.time.LocalDate localDate79 = localDate76.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology80 = localDate79.getChronology();
        org.joda.time.DateTimeField dateTimeField81 = chronology80.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime(chronology80);
        org.joda.time.DateTimeField dateTimeField83 = chronology80.era();
        org.joda.time.DateTime dateTime84 = instant0.toDateTime(chronology80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime82", (mutableDateTime1.compareTo(mutableDateTime82) == 0) == mutableDateTime1.equals(mutableDateTime82));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType2.getField(chronology9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology9);
        org.joda.time.Period period13 = new org.joda.time.Period((long) (-1), periodType1, chronology9);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.centuryOfEra();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        int int18 = localDate17.getDayOfYear();
        org.joda.time.LocalDate.Property property19 = localDate17.yearOfEra();
        long long20 = property19.remainder();
        org.joda.time.LocalDate localDate21 = property19.getLocalDate();
        int int22 = localDate21.getDayOfMonth();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        int int27 = localDate26.getDayOfYear();
        org.joda.time.LocalDate.Property property28 = localDate26.weekOfWeekyear();
        org.joda.time.LocalDate localDate29 = property28.withMaximumValue();
        org.joda.time.LocalDate localDate30 = property28.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField31 = property28.getField();
        java.lang.String str33 = dateTimeField31.getAsShortText((long) 53878588);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 1, chronology35);
        java.lang.String str37 = localDate36.toString();
        org.joda.time.LocalDate localDate39 = localDate36.plusWeeks(773);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) (short) 1, chronology42);
        java.lang.String str44 = localDate43.toString();
        org.joda.time.LocalDate localDate46 = localDate43.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) 1, chronology47);
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay48.plusMonths(53617719);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(readableDuration51, readableInstant52, periodType53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        mutablePeriod54.add(readableDuration55);
        mutablePeriod54.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(readableDuration59, readableInstant60, periodType61);
        org.joda.time.ReadableDuration readableDuration63 = null;
        mutablePeriod62.add(readableDuration63);
        mutablePeriod62.addMonths((int) '#');
        mutablePeriod54.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod62);
        org.joda.time.YearMonthDay yearMonthDay68 = yearMonthDay50.plus((org.joda.time.ReadablePeriod) mutablePeriod62);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (byte) 100, chronology70);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(chronology72);
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime73.copy();
        org.joda.time.Duration duration75 = period71.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime74);
        org.joda.time.Seconds seconds76 = period71.toStandardSeconds();
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay68.minus((org.joda.time.ReadablePeriod) seconds76);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period((long) (byte) 100, chronology79);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime(chronology81);
        org.joda.time.MutableDateTime mutableDateTime83 = mutableDateTime82.copy();
        org.joda.time.Duration duration84 = period80.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime83);
        int int85 = period80.size();
        org.joda.time.format.PeriodFormatter periodFormatter86 = null;
        java.lang.String str87 = period80.toString(periodFormatter86);
        int int88 = period80.getSeconds();
        org.joda.time.YearMonthDay yearMonthDay90 = yearMonthDay68.withPeriodAdded((org.joda.time.ReadablePeriod) period80, 2);
        int[] intArray91 = yearMonthDay68.getValues();
        int int92 = dateTimeField31.getMaximumValue((org.joda.time.ReadablePartial) localDate36, intArray91);
        int[] intArray94 = dateTimeField14.addWrapPartial((org.joda.time.ReadablePartial) localDate21, 53915556, intArray91, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime73", (dateTime12.compareTo(mutableDateTime73) == 0) == dateTime12.equals(mutableDateTime73));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.lang.String str4 = locale3.getCountry();
        java.lang.String str5 = locale3.getDisplayVariant();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale6.getDisplayLanguage(locale7);
        java.lang.String str10 = locale3.getDisplayLanguage(locale6);
        java.lang.String str13 = nameProvider0.getName(locale6, "14:54:16.800", "2022-02-21T14:53:56.547");
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate localDate20 = localDate17.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (short) 1, chronology21);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay22.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone26 = dateMidnight25.getZone();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 1, chronology28);
        java.lang.String str30 = localDate29.toString();
        org.joda.time.LocalDate localDate32 = localDate29.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight25.withFields((org.joda.time.ReadablePartial) localDate32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight25.withField(dateTimeFieldType34, 842);
        org.joda.time.YearMonthDay.Property property37 = yearMonthDay22.property(dateTimeFieldType34);
        org.joda.time.YearMonthDay.Property property38 = yearMonthDay22.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay40 = property38.addWrapFieldToCopy(15);
        org.joda.time.DurationField durationField41 = property38.getRangeDurationField();
        org.joda.time.DurationField durationField42 = property38.getRangeDurationField();
        int int43 = property38.get();
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder47 = builder44.setExtension('a', "IT");
        java.util.Locale.Builder builder49 = builder44.addUnicodeLocaleAttribute("1970");
        java.util.Locale.Builder builder50 = builder49.clearExtensions();
        java.util.Locale.Builder builder51 = builder50.clear();
        java.util.Locale locale52 = java.util.Locale.UK;
        java.lang.String str53 = locale52.getDisplayScript();
        java.util.Locale.Builder builder54 = builder51.setLocale(locale52);
        java.lang.String str55 = locale52.getScript();
        int int56 = property38.getMaximumTextLength(locale52);
        java.lang.String str59 = nameProvider0.getShortName(locale52, "2022-02-21T14:54:19.223Z", "2022-02-21T14:56:56.709Z");
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) (short) 1, chronology64);
        java.lang.String str66 = localDate65.toString();
        org.joda.time.LocalDate localDate68 = localDate65.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology69 = localDate68.getChronology();
        org.joda.time.DurationField durationField70 = chronology69.eras();
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology69);
        org.joda.time.DateTimeField dateTimeField72 = chronology69.secondOfDay();
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.LocalDate localDate78 = new org.joda.time.LocalDate((long) (short) 1, chronology77);
        java.lang.String str79 = localDate78.toString();
        org.joda.time.LocalDate localDate81 = localDate78.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology82 = localDate81.getChronology();
        org.joda.time.DurationField durationField83 = chronology82.eras();
        org.joda.time.LocalDate localDate84 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology82);
        java.util.Locale locale86 = java.util.Locale.ITALY;
        java.lang.String str87 = locale86.getDisplayLanguage();
        java.lang.String str88 = dateTimeField72.getAsText((org.joda.time.ReadablePartial) localDate84, 53649612, locale86);
        java.lang.String str91 = nameProvider0.getName(locale86, "2022-02-21T14:56:08.925", "");
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField41 and durationField70", Math.signum(durationField41.compareTo(durationField70)) == -Math.signum(durationField70.compareTo(durationField41)));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        int int11 = dateMidnight8.getMonthOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate localDate20 = localDate17.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.eras();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) dateMidnight8, chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and dateTime24", (dateMidnight8.compareTo(dateTime24) == 0) == dateMidnight8.equals(dateTime24));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Instant instant16 = instant4.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.DateTime dateTime17 = instant4.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime18 = instant4.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime8", (instant4.compareTo(mutableDateTime8) == 0) == instant4.equals(mutableDateTime8));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withEra(0);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(periodType6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) periodType6, dateTimeZone8);
        int int10 = localDateTime9.getDayOfMonth();
        int int11 = localDateTime9.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.weekyear();
        java.lang.String str13 = localDateTime9.toString();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plusMinutes(53619708);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.plusDays(53626705);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 342, 47541L, periodType20);
        org.joda.time.Period period23 = period21.minusWeeks(11);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.hours();
        mutableDateTime25.add(durationFieldType26, (int) (byte) 0);
        int int29 = period21.get(durationFieldType26);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime17.plus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime17.minusYears(53696579);
        org.joda.time.Chronology chronology33 = localDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = dateMidnight5.toMutableDateTime(chronology33);
        org.joda.time.Period period35 = new org.joda.time.Period(0L, 0L, chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and mutableDateTime34", (dateMidnight5.compareTo(mutableDateTime34) == 0) == dateMidnight5.equals(mutableDateTime34));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 100, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.Duration duration16 = period12.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology18);
        mutableDateTime19.addMinutes(904);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localTime24.toDateTimeToday(dateTimeZone25);
        org.joda.time.Instant instant27 = dateTime26.toInstant();
        int int28 = dateTime26.getEra();
        int int29 = dateTime26.getHourOfDay();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay30.withFieldAdded(durationFieldType33, 53625645);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay30.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property38 = timeOfDay30.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay39 = property38.withMinimumValue();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, (long) 0, periodType42, chronology43);
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay39.minus((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.PeriodType periodType46 = mutablePeriod44.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime26, periodType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant27", (dateTime5.compareTo(instant27) == 0) == dateTime5.equals(instant27));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(53639477);
        org.joda.time.DateTime dateTime12 = dateTime10.minusWeeks(53636547);
        org.joda.time.DateTime.Property property13 = dateTime10.era();
        org.joda.time.DateTime dateTime15 = dateTime10.minus(41676L);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime17 = instant16.toMutableDateTimeISO();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) (byte) 100, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.copy();
        org.joda.time.Duration duration24 = period20.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.getMutableDateTime();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, (long) 0, periodType29, chronology30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (byte) 100, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime36.copy();
        org.joda.time.Duration duration38 = period34.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableDuration39, readableInstant40, periodType41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        mutablePeriod42.add(readableDuration43);
        mutablePeriod42.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(readableDuration47, readableInstant48, periodType49);
        org.joda.time.ReadableDuration readableDuration51 = null;
        mutablePeriod50.add(readableDuration51);
        mutablePeriod50.addMonths((int) '#');
        mutablePeriod42.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(readableDuration56, readableInstant57, periodType58);
        org.joda.time.ReadableDuration readableDuration60 = null;
        mutablePeriod59.add(readableDuration60);
        mutablePeriod59.addMonths((int) '#');
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((long) (short) 1, chronology65);
        int int67 = localDate66.getDayOfYear();
        org.joda.time.LocalTime localTime68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = localDate66.toDateTime(localTime68, dateTimeZone69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = localDate66.toDateMidnight(dateTimeZone71);
        org.joda.time.DateMidnight.Property property73 = dateMidnight72.yearOfEra();
        int int74 = dateMidnight72.getMinuteOfHour();
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period((long) (byte) 100, chronology76);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(chronology78);
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime79.copy();
        org.joda.time.Duration duration81 = period77.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime80);
        org.joda.time.DateMidnight dateMidnight82 = dateMidnight72.plus((org.joda.time.ReadableDuration) duration81);
        mutablePeriod59.add((org.joda.time.ReadableDuration) duration81);
        mutablePeriod42.add((org.joda.time.ReadableDuration) duration81);
        mutableDateTime37.add((org.joda.time.ReadableDuration) duration81);
        mutablePeriod31.add((org.joda.time.ReadableDuration) duration81);
        mutableDateTime26.add((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Instant instant88 = instant16.minus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.DateTime dateTime89 = dateTime10.plus((org.joda.time.ReadableDuration) duration81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime17", (instant16.compareTo(mutableDateTime17) == 0) == instant16.equals(mutableDateTime17));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Instant instant16 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant18 = instant4.plus((long) 32770);
        org.joda.time.Instant instant19 = instant4.toInstant();
        org.joda.time.Instant instant22 = instant4.withDurationAdded((long) 317, 397);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant4", (mutableDateTime8.compareTo(instant4) == 0) == mutableDateTime8.equals(instant4));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay8.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay26 = property24.addWrapFieldToCopy(15);
        org.joda.time.YearMonthDay yearMonthDay28 = property24.addToCopy(53646133);
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay28.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay28.plusYears(52);
        org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay31.minusDays(363);
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 1, chronology38);
        java.lang.String str40 = localDate39.toString();
        org.joda.time.LocalDate localDate42 = localDate39.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfEra();
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType36.getField(chronology43);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(chronology43);
        org.joda.time.Period period47 = new org.joda.time.Period((long) (-1), periodType35, chronology43);
        org.joda.time.Period period49 = period47.minusMinutes(53695701);
        org.joda.time.Minutes minutes50 = period49.toStandardMinutes();
        org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay31.withPeriodAdded((org.joda.time.ReadablePeriod) minutes50, 53946779);
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType56 = periodType55.withMonthsRemoved();
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.hours();
        mutableDateTime59.add(durationFieldType60, (int) (byte) 0);
        int int63 = periodType57.indexOf(durationFieldType60);
        boolean boolean64 = periodType55.isSupported(durationFieldType60);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(chronology65);
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime66.copy();
        mutableDateTime66.addMinutes(0);
        java.lang.String str70 = mutableDateTime66.toString();
        int int71 = mutableDateTime66.getYearOfEra();
        org.joda.time.Chronology chronology72 = mutableDateTime66.getChronology();
        org.joda.time.DurationField durationField73 = chronology72.eras();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) 53644667, (long) (byte) 100, periodType55, chronology72);
        mutablePeriod74.add((long) 53795359);
        org.joda.time.YearMonthDay yearMonthDay78 = yearMonthDay52.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod74, 354);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and mutableDateTime66", (dateTime46.compareTo(mutableDateTime66) == 0) == dateTime46.equals(mutableDateTime66));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime1 = timeOfDay0.toDateTimeToday();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = timeOfDay0.getFieldType(0);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.minusMillis(18);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay0.hourOfDay();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 792);
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.DateTime dateTime10 = timeOfDay0.toDateTime((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime9", (instant8.compareTo(dateTime9) == 0) == instant8.equals(dateTime9));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime3.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis(53618333);
        org.joda.time.DateTime dateTime9 = dateTime5.plusSeconds((int) (byte) -1);
        org.joda.time.DateTime.Property property10 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property11 = dateTime5.monthOfYear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) 1, chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) 100, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime25.copy();
        org.joda.time.Duration duration27 = period23.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.Seconds seconds28 = period23.toStandardSeconds();
        org.joda.time.Period period30 = period23.plusYears(0);
        org.joda.time.Period period32 = period23.withHours(53617440);
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay20.withPeriodAdded((org.joda.time.ReadablePeriod) period32, (-53617748));
        org.joda.time.Period period36 = org.joda.time.Period.minutes(598);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay20.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay20.plusYears(23);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = yearMonthDay39.getFieldTypes();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 100, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime45.copy();
        org.joda.time.Duration duration47 = period43.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.Period period49 = period43.plusDays((int) (byte) 10);
        int int50 = period49.getWeeks();
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay39.plus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Chronology chronology52 = yearMonthDay51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime5.toMutableDateTime(chronology52);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate(12248L, chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime53", (dateTime5.compareTo(mutableDateTime53) == 0) == dateTime5.equals(mutableDateTime53));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.era();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        java.lang.String str14 = localDate13.toString();
        org.joda.time.LocalDate localDate16 = localDate13.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.eras();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology17.getZone();
        java.util.Locale locale23 = new java.util.Locale("UTC", "2022-02-21T14:53:49.549Z");
        java.lang.String str24 = locale23.getCountry();
        java.lang.String str26 = locale23.getExtension('x');
        java.lang.String str27 = dateTimeZone19.getShortName((long) 52, locale23);
        java.lang.String str28 = dateTimeField9.getAsShortText((long) 53617440, locale23);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        int int32 = localDate31.getDayOfYear();
        org.joda.time.LocalTime localTime33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate31.toDateTime(localTime33, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusYears((int) (short) 10);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime39.copy();
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone42 = dateMidnight41.getZone();
        mutableDateTime39.setZoneRetainFields(dateTimeZone42);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((java.lang.Object) dateTime37, dateTimeZone42);
        org.joda.time.LocalDate localDate46 = localDate44.plusDays(53634384);
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone49 = dateMidnight48.getZone();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) (short) 1, chronology51);
        java.lang.String str53 = localDate52.toString();
        org.joda.time.LocalDate localDate55 = localDate52.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight48.withFields((org.joda.time.ReadablePartial) localDate55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.LocalDate.Property property58 = localDate55.property(dateTimeFieldType57);
        org.joda.time.LocalDate localDate59 = property58.getLocalDate();
        org.joda.time.LocalDate localDate60 = property58.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField61 = property58.getField();
        java.util.Locale locale63 = java.util.Locale.KOREA;
        java.lang.String str64 = locale63.getISO3Country();
        java.lang.String str65 = dateTimeField61.getAsShortText((long) 771, locale63);
        java.lang.String str66 = dateTimeField9.getAsShortText((org.joda.time.ReadablePartial) localDate46, locale63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime39", (mutableDateTime8.compareTo(mutableDateTime39) == 0) == mutableDateTime8.equals(mutableDateTime39));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder12 = builder7.setTimeOfDay(53626727, 0, 53628444, (int) ' ');
        java.util.Calendar.Builder builder16 = builder7.setWeekDate(53640196, 780, 53668755);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        timeZone18.setID("1970-01-01");
        boolean boolean21 = timeZone18.observesDaylightTime();
        boolean boolean22 = timeZone18.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone18);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone18);
        int int25 = timeZone18.getRawOffset();
        java.util.Locale locale28 = new java.util.Locale("ISOChronology[UTC]", "2022-02-21T14:56:16.986");
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone18, locale28);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone18);
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        timeZone32.setID("1970-01-01");
        int int36 = timeZone32.getOffset((long) 53667278);
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone32);
        calendar30.setTimeZone(timeZone32);
        java.util.Calendar.Builder builder39 = builder7.setTimeZone(timeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar29", (calendar24.compareTo(calendar29) == 0) == calendar24.equals(calendar29));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(53639477);
        org.joda.time.DateTime dateTime12 = dateTime10.minusWeeks(53636547);
        org.joda.time.DateTime dateTime13 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime10.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property15 = dateTime10.dayOfMonth();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        int int19 = localDate18.getDayOfYear();
        org.joda.time.LocalTime localTime20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate18.toDateTime(localTime20, dateTimeZone21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.copy();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        mutableDateTime25.setZone(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime25.minuteOfDay();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime32 = dateTime29.withFieldAdded(durationFieldType30, (int) (byte) 0);
        mutableDateTime25.add(durationFieldType30, 8);
        org.joda.time.LocalDate localDate36 = localDate18.withFieldAdded(durationFieldType30, 3);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 1, chronology38);
        int int40 = localDate39.getDayOfYear();
        org.joda.time.LocalTime localTime41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localDate39.toDateTime(localTime41, dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = localDate39.toDateMidnight(dateTimeZone44);
        org.joda.time.LocalDate localDate47 = localDate39.withYear(53619770);
        int int48 = localDate18.compareTo((org.joda.time.ReadablePartial) localDate39);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 1, chronology50);
        java.lang.String str52 = localDate51.toString();
        org.joda.time.LocalDate localDate54 = localDate51.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property55 = localDate51.weekOfWeekyear();
        org.joda.time.DateTime dateTime56 = localDate51.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone58 = dateMidnight57.getZone();
        boolean boolean60 = dateTimeZone58.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime61 = dateTime56.withZoneRetainFields(dateTimeZone58);
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(dateTimeZone58);
        org.joda.time.DateTime dateTime63 = localDate18.toDateTimeAtMidnight(dateTimeZone58);
        long long66 = dateTimeZone58.convertLocalToUTC((long) 0, false);
        long long70 = dateTimeZone58.convertLocalToUTC((-59011459199999L), true, (long) 212400000);
        java.lang.String str71 = dateTimeZone58.toString();
        org.joda.time.DateTime dateTime72 = dateTime10.withZone(dateTimeZone58);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.lang.String str74 = dateTimeFieldType73.getName();
        java.lang.String str75 = dateTimeFieldType73.getName();
        org.joda.time.Instant instant76 = new org.joda.time.Instant();
        org.joda.time.Instant instant78 = instant76.withMillis((-27422466L));
        org.joda.time.Chronology chronology79 = instant76.getChronology();
        org.joda.time.DateTimeField dateTimeField80 = chronology79.clockhourOfHalfday();
        boolean boolean81 = dateTimeFieldType73.isSupported(chronology79);
        boolean boolean82 = dateTime10.isSupported(dateTimeFieldType73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and instant76", (mutableDateTime24.compareTo(instant76) == 0) == mutableDateTime24.equals(instant76));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 359);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfSecond();
        org.joda.time.DurationField durationField13 = chronology8.years();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology8);
        org.joda.time.DateTime dateTime15 = dateTime1.withChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField16 = chronology8.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime15", (dateTime1.compareTo(dateTime15) == 0) == dateTime1.equals(dateTime15));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalTime localTime3 = localTime0.plusHours((int) (short) 1);
        org.joda.time.DateTime dateTime4 = localTime0.toDateTimeToday();
        org.joda.time.DateTime dateTime6 = dateTime4.minusMonths(0);
        org.joda.time.Chronology chronology7 = dateTime4.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.eras();
        org.joda.time.DurationField durationField9 = chronology7.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(53618165);
        java.lang.String str14 = dateTime10.toString("14:53:45.116");
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withCenturyOfEra(32770);
        org.joda.time.DateTime dateTime19 = dateTime17.plus((long) 53679033);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 1, chronology24);
        java.lang.String str26 = localDate25.toString();
        org.joda.time.LocalDate localDate28 = localDate25.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.yearOfEra();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType22.getField(chronology29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (byte) 100, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime36.copy();
        org.joda.time.Duration duration38 = period34.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.Period period40 = period34.plusDays((int) (byte) 10);
        int int41 = period40.getHours();
        org.joda.time.Period period43 = period40.plusMonths(2);
        org.joda.time.Period period45 = period40.minusMonths(12);
        org.joda.time.Period period47 = period40.withYears(2057);
        int[] intArray49 = chronology29.get((org.joda.time.ReadablePeriod) period47, 259200000L);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(19399L, 0L, chronology29);
        org.joda.time.DateTime dateTime51 = dateTime17.withChronology(chronology29);
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime51", (dateTime17.compareTo(dateTime51) == 0) == dateTime17.equals(dateTime51));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime1 = timeOfDay0.toDateTimeToday();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = timeOfDay0.getFieldType(0);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.minusMillis(18);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay0.hourOfDay();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 792);
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.DateTime dateTime10 = timeOfDay0.toDateTime((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime9", (instant8.compareTo(dateTime9) == 0) == instant8.equals(dateTime9));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        java.lang.String str5 = mutableDateTime1.toString();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        boolean boolean16 = dateTimeZone14.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now(dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 53628506, dateTimeZone14);
        mutableDateTime1.setZoneRetainFields(dateTimeZone14);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) 100, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime25.copy();
        org.joda.time.Duration duration27 = period23.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime26);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration27, 53625309);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 1, chronology35);
        java.lang.String str37 = localDate36.toString();
        org.joda.time.LocalDate localDate39 = localDate36.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.eras();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology40);
        org.joda.time.DateTimeField dateTimeField43 = chronology40.secondOfDay();
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(obj30, chronology40);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime1.toMutableDateTime(chronology40);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 1, chronology49);
        java.lang.String str51 = localDate50.toString();
        org.joda.time.LocalDate localDate53 = localDate50.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(533L, chronology54);
        org.joda.time.Chronology chronology56 = chronology54.withUTC();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 53777510, chronology56);
        int[] intArray60 = chronology40.get((org.joda.time.ReadablePeriod) mutablePeriod57, 2535983643405L, (long) 53703928);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime45", (mutableDateTime1.compareTo(mutableDateTime45) == 0) == mutableDateTime1.equals(mutableDateTime45));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.year();
        java.lang.String str13 = chronology9.toString();
        org.joda.time.DurationField durationField14 = chronology9.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField14, and durationField10", !(durationField10.compareTo(durationField14) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField14.compareTo(durationField10))));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.dayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        int[] intArray17 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod14, (long) (-292275054), (long) 53637942);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) (byte) 100, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.copy();
        org.joda.time.Duration duration24 = period20.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((-1), 53620134, (int) (byte) -1, 53617719, (int) (byte) 100, 53619079, 1, 53);
        org.joda.time.Period period34 = period20.minus((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.Period period36 = period34.plusSeconds(2);
        int[] intArray38 = chronology7.get((org.joda.time.ReadablePeriod) period36, (long) 53656402);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime22", (dateTime10.compareTo(mutableDateTime22) == 0) == dateTime10.equals(mutableDateTime22));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (byte) 100, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.copy();
        org.joda.time.Duration duration18 = period14.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.Period period20 = period14.plusDays((int) (byte) 10);
        org.joda.time.Period period22 = period14.minusMillis(0);
        org.joda.time.Period period24 = period14.plusMillis(53644151);
        org.joda.time.Period period26 = period24.withMillis(32769);
        org.joda.time.Period period28 = period24.multipliedBy((int) (short) 0);
        org.joda.time.Period period29 = period24.negated();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.years();
        java.lang.String str32 = periodType31.getName();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType31);
        org.joda.time.PeriodType periodType34 = periodType31.withYearsRemoved();
        org.joda.time.PeriodType periodType35 = periodType34.withHoursRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 1, chronology38);
        java.lang.String str40 = localDate39.toString();
        org.joda.time.LocalDate localDate42 = localDate39.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfEra();
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType36.getField(chronology43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (byte) 100, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime50.copy();
        org.joda.time.Duration duration52 = period48.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.Period period54 = period48.plusDays((int) (byte) 10);
        int int55 = period54.getHours();
        org.joda.time.Period period57 = period54.plusMonths(2);
        org.joda.time.Period period59 = period54.minusMonths(12);
        org.joda.time.Period period61 = period54.withYears(2057);
        int[] intArray63 = chronology43.get((org.joda.time.ReadablePeriod) period61, 259200000L);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate(chronology43);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod(24815L, periodType34, chronology43);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(chronology66);
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime67.copy();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        mutableDateTime68.setZone(dateTimeZone69);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate((long) (short) 1, chronology72);
        int int74 = localDate73.getDayOfYear();
        org.joda.time.LocalTime localTime75 = null;
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = localDate73.toDateTime(localTime75, dateTimeZone76);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateMidnight dateMidnight79 = localDate73.toDateMidnight(dateTimeZone78);
        org.joda.time.DateMidnight.Property property80 = dateMidnight79.yearOfEra();
        int int81 = dateMidnight79.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property82 = dateMidnight79.year();
        boolean boolean83 = mutableDateTime68.isBefore((org.joda.time.ReadableInstant) dateMidnight79);
        org.joda.time.PeriodType periodType84 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType87 = org.joda.time.DurationFieldType.hours();
        mutableDateTime86.add(durationFieldType87, (int) (byte) 0);
        int int90 = periodType84.indexOf(durationFieldType87);
        mutableDateTime68.add(durationFieldType87, 0);
        int int93 = mutablePeriod65.get(durationFieldType87);
        org.joda.time.Period period95 = period29.withFieldAdded(durationFieldType87, 53851347);
        int[] intArray97 = chronology6.get((org.joda.time.ReadablePeriod) period29, 3417627651010636L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and mutableDateTime16", (mutableDateTime9.compareTo(mutableDateTime16) == 0) == mutableDateTime9.equals(mutableDateTime16));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Instant instant16 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant18 = instant4.plus((long) 32770);
        org.joda.time.Instant instant19 = instant4.toInstant();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, (long) 0, periodType22, chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) 100, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime29.copy();
        org.joda.time.Duration duration31 = period27.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableDuration32, readableInstant33, periodType34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutablePeriod35.add(readableDuration36);
        mutablePeriod35.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableDuration40, readableInstant41, periodType42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutablePeriod43.add(readableDuration44);
        mutablePeriod43.addMonths((int) '#');
        mutablePeriod35.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(readableDuration49, readableInstant50, periodType51);
        org.joda.time.ReadableDuration readableDuration53 = null;
        mutablePeriod52.add(readableDuration53);
        mutablePeriod52.addMonths((int) '#');
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) (short) 1, chronology58);
        int int60 = localDate59.getDayOfYear();
        org.joda.time.LocalTime localTime61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = localDate59.toDateTime(localTime61, dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateMidnight dateMidnight65 = localDate59.toDateMidnight(dateTimeZone64);
        org.joda.time.DateMidnight.Property property66 = dateMidnight65.yearOfEra();
        int int67 = dateMidnight65.getMinuteOfHour();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period((long) (byte) 100, chronology69);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(chronology71);
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime72.copy();
        org.joda.time.Duration duration74 = period70.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime73);
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight65.plus((org.joda.time.ReadableDuration) duration74);
        mutablePeriod52.add((org.joda.time.ReadableDuration) duration74);
        mutablePeriod35.add((org.joda.time.ReadableDuration) duration74);
        mutableDateTime30.add((org.joda.time.ReadableDuration) duration74);
        mutablePeriod24.add((org.joda.time.ReadableDuration) duration74);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.Duration duration81 = mutablePeriod24.toDurationTo(readableInstant80);
        org.joda.time.Duration duration82 = duration81.toDuration();
        org.joda.time.Period period83 = duration82.toPeriod();
        org.joda.time.Instant instant84 = instant4.plus((org.joda.time.ReadableDuration) duration82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant4", (mutableDateTime8.compareTo(instant4) == 0) == mutableDateTime8.equals(instant4));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.DateTime dateTime9 = instant4.toDateTime();
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime8", (instant4.compareTo(mutableDateTime8) == 0) == instant4.equals(mutableDateTime8));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("55");
        int int2 = mutableDateTime1.getYearOfEra();
        org.joda.time.Instant instant3 = mutableDateTime1.toInstant();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay5.withFieldAdded(durationFieldType8, 53625645);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay5.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property13 = timeOfDay5.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay14 = property13.withMaximumValue();
        int int15 = property13.get();
        org.joda.time.DateTimeField dateTimeField16 = property13.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property13.getFieldType();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property19 = localTime18.minuteOfHour();
        org.joda.time.LocalTime localTime20 = property19.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds(53628444);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType17.getField(chronology23);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((long) 20, chronology23);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((java.lang.Object) mutableDateTime1, chronology23);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (byte) 100, chronology28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime31.copy();
        org.joda.time.Duration duration33 = period29.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime32);
        int int34 = period29.size();
        org.joda.time.format.PeriodFormatter periodFormatter35 = null;
        java.lang.String str36 = period29.toString(periodFormatter35);
        int int37 = period29.getSeconds();
        org.joda.time.format.DateTimePrinter dateTimePrinter39 = null;
        org.joda.time.format.DateTimeParser dateTimeParser40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter39, dateTimeParser40);
        boolean boolean42 = dateTimeFormatter41.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter41.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone46 = dateMidnight45.getZone();
        boolean boolean48 = dateTimeZone46.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.now(dateTimeZone46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter44.withZone(dateTimeZone46);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 53628506, dateTimeZone46);
        boolean boolean52 = period29.equals((java.lang.Object) dateTimeZone46);
        org.joda.time.Period period54 = period29.withYears(53626705);
        org.joda.time.Period period56 = period29.plusYears(53686960);
        int[] intArray58 = chronology23.get((org.joda.time.ReadablePeriod) period56, 884L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant3", (mutableDateTime1.compareTo(instant3) == 0) == mutableDateTime1.equals(instant3));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        timeZone1.setID("1970-01-01");
        boolean boolean4 = timeZone1.observesDaylightTime();
        boolean boolean5 = timeZone1.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone1);
        int int8 = timeZone1.getRawOffset();
        java.util.Locale locale11 = new java.util.Locale("ISOChronology[UTC]", "2022-02-21T14:56:16.986");
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone1, locale11);
        java.lang.String str13 = timeZone1.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar12", (calendar7.compareTo(calendar12) == 0) == calendar7.equals(calendar12));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime2.copy();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime3.setZone(dateTimeZone4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        int int9 = localDate8.getDayOfYear();
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate8.toDateTime(localTime10, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = localDate8.toDateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.yearOfEra();
        int int16 = dateMidnight14.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property17 = dateMidnight14.year();
        boolean boolean18 = mutableDateTime3.isBefore((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(53619988);
        mutableDateTime3.setZoneRetainFields(dateTimeZone21);
        mutableDateTime3.addMonths(736);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime26.copy();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone29 = dateMidnight28.getZone();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) (short) 1, chronology31);
        java.lang.String str33 = localDate32.toString();
        org.joda.time.LocalDate localDate35 = localDate32.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight28.withFields((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight28.withField(dateTimeFieldType37, 842);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight28.plus((long) (byte) -1);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone44 = dateMidnight43.getZone();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 1, chronology46);
        java.lang.String str48 = localDate47.toString();
        org.joda.time.LocalDate localDate50 = localDate47.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight43.withFields((org.joda.time.ReadablePartial) localDate50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight43.withField(dateTimeFieldType52, 842);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) (byte) 100, chronology56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime59.copy();
        org.joda.time.Duration duration61 = period57.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime60);
        org.joda.time.Period period63 = period57.plusDays((int) (byte) 10);
        org.joda.time.Duration duration64 = period63.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight43.minus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight41.plus((org.joda.time.ReadableDuration) duration64);
        mutableDateTime26.add((org.joda.time.ReadableDuration) duration64);
        mutableDateTime3.add((org.joda.time.ReadableDuration) duration64, 0);
        org.joda.time.Instant instant70 = instant0.plus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) 53646596);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.plusMonths(53618333);
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType76 = periodType75.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration64, (org.joda.time.ReadableInstant) dateMidnight72, periodType75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime2", (instant0.compareTo(mutableDateTime2) == 0) == instant0.equals(mutableDateTime2));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        long long5 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.dayOfWeek();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.monthOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.copy();
        mutableDateTime9.addMinutes(0);
        java.lang.String str13 = mutableDateTime9.toString();
        int int14 = mutableDateTime9.getYearOfEra();
        org.joda.time.Chronology chronology15 = mutableDateTime9.getChronology();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight3.withChronology(chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime23 = dateTime21.minusMillis(53618333);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableDuration24, readableInstant25, periodType26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutablePeriod27.add(readableDuration28);
        mutablePeriod27.addSeconds(53617440);
        org.joda.time.DateTime dateTime32 = dateTime21.plus((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.Chronology chronology33 = dateTime21.getChronology();
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight3.withChronology(chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.era();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(283L, chronology33);
        org.joda.time.LocalTime.Property property37 = localTime36.minuteOfHour();
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream40 = strSet39.parallelStream();
        boolean boolean41 = strSet39.isEmpty();
        org.joda.time.Instant instant42 = new org.joda.time.Instant();
        org.joda.time.Instant instant44 = instant42.withMillis((-27422466L));
        boolean boolean45 = strSet39.remove((java.lang.Object) instant42);
        org.joda.time.MutableDateTime mutableDateTime46 = instant42.toMutableDateTime();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property48 = localTime47.minuteOfHour();
        org.joda.time.LocalTime localTime50 = localTime47.withMillisOfSecond(904);
        org.joda.time.Period period52 = org.joda.time.Period.weeks((int) '4');
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.years();
        java.lang.String str54 = periodType53.getName();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(periodType53);
        org.joda.time.Period period56 = period52.plus((org.joda.time.ReadablePeriod) mutablePeriod55);
        org.joda.time.Period period57 = period52.negated();
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period60 = period57.withFieldAdded(durationFieldType58, 53646242);
        org.joda.time.LocalTime localTime62 = localTime50.withFieldAdded(durationFieldType58, 53625309);
        mutableDateTime46.add(durationFieldType58, 53687);
        boolean boolean65 = localTime36.isSupported(durationFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant42", (mutableDateTime9.compareTo(instant42) == 0) == mutableDateTime9.equals(instant42));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.withFieldAdded(durationFieldType3, 53625645);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property8 = timeOfDay0.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = property8.withMaximumValue();
        int int10 = property8.get();
        org.joda.time.DateTimeField dateTimeField11 = property8.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property8.getFieldType();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        mutableDateTime15.addMinutes(0);
        java.lang.String str19 = mutableDateTime15.toString();
        int int20 = mutableDateTime15.getYearOfEra();
        org.joda.time.Chronology chronology21 = mutableDateTime15.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.minuteOfDay();
        org.joda.time.DurationField durationField24 = durationFieldType13.getField(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField24, and durationField22", !(durationField22.compareTo(durationField24) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField24.compareTo(durationField22))));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 14, chronology7);
        org.joda.time.LocalDate localDate12 = localDate10.minusMonths(15);
        org.joda.time.DateTime dateTime13 = localDate10.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime13.minusWeeks(58103655);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableDuration17, readableInstant18, periodType19);
        mutablePeriod20.addYears((int) (byte) 0);
        int int23 = mutablePeriod20.getMonths();
        int int24 = mutablePeriod20.getSeconds();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) 100, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime29.copy();
        org.joda.time.Duration duration31 = period27.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((-1), 53620134, (int) (byte) -1, 53617719, (int) (byte) 100, 53619079, 1, 53);
        org.joda.time.Period period41 = period27.minus((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.Period period43 = period41.plusSeconds(2);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(readableDuration44, readableInstant45, periodType46);
        mutablePeriod47.addYears((int) (byte) 0);
        int int50 = mutablePeriod47.getMonths();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(readableDuration51, readableInstant52, periodType53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        mutablePeriod54.add(readableDuration55);
        mutablePeriod54.addMonths((int) '#');
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) (short) 1, chronology60);
        int int62 = localDate61.getDayOfYear();
        org.joda.time.LocalTime localTime63 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = localDate61.toDateTime(localTime63, dateTimeZone64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = localDate61.toDateMidnight(dateTimeZone66);
        org.joda.time.DateMidnight.Property property68 = dateMidnight67.yearOfEra();
        int int69 = dateMidnight67.getMinuteOfHour();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period((long) (byte) 100, chronology71);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(chronology73);
        org.joda.time.MutableDateTime mutableDateTime75 = mutableDateTime74.copy();
        org.joda.time.Duration duration76 = period72.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime75);
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight67.plus((org.joda.time.ReadableDuration) duration76);
        mutablePeriod54.add((org.joda.time.ReadableDuration) duration76);
        mutablePeriod47.setPeriod((org.joda.time.ReadableDuration) duration76);
        mutablePeriod47.setMillis((-144832));
        int int82 = mutablePeriod47.getMinutes();
        mutablePeriod47.addMonths(718);
        org.joda.time.Period period85 = period41.minus((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.Period period87 = period85.minusMillis(242);
        mutablePeriod20.setPeriod((org.joda.time.ReadablePeriod) period85);
        org.joda.time.DateTime dateTime89 = dateTime16.plus((org.joda.time.ReadablePeriod) period85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and mutableDateTime29", (mutableDateTime9.compareTo(mutableDateTime29) == 0) == mutableDateTime9.equals(mutableDateTime29));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        int int13 = localDate12.getDayOfYear();
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTime(localTime14, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate12.toDateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.yearOfEra();
        int int20 = dateMidnight18.getMinuteOfHour();
        org.joda.time.Interval interval21 = dateMidnight18.toInterval();
        org.joda.time.MutableDateTime mutableDateTime22 = dateMidnight18.toMutableDateTime();
        int int23 = dateMidnight8.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.dayOfMonth();
        int int25 = mutableDateTime22.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime22.toMutableDateTime();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 1, chronology28);
        java.lang.String str30 = localDate29.toString();
        org.joda.time.LocalDate localDate32 = localDate29.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology33);
        org.joda.time.DurationField durationField37 = chronology33.weeks();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime26.toMutableDateTime(chronology33);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and mutableDateTime38", (dateMidnight8.compareTo(mutableDateTime38) == 0) == dateMidnight8.equals(mutableDateTime38));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = chronology9.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField14, and durationField10", !(durationField10.compareTo(durationField14) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField14.compareTo(durationField10))));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.year();
        java.lang.String str13 = chronology9.toString();
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateTimeZone dateTimeZone15 = chronology9.getZone();
        org.joda.time.DurationField durationField16 = chronology9.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField16, and durationField10", !(durationField10.compareTo(durationField16) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField16.compareTo(durationField10))));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 100, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.copy();
        org.joda.time.Duration duration7 = period3.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime6);
        int int8 = period3.size();
        org.joda.time.Period period10 = period3.withWeeks(842);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period3.getFieldTypes();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.forFields(durationFieldTypeArray11);
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withYearsRemoved();
        java.lang.String str15 = periodType13.toString();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 1, chronology19);
        java.lang.String str21 = localDate20.toString();
        org.joda.time.LocalDate localDate23 = localDate20.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) 1, chronology24);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay25.plusMonths(53617719);
        int int28 = yearMonthDay25.getDayOfMonth();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        java.lang.String str32 = localDate31.toString();
        org.joda.time.LocalDate localDate34 = localDate31.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay25.withChronologyRetainFields(chronology35);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj16, chronology35);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableDuration39, readableInstant40, periodType41);
        int int43 = mutablePeriod42.getMinutes();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 1, chronology46);
        java.lang.String str48 = localDate47.toString();
        org.joda.time.LocalDate localDate50 = localDate47.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(chronology51);
        mutablePeriod42.setPeriod((long) 53617649, chronology51);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime38.toMutableDateTime(chronology51);
        org.joda.time.DateTimeField dateTimeField56 = chronology51.minuteOfHour();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 53958462, periodType13, chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and dateTime38", (mutableDateTime5.compareTo(dateTime38) == 0) == mutableDateTime5.equals(dateTime38));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
        int int3 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        mutableDateTime2.setZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj0, dateTimeZone5);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.years();
        java.lang.String str10 = periodType9.getName();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        int int15 = localDate14.getDayOfYear();
        org.joda.time.LocalTime localTime16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate14.toDateTime(localTime16, dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate14.toDateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.yearOfEra();
        int int22 = dateMidnight20.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property23 = dateMidnight20.year();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight20.plusYears((int) ' ');
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight20);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(readableDuration27, readableInstant28, periodType29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        mutablePeriod30.add(readableDuration31);
        mutablePeriod30.addMonths((int) '#');
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (short) 1, chronology36);
        int int38 = localDate37.getDayOfYear();
        org.joda.time.LocalTime localTime39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDate37.toDateTime(localTime39, dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = localDate37.toDateMidnight(dateTimeZone42);
        org.joda.time.DateMidnight.Property property44 = dateMidnight43.yearOfEra();
        int int45 = dateMidnight43.getMinuteOfHour();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (byte) 100, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime50.copy();
        org.joda.time.Duration duration52 = period48.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight43.plus((org.joda.time.ReadableDuration) duration52);
        mutablePeriod30.add((org.joda.time.ReadableDuration) duration52);
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.years();
        java.lang.String str56 = periodType55.getName();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(periodType55);
        org.joda.time.PeriodType periodType58 = periodType55.withYearsRemoved();
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableDuration) duration52, periodType58);
        mutablePeriod11.add((org.joda.time.ReadableDuration) duration52);
        long long61 = duration52.getMillis();
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((long) (short) 1, chronology67);
        java.lang.String str69 = localDate68.toString();
        org.joda.time.LocalDate localDate71 = localDate68.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology72 = localDate71.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.yearOfEra();
        org.joda.time.DateTimeField dateTimeField74 = dateTimeFieldType65.getField(chronology72);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology72);
        org.joda.time.Period period76 = new org.joda.time.Period((long) (-1), periodType64, chronology72);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDate localDate79 = new org.joda.time.LocalDate((long) (short) 1, chronology78);
        java.lang.String str80 = localDate79.toString();
        org.joda.time.LocalDate localDate82 = localDate79.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology83 = localDate82.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((long) 53643546, periodType64, chronology83);
        org.joda.time.PeriodType periodType86 = periodType64.withSecondsRemoved();
        boolean boolean88 = periodType64.equals((java.lang.Object) (-62135596800000L));
        org.joda.time.Period period89 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration52, periodType64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime75", (mutableDateTime2.compareTo(dateTime75) == 0) == mutableDateTime2.equals(dateTime75));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        mutablePeriod2.add((int) (byte) 10, 904, 53619708, 47, 10, (-292275054), 0, 342);
        int int12 = mutablePeriod2.getDays();
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod2.copy();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        int int17 = localDate16.getDayOfYear();
        org.joda.time.LocalTime localTime18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate16.toDateTime(localTime18, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = localDate16.toDateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.yearOfEra();
        int int24 = dateMidnight22.getMinuteOfHour();
        int int25 = dateMidnight22.getMonthOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        java.lang.String str32 = localDate31.toString();
        org.joda.time.LocalDate localDate34 = localDate31.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.eras();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology35);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) dateMidnight22, chronology35);
        boolean boolean39 = mutablePeriod2.equals((java.lang.Object) dateMidnight22);
        mutablePeriod2.setYears(585);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight22 and dateTime38", (dateMidnight22.compareTo(dateTime38) == 0) == dateMidnight22.equals(dateTime38));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.Period period4 = new org.joda.time.Period(33, 53686960, 387, 0);
        int int5 = period4.getMonths();
        org.joda.time.Period period7 = period4.withDays(54020590);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream10 = strSet9.parallelStream();
        boolean boolean11 = strSet9.isEmpty();
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis((-27422466L));
        boolean boolean15 = strSet9.remove((java.lang.Object) instant12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime17.copy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        mutableDateTime18.setZone(dateTimeZone19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.minuteOfDay();
        long long22 = property21.remainder();
        org.joda.time.MutableDateTime mutableDateTime24 = property21.add((long) 53620623);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.add(2057L);
        org.joda.time.MutableDateTime mutableDateTime29 = property25.add((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime30 = property25.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfWeek();
        org.joda.time.Instant instant33 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology34 = instant33.getChronology();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime36.copy();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        mutableDateTime37.setZone(dateTimeZone38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 1, chronology41);
        int int43 = localDate42.getDayOfYear();
        org.joda.time.LocalTime localTime44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localDate42.toDateTime(localTime44, dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = localDate42.toDateMidnight(dateTimeZone47);
        org.joda.time.DateMidnight.Property property49 = dateMidnight48.yearOfEra();
        int int50 = dateMidnight48.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property51 = dateMidnight48.year();
        boolean boolean52 = mutableDateTime37.isBefore((org.joda.time.ReadableInstant) dateMidnight48);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime37.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(readableDuration54, readableInstant55, periodType56);
        mutablePeriod57.addYears((int) (byte) 0);
        int int60 = mutablePeriod57.getMonths();
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(readableDuration61, readableInstant62, periodType63);
        org.joda.time.ReadableDuration readableDuration65 = null;
        mutablePeriod64.add(readableDuration65);
        mutablePeriod64.addMonths((int) '#');
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((long) (short) 1, chronology70);
        int int72 = localDate71.getDayOfYear();
        org.joda.time.LocalTime localTime73 = null;
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.DateTime dateTime75 = localDate71.toDateTime(localTime73, dateTimeZone74);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateMidnight dateMidnight77 = localDate71.toDateMidnight(dateTimeZone76);
        org.joda.time.DateMidnight.Property property78 = dateMidnight77.yearOfEra();
        int int79 = dateMidnight77.getMinuteOfHour();
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period((long) (byte) 100, chronology81);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.MutableDateTime mutableDateTime84 = new org.joda.time.MutableDateTime(chronology83);
        org.joda.time.MutableDateTime mutableDateTime85 = mutableDateTime84.copy();
        org.joda.time.Duration duration86 = period82.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime85);
        org.joda.time.DateMidnight dateMidnight87 = dateMidnight77.plus((org.joda.time.ReadableDuration) duration86);
        mutablePeriod64.add((org.joda.time.ReadableDuration) duration86);
        mutablePeriod57.setPeriod((org.joda.time.ReadableDuration) duration86);
        mutableDateTime37.add((org.joda.time.ReadableDuration) duration86);
        org.joda.time.Instant instant92 = instant33.withDurationAdded((org.joda.time.ReadableDuration) duration86, 53);
        mutableDateTime30.add((org.joda.time.ReadableDuration) duration86, (int) '#');
        org.joda.time.Instant instant96 = instant12.withDurationAdded((org.joda.time.ReadableDuration) duration86, 53737423);
        boolean boolean97 = period4.equals((java.lang.Object) instant96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime17", (instant12.compareTo(mutableDateTime17) == 0) == instant12.equals(mutableDateTime17));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(53618165);
        org.joda.time.DateTime dateTime15 = dateTime12.withDurationAdded(58220L, 53625266);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 1, chronology20);
        java.lang.String str22 = localDate21.toString();
        org.joda.time.LocalDate localDate24 = localDate21.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.year();
        java.lang.String str29 = chronology25.toString();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime15.toMutableDateTime(chronology25);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 1, chronology32);
        java.lang.String str34 = localDate33.toString();
        org.joda.time.LocalDate localDate36 = localDate33.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.eras();
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((java.lang.Object) mutableDateTime30, chronology37);
        int int40 = yearMonthDay39.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime30", (dateTime15.compareTo(mutableDateTime30) == 0) == dateTime15.equals(mutableDateTime30));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        long long4 = instant1.getMillis();
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTimeISO();
        mutableDateTime5.setMillis(53643061L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime3", (instant1.compareTo(mutableDateTime3) == 0) == instant1.equals(mutableDateTime3));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(53618165);
        org.joda.time.DateTime dateTime15 = dateTime12.withDurationAdded(58220L, 53625266);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 1, chronology20);
        java.lang.String str22 = localDate21.toString();
        org.joda.time.LocalDate localDate24 = localDate21.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.year();
        java.lang.String str29 = chronology25.toString();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime15.toMutableDateTime(chronology25);
        org.joda.time.DurationField durationField31 = chronology25.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime30", (dateTime15.compareTo(mutableDateTime30) == 0) == dateTime15.equals(mutableDateTime30));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property11 = dateTime6.weekOfWeekyear();
        java.lang.String str12 = property11.getAsShortText();
        org.joda.time.DateTime dateTime13 = property11.withMinimumValue();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        int int17 = localDate16.getDayOfYear();
        org.joda.time.LocalTime localTime18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate16.toDateTime(localTime18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime24 = dateTime20.plus((long) 100);
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays(185);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int28 = dateTime24.get(dateTimeFieldType27);
        org.joda.time.DateTime dateTime30 = dateTime13.withField(dateTimeFieldType27, 12);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 1, chronology32);
        int int34 = localDate33.getDayOfYear();
        org.joda.time.LocalTime localTime35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate33.toDateTime(localTime35, dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = localDate33.toDateMidnight(dateTimeZone38);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.yearOfEra();
        int int41 = dateMidnight39.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property42 = dateMidnight39.year();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight39.plusYears((int) ' ');
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight39);
        org.joda.time.LocalDate.Property property46 = localDate45.dayOfYear();
        org.joda.time.Chronology chronology47 = localDate45.getChronology();
        org.joda.time.DurationField durationField48 = chronology47.seconds();
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType27.getField(chronology47);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) (short) 1, chronology51);
        java.lang.String str53 = localDate52.toString();
        org.joda.time.LocalDate localDate55 = localDate52.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.eras();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology56.getZone();
        java.util.Locale locale62 = new java.util.Locale("UTC", "2022-02-21T14:53:49.549Z");
        java.lang.String str63 = locale62.getCountry();
        java.lang.String str65 = locale62.getExtension('x');
        java.lang.String str66 = dateTimeZone58.getShortName((long) 52, locale62);
        java.util.TimeZone timeZone67 = dateTimeZone58.toTimeZone();
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone67, locale68);
        int int70 = dateTimeField49.getMaximumShortTextLength(locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField48 and durationField57", Math.signum(durationField48.compareTo(durationField57)) == -Math.signum(durationField57.compareTo(durationField48)));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.plusYears(53619079);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        int int6 = mutableDateTime5.getMillisOfSecond();
        boolean boolean7 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) mutableDateTime5);
        boolean boolean8 = dateMidnight0.isAfterNow();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        int int16 = period11.size();
        org.joda.time.Period period18 = period11.plusHours(53619079);
        org.joda.time.Period period20 = period11.plusWeeks(773);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight0.withPeriodAdded((org.joda.time.ReadablePeriod) period11, 11);
        int int23 = dateMidnight22.getSecondOfMinute();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight22.plusMonths(1980);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = null;
        org.joda.time.format.DateTimeParser dateTimeParser27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser27);
        org.joda.time.Chronology chronology29 = dateTimeFormatter28.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter28.withDefaultYear(8);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        java.lang.String str36 = localDate35.toString();
        org.joda.time.LocalDate localDate38 = localDate35.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfEra();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType32.getField(chronology39);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTimeField dateTimeField43 = chronology39.dayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter31.withChronology(chronology39);
        java.util.Locale locale45 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter44.withLocale(locale45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 1, chronology48);
        java.lang.String str50 = localDate49.toString();
        org.joda.time.LocalDate localDate52 = localDate49.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology53 = localDate52.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.eras();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology53.getZone();
        java.util.Locale locale59 = new java.util.Locale("UTC", "2022-02-21T14:53:49.549Z");
        java.lang.String str60 = locale59.getCountry();
        java.lang.String str62 = locale59.getExtension('x');
        java.lang.String str63 = dateTimeZone55.getShortName((long) 52, locale59);
        java.util.TimeZone timeZone64 = dateTimeZone55.toTimeZone();
        java.lang.String str65 = dateTimeZone55.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter44.withZone(dateTimeZone55);
        long long70 = dateTimeZone55.convertLocalToUTC((long) 322, false, (long) 53656199);
        org.joda.time.LocalDate localDate71 = org.joda.time.LocalDate.now(dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime72 = dateMidnight25.toMutableDateTime(dateTimeZone55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and dateTime42", (mutableDateTime5.compareTo(dateTime42) == 0) == mutableDateTime5.equals(dateTime42));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType1.getField(chronology8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.Period period19 = period13.plusDays((int) (byte) 10);
        int int20 = period19.getHours();
        org.joda.time.Period period22 = period19.plusMonths(2);
        org.joda.time.Period period24 = period19.minusMonths(12);
        org.joda.time.Period period26 = period19.withYears(2057);
        int[] intArray28 = chronology8.get((org.joda.time.ReadablePeriod) period26, 259200000L);
        boolean boolean29 = dateTimeFieldType0.isSupported(chronology8);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone32 = dateMidnight31.getZone();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = dateTime30.withZone(dateTimeZone32);
        org.joda.time.DateTime.Property property35 = dateTime34.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and dateTime30", (mutableDateTime15.compareTo(dateTime30) == 0) == mutableDateTime15.equals(dateTime30));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime3.copy();
        mutableDateTime3.addMinutes(0);
        java.lang.String str7 = mutableDateTime3.toString();
        int int8 = mutableDateTime3.getYearOfEra();
        org.joda.time.Chronology chronology9 = mutableDateTime3.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(185000L, 55441L, chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfEra();
        org.joda.time.DurationField durationField14 = chronology9.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField14, and durationField10", !(durationField10.compareTo(durationField14) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField14.compareTo(durationField10))));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        java.lang.String str5 = mutableDateTime1.toString();
        int int6 = mutableDateTime1.getYearOfEra();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.minuteOfDay();
        java.util.Locale locale10 = new java.util.Locale("", "hi!");
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale10.getDisplayCountry(locale11);
        java.lang.String str14 = property7.getAsText(locale10);
        org.joda.time.MutableDateTime mutableDateTime15 = property7.roundHalfFloor();
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableDuration17, readableInstant18, periodType19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutablePeriod20.add(readableDuration21);
        mutablePeriod20.addSeconds(53617440);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        java.lang.String str32 = localDate31.toString();
        org.joda.time.LocalDate localDate34 = localDate31.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.eras();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology35);
        org.joda.time.DateTimeField dateTimeField38 = chronology35.year();
        mutablePeriod20.setPeriod((long) 53618333, chronology35);
        org.joda.time.DateTime dateTime40 = instant16.toDateTime(chronology35);
        org.joda.time.DurationField durationField41 = chronology35.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant16", (mutableDateTime1.compareTo(instant16) == 0) == mutableDateTime1.equals(instant16));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.year();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DurationField durationField16 = chronology10.eras();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(19399L, chronology10);
        org.joda.time.DurationField durationField18 = chronology10.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField18, and durationField11", !(durationField11.compareTo(durationField18) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField18.compareTo(durationField11))));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        mutablePeriod3.addYears((int) (byte) 0);
        int int6 = mutablePeriod3.getMonths();
        mutablePeriod3.addMinutes((int) (byte) 0);
        int int9 = mutablePeriod3.getMinutes();
        org.joda.time.ReadableInterval readableInterval10 = null;
        mutablePeriod3.setPeriod(readableInterval10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) 100, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime25.copy();
        org.joda.time.Duration duration27 = period23.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.hourOfDay();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInstant) mutableDateTime20, (org.joda.time.ReadableInstant) mutableDateTime26);
        mutablePeriod3.addMinutes(328);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and mutableDateTime25", (mutableDateTime20.compareTo(mutableDateTime25) == 0) == mutableDateTime20.equals(mutableDateTime25));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.dayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        int[] intArray17 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod14, (long) (-292275054), (long) 53637942);
        org.joda.time.DateTimeField dateTimeField18 = chronology7.hourOfHalfday();
        java.lang.String str19 = chronology7.toString();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (byte) 100, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.copy();
        org.joda.time.Duration duration26 = period22.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((-1), 53620134, (int) (byte) -1, 53617719, (int) (byte) 100, 53619079, 1, 53);
        org.joda.time.Period period36 = period22.minus((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.Period period37 = period36.normalizedStandard();
        org.joda.time.Period period39 = period36.minusSeconds(773);
        org.joda.time.Period period41 = period36.withSeconds(53647547);
        int[] intArray43 = chronology7.get((org.joda.time.ReadablePeriod) period41, (long) 2636);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime24", (dateTime10.compareTo(mutableDateTime24) == 0) == dateTime10.equals(mutableDateTime24));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 14, chronology8);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((-1L), chronology8);
        org.joda.time.DurationField durationField13 = chronology8.years();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 1, chronology21);
        java.lang.String str23 = localDate22.toString();
        org.joda.time.LocalDate localDate25 = localDate22.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology26);
        boolean boolean29 = dateTimeFieldType16.isSupported(chronology26);
        java.lang.String str30 = chronology26.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology26.getZone();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(870L, chronology26);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 1, chronology38);
        java.lang.String str40 = localDate39.toString();
        org.joda.time.LocalDate localDate42 = localDate39.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.eras();
        org.joda.time.Period period45 = new org.joda.time.Period(58385L, 0L, periodType36, chronology43);
        java.lang.String str46 = chronology43.toString();
        mutableDateTime33.setChronology(chronology43);
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay14.withChronologyRetainFields(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField27", Math.signum(durationField13.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField13)));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        mutableDateTime11.setZoneRetainFields(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone14);
        boolean boolean17 = dateMidnight8.isEqual((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight16.dayOfYear();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight16.minusMonths(53636);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        java.lang.String str24 = localDate23.toString();
        org.joda.time.LocalDate localDate26 = localDate23.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology27.centuries();
        org.joda.time.DurationField durationField31 = chronology27.halfdays();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField33 = chronology27.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology27.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight20.withChronology(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime32", (mutableDateTime11.compareTo(mutableDateTime32) == 0) == mutableDateTime11.equals(mutableDateTime32));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Instant instant19 = dateMidnight18.toInstant();
        org.joda.time.Instant instant21 = instant19.minus(12248L);
        org.joda.time.Instant instant23 = instant21.minus((long) 53981820);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant19", (dateMidnight8.compareTo(instant19) == 0) == dateMidnight8.equals(instant19));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime3 = dateTime0.withFieldAdded(durationFieldType1, (int) (byte) 0);
        org.joda.time.DateTime dateTime5 = dateTime0.minusYears(10);
        org.joda.time.DateTime dateTime7 = dateTime0.minus(12336503L);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType11.getField(chronology18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) 100, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime25.copy();
        org.joda.time.Duration duration27 = period23.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.Period period29 = period23.plusDays((int) (byte) 10);
        int int30 = period29.getHours();
        org.joda.time.Period period32 = period29.plusMonths(2);
        org.joda.time.Period period34 = period29.minusMonths(12);
        org.joda.time.Period period36 = period29.withYears(2057);
        int[] intArray38 = chronology18.get((org.joda.time.ReadablePeriod) period36, 259200000L);
        org.joda.time.Chronology chronology39 = chronology18.withUTC();
        org.joda.time.Period period40 = new org.joda.time.Period(1980L, (long) 958, chronology39);
        org.joda.time.DateTime dateTime41 = dateTime7.toDateTime(chronology39);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 1, chronology44);
        java.lang.String str46 = localDate45.toString();
        org.joda.time.LocalDate localDate48 = localDate45.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology49 = localDate48.getChronology();
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay((long) (short) 1, chronology49);
        org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay50.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone54 = dateMidnight53.getZone();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) (short) 1, chronology56);
        java.lang.String str58 = localDate57.toString();
        org.joda.time.LocalDate localDate60 = localDate57.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight53.withFields((org.joda.time.ReadablePartial) localDate60);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight53.withField(dateTimeFieldType62, 842);
        org.joda.time.YearMonthDay.Property property65 = yearMonthDay50.property(dateTimeFieldType62);
        org.joda.time.YearMonthDay.Property property66 = yearMonthDay50.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay68 = property66.addToCopy(53629078);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(chronology69);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime70.copy();
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        mutableDateTime71.setZone(dateTimeZone72);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime71.minuteOfDay();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType76 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime78 = dateTime75.withFieldAdded(durationFieldType76, (int) (byte) 0);
        mutableDateTime71.add(durationFieldType76, 8);
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime83 = dateTime81.withWeekyear((int) (short) 100);
        int int84 = mutableDateTime71.compareTo((org.joda.time.ReadableInstant) dateTime81);
        int int85 = property66.compareTo((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.YearMonthDay yearMonthDay86 = property66.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay87 = property66.withMinimumValue();
        int[] intArray89 = chronology39.get((org.joda.time.ReadablePartial) yearMonthDay87, (long) 53693720);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime41", (dateTime7.compareTo(dateTime41) == 0) == dateTime7.equals(dateTime41));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 23);
        org.joda.time.Instant instant4 = instant1.withDurationAdded(13328L, 53738208);
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime10.minusMillis(53618333);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfEra();
        org.joda.time.DateTime dateTime21 = dateTime12.toDateTime(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone23 = dateMidnight22.getZone();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        java.lang.String str27 = localDate26.toString();
        org.joda.time.LocalDate localDate29 = localDate26.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight22.withFields((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight22.withField(dateTimeFieldType31, 842);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (byte) 100, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime38.copy();
        org.joda.time.Duration duration40 = period36.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.Period period42 = period36.plusDays((int) (byte) 10);
        org.joda.time.Duration duration43 = period42.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight22.minus((org.joda.time.ReadableDuration) duration43);
        java.lang.String str45 = duration43.toString();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (byte) 100, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime50.copy();
        org.joda.time.Duration duration52 = period48.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.Period period54 = period48.plusDays((int) (byte) 10);
        int int55 = period54.getHours();
        org.joda.time.Period period57 = period54.plusMonths(2);
        org.joda.time.PeriodType periodType58 = period54.getPeriodType();
        org.joda.time.PeriodType periodType59 = periodType58.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration43, periodType59);
        org.joda.time.Instant instant62 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration43, (int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime21", (dateTime12.compareTo(dateTime21) == 0) == dateTime12.equals(dateTime21));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration9, readableInstant10, periodType11);
        mutablePeriod12.setMillis(0);
        org.joda.time.LocalDate localDate15 = localDate7.plus((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDate7.getFields();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 1, chronology19);
        java.lang.String str21 = localDate20.toString();
        org.joda.time.LocalDate localDate23 = localDate20.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) 1, chronology24);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay25.plusMonths(53617719);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(readableDuration28, readableInstant29, periodType30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutablePeriod31.add(readableDuration32);
        mutablePeriod31.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableDuration36, readableInstant37, periodType38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutablePeriod39.add(readableDuration40);
        mutablePeriod39.addMonths((int) '#');
        mutablePeriod31.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay27.plus((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.TimeOfDay timeOfDay46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay45.toDateTime(timeOfDay46);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 1, chronology49);
        int int51 = localDate50.getDayOfYear();
        org.joda.time.LocalTime localTime52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate50.toDateTime(localTime52, dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = localDate50.toDateMidnight(dateTimeZone55);
        org.joda.time.DateMidnight.Property property57 = dateMidnight56.yearOfEra();
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone59 = dateMidnight58.getZone();
        org.joda.time.MutableDateTime mutableDateTime60 = dateMidnight56.toMutableDateTime(dateTimeZone59);
        org.joda.time.DateMidnight dateMidnight61 = yearMonthDay45.toDateMidnight(dateTimeZone59);
        org.joda.time.DateMidnight dateMidnight62 = localDate7.toDateMidnight(dateTimeZone59);
        org.joda.time.YearMonthDay yearMonthDay63 = dateMidnight62.toYearMonthDay();
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight62.minusWeeks(0);
        org.joda.time.Instant instant66 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime67 = instant66.toDateTimeISO();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) (short) 1, chronology69);
        int int71 = localDate70.getDayOfYear();
        org.joda.time.LocalTime localTime72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = localDate70.toDateTime(localTime72, dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateMidnight dateMidnight76 = localDate70.toDateMidnight(dateTimeZone75);
        org.joda.time.DateMidnight.Property property77 = dateMidnight76.yearOfEra();
        int int78 = dateMidnight76.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property79 = dateMidnight76.year();
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight76.withMillis((long) ' ');
        int int82 = dateMidnight81.getYear();
        boolean boolean83 = instant66.isEqual((org.joda.time.ReadableInstant) dateMidnight81);
        org.joda.time.Instant instant86 = instant66.withDurationAdded((long) 81, 53833154);
        int int87 = dateMidnight65.compareTo((org.joda.time.ReadableInstant) instant86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant66 and dateTime67", (instant66.compareTo(dateTime67) == 0) == instant66.equals(dateTime67));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.year();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DurationField durationField16 = chronology10.eras();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(19399L, chronology10);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableDuration18, readableInstant19, periodType20);
        mutablePeriod21.addYears((int) (byte) 0);
        int int24 = mutablePeriod21.getMonths();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableDuration25, readableInstant26, periodType27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        mutablePeriod28.add(readableDuration29);
        mutablePeriod28.addMonths((int) '#');
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        int int36 = localDate35.getDayOfYear();
        org.joda.time.LocalTime localTime37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate35.toDateTime(localTime37, dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = localDate35.toDateMidnight(dateTimeZone40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.yearOfEra();
        int int43 = dateMidnight41.getMinuteOfHour();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (byte) 100, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime48.copy();
        org.joda.time.Duration duration50 = period46.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight41.plus((org.joda.time.ReadableDuration) duration50);
        mutablePeriod28.add((org.joda.time.ReadableDuration) duration50);
        mutablePeriod21.setPeriod((org.joda.time.ReadableDuration) duration50);
        mutablePeriod21.setMinutes(999);
        java.lang.Object obj56 = mutablePeriod21.clone();
        long long59 = chronology10.add((org.joda.time.ReadablePeriod) mutablePeriod21, (long) 53786636, 53792240);
        org.joda.time.DurationField durationField60 = chronology10.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField60, and durationField11", !(durationField11.compareTo(durationField60) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField60.compareTo(durationField11))));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Instant instant19 = dateMidnight18.toInstant();
        org.joda.time.Instant instant21 = instant19.withMillis((long) (short) -1);
        org.joda.time.Chronology chronology22 = instant19.getChronology();
        org.joda.time.DateTime dateTime23 = instant19.toDateTime();
        org.joda.time.Instant instant25 = instant19.withMillis((long) 53817943);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = instant19.isSupported(dateTimeFieldType26);
        org.joda.time.DateTime dateTime28 = instant19.toDateTimeISO();
        org.joda.time.DateTime.Property property29 = dateTime28.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant19", (dateMidnight8.compareTo(instant19) == 0) == dateMidnight8.equals(instant19));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) 55441L, dateTimeZone1);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(periodType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) periodType4, dateTimeZone6);
        int int8 = localDateTime7.getDayOfMonth();
        int int9 = localDateTime7.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfSecond();
        int int11 = localDateTime7.getDayOfMonth();
        int int12 = localDateTime7.getMillisOfDay();
        int int13 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        mutableDateTime15.addMinutes(0);
        java.lang.String str19 = mutableDateTime15.toString();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        boolean boolean24 = dateTimeFormatter23.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone28 = dateMidnight27.getZone();
        boolean boolean30 = dateTimeZone28.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter26.withZone(dateTimeZone28);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 53628506, dateTimeZone28);
        mutableDateTime15.setZoneRetainFields(dateTimeZone28);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (byte) 100, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime39.copy();
        org.joda.time.Duration duration41 = period37.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime40);
        mutableDateTime15.add((org.joda.time.ReadableDuration) duration41, 53625309);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime45.copy();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        mutableDateTime46.setZone(dateTimeZone47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime46.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(53619988);
        java.lang.String str52 = dateTimeZone51.toString();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(dateTimeZone51);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.LocalDate.Property property55 = localDate53.property(dateTimeFieldType54);
        boolean boolean56 = mutableDateTime46.isSupported(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime15.property(dateTimeFieldType54);
        java.lang.String str58 = dateTimeFieldType54.toString();
        int int59 = localDateTime7.get(dateTimeFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime16", (dateTime2.compareTo(mutableDateTime16) == 0) == dateTime2.equals(mutableDateTime16));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        int int7 = period2.size();
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period2.toString(periodFormatter8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        int int13 = localDate12.getDayOfYear();
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTime(localTime14, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate12.toDateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.yearOfEra();
        int int20 = dateMidnight18.getMinuteOfHour();
        int int21 = dateMidnight18.getMonthOfYear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 1, chronology26);
        java.lang.String str28 = localDate27.toString();
        org.joda.time.LocalDate localDate30 = localDate27.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.eras();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) dateMidnight18, chronology31);
        org.joda.time.Duration duration35 = period2.toDurationTo((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight18.minusWeeks(53635576);
        int int38 = dateMidnight18.getMonthOfYear();
        org.joda.time.DateMidnight.Property property39 = dateMidnight18.yearOfEra();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(chronology40);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime41.copy();
        mutableDateTime41.addMinutes(0);
        int int45 = mutableDateTime41.getCenturyOfEra();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 1, chronology50);
        java.lang.String str52 = localDate51.toString();
        org.joda.time.LocalDate localDate54 = localDate51.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology55 = localDate54.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.eras();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology55);
        mutableDateTime41.setChronology(chronology55);
        org.joda.time.MutableDateTime mutableDateTime59 = dateMidnight18.toMutableDateTime(chronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime41 and mutableDateTime42", (mutableDateTime41.compareTo(mutableDateTime42) == 0) == mutableDateTime41.equals(mutableDateTime42));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType5.getField(chronology12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology12);
        org.joda.time.Period period16 = new org.joda.time.Period((long) (-1), periodType4, chronology12);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 53643546, periodType4, chronology23);
        org.joda.time.PeriodType periodType26 = periodType4.withSecondsRemoved();
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis((-27422466L));
        org.joda.time.Chronology chronology30 = instant27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(96293L, 259200000L, periodType4, chronology30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (byte) 100, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime36.copy();
        org.joda.time.Duration duration38 = period34.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.Period period40 = period34.plusDays((int) (byte) 10);
        org.joda.time.Period period42 = period34.minusMillis(0);
        mutablePeriod31.mergePeriod((org.joda.time.ReadablePeriod) period42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and mutableDateTime36", (instant27.compareTo(mutableDateTime36) == 0) == instant27.equals(mutableDateTime36));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.plusYears(53619079);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        int int6 = mutableDateTime5.getMillisOfSecond();
        boolean boolean7 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        int int11 = localDate10.getDayOfYear();
        org.joda.time.LocalTime localTime12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate10.toDateTime(localTime12, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = localDate10.toDateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.yearOfEra();
        int int18 = dateMidnight16.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property19 = dateMidnight16.year();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight16.plusYears((int) ' ');
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight16);
        boolean boolean23 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) dateMidnight16);
        mutableDateTime5.addWeeks(53636825);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime5.getZone();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        java.util.Calendar.Builder builder28 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder30 = builder28.setLenient(false);
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        java.util.Calendar.Builder builder33 = builder30.setTimeZone(timeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.DateTime dateTime35 = dateTime27.toDateTime(dateTimeZone34);
        org.joda.time.DateTime.Property property36 = dateTime35.minuteOfHour();
        org.joda.time.DurationField durationField37 = property36.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime35", (dateTime27.compareTo(dateTime35) == 0) == dateTime27.equals(dateTime35));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Instant instant16 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant17 = instant4.toInstant();
        org.joda.time.Instant instant19 = instant4.minus((long) 685);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant4", (mutableDateTime8.compareTo(instant4) == 0) == mutableDateTime8.equals(instant4));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 100, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.copy();
        org.joda.time.Duration duration25 = period21.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.String str26 = duration25.toString();
        boolean boolean27 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 1, chronology35);
        java.lang.String str37 = localDate36.toString();
        org.joda.time.LocalDate localDate39 = localDate36.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.yearOfEra();
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType33.getField(chronology40);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology40);
        org.joda.time.Period period44 = new org.joda.time.Period((long) (-1), periodType32, chronology40);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 1, chronology46);
        java.lang.String str48 = localDate47.toString();
        org.joda.time.LocalDate localDate50 = localDate47.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 53643546, periodType32, chronology51);
        org.joda.time.Period period54 = new org.joda.time.Period((long) 53723582, periodType32);
        org.joda.time.PeriodType periodType55 = periodType32.withMillisRemoved();
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, readableInstant28, periodType55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and dateTime43", (mutableDateTime15.compareTo(dateTime43) == 0) == mutableDateTime15.equals(dateTime43));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        java.lang.String str5 = mutableDateTime1.toString();
        int int6 = mutableDateTime1.getYearOfEra();
        org.joda.time.Chronology chronology7 = mutableDateTime1.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.eras();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.DurationField durationField10 = chronology7.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField10, and durationField8", !(durationField8.compareTo(durationField10) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField10.compareTo(durationField8))));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 23);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 1);
        org.joda.time.Instant instant5 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = instant5.toMutableDateTimeISO();
        long long8 = instant5.getMillis();
        org.joda.time.Chronology chronology9 = instant5.getChronology();
        int int10 = instant1.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        int int14 = localDate13.getDayOfYear();
        org.joda.time.LocalDate.Property property15 = localDate13.yearOfEra();
        org.joda.time.LocalDate localDate17 = property15.addWrapFieldToCopy(773);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) (byte) 100, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.copy();
        org.joda.time.Duration duration24 = period20.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime23);
        int int25 = period20.size();
        org.joda.time.Period period27 = period20.plusMinutes(53619248);
        org.joda.time.Period period28 = period27.toPeriod();
        org.joda.time.Period period30 = period28.minusDays(53670039);
        org.joda.time.LocalDate localDate31 = localDate17.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period33 = period28.minusHours(38);
        org.joda.time.Duration duration34 = period33.toStandardDuration();
        org.joda.time.Instant instant35 = instant5.minus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Instant instant37 = instant35.minus(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime7", (instant5.compareTo(mutableDateTime7) == 0) == instant5.equals(mutableDateTime7));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        mutableDateTime2.setMillisOfSecond(547);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant1", (mutableDateTime0.compareTo(instant1) == 0) == mutableDateTime0.equals(instant1));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) (byte) 100, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.Duration duration9 = period5.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime8);
        int int10 = period5.size();
        org.joda.time.Period period12 = period5.withWeeks(842);
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period5.getFieldTypes();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.forFields(durationFieldTypeArray13);
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withYearsRemoved();
        java.lang.String str17 = periodType16.getName();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 1, chronology20);
        java.lang.String str22 = localDate21.toString();
        org.joda.time.LocalDate localDate24 = localDate21.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology25);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 14, chronology25);
        org.joda.time.Period period29 = new org.joda.time.Period(0L, (long) 534, periodType16, chronology25);
        org.joda.time.Period period30 = new org.joda.time.Period((-53872985503L), periodType16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and mutableDateTime27", (mutableDateTime7.compareTo(mutableDateTime27) == 0) == mutableDateTime7.equals(mutableDateTime27));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology6.seconds();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.clockhourOfHalfday();
        long long12 = dateTimeField9.add((long) 53857751, 53626727);
        int int14 = dateTimeField9.getMinimumValue((long) 53777692);
        java.util.Calendar.Builder builder15 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder17 = builder15.setLenient(false);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Calendar.Builder builder19 = builder15.setLocale(locale18);
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = locale20.getCountry();
        java.util.Calendar.Builder builder22 = builder19.setLocale(locale20);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        timeZone24.setID("1970-01-01");
        boolean boolean27 = timeZone24.observesDaylightTime();
        boolean boolean28 = timeZone24.observesDaylightTime();
        java.util.Calendar.Builder builder29 = builder19.setTimeZone(timeZone24);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) (short) 1, chronology31);
        int int33 = localDate32.getDayOfYear();
        org.joda.time.LocalTime localTime34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate32.toDateTime(localTime34, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = localDate32.toDateMidnight(dateTimeZone37);
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.yearOfEra();
        int int40 = dateMidnight38.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property41 = dateMidnight38.year();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        long long44 = dateTimeField42.remainder((long) (short) -1);
        int int45 = dateTimeField42.getMinimumValue();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 1, chronology50);
        java.lang.String str52 = localDate51.toString();
        org.joda.time.LocalDate localDate54 = localDate51.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology55 = localDate54.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.eras();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology55);
        java.util.Locale locale58 = java.util.Locale.CANADA;
        java.lang.String str59 = dateTimeField42.getAsShortText((org.joda.time.ReadablePartial) localDate57, locale58);
        java.util.Locale locale60 = locale58.stripExtensions();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((long) (short) 1, chronology63);
        java.lang.String str65 = localDate64.toString();
        org.joda.time.LocalDate localDate67 = localDate64.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology68 = localDate67.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = chronology68.yearOfEra();
        org.joda.time.DateTimeField dateTimeField70 = dateTimeFieldType61.getField(chronology68);
        int int72 = dateTimeField70.getMinimumValue((long) 53634384);
        java.util.Locale locale75 = new java.util.Locale("", "hi!");
        java.lang.String str76 = locale75.getCountry();
        java.util.Locale locale77 = java.util.Locale.FRENCH;
        boolean boolean78 = locale77.hasExtensions();
        java.lang.String str79 = locale75.getDisplayVariant(locale77);
        int int80 = dateTimeField70.getMaximumShortTextLength(locale75);
        java.lang.String str81 = locale58.getDisplayName(locale75);
        java.util.Calendar.Builder builder82 = builder19.setLocale(locale75);
        java.util.Locale.Category category83 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale84 = java.util.Locale.getDefault(category83);
        java.util.Locale locale85 = java.util.Locale.CANADA;
        java.lang.String str87 = locale85.getExtension('a');
        java.util.Locale locale88 = locale85.stripExtensions();
        java.util.Locale.setDefault(category83, locale88);
        java.util.Locale locale90 = java.util.Locale.getDefault(category83);
        java.lang.String str91 = locale75.getDisplayCountry(locale90);
        int int92 = dateTimeField9.getMaximumShortTextLength(locale90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField56", Math.signum(durationField8.compareTo(durationField56)) == -Math.signum(durationField56.compareTo(durationField8)));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 23);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 1);
        org.joda.time.Instant instant5 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = instant5.toMutableDateTimeISO();
        long long8 = instant5.getMillis();
        org.joda.time.Chronology chronology9 = instant5.getChronology();
        int int10 = instant1.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        int int14 = localDate13.getDayOfYear();
        org.joda.time.LocalTime localTime15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTime(localTime15, dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = localDate13.toDateMidnight(dateTimeZone18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.yearOfEra();
        int int21 = dateMidnight19.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = dateMidnight19.isSupported(dateTimeFieldType22);
        org.joda.time.Period period28 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight19.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone31 = dateMidnight30.getZone();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) (short) 1, chronology33);
        java.lang.String str35 = localDate34.toString();
        org.joda.time.LocalDate localDate37 = localDate34.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight30.withFields((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight30.withField(dateTimeFieldType39, 842);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 100, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime46.copy();
        org.joda.time.Duration duration48 = period44.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.Period period50 = period44.plusDays((int) (byte) 10);
        org.joda.time.Duration duration51 = period50.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight30.minus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight29.minus((org.joda.time.ReadableDuration) duration51);
        java.lang.String str54 = duration51.toString();
        org.joda.time.Instant instant56 = instant5.withDurationAdded((org.joda.time.ReadableDuration) duration51, 53768336);
        org.joda.time.Instant instant57 = instant5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime58 = instant5.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant5", (mutableDateTime7.compareTo(instant5) == 0) == mutableDateTime7.equals(instant5));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        int int7 = period2.size();
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period2.toString(periodFormatter8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        int int13 = localDate12.getDayOfYear();
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTime(localTime14, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate12.toDateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.yearOfEra();
        int int20 = dateMidnight18.getMinuteOfHour();
        int int21 = dateMidnight18.getMonthOfYear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 1, chronology26);
        java.lang.String str28 = localDate27.toString();
        org.joda.time.LocalDate localDate30 = localDate27.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.eras();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) dateMidnight18, chronology31);
        org.joda.time.Duration duration35 = period2.toDurationTo((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight18.minusWeeks(53635576);
        int int38 = dateMidnight18.getMonthOfYear();
        org.joda.time.DateMidnight.Property property39 = dateMidnight18.yearOfEra();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight18.plusWeeks(465);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight18.minusDays(53734950);
        long long44 = dateMidnight43.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight18 and dateTime34", (dateMidnight18.compareTo(dateTime34) == 0) == dateMidnight18.equals(dateTime34));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime3 = property2.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology6.centuries();
        org.joda.time.DurationField durationField10 = chronology6.halfdays();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(chronology6);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(24410L, dateTimeZone14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        int int19 = localDate18.getDayOfYear();
        org.joda.time.LocalTime localTime20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate18.toDateTime(localTime20, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = localDate18.toDateMidnight(dateTimeZone23);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.yearOfEra();
        int int26 = dateMidnight24.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property27 = dateMidnight24.year();
        org.joda.time.DateMidnight.Property property28 = dateMidnight24.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight30 = property28.addToCopy(650);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekyear((int) (short) 100);
        int int34 = dateTime33.getYearOfCentury();
        long long35 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone37 = dateMidnight36.getZone();
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight36.plusYears(53619079);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(chronology40);
        int int42 = mutableDateTime41.getMillisOfSecond();
        boolean boolean43 = dateMidnight36.isEqual((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str45 = dateTimeFieldType44.getName();
        int int46 = dateMidnight36.get(dateTimeFieldType44);
        boolean boolean47 = dateTime33.isSupported(dateTimeFieldType44);
        boolean boolean48 = dateTime15.isSupported(dateTimeFieldType44);
        boolean boolean49 = yearMonthDay12.isSupported(dateTimeFieldType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and dateTime31", (mutableDateTime11.compareTo(dateTime31) == 0) == mutableDateTime11.equals(dateTime31));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        org.joda.time.DurationField durationField8 = chronology6.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField8, and durationField7", !(durationField7.compareTo(durationField8) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField8.compareTo(durationField7))));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 14, chronology10);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((-1L), chronology10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.minuteOfDay();
        mutableDateTime1.setChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone17 = chronology10.getZone();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 1, chronology20);
        java.lang.String str22 = localDate21.toString();
        long long24 = chronology10.set((org.joda.time.ReadablePartial) localDate21, (long) 53800767);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime31 = dateTime29.minusMillis(53618333);
        org.joda.time.DateTime dateTime32 = dateTime31.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) 100, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime37.copy();
        org.joda.time.Duration duration39 = period35.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.Period period41 = period35.plusDays((int) (byte) 10);
        org.joda.time.Duration duration42 = period41.toStandardDuration();
        org.joda.time.DateTime dateTime43 = dateTime31.minus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.DateTime dateTime45 = dateTime31.withYear(5);
        org.joda.time.DateTime dateTime47 = dateTime31.plus(219596218151L);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(periodType48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) periodType48, dateTimeZone50);
        int int52 = localDateTime51.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property53 = localDateTime51.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property53.getFieldType();
        int int55 = dateTime31.get(dateTimeFieldType54);
        boolean boolean56 = localDate21.isSupported(dateTimeFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime25", (mutableDateTime1.compareTo(dateTime25) == 0) == mutableDateTime1.equals(dateTime25));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Instant instant16 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant18 = instant4.plus((long) 32770);
        org.joda.time.MutableDateTime mutableDateTime19 = instant4.toMutableDateTime();
        org.joda.time.DateTime dateTime20 = instant4.toDateTimeISO();
        org.joda.time.Instant instant23 = instant4.withDurationAdded((long) 411, 2636);
        org.joda.time.MutableDateTime mutableDateTime24 = instant23.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime8", (instant4.compareTo(mutableDateTime8) == 0) == instant4.equals(mutableDateTime8));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology12);
        boolean boolean15 = dateTimeFieldType2.isSupported(chronology12);
        java.lang.String str16 = chronology12.toString();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(870L, chronology12);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(26264L, chronology12);
        org.joda.time.DurationField durationField21 = chronology12.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField21, and durationField13", !(durationField13.compareTo(durationField21) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField21.compareTo(durationField13))));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        mutableDateTime1.setSecondOfDay(21);
        org.joda.time.Chronology chronology7 = null;
        mutableDateTime1.setChronology(chronology7);
        mutableDateTime1.setMinuteOfHour((int) (short) 0);
        mutableDateTime1.addMinutes((int) (byte) 1);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.LocalTime localTime16 = localTime13.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localTime13.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMonths(10);
        org.joda.time.DateTime.Property property21 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.getDateTime();
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime22.minusWeeks((int) 'a');
        boolean boolean26 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime28 = dateTime22.minusMonths(5);
        org.joda.time.DateTime dateTime30 = dateTime22.minusWeeks(53627306);
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream33 = strSet32.parallelStream();
        boolean boolean34 = strSet32.isEmpty();
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.Instant instant37 = instant35.withMillis((-27422466L));
        boolean boolean38 = strSet32.remove((java.lang.Object) instant35);
        org.joda.time.Chronology chronology39 = instant35.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.seconds();
        org.joda.time.DateTime dateTime41 = dateTime22.withChronology(chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant35", (mutableDateTime2.compareTo(instant35) == 0) == mutableDateTime2.equals(instant35));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        java.lang.String str11 = periodType10.getName();
        org.joda.time.PeriodType periodType12 = periodType10.withMonthsRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime5, (org.joda.time.ReadableInstant) mutableDateTime9, periodType10);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime5.toMutableDateTime();
        mutableDateTime14.setMillisOfDay(8);
        org.joda.time.ReadableInstant readableInstant17 = null;
        boolean boolean18 = mutableDateTime14.isAfter(readableInstant17);
        mutableDateTime14.setWeekOfWeekyear(28);
        org.joda.time.Instant instant21 = mutableDateTime14.toInstant();
        org.joda.time.Instant instant23 = instant21.minus((long) 53628335);
        org.joda.time.MutableDateTime mutableDateTime24 = instant21.toMutableDateTime();
        boolean boolean25 = instant21.isAfterNow();
        org.joda.time.Chronology chronology26 = instant21.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant21", (mutableDateTime14.compareTo(instant21) == 0) == mutableDateTime14.equals(instant21));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        mutableDateTime9.setZone(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, (int) (byte) 0);
        mutableDateTime9.add(durationFieldType14, 8);
        org.joda.time.LocalDate localDate20 = localDate2.withFieldAdded(durationFieldType14, 3);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        int int24 = localDate23.getDayOfYear();
        org.joda.time.LocalTime localTime25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate23.toDateTime(localTime25, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = localDate23.toDateMidnight(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate23.withYear(53619770);
        int int32 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        java.lang.String str36 = localDate35.toString();
        org.joda.time.LocalDate localDate38 = localDate35.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property39 = localDate35.weekOfWeekyear();
        org.joda.time.DateTime dateTime40 = localDate35.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone42 = dateMidnight41.getZone();
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime45 = dateTime40.withZoneRetainFields(dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone42);
        org.joda.time.DateTime dateTime47 = localDate2.toDateTimeAtMidnight(dateTimeZone42);
        org.joda.time.DateTime.Property property48 = dateTime47.dayOfYear();
        org.joda.time.DateTime.Property property49 = dateTime47.hourOfDay();
        org.joda.time.DateTime dateTime51 = property49.addToCopy(53656402);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(chronology52);
        mutableDateTime53.addMinutes(904);
        mutableDateTime53.addWeekyears((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime53.setZoneRetainFields(dateTimeZone58);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType63 = periodType62.withWeeksRemoved();
        java.lang.String str64 = periodType63.toString();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((long) (short) 1, chronology66);
        java.lang.String str68 = localDate67.toString();
        org.joda.time.LocalDate localDate70 = localDate67.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology71 = localDate70.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(chronology71);
        org.joda.time.DateTimeField dateTimeField74 = chronology71.era();
        org.joda.time.DurationField durationField75 = chronology71.hours();
        org.joda.time.DateMidnight dateMidnight76 = new org.joda.time.DateMidnight(chronology71);
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight(chronology71);
        org.joda.time.Period period78 = new org.joda.time.Period((long) 363, (long) 898, periodType63, chronology71);
        org.joda.time.MutableDateTime mutableDateTime79 = mutableDateTime53.toMutableDateTime(chronology71);
        mutableDateTime53.setTime((long) 53660764);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (byte) 100, chronology83);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime(chronology85);
        org.joda.time.MutableDateTime mutableDateTime87 = mutableDateTime86.copy();
        org.joda.time.Duration duration88 = period84.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime87);
        int int89 = period84.size();
        org.joda.time.Period period91 = period84.withWeeks(842);
        org.joda.time.DurationFieldType[] durationFieldTypeArray92 = period84.getFieldTypes();
        org.joda.time.PeriodType periodType93 = org.joda.time.PeriodType.forFields(durationFieldTypeArray92);
        org.joda.time.PeriodType periodType94 = org.joda.time.PeriodType.forFields(durationFieldTypeArray92);
        org.joda.time.DurationFieldType durationFieldType96 = periodType94.getFieldType(0);
        org.joda.time.MutablePeriod mutablePeriod97 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) mutableDateTime53, periodType94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime73", (dateTime13.compareTo(mutableDateTime73) == 0) == dateTime13.equals(mutableDateTime73));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Instant instant16 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant18 = instant4.plus((long) 32770);
        org.joda.time.MutableDateTime mutableDateTime19 = instant4.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableDuration20, readableInstant21, periodType22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutablePeriod23.add(readableDuration24);
        mutablePeriod23.addYears((int) (short) 100);
        java.lang.Object obj28 = mutablePeriod23.clone();
        mutablePeriod23.setSeconds(904);
        mutablePeriod23.setSeconds(53619248);
        mutablePeriod23.add((long) 53629078);
        mutablePeriod23.setYears(53649515);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone38 = dateMidnight37.getZone();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) (short) 1, chronology40);
        java.lang.String str42 = localDate41.toString();
        org.joda.time.LocalDate localDate44 = localDate41.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight37.withFields((org.joda.time.ReadablePartial) localDate44);
        org.joda.time.DateMidnight.Property property46 = dateMidnight45.dayOfYear();
        org.joda.time.DateMidnight.Property property47 = dateMidnight45.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean49 = dateMidnight45.isSupported(dateTimeFieldType48);
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType48.getDurationType();
        mutablePeriod23.add(durationFieldType50, (-4469387));
        mutableDateTime19.add(durationFieldType50, 53835495);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime8", (instant4.compareTo(mutableDateTime8) == 0) == instant4.equals(mutableDateTime8));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.Chronology chronology5 = localDateTime3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 0);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getShortName((long) 53646, locale10);
        org.joda.time.Chronology chronology12 = chronology5.withZone(dateTimeZone8);
        org.joda.time.DurationField durationField13 = chronology12.hours();
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.secondOfMinute();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.DateTimeField dateTimeField20 = chronology16.millisOfDay();
        org.joda.time.DateTime dateTime21 = mutableDateTime8.toDateTime(chronology16);
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime8", (instant4.compareTo(mutableDateTime8) == 0) == instant4.equals(mutableDateTime8));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        java.lang.String str5 = mutableDateTime1.toString();
        int int6 = mutableDateTime1.getYearOfEra();
        org.joda.time.Chronology chronology7 = mutableDateTime1.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.eras();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.yearOfEra();
        org.joda.time.DurationField durationField11 = chronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField11, and durationField8", !(durationField8.compareTo(durationField11) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField11.compareTo(durationField8))));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType1.getField(chronology8);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfMonth();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 53887591, chronology8);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
        mutableDateTime16.addMinutes(904);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 100, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.copy();
        org.joda.time.Duration duration25 = period21.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 100, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime30.copy();
        org.joda.time.Duration duration32 = period28.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(readableDuration33, readableInstant34, periodType35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        mutablePeriod36.add(readableDuration37);
        mutablePeriod36.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableDuration41, readableInstant42, periodType43);
        org.joda.time.ReadableDuration readableDuration45 = null;
        mutablePeriod44.add(readableDuration45);
        mutablePeriod44.addMonths((int) '#');
        mutablePeriod36.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableDuration50, readableInstant51, periodType52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        mutablePeriod53.add(readableDuration54);
        mutablePeriod53.addMonths((int) '#');
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) (short) 1, chronology59);
        int int61 = localDate60.getDayOfYear();
        org.joda.time.LocalTime localTime62 = null;
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = localDate60.toDateTime(localTime62, dateTimeZone63);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = localDate60.toDateMidnight(dateTimeZone65);
        org.joda.time.DateMidnight.Property property67 = dateMidnight66.yearOfEra();
        int int68 = dateMidnight66.getMinuteOfHour();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (byte) 100, chronology70);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(chronology72);
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime73.copy();
        org.joda.time.Duration duration75 = period71.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime74);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight66.plus((org.joda.time.ReadableDuration) duration75);
        mutablePeriod53.add((org.joda.time.ReadableDuration) duration75);
        mutablePeriod36.add((org.joda.time.ReadableDuration) duration75);
        mutableDateTime31.add((org.joda.time.ReadableDuration) duration75);
        boolean boolean80 = duration25.isEqual((org.joda.time.ReadableDuration) duration75);
        mutableDateTime16.add((org.joda.time.ReadableDuration) duration25);
        int int82 = mutableDateTime16.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = org.joda.time.DateTimeFieldType.yearOfEra();
        mutableDateTime16.set(dateTimeFieldType83, 14);
        boolean boolean86 = mutableDateTime14.isSupported(dateTimeFieldType83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime23", (dateTime11.compareTo(mutableDateTime23) == 0) == dateTime11.equals(mutableDateTime23));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.Interval interval11 = dateMidnight8.toInterval();
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight8.toMutableDateTime();
        mutableDateTime12.addWeeks(53669883);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate localDate20 = localDate17.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfEra();
        org.joda.time.DurationField durationField23 = chronology21.seconds();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, chronology21);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime12.millisOfSecond();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime25", (mutableDateTime12.compareTo(mutableDateTime25) == 0) == mutableDateTime12.equals(mutableDateTime25));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(periodType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) periodType1, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusDays(465);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        int int12 = mutableDateTime11.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        mutableDateTime11.setZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj9, dateTimeZone14);
        org.joda.time.DateTime dateTime18 = localDateTime6.toDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) "2", dateTimeZone14);
        org.joda.time.DateTime dateTime21 = dateTime19.plus(52L);
        org.joda.time.DateTime.Property property22 = dateTime19.year();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        timeZone24.setID("1970-01-01");
        boolean boolean27 = timeZone24.observesDaylightTime();
        boolean boolean28 = timeZone24.observesDaylightTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.Chronology chronology32 = dateTimeFormatter31.getChronolgy();
        boolean boolean33 = dateTimeFormatter31.isOffsetParsed();
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter31.withLocale(locale34);
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone24, locale34);
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(locale34);
        int int38 = property22.getMaximumTextLength(locale34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar36 and calendar37", (calendar36.compareTo(calendar37) == 0) == calendar36.equals(calendar37));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        java.util.Date date7 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        org.joda.time.YearMonthDay yearMonthDay8 = org.joda.time.YearMonthDay.fromDateFields(date7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYear(53680558);
        org.joda.time.DateMidnight dateMidnight13 = dateTime10.toDateMidnight();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration14, readableInstant15, periodType16);
        mutablePeriod17.addYears((int) (byte) 0);
        int int20 = mutablePeriod17.getMonths();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableDuration21, readableInstant22, periodType23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutablePeriod24.add(readableDuration25);
        mutablePeriod24.addMonths((int) '#');
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        int int32 = localDate31.getDayOfYear();
        org.joda.time.LocalTime localTime33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate31.toDateTime(localTime33, dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = localDate31.toDateMidnight(dateTimeZone36);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.yearOfEra();
        int int39 = dateMidnight37.getMinuteOfHour();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 100, chronology41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime44.copy();
        org.joda.time.Duration duration46 = period42.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight37.plus((org.joda.time.ReadableDuration) duration46);
        mutablePeriod24.add((org.joda.time.ReadableDuration) duration46);
        mutablePeriod17.setPeriod((org.joda.time.ReadableDuration) duration46);
        org.joda.time.MutablePeriod mutablePeriod50 = mutablePeriod17.copy();
        org.joda.time.PeriodType periodType51 = mutablePeriod50.getPeriodType();
        mutablePeriod50.addSeconds(773);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) (short) 1, chronology57);
        java.lang.String str59 = localDate58.toString();
        org.joda.time.LocalDate localDate61 = localDate58.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology62 = localDate61.getChronology();
        mutablePeriod50.setPeriod((long) 15, 1L, chronology62);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((long) (short) 1, chronology68);
        java.lang.String str70 = localDate69.toString();
        org.joda.time.LocalDate localDate72 = localDate69.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology73 = localDate72.getChronology();
        org.joda.time.YearMonthDay yearMonthDay74 = new org.joda.time.YearMonthDay((long) (short) 1, chronology73);
        mutablePeriod50.setPeriod((long) 53626705, (long) 339, chronology73);
        org.joda.time.DateTimeZone dateTimeZone76 = chronology73.getZone();
        org.joda.time.DateTime dateTime77 = dateTime10.toDateTime(chronology73);
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((long) 861, chronology73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime77", (dateTime10.compareTo(dateTime77) == 0) == dateTime10.equals(dateTime77));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("57");
        int int2 = timeZone1.getRawOffset();
        java.util.Locale locale5 = new java.util.Locale("", "hi!");
        java.lang.String str6 = locale5.getCountry();
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        boolean boolean8 = locale7.hasExtensions();
        java.lang.String str9 = locale5.getDisplayVariant(locale7);
        java.lang.String str10 = locale7.getCountry();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone1, locale7);
        java.util.Calendar.Builder builder12 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder14 = builder12.setLenient(false);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        java.util.Calendar.Builder builder17 = builder14.setTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.Locale locale21 = new java.util.Locale("ISOChronology[UTC]", "2022-02-21T14:56:16.986");
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone16, locale21);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone1, locale21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar22", (calendar11.compareTo(calendar22) == 0) == calendar11.equals(calendar22));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) 1, chronology11);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.plusMonths(53617719);
        int int15 = yearMonthDay12.getDayOfMonth();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        java.lang.String str19 = localDate18.toString();
        org.joda.time.LocalDate localDate21 = localDate18.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay12.withChronologyRetainFields(chronology22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableDuration26, readableInstant27, periodType28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutablePeriod29.add(readableDuration30);
        mutablePeriod29.addMonths((int) '#');
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 1, chronology35);
        int int37 = localDate36.getDayOfYear();
        org.joda.time.LocalTime localTime38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDate36.toDateTime(localTime38, dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = localDate36.toDateMidnight(dateTimeZone41);
        org.joda.time.DateMidnight.Property property43 = dateMidnight42.yearOfEra();
        int int44 = dateMidnight42.getMinuteOfHour();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (byte) 100, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime49.copy();
        org.joda.time.Duration duration51 = period47.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime50);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight42.plus((org.joda.time.ReadableDuration) duration51);
        mutablePeriod29.add((org.joda.time.ReadableDuration) duration51);
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.years();
        java.lang.String str55 = periodType54.getName();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(periodType54);
        org.joda.time.PeriodType periodType57 = periodType54.withYearsRemoved();
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration51, periodType57);
        org.joda.time.YearMonthDay yearMonthDay60 = yearMonthDay12.withPeriodAdded((org.joda.time.ReadablePeriod) period58, (int) (byte) 0);
        java.lang.String str61 = yearMonthDay12.toString();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis(53619988);
        java.lang.String str64 = dateTimeZone63.toString();
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = yearMonthDay12.toDateTimeAtMidnight(dateTimeZone63);
        mutableDateTime1.setZoneRetainFields(dateTimeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime49", (instant0.compareTo(mutableDateTime49) == 0) == instant0.equals(mutableDateTime49));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        org.joda.time.Instant instant8 = instant4.minus((long) 'x');
        boolean boolean9 = instant1.isBefore((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis((-27422466L));
        org.joda.time.Chronology chronology13 = instant10.getChronology();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        int int18 = localDate17.getDayOfYear();
        org.joda.time.LocalDate localDate20 = localDate17.minusYears(53627214);
        int[] intArray22 = chronology13.get((org.joda.time.ReadablePartial) localDate20, (long) 342);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) instant1, chronology13);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(53619988);
        java.lang.String str26 = dateTimeZone25.toString();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.LocalDate.Property property29 = localDate27.property(dateTimeFieldType28);
        boolean boolean30 = localDate23.isSupported(dateTimeFieldType28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime3", (instant1.compareTo(mutableDateTime3) == 0) == instant1.equals(mutableDateTime3));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.plusYears(53619079);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        int int6 = mutableDateTime5.getMillisOfSecond();
        boolean boolean7 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) mutableDateTime5);
        boolean boolean8 = dateMidnight0.isAfterNow();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        int int16 = period11.size();
        org.joda.time.Period period18 = period11.plusHours(53619079);
        org.joda.time.Period period20 = period11.plusWeeks(773);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight0.withPeriodAdded((org.joda.time.ReadablePeriod) period11, 11);
        int int23 = dateMidnight22.getDayOfWeek();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight22.withDurationAdded((long) 10319, 53750);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (byte) 100, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime33.copy();
        org.joda.time.Duration duration35 = period31.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime34);
        int int36 = period31.size();
        org.joda.time.Period period38 = period31.withWeeks(842);
        org.joda.time.DurationFieldType[] durationFieldTypeArray39 = period31.getFieldTypes();
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.forFields(durationFieldTypeArray39);
        org.joda.time.PeriodType periodType41 = periodType40.withHoursRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withYearsRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 1, chronology46);
        java.lang.String str48 = localDate47.toString();
        org.joda.time.LocalDate localDate50 = localDate47.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.yearOfEra();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType44.getField(chronology51);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) (byte) 100, chronology55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime58.copy();
        org.joda.time.Duration duration60 = period56.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime59);
        org.joda.time.Period period62 = period56.plusDays((int) (byte) 10);
        int int63 = period62.getHours();
        org.joda.time.Period period65 = period62.plusMonths(2);
        org.joda.time.Period period67 = period62.minusMonths(12);
        org.joda.time.Period period69 = period62.withYears(2057);
        int[] intArray71 = chronology51.get((org.joda.time.ReadablePeriod) period69, 259200000L);
        boolean boolean72 = dateTimeFieldType43.isSupported(chronology51);
        org.joda.time.Period period73 = new org.joda.time.Period((long) 53706457, (long) 53655716, periodType41, chronology51);
        org.joda.time.DateTime dateTime74 = dateMidnight22.toDateTime(chronology51);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight22.plus(51155L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight76 and dateTime74", (dateMidnight76.compareTo(dateTime74) == 0) == dateMidnight76.equals(dateTime74));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 53677);
        org.joda.time.Instant instant4 = instant1.withDurationAdded((long) 53655716, 52);
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream7 = strSet6.parallelStream();
        boolean boolean8 = strSet6.isEmpty();
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis((-27422466L));
        boolean boolean12 = strSet6.remove((java.lang.Object) instant9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        mutableDateTime15.setZone(dateTimeZone16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.minuteOfDay();
        long long19 = property18.remainder();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.add((long) 53620623);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add(2057L);
        org.joda.time.MutableDateTime mutableDateTime26 = property22.add((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime27 = property22.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfWeek();
        org.joda.time.Instant instant30 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology31 = instant30.getChronology();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime33.copy();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        mutableDateTime34.setZone(dateTimeZone35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 1, chronology38);
        int int40 = localDate39.getDayOfYear();
        org.joda.time.LocalTime localTime41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localDate39.toDateTime(localTime41, dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = localDate39.toDateMidnight(dateTimeZone44);
        org.joda.time.DateMidnight.Property property46 = dateMidnight45.yearOfEra();
        int int47 = dateMidnight45.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property48 = dateMidnight45.year();
        boolean boolean49 = mutableDateTime34.isBefore((org.joda.time.ReadableInstant) dateMidnight45);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime34.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(readableDuration51, readableInstant52, periodType53);
        mutablePeriod54.addYears((int) (byte) 0);
        int int57 = mutablePeriod54.getMonths();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(readableDuration58, readableInstant59, periodType60);
        org.joda.time.ReadableDuration readableDuration62 = null;
        mutablePeriod61.add(readableDuration62);
        mutablePeriod61.addMonths((int) '#');
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((long) (short) 1, chronology67);
        int int69 = localDate68.getDayOfYear();
        org.joda.time.LocalTime localTime70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = localDate68.toDateTime(localTime70, dateTimeZone71);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateMidnight dateMidnight74 = localDate68.toDateMidnight(dateTimeZone73);
        org.joda.time.DateMidnight.Property property75 = dateMidnight74.yearOfEra();
        int int76 = dateMidnight74.getMinuteOfHour();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((long) (byte) 100, chronology78);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(chronology80);
        org.joda.time.MutableDateTime mutableDateTime82 = mutableDateTime81.copy();
        org.joda.time.Duration duration83 = period79.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime82);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight74.plus((org.joda.time.ReadableDuration) duration83);
        mutablePeriod61.add((org.joda.time.ReadableDuration) duration83);
        mutablePeriod54.setPeriod((org.joda.time.ReadableDuration) duration83);
        mutableDateTime34.add((org.joda.time.ReadableDuration) duration83);
        org.joda.time.Instant instant89 = instant30.withDurationAdded((org.joda.time.ReadableDuration) duration83, 53);
        mutableDateTime27.add((org.joda.time.ReadableDuration) duration83, (int) '#');
        org.joda.time.Instant instant93 = instant9.withDurationAdded((org.joda.time.ReadableDuration) duration83, 53737423);
        org.joda.time.Instant instant94 = instant1.minus((org.joda.time.ReadableDuration) duration83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime14", (instant9.compareTo(mutableDateTime14) == 0) == instant9.equals(mutableDateTime14));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime10 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra(53617440);
        java.lang.String str13 = dateTime12.toString();
        org.joda.time.DateTime.Property property14 = dateTime12.secondOfDay();
        org.joda.time.DateTime dateTime16 = dateTime12.plusYears(6);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone19 = dateMidnight18.getZone();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) 5, dateTimeZone19);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.now(dateTimeZone19);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime12.toDateTime(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime23", (dateTime12.compareTo(dateTime23) == 0) == dateTime12.equals(dateTime23));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(53618165);
        org.joda.time.Period period17 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateTime dateTime19 = dateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) period17, 53620134);
        int int20 = dateTime19.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime19.get(dateTimeFieldType21);
        int int23 = dateTime19.getYearOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.Chronology chronology27 = dateTimeFormatter26.getChronolgy();
        boolean boolean28 = dateTimeFormatter26.isOffsetParsed();
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter26.withLocale(locale29);
        java.lang.String str31 = locale29.getDisplayVariant();
        java.util.Calendar calendar32 = dateTime19.toCalendar(locale29);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        int int36 = localDate35.getDayOfYear();
        org.joda.time.LocalTime localTime37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate35.toDateTime(localTime37, dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = localDate35.toDateMidnight(dateTimeZone40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.yearOfEra();
        int int43 = dateMidnight41.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property44 = dateMidnight41.year();
        org.joda.time.DateMidnight.Property property45 = dateMidnight41.centuryOfEra();
        int int46 = dateMidnight41.getYearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        mutablePeriod49.add((int) (byte) 10, 904, 53619708, 47, 10, (-292275054), 0, 342);
        mutablePeriod49.addHours(718);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight41.minus((org.joda.time.ReadablePeriod) mutablePeriod49);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) (short) 1, chronology64);
        java.lang.String str66 = localDate65.toString();
        org.joda.time.LocalDate localDate68 = localDate65.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology69 = localDate68.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(chronology69);
        org.joda.time.DateTimeField dateTimeField72 = chronology69.era();
        org.joda.time.DateTimeField dateTimeField73 = chronology69.millisOfSecond();
        org.joda.time.DurationField durationField74 = chronology69.years();
        org.joda.time.LocalDate localDate75 = org.joda.time.LocalDate.now(chronology69);
        org.joda.time.MutableDateTime mutableDateTime76 = org.joda.time.MutableDateTime.now(chronology69);
        org.joda.time.DateTimeField dateTimeField77 = chronology69.halfdayOfDay();
        mutablePeriod49.setPeriod((long) 281, chronology69);
        org.joda.time.LocalDate localDate79 = org.joda.time.LocalDate.now(chronology69);
        org.joda.time.DateTime dateTime80 = dateTime19.toDateTime(chronology69);
        org.joda.time.DateTimeField dateTimeField81 = chronology69.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime80", (dateTime19.compareTo(dateTime80) == 0) == dateTime19.equals(dateTime80));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Instant instant16 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant18 = instant4.plus((long) 32770);
        org.joda.time.Instant instant20 = instant18.plus((long) 53781454);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime8", (instant4.compareTo(mutableDateTime8) == 0) == instant4.equals(mutableDateTime8));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.DateTime.Property property10 = dateTime5.millisOfSecond();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight15.getZone();
        mutableDateTime13.setZoneRetainFields(dateTimeZone16);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) 842, dateTimeZone16);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.yearOfCentury();
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.Instant instant23 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology24 = instant23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = instant23.toMutableDateTimeISO();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        mutablePeriod28.add((int) (byte) 10, 904, 53619708, 47, 10, (-292275054), 0, 342);
        int int38 = mutablePeriod28.size();
        mutablePeriod28.clear();
        mutableDateTime25.add((org.joda.time.ReadablePeriod) mutablePeriod28, 53981642);
        boolean boolean42 = period21.equals((java.lang.Object) mutableDateTime25);
        org.joda.time.Period period44 = period21.withYears(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and mutableDateTime25", (instant23.compareTo(mutableDateTime25) == 0) == instant23.equals(mutableDateTime25));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime1 = timeOfDay0.toDateTimeToday();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = timeOfDay0.getFieldType(0);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.minusMillis(18);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay0.hourOfDay();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 792);
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.DateTime dateTime10 = timeOfDay0.toDateTime((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime9.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime9", (instant8.compareTo(dateTime9) == 0) == instant8.equals(dateTime9));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.minusDays(465);
        org.joda.time.DateTime.Property property12 = dateTime11.monthOfYear();
        org.joda.time.DateTime.Property property13 = dateTime11.minuteOfHour();
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.minuteOfDay();
        int int17 = mutableDateTime15.getMillisOfDay();
        mutableDateTime15.setMillis(0L);
        int int20 = dateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant14", (dateTime5.compareTo(instant14) == 0) == dateTime5.equals(instant14));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 23);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 1);
        org.joda.time.Instant instant5 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = instant5.toMutableDateTimeISO();
        long long8 = instant5.getMillis();
        org.joda.time.Chronology chronology9 = instant5.getChronology();
        int int10 = instant1.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        int int14 = localDate13.getDayOfYear();
        org.joda.time.LocalTime localTime15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTime(localTime15, dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = localDate13.toDateMidnight(dateTimeZone18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.yearOfEra();
        int int21 = dateMidnight19.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = dateMidnight19.isSupported(dateTimeFieldType22);
        org.joda.time.Period period28 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight19.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone31 = dateMidnight30.getZone();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) (short) 1, chronology33);
        java.lang.String str35 = localDate34.toString();
        org.joda.time.LocalDate localDate37 = localDate34.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight30.withFields((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight30.withField(dateTimeFieldType39, 842);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 100, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime46.copy();
        org.joda.time.Duration duration48 = period44.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.Period period50 = period44.plusDays((int) (byte) 10);
        org.joda.time.Duration duration51 = period50.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight30.minus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight29.minus((org.joda.time.ReadableDuration) duration51);
        java.lang.String str54 = duration51.toString();
        org.joda.time.Instant instant56 = instant5.withDurationAdded((org.joda.time.ReadableDuration) duration51, 53768336);
        org.joda.time.Instant instant57 = instant5.toInstant();
        org.joda.time.Chronology chronology58 = instant5.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant5", (mutableDateTime7.compareTo(instant5) == 0) == mutableDateTime7.equals(instant5));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        boolean boolean12 = dateTimeFormatter5.isPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.eras();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology23);
        boolean boolean26 = dateTimeFieldType13.isSupported(chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter5.withChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField28 = chronology23.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology23.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField29, and durationField24", !(durationField24.compareTo(durationField29) == 0) || (Math.signum(durationField24.compareTo(durationField24)) == Math.signum(durationField29.compareTo(durationField24))));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        java.lang.String str5 = localTime0.toString();
        org.joda.time.LocalTime localTime7 = localTime0.minusHours(773);
        org.joda.time.Chronology chronology8 = localTime0.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.centuries();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.LocalTime localTime14 = localTime11.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime11.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths(10);
        org.joda.time.DateTime.Property property19 = dateTime16.minuteOfDay();
        org.joda.time.DateTime dateTime20 = property19.getDateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.dayOfWeek();
        org.joda.time.DateTime dateTime23 = dateTime20.minusMonths(21);
        int int24 = dateTime20.getMonthOfYear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) 100, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime29.copy();
        org.joda.time.Duration duration31 = period27.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((-1), 53620134, (int) (byte) -1, 53617719, (int) (byte) 100, 53619079, 1, 53);
        org.joda.time.Period period41 = period27.minus((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.DateTime dateTime43 = dateTime20.withPeriodAdded((org.joda.time.ReadablePeriod) period27, 53621101);
        org.joda.time.Period period45 = period27.withWeeks(4468419);
        org.joda.time.Period period47 = period45.plusMillis(544);
        int[] intArray49 = chronology8.get((org.joda.time.ReadablePeriod) period45, (long) 561);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and dateTime16", (mutableDateTime9.compareTo(dateTime16) == 0) == mutableDateTime9.equals(dateTime16));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        long long6 = property5.remainder();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        java.lang.String str12 = localDate11.toString();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.DurationField durationField19 = chronology15.weeks();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.era();
        mutableDateTime7.setRounding(dateTimeField20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime18", (mutableDateTime1.compareTo(mutableDateTime18) == 0) == mutableDateTime1.equals(mutableDateTime18));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableDuration1, readableInstant2, periodType3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutablePeriod4.add(readableDuration5);
        mutablePeriod4.addMonths((int) '#');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        int int12 = localDate11.getDayOfYear();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate11.toDateTime(localTime13, dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = localDate11.toDateMidnight(dateTimeZone16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.yearOfEra();
        int int19 = dateMidnight17.getMinuteOfHour();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (byte) 100, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.copy();
        org.joda.time.Duration duration26 = period22.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight17.plus((org.joda.time.ReadableDuration) duration26);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Period period29 = duration26.toPeriod();
        org.joda.time.Instant instant31 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration26, 53626727);
        boolean boolean33 = instant31.isAfter(32441870357785866L);
        org.joda.time.MutableDateTime mutableDateTime34 = instant31.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime24", (instant0.compareTo(mutableDateTime24) == 0) == instant0.equals(mutableDateTime24));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        int int3 = dateTime2.getDayOfYear();
        org.joda.time.DateTime.Property property4 = dateTime2.hourOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology11);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.era();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.monthOfYear();
        int int16 = dateTime2.get(dateTimeField15);
        java.lang.String str18 = dateTimeField15.getAsShortText(14843L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and mutableDateTime13", (dateTime0.compareTo(mutableDateTime13) == 0) == dateTime0.equals(mutableDateTime13));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 53643303);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.addWrapField(95);
        org.joda.time.Period period8 = new org.joda.time.Period(100L, (long) 'u');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        int int12 = localDate11.getDayOfYear();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate11.toDateTime(localTime13, dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = localDate11.toDateMidnight(dateTimeZone16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.yearOfEra();
        int int19 = dateMidnight17.getMinuteOfHour();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (byte) 100, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.copy();
        org.joda.time.Duration duration26 = period22.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight17.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant28 = dateMidnight27.toInstant();
        org.joda.time.Duration duration29 = period8.toDurationFrom((org.joda.time.ReadableInstant) instant28);
        mutableDateTime5.add((org.joda.time.ReadableDuration) duration29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and instant28", (dateMidnight17.compareTo(instant28) == 0) == dateMidnight17.equals(instant28));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology12);
        boolean boolean15 = dateTimeFieldType2.isSupported(chronology12);
        java.lang.String str16 = chronology12.toString();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.dayOfYear();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((java.lang.Object) "2022-02-21T14:53:37.096Z", chronology12);
        org.joda.time.DateTimeField dateTimeField20 = chronology12.clockhourOfDay();
        org.joda.time.DurationField durationField21 = dateTimeField20.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField21, and durationField13", !(durationField13.compareTo(durationField21) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField21.compareTo(durationField13))));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        long long4 = instant1.getMillis();
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTimeISO();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        int int7 = dateMidnight6.getYearOfCentury();
        int int8 = dateMidnight6.getHourOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.copy();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight12.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight12.withField(dateTimeFieldType21, 842);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight12.plus((long) (byte) -1);
        org.joda.time.DateMidnight.Property property26 = dateMidnight25.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone28 = dateMidnight27.getZone();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        java.lang.String str32 = localDate31.toString();
        org.joda.time.LocalDate localDate34 = localDate31.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight27.withFields((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight27.withField(dateTimeFieldType36, 842);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (byte) 100, chronology40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime43.copy();
        org.joda.time.Duration duration45 = period41.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.Period period47 = period41.plusDays((int) (byte) 10);
        org.joda.time.Duration duration48 = period47.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight27.minus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight25.plus((org.joda.time.ReadableDuration) duration48);
        mutableDateTime10.add((org.joda.time.ReadableDuration) duration48);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight6, (org.joda.time.ReadableDuration) duration48);
        org.joda.time.Instant instant54 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration48, 708);
        org.joda.time.Instant instant56 = instant1.plus((-27422466L));
        org.joda.time.Instant instant59 = instant56.withDurationAdded(53695640L, 53808);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime3", (instant1.compareTo(mutableDateTime3) == 0) == instant1.equals(mutableDateTime3));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.era();
        org.joda.time.DurationField durationField10 = chronology6.hours();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.dayOfMonth();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.years();
        java.lang.String str17 = periodType16.getName();
        org.joda.time.PeriodType periodType18 = periodType16.withMonthsRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        java.lang.String str24 = localDate23.toString();
        org.joda.time.LocalDate localDate26 = localDate23.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType20.getField(chronology27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (byte) 100, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime34.copy();
        org.joda.time.Duration duration36 = period32.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.Period period38 = period32.plusDays((int) (byte) 10);
        int int39 = period38.getHours();
        org.joda.time.Period period41 = period38.plusMonths(2);
        org.joda.time.Period period43 = period38.minusMonths(12);
        org.joda.time.Period period45 = period38.withYears(2057);
        int[] intArray47 = chronology27.get((org.joda.time.ReadablePeriod) period45, 259200000L);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) 1970, chronology27);
        org.joda.time.DateTimeField dateTimeField49 = chronology27.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 339, (long) 53646, periodType16, chronology27);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(readableDuration51, readableInstant52, periodType53);
        mutablePeriod54.addYears((int) (byte) 0);
        int int57 = mutablePeriod54.getMonths();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(readableDuration58, readableInstant59, periodType60);
        org.joda.time.ReadableDuration readableDuration62 = null;
        mutablePeriod61.add(readableDuration62);
        mutablePeriod61.addMonths((int) '#');
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((long) (short) 1, chronology67);
        int int69 = localDate68.getDayOfYear();
        org.joda.time.LocalTime localTime70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = localDate68.toDateTime(localTime70, dateTimeZone71);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateMidnight dateMidnight74 = localDate68.toDateMidnight(dateTimeZone73);
        org.joda.time.DateMidnight.Property property75 = dateMidnight74.yearOfEra();
        int int76 = dateMidnight74.getMinuteOfHour();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((long) (byte) 100, chronology78);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(chronology80);
        org.joda.time.MutableDateTime mutableDateTime82 = mutableDateTime81.copy();
        org.joda.time.Duration duration83 = period79.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime82);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight74.plus((org.joda.time.ReadableDuration) duration83);
        mutablePeriod61.add((org.joda.time.ReadableDuration) duration83);
        mutablePeriod54.setPeriod((org.joda.time.ReadableDuration) duration83);
        mutablePeriod50.setPeriod((org.joda.time.ReadableDuration) duration83);
        org.joda.time.DateMidnight dateMidnight88 = dateMidnight12.minus((org.joda.time.ReadableDuration) duration83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime34", (mutableDateTime8.compareTo(mutableDateTime34) == 0) == mutableDateTime8.equals(mutableDateTime34));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.plusYears(53619079);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
        int int6 = mutableDateTime5.getMillisOfSecond();
        boolean boolean7 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) mutableDateTime5);
        int int8 = mutableDateTime5.getMillisOfSecond();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.joda.time.Instant instant12 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        mutableDateTime10.setChronology(chronology13);
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime5.add(32441870357888182L);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableDuration18, readableInstant19, periodType20);
        mutablePeriod21.addYears((int) (byte) 0);
        int int24 = mutablePeriod21.getMonths();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableDuration25, readableInstant26, periodType27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        mutablePeriod28.add(readableDuration29);
        mutablePeriod28.addMonths((int) '#');
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, chronology34);
        int int36 = localDate35.getDayOfYear();
        org.joda.time.LocalTime localTime37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate35.toDateTime(localTime37, dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = localDate35.toDateMidnight(dateTimeZone40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.yearOfEra();
        int int43 = dateMidnight41.getMinuteOfHour();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (byte) 100, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime48.copy();
        org.joda.time.Duration duration50 = period46.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight41.plus((org.joda.time.ReadableDuration) duration50);
        mutablePeriod28.add((org.joda.time.ReadableDuration) duration50);
        mutablePeriod21.setPeriod((org.joda.time.ReadableDuration) duration50);
        org.joda.time.MutablePeriod mutablePeriod54 = mutablePeriod21.copy();
        org.joda.time.PeriodType periodType55 = mutablePeriod54.getPeriodType();
        mutablePeriod54.addSeconds(773);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((long) (short) 1, chronology61);
        java.lang.String str63 = localDate62.toString();
        org.joda.time.LocalDate localDate65 = localDate62.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology66 = localDate65.getChronology();
        mutablePeriod54.setPeriod((long) 15, 1L, chronology66);
        org.joda.time.DateTimeZone dateTimeZone68 = chronology66.getZone();
        org.joda.time.DateTimeField dateTimeField69 = chronology66.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField70 = chronology66.weekOfWeekyear();
        mutableDateTime5.setChronology(chronology66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime48", (instant9.compareTo(mutableDateTime48) == 0) == instant9.equals(mutableDateTime48));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.Period period11 = new org.joda.time.Period(58385L, 0L, periodType2, chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.hourOfHalfday();
        int int13 = dateTimeField12.getMinimumValue();
        org.joda.time.DurationField durationField14 = dateTimeField12.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField14, and durationField10", !(durationField10.compareTo(durationField14) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField14.compareTo(durationField10))));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(53618333);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (byte) 100, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime12.copy();
        org.joda.time.Duration duration14 = period10.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.Period period16 = period10.plusDays((int) (byte) 10);
        org.joda.time.Duration duration17 = period16.toStandardDuration();
        org.joda.time.DateTime dateTime18 = dateTime6.minus((org.joda.time.ReadableDuration) duration17);
        int int19 = dateTime6.getHourOfDay();
        org.joda.time.DateTime dateTime21 = dateTime6.minusSeconds(0);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 1, chronology23);
        int int25 = localDate24.getDayOfYear();
        org.joda.time.LocalTime localTime26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate24.toDateTime(localTime26, dateTimeZone27);
        int int29 = dateTime28.getYearOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) (short) 1, chronology31);
        java.lang.String str33 = localDate32.toString();
        org.joda.time.LocalDate localDate35 = localDate32.withYearOfEra((int) (byte) 100);
        int int36 = localDate32.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DateTime dateTime39 = localDate32.toDateTime((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone41 = dateMidnight40.getZone();
        boolean boolean43 = dateTimeZone41.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate44 = org.joda.time.LocalDate.now(dateTimeZone41);
        java.lang.String str46 = dateTimeZone41.getNameKey((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime38.toMutableDateTime(dateTimeZone41);
        long long49 = dateTimeZone41.previousTransition((long) 53632);
        long long51 = dateTimeZone41.convertUTCToLocal((long) 53643405);
        java.lang.String str53 = dateTimeZone41.getNameKey((long) (-292275054));
        org.joda.time.DateTime dateTime54 = dateTime28.toDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime56 = dateTime54.minusMillis(53711206);
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((long) (short) 1, chronology61);
        java.lang.String str63 = localDate62.toString();
        org.joda.time.LocalDate localDate65 = localDate62.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology66 = localDate65.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfEra();
        org.joda.time.DateTimeField dateTimeField68 = dateTimeFieldType59.getField(chronology66);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology66);
        org.joda.time.Period period70 = new org.joda.time.Period((long) (-1), periodType58, chronology66);
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate();
        int int72 = localDate71.getDayOfWeek();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((long) (byte) 100, chronology74);
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType79 = org.joda.time.DurationFieldType.hours();
        mutableDateTime78.add(durationFieldType79, (int) (byte) 0);
        int int82 = periodType76.indexOf(durationFieldType79);
        int int83 = period75.indexOf(durationFieldType79);
        boolean boolean84 = localDate71.isSupported(durationFieldType79);
        org.joda.time.Period period86 = period70.withField(durationFieldType79, 53881019);
        org.joda.time.DateTime dateTime88 = dateTime56.withFieldAdded(durationFieldType79, 53883795);
        org.joda.time.DateTime dateTime90 = dateTime21.withFieldAdded(durationFieldType79, 21389025);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime69", (dateTime0.compareTo(dateTime69) == 0) == dateTime0.equals(dateTime69));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        long long6 = property5.remainder();
        org.joda.time.MutableDateTime mutableDateTime8 = property5.add((long) 53620623);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundHalfEven();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableDuration12, readableInstant13, periodType14);
        mutablePeriod15.addYears((int) (byte) 0);
        int int18 = mutablePeriod15.getMonths();
        mutablePeriod15.setWeeks(6);
        mutablePeriod15.setMinutes(53626727);
        mutablePeriod15.setMillis(185);
        mutableDateTime11.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone29 = dateMidnight28.getZone();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.plusYears(53619079);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(chronology32);
        int int34 = mutableDateTime33.getMillisOfSecond();
        boolean boolean35 = dateMidnight28.isEqual((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) (short) 1, chronology37);
        int int39 = localDate38.getDayOfYear();
        org.joda.time.LocalTime localTime40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate38.toDateTime(localTime40, dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = localDate38.toDateMidnight(dateTimeZone43);
        org.joda.time.DateMidnight.Property property45 = dateMidnight44.yearOfEra();
        int int46 = dateMidnight44.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property47 = dateMidnight44.year();
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight44.plusYears((int) ' ');
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight44);
        boolean boolean51 = mutableDateTime33.isEqual((org.joda.time.ReadableInstant) dateMidnight44);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) (short) 1, chronology55);
        java.lang.String str57 = localDate56.toString();
        org.joda.time.LocalDate localDate59 = localDate56.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology60 = localDate59.getChronology();
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) 1, chronology60);
        org.joda.time.YearMonthDay yearMonthDay63 = yearMonthDay61.plusMonths(53617719);
        int int64 = yearMonthDay61.getDayOfMonth();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((long) (short) 1, chronology66);
        java.lang.String str68 = localDate67.toString();
        org.joda.time.LocalDate localDate70 = localDate67.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology71 = localDate70.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay73 = yearMonthDay61.withChronologyRetainFields(chronology71);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(obj52, chronology71);
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(readableDuration75, readableInstant76, periodType77);
        int int79 = mutablePeriod78.getMinutes();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.LocalDate localDate83 = new org.joda.time.LocalDate((long) (short) 1, chronology82);
        java.lang.String str84 = localDate83.toString();
        org.joda.time.LocalDate localDate86 = localDate83.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology87 = localDate86.getChronology();
        org.joda.time.DateTimeField dateTimeField88 = chronology87.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime(chronology87);
        mutablePeriod78.setPeriod((long) 53617649, chronology87);
        org.joda.time.MutableDateTime mutableDateTime91 = dateTime74.toMutableDateTime(chronology87);
        mutableDateTime33.setChronology(chronology87);
        mutablePeriod15.setPeriod(1693576378598397280L, (long) 5, chronology87);
        org.joda.time.DurationField durationField94 = chronology87.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime33", (mutableDateTime1.compareTo(mutableDateTime33) == 0) == mutableDateTime1.equals(mutableDateTime33));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime3.copy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        mutableDateTime4.setZone(dateTimeZone5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.minuteOfDay();
        int int8 = mutableDateTime4.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.hourOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime4.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfCeiling();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight12.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight12.withField(dateTimeFieldType21, 842);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime11.property(dateTimeFieldType21);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 1, chronology26);
        int int28 = localDate27.getDayOfYear();
        org.joda.time.LocalTime localTime29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate27.toDateTime(localTime29, dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = localDate27.toDateMidnight(dateTimeZone32);
        org.joda.time.DateMidnight.Property property34 = dateMidnight33.yearOfEra();
        int int35 = dateMidnight33.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property36 = dateMidnight33.year();
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight33.plusYears((int) ' ');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight33);
        org.joda.time.LocalDate.Property property40 = localDate39.dayOfYear();
        org.joda.time.Chronology chronology41 = localDate39.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.weeks();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 1, chronology45);
        java.lang.String str47 = localDate46.toString();
        org.joda.time.LocalDate localDate49 = localDate46.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology50 = localDate49.getChronology();
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay((long) (short) 1, chronology50);
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay51.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone55 = dateMidnight54.getZone();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) (short) 1, chronology57);
        java.lang.String str59 = localDate58.toString();
        org.joda.time.LocalDate localDate61 = localDate58.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight54.withFields((org.joda.time.ReadablePartial) localDate61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight54.withField(dateTimeFieldType63, 842);
        org.joda.time.YearMonthDay.Property property66 = yearMonthDay51.property(dateTimeFieldType63);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(readableDuration67, readableInstant68, periodType69);
        org.joda.time.ReadableDuration readableDuration71 = null;
        mutablePeriod70.add(readableDuration71);
        mutablePeriod70.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(readableDuration75, readableInstant76, periodType77);
        org.joda.time.ReadableDuration readableDuration79 = null;
        mutablePeriod78.add(readableDuration79);
        mutablePeriod78.addMonths((int) '#');
        mutablePeriod70.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod78);
        mutablePeriod78.add((-1L));
        org.joda.time.YearMonthDay yearMonthDay87 = yearMonthDay51.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod78, 457);
        int[] intArray90 = chronology41.get((org.joda.time.ReadablePeriod) mutablePeriod78, (long) 53636, (long) 53702524);
        org.joda.time.DurationField durationField91 = chronology41.centuries();
        org.joda.time.DateTime dateTime92 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime11, chronology41);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((long) 53628335, (long) 53910636, chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime92", (mutableDateTime3.compareTo(dateTime92) == 0) == mutableDateTime3.equals(dateTime92));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(53618165);
        java.lang.String str14 = dateTime10.toString("14:53:45.116");
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withCenturyOfEra(32770);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.copy();
        mutableDateTime19.addMinutes(0);
        java.lang.String str23 = mutableDateTime19.toString();
        int int24 = mutableDateTime19.getYearOfEra();
        org.joda.time.Chronology chronology25 = mutableDateTime19.getChronology();
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.String str27 = mutableDateTime19.toString();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 1, chronology32);
        java.lang.String str34 = localDate33.toString();
        org.joda.time.LocalDate localDate36 = localDate33.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology37);
        org.joda.time.DurationField durationField40 = chronology37.years();
        org.joda.time.Period period41 = new org.joda.time.Period((long) 22, periodType30, chronology37);
        org.joda.time.DurationField durationField42 = chronology37.minutes();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 53866329, chronology37);
        mutableDateTime19.setChronology(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and mutableDateTime39", (mutableDateTime20.compareTo(mutableDateTime39) == 0) == mutableDateTime20.equals(mutableDateTime39));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.minuteOfDay();
        int int3 = mutableDateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        int int10 = localDate6.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DateTime dateTime13 = localDate6.toDateTime((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = dateMidnight14.getZone();
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now(dateTimeZone15);
        java.lang.String str20 = dateTimeZone15.getNameKey((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime12.toMutableDateTime(dateTimeZone15);
        java.util.Locale locale26 = new java.util.Locale("hi!", "Years", "1970-01-01");
        java.lang.String str27 = dateTimeZone15.getShortName((long) 53617440, locale26);
        org.joda.time.DateTime dateTime28 = mutableDateTime1.toDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) mutableDateTime1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime28", (instant0.compareTo(dateTime28) == 0) == instant0.equals(dateTime28));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        long long6 = property5.remainder();
        org.joda.time.MutableDateTime mutableDateTime8 = property5.add((long) 53620623);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundFloor();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        int int16 = localDate15.getDayOfYear();
        org.joda.time.LocalTime localTime17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate15.toDateTime(localTime17, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = localDate15.toDateMidnight(dateTimeZone20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.yearOfEra();
        int int23 = dateMidnight21.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = dateMidnight21.isSupported(dateTimeFieldType24);
        org.joda.time.Instant instant26 = dateMidnight21.toInstant();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 1, chronology28);
        int int30 = localDate29.getDayOfYear();
        org.joda.time.LocalTime localTime31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate29.toDateTime(localTime31, dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = localDate29.toDateMidnight(dateTimeZone34);
        org.joda.time.DateMidnight.Property property36 = dateMidnight35.yearOfEra();
        int int37 = dateMidnight35.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        boolean boolean39 = dateMidnight35.isSupported(dateTimeFieldType38);
        org.joda.time.Period period44 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight35.minus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone47 = dateMidnight46.getZone();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 1, chronology49);
        java.lang.String str51 = localDate50.toString();
        org.joda.time.LocalDate localDate53 = localDate50.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight46.withFields((org.joda.time.ReadablePartial) localDate53);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight46.withField(dateTimeFieldType55, 842);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) (byte) 100, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(chronology61);
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime62.copy();
        org.joda.time.Duration duration64 = period60.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime63);
        org.joda.time.Period period66 = period60.plusDays((int) (byte) 10);
        org.joda.time.Duration duration67 = period66.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight46.minus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight45.minus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Instant instant70 = instant26.plus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime12, (org.joda.time.ReadableDuration) duration67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight21 and instant26", (dateMidnight21.compareTo(instant26) == 0) == dateMidnight21.equals(instant26));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        mutablePeriod3.addYears((int) (byte) 0);
        int int6 = mutablePeriod3.getMonths();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addMonths((int) '#');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        int int18 = localDate17.getDayOfYear();
        org.joda.time.LocalTime localTime19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate17.toDateTime(localTime19, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = localDate17.toDateMidnight(dateTimeZone22);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfEra();
        int int25 = dateMidnight23.getMinuteOfHour();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 100, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime30.copy();
        org.joda.time.Duration duration32 = period28.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight23.plus((org.joda.time.ReadableDuration) duration32);
        mutablePeriod10.add((org.joda.time.ReadableDuration) duration32);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Instant instant36 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime37 = instant36.toDateTimeISO();
        long long38 = instant36.getMillis();
        org.joda.time.DateTime dateTime39 = instant36.toDateTime();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableDuration40, readableInstant41, periodType42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutablePeriod43.add(readableDuration44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime48 = dateTime46.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime50 = dateTime48.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime52 = dateTime50.minusMillis(53618333);
        org.joda.time.DateTime dateTime53 = dateTime52.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) (byte) 100, chronology55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime58.copy();
        org.joda.time.Duration duration60 = period56.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime59);
        org.joda.time.Period period62 = period56.plusDays((int) (byte) 10);
        org.joda.time.Duration duration63 = period62.toStandardDuration();
        org.joda.time.DateTime dateTime64 = dateTime52.minus((org.joda.time.ReadableDuration) duration63);
        mutablePeriod43.setPeriod((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Instant instant66 = instant36.minus((org.joda.time.ReadableDuration) duration63);
        boolean boolean67 = duration32.isLongerThan((org.joda.time.ReadableDuration) duration63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime30 and instant36", (mutableDateTime30.compareTo(instant36) == 0) == mutableDateTime30.equals(instant36));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addMonths((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType9.getField(chronology16);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTimeField dateTimeField20 = chronology16.dayOfMonth();
        mutablePeriod3.setPeriod((long) 673, chronology16);
        mutablePeriod3.setPeriod(193031960017649L);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(readableDuration27, readableInstant28, periodType29);
        mutablePeriod30.addYears((int) (byte) 0);
        int int33 = mutablePeriod30.getMonths();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(readableDuration34, readableInstant35, periodType36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutablePeriod37.add(readableDuration38);
        mutablePeriod37.addMonths((int) '#');
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 1, chronology43);
        int int45 = localDate44.getDayOfYear();
        org.joda.time.LocalTime localTime46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDate44.toDateTime(localTime46, dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = localDate44.toDateMidnight(dateTimeZone49);
        org.joda.time.DateMidnight.Property property51 = dateMidnight50.yearOfEra();
        int int52 = dateMidnight50.getMinuteOfHour();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) (byte) 100, chronology54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(chronology56);
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime57.copy();
        org.joda.time.Duration duration59 = period55.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime58);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight50.plus((org.joda.time.ReadableDuration) duration59);
        mutablePeriod37.add((org.joda.time.ReadableDuration) duration59);
        mutablePeriod30.setPeriod((org.joda.time.ReadableDuration) duration59);
        org.joda.time.MutablePeriod mutablePeriod63 = mutablePeriod30.copy();
        org.joda.time.PeriodType periodType64 = mutablePeriod63.getPeriodType();
        org.joda.time.PeriodType periodType65 = periodType64.withYearsRemoved();
        org.joda.time.PeriodType periodType66 = periodType65.withDaysRemoved();
        org.joda.time.Period period67 = new org.joda.time.Period((long) 855, (long) (-292275054), periodType66);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(0L, periodType66);
        mutablePeriod68.addWeeks(63);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and mutableDateTime57", (dateTime19.compareTo(mutableDateTime57) == 0) == dateTime19.equals(mutableDateTime57));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        int int5 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        java.lang.String str12 = localDate11.toString();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.eras();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology15);
        mutableDateTime1.setChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime2", (mutableDateTime1.compareTo(mutableDateTime2) == 0) == mutableDateTime1.equals(mutableDateTime2));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        java.lang.Object obj0 = null;
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(obj0);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.withMillisOfSecond(20);
        org.joda.time.TimeOfDay.Property property4 = timeOfDay3.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay3.plusMillis(53655826);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 53677);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((long) 53655716, 52);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property13 = localTime12.minuteOfHour();
        org.joda.time.LocalTime localTime15 = localTime12.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localTime12.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths(10);
        org.joda.time.DateTime.Property property20 = dateTime17.minuteOfDay();
        org.joda.time.DateTime.Property property21 = dateTime17.year();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 100, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime26.copy();
        org.joda.time.Duration duration28 = period24.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(chronology30);
        mutableDateTime31.addMinutes(904);
        int int34 = mutableDateTime31.getYearOfCentury();
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.Instant instant36 = instant11.plus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.DateTime dateTime37 = instant36.toDateTimeISO();
        org.joda.time.Chronology chronology38 = instant36.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay3.withChronologyRetainFields(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and dateTime37", (instant36.compareTo(dateTime37) == 0) == instant36.equals(dateTime37));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(718);
        org.joda.time.Period period3 = period1.withMonths(53657228);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) 1, chronology11);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.plusMonths(53617719);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableDuration15, readableInstant16, periodType17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutablePeriod18.add(readableDuration19);
        mutablePeriod18.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(readableDuration23, readableInstant24, periodType25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutablePeriod26.add(readableDuration27);
        mutablePeriod26.addMonths((int) '#');
        mutablePeriod18.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay14.plus((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) 100, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime37.copy();
        org.joda.time.Duration duration39 = period35.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.Seconds seconds40 = period35.toStandardSeconds();
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay32.minus((org.joda.time.ReadablePeriod) seconds40);
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay32.plusMonths(3);
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay32.minusMonths(53746246);
        boolean boolean46 = period3.equals((java.lang.Object) yearMonthDay45);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 1, chronology50);
        java.lang.String str52 = localDate51.toString();
        org.joda.time.LocalDate localDate54 = localDate51.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology55 = localDate54.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(chronology55);
        org.joda.time.DurationField durationField58 = chronology55.years();
        org.joda.time.Period period59 = new org.joda.time.Period((long) 22, periodType48, chronology55);
        org.joda.time.Period period61 = period59.minusWeeks(53626980);
        org.joda.time.DurationFieldType[] durationFieldTypeArray62 = period59.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay63 = yearMonthDay45.minus((org.joda.time.ReadablePeriod) period59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime37 and mutableDateTime57", (mutableDateTime37.compareTo(mutableDateTime57) == 0) == mutableDateTime37.equals(mutableDateTime57));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType2.getField(chronology9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (byte) 100, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.copy();
        org.joda.time.Duration duration18 = period14.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.Period period20 = period14.plusDays((int) (byte) 10);
        int int21 = period20.getHours();
        org.joda.time.Period period23 = period20.plusMonths(2);
        org.joda.time.Period period25 = period20.minusMonths(12);
        org.joda.time.Period period27 = period20.withYears(2057);
        int[] intArray29 = chronology9.get((org.joda.time.ReadablePeriod) period27, 259200000L);
        boolean boolean30 = dateTimeFieldType1.isSupported(chronology9);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology9);
        org.joda.time.Period period32 = new org.joda.time.Period(32441870358023228L, chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime31", (mutableDateTime16.compareTo(dateTime31) == 0) == mutableDateTime16.equals(dateTime31));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology11);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.year();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = durationFieldType1.getField(chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField16, and durationField12", !(durationField12.compareTo(durationField16) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField16.compareTo(durationField12))));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology11);
        boolean boolean14 = dateTimeFieldType1.isSupported(chronology11);
        org.joda.time.Period period15 = new org.joda.time.Period((long) 53778822, chronology11);
        org.joda.time.DurationField durationField16 = chronology11.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField16, and durationField12", !(durationField12.compareTo(durationField16) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField16.compareTo(durationField12))));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        int int9 = mutableDateTime8.getCenturyOfEra();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay10.withFieldAdded(durationFieldType13, 53625645);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay10.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property18 = timeOfDay10.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay19 = property18.withMaximumValue();
        int int20 = property18.get();
        org.joda.time.DateTimeField dateTimeField21 = property18.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property18.getFieldType();
        boolean boolean23 = mutableDateTime8.isSupported(dateTimeFieldType22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.minuteOfHour();
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        boolean boolean28 = dateTimeFormatter27.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone32 = dateMidnight31.getZone();
        boolean boolean34 = dateTimeZone32.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now(dateTimeZone32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter30.withZone(dateTimeZone32);
        boolean boolean37 = dateTimeFormatter30.isPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 1, chronology43);
        java.lang.String str45 = localDate44.toString();
        org.joda.time.LocalDate localDate47 = localDate44.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.eras();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology48);
        boolean boolean51 = dateTimeFieldType38.isSupported(chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter30.withChronology(chronology48);
        org.joda.time.Chronology chronology53 = chronology48.withUTC();
        mutableDateTime8.setChronology(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and mutableDateTime8", (mutableDateTime4.compareTo(mutableDateTime8) == 0) == mutableDateTime4.equals(mutableDateTime8));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Instant instant16 = instant4.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.MutableDateTime mutableDateTime17 = instant16.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime8", (instant4.compareTo(mutableDateTime8) == 0) == instant4.equals(mutableDateTime8));
    }
}

